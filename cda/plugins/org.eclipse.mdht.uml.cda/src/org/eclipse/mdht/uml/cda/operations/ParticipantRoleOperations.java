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
import org.eclipse.mdht.uml.cda.ParticipantRole;
import org.eclipse.mdht.uml.cda.util.CDAValidator;
import org.eclipse.mdht.uml.hl7.rim.operations.RoleOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Participant Role</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.ParticipantRole#validatePlayingEntityChoice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Entity Choice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantRoleOperations extends RoleOperations {
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
	protected ParticipantRoleOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlayingEntityChoice(ParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Entity Choice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlayingEntityChoice(ParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAYING_ENTITY_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.playingDevice.oclIsUndefined() or self.playingEntity.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePlayingEntityChoice(ParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Entity Choice</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlayingEntityChoice(ParticipantRole, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PLAYING_ENTITY_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param participantRole The receiving '<em><b>Participant Role</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlayingEntityChoice(ParticipantRole participantRole, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PLAYING_ENTITY_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			synchronized (EOCL_ENV) {
				OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
				helper.setContext(CDAPackage.Literals.PARTICIPANT_ROLE);
				try {
					VALIDATE_PLAYING_ENTITY_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
						helper.createInvariant(VALIDATE_PLAYING_ENTITY_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
				} catch (ParserException pe) {
					throw new UnsupportedOperationException(pe.getLocalizedMessage());
				}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLAYING_ENTITY_CHOICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			participantRole)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDAValidator.DIAGNOSTIC_SOURCE,
						CDAValidator.PARTICIPANT_ROLE__PLAYING_ENTITY_CHOICE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"validatePlayingEntityChoice",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										participantRole, context) }),
						new Object[] { participantRole }));
			}
			return false;
		}
		return true;
	}

} // ParticipantRoleOperations
