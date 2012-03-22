package org.nightlabs.vestigo.ui.licence;

import java.text.DateFormat;
import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.nightlabs.vestigo.ui.JJQBUIPlugin;
import org.nightlabs.licence.manager.ErrorMessage;
import org.nightlabs.licence.manager.InfoMessage;
import org.nightlabs.licence.manager.Message;
import org.nightlabs.licence.manager.WarningMessage;

public class LicenceCheckMessagesTable extends Composite
{
	private TableViewer tableViewer;
	private DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM);

	public LicenceCheckMessagesTable(Composite parent) {
		super(parent, SWT.NONE);
		this.setLayout(new FillLayout());
		tableViewer = new TableViewer(this, SWT.FULL_SELECTION | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		Table table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		tableViewer.setContentProvider(new ArrayContentProvider());
		tableViewer.setLabelProvider(new LicenceCheckMessagesLabelProvider());

		TableLayout tableLayout = new TableLayout();
		TableColumn tc = new TableColumn(table, SWT.LEFT);
		tc.setText("Timestamp");
		tableLayout.addColumnData(new ColumnPixelData(120));

		tc = new TableColumn(table, SWT.LEFT);
		tc.setText("Type");
		tableLayout.addColumnData(new ColumnPixelData(24));

		tc = new TableColumn(table, SWT.LEFT);
		tc.setText("Text");
		tableLayout.addColumnData(new ColumnWeightData(100));

		table.setLayout(tableLayout);
	}

	private class LicenceCheckMessagesLabelProvider extends LabelProvider implements ITableLabelProvider
	{
		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			if (columnIndex == 1) {
				if (element instanceof InfoMessage)
					return JJQBUIPlugin.getDefault().getImage(LicenceCheckMessagesTable.class, "info", JJQBUIPlugin.IMAGE_SIZE_16x16);

				if (element instanceof WarningMessage)
					return JJQBUIPlugin.getDefault().getImage(LicenceCheckMessagesTable.class, "warning", JJQBUIPlugin.IMAGE_SIZE_16x16);

				if (element instanceof ErrorMessage)
					return JJQBUIPlugin.getDefault().getImage(LicenceCheckMessagesTable.class, "error", JJQBUIPlugin.IMAGE_SIZE_16x16);
			}
			return null;
		}

		@Override
		public String getColumnText(Object element, int columnIndex) {
			Message message = (Message) element;
			switch (columnIndex) {
				case 0:
					return dateFormat.format(message.getTimestamp());
				case 1:
					return null; // the icon
				case 2:
					return message.getText();
				default:
					return null;
			}
		}
	}

	public final void setInput(List<Message> messages) {
		tableViewer.setInput(messages);
	}
}
