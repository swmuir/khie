/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map Group Source Element Target Element Other Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getSystem <em>System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElementOtherElement()
 * @model
 * @generated
 */
public interface ConceptMapGroupSourceElementTargetElementOtherElement extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElementOtherElement_Property()
	 * @model required="true"
	 * @generated
	 */
	Uri getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Uri value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElementOtherElement_System()
	 * @model
	 * @generated
	 */
	Uri getSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Uri value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' reference.
	 * @see #setCode(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElementOtherElement_Code()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getCode <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

} // ConceptMapGroupSourceElementTargetElementOtherElement
