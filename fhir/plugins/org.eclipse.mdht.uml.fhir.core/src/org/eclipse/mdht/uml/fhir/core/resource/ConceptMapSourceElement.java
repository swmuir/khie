/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map Source Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConceptMapSourceElement#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConceptMapSourceElement#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConceptMapSourceElement#getTargets <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConceptMapSourceElement()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConceptMap_SourceElement'"
 * @generated
 */
public interface ConceptMapSourceElement extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code System</em>' reference.
	 * @see #setCodeSystem(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConceptMapSourceElement_CodeSystem()
	 * @model
	 * @generated
	 */
	Uri getCodeSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ConceptMapSourceElement#getCodeSystem <em>Code System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System</em>' reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(Uri value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' reference.
	 * @see #setCode(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConceptMapSourceElement_Code()
	 * @model
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ConceptMapSourceElement#getCode <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ConceptMapSourceElementTargetElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConceptMapSourceElement_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConceptMapSourceElementTargetElement> getTargets();

} // ConceptMapSourceElement
