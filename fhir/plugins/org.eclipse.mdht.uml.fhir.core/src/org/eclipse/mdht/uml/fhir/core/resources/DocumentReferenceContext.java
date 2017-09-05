/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Reference Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContext#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContext#getEvents <em>Event</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContext#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContext#getFacilityType <em>Facility Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContext#getPracticeSetting <em>Practice Setting</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContext#getSourcePatientInfo <em>Source Patient Info</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContext#getRelateds <em>Related</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDocumentReferenceContext()
 * @model
 * @generated
 */
public interface DocumentReferenceContext extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encounter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounter</em>' reference.
	 * @see #setEncounter(Encounter)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDocumentReferenceContext_Encounter()
	 * @model
	 * @generated
	 */
	Encounter getEncounter();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContext#getEncounter <em>Encounter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Encounter value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDocumentReferenceContext_Event()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getEvents();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' reference.
	 * @see #setPeriod(Period)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDocumentReferenceContext_Period()
	 * @model
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContext#getPeriod <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Facility Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Type</em>' reference.
	 * @see #setFacilityType(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDocumentReferenceContext_FacilityType()
	 * @model
	 * @generated
	 */
	CodeableConcept getFacilityType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContext#getFacilityType <em>Facility Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Type</em>' reference.
	 * @see #getFacilityType()
	 * @generated
	 */
	void setFacilityType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Practice Setting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Practice Setting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practice Setting</em>' reference.
	 * @see #setPracticeSetting(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDocumentReferenceContext_PracticeSetting()
	 * @model
	 * @generated
	 */
	CodeableConcept getPracticeSetting();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContext#getPracticeSetting <em>Practice Setting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practice Setting</em>' reference.
	 * @see #getPracticeSetting()
	 * @generated
	 */
	void setPracticeSetting(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source Patient Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Patient Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Patient Info</em>' reference.
	 * @see #setSourcePatientInfo(Patient)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDocumentReferenceContext_SourcePatientInfo()
	 * @model
	 * @generated
	 */
	Patient getSourcePatientInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContext#getSourcePatientInfo <em>Source Patient Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Patient Info</em>' reference.
	 * @see #getSourcePatientInfo()
	 * @generated
	 */
	void setSourcePatientInfo(Patient value);

	/**
	 * Returns the value of the '<em><b>Related</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContextRelated}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDocumentReferenceContext_Related()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentReferenceContextRelated> getRelateds();

} // DocumentReferenceContext
