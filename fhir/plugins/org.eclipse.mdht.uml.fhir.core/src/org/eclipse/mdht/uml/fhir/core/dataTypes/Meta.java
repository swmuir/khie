/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getVersionId <em>Version Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getProfiles <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getSecurities <em>Security</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getTags <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getMeta()
 * @model
 * @generated
 */
public interface Meta extends DataType {
	/**
	 * Returns the value of the '<em><b>Version Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Id</em>' reference.
	 * @see #setVersionId(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getMeta_VersionId()
	 * @model
	 * @generated
	 */
	Id getVersionId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getVersionId <em>Version Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Id</em>' reference.
	 * @see #getVersionId()
	 * @generated
	 */
	void setVersionId(Id value);

	/**
	 * Returns the value of the '<em><b>Last Updated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Updated</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Updated</em>' reference.
	 * @see #setLastUpdated(Instant)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getMeta_LastUpdated()
	 * @model
	 * @generated
	 */
	Instant getLastUpdated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getLastUpdated <em>Last Updated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated</em>' reference.
	 * @see #getLastUpdated()
	 * @generated
	 */
	void setLastUpdated(Instant value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getMeta_Profile()
	 * @model
	 * @generated
	 */
	EList<Uri> getProfiles();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getMeta_Security()
	 * @model
	 * @generated
	 */
	EList<Coding> getSecurities();

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getMeta_Tag()
	 * @model
	 * @generated
	 */
	EList<Coding> getTags();

} // Meta
