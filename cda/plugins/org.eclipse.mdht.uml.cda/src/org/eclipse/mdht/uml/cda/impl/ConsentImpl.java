/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.Consent;
import org.eclipse.mdht.uml.cda.InfrastructureRootTypeId;
import org.eclipse.mdht.uml.cda.operations.ConsentOperations;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.rim.impl.ActImpl;
import org.eclipse.mdht.uml.hl7.vocab.ActClass;
import org.eclipse.mdht.uml.hl7.vocab.ActMood;
import org.eclipse.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ConsentImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ConsentImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ConsentImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ConsentImpl#getIds <em>Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ConsentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ConsentImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ConsentImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ConsentImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ConsentImpl#getMoodCode <em>Mood Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentImpl extends ActImpl implements Consent {
	/**
	 * The cached value of the '{@link #getRealmCodes() <em>Realm Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealmCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CS> realmCodes;

	/**
	 * The cached value of the '{@link #getTypeId() <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureRootTypeId typeId;

	/**
	 * The cached value of the '{@link #getTemplateIds() <em>Template Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateIds()
	 * @generated
	 * @ordered
	 */
	protected EList<II> templateIds;

	/**
	 * The cached value of the '{@link #getIds() <em>Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected EList<II> ids;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CE code;

	/**
	 * The cached value of the '{@link #getStatusCode() <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected CS statusCode;

	/**
	 * The default value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected static final NullFlavor NULL_FLAVOR_EDEFAULT = NullFlavor.ASKU;

	/**
	 * The cached value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected NullFlavor nullFlavor = NULL_FLAVOR_EDEFAULT;

	/**
	 * This is true if the Null Flavor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullFlavorESet;

	/**
	 * The default value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected static final ActClass CLASS_CODE_EDEFAULT = ActClass.CONS;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected ActClass classCode = CLASS_CODE_EDEFAULT;

	/**
	 * This is true if the Class Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classCodeESet;

	/**
	 * The default value of the '{@link #getMoodCode() <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoodCode()
	 * @generated
	 * @ordered
	 */
	protected static final ActMood MOOD_CODE_EDEFAULT = ActMood.EVN;

	/**
	 * The cached value of the '{@link #getMoodCode() <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoodCode()
	 * @generated
	 * @ordered
	 */
	protected ActMood moodCode = MOOD_CODE_EDEFAULT;

	/**
	 * This is true if the Mood Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moodCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.CONSENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.CONSENT__REALM_CODE);
		}
		return realmCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureRootTypeId getTypeId() {
		return typeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeId(InfrastructureRootTypeId newTypeId, NotificationChain msgs) {
		InfrastructureRootTypeId oldTypeId = typeId;
		typeId = newTypeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.CONSENT__TYPE_ID, oldTypeId, newTypeId);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeId(InfrastructureRootTypeId newTypeId) {
		if (newTypeId != typeId) {
			NotificationChain msgs = null;
			if (typeId != null) {
				msgs = ((InternalEObject) typeId).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.CONSENT__TYPE_ID, null, msgs);
			}
			if (newTypeId != null) {
				msgs = ((InternalEObject) newTypeId).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.CONSENT__TYPE_ID, null, msgs);
			}
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CONSENT__TYPE_ID, newTypeId, newTypeId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.CONSENT__TEMPLATE_ID);
		}
		return templateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getIds() {
		if (ids == null) {
			ids = new EObjectContainmentEList<II>(II.class, this, CDAPackage.CONSENT__ID);
		}
		return ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CE newCode, NotificationChain msgs) {
		CE oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.CONSENT__CODE, oldCode, newCode);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CE newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null) {
				msgs = ((InternalEObject) code).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.CONSENT__CODE, null, msgs);
			}
			if (newCode != null) {
				msgs = ((InternalEObject) newCode).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.CONSENT__CODE, null, msgs);
			}
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CONSENT__CODE, newCode, newCode));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS getStatusCode() {
		return statusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusCode(CS newStatusCode, NotificationChain msgs) {
		CS oldStatusCode = statusCode;
		statusCode = newStatusCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.CONSENT__STATUS_CODE, oldStatusCode, newStatusCode);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusCode(CS newStatusCode) {
		if (newStatusCode != statusCode) {
			NotificationChain msgs = null;
			if (statusCode != null) {
				msgs = ((InternalEObject) statusCode).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.CONSENT__STATUS_CODE, null, msgs);
			}
			if (newStatusCode != null) {
				msgs = ((InternalEObject) newStatusCode).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.CONSENT__STATUS_CODE, null, msgs);
			}
			msgs = basicSetStatusCode(newStatusCode, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(
				new ENotificationImpl(
					this, Notification.SET, CDAPackage.CONSENT__STATUS_CODE, newStatusCode, newStatusCode));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullFlavor getNullFlavor() {
		return nullFlavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullFlavor(NullFlavor newNullFlavor) {
		NullFlavor oldNullFlavor = nullFlavor;
		nullFlavor = newNullFlavor == null
				? NULL_FLAVOR_EDEFAULT
				: newNullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavorESet = true;
		if (eNotificationRequired()) {
			eNotify(
				new ENotificationImpl(
					this, Notification.SET, CDAPackage.CONSENT__NULL_FLAVOR, oldNullFlavor, nullFlavor,
					!oldNullFlavorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNullFlavor() {
		NullFlavor oldNullFlavor = nullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavor = NULL_FLAVOR_EDEFAULT;
		nullFlavorESet = false;
		if (eNotificationRequired()) {
			eNotify(
				new ENotificationImpl(
					this, Notification.UNSET, CDAPackage.CONSENT__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT,
					oldNullFlavorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNullFlavor() {
		return nullFlavorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActClass getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(ActClass newClassCode) {
		ActClass oldClassCode = classCode;
		classCode = newClassCode == null
				? CLASS_CODE_EDEFAULT
				: newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(
				new ENotificationImpl(
					this, Notification.SET, CDAPackage.CONSENT__CLASS_CODE, oldClassCode, classCode,
					!oldClassCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		ActClass oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired()) {
			eNotify(
				new ENotificationImpl(
					this, Notification.UNSET, CDAPackage.CONSENT__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT,
					oldClassCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassCode() {
		return classCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActMood getMoodCode() {
		return moodCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoodCode(ActMood newMoodCode) {
		ActMood oldMoodCode = moodCode;
		moodCode = newMoodCode == null
				? MOOD_CODE_EDEFAULT
				: newMoodCode;
		boolean oldMoodCodeESet = moodCodeESet;
		moodCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(
				new ENotificationImpl(
					this, Notification.SET, CDAPackage.CONSENT__MOOD_CODE, oldMoodCode, moodCode, !oldMoodCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoodCode() {
		ActMood oldMoodCode = moodCode;
		boolean oldMoodCodeESet = moodCodeESet;
		moodCode = MOOD_CODE_EDEFAULT;
		moodCodeESet = false;
		if (eNotificationRequired()) {
			eNotify(
				new ENotificationImpl(
					this, Notification.UNSET, CDAPackage.CONSENT__MOOD_CODE, oldMoodCode, MOOD_CODE_EDEFAULT,
					oldMoodCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoodCode() {
		return moodCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentOperations.validateClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentOperations.validateMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.CONSENT__REALM_CODE:
				return ((InternalEList<?>) getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.CONSENT__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.CONSENT__TEMPLATE_ID:
				return ((InternalEList<?>) getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.CONSENT__ID:
				return ((InternalEList<?>) getIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.CONSENT__CODE:
				return basicSetCode(null, msgs);
			case CDAPackage.CONSENT__STATUS_CODE:
				return basicSetStatusCode(null, msgs);
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
			case CDAPackage.CONSENT__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.CONSENT__TYPE_ID:
				return getTypeId();
			case CDAPackage.CONSENT__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.CONSENT__ID:
				return getIds();
			case CDAPackage.CONSENT__CODE:
				return getCode();
			case CDAPackage.CONSENT__STATUS_CODE:
				return getStatusCode();
			case CDAPackage.CONSENT__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.CONSENT__CLASS_CODE:
				return getClassCode();
			case CDAPackage.CONSENT__MOOD_CODE:
				return getMoodCode();
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
			case CDAPackage.CONSENT__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>) newValue);
				return;
			case CDAPackage.CONSENT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) newValue);
				return;
			case CDAPackage.CONSENT__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.CONSENT__ID:
				getIds().clear();
				getIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.CONSENT__CODE:
				setCode((CE) newValue);
				return;
			case CDAPackage.CONSENT__STATUS_CODE:
				setStatusCode((CS) newValue);
				return;
			case CDAPackage.CONSENT__NULL_FLAVOR:
				setNullFlavor((NullFlavor) newValue);
				return;
			case CDAPackage.CONSENT__CLASS_CODE:
				setClassCode((ActClass) newValue);
				return;
			case CDAPackage.CONSENT__MOOD_CODE:
				setMoodCode((ActMood) newValue);
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
			case CDAPackage.CONSENT__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.CONSENT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) null);
				return;
			case CDAPackage.CONSENT__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.CONSENT__ID:
				getIds().clear();
				return;
			case CDAPackage.CONSENT__CODE:
				setCode((CE) null);
				return;
			case CDAPackage.CONSENT__STATUS_CODE:
				setStatusCode((CS) null);
				return;
			case CDAPackage.CONSENT__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.CONSENT__CLASS_CODE:
				unsetClassCode();
				return;
			case CDAPackage.CONSENT__MOOD_CODE:
				unsetMoodCode();
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
			case CDAPackage.CONSENT__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.CONSENT__TYPE_ID:
				return typeId != null;
			case CDAPackage.CONSENT__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.CONSENT__ID:
				return ids != null && !ids.isEmpty();
			case CDAPackage.CONSENT__CODE:
				return code != null;
			case CDAPackage.CONSENT__STATUS_CODE:
				return statusCode != null;
			case CDAPackage.CONSENT__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.CONSENT__CLASS_CODE:
				return isSetClassCode();
			case CDAPackage.CONSENT__MOOD_CODE:
				return isSetMoodCode();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nullFlavor: ");
		if (nullFlavorESet) {
			result.append(nullFlavor);
		} else {
			result.append("<unset>");
		}
		result.append(", classCode: ");
		if (classCodeESet) {
			result.append(classCode);
		} else {
			result.append("<unset>");
		}
		result.append(", moodCode: ");
		if (moodCodeESet) {
			result.append(moodCode);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // ConsentImpl
