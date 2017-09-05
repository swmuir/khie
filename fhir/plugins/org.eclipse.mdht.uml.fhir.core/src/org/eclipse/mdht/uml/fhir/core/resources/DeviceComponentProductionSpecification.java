/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Component Production Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceComponentProductionSpecification#getSpecType <em>Spec Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceComponentProductionSpecification#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceComponentProductionSpecification#getProductionSpec <em>Production Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceComponentProductionSpecification()
 * @model
 * @generated
 */
public interface DeviceComponentProductionSpecification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Spec Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Type</em>' reference.
	 * @see #setSpecType(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceComponentProductionSpecification_SpecType()
	 * @model
	 * @generated
	 */
	CodeableConcept getSpecType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceComponentProductionSpecification#getSpecType <em>Spec Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Type</em>' reference.
	 * @see #getSpecType()
	 * @generated
	 */
	void setSpecType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Id</em>' reference.
	 * @see #setComponentId(Identifier)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceComponentProductionSpecification_ComponentId()
	 * @model
	 * @generated
	 */
	Identifier getComponentId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceComponentProductionSpecification#getComponentId <em>Component Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' reference.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(Identifier value);

	/**
	 * Returns the value of the '<em><b>Production Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production Spec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Spec</em>' reference.
	 * @see #setProductionSpec(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDeviceComponentProductionSpecification_ProductionSpec()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getProductionSpec();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DeviceComponentProductionSpecification#getProductionSpec <em>Production Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Spec</em>' reference.
	 * @see #getProductionSpec()
	 * @generated
	 */
	void setProductionSpec(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

} // DeviceComponentProductionSpecification
