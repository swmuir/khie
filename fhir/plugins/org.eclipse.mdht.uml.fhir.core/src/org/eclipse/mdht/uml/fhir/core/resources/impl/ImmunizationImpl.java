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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Date;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;
import org.eclipse.mdht.uml.fhir.core.resources.Encounter;
import org.eclipse.mdht.uml.fhir.core.resources.Immunization;
import org.eclipse.mdht.uml.fhir.core.resources.ImmunizationExplanation;
import org.eclipse.mdht.uml.fhir.core.resources.ImmunizationReaction;
import org.eclipse.mdht.uml.fhir.core.resources.ImmunizationVaccinationProtocol;
import org.eclipse.mdht.uml.fhir.core.resources.Location;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getVaccineCode <em>Vaccine Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getWasNotGiven <em>Was Not Given</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getPrimarySource <em>Primary Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getReportOrigin <em>Report Origin</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getReactions <em>Reaction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationImpl#getVaccinationProtocols <em>Vaccination Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmunizationImpl extends DomainResourceImpl implements Immunization {
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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getVaccineCode() <em>Vaccine Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccineCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept vaccineCode;

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
	 * The cached value of the '{@link #getWasNotGiven() <em>Was Not Given</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWasNotGiven()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean wasNotGiven;

	/**
	 * The cached value of the '{@link #getPrimarySource() <em>Primary Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimarySource()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean primarySource;

	/**
	 * The cached value of the '{@link #getReportOrigin() <em>Report Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportOrigin()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reportOrigin;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Practitioner performer;

	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected Practitioner requester;

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
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected Organization manufacturer;

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
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String lotNumber;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected Date expirationDate;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept site;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept route;

	/**
	 * The cached value of the '{@link #getDoseQuantity() <em>Dose Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity doseQuantity;

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
	 * The cached value of the '{@link #getExplanation() <em>Explanation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanation()
	 * @generated
	 * @ordered
	 */
	protected ImmunizationExplanation explanation;

	/**
	 * The cached value of the '{@link #getReactions() <em>Reaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationReaction> reactions;

	/**
	 * The cached value of the '{@link #getVaccinationProtocols() <em>Vaccination Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccinationProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationVaccinationProtocol> vaccinationProtocols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImmunization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.IMMUNIZATION__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getVaccineCode() {
		if (vaccineCode != null && vaccineCode.eIsProxy()) {
			InternalEObject oldVaccineCode = (InternalEObject)vaccineCode;
			vaccineCode = (CodeableConcept)eResolveProxy(oldVaccineCode);
			if (vaccineCode != oldVaccineCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__VACCINE_CODE, oldVaccineCode, vaccineCode));
			}
		}
		return vaccineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetVaccineCode() {
		return vaccineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaccineCode(CodeableConcept newVaccineCode) {
		CodeableConcept oldVaccineCode = vaccineCode;
		vaccineCode = newVaccineCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__VACCINE_CODE, oldVaccineCode, vaccineCode));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getWasNotGiven() {
		if (wasNotGiven != null && wasNotGiven.eIsProxy()) {
			InternalEObject oldWasNotGiven = (InternalEObject)wasNotGiven;
			wasNotGiven = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldWasNotGiven);
			if (wasNotGiven != oldWasNotGiven) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__WAS_NOT_GIVEN, oldWasNotGiven, wasNotGiven));
			}
		}
		return wasNotGiven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetWasNotGiven() {
		return wasNotGiven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasNotGiven(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newWasNotGiven) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldWasNotGiven = wasNotGiven;
		wasNotGiven = newWasNotGiven;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__WAS_NOT_GIVEN, oldWasNotGiven, wasNotGiven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getPrimarySource() {
		if (primarySource != null && primarySource.eIsProxy()) {
			InternalEObject oldPrimarySource = (InternalEObject)primarySource;
			primarySource = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldPrimarySource);
			if (primarySource != oldPrimarySource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE, oldPrimarySource, primarySource));
			}
		}
		return primarySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetPrimarySource() {
		return primarySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimarySource(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newPrimarySource) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldPrimarySource = primarySource;
		primarySource = newPrimarySource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE, oldPrimarySource, primarySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReportOrigin() {
		if (reportOrigin != null && reportOrigin.eIsProxy()) {
			InternalEObject oldReportOrigin = (InternalEObject)reportOrigin;
			reportOrigin = (CodeableConcept)eResolveProxy(oldReportOrigin);
			if (reportOrigin != oldReportOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN, oldReportOrigin, reportOrigin));
			}
		}
		return reportOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetReportOrigin() {
		return reportOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportOrigin(CodeableConcept newReportOrigin) {
		CodeableConcept oldReportOrigin = reportOrigin;
		reportOrigin = newReportOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN, oldReportOrigin, reportOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getPerformer() {
		if (performer != null && performer.eIsProxy()) {
			InternalEObject oldPerformer = (InternalEObject)performer;
			performer = (Practitioner)eResolveProxy(oldPerformer);
			if (performer != oldPerformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__PERFORMER, oldPerformer, performer));
			}
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Practitioner newPerformer) {
		Practitioner oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__PERFORMER, oldPerformer, performer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getRequester() {
		if (requester != null && requester.eIsProxy()) {
			InternalEObject oldRequester = (InternalEObject)requester;
			requester = (Practitioner)eResolveProxy(oldRequester);
			if (requester != oldRequester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__REQUESTER, oldRequester, requester));
			}
		}
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(Practitioner newRequester) {
		Practitioner oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__REQUESTER, oldRequester, requester));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__ENCOUNTER, oldEncounter, encounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__ENCOUNTER, oldEncounter, encounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getManufacturer() {
		if (manufacturer != null && manufacturer.eIsProxy()) {
			InternalEObject oldManufacturer = (InternalEObject)manufacturer;
			manufacturer = (Organization)eResolveProxy(oldManufacturer);
			if (manufacturer != oldManufacturer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__MANUFACTURER, oldManufacturer, manufacturer));
			}
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(Organization newManufacturer) {
		Organization oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__MANUFACTURER, oldManufacturer, manufacturer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getLotNumber() {
		if (lotNumber != null && lotNumber.eIsProxy()) {
			InternalEObject oldLotNumber = (InternalEObject)lotNumber;
			lotNumber = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldLotNumber);
			if (lotNumber != oldLotNumber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__LOT_NUMBER, oldLotNumber, lotNumber));
			}
		}
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetLotNumber() {
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLotNumber(org.eclipse.mdht.uml.fhir.core.dataTypes.String newLotNumber) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldLotNumber = lotNumber;
		lotNumber = newLotNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__LOT_NUMBER, oldLotNumber, lotNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpirationDate() {
		if (expirationDate != null && expirationDate.eIsProxy()) {
			InternalEObject oldExpirationDate = (InternalEObject)expirationDate;
			expirationDate = (Date)eResolveProxy(oldExpirationDate);
			if (expirationDate != oldExpirationDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE, oldExpirationDate, expirationDate));
			}
		}
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(Date newExpirationDate) {
		Date oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE, oldExpirationDate, expirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSite() {
		if (site != null && site.eIsProxy()) {
			InternalEObject oldSite = (InternalEObject)site;
			site = (CodeableConcept)eResolveProxy(oldSite);
			if (site != oldSite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__SITE, oldSite, site));
			}
		}
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite(CodeableConcept newSite) {
		CodeableConcept oldSite = site;
		site = newSite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__SITE, oldSite, site));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRoute() {
		if (route != null && route.eIsProxy()) {
			InternalEObject oldRoute = (InternalEObject)route;
			route = (CodeableConcept)eResolveProxy(oldRoute);
			if (route != oldRoute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__ROUTE, oldRoute, route));
			}
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(CodeableConcept newRoute) {
		CodeableConcept oldRoute = route;
		route = newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getDoseQuantity() {
		if (doseQuantity != null && doseQuantity.eIsProxy()) {
			InternalEObject oldDoseQuantity = (InternalEObject)doseQuantity;
			doseQuantity = (SimpleQuantity)eResolveProxy(oldDoseQuantity);
			if (doseQuantity != oldDoseQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY, oldDoseQuantity, doseQuantity));
			}
		}
		return doseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetDoseQuantity() {
		return doseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseQuantity(SimpleQuantity newDoseQuantity) {
		SimpleQuantity oldDoseQuantity = doseQuantity;
		doseQuantity = newDoseQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY, oldDoseQuantity, doseQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.IMMUNIZATION__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationExplanation getExplanation() {
		return explanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExplanation(ImmunizationExplanation newExplanation, NotificationChain msgs) {
		ImmunizationExplanation oldExplanation = explanation;
		explanation = newExplanation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__EXPLANATION, oldExplanation, newExplanation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplanation(ImmunizationExplanation newExplanation) {
		if (newExplanation != explanation) {
			NotificationChain msgs = null;
			if (explanation != null)
				msgs = ((InternalEObject)explanation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__EXPLANATION, null, msgs);
			if (newExplanation != null)
				msgs = ((InternalEObject)newExplanation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__EXPLANATION, null, msgs);
			msgs = basicSetExplanation(newExplanation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__EXPLANATION, newExplanation, newExplanation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationReaction> getReactions() {
		if (reactions == null) {
			reactions = new EObjectContainmentEList<ImmunizationReaction>(ImmunizationReaction.class, this, ResourcesPackage.IMMUNIZATION__REACTION);
		}
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationVaccinationProtocol> getVaccinationProtocols() {
		if (vaccinationProtocols == null) {
			vaccinationProtocols = new EObjectContainmentEList<ImmunizationVaccinationProtocol>(ImmunizationVaccinationProtocol.class, this, ResourcesPackage.IMMUNIZATION__VACCINATION_PROTOCOL);
		}
		return vaccinationProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMMUNIZATION__EXPLANATION:
				return basicSetExplanation(null, msgs);
			case ResourcesPackage.IMMUNIZATION__REACTION:
				return ((InternalEList<?>)getReactions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				return ((InternalEList<?>)getVaccinationProtocols()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.IMMUNIZATION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.IMMUNIZATION__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.IMMUNIZATION__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case ResourcesPackage.IMMUNIZATION__VACCINE_CODE:
				if (resolve) return getVaccineCode();
				return basicGetVaccineCode();
			case ResourcesPackage.IMMUNIZATION__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case ResourcesPackage.IMMUNIZATION__WAS_NOT_GIVEN:
				if (resolve) return getWasNotGiven();
				return basicGetWasNotGiven();
			case ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE:
				if (resolve) return getPrimarySource();
				return basicGetPrimarySource();
			case ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN:
				if (resolve) return getReportOrigin();
				return basicGetReportOrigin();
			case ResourcesPackage.IMMUNIZATION__PERFORMER:
				if (resolve) return getPerformer();
				return basicGetPerformer();
			case ResourcesPackage.IMMUNIZATION__REQUESTER:
				if (resolve) return getRequester();
				return basicGetRequester();
			case ResourcesPackage.IMMUNIZATION__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case ResourcesPackage.IMMUNIZATION__MANUFACTURER:
				if (resolve) return getManufacturer();
				return basicGetManufacturer();
			case ResourcesPackage.IMMUNIZATION__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case ResourcesPackage.IMMUNIZATION__LOT_NUMBER:
				if (resolve) return getLotNumber();
				return basicGetLotNumber();
			case ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE:
				if (resolve) return getExpirationDate();
				return basicGetExpirationDate();
			case ResourcesPackage.IMMUNIZATION__SITE:
				if (resolve) return getSite();
				return basicGetSite();
			case ResourcesPackage.IMMUNIZATION__ROUTE:
				if (resolve) return getRoute();
				return basicGetRoute();
			case ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY:
				if (resolve) return getDoseQuantity();
				return basicGetDoseQuantity();
			case ResourcesPackage.IMMUNIZATION__NOTE:
				return getNotes();
			case ResourcesPackage.IMMUNIZATION__EXPLANATION:
				return getExplanation();
			case ResourcesPackage.IMMUNIZATION__REACTION:
				return getReactions();
			case ResourcesPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				return getVaccinationProtocols();
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
			case ResourcesPackage.IMMUNIZATION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__VACCINE_CODE:
				setVaccineCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__PATIENT:
				setPatient((Patient)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__WAS_NOT_GIVEN:
				setWasNotGiven((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE:
				setPrimarySource((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN:
				setReportOrigin((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__PERFORMER:
				setPerformer((Practitioner)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__REQUESTER:
				setRequester((Practitioner)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__MANUFACTURER:
				setManufacturer((Organization)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__LOCATION:
				setLocation((Location)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__LOT_NUMBER:
				setLotNumber((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE:
				setExpirationDate((Date)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__SITE:
				setSite((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY:
				setDoseQuantity((SimpleQuantity)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__EXPLANATION:
				setExplanation((ImmunizationExplanation)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__REACTION:
				getReactions().clear();
				getReactions().addAll((Collection<? extends ImmunizationReaction>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				getVaccinationProtocols().clear();
				getVaccinationProtocols().addAll((Collection<? extends ImmunizationVaccinationProtocol>)newValue);
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
			case ResourcesPackage.IMMUNIZATION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.IMMUNIZATION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.IMMUNIZATION__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.IMMUNIZATION__VACCINE_CODE:
				setVaccineCode((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION__PATIENT:
				setPatient((Patient)null);
				return;
			case ResourcesPackage.IMMUNIZATION__WAS_NOT_GIVEN:
				setWasNotGiven((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE:
				setPrimarySource((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN:
				setReportOrigin((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION__PERFORMER:
				setPerformer((Practitioner)null);
				return;
			case ResourcesPackage.IMMUNIZATION__REQUESTER:
				setRequester((Practitioner)null);
				return;
			case ResourcesPackage.IMMUNIZATION__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case ResourcesPackage.IMMUNIZATION__MANUFACTURER:
				setManufacturer((Organization)null);
				return;
			case ResourcesPackage.IMMUNIZATION__LOCATION:
				setLocation((Location)null);
				return;
			case ResourcesPackage.IMMUNIZATION__LOT_NUMBER:
				setLotNumber((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE:
				setExpirationDate((Date)null);
				return;
			case ResourcesPackage.IMMUNIZATION__SITE:
				setSite((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY:
				setDoseQuantity((SimpleQuantity)null);
				return;
			case ResourcesPackage.IMMUNIZATION__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.IMMUNIZATION__EXPLANATION:
				setExplanation((ImmunizationExplanation)null);
				return;
			case ResourcesPackage.IMMUNIZATION__REACTION:
				getReactions().clear();
				return;
			case ResourcesPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				getVaccinationProtocols().clear();
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
			case ResourcesPackage.IMMUNIZATION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.IMMUNIZATION__STATUS:
				return status != null;
			case ResourcesPackage.IMMUNIZATION__DATE:
				return date != null;
			case ResourcesPackage.IMMUNIZATION__VACCINE_CODE:
				return vaccineCode != null;
			case ResourcesPackage.IMMUNIZATION__PATIENT:
				return patient != null;
			case ResourcesPackage.IMMUNIZATION__WAS_NOT_GIVEN:
				return wasNotGiven != null;
			case ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE:
				return primarySource != null;
			case ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN:
				return reportOrigin != null;
			case ResourcesPackage.IMMUNIZATION__PERFORMER:
				return performer != null;
			case ResourcesPackage.IMMUNIZATION__REQUESTER:
				return requester != null;
			case ResourcesPackage.IMMUNIZATION__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.IMMUNIZATION__MANUFACTURER:
				return manufacturer != null;
			case ResourcesPackage.IMMUNIZATION__LOCATION:
				return location != null;
			case ResourcesPackage.IMMUNIZATION__LOT_NUMBER:
				return lotNumber != null;
			case ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE:
				return expirationDate != null;
			case ResourcesPackage.IMMUNIZATION__SITE:
				return site != null;
			case ResourcesPackage.IMMUNIZATION__ROUTE:
				return route != null;
			case ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY:
				return doseQuantity != null;
			case ResourcesPackage.IMMUNIZATION__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.IMMUNIZATION__EXPLANATION:
				return explanation != null;
			case ResourcesPackage.IMMUNIZATION__REACTION:
				return reactions != null && !reactions.isEmpty();
			case ResourcesPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				return vaccinationProtocols != null && !vaccinationProtocols.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationImpl
