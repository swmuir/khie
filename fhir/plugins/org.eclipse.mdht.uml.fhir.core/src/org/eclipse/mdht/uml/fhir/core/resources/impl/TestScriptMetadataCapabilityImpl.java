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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatement;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptMetadataCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Metadata Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptMetadataCapabilityImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptMetadataCapabilityImpl#getValidated <em>Validated</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptMetadataCapabilityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptMetadataCapabilityImpl#getOrigins <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptMetadataCapabilityImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptMetadataCapabilityImpl#getLinks <em>Link</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptMetadataCapabilityImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestScriptMetadataCapabilityImpl extends BackboneElementImpl implements TestScriptMetadataCapability {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean required;

	/**
	 * The cached value of the '{@link #getValidated() <em>Validated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidated()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean validated;

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
	 * The cached value of the '{@link #getOrigins() <em>Origin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigins()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.dataTypes.Integer> origins;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer destination;

	/**
	 * The cached value of the '{@link #getLinks() <em>Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> links;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected CapabilityStatement capabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptMetadataCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestScriptMetadataCapability();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getRequired() {
		if (required != null && required.eIsProxy()) {
			InternalEObject oldRequired = (InternalEObject)required;
			required = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldRequired);
			if (required != oldRequired) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED, oldRequired, required));
			}
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newRequired) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getValidated() {
		if (validated != null && validated.eIsProxy()) {
			InternalEObject oldValidated = (InternalEObject)validated;
			validated = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldValidated);
			if (validated != oldValidated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED, oldValidated, validated));
			}
		}
		return validated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetValidated() {
		return validated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidated(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newValidated) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldValidated = validated;
		validated = newValidated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED, oldValidated, validated));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.dataTypes.Integer> getOrigins() {
		if (origins == null) {
			origins = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.dataTypes.Integer>(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer.class, this, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN);
		}
		return origins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newDestination) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<Uri>(Uri.class, this, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatement getCapabilities() {
		if (capabilities != null && capabilities.eIsProxy()) {
			InternalEObject oldCapabilities = (InternalEObject)capabilities;
			capabilities = (CapabilityStatement)eResolveProxy(oldCapabilities);
			if (capabilities != oldCapabilities) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES, oldCapabilities, capabilities));
			}
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatement basicGetCapabilities() {
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilities(CapabilityStatement newCapabilities) {
		CapabilityStatement oldCapabilities = capabilities;
		capabilities = newCapabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES, oldCapabilities, capabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED:
				if (resolve) return getRequired();
				return basicGetRequired();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED:
				if (resolve) return getValidated();
				return basicGetValidated();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN:
				return getOrigins();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK:
				return getLinks();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES:
				if (resolve) return getCapabilities();
				return basicGetCapabilities();
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
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED:
				setRequired((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED:
				setValidated((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN:
				getOrigins().clear();
				getOrigins().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.dataTypes.Integer>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION:
				setDestination((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES:
				setCapabilities((CapabilityStatement)newValue);
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
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED:
				setRequired((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED:
				setValidated((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN:
				getOrigins().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION:
				setDestination((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK:
				getLinks().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES:
				setCapabilities((CapabilityStatement)null);
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
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__REQUIRED:
				return required != null;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__VALIDATED:
				return validated != null;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESCRIPTION:
				return description != null;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__ORIGIN:
				return origins != null && !origins.isEmpty();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__DESTINATION:
				return destination != null;
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__LINK:
				return links != null && !links.isEmpty();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY__CAPABILITIES:
				return capabilities != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptMetadataCapabilityImpl
