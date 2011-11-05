// This class was inspired by:
// http://dev.eclipse.org/viewcvs/viewvc.cgi/org.eclipse.jface.snippets/Eclipse%20JFace%20Snippets/org/eclipse/jface/snippets/viewers/FocusBorderCellHighlighter.java
package org.nightlabs.eclipse.jjqb.ui.resultsettable;

import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.FocusCellHighlighter;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerRow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class FocusBorderCellHighlighter extends FocusCellHighlighter
{
	public FocusBorderCellHighlighter(ColumnViewer viewer) {
		super(viewer);
		hookListener(viewer);
	}

	private void markFocusedCell(Event event, ViewerCell cell) {
		GC gc = event.gc;

		Rectangle rect = event.getBounds();
		gc.drawFocus(rect.x, rect.y, rect.width, rect.height);

		event.detail &= ~SWT.SELECTED;
	}

	private void hookListener(final ColumnViewer viewer)
	{
		Listener listener = new Listener() {

			@Override
			public void handleEvent(Event event) {
				if ((event.detail & SWT.SELECTED) > 0) {
					ViewerCell focusCell = getFocusCell();
					ViewerRow row = focusCell == null ? null : focusCell.getViewerRow();
					if (row == null && focusCell != null)
						throw new IllegalStateException("Internal structure invalid. Item without associated row is not possible."); //$NON-NLS-1$

					ViewerCell cell = row == null ? null : row.getCell(event.index);

					if (focusCell != null && focusCell.equals(cell)) {
						markFocusedCell(event, cell);
					}
				}
			}

		};
		viewer.getControl().addListener(SWT.EraseItem, listener);
	}

	@Override
	protected void focusCellChanged(ViewerCell newCell, ViewerCell oldCell)
	{
		super.focusCellChanged(newCell, oldCell);

		// Redraw new area
		if (newCell != null) {
			Rectangle rect = newCell.getBounds();
			int x = newCell.getColumnIndex() == 0 ? 0 : rect.x;
			int width = newCell.getColumnIndex() == 0 ? rect.x + rect.width
					: rect.width;
			newCell.getControl().redraw(x, rect.y, width, rect.height, true);
		}

		if (oldCell != null) {
			Rectangle rect = oldCell.getBounds();
			int x = oldCell.getColumnIndex() == 0 ? 0 : rect.x;
			int width = oldCell.getColumnIndex() == 0 ? rect.x + rect.width
					: rect.width;
			oldCell.getControl().redraw(x, rect.y, width, rect.height, true);
		}
	}
}
