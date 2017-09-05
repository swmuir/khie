/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Requester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TaskRequester#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TaskRequester#getOnBehalfOf <em>On Behalf Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTaskRequester()
 * @model
 * @generated
 */
public interface TaskRequester extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTaskRequester_Agent()
	 * @model required="true"
	 * @generated
	 */
	Resource getAgent();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TaskRequester#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Resource value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Behalf Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Behalf Of</em>' reference.
	 * @see #setOnBehalfOf(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTaskRequester_OnBehalfOf()
	 * @model
	 * @generated
	 */
	Organization getOnBehalfOf();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TaskRequester#getOnBehalfOf <em>On Behalf Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of</em>' reference.
	 * @see #getOnBehalfOf()
	 * @generated
	 */
	void setOnBehalfOf(Organization value);

} // TaskRequester
