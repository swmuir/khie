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
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimDiagnosis#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimDiagnosis#getDiagnosis <em>Diagnosis</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimDiagnosis()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Claim_Diagnosis'"
 * @generated
 */
public interface ClaimDiagnosis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimDiagnosis_Sequence()
	 * @model required="true"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimDiagnosis#getSequence <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis</em>' reference.
	 * @see #setDiagnosis(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimDiagnosis_Diagnosis()
	 * @model required="true"
	 * @generated
	 */
	Coding getDiagnosis();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimDiagnosis#getDiagnosis <em>Diagnosis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnosis</em>' reference.
	 * @see #getDiagnosis()
	 * @generated
	 */
	void setDiagnosis(Coding value);

} // ClaimDiagnosis
