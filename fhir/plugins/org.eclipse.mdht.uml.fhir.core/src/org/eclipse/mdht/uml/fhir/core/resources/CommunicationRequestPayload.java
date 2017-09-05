/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Request Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CommunicationRequestPayload#getContentx <em>Contentx</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCommunicationRequestPayload()
 * @model
 * @generated
 */
public interface CommunicationRequestPayload extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Contentx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contentx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contentx</em>' reference.
	 * @see #setContentx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCommunicationRequestPayload_Contentx()
	 * @model required="true"
	 * @generated
	 */
	Base getContentx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.CommunicationRequestPayload#getContentx <em>Contentx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contentx</em>' reference.
	 * @see #getContentx()
	 * @generated
	 */
	void setContentx(Base value);

} // CommunicationRequestPayload
