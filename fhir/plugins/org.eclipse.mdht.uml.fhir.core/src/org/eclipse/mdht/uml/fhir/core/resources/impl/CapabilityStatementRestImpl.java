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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatementRest;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatementRestOperation;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatementRestResource;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatementRestResourceSearchParam;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatementRestSecurity;
import org.eclipse.mdht.uml.fhir.core.resources.CapabilityStatementRestSystemInteraction;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Rest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementRestImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementRestImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementRestImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementRestImpl#getResources <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementRestImpl#getInteractions <em>Interaction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementRestImpl#getSearchParams <em>Search Param</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementRestImpl#getOperations <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CapabilityStatementRestImpl#getCompartments <em>Compartment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityStatementRestImpl extends BackboneElementImpl implements CapabilityStatementRest {
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Code mode;

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
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected CapabilityStatementRestSecurity security;

	/**
	 * The cached value of the '{@link #getResources() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRestResource> resources;

	/**
	 * The cached value of the '{@link #getInteractions() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRestSystemInteraction> interactions;

	/**
	 * The cached value of the '{@link #getSearchParams() <em>Search Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchParams()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRestResourceSearchParam> searchParams;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRestOperation> operations;

	/**
	 * The cached value of the '{@link #getCompartments() <em>Compartment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> compartments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementRestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCapabilityStatementRest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getMode() {
		if (mode != null && mode.eIsProxy()) {
			InternalEObject oldMode = (InternalEObject)mode;
			mode = (Code)eResolveProxy(oldMode);
			if (mode != oldMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE, oldMode, mode));
			}
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Code newMode) {
		Code oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE, oldMode, mode));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementRestSecurity getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(CapabilityStatementRestSecurity newSecurity, NotificationChain msgs) {
		CapabilityStatementRestSecurity oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY, oldSecurity, newSecurity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(CapabilityStatementRestSecurity newSecurity) {
		if (newSecurity != security) {
			NotificationChain msgs = null;
			if (security != null)
				msgs = ((InternalEObject)security).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY, null, msgs);
			if (newSecurity != null)
				msgs = ((InternalEObject)newSecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY, null, msgs);
			msgs = basicSetSecurity(newSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY, newSecurity, newSecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementRestResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<CapabilityStatementRestResource>(CapabilityStatementRestResource.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST__RESOURCE);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementRestSystemInteraction> getInteractions() {
		if (interactions == null) {
			interactions = new EObjectContainmentEList<CapabilityStatementRestSystemInteraction>(CapabilityStatementRestSystemInteraction.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST__INTERACTION);
		}
		return interactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementRestResourceSearchParam> getSearchParams() {
		if (searchParams == null) {
			searchParams = new EObjectContainmentEList<CapabilityStatementRestResourceSearchParam>(CapabilityStatementRestResourceSearchParam.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM);
		}
		return searchParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementRestOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<CapabilityStatementRestOperation>(CapabilityStatementRestOperation.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST__OPERATION);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getCompartments() {
		if (compartments == null) {
			compartments = new EObjectResolvingEList<Uri>(Uri.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT);
		}
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				return basicSetSecurity(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				return ((InternalEList<?>)getInteractions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				return ((InternalEList<?>)getSearchParams()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE:
				if (resolve) return getMode();
				return basicGetMode();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				return getSecurity();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				return getResources();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				return getInteractions();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				return getSearchParams();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				return getOperations();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				return getCompartments();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE:
				setMode((Code)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				setSecurity((CapabilityStatementRestSecurity)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				getResources().clear();
				getResources().addAll((Collection<? extends CapabilityStatementRestResource>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				getInteractions().clear();
				getInteractions().addAll((Collection<? extends CapabilityStatementRestSystemInteraction>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				getSearchParams().clear();
				getSearchParams().addAll((Collection<? extends CapabilityStatementRestResourceSearchParam>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				getOperations().clear();
				getOperations().addAll((Collection<? extends CapabilityStatementRestOperation>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				getCompartments().clear();
				getCompartments().addAll((Collection<? extends Uri>)newValue);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE:
				setMode((Code)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				setSecurity((CapabilityStatementRestSecurity)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				getResources().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				getInteractions().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				getSearchParams().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				getOperations().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				getCompartments().clear();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__MODE:
				return mode != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				return documentation != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				return security != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				return resources != null && !resources.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				return interactions != null && !interactions.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				return searchParams != null && !searchParams.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				return operations != null && !operations.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				return compartments != null && !compartments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementRestImpl
