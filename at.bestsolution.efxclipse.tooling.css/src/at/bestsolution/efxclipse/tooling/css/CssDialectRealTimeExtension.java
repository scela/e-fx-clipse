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
package at.bestsolution.efxclipse.tooling.css;

import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.cssDsl.expr;

public interface CssDialectRealTimeExtension {
	
	// new api
	
	public static abstract class CSSProperty {
		public final String name;
		public final String doc;
		
		public CSSProperty(String name, String doc) {
			this.name = name;
			this.doc = doc;
		}
		public abstract List<Proposal> getProposals(int index);
	}

	
	
	/**
	 * 
	 * @param element given element or null if no element is given.
	 * @return
	 */
	public List<CSSProperty> getProperties(String element);
	
	public void validateProperty(expr e);
	
}
