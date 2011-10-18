package org.nightlabs.eclipse.jjqb.ui.datasource;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

/**
 * 
 * @author mschulze
 * TODO the contents of this view should be displayed instead in the Eclipse Data Source Explorer - it is extensible for arbitrary data sources.
 * See https://svn.nightlabs.org/svn/birt/trunk/org.nightlabs.birt.jdo.ui/plugin.xml
 * We don't do this immediately, because the org.eclipse.datatools.* plug-ins are not currently available as Maven artifacts. Marco :-)  
 */
public class DataSourceView extends ViewPart
{

	@Override
	public void createPartControl(Composite parent) {
		new Label(parent, SWT.NONE).setText("TEST");
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

}
