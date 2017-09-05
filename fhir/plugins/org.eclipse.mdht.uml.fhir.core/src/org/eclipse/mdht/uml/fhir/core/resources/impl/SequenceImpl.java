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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity;
import org.eclipse.mdht.uml.fhir.core.resources.Device;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.Sequence;
import org.eclipse.mdht.uml.fhir.core.resources.SequenceQuality;
import org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq;
import org.eclipse.mdht.uml.fhir.core.resources.SequenceRepository;
import org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariant;
import org.eclipse.mdht.uml.fhir.core.resources.SequenceVariant;
import org.eclipse.mdht.uml.fhir.core.resources.Specimen;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getReferenceSeq <em>Reference Seq</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getVariants <em>Variant</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getObservedSeq <em>Observed Seq</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getQualities <em>Quality</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getReadCoverage <em>Read Coverage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getRepositories <em>Repository</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getPointers <em>Pointer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceImpl#getStructureVariants <em>Structure Variant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceImpl extends DomainResourceImpl implements Sequence {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getCoordinateSystem() <em>Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer coordinateSystem;

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
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected Specimen specimen;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Device device;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Organization performer;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getReferenceSeq() <em>Reference Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSeq()
	 * @generated
	 * @ordered
	 */
	protected SequenceReferenceSeq referenceSeq;

	/**
	 * The cached value of the '{@link #getVariants() <em>Variant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceVariant> variants;

	/**
	 * The cached value of the '{@link #getObservedSeq() <em>Observed Seq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedSeq()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String observedSeq;

	/**
	 * The cached value of the '{@link #getQualities() <em>Quality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualities()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceQuality> qualities;

	/**
	 * The cached value of the '{@link #getReadCoverage() <em>Read Coverage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadCoverage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer readCoverage;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceRepository> repositories;

	/**
	 * The cached value of the '{@link #getPointers() <em>Pointer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointers()
	 * @generated
	 * @ordered
	 */
	protected EList<Sequence> pointers;

	/**
	 * The cached value of the '{@link #getStructureVariants() <em>Structure Variant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceStructureVariant> structureVariants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.SEQUENCE__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getCoordinateSystem() {
		if (coordinateSystem != null && coordinateSystem.eIsProxy()) {
			InternalEObject oldCoordinateSystem = (InternalEObject)coordinateSystem;
			coordinateSystem = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldCoordinateSystem);
			if (coordinateSystem != oldCoordinateSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE__COORDINATE_SYSTEM, oldCoordinateSystem, coordinateSystem));
			}
		}
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetCoordinateSystem() {
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateSystem(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newCoordinateSystem) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldCoordinateSystem = coordinateSystem;
		coordinateSystem = newCoordinateSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE__COORDINATE_SYSTEM, oldCoordinateSystem, coordinateSystem));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen getSpecimen() {
		if (specimen != null && specimen.eIsProxy()) {
			InternalEObject oldSpecimen = (InternalEObject)specimen;
			specimen = (Specimen)eResolveProxy(oldSpecimen);
			if (specimen != oldSpecimen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE__SPECIMEN, oldSpecimen, specimen));
			}
		}
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen basicGetSpecimen() {
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimen(Specimen newSpecimen) {
		Specimen oldSpecimen = specimen;
		specimen = newSpecimen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE__SPECIMEN, oldSpecimen, specimen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevice() {
		if (device != null && device.eIsProxy()) {
			InternalEObject oldDevice = (InternalEObject)device;
			device = (Device)eResolveProxy(oldDevice);
			if (device != oldDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE__DEVICE, oldDevice, device));
			}
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Device newDevice) {
		Device oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getPerformer() {
		if (performer != null && performer.eIsProxy()) {
			InternalEObject oldPerformer = (InternalEObject)performer;
			performer = (Organization)eResolveProxy(oldPerformer);
			if (performer != oldPerformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE__PERFORMER, oldPerformer, performer));
			}
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Organization newPerformer) {
		Organization oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE__PERFORMER, oldPerformer, performer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		if (quantity != null && quantity.eIsProxy()) {
			InternalEObject oldQuantity = (InternalEObject)quantity;
			quantity = (Quantity)eResolveProxy(oldQuantity);
			if (quantity != oldQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE__QUANTITY, oldQuantity, quantity));
			}
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity basicGetQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceReferenceSeq getReferenceSeq() {
		return referenceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSeq(SequenceReferenceSeq newReferenceSeq, NotificationChain msgs) {
		SequenceReferenceSeq oldReferenceSeq = referenceSeq;
		referenceSeq = newReferenceSeq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE__REFERENCE_SEQ, oldReferenceSeq, newReferenceSeq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSeq(SequenceReferenceSeq newReferenceSeq) {
		if (newReferenceSeq != referenceSeq) {
			NotificationChain msgs = null;
			if (referenceSeq != null)
				msgs = ((InternalEObject)referenceSeq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEQUENCE__REFERENCE_SEQ, null, msgs);
			if (newReferenceSeq != null)
				msgs = ((InternalEObject)newReferenceSeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEQUENCE__REFERENCE_SEQ, null, msgs);
			msgs = basicSetReferenceSeq(newReferenceSeq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE__REFERENCE_SEQ, newReferenceSeq, newReferenceSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceVariant> getVariants() {
		if (variants == null) {
			variants = new EObjectContainmentEList<SequenceVariant>(SequenceVariant.class, this, ResourcesPackage.SEQUENCE__VARIANT);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getObservedSeq() {
		if (observedSeq != null && observedSeq.eIsProxy()) {
			InternalEObject oldObservedSeq = (InternalEObject)observedSeq;
			observedSeq = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldObservedSeq);
			if (observedSeq != oldObservedSeq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE__OBSERVED_SEQ, oldObservedSeq, observedSeq));
			}
		}
		return observedSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetObservedSeq() {
		return observedSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservedSeq(org.eclipse.mdht.uml.fhir.core.dataTypes.String newObservedSeq) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldObservedSeq = observedSeq;
		observedSeq = newObservedSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE__OBSERVED_SEQ, oldObservedSeq, observedSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceQuality> getQualities() {
		if (qualities == null) {
			qualities = new EObjectContainmentEList<SequenceQuality>(SequenceQuality.class, this, ResourcesPackage.SEQUENCE__QUALITY);
		}
		return qualities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getReadCoverage() {
		if (readCoverage != null && readCoverage.eIsProxy()) {
			InternalEObject oldReadCoverage = (InternalEObject)readCoverage;
			readCoverage = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldReadCoverage);
			if (readCoverage != oldReadCoverage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE__READ_COVERAGE, oldReadCoverage, readCoverage));
			}
		}
		return readCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetReadCoverage() {
		return readCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadCoverage(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newReadCoverage) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldReadCoverage = readCoverage;
		readCoverage = newReadCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE__READ_COVERAGE, oldReadCoverage, readCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceRepository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<SequenceRepository>(SequenceRepository.class, this, ResourcesPackage.SEQUENCE__REPOSITORY);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sequence> getPointers() {
		if (pointers == null) {
			pointers = new EObjectResolvingEList<Sequence>(Sequence.class, this, ResourcesPackage.SEQUENCE__POINTER);
		}
		return pointers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceStructureVariant> getStructureVariants() {
		if (structureVariants == null) {
			structureVariants = new EObjectContainmentEList<SequenceStructureVariant>(SequenceStructureVariant.class, this, ResourcesPackage.SEQUENCE__STRUCTURE_VARIANT);
		}
		return structureVariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SEQUENCE__REFERENCE_SEQ:
				return basicSetReferenceSeq(null, msgs);
			case ResourcesPackage.SEQUENCE__VARIANT:
				return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SEQUENCE__QUALITY:
				return ((InternalEList<?>)getQualities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SEQUENCE__REPOSITORY:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SEQUENCE__STRUCTURE_VARIANT:
				return ((InternalEList<?>)getStructureVariants()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SEQUENCE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.SEQUENCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.SEQUENCE__COORDINATE_SYSTEM:
				if (resolve) return getCoordinateSystem();
				return basicGetCoordinateSystem();
			case ResourcesPackage.SEQUENCE__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case ResourcesPackage.SEQUENCE__SPECIMEN:
				if (resolve) return getSpecimen();
				return basicGetSpecimen();
			case ResourcesPackage.SEQUENCE__DEVICE:
				if (resolve) return getDevice();
				return basicGetDevice();
			case ResourcesPackage.SEQUENCE__PERFORMER:
				if (resolve) return getPerformer();
				return basicGetPerformer();
			case ResourcesPackage.SEQUENCE__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case ResourcesPackage.SEQUENCE__REFERENCE_SEQ:
				return getReferenceSeq();
			case ResourcesPackage.SEQUENCE__VARIANT:
				return getVariants();
			case ResourcesPackage.SEQUENCE__OBSERVED_SEQ:
				if (resolve) return getObservedSeq();
				return basicGetObservedSeq();
			case ResourcesPackage.SEQUENCE__QUALITY:
				return getQualities();
			case ResourcesPackage.SEQUENCE__READ_COVERAGE:
				if (resolve) return getReadCoverage();
				return basicGetReadCoverage();
			case ResourcesPackage.SEQUENCE__REPOSITORY:
				return getRepositories();
			case ResourcesPackage.SEQUENCE__POINTER:
				return getPointers();
			case ResourcesPackage.SEQUENCE__STRUCTURE_VARIANT:
				return getStructureVariants();
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
			case ResourcesPackage.SEQUENCE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.SEQUENCE__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.SEQUENCE__COORDINATE_SYSTEM:
				setCoordinateSystem((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SEQUENCE__PATIENT:
				setPatient((Patient)newValue);
				return;
			case ResourcesPackage.SEQUENCE__SPECIMEN:
				setSpecimen((Specimen)newValue);
				return;
			case ResourcesPackage.SEQUENCE__DEVICE:
				setDevice((Device)newValue);
				return;
			case ResourcesPackage.SEQUENCE__PERFORMER:
				setPerformer((Organization)newValue);
				return;
			case ResourcesPackage.SEQUENCE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.SEQUENCE__REFERENCE_SEQ:
				setReferenceSeq((SequenceReferenceSeq)newValue);
				return;
			case ResourcesPackage.SEQUENCE__VARIANT:
				getVariants().clear();
				getVariants().addAll((Collection<? extends SequenceVariant>)newValue);
				return;
			case ResourcesPackage.SEQUENCE__OBSERVED_SEQ:
				setObservedSeq((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEQUENCE__QUALITY:
				getQualities().clear();
				getQualities().addAll((Collection<? extends SequenceQuality>)newValue);
				return;
			case ResourcesPackage.SEQUENCE__READ_COVERAGE:
				setReadCoverage((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SEQUENCE__REPOSITORY:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends SequenceRepository>)newValue);
				return;
			case ResourcesPackage.SEQUENCE__POINTER:
				getPointers().clear();
				getPointers().addAll((Collection<? extends Sequence>)newValue);
				return;
			case ResourcesPackage.SEQUENCE__STRUCTURE_VARIANT:
				getStructureVariants().clear();
				getStructureVariants().addAll((Collection<? extends SequenceStructureVariant>)newValue);
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
			case ResourcesPackage.SEQUENCE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.SEQUENCE__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.SEQUENCE__COORDINATE_SYSTEM:
				setCoordinateSystem((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SEQUENCE__PATIENT:
				setPatient((Patient)null);
				return;
			case ResourcesPackage.SEQUENCE__SPECIMEN:
				setSpecimen((Specimen)null);
				return;
			case ResourcesPackage.SEQUENCE__DEVICE:
				setDevice((Device)null);
				return;
			case ResourcesPackage.SEQUENCE__PERFORMER:
				setPerformer((Organization)null);
				return;
			case ResourcesPackage.SEQUENCE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.SEQUENCE__REFERENCE_SEQ:
				setReferenceSeq((SequenceReferenceSeq)null);
				return;
			case ResourcesPackage.SEQUENCE__VARIANT:
				getVariants().clear();
				return;
			case ResourcesPackage.SEQUENCE__OBSERVED_SEQ:
				setObservedSeq((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEQUENCE__QUALITY:
				getQualities().clear();
				return;
			case ResourcesPackage.SEQUENCE__READ_COVERAGE:
				setReadCoverage((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SEQUENCE__REPOSITORY:
				getRepositories().clear();
				return;
			case ResourcesPackage.SEQUENCE__POINTER:
				getPointers().clear();
				return;
			case ResourcesPackage.SEQUENCE__STRUCTURE_VARIANT:
				getStructureVariants().clear();
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
			case ResourcesPackage.SEQUENCE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.SEQUENCE__TYPE:
				return type != null;
			case ResourcesPackage.SEQUENCE__COORDINATE_SYSTEM:
				return coordinateSystem != null;
			case ResourcesPackage.SEQUENCE__PATIENT:
				return patient != null;
			case ResourcesPackage.SEQUENCE__SPECIMEN:
				return specimen != null;
			case ResourcesPackage.SEQUENCE__DEVICE:
				return device != null;
			case ResourcesPackage.SEQUENCE__PERFORMER:
				return performer != null;
			case ResourcesPackage.SEQUENCE__QUANTITY:
				return quantity != null;
			case ResourcesPackage.SEQUENCE__REFERENCE_SEQ:
				return referenceSeq != null;
			case ResourcesPackage.SEQUENCE__VARIANT:
				return variants != null && !variants.isEmpty();
			case ResourcesPackage.SEQUENCE__OBSERVED_SEQ:
				return observedSeq != null;
			case ResourcesPackage.SEQUENCE__QUALITY:
				return qualities != null && !qualities.isEmpty();
			case ResourcesPackage.SEQUENCE__READ_COVERAGE:
				return readCoverage != null;
			case ResourcesPackage.SEQUENCE__REPOSITORY:
				return repositories != null && !repositories.isEmpty();
			case ResourcesPackage.SEQUENCE__POINTER:
				return pointers != null && !pointers.isEmpty();
			case ResourcesPackage.SEQUENCE__STRUCTURE_VARIANT:
				return structureVariants != null && !structureVariants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceImpl
