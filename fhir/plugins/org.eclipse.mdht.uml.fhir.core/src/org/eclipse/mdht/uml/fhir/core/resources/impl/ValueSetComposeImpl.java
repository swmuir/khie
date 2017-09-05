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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Date;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.ValueSetCompose;
import org.eclipse.mdht.uml.fhir.core.resources.ValueSetComposeConceptSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Compose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ValueSetComposeImpl#getLockedDate <em>Locked Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ValueSetComposeImpl#getInactive <em>Inactive</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ValueSetComposeImpl#getIncludes <em>Include</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ValueSetComposeImpl#getExcludes <em>Exclude</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueSetComposeImpl extends BackboneElementImpl implements ValueSetCompose {
	/**
	 * The cached value of the '{@link #getLockedDate() <em>Locked Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lockedDate;

	/**
	 * The cached value of the '{@link #getInactive() <em>Inactive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean inactive;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetComposeConceptSet> includes;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Exclude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetComposeConceptSet> excludes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetComposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getValueSetCompose();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLockedDate() {
		if (lockedDate != null && lockedDate.eIsProxy()) {
			InternalEObject oldLockedDate = (InternalEObject)lockedDate;
			lockedDate = (Date)eResolveProxy(oldLockedDate);
			if (lockedDate != oldLockedDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE, oldLockedDate, lockedDate));
			}
		}
		return lockedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetLockedDate() {
		return lockedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockedDate(Date newLockedDate) {
		Date oldLockedDate = lockedDate;
		lockedDate = newLockedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE, oldLockedDate, lockedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getInactive() {
		if (inactive != null && inactive.eIsProxy()) {
			InternalEObject oldInactive = (InternalEObject)inactive;
			inactive = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldInactive);
			if (inactive != oldInactive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE, oldInactive, inactive));
			}
		}
		return inactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetInactive() {
		return inactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInactive(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newInactive) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldInactive = inactive;
		inactive = newInactive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE, oldInactive, inactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetComposeConceptSet> getIncludes() {
		if (includes == null) {
			includes = new EObjectContainmentEList<ValueSetComposeConceptSet>(ValueSetComposeConceptSet.class, this, ResourcesPackage.VALUE_SET_COMPOSE__INCLUDE);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetComposeConceptSet> getExcludes() {
		if (excludes == null) {
			excludes = new EObjectContainmentEList<ValueSetComposeConceptSet>(ValueSetComposeConceptSet.class, this, ResourcesPackage.VALUE_SET_COMPOSE__EXCLUDE);
		}
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.VALUE_SET_COMPOSE__INCLUDE:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.VALUE_SET_COMPOSE__EXCLUDE:
				return ((InternalEList<?>)getExcludes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				if (resolve) return getLockedDate();
				return basicGetLockedDate();
			case ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE:
				if (resolve) return getInactive();
				return basicGetInactive();
			case ResourcesPackage.VALUE_SET_COMPOSE__INCLUDE:
				return getIncludes();
			case ResourcesPackage.VALUE_SET_COMPOSE__EXCLUDE:
				return getExcludes();
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
			case ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				setLockedDate((Date)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE:
				setInactive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE__INCLUDE:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends ValueSetComposeConceptSet>)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE__EXCLUDE:
				getExcludes().clear();
				getExcludes().addAll((Collection<? extends ValueSetComposeConceptSet>)newValue);
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
			case ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				setLockedDate((Date)null);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE:
				setInactive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE__INCLUDE:
				getIncludes().clear();
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE__EXCLUDE:
				getExcludes().clear();
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
			case ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				return lockedDate != null;
			case ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE:
				return inactive != null;
			case ResourcesPackage.VALUE_SET_COMPOSE__INCLUDE:
				return includes != null && !includes.isEmpty();
			case ResourcesPackage.VALUE_SET_COMPOSE__EXCLUDE:
				return excludes != null && !excludes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetComposeImpl
