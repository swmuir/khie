/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes;

import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Range#getLow <em>Low</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Range#getHigh <em>High</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends DataType {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' reference.
	 * @see #setLow(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getRange_Low()
	 * @model
	 * @generated
	 */
	SimpleQuantity getLow();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Range#getLow <em>Low</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' reference.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' reference.
	 * @see #setHigh(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getRange_High()
	 * @model
	 * @generated
	 */
	SimpleQuantity getHigh();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Range#getHigh <em>High</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' reference.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(SimpleQuantity value);

} // Range
