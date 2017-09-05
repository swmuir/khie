/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;
import org.eclipse.mdht.uml.fhir.core.resources.Location;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.SupplyDelivery;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SupplyDeliveryImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SupplyDeliveryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SupplyDeliveryImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SupplyDeliveryImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SupplyDeliveryImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SupplyDeliveryImpl#getSuppliedItemx <em>Supplied Itemx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SupplyDeliveryImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SupplyDeliveryImpl#getWhenPrepared <em>When Prepared</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SupplyDeliveryImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SupplyDeliveryImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SupplyDeliveryImpl#getReceivers <em>Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupplyDeliveryImpl extends DomainResourceImpl implements SupplyDelivery {
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
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

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
	 * The cached value of the '{@link #getSuppliedItemx() <em>Supplied Itemx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliedItemx()
	 * @generated
	 * @ordered
	 */
	protected Base suppliedItemx;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected Practitioner supplier;

	/**
	 * The cached value of the '{@link #getWhenPrepared() <em>When Prepared</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenPrepared()
	 * @generated
	 * @ordered
	 */
	protected Period whenPrepared;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime time;

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
	protected EList<Practitioner> receivers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyDeliveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSupplyDelivery();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUPPLY_DELIVERY__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__IDENTIFIER, oldIdentifier, identifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUPPLY_DELIVERY__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUPPLY_DELIVERY__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__PATIENT, oldPatient, patient));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUPPLY_DELIVERY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUPPLY_DELIVERY__QUANTITY, oldQuantity, quantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getSuppliedItemx() {
		if (suppliedItemx != null && suppliedItemx.eIsProxy()) {
			InternalEObject oldSuppliedItemx = (InternalEObject)suppliedItemx;
			suppliedItemx = (Base)eResolveProxy(oldSuppliedItemx);
			if (suppliedItemx != oldSuppliedItemx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEMX, oldSuppliedItemx, suppliedItemx));
			}
		}
		return suppliedItemx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetSuppliedItemx() {
		return suppliedItemx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppliedItemx(Base newSuppliedItemx) {
		Base oldSuppliedItemx = suppliedItemx;
		suppliedItemx = newSuppliedItemx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEMX, oldSuppliedItemx, suppliedItemx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getSupplier() {
		if (supplier != null && supplier.eIsProxy()) {
			InternalEObject oldSupplier = (InternalEObject)supplier;
			supplier = (Practitioner)eResolveProxy(oldSupplier);
			if (supplier != oldSupplier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER, oldSupplier, supplier));
			}
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(Practitioner newSupplier) {
		Practitioner oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER, oldSupplier, supplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getWhenPrepared() {
		if (whenPrepared != null && whenPrepared.eIsProxy()) {
			InternalEObject oldWhenPrepared = (InternalEObject)whenPrepared;
			whenPrepared = (Period)eResolveProxy(oldWhenPrepared);
			if (whenPrepared != oldWhenPrepared) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUPPLY_DELIVERY__WHEN_PREPARED, oldWhenPrepared, whenPrepared));
			}
		}
		return whenPrepared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetWhenPrepared() {
		return whenPrepared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenPrepared(Period newWhenPrepared) {
		Period oldWhenPrepared = whenPrepared;
		whenPrepared = newWhenPrepared;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__WHEN_PREPARED, oldWhenPrepared, whenPrepared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getTime() {
		if (time != null && time.eIsProxy()) {
			InternalEObject oldTime = (InternalEObject)time;
			time = (DateTime)eResolveProxy(oldTime);
			if (time != oldTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUPPLY_DELIVERY__TIME, oldTime, time));
			}
		}
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(DateTime newTime) {
		DateTime oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__TIME, oldTime, time));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUPPLY_DELIVERY__DESTINATION, oldDestination, destination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Practitioner> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectResolvingEList<Practitioner>(Practitioner.class, this, ResourcesPackage.SUPPLY_DELIVERY__RECEIVER);
		}
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.SUPPLY_DELIVERY__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case ResourcesPackage.SUPPLY_DELIVERY__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.SUPPLY_DELIVERY__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case ResourcesPackage.SUPPLY_DELIVERY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.SUPPLY_DELIVERY__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEMX:
				if (resolve) return getSuppliedItemx();
				return basicGetSuppliedItemx();
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER:
				if (resolve) return getSupplier();
				return basicGetSupplier();
			case ResourcesPackage.SUPPLY_DELIVERY__WHEN_PREPARED:
				if (resolve) return getWhenPrepared();
				return basicGetWhenPrepared();
			case ResourcesPackage.SUPPLY_DELIVERY__TIME:
				if (resolve) return getTime();
				return basicGetTime();
			case ResourcesPackage.SUPPLY_DELIVERY__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case ResourcesPackage.SUPPLY_DELIVERY__RECEIVER:
				return getReceivers();
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
			case ResourcesPackage.SUPPLY_DELIVERY__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__PATIENT:
				setPatient((Patient)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEMX:
				setSuppliedItemx((Base)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER:
				setSupplier((Practitioner)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__WHEN_PREPARED:
				setWhenPrepared((Period)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__TIME:
				setTime((DateTime)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__DESTINATION:
				setDestination((Location)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__RECEIVER:
				getReceivers().clear();
				getReceivers().addAll((Collection<? extends Practitioner>)newValue);
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
			case ResourcesPackage.SUPPLY_DELIVERY__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__PATIENT:
				setPatient((Patient)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEMX:
				setSuppliedItemx((Base)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER:
				setSupplier((Practitioner)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__WHEN_PREPARED:
				setWhenPrepared((Period)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__TIME:
				setTime((DateTime)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__DESTINATION:
				setDestination((Location)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__RECEIVER:
				getReceivers().clear();
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
			case ResourcesPackage.SUPPLY_DELIVERY__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.SUPPLY_DELIVERY__STATUS:
				return status != null;
			case ResourcesPackage.SUPPLY_DELIVERY__PATIENT:
				return patient != null;
			case ResourcesPackage.SUPPLY_DELIVERY__TYPE:
				return type != null;
			case ResourcesPackage.SUPPLY_DELIVERY__QUANTITY:
				return quantity != null;
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEMX:
				return suppliedItemx != null;
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER:
				return supplier != null;
			case ResourcesPackage.SUPPLY_DELIVERY__WHEN_PREPARED:
				return whenPrepared != null;
			case ResourcesPackage.SUPPLY_DELIVERY__TIME:
				return time != null;
			case ResourcesPackage.SUPPLY_DELIVERY__DESTINATION:
				return destination != null;
			case ResourcesPackage.SUPPLY_DELIVERY__RECEIVER:
				return receivers != null && !receivers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupplyDeliveryImpl
