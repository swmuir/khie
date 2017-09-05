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
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatementRestSecurity;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatementRestSecurityCertificate;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Rest Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementRestSecurityImpl#getCors <em>Cors</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementRestSecurityImpl#getServices <em>Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementRestSecurityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementRestSecurityImpl#getCertificates <em>Certificate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityStatementRestSecurityImpl extends BackboneElementImpl implements CapabilityStatementRestSecurity {
	/**
	 * The cached value of the '{@link #getCors() <em>Cors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCors()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean cors;

	/**
	 * The cached value of the '{@link #getServices() <em>Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> services;

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
	 * The cached value of the '{@link #getCertificates() <em>Certificate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificates()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRestSecurityCertificate> certificates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementRestSecurityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCapabilityStatementRestSecurity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getCors() {
		if (cors != null && cors.eIsProxy()) {
			InternalEObject oldCors = (InternalEObject)cors;
			cors = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldCors);
			if (cors != oldCors) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS, oldCors, cors));
			}
		}
		return cors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetCors() {
		return cors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCors(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newCors) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldCors = cors;
		cors = newCors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS, oldCors, cors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__SERVICE);
		}
		return services;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementRestSecurityCertificate> getCertificates() {
		if (certificates == null) {
			certificates = new EObjectContainmentEList<CapabilityStatementRestSecurityCertificate>(CapabilityStatementRestSecurityCertificate.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CERTIFICATE);
		}
		return certificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CERTIFICATE:
				return ((InternalEList<?>)getCertificates()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS:
				if (resolve) return getCors();
				return basicGetCors();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__SERVICE:
				return getServices();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CERTIFICATE:
				return getCertificates();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS:
				setCors((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__SERVICE:
				getServices().clear();
				getServices().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CERTIFICATE:
				getCertificates().clear();
				getCertificates().addAll((Collection<? extends CapabilityStatementRestSecurityCertificate>)newValue);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS:
				setCors((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__SERVICE:
				getServices().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CERTIFICATE:
				getCertificates().clear();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CORS:
				return cors != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__SERVICE:
				return services != null && !services.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__DESCRIPTION:
				return description != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY__CERTIFICATE:
				return certificates != null && !certificates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementRestSecurityImpl
