/*************************************************************************************
 * Copyright (c) 2011, 2012, 2013 James Talbut.
 *  jim-emitters@spudsoft.co.uk
 *  
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     James Talbut - Initial implementation.
 ************************************************************************************/

package uk.co.spudsoft.birt.emitters.excel2.handlers;

import uk.co.spudsoft.birt.emitters.excel2.framework.Logger;
import org.eclipse.birt.report.engine.content.IListContent;

public class NestedListHandler extends TopLevelListHandler {
	
	public NestedListHandler(Logger log, IHandler parent, IListContent list) {
		super(log, parent, list);
	}

}
