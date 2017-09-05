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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.RequestGroupActionRelatedAction;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Group Action Related Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionRelatedActionImpl#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionRelatedActionImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionRelatedActionImpl#getOffsetx <em>Offsetx</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequestGroupActionRelatedActionImpl extends BackboneElementImpl implements RequestGroupActionRelatedAction {
	/**
	 * The cached value of the '{@link #getActionIdentifier() <em>Action Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier actionIdentifier;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected Code relationship;

	/**
	 * The cached value of the '{@link #getOffsetx() <em>Offsetx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetx()
	 * @generated
	 * @ordered
	 */
	protected DataType offsetx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestGroupActionRelatedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getRequestGroupActionRelatedAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getActionIdentifier() {
		if (actionIdentifier != null && actionIdentifier.eIsProxy()) {
			InternalEObject oldActionIdentifier = (InternalEObject)actionIdentifier;
			actionIdentifier = (Identifier)eResolveProxy(oldActionIdentifier);
			if (actionIdentifier != oldActionIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_IDENTIFIER, oldActionIdentifier, actionIdentifier));
			}
		}
		return actionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetActionIdentifier() {
		return actionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionIdentifier(Identifier newActionIdentifier) {
		Identifier oldActionIdentifier = actionIdentifier;
		actionIdentifier = newActionIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_IDENTIFIER, oldActionIdentifier, actionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getRelationship() {
		if (relationship != null && relationship.eIsProxy()) {
			InternalEObject oldRelationship = (InternalEObject)relationship;
			relationship = (Code)eResolveProxy(oldRelationship);
			if (relationship != oldRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP, oldRelationship, relationship));
			}
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(Code newRelationship) {
		Code oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP, oldRelationship, relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOffsetx() {
		if (offsetx != null && offsetx.eIsProxy()) {
			InternalEObject oldOffsetx = (InternalEObject)offsetx;
			offsetx = (DataType)eResolveProxy(oldOffsetx);
			if (offsetx != oldOffsetx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX, oldOffsetx, offsetx));
			}
		}
		return offsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetOffsetx() {
		return offsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetx(DataType newOffsetx) {
		DataType oldOffsetx = offsetx;
		offsetx = newOffsetx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX, oldOffsetx, offsetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_IDENTIFIER:
				if (resolve) return getActionIdentifier();
				return basicGetActionIdentifier();
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP:
				if (resolve) return getRelationship();
				return basicGetRelationship();
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX:
				if (resolve) return getOffsetx();
				return basicGetOffsetx();
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
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP:
				setRelationship((Code)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX:
				setOffsetx((DataType)newValue);
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
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP:
				setRelationship((Code)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX:
				setOffsetx((DataType)null);
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
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_IDENTIFIER:
				return actionIdentifier != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP:
				return relationship != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX:
				return offsetx != null;
		}
		return super.eIsSet(featureID);
	}

} //RequestGroupActionRelatedActionImpl
