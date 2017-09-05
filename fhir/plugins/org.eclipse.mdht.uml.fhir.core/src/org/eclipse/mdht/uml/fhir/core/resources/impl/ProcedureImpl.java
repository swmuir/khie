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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.Condition;
import org.eclipse.mdht.uml.fhir.core.resources.DiagnosticReport;
import org.eclipse.mdht.uml.fhir.core.resources.Encounter;
import org.eclipse.mdht.uml.fhir.core.resources.Location;
import org.eclipse.mdht.uml.fhir.core.resources.Procedure;
import org.eclipse.mdht.uml.fhir.core.resources.ProcedureFocalDevice;
import org.eclipse.mdht.uml.fhir.core.resources.ProcedurePerformer;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getPerformedx <em>Performedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getNotPerformed <em>Not Performed</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getReasonNotPerformeds <em>Reason Not Performed</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getBodySites <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getReports <em>Report</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getComplications <em>Complication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getFollowUps <em>Follow Up</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getFocalDevices <em>Focal Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getUsedReferences <em>Used Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getUsedCodes <em>Used Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcedureImpl#getComponents <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureImpl extends DomainResourceImpl implements Procedure {
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
	 * The cached value of the '{@link #getPerformedx() <em>Performedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedx()
	 * @generated
	 * @ordered
	 */
	protected DataType performedx;

	/**
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedurePerformer> performers;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getReasonReferences() <em>Reason Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> reasonReferences;

	/**
	 * The cached value of the '{@link #getReasonCodes() <em>Reason Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCodes;

	/**
	 * The cached value of the '{@link #getNotPerformed() <em>Not Performed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotPerformed()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean notPerformed;

	/**
	 * The cached value of the '{@link #getReasonNotPerformeds() <em>Reason Not Performed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonNotPerformeds()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonNotPerformeds;

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
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getReports() <em>Report</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReports()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticReport> reports;

	/**
	 * The cached value of the '{@link #getComplications() <em>Complication</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplications()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> complications;

	/**
	 * The cached value of the '{@link #getFollowUps() <em>Follow Up</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowUps()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> followUps;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Resource request;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * The cached value of the '{@link #getFocalDevices() <em>Focal Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureFocalDevice> focalDevices;

	/**
	 * The cached value of the '{@link #getUsedReferences() <em>Used Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> usedReferences;

	/**
	 * The cached value of the '{@link #getUsedCodes() <em>Used Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> usedCodes;

	/**
	 * The cached value of the '{@link #getComponents() <em>Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.PROCEDURE__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCEDURE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCEDURE__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__CATEGORY, oldCategory, category));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCEDURE__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__CODE, oldCode, code));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCEDURE__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__SUBJECT, oldSubject, subject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCEDURE__ENCOUNTER, oldEncounter, encounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__ENCOUNTER, oldEncounter, encounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getPerformedx() {
		if (performedx != null && performedx.eIsProxy()) {
			InternalEObject oldPerformedx = (InternalEObject)performedx;
			performedx = (DataType)eResolveProxy(oldPerformedx);
			if (performedx != oldPerformedx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCEDURE__PERFORMEDX, oldPerformedx, performedx));
			}
		}
		return performedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetPerformedx() {
		return performedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedx(DataType newPerformedx) {
		DataType oldPerformedx = performedx;
		performedx = newPerformedx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__PERFORMEDX, oldPerformedx, performedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedurePerformer> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<ProcedurePerformer>(ProcedurePerformer.class, this, ResourcesPackage.PROCEDURE__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCEDURE__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectResolvingEList<Condition>(Condition.class, this, ResourcesPackage.PROCEDURE__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PROCEDURE__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getNotPerformed() {
		if (notPerformed != null && notPerformed.eIsProxy()) {
			InternalEObject oldNotPerformed = (InternalEObject)notPerformed;
			notPerformed = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldNotPerformed);
			if (notPerformed != oldNotPerformed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCEDURE__NOT_PERFORMED, oldNotPerformed, notPerformed));
			}
		}
		return notPerformed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetNotPerformed() {
		return notPerformed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotPerformed(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newNotPerformed) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldNotPerformed = notPerformed;
		notPerformed = newNotPerformed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__NOT_PERFORMED, oldNotPerformed, notPerformed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonNotPerformeds() {
		if (reasonNotPerformeds == null) {
			reasonNotPerformeds = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PROCEDURE__REASON_NOT_PERFORMED);
		}
		return reasonNotPerformeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getBodySites() {
		if (bodySites == null) {
			bodySites = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PROCEDURE__BODY_SITE);
		}
		return bodySites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOutcome() {
		if (outcome != null && outcome.eIsProxy()) {
			InternalEObject oldOutcome = (InternalEObject)outcome;
			outcome = (CodeableConcept)eResolveProxy(oldOutcome);
			if (outcome != oldOutcome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCEDURE__OUTCOME, oldOutcome, outcome));
			}
		}
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(CodeableConcept newOutcome) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__OUTCOME, oldOutcome, outcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticReport> getReports() {
		if (reports == null) {
			reports = new EObjectResolvingEList<DiagnosticReport>(DiagnosticReport.class, this, ResourcesPackage.PROCEDURE__REPORT);
		}
		return reports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getComplications() {
		if (complications == null) {
			complications = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PROCEDURE__COMPLICATION);
		}
		return complications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFollowUps() {
		if (followUps == null) {
			followUps = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PROCEDURE__FOLLOW_UP);
		}
		return followUps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (Resource)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCEDURE__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Resource newRequest) {
		Resource oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.PROCEDURE__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureFocalDevice> getFocalDevices() {
		if (focalDevices == null) {
			focalDevices = new EObjectContainmentEList<ProcedureFocalDevice>(ProcedureFocalDevice.class, this, ResourcesPackage.PROCEDURE__FOCAL_DEVICE);
		}
		return focalDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getUsedReferences() {
		if (usedReferences == null) {
			usedReferences = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.PROCEDURE__USED_REFERENCE);
		}
		return usedReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getUsedCodes() {
		if (usedCodes == null) {
			usedCodes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PROCEDURE__USED_CODE);
		}
		return usedCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getComponents() {
		if (components == null) {
			components = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.PROCEDURE__COMPONENT);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PROCEDURE__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__FOCAL_DEVICE:
				return ((InternalEList<?>)getFocalDevices()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.PROCEDURE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.PROCEDURE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.PROCEDURE__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case ResourcesPackage.PROCEDURE__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case ResourcesPackage.PROCEDURE__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.PROCEDURE__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case ResourcesPackage.PROCEDURE__PERFORMEDX:
				if (resolve) return getPerformedx();
				return basicGetPerformedx();
			case ResourcesPackage.PROCEDURE__PERFORMER:
				return getPerformers();
			case ResourcesPackage.PROCEDURE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case ResourcesPackage.PROCEDURE__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.PROCEDURE__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.PROCEDURE__NOT_PERFORMED:
				if (resolve) return getNotPerformed();
				return basicGetNotPerformed();
			case ResourcesPackage.PROCEDURE__REASON_NOT_PERFORMED:
				return getReasonNotPerformeds();
			case ResourcesPackage.PROCEDURE__BODY_SITE:
				return getBodySites();
			case ResourcesPackage.PROCEDURE__OUTCOME:
				if (resolve) return getOutcome();
				return basicGetOutcome();
			case ResourcesPackage.PROCEDURE__REPORT:
				return getReports();
			case ResourcesPackage.PROCEDURE__COMPLICATION:
				return getComplications();
			case ResourcesPackage.PROCEDURE__FOLLOW_UP:
				return getFollowUps();
			case ResourcesPackage.PROCEDURE__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case ResourcesPackage.PROCEDURE__NOTES:
				return getNotes();
			case ResourcesPackage.PROCEDURE__FOCAL_DEVICE:
				return getFocalDevices();
			case ResourcesPackage.PROCEDURE__USED_REFERENCE:
				return getUsedReferences();
			case ResourcesPackage.PROCEDURE__USED_CODE:
				return getUsedCodes();
			case ResourcesPackage.PROCEDURE__COMPONENT:
				return getComponents();
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
			case ResourcesPackage.PROCEDURE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.PROCEDURE__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PROCEDURE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PROCEDURE__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.PROCEDURE__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case ResourcesPackage.PROCEDURE__PERFORMEDX:
				setPerformedx((DataType)newValue);
				return;
			case ResourcesPackage.PROCEDURE__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends ProcedurePerformer>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__LOCATION:
				setLocation((Location)newValue);
				return;
			case ResourcesPackage.PROCEDURE__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Condition>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__NOT_PERFORMED:
				setNotPerformed((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.PROCEDURE__REASON_NOT_PERFORMED:
				getReasonNotPerformeds().clear();
				getReasonNotPerformeds().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__BODY_SITE:
				getBodySites().clear();
				getBodySites().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PROCEDURE__REPORT:
				getReports().clear();
				getReports().addAll((Collection<? extends DiagnosticReport>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__COMPLICATION:
				getComplications().clear();
				getComplications().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__FOLLOW_UP:
				getFollowUps().clear();
				getFollowUps().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__REQUEST:
				setRequest((Resource)newValue);
				return;
			case ResourcesPackage.PROCEDURE__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__FOCAL_DEVICE:
				getFocalDevices().clear();
				getFocalDevices().addAll((Collection<? extends ProcedureFocalDevice>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__USED_REFERENCE:
				getUsedReferences().clear();
				getUsedReferences().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__USED_CODE:
				getUsedCodes().clear();
				getUsedCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__COMPONENT:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Resource>)newValue);
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
			case ResourcesPackage.PROCEDURE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.PROCEDURE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.PROCEDURE__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.PROCEDURE__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.PROCEDURE__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.PROCEDURE__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case ResourcesPackage.PROCEDURE__PERFORMEDX:
				setPerformedx((DataType)null);
				return;
			case ResourcesPackage.PROCEDURE__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.PROCEDURE__LOCATION:
				setLocation((Location)null);
				return;
			case ResourcesPackage.PROCEDURE__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.PROCEDURE__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.PROCEDURE__NOT_PERFORMED:
				setNotPerformed((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.PROCEDURE__REASON_NOT_PERFORMED:
				getReasonNotPerformeds().clear();
				return;
			case ResourcesPackage.PROCEDURE__BODY_SITE:
				getBodySites().clear();
				return;
			case ResourcesPackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case ResourcesPackage.PROCEDURE__REPORT:
				getReports().clear();
				return;
			case ResourcesPackage.PROCEDURE__COMPLICATION:
				getComplications().clear();
				return;
			case ResourcesPackage.PROCEDURE__FOLLOW_UP:
				getFollowUps().clear();
				return;
			case ResourcesPackage.PROCEDURE__REQUEST:
				setRequest((Resource)null);
				return;
			case ResourcesPackage.PROCEDURE__NOTES:
				getNotes().clear();
				return;
			case ResourcesPackage.PROCEDURE__FOCAL_DEVICE:
				getFocalDevices().clear();
				return;
			case ResourcesPackage.PROCEDURE__USED_REFERENCE:
				getUsedReferences().clear();
				return;
			case ResourcesPackage.PROCEDURE__USED_CODE:
				getUsedCodes().clear();
				return;
			case ResourcesPackage.PROCEDURE__COMPONENT:
				getComponents().clear();
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
			case ResourcesPackage.PROCEDURE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.PROCEDURE__STATUS:
				return status != null;
			case ResourcesPackage.PROCEDURE__CATEGORY:
				return category != null;
			case ResourcesPackage.PROCEDURE__CODE:
				return code != null;
			case ResourcesPackage.PROCEDURE__SUBJECT:
				return subject != null;
			case ResourcesPackage.PROCEDURE__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.PROCEDURE__PERFORMEDX:
				return performedx != null;
			case ResourcesPackage.PROCEDURE__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.PROCEDURE__LOCATION:
				return location != null;
			case ResourcesPackage.PROCEDURE__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.PROCEDURE__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.PROCEDURE__NOT_PERFORMED:
				return notPerformed != null;
			case ResourcesPackage.PROCEDURE__REASON_NOT_PERFORMED:
				return reasonNotPerformeds != null && !reasonNotPerformeds.isEmpty();
			case ResourcesPackage.PROCEDURE__BODY_SITE:
				return bodySites != null && !bodySites.isEmpty();
			case ResourcesPackage.PROCEDURE__OUTCOME:
				return outcome != null;
			case ResourcesPackage.PROCEDURE__REPORT:
				return reports != null && !reports.isEmpty();
			case ResourcesPackage.PROCEDURE__COMPLICATION:
				return complications != null && !complications.isEmpty();
			case ResourcesPackage.PROCEDURE__FOLLOW_UP:
				return followUps != null && !followUps.isEmpty();
			case ResourcesPackage.PROCEDURE__REQUEST:
				return request != null;
			case ResourcesPackage.PROCEDURE__NOTES:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.PROCEDURE__FOCAL_DEVICE:
				return focalDevices != null && !focalDevices.isEmpty();
			case ResourcesPackage.PROCEDURE__USED_REFERENCE:
				return usedReferences != null && !usedReferences.isEmpty();
			case ResourcesPackage.PROCEDURE__USED_CODE:
				return usedCodes != null && !usedCodes.isEmpty();
			case ResourcesPackage.PROCEDURE__COMPONENT:
				return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcedureImpl
