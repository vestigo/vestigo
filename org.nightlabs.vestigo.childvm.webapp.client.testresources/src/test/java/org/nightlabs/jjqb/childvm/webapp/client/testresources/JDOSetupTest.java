/**
 * 
 */
package org.nightlabs.jjqb.childvm.webapp.client.testresources;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;

import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import org.junit.Test;
import org.nightlabs.jjqb.childvm.webapp.client.testmodel.jdo.JDOCollectionElement;
import org.nightlabs.jjqb.childvm.webapp.client.testmodel.jdo.JDOComplexEntity;
import org.nightlabs.jjqb.childvm.webapp.client.testmodel.jdo.JDOReferencedElement;


/**
 * @author Alexander Bieber <!-- alex [AT] nightlabs [DOT] de -->
 *
 */
public class JDOSetupTest {

	private long id = 0;
	
	@Test
	public void testJDOSetup() {
		PersistenceManagerFactory pmf = creatPMF();
//		deleteAllData(pmf.getPersistenceManager());
		createComplexStructure(pmf.getPersistenceManager());
		pmf.close();
		
		
	}

	private void deleteAllData(PersistenceManager pm) {
		Transaction tx = pm.currentTransaction();
		try {
			// Begin the transaction.
			tx.begin();
			
			deleteData(pm, JDOCollectionElement.class);
			deleteData(pm, JDOReferencedElement.class);
			deleteData(pm, JDOComplexEntity.class);
			
			// Commit the transaction. Calling commit will store the object in the database.
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			pm.close();
		}
	}

	private void deleteData(PersistenceManager pm, Class<?> persitentClass) {
		@SuppressWarnings("rawtypes")
		Extent extent = pm.getExtent(persitentClass);
		for (Object element : extent) {
			pm.deletePersistent(element);
			pm.flush();
		}
	}
	
	private void createComplexStructure(PersistenceManager pm) {
		Transaction tx = pm.currentTransaction();
		try {
			// Begin the transaction.
			tx.begin();
			
			Random random = new Random();
			
			for (int i = 0; i < 230; i++) {
				JDOComplexEntity complexEntity = new JDOComplexEntity(id++);
				
				complexEntity.setProperty("" + random.nextFloat());
				
				int collectionSize = random.nextInt(20);
				for (; collectionSize > 0; collectionSize--) {
					complexEntity.addElementToCollection(createElement());
				}
				int mapSize = random.nextInt(10);
				for (; mapSize > 0; mapSize--) {
					complexEntity.addElementToMap("key"+mapSize, createElement());
				}
				
				pm.makePersistent(complexEntity);
			}
			
			
			// Commit the transaction. Calling commit will store the object in the database.
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			pm.close();
		}
	}

	private PersistenceManagerFactory creatPMF() {
		Map<String, String> loadedProps = TestResourcesUtil.loadProperties("jdo-dn-with-testmodel.properties");
		Properties props = new Properties();
		props.putAll(loadedProps);
		props = org.nightlabs.util.Properties.getProperties(props, "persistence.");
		loadedProps.clear();
		for (Entry<Object, Object> propsEntry : props.entrySet()) {
			loadedProps.put((String)propsEntry.getKey(), (String)propsEntry.getValue());
		}
		loadedProps.put("datanucleus.autoCreateSchema", "true");
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory(loadedProps);
		return pmf;
	}

	private JDOCollectionElement createElement() {
		JDOCollectionElement element = new JDOCollectionElement(id++);
		element.setDateProperty(new Date(2010, 03, 20));
		return element;
	}

}
