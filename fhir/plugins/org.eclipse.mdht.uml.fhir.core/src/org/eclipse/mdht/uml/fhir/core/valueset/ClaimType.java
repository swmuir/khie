/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.valueset;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Claim Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getClaimType()
 * @model
 * @generated
 */
public enum ClaimType implements Enumerator {
	/**
	 * The '<em><b>Institutional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTITUTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	INSTITUTIONAL(0, "institutional", "institutional"),

	/**
	 * The '<em><b>Oral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORAL(1, "oral", "oral"),

	/**
	 * The '<em><b>Pharmacy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACY(2, "pharmacy", "pharmacy"),

	/**
	 * The '<em><b>Professional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFESSIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	PROFESSIONAL(3, "professional", "professional"),

	/**
	 * The '<em><b>Vision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISION_VALUE
	 * @generated
	 * @ordered
	 */
	VISION(4, "vision", "vision");

	/**
	 * The '<em><b>Institutional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Institutional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTITUTIONAL
	 * @model name="institutional"
	 * @generated
	 * @ordered
	 */
	public static final int INSTITUTIONAL_VALUE = 0;

	/**
	 * The '<em><b>Oral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oral</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORAL
	 * @model name="oral"
	 * @generated
	 * @ordered
	 */
	public static final int ORAL_VALUE = 1;

	/**
	 * The '<em><b>Pharmacy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharmacy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARMACY
	 * @model name="pharmacy"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACY_VALUE = 2;

	/**
	 * The '<em><b>Professional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Professional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROFESSIONAL
	 * @model name="professional"
	 * @generated
	 * @ordered
	 */
	public static final int PROFESSIONAL_VALUE = 3;

	/**
	 * The '<em><b>Vision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vision</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISION
	 * @model name="vision"
	 * @generated
	 * @ordered
	 */
	public static final int VISION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Claim Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClaimType[] VALUES_ARRAY =
		new ClaimType[] {
			INSTITUTIONAL,
			ORAL,
			PHARMACY,
			PROFESSIONAL,
			VISION,
		};

	/**
	 * A public read-only list of all the '<em><b>Claim Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClaimType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Claim Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClaimType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClaimType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Claim Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClaimType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClaimType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Claim Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClaimType get(int value) {
		switch (value) {
			case INSTITUTIONAL_VALUE: return INSTITUTIONAL;
			case ORAL_VALUE: return ORAL;
			case PHARMACY_VALUE: return PHARMACY;
			case PROFESSIONAL_VALUE: return PROFESSIONAL;
			case VISION_VALUE: return VISION;
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
	private ClaimType(int value, String name, String literal) {
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
	
} //ClaimType
