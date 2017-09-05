/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.LocationPosition#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.LocationPosition#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.LocationPosition#getAltitude <em>Altitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getLocationPosition()
 * @model
 * @generated
 */
public interface LocationPosition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' reference.
	 * @see #setLongitude(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getLocationPosition_Longitude()
	 * @model required="true"
	 * @generated
	 */
	Decimal getLongitude();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.LocationPosition#getLongitude <em>Longitude</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' reference.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(Decimal value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' reference.
	 * @see #setLatitude(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getLocationPosition_Latitude()
	 * @model required="true"
	 * @generated
	 */
	Decimal getLatitude();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.LocationPosition#getLatitude <em>Latitude</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' reference.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(Decimal value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' reference.
	 * @see #setAltitude(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getLocationPosition_Altitude()
	 * @model
	 * @generated
	 */
	Decimal getAltitude();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.LocationPosition#getAltitude <em>Altitude</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(Decimal value);

} // LocationPosition
