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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.EnrollmentRequest;
import org.eclipse.mdht.uml.fhir.core.resource.EnrollmentResponse;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enrollment Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EnrollmentResponseImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EnrollmentResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EnrollmentResponseImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EnrollmentResponseImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EnrollmentResponseImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EnrollmentResponseImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EnrollmentResponseImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EnrollmentResponseImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EnrollmentResponseImpl#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EnrollmentResponseImpl#getRequestOrganization <em>Request Organization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnrollmentResponseImpl extends DomainResourceImpl implements EnrollmentResponse {
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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected EnrollmentRequest request;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected Code outcome;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String disposition;

	/**
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding ruleset;

	/**
	 * The cached value of the '{@link #getOriginalRuleset() <em>Original Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding originalRuleset;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization organization;

	/**
	 * The cached value of the '{@link #getRequestProvider() <em>Request Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestProvider()
	 * @generated
	 * @ordered
	 */
	protected Practitioner requestProvider;

	/**
	 * The cached value of the '{@link #getRequestOrganization() <em>Request Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization requestOrganization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnrollmentResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getEnrollmentResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.ENROLLMENT_RESPONSE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequest getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (EnrollmentRequest)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequest basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(EnrollmentRequest newRequest) {
		EnrollmentRequest oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getOutcome() {
		if (outcome != null && outcome.eIsProxy()) {
			InternalEObject oldOutcome = (InternalEObject)outcome;
			outcome = (Code)eResolveProxy(oldOutcome);
			if (outcome != oldOutcome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENROLLMENT_RESPONSE__OUTCOME, oldOutcome, outcome));
			}
		}
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(Code newOutcome) {
		Code oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENROLLMENT_RESPONSE__OUTCOME, oldOutcome, outcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDisposition() {
		if (disposition != null && disposition.eIsProxy()) {
			InternalEObject oldDisposition = (InternalEObject)disposition;
			disposition = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDisposition);
			if (disposition != oldDisposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENROLLMENT_RESPONSE__DISPOSITION, oldDisposition, disposition));
			}
		}
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(org.eclipse.mdht.uml.fhir.core.datatype.String newDisposition) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENROLLMENT_RESPONSE__DISPOSITION, oldDisposition, disposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRuleset() {
		if (ruleset != null && ruleset.eIsProxy()) {
			InternalEObject oldRuleset = (InternalEObject)ruleset;
			ruleset = (Coding)eResolveProxy(oldRuleset);
			if (ruleset != oldRuleset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENROLLMENT_RESPONSE__RULESET, oldRuleset, ruleset));
			}
		}
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetRuleset() {
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleset(Coding newRuleset) {
		Coding oldRuleset = ruleset;
		ruleset = newRuleset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENROLLMENT_RESPONSE__RULESET, oldRuleset, ruleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getOriginalRuleset() {
		if (originalRuleset != null && originalRuleset.eIsProxy()) {
			InternalEObject oldOriginalRuleset = (InternalEObject)originalRuleset;
			originalRuleset = (Coding)eResolveProxy(oldOriginalRuleset);
			if (originalRuleset != oldOriginalRuleset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENROLLMENT_RESPONSE__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
			}
		}
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetOriginalRuleset() {
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalRuleset(Coding newOriginalRuleset) {
		Coding oldOriginalRuleset = originalRuleset;
		originalRuleset = newOriginalRuleset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENROLLMENT_RESPONSE__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		if (created != null && created.eIsProxy()) {
			InternalEObject oldCreated = (InternalEObject)created;
			created = (DateTime)eResolveProxy(oldCreated);
			if (created != oldCreated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENROLLMENT_RESPONSE__CREATED, oldCreated, created));
			}
		}
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENROLLMENT_RESPONSE__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (organization != null && organization.eIsProxy()) {
			InternalEObject oldOrganization = (InternalEObject)organization;
			organization = (Organization)eResolveProxy(oldOrganization);
			if (organization != oldOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENROLLMENT_RESPONSE__ORGANIZATION, oldOrganization, organization));
			}
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		Organization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENROLLMENT_RESPONSE__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getRequestProvider() {
		if (requestProvider != null && requestProvider.eIsProxy()) {
			InternalEObject oldRequestProvider = (InternalEObject)requestProvider;
			requestProvider = (Practitioner)eResolveProxy(oldRequestProvider);
			if (requestProvider != oldRequestProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST_PROVIDER, oldRequestProvider, requestProvider));
			}
		}
		return requestProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetRequestProvider() {
		return requestProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestProvider(Practitioner newRequestProvider) {
		Practitioner oldRequestProvider = requestProvider;
		requestProvider = newRequestProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST_PROVIDER, oldRequestProvider, requestProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getRequestOrganization() {
		if (requestOrganization != null && requestOrganization.eIsProxy()) {
			InternalEObject oldRequestOrganization = (InternalEObject)requestOrganization;
			requestOrganization = (Organization)eResolveProxy(oldRequestOrganization);
			if (requestOrganization != oldRequestOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST_ORGANIZATION, oldRequestOrganization, requestOrganization));
			}
		}
		return requestOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetRequestOrganization() {
		return requestOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestOrganization(Organization newRequestOrganization) {
		Organization oldRequestOrganization = requestOrganization;
		requestOrganization = newRequestOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST_ORGANIZATION, oldRequestOrganization, requestOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.ENROLLMENT_RESPONSE__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case FhirResourcePackage.ENROLLMENT_RESPONSE__OUTCOME:
				if (resolve) return getOutcome();
				return basicGetOutcome();
			case FhirResourcePackage.ENROLLMENT_RESPONSE__DISPOSITION:
				if (resolve) return getDisposition();
				return basicGetDisposition();
			case FhirResourcePackage.ENROLLMENT_RESPONSE__RULESET:
				if (resolve) return getRuleset();
				return basicGetRuleset();
			case FhirResourcePackage.ENROLLMENT_RESPONSE__ORIGINAL_RULESET:
				if (resolve) return getOriginalRuleset();
				return basicGetOriginalRuleset();
			case FhirResourcePackage.ENROLLMENT_RESPONSE__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case FhirResourcePackage.ENROLLMENT_RESPONSE__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST_PROVIDER:
				if (resolve) return getRequestProvider();
				return basicGetRequestProvider();
			case FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST_ORGANIZATION:
				if (resolve) return getRequestOrganization();
				return basicGetRequestOrganization();
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
			case FhirResourcePackage.ENROLLMENT_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST:
				setRequest((EnrollmentRequest)newValue);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__OUTCOME:
				setOutcome((Code)newValue);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Practitioner)newValue);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Organization)newValue);
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
			case FhirResourcePackage.ENROLLMENT_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST:
				setRequest((EnrollmentRequest)null);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__OUTCOME:
				setOutcome((Code)null);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Practitioner)null);
				return;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Organization)null);
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
			case FhirResourcePackage.ENROLLMENT_RESPONSE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST:
				return request != null;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__OUTCOME:
				return outcome != null;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__DISPOSITION:
				return disposition != null;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__RULESET:
				return ruleset != null;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__CREATED:
				return created != null;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__ORGANIZATION:
				return organization != null;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST_PROVIDER:
				return requestProvider != null;
			case FhirResourcePackage.ENROLLMENT_RESPONSE__REQUEST_ORGANIZATION:
				return requestOrganization != null;
		}
		return super.eIsSet(featureID);
	}

} //EnrollmentResponseImpl
