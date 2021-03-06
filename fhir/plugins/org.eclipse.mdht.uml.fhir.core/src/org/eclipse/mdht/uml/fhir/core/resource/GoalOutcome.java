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
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Base;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.GoalOutcome#getResultx <em>Resultx</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getGoalOutcome()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Goal_Outcome'"
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getGoalOutcome_Resultx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='result[x]'"
	 * @generated
	 */
	Base getResultx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.GoalOutcome#getResultx <em>Resultx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultx</em>' reference.
	 * @see #getResultx()
	 * @generated
	 */
	void setResultx(Base value);

} // GoalOutcome
