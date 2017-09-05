/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Group Action Related Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.RequestGroupActionRelatedAction#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.RequestGroupActionRelatedAction#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.RequestGroupActionRelatedAction#getOffsetx <em>Offsetx</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getRequestGroupActionRelatedAction()
 * @model
 * @generated
 */
public interface RequestGroupActionRelatedAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Identifier</em>' reference.
	 * @see #setActionIdentifier(Identifier)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getRequestGroupActionRelatedAction_ActionIdentifier()
	 * @model required="true"
	 * @generated
	 */
	Identifier getActionIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.RequestGroupActionRelatedAction#getActionIdentifier <em>Action Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Identifier</em>' reference.
	 * @see #getActionIdentifier()
	 * @generated
	 */
	void setActionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference.
	 * @see #setRelationship(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getRequestGroupActionRelatedAction_Relationship()
	 * @model required="true"
	 * @generated
	 */
	Code getRelationship();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.RequestGroupActionRelatedAction#getRelationship <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Code value);

	/**
	 * Returns the value of the '<em><b>Offsetx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offsetx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offsetx</em>' reference.
	 * @see #setOffsetx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getRequestGroupActionRelatedAction_Offsetx()
	 * @model
	 * @generated
	 */
	DataType getOffsetx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.RequestGroupActionRelatedAction#getOffsetx <em>Offsetx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offsetx</em>' reference.
	 * @see #getOffsetx()
	 * @generated
	 */
	void setOffsetx(DataType value);

} // RequestGroupActionRelatedAction
