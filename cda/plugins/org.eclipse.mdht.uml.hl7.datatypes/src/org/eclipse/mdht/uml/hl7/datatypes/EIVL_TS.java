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
package org.eclipse.mdht.uml.hl7.datatypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EIVL TS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.EIVL_TS#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.EIVL_TS#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage#getEIVL_TS()
 * @model
 * @generated
 */
public interface EIVL_TS extends SXCM_TS {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(EIVL_event)
	 * @see org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage#getEIVL_TS_Event()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	EIVL_event getEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.hl7.datatypes.EIVL_TS#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EIVL_event value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(IVL_PQ)
	 * @see org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage#getEIVL_TS_Offset()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	IVL_PQ getOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.hl7.datatypes.EIVL_TS#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(IVL_PQ value);

} // EIVL_TS
