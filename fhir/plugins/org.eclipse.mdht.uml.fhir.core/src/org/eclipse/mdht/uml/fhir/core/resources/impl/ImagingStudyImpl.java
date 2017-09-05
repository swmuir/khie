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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Oid;
import org.eclipse.mdht.uml.fhir.core.dataTypes.UnsignedInt;
import org.eclipse.mdht.uml.fhir.core.resources.ImagingStudy;
import org.eclipse.mdht.uml.fhir.core.resources.ImagingStudySeries;
import org.eclipse.mdht.uml.fhir.core.resources.ImagingStudyStudyBaseLocation;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.Procedure;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getAccession <em>Accession</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getModalityLists <em>Modality List</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getStarted <em>Started</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getReferrer <em>Referrer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getInterpreters <em>Interpreter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getBaseLocations <em>Base Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getNumberOfSeries <em>Number Of Series</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getProcedures <em>Procedure</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingStudyImpl#getSeries <em>Series</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImagingStudyImpl extends DomainResourceImpl implements ImagingStudy {
	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected Oid uid;

	/**
	 * The cached value of the '{@link #getAccession() <em>Accession</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccession()
	 * @generated
	 * @ordered
	 */
	protected Identifier accession;

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
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected Code availability;

	/**
	 * The cached value of the '{@link #getModalityLists() <em>Modality List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalityLists()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> modalityLists;

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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Resource context;

	/**
	 * The cached value of the '{@link #getStarted() <em>Started</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
	protected DateTime started;

	/**
	 * The cached value of the '{@link #getBasedOns() <em>Based On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOns()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> basedOns;

	/**
	 * The cached value of the '{@link #getReferrer() <em>Referrer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferrer()
	 * @generated
	 * @ordered
	 */
	protected Practitioner referrer;

	/**
	 * The cached value of the '{@link #getInterpreters() <em>Interpreter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpreters()
	 * @generated
	 * @ordered
	 */
	protected EList<Practitioner> interpreters;

	/**
	 * The cached value of the '{@link #getBaseLocations() <em>Base Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingStudyStudyBaseLocation> baseLocations;

	/**
	 * The cached value of the '{@link #getNumberOfSeries() <em>Number Of Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeries()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfSeries;

	/**
	 * The cached value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfInstances;

	/**
	 * The cached value of the '{@link #getProcedures() <em>Procedure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedures()
	 * @generated
	 * @ordered
	 */
	protected EList<Procedure> procedures;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

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
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingStudySeries> series;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImagingStudy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getUid() {
		if (uid != null && uid.eIsProxy()) {
			InternalEObject oldUid = (InternalEObject)uid;
			uid = (Oid)eResolveProxy(oldUid);
			if (uid != oldUid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_STUDY__UID, oldUid, uid));
			}
		}
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid basicGetUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(Oid newUid) {
		Oid oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getAccession() {
		if (accession != null && accession.eIsProxy()) {
			InternalEObject oldAccession = (InternalEObject)accession;
			accession = (Identifier)eResolveProxy(oldAccession);
			if (accession != oldAccession) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_STUDY__ACCESSION, oldAccession, accession));
			}
		}
		return accession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetAccession() {
		return accession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccession(Identifier newAccession) {
		Identifier oldAccession = accession;
		accession = newAccession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__ACCESSION, oldAccession, accession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.IMAGING_STUDY__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getAvailability() {
		if (availability != null && availability.eIsProxy()) {
			InternalEObject oldAvailability = (InternalEObject)availability;
			availability = (Code)eResolveProxy(oldAvailability);
			if (availability != oldAvailability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_STUDY__AVAILABILITY, oldAvailability, availability));
			}
		}
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(Code newAvailability) {
		Code oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__AVAILABILITY, oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getModalityLists() {
		if (modalityLists == null) {
			modalityLists = new EObjectResolvingEList<Coding>(Coding.class, this, ResourcesPackage.IMAGING_STUDY__MODALITY_LIST);
		}
		return modalityLists;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_STUDY__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__PATIENT, oldPatient, patient));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_STUDY__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getStarted() {
		if (started != null && started.eIsProxy()) {
			InternalEObject oldStarted = (InternalEObject)started;
			started = (DateTime)eResolveProxy(oldStarted);
			if (started != oldStarted) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_STUDY__STARTED, oldStarted, started));
			}
		}
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarted(DateTime newStarted) {
		DateTime oldStarted = started;
		started = newStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__STARTED, oldStarted, started));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.IMAGING_STUDY__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getReferrer() {
		if (referrer != null && referrer.eIsProxy()) {
			InternalEObject oldReferrer = (InternalEObject)referrer;
			referrer = (Practitioner)eResolveProxy(oldReferrer);
			if (referrer != oldReferrer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_STUDY__REFERRER, oldReferrer, referrer));
			}
		}
		return referrer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetReferrer() {
		return referrer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferrer(Practitioner newReferrer) {
		Practitioner oldReferrer = referrer;
		referrer = newReferrer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__REFERRER, oldReferrer, referrer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Practitioner> getInterpreters() {
		if (interpreters == null) {
			interpreters = new EObjectResolvingEList<Practitioner>(Practitioner.class, this, ResourcesPackage.IMAGING_STUDY__INTERPRETER);
		}
		return interpreters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingStudyStudyBaseLocation> getBaseLocations() {
		if (baseLocations == null) {
			baseLocations = new EObjectContainmentEList<ImagingStudyStudyBaseLocation>(ImagingStudyStudyBaseLocation.class, this, ResourcesPackage.IMAGING_STUDY__BASE_LOCATION);
		}
		return baseLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumberOfSeries() {
		if (numberOfSeries != null && numberOfSeries.eIsProxy()) {
			InternalEObject oldNumberOfSeries = (InternalEObject)numberOfSeries;
			numberOfSeries = (UnsignedInt)eResolveProxy(oldNumberOfSeries);
			if (numberOfSeries != oldNumberOfSeries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES, oldNumberOfSeries, numberOfSeries));
			}
		}
		return numberOfSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt basicGetNumberOfSeries() {
		return numberOfSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSeries(UnsignedInt newNumberOfSeries) {
		UnsignedInt oldNumberOfSeries = numberOfSeries;
		numberOfSeries = newNumberOfSeries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES, oldNumberOfSeries, numberOfSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumberOfInstances() {
		if (numberOfInstances != null && numberOfInstances.eIsProxy()) {
			InternalEObject oldNumberOfInstances = (InternalEObject)numberOfInstances;
			numberOfInstances = (UnsignedInt)eResolveProxy(oldNumberOfInstances);
			if (numberOfInstances != oldNumberOfInstances) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, oldNumberOfInstances, numberOfInstances));
			}
		}
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt basicGetNumberOfInstances() {
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfInstances(UnsignedInt newNumberOfInstances) {
		UnsignedInt oldNumberOfInstances = numberOfInstances;
		numberOfInstances = newNumberOfInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, oldNumberOfInstances, numberOfInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getProcedures() {
		if (procedures == null) {
			procedures = new EObjectResolvingEList<Procedure>(Procedure.class, this, ResourcesPackage.IMAGING_STUDY__PROCEDURE);
		}
		return procedures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReason() {
		if (reason != null && reason.eIsProxy()) {
			InternalEObject oldReason = (InternalEObject)reason;
			reason = (CodeableConcept)eResolveProxy(oldReason);
			if (reason != oldReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_STUDY__REASON, oldReason, reason));
			}
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(CodeableConcept newReason) {
		CodeableConcept oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__REASON, oldReason, reason));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_STUDY__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingStudySeries> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<ImagingStudySeries>(ImagingStudySeries.class, this, ResourcesPackage.IMAGING_STUDY__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMAGING_STUDY__BASE_LOCATION:
				return ((InternalEList<?>)getBaseLocations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_STUDY__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.IMAGING_STUDY__UID:
				if (resolve) return getUid();
				return basicGetUid();
			case ResourcesPackage.IMAGING_STUDY__ACCESSION:
				if (resolve) return getAccession();
				return basicGetAccession();
			case ResourcesPackage.IMAGING_STUDY__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.IMAGING_STUDY__AVAILABILITY:
				if (resolve) return getAvailability();
				return basicGetAvailability();
			case ResourcesPackage.IMAGING_STUDY__MODALITY_LIST:
				return getModalityLists();
			case ResourcesPackage.IMAGING_STUDY__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case ResourcesPackage.IMAGING_STUDY__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.IMAGING_STUDY__STARTED:
				if (resolve) return getStarted();
				return basicGetStarted();
			case ResourcesPackage.IMAGING_STUDY__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.IMAGING_STUDY__REFERRER:
				if (resolve) return getReferrer();
				return basicGetReferrer();
			case ResourcesPackage.IMAGING_STUDY__INTERPRETER:
				return getInterpreters();
			case ResourcesPackage.IMAGING_STUDY__BASE_LOCATION:
				return getBaseLocations();
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				if (resolve) return getNumberOfSeries();
				return basicGetNumberOfSeries();
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				if (resolve) return getNumberOfInstances();
				return basicGetNumberOfInstances();
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE:
				return getProcedures();
			case ResourcesPackage.IMAGING_STUDY__REASON:
				if (resolve) return getReason();
				return basicGetReason();
			case ResourcesPackage.IMAGING_STUDY__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.IMAGING_STUDY__SERIES:
				return getSeries();
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
			case ResourcesPackage.IMAGING_STUDY__UID:
				setUid((Oid)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__ACCESSION:
				setAccession((Identifier)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__AVAILABILITY:
				setAvailability((Code)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__MODALITY_LIST:
				getModalityLists().clear();
				getModalityLists().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__PATIENT:
				setPatient((Patient)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__CONTEXT:
				setContext((Resource)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__STARTED:
				setStarted((DateTime)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__REFERRER:
				setReferrer((Practitioner)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__INTERPRETER:
				getInterpreters().clear();
				getInterpreters().addAll((Collection<? extends Practitioner>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__BASE_LOCATION:
				getBaseLocations().clear();
				getBaseLocations().addAll((Collection<? extends ImagingStudyStudyBaseLocation>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				setNumberOfSeries((UnsignedInt)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE:
				getProcedures().clear();
				getProcedures().addAll((Collection<? extends Procedure>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__REASON:
				setReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends ImagingStudySeries>)newValue);
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
			case ResourcesPackage.IMAGING_STUDY__UID:
				setUid((Oid)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__ACCESSION:
				setAccession((Identifier)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__AVAILABILITY:
				setAvailability((Code)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__MODALITY_LIST:
				getModalityLists().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__PATIENT:
				setPatient((Patient)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__CONTEXT:
				setContext((Resource)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__STARTED:
				setStarted((DateTime)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__REFERRER:
				setReferrer((Practitioner)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__INTERPRETER:
				getInterpreters().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__BASE_LOCATION:
				getBaseLocations().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				setNumberOfSeries((UnsignedInt)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE:
				getProcedures().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__REASON:
				setReason((CodeableConcept)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__SERIES:
				getSeries().clear();
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
			case ResourcesPackage.IMAGING_STUDY__UID:
				return uid != null;
			case ResourcesPackage.IMAGING_STUDY__ACCESSION:
				return accession != null;
			case ResourcesPackage.IMAGING_STUDY__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__AVAILABILITY:
				return availability != null;
			case ResourcesPackage.IMAGING_STUDY__MODALITY_LIST:
				return modalityLists != null && !modalityLists.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__PATIENT:
				return patient != null;
			case ResourcesPackage.IMAGING_STUDY__CONTEXT:
				return context != null;
			case ResourcesPackage.IMAGING_STUDY__STARTED:
				return started != null;
			case ResourcesPackage.IMAGING_STUDY__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__REFERRER:
				return referrer != null;
			case ResourcesPackage.IMAGING_STUDY__INTERPRETER:
				return interpreters != null && !interpreters.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__BASE_LOCATION:
				return baseLocations != null && !baseLocations.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				return numberOfSeries != null;
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				return numberOfInstances != null;
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE:
				return procedures != null && !procedures.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__REASON:
				return reason != null;
			case ResourcesPackage.IMAGING_STUDY__DESCRIPTION:
				return description != null;
			case ResourcesPackage.IMAGING_STUDY__SERIES:
				return series != null && !series.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingStudyImpl
