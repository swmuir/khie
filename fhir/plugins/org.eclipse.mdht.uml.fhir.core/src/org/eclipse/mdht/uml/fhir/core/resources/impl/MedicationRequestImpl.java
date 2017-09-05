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
import org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest;
import org.eclipse.mdht.uml.fhir.core.resources.MedicationRequestDispenseRequest;
import org.eclipse.mdht.uml.fhir.core.resources.MedicationRequestSubstitution;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.Provenance;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getDefinitions <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getRequisition <em>Requisition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getDateWritten <em>Date Written</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getDosageInstructions <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getDispenseRequest <em>Dispense Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getPriorPrescription <em>Prior Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestImpl#getEventHistories <em>Event History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationRequestImpl extends DomainResourceImpl implements MedicationRequest {
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
	 * The cached value of the '{@link #getDefinitions() <em>Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> definitions;

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
	 * The cached value of the '{@link #getRequisition() <em>Requisition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequisition()
	 * @generated
	 * @ordered
	 */
	protected Identifier requisition;

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
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept stage;

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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Resource context;

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
	 * The cached value of the '{@link #getDateWritten() <em>Date Written</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateWritten()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateWritten;

	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected Resource requester;

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
	 * The cached value of the '{@link #getReasonReferences() <em>Reason Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> reasonReferences;

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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

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
	 * The cached value of the '{@link #getDispenseRequest() <em>Dispense Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispenseRequest()
	 * @generated
	 * @ordered
	 */
	protected MedicationRequestDispenseRequest dispenseRequest;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected MedicationRequestSubstitution substitution;

	/**
	 * The cached value of the '{@link #getPriorPrescription() <em>Prior Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorPrescription()
	 * @generated
	 * @ordered
	 */
	protected MedicationRequest priorPrescription;

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
	protected MedicationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICATION_REQUEST__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.MEDICATION_REQUEST__DEFINITION);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.MEDICATION_REQUEST__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getRequisition() {
		if (requisition != null && requisition.eIsProxy()) {
			InternalEObject oldRequisition = (InternalEObject)requisition;
			requisition = (Identifier)eResolveProxy(oldRequisition);
			if (requisition != oldRequisition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST__REQUISITION, oldRequisition, requisition));
			}
		}
		return requisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetRequisition() {
		return requisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequisition(Identifier newRequisition) {
		Identifier oldRequisition = requisition;
		requisition = newRequisition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__REQUISITION, oldRequisition, requisition));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStage() {
		if (stage != null && stage.eIsProxy()) {
			InternalEObject oldStage = (InternalEObject)stage;
			stage = (CodeableConcept)eResolveProxy(oldStage);
			if (stage != oldStage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST__STAGE, oldStage, stage));
			}
		}
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(CodeableConcept newStage) {
		CodeableConcept oldStage = stage;
		stage = newStage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__STAGE, oldStage, stage));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX, oldMedicationx, medicationx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX, oldMedicationx, medicationx));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__PATIENT, oldPatient, patient));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getSupportingInformations() {
		if (supportingInformations == null) {
			supportingInformations = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION);
		}
		return supportingInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateWritten() {
		if (dateWritten != null && dateWritten.eIsProxy()) {
			InternalEObject oldDateWritten = (InternalEObject)dateWritten;
			dateWritten = (DateTime)eResolveProxy(oldDateWritten);
			if (dateWritten != oldDateWritten) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST__DATE_WRITTEN, oldDateWritten, dateWritten));
			}
		}
		return dateWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDateWritten() {
		return dateWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateWritten(DateTime newDateWritten) {
		DateTime oldDateWritten = dateWritten;
		dateWritten = newDateWritten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__DATE_WRITTEN, oldDateWritten, dateWritten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRequester() {
		if (requester != null && requester.eIsProxy()) {
			InternalEObject oldRequester = (InternalEObject)requester;
			requester = (Resource)eResolveProxy(oldRequester);
			if (requester != oldRequester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST__REQUESTER, oldRequester, requester));
			}
		}
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(Resource newRequester) {
		Resource oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__REQUESTER, oldRequester, requester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICATION_REQUEST__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.MEDICATION_REQUEST__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.MEDICATION_REQUEST__NOTE);
		}
		return notes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DosageInstruction> getDosageInstructions() {
		if (dosageInstructions == null) {
			dosageInstructions = new EObjectResolvingEList<DosageInstruction>(DosageInstruction.class, this, ResourcesPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION);
		}
		return dosageInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestDispenseRequest getDispenseRequest() {
		return dispenseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispenseRequest(MedicationRequestDispenseRequest newDispenseRequest, NotificationChain msgs) {
		MedicationRequestDispenseRequest oldDispenseRequest = dispenseRequest;
		dispenseRequest = newDispenseRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, oldDispenseRequest, newDispenseRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispenseRequest(MedicationRequestDispenseRequest newDispenseRequest) {
		if (newDispenseRequest != dispenseRequest) {
			NotificationChain msgs = null;
			if (dispenseRequest != null)
				msgs = ((InternalEObject)dispenseRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, null, msgs);
			if (newDispenseRequest != null)
				msgs = ((InternalEObject)newDispenseRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, null, msgs);
			msgs = basicSetDispenseRequest(newDispenseRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, newDispenseRequest, newDispenseRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestSubstitution getSubstitution() {
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(MedicationRequestSubstitution newSubstitution, NotificationChain msgs) {
		MedicationRequestSubstitution oldSubstitution = substitution;
		substitution = newSubstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION, oldSubstitution, newSubstitution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitution(MedicationRequestSubstitution newSubstitution) {
		if (newSubstitution != substitution) {
			NotificationChain msgs = null;
			if (substitution != null)
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION, newSubstitution, newSubstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequest getPriorPrescription() {
		if (priorPrescription != null && priorPrescription.eIsProxy()) {
			InternalEObject oldPriorPrescription = (InternalEObject)priorPrescription;
			priorPrescription = (MedicationRequest)eResolveProxy(oldPriorPrescription);
			if (priorPrescription != oldPriorPrescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, oldPriorPrescription, priorPrescription));
			}
		}
		return priorPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequest basicGetPriorPrescription() {
		return priorPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorPrescription(MedicationRequest newPriorPrescription) {
		MedicationRequest oldPriorPrescription = priorPrescription;
		priorPrescription = newPriorPrescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, oldPriorPrescription, priorPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provenance> getEventHistories() {
		if (eventHistories == null) {
			eventHistories = new EObjectResolvingEList<Provenance>(Provenance.class, this, ResourcesPackage.MEDICATION_REQUEST__EVENT_HISTORY);
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
			case ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				return basicSetDispenseRequest(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION:
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
			case ResourcesPackage.MEDICATION_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDICATION_REQUEST__DEFINITION:
				return getDefinitions();
			case ResourcesPackage.MEDICATION_REQUEST__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.MEDICATION_REQUEST__REQUISITION:
				if (resolve) return getRequisition();
				return basicGetRequisition();
			case ResourcesPackage.MEDICATION_REQUEST__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.MEDICATION_REQUEST__STAGE:
				if (resolve) return getStage();
				return basicGetStage();
			case ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX:
				if (resolve) return getMedicationx();
				return basicGetMedicationx();
			case ResourcesPackage.MEDICATION_REQUEST__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case ResourcesPackage.MEDICATION_REQUEST__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				return getSupportingInformations();
			case ResourcesPackage.MEDICATION_REQUEST__DATE_WRITTEN:
				if (resolve) return getDateWritten();
				return basicGetDateWritten();
			case ResourcesPackage.MEDICATION_REQUEST__REQUESTER:
				if (resolve) return getRequester();
				return basicGetRequester();
			case ResourcesPackage.MEDICATION_REQUEST__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.MEDICATION_REQUEST__NOTE:
				return getNotes();
			case ResourcesPackage.MEDICATION_REQUEST__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case ResourcesPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				return getDosageInstructions();
			case ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				return getDispenseRequest();
			case ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION:
				return getSubstitution();
			case ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				if (resolve) return getPriorPrescription();
				return basicGetPriorPrescription();
			case ResourcesPackage.MEDICATION_REQUEST__EVENT_HISTORY:
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
			case ResourcesPackage.MEDICATION_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DEFINITION:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REQUISITION:
				setRequisition((Identifier)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__STAGE:
				setStage((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX:
				setMedicationx((Base)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__PATIENT:
				setPatient((Patient)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__CONTEXT:
				setContext((Resource)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				getSupportingInformations().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DATE_WRITTEN:
				setDateWritten((DateTime)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REQUESTER:
				setRequester((Resource)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				getDosageInstructions().clear();
				getDosageInstructions().addAll((Collection<? extends DosageInstruction>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				setDispenseRequest((MedicationRequestDispenseRequest)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION:
				setSubstitution((MedicationRequestSubstitution)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				setPriorPrescription((MedicationRequest)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__EVENT_HISTORY:
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
			case ResourcesPackage.MEDICATION_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DEFINITION:
				getDefinitions().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REQUISITION:
				setRequisition((Identifier)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__STAGE:
				setStage((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX:
				setMedicationx((Base)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__PATIENT:
				setPatient((Patient)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__CONTEXT:
				setContext((Resource)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DATE_WRITTEN:
				setDateWritten((DateTime)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REQUESTER:
				setRequester((Resource)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				getDosageInstructions().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				setDispenseRequest((MedicationRequestDispenseRequest)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION:
				setSubstitution((MedicationRequestSubstitution)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				setPriorPrescription((MedicationRequest)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__EVENT_HISTORY:
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
			case ResourcesPackage.MEDICATION_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__DEFINITION:
				return definitions != null && !definitions.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__REQUISITION:
				return requisition != null;
			case ResourcesPackage.MEDICATION_REQUEST__STATUS:
				return status != null;
			case ResourcesPackage.MEDICATION_REQUEST__STAGE:
				return stage != null;
			case ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX:
				return medicationx != null;
			case ResourcesPackage.MEDICATION_REQUEST__PATIENT:
				return patient != null;
			case ResourcesPackage.MEDICATION_REQUEST__CONTEXT:
				return context != null;
			case ResourcesPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				return supportingInformations != null && !supportingInformations.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__DATE_WRITTEN:
				return dateWritten != null;
			case ResourcesPackage.MEDICATION_REQUEST__REQUESTER:
				return requester != null;
			case ResourcesPackage.MEDICATION_REQUEST__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__CATEGORY:
				return category != null;
			case ResourcesPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				return dosageInstructions != null && !dosageInstructions.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				return dispenseRequest != null;
			case ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION:
				return substitution != null;
			case ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				return priorPrescription != null;
			case ResourcesPackage.MEDICATION_REQUEST__EVENT_HISTORY:
				return eventHistories != null && !eventHistories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationRequestImpl
