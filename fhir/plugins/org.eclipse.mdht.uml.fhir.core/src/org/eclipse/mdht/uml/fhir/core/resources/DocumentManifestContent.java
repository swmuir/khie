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
 * A representation of the model object '<em><b>Document Manifest Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentManifestContent#getPx <em>Px</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDocumentManifestContent()
 * @model
 * @generated
 */
public interface DocumentManifestContent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Px</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Px</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Px</em>' reference.
	 * @see #setPx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getDocumentManifestContent_Px()
	 * @model required="true"
	 * @generated
	 */
	Base getPx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.DocumentManifestContent#getPx <em>Px</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Px</em>' reference.
	 * @see #getPx()
	 * @generated
	 */
	void setPx(Base value);

} // DocumentManifestContent
