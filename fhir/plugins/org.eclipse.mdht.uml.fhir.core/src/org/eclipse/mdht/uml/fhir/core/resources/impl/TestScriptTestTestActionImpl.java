/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert;
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionOperation;
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptTestTestAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Test Test Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptTestTestActionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptTestTestActionImpl#getAssert <em>Assert</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestScriptTestTestActionImpl extends BackboneElementImpl implements TestScriptTestTestAction {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected TestScriptSetupSetupActionOperation operation;

	/**
	 * The cached value of the '{@link #getAssert() <em>Assert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssert()
	 * @generated
	 * @ordered
	 */
	protected TestScriptSetupSetupActionAssert assert_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptTestTestActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestScriptTestTestAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionOperation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(TestScriptSetupSetupActionOperation newOperation, NotificationChain msgs) {
		TestScriptSetupSetupActionOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(TestScriptSetupSetupActionOperation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionAssert getAssert() {
		return assert_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssert(TestScriptSetupSetupActionAssert newAssert, NotificationChain msgs) {
		TestScriptSetupSetupActionAssert oldAssert = assert_;
		assert_ = newAssert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__ASSERT, oldAssert, newAssert);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssert(TestScriptSetupSetupActionAssert newAssert) {
		if (newAssert != assert_) {
			NotificationChain msgs = null;
			if (assert_ != null)
				msgs = ((InternalEObject)assert_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__ASSERT, null, msgs);
			if (newAssert != null)
				msgs = ((InternalEObject)newAssert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__ASSERT, null, msgs);
			msgs = basicSetAssert(newAssert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__ASSERT, newAssert, newAssert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__OPERATION:
				return basicSetOperation(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__ASSERT:
				return basicSetAssert(null, msgs);
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
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__OPERATION:
				return getOperation();
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__ASSERT:
				return getAssert();
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
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__OPERATION:
				setOperation((TestScriptSetupSetupActionOperation)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__ASSERT:
				setAssert((TestScriptSetupSetupActionAssert)newValue);
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
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__OPERATION:
				setOperation((TestScriptSetupSetupActionOperation)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__ASSERT:
				setAssert((TestScriptSetupSetupActionAssert)null);
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
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__OPERATION:
				return operation != null;
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION__ASSERT:
				return assert_ != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptTestTestActionImpl
