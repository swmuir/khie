/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Time;
import org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1;
import org.eclipse.mdht.uml.fhir.core.dataTypes.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Element1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getBoundsx <em>Boundsx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getCountMax <em>Count Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getDurationMax <em>Duration Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getDurationUnit <em>Duration Unit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getFrequencyMax <em>Frequency Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getPeriodMax <em>Period Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getPeriodUnit <em>Period Unit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getDayOfWeeks <em>Day Of Week</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getTimeOfDaies <em>Time Of Day</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimingElement1Impl extends ElementImpl implements TimingElement1 {
	/**
	 * The cached value of the '{@link #getBoundsx() <em>Boundsx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundsx()
	 * @generated
	 * @ordered
	 */
	protected DataType boundsx;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer count;

	/**
	 * The cached value of the '{@link #getCountMax() <em>Count Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountMax()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer countMax;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Decimal duration;

	/**
	 * The cached value of the '{@link #getDurationMax() <em>Duration Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMax()
	 * @generated
	 * @ordered
	 */
	protected Decimal durationMax;

	/**
	 * The cached value of the '{@link #getDurationUnit() <em>Duration Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationUnit()
	 * @generated
	 * @ordered
	 */
	protected Code durationUnit;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer frequency;

	/**
	 * The cached value of the '{@link #getFrequencyMax() <em>Frequency Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyMax()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer frequencyMax;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Decimal period;

	/**
	 * The cached value of the '{@link #getPeriodMax() <em>Period Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodMax()
	 * @generated
	 * @ordered
	 */
	protected Decimal periodMax;

	/**
	 * The cached value of the '{@link #getPeriodUnit() <em>Period Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodUnit()
	 * @generated
	 * @ordered
	 */
	protected Code periodUnit;

	/**
	 * The cached value of the '{@link #getDayOfWeeks() <em>Day Of Week</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeeks()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> dayOfWeeks;

	/**
	 * The cached value of the '{@link #getTimeOfDaies() <em>Time Of Day</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfDaies()
	 * @generated
	 * @ordered
	 */
	protected EList<Time> timeOfDaies;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected Code when;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt offset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingElement1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.TIMING_ELEMENT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBoundsx() {
		if (boundsx != null && boundsx.eIsProxy()) {
			InternalEObject oldBoundsx = (InternalEObject)boundsx;
			boundsx = (DataType)eResolveProxy(oldBoundsx);
			if (boundsx != oldBoundsx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TIMING_ELEMENT1__BOUNDSX, oldBoundsx, boundsx));
			}
		}
		return boundsx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBoundsx() {
		return boundsx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundsx(DataType newBoundsx) {
		DataType oldBoundsx = boundsx;
		boundsx = newBoundsx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__BOUNDSX, oldBoundsx, boundsx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getCount() {
		if (count != null && count.eIsProxy()) {
			InternalEObject oldCount = (InternalEObject)count;
			count = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldCount);
			if (count != oldCount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TIMING_ELEMENT1__COUNT, oldCount, count));
			}
		}
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newCount) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getCountMax() {
		if (countMax != null && countMax.eIsProxy()) {
			InternalEObject oldCountMax = (InternalEObject)countMax;
			countMax = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldCountMax);
			if (countMax != oldCountMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX, oldCountMax, countMax));
			}
		}
		return countMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetCountMax() {
		return countMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountMax(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newCountMax) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldCountMax = countMax;
		countMax = newCountMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX, oldCountMax, countMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getDuration() {
		if (duration != null && duration.eIsProxy()) {
			InternalEObject oldDuration = (InternalEObject)duration;
			duration = (Decimal)eResolveProxy(oldDuration);
			if (duration != oldDuration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TIMING_ELEMENT1__DURATION, oldDuration, duration));
			}
		}
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Decimal newDuration) {
		Decimal oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getDurationMax() {
		if (durationMax != null && durationMax.eIsProxy()) {
			InternalEObject oldDurationMax = (InternalEObject)durationMax;
			durationMax = (Decimal)eResolveProxy(oldDurationMax);
			if (durationMax != oldDurationMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX, oldDurationMax, durationMax));
			}
		}
		return durationMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetDurationMax() {
		return durationMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationMax(Decimal newDurationMax) {
		Decimal oldDurationMax = durationMax;
		durationMax = newDurationMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX, oldDurationMax, durationMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getDurationUnit() {
		if (durationUnit != null && durationUnit.eIsProxy()) {
			InternalEObject oldDurationUnit = (InternalEObject)durationUnit;
			durationUnit = (Code)eResolveProxy(oldDurationUnit);
			if (durationUnit != oldDurationUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT, oldDurationUnit, durationUnit));
			}
		}
		return durationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetDurationUnit() {
		return durationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationUnit(Code newDurationUnit) {
		Code oldDurationUnit = durationUnit;
		durationUnit = newDurationUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT, oldDurationUnit, durationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getFrequency() {
		if (frequency != null && frequency.eIsProxy()) {
			InternalEObject oldFrequency = (InternalEObject)frequency;
			frequency = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldFrequency);
			if (frequency != oldFrequency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TIMING_ELEMENT1__FREQUENCY, oldFrequency, frequency));
			}
		}
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newFrequency) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getFrequencyMax() {
		if (frequencyMax != null && frequencyMax.eIsProxy()) {
			InternalEObject oldFrequencyMax = (InternalEObject)frequencyMax;
			frequencyMax = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldFrequencyMax);
			if (frequencyMax != oldFrequencyMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX, oldFrequencyMax, frequencyMax));
			}
		}
		return frequencyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetFrequencyMax() {
		return frequencyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyMax(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newFrequencyMax) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldFrequencyMax = frequencyMax;
		frequencyMax = newFrequencyMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX, oldFrequencyMax, frequencyMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Decimal)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TIMING_ELEMENT1__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Decimal newPeriod) {
		Decimal oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPeriodMax() {
		if (periodMax != null && periodMax.eIsProxy()) {
			InternalEObject oldPeriodMax = (InternalEObject)periodMax;
			periodMax = (Decimal)eResolveProxy(oldPeriodMax);
			if (periodMax != oldPeriodMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX, oldPeriodMax, periodMax));
			}
		}
		return periodMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetPeriodMax() {
		return periodMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodMax(Decimal newPeriodMax) {
		Decimal oldPeriodMax = periodMax;
		periodMax = newPeriodMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX, oldPeriodMax, periodMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getPeriodUnit() {
		if (periodUnit != null && periodUnit.eIsProxy()) {
			InternalEObject oldPeriodUnit = (InternalEObject)periodUnit;
			periodUnit = (Code)eResolveProxy(oldPeriodUnit);
			if (periodUnit != oldPeriodUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT, oldPeriodUnit, periodUnit));
			}
		}
		return periodUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetPeriodUnit() {
		return periodUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodUnit(Code newPeriodUnit) {
		Code oldPeriodUnit = periodUnit;
		periodUnit = newPeriodUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT, oldPeriodUnit, periodUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getDayOfWeeks() {
		if (dayOfWeeks == null) {
			dayOfWeeks = new EObjectResolvingEList<Code>(Code.class, this, DataTypesPackage.TIMING_ELEMENT1__DAY_OF_WEEK);
		}
		return dayOfWeeks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Time> getTimeOfDaies() {
		if (timeOfDaies == null) {
			timeOfDaies = new EObjectResolvingEList<Time>(Time.class, this, DataTypesPackage.TIMING_ELEMENT1__TIME_OF_DAY);
		}
		return timeOfDaies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getWhen() {
		if (when != null && when.eIsProxy()) {
			InternalEObject oldWhen = (InternalEObject)when;
			when = (Code)eResolveProxy(oldWhen);
			if (when != oldWhen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TIMING_ELEMENT1__WHEN, oldWhen, when));
			}
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(Code newWhen) {
		Code oldWhen = when;
		when = newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getOffset() {
		if (offset != null && offset.eIsProxy()) {
			InternalEObject oldOffset = (InternalEObject)offset;
			offset = (UnsignedInt)eResolveProxy(oldOffset);
			if (offset != oldOffset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TIMING_ELEMENT1__OFFSET, oldOffset, offset));
			}
		}
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt basicGetOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(UnsignedInt newOffset) {
		UnsignedInt oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TIMING_ELEMENT1__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.TIMING_ELEMENT1__BOUNDSX:
				if (resolve) return getBoundsx();
				return basicGetBoundsx();
			case DataTypesPackage.TIMING_ELEMENT1__COUNT:
				if (resolve) return getCount();
				return basicGetCount();
			case DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX:
				if (resolve) return getCountMax();
				return basicGetCountMax();
			case DataTypesPackage.TIMING_ELEMENT1__DURATION:
				if (resolve) return getDuration();
				return basicGetDuration();
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX:
				if (resolve) return getDurationMax();
				return basicGetDurationMax();
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT:
				if (resolve) return getDurationUnit();
				return basicGetDurationUnit();
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY:
				if (resolve) return getFrequency();
				return basicGetFrequency();
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX:
				if (resolve) return getFrequencyMax();
				return basicGetFrequencyMax();
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX:
				if (resolve) return getPeriodMax();
				return basicGetPeriodMax();
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT:
				if (resolve) return getPeriodUnit();
				return basicGetPeriodUnit();
			case DataTypesPackage.TIMING_ELEMENT1__DAY_OF_WEEK:
				return getDayOfWeeks();
			case DataTypesPackage.TIMING_ELEMENT1__TIME_OF_DAY:
				return getTimeOfDaies();
			case DataTypesPackage.TIMING_ELEMENT1__WHEN:
				if (resolve) return getWhen();
				return basicGetWhen();
			case DataTypesPackage.TIMING_ELEMENT1__OFFSET:
				if (resolve) return getOffset();
				return basicGetOffset();
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
			case DataTypesPackage.TIMING_ELEMENT1__BOUNDSX:
				setBoundsx((DataType)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__COUNT:
				setCount((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX:
				setCountMax((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION:
				setDuration((Decimal)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX:
				setDurationMax((Decimal)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT:
				setDurationUnit((Code)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY:
				setFrequency((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX:
				setFrequencyMax((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD:
				setPeriod((Decimal)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX:
				setPeriodMax((Decimal)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT:
				setPeriodUnit((Code)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DAY_OF_WEEK:
				getDayOfWeeks().clear();
				getDayOfWeeks().addAll((Collection<? extends Code>)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__TIME_OF_DAY:
				getTimeOfDaies().clear();
				getTimeOfDaies().addAll((Collection<? extends Time>)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__WHEN:
				setWhen((Code)newValue);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__OFFSET:
				setOffset((UnsignedInt)newValue);
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
			case DataTypesPackage.TIMING_ELEMENT1__BOUNDSX:
				setBoundsx((DataType)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__COUNT:
				setCount((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX:
				setCountMax((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION:
				setDuration((Decimal)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX:
				setDurationMax((Decimal)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT:
				setDurationUnit((Code)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY:
				setFrequency((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX:
				setFrequencyMax((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD:
				setPeriod((Decimal)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX:
				setPeriodMax((Decimal)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT:
				setPeriodUnit((Code)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__DAY_OF_WEEK:
				getDayOfWeeks().clear();
				return;
			case DataTypesPackage.TIMING_ELEMENT1__TIME_OF_DAY:
				getTimeOfDaies().clear();
				return;
			case DataTypesPackage.TIMING_ELEMENT1__WHEN:
				setWhen((Code)null);
				return;
			case DataTypesPackage.TIMING_ELEMENT1__OFFSET:
				setOffset((UnsignedInt)null);
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
			case DataTypesPackage.TIMING_ELEMENT1__BOUNDSX:
				return boundsx != null;
			case DataTypesPackage.TIMING_ELEMENT1__COUNT:
				return count != null;
			case DataTypesPackage.TIMING_ELEMENT1__COUNT_MAX:
				return countMax != null;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION:
				return duration != null;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_MAX:
				return durationMax != null;
			case DataTypesPackage.TIMING_ELEMENT1__DURATION_UNIT:
				return durationUnit != null;
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY:
				return frequency != null;
			case DataTypesPackage.TIMING_ELEMENT1__FREQUENCY_MAX:
				return frequencyMax != null;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD:
				return period != null;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_MAX:
				return periodMax != null;
			case DataTypesPackage.TIMING_ELEMENT1__PERIOD_UNIT:
				return periodUnit != null;
			case DataTypesPackage.TIMING_ELEMENT1__DAY_OF_WEEK:
				return dayOfWeeks != null && !dayOfWeeks.isEmpty();
			case DataTypesPackage.TIMING_ELEMENT1__TIME_OF_DAY:
				return timeOfDaies != null && !timeOfDaies.isEmpty();
			case DataTypesPackage.TIMING_ELEMENT1__WHEN:
				return when != null;
			case DataTypesPackage.TIMING_ELEMENT1__OFFSET:
				return offset != null;
		}
		return super.eIsSet(featureID);
	}

} //TimingElement1Impl
