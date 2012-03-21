/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nightlabs.jjqb.xtext.jdoql.jDOQL.FromClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ImportClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParametersClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.SelectClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariablesClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.WhereClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single String JDOQL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SingleStringJDOQLImpl#getSelectClause <em>Select Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SingleStringJDOQLImpl#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SingleStringJDOQLImpl#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SingleStringJDOQLImpl#getVariablesClause <em>Variables Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SingleStringJDOQLImpl#getParametersClause <em>Parameters Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SingleStringJDOQLImpl#getImportClause <em>Import Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SingleStringJDOQLImpl#getGroupByClause <em>Group By Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SingleStringJDOQLImpl#getOrderByClause <em>Order By Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SingleStringJDOQLImpl#getRangeClause <em>Range Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleStringJDOQLImpl extends MinimalEObjectImpl.Container implements SingleStringJDOQL
{
  /**
   * The cached value of the '{@link #getSelectClause() <em>Select Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectClause()
   * @generated
   * @ordered
   */
  protected SelectClause selectClause;

  /**
   * The cached value of the '{@link #getFromClause() <em>From Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromClause()
   * @generated
   * @ordered
   */
  protected FromClause fromClause;

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
   * The default value of the '{@link #getGroupByClause() <em>Group By Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupByClause()
   * @generated
   * @ordered
   */
  protected static final String GROUP_BY_CLAUSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroupByClause() <em>Group By Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupByClause()
   * @generated
   * @ordered
   */
  protected String groupByClause = GROUP_BY_CLAUSE_EDEFAULT;

  /**
   * The default value of the '{@link #getOrderByClause() <em>Order By Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderByClause()
   * @generated
   * @ordered
   */
  protected static final String ORDER_BY_CLAUSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrderByClause() <em>Order By Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderByClause()
   * @generated
   * @ordered
   */
  protected String orderByClause = ORDER_BY_CLAUSE_EDEFAULT;

  /**
   * The default value of the '{@link #getRangeClause() <em>Range Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeClause()
   * @generated
   * @ordered
   */
  protected static final String RANGE_CLAUSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRangeClause() <em>Range Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeClause()
   * @generated
   * @ordered
   */
  protected String rangeClause = RANGE_CLAUSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleStringJDOQLImpl()
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
    return JDOQLPackage.Literals.SINGLE_STRING_JDOQL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectClause getSelectClause()
  {
    return selectClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectClause(SelectClause newSelectClause, NotificationChain msgs)
  {
    SelectClause oldSelectClause = selectClause;
    selectClause = newSelectClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__SELECT_CLAUSE, oldSelectClause, newSelectClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectClause(SelectClause newSelectClause)
  {
    if (newSelectClause != selectClause)
    {
      NotificationChain msgs = null;
      if (selectClause != null)
        msgs = ((InternalEObject)selectClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SINGLE_STRING_JDOQL__SELECT_CLAUSE, null, msgs);
      if (newSelectClause != null)
        msgs = ((InternalEObject)newSelectClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SINGLE_STRING_JDOQL__SELECT_CLAUSE, null, msgs);
      msgs = basicSetSelectClause(newSelectClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__SELECT_CLAUSE, newSelectClause, newSelectClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromClause getFromClause()
  {
    return fromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFromClause(FromClause newFromClause, NotificationChain msgs)
  {
    FromClause oldFromClause = fromClause;
    fromClause = newFromClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__FROM_CLAUSE, oldFromClause, newFromClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromClause(FromClause newFromClause)
  {
    if (newFromClause != fromClause)
    {
      NotificationChain msgs = null;
      if (fromClause != null)
        msgs = ((InternalEObject)fromClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SINGLE_STRING_JDOQL__FROM_CLAUSE, null, msgs);
      if (newFromClause != null)
        msgs = ((InternalEObject)newFromClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SINGLE_STRING_JDOQL__FROM_CLAUSE, null, msgs);
      msgs = basicSetFromClause(newFromClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__FROM_CLAUSE, newFromClause, newFromClause));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__WHERE_CLAUSE, oldWhereClause, newWhereClause);
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
        msgs = ((InternalEObject)whereClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SINGLE_STRING_JDOQL__WHERE_CLAUSE, null, msgs);
      if (newWhereClause != null)
        msgs = ((InternalEObject)newWhereClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SINGLE_STRING_JDOQL__WHERE_CLAUSE, null, msgs);
      msgs = basicSetWhereClause(newWhereClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__WHERE_CLAUSE, newWhereClause, newWhereClause));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__VARIABLES_CLAUSE, oldVariablesClause, newVariablesClause);
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
        msgs = ((InternalEObject)variablesClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SINGLE_STRING_JDOQL__VARIABLES_CLAUSE, null, msgs);
      if (newVariablesClause != null)
        msgs = ((InternalEObject)newVariablesClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SINGLE_STRING_JDOQL__VARIABLES_CLAUSE, null, msgs);
      msgs = basicSetVariablesClause(newVariablesClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__VARIABLES_CLAUSE, newVariablesClause, newVariablesClause));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__PARAMETERS_CLAUSE, oldParametersClause, newParametersClause);
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
        msgs = ((InternalEObject)parametersClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SINGLE_STRING_JDOQL__PARAMETERS_CLAUSE, null, msgs);
      if (newParametersClause != null)
        msgs = ((InternalEObject)newParametersClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SINGLE_STRING_JDOQL__PARAMETERS_CLAUSE, null, msgs);
      msgs = basicSetParametersClause(newParametersClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__PARAMETERS_CLAUSE, newParametersClause, newParametersClause));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__IMPORT_CLAUSE, oldImportClause, newImportClause);
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
        msgs = ((InternalEObject)importClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SINGLE_STRING_JDOQL__IMPORT_CLAUSE, null, msgs);
      if (newImportClause != null)
        msgs = ((InternalEObject)newImportClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SINGLE_STRING_JDOQL__IMPORT_CLAUSE, null, msgs);
      msgs = basicSetImportClause(newImportClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__IMPORT_CLAUSE, newImportClause, newImportClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroupByClause()
  {
    return groupByClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupByClause(String newGroupByClause)
  {
    String oldGroupByClause = groupByClause;
    groupByClause = newGroupByClause;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__GROUP_BY_CLAUSE, oldGroupByClause, groupByClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrderByClause()
  {
    return orderByClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrderByClause(String newOrderByClause)
  {
    String oldOrderByClause = orderByClause;
    orderByClause = newOrderByClause;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__ORDER_BY_CLAUSE, oldOrderByClause, orderByClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRangeClause()
  {
    return rangeClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRangeClause(String newRangeClause)
  {
    String oldRangeClause = rangeClause;
    rangeClause = newRangeClause;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SINGLE_STRING_JDOQL__RANGE_CLAUSE, oldRangeClause, rangeClause));
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
      case JDOQLPackage.SINGLE_STRING_JDOQL__SELECT_CLAUSE:
        return basicSetSelectClause(null, msgs);
      case JDOQLPackage.SINGLE_STRING_JDOQL__FROM_CLAUSE:
        return basicSetFromClause(null, msgs);
      case JDOQLPackage.SINGLE_STRING_JDOQL__WHERE_CLAUSE:
        return basicSetWhereClause(null, msgs);
      case JDOQLPackage.SINGLE_STRING_JDOQL__VARIABLES_CLAUSE:
        return basicSetVariablesClause(null, msgs);
      case JDOQLPackage.SINGLE_STRING_JDOQL__PARAMETERS_CLAUSE:
        return basicSetParametersClause(null, msgs);
      case JDOQLPackage.SINGLE_STRING_JDOQL__IMPORT_CLAUSE:
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
      case JDOQLPackage.SINGLE_STRING_JDOQL__SELECT_CLAUSE:
        return getSelectClause();
      case JDOQLPackage.SINGLE_STRING_JDOQL__FROM_CLAUSE:
        return getFromClause();
      case JDOQLPackage.SINGLE_STRING_JDOQL__WHERE_CLAUSE:
        return getWhereClause();
      case JDOQLPackage.SINGLE_STRING_JDOQL__VARIABLES_CLAUSE:
        return getVariablesClause();
      case JDOQLPackage.SINGLE_STRING_JDOQL__PARAMETERS_CLAUSE:
        return getParametersClause();
      case JDOQLPackage.SINGLE_STRING_JDOQL__IMPORT_CLAUSE:
        return getImportClause();
      case JDOQLPackage.SINGLE_STRING_JDOQL__GROUP_BY_CLAUSE:
        return getGroupByClause();
      case JDOQLPackage.SINGLE_STRING_JDOQL__ORDER_BY_CLAUSE:
        return getOrderByClause();
      case JDOQLPackage.SINGLE_STRING_JDOQL__RANGE_CLAUSE:
        return getRangeClause();
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
      case JDOQLPackage.SINGLE_STRING_JDOQL__SELECT_CLAUSE:
        setSelectClause((SelectClause)newValue);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__FROM_CLAUSE:
        setFromClause((FromClause)newValue);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__WHERE_CLAUSE:
        setWhereClause((WhereClause)newValue);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__VARIABLES_CLAUSE:
        setVariablesClause((VariablesClause)newValue);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__PARAMETERS_CLAUSE:
        setParametersClause((ParametersClause)newValue);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__IMPORT_CLAUSE:
        setImportClause((ImportClause)newValue);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__GROUP_BY_CLAUSE:
        setGroupByClause((String)newValue);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__ORDER_BY_CLAUSE:
        setOrderByClause((String)newValue);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__RANGE_CLAUSE:
        setRangeClause((String)newValue);
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
      case JDOQLPackage.SINGLE_STRING_JDOQL__SELECT_CLAUSE:
        setSelectClause((SelectClause)null);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__FROM_CLAUSE:
        setFromClause((FromClause)null);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__WHERE_CLAUSE:
        setWhereClause((WhereClause)null);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__VARIABLES_CLAUSE:
        setVariablesClause((VariablesClause)null);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__PARAMETERS_CLAUSE:
        setParametersClause((ParametersClause)null);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__IMPORT_CLAUSE:
        setImportClause((ImportClause)null);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__GROUP_BY_CLAUSE:
        setGroupByClause(GROUP_BY_CLAUSE_EDEFAULT);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__ORDER_BY_CLAUSE:
        setOrderByClause(ORDER_BY_CLAUSE_EDEFAULT);
        return;
      case JDOQLPackage.SINGLE_STRING_JDOQL__RANGE_CLAUSE:
        setRangeClause(RANGE_CLAUSE_EDEFAULT);
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
      case JDOQLPackage.SINGLE_STRING_JDOQL__SELECT_CLAUSE:
        return selectClause != null;
      case JDOQLPackage.SINGLE_STRING_JDOQL__FROM_CLAUSE:
        return fromClause != null;
      case JDOQLPackage.SINGLE_STRING_JDOQL__WHERE_CLAUSE:
        return whereClause != null;
      case JDOQLPackage.SINGLE_STRING_JDOQL__VARIABLES_CLAUSE:
        return variablesClause != null;
      case JDOQLPackage.SINGLE_STRING_JDOQL__PARAMETERS_CLAUSE:
        return parametersClause != null;
      case JDOQLPackage.SINGLE_STRING_JDOQL__IMPORT_CLAUSE:
        return importClause != null;
      case JDOQLPackage.SINGLE_STRING_JDOQL__GROUP_BY_CLAUSE:
        return GROUP_BY_CLAUSE_EDEFAULT == null ? groupByClause != null : !GROUP_BY_CLAUSE_EDEFAULT.equals(groupByClause);
      case JDOQLPackage.SINGLE_STRING_JDOQL__ORDER_BY_CLAUSE:
        return ORDER_BY_CLAUSE_EDEFAULT == null ? orderByClause != null : !ORDER_BY_CLAUSE_EDEFAULT.equals(orderByClause);
      case JDOQLPackage.SINGLE_STRING_JDOQL__RANGE_CLAUSE:
        return RANGE_CLAUSE_EDEFAULT == null ? rangeClause != null : !RANGE_CLAUSE_EDEFAULT.equals(rangeClause);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (groupByClause: ");
    result.append(groupByClause);
    result.append(", orderByClause: ");
    result.append(orderByClause);
    result.append(", rangeClause: ");
    result.append(rangeClause);
    result.append(')');
    return result.toString();
  }

} //SingleStringJDOQLImpl
