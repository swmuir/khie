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

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enrollment Response</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getRequestOrganization <em>Request Organization</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEnrollmentResponse()
 * @model
 * @generated
 */
public interface EnrollmentResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEnrollmentResponse_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(EnrollmentRequest)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEnrollmentResponse_Request()
	 * @model
	 * @generated
	 */
	EnrollmentRequest getRequest();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(EnrollmentRequest value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' reference.
	 * @see #setOutcome(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEnrollmentResponse_Outcome()
	 * @model
	 * @generated
	 */
	Code getOutcome();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getOutcome <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(Code value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disposition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disposition</em>' reference.
	 * @see #setDisposition(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEnrollmentResponse_Disposition()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getDisposition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getDisposition <em>Disposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruleset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruleset</em>' reference.
	 * @see #setRuleset(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEnrollmentResponse_Ruleset()
	 * @model
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getRuleset <em>Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset</em>' reference.
	 * @see #getRuleset()
	 * @generated
	 */
	void setRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Original Ruleset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Ruleset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Ruleset</em>' reference.
	 * @see #setOriginalRuleset(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEnrollmentResponse_OriginalRuleset()
	 * @model
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getOriginalRuleset <em>Original Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Ruleset</em>' reference.
	 * @see #getOriginalRuleset()
	 * @generated
	 */
	void setOriginalRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' reference.
	 * @see #setCreated(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEnrollmentResponse_Created()
	 * @model
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getCreated <em>Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' reference.
	 * @see #setOrganization(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEnrollmentResponse_Organization()
	 * @model
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Request Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Provider</em>' reference.
	 * @see #setRequestProvider(Practitioner)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEnrollmentResponse_RequestProvider()
	 * @model
	 * @generated
	 */
	Practitioner getRequestProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getRequestProvider <em>Request Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Provider</em>' reference.
	 * @see #getRequestProvider()
	 * @generated
	 */
	void setRequestProvider(Practitioner value);

	/**
	 * Returns the value of the '<em><b>Request Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Organization</em>' reference.
	 * @see #setRequestOrganization(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEnrollmentResponse_RequestOrganization()
	 * @model
	 * @generated
	 */
	Organization getRequestOrganization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse#getRequestOrganization <em>Request Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Organization</em>' reference.
	 * @see #getRequestOrganization()
	 * @generated
	 */
	void setRequestOrganization(Organization value);

} // EnrollmentResponse
