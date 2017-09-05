/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Markdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Definition Allowed Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MessageDefinitionAllowedResponse#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MessageDefinitionAllowedResponse#getSituation <em>Situation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMessageDefinitionAllowedResponse()
 * @model
 * @generated
 */
public interface MessageDefinitionAllowedResponse extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(MessageDefinition)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMessageDefinitionAllowedResponse_Message()
	 * @model required="true"
	 * @generated
	 */
	MessageDefinition getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MessageDefinitionAllowedResponse#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(MessageDefinition value);

	/**
	 * Returns the value of the '<em><b>Situation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation</em>' reference.
	 * @see #setSituation(Markdown)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMessageDefinitionAllowedResponse_Situation()
	 * @model
	 * @generated
	 */
	Markdown getSituation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MessageDefinitionAllowedResponse#getSituation <em>Situation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation</em>' reference.
	 * @see #getSituation()
	 * @generated
	 */
	void setSituation(Markdown value);

} // MessageDefinitionAllowedResponse
