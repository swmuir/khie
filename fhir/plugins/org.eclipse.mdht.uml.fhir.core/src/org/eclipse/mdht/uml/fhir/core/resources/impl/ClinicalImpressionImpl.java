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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.resources.ClinicalImpression;
import org.eclipse.mdht.uml.fhir.core.resources.ClinicalImpressionFinding;
import org.eclipse.mdht.uml.fhir.core.resources.ClinicalImpressionInvestigation;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.RiskAssessment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Impression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getAssessor <em>Assessor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getProblems <em>Problem</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getInvestigations <em>Investigation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getProtocols <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getFindings <em>Finding</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getPrognosisCodeableConcepts <em>Prognosis Codeable Concept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getPrognosisReferences <em>Prognosis Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getActions <em>Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionImpl#getNotes <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalImpressionImpl extends DomainResourceImpl implements ClinicalImpression {
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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String description;

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
	 * The cached value of the '{@link #getAssessor() <em>Assessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessor()
	 * @generated
	 * @ordered
	 */
	protected Practitioner assessor;

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
	 * The cached value of the '{@link #getEffectivex() <em>Effectivex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivex()
	 * @generated
	 * @ordered
	 */
	protected DataType effectivex;

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
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected ClinicalImpression previous;

	/**
	 * The cached value of the '{@link #getProblems() <em>Problem</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblems()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> problems;

	/**
	 * The cached value of the '{@link #getInvestigations() <em>Investigation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvestigations()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalImpressionInvestigation> investigations;

	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocol</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> protocols;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String summary;

	/**
	 * The cached value of the '{@link #getFindings() <em>Finding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalImpressionFinding> findings;

	/**
	 * The cached value of the '{@link #getPrognosisCodeableConcepts() <em>Prognosis Codeable Concept</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisCodeableConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> prognosisCodeableConcepts;

	/**
	 * The cached value of the '{@link #getPrognosisReferences() <em>Prognosis Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskAssessment> prognosisReferences;

	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> actions;

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
	protected ClinicalImpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClinicalImpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.CLINICAL_IMPRESSION__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLINICAL_IMPRESSION__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLINICAL_IMPRESSION__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getAssessor() {
		if (assessor != null && assessor.eIsProxy()) {
			InternalEObject oldAssessor = (InternalEObject)assessor;
			assessor = (Practitioner)eResolveProxy(oldAssessor);
			if (assessor != oldAssessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR, oldAssessor, assessor));
			}
		}
		return assessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetAssessor() {
		return assessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssessor(Practitioner newAssessor) {
		Practitioner oldAssessor = assessor;
		assessor = newAssessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR, oldAssessor, assessor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLINICAL_IMPRESSION__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__DATE, oldDate, date));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX, oldEffectivex, effectivex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX, oldEffectivex, effectivex));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLINICAL_IMPRESSION__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpression getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (ClinicalImpression)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpression basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(ClinicalImpression newPrevious) {
		ClinicalImpression oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS, oldPrevious, previous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getProblems() {
		if (problems == null) {
			problems = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.CLINICAL_IMPRESSION__PROBLEM);
		}
		return problems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalImpressionInvestigation> getInvestigations() {
		if (investigations == null) {
			investigations = new EObjectContainmentEList<ClinicalImpressionInvestigation>(ClinicalImpressionInvestigation.class, this, ResourcesPackage.CLINICAL_IMPRESSION__INVESTIGATION);
		}
		return investigations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getProtocols() {
		if (protocols == null) {
			protocols = new EObjectResolvingEList<Uri>(Uri.class, this, ResourcesPackage.CLINICAL_IMPRESSION__PROTOCOL);
		}
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getSummary() {
		if (summary != null && summary.eIsProxy()) {
			InternalEObject oldSummary = (InternalEObject)summary;
			summary = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldSummary);
			if (summary != oldSummary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY, oldSummary, summary));
			}
		}
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(org.eclipse.mdht.uml.fhir.core.dataTypes.String newSummary) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalImpressionFinding> getFindings() {
		if (findings == null) {
			findings = new EObjectContainmentEList<ClinicalImpressionFinding>(ClinicalImpressionFinding.class, this, ResourcesPackage.CLINICAL_IMPRESSION__FINDING);
		}
		return findings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPrognosisCodeableConcepts() {
		if (prognosisCodeableConcepts == null) {
			prognosisCodeableConcepts = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT);
		}
		return prognosisCodeableConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RiskAssessment> getPrognosisReferences() {
		if (prognosisReferences == null) {
			prognosisReferences = new EObjectResolvingEList<RiskAssessment>(RiskAssessment.class, this, ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE);
		}
		return prognosisReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.CLINICAL_IMPRESSION__ACTION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.CLINICAL_IMPRESSION__NOTE);
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
			case ResourcesPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				return ((InternalEList<?>)getInvestigations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__FINDING:
				return ((InternalEList<?>)getFindings()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.CLINICAL_IMPRESSION__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR:
				if (resolve) return getAssessor();
				return basicGetAssessor();
			case ResourcesPackage.CLINICAL_IMPRESSION__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX:
				if (resolve) return getEffectivex();
				return basicGetEffectivex();
			case ResourcesPackage.CLINICAL_IMPRESSION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROBLEM:
				return getProblems();
			case ResourcesPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				return getInvestigations();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROTOCOL:
				return getProtocols();
			case ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY:
				if (resolve) return getSummary();
				return basicGetSummary();
			case ResourcesPackage.CLINICAL_IMPRESSION__FINDING:
				return getFindings();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				return getPrognosisCodeableConcepts();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				return getPrognosisReferences();
			case ResourcesPackage.CLINICAL_IMPRESSION__ACTION:
				return getActions();
			case ResourcesPackage.CLINICAL_IMPRESSION__NOTE:
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
			case ResourcesPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR:
				setAssessor((Practitioner)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX:
				setEffectivex((DataType)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__CONTEXT:
				setContext((Resource)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS:
				setPrevious((ClinicalImpression)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROBLEM:
				getProblems().clear();
				getProblems().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				getInvestigations().clear();
				getInvestigations().addAll((Collection<? extends ClinicalImpressionInvestigation>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROTOCOL:
				getProtocols().clear();
				getProtocols().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY:
				setSummary((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__FINDING:
				getFindings().clear();
				getFindings().addAll((Collection<? extends ClinicalImpressionFinding>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				getPrognosisCodeableConcepts().clear();
				getPrognosisCodeableConcepts().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				getPrognosisReferences().clear();
				getPrognosisReferences().addAll((Collection<? extends RiskAssessment>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__ACTION:
				getActions().clear();
				getActions().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__NOTE:
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
			case ResourcesPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR:
				setAssessor((Practitioner)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX:
				setEffectivex((DataType)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__CONTEXT:
				setContext((Resource)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS:
				setPrevious((ClinicalImpression)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROBLEM:
				getProblems().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				getInvestigations().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROTOCOL:
				getProtocols().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY:
				setSummary((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__FINDING:
				getFindings().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				getPrognosisCodeableConcepts().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				getPrognosisReferences().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__ACTION:
				getActions().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__NOTE:
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
			case ResourcesPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS:
				return status != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__CODE:
				return code != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT:
				return subject != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR:
				return assessor != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__DATE:
				return date != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX:
				return effectivex != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__CONTEXT:
				return context != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS:
				return previous != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROBLEM:
				return problems != null && !problems.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				return investigations != null && !investigations.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROTOCOL:
				return protocols != null && !protocols.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY:
				return summary != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__FINDING:
				return findings != null && !findings.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				return prognosisCodeableConcepts != null && !prognosisCodeableConcepts.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				return prognosisReferences != null && !prognosisReferences.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__ACTION:
				return actions != null && !actions.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__NOTE:
				return notes != null && !notes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClinicalImpressionImpl
