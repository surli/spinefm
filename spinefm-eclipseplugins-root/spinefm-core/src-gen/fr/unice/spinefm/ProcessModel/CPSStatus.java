/**
 */
package fr.unice.spinefm.ProcessModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CPS Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getCPSStatus()
 * @model
 * @generated
 */
public enum CPSStatus implements Enumerator
{
	/**
	 * The '<em><b>Partially Configured</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIALLY_CONFIGURED_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLY_CONFIGURED(0, "PartiallyConfigured", "PartiallyConfigured"),

	/**
	 * The '<em><b>Configured</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURED_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURED(1, "Configured", "Configured"),

	/**
	 * The '<em><b>Unconfigurable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCONFIGURABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNCONFIGURABLE(2, "Unconfigurable", "Unconfigurable");

	/**
	 * The '<em><b>Partially Configured</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partially Configured</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIALLY_CONFIGURED
	 * @model name="PartiallyConfigured"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLY_CONFIGURED_VALUE = 0;

	/**
	 * The '<em><b>Configured</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Configured</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURED
	 * @model name="Configured"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURED_VALUE = 1;

	/**
	 * The '<em><b>Unconfigurable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unconfigurable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNCONFIGURABLE
	 * @model name="Unconfigurable"
	 * @generated
	 * @ordered
	 */
	public static final int UNCONFIGURABLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>CPS Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CPSStatus[] VALUES_ARRAY =
		new CPSStatus[]
		{
			PARTIALLY_CONFIGURED,
			CONFIGURED,
			UNCONFIGURABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>CPS Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CPSStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CPS Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPSStatus get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			CPSStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPS Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPSStatus getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			CPSStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPS Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPSStatus get(int value)
	{
		switch (value)
		{
			case PARTIALLY_CONFIGURED_VALUE: return PARTIALLY_CONFIGURED;
			case CONFIGURED_VALUE: return CONFIGURED;
			case UNCONFIGURABLE_VALUE: return UNCONFIGURABLE;
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
	private CPSStatus(int value, String name, String literal)
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
	
} //CPSStatus
