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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Response Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseItem#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseItem#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseItem#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseItem#getAnswers <em>Answer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseItem#getItems <em>Item</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireResponseItem()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='QuestionnaireResponse_Item'"
 * @generated
 */
public interface QuestionnaireResponseItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Id</em>' reference.
	 * @see #setLinkId(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireResponseItem_LinkId()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getLinkId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseItem#getLinkId <em>Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireResponseItem_Text()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseItem#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireResponseItem_Subject()
	 * @model
	 * @generated
	 */
	Resource getSubject();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseItem#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Resource value);

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseItemAnswer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireResponseItem_Answer()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionnaireResponseItemAnswer> getAnswers();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireResponseItem_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionnaireResponseItem> getItems();

} // QuestionnaireResponseItem
