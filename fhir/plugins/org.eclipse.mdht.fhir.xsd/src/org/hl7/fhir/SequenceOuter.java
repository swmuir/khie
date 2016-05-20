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
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Outer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Variation and Sequence data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SequenceOuter#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceOuter#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSequenceOuter()
 * @model extendedMetaData="name='Sequence.Outer' kind='elementOnly'"
 * @generated
 */
public interface SequenceOuter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural Variant Outer Start-End.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceOuter_Start()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getStart();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceOuter#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural Variant Outer Start-End.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequenceOuter_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceOuter#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(org.hl7.fhir.Integer value);

} // SequenceOuter
