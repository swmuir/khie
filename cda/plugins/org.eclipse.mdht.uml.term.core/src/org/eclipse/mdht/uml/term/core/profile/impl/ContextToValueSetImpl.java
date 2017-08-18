/**
 */
package org.eclipse.mdht.uml.term.core.profile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.mdht.uml.term.core.profile.ContextToValueSet;
import org.eclipse.mdht.uml.term.core.profile.TermPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context To Value Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ContextToValueSetImpl#getContext <em>Context</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ContextToValueSetImpl#getValueSetName <em>Value Set Name</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ContextToValueSetImpl#getValueSetURI <em>Value Set URI</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ContextToValueSetImpl#getValueSetOID <em>Value Set OID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextToValueSetImpl extends EObjectImpl implements ContextToValueSet {
	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSetName() <em>Value Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSetName()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSetName() <em>Value Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSetName()
	 * @generated
	 * @ordered
	 */
	protected String valueSetName = VALUE_SET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSetURI() <em>Value Set URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSetURI()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SET_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSetURI() <em>Value Set URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSetURI()
	 * @generated
	 * @ordered
	 */
	protected String valueSetURI = VALUE_SET_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSetOID() <em>Value Set OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSetOID()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SET_OID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSetOID() <em>Value Set OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSetOID()
	 * @generated
	 * @ordered
	 */
	protected String valueSetOID = VALUE_SET_OID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ContextToValueSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermPackage.Literals.CONTEXT_TO_VALUE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			eNotify(
				new ENotificationImpl(
					this, Notification.SET, TermPackage.CONTEXT_TO_VALUE_SET__CONTEXT, oldContext, context));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getValueSetName() {
		return valueSetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSetName(String newValueSetName) {
		String oldValueSetName = valueSetName;
		valueSetName = newValueSetName;
		if (eNotificationRequired()) {
			eNotify(
				new ENotificationImpl(
					this, Notification.SET, TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_NAME, oldValueSetName,
					valueSetName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getValueSetURI() {
		return valueSetURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSetURI(String newValueSetURI) {
		String oldValueSetURI = valueSetURI;
		valueSetURI = newValueSetURI;
		if (eNotificationRequired()) {
			eNotify(
				new ENotificationImpl(
					this, Notification.SET, TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_URI, oldValueSetURI,
					valueSetURI));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getValueSetOID() {
		return valueSetOID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSetOID(String newValueSetOID) {
		String oldValueSetOID = valueSetOID;
		valueSetOID = newValueSetOID;
		if (eNotificationRequired()) {
			eNotify(
				new ENotificationImpl(
					this, Notification.SET, TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_OID, oldValueSetOID,
					valueSetOID));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TermPackage.CONTEXT_TO_VALUE_SET__CONTEXT:
				return getContext();
			case TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_NAME:
				return getValueSetName();
			case TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_URI:
				return getValueSetURI();
			case TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_OID:
				return getValueSetOID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TermPackage.CONTEXT_TO_VALUE_SET__CONTEXT:
				setContext((String) newValue);
				return;
			case TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_NAME:
				setValueSetName((String) newValue);
				return;
			case TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_URI:
				setValueSetURI((String) newValue);
				return;
			case TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_OID:
				setValueSetOID((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TermPackage.CONTEXT_TO_VALUE_SET__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_NAME:
				setValueSetName(VALUE_SET_NAME_EDEFAULT);
				return;
			case TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_URI:
				setValueSetURI(VALUE_SET_URI_EDEFAULT);
				return;
			case TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_OID:
				setValueSetOID(VALUE_SET_OID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TermPackage.CONTEXT_TO_VALUE_SET__CONTEXT:
				return CONTEXT_EDEFAULT == null
						? context != null
						: !CONTEXT_EDEFAULT.equals(context);
			case TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_NAME:
				return VALUE_SET_NAME_EDEFAULT == null
						? valueSetName != null
						: !VALUE_SET_NAME_EDEFAULT.equals(valueSetName);
			case TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_URI:
				return VALUE_SET_URI_EDEFAULT == null
						? valueSetURI != null
						: !VALUE_SET_URI_EDEFAULT.equals(valueSetURI);
			case TermPackage.CONTEXT_TO_VALUE_SET__VALUE_SET_OID:
				return VALUE_SET_OID_EDEFAULT == null
						? valueSetOID != null
						: !VALUE_SET_OID_EDEFAULT.equals(valueSetOID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (context: ");
		result.append(context);
		result.append(", valueSetName: ");
		result.append(valueSetName);
		result.append(", valueSetURI: ");
		result.append(valueSetURI);
		result.append(", valueSetOID: ");
		result.append(valueSetOID);
		result.append(')');
		return result.toString();
	}

} // ContextToValueSetImpl
