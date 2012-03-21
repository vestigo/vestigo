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

import org.nightlabs.jjqb.xtext.jdoql.jDOQL.DeclaredParameterName;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ParameterDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ParameterDeclarationImpl#getDeclaredParameterName <em>Declared Parameter Name</em>}</li>
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
   * The cached value of the '{@link #getDeclaredParameterName() <em>Declared Parameter Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredParameterName()
   * @generated
   * @ordered
   */
  protected DeclaredParameterName declaredParameterName;

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
  public DeclaredParameterName getDeclaredParameterName()
  {
    return declaredParameterName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaredParameterName(DeclaredParameterName newDeclaredParameterName, NotificationChain msgs)
  {
    DeclaredParameterName oldDeclaredParameterName = declaredParameterName;
    declaredParameterName = newDeclaredParameterName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME, oldDeclaredParameterName, newDeclaredParameterName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaredParameterName(DeclaredParameterName newDeclaredParameterName)
  {
    if (newDeclaredParameterName != declaredParameterName)
    {
      NotificationChain msgs = null;
      if (declaredParameterName != null)
        msgs = ((InternalEObject)declaredParameterName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME, null, msgs);
      if (newDeclaredParameterName != null)
        msgs = ((InternalEObject)newDeclaredParameterName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME, null, msgs);
      msgs = basicSetDeclaredParameterName(newDeclaredParameterName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME, newDeclaredParameterName, newDeclaredParameterName));
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
      case JDOQLPackage.PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME:
        return basicSetDeclaredParameterName(null, msgs);
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
        setDeclaredParameterName((DeclaredParameterName)newValue);
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
        setDeclaredParameterName((DeclaredParameterName)null);
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
        return declaredParameterName != null;
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
    result.append(')');
    return result.toString();
  }

} //ParameterDeclarationImpl
