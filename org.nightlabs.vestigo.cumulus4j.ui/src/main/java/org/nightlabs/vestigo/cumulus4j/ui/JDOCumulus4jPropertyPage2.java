///**
// *
// */
//package org.nightlabs.vestigo.cumulus4j.ui;
//
//import java.util.Properties;
//
//import org.eclipse.jface.layout.GridDataFactory;
//import org.eclipse.jface.layout.GridLayoutFactory;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Control;
//import org.eclipse.swt.widgets.Label;
//import org.eclipse.swt.widgets.Text;
//import org.nightlabs.vestigo.ui.oda.AbstractPropertyHopPage;
//import org.nightlabs.vestigo.ui.oda.IPropertyHopPage.PropertyHopPage;
//
//
///**
// * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
// * @deprecated Currently unused. Experimental. Don't delete! We'll need this for splitting the settings UI into several pages. Marco :-)
// */
//@Deprecated
//public class JDOCumulus4jPropertyPage2 extends AbstractPropertyHopPage implements PropertyHopPage {
//
//	private Composite control;
//	private Text text;
//
//
//	@Override
//	public void setInitialProperties(Properties properties) {
//		String prop = properties.getProperty("prop2");
//		text.setText(prop != null ? prop : "");
//	}
//
//	@Override
//	public Properties collectCustomProperties(Properties dataSourceProps) {
//		Properties props = new Properties();
//		props.put("prop2", text.getText());
//		return props;
//	}
//
//	@Override
//	protected Control createCustomControl(Composite parent) {
//		if (control != null)
//			return control;
//		control = new Composite(parent, SWT.NONE);
//		GridLayoutFactory.swtDefaults().applyTo(control);
//		GridDataFactory gdf = GridDataFactory.swtDefaults().grab(true, false).align(SWT.FILL, SWT.CENTER);
//		Label l = new Label(control, SWT.WRAP);
//		l.setText("Property 2");
//		gdf.applyTo(l);
//		text = new Text(control, SWT.BORDER);
//		gdf.applyTo(text);
//		return control;
//	}
//
//	@Override
//	public String getName() {
//		return getTitle();
//	}
//
//}
