package org.nightlabs.vestigo.ui.persistencepropertytree;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.nightlabs.vestigo.core.VestigoCorePlugin;
import org.nightlabs.vestigo.ui.AbstractVestigoUIPlugin;
import org.nightlabs.vestigo.ui.VestigoUIPlugin;
import org.nightlabs.vestigo.ui.resource.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersistencePropertyTreeDialog extends TitleAreaDialog
{
	private static final Logger logger = LoggerFactory.getLogger(PersistencePropertyTreeDialog.class);

	private String persistenceAPI;
	private String title;
	private String message;
	private SashForm sashForm;
	private PersistencePropertyTreeComposite persistencePropertyTreeComposite;
	private Text persistencePropertyDescriptionText;
	private Composite persistencePropertyHyperlinkParent;
	private Hyperlink persistencePropertyHyperlink;

	public PersistencePropertyTreeDialog(Shell parentShell, String persistenceAPI, String title, String message)
	{
		super(parentShell);

		if (persistenceAPI == null)
			throw new IllegalArgumentException("persistenceAPI == null");

		this.persistenceAPI = persistenceAPI;
		this.title = title; // we cannot call this.setTitle(...) here - defer!
		this.message = message; // we cannot call this.setMessage(...) here - defer!
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		setTitleImage(VestigoUIPlugin.getDefault().getImage(PersistencePropertyTreeDialog.class, "title", AbstractVestigoUIPlugin.IMAGE_SIZE_75x70));
		setTitle(title);
		setMessage(message);

		return contents;
	}

	@Override
	protected int getShellStyle() {
		return super.getShellStyle() | SWT.RESIZE;
	}

	@Override
	protected Point getInitialSize() {
		Point initialSize = super.getInitialSize();
		initialSize.x = Math.max(initialSize.x, 400);
		initialSize.y = Math.max(initialSize.y, 600);
		return initialSize;
	}

	@Override
	protected void configureShell(Shell newShell)
	{
		super.configureShell(newShell);
		newShell.setText(title);
//		newShell.setImage(VestigoUIPlugin.getDefault().getImage(PersistencePropertyTreeDialog.class, "shell", AbstractVestigoUIPlugin.IMAGE_SIZE_16x16)); //$NON-NLS-1$
	}

	@Override
	protected Control createDialogArea(Composite dialogAreaParent)
	{
		Composite dialogArea = (Composite) super.createDialogArea(dialogAreaParent);

		sashForm = new SashForm(dialogArea, SWT.VERTICAL | SWT.SMOOTH);
		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));

		persistencePropertyTreeComposite = new PersistencePropertyTreeComposite(sashForm, persistenceAPI);
