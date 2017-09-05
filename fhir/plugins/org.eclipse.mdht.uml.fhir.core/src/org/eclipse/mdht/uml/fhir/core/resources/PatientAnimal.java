/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Animal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.PatientAnimal#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.PatientAnimal#getBreed <em>Breed</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.PatientAnimal#getGenderStatus <em>Gender Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getPatientAnimal()
 * @model
 * @generated
 */
public interface PatientAnimal extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Species</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' reference.
	 * @see #setSpecies(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getPatientAnimal_Species()
	 * @model required="true"
	 * @generated
	 */
	CodeableConcept getSpecies();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.PatientAnimal#getSpecies <em>Species</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' reference.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Breed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breed</em>' reference.
	 * @see #setBreed(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getPatientAnimal_Breed()
	 * @model
	 * @generated
	 */
	CodeableConcept getBreed();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.PatientAnimal#getBreed <em>Breed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breed</em>' reference.
	 * @see #getBreed()
	 * @generated
	 */
	void setBreed(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Gender Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender Status</em>' reference.
	 * @see #setGenderStatus(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getPatientAnimal_GenderStatus()
	 * @model
	 * @generated
	 */
	CodeableConcept getGenderStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.PatientAnimal#getGenderStatus <em>Gender Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender Status</em>' reference.
	 * @see #getGenderStatus()
	 * @generated
	 */
	void setGenderStatus(CodeableConcept value);

} // PatientAnimal
