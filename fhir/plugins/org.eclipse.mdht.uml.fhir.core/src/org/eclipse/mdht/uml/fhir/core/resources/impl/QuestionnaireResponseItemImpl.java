/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireResponseItem;
import org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireResponseItemAnswer;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Response Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseItemImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseItemImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseItemImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseItemImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseItemImpl#getAnswers <em>Answer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseItemImpl#getItems <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireResponseItemImpl extends BackboneElementImpl implements QuestionnaireResponseItem {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String linkId;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Uri definition;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String text;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Resource subject;

	/**
	 * The cached value of the '{@link #getAnswers() <em>Answer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswers()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireResponseItemAnswer> answers;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireResponseItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireResponseItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getQuestionnaireResponseItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getLinkId() {
		if (linkId != null && linkId.eIsProxy()) {
			InternalEObject oldLinkId = (InternalEObject)linkId;
			linkId = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldLinkId);
			if (linkId != oldLinkId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID, oldLinkId, linkId));
			}
		}
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(org.eclipse.mdht.uml.fhir.core.dataTypes.String newLinkId) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID, oldLinkId, linkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (Uri)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Uri newDefinition) {
		Uri oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.eclipse.mdht.uml.fhir.core.dataTypes.String newText) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Resource)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Resource newSubject) {
		Resource oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireResponseItemAnswer> getAnswers() {
		if (answers == null) {
			answers = new EObjectContainmentEList<QuestionnaireResponseItemAnswer>(QuestionnaireResponseItemAnswer.class, this, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ANSWER);
		}
		return answers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireResponseItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<QuestionnaireResponseItem>(QuestionnaireResponseItem.class, this, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ANSWER:
				return ((InternalEList<?>)getAnswers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID:
				if (resolve) return getLinkId();
				return basicGetLinkId();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ANSWER:
				return getAnswers();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ITEM:
				return getItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID:
				setLinkId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION:
				setDefinition((Uri)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ANSWER:
				getAnswers().clear();
				getAnswers().addAll((Collection<? extends QuestionnaireResponseItemAnswer>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends QuestionnaireResponseItem>)newValue);
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID:
				setLinkId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION:
				setDefinition((Uri)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ANSWER:
				getAnswers().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ITEM:
				getItems().clear();
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID:
				return linkId != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION:
				return definition != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT:
				return text != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__SUBJECT:
				return subject != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ANSWER:
				return answers != null && !answers.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ITEM:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireResponseItemImpl
