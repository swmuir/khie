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
package org.eclipse.mdht.uml.cda;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.hl7.datatypes.BL;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.INT;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.eclipse.mdht.uml.hl7.datatypes.TS;
import org.eclipse.mdht.uml.hl7.rim.Entity;
import org.eclipse.mdht.uml.hl7.vocab.EntityClass;
import org.eclipse.mdht.uml.hl7.vocab.EntityDeterminer;
import org.eclipse.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getSDTCIds <em>SDTC Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getNames <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getSDTCDesc <em>SDTC Desc</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getAdministrativeGenderCode <em>Administrative Gender Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getBirthTime <em>Birth Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getSDTCDeceasedInd <em>SDTC Deceased Ind</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getSDTCDeceasedTime <em>SDTC Deceased Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getSDTCMultipleBirthInd <em>SDTC Multiple Birth Ind</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getSDTCMultipleBirthOrderNumber <em>SDTC Multiple Birth Order Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getSDTCRaceCodes <em>SDTC Race Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getSDTCEthnicGroupCodes <em>SDTC Ethnic Group Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.SubjectPerson#getDeterminerCode <em>Determiner Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson()
 * @model
 * @generated
 */
public interface SubjectPerson extends Entity {
	/**
	 * Returns the value of the '<em><b>Realm Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.CS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realm Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realm Code</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_RealmCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<CS> getRealmCodes();

	/**
	 * Returns the value of the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Id</em>' containment reference.
	 * @see #setTypeId(InfrastructureRootTypeId)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_TypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getTypeId <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Id</em>' containment reference.
	 * @see #getTypeId()
	 * @generated
	 */
	void setTypeId(InfrastructureRootTypeId value);

	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.II}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Id</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_TemplateId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<II> getTemplateIds();

	/**
	 * Returns the value of the '<em><b>SDTC Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.II}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDTC Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDTC Id</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_SDTCId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='id' namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	EList<II> getSDTCIds();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.PN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_Name()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<PN> getNames();

	/**
	 * Returns the value of the '<em><b>SDTC Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDTC Desc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDTC Desc</em>' containment reference.
	 * @see #setSDTCDesc(ED)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_SDTCDesc()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='desc' namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	ED getSDTCDesc();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getSDTCDesc <em>SDTC Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDTC Desc</em>' containment reference.
	 * @see #getSDTCDesc()
	 * @generated
	 */
	void setSDTCDesc(ED value);

	/**
	 * Returns the value of the '<em><b>Administrative Gender Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administrative Gender Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administrative Gender Code</em>' containment reference.
	 * @see #setAdministrativeGenderCode(CE)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_AdministrativeGenderCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	CE getAdministrativeGenderCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getAdministrativeGenderCode <em>Administrative Gender Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrative Gender Code</em>' containment reference.
	 * @see #getAdministrativeGenderCode()
	 * @generated
	 */
	void setAdministrativeGenderCode(CE value);

	/**
	 * Returns the value of the '<em><b>Birth Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Time</em>' containment reference.
	 * @see #setBirthTime(TS)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_BirthTime()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	TS getBirthTime();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getBirthTime <em>Birth Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Time</em>' containment reference.
	 * @see #getBirthTime()
	 * @generated
	 */
	void setBirthTime(TS value);

	/**
	 * Returns the value of the '<em><b>SDTC Deceased Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDTC Deceased Ind</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDTC Deceased Ind</em>' containment reference.
	 * @see #setSDTCDeceasedInd(BL)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_SDTCDeceasedInd()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='deceasedInd' namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	BL getSDTCDeceasedInd();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getSDTCDeceasedInd <em>SDTC Deceased Ind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDTC Deceased Ind</em>' containment reference.
	 * @see #getSDTCDeceasedInd()
	 * @generated
	 */
	void setSDTCDeceasedInd(BL value);

	/**
	 * Returns the value of the '<em><b>SDTC Deceased Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDTC Deceased Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDTC Deceased Time</em>' containment reference.
	 * @see #setSDTCDeceasedTime(TS)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_SDTCDeceasedTime()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='deceasedTime' namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	TS getSDTCDeceasedTime();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getSDTCDeceasedTime <em>SDTC Deceased Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDTC Deceased Time</em>' containment reference.
	 * @see #getSDTCDeceasedTime()
	 * @generated
	 */
	void setSDTCDeceasedTime(TS value);

	/**
	 * Returns the value of the '<em><b>SDTC Multiple Birth Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDTC Multiple Birth Ind</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDTC Multiple Birth Ind</em>' containment reference.
	 * @see #setSDTCMultipleBirthInd(BL)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_SDTCMultipleBirthInd()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='multipleBirthInd' namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	BL getSDTCMultipleBirthInd();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getSDTCMultipleBirthInd <em>SDTC Multiple Birth Ind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDTC Multiple Birth Ind</em>' containment reference.
	 * @see #getSDTCMultipleBirthInd()
	 * @generated
	 */
	void setSDTCMultipleBirthInd(BL value);

	/**
	 * Returns the value of the '<em><b>SDTC Multiple Birth Order Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDTC Multiple Birth Order Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDTC Multiple Birth Order Number</em>' containment reference.
	 * @see #setSDTCMultipleBirthOrderNumber(INT)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_SDTCMultipleBirthOrderNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='multipleBirthOrderNumber' namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	INT getSDTCMultipleBirthOrderNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getSDTCMultipleBirthOrderNumber <em>SDTC Multiple Birth Order Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDTC Multiple Birth Order Number</em>' containment reference.
	 * @see #getSDTCMultipleBirthOrderNumber()
	 * @generated
	 */
	void setSDTCMultipleBirthOrderNumber(INT value);

	/**
	 * Returns the value of the '<em><b>SDTC Race Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.CE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDTC Race Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDTC Race Code</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_SDTCRaceCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='raceCode' namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	EList<CE> getSDTCRaceCodes();

	/**
	 * Returns the value of the '<em><b>Null Flavor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.hl7.vocab.NullFlavor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Flavor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Flavor</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.NullFlavor
	 * @see #isSetNullFlavor()
	 * @see #unsetNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_NullFlavor()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Flavor</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.NullFlavor
	 * @see #isSetNullFlavor()
	 * @see #unsetNullFlavor()
	 * @see #getNullFlavor()
	 * @generated
	 */
	void setNullFlavor(NullFlavor value);

	/**
	 * Unsets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	void unsetNullFlavor();

	/**
	 * Returns whether the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getNullFlavor <em>Null Flavor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Null Flavor</em>' attribute is set.
	 * @see #unsetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	boolean isSetNullFlavor();

	/**
	 * Returns the value of the '<em><b>Class Code</b></em>' attribute.
	 * The default value is <code>"PSN"</code>.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.hl7.vocab.EntityClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.EntityClass
	 * @see #isSetClassCode()
	 * @see #unsetClassCode()
	 * @see #setClassCode(EntityClass)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_ClassCode()
	 * @model default="PSN" unsettable="true" ordered="false"
	 * @generated
	 */
	EntityClass getClassCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.EntityClass
	 * @see #isSetClassCode()
	 * @see #unsetClassCode()
	 * @see #getClassCode()
	 * @generated
	 */
	void setClassCode(EntityClass value);

	/**
	 * Unsets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassCode()
	 * @see #getClassCode()
	 * @see #setClassCode(EntityClass)
	 * @generated
	 */
	void unsetClassCode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getClassCode <em>Class Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Class Code</em>' attribute is set.
	 * @see #unsetClassCode()
	 * @see #getClassCode()
	 * @see #setClassCode(EntityClass)
	 * @generated
	 */
	boolean isSetClassCode();

	/**
	 * Returns the value of the '<em><b>Determiner Code</b></em>' attribute.
	 * The default value is <code>"INSTANCE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.hl7.vocab.EntityDeterminer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Determiner Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Determiner Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.EntityDeterminer
	 * @see #isSetDeterminerCode()
	 * @see #unsetDeterminerCode()
	 * @see #setDeterminerCode(EntityDeterminer)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_DeterminerCode()
	 * @model default="INSTANCE" unsettable="true" ordered="false"
	 * @generated
	 */
	EntityDeterminer getDeterminerCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getDeterminerCode <em>Determiner Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Determiner Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.EntityDeterminer
	 * @see #isSetDeterminerCode()
	 * @see #unsetDeterminerCode()
	 * @see #getDeterminerCode()
	 * @generated
	 */
	void setDeterminerCode(EntityDeterminer value);

	/**
	 * Unsets the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getDeterminerCode <em>Determiner Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeterminerCode()
	 * @see #getDeterminerCode()
	 * @see #setDeterminerCode(EntityDeterminer)
	 * @generated
	 */
	void unsetDeterminerCode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.mdht.uml.cda.SubjectPerson#getDeterminerCode <em>Determiner Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Determiner Code</em>' attribute is set.
	 * @see #unsetDeterminerCode()
	 * @see #getDeterminerCode()
	 * @see #setDeterminerCode(EntityDeterminer)
	 * @generated
	 */
	boolean isSetDeterminerCode();

	/**
	 * Returns the value of the '<em><b>SDTC Ethnic Group Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.CE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDTC Ethnic Group Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDTC Ethnic Group Code</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getSubjectPerson_SDTCEthnicGroupCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='ethnicGroupCode' namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	EList<CE> getSDTCEthnicGroupCodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.isClassCodeDefined() implies self.classCode=vocab::EntityClass::PSN'"
	 * @generated
	 */
	boolean validateClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.isDeterminerCodeDefined() implies self.determinerCode=vocab::EntityDeterminer::INSTANCE'"
	 * @generated
	 */
	boolean validateDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SubjectPerson
