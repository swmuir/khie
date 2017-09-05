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
 * A representation of the model object '<em><b>Expansion Profile Designation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileDesignation#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileDesignation#getExclude <em>Exclude</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExpansionProfileDesignation()
 * @model
 * @generated
 */
public interface ExpansionProfileDesignation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference.
	 * @see #setInclude(ExpansionProfileDesignationDesignationInclude)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExpansionProfileDesignation_Include()
	 * @model containment="true"
	 * @generated
	 */
	ExpansionProfileDesignationDesignationInclude getInclude();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileDesignation#getInclude <em>Include</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' containment reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(ExpansionProfileDesignationDesignationInclude value);

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference.
	 * @see #setExclude(ExpansionProfileDesignationDesignationExclude)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExpansionProfileDesignation_Exclude()
	 * @model containment="true"
	 * @generated
	 */
	ExpansionProfileDesignationDesignationExclude getExclude();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileDesignation#getExclude <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' containment reference.
	 * @see #getExclude()
	 * @generated
	 */
	void setExclude(ExpansionProfileDesignationDesignationExclude value);

} // ExpansionProfileDesignation