//		persistencePropertyTreeComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		persistencePropertyTreeComposite.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				onSelectionChanged(sel);
			}
		});

		persistencePropertyTreeComposite.addPropertyChangeListener(PersistencePropertyTreeComposite.Property.doubleClick, new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getNewValue();
				onSelectionChanged(sel);
				if (getButton(OK).isEnabled())
					okPressed();
			}
		});

		persistencePropertyHyperlinkParent = new Composite(sashForm, SWT.NONE);
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		persistencePropertyHyperlinkParent.setLayout(gridLayout);

		updatePersistencePropertyDescription(persistencePropertyDescription_nothingSelected, null);

		sashForm.setWeights(new int[] { 70, 30 });
		return dialogArea;
	}

	private static final String persistencePropertyDescription_nothingSelected = ">>> Please select a tree item to see its description here. <<<";

	protected void updatePersistencePropertyDescription(String description, String url)
	{
		if (persistencePropertyDescriptionText != null) {
			persistencePropertyDescriptionText.dispose();
			persistencePropertyDescriptionText = null;
		}

		if (persistencePropertyHyperlink != null) {
			persistencePropertyHyperlink.dispose();
			persistencePropertyHyperlink = null;
		}

		persistencePropertyDescriptionText = new Text(persistencePropertyHyperlinkParent, SWT.BORDER | SWT.READ_ONLY | SWT.MULTI | SWT.WRAP | SWT.H_SCROLL | SWT.V_SCROLL);
		persistencePropertyDescriptionText.setLayoutData(new GridData(GridData.FILL_BOTH));
		persistencePropertyDescriptionText.setText(description);

		if (url != null) {
			url = VestigoCorePlugin.getDefault().getVersionSpecificURL(url);
			persistencePropertyHyperlink = new Hyperlink(persistencePropertyHyperlinkParent, SWT.WRAP);
			persistencePropertyHyperlink.setText("Visit documentation online.");
//		persistencePropertyHyperlink.setToolTipText(String.format("Click on this link to open the documentation in your browser: %s", url));
			persistencePropertyHyperlink.setToolTipText(url);
			persistencePropertyHyperlink.setHref(url);
			configureHyperlink(persistencePropertyHyperlink);
		}

		persistencePropertyHyperlinkParent.layout(true, true);
	}

	private void onSelectionChanged(IStructuredSelection selection)
	{
		String persistencePropertyDescriptionText = persistencePropertyDescription_nothingSelected;
		String persistencePropertyHyperlinkURL = null;

		boolean first = true;
		List<String> selectedPropertyKeys = new ArrayList<String>();
		for (Iterator<?> it = selection.iterator(); it.hasNext(); ) {
			Object element = it.next();
			if (element instanceof PersistencePropertyCategory) {
				PersistencePropertyCategory category = (PersistencePropertyCategory) element;
				if (first) {
					first = false;

					if (category.getDescription() != null)
						persistencePropertyDescriptionText = category.getDescription();
					else {
						PersistencePropertyCategory parent = category.getParentCategory();
						while (parent != null && parent.getDescription() == null)
							parent = parent.getParentCategory();

						if (parent != null && parent.getDescription() != null) {
							persistencePropertyDescriptionText =
									String.format(
											">>> Category '%1$s' does not have a description. Showing description of category '%2$s' instead. <<<\n\n%3$s",
											category.getName(), parent.getName(), parent.getDescription()
									)
							;
						}
						else
							persistencePropertyDescriptionText = String.format(">>> Category '%2$s' does not have a description. Neither does any of its parent categories. <<<", category.getId(), category.getName());
					}

					persistencePropertyHyperlinkURL = category.getDescriptionURLInherited();
				}
			}
			else if (element instanceof PersistenceProperty) {
				PersistenceProperty property = (PersistenceProperty) element;
				if (first) {
					first = false;

					if (property.getDescription() != null)
						persistencePropertyDescriptionText = property.getDescription();
					else {
						PersistencePropertyCategory category = property.getCategory();
						while (category != null && category.getDescription() == null)
							category = category.getParentCategory();

						if (category != null && category.getDescription() != null) {
							persistencePropertyDescriptionText =
									String.format(
											">>> Property '%1$s' does not have a description. Showing description of category '%2$s' instead. <<<\n\n%3$s",
											property.getId(), category.getName(), category.getDescription()
									)
							;
						}
						else {
							persistencePropertyDescriptionText =
									String.format(
											">>> Property '%1$s' does not have a description. Neither does any of its (parent)categories. <<<",
											property.getId()
									)
							;
						}
					}

					persistencePropertyHyperlinkURL = property.getDescriptionURLInherited();
				}
				selectedPropertyKeys.add(property.getId());
			}
		}

		updatePersistencePropertyDescription(persistencePropertyDescriptionText, persistencePropertyHyperlinkURL);

		getButton(OK).setEnabled(!selectedPropertyKeys.isEmpty());
		this.selectedPropertyKeys = Collections.unmodifiableList(selectedPropertyKeys);
	}

	@Override
	protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
		Button button = super.createButton(parent, id, label, defaultButton);

		if (id == OK)
			button.setEnabled(false);

		return button;
	}

	private List<String> selectedPropertyKeys = Collections.emptyList();

	public List<String> getSelectedPropertyKeys()
	{
		return selectedPropertyKeys;
	}

	private void configureHyperlink(Hyperlink hyperlink)
	{
		hyperlink.setUnderlined(true);
//		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
//		gridData.horizontalSpan = 2;
//		hyperlink.setLayoutData(gridData);
		hyperlink.addHyperlinkListener(new HyperlinkAdapter() {
			@Override
			public void linkActivated(HyperlinkEvent e) {
				String href = (String)e.getHref();
				try {
					PlatformUI.getWorkbench().getBrowserSupport().getExternalBrowser().openURL(new URL(href));
				} catch (Exception x) {
					logger.error("linkActivated: ", x); //$NON-NLS-1$
					MessageDialog.openError(
							getShell(),
							Messages.getString("LicenceNotValidDialog.openBrowserErrorDialog.title"), //$NON-NLS-1$
							String.format(Messages.getString("LicenceNotValidDialog.openBrowserErrorDialog.text"), href) //$NON-NLS-1$
					);
				}
			}
		});
	}
}
