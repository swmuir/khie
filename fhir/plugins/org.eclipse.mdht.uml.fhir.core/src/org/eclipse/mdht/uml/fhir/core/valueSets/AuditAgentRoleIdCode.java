/**
 */
package org.eclipse.mdht.uml.fhir.core.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Audit Agent Role Id Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ValueSetsPackage#getAuditAgentRoleIdCode()
 * @model
 * @generated
 */
public enum AuditAgentRoleIdCode implements Enumerator {
	/**
	 * The '<em><b>110150</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_110150_VALUE
	 * @generated
	 * @ordered
	 */
	_110150(0, "_110150", "_110150"),

	/**
	 * The '<em><b>110151</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_110151_VALUE
	 * @generated
	 * @ordered
	 */
	_110151(1, "_110151", "_110151"),

	/**
	 * The '<em><b>110152</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_110152_VALUE
	 * @generated
	 * @ordered
	 */
	_110152(2, "_110152", "_110152"),

	/**
	 * The '<em><b>110153</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_110153_VALUE
	 * @generated
	 * @ordered
	 */
	_110153(3, "_110153", "_110153"),

	/**
	 * The '<em><b>110154</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_110154_VALUE
	 * @generated
	 * @ordered
	 */
	_110154(4, "_110154", "_110154"),

	/**
	 * The '<em><b>110155</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_110155_VALUE
	 * @generated
	 * @ordered
	 */
	_110155(5, "_110155", "_110155");

	/**
	 * The '<em><b>110150</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>110150</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_110150
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _110150_VALUE = 0;

	/**
	 * The '<em><b>110151</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>110151</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_110151
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _110151_VALUE = 1;

	/**
	 * The '<em><b>110152</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>110152</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_110152
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _110152_VALUE = 2;

	/**
	 * The '<em><b>110153</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>110153</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_110153
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _110153_VALUE = 3;

	/**
	 * The '<em><b>110154</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>110154</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_110154
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _110154_VALUE = 4;

	/**
	 * The '<em><b>110155</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>110155</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_110155
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _110155_VALUE = 5;

	/**
	 * An array of all the '<em><b>Audit Agent Role Id Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AuditAgentRoleIdCode[] VALUES_ARRAY =
		new AuditAgentRoleIdCode[] {
			_110150,
			_110151,
			_110152,
			_110153,
			_110154,
			_110155,
		};

	/**
	 * A public read-only list of all the '<em><b>Audit Agent Role Id Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AuditAgentRoleIdCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Audit Agent Role Id Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuditAgentRoleIdCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuditAgentRoleIdCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Audit Agent Role Id Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuditAgentRoleIdCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuditAgentRoleIdCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Audit Agent Role Id Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuditAgentRoleIdCode get(int value) {
		switch (value) {
			case _110150_VALUE: return _110150;
			case _110151_VALUE: return _110151;
			case _110152_VALUE: return _110152;
			case _110153_VALUE: return _110153;
			case _110154_VALUE: return _110154;
			case _110155_VALUE: return _110155;
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
	private AuditAgentRoleIdCode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AuditAgentRoleIdCode
