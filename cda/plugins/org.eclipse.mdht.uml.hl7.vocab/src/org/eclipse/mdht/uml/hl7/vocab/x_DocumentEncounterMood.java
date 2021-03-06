/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.hl7.vocab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>xDocument Encounter Mood</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.hl7.vocab.VocabPackage#getx_DocumentEncounterMood()
 * @model
 * @generated
 */
public enum x_DocumentEncounterMood implements Enumerator {
	/**
	 * The '<em><b>APT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APT_VALUE
	 * @generated
	 * @ordered
	 */
	APT(0, "APT", "APT"),

	/**
	 * The '<em><b>ARQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARQ_VALUE
	 * @generated
	 * @ordered
	 */
	ARQ(1, "ARQ", "ARQ"),

	/**
	 * The '<em><b>EVN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVN_VALUE
	 * @generated
	 * @ordered
	 */
	EVN(2, "EVN", "EVN"),

	/**
	 * The '<em><b>INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(3, "INT", "INT"),

	/**
	 * The '<em><b>PRMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRMS_VALUE
	 * @generated
	 * @ordered
	 */
	PRMS(4, "PRMS", "PRMS"),

	/**
	 * The '<em><b>PRP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRP_VALUE
	 * @generated
	 * @ordered
	 */
	PRP(5, "PRP", "PRP"),

	/**
	 * The '<em><b>RQO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RQO_VALUE
	 * @generated
	 * @ordered
	 */
	RQO(6, "RQO", "RQO");

	/**
	 * The '<em><b>APT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APT_VALUE = 0;

	/**
	 * The '<em><b>ARQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARQ_VALUE = 1;

	/**
	 * The '<em><b>EVN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVN_VALUE = 2;

	/**
	 * The '<em><b>INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 3;

	/**
	 * The '<em><b>PRMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRMS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRMS_VALUE = 4;

	/**
	 * The '<em><b>PRP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRP_VALUE = 5;

	/**
	 * The '<em><b>RQO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RQO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RQO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RQO_VALUE = 6;

	/**
	 * An array of all the '<em><b>xDocument Encounter Mood</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final x_DocumentEncounterMood[] VALUES_ARRAY = new x_DocumentEncounterMood[] {
			APT, ARQ, EVN, INT, PRMS, PRP, RQO, };

	/**
	 * A public read-only list of all the '<em><b>xDocument Encounter Mood</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<x_DocumentEncounterMood> VALUES = Collections.unmodifiableList(
		Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>xDocument Encounter Mood</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static x_DocumentEncounterMood get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			x_DocumentEncounterMood result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>xDocument Encounter Mood</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static x_DocumentEncounterMood getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			x_DocumentEncounterMood result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>xDocument Encounter Mood</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static x_DocumentEncounterMood get(int value) {
		switch (value) {
			case APT_VALUE:
				return APT;
			case ARQ_VALUE:
				return ARQ;
			case EVN_VALUE:
				return EVN;
			case INT_VALUE:
				return INT;
			case PRMS_VALUE:
				return PRMS;
			case PRP_VALUE:
				return PRP;
			case RQO_VALUE:
				return RQO;
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
	private x_DocumentEncounterMood(int value, String name, String literal) {
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

} // x_DocumentEncounterMood
