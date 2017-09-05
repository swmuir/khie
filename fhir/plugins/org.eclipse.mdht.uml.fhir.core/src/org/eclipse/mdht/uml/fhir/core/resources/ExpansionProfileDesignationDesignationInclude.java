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
 * A representation of the model object '<em><b>Expansion Profile Designation Designation Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileDesignationDesignationInclude#getDesignations <em>Designation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExpansionProfileDesignationDesignationInclude()
 * @model
 * @generated
 */
public interface ExpansionProfileDesignationDesignationInclude extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExpansionProfileDesignationDesignationInclude_Designation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation> getDesignations();

} // ExpansionProfileDesignationDesignationInclude
