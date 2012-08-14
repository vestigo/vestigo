/**
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.ParameterDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.ParameterDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.ParameterDeclarationImpl#getDeclaredParameterName <em>Declared Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterDeclarationImpl extends MinimalEObjectImpl.Container implements ParameterDeclaration
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDeclaredParameterName() <em>Declared Parameter Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredParameterName()
   * @generated
   * @ordered
   */
  protected static final String DECLARED_PARAMETER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeclaredParameterName() <em>Declared Parameter Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredParameterName()
   * @generated
   * @ordered
   */
  protected String declaredParameterName = DECLARED_PARAMETER_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterDeclarationImpl()
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
    return JDOQLPackage.Literals.PARAMETER_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.PARAMETER_DECLARATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeclaredParameterName()
  {
    return declaredParameterName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaredParameterName(String newDeclaredParameterName)
  {
    String oldDeclaredParameterName = declaredParameterName;
    declaredParameterName = newDeclaredParameterName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME, oldDeclaredParameterName, declaredParameterName));
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
      case JDOQLPackage.PARAMETER_DECLARATION__TYPE:
        return getType();
      case JDOQLPackage.PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME:
        return getDeclaredParameterName();
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
      case JDOQLPackage.PARAMETER_DECLARATION__TYPE:
        setType((String)newValue);
        return;
      case JDOQLPackage.PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME:
        setDeclaredParameterName((String)newValue);
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
      case JDOQLPackage.PARAMETER_DECLARATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case JDOQLPackage.PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME:
        setDeclaredParameterName(DECLARED_PARAMETER_NAME_EDEFAULT);
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
      case JDOQLPackage.PARAMETER_DECLARATION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case JDOQLPackage.PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME:
        return DECLARED_PARAMETER_NAME_EDEFAULT == null ? declaredParameterName != null : !DECLARED_PARAMETER_NAME_EDEFAULT.equals(declaredParameterName);
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
    result.append(" (type: ");
    result.append(type);
    result.append(", declaredParameterName: ");
    result.append(declaredParameterName);
    result.append(')');
    return result.toString();
  }

} //ParameterDeclarationImpl
