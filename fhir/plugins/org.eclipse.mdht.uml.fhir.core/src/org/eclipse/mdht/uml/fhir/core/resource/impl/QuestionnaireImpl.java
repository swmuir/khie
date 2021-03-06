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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

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

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Questionnaire;
import org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireImpl#getConcepts <em>Concept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireImpl#getSubjectTypes <em>Subject Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireImpl#getItems <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireImpl extends DomainResourceImpl implements Questionnaire {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String version;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String publisher;

	/**
	 * The cached value of the '{@link #getTelecoms() <em>Telecom</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecoms;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String title;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concept</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> concepts;

	/**
	 * The cached value of the '{@link #getSubjectTypes() <em>Subject Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> subjectTypes;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getQuestionnaire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.QUESTIONNAIRE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getVersion() {
		if (version != null && version.eIsProxy()) {
			InternalEObject oldVersion = (InternalEObject)version;
			version = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldVersion);
			if (version != oldVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE__VERSION, oldVersion, version));
			}
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.eclipse.mdht.uml.fhir.core.datatype.String newVersion) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE__VERSION, oldVersion, version));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		if (date != null && date.eIsProxy()) {
			InternalEObject oldDate = (InternalEObject)date;
			date = (DateTime)eResolveProxy(oldDate);
			if (date != oldDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE__DATE, oldDate, date));
			}
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject)publisher;
			publisher = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(org.eclipse.mdht.uml.fhir.core.datatype.String newPublisher) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectResolvingEList<ContactPoint>(ContactPoint.class, this, FhirResourcePackage.QUESTIONNAIRE__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.eclipse.mdht.uml.fhir.core.datatype.String newTitle) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.QUESTIONNAIRE__CONCEPT);
		}
		return concepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getSubjectTypes() {
		if (subjectTypes == null) {
			subjectTypes = new EObjectResolvingEList<Code>(Code.class, this, FhirResourcePackage.QUESTIONNAIRE__SUBJECT_TYPE);
		}
		return subjectTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<QuestionnaireItem>(QuestionnaireItem.class, this, FhirResourcePackage.QUESTIONNAIRE__ITEM);
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
			case FhirResourcePackage.QUESTIONNAIRE__ITEM:
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
			case FhirResourcePackage.QUESTIONNAIRE__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.QUESTIONNAIRE__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case FhirResourcePackage.QUESTIONNAIRE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.QUESTIONNAIRE__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case FhirResourcePackage.QUESTIONNAIRE__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case FhirResourcePackage.QUESTIONNAIRE__TELECOM:
				return getTelecoms();
			case FhirResourcePackage.QUESTIONNAIRE__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case FhirResourcePackage.QUESTIONNAIRE__CONCEPT:
				return getConcepts();
			case FhirResourcePackage.QUESTIONNAIRE__SUBJECT_TYPE:
				return getSubjectTypes();
			case FhirResourcePackage.QUESTIONNAIRE__ITEM:
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
			case FhirResourcePackage.QUESTIONNAIRE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__CONCEPT:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__SUBJECT_TYPE:
				getSubjectTypes().clear();
				getSubjectTypes().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends QuestionnaireItem>)newValue);
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
			case FhirResourcePackage.QUESTIONNAIRE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.QUESTIONNAIRE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__DATE:
				setDate((DateTime)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__TELECOM:
				getTelecoms().clear();
				return;
			case FhirResourcePackage.QUESTIONNAIRE__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE__CONCEPT:
				getConcepts().clear();
				return;
			case FhirResourcePackage.QUESTIONNAIRE__SUBJECT_TYPE:
				getSubjectTypes().clear();
				return;
			case FhirResourcePackage.QUESTIONNAIRE__ITEM:
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
			case FhirResourcePackage.QUESTIONNAIRE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.QUESTIONNAIRE__VERSION:
				return version != null;
			case FhirResourcePackage.QUESTIONNAIRE__STATUS:
				return status != null;
			case FhirResourcePackage.QUESTIONNAIRE__DATE:
				return date != null;
			case FhirResourcePackage.QUESTIONNAIRE__PUBLISHER:
				return publisher != null;
			case FhirResourcePackage.QUESTIONNAIRE__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case FhirResourcePackage.QUESTIONNAIRE__TITLE:
				return title != null;
			case FhirResourcePackage.QUESTIONNAIRE__CONCEPT:
				return concepts != null && !concepts.isEmpty();
			case FhirResourcePackage.QUESTIONNAIRE__SUBJECT_TYPE:
				return subjectTypes != null && !subjectTypes.isEmpty();
			case FhirResourcePackage.QUESTIONNAIRE__ITEM:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireImpl
