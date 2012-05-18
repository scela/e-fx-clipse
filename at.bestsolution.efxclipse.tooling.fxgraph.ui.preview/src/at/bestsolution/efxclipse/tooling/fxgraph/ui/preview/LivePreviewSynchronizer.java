package at.bestsolution.efxclipse.tooling.fxgraph.ui.preview;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.part.EditorPart;

import at.bestsolution.efxclipse.tooling.fxgraph.ui.preview.LivePreviewPart.ContentData;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.preview.bundle.Activator;
import at.bestsolution.efxclipse.tooling.ui.editor.IFXMLProviderAdapter;
import at.bestsolution.efxclipse.tooling.ui.editor.IFXPreviewAdapter;

import com.google.inject.Inject;

public class LivePreviewSynchronizer implements IPartListener, IPropertyListener {
	@Inject
	private LivePreviewPart view;

	private Type currentEditorType = Type.UNKNOWN;
	private IEclipsePreferences preference = InstanceScope.INSTANCE.getNode(Activator.PLUGIN_ID);

	public static final String PREF_LOAD_CONTROLLER = "PREF_LOAD_CONTROLLER";

	private IFXPreviewAdapter currentEditor;
	private IFXMLProviderAdapter currentContentProvider;
	
	static enum Type {
		UNKNOWN, CSS, FXGRAPH, FXML
	}

	public void partActivated(IWorkbenchPart part) {
		updateView(part);
	}

	private void updateView(IWorkbenchPart part) {
//		System.err.println("Adapting: " + part);
		IFXPreviewAdapter adapted;
		if( part instanceof IFXPreviewAdapter ) {
			adapted = (IFXPreviewAdapter) part;
		} else {
			adapted = (IFXPreviewAdapter) part.getAdapter(IFXPreviewAdapter.class);
		}
		
//		System.err.println("Adapted: " + adapted);
		if( adapted != null ) {
			if( currentEditor == null || ! currentEditor.getEditorPart().equals(adapted.getEditorPart()) ) {
				if( currentEditor != null ) {
					currentEditor.getEditorPart().removePropertyListener(this);
				}
				currentEditor = (IFXPreviewAdapter) adapted;
				
				if( currentEditor != null ) {
					currentEditor.getEditorPart().addPropertyListener(this);	
				}
				
				if( currentEditor instanceof IFXMLProviderAdapter && ( currentContentProvider == null || ! currentContentProvider.getEditorPart().equals(currentEditor.getEditorPart()) ) ) {
					currentContentProvider = (IFXMLProviderAdapter) currentEditor;
					view.setContents(createContentData(currentContentProvider));
				}	
			}
		} else if( part instanceof EditorPart ) {
			if( currentEditor != null ) {
				currentEditor.getEditorPart().removePropertyListener(this);
			}
			
			currentContentProvider = null;
			currentEditor = null;
			view.setContents(null);
		}
	}
	
	@Override
	public void propertyChanged(Object source, int propId) {
		if( propId == IWorkbenchPartConstants.PROP_DIRTY ) {
			if( currentEditor != null && ! currentEditor.getEditorPart().isDirty() && currentContentProvider != null ) {
				view.setContents(createContentData(currentContentProvider));
			}
		}
	}

	public void refreshPreview() {
		if( currentContentProvider != null ) {
			view.setContents(createContentData(currentContentProvider));
		}
	}

	
	
