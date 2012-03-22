package org.nightlabs.vestigo.xtext.jdoql.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractJDOQLJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage.eINSTANCE);
		return result;
	}

}
