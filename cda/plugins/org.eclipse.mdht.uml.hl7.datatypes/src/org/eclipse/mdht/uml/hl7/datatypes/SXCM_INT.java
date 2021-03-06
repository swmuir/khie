/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.hl7.datatypes;

import org.eclipse.mdht.uml.hl7.vocab.SetOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SXCM INT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.SXCM_INT#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage#getSXCM_INT()
 * @model
 * @generated
 */
public interface SXCM_INT extends INT {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"I"</code>.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.hl7.vocab.SetOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.SetOperator
	 * @see #isSetOperator()
	 * @see #unsetOperator()
	 * @see #setOperator(SetOperator)
	 * @see org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage#getSXCM_INT_Operator()
	 * @model default="I" unsettable="true" ordered="false"
	 * @generated
	 */
	SetOperator getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.hl7.datatypes.SXCM_INT#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.SetOperator
	 * @see #isSetOperator()
	 * @see #unsetOperator()
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(SetOperator value);

	/**
	 * Unsets the value of the '{@link org.eclipse.mdht.uml.hl7.datatypes.SXCM_INT#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperator()
	 * @see #getOperator()
	 * @see #setOperator(SetOperator)
	 * @generated
	 */
	void unsetOperator();

	/**
	 * Returns whether the value of the '{@link org.eclipse.mdht.uml.hl7.datatypes.SXCM_INT#getOperator <em>Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operator</em>' attribute is set.
	 * @see #unsetOperator()
	 * @see #getOperator()
	 * @see #setOperator(SetOperator)
	 * @generated
	 */
	boolean isSetOperator();

} // SXCM_INT