	private ContentData createContentData(IFXMLProviderAdapter contentProvider) {
		String contents = contentProvider.getPreviewFXML();
		List<String> cssFiles = contentProvider.getPreviewCSSFiles();
		String resourceBundle = contentProvider.getPreviewResourceBundle();
		List<URL> previewUrls = contentProvider.getPreviewClasspath();
		IFile file = contentProvider.getFile();
		
		//TODO implement
		List<URL> extraJarPath = new ArrayList<URL>();
		extraJarPath.addAll(previewUrls);
		
		System.err.println(contents);
		
		return new ContentData(contents, cssFiles, resourceBundle, extraJarPath, file);
	}

	
	private void resolveDataProject(IJavaProject project, Set<IPath> outputPath, Set<IPath> listRefLibraries) {
		try {
			IClasspathEntry[] entries = project.getRawClasspath();
			outputPath.add(project.getOutputLocation());
			for (IClasspathEntry e : entries) {
				if (e.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
					IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(e.getPath().lastSegment());
					if (p.exists()) {
						resolveDataProject(JavaCore.create(p), outputPath, listRefLibraries);
					}
				} else if (e.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
					listRefLibraries.add(e.getPath());
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private List<URL> calculateProjectClasspath(IJavaProject jp) {
		HashSet<IPath> outputPath = new HashSet<IPath>();
		HashSet<IPath> libraries = new HashSet<IPath>();
		resolveDataProject(jp, outputPath, libraries);

		IWorkspaceRoot root = jp.getProject().getWorkspace().getRoot();

		List<URL> rv = new ArrayList<URL>();
		for (IPath out : outputPath) {
			IFolder f = root.getFolder(out);
			if (f.exists()) {
				try {
					rv.add(f.getLocation().toFile().toURI().toURL());
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		for (IPath lib : libraries) {
			IFile f = root.getFile(lib);
			if (f.exists()) {
				try {
					rv.add(f.getLocation().toFile().toURI().toURL());
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return rv;
	}

//	private ContentData createContents(XtextResource resource) {
//		EList<EObject> contents = resource.getContents();
//		if (!contents.isEmpty()) {
//
//			URI uri = resource.getURI();
//			IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(uri.segment(1));
//			IJavaProject jp = JavaCore.create(p);
//
//			boolean pluginProject = false;
//
//			try {
//				if (p.hasNature("org.eclipse.pde.PluginNature")) {
//					pluginProject = true;
//				}
//			} catch (CoreException e2) {
//				// TODO Auto-generated catch block
//				e2.printStackTrace();
//			}
//			
//			URL relativeUrl = null;
//			Path structureFilePath = new Path(uri.toPlatformString(true));
//			IWorkspaceRoot workspaceRoot = jp.getProject().getWorkspace().getRoot();
//			IFile structureFile = workspaceRoot.getFile(structureFilePath); 
//			IContainer file = structureFile.getParent();//workspaceRoot.getFolder(structureFilePath.removeLastSegments(1));
//			if (file.exists()) {
//				try {
//					relativeUrl = file.getLocation().toFile().getAbsoluteFile().toURI().toURL();
//				} catch (MalformedURLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//			EObject rootObject = contents.get(0);
//			if (rootObject instanceof Model) {
//				FXGraphGenerator generator = new FXGraphGenerator();
//				ComponentDefinition def = ((Model) rootObject).getComponentDef();
//				
//
//				List<URL> extraPaths = new ArrayList<URL>();
//				List<String> cssFiles;
//
//				if (def != null) {
//					cssFiles = new ArrayList<String>(def.getPreviewCssFiles().size());
//					for (String cssFile : def.getPreviewCssFiles()) {
//						File absFile = RelativeFileLocator.locateFile(uri, cssFile);
//
//						if (absFile != null) {
//							try {
//								// Trick to make CSS-Reloaded
////								File absParent = absFile.getParentFile();
////								absParent = new File(absParent, System.currentTimeMillis() + "");
//								cssFiles.add(absFile.toURI().toURL().toExternalForm());
//							} catch (Throwable e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//						}
//
//					}
//
//					// When we are in OSGi only add the configured extra paths
//					for (String path : def.getPreviewClasspathEntries()) {
//						try {
//							URI cpUri = URI.createURI(path);
//							if (cpUri.isPlatformResource()) {
//								if (cpUri.lastSegment().equals("*")) {
//									cpUri = cpUri.trimSegments(1);
//									Path cpPath = new Path(cpUri.toPlatformString(true));
//									IWorkspaceRoot root = jp.getProject().getWorkspace().getRoot();
//									IFolder f = root.getFolder(cpPath);
//									if (f.exists()) {
//										for (IResource r : f.members()) {
//											IFile jarFile = (IFile) r;
//											if (r instanceof IFile) {
//												if ("jar".equals(jarFile.getFileExtension())) {
//													extraPaths.add(jarFile.getLocation().toFile().toURI().toURL());
//												}
//											}
//										}
//									}
//								} else {
//									Path cpPath = new Path(cpUri.toPlatformString(true));
//									IWorkspaceRoot root = jp.getProject().getWorkspace().getRoot();
//									IFile jarFile = root.getFile(cpPath);
//									if (jarFile.exists()) {
//										try {
//											extraPaths.add(jarFile.getLocation().toFile().toURI().toURL());
//										} catch (MalformedURLException e) {
//											// TODO Auto-generated catch block
//											e.printStackTrace();
//										}
//									}
//								}
//							} else if (cpUri.isFile()) {
//								if (cpUri.toFileString().endsWith("*")) {
//									File ioFile = new File(cpUri.toFileString()).getParentFile();
//									if (ioFile.exists()) {
//										try {
//											for (File jarFile : ioFile.listFiles()) {
//												if (jarFile.getName().endsWith(".jar")) {
//													extraPaths.add(jarFile.toURI().toURL());
//												}
//											}
//										} catch (MalformedURLException e) {
//											// TODO Auto-generated catch block
//											e.printStackTrace();
//										}
//									}
//								} else {
//									File ioFile = new File(cpUri.toFileString());
//									if (ioFile.exists()) {
//										try {
//											extraPaths.add(ioFile.toURI().toURL());
//										} catch (MalformedURLException e) {
//											// TODO Auto-generated catch block
//											e.printStackTrace();
//										}
//									}
//								}
//							}
//						} catch (Exception e) {
//							// TODO: handle exception
//							e.printStackTrace();
//						}
//					}
//
//					// If it is not a plugin project prepend the customized
//					// entries
//					if (!pluginProject) {
//						extraPaths.addAll(0, calculateProjectClasspath(jp));
//					}
//				} else {
//					cssFiles = Collections.emptyList();
//				}
//
//				String resourcePropertiesFile = null;
//				if (def != null && def.getPreviewResourceBundle() != null) {
//					File f = RelativeFileLocator.locateFile(uri, def.getPreviewResourceBundle());
//					if (f != null && f.exists()) {
//						resourcePropertiesFile = f.getAbsolutePath();
//					}
//				}
//				
//				return new ContentData(generator.doGeneratePreview(resource, (!preference.getBoolean(PREF_LOAD_CONTROLLER, false)) && (!pluginProject), false),
//						cssFiles, resourcePropertiesFile, extraPaths, relativeUrl,resource.getURI());
//			} /*else if( rootObject instanceof FXML ) {
//				List<URL> extraPaths = new ArrayList<URL>();
//				// If it is not a plugin project prepend the customized
//				// entries
//				if (!pluginProject) {
//					extraPaths.addAll(0, calculateProjectClasspath(jp));
//				}
//				
////				System.err.println("Path: " + structureFilePath);
//				String fxmlFile;
//				InputStream in = null;
//				try {
//					StringBuilder b = new StringBuilder();
//					in = structureFile.getContents(true);
//					byte[] buf = new byte[1024];
//					int len;
//					while( (len = in.read(buf) ) != -1 ) {
//						b.append(new String(buf,0,len));
//					}
//					fxmlFile = b.toString();
//				} catch (Throwable e) {
//					
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//					
//					fxmlFile = lastStructureEditor.getDocument().get();
//				} finally {
//					try {
//						in.close();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//				
//				List<String> cssFiles = new ArrayList<String>();
//				String resourcePropertiesFile = null;
//				
//				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(uri.segment(1));
//				IFile previewConfig = project.getFile(new Path("fxml-preview.properties"));
//				
//				if( previewConfig.exists() ) {
//					InputStream stream = null;
//					try {
//						Properties propFile = new Properties();
//						stream = previewConfig.getContents(true); 
//						propFile.load(stream);
//						stream.close();
//						if( propFile.getProperty("fxmlpreview.all.stylesheets") != null ) {
//							for( String f : propFile.getProperty("fxmlpreview.all.stylesheets").split(",") ) {
//								File absFile = RelativeFileLocator.locateFile(uri, f.trim());
//								if (absFile != null) {
//									cssFiles.add(absFile.toURI().toURL().toExternalForm());
//								}	
//							}
//						}
//						
//						String fileConfig = "fxmlpreview.file." + uri.lastSegment().substring(0,uri.lastSegment().length()-5);
//						if( propFile.getProperty(fileConfig+".stylesheets") != null ) {
//							for( String f : propFile.getProperty(fileConfig+".stylesheets").split(",") ) {
//								File absFile = RelativeFileLocator.locateFile(uri, f.trim());
//								if (absFile != null) {
//									cssFiles.add(absFile.toURI().toURL().toExternalForm());
//								}	
//							}
//						}
//						
//						
//						if( propFile.getProperty("fxmlpreview.all.messagefile") != null ) {
//							File f = RelativeFileLocator.locateFile(uri, propFile.getProperty("fxmlpreview.all.messagefile"));
//							if (f != null && f.exists()) {
//								resourcePropertiesFile = f.getAbsolutePath();
//							}
//						}
//						
//						if( propFile.getProperty(fileConfig + ".messagefile") != null ) {
//							File f = RelativeFileLocator.locateFile(uri, propFile.getProperty(fileConfig+".messagefile").trim());
//							if (f != null && f.exists()) {
//								resourcePropertiesFile = f.getAbsolutePath();
//							}
//						}
//						
//					} catch(Throwable t) {
//						//TODO Log exception appropriately
//						t.printStackTrace();
//					} finally {
//						if( stream != null ) {
//							try {
//								stream.close();
//							} catch (IOException e) {
//							}
//						}
//					}
//				}
//				
//				return new ContentData(fxmlFile, cssFiles, resourcePropertiesFile, extraPaths, relativeUrl,resource.getURI());
//			}*/
//		}
//
//		return null;
//	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
	}

	@Override
	public void partOpened(IWorkbenchPart part) {
	}
}
