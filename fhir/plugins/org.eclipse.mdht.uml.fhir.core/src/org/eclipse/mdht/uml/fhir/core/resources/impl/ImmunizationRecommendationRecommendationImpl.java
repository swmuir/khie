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
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.Immunization;
import org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendation;
import org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendationDateCriterion;
import org.eclipse.mdht.uml.fhir.core.resources.ImmunizationRecommendationRecommendationProtocol;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Recommendation Recommendation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationRecommendationRecommendationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationRecommendationRecommendationImpl#getVaccineCode <em>Vaccine Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationRecommendationRecommendationImpl#getDoseNumber <em>Dose Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationRecommendationRecommendationImpl#getForecastStatus <em>Forecast Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationRecommendationRecommendationImpl#getDateCriterions <em>Date Criterion</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationRecommendationRecommendationImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationRecommendationRecommendationImpl#getSupportingImmunizations <em>Supporting Immunization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImmunizationRecommendationRecommendationImpl#getSupportingPatientInformations <em>Supporting Patient Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmunizationRecommendationRecommendationImpl extends BackboneElementImpl implements ImmunizationRecommendationRecommendation {
	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getVaccineCode() <em>Vaccine Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccineCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept vaccineCode;

	/**
	 * The cached value of the '{@link #getDoseNumber() <em>Dose Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumber()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt doseNumber;

	/**
	 * The cached value of the '{@link #getForecastStatus() <em>Forecast Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept forecastStatus;

	/**
	 * The cached value of the '{@link #getDateCriterions() <em>Date Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCriterions()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationRecommendationRecommendationDateCriterion> dateCriterions;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ImmunizationRecommendationRecommendationProtocol protocol;

	/**
	 * The cached value of the '{@link #getSupportingImmunizations() <em>Supporting Immunization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingImmunizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Immunization> supportingImmunizations;

	/**
	 * The cached value of the '{@link #getSupportingPatientInformations() <em>Supporting Patient Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingPatientInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> supportingPatientInformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationRecommendationRecommendationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImmunizationRecommendationRecommendation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		if (date != null && date.eIsProxy()) {
			InternalEObject oldDate = (InternalEObject)date;
			date = (DateTime)eResolveProxy(oldDate);
			if (date != oldDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE, oldDate, date));
			}
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getVaccineCode() {
		if (vaccineCode != null && vaccineCode.eIsProxy()) {
			InternalEObject oldVaccineCode = (InternalEObject)vaccineCode;
			vaccineCode = (CodeableConcept)eResolveProxy(oldVaccineCode);
			if (vaccineCode != oldVaccineCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE, oldVaccineCode, vaccineCode));
			}
		}
		return vaccineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetVaccineCode() {
		return vaccineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaccineCode(CodeableConcept newVaccineCode) {
		CodeableConcept oldVaccineCode = vaccineCode;
		vaccineCode = newVaccineCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE, oldVaccineCode, vaccineCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getDoseNumber() {
		if (doseNumber != null && doseNumber.eIsProxy()) {
			InternalEObject oldDoseNumber = (InternalEObject)doseNumber;
			doseNumber = (PositiveInt)eResolveProxy(oldDoseNumber);
			if (doseNumber != oldDoseNumber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER, oldDoseNumber, doseNumber));
			}
		}
		return doseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetDoseNumber() {
		return doseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseNumber(PositiveInt newDoseNumber) {
		PositiveInt oldDoseNumber = doseNumber;
		doseNumber = newDoseNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER, oldDoseNumber, doseNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getForecastStatus() {
		if (forecastStatus != null && forecastStatus.eIsProxy()) {
			InternalEObject oldForecastStatus = (InternalEObject)forecastStatus;
			forecastStatus = (CodeableConcept)eResolveProxy(oldForecastStatus);
			if (forecastStatus != oldForecastStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, oldForecastStatus, forecastStatus));
			}
		}
		return forecastStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetForecastStatus() {
		return forecastStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForecastStatus(CodeableConcept newForecastStatus) {
		CodeableConcept oldForecastStatus = forecastStatus;
		forecastStatus = newForecastStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, oldForecastStatus, forecastStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationRecommendationRecommendationDateCriterion> getDateCriterions() {
		if (dateCriterions == null) {
			dateCriterions = new EObjectContainmentEList<ImmunizationRecommendationRecommendationDateCriterion>(ImmunizationRecommendationRecommendationDateCriterion.class, this, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION);
		}
		return dateCriterions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationRecommendationProtocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(ImmunizationRecommendationRecommendationProtocol newProtocol, NotificationChain msgs) {
		ImmunizationRecommendationRecommendationProtocol oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL, oldProtocol, newProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ImmunizationRecommendationRecommendationProtocol newProtocol) {
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL, null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL, null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL, newProtocol, newProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Immunization> getSupportingImmunizations() {
		if (supportingImmunizations == null) {
			supportingImmunizations = new EObjectResolvingEList<Immunization>(Immunization.class, this, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION);
		}
		return supportingImmunizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getSupportingPatientInformations() {
		if (supportingPatientInformations == null) {
			supportingPatientInformations = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION);
		}
		return supportingPatientInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return ((InternalEList<?>)getDateCriterions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL:
				return basicSetProtocol(null, msgs);
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
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				if (resolve) return getVaccineCode();
				return basicGetVaccineCode();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				if (resolve) return getDoseNumber();
				return basicGetDoseNumber();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				if (resolve) return getForecastStatus();
				return basicGetForecastStatus();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return getDateCriterions();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL:
				return getProtocol();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return getSupportingImmunizations();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return getSupportingPatientInformations();
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
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				setVaccineCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				setDoseNumber((PositiveInt)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				setForecastStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				getDateCriterions().clear();
				getDateCriterions().addAll((Collection<? extends ImmunizationRecommendationRecommendationDateCriterion>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL:
				setProtocol((ImmunizationRecommendationRecommendationProtocol)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				getSupportingImmunizations().clear();
				getSupportingImmunizations().addAll((Collection<? extends Immunization>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				getSupportingPatientInformations().clear();
				getSupportingPatientInformations().addAll((Collection<? extends Resource>)newValue);
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
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				setVaccineCode((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				setDoseNumber((PositiveInt)null);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				setForecastStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				getDateCriterions().clear();
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL:
				setProtocol((ImmunizationRecommendationRecommendationProtocol)null);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				getSupportingImmunizations().clear();
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				getSupportingPatientInformations().clear();
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
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE:
				return date != null;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				return vaccineCode != null;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBER:
				return doseNumber != null;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				return forecastStatus != null;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return dateCriterions != null && !dateCriterions.isEmpty();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__PROTOCOL:
				return protocol != null;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return supportingImmunizations != null && !supportingImmunizations.isEmpty();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return supportingPatientInformations != null && !supportingPatientInformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationRecommendationRecommendationImpl
