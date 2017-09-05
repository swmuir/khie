/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Item Prosthesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ClaimItemProsthesis#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ClaimItemProsthesis#getPriorDate <em>Prior Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ClaimItemProsthesis#getPriorMaterial <em>Prior Material</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getClaimItemProsthesis()
 * @model
 * @generated
 */
public interface ClaimItemProsthesis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getClaimItemProsthesis_Initial()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getInitial();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ClaimItemProsthesis#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Prior Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Date</em>' reference.
	 * @see #setPriorDate(Date)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getClaimItemProsthesis_PriorDate()
	 * @model
	 * @generated
	 */
	Date getPriorDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ClaimItemProsthesis#getPriorDate <em>Prior Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior Date</em>' reference.
	 * @see #getPriorDate()
	 * @generated
	 */
	void setPriorDate(Date value);

	/**
	 * Returns the value of the '<em><b>Prior Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Material</em>' reference.
	 * @see #setPriorMaterial(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getClaimItemProsthesis_PriorMaterial()
	 * @model
	 * @generated
	 */
	CodeableConcept getPriorMaterial();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ClaimItemProsthesis#getPriorMaterial <em>Prior Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior Material</em>' reference.
	 * @see #getPriorMaterial()
	 * @generated
	 */
	void setPriorMaterial(CodeableConcept value);

} // ClaimItemProsthesis
