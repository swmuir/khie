/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.List;
import org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupSupplementalDataSupplementalDataGroup;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Group Supplemental Data Supplemental Data Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureReportGroupSupplementalDataSupplementalDataGroupImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureReportGroupSupplementalDataSupplementalDataGroupImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureReportGroupSupplementalDataSupplementalDataGroupImpl#getPatients <em>Patients</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureReportGroupSupplementalDataSupplementalDataGroupImpl extends BackboneElementImpl implements MeasureReportGroupSupplementalDataSupplementalDataGroup {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String value;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer count;

	/**
	 * The cached value of the '{@link #getPatients() <em>Patients</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatients()
	 * @generated
	 * @ordered
	 */
	protected List patients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportGroupSupplementalDataSupplementalDataGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMeasureReportGroupSupplementalDataSupplementalDataGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(org.eclipse.mdht.uml.fhir.core.dataTypes.String newValue) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getCount() {
		if (count != null && count.eIsProxy()) {
			InternalEObject oldCount = (InternalEObject)count;
			count = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldCount);
			if (count != oldCount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__COUNT, oldCount, count));
			}
		}
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newCount) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPatients() {
		if (patients != null && patients.eIsProxy()) {
			InternalEObject oldPatients = (InternalEObject)patients;
			patients = (List)eResolveProxy(oldPatients);
			if (patients != oldPatients) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__PATIENTS, oldPatients, patients));
			}
		}
		return patients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List basicGetPatients() {
		return patients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatients(List newPatients) {
		List oldPatients = patients;
		patients = newPatients;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__PATIENTS, oldPatients, patients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__COUNT:
				if (resolve) return getCount();
				return basicGetCount();
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__PATIENTS:
				if (resolve) return getPatients();
				return basicGetPatients();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__VALUE:
				setValue((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__COUNT:
				setCount((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__PATIENTS:
				setPatients((List)newValue);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__VALUE:
				setValue((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__COUNT:
				setCount((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__PATIENTS:
				setPatients((List)null);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__VALUE:
				return value != null;
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__COUNT:
				return count != null;
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP__PATIENTS:
				return patients != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportGroupSupplementalDataSupplementalDataGroupImpl
