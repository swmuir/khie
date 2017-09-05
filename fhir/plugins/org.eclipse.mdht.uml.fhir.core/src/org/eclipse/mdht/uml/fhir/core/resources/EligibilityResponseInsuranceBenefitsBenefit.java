/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eligibility Response Insurance Benefits Benefit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseInsuranceBenefitsBenefit#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseInsuranceBenefitsBenefit#getBenefitx <em>Benefitx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseInsuranceBenefitsBenefit#getBenefitUsedx <em>Benefit Usedx</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponseInsuranceBenefitsBenefit()
 * @model
 * @generated
 */
public interface EligibilityResponseInsuranceBenefitsBenefit extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponseInsuranceBenefitsBenefit_Type()
	 * @model required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseInsuranceBenefitsBenefit#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Benefitx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefitx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefitx</em>' reference.
	 * @see #setBenefitx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponseInsuranceBenefitsBenefit_Benefitx()
	 * @model
	 * @generated
	 */
	DataType getBenefitx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseInsuranceBenefitsBenefit#getBenefitx <em>Benefitx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefitx</em>' reference.
	 * @see #getBenefitx()
	 * @generated
	 */
	void setBenefitx(DataType value);

	/**
	 * Returns the value of the '<em><b>Benefit Usedx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Usedx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Usedx</em>' reference.
	 * @see #setBenefitUsedx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponseInsuranceBenefitsBenefit_BenefitUsedx()
	 * @model
	 * @generated
	 */
	DataType getBenefitUsedx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseInsuranceBenefitsBenefit#getBenefitUsedx <em>Benefit Usedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Usedx</em>' reference.
	 * @see #getBenefitUsedx()
	 * @generated
	 */
	void setBenefitUsedx(DataType value);

} // EligibilityResponseInsuranceBenefitsBenefit
