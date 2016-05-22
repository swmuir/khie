/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Metric Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the typical color of representation.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceMetricColor#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceMetricColor()
 * @model extendedMetaData="name='DeviceMetricColor' kind='elementOnly'"
 * @generated
 */
public interface DeviceMetricColor extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.DeviceMetricColorList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.DeviceMetricColorList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(DeviceMetricColorList)
	 * @see org.hl7.fhir.FhirPackage#getDeviceMetricColor_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	DeviceMetricColorList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceMetricColor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.DeviceMetricColorList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DeviceMetricColorList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.DeviceMetricColor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(DeviceMetricColorList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.DeviceMetricColor#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(DeviceMetricColorList)
	 * @generated
	 */
	boolean isSetValue();

} // DeviceMetricColor
