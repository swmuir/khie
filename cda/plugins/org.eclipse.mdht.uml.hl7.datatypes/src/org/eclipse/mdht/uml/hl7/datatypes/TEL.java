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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.mdht.uml.hl7.vocab.TelecommunicationAddressUse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.TEL#getUseablePeriods <em>Useable Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.TEL#getUses <em>Use</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.TEL#getMixed <em>Mixed</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage#getTEL()
 * @model extendedMetaData="kind='mixed' name=''"
 * @generated
 */
public interface TEL extends URL {
	/**
	 * Returns the value of the '<em><b>Useable Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.SXCM_TS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Useable Period</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Useable Period</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage#getTEL_UseablePeriod()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	EList<SXCM_TS> getUseablePeriods();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.vocab.TelecommunicationAddressUse}.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.hl7.vocab.TelecommunicationAddressUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' attribute list.
	 * @see org.eclipse.mdht.uml.hl7.vocab.TelecommunicationAddressUse
	 * @see #isSetUses()
	 * @see #unsetUses()
	 * @see org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage#getTEL_Use()
	 * @model unsettable="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	EList<TelecommunicationAddressUse> getUses();

	/**
	 * Unsets the value of the '{@link org.eclipse.mdht.uml.hl7.datatypes.TEL#getUses <em>Use</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUses()
	 * @see #getUses()
	 * @generated
	 */
	void unsetUses();

	/**
	 * Returns whether the value of the '{@link org.eclipse.mdht.uml.hl7.datatypes.TEL#getUses <em>Use</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use</em>' attribute list is set.
	 * @see #unsetUses()
	 * @see #getUses()
	 * @generated
	 */
	boolean isSetUses();

	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage#getTEL_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="name='mixed' namespace='' kind='elementWildcard'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getText();

} // TEL
