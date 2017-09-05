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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Hospitalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getPreAdmissionIdentifier <em>Pre Admission Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getAdmitSource <em>Admit Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getAdmittingDiagnosis <em>Admitting Diagnosis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getReAdmission <em>Re Admission</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getDietPreferences <em>Diet Preference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getSpecialCourtesies <em>Special Courtesy</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getSpecialArrangements <em>Special Arrangement</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getDischargeDisposition <em>Discharge Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getDischargeDiagnosis <em>Discharge Diagnosis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounterHospitalization()
 * @model
 * @generated
 */
public interface EncounterHospitalization extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Pre Admission Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Admission Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Admission Identifier</em>' reference.
	 * @see #setPreAdmissionIdentifier(Identifier)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounterHospitalization_PreAdmissionIdentifier()
	 * @model
	 * @generated
	 */
	Identifier getPreAdmissionIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getPreAdmissionIdentifier <em>Pre Admission Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Admission Identifier</em>' reference.
	 * @see #getPreAdmissionIdentifier()
	 * @generated
	 */
	void setPreAdmissionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Location)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounterHospitalization_Origin()
	 * @model
	 * @generated
	 */
	Location getOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Location value);

	/**
	 * Returns the value of the '<em><b>Admit Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admit Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admit Source</em>' reference.
	 * @see #setAdmitSource(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounterHospitalization_AdmitSource()
	 * @model
	 * @generated
	 */
	CodeableConcept getAdmitSource();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getAdmitSource <em>Admit Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admit Source</em>' reference.
	 * @see #getAdmitSource()
	 * @generated
	 */
	void setAdmitSource(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Admitting Diagnosis</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admitting Diagnosis</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admitting Diagnosis</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounterHospitalization_AdmittingDiagnosis()
	 * @model
	 * @generated
	 */
	EList<Condition> getAdmittingDiagnosis();

	/**
	 * Returns the value of the '<em><b>Re Admission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Re Admission</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Re Admission</em>' reference.
	 * @see #setReAdmission(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounterHospitalization_ReAdmission()
	 * @model
	 * @generated
	 */
	CodeableConcept getReAdmission();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getReAdmission <em>Re Admission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Re Admission</em>' reference.
	 * @see #getReAdmission()
	 * @generated
	 */
	void setReAdmission(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Diet Preference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diet Preference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diet Preference</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounterHospitalization_DietPreference()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getDietPreferences();

	/**
	 * Returns the value of the '<em><b>Special Courtesy</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Courtesy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Courtesy</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounterHospitalization_SpecialCourtesy()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getSpecialCourtesies();

	/**
	 * Returns the value of the '<em><b>Special Arrangement</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Arrangement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Arrangement</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounterHospitalization_SpecialArrangement()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getSpecialArrangements();

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Location)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounterHospitalization_Destination()
	 * @model
	 * @generated
	 */
	Location getDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Location value);

	/**
	 * Returns the value of the '<em><b>Discharge Disposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discharge Disposition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discharge Disposition</em>' reference.
	 * @see #setDischargeDisposition(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounterHospitalization_DischargeDisposition()
	 * @model
	 * @generated
	 */
	CodeableConcept getDischargeDisposition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EncounterHospitalization#getDischargeDisposition <em>Discharge Disposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discharge Disposition</em>' reference.
	 * @see #getDischargeDisposition()
	 * @generated
	 */
	void setDischargeDisposition(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Discharge Diagnosis</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discharge Diagnosis</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discharge Diagnosis</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEncounterHospitalization_DischargeDiagnosis()
	 * @model
	 * @generated
	 */
	EList<Condition> getDischargeDiagnosis();

} // EncounterHospitalization
