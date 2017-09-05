/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Time;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practitioner Role Available Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.PractitionerRoleAvailableTime#getDaysOfWeeks <em>Days Of Week</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.PractitionerRoleAvailableTime#getAllDay <em>All Day</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.PractitionerRoleAvailableTime#getAvailableStartTime <em>Available Start Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.PractitionerRoleAvailableTime#getAvailableEndTime <em>Available End Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getPractitionerRoleAvailableTime()
 * @model
 * @generated
 */
public interface PractitionerRoleAvailableTime extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Days Of Week</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days Of Week</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days Of Week</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getPractitionerRoleAvailableTime_DaysOfWeek()
	 * @model
	 * @generated
	 */
	EList<Code> getDaysOfWeeks();

	/**
	 * Returns the value of the '<em><b>All Day</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Day</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Day</em>' reference.
	 * @see #setAllDay(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getPractitionerRoleAvailableTime_AllDay()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getAllDay();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.PractitionerRoleAvailableTime#getAllDay <em>All Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Day</em>' reference.
	 * @see #getAllDay()
	 * @generated
	 */
	void setAllDay(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Available Start Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Start Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Start Time</em>' reference.
	 * @see #setAvailableStartTime(Time)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getPractitionerRoleAvailableTime_AvailableStartTime()
	 * @model
	 * @generated
	 */
	Time getAvailableStartTime();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.PractitionerRoleAvailableTime#getAvailableStartTime <em>Available Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Start Time</em>' reference.
	 * @see #getAvailableStartTime()
	 * @generated
	 */
	void setAvailableStartTime(Time value);

	/**
	 * Returns the value of the '<em><b>Available End Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available End Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available End Time</em>' reference.
	 * @see #setAvailableEndTime(Time)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getPractitionerRoleAvailableTime_AvailableEndTime()
	 * @model
	 * @generated
	 */
	Time getAvailableEndTime();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.PractitionerRoleAvailableTime#getAvailableEndTime <em>Available End Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available End Time</em>' reference.
	 * @see #getAvailableEndTime()
	 * @generated
	 */
	void setAvailableEndTime(Time value);

} // PractitionerRoleAvailableTime
