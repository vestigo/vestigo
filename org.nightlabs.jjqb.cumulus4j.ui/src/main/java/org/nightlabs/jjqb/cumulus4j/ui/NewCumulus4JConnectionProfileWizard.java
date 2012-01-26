/**
 * 
 */
package org.nightlabs.jjqb.cumulus4j.ui;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.ui.oda.AbstractPropertyHopWizardNewWizard;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class NewCumulus4JConnectionProfileWizard extends
		AbstractPropertyHopWizardNewWizard {

	/**
	 * 
	 */
	public NewCumulus4JConnectionProfileWizard() {
	}

	/**
	 * @param odaDataSourceId
	 * @throws OdaException
	 */
	public NewCumulus4JConnectionProfileWizard(String odaDataSourceId) throws OdaException {
		super(odaDataSourceId);
	}

	/* (non-Javadoc)
	 * @see org.nightlabs.jjqb.ui.oda.AbstractPropertyHopWizardNewWizard#addHopPages()
	 */
	@Override
	protected void addHopPages() {
		addPropertyHopPage(new Cumulus4JPropertyPage1());
	}

}
