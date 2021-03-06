package at.bestsolution.efxclipse.tooling.pde.ui;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.osgi.service.environment.Constants;
import org.eclipse.pde.core.project.IBundleProjectDescription;
import org.eclipse.pde.core.project.IBundleProjectService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.osgi.framework.Version;

public class RepackageJavaFXWizard extends BasicNewResourceWizard {
	private WizardPageImpl page;

	@Override
	public void addPages() {
		page = new WizardPageImpl();
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		File win32 = new File(page.win32.getText());
		File win64 = new File(page.win64.getText());
		File mac = new File(page.mac.getText());
		File lin32 = new File(page.lin32.getText());
		File lin64 = new File(page.lin64.getText());

		if (win32.exists() || win64.exists() || mac.exists() || lin32.exists() || lin64.exists()) {
			IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("javafx.osgi");
			try {
				if (!p.exists()) {
					p.create(new NullProgressMonitor());

					if (!p.isOpen()) {
						p.open(new NullProgressMonitor());
					}

				} else {
					if (!MessageDialog.openQuestion(getShell(), "Project already exists", "The project 'javafx.osgi' already exists. Would you like to update it?")) {
						return true;
					}
				}

				IBundleProjectService bpService = Activator.getDefault().acquireService(IBundleProjectService.class);
				IBundleProjectDescription bpd = bpService.getDescription(p);
				bpd.setSymbolicName("javafx.osgi");
				bpd.setBundleVersion(new Version(page.version.getText()));
				bpd.setBinIncludes(new IPath[] {
					new Path("javafx/")
				});
				
				String shape = "jar";
				if (bpd.getHeader("Eclipse-BundleShape") != null) {
					shape = bpd.getHeader("Eclipse-BundleShape");
				}

				String v = page.combo.getItem(page.combo.getSelectionIndex());
				if (!shape.equals(v)) {
					bpd.setHeader("Eclipse-BundleShape", v);
				}

				bpd.apply(new NullProgressMonitor());

				IFolder rootFolder = p.getFolder(new Path("javafx"));
				if (rootFolder.exists()) {
					rootFolder.delete(true, false, null);
				}
				
				if (win32 != null && win32.exists()) {
					explode(p, Constants.OS_WIN32, Constants.ARCH_X86, win32);
				}

				if (win64 != null && win64.exists()) {
					explode(p, Constants.OS_WIN32, Constants.ARCH_X86_64, win64);
				}

				if (mac != null && mac.exists()) {
					explode(p, Constants.OS_MACOSX, Constants.ARCH_X86_64, mac);
				}

				if (lin32 != null && lin32.exists()) {
					explode(p, Constants.OS_LINUX, Constants.ARCH_X86, lin32);
				}
				
				if (lin64 != null && lin64.exists()) {
					explode(p, Constants.OS_LINUX, Constants.ARCH_X86_64, lin64);
				}
				
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				ErrorDialog.openError(getShell(), "Error creating plugin", "Failed to create javafx.osgi bundle", e.getStatus());
				return false;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				ErrorDialog.openError(getShell(), "Error creating plugin", "Failed to create javafx.osgi bundle", new Status(IStatus.ERROR, "at.bestsolution.efxclipse.tooling.pde.ui", e.getMessage(), e));
				return false;
			}
		}

		return true;
	}

	private void explode(IProject p, String os, String arch, File zip) throws ZipException, IOException, CoreException {
		IFolder f;
		if (os != null && arch != null) {
			f = p.getFolder(new Path("javafx"));
			if (!f.exists()) {
				f.create(true, true, new NullProgressMonitor());
				f = f.getFolder(new Path(os));
			} else {
				f = f.getFolder(new Path(os));
			}

			if (!f.exists()) {
				f.create(true, true, new NullProgressMonitor());
				f = f.getFolder(new Path(arch));
			} else {
				f = f.getFolder(new Path(arch));
			}
		} else {
			f = p.getFolder(new Path("javafx"));
		}

		if (!f.exists()) {
			f.create(true, true, new NullProgressMonitor());
		}

		ZipFile zf = new ZipFile(zip);
		Enumeration<? extends ZipEntry> entries = zf.entries();
		while (entries.hasMoreElements()) {
			ZipEntry e = entries.nextElement();
			if (e.getName().contains("/rt/")) {
				if (e.isDirectory()) {
					Path fp = new Path(e.getName().substring(e.getName().indexOf("rt/")));
					IFolder f2 = f.getFolder(fp);
					if (!f2.exists()) {
						f2.create(true, true, new NullProgressMonitor());
					}
				} else {
					Path fp = new Path(e.getName().substring(e.getName().indexOf("rt/")));
					IFile f2 = f.getFile(fp);
					InputStream in = zf.getInputStream(e);
					f2.create(in, true, new NullProgressMonitor());
					in.close();
				}
			}
		}
		zf.close();
	}

