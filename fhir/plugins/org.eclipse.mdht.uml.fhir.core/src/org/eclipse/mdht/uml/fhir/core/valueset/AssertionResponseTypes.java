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
 * A representation of the literals of the enumeration '<em><b>Assertion Response Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getAssertionResponseTypes()
 * @model
 * @generated
 */
public enum AssertionResponseTypes implements Enumerator {
	/**
	 * The '<em><b>Okay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OKAY_VALUE
	 * @generated
	 * @ordered
	 */
	OKAY(0, "okay", "okay"),

	/**
	 * The '<em><b>Created</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATED_VALUE
	 * @generated
	 * @ordered
	 */
	CREATED(1, "created", "created"),

	/**
	 * The '<em><b>No Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CONTENT(2, "noContent", "noContent"),

	/**
	 * The '<em><b>Not Modified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_MODIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_MODIFIED(3, "notModified", "notModified"),

	/**
	 * The '<em><b>Bad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_VALUE
	 * @generated
	 * @ordered
	 */
	BAD(4, "bad", "bad"),

	/**
	 * The '<em><b>Forbidden</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORBIDDEN_VALUE
	 * @generated
	 * @ordered
	 */
	FORBIDDEN(5, "forbidden", "forbidden"),

	/**
	 * The '<em><b>Not Found</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_FOUND_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_FOUND(6, "notFound", "notFound"),

	/**
	 * The '<em><b>Method Not Allowed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_NOT_ALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD_NOT_ALLOWED(7, "methodNotAllowed", "methodNotAllowed"),

	/**
	 * The '<em><b>Conflict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFLICT_VALUE
	 * @generated
	 * @ordered
	 */
	CONFLICT(8, "conflict", "conflict"),

	/**
	 * The '<em><b>Gone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GONE_VALUE
	 * @generated
	 * @ordered
	 */
	GONE(9, "gone", "gone"),

	/**
	 * The '<em><b>Precondition Failed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECONDITION_FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	PRECONDITION_FAILED(10, "preconditionFailed", "preconditionFailed"),

	/**
	 * The '<em><b>Unprocessable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPROCESSABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNPROCESSABLE(11, "unprocessable", "unprocessable");

	/**
	 * The '<em><b>Okay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Okay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OKAY
	 * @model name="okay"
	 * @generated
	 * @ordered
	 */
	public static final int OKAY_VALUE = 0;

	/**
	 * The '<em><b>Created</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Created</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATED
	 * @model name="created"
	 * @generated
	 * @ordered
	 */
	public static final int CREATED_VALUE = 1;

	/**
	 * The '<em><b>No Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Content</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_CONTENT
	 * @model name="noContent"
	 * @generated
	 * @ordered
	 */
	public static final int NO_CONTENT_VALUE = 2;

	/**
	 * The '<em><b>Not Modified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Modified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_MODIFIED
	 * @model name="notModified"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_MODIFIED_VALUE = 3;

	/**
	 * The '<em><b>Bad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bad</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD
	 * @model name="bad"
	 * @generated
	 * @ordered
	 */
	public static final int BAD_VALUE = 4;

	/**
	 * The '<em><b>Forbidden</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Forbidden</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORBIDDEN
	 * @model name="forbidden"
	 * @generated
	 * @ordered
	 */
	public static final int FORBIDDEN_VALUE = 5;

	/**
	 * The '<em><b>Not Found</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Found</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_FOUND
	 * @model name="notFound"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_FOUND_VALUE = 6;

	/**
	 * The '<em><b>Method Not Allowed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Method Not Allowed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD_NOT_ALLOWED
	 * @model name="methodNotAllowed"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_NOT_ALLOWED_VALUE = 7;

	/**
	 * The '<em><b>Conflict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conflict</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFLICT
	 * @model name="conflict"
	 * @generated
	 * @ordered
	 */
	public static final int CONFLICT_VALUE = 8;

	/**
	 * The '<em><b>Gone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GONE
	 * @model name="gone"
	 * @generated
	 * @ordered
	 */
	public static final int GONE_VALUE = 9;

	/**
	 * The '<em><b>Precondition Failed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Precondition Failed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRECONDITION_FAILED
	 * @model name="preconditionFailed"
	 * @generated
	 * @ordered
	 */
	public static final int PRECONDITION_FAILED_VALUE = 10;

	/**
	 * The '<em><b>Unprocessable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unprocessable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNPROCESSABLE
	 * @model name="unprocessable"
	 * @generated
	 * @ordered
	 */
	public static final int UNPROCESSABLE_VALUE = 11;

	/**
	 * An array of all the '<em><b>Assertion Response Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssertionResponseTypes[] VALUES_ARRAY =
		new AssertionResponseTypes[] {
			OKAY,
			CREATED,
			NO_CONTENT,
			NOT_MODIFIED,
			BAD,
			FORBIDDEN,
			NOT_FOUND,
			METHOD_NOT_ALLOWED,
			CONFLICT,
			GONE,
			PRECONDITION_FAILED,
			UNPROCESSABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Assertion Response Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssertionResponseTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Assertion Response Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssertionResponseTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssertionResponseTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assertion Response Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssertionResponseTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssertionResponseTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assertion Response Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssertionResponseTypes get(int value) {
		switch (value) {
			case OKAY_VALUE: return OKAY;
			case CREATED_VALUE: return CREATED;
			case NO_CONTENT_VALUE: return NO_CONTENT;
			case NOT_MODIFIED_VALUE: return NOT_MODIFIED;
			case BAD_VALUE: return BAD;
			case FORBIDDEN_VALUE: return FORBIDDEN;
			case NOT_FOUND_VALUE: return NOT_FOUND;
			case METHOD_NOT_ALLOWED_VALUE: return METHOD_NOT_ALLOWED;
			case CONFLICT_VALUE: return CONFLICT;
			case GONE_VALUE: return GONE;
			case PRECONDITION_FAILED_VALUE: return PRECONDITION_FAILED;
			case UNPROCESSABLE_VALUE: return UNPROCESSABLE;
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
	private AssertionResponseTypes(int value, String name, String literal) {
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
	
} //AssertionResponseTypes
