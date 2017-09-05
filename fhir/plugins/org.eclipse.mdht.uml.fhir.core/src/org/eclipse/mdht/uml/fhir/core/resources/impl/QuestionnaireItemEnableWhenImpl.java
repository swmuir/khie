/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireItemEnableWhen;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Item Enable When</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemEnableWhenImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemEnableWhenImpl#getHasAnswer <em>Has Answer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemEnableWhenImpl#getAnswerx <em>Answerx</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireItemEnableWhenImpl extends BackboneElementImpl implements QuestionnaireItemEnableWhen {
	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String question;

	/**
	 * The cached value of the '{@link #getHasAnswer() <em>Has Answer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAnswer()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean hasAnswer;

	/**
	 * The cached value of the '{@link #getAnswerx() <em>Answerx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerx()
	 * @generated
	 * @ordered
	 */
	protected Base answerx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireItemEnableWhenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getQuestionnaireItemEnableWhen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getQuestion() {
		if (question != null && question.eIsProxy()) {
			InternalEObject oldQuestion = (InternalEObject)question;
			question = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldQuestion);
			if (question != oldQuestion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION, oldQuestion, question));
			}
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(org.eclipse.mdht.uml.fhir.core.dataTypes.String newQuestion) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getHasAnswer() {
		if (hasAnswer != null && hasAnswer.eIsProxy()) {
			InternalEObject oldHasAnswer = (InternalEObject)hasAnswer;
			hasAnswer = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldHasAnswer);
			if (hasAnswer != oldHasAnswer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__HAS_ANSWER, oldHasAnswer, hasAnswer));
			}
		}
		return hasAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetHasAnswer() {
		return hasAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAnswer(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newHasAnswer) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldHasAnswer = hasAnswer;
		hasAnswer = newHasAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__HAS_ANSWER, oldHasAnswer, hasAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getAnswerx() {
		if (answerx != null && answerx.eIsProxy()) {
			InternalEObject oldAnswerx = (InternalEObject)answerx;
			answerx = (Base)eResolveProxy(oldAnswerx);
			if (answerx != oldAnswerx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX, oldAnswerx, answerx));
			}
		}
		return answerx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetAnswerx() {
		return answerx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerx(Base newAnswerx) {
		Base oldAnswerx = answerx;
		answerx = newAnswerx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX, oldAnswerx, answerx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION:
				if (resolve) return getQuestion();
				return basicGetQuestion();
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__HAS_ANSWER:
				if (resolve) return getHasAnswer();
				return basicGetHasAnswer();
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX:
				if (resolve) return getAnswerx();
				return basicGetAnswerx();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION:
				setQuestion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__HAS_ANSWER:
				setHasAnswer((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX:
				setAnswerx((Base)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION:
				setQuestion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__HAS_ANSWER:
				setHasAnswer((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX:
				setAnswerx((Base)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION:
				return question != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__HAS_ANSWER:
				return hasAnswer != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX:
				return answerx != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireItemEnableWhenImpl
