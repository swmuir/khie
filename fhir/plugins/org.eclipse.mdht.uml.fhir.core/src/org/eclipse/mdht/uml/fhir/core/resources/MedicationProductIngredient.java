/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Ratio;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Product Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationProductIngredient#getItemx <em>Itemx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationProductIngredient#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationProductIngredient()
 * @model
 * @generated
 */
public interface MedicationProductIngredient extends BackboneElement {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationProductIngredient_Itemx()
	 * @model required="true"
	 * @generated
	 */
	Base getItemx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationProductIngredient#getItemx <em>Itemx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemx</em>' reference.
	 * @see #getItemx()
	 * @generated
	 */
	void setItemx(Base value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' reference.
	 * @see #setAmount(Ratio)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationProductIngredient_Amount()
	 * @model
	 * @generated
	 */
	Ratio getAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationProductIngredient#getAmount <em>Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Ratio value);

} // MedicationProductIngredient
