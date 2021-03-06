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
 * A representation of the literals of the enumeration '<em><b>Decision Support Rule Participant Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getDecisionSupportRuleParticipantType()
 * @model
 * @generated
 */
public enum DecisionSupportRuleParticipantType implements Enumerator {
	/**
	 * The '<em><b>Patient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT(0, "patient", "patient"),

	/**
	 * The '<em><b>Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	PERSON(1, "person", "person"),

	/**
	 * The '<em><b>Practitioner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRACTITIONER_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTITIONER(2, "practitioner", "practitioner"),

	/**
	 * The '<em><b>Relatedperson</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATEDPERSON_VALUE
	 * @generated
	 * @ordered
	 */
	RELATEDPERSON(3, "relatedperson", "relatedperson");

	/**
	 * The '<em><b>Patient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Patient</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATIENT
	 * @model name="patient"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_VALUE = 0;

	/**
	 * The '<em><b>Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Person</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERSON
	 * @model name="person"
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_VALUE = 1;

	/**
	 * The '<em><b>Practitioner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Practitioner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRACTITIONER
	 * @model name="practitioner"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTITIONER_VALUE = 2;

	/**
	 * The '<em><b>Relatedperson</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relatedperson</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATEDPERSON
	 * @model name="relatedperson"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='related-person'"
	 * @generated
	 * @ordered
	 */
	public static final int RELATEDPERSON_VALUE = 3;

	/**
	 * An array of all the '<em><b>Decision Support Rule Participant Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DecisionSupportRuleParticipantType[] VALUES_ARRAY =
		new DecisionSupportRuleParticipantType[] {
			PATIENT,
			PERSON,
			PRACTITIONER,
			RELATEDPERSON,
		};

	/**
	 * A public read-only list of all the '<em><b>Decision Support Rule Participant Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DecisionSupportRuleParticipantType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Decision Support Rule Participant Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionSupportRuleParticipantType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionSupportRuleParticipantType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Support Rule Participant Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionSupportRuleParticipantType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionSupportRuleParticipantType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Support Rule Participant Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionSupportRuleParticipantType get(int value) {
		switch (value) {
			case PATIENT_VALUE: return PATIENT;
			case PERSON_VALUE: return PERSON;
			case PRACTITIONER_VALUE: return PRACTITIONER;
			case RELATEDPERSON_VALUE: return RELATEDPERSON;
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
	private DecisionSupportRuleParticipantType(int value, String name, String literal) {
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
	
} //DecisionSupportRuleParticipantType
