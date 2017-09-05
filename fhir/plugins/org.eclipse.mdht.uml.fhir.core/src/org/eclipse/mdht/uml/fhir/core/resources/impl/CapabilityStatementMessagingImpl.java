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
import org.eclipse.mdht.uml.fhir.core.dataTypes.UnsignedInt;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatementMessaging;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatementMessagingEndpoint;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatementMessagingEvent;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Messaging</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementMessagingImpl#getEndpoints <em>Endpoint</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementMessagingImpl#getReliableCache <em>Reliable Cache</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementMessagingImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementMessagingImpl#getEvents <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityStatementMessagingImpl extends BackboneElementImpl implements CapabilityStatementMessaging {
	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementMessagingEndpoint> endpoints;

	/**
	 * The cached value of the '{@link #getReliableCache() <em>Reliable Cache</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliableCache()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt reliableCache;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String documentation;

	/**
	 * The cached value of the '{@link #getEvents() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementMessagingEvent> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementMessagingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCapabilityStatementMessaging();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementMessagingEndpoint> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentEList<CapabilityStatementMessagingEndpoint>(CapabilityStatementMessagingEndpoint.class, this, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getReliableCache() {
		if (reliableCache != null && reliableCache.eIsProxy()) {
			InternalEObject oldReliableCache = (InternalEObject)reliableCache;
			reliableCache = (UnsignedInt)eResolveProxy(oldReliableCache);
			if (reliableCache != oldReliableCache) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE, oldReliableCache, reliableCache));
			}
		}
		return reliableCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt basicGetReliableCache() {
		return reliableCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliableCache(UnsignedInt newReliableCache) {
		UnsignedInt oldReliableCache = reliableCache;
		reliableCache = newReliableCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE, oldReliableCache, reliableCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDocumentation() {
		if (documentation != null && documentation.eIsProxy()) {
			InternalEObject oldDocumentation = (InternalEObject)documentation;
			documentation = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDocumentation);
			if (documentation != oldDocumentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION, oldDocumentation, documentation));
			}
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDocumentation) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementMessagingEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<CapabilityStatementMessagingEvent>(CapabilityStatementMessagingEvent.class, this, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__EVENT);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__EVENT:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				return getEndpoints();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				if (resolve) return getReliableCache();
				return basicGetReliableCache();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__EVENT:
				return getEvents();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends CapabilityStatementMessagingEndpoint>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				setReliableCache((UnsignedInt)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__EVENT:
				getEvents().clear();
				getEvents().addAll((Collection<? extends CapabilityStatementMessagingEvent>)newValue);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				getEndpoints().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				setReliableCache((UnsignedInt)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__EVENT:
				getEvents().clear();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				return endpoints != null && !endpoints.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				return reliableCache != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				return documentation != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__EVENT:
				return events != null && !events.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementMessagingImpl
