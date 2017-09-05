/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Element1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getBoundsx <em>Boundsx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getCountMax <em>Count Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDurationMax <em>Duration Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDurationUnit <em>Duration Unit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getFrequencyMax <em>Frequency Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getPeriodMax <em>Period Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getPeriodUnit <em>Period Unit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDayOfWeeks <em>Day Of Week</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getTimeOfDaies <em>Time Of Day</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1()
 * @model
 * @generated
 */
public interface TimingElement1 extends Element {
	/**
	 * Returns the value of the '<em><b>Boundsx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundsx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundsx</em>' reference.
	 * @see #setBoundsx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_Boundsx()
	 * @model
	 * @generated
	 */
	DataType getBoundsx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getBoundsx <em>Boundsx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundsx</em>' reference.
	 * @see #getBoundsx()
	 * @generated
	 */
	void setBoundsx(DataType value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' reference.
	 * @see #setCount(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_Count()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getCount();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getCount <em>Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Count Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Max</em>' reference.
	 * @see #setCountMax(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_CountMax()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getCountMax();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getCountMax <em>Count Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Max</em>' reference.
	 * @see #getCountMax()
	 * @generated
	 */
	void setCountMax(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' reference.
	 * @see #setDuration(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_Duration()
	 * @model
	 * @generated
	 */
	Decimal getDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDuration <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Max</em>' reference.
	 * @see #setDurationMax(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_DurationMax()
	 * @model
	 * @generated
	 */
	Decimal getDurationMax();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDurationMax <em>Duration Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Max</em>' reference.
	 * @see #getDurationMax()
	 * @generated
	 */
	void setDurationMax(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Unit</em>' reference.
	 * @see #setDurationUnit(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_DurationUnit()
	 * @model
	 * @generated
	 */
	Code getDurationUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDurationUnit <em>Duration Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Unit</em>' reference.
	 * @see #getDurationUnit()
	 * @generated
	 */
	void setDurationUnit(Code value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' reference.
	 * @see #setFrequency(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_Frequency()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getFrequency();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getFrequency <em>Frequency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Frequency Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Max</em>' reference.
	 * @see #setFrequencyMax(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_FrequencyMax()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getFrequencyMax();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getFrequencyMax <em>Frequency Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Max</em>' reference.
	 * @see #getFrequencyMax()
	 * @generated
	 */
	void setFrequencyMax(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' reference.
	 * @see #setPeriod(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_Period()
	 * @model
	 * @generated
	 */
	Decimal getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getPeriod <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Decimal value);

	/**
	 * Returns the value of the '<em><b>Period Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Max</em>' reference.
	 * @see #setPeriodMax(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_PeriodMax()
	 * @model
	 * @generated
	 */
	Decimal getPeriodMax();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getPeriodMax <em>Period Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Max</em>' reference.
	 * @see #getPeriodMax()
	 * @generated
	 */
	void setPeriodMax(Decimal value);

	/**
	 * Returns the value of the '<em><b>Period Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Unit</em>' reference.
	 * @see #setPeriodUnit(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_PeriodUnit()
	 * @model
	 * @generated
	 */
	Code getPeriodUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getPeriodUnit <em>Period Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Unit</em>' reference.
	 * @see #getPeriodUnit()
	 * @generated
	 */
	void setPeriodUnit(Code value);

	/**
	 * Returns the value of the '<em><b>Day Of Week</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Of Week</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Week</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_DayOfWeek()
	 * @model
	 * @generated
	 */
	EList<Code> getDayOfWeeks();

	/**
	 * Returns the value of the '<em><b>Time Of Day</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Time}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Of Day</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Of Day</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_TimeOfDay()
	 * @model
	 * @generated
	 */
	EList<Time> getTimeOfDaies();

	/**
	 * Returns the value of the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' reference.
	 * @see #setWhen(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_When()
	 * @model
	 * @generated
	 */
	Code getWhen();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getWhen <em>When</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Code value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' reference.
	 * @see #setOffset(UnsignedInt)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTimingElement1_Offset()
	 * @model
	 * @generated
	 */
	UnsignedInt getOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getOffset <em>Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(UnsignedInt value);

} // TimingElement1
