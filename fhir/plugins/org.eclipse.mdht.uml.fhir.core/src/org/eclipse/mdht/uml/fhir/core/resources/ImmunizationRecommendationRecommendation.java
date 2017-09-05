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
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Recommendation Recommendation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation#getVaccineCode <em>Vaccine Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation#getDoseNumber <em>Dose Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation#getForecastStatus <em>Forecast Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation#getDateCriterions <em>Date Criterion</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation#getSupportingImmunizations <em>Supporting Immunization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation#getSupportingPatientInformations <em>Supporting Patient Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendation()
 * @model
 * @generated
 */
public interface ImmunizationRecommendationRecommendation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' reference.
	 * @see #setDate(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_Date()
	 * @model required="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation#getDate <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Vaccine Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaccine Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaccine Code</em>' reference.
	 * @see #setVaccineCode(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_VaccineCode()
	 * @model required="true"
	 * @generated
	 */
	CodeableConcept getVaccineCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation#getVaccineCode <em>Vaccine Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaccine Code</em>' reference.
	 * @see #getVaccineCode()
	 * @generated
	 */
	void setVaccineCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Number</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Number</em>' reference.
	 * @see #setDoseNumber(PositiveInt)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_DoseNumber()
	 * @model
	 * @generated
	 */
	PositiveInt getDoseNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation#getDoseNumber <em>Dose Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Number</em>' reference.
	 * @see #getDoseNumber()
	 * @generated
	 */
	void setDoseNumber(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Forecast Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forecast Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast Status</em>' reference.
	 * @see #setForecastStatus(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_ForecastStatus()
	 * @model required="true"
	 * @generated
	 */
	CodeableConcept getForecastStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation#getForecastStatus <em>Forecast Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast Status</em>' reference.
	 * @see #getForecastStatus()
	 * @generated
	 */
	void setForecastStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendationDateCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Criterion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Criterion</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_DateCriterion()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImmunizationRecommendationRecommendationDateCriterion> getDateCriterions();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(ImmunizationRecommendationRecommendationProtocol)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_Protocol()
	 * @model containment="true"
	 * @generated
	 */
	ImmunizationRecommendationRecommendationProtocol getProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ImmunizationRecommendationRecommendationProtocol value);

	/**
	 * Returns the value of the '<em><b>Supporting Immunization</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Immunization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Immunization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Immunization</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_SupportingImmunization()
	 * @model
	 * @generated
	 */
	EList<Immunization> getSupportingImmunizations();

	/**
	 * Returns the value of the '<em><b>Supporting Patient Information</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Patient Information</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Patient Information</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_SupportingPatientInformation()
	 * @model
	 * @generated
	 */
	EList<Resource> getSupportingPatientInformations();

} // ImmunizationRecommendationRecommendation
