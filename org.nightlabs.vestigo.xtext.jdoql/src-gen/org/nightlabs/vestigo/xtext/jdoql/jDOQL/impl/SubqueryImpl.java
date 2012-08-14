/**
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.nightlabs.vestigo.xtext.jdoql.jDOQL.ImportClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.ParametersClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.Subquery;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.SubqueryFromClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.SubquerySelectClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.VariablesClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.WhereClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subquery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.SubqueryImpl#getSelectClause <em>Select Clause</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.SubqueryImpl#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.SubqueryImpl#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.SubqueryImpl#getVariablesClause <em>Variables Clause</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.SubqueryImpl#getParametersClause <em>Parameters Clause</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.SubqueryImpl#getImportClause <em>Import Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubqueryImpl extends ExpressionImpl implements Subquery
{
  /**
   * The cached value of the '{@link #getSelectClause() <em>Select Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectClause()
   * @generated
   * @ordered
   */
  protected SubquerySelectClause selectClause;

  /**
   * The cached value of the '{@link #getFromClause() <em>From Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromClause()
   * @generated
   * @ordered
   */
  protected SubqueryFromClause fromClause;

  /**
   * The cached value of the '{@link #getWhereClause() <em>Where Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhereClause()
   * @generated
   * @ordered
   */
  protected WhereClause whereClause;

  /**
   * The cached value of the '{@link #getVariablesClause() <em>Variables Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariablesClause()
   * @generated
   * @ordered
   */
  protected VariablesClause variablesClause;

  /**
   * The cached value of the '{@link #getParametersClause() <em>Parameters Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParametersClause()
   * @generated
   * @ordered
   */
  protected ParametersClause parametersClause;

  /**
   * The cached value of the '{@link #getImportClause() <em>Import Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportClause()
   * @generated
   * @ordered
   */
  protected ImportClause importClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubqueryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JDOQLPackage.Literals.SUBQUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubquerySelectClause getSelectClause()
  {
    return selectClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectClause(SubquerySelectClause newSelectClause, NotificationChain msgs)
  {
    SubquerySelectClause oldSelectClause = selectClause;
    selectClause = newSelectClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY__SELECT_CLAUSE, oldSelectClause, newSelectClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectClause(SubquerySelectClause newSelectClause)
  {
    if (newSelectClause != selectClause)
    {
      NotificationChain msgs = null;
      if (selectClause != null)
        msgs = ((InternalEObject)selectClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY__SELECT_CLAUSE, null, msgs);
      if (newSelectClause != null)
        msgs = ((InternalEObject)newSelectClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY__SELECT_CLAUSE, null, msgs);
      msgs = basicSetSelectClause(newSelectClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY__SELECT_CLAUSE, newSelectClause, newSelectClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubqueryFromClause getFromClause()
  {
    return fromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFromClause(SubqueryFromClause newFromClause, NotificationChain msgs)
  {
    SubqueryFromClause oldFromClause = fromClause;
    fromClause = newFromClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY__FROM_CLAUSE, oldFromClause, newFromClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromClause(SubqueryFromClause newFromClause)
  {
    if (newFromClause != fromClause)
    {
      NotificationChain msgs = null;
      if (fromClause != null)
        msgs = ((InternalEObject)fromClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY__FROM_CLAUSE, null, msgs);
      if (newFromClause != null)
        msgs = ((InternalEObject)newFromClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY__FROM_CLAUSE, null, msgs);
      msgs = basicSetFromClause(newFromClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY__FROM_CLAUSE, newFromClause, newFromClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhereClause getWhereClause()
  {
    return whereClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhereClause(WhereClause newWhereClause, NotificationChain msgs)
  {
    WhereClause oldWhereClause = whereClause;
    whereClause = newWhereClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY__WHERE_CLAUSE, oldWhereClause, newWhereClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhereClause(WhereClause newWhereClause)
  {
    if (newWhereClause != whereClause)
    {
      NotificationChain msgs = null;
      if (whereClause != null)
        msgs = ((InternalEObject)whereClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY__WHERE_CLAUSE, null, msgs);
      if (newWhereClause != null)
        msgs = ((InternalEObject)newWhereClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY__WHERE_CLAUSE, null, msgs);
      msgs = basicSetWhereClause(newWhereClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY__WHERE_CLAUSE, newWhereClause, newWhereClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariablesClause getVariablesClause()
  {
    return variablesClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariablesClause(VariablesClause newVariablesClause, NotificationChain msgs)
  {
    VariablesClause oldVariablesClause = variablesClause;
    variablesClause = newVariablesClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY__VARIABLES_CLAUSE, oldVariablesClause, newVariablesClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariablesClause(VariablesClause newVariablesClause)
  {
    if (newVariablesClause != variablesClause)
    {
      NotificationChain msgs = null;
      if (variablesClause != null)
        msgs = ((InternalEObject)variablesClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY__VARIABLES_CLAUSE, null, msgs);
      if (newVariablesClause != null)
        msgs = ((InternalEObject)newVariablesClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY__VARIABLES_CLAUSE, null, msgs);
      msgs = basicSetVariablesClause(newVariablesClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY__VARIABLES_CLAUSE, newVariablesClause, newVariablesClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParametersClause getParametersClause()
  {
    return parametersClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParametersClause(ParametersClause newParametersClause, NotificationChain msgs)
  {
    ParametersClause oldParametersClause = parametersClause;
    parametersClause = newParametersClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY__PARAMETERS_CLAUSE, oldParametersClause, newParametersClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParametersClause(ParametersClause newParametersClause)
  {
    if (newParametersClause != parametersClause)
    {
      NotificationChain msgs = null;
      if (parametersClause != null)
        msgs = ((InternalEObject)parametersClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY__PARAMETERS_CLAUSE, null, msgs);
      if (newParametersClause != null)
        msgs = ((InternalEObject)newParametersClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY__PARAMETERS_CLAUSE, null, msgs);
      msgs = basicSetParametersClause(newParametersClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY__PARAMETERS_CLAUSE, newParametersClause, newParametersClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportClause getImportClause()
  {
    return importClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImportClause(ImportClause newImportClause, NotificationChain msgs)
  {
    ImportClause oldImportClause = importClause;
    importClause = newImportClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY__IMPORT_CLAUSE, oldImportClause, newImportClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportClause(ImportClause newImportClause)
  {
    if (newImportClause != importClause)
    {
      NotificationChain msgs = null;
      if (importClause != null)
        msgs = ((InternalEObject)importClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY__IMPORT_CLAUSE, null, msgs);
      if (newImportClause != null)
        msgs = ((InternalEObject)newImportClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY__IMPORT_CLAUSE, null, msgs);
      msgs = basicSetImportClause(newImportClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY__IMPORT_CLAUSE, newImportClause, newImportClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JDOQLPackage.SUBQUERY__SELECT_CLAUSE:
        return basicSetSelectClause(null, msgs);
      case JDOQLPackage.SUBQUERY__FROM_CLAUSE:
        return basicSetFromClause(null, msgs);
      case JDOQLPackage.SUBQUERY__WHERE_CLAUSE:
        return basicSetWhereClause(null, msgs);
      case JDOQLPackage.SUBQUERY__VARIABLES_CLAUSE:
        return basicSetVariablesClause(null, msgs);
      case JDOQLPackage.SUBQUERY__PARAMETERS_CLAUSE:
        return basicSetParametersClause(null, msgs);
      case JDOQLPackage.SUBQUERY__IMPORT_CLAUSE:
        return basicSetImportClause(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JDOQLPackage.SUBQUERY__SELECT_CLAUSE:
        return getSelectClause();
      case JDOQLPackage.SUBQUERY__FROM_CLAUSE:
        return getFromClause();
      case JDOQLPackage.SUBQUERY__WHERE_CLAUSE:
        return getWhereClause();
      case JDOQLPackage.SUBQUERY__VARIABLES_CLAUSE:
        return getVariablesClause();
      case JDOQLPackage.SUBQUERY__PARAMETERS_CLAUSE:
        return getParametersClause();
      case JDOQLPackage.SUBQUERY__IMPORT_CLAUSE:
        return getImportClause();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JDOQLPackage.SUBQUERY__SELECT_CLAUSE:
        setSelectClause((SubquerySelectClause)newValue);
        return;
      case JDOQLPackage.SUBQUERY__FROM_CLAUSE:
        setFromClause((SubqueryFromClause)newValue);
        return;
      case JDOQLPackage.SUBQUERY__WHERE_CLAUSE:
        setWhereClause((WhereClause)newValue);
        return;
      case JDOQLPackage.SUBQUERY__VARIABLES_CLAUSE:
        setVariablesClause((VariablesClause)newValue);
        return;
      case JDOQLPackage.SUBQUERY__PARAMETERS_CLAUSE:
        setParametersClause((ParametersClause)newValue);
        return;
      case JDOQLPackage.SUBQUERY__IMPORT_CLAUSE:
        setImportClause((ImportClause)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JDOQLPackage.SUBQUERY__SELECT_CLAUSE:
        setSelectClause((SubquerySelectClause)null);
        return;
      case JDOQLPackage.SUBQUERY__FROM_CLAUSE:
        setFromClause((SubqueryFromClause)null);
        return;
      case JDOQLPackage.SUBQUERY__WHERE_CLAUSE:
        setWhereClause((WhereClause)null);
        return;
      case JDOQLPackage.SUBQUERY__VARIABLES_CLAUSE:
        setVariablesClause((VariablesClause)null);
        return;
      case JDOQLPackage.SUBQUERY__PARAMETERS_CLAUSE:
        setParametersClause((ParametersClause)null);
        return;
      case JDOQLPackage.SUBQUERY__IMPORT_CLAUSE:
        setImportClause((ImportClause)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JDOQLPackage.SUBQUERY__SELECT_CLAUSE:
        return selectClause != null;
      case JDOQLPackage.SUBQUERY__FROM_CLAUSE:
        return fromClause != null;
      case JDOQLPackage.SUBQUERY__WHERE_CLAUSE:
        return whereClause != null;
      case JDOQLPackage.SUBQUERY__VARIABLES_CLAUSE:
        return variablesClause != null;
      case JDOQLPackage.SUBQUERY__PARAMETERS_CLAUSE:
        return parametersClause != null;
      case JDOQLPackage.SUBQUERY__IMPORT_CLAUSE:
        return importClause != null;
    }
    return super.eIsSet(featureID);
  }

} //SubqueryImpl
