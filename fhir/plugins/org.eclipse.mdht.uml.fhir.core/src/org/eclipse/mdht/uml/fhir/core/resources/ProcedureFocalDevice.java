/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Focal Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ProcedureFocalDevice#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ProcedureFocalDevice#getManipulated <em>Manipulated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getProcedureFocalDevice()
 * @model
 * @generated
 */
public interface ProcedureFocalDevice extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getProcedureFocalDevice_Action()
	 * @model
	 * @generated
	 */
	CodeableConcept getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ProcedureFocalDevice#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Manipulated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manipulated</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manipulated</em>' reference.
	 * @see #setManipulated(Device)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getProcedureFocalDevice_Manipulated()
	 * @model required="true"
	 * @generated
	 */
	Device getManipulated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ProcedureFocalDevice#getManipulated <em>Manipulated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manipulated</em>' reference.
	 * @see #getManipulated()
	 * @generated
	 */
	void setManipulated(Device value);

} // ProcedureFocalDevice
