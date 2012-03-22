/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unary Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getUnaryOperator()
 * @model
 * @generated
 */
public enum UnaryOperator implements Enumerator
{
  /**
   * The '<em><b>Positive</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POSITIVE_VALUE
   * @generated
   * @ordered
   */
  POSITIVE(0, "positive", "+"),

  /**
   * The '<em><b>Negative</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEGATIVE_VALUE
   * @generated
   * @ordered
   */
  NEGATIVE(1, "negative", "-"),

  /**
   * The '<em><b>Bitwise Not</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BITWISE_NOT_VALUE
   * @generated
   * @ordered
   */
  BITWISE_NOT(2, "bitwiseNot", "~"),

  /**
   * The '<em><b>Logical Not</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOGICAL_NOT_VALUE
   * @generated
   * @ordered
   */
  LOGICAL_NOT(3, "logicalNot", "!");

  /**
   * The '<em><b>Positive</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Positive</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POSITIVE
   * @model name="positive" literal="+"
   * @generated
   * @ordered
   */
  public static final int POSITIVE_VALUE = 0;

  /**
   * The '<em><b>Negative</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Negative</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEGATIVE
   * @model name="negative" literal="-"
   * @generated
   * @ordered
   */
  public static final int NEGATIVE_VALUE = 1;

  /**
   * The '<em><b>Bitwise Not</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bitwise Not</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BITWISE_NOT
   * @model name="bitwiseNot" literal="~"
   * @generated
   * @ordered
   */
  public static final int BITWISE_NOT_VALUE = 2;

  /**
   * The '<em><b>Logical Not</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Logical Not</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOGICAL_NOT
   * @model name="logicalNot" literal="!"
   * @generated
   * @ordered
   */
  public static final int LOGICAL_NOT_VALUE = 3;

  /**
   * An array of all the '<em><b>Unary Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final UnaryOperator[] VALUES_ARRAY =
    new UnaryOperator[]
    {
      POSITIVE,
      NEGATIVE,
      BITWISE_NOT,
      LOGICAL_NOT,
    };

  /**
   * A public read-only list of all the '<em><b>Unary Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<UnaryOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Unary Operator</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UnaryOperator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UnaryOperator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Unary Operator</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UnaryOperator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UnaryOperator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Unary Operator</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UnaryOperator get(int value)
  {
    switch (value)
    {
      case POSITIVE_VALUE: return POSITIVE;
      case NEGATIVE_VALUE: return NEGATIVE;
      case BITWISE_NOT_VALUE: return BITWISE_NOT;
      case LOGICAL_NOT_VALUE: return LOGICAL_NOT;
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
  private UnaryOperator(int value, String name, String literal)
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
  
} //UnaryOperator
