/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Recommendation Recommendation Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendationProtocol#getDoseSequence <em>Dose Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendationProtocol#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendationProtocol#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendationProtocol#getSeries <em>Series</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendationProtocol()
 * @model
 * @generated
 */
public interface ImmunizationRecommendationRecommendationProtocol extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Dose Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Sequence</em>' reference.
	 * @see #setDoseSequence(PositiveInt)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendationProtocol_DoseSequence()
	 * @model
	 * @generated
	 */
	PositiveInt getDoseSequence();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendationProtocol#getDoseSequence <em>Dose Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Sequence</em>' reference.
	 * @see #getDoseSequence()
	 * @generated
	 */
	void setDoseSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendationProtocol_Description()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendationProtocol#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Authority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority</em>' reference.
	 * @see #setAuthority(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendationProtocol_Authority()
	 * @model
	 * @generated
	 */
	Organization getAuthority();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendationProtocol#getAuthority <em>Authority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' reference.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(Organization value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' reference.
	 * @see #setSeries(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getImmunizationRecommendationRecommendationProtocol_Series()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getSeries();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendationProtocol#getSeries <em>Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

} // ImmunizationRecommendationRecommendationProtocol
