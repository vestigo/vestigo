package org.nightlabs.vestigo.ui.oda.property;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.vestigo.childvm.shared.persistencexml.JPAPersistenceUnitHelper;
import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceUnitHelper;
import org.nightlabs.vestigo.ui.oda.EditPropertiesComposite;
import org.nightlabs.vestigo.ui.persistencepropertytree.PersistencePropertyTreeDialog;

public class JPAPersistencePropertiesPage extends PersistencePropertiesPage {

	public JPAPersistencePropertiesPage() {
		setDescription(
				"Please specify the persistence properties. You can override the settings " +
				"of your persistence unit here.\n\n" +
				"" +
				"For example you should override 'javax.persistence.transactionType' and set it " +
				"to 'RESOURCE_LOCAL', if your persistence unit declares it to use 'JTA' ('JTA' does not work in Vestigo).\n\n" +
				"" +
				"Additionally, you very likely have to set 'javax.persistence.jdbc.url', 'javax.persistence.jdbc.user', " +
				"'javax.persistence.jdbc.password' and the like to make your database " +
				"coordinates known."
		);
	}

	@Override
	protected PersistenceUnitHelper getPersistenceUnitHelper() {
		return new JPAPersistenceUnitHelper();
	}

	@Override
	protected EditPropertiesComposite createEditPropertiesComposite(Composite parent) {
		return new EditPropertiesComposite(parent, SWT.NONE) {
			@Override
			protected List<String[]> askUserForNewProperties() {
				PersistencePropertyTreeDialog dialog = new PersistencePropertyTreeDialog(getShell(), "jpa", "Add JPA persistence property", "Please select the new property to be added.");
				if (Dialog.OK == dialog.open()) {
					List<String[]> result = new ArrayList<String[]>(dialog.getSelectedPropertyKeys().size());
					for (String key : dialog.getSelectedPropertyKeys()) {
						result.add(new String[] { key });
					}
					return result;
				}
				else
					return null;
			}
		};
	}
}
