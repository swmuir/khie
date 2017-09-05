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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance;
import org.eclipse.mdht.uml.fhir.core.resources.AllergyIntoleranceReaction;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Intolerance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getClinicalStatus <em>Clinical Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getVerificationStatus <em>Verification Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getOnsetx <em>Onsetx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getAssertedDate <em>Asserted Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getLastOccurrence <em>Last Occurrence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceImpl#getReactions <em>Reaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyIntoleranceImpl extends DomainResourceImpl implements AllergyIntolerance {
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
	 * The cached value of the '{@link #getClinicalStatus() <em>Clinical Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalStatus()
	 * @generated
	 * @ordered
	 */
	protected Code clinicalStatus;

	/**
	 * The cached value of the '{@link #getVerificationStatus() <em>Verification Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationStatus()
	 * @generated
	 * @ordered
	 */
	protected Code verificationStatus;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> categories;

	/**
	 * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected Code criticality;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The cached value of the '{@link #getOnsetx() <em>Onsetx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetx()
	 * @generated
	 * @ordered
	 */
	protected DataType onsetx;

	/**
	 * The cached value of the '{@link #getAssertedDate() <em>Asserted Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertedDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime assertedDate;

	/**
	 * The cached value of the '{@link #getRecorder() <em>Recorder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorder()
	 * @generated
	 * @ordered
	 */
	protected Resource recorder;

	/**
	 * The cached value of the '{@link #getAsserter() <em>Asserter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsserter()
	 * @generated
	 * @ordered
	 */
	protected Resource asserter;

	/**
	 * The cached value of the '{@link #getLastOccurrence() <em>Last Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOccurrence()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastOccurrence;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * The cached value of the '{@link #getReactions() <em>Reaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected EList<AllergyIntoleranceReaction> reactions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyIntoleranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAllergyIntolerance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.ALLERGY_INTOLERANCE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getClinicalStatus() {
		if (clinicalStatus != null && clinicalStatus.eIsProxy()) {
			InternalEObject oldClinicalStatus = (InternalEObject)clinicalStatus;
			clinicalStatus = (Code)eResolveProxy(oldClinicalStatus);
			if (clinicalStatus != oldClinicalStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS, oldClinicalStatus, clinicalStatus));
			}
		}
		return clinicalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetClinicalStatus() {
		return clinicalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalStatus(Code newClinicalStatus) {
		Code oldClinicalStatus = clinicalStatus;
		clinicalStatus = newClinicalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS, oldClinicalStatus, clinicalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getVerificationStatus() {
		if (verificationStatus != null && verificationStatus.eIsProxy()) {
			InternalEObject oldVerificationStatus = (InternalEObject)verificationStatus;
			verificationStatus = (Code)eResolveProxy(oldVerificationStatus);
			if (verificationStatus != oldVerificationStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS, oldVerificationStatus, verificationStatus));
			}
		}
		return verificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetVerificationStatus() {
		return verificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationStatus(Code newVerificationStatus) {
		Code oldVerificationStatus = verificationStatus;
		verificationStatus = newVerificationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS, oldVerificationStatus, verificationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<Code>(Code.class, this, ResourcesPackage.ALLERGY_INTOLERANCE__CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCriticality() {
		if (criticality != null && criticality.eIsProxy()) {
			InternalEObject oldCriticality = (InternalEObject)criticality;
			criticality = (Code)eResolveProxy(oldCriticality);
			if (criticality != oldCriticality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY, oldCriticality, criticality));
			}
		}
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCriticality() {
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticality(Code newCriticality) {
		Code oldCriticality = criticality;
		criticality = newCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY, oldCriticality, criticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (CodeableConcept)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		if (patient != null && patient.eIsProxy()) {
			InternalEObject oldPatient = (InternalEObject)patient;
			patient = (Patient)eResolveProxy(oldPatient);
			if (patient != oldPatient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT, oldPatient, patient));
			}
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Patient newPatient) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOnsetx() {
		if (onsetx != null && onsetx.eIsProxy()) {
			InternalEObject oldOnsetx = (InternalEObject)onsetx;
			onsetx = (DataType)eResolveProxy(oldOnsetx);
			if (onsetx != oldOnsetx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX, oldOnsetx, onsetx));
			}
		}
		return onsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetOnsetx() {
		return onsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnsetx(DataType newOnsetx) {
		DataType oldOnsetx = onsetx;
		onsetx = newOnsetx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX, oldOnsetx, onsetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getAssertedDate() {
		if (assertedDate != null && assertedDate.eIsProxy()) {
			InternalEObject oldAssertedDate = (InternalEObject)assertedDate;
			assertedDate = (DateTime)eResolveProxy(oldAssertedDate);
			if (assertedDate != oldAssertedDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTED_DATE, oldAssertedDate, assertedDate));
			}
		}
		return assertedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetAssertedDate() {
		return assertedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssertedDate(DateTime newAssertedDate) {
		DateTime oldAssertedDate = assertedDate;
		assertedDate = newAssertedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTED_DATE, oldAssertedDate, assertedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRecorder() {
		if (recorder != null && recorder.eIsProxy()) {
			InternalEObject oldRecorder = (InternalEObject)recorder;
			recorder = (Resource)eResolveProxy(oldRecorder);
			if (recorder != oldRecorder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER, oldRecorder, recorder));
			}
		}
		return recorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetRecorder() {
		return recorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorder(Resource newRecorder) {
		Resource oldRecorder = recorder;
		recorder = newRecorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER, oldRecorder, recorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getAsserter() {
		if (asserter != null && asserter.eIsProxy()) {
			InternalEObject oldAsserter = (InternalEObject)asserter;
			asserter = (Resource)eResolveProxy(oldAsserter);
			if (asserter != oldAsserter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER, oldAsserter, asserter));
			}
		}
		return asserter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetAsserter() {
		return asserter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsserter(Resource newAsserter) {
		Resource oldAsserter = asserter;
		asserter = newAsserter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER, oldAsserter, asserter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getLastOccurrence() {
		if (lastOccurrence != null && lastOccurrence.eIsProxy()) {
			InternalEObject oldLastOccurrence = (InternalEObject)lastOccurrence;
			lastOccurrence = (DateTime)eResolveProxy(oldLastOccurrence);
			if (lastOccurrence != oldLastOccurrence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, oldLastOccurrence, lastOccurrence));
			}
		}
		return lastOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetLastOccurrence() {
		return lastOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastOccurrence(DateTime newLastOccurrence) {
		DateTime oldLastOccurrence = lastOccurrence;
		lastOccurrence = newLastOccurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, oldLastOccurrence, lastOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.ALLERGY_INTOLERANCE__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyIntoleranceReaction> getReactions() {
		if (reactions == null) {
			reactions = new EObjectContainmentEList<AllergyIntoleranceReaction>(AllergyIntoleranceReaction.class, this, ResourcesPackage.ALLERGY_INTOLERANCE__REACTION);
		}
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ALLERGY_INTOLERANCE__REACTION:
				return ((InternalEList<?>)getReactions()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				if (resolve) return getClinicalStatus();
				return basicGetClinicalStatus();
			case ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				if (resolve) return getVerificationStatus();
				return basicGetVerificationStatus();
			case ResourcesPackage.ALLERGY_INTOLERANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.ALLERGY_INTOLERANCE__CATEGORY:
				return getCategories();
			case ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				if (resolve) return getCriticality();
				return basicGetCriticality();
			case ResourcesPackage.ALLERGY_INTOLERANCE__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX:
				if (resolve) return getOnsetx();
				return basicGetOnsetx();
			case ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTED_DATE:
				if (resolve) return getAssertedDate();
				return basicGetAssertedDate();
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER:
				if (resolve) return getRecorder();
				return basicGetRecorder();
			case ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER:
				if (resolve) return getAsserter();
				return basicGetAsserter();
			case ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				if (resolve) return getLastOccurrence();
				return basicGetLastOccurrence();
			case ResourcesPackage.ALLERGY_INTOLERANCE__NOTE:
				return getNotes();
			case ResourcesPackage.ALLERGY_INTOLERANCE__REACTION:
				return getReactions();
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
			case ResourcesPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				setClinicalStatus((Code)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				setVerificationStatus((Code)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				setCriticality((Code)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT:
				setPatient((Patient)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX:
				setOnsetx((DataType)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTED_DATE:
				setAssertedDate((DateTime)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER:
				setRecorder((Resource)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER:
				setAsserter((Resource)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				setLastOccurrence((DateTime)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__REACTION:
				getReactions().clear();
				getReactions().addAll((Collection<? extends AllergyIntoleranceReaction>)newValue);
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
			case ResourcesPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				setClinicalStatus((Code)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				setVerificationStatus((Code)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				setCriticality((Code)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT:
				setPatient((Patient)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX:
				setOnsetx((DataType)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTED_DATE:
				setAssertedDate((DateTime)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER:
				setRecorder((Resource)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER:
				setAsserter((Resource)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				setLastOccurrence((DateTime)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__REACTION:
				getReactions().clear();
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
			case ResourcesPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				return clinicalStatus != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				return verificationStatus != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__TYPE:
				return type != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				return criticality != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CODE:
				return code != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT:
				return patient != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX:
				return onsetx != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTED_DATE:
				return assertedDate != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER:
				return recorder != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER:
				return asserter != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				return lastOccurrence != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.ALLERGY_INTOLERANCE__REACTION:
				return reactions != null && !reactions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllergyIntoleranceImpl
