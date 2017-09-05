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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.Questionnaire;
import org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireResponse;
import org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireResponseItem;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseImpl#getParents <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseImpl#getAuthored <em>Authored</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireResponseImpl#getItems <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireResponseImpl extends DomainResourceImpl implements QuestionnaireResponse {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getBasedOns() <em>Based On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOns()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> basedOns;

	/**
	 * The cached value of the '{@link #getParents() <em>Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> parents;

	/**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
	protected Questionnaire questionnaire;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Resource context;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Resource author;

	/**
	 * The cached value of the '{@link #getAuthored() <em>Authored</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthored()
	 * @generated
	 * @ordered
	 */
	protected DateTime authored;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Resource source;

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
	protected QuestionnaireResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getQuestionnaireResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.QUESTIONNAIRE_RESPONSE__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getParents() {
		if (parents == null) {
			parents = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.QUESTIONNAIRE_RESPONSE__PARENT);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire getQuestionnaire() {
		if (questionnaire != null && questionnaire.eIsProxy()) {
			InternalEObject oldQuestionnaire = (InternalEObject)questionnaire;
			questionnaire = (Questionnaire)eResolveProxy(oldQuestionnaire);
			if (questionnaire != oldQuestionnaire) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, oldQuestionnaire, questionnaire));
			}
		}
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire basicGetQuestionnaire() {
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionnaire(Questionnaire newQuestionnaire) {
		Questionnaire oldQuestionnaire = questionnaire;
		questionnaire = newQuestionnaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, oldQuestionnaire, questionnaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Resource)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_RESPONSE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Resource newContext) {
		Resource oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (Resource)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Resource newAuthor) {
		Resource oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getAuthored() {
		if (authored != null && authored.eIsProxy()) {
			InternalEObject oldAuthored = (InternalEObject)authored;
			authored = (DateTime)eResolveProxy(oldAuthored);
			if (authored != oldAuthored) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED, oldAuthored, authored));
			}
		}
		return authored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetAuthored() {
		return authored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthored(DateTime newAuthored) {
		DateTime oldAuthored = authored;
		authored = newAuthored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED, oldAuthored, authored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Resource)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Resource newSource) {
		Resource oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireResponseItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<QuestionnaireResponseItem>(QuestionnaireResponseItem.class, this, ResourcesPackage.QUESTIONNAIRE_RESPONSE__ITEM);
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ITEM:
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__PARENT:
				return getParents();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				if (resolve) return getQuestionnaire();
				return basicGetQuestionnaire();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				if (resolve) return getAuthored();
				return basicGetAuthored();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ITEM:
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__PARENT:
				getParents().clear();
				getParents().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__CONTEXT:
				setContext((Resource)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				setAuthor((Resource)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				setAuthored((DateTime)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				setSource((Resource)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ITEM:
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__PARENT:
				getParents().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__CONTEXT:
				setContext((Resource)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				setAuthor((Resource)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				setAuthored((DateTime)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				setSource((Resource)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ITEM:
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__PARENT:
				return parents != null && !parents.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				return questionnaire != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				return status != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				return subject != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__CONTEXT:
				return context != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				return author != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				return authored != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				return source != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ITEM:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireResponseImpl
