/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nightlabs.vestigo.xtext.jdoql.jDOQL.Alias;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.Expression;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.SubqueryFromClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subquery From Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.SubqueryFromClauseImpl#getFieldAccessExpression <em>Field Access Expression</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.SubqueryFromClauseImpl#getCandidateClassName <em>Candidate Class Name</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.SubqueryFromClauseImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.SubqueryFromClauseImpl#isIsExcludeSubclasses <em>Is Exclude Subclasses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubqueryFromClauseImpl extends MinimalEObjectImpl.Container implements SubqueryFromClause
{
  /**
   * The cached value of the '{@link #getFieldAccessExpression() <em>Field Access Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldAccessExpression()
   * @generated
   * @ordered
   */
  protected Expression fieldAccessExpression;

  /**
   * The default value of the '{@link #getCandidateClassName() <em>Candidate Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCandidateClassName()
   * @generated
   * @ordered
   */
  protected static final String CANDIDATE_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCandidateClassName() <em>Candidate Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCandidateClassName()
   * @generated
   * @ordered
   */
  protected String candidateClassName = CANDIDATE_CLASS_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected Alias alias;

  /**
   * The default value of the '{@link #isIsExcludeSubclasses() <em>Is Exclude Subclasses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExcludeSubclasses()
   * @generated
   * @ordered
   */
  protected static final boolean IS_EXCLUDE_SUBCLASSES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsExcludeSubclasses() <em>Is Exclude Subclasses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExcludeSubclasses()
   * @generated
   * @ordered
   */
  protected boolean isExcludeSubclasses = IS_EXCLUDE_SUBCLASSES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubqueryFromClauseImpl()
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
    return JDOQLPackage.Literals.SUBQUERY_FROM_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getFieldAccessExpression()
  {
    return fieldAccessExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFieldAccessExpression(Expression newFieldAccessExpression, NotificationChain msgs)
  {
    Expression oldFieldAccessExpression = fieldAccessExpression;
    fieldAccessExpression = newFieldAccessExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY_FROM_CLAUSE__FIELD_ACCESS_EXPRESSION, oldFieldAccessExpression, newFieldAccessExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldAccessExpression(Expression newFieldAccessExpression)
  {
    if (newFieldAccessExpression != fieldAccessExpression)
    {
      NotificationChain msgs = null;
      if (fieldAccessExpression != null)
        msgs = ((InternalEObject)fieldAccessExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY_FROM_CLAUSE__FIELD_ACCESS_EXPRESSION, null, msgs);
      if (newFieldAccessExpression != null)
        msgs = ((InternalEObject)newFieldAccessExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY_FROM_CLAUSE__FIELD_ACCESS_EXPRESSION, null, msgs);
      msgs = basicSetFieldAccessExpression(newFieldAccessExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY_FROM_CLAUSE__FIELD_ACCESS_EXPRESSION, newFieldAccessExpression, newFieldAccessExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCandidateClassName()
  {
    return candidateClassName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCandidateClassName(String newCandidateClassName)
  {
    String oldCandidateClassName = candidateClassName;
    candidateClassName = newCandidateClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY_FROM_CLAUSE__CANDIDATE_CLASS_NAME, oldCandidateClassName, candidateClassName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alias getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlias(Alias newAlias, NotificationChain msgs)
  {
    Alias oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY_FROM_CLAUSE__ALIAS, oldAlias, newAlias);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(Alias newAlias)
  {
    if (newAlias != alias)
    {
      NotificationChain msgs = null;
      if (alias != null)
        msgs = ((InternalEObject)alias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY_FROM_CLAUSE__ALIAS, null, msgs);
      if (newAlias != null)
        msgs = ((InternalEObject)newAlias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY_FROM_CLAUSE__ALIAS, null, msgs);
      msgs = basicSetAlias(newAlias, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY_FROM_CLAUSE__ALIAS, newAlias, newAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsExcludeSubclasses()
  {
    return isExcludeSubclasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsExcludeSubclasses(boolean newIsExcludeSubclasses)
  {
    boolean oldIsExcludeSubclasses = isExcludeSubclasses;
    isExcludeSubclasses = newIsExcludeSubclasses;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY_FROM_CLAUSE__IS_EXCLUDE_SUBCLASSES, oldIsExcludeSubclasses, isExcludeSubclasses));
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
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__FIELD_ACCESS_EXPRESSION:
        return basicSetFieldAccessExpression(null, msgs);
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__ALIAS:
        return basicSetAlias(null, msgs);
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
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__FIELD_ACCESS_EXPRESSION:
        return getFieldAccessExpression();
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__CANDIDATE_CLASS_NAME:
        return getCandidateClassName();
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__ALIAS:
        return getAlias();
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__IS_EXCLUDE_SUBCLASSES:
        return isIsExcludeSubclasses();
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
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__FIELD_ACCESS_EXPRESSION:
        setFieldAccessExpression((Expression)newValue);
        return;
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__CANDIDATE_CLASS_NAME:
        setCandidateClassName((String)newValue);
        return;
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__ALIAS:
        setAlias((Alias)newValue);
        return;
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__IS_EXCLUDE_SUBCLASSES:
        setIsExcludeSubclasses((Boolean)newValue);
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
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__FIELD_ACCESS_EXPRESSION:
        setFieldAccessExpression((Expression)null);
        return;
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__CANDIDATE_CLASS_NAME:
        setCandidateClassName(CANDIDATE_CLASS_NAME_EDEFAULT);
        return;
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__ALIAS:
        setAlias((Alias)null);
        return;
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__IS_EXCLUDE_SUBCLASSES:
        setIsExcludeSubclasses(IS_EXCLUDE_SUBCLASSES_EDEFAULT);
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
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__FIELD_ACCESS_EXPRESSION:
        return fieldAccessExpression != null;
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__CANDIDATE_CLASS_NAME:
        return CANDIDATE_CLASS_NAME_EDEFAULT == null ? candidateClassName != null : !CANDIDATE_CLASS_NAME_EDEFAULT.equals(candidateClassName);
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__ALIAS:
        return alias != null;
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE__IS_EXCLUDE_SUBCLASSES:
        return isExcludeSubclasses != IS_EXCLUDE_SUBCLASSES_EDEFAULT;
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
    result.append(" (candidateClassName: ");
    result.append(candidateClassName);
    result.append(", isExcludeSubclasses: ");
    result.append(isExcludeSubclasses);
    result.append(')');
    return result.toString();
  }

} //SubqueryFromClauseImpl
