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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Date;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.Condition;
import org.eclipse.mdht.uml.fhir.core.resources.ConditionEvidence;
import org.eclipse.mdht.uml.fhir.core.resources.ConditionStage;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getClinicalStatus <em>Clinical Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getVerificationStatus <em>Verification Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getBodySites <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getOnsetx <em>Onsetx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getAbatementx <em>Abatementx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getAssertedDate <em>Asserted Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getEvidences <em>Evidence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionImpl#getNotes <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends DomainResourceImpl implements Condition {
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
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> categories;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept severity;

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
	 * The cached value of the '{@link #getBodySites() <em>Body Site</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySites()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> bodySites;

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
	 * The cached value of the '{@link #getOnsetx() <em>Onsetx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetx()
	 * @generated
	 * @ordered
	 */
	protected DataType onsetx;

	/**
	 * The cached value of the '{@link #getAbatementx() <em>Abatementx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbatementx()
	 * @generated
	 * @ordered
	 */
	protected DataType abatementx;

	/**
	 * The cached value of the '{@link #getAssertedDate() <em>Asserted Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertedDate()
	 * @generated
	 * @ordered
	 */
	protected Date assertedDate;

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
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected ConditionStage stage;

	/**
	 * The cached value of the '{@link #getEvidences() <em>Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidences()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionEvidence> evidences;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.CONDITION__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONDITION__CLINICAL_STATUS, oldClinicalStatus, clinicalStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONDITION__CLINICAL_STATUS, oldClinicalStatus, clinicalStatus));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONDITION__VERIFICATION_STATUS, oldVerificationStatus, verificationStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONDITION__VERIFICATION_STATUS, oldVerificationStatus, verificationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONDITION__CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSeverity() {
		if (severity != null && severity.eIsProxy()) {
			InternalEObject oldSeverity = (InternalEObject)severity;
			severity = (CodeableConcept)eResolveProxy(oldSeverity);
			if (severity != oldSeverity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONDITION__SEVERITY, oldSeverity, severity));
			}
		}
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(CodeableConcept newSeverity) {
		CodeableConcept oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONDITION__SEVERITY, oldSeverity, severity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONDITION__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONDITION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getBodySites() {
		if (bodySites == null) {
			bodySites = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONDITION__BODY_SITE);
		}
		return bodySites;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONDITION__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONDITION__SUBJECT, oldSubject, subject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONDITION__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONDITION__CONTEXT, oldContext, context));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONDITION__ONSETX, oldOnsetx, onsetx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONDITION__ONSETX, oldOnsetx, onsetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getAbatementx() {
		if (abatementx != null && abatementx.eIsProxy()) {
			InternalEObject oldAbatementx = (InternalEObject)abatementx;
			abatementx = (DataType)eResolveProxy(oldAbatementx);
			if (abatementx != oldAbatementx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONDITION__ABATEMENTX, oldAbatementx, abatementx));
			}
		}
		return abatementx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetAbatementx() {
		return abatementx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbatementx(DataType newAbatementx) {
		DataType oldAbatementx = abatementx;
		abatementx = newAbatementx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONDITION__ABATEMENTX, oldAbatementx, abatementx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAssertedDate() {
		if (assertedDate != null && assertedDate.eIsProxy()) {
			InternalEObject oldAssertedDate = (InternalEObject)assertedDate;
			assertedDate = (Date)eResolveProxy(oldAssertedDate);
			if (assertedDate != oldAssertedDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONDITION__ASSERTED_DATE, oldAssertedDate, assertedDate));
			}
		}
		return assertedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetAssertedDate() {
		return assertedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssertedDate(Date newAssertedDate) {
		Date oldAssertedDate = assertedDate;
		assertedDate = newAssertedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONDITION__ASSERTED_DATE, oldAssertedDate, assertedDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONDITION__ASSERTER, oldAsserter, asserter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONDITION__ASSERTER, oldAsserter, asserter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionStage getStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStage(ConditionStage newStage, NotificationChain msgs) {
		ConditionStage oldStage = stage;
		stage = newStage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONDITION__STAGE, oldStage, newStage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(ConditionStage newStage) {
		if (newStage != stage) {
			NotificationChain msgs = null;
			if (stage != null)
				msgs = ((InternalEObject)stage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONDITION__STAGE, null, msgs);
			if (newStage != null)
				msgs = ((InternalEObject)newStage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONDITION__STAGE, null, msgs);
			msgs = basicSetStage(newStage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONDITION__STAGE, newStage, newStage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionEvidence> getEvidences() {
		if (evidences == null) {
			evidences = new EObjectContainmentEList<ConditionEvidence>(ConditionEvidence.class, this, ResourcesPackage.CONDITION__EVIDENCE);
		}
		return evidences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.CONDITION__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONDITION__STAGE:
				return basicSetStage(null, msgs);
			case ResourcesPackage.CONDITION__EVIDENCE:
				return ((InternalEList<?>)getEvidences()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CONDITION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.CONDITION__CLINICAL_STATUS:
				if (resolve) return getClinicalStatus();
				return basicGetClinicalStatus();
			case ResourcesPackage.CONDITION__VERIFICATION_STATUS:
				if (resolve) return getVerificationStatus();
				return basicGetVerificationStatus();
			case ResourcesPackage.CONDITION__CATEGORY:
				return getCategories();
			case ResourcesPackage.CONDITION__SEVERITY:
				if (resolve) return getSeverity();
				return basicGetSeverity();
			case ResourcesPackage.CONDITION__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case ResourcesPackage.CONDITION__BODY_SITE:
				return getBodySites();
			case ResourcesPackage.CONDITION__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.CONDITION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.CONDITION__ONSETX:
				if (resolve) return getOnsetx();
				return basicGetOnsetx();
			case ResourcesPackage.CONDITION__ABATEMENTX:
				if (resolve) return getAbatementx();
				return basicGetAbatementx();
			case ResourcesPackage.CONDITION__ASSERTED_DATE:
				if (resolve) return getAssertedDate();
				return basicGetAssertedDate();
			case ResourcesPackage.CONDITION__ASSERTER:
				if (resolve) return getAsserter();
				return basicGetAsserter();
			case ResourcesPackage.CONDITION__STAGE:
				return getStage();
			case ResourcesPackage.CONDITION__EVIDENCE:
				return getEvidences();
			case ResourcesPackage.CONDITION__NOTE:
				return getNotes();
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
			case ResourcesPackage.CONDITION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CONDITION__CLINICAL_STATUS:
				setClinicalStatus((Code)newValue);
				return;
			case ResourcesPackage.CONDITION__VERIFICATION_STATUS:
				setVerificationStatus((Code)newValue);
				return;
			case ResourcesPackage.CONDITION__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONDITION__SEVERITY:
				setSeverity((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONDITION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONDITION__BODY_SITE:
				getBodySites().clear();
				getBodySites().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONDITION__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.CONDITION__CONTEXT:
				setContext((Resource)newValue);
				return;
			case ResourcesPackage.CONDITION__ONSETX:
				setOnsetx((DataType)newValue);
				return;
			case ResourcesPackage.CONDITION__ABATEMENTX:
				setAbatementx((DataType)newValue);
				return;
			case ResourcesPackage.CONDITION__ASSERTED_DATE:
				setAssertedDate((Date)newValue);
				return;
			case ResourcesPackage.CONDITION__ASSERTER:
				setAsserter((Resource)newValue);
				return;
			case ResourcesPackage.CONDITION__STAGE:
				setStage((ConditionStage)newValue);
				return;
			case ResourcesPackage.CONDITION__EVIDENCE:
				getEvidences().clear();
				getEvidences().addAll((Collection<? extends ConditionEvidence>)newValue);
				return;
			case ResourcesPackage.CONDITION__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
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
			case ResourcesPackage.CONDITION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.CONDITION__CLINICAL_STATUS:
				setClinicalStatus((Code)null);
				return;
			case ResourcesPackage.CONDITION__VERIFICATION_STATUS:
				setVerificationStatus((Code)null);
				return;
			case ResourcesPackage.CONDITION__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.CONDITION__SEVERITY:
				setSeverity((CodeableConcept)null);
				return;
			case ResourcesPackage.CONDITION__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.CONDITION__BODY_SITE:
				getBodySites().clear();
				return;
			case ResourcesPackage.CONDITION__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.CONDITION__CONTEXT:
				setContext((Resource)null);
				return;
			case ResourcesPackage.CONDITION__ONSETX:
				setOnsetx((DataType)null);
				return;
			case ResourcesPackage.CONDITION__ABATEMENTX:
				setAbatementx((DataType)null);
				return;
			case ResourcesPackage.CONDITION__ASSERTED_DATE:
				setAssertedDate((Date)null);
				return;
			case ResourcesPackage.CONDITION__ASSERTER:
				setAsserter((Resource)null);
				return;
			case ResourcesPackage.CONDITION__STAGE:
				setStage((ConditionStage)null);
				return;
			case ResourcesPackage.CONDITION__EVIDENCE:
				getEvidences().clear();
				return;
			case ResourcesPackage.CONDITION__NOTE:
				getNotes().clear();
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
			case ResourcesPackage.CONDITION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.CONDITION__CLINICAL_STATUS:
				return clinicalStatus != null;
			case ResourcesPackage.CONDITION__VERIFICATION_STATUS:
				return verificationStatus != null;
			case ResourcesPackage.CONDITION__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.CONDITION__SEVERITY:
				return severity != null;
			case ResourcesPackage.CONDITION__CODE:
				return code != null;
			case ResourcesPackage.CONDITION__BODY_SITE:
				return bodySites != null && !bodySites.isEmpty();
			case ResourcesPackage.CONDITION__SUBJECT:
				return subject != null;
			case ResourcesPackage.CONDITION__CONTEXT:
				return context != null;
			case ResourcesPackage.CONDITION__ONSETX:
				return onsetx != null;
			case ResourcesPackage.CONDITION__ABATEMENTX:
				return abatementx != null;
			case ResourcesPackage.CONDITION__ASSERTED_DATE:
				return assertedDate != null;
			case ResourcesPackage.CONDITION__ASSERTER:
				return asserter != null;
			case ResourcesPackage.CONDITION__STAGE:
				return stage != null;
			case ResourcesPackage.CONDITION__EVIDENCE:
				return evidences != null && !evidences.isEmpty();
			case ResourcesPackage.CONDITION__NOTE:
				return notes != null && !notes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
