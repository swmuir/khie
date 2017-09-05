/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getAltId <em>Alt Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getPolicies <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getMedia <em>Media</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getPurposeOfUses <em>Purpose Of Use</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAuditEventAgent()
 * @model
 * @generated
 */
public interface AuditEventAgent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAuditEventAgent_Role()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getRoles();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAuditEventAgent_Reference()
	 * @model
	 * @generated
	 */
	Resource getReference();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Resource value);

	/**
	 * Returns the value of the '<em><b>User Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' reference.
	 * @see #setUserId(Identifier)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAuditEventAgent_UserId()
	 * @model
	 * @generated
	 */
	Identifier getUserId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getUserId <em>User Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' reference.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(Identifier value);

	/**
	 * Returns the value of the '<em><b>Alt Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Id</em>' reference.
	 * @see #setAltId(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAuditEventAgent_AltId()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getAltId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getAltId <em>Alt Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Id</em>' reference.
	 * @see #getAltId()
	 * @generated
	 */
	void setAltId(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAuditEventAgent_Name()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Requestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requestor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requestor</em>' reference.
	 * @see #setRequestor(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAuditEventAgent_Requestor()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getRequestor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getRequestor <em>Requestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requestor</em>' reference.
	 * @see #getRequestor()
	 * @generated
	 */
	void setRequestor(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAuditEventAgent_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAuditEventAgent_Policy()
	 * @model
	 * @generated
	 */
	EList<Uri> getPolicies();

	/**
	 * Returns the value of the '<em><b>Media</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' reference.
	 * @see #setMedia(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAuditEventAgent_Media()
	 * @model
	 * @generated
	 */
	Coding getMedia();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getMedia <em>Media</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media</em>' reference.
	 * @see #getMedia()
	 * @generated
	 */
	void setMedia(Coding value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(AuditEventAgentNetwork)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAuditEventAgent_Network()
	 * @model containment="true"
	 * @generated
	 */
	AuditEventAgentNetwork getNetwork();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(AuditEventAgentNetwork value);

	/**
	 * Returns the value of the '<em><b>Purpose Of Use</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose Of Use</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose Of Use</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAuditEventAgent_PurposeOfUse()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getPurposeOfUses();

} // AuditEventAgent
