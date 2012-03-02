package org.nightlabs.jjqb.xtext.jpql.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractJPQLJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage.eINSTANCE);
		return result;
	}

}
