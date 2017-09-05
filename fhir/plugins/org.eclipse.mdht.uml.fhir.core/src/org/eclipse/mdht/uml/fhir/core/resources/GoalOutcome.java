/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.GoalOutcome#getResultx <em>Resultx</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getGoalOutcome()
 * @model
 * @generated
 */
public interface GoalOutcome extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Resultx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resultx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultx</em>' reference.
	 * @see #setResultx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getGoalOutcome_Resultx()
	 * @model
	 * @generated
	 */
	Base getResultx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.GoalOutcome#getResultx <em>Resultx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultx</em>' reference.
	 * @see #getResultx()
	 * @generated
	 */
	void setResultx(Base value);

} // GoalOutcome
