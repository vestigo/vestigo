/**
 *
 */
package org.nightlabs.jjqb.cumulus4j.ui;

import org.eclipse.datatools.connectivity.oda.OdaException;
import org.nightlabs.jjqb.ui.oda.AbstractPropertyHopWizardNewWizard;

/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 * @deprecated Currently unused. Experimental. Don't delete! We'll need this for splitting the settings UI into several pages. Marco :-)
 */
@Deprecated
public class NewJDOCumulus4jConnectionProfileWizard extends
		AbstractPropertyHopWizardNewWizard {

	/**
	 *
	 */
	public NewJDOCumulus4jConnectionProfileWizard() {
	}

	/**
	 * @param odaDataSourceId
	 * @throws OdaException
	 */
	public NewJDOCumulus4jConnectionProfileWizard(String odaDataSourceId) throws OdaException {
		super(odaDataSourceId);
	}

	/* (non-Javadoc)
	 * @see org.nightlabs.jjqb.ui.oda.AbstractPropertyHopWizardNewWizard#addHopPages()
	 */
	@Override
	protected void addHopPages() {
		addPropertyHopPage(new JDOCumulus4jPropertyPage1());
	}

}