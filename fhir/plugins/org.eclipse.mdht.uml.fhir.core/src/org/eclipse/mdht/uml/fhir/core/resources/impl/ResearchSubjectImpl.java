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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.resources.Consent;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.ResearchStudy;
import org.eclipse.mdht.uml.fhir.core.resources.ResearchSubject;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchSubjectImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchSubjectImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchSubjectImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchSubjectImpl#getStudy <em>Study</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchSubjectImpl#getIndividual <em>Individual</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchSubjectImpl#getAssignedArm <em>Assigned Arm</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchSubjectImpl#getActualArm <em>Actual Arm</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchSubjectImpl#getConsent <em>Consent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResearchSubjectImpl extends DomainResourceImpl implements ResearchSubject {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getStudy() <em>Study</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudy()
	 * @generated
	 * @ordered
	 */
	protected ResearchStudy study;

	/**
	 * The cached value of the '{@link #getIndividual() <em>Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividual()
	 * @generated
	 * @ordered
	 */
	protected Patient individual;

	/**
	 * The cached value of the '{@link #getAssignedArm() <em>Assigned Arm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedArm()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String assignedArm;

	/**
	 * The cached value of the '{@link #getActualArm() <em>Actual Arm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualArm()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String actualArm;

	/**
	 * The cached value of the '{@link #getConsent() <em>Consent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsent()
	 * @generated
	 * @ordered
	 */
	protected Consent consent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getResearchSubject();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_SUBJECT__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__IDENTIFIER, oldIdentifier, identifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_SUBJECT__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Period)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_SUBJECT__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudy getStudy() {
		if (study != null && study.eIsProxy()) {
			InternalEObject oldStudy = (InternalEObject)study;
			study = (ResearchStudy)eResolveProxy(oldStudy);
			if (study != oldStudy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_SUBJECT__STUDY, oldStudy, study));
			}
		}
		return study;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudy basicGetStudy() {
		return study;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudy(ResearchStudy newStudy) {
		ResearchStudy oldStudy = study;
		study = newStudy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__STUDY, oldStudy, study));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getIndividual() {
		if (individual != null && individual.eIsProxy()) {
			InternalEObject oldIndividual = (InternalEObject)individual;
			individual = (Patient)eResolveProxy(oldIndividual);
			if (individual != oldIndividual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL, oldIndividual, individual));
			}
		}
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetIndividual() {
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividual(Patient newIndividual) {
		Patient oldIndividual = individual;
		individual = newIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL, oldIndividual, individual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getAssignedArm() {
		if (assignedArm != null && assignedArm.eIsProxy()) {
			InternalEObject oldAssignedArm = (InternalEObject)assignedArm;
			assignedArm = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldAssignedArm);
			if (assignedArm != oldAssignedArm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM, oldAssignedArm, assignedArm));
			}
		}
		return assignedArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetAssignedArm() {
		return assignedArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedArm(org.eclipse.mdht.uml.fhir.core.dataTypes.String newAssignedArm) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldAssignedArm = assignedArm;
		assignedArm = newAssignedArm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM, oldAssignedArm, assignedArm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getActualArm() {
		if (actualArm != null && actualArm.eIsProxy()) {
			InternalEObject oldActualArm = (InternalEObject)actualArm;
			actualArm = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldActualArm);
			if (actualArm != oldActualArm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM, oldActualArm, actualArm));
			}
		}
		return actualArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetActualArm() {
		return actualArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualArm(org.eclipse.mdht.uml.fhir.core.dataTypes.String newActualArm) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldActualArm = actualArm;
		actualArm = newActualArm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM, oldActualArm, actualArm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consent getConsent() {
		if (consent != null && consent.eIsProxy()) {
			InternalEObject oldConsent = (InternalEObject)consent;
			consent = (Consent)eResolveProxy(oldConsent);
			if (consent != oldConsent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_SUBJECT__CONSENT, oldConsent, consent));
			}
		}
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consent basicGetConsent() {
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsent(Consent newConsent) {
		Consent oldConsent = consent;
		consent = newConsent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__CONSENT, oldConsent, consent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.RESEARCH_SUBJECT__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case ResourcesPackage.RESEARCH_SUBJECT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.RESEARCH_SUBJECT__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case ResourcesPackage.RESEARCH_SUBJECT__STUDY:
				if (resolve) return getStudy();
				return basicGetStudy();
			case ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				if (resolve) return getIndividual();
				return basicGetIndividual();
			case ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				if (resolve) return getAssignedArm();
				return basicGetAssignedArm();
			case ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				if (resolve) return getActualArm();
				return basicGetActualArm();
			case ResourcesPackage.RESEARCH_SUBJECT__CONSENT:
				if (resolve) return getConsent();
				return basicGetConsent();
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
			case ResourcesPackage.RESEARCH_SUBJECT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__STUDY:
				setStudy((ResearchStudy)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				setIndividual((Patient)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				setAssignedArm((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				setActualArm((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__CONSENT:
				setConsent((Consent)newValue);
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
			case ResourcesPackage.RESEARCH_SUBJECT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__STUDY:
				setStudy((ResearchStudy)null);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				setIndividual((Patient)null);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				setAssignedArm((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				setActualArm((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__CONSENT:
				setConsent((Consent)null);
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
			case ResourcesPackage.RESEARCH_SUBJECT__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.RESEARCH_SUBJECT__STATUS:
				return status != null;
			case ResourcesPackage.RESEARCH_SUBJECT__PERIOD:
				return period != null;
			case ResourcesPackage.RESEARCH_SUBJECT__STUDY:
				return study != null;
			case ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				return individual != null;
			case ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				return assignedArm != null;
			case ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				return actualArm != null;
			case ResourcesPackage.RESEARCH_SUBJECT__CONSENT:
				return consent != null;
		}
		return super.eIsSet(featureID);
	}

} //ResearchSubjectImpl
