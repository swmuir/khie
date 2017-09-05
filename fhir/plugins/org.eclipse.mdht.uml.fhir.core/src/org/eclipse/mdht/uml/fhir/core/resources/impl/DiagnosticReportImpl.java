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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Instant;
import org.eclipse.mdht.uml.fhir.core.resources.DiagnosticReport;
import org.eclipse.mdht.uml.fhir.core.resources.DiagnosticReportImage;
import org.eclipse.mdht.uml.fhir.core.resources.Encounter;
import org.eclipse.mdht.uml.fhir.core.resources.Observation;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.Specimen;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getRequests <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getSpecimens <em>Specimen</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getImagingStudies <em>Imaging Study</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getImages <em>Image</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getCodedDiagnosis <em>Coded Diagnosis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticReportImpl#getPresentedForms <em>Presented Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticReportImpl extends DomainResourceImpl implements DiagnosticReport {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Resource subject;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Encounter encounter;

	/**
	 * The cached value of the '{@link #getEffectivex() <em>Effectivex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivex()
	 * @generated
	 * @ordered
	 */
	protected DataType effectivex;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected Instant issued;

	/**
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> performers;

	/**
	 * The cached value of the '{@link #getRequests() <em>Request</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> requests;

	/**
	 * The cached value of the '{@link #getSpecimens() <em>Specimen</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimens()
	 * @generated
	 * @ordered
	 */
	protected EList<Specimen> specimens;

	/**
	 * The cached value of the '{@link #getResults() <em>Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Observation> results;

	/**
	 * The cached value of the '{@link #getImagingStudies() <em>Imaging Study</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagingStudies()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> imagingStudies;

	/**
	 * The cached value of the '{@link #getImages() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticReportImage> images;

	/**
	 * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String conclusion;

	/**
	 * The cached value of the '{@link #getCodedDiagnosis() <em>Coded Diagnosis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> codedDiagnosis;

	/**
	 * The cached value of the '{@link #getPresentedForms() <em>Presented Form</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentedForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> presentedForms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDiagnosticReport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REPORT__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (CodeableConcept)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY, oldCategory, category));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REPORT__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__CODE, oldCode, code));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter getEncounter() {
		if (encounter != null && encounter.eIsProxy()) {
			InternalEObject oldEncounter = (InternalEObject)encounter;
			encounter = (Encounter)eResolveProxy(oldEncounter);
			if (encounter != oldEncounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER, oldEncounter, encounter));
			}
		}
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter basicGetEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Encounter newEncounter) {
		Encounter oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER, oldEncounter, encounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getEffectivex() {
		if (effectivex != null && effectivex.eIsProxy()) {
			InternalEObject oldEffectivex = (InternalEObject)effectivex;
			effectivex = (DataType)eResolveProxy(oldEffectivex);
			if (effectivex != oldEffectivex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX, oldEffectivex, effectivex));
			}
		}
		return effectivex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetEffectivex() {
		return effectivex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivex(DataType newEffectivex) {
		DataType oldEffectivex = effectivex;
		effectivex = newEffectivex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX, oldEffectivex, effectivex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getIssued() {
		if (issued != null && issued.eIsProxy()) {
			InternalEObject oldIssued = (InternalEObject)issued;
			issued = (Instant)eResolveProxy(oldIssued);
			if (issued != oldIssued) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED, oldIssued, issued));
			}
		}
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(Instant newIssued) {
		Instant oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED, oldIssued, issued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getPerformers() {
		if (performers == null) {
			performers = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRequests() {
		if (requests == null) {
			requests = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__REQUEST);
		}
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specimen> getSpecimens() {
		if (specimens == null) {
			specimens = new EObjectResolvingEList<Specimen>(Specimen.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN);
		}
		return specimens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observation> getResults() {
		if (results == null) {
			results = new EObjectResolvingEList<Observation>(Observation.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__RESULT);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getImagingStudies() {
		if (imagingStudies == null) {
			imagingStudies = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY);
		}
		return imagingStudies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticReportImage> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<DiagnosticReportImage>(DiagnosticReportImage.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__IMAGE);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getConclusion() {
		if (conclusion != null && conclusion.eIsProxy()) {
			InternalEObject oldConclusion = (InternalEObject)conclusion;
			conclusion = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldConclusion);
			if (conclusion != oldConclusion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION, oldConclusion, conclusion));
			}
		}
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetConclusion() {
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConclusion(org.eclipse.mdht.uml.fhir.core.dataTypes.String newConclusion) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldConclusion = conclusion;
		conclusion = newConclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION, oldConclusion, conclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCodedDiagnosis() {
		if (codedDiagnosis == null) {
			codedDiagnosis = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS);
		}
		return codedDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getPresentedForms() {
		if (presentedForms == null) {
			presentedForms = new EObjectResolvingEList<Attachment>(Attachment.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM);
		}
		return presentedForms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGE:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.DIAGNOSTIC_REPORT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case ResourcesPackage.DIAGNOSTIC_REPORT__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX:
				if (resolve) return getEffectivex();
				return basicGetEffectivex();
			case ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED:
				if (resolve) return getIssued();
				return basicGetIssued();
			case ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER:
				return getPerformers();
			case ResourcesPackage.DIAGNOSTIC_REPORT__REQUEST:
				return getRequests();
			case ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				return getSpecimens();
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULT:
				return getResults();
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				return getImagingStudies();
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGE:
				return getImages();
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				if (resolve) return getConclusion();
				return basicGetConclusion();
			case ResourcesPackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS:
				return getCodedDiagnosis();
			case ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				return getPresentedForms();
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
			case ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX:
				setEffectivex((DataType)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED:
				setIssued((Instant)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__REQUEST:
				getRequests().clear();
				getRequests().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				getSpecimens().clear();
				getSpecimens().addAll((Collection<? extends Specimen>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULT:
				getResults().clear();
				getResults().addAll((Collection<? extends Observation>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				getImagingStudies().clear();
				getImagingStudies().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGE:
				getImages().clear();
				getImages().addAll((Collection<? extends DiagnosticReportImage>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				setConclusion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS:
				getCodedDiagnosis().clear();
				getCodedDiagnosis().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				getPresentedForms().clear();
				getPresentedForms().addAll((Collection<? extends Attachment>)newValue);
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
			case ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX:
				setEffectivex((DataType)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED:
				setIssued((Instant)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__REQUEST:
				getRequests().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				getSpecimens().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULT:
				getResults().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				getImagingStudies().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGE:
				getImages().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				setConclusion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS:
				getCodedDiagnosis().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				getPresentedForms().clear();
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
			case ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__STATUS:
				return status != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY:
				return category != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CODE:
				return code != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT:
				return subject != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX:
				return effectivex != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED:
				return issued != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__REQUEST:
				return requests != null && !requests.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				return specimens != null && !specimens.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULT:
				return results != null && !results.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				return imagingStudies != null && !imagingStudies.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGE:
				return images != null && !images.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				return conclusion != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS:
				return codedDiagnosis != null && !codedDiagnosis.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				return presentedForms != null && !presentedForms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagnosticReportImpl
