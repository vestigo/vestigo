/**
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Order By Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getOrderByDirection()
 * @model
 * @generated
 */
public enum OrderByDirection implements Enumerator
{
  /**
   * The '<em><b>Asc</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASC_VALUE
   * @generated
   * @ordered
   */
  ASC(0, "asc", "ASC"),

  /**
   * The '<em><b>Ascending</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASCENDING_VALUE
   * @generated
   * @ordered
   */
  ASCENDING(1, "ascending", "ASCENDING"),

  /**
   * The '<em><b>Desc</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DESC_VALUE
   * @generated
   * @ordered
   */
  DESC(2, "desc", "DESC"),

  /**
   * The '<em><b>Descending</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DESCENDING_VALUE
   * @generated
   * @ordered
   */
  DESCENDING(3, "descending", "DESCENDING");

  /**
   * The '<em><b>Asc</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Asc</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASC
   * @model name="asc" literal="ASC"
   * @generated
   * @ordered
   */
  public static final int ASC_VALUE = 0;

  /**
   * The '<em><b>Ascending</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ascending</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASCENDING
   * @model name="ascending" literal="ASCENDING"
   * @generated
   * @ordered
   */
  public static final int ASCENDING_VALUE = 1;

  /**
   * The '<em><b>Desc</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Desc</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DESC
   * @model name="desc" literal="DESC"
   * @generated
   * @ordered
   */
  public static final int DESC_VALUE = 2;

  /**
   * The '<em><b>Descending</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Descending</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DESCENDING
   * @model name="descending" literal="DESCENDING"
   * @generated
   * @ordered
   */
  public static final int DESCENDING_VALUE = 3;

  /**
   * An array of all the '<em><b>Order By Direction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OrderByDirection[] VALUES_ARRAY =
    new OrderByDirection[]
    {
      ASC,
      ASCENDING,
      DESC,
      DESCENDING,
    };

  /**
   * A public read-only list of all the '<em><b>Order By Direction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OrderByDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Order By Direction</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OrderByDirection get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OrderByDirection result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Order By Direction</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OrderByDirection getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OrderByDirection result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Order By Direction</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OrderByDirection get(int value)
  {
    switch (value)
    {
      case ASC_VALUE: return ASC;
      case ASCENDING_VALUE: return ASCENDING;
      case DESC_VALUE: return DESC;
      case DESCENDING_VALUE: return DESCENDING;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private OrderByDirection(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //OrderByDirection
