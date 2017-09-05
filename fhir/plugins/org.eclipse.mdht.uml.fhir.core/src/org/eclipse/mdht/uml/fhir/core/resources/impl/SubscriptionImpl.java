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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Instant;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.Subscription;
import org.eclipse.mdht.uml.fhir.core.resources.SubscriptionChannel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SubscriptionImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SubscriptionImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SubscriptionImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SubscriptionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SubscriptionImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SubscriptionImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SubscriptionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SubscriptionImpl#getTags <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubscriptionImpl extends DomainResourceImpl implements Subscription {
	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String criteria;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> contacts;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String reason;

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
	 * The cached value of the '{@link #getError() <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String error;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionChannel channel;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Instant end;

	/**
	 * The cached value of the '{@link #getTags() <em>Tag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> tags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubscription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getCriteria() {
		if (criteria != null && criteria.eIsProxy()) {
			InternalEObject oldCriteria = (InternalEObject)criteria;
			criteria = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldCriteria);
			if (criteria != oldCriteria) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUBSCRIPTION__CRITERIA, oldCriteria, criteria));
			}
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetCriteria() {
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria(org.eclipse.mdht.uml.fhir.core.dataTypes.String newCriteria) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldCriteria = criteria;
		criteria = newCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSCRIPTION__CRITERIA, oldCriteria, criteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getContacts() {
		if (contacts == null) {
			contacts = new EObjectResolvingEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.SUBSCRIPTION__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getReason() {
		if (reason != null && reason.eIsProxy()) {
			InternalEObject oldReason = (InternalEObject)reason;
			reason = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldReason);
			if (reason != oldReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUBSCRIPTION__REASON, oldReason, reason));
			}
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(org.eclipse.mdht.uml.fhir.core.dataTypes.String newReason) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSCRIPTION__REASON, oldReason, reason));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUBSCRIPTION__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSCRIPTION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getError() {
		if (error != null && error.eIsProxy()) {
			InternalEObject oldError = (InternalEObject)error;
			error = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldError);
			if (error != oldError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUBSCRIPTION__ERROR, oldError, error));
			}
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(org.eclipse.mdht.uml.fhir.core.dataTypes.String newError) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSCRIPTION__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannel getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannel(SubscriptionChannel newChannel, NotificationChain msgs) {
		SubscriptionChannel oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSCRIPTION__CHANNEL, oldChannel, newChannel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(SubscriptionChannel newChannel) {
		if (newChannel != channel) {
			NotificationChain msgs = null;
			if (channel != null)
				msgs = ((InternalEObject)channel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSCRIPTION__CHANNEL, null, msgs);
			if (newChannel != null)
				msgs = ((InternalEObject)newChannel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSCRIPTION__CHANNEL, null, msgs);
			msgs = basicSetChannel(newChannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSCRIPTION__CHANNEL, newChannel, newChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (Instant)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SUBSCRIPTION__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Instant newEnd) {
		Instant oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSCRIPTION__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Coding>(Coding.class, this, ResourcesPackage.SUBSCRIPTION__TAG);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSCRIPTION__CHANNEL:
				return basicSetChannel(null, msgs);
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
			case ResourcesPackage.SUBSCRIPTION__CRITERIA:
				if (resolve) return getCriteria();
				return basicGetCriteria();
			case ResourcesPackage.SUBSCRIPTION__CONTACT:
				return getContacts();
			case ResourcesPackage.SUBSCRIPTION__REASON:
				if (resolve) return getReason();
				return basicGetReason();
			case ResourcesPackage.SUBSCRIPTION__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.SUBSCRIPTION__ERROR:
				if (resolve) return getError();
				return basicGetError();
			case ResourcesPackage.SUBSCRIPTION__CHANNEL:
				return getChannel();
			case ResourcesPackage.SUBSCRIPTION__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case ResourcesPackage.SUBSCRIPTION__TAG:
				return getTags();
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
			case ResourcesPackage.SUBSCRIPTION__CRITERIA:
				setCriteria((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSCRIPTION__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.SUBSCRIPTION__REASON:
				setReason((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSCRIPTION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.SUBSCRIPTION__ERROR:
				setError((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSCRIPTION__CHANNEL:
				setChannel((SubscriptionChannel)newValue);
				return;
			case ResourcesPackage.SUBSCRIPTION__END:
				setEnd((Instant)newValue);
				return;
			case ResourcesPackage.SUBSCRIPTION__TAG:
				getTags().clear();
				getTags().addAll((Collection<? extends Coding>)newValue);
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
			case ResourcesPackage.SUBSCRIPTION__CRITERIA:
				setCriteria((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSCRIPTION__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.SUBSCRIPTION__REASON:
				setReason((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSCRIPTION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.SUBSCRIPTION__ERROR:
				setError((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSCRIPTION__CHANNEL:
				setChannel((SubscriptionChannel)null);
				return;
			case ResourcesPackage.SUBSCRIPTION__END:
				setEnd((Instant)null);
				return;
			case ResourcesPackage.SUBSCRIPTION__TAG:
				getTags().clear();
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
			case ResourcesPackage.SUBSCRIPTION__CRITERIA:
				return criteria != null;
			case ResourcesPackage.SUBSCRIPTION__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.SUBSCRIPTION__REASON:
				return reason != null;
			case ResourcesPackage.SUBSCRIPTION__STATUS:
				return status != null;
			case ResourcesPackage.SUBSCRIPTION__ERROR:
				return error != null;
			case ResourcesPackage.SUBSCRIPTION__CHANNEL:
				return channel != null;
			case ResourcesPackage.SUBSCRIPTION__END:
				return end != null;
			case ResourcesPackage.SUBSCRIPTION__TAG:
				return tags != null && !tags.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionImpl
