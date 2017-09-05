/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Compose Concept Set Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ValueSetComposeConceptSetFilter#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ValueSetComposeConceptSetFilter#getOp <em>Op</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ValueSetComposeConceptSetFilter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getValueSetComposeConceptSetFilter()
 * @model
 * @generated
 */
public interface ValueSetComposeConceptSetFilter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getValueSetComposeConceptSetFilter_Property()
	 * @model required="true"
	 * @generated
	 */
	Code getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ValueSetComposeConceptSetFilter#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Code value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' reference.
	 * @see #setOp(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getValueSetComposeConceptSetFilter_Op()
	 * @model required="true"
	 * @generated
	 */
	Code getOp();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ValueSetComposeConceptSetFilter#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Code value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getValueSetComposeConceptSetFilter_Value()
	 * @model required="true"
	 * @generated
	 */
	Code getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ValueSetComposeConceptSetFilter#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Code value);

} // ValueSetComposeConceptSetFilter
