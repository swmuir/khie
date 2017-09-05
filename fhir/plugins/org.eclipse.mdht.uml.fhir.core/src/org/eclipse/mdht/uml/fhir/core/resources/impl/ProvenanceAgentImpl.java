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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ProvenanceAgent;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provenance Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceAgentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceAgentImpl#getWhox <em>Whox</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceAgentImpl#getOnBehalfOfx <em>On Behalf Ofx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceAgentImpl#getRelatedAgentType <em>Related Agent Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvenanceAgentImpl extends BackboneElementImpl implements ProvenanceAgent {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Coding role;

	/**
	 * The cached value of the '{@link #getWhox() <em>Whox</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhox()
	 * @generated
	 * @ordered
	 */
	protected Base whox;

	/**
	 * The cached value of the '{@link #getOnBehalfOfx() <em>On Behalf Ofx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBehalfOfx()
	 * @generated
	 * @ordered
	 */
	protected Base onBehalfOfx;

	/**
	 * The cached value of the '{@link #getRelatedAgentType() <em>Related Agent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAgentType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relatedAgentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getProvenanceAgent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Coding)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROVENANCE_AGENT__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Coding newRole) {
		Coding oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE_AGENT__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getWhox() {
		if (whox != null && whox.eIsProxy()) {
			InternalEObject oldWhox = (InternalEObject)whox;
			whox = (Base)eResolveProxy(oldWhox);
			if (whox != oldWhox) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROVENANCE_AGENT__WHOX, oldWhox, whox));
			}
		}
		return whox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetWhox() {
		return whox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhox(Base newWhox) {
		Base oldWhox = whox;
		whox = newWhox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE_AGENT__WHOX, oldWhox, whox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getOnBehalfOfx() {
		if (onBehalfOfx != null && onBehalfOfx.eIsProxy()) {
			InternalEObject oldOnBehalfOfx = (InternalEObject)onBehalfOfx;
			onBehalfOfx = (Base)eResolveProxy(oldOnBehalfOfx);
			if (onBehalfOfx != oldOnBehalfOfx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROVENANCE_AGENT__ON_BEHALF_OFX, oldOnBehalfOfx, onBehalfOfx));
			}
		}
		return onBehalfOfx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetOnBehalfOfx() {
		return onBehalfOfx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBehalfOfx(Base newOnBehalfOfx) {
		Base oldOnBehalfOfx = onBehalfOfx;
		onBehalfOfx = newOnBehalfOfx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE_AGENT__ON_BEHALF_OFX, oldOnBehalfOfx, onBehalfOfx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRelatedAgentType() {
		if (relatedAgentType != null && relatedAgentType.eIsProxy()) {
			InternalEObject oldRelatedAgentType = (InternalEObject)relatedAgentType;
			relatedAgentType = (CodeableConcept)eResolveProxy(oldRelatedAgentType);
			if (relatedAgentType != oldRelatedAgentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE, oldRelatedAgentType, relatedAgentType));
			}
		}
		return relatedAgentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetRelatedAgentType() {
		return relatedAgentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedAgentType(CodeableConcept newRelatedAgentType) {
		CodeableConcept oldRelatedAgentType = relatedAgentType;
		relatedAgentType = newRelatedAgentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE, oldRelatedAgentType, relatedAgentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.PROVENANCE_AGENT__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case ResourcesPackage.PROVENANCE_AGENT__WHOX:
				if (resolve) return getWhox();
				return basicGetWhox();
			case ResourcesPackage.PROVENANCE_AGENT__ON_BEHALF_OFX:
				if (resolve) return getOnBehalfOfx();
				return basicGetOnBehalfOfx();
			case ResourcesPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE:
				if (resolve) return getRelatedAgentType();
				return basicGetRelatedAgentType();
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
			case ResourcesPackage.PROVENANCE_AGENT__ROLE:
				setRole((Coding)newValue);
				return;
			case ResourcesPackage.PROVENANCE_AGENT__WHOX:
				setWhox((Base)newValue);
				return;
			case ResourcesPackage.PROVENANCE_AGENT__ON_BEHALF_OFX:
				setOnBehalfOfx((Base)newValue);
				return;
			case ResourcesPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE:
				setRelatedAgentType((CodeableConcept)newValue);
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
			case ResourcesPackage.PROVENANCE_AGENT__ROLE:
				setRole((Coding)null);
				return;
			case ResourcesPackage.PROVENANCE_AGENT__WHOX:
				setWhox((Base)null);
				return;
			case ResourcesPackage.PROVENANCE_AGENT__ON_BEHALF_OFX:
				setOnBehalfOfx((Base)null);
				return;
			case ResourcesPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE:
				setRelatedAgentType((CodeableConcept)null);
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
			case ResourcesPackage.PROVENANCE_AGENT__ROLE:
				return role != null;
			case ResourcesPackage.PROVENANCE_AGENT__WHOX:
				return whox != null;
			case ResourcesPackage.PROVENANCE_AGENT__ON_BEHALF_OFX:
				return onBehalfOfx != null;
			case ResourcesPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE:
				return relatedAgentType != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvenanceAgentImpl
