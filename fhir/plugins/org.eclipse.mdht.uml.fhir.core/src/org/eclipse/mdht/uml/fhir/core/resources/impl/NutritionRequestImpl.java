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
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance;
import org.eclipse.mdht.uml.fhir.core.resources.Encounter;
import org.eclipse.mdht.uml.fhir.core.resources.NutritionRequest;
import org.eclipse.mdht.uml.fhir.core.resources.NutritionRequestEnteralFormula;
import org.eclipse.mdht.uml.fhir.core.resources.NutritionRequestOralDiet;
import org.eclipse.mdht.uml.fhir.core.resources.NutritionRequestSupplement;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestImpl#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestImpl#getAllergyIntolerances <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestImpl#getFoodPreferenceModifiers <em>Food Preference Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestImpl#getExcludeFoodModifiers <em>Exclude Food Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestImpl#getOralDiet <em>Oral Diet</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestImpl#getSupplements <em>Supplement</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestImpl#getEnteralFormula <em>Enteral Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NutritionRequestImpl extends DomainResourceImpl implements NutritionRequest {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Encounter encounter;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateTime;

	/**
	 * The cached value of the '{@link #getOrderer() <em>Orderer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderer()
	 * @generated
	 * @ordered
	 */
	protected Practitioner orderer;

	/**
	 * The cached value of the '{@link #getAllergyIntolerances() <em>Allergy Intolerance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyIntolerances()
	 * @generated
	 * @ordered
	 */
	protected EList<AllergyIntolerance> allergyIntolerances;

	/**
	 * The cached value of the '{@link #getFoodPreferenceModifiers() <em>Food Preference Modifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodPreferenceModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> foodPreferenceModifiers;

	/**
	 * The cached value of the '{@link #getExcludeFoodModifiers() <em>Exclude Food Modifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeFoodModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> excludeFoodModifiers;

	/**
	 * The cached value of the '{@link #getOralDiet() <em>Oral Diet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOralDiet()
	 * @generated
	 * @ordered
	 */
	protected NutritionRequestOralDiet oralDiet;

	/**
	 * The cached value of the '{@link #getSupplements() <em>Supplement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplements()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionRequestSupplement> supplements;

	/**
	 * The cached value of the '{@link #getEnteralFormula() <em>Enteral Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnteralFormula()
	 * @generated
	 * @ordered
	 */
	protected NutritionRequestEnteralFormula enteralFormula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getNutritionRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.NUTRITION_REQUEST__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NUTRITION_REQUEST__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		if (patient != null && patient.eIsProxy()) {
			InternalEObject oldPatient = (InternalEObject)patient;
			patient = (Patient)eResolveProxy(oldPatient);
			if (patient != oldPatient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NUTRITION_REQUEST__PATIENT, oldPatient, patient));
			}
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Patient newPatient) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter getEncounter() {
		if (encounter != null && encounter.eIsProxy()) {
			InternalEObject oldEncounter = (InternalEObject)encounter;
			encounter = (Encounter)eResolveProxy(oldEncounter);
			if (encounter != oldEncounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NUTRITION_REQUEST__ENCOUNTER, oldEncounter, encounter));
			}
		}
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter basicGetEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Encounter newEncounter) {
		Encounter oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST__ENCOUNTER, oldEncounter, encounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateTime() {
		if (dateTime != null && dateTime.eIsProxy()) {
			InternalEObject oldDateTime = (InternalEObject)dateTime;
			dateTime = (DateTime)eResolveProxy(oldDateTime);
			if (dateTime != oldDateTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NUTRITION_REQUEST__DATE_TIME, oldDateTime, dateTime));
			}
		}
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(DateTime newDateTime) {
		DateTime oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST__DATE_TIME, oldDateTime, dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getOrderer() {
		if (orderer != null && orderer.eIsProxy()) {
			InternalEObject oldOrderer = (InternalEObject)orderer;
			orderer = (Practitioner)eResolveProxy(oldOrderer);
			if (orderer != oldOrderer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NUTRITION_REQUEST__ORDERER, oldOrderer, orderer));
			}
		}
		return orderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetOrderer() {
		return orderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderer(Practitioner newOrderer) {
		Practitioner oldOrderer = orderer;
		orderer = newOrderer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST__ORDERER, oldOrderer, orderer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyIntolerance> getAllergyIntolerances() {
		if (allergyIntolerances == null) {
			allergyIntolerances = new EObjectResolvingEList<AllergyIntolerance>(AllergyIntolerance.class, this, ResourcesPackage.NUTRITION_REQUEST__ALLERGY_INTOLERANCE);
		}
		return allergyIntolerances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFoodPreferenceModifiers() {
		if (foodPreferenceModifiers == null) {
			foodPreferenceModifiers = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.NUTRITION_REQUEST__FOOD_PREFERENCE_MODIFIER);
		}
		return foodPreferenceModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getExcludeFoodModifiers() {
		if (excludeFoodModifiers == null) {
			excludeFoodModifiers = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.NUTRITION_REQUEST__EXCLUDE_FOOD_MODIFIER);
		}
		return excludeFoodModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestOralDiet getOralDiet() {
		return oralDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOralDiet(NutritionRequestOralDiet newOralDiet, NotificationChain msgs) {
		NutritionRequestOralDiet oldOralDiet = oralDiet;
		oralDiet = newOralDiet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST__ORAL_DIET, oldOralDiet, newOralDiet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOralDiet(NutritionRequestOralDiet newOralDiet) {
		if (newOralDiet != oralDiet) {
			NotificationChain msgs = null;
			if (oralDiet != null)
				msgs = ((InternalEObject)oralDiet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_REQUEST__ORAL_DIET, null, msgs);
			if (newOralDiet != null)
				msgs = ((InternalEObject)newOralDiet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_REQUEST__ORAL_DIET, null, msgs);
			msgs = basicSetOralDiet(newOralDiet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST__ORAL_DIET, newOralDiet, newOralDiet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionRequestSupplement> getSupplements() {
		if (supplements == null) {
			supplements = new EObjectContainmentEList<NutritionRequestSupplement>(NutritionRequestSupplement.class, this, ResourcesPackage.NUTRITION_REQUEST__SUPPLEMENT);
		}
		return supplements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestEnteralFormula getEnteralFormula() {
		return enteralFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnteralFormula(NutritionRequestEnteralFormula newEnteralFormula, NotificationChain msgs) {
		NutritionRequestEnteralFormula oldEnteralFormula = enteralFormula;
		enteralFormula = newEnteralFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST__ENTERAL_FORMULA, oldEnteralFormula, newEnteralFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnteralFormula(NutritionRequestEnteralFormula newEnteralFormula) {
		if (newEnteralFormula != enteralFormula) {
			NotificationChain msgs = null;
			if (enteralFormula != null)
				msgs = ((InternalEObject)enteralFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_REQUEST__ENTERAL_FORMULA, null, msgs);
			if (newEnteralFormula != null)
				msgs = ((InternalEObject)newEnteralFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_REQUEST__ENTERAL_FORMULA, null, msgs);
			msgs = basicSetEnteralFormula(newEnteralFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST__ENTERAL_FORMULA, newEnteralFormula, newEnteralFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.NUTRITION_REQUEST__ORAL_DIET:
				return basicSetOralDiet(null, msgs);
			case ResourcesPackage.NUTRITION_REQUEST__SUPPLEMENT:
				return ((InternalEList<?>)getSupplements()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_REQUEST__ENTERAL_FORMULA:
				return basicSetEnteralFormula(null, msgs);
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
			case ResourcesPackage.NUTRITION_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.NUTRITION_REQUEST__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.NUTRITION_REQUEST__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case ResourcesPackage.NUTRITION_REQUEST__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case ResourcesPackage.NUTRITION_REQUEST__DATE_TIME:
				if (resolve) return getDateTime();
				return basicGetDateTime();
			case ResourcesPackage.NUTRITION_REQUEST__ORDERER:
				if (resolve) return getOrderer();
				return basicGetOrderer();
			case ResourcesPackage.NUTRITION_REQUEST__ALLERGY_INTOLERANCE:
				return getAllergyIntolerances();
			case ResourcesPackage.NUTRITION_REQUEST__FOOD_PREFERENCE_MODIFIER:
				return getFoodPreferenceModifiers();
			case ResourcesPackage.NUTRITION_REQUEST__EXCLUDE_FOOD_MODIFIER:
				return getExcludeFoodModifiers();
			case ResourcesPackage.NUTRITION_REQUEST__ORAL_DIET:
				return getOralDiet();
			case ResourcesPackage.NUTRITION_REQUEST__SUPPLEMENT:
				return getSupplements();
			case ResourcesPackage.NUTRITION_REQUEST__ENTERAL_FORMULA:
				return getEnteralFormula();
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
			case ResourcesPackage.NUTRITION_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__PATIENT:
				setPatient((Patient)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__DATE_TIME:
				setDateTime((DateTime)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__ORDERER:
				setOrderer((Practitioner)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__ALLERGY_INTOLERANCE:
				getAllergyIntolerances().clear();
				getAllergyIntolerances().addAll((Collection<? extends AllergyIntolerance>)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__FOOD_PREFERENCE_MODIFIER:
				getFoodPreferenceModifiers().clear();
				getFoodPreferenceModifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__EXCLUDE_FOOD_MODIFIER:
				getExcludeFoodModifiers().clear();
				getExcludeFoodModifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__ORAL_DIET:
				setOralDiet((NutritionRequestOralDiet)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__SUPPLEMENT:
				getSupplements().clear();
				getSupplements().addAll((Collection<? extends NutritionRequestSupplement>)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__ENTERAL_FORMULA:
				setEnteralFormula((NutritionRequestEnteralFormula)newValue);
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
			case ResourcesPackage.NUTRITION_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.NUTRITION_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__PATIENT:
				setPatient((Patient)null);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__DATE_TIME:
				setDateTime((DateTime)null);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__ORDERER:
				setOrderer((Practitioner)null);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__ALLERGY_INTOLERANCE:
				getAllergyIntolerances().clear();
				return;
			case ResourcesPackage.NUTRITION_REQUEST__FOOD_PREFERENCE_MODIFIER:
				getFoodPreferenceModifiers().clear();
				return;
			case ResourcesPackage.NUTRITION_REQUEST__EXCLUDE_FOOD_MODIFIER:
				getExcludeFoodModifiers().clear();
				return;
			case ResourcesPackage.NUTRITION_REQUEST__ORAL_DIET:
				setOralDiet((NutritionRequestOralDiet)null);
				return;
			case ResourcesPackage.NUTRITION_REQUEST__SUPPLEMENT:
				getSupplements().clear();
				return;
			case ResourcesPackage.NUTRITION_REQUEST__ENTERAL_FORMULA:
				setEnteralFormula((NutritionRequestEnteralFormula)null);
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
			case ResourcesPackage.NUTRITION_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.NUTRITION_REQUEST__STATUS:
				return status != null;
			case ResourcesPackage.NUTRITION_REQUEST__PATIENT:
				return patient != null;
			case ResourcesPackage.NUTRITION_REQUEST__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.NUTRITION_REQUEST__DATE_TIME:
				return dateTime != null;
			case ResourcesPackage.NUTRITION_REQUEST__ORDERER:
				return orderer != null;
			case ResourcesPackage.NUTRITION_REQUEST__ALLERGY_INTOLERANCE:
				return allergyIntolerances != null && !allergyIntolerances.isEmpty();
			case ResourcesPackage.NUTRITION_REQUEST__FOOD_PREFERENCE_MODIFIER:
				return foodPreferenceModifiers != null && !foodPreferenceModifiers.isEmpty();
			case ResourcesPackage.NUTRITION_REQUEST__EXCLUDE_FOOD_MODIFIER:
				return excludeFoodModifiers != null && !excludeFoodModifiers.isEmpty();
			case ResourcesPackage.NUTRITION_REQUEST__ORAL_DIET:
				return oralDiet != null;
			case ResourcesPackage.NUTRITION_REQUEST__SUPPLEMENT:
				return supplements != null && !supplements.isEmpty();
			case ResourcesPackage.NUTRITION_REQUEST__ENTERAL_FORMULA:
				return enteralFormula != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionRequestImpl
