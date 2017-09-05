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
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.SpecimenContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SpecimenContainerImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SpecimenContainerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SpecimenContainerImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SpecimenContainerImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SpecimenContainerImpl#getSpecimenQuantity <em>Specimen Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SpecimenContainerImpl#getAdditivex <em>Additivex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecimenContainerImpl extends BackboneElementImpl implements SpecimenContainer {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String description;

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
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity capacity;

	/**
	 * The cached value of the '{@link #getSpecimenQuantity() <em>Specimen Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity specimenQuantity;

	/**
	 * The cached value of the '{@link #getAdditivex() <em>Additivex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditivex()
	 * @generated
	 * @ordered
	 */
	protected Base additivex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSpecimenContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.SPECIMEN_CONTAINER__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SPECIMEN_CONTAINER__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getCapacity() {
		if (capacity != null && capacity.eIsProxy()) {
			InternalEObject oldCapacity = (InternalEObject)capacity;
			capacity = (SimpleQuantity)eResolveProxy(oldCapacity);
			if (capacity != oldCapacity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY, oldCapacity, capacity));
			}
		}
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(SimpleQuantity newCapacity) {
		SimpleQuantity oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getSpecimenQuantity() {
		if (specimenQuantity != null && specimenQuantity.eIsProxy()) {
			InternalEObject oldSpecimenQuantity = (InternalEObject)specimenQuantity;
			specimenQuantity = (SimpleQuantity)eResolveProxy(oldSpecimenQuantity);
			if (specimenQuantity != oldSpecimenQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY, oldSpecimenQuantity, specimenQuantity));
			}
		}
		return specimenQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetSpecimenQuantity() {
		return specimenQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimenQuantity(SimpleQuantity newSpecimenQuantity) {
		SimpleQuantity oldSpecimenQuantity = specimenQuantity;
		specimenQuantity = newSpecimenQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY, oldSpecimenQuantity, specimenQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getAdditivex() {
		if (additivex != null && additivex.eIsProxy()) {
			InternalEObject oldAdditivex = (InternalEObject)additivex;
			additivex = (Base)eResolveProxy(oldAdditivex);
			if (additivex != oldAdditivex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX, oldAdditivex, additivex));
			}
		}
		return additivex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetAdditivex() {
		return additivex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditivex(Base newAdditivex) {
		Base oldAdditivex = additivex;
		additivex = newAdditivex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX, oldAdditivex, additivex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.SPECIMEN_CONTAINER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY:
				if (resolve) return getCapacity();
				return basicGetCapacity();
			case ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				if (resolve) return getSpecimenQuantity();
				return basicGetSpecimenQuantity();
			case ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX:
				if (resolve) return getAdditivex();
				return basicGetAdditivex();
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
			case ResourcesPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY:
				setCapacity((SimpleQuantity)newValue);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				setSpecimenQuantity((SimpleQuantity)newValue);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX:
				setAdditivex((Base)newValue);
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
			case ResourcesPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY:
				setCapacity((SimpleQuantity)null);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				setSpecimenQuantity((SimpleQuantity)null);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX:
				setAdditivex((Base)null);
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
			case ResourcesPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				return description != null;
			case ResourcesPackage.SPECIMEN_CONTAINER__TYPE:
				return type != null;
			case ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY:
				return capacity != null;
			case ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				return specimenQuantity != null;
			case ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX:
				return additivex != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenContainerImpl
