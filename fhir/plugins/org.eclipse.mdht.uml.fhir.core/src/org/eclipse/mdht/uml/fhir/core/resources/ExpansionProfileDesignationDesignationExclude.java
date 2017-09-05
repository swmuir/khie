/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Profile Designation Designation Exclude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileDesignationDesignationExclude#getDesignations <em>Designation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExpansionProfileDesignationDesignationExclude()
 * @model
 * @generated
 */
public interface ExpansionProfileDesignationDesignationExclude extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExpansionProfileDesignationDesignationExclude_Designation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation> getDesignations();

} // ExpansionProfileDesignationDesignationExclude
