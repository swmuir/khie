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
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.resources.Device;
import org.eclipse.mdht.uml.fhir.core.resources.DeviceUseStatement;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Use Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseStatementImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseStatementImpl#getWhenUsed <em>When Used</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseStatementImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseStatementImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseStatementImpl#getIndications <em>Indication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseStatementImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseStatementImpl#getRecordedOn <em>Recorded On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseStatementImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseStatementImpl#getTimingx <em>Timingx</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceUseStatementImpl extends DomainResourceImpl implements DeviceUseStatement {
	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

	/**
	 * The cached value of the '{@link #getWhenUsed() <em>When Used</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenUsed()
	 * @generated
	 * @ordered
	 */
	protected Period whenUsed;

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
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getIndications() <em>Indication</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndications()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> indications;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> notes;

	/**
	 * The cached value of the '{@link #getRecordedOn() <em>Recorded On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime recordedOn;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Patient subject;

	/**
	 * The cached value of the '{@link #getTimingx() <em>Timingx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingx()
	 * @generated
	 * @ordered
	 */
	protected DataType timingx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceUseStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDeviceUseStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBodySite() {
		if (bodySite != null && bodySite.eIsProxy()) {
			InternalEObject oldBodySite = (InternalEObject)bodySite;
			bodySite = (CodeableConcept)eResolveProxy(oldBodySite);
			if (bodySite != oldBodySite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE, oldBodySite, bodySite));
			}
		}
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(CodeableConcept newBodySite) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE, oldBodySite, bodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getWhenUsed() {
		if (whenUsed != null && whenUsed.eIsProxy()) {
			InternalEObject oldWhenUsed = (InternalEObject)whenUsed;
			whenUsed = (Period)eResolveProxy(oldWhenUsed);
			if (whenUsed != oldWhenUsed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_STATEMENT__WHEN_USED, oldWhenUsed, whenUsed));
			}
		}
		return whenUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetWhenUsed() {
		return whenUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenUsed(Period newWhenUsed) {
		Period oldWhenUsed = whenUsed;
		whenUsed = newWhenUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__WHEN_USED, oldWhenUsed, whenUsed));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE, oldDevice, device));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.DEVICE_USE_STATEMENT__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getIndications() {
		if (indications == null) {
			indications = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DEVICE_USE_STATEMENT__INDICATION);
		}
		return indications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.dataTypes.String>(org.eclipse.mdht.uml.fhir.core.dataTypes.String.class, this, ResourcesPackage.DEVICE_USE_STATEMENT__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getRecordedOn() {
		if (recordedOn != null && recordedOn.eIsProxy()) {
			InternalEObject oldRecordedOn = (InternalEObject)recordedOn;
			recordedOn = (DateTime)eResolveProxy(oldRecordedOn);
			if (recordedOn != oldRecordedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON, oldRecordedOn, recordedOn));
			}
		}
		return recordedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetRecordedOn() {
		return recordedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordedOn(DateTime newRecordedOn) {
		DateTime oldRecordedOn = recordedOn;
		recordedOn = newRecordedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON, oldRecordedOn, recordedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Patient)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Patient newSubject) {
		Patient oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTimingx() {
		if (timingx != null && timingx.eIsProxy()) {
			InternalEObject oldTimingx = (InternalEObject)timingx;
			timingx = (DataType)eResolveProxy(oldTimingx);
			if (timingx != oldTimingx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX, oldTimingx, timingx));
			}
		}
		return timingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetTimingx() {
		return timingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingx(DataType newTimingx) {
		DataType oldTimingx = timingx;
		timingx = newTimingx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX, oldTimingx, timingx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE:
				if (resolve) return getBodySite();
				return basicGetBodySite();
			case ResourcesPackage.DEVICE_USE_STATEMENT__WHEN_USED:
				if (resolve) return getWhenUsed();
				return basicGetWhenUsed();
			case ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE:
				if (resolve) return getDevice();
				return basicGetDevice();
			case ResourcesPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.DEVICE_USE_STATEMENT__INDICATION:
				return getIndications();
			case ResourcesPackage.DEVICE_USE_STATEMENT__NOTES:
				return getNotes();
			case ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				if (resolve) return getRecordedOn();
				return basicGetRecordedOn();
			case ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX:
				if (resolve) return getTimingx();
				return basicGetTimingx();
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
			case ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__WHEN_USED:
				setWhenUsed((Period)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE:
				setDevice((Device)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__INDICATION:
				getIndications().clear();
				getIndications().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				setRecordedOn((DateTime)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT:
				setSubject((Patient)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX:
				setTimingx((DataType)newValue);
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
			case ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__WHEN_USED:
				setWhenUsed((Period)null);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE:
				setDevice((Device)null);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__INDICATION:
				getIndications().clear();
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__NOTES:
				getNotes().clear();
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				setRecordedOn((DateTime)null);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT:
				setSubject((Patient)null);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX:
				setTimingx((DataType)null);
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
			case ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE:
				return bodySite != null;
			case ResourcesPackage.DEVICE_USE_STATEMENT__WHEN_USED:
				return whenUsed != null;
			case ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE:
				return device != null;
			case ResourcesPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.DEVICE_USE_STATEMENT__INDICATION:
				return indications != null && !indications.isEmpty();
			case ResourcesPackage.DEVICE_USE_STATEMENT__NOTES:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				return recordedOn != null;
			case ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT:
				return subject != null;
			case ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX:
				return timingx != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceUseStatementImpl
