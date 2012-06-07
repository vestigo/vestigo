/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
package org.nightlabs.vestigo.ui.queryparam;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class QueryParameterManagerComposite extends Composite implements ISelectionProvider
{
	public enum PropertyName {
		queryParameterManager
	}

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	private QueryParameterManager queryParameterManager;

	private QueryParameterTableComposite queryParameterTableComposite;

	private ListenerList selectionChangedListeners = new ListenerList();

	public QueryParameterManagerComposite(Composite parent, int style) {
		super(parent, style);

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		this.setLayout(layout);

		queryParameterTableComposite = new QueryParameterTableComposite(this, SWT.BORDER);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.verticalSpan = 5;
		queryParameterTableComposite.setLayoutData(gd);

		queryParameterTableComposite.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				SelectionChangedEvent newEvent = new SelectionChangedEvent(QueryParameterManagerComposite.this, getSelection());
				for (Object l : selectionChangedListeners.getListeners()) {
					((ISelectionChangedListener)l).selectionChanged(newEvent);
				}
			}
		});

		addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent arg0) {
				setQueryParameterManager(null);
			}
		});

		setQueryParameterManager(null);
	}

	public void setQueryParameterManager(QueryParameterManager queryParameterManager)
	{
		QueryParameterManager oldQueryParameterManager = this.queryParameterManager;
		if (this.queryParameterManager != null) {
			this.queryParameterManager.removePropertyChangeListener(QueryParameterManager.PropertyName.editorInputChanged, editorInputChangedListener);
			this.queryParameterManager.removePropertyChangeListener(refreshingPropertyChangeListener);
		}

		this.queryParameterManager = queryParameterManager;

		queryParameterTableComposite.setInput(queryParameterManager == null ? null : queryParameterManager.getQueryParameters());

		if (queryParameterManager != null) {
			queryParameterManager.addPropertyChangeListener(QueryParameterManager.PropertyName.editorInputChanged, editorInputChangedListener);
			queryParameterManager.addPropertyChangeListener(refreshingPropertyChangeListener);
		}

		propertyChangeSupport.firePropertyChange(PropertyName.queryParameterManager.name(), oldQueryParameterManager, queryParameterManager);
	}

	private PropertyChangeListener editorInputChangedListener = new PropertyChangeListener() {
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			queryParameterTableComposite.setInput(queryParameterManager == null ? null : queryParameterManager.getQueryParameters());
		}
	};

	private PropertyChangeListener refreshingPropertyChangeListener = new PropertyChangeListener() {
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			queryParameterTableComposite.refresh();
		}
	};

	public QueryParameterManager getQueryParameterManager() {
		return queryParameterManager;
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(PropertyName propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName.name(), listener);
	}

	public void removePropertyChangeListener(PropertyName propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(propertyName.name(), listener);
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	@Override
	public ISelection getSelection() {
		return queryParameterTableComposite.getSelection();
	}

	@Override
	public void setSelection(ISelection selection) {
		queryParameterTableComposite.setSelection(selection);
	}
}
