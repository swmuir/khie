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
package org.eclipse.mdht.uml.fhir.core.datatype;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.Timing#getEvents <em>Event</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.Timing#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.Timing#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTiming()
 * @model
 * @generated
 */
public interface Timing extends DataType {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.DateTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTiming_Event()
	 * @model
	 * @generated
	 */
	EList<DateTime> getEvents();

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' reference.
	 * @see #setRepeat(TimingElement1)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTiming_Repeat()
	 * @model
	 * @generated
	 */
	TimingElement1 getRepeat();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.Timing#getRepeat <em>Repeat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' reference.
	 * @see #getRepeat()
	 * @generated
	 */
	void setRepeat(TimingElement1 value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTiming_Code()
	 * @model
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.Timing#getCode <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

} // Timing
