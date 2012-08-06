/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.css.ui.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectRealTimeExtension;

public class CssDialectRealTimeExtensionRegistry {
	private List<CssDialectRealTimeExtension> extensions = new ArrayList<CssDialectRealTimeExtension>();
	
	public void addExtension(CssDialectRealTimeExtension extension) {
		synchronized (extensions) {
			extensions.add(extension);
		}
	}
	
	public void removeExtension(CssDialectRealTimeExtension extension) {
		synchronized (extensions) {
			extensions.remove(extension);
		}
	}

//	public List<Property> getProperties(URI uri) {
//		List<Property> rv = new ArrayList<Property>();
//		
//		for( CssDialectRealTimeExtension ext : getExtensions(uri) ) {
//			rv.addAll(ext.getProperties());
//		}
//		
//		return rv;
//	}

//	public CssDialectExtension[] getExtensions(URI uri) {
//		List<CssDialectRealTimeExtension> exts = new ArrayList<CssDialectRealTimeExtension>();
//		synchronized (extensions) {
//			for( CssDialectRealTimeExtension e : extensions ) {
//				if( e.isActive(uri) ) {
//					exts.add(e);
//				}
//			}
//		}
//		return exts.toArray(new CssDialectRealTimeExtension[0]);
//	}

}