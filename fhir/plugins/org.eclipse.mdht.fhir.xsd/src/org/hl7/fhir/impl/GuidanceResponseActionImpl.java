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
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GuidanceResponseAction;
import org.hl7.fhir.GuidanceResponseBehavior;
import org.hl7.fhir.GuidanceResponseRelatedAction;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guidance Response Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getSupportingEvidence <em>Supporting Evidence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getRelatedAction <em>Related Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GuidanceResponseActionImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuidanceResponseActionImpl extends BackboneElementImpl implements GuidanceResponseAction {
	/**
	 * The cached value of the '{@link #getActionIdentifier() <em>Action Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier actionIdentifier;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String label;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getTextEquivalent() <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEquivalent()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String textEquivalent;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> concept;

	/**
	 * The cached value of the '{@link #getSupportingEvidence() <em>Supporting Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> supportingEvidence;

	/**
	 * The cached value of the '{@link #getRelatedAction() <em>Related Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAction()
	 * @generated
	 * @ordered
	 */
	protected GuidanceResponseRelatedAction relatedAction;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> documentation;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> participant;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<GuidanceResponseBehavior> behavior;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Reference resource;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<GuidanceResponseAction> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuidanceResponseActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGuidanceResponseAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getActionIdentifier() {
		return actionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionIdentifier(Identifier newActionIdentifier, NotificationChain msgs) {
		Identifier oldActionIdentifier = actionIdentifier;
		actionIdentifier = newActionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER, oldActionIdentifier, newActionIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionIdentifier(Identifier newActionIdentifier) {
		if (newActionIdentifier != actionIdentifier) {
			NotificationChain msgs = null;
			if (actionIdentifier != null)
				msgs = ((InternalEObject)actionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER, null, msgs);
			if (newActionIdentifier != null)
				msgs = ((InternalEObject)newActionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER, null, msgs);
			msgs = basicSetActionIdentifier(newActionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER, newActionIdentifier, newActionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(org.hl7.fhir.String newLabel, NotificationChain msgs) {
		org.hl7.fhir.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(org.hl7.fhir.String newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTextEquivalent() {
		return textEquivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextEquivalent(org.hl7.fhir.String newTextEquivalent, NotificationChain msgs) {
		org.hl7.fhir.String oldTextEquivalent = textEquivalent;
		textEquivalent = newTextEquivalent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT, oldTextEquivalent, newTextEquivalent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEquivalent(org.hl7.fhir.String newTextEquivalent) {
		if (newTextEquivalent != textEquivalent) {
			NotificationChain msgs = null;
			if (textEquivalent != null)
				msgs = ((InternalEObject)textEquivalent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT, null, msgs);
			if (newTextEquivalent != null)
				msgs = ((InternalEObject)newTextEquivalent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT, null, msgs);
			msgs = basicSetTextEquivalent(newTextEquivalent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT, newTextEquivalent, newTextEquivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.GUIDANCE_RESPONSE_ACTION__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getSupportingEvidence() {
		if (supportingEvidence == null) {
			supportingEvidence = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.GUIDANCE_RESPONSE_ACTION__SUPPORTING_EVIDENCE);
		}
		return supportingEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseRelatedAction getRelatedAction() {
		return relatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedAction(GuidanceResponseRelatedAction newRelatedAction, NotificationChain msgs) {
		GuidanceResponseRelatedAction oldRelatedAction = relatedAction;
		relatedAction = newRelatedAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__RELATED_ACTION, oldRelatedAction, newRelatedAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedAction(GuidanceResponseRelatedAction newRelatedAction) {
		if (newRelatedAction != relatedAction) {
			NotificationChain msgs = null;
			if (relatedAction != null)
				msgs = ((InternalEObject)relatedAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__RELATED_ACTION, null, msgs);
			if (newRelatedAction != null)
				msgs = ((InternalEObject)newRelatedAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__RELATED_ACTION, null, msgs);
			msgs = basicSetRelatedAction(newRelatedAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__RELATED_ACTION, newRelatedAction, newRelatedAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.GUIDANCE_RESPONSE_ACTION__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.GUIDANCE_RESPONSE_ACTION__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuidanceResponseBehavior> getBehavior() {
		if (behavior == null) {
			behavior = new EObjectContainmentEList<GuidanceResponseBehavior>(GuidanceResponseBehavior.class, this, FhirPackage.GUIDANCE_RESPONSE_ACTION__BEHAVIOR);
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Reference newResource, NotificationChain msgs) {
		Reference oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Reference newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GUIDANCE_RESPONSE_ACTION__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GUIDANCE_RESPONSE_ACTION__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuidanceResponseAction> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<GuidanceResponseAction>(GuidanceResponseAction.class, this, FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER:
				return basicSetActionIdentifier(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__LABEL:
				return basicSetLabel(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT:
				return basicSetTextEquivalent(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__SUPPORTING_EVIDENCE:
				return ((InternalEList<?>)getSupportingEvidence()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__RELATED_ACTION:
				return basicSetRelatedAction(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__BEHAVIOR:
				return ((InternalEList<?>)getBehavior()).basicRemove(otherEnd, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__RESOURCE:
				return basicSetResource(null, msgs);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER:
				return getActionIdentifier();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__LABEL:
				return getLabel();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TITLE:
				return getTitle();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION:
				return getDescription();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT:
				return getTextEquivalent();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__CONCEPT:
				return getConcept();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__SUPPORTING_EVIDENCE:
				return getSupportingEvidence();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__RELATED_ACTION:
				return getRelatedAction();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__PARTICIPANT:
				return getParticipant();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TYPE:
				return getType();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__BEHAVIOR:
				return getBehavior();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__RESOURCE:
				return getResource();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION:
				return getAction();
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
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__LABEL:
				setLabel((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__SUPPORTING_EVIDENCE:
				getSupportingEvidence().clear();
				getSupportingEvidence().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__RELATED_ACTION:
				setRelatedAction((GuidanceResponseRelatedAction)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TYPE:
				setType((Code)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends GuidanceResponseBehavior>)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__RESOURCE:
				setResource((Reference)newValue);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends GuidanceResponseAction>)newValue);
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
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__LABEL:
				setLabel((org.hl7.fhir.String)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((org.hl7.fhir.String)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__CONCEPT:
				getConcept().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__SUPPORTING_EVIDENCE:
				getSupportingEvidence().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__RELATED_ACTION:
				setRelatedAction((GuidanceResponseRelatedAction)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__PARTICIPANT:
				getParticipant().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TYPE:
				setType((Code)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__BEHAVIOR:
				getBehavior().clear();
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__RESOURCE:
				setResource((Reference)null);
				return;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION:
				getAction().clear();
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
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION_IDENTIFIER:
				return actionIdentifier != null;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__LABEL:
				return label != null;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TITLE:
				return title != null;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__DESCRIPTION:
				return description != null;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TEXT_EQUIVALENT:
				return textEquivalent != null;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__CONCEPT:
				return concept != null && !concept.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__SUPPORTING_EVIDENCE:
				return supportingEvidence != null && !supportingEvidence.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__RELATED_ACTION:
				return relatedAction != null;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__TYPE:
				return type != null;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__BEHAVIOR:
				return behavior != null && !behavior.isEmpty();
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__RESOURCE:
				return resource != null;
			case FhirPackage.GUIDANCE_RESPONSE_ACTION__ACTION:
				return action != null && !action.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GuidanceResponseActionImpl
