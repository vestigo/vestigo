/**
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nightlabs.vestigo.xtext.jdoql.jDOQL.FromClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.FromClauseImpl#getCandidateClassName <em>Candidate Class Name</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.FromClauseImpl#isIsExcludeSubclasses <em>Is Exclude Subclasses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FromClauseImpl extends MinimalEObjectImpl.Container implements FromClause
{
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
  protected FromClauseImpl()
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
    return JDOQLPackage.Literals.FROM_CLAUSE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.FROM_CLAUSE__CANDIDATE_CLASS_NAME, oldCandidateClassName, candidateClassName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.FROM_CLAUSE__IS_EXCLUDE_SUBCLASSES, oldIsExcludeSubclasses, isExcludeSubclasses));
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
      case JDOQLPackage.FROM_CLAUSE__CANDIDATE_CLASS_NAME:
        return getCandidateClassName();
      case JDOQLPackage.FROM_CLAUSE__IS_EXCLUDE_SUBCLASSES:
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
      case JDOQLPackage.FROM_CLAUSE__CANDIDATE_CLASS_NAME:
        setCandidateClassName((String)newValue);
        return;
      case JDOQLPackage.FROM_CLAUSE__IS_EXCLUDE_SUBCLASSES:
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
      case JDOQLPackage.FROM_CLAUSE__CANDIDATE_CLASS_NAME:
        setCandidateClassName(CANDIDATE_CLASS_NAME_EDEFAULT);
        return;
      case JDOQLPackage.FROM_CLAUSE__IS_EXCLUDE_SUBCLASSES:
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
      case JDOQLPackage.FROM_CLAUSE__CANDIDATE_CLASS_NAME:
        return CANDIDATE_CLASS_NAME_EDEFAULT == null ? candidateClassName != null : !CANDIDATE_CLASS_NAME_EDEFAULT.equals(candidateClassName);
      case JDOQLPackage.FROM_CLAUSE__IS_EXCLUDE_SUBCLASSES:
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

} //FromClauseImpl
