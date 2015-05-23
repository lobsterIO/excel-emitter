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

import uk.co.spudsoft.birt.emitters.excel2.HandlerState;
import uk.co.spudsoft.birt.emitters.excel2.framework.Logger;
import org.eclipse.birt.core.exception.BirtException;
import org.eclipse.birt.report.engine.content.ICellContent;
import org.eclipse.birt.report.engine.content.IRowContent;

public class TopLevelTableRowHandler extends AbstractRealTableRowHandler {

	public TopLevelTableRowHandler(Logger log, IHandler parent, IRowContent row) {
		super(log, parent, row, 0);
	}
	
	@Override
	public void startRow(HandlerState state, IRowContent row) throws BirtException {
		super.startRow(state, row);
		state.rowOffset = 0;
	}

	@Override
	public void startCell(HandlerState state, ICellContent cell) throws BirtException {
		state.setHandler(new TopLevelTableCellHandler(state.getEmitter(), log, this, cell));
		state.getHandler().startCell(state, cell);
	}
	
	@Override
	protected boolean isNested() {
		return false;
	}
}
