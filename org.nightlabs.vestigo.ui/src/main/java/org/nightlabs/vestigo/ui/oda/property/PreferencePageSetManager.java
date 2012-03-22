package org.nightlabs.vestigo.ui.oda.property;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class PreferencePageSetManager
{
	private static final Logger logger = LoggerFactory.getLogger(PreferencePageSetManager.class);

	private Map<Shell, Set<PreferencePage>> shell2PreferencePageMap = new HashMap<Shell, Set<PreferencePage>>();
	private ListenerList dirtyListeners = new ListenerList();

	private static PreferencePageSetManager sharedInstance = new PreferencePageSetManager();

	public static PreferencePageSetManager sharedInstance() { return sharedInstance; }

	public synchronized void register(final PreferencePage page)
	{
		logger.debug("register: page={}", page);

		final Shell shell = page.getShell();
		if (shell == null)
			throw new IllegalArgumentException("page.getShell() returned null! Calling this method too early, maybe?!");

		final Control pageControl = page.getControl();
		if (pageControl == null)
			throw new IllegalArgumentException("page.getControl() returned null! Calling this method too early, maybe?!");

		shell.addDisposeListener(shellDisposeListener);

		pageControl.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				logger.debug("widgetDisposed: page={}", page);

				Set<PreferencePage> pages = shell2PreferencePageMap.get(shell);
				if (pages != null) {
					pages = new HashSet<PreferencePage>(pages);
					pages.remove(pageControl);
					shell2PreferencePageMap.put(shell, Collections.unmodifiableSet(pages));
				}
			}
		});

		Set<PreferencePage> oldPages = shell2PreferencePageMap.get(shell);
		Set<PreferencePage> pages = new HashSet<PreferencePage>(oldPages == null ? 1 : oldPages.size() + 1);
		if (oldPages != null)
			pages.addAll(oldPages);

		pages.add(page);

		shell2PreferencePageMap.put(shell, Collections.unmodifiableSet(pages));
	}

	private DisposeListener shellDisposeListener = new DisposeListener() {
		@Override
		public void widgetDisposed(DisposeEvent e) {
			logger.debug("widgetDisposed: shell={}", e.widget);

			Shell shell = (Shell) e.widget;
			shell2PreferencePageMap.remove(shell);
		}
	};

	public synchronized Collection<PreferencePage> getPreferencePages(PreferencePage page)
	{
		logger.info("getPreferencePages: page={}", page);

		Shell shell = page.getShell();
		if (shell == null)
			throw new IllegalArgumentException("page.getShell() returned null! Calling this method too early, maybe?!");

		Set<PreferencePage> pages = shell2PreferencePageMap.get(shell);
		if (pages == null || !pages.contains(page))
			throw new IllegalArgumentException("page is not registered!");

		return pages;
	}

	public synchronized Collection<PreferencePage> getPreferencePages(Shell shell)
	{
		logger.info("getPreferencePages: shell={}", shell);
		if (shell == null)
			throw new IllegalArgumentException("shell == null");

		Set<PreferencePage> pages = shell2PreferencePageMap.get(shell);
		return pages;
	}

	public synchronized <P extends PreferencePage> Collection<P> getPreferencePages(PreferencePage page, Class<P> preferencePageClass)
	{
		Collection<P> result = new ArrayList<P>();
		Collection<PreferencePage> preferencePages = getPreferencePages(page);
		for (PreferencePage preferencePage : preferencePages) {
			if (preferencePageClass.isInstance(preferencePage))
				result.add(preferencePageClass.cast(preferencePage));
		}
		return Collections.unmodifiableCollection(result);
	}

	public void firePreferencePageDirtyEvent(PreferencePageDirtyEvent event)
	{
		for (Object lrefo : dirtyListeners.getListeners()) {
			@SuppressWarnings("unchecked")
			WeakReference<PreferencePageDirtyListener> lref = (WeakReference<PreferencePageDirtyListener>) lrefo;
			PreferencePageDirtyListener l = lref.get();
			if (l != null)
				l.onMarkDirty(event);
		}
	}

	public void addPreferencePageDirtyListener(PreferencePageDirtyListener listener)
	{
		removePreferencePageDirtyListener(null); // sweep null-WeakRefs
		dirtyListeners.add(new WeakReference<PreferencePageDirtyListener>(listener));
	}

	public void removePreferencePageDirtyListener(PreferencePageDirtyListener listener)
	{
		for (Object lrefo : dirtyListeners.getListeners()) {
			@SuppressWarnings("unchecked")
			WeakReference<PreferencePageDirtyListener> lref = (WeakReference<PreferencePageDirtyListener>) lrefo;
			PreferencePageDirtyListener l = lref.get();
			if (l == null || l == listener)
				dirtyListeners.remove(lref);
		}
	}
}
