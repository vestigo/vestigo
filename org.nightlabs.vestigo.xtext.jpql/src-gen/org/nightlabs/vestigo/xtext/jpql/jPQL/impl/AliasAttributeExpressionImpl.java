/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByDirection;
import org.nightlabs.vestigo.xtext.jpql.jPQL.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias Attribute Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasAttributeExpressionImpl extends OrderBySpecImpl implements AliasAttributeExpression
{
  /**
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected static final OrderByDirection DIRECTION_EDEFAULT = OrderByDirection.ASC;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected OrderByDirection direction = DIRECTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected VariableDeclaration alias;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<String> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AliasAttributeExpressionImpl()
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
    return JPQLPackage.Literals.ALIAS_ATTRIBUTE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderByDirection getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(OrderByDirection newDirection)
  {
    OrderByDirection oldDirection = direction;
    direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__DIRECTION, oldDirection, direction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration getAlias()
  {
    if (alias != null && alias.eIsProxy())
    {
      InternalEObject oldAlias = (InternalEObject)alias;
      alias = (VariableDeclaration)eResolveProxy(oldAlias);
      if (alias != oldAlias)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ALIAS, oldAlias, alias));
      }
    }
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration basicGetAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(VariableDeclaration newAlias)
  {
    VariableDeclaration oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EDataTypeEList<String>(String.class, this, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES);
    }
    return attributes;
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
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__DIRECTION:
        return getDirection();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ALIAS:
        if (resolve) return getAlias();
        return basicGetAlias();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES:
        return getAttributes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__DIRECTION:
        setDirection((OrderByDirection)newValue);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ALIAS:
        setAlias((VariableDeclaration)newValue);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends String>)newValue);
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
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__DIRECTION:
        setDirection(DIRECTION_EDEFAULT);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ALIAS:
        setAlias((VariableDeclaration)null);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES:
        getAttributes().clear();
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
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__DIRECTION:
        return direction != DIRECTION_EDEFAULT;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ALIAS:
        return alias != null;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
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
    result.append(" (direction: ");
    result.append(direction);
    result.append(", attributes: ");
    result.append(attributes);
    result.append(')');
    return result.toString();
  }

} //AliasAttributeExpressionImpl
