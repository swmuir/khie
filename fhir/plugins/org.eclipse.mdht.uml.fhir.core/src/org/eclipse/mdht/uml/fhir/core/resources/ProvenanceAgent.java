/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ProvenanceAgent#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ProvenanceAgent#getWhox <em>Whox</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ProvenanceAgent#getOnBehalfOfx <em>On Behalf Ofx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ProvenanceAgent#getRelatedAgentType <em>Related Agent Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getProvenanceAgent()
 * @model
 * @generated
 */
public interface ProvenanceAgent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getProvenanceAgent_Role()
	 * @model required="true"
	 * @generated
	 */
	Coding getRole();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ProvenanceAgent#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Coding value);

	/**
	 * Returns the value of the '<em><b>Whox</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whox</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whox</em>' reference.
	 * @see #setWhox(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getProvenanceAgent_Whox()
	 * @model required="true"
	 * @generated
	 */
	Base getWhox();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ProvenanceAgent#getWhox <em>Whox</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whox</em>' reference.
	 * @see #getWhox()
	 * @generated
	 */
	void setWhox(Base value);

	/**
	 * Returns the value of the '<em><b>On Behalf Ofx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Behalf Ofx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Behalf Ofx</em>' reference.
	 * @see #setOnBehalfOfx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getProvenanceAgent_OnBehalfOfx()
	 * @model
	 * @generated
	 */
	Base getOnBehalfOfx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ProvenanceAgent#getOnBehalfOfx <em>On Behalf Ofx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Ofx</em>' reference.
	 * @see #getOnBehalfOfx()
	 * @generated
	 */
	void setOnBehalfOfx(Base value);

	/**
	 * Returns the value of the '<em><b>Related Agent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Agent Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Agent Type</em>' reference.
	 * @see #setRelatedAgentType(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getProvenanceAgent_RelatedAgentType()
	 * @model
	 * @generated
	 */
	CodeableConcept getRelatedAgentType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ProvenanceAgent#getRelatedAgentType <em>Related Agent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Agent Type</em>' reference.
	 * @see #getRelatedAgentType()
	 * @generated
	 */
	void setRelatedAgentType(CodeableConcept value);

} // ProvenanceAgent
