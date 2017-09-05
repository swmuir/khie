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
 * A representation of the model object '<em><b>Questionnaire Item Enable When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireItemEnableWhen#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireItemEnableWhen#getHasAnswer <em>Has Answer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireItemEnableWhen#getAnswerx <em>Answerx</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getQuestionnaireItemEnableWhen()
 * @model
 * @generated
 */
public interface QuestionnaireItemEnableWhen extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' reference.
	 * @see #setQuestion(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getQuestionnaireItemEnableWhen_Question()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getQuestion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireItemEnableWhen#getQuestion <em>Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Has Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Answer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Answer</em>' reference.
	 * @see #setHasAnswer(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getQuestionnaireItemEnableWhen_HasAnswer()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getHasAnswer();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireItemEnableWhen#getHasAnswer <em>Has Answer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Answer</em>' reference.
	 * @see #getHasAnswer()
	 * @generated
	 */
	void setHasAnswer(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Answerx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answerx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answerx</em>' reference.
	 * @see #setAnswerx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getQuestionnaireItemEnableWhen_Answerx()
	 * @model
	 * @generated
	 */
	Base getAnswerx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireItemEnableWhen#getAnswerx <em>Answerx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answerx</em>' reference.
	 * @see #getAnswerx()
	 * @generated
	 */
	void setAnswerx(Base value);

} // QuestionnaireItemEnableWhen
