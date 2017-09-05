/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.OperationDefinitionParameterBinding#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.OperationDefinitionParameterBinding#getValueSetx <em>Value Setx</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getOperationDefinitionParameterBinding()
 * @model
 * @generated
 */
public interface OperationDefinitionParameterBinding extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Strength</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strength</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' reference.
	 * @see #setStrength(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getOperationDefinitionParameterBinding_Strength()
	 * @model required="true"
	 * @generated
	 */
	Code getStrength();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.OperationDefinitionParameterBinding#getStrength <em>Strength</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(Code value);

	/**
	 * Returns the value of the '<em><b>Value Setx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Setx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Setx</em>' reference.
	 * @see #setValueSetx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getOperationDefinitionParameterBinding_ValueSetx()
	 * @model required="true"
	 * @generated
	 */
	Base getValueSetx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.OperationDefinitionParameterBinding#getValueSetx <em>Value Setx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Setx</em>' reference.
	 * @see #getValueSetx()
	 * @generated
	 */
	void setValueSetx(Base value);

} // OperationDefinitionParameterBinding
