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
package org.eclipse.mdht.uml.cda.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.ExternalProcedure;
import org.eclipse.mdht.uml.cda.util.CDAValidator;
import org.eclipse.mdht.uml.hl7.rim.operations.ActOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>External Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.ExternalProcedure#validateClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.ExternalProcedure#validateMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mood Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalProcedureOperations extends ActOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalProcedureOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClassCode(ExternalProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClassCode(ExternalProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isClassCodeDefined() implies self.classCode=vocab::ActClass::PROC";

	/**
	 * The cached OCL invariant for the '{@link #validateClassCode(ExternalProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClassCode(ExternalProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalProcedure The receiving '<em><b>External Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClassCode(ExternalProcedure externalProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			synchronized (EOCL_ENV) {
				OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
				helper.setContext(CDAPackage.Literals.EXTERNAL_PROCEDURE);
				try {
					VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
						helper.createInvariant(VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
				} catch (ParserException pe) {
					throw new UnsupportedOperationException(pe.getLocalizedMessage());
				}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			externalProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDAValidator.DIAGNOSTIC_SOURCE, CDAValidator.EXTERNAL_PROCEDURE__CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"validateClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										externalProcedure, context) }),
						new Object[] { externalProcedure }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMoodCode(ExternalProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMoodCode(ExternalProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isMoodCodeDefined() implies self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMoodCode(ExternalProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMoodCode(ExternalProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalProcedure The receiving '<em><b>External Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMoodCode(ExternalProcedure externalProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			synchronized (EOCL_ENV) {
				OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
				helper.setContext(CDAPackage.Literals.EXTERNAL_PROCEDURE);
				try {
					VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
						helper.createInvariant(VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
				} catch (ParserException pe) {
					throw new UnsupportedOperationException(pe.getLocalizedMessage());
				}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			externalProcedure)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDAValidator.DIAGNOSTIC_SOURCE, CDAValidator.EXTERNAL_PROCEDURE__MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"validateMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										externalProcedure, context) }),
						new Object[] { externalProcedure }));
			}
			return false;
		}
		return true;
	}

} // ExternalProcedureOperations