	class WizardPageImpl extends WizardPage {

		private Text win32;
		private Text win64;
		private Text mac;
		private Text lin32;
		private Text lin64;
		private Text version;
		private Combo combo;

		protected WizardPageImpl() {
			super("newJavaFXBundle");
			setTitle("Repackage JavaFX for OSGi-Deployment");
			setMessage("To deploy JavaFX with your application and update it via p2 you need to repackage it into an OSGi-Bundle");
		}

		@Override
		public void createControl(Composite parent) {
			Composite container = new Composite(parent, SWT.NONE);
			container.setLayout(new GridLayout(3, false));

			{
				Label l = new Label(container, SWT.NONE);
				l.setText("Bundle-Version");

				version = new Text(container, SWT.BORDER);
				version.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

				new Label(container, SWT.NONE);
			}

			{
				Label l = new Label(container, SWT.NONE);
				l.setText("Bundle-Shape");

				combo = new Combo(container, SWT.READ_ONLY);
				combo.setItems(new String[] { "dir", "jar" });
				combo.select(0);

				new Label(container, SWT.NONE);
			}

			{
				Label l = new Label(container, SWT.NONE);
				l.setText("Win 32bit SDK");

				win32 = new Text(container, SWT.BORDER);
				win32.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

				Button b = new Button(container, SWT.PUSH);
				b.setText("Browse ...");
				b.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						File f = openZip(".dll");
						if (f != null) {
							win32.setText(f.getAbsolutePath());
						}
					}
				});
			}

			{
				Label l = new Label(container, SWT.NONE);
				l.setText("Win 64bit SDK");

				win64 = new Text(container, SWT.BORDER);
				win64.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

				Button b = new Button(container, SWT.PUSH);
				b.setText("Browse ...");
				b.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						File f = openZip(".dll");
						if (f != null) {
							win64.setText(f.getAbsolutePath());
						}
					}
				});
			}

			{
				Label l = new Label(container, SWT.NONE);
				l.setText("Mac SDK");

				mac = new Text(container, SWT.BORDER);
				mac.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

				Button b = new Button(container, SWT.PUSH);
				b.setText("Browse ...");
				b.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						File f = openZip(".dylib");
						if (f != null) {
							mac.setText(f.getAbsolutePath());
						}
					}
				});
			}

			{
				Label l = new Label(container, SWT.NONE);
				l.setText("Linux 32bit SDK");

				lin32 = new Text(container, SWT.BORDER);
				lin32.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

				Button b = new Button(container, SWT.PUSH);
				b.setText("Browse ...");
				b.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						File f = openZip(".so");
						if (f != null) {
							lin32.setText(f.getAbsolutePath());
						}
					}
				});
			}
			
			{
				Label l = new Label(container, SWT.NONE);
				l.setText("Linux 64bit SDK");

				lin64 = new Text(container, SWT.BORDER);
				lin64.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

				Button b = new Button(container, SWT.PUSH);
				b.setText("Browse ...");
				b.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						File f = openZip(".so");
						if (f != null) {
							lin64.setText(f.getAbsolutePath());
						}
					}
				});
			}

			setControl(container);
		}

	}

	File openZip(String sharedLibEnding) {
		FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
		dialog.setFilterExtensions(new String[] { "*.zip" });
		String zip = dialog.open();

		if (zip != null) {
			ZipFile zf = null;
			try {
				boolean foundSharedLib = false;
				boolean foundJar = false;
				File f = new File(zip);
				zf = new ZipFile(f);
				Enumeration<? extends ZipEntry> entries = zf.entries();
				while (entries.hasMoreElements()) {
					ZipEntry e = entries.nextElement();

					if (e.getName().endsWith("rt/lib/jfxrt.jar")) {
						foundJar = true;
					}

					if (e.getName().endsWith(sharedLibEnding)) {
						foundSharedLib = true;
					}

					if (foundJar && foundSharedLib) {
						return f;
					}
				}

			} catch (ZipException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (zf != null) {
					try {
						zf.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		return null;
	}
}
