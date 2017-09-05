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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;
import org.eclipse.mdht.uml.fhir.core.resources.Location;
import org.eclipse.mdht.uml.fhir.core.resources.MedicationDispense;
import org.eclipse.mdht.uml.fhir.core.resources.MedicationDispenseSubstitution;
import org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.Provenance;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Dispense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getDispenser <em>Dispenser</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getDispensingOrganization <em>Dispensing Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getAuthorizingPrescriptions <em>Authorizing Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getDaysSupply <em>Days Supply</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getWhenPrepared <em>When Prepared</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getWhenHandedOver <em>When Handed Over</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getReceivers <em>Receiver</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getDosageInstructions <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseImpl#getEventHistories <em>Event History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationDispenseImpl extends DomainResourceImpl implements MedicationDispense {
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
	 * The cached value of the '{@link #getMedicationx() <em>Medicationx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationx()
	 * @generated
	 * @ordered
	 */
	protected Base medicationx;

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
	 * The cached value of the '{@link #getSupportingInformations() <em>Supporting Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> supportingInformations;

	/**
	 * The cached value of the '{@link #getDispenser() <em>Dispenser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispenser()
	 * @generated
	 * @ordered
	 */
	protected Practitioner dispenser;

	/**
	 * The cached value of the '{@link #getDispensingOrganization() <em>Dispensing Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispensingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization dispensingOrganization;

	/**
	 * The cached value of the '{@link #getAuthorizingPrescriptions() <em>Authorizing Prescription</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizingPrescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationRequest> authorizingPrescriptions;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

	/**
	 * The cached value of the '{@link #getDaysSupply() <em>Days Supply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysSupply()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity daysSupply;

	/**
	 * The cached value of the '{@link #getWhenPrepared() <em>When Prepared</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenPrepared()
	 * @generated
	 * @ordered
	 */
	protected DateTime whenPrepared;

	/**
	 * The cached value of the '{@link #getWhenHandedOver() <em>When Handed Over</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenHandedOver()
	 * @generated
	 * @ordered
	 */
	protected DateTime whenHandedOver;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Location destination;

	/**
	 * The cached value of the '{@link #getReceivers() <em>Receiver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> receivers;

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
	 * The cached value of the '{@link #getDosageInstructions() <em>Dosage Instruction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosageInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<DosageInstruction> dosageInstructions;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected MedicationDispenseSubstitution substitution;

	/**
	 * The cached value of the '{@link #getEventHistories() <em>Event History</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<Provenance> eventHistories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationDispenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationDispense();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_DISPENSE__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__IDENTIFIER, oldIdentifier, identifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_DISPENSE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getMedicationx() {
		if (medicationx != null && medicationx.eIsProxy()) {
			InternalEObject oldMedicationx = (InternalEObject)medicationx;
			medicationx = (Base)eResolveProxy(oldMedicationx);
			if (medicationx != oldMedicationx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX, oldMedicationx, medicationx));
			}
		}
		return medicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetMedicationx() {
		return medicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationx(Base newMedicationx) {
		Base oldMedicationx = medicationx;
		medicationx = newMedicationx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX, oldMedicationx, medicationx));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_DISPENSE__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getSupportingInformations() {
		if (supportingInformations == null) {
			supportingInformations = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION);
		}
		return supportingInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getDispenser() {
		if (dispenser != null && dispenser.eIsProxy()) {
			InternalEObject oldDispenser = (InternalEObject)dispenser;
			dispenser = (Practitioner)eResolveProxy(oldDispenser);
			if (dispenser != oldDispenser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_DISPENSE__DISPENSER, oldDispenser, dispenser));
			}
		}
		return dispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetDispenser() {
		return dispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispenser(Practitioner newDispenser) {
		Practitioner oldDispenser = dispenser;
		dispenser = newDispenser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__DISPENSER, oldDispenser, dispenser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getDispensingOrganization() {
		if (dispensingOrganization != null && dispensingOrganization.eIsProxy()) {
			InternalEObject oldDispensingOrganization = (InternalEObject)dispensingOrganization;
			dispensingOrganization = (Organization)eResolveProxy(oldDispensingOrganization);
			if (dispensingOrganization != oldDispensingOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_DISPENSE__DISPENSING_ORGANIZATION, oldDispensingOrganization, dispensingOrganization));
			}
		}
		return dispensingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetDispensingOrganization() {
		return dispensingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispensingOrganization(Organization newDispensingOrganization) {
		Organization oldDispensingOrganization = dispensingOrganization;
		dispensingOrganization = newDispensingOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__DISPENSING_ORGANIZATION, oldDispensingOrganization, dispensingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationRequest> getAuthorizingPrescriptions() {
		if (authorizingPrescriptions == null) {
			authorizingPrescriptions = new EObjectResolvingEList<MedicationRequest>(MedicationRequest.class, this, ResourcesPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION);
		}
		return authorizingPrescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CodeableConcept)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_DISPENSE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		if (quantity != null && quantity.eIsProxy()) {
			InternalEObject oldQuantity = (InternalEObject)quantity;
			quantity = (SimpleQuantity)eResolveProxy(oldQuantity);
			if (quantity != oldQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_DISPENSE__QUANTITY, oldQuantity, quantity));
			}
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getDaysSupply() {
		if (daysSupply != null && daysSupply.eIsProxy()) {
			InternalEObject oldDaysSupply = (InternalEObject)daysSupply;
			daysSupply = (SimpleQuantity)eResolveProxy(oldDaysSupply);
			if (daysSupply != oldDaysSupply) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, oldDaysSupply, daysSupply));
			}
		}
		return daysSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetDaysSupply() {
		return daysSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaysSupply(SimpleQuantity newDaysSupply) {
		SimpleQuantity oldDaysSupply = daysSupply;
		daysSupply = newDaysSupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, oldDaysSupply, daysSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getWhenPrepared() {
		if (whenPrepared != null && whenPrepared.eIsProxy()) {
			InternalEObject oldWhenPrepared = (InternalEObject)whenPrepared;
			whenPrepared = (DateTime)eResolveProxy(oldWhenPrepared);
			if (whenPrepared != oldWhenPrepared) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED, oldWhenPrepared, whenPrepared));
			}
		}
		return whenPrepared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetWhenPrepared() {
		return whenPrepared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenPrepared(DateTime newWhenPrepared) {
		DateTime oldWhenPrepared = whenPrepared;
		whenPrepared = newWhenPrepared;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED, oldWhenPrepared, whenPrepared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getWhenHandedOver() {
		if (whenHandedOver != null && whenHandedOver.eIsProxy()) {
			InternalEObject oldWhenHandedOver = (InternalEObject)whenHandedOver;
			whenHandedOver = (DateTime)eResolveProxy(oldWhenHandedOver);
			if (whenHandedOver != oldWhenHandedOver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, oldWhenHandedOver, whenHandedOver));
			}
		}
		return whenHandedOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetWhenHandedOver() {
		return whenHandedOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenHandedOver(DateTime newWhenHandedOver) {
		DateTime oldWhenHandedOver = whenHandedOver;
		whenHandedOver = newWhenHandedOver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, oldWhenHandedOver, whenHandedOver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (Location)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_DISPENSE__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Location newDestination) {
		Location oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.MEDICATION_DISPENSE__RECEIVER);
		}
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.MEDICATION_DISPENSE__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DosageInstruction> getDosageInstructions() {
		if (dosageInstructions == null) {
			dosageInstructions = new EObjectResolvingEList<DosageInstruction>(DosageInstruction.class, this, ResourcesPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION);
		}
		return dosageInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseSubstitution getSubstitution() {
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(MedicationDispenseSubstitution newSubstitution, NotificationChain msgs) {
		MedicationDispenseSubstitution oldSubstitution = substitution;
		substitution = newSubstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION, oldSubstitution, newSubstitution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitution(MedicationDispenseSubstitution newSubstitution) {
		if (newSubstitution != substitution) {
			NotificationChain msgs = null;
			if (substitution != null)
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION, newSubstitution, newSubstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provenance> getEventHistories() {
		if (eventHistories == null) {
			eventHistories = new EObjectResolvingEList<Provenance>(Provenance.class, this, ResourcesPackage.MEDICATION_DISPENSE__EVENT_HISTORY);
		}
		return eventHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
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
			case ResourcesPackage.MEDICATION_DISPENSE__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX:
				if (resolve) return getMedicationx();
				return basicGetMedicationx();
			case ResourcesPackage.MEDICATION_DISPENSE__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case ResourcesPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				return getSupportingInformations();
			case ResourcesPackage.MEDICATION_DISPENSE__DISPENSER:
				if (resolve) return getDispenser();
				return basicGetDispenser();
			case ResourcesPackage.MEDICATION_DISPENSE__DISPENSING_ORGANIZATION:
				if (resolve) return getDispensingOrganization();
				return basicGetDispensingOrganization();
			case ResourcesPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				return getAuthorizingPrescriptions();
			case ResourcesPackage.MEDICATION_DISPENSE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.MEDICATION_DISPENSE__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				if (resolve) return getDaysSupply();
				return basicGetDaysSupply();
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				if (resolve) return getWhenPrepared();
				return basicGetWhenPrepared();
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				if (resolve) return getWhenHandedOver();
				return basicGetWhenHandedOver();
			case ResourcesPackage.MEDICATION_DISPENSE__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case ResourcesPackage.MEDICATION_DISPENSE__RECEIVER:
				return getReceivers();
			case ResourcesPackage.MEDICATION_DISPENSE__NOTE:
				return getNotes();
			case ResourcesPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return getDosageInstructions();
			case ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return getSubstitution();
			case ResourcesPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				return getEventHistories();
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
			case ResourcesPackage.MEDICATION_DISPENSE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX:
				setMedicationx((Base)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__PATIENT:
				setPatient((Patient)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				getSupportingInformations().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DISPENSER:
				setDispenser((Practitioner)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DISPENSING_ORGANIZATION:
				setDispensingOrganization((Organization)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				getAuthorizingPrescriptions().clear();
				getAuthorizingPrescriptions().addAll((Collection<? extends MedicationRequest>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				setDaysSupply((SimpleQuantity)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				setWhenPrepared((DateTime)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DESTINATION:
				setDestination((Location)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__RECEIVER:
				getReceivers().clear();
				getReceivers().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				getDosageInstructions().clear();
				getDosageInstructions().addAll((Collection<? extends DosageInstruction>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				setSubstitution((MedicationDispenseSubstitution)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				getEventHistories().clear();
				getEventHistories().addAll((Collection<? extends Provenance>)newValue);
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
			case ResourcesPackage.MEDICATION_DISPENSE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX:
				setMedicationx((Base)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__PATIENT:
				setPatient((Patient)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DISPENSER:
				setDispenser((Practitioner)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DISPENSING_ORGANIZATION:
				setDispensingOrganization((Organization)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				getAuthorizingPrescriptions().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				setDaysSupply((SimpleQuantity)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				setWhenPrepared((DateTime)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DESTINATION:
				setDestination((Location)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__RECEIVER:
				getReceivers().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				getDosageInstructions().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				setSubstitution((MedicationDispenseSubstitution)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				getEventHistories().clear();
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
			case ResourcesPackage.MEDICATION_DISPENSE__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS:
				return status != null;
			case ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX:
				return medicationx != null;
			case ResourcesPackage.MEDICATION_DISPENSE__PATIENT:
				return patient != null;
			case ResourcesPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				return supportingInformations != null && !supportingInformations.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__DISPENSER:
				return dispenser != null;
			case ResourcesPackage.MEDICATION_DISPENSE__DISPENSING_ORGANIZATION:
				return dispensingOrganization != null;
			case ResourcesPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				return authorizingPrescriptions != null && !authorizingPrescriptions.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__TYPE:
				return type != null;
			case ResourcesPackage.MEDICATION_DISPENSE__QUANTITY:
				return quantity != null;
			case ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				return daysSupply != null;
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				return whenPrepared != null;
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				return whenHandedOver != null;
			case ResourcesPackage.MEDICATION_DISPENSE__DESTINATION:
				return destination != null;
			case ResourcesPackage.MEDICATION_DISPENSE__RECEIVER:
				return receivers != null && !receivers.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return dosageInstructions != null && !dosageInstructions.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return substitution != null;
			case ResourcesPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				return eventHistories != null && !eventHistories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationDispenseImpl
