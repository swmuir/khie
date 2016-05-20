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

import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.EligibilityResponse;
import org.hl7.fhir.EligibilityResponseBenefitBalance;
import org.hl7.fhir.EligibilityResponseError;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RemittanceOutcome;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getRequestReference <em>Request Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getOrganizationIdentifier <em>Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getOrganizationReference <em>Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getRequestProviderIdentifier <em>Request Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getRequestProviderReference <em>Request Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getRequestOrganizationIdentifier <em>Request Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getRequestOrganizationReference <em>Request Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getInforce <em>Inforce</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getBenefitBalance <em>Benefit Balance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseImpl#getError <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EligibilityResponseImpl extends DomainResourceImpl implements EligibilityResponse {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getRequestIdentifier() <em>Request Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier requestIdentifier;

	/**
	 * The cached value of the '{@link #getRequestReference() <em>Request Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestReference()
	 * @generated
	 * @ordered
	 */
	protected Reference requestReference;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected RemittanceOutcome outcome;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String disposition;

	/**
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding ruleset;

	/**
	 * The cached value of the '{@link #getOriginalRuleset() <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding originalRuleset;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getOrganizationIdentifier() <em>Organization Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier organizationIdentifier;

	/**
	 * The cached value of the '{@link #getOrganizationReference() <em>Organization Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference organizationReference;

	/**
	 * The cached value of the '{@link #getRequestProviderIdentifier() <em>Request Provider Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestProviderIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier requestProviderIdentifier;

	/**
	 * The cached value of the '{@link #getRequestProviderReference() <em>Request Provider Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestProviderReference()
	 * @generated
	 * @ordered
	 */
	protected Reference requestProviderReference;

	/**
	 * The cached value of the '{@link #getRequestOrganizationIdentifier() <em>Request Organization Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestOrganizationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier requestOrganizationIdentifier;

	/**
	 * The cached value of the '{@link #getRequestOrganizationReference() <em>Request Organization Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestOrganizationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference requestOrganizationReference;

	/**
	 * The cached value of the '{@link #getInforce() <em>Inforce</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInforce()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean inforce;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected Reference contract;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected Coding form;

	/**
	 * The cached value of the '{@link #getBenefitBalance() <em>Benefit Balance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitBalance()
	 * @generated
	 * @ordered
	 */
	protected EList<EligibilityResponseBenefitBalance> benefitBalance;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected EList<EligibilityResponseError> error;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEligibilityResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ELIGIBILITY_RESPONSE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getRequestIdentifier() {
		return requestIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestIdentifier(Identifier newRequestIdentifier, NotificationChain msgs) {
		Identifier oldRequestIdentifier = requestIdentifier;
		requestIdentifier = newRequestIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_IDENTIFIER, oldRequestIdentifier, newRequestIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestIdentifier(Identifier newRequestIdentifier) {
		if (newRequestIdentifier != requestIdentifier) {
			NotificationChain msgs = null;
			if (requestIdentifier != null)
				msgs = ((InternalEObject)requestIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_IDENTIFIER, null, msgs);
			if (newRequestIdentifier != null)
				msgs = ((InternalEObject)newRequestIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_IDENTIFIER, null, msgs);
			msgs = basicSetRequestIdentifier(newRequestIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_IDENTIFIER, newRequestIdentifier, newRequestIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequestReference() {
		return requestReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestReference(Reference newRequestReference, NotificationChain msgs) {
		Reference oldRequestReference = requestReference;
		requestReference = newRequestReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_REFERENCE, oldRequestReference, newRequestReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestReference(Reference newRequestReference) {
		if (newRequestReference != requestReference) {
			NotificationChain msgs = null;
			if (requestReference != null)
				msgs = ((InternalEObject)requestReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_REFERENCE, null, msgs);
			if (newRequestReference != null)
				msgs = ((InternalEObject)newRequestReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_REFERENCE, null, msgs);
			msgs = basicSetRequestReference(newRequestReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_REFERENCE, newRequestReference, newRequestReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcome getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(RemittanceOutcome newOutcome, NotificationChain msgs) {
		RemittanceOutcome oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(RemittanceOutcome newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisposition(org.hl7.fhir.String newDisposition, NotificationChain msgs) {
		org.hl7.fhir.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__DISPOSITION, oldDisposition, newDisposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(org.hl7.fhir.String newDisposition) {
		if (newDisposition != disposition) {
			NotificationChain msgs = null;
			if (disposition != null)
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__DISPOSITION, newDisposition, newDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRuleset() {
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleset(Coding newRuleset, NotificationChain msgs) {
		Coding oldRuleset = ruleset;
		ruleset = newRuleset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__RULESET, oldRuleset, newRuleset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleset(Coding newRuleset) {
		if (newRuleset != ruleset) {
			NotificationChain msgs = null;
			if (ruleset != null)
				msgs = ((InternalEObject)ruleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__RULESET, null, msgs);
			if (newRuleset != null)
				msgs = ((InternalEObject)newRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__RULESET, null, msgs);
			msgs = basicSetRuleset(newRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__RULESET, newRuleset, newRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getOriginalRuleset() {
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalRuleset(Coding newOriginalRuleset, NotificationChain msgs) {
		Coding oldOriginalRuleset = originalRuleset;
		originalRuleset = newOriginalRuleset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__ORIGINAL_RULESET, oldOriginalRuleset, newOriginalRuleset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalRuleset(Coding newOriginalRuleset) {
		if (newOriginalRuleset != originalRuleset) {
			NotificationChain msgs = null;
			if (originalRuleset != null)
				msgs = ((InternalEObject)originalRuleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__ORIGINAL_RULESET, null, msgs);
			if (newOriginalRuleset != null)
				msgs = ((InternalEObject)newOriginalRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__ORIGINAL_RULESET, null, msgs);
			msgs = basicSetOriginalRuleset(newOriginalRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__ORIGINAL_RULESET, newOriginalRuleset, newOriginalRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getOrganizationIdentifier() {
		return organizationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationIdentifier(Identifier newOrganizationIdentifier, NotificationChain msgs) {
		Identifier oldOrganizationIdentifier = organizationIdentifier;
		organizationIdentifier = newOrganizationIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_IDENTIFIER, oldOrganizationIdentifier, newOrganizationIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationIdentifier(Identifier newOrganizationIdentifier) {
		if (newOrganizationIdentifier != organizationIdentifier) {
			NotificationChain msgs = null;
			if (organizationIdentifier != null)
				msgs = ((InternalEObject)organizationIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_IDENTIFIER, null, msgs);
			if (newOrganizationIdentifier != null)
				msgs = ((InternalEObject)newOrganizationIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_IDENTIFIER, null, msgs);
			msgs = basicSetOrganizationIdentifier(newOrganizationIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_IDENTIFIER, newOrganizationIdentifier, newOrganizationIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrganizationReference() {
		return organizationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationReference(Reference newOrganizationReference, NotificationChain msgs) {
		Reference oldOrganizationReference = organizationReference;
		organizationReference = newOrganizationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_REFERENCE, oldOrganizationReference, newOrganizationReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationReference(Reference newOrganizationReference) {
		if (newOrganizationReference != organizationReference) {
			NotificationChain msgs = null;
			if (organizationReference != null)
				msgs = ((InternalEObject)organizationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_REFERENCE, null, msgs);
			if (newOrganizationReference != null)
				msgs = ((InternalEObject)newOrganizationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_REFERENCE, null, msgs);
			msgs = basicSetOrganizationReference(newOrganizationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_REFERENCE, newOrganizationReference, newOrganizationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getRequestProviderIdentifier() {
		return requestProviderIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestProviderIdentifier(Identifier newRequestProviderIdentifier, NotificationChain msgs) {
		Identifier oldRequestProviderIdentifier = requestProviderIdentifier;
		requestProviderIdentifier = newRequestProviderIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_IDENTIFIER, oldRequestProviderIdentifier, newRequestProviderIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestProviderIdentifier(Identifier newRequestProviderIdentifier) {
		if (newRequestProviderIdentifier != requestProviderIdentifier) {
			NotificationChain msgs = null;
			if (requestProviderIdentifier != null)
				msgs = ((InternalEObject)requestProviderIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_IDENTIFIER, null, msgs);
			if (newRequestProviderIdentifier != null)
				msgs = ((InternalEObject)newRequestProviderIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_IDENTIFIER, null, msgs);
			msgs = basicSetRequestProviderIdentifier(newRequestProviderIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_IDENTIFIER, newRequestProviderIdentifier, newRequestProviderIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequestProviderReference() {
		return requestProviderReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestProviderReference(Reference newRequestProviderReference, NotificationChain msgs) {
		Reference oldRequestProviderReference = requestProviderReference;
		requestProviderReference = newRequestProviderReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_REFERENCE, oldRequestProviderReference, newRequestProviderReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestProviderReference(Reference newRequestProviderReference) {
		if (newRequestProviderReference != requestProviderReference) {
			NotificationChain msgs = null;
			if (requestProviderReference != null)
				msgs = ((InternalEObject)requestProviderReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_REFERENCE, null, msgs);
			if (newRequestProviderReference != null)
				msgs = ((InternalEObject)newRequestProviderReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_REFERENCE, null, msgs);
			msgs = basicSetRequestProviderReference(newRequestProviderReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_REFERENCE, newRequestProviderReference, newRequestProviderReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getRequestOrganizationIdentifier() {
		return requestOrganizationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestOrganizationIdentifier(Identifier newRequestOrganizationIdentifier, NotificationChain msgs) {
		Identifier oldRequestOrganizationIdentifier = requestOrganizationIdentifier;
		requestOrganizationIdentifier = newRequestOrganizationIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_IDENTIFIER, oldRequestOrganizationIdentifier, newRequestOrganizationIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestOrganizationIdentifier(Identifier newRequestOrganizationIdentifier) {
		if (newRequestOrganizationIdentifier != requestOrganizationIdentifier) {
			NotificationChain msgs = null;
			if (requestOrganizationIdentifier != null)
				msgs = ((InternalEObject)requestOrganizationIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_IDENTIFIER, null, msgs);
			if (newRequestOrganizationIdentifier != null)
				msgs = ((InternalEObject)newRequestOrganizationIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_IDENTIFIER, null, msgs);
			msgs = basicSetRequestOrganizationIdentifier(newRequestOrganizationIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_IDENTIFIER, newRequestOrganizationIdentifier, newRequestOrganizationIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequestOrganizationReference() {
		return requestOrganizationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestOrganizationReference(Reference newRequestOrganizationReference, NotificationChain msgs) {
		Reference oldRequestOrganizationReference = requestOrganizationReference;
		requestOrganizationReference = newRequestOrganizationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_REFERENCE, oldRequestOrganizationReference, newRequestOrganizationReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestOrganizationReference(Reference newRequestOrganizationReference) {
		if (newRequestOrganizationReference != requestOrganizationReference) {
			NotificationChain msgs = null;
			if (requestOrganizationReference != null)
				msgs = ((InternalEObject)requestOrganizationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_REFERENCE, null, msgs);
			if (newRequestOrganizationReference != null)
				msgs = ((InternalEObject)newRequestOrganizationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_REFERENCE, null, msgs);
			msgs = basicSetRequestOrganizationReference(newRequestOrganizationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_REFERENCE, newRequestOrganizationReference, newRequestOrganizationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getInforce() {
		return inforce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInforce(org.hl7.fhir.Boolean newInforce, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldInforce = inforce;
		inforce = newInforce;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__INFORCE, oldInforce, newInforce);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInforce(org.hl7.fhir.Boolean newInforce) {
		if (newInforce != inforce) {
			NotificationChain msgs = null;
			if (inforce != null)
				msgs = ((InternalEObject)inforce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__INFORCE, null, msgs);
			if (newInforce != null)
				msgs = ((InternalEObject)newInforce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__INFORCE, null, msgs);
			msgs = basicSetInforce(newInforce, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__INFORCE, newInforce, newInforce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContract() {
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContract(Reference newContract, NotificationChain msgs) {
		Reference oldContract = contract;
		contract = newContract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__CONTRACT, oldContract, newContract);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(Reference newContract) {
		if (newContract != contract) {
			NotificationChain msgs = null;
			if (contract != null)
				msgs = ((InternalEObject)contract).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__CONTRACT, null, msgs);
			if (newContract != null)
				msgs = ((InternalEObject)newContract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__CONTRACT, null, msgs);
			msgs = basicSetContract(newContract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__CONTRACT, newContract, newContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(Coding newForm, NotificationChain msgs) {
		Coding oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__FORM, oldForm, newForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(Coding newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EligibilityResponseBenefitBalance> getBenefitBalance() {
		if (benefitBalance == null) {
			benefitBalance = new EObjectContainmentEList<EligibilityResponseBenefitBalance>(EligibilityResponseBenefitBalance.class, this, FhirPackage.ELIGIBILITY_RESPONSE__BENEFIT_BALANCE);
		}
		return benefitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EligibilityResponseError> getError() {
		if (error == null) {
			error = new EObjectContainmentEList<EligibilityResponseError>(EligibilityResponseError.class, this, FhirPackage.ELIGIBILITY_RESPONSE__ERROR);
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELIGIBILITY_RESPONSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_IDENTIFIER:
				return basicSetRequestIdentifier(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_REFERENCE:
				return basicSetRequestReference(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__RULESET:
				return basicSetRuleset(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__ORIGINAL_RULESET:
				return basicSetOriginalRuleset(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_IDENTIFIER:
				return basicSetOrganizationIdentifier(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_REFERENCE:
				return basicSetOrganizationReference(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_IDENTIFIER:
				return basicSetRequestProviderIdentifier(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_REFERENCE:
				return basicSetRequestProviderReference(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_IDENTIFIER:
				return basicSetRequestOrganizationIdentifier(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_REFERENCE:
				return basicSetRequestOrganizationReference(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__INFORCE:
				return basicSetInforce(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__CONTRACT:
				return basicSetContract(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__FORM:
				return basicSetForm(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__BENEFIT_BALANCE:
				return ((InternalEList<?>)getBenefitBalance()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE__ERROR:
				return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ELIGIBILITY_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_IDENTIFIER:
				return getRequestIdentifier();
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_REFERENCE:
				return getRequestReference();
			case FhirPackage.ELIGIBILITY_RESPONSE__OUTCOME:
				return getOutcome();
			case FhirPackage.ELIGIBILITY_RESPONSE__DISPOSITION:
				return getDisposition();
			case FhirPackage.ELIGIBILITY_RESPONSE__RULESET:
				return getRuleset();
			case FhirPackage.ELIGIBILITY_RESPONSE__ORIGINAL_RULESET:
				return getOriginalRuleset();
			case FhirPackage.ELIGIBILITY_RESPONSE__CREATED:
				return getCreated();
			case FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_IDENTIFIER:
				return getOrganizationIdentifier();
			case FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_REFERENCE:
				return getOrganizationReference();
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_IDENTIFIER:
				return getRequestProviderIdentifier();
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_REFERENCE:
				return getRequestProviderReference();
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_IDENTIFIER:
				return getRequestOrganizationIdentifier();
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_REFERENCE:
				return getRequestOrganizationReference();
			case FhirPackage.ELIGIBILITY_RESPONSE__INFORCE:
				return getInforce();
			case FhirPackage.ELIGIBILITY_RESPONSE__CONTRACT:
				return getContract();
			case FhirPackage.ELIGIBILITY_RESPONSE__FORM:
				return getForm();
			case FhirPackage.ELIGIBILITY_RESPONSE__BENEFIT_BALANCE:
				return getBenefitBalance();
			case FhirPackage.ELIGIBILITY_RESPONSE__ERROR:
				return getError();
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
			case FhirPackage.ELIGIBILITY_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_IDENTIFIER:
				setRequestIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_REFERENCE:
				setRequestReference((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__OUTCOME:
				setOutcome((RemittanceOutcome)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__DISPOSITION:
				setDisposition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_IDENTIFIER:
				setOrganizationIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_REFERENCE:
				setOrganizationReference((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_IDENTIFIER:
				setRequestProviderIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_REFERENCE:
				setRequestProviderReference((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_IDENTIFIER:
				setRequestOrganizationIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_REFERENCE:
				setRequestOrganizationReference((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__INFORCE:
				setInforce((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__CONTRACT:
				setContract((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__FORM:
				setForm((Coding)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__BENEFIT_BALANCE:
				getBenefitBalance().clear();
				getBenefitBalance().addAll((Collection<? extends EligibilityResponseBenefitBalance>)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends EligibilityResponseError>)newValue);
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
			case FhirPackage.ELIGIBILITY_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_IDENTIFIER:
				setRequestIdentifier((Identifier)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_REFERENCE:
				setRequestReference((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__OUTCOME:
				setOutcome((RemittanceOutcome)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__DISPOSITION:
				setDisposition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_IDENTIFIER:
				setOrganizationIdentifier((Identifier)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_REFERENCE:
				setOrganizationReference((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_IDENTIFIER:
				setRequestProviderIdentifier((Identifier)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_REFERENCE:
				setRequestProviderReference((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_IDENTIFIER:
				setRequestOrganizationIdentifier((Identifier)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_REFERENCE:
				setRequestOrganizationReference((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__INFORCE:
				setInforce((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__CONTRACT:
				setContract((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__FORM:
				setForm((Coding)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__BENEFIT_BALANCE:
				getBenefitBalance().clear();
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE__ERROR:
				getError().clear();
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
			case FhirPackage.ELIGIBILITY_RESPONSE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_IDENTIFIER:
				return requestIdentifier != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_REFERENCE:
				return requestReference != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__OUTCOME:
				return outcome != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__DISPOSITION:
				return disposition != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__RULESET:
				return ruleset != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__CREATED:
				return created != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_IDENTIFIER:
				return organizationIdentifier != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__ORGANIZATION_REFERENCE:
				return organizationReference != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_IDENTIFIER:
				return requestProviderIdentifier != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER_REFERENCE:
				return requestProviderReference != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_IDENTIFIER:
				return requestOrganizationIdentifier != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION_REFERENCE:
				return requestOrganizationReference != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__INFORCE:
				return inforce != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__CONTRACT:
				return contract != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__FORM:
				return form != null;
			case FhirPackage.ELIGIBILITY_RESPONSE__BENEFIT_BALANCE:
				return benefitBalance != null && !benefitBalance.isEmpty();
			case FhirPackage.ELIGIBILITY_RESPONSE__ERROR:
				return error != null && !error.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EligibilityResponseImpl
