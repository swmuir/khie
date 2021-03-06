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

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Ratio;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Product Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationProductIngredient#getItem <em>Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationProductIngredient#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationProductIngredient()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Product_Ingredient'"
 * @generated
 */
public interface MedicationProductIngredient extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationProductIngredient_Item()
	 * @model required="true"
	 * @generated
	 */
	Resource getItem();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationProductIngredient#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Resource value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationProductIngredient_Amount()
	 * @model
	 * @generated
	 */
	Ratio getAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationProductIngredient#getAmount <em>Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Ratio value);

} // MedicationProductIngredient
