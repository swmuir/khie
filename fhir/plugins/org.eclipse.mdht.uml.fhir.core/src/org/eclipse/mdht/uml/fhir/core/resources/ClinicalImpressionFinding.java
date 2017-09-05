/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Impression Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ClinicalImpressionFinding#getItemx <em>Itemx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ClinicalImpressionFinding#getBasis <em>Basis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getClinicalImpressionFinding()
 * @model
 * @generated
 */
public interface ClinicalImpressionFinding extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Itemx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemx</em>' reference.
	 * @see #setItemx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getClinicalImpressionFinding_Itemx()
	 * @model required="true"
	 * @generated
	 */
	Base getItemx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ClinicalImpressionFinding#getItemx <em>Itemx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemx</em>' reference.
	 * @see #getItemx()
	 * @generated
	 */
	void setItemx(Base value);

	/**
	 * Returns the value of the '<em><b>Basis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis</em>' reference.
	 * @see #setBasis(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getClinicalImpressionFinding_Basis()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getBasis();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ClinicalImpressionFinding#getBasis <em>Basis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis</em>' reference.
	 * @see #getBasis()
	 * @generated
	 */
	void setBasis(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

} // ClinicalImpressionFinding
