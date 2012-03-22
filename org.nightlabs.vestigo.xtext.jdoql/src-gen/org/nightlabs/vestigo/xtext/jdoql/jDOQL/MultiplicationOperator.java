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
 * A representation of the literals of the enumeration '<em><b>Multiplication Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getMultiplicationOperator()
 * @model
 * @generated
 */
public enum MultiplicationOperator implements Enumerator
{
  /**
   * The '<em><b>Multiply</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MULTIPLY_VALUE
   * @generated
   * @ordered
   */
  MULTIPLY(0, "multiply", "*"),

  /**
   * The '<em><b>Divide</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIVIDE_VALUE
   * @generated
   * @ordered
   */
  DIVIDE(1, "divide", "/"),

  /**
   * The '<em><b>Modulo</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MODULO_VALUE
   * @generated
   * @ordered
   */
  MODULO(2, "modulo", "%");

  /**
   * The '<em><b>Multiply</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Multiply</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MULTIPLY
   * @model name="multiply" literal="*"
   * @generated
   * @ordered
   */
  public static final int MULTIPLY_VALUE = 0;

  /**
   * The '<em><b>Divide</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Divide</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIVIDE
   * @model name="divide" literal="/"
   * @generated
   * @ordered
   */
  public static final int DIVIDE_VALUE = 1;

  /**
   * The '<em><b>Modulo</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Modulo</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MODULO
   * @model name="modulo" literal="%"
   * @generated
   * @ordered
   */
  public static final int MODULO_VALUE = 2;

  /**
   * An array of all the '<em><b>Multiplication Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final MultiplicationOperator[] VALUES_ARRAY =
    new MultiplicationOperator[]
    {
      MULTIPLY,
      DIVIDE,
      MODULO,
    };

  /**
   * A public read-only list of all the '<em><b>Multiplication Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<MultiplicationOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Multiplication Operator</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MultiplicationOperator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MultiplicationOperator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Multiplication Operator</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MultiplicationOperator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MultiplicationOperator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Multiplication Operator</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MultiplicationOperator get(int value)
  {
    switch (value)
    {
      case MULTIPLY_VALUE: return MULTIPLY;
      case DIVIDE_VALUE: return DIVIDE;
      case MODULO_VALUE: return MODULO;
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
  private MultiplicationOperator(int value, String name, String literal)
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
  
} //MultiplicationOperator
