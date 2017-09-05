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
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ConsentExcept;
import org.eclipse.mdht.uml.fhir.core.resources.ConsentExceptActor;
import org.eclipse.mdht.uml.fhir.core.resources.ConsentExceptData;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Except</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConsentExceptImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConsentExceptImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConsentExceptImpl#getActors <em>Actor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConsentExceptImpl#getActions <em>Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConsentExceptImpl#getSecurityLabels <em>Security Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConsentExceptImpl#getPurposes <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConsentExceptImpl#getClasses <em>Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConsentExceptImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConsentExceptImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsentExceptImpl extends BackboneElementImpl implements ConsentExcept {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getActors() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentExceptActor> actors;

	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> actions;

	/**
	 * The cached value of the '{@link #getSecurityLabels() <em>Security Label</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> securityLabels;

	/**
	 * The cached value of the '{@link #getPurposes() <em>Purpose</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> purposes;

	/**
	 * The cached value of the '{@link #getClasses() <em>Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> classes;

	/**
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> codes;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentExceptData> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentExceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getConsentExcept();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONSENT_EXCEPT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT_EXCEPT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Period)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONSENT_EXCEPT__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT_EXCEPT__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConsentExceptActor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<ConsentExceptActor>(ConsentExceptActor.class, this, ResourcesPackage.CONSENT_EXCEPT__ACTOR);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONSENT_EXCEPT__ACTION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSecurityLabels() {
		if (securityLabels == null) {
			securityLabels = new EObjectResolvingEList<Coding>(Coding.class, this, ResourcesPackage.CONSENT_EXCEPT__SECURITY_LABEL);
		}
		return securityLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getPurposes() {
		if (purposes == null) {
			purposes = new EObjectResolvingEList<Coding>(Coding.class, this, ResourcesPackage.CONSENT_EXCEPT__PURPOSE);
		}
		return purposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getClasses() {
		if (classes == null) {
			classes = new EObjectResolvingEList<Coding>(Coding.class, this, ResourcesPackage.CONSENT_EXCEPT__CLASS);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getCodes() {
		if (codes == null) {
			codes = new EObjectResolvingEList<Coding>(Coding.class, this, ResourcesPackage.CONSENT_EXCEPT__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConsentExceptData> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<ConsentExceptData>(ConsentExceptData.class, this, ResourcesPackage.CONSENT_EXCEPT__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONSENT_EXCEPT__ACTOR:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENT_EXCEPT__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CONSENT_EXCEPT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.CONSENT_EXCEPT__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case ResourcesPackage.CONSENT_EXCEPT__ACTOR:
				return getActors();
			case ResourcesPackage.CONSENT_EXCEPT__ACTION:
				return getActions();
			case ResourcesPackage.CONSENT_EXCEPT__SECURITY_LABEL:
				return getSecurityLabels();
			case ResourcesPackage.CONSENT_EXCEPT__PURPOSE:
				return getPurposes();
			case ResourcesPackage.CONSENT_EXCEPT__CLASS:
				return getClasses();
			case ResourcesPackage.CONSENT_EXCEPT__CODE:
				return getCodes();
			case ResourcesPackage.CONSENT_EXCEPT__DATA:
				return getData();
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
			case ResourcesPackage.CONSENT_EXCEPT__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.CONSENT_EXCEPT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.CONSENT_EXCEPT__ACTOR:
				getActors().clear();
				getActors().addAll((Collection<? extends ConsentExceptActor>)newValue);
				return;
			case ResourcesPackage.CONSENT_EXCEPT__ACTION:
				getActions().clear();
				getActions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONSENT_EXCEPT__SECURITY_LABEL:
				getSecurityLabels().clear();
				getSecurityLabels().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.CONSENT_EXCEPT__PURPOSE:
				getPurposes().clear();
				getPurposes().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.CONSENT_EXCEPT__CLASS:
				getClasses().clear();
				getClasses().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.CONSENT_EXCEPT__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.CONSENT_EXCEPT__DATA:
				getData().clear();
				getData().addAll((Collection<? extends ConsentExceptData>)newValue);
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
			case ResourcesPackage.CONSENT_EXCEPT__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.CONSENT_EXCEPT__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.CONSENT_EXCEPT__ACTOR:
				getActors().clear();
				return;
			case ResourcesPackage.CONSENT_EXCEPT__ACTION:
				getActions().clear();
				return;
			case ResourcesPackage.CONSENT_EXCEPT__SECURITY_LABEL:
				getSecurityLabels().clear();
				return;
			case ResourcesPackage.CONSENT_EXCEPT__PURPOSE:
				getPurposes().clear();
				return;
			case ResourcesPackage.CONSENT_EXCEPT__CLASS:
				getClasses().clear();
				return;
			case ResourcesPackage.CONSENT_EXCEPT__CODE:
				getCodes().clear();
				return;
			case ResourcesPackage.CONSENT_EXCEPT__DATA:
				getData().clear();
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
			case ResourcesPackage.CONSENT_EXCEPT__TYPE:
				return type != null;
			case ResourcesPackage.CONSENT_EXCEPT__PERIOD:
				return period != null;
			case ResourcesPackage.CONSENT_EXCEPT__ACTOR:
				return actors != null && !actors.isEmpty();
			case ResourcesPackage.CONSENT_EXCEPT__ACTION:
				return actions != null && !actions.isEmpty();
			case ResourcesPackage.CONSENT_EXCEPT__SECURITY_LABEL:
				return securityLabels != null && !securityLabels.isEmpty();
			case ResourcesPackage.CONSENT_EXCEPT__PURPOSE:
				return purposes != null && !purposes.isEmpty();
			case ResourcesPackage.CONSENT_EXCEPT__CLASS:
				return classes != null && !classes.isEmpty();
			case ResourcesPackage.CONSENT_EXCEPT__CODE:
				return codes != null && !codes.isEmpty();
			case ResourcesPackage.CONSENT_EXCEPT__DATA:
				return data != null && !data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConsentExceptImpl
