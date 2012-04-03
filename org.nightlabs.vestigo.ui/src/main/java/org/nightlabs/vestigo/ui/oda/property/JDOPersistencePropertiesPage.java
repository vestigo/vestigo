package org.nightlabs.vestigo.ui.oda.property;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.nightlabs.vestigo.childvm.shared.persistencexml.JDOPersistenceUnitHelper;
import org.nightlabs.vestigo.childvm.shared.persistencexml.PersistenceUnitHelper;
import org.nightlabs.vestigo.ui.oda.EditPropertiesComposite;
import org.nightlabs.vestigo.ui.persistencepropertytree.PersistencePropertyTreeDialog;

public class JDOPersistencePropertiesPage extends PersistencePropertiesPage {

	public JDOPersistencePropertiesPage() {
		setDescription(
				"Please specify the persistence properties. If you use a persistence unit (which is optional with JDO), you " +
				"can override its settings here.\n\n" +
				"" +
				"For example you should override 'javax.jdo.option.TransactionType' and set it " +
				"to 'RESOURCE_LOCAL', if your persistence unit declares it to use 'JTA' ('JTA' does not work in Vestigo).\n\n" +
				"" +
				"Additionally, you very likely have to set 'javax.jdo.option.ConnectionURL', 'javax.jdo.option.ConnectionUserName', " +
				"'javax.jdo.option.ConnectionPassword' and the like to make your database " +
				"coordinates known."
		);
	}

	@Override
	protected PersistenceUnitHelper getPersistenceUnitHelper() {
		return new JDOPersistenceUnitHelper();
	}

	@Override
	protected EditPropertiesComposite createEditPropertiesComposite(Composite parent) {
		return new EditPropertiesComposite(parent, SWT.NONE) {

			@Override
			protected String[] askUserForNewProperty() {
				PersistencePropertyTreeDialog dialog = new PersistencePropertyTreeDialog(getShell(), "jdo", "Add JDO persistence property", "Please select the new property to be added.");
				if (Dialog.OK == dialog.open())
					return new String[] { dialog.getSelectedPropertyName() };
				else
					return null;
			}

		};
	}
}
