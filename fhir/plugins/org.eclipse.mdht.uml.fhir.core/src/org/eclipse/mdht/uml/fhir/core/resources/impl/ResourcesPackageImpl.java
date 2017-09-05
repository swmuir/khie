/**
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesFactory;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.valueSets.ValueSetsPackage;
import org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcesPackageImpl extends EPackageImpl implements ResourcesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "resources.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practitionerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practitionerRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practitionerRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareServiceAvailableTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareServiceNotAvailableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practitionerQualificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientAnimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionSnapshotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionDifferentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetComposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetComposeConceptSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetComposeConceptSetConceptReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetComposeConceptSetConceptReferenceDesignationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetComposeConceptSetFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetExpansionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetExpansionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetExpansionContainsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass researchSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass researchStudyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planDefinitionActionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planDefinitionActionDefinitionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planDefinitionActionDefinitionRelatedActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureMapStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureMapGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureMapGroupInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureMapGroupRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureMapGroupRuleSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureMapGroupRuleTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureMapGroupRuleTargetParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureMapGroupRuleDependentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDefinitionDynamicValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planDefinitionActionDefinitionDynamicValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass researchStudyArmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentExceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentExceptActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentExceptDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationProductIngredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationProductBatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationPackageContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceIngredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceRelatesToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterStatusHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeOfCareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeOfCareStatusHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referralRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass careTeamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass careTeamParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractSignatoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractValuedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractTermTermAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractTermTermValuedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractFriendlyLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractLegalLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractComputableLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountGuarantorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterHospitalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceContextRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalImpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalImpressionInvestigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalImpressionFindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskAssessmentPredictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceReactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specimenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specimenCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specimenTreatmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specimenContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationReferenceRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceComponentProductionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceMetricCalibrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireItemEnableWhenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireItemOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireResponseItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireResponseItemAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanRelatedPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalOutcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanActivityDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionRequestOralDietEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionRequestOralDietNutrientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionRequestOralDietTextureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionRequestSupplementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionRequestEnteralFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionRequestEnteralFormulaAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationRequestPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceUseRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationRequestDispenseRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationRequestSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRequestItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visionPrescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visionPrescriptionDispenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedurePerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticReportImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureFocalDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingStudyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingStudyStudyBaseLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingStudySeriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingStudySeriesSeriesBaseLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingStudySeriesInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingManifestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingManifestStudyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingManifestStudyStudyBaseLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingManifestStudySeriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingManifestStudySeriesSeriesBaseLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingManifestStudySeriesInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationAdministrationDosageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceReferenceSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceVariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceQualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceStructureVariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceStructureVariantOuterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceStructureVariantInnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyMemberHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyMemberHistoryConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionAttesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingSystemUniqueIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapGroupSourceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapGroupSourceElementTargetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapGroupSourceElementTargetElementOtherElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestGroupActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestGroupActionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestGroupActionRelatedActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemConceptDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemConceptDefinitionDesignationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemConceptDefinitionConceptPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentManifestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentManifestContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentManifestRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentReconciliationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentReconciliationDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentReconciliationNotesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceUseStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptOriginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptDestinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptMetadataLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptMetadataCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementSoftwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementRestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementRestSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementRestSecurityCertificateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementRestResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementRestResourceResourceInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementRestResourceSearchParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementRestSystemInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementRestOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionParameterBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionOverloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementMessagingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementMessagingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementMessagingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityStatementDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptFixtureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptRuleRuleParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptRulesetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptRulesetRulesetRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptRulesetRulesetRuleRulesetRuleParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupSetupActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupSetupActionOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupSetupActionOperationRequestHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupSetupActionAssertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupSetupActionAssertActionAssertRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupSetupActionAssertActionAssertRulesetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptTestTestActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptTeardownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptTeardownTeardownActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageHeaderResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationOutcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationOutcomeIssueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageHeaderMessageSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageHeaderMessageDestinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodySiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enrollmentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enrollmentRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRecommendationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRecommendationRecommendationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRecommendationRecommendationDateCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRecommendationRecommendationProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationExplanationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationReactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationVaccinationProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEntrySearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEntryRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEntryResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testReportParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testReportSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testReportSetupSetupActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testReportSetupSetupActionOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testReportSetupSetupActionAssertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testReportTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testReportTestTestActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testReportTeardownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testReportTeardownTeardownActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eligibilityResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eligibilityRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eligibilityResponseInsuranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eligibilityResponseInsuranceBenefitsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eligibilityResponseInsuranceBenefitsBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eligibilityResponseErrorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispenseSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureGroupPopulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureGroupStratifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureSupplementalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureReportGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureReportGroupPopulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureReportGroupStratifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureReportGroupStratifierStratifierGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureReportGroupStratifierStratifierGroupStratifierGroupPopulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureReportGroupSupplementalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureReportGroupSupplementalDataSupplementalDataGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimRelatedClaimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimPayeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimCareTeamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimSpecialConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimDiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimInsuranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimAccidentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimItemDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimItemDetailSubDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimItemProsthesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseItemAdjudicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseItemItemDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseItemItemDetailSubDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseAddedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseAddedItemAddedItemsDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponsePaymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseInsuranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRequesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitRelatedClaimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitPayeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitSupportingInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitCareTeamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitDiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitInsuranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitAccidentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitItemAdjudicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitItemDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitItemDetailSubDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitItemProsthesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitAddedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitAddedItemAddedItemsDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitPaymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitBenefitBalanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitBenefitBalanceBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationGuideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationGuideDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationGuidePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationGuidePackageResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationGuideGlobalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationGuidePageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchParameterComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionProfileFixedVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionProfileExcludedSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionProfileDesignationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionProfileDesignationDesignationIncludeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionProfileDesignationDesignationIncludeDesignationIncludeDesignationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionProfileDesignationDesignationExcludeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionProfileDesignationDesignationExcludeDesignationExcludeDesignationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentDefinitionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processResponseNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practitionerRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practitionerRoleAvailableTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practitionerRoleNotAvailableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentNoticeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkageItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyRequestWhenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guidanceResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDefinitionFocusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDefinitionAllowedResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detectedIssueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detectedIssueMitigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventAgentNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventEntityDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyDeliveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationContactEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourcesPackageImpl() {
		super(eNS_URI, ResourcesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ResourcesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ResourcesPackage init() {
		if (isInited) return (ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);

		// Obtain or create and register package
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResourcesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResourcesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ValueSetsPackageImpl theValueSetsPackage = (ValueSetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI) instanceof ValueSetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI) : ValueSetsPackage.eINSTANCE);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);

		// Load packages
		theResourcesPackage.loadPackage();
		theValueSetsPackage.loadPackage();

		// Create package meta-data objects
		theDataTypesPackage.createPackageContents();

		// Initialize created meta-data
		theDataTypesPackage.initializePackageContents();

		// Fix loaded packages
		theResourcesPackage.fixPackageContents();
		theValueSetsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourcesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourcesPackage.eNS_URI, theResourcesPackage);
		return theResourcesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractitioner() {
		if (practitionerEClass == null) {
			practitionerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return practitionerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Identifier() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Active() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Name() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Telecom() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Address() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Gender() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_BirthDate() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Photo() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Role() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Qualification() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Communication() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainResource() {
		if (domainResourceEClass == null) {
			domainResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return domainResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainResource_Text() {
        return (EReference)getDomainResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainResource_Contained() {
        return (EReference)getDomainResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainResource_Extension() {
        return (EReference)getDomainResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainResource_ModifierExtension() {
        return (EReference)getDomainResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		if (resourceEClass == null) {
			resourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Id() {
        return (EReference)getResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Meta() {
        return (EReference)getResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_ImplicitRules() {
        return (EReference)getResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Language() {
        return (EReference)getResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractitionerRole() {
		if (practitionerRoleEClass == null) {
			practitionerRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return practitionerRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Organization() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Code() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Specialty() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Identifier() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Telecom() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Period() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Location() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_HealthcareService() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Endpoint() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractitionerRole() {
		if (practitionerRoleEClass == null) {
			practitionerRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(399);
		}
		return practitionerRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Organization() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Code() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Specialty() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Identifier() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Telecom() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Period() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Location() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_HealthcareService() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Endpoint() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		if (locationEClass == null) {
			locationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Identifier() {
        return (EReference)getLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Status() {
        return (EReference)getLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Name() {
        return (EReference)getLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Alias() {
        return (EReference)getLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Description() {
        return (EReference)getLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Mode() {
        return (EReference)getLocation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Type() {
        return (EReference)getLocation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Telecom() {
        return (EReference)getLocation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Address() {
        return (EReference)getLocation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_PhysicalType() {
        return (EReference)getLocation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Position() {
        return (EReference)getLocation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_ManagingOrganization() {
        return (EReference)getLocation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_PartOf() {
        return (EReference)getLocation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Endpoint() {
        return (EReference)getLocation().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationPosition() {
		if (locationPositionEClass == null) {
			locationPositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return locationPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationPosition_Longitude() {
        return (EReference)getLocationPosition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationPosition_Latitude() {
        return (EReference)getLocationPosition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationPosition_Altitude() {
        return (EReference)getLocationPosition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpoint() {
		if (endpointEClass == null) {
			endpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return endpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_Identifier() {
        return (EReference)getEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_Status() {
        return (EReference)getEndpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_Name() {
        return (EReference)getEndpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_ManagingOrganization() {
        return (EReference)getEndpoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_Contact() {
        return (EReference)getEndpoint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_Period() {
        return (EReference)getEndpoint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_ConnectionType() {
        return (EReference)getEndpoint().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_PayloadType() {
        return (EReference)getEndpoint().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_PayloadMimeType() {
        return (EReference)getEndpoint().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_Address() {
        return (EReference)getEndpoint().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_Header() {
        return (EReference)getEndpoint().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_PublicKey() {
        return (EReference)getEndpoint().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareService() {
		if (healthcareServiceEClass == null) {
			healthcareServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return healthcareServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Identifier() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Active() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ProvidedBy() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ServiceCategory() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ServiceType() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Specialty() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Location() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ServiceName() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Comment() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ExtraDetails() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Photo() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Telecom() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_CoverageArea() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ServiceProvisionCode() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Eligibility() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_EligibilityNote() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ProgramName() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Characteristic() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ReferralMethod() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_PublicKey() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_AppointmentRequired() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_AvailableTime() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_NotAvailable() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_AvailabilityExceptions() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Endpoint() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareServiceAvailableTime() {
		if (healthcareServiceAvailableTimeEClass == null) {
			healthcareServiceAvailableTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return healthcareServiceAvailableTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceAvailableTime_DaysOfWeek() {
        return (EReference)getHealthcareServiceAvailableTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceAvailableTime_AllDay() {
        return (EReference)getHealthcareServiceAvailableTime().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceAvailableTime_AvailableStartTime() {
        return (EReference)getHealthcareServiceAvailableTime().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceAvailableTime_AvailableEndTime() {
        return (EReference)getHealthcareServiceAvailableTime().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareServiceNotAvailable() {
		if (healthcareServiceNotAvailableEClass == null) {
			healthcareServiceNotAvailableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return healthcareServiceNotAvailableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceNotAvailable_Description() {
        return (EReference)getHealthcareServiceNotAvailable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceNotAvailable_During() {
        return (EReference)getHealthcareServiceNotAvailable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractitionerQualification() {
		if (practitionerQualificationEClass == null) {
			practitionerQualificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(10);
		}
		return practitionerQualificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerQualification_Identifier() {
        return (EReference)getPractitionerQualification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerQualification_Code() {
        return (EReference)getPractitionerQualification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerQualification_Period() {
        return (EReference)getPractitionerQualification().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerQualification_Issuer() {
        return (EReference)getPractitionerQualification().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatient() {
		if (patientEClass == null) {
			patientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(11);
		}
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Identifier() {
        return (EReference)getPatient().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Active() {
        return (EReference)getPatient().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Name() {
        return (EReference)getPatient().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Telecom() {
        return (EReference)getPatient().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Gender() {
        return (EReference)getPatient().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_BirthDate() {
        return (EReference)getPatient().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Deceasedx() {
        return (EReference)getPatient().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Address() {
        return (EReference)getPatient().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_MaritalStatus() {
        return (EReference)getPatient().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_MultipleBirthx() {
        return (EReference)getPatient().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Photo() {
        return (EReference)getPatient().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Contact() {
        return (EReference)getPatient().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Animal() {
        return (EReference)getPatient().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Communication() {
        return (EReference)getPatient().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_GeneralPractitioner() {
        return (EReference)getPatient().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_ManagingOrganization() {
        return (EReference)getPatient().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Link() {
        return (EReference)getPatient().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientContact() {
		if (patientContactEClass == null) {
			patientContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(12);
		}
		return patientContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Relationship() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Name() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Telecom() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Address() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Gender() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Organization() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Period() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientAnimal() {
		if (patientAnimalEClass == null) {
			patientAnimalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(13);
		}
		return patientAnimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientAnimal_Species() {
        return (EReference)getPatientAnimal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientAnimal_Breed() {
        return (EReference)getPatientAnimal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientAnimal_GenderStatus() {
        return (EReference)getPatientAnimal().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientCommunication() {
		if (patientCommunicationEClass == null) {
			patientCommunicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(14);
		}
		return patientCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientCommunication_Language() {
        return (EReference)getPatientCommunication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientCommunication_Preferred() {
        return (EReference)getPatientCommunication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientLink() {
		if (patientLinkEClass == null) {
			patientLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(15);
		}
		return patientLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientLink_Other() {
        return (EReference)getPatientLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientLink_Type() {
        return (EReference)getPatientLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedPerson() {
		if (relatedPersonEClass == null) {
			relatedPersonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(16);
		}
		return relatedPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Identifier() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Active() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Patient() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Relationship() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Name() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Telecom() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Gender() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_BirthDate() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Address() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Photo() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Period() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		if (deviceEClass == null) {
			deviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(17);
		}
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Identifier() {
        return (EReference)getDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_UdiCarrier() {
        return (EReference)getDevice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Status() {
        return (EReference)getDevice().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Type() {
        return (EReference)getDevice().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_LotNumber() {
        return (EReference)getDevice().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Manufacturer() {
        return (EReference)getDevice().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_ManufactureDate() {
        return (EReference)getDevice().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_ExpirationDate() {
        return (EReference)getDevice().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Model() {
        return (EReference)getDevice().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Version() {
        return (EReference)getDevice().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Patient() {
        return (EReference)getDevice().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Owner() {
        return (EReference)getDevice().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Contact() {
        return (EReference)getDevice().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Location() {
        return (EReference)getDevice().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Url() {
        return (EReference)getDevice().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Note() {
        return (EReference)getDevice().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		if (libraryEClass == null) {
			libraryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(18);
		}
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Url() {
        return (EReference)getLibrary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Identifier() {
        return (EReference)getLibrary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Version() {
        return (EReference)getLibrary().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Name() {
        return (EReference)getLibrary().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Title() {
        return (EReference)getLibrary().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Type() {
        return (EReference)getLibrary().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Status() {
        return (EReference)getLibrary().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Experimental() {
        return (EReference)getLibrary().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Date() {
        return (EReference)getLibrary().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Description() {
        return (EReference)getLibrary().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Purpose() {
        return (EReference)getLibrary().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Usage() {
        return (EReference)getLibrary().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_ApprovalDate() {
        return (EReference)getLibrary().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_LastReviewDate() {
        return (EReference)getLibrary().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_EffectivePeriod() {
        return (EReference)getLibrary().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_UseContext() {
        return (EReference)getLibrary().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Jurisdiction() {
        return (EReference)getLibrary().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Topic() {
        return (EReference)getLibrary().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Contributor() {
        return (EReference)getLibrary().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Publisher() {
        return (EReference)getLibrary().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Contact() {
        return (EReference)getLibrary().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Copyright() {
        return (EReference)getLibrary().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_RelatedArtifact() {
        return (EReference)getLibrary().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Parameter() {
        return (EReference)getLibrary().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_DataRequirement() {
        return (EReference)getLibrary().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Content() {
        return (EReference)getLibrary().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinition() {
		if (structureDefinitionEClass == null) {
			structureDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(19);
		}
		return structureDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Url() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Identifier() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Version() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Name() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Title() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Status() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Experimental() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Publisher() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Contact() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Date() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Description() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_UseContext() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Jurisdiction() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Purpose() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Copyright() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Keyword() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_FhirVersion() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Mapping() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Kind() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Abstract() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_ContextType() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Context() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_ContextInvariant() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Type() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_BaseDefinition() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Derivation() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Snapshot() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Differential() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinitionMapping() {
		if (structureDefinitionMappingEClass == null) {
			structureDefinitionMappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(20);
		}
		return structureDefinitionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionMapping_Identity() {
        return (EReference)getStructureDefinitionMapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionMapping_Uri() {
        return (EReference)getStructureDefinitionMapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionMapping_Name() {
        return (EReference)getStructureDefinitionMapping().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionMapping_Comments() {
        return (EReference)getStructureDefinitionMapping().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinitionSnapshot() {
		if (structureDefinitionSnapshotEClass == null) {
			structureDefinitionSnapshotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(21);
		}
		return structureDefinitionSnapshotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionSnapshot_Element() {
        return (EReference)getStructureDefinitionSnapshot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinitionDifferential() {
		if (structureDefinitionDifferentialEClass == null) {
			structureDefinitionDifferentialEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(22);
		}
		return structureDefinitionDifferentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionDifferential_Element() {
        return (EReference)getStructureDefinitionDifferential().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSet() {
		if (valueSetEClass == null) {
			valueSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(23);
		}
		return valueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Url() {
        return (EReference)getValueSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Identifier() {
        return (EReference)getValueSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Version() {
        return (EReference)getValueSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Name() {
        return (EReference)getValueSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Title() {
        return (EReference)getValueSet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Status() {
        return (EReference)getValueSet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Experimental() {
        return (EReference)getValueSet().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Publisher() {
        return (EReference)getValueSet().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Contact() {
        return (EReference)getValueSet().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Date() {
        return (EReference)getValueSet().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Description() {
        return (EReference)getValueSet().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_UseContext() {
        return (EReference)getValueSet().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Jurisdiction() {
        return (EReference)getValueSet().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Immutable() {
        return (EReference)getValueSet().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Purpose() {
        return (EReference)getValueSet().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Copyright() {
        return (EReference)getValueSet().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Extensible() {
        return (EReference)getValueSet().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Compose() {
        return (EReference)getValueSet().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Expansion() {
        return (EReference)getValueSet().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetCompose() {
		if (valueSetComposeEClass == null) {
			valueSetComposeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(24);
		}
		return valueSetComposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCompose_LockedDate() {
        return (EReference)getValueSetCompose().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCompose_Inactive() {
        return (EReference)getValueSetCompose().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCompose_Include() {
        return (EReference)getValueSetCompose().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCompose_Exclude() {
        return (EReference)getValueSetCompose().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetComposeConceptSet() {
		if (valueSetComposeConceptSetEClass == null) {
			valueSetComposeConceptSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(25);
		}
		return valueSetComposeConceptSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSet_System() {
        return (EReference)getValueSetComposeConceptSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSet_Version() {
        return (EReference)getValueSetComposeConceptSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSet_Concept() {
        return (EReference)getValueSetComposeConceptSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSet_Filter() {
        return (EReference)getValueSetComposeConceptSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSet_ValueSet() {
        return (EReference)getValueSetComposeConceptSet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetComposeConceptSetConceptReference() {
		if (valueSetComposeConceptSetConceptReferenceEClass == null) {
			valueSetComposeConceptSetConceptReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(26);
		}
		return valueSetComposeConceptSetConceptReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetConceptReference_Code() {
        return (EReference)getValueSetComposeConceptSetConceptReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetConceptReference_Display() {
        return (EReference)getValueSetComposeConceptSetConceptReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetConceptReference_Designation() {
        return (EReference)getValueSetComposeConceptSetConceptReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetComposeConceptSetConceptReferenceDesignation() {
		if (valueSetComposeConceptSetConceptReferenceDesignationEClass == null) {
			valueSetComposeConceptSetConceptReferenceDesignationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(27);
		}
		return valueSetComposeConceptSetConceptReferenceDesignationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetConceptReferenceDesignation_Language() {
        return (EReference)getValueSetComposeConceptSetConceptReferenceDesignation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetConceptReferenceDesignation_Use() {
        return (EReference)getValueSetComposeConceptSetConceptReferenceDesignation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetConceptReferenceDesignation_Value() {
        return (EReference)getValueSetComposeConceptSetConceptReferenceDesignation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetComposeConceptSetFilter() {
		if (valueSetComposeConceptSetFilterEClass == null) {
			valueSetComposeConceptSetFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(28);
		}
		return valueSetComposeConceptSetFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetFilter_Property() {
        return (EReference)getValueSetComposeConceptSetFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetFilter_Op() {
        return (EReference)getValueSetComposeConceptSetFilter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetFilter_Value() {
        return (EReference)getValueSetComposeConceptSetFilter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetExpansion() {
		if (valueSetExpansionEClass == null) {
			valueSetExpansionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(29);
		}
		return valueSetExpansionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Identifier() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Timestamp() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Total() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Offset() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Parameter() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Contains() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetExpansionParameter() {
		if (valueSetExpansionParameterEClass == null) {
			valueSetExpansionParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(30);
		}
		return valueSetExpansionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionParameter_Name() {
        return (EReference)getValueSetExpansionParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionParameter_Valuex() {
        return (EReference)getValueSetExpansionParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetExpansionContains() {
		if (valueSetExpansionContainsEClass == null) {
			valueSetExpansionContainsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(31);
		}
		return valueSetExpansionContainsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_System() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_Abstract() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_Inactive() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_Version() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_Code() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_Display() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_Designation() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_Contains() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResearchSubject() {
		if (researchSubjectEClass == null) {
			researchSubjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(32);
		}
		return researchSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchSubject_Identifier() {
        return (EReference)getResearchSubject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchSubject_Status() {
        return (EReference)getResearchSubject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchSubject_Period() {
        return (EReference)getResearchSubject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchSubject_Study() {
        return (EReference)getResearchSubject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchSubject_Individual() {
        return (EReference)getResearchSubject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchSubject_AssignedArm() {
        return (EReference)getResearchSubject().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchSubject_ActualArm() {
        return (EReference)getResearchSubject().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchSubject_Consent() {
        return (EReference)getResearchSubject().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResearchStudy() {
		if (researchStudyEClass == null) {
			researchStudyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(33);
		}
		return researchStudyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Identifier() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Title() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Protocol() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_PartOf() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Status() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Category() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Focus() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Contact() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_RelatedArtifact() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Keyword() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Jurisdiction() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Description() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Enrollment() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Period() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Sponsor() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_PrincipalInvestigator() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Site() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_ReasonStopped() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Note() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudy_Arm() {
        return (EReference)getResearchStudy().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanDefinition() {
		if (planDefinitionEClass == null) {
			planDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(34);
		}
		return planDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Url() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Identifier() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Version() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Name() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Title() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Type() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Status() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Experimental() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Date() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Description() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Purpose() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Usage() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_ApprovalDate() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_LastReviewDate() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_EffectivePeriod() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_UseContext() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Jurisdiction() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Topic() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Contributor() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Publisher() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Contact() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Copyright() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_RelatedArtifact() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_Library() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinition_ActionDefinition() {
        return (EReference)getPlanDefinition().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanDefinitionActionDefinition() {
		if (planDefinitionActionDefinitionEClass == null) {
			planDefinitionActionDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(35);
		}
		return planDefinitionActionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_ActionIdentifier() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_Label() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_Title() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_Description() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_TextEquivalent() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_Code() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_Documentation() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_TriggerDefinition() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_Condition() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_Input() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_Output() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_RelatedAction() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_Timingx() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_ParticipantType() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_Type() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_GroupingBehavior() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_SelectionBehavior() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_RequiredBehavior() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_PrecheckBehavior() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_CardinalityBehavior() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_ActivityDefinition() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_Transform() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_DynamicValue() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinition_ActionDefinition() {
        return (EReference)getPlanDefinitionActionDefinition().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanDefinitionActionDefinitionCondition() {
		if (planDefinitionActionDefinitionConditionEClass == null) {
			planDefinitionActionDefinitionConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(36);
		}
		return planDefinitionActionDefinitionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinitionCondition_Kind() {
        return (EReference)getPlanDefinitionActionDefinitionCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinitionCondition_Description() {
        return (EReference)getPlanDefinitionActionDefinitionCondition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinitionCondition_Language() {
        return (EReference)getPlanDefinitionActionDefinitionCondition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinitionCondition_Expression() {
        return (EReference)getPlanDefinitionActionDefinitionCondition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanDefinitionActionDefinitionRelatedAction() {
		if (planDefinitionActionDefinitionRelatedActionEClass == null) {
			planDefinitionActionDefinitionRelatedActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(37);
		}
		return planDefinitionActionDefinitionRelatedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinitionRelatedAction_ActionIdentifier() {
        return (EReference)getPlanDefinitionActionDefinitionRelatedAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinitionRelatedAction_Relationship() {
        return (EReference)getPlanDefinitionActionDefinitionRelatedAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinitionRelatedAction_Offsetx() {
        return (EReference)getPlanDefinitionActionDefinitionRelatedAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDefinition() {
		if (activityDefinitionEClass == null) {
			activityDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(38);
		}
		return activityDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Url() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Identifier() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Version() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Name() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Title() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Status() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Experimental() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Date() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Description() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Purpose() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Usage() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_ApprovalDate() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_LastReviewDate() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_EffectivePeriod() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_UseContext() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Jurisdiction() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Topic() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Contributor() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Publisher() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Contact() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Copyright() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_RelatedArtifact() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Library() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Category() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Code() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Timingx() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Location() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_ParticipantType() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Productx() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Quantity() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_DosageInstruction() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_BodySite() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_Transform() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinition_DynamicValue() {
        return (EReference)getActivityDefinition().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureMap() {
		if (structureMapEClass == null) {
			structureMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(39);
		}
		return structureMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Url() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Identifier() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Version() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Name() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Title() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Status() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Experimental() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Publisher() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Contact() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Date() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Description() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_UseContext() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Jurisdiction() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Purpose() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Copyright() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Structure() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Import() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_Group() {
        return (EReference)getStructureMap().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureMapStructure() {
		if (structureMapStructureEClass == null) {
			structureMapStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(40);
		}
		return structureMapStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapStructure_Url() {
        return (EReference)getStructureMapStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapStructure_Mode() {
        return (EReference)getStructureMapStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapStructure_Documentation() {
        return (EReference)getStructureMapStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureMapGroup() {
		if (structureMapGroupEClass == null) {
			structureMapGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(41);
		}
		return structureMapGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroup_Name() {
        return (EReference)getStructureMapGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroup_Extends() {
        return (EReference)getStructureMapGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroup_Documentation() {
        return (EReference)getStructureMapGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroup_Input() {
        return (EReference)getStructureMapGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroup_Rule() {
        return (EReference)getStructureMapGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureMapGroupInput() {
		if (structureMapGroupInputEClass == null) {
			structureMapGroupInputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(42);
		}
		return structureMapGroupInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupInput_Name() {
        return (EReference)getStructureMapGroupInput().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupInput_Type() {
        return (EReference)getStructureMapGroupInput().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupInput_Mode() {
        return (EReference)getStructureMapGroupInput().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupInput_Documentation() {
        return (EReference)getStructureMapGroupInput().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureMapGroupRule() {
		if (structureMapGroupRuleEClass == null) {
			structureMapGroupRuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(43);
		}
		return structureMapGroupRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRule_Name() {
        return (EReference)getStructureMapGroupRule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRule_Source() {
        return (EReference)getStructureMapGroupRule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRule_Target() {
        return (EReference)getStructureMapGroupRule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRule_Rule() {
        return (EReference)getStructureMapGroupRule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRule_Dependent() {
        return (EReference)getStructureMapGroupRule().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRule_Documentation() {
        return (EReference)getStructureMapGroupRule().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureMapGroupRuleSource() {
		if (structureMapGroupRuleSourceEClass == null) {
			structureMapGroupRuleSourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(44);
		}
		return structureMapGroupRuleSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleSource_Required() {
        return (EReference)getStructureMapGroupRuleSource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleSource_Context() {
        return (EReference)getStructureMapGroupRuleSource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleSource_ContextType() {
        return (EReference)getStructureMapGroupRuleSource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleSource_Min() {
        return (EReference)getStructureMapGroupRuleSource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleSource_Max() {
        return (EReference)getStructureMapGroupRuleSource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleSource_Type() {
        return (EReference)getStructureMapGroupRuleSource().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleSource_Element() {
        return (EReference)getStructureMapGroupRuleSource().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleSource_ListMode() {
        return (EReference)getStructureMapGroupRuleSource().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleSource_Variable() {
        return (EReference)getStructureMapGroupRuleSource().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleSource_Condition() {
        return (EReference)getStructureMapGroupRuleSource().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleSource_Check() {
        return (EReference)getStructureMapGroupRuleSource().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureMapGroupRuleTarget() {
		if (structureMapGroupRuleTargetEClass == null) {
			structureMapGroupRuleTargetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(45);
		}
		return structureMapGroupRuleTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleTarget_Context() {
        return (EReference)getStructureMapGroupRuleTarget().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleTarget_ContextType() {
        return (EReference)getStructureMapGroupRuleTarget().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleTarget_Element() {
        return (EReference)getStructureMapGroupRuleTarget().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleTarget_Variable() {
        return (EReference)getStructureMapGroupRuleTarget().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleTarget_ListMode() {
        return (EReference)getStructureMapGroupRuleTarget().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleTarget_ListRuleId() {
        return (EReference)getStructureMapGroupRuleTarget().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleTarget_Transform() {
        return (EReference)getStructureMapGroupRuleTarget().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleTarget_Parameter() {
        return (EReference)getStructureMapGroupRuleTarget().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureMapGroupRuleTargetParameter() {
		if (structureMapGroupRuleTargetParameterEClass == null) {
			structureMapGroupRuleTargetParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(46);
		}
		return structureMapGroupRuleTargetParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleTargetParameter_Valuex() {
        return (EReference)getStructureMapGroupRuleTargetParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureMapGroupRuleDependent() {
		if (structureMapGroupRuleDependentEClass == null) {
			structureMapGroupRuleDependentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(47);
		}
		return structureMapGroupRuleDependentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleDependent_Name() {
        return (EReference)getStructureMapGroupRuleDependent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMapGroupRuleDependent_Variable() {
        return (EReference)getStructureMapGroupRuleDependent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDefinitionDynamicValue() {
		if (activityDefinitionDynamicValueEClass == null) {
			activityDefinitionDynamicValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(48);
		}
		return activityDefinitionDynamicValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinitionDynamicValue_Description() {
        return (EReference)getActivityDefinitionDynamicValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinitionDynamicValue_Path() {
        return (EReference)getActivityDefinitionDynamicValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinitionDynamicValue_Language() {
        return (EReference)getActivityDefinitionDynamicValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDefinitionDynamicValue_Expression() {
        return (EReference)getActivityDefinitionDynamicValue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanDefinitionActionDefinitionDynamicValue() {
		if (planDefinitionActionDefinitionDynamicValueEClass == null) {
			planDefinitionActionDefinitionDynamicValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(49);
		}
		return planDefinitionActionDefinitionDynamicValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinitionDynamicValue_Description() {
        return (EReference)getPlanDefinitionActionDefinitionDynamicValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinitionDynamicValue_Path() {
        return (EReference)getPlanDefinitionActionDefinitionDynamicValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinitionDynamicValue_Language() {
        return (EReference)getPlanDefinitionActionDefinitionDynamicValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanDefinitionActionDefinitionDynamicValue_Expression() {
        return (EReference)getPlanDefinitionActionDefinitionDynamicValue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		if (groupEClass == null) {
			groupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(50);
		}
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Identifier() {
        return (EReference)getGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Type() {
        return (EReference)getGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Actual() {
        return (EReference)getGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Active() {
        return (EReference)getGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Code() {
        return (EReference)getGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Name() {
        return (EReference)getGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Quantity() {
        return (EReference)getGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Characteristic() {
        return (EReference)getGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Member() {
        return (EReference)getGroup().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupCharacteristic() {
		if (groupCharacteristicEClass == null) {
			groupCharacteristicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(51);
		}
		return groupCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_Code() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_Valuex() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_Exclude() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_Period() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupMember() {
		if (groupMemberEClass == null) {
			groupMemberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(52);
		}
		return groupMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupMember_Entity() {
        return (EReference)getGroupMember().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupMember_Period() {
        return (EReference)getGroupMember().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupMember_Inactive() {
        return (EReference)getGroupMember().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResearchStudyArm() {
		if (researchStudyArmEClass == null) {
			researchStudyArmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(53);
		}
		return researchStudyArmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudyArm_Name() {
        return (EReference)getResearchStudyArm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudyArm_Code() {
        return (EReference)getResearchStudyArm().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchStudyArm_Description() {
        return (EReference)getResearchStudyArm().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsent() {
		if (consentEClass == null) {
			consentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(54);
		}
		return consentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsent_Identifier() {
        return (EReference)getConsent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsent_Status() {
        return (EReference)getConsent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsent_Category() {
        return (EReference)getConsent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsent_DateTime() {
        return (EReference)getConsent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsent_Period() {
        return (EReference)getConsent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsent_Patient() {
        return (EReference)getConsent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsent_Consentor() {
        return (EReference)getConsent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsent_Organization() {
        return (EReference)getConsent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsent_Sourcex() {
        return (EReference)getConsent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsent_Policy() {
        return (EReference)getConsent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsent_Recipient() {
        return (EReference)getConsent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsent_Purpose() {
        return (EReference)getConsent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsent_Except() {
        return (EReference)getConsent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsentExcept() {
		if (consentExceptEClass == null) {
			consentExceptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(55);
		}
		return consentExceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsentExcept_Type() {
        return (EReference)getConsentExcept().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsentExcept_Period() {
        return (EReference)getConsentExcept().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsentExcept_Actor() {
        return (EReference)getConsentExcept().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsentExcept_Action() {
        return (EReference)getConsentExcept().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsentExcept_SecurityLabel() {
        return (EReference)getConsentExcept().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsentExcept_Purpose() {
        return (EReference)getConsentExcept().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsentExcept_Class() {
        return (EReference)getConsentExcept().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsentExcept_Code() {
        return (EReference)getConsentExcept().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsentExcept_Data() {
        return (EReference)getConsentExcept().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsentExceptActor() {
		if (consentExceptActorEClass == null) {
			consentExceptActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(56);
		}
		return consentExceptActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsentExceptActor_Role() {
        return (EReference)getConsentExceptActor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsentExceptActor_Reference() {
        return (EReference)getConsentExceptActor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsentExceptData() {
		if (consentExceptDataEClass == null) {
			consentExceptDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(57);
		}
		return consentExceptDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsentExceptData_Meaning() {
        return (EReference)getConsentExceptData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsentExceptData_Reference() {
        return (EReference)getConsentExceptData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedule() {
		if (scheduleEClass == null) {
			scheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(58);
		}
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Identifier() {
        return (EReference)getSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Active() {
        return (EReference)getSchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_ServiceCategory() {
        return (EReference)getSchedule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_ServiceType() {
        return (EReference)getSchedule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Specialty() {
        return (EReference)getSchedule().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Actor() {
        return (EReference)getSchedule().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_PlanningHorizon() {
        return (EReference)getSchedule().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Comment() {
        return (EReference)getSchedule().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedication() {
		if (medicationEClass == null) {
			medicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(59);
		}
		return medicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Code() {
        return (EReference)getMedication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_IsBrand() {
        return (EReference)getMedication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Manufacturer() {
        return (EReference)getMedication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Product() {
        return (EReference)getMedication().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Package() {
        return (EReference)getMedication().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationProduct() {
		if (medicationProductEClass == null) {
			medicationProductEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(60);
		}
		return medicationProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProduct_Form() {
        return (EReference)getMedicationProduct().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProduct_Ingredient() {
        return (EReference)getMedicationProduct().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProduct_Batch() {
        return (EReference)getMedicationProduct().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationProductIngredient() {
		if (medicationProductIngredientEClass == null) {
			medicationProductIngredientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(61);
		}
		return medicationProductIngredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProductIngredient_Itemx() {
        return (EReference)getMedicationProductIngredient().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProductIngredient_Amount() {
        return (EReference)getMedicationProductIngredient().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationProductBatch() {
		if (medicationProductBatchEClass == null) {
			medicationProductBatchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(62);
		}
		return medicationProductBatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProductBatch_LotNumber() {
        return (EReference)getMedicationProductBatch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProductBatch_ExpirationDate() {
        return (EReference)getMedicationProductBatch().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationPackage() {
		if (medicationPackageEClass == null) {
			medicationPackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(63);
		}
		return medicationPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPackage_Container() {
        return (EReference)getMedicationPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPackage_Content() {
        return (EReference)getMedicationPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationPackageContent() {
		if (medicationPackageContentEClass == null) {
			medicationPackageContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(64);
		}
		return medicationPackageContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPackageContent_Itemx() {
        return (EReference)getMedicationPackageContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPackageContent_Amount() {
        return (EReference)getMedicationPackageContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstance() {
		if (substanceEClass == null) {
			substanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(65);
		}
		return substanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Identifier() {
        return (EReference)getSubstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Category() {
        return (EReference)getSubstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Code() {
        return (EReference)getSubstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Description() {
        return (EReference)getSubstance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Instance() {
        return (EReference)getSubstance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Ingredient() {
        return (EReference)getSubstance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceInstance() {
		if (substanceInstanceEClass == null) {
			substanceInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(66);
		}
		return substanceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceInstance_Identifier() {
        return (EReference)getSubstanceInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceInstance_Expiry() {
        return (EReference)getSubstanceInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceInstance_Quantity() {
        return (EReference)getSubstanceInstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceIngredient() {
		if (substanceIngredientEClass == null) {
			substanceIngredientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(67);
		}
		return substanceIngredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceIngredient_Quantity() {
        return (EReference)getSubstanceIngredient().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceIngredient_Substancex() {
        return (EReference)getSubstanceIngredient().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReference() {
		if (documentReferenceEClass == null) {
			documentReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(68);
		}
		return documentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_MasterIdentifier() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Identifier() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Subject() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Type() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Class() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Author() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Custodian() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Authenticator() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Created() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Indexed() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Status() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_DocStatus() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_RelatesTo() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Description() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_SecurityLabel() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Content() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Context() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReferenceRelatesTo() {
		if (documentReferenceRelatesToEClass == null) {
			documentReferenceRelatesToEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(69);
		}
		return documentReferenceRelatesToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceRelatesTo_Code() {
        return (EReference)getDocumentReferenceRelatesTo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceRelatesTo_Target() {
        return (EReference)getDocumentReferenceRelatesTo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReferenceContent() {
		if (documentReferenceContentEClass == null) {
			documentReferenceContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(70);
		}
		return documentReferenceContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContent_Attachment() {
        return (EReference)getDocumentReferenceContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContent_Format() {
        return (EReference)getDocumentReferenceContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReferenceContext() {
		if (documentReferenceContextEClass == null) {
			documentReferenceContextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(71);
		}
		return documentReferenceContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_Encounter() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_Event() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_Period() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_FacilityType() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_PracticeSetting() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_SourcePatientInfo() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_Related() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounter() {
		if (encounterEClass == null) {
			encounterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(72);
		}
		return encounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Identifier() {
        return (EReference)getEncounter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Status() {
        return (EReference)getEncounter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_StatusHistory() {
        return (EReference)getEncounter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Class() {
        return (EReference)getEncounter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Type() {
        return (EReference)getEncounter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Priority() {
        return (EReference)getEncounter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Patient() {
        return (EReference)getEncounter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_EpisodeOfCare() {
        return (EReference)getEncounter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_IncomingReferral() {
        return (EReference)getEncounter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Participant() {
        return (EReference)getEncounter().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Appointment() {
        return (EReference)getEncounter().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Period() {
        return (EReference)getEncounter().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Length() {
        return (EReference)getEncounter().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Reason() {
        return (EReference)getEncounter().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Indication() {
        return (EReference)getEncounter().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Account() {
        return (EReference)getEncounter().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Hospitalization() {
        return (EReference)getEncounter().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Location() {
        return (EReference)getEncounter().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_ServiceProvider() {
        return (EReference)getEncounter().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_PartOf() {
        return (EReference)getEncounter().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterStatusHistory() {
		if (encounterStatusHistoryEClass == null) {
			encounterStatusHistoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(73);
		}
		return encounterStatusHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterStatusHistory_Status() {
        return (EReference)getEncounterStatusHistory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterStatusHistory_Period() {
        return (EReference)getEncounterStatusHistory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeOfCare() {
		if (episodeOfCareEClass == null) {
			episodeOfCareEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(74);
		}
		return episodeOfCareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Identifier() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Status() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_StatusHistory() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Type() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Condition() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Patient() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_ManagingOrganization() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Period() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_ReferralRequest() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_CareManager() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Team() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Account() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeOfCareStatusHistory() {
		if (episodeOfCareStatusHistoryEClass == null) {
			episodeOfCareStatusHistoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(75);
		}
		return episodeOfCareStatusHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCareStatusHistory_Status() {
        return (EReference)getEpisodeOfCareStatusHistory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCareStatusHistory_Period() {
        return (EReference)getEpisodeOfCareStatusHistory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		if (conditionEClass == null) {
			conditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(76);
		}
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Identifier() {
        return (EReference)getCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ClinicalStatus() {
        return (EReference)getCondition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_VerificationStatus() {
        return (EReference)getCondition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Category() {
        return (EReference)getCondition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Severity() {
        return (EReference)getCondition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Code() {
        return (EReference)getCondition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_BodySite() {
        return (EReference)getCondition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Subject() {
        return (EReference)getCondition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Context() {
        return (EReference)getCondition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Onsetx() {
        return (EReference)getCondition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Abatementx() {
        return (EReference)getCondition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_AssertedDate() {
        return (EReference)getCondition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Asserter() {
        return (EReference)getCondition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Stage() {
        return (EReference)getCondition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Evidence() {
        return (EReference)getCondition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Note() {
        return (EReference)getCondition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionStage() {
		if (conditionStageEClass == null) {
			conditionStageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(77);
		}
		return conditionStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionStage_Summary() {
        return (EReference)getConditionStage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionStage_Assessment() {
        return (EReference)getConditionStage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionEvidence() {
		if (conditionEvidenceEClass == null) {
			conditionEvidenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(78);
		}
		return conditionEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionEvidence_Code() {
        return (EReference)getConditionEvidence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionEvidence_Detail() {
        return (EReference)getConditionEvidence().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferralRequest() {
		if (referralRequestEClass == null) {
			referralRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(79);
		}
		return referralRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Identifier() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_BasedOn() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Parent() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Status() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Category() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Type() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Priority() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Patient() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Context() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_FulfillmentTime() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Authored() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Requester() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Specialty() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Recipient() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Reason() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Description() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_ServiceRequested() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_SupportingInformation() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCareTeam() {
		if (careTeamEClass == null) {
			careTeamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(80);
		}
		return careTeamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareTeam_Identifier() {
        return (EReference)getCareTeam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareTeam_Status() {
        return (EReference)getCareTeam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareTeam_Category() {
        return (EReference)getCareTeam().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareTeam_Name() {
        return (EReference)getCareTeam().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareTeam_Subject() {
        return (EReference)getCareTeam().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareTeam_Period() {
        return (EReference)getCareTeam().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareTeam_Participant() {
        return (EReference)getCareTeam().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareTeam_ManagingOrganization() {
        return (EReference)getCareTeam().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCareTeamParticipant() {
		if (careTeamParticipantEClass == null) {
			careTeamParticipantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(81);
		}
		return careTeamParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareTeamParticipant_Role() {
        return (EReference)getCareTeamParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareTeamParticipant_Member() {
        return (EReference)getCareTeamParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareTeamParticipant_Period() {
        return (EReference)getCareTeamParticipant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		if (accountEClass == null) {
			accountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(82);
		}
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Identifier() {
        return (EReference)getAccount().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Name() {
        return (EReference)getAccount().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Type() {
        return (EReference)getAccount().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Status() {
        return (EReference)getAccount().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Active() {
        return (EReference)getAccount().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Currency() {
        return (EReference)getAccount().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Balance() {
        return (EReference)getAccount().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Coverage() {
        return (EReference)getAccount().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_CoveragePeriod() {
        return (EReference)getAccount().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Subject() {
        return (EReference)getAccount().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Owner() {
        return (EReference)getAccount().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Description() {
        return (EReference)getAccount().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Guarantor() {
        return (EReference)getAccount().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverage() {
		if (coverageEClass == null) {
			coverageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(83);
		}
		return coverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Identifier() {
        return (EReference)getCoverage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Status() {
        return (EReference)getCoverage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Type() {
        return (EReference)getCoverage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_PolicyHolder() {
        return (EReference)getCoverage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Subscriber() {
        return (EReference)getCoverage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_SubscriberId() {
        return (EReference)getCoverage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Beneficiary() {
        return (EReference)getCoverage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Relationship() {
        return (EReference)getCoverage().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Period() {
        return (EReference)getCoverage().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Payor() {
        return (EReference)getCoverage().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Group() {
        return (EReference)getCoverage().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Dependent() {
        return (EReference)getCoverage().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Sequence() {
        return (EReference)getCoverage().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Order() {
        return (EReference)getCoverage().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Network() {
        return (EReference)getCoverage().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Contract() {
        return (EReference)getCoverage().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverageGroup() {
		if (coverageGroupEClass == null) {
			coverageGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(84);
		}
		return coverageGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageGroup_Group() {
        return (EReference)getCoverageGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageGroup_GroupDisplay() {
        return (EReference)getCoverageGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageGroup_SubGroup() {
        return (EReference)getCoverageGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageGroup_SubGroupDisplay() {
        return (EReference)getCoverageGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageGroup_Plan() {
        return (EReference)getCoverageGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageGroup_PlanDisplay() {
        return (EReference)getCoverageGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageGroup_SubPlan() {
        return (EReference)getCoverageGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageGroup_SubPlanDisplay() {
        return (EReference)getCoverageGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageGroup_Class() {
        return (EReference)getCoverageGroup().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageGroup_ClassDisplay() {
        return (EReference)getCoverageGroup().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageGroup_SubClass() {
        return (EReference)getCoverageGroup().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageGroup_SubClassDisplay() {
        return (EReference)getCoverageGroup().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContract() {
		if (contractEClass == null) {
			contractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(85);
		}
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Identifier() {
        return (EReference)getContract().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Status() {
        return (EReference)getContract().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Issued() {
        return (EReference)getContract().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Applies() {
        return (EReference)getContract().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Subject() {
        return (EReference)getContract().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Topic() {
        return (EReference)getContract().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Authority() {
        return (EReference)getContract().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Domain() {
        return (EReference)getContract().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Type() {
        return (EReference)getContract().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_SubType() {
        return (EReference)getContract().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Action() {
        return (EReference)getContract().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_ActionReason() {
        return (EReference)getContract().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Agent() {
        return (EReference)getContract().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Signer() {
        return (EReference)getContract().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_ValuedItem() {
        return (EReference)getContract().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Term() {
        return (EReference)getContract().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Bindingx() {
        return (EReference)getContract().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Friendly() {
        return (EReference)getContract().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Legal() {
        return (EReference)getContract().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Rule() {
        return (EReference)getContract().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractAgent() {
		if (contractAgentEClass == null) {
			contractAgentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(86);
		}
		return contractAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractAgent_Actor() {
        return (EReference)getContractAgent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractAgent_Role() {
        return (EReference)getContractAgent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractSignatory() {
		if (contractSignatoryEClass == null) {
			contractSignatoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(87);
		}
		return contractSignatoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractSignatory_Type() {
        return (EReference)getContractSignatory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractSignatory_Party() {
        return (EReference)getContractSignatory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractSignatory_Signature() {
        return (EReference)getContractSignatory().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractValuedItem() {
		if (contractValuedItemEClass == null) {
			contractValuedItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(88);
		}
		return contractValuedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Entityx() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Identifier() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_EffectiveTime() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Quantity() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_UnitPrice() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Factor() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Points() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Net() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractTerm() {
		if (contractTermEClass == null) {
			contractTermEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(89);
		}
		return contractTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Identifier() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Issued() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Applies() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Type() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_SubType() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Topic() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Action() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_ActionReason() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Agent() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Text() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_ValuedItem() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Group() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractTermTermAgent() {
		if (contractTermTermAgentEClass == null) {
			contractTermTermAgentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(90);
		}
		return contractTermTermAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermAgent_Actor() {
        return (EReference)getContractTermTermAgent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermAgent_Role() {
        return (EReference)getContractTermTermAgent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractTermTermValuedItem() {
		if (contractTermTermValuedItemEClass == null) {
			contractTermTermValuedItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(91);
		}
		return contractTermTermValuedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_Entityx() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_Identifier() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_EffectiveTime() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_Quantity() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_UnitPrice() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_Factor() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_Points() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_Net() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractFriendlyLanguage() {
		if (contractFriendlyLanguageEClass == null) {
			contractFriendlyLanguageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(92);
		}
		return contractFriendlyLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractFriendlyLanguage_Contentx() {
        return (EReference)getContractFriendlyLanguage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractLegalLanguage() {
		if (contractLegalLanguageEClass == null) {
			contractLegalLanguageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(93);
		}
		return contractLegalLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractLegalLanguage_Contentx() {
        return (EReference)getContractLegalLanguage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractComputableLanguage() {
		if (contractComputableLanguageEClass == null) {
			contractComputableLanguageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(94);
		}
		return contractComputableLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractComputableLanguage_Contentx() {
        return (EReference)getContractComputableLanguage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountGuarantor() {
		if (accountGuarantorEClass == null) {
			accountGuarantorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(95);
		}
		return accountGuarantorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountGuarantor_Party() {
        return (EReference)getAccountGuarantor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountGuarantor_OnHold() {
        return (EReference)getAccountGuarantor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountGuarantor_Period() {
        return (EReference)getAccountGuarantor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterParticipant() {
		if (encounterParticipantEClass == null) {
			encounterParticipantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(96);
		}
		return encounterParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterParticipant_Type() {
        return (EReference)getEncounterParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterParticipant_Period() {
        return (EReference)getEncounterParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterParticipant_Individual() {
        return (EReference)getEncounterParticipant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointment() {
		if (appointmentEClass == null) {
			appointmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(97);
		}
		return appointmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Identifier() {
        return (EReference)getAppointment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Status() {
        return (EReference)getAppointment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_ServiceCategory() {
        return (EReference)getAppointment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_ServiceType() {
        return (EReference)getAppointment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Specialty() {
        return (EReference)getAppointment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_AppointmentType() {
        return (EReference)getAppointment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Reason() {
        return (EReference)getAppointment().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Priority() {
        return (EReference)getAppointment().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Description() {
        return (EReference)getAppointment().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Start() {
        return (EReference)getAppointment().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_End() {
        return (EReference)getAppointment().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_MinutesDuration() {
        return (EReference)getAppointment().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Slot() {
        return (EReference)getAppointment().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Created() {
        return (EReference)getAppointment().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Comment() {
        return (EReference)getAppointment().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Participant() {
        return (EReference)getAppointment().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_RequestedPeriod() {
        return (EReference)getAppointment().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlot() {
		if (slotEClass == null) {
			slotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(98);
		}
		return slotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Identifier() {
        return (EReference)getSlot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_ServiceCategory() {
        return (EReference)getSlot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_ServiceType() {
        return (EReference)getSlot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Specialty() {
        return (EReference)getSlot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_AppointmentType() {
        return (EReference)getSlot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Schedule() {
        return (EReference)getSlot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Status() {
        return (EReference)getSlot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Start() {
        return (EReference)getSlot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_End() {
        return (EReference)getSlot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Overbooked() {
        return (EReference)getSlot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Comment() {
        return (EReference)getSlot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointmentParticipant() {
		if (appointmentParticipantEClass == null) {
			appointmentParticipantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(99);
		}
		return appointmentParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentParticipant_Type() {
        return (EReference)getAppointmentParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentParticipant_Actor() {
        return (EReference)getAppointmentParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentParticipant_Required() {
        return (EReference)getAppointmentParticipant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentParticipant_Status() {
        return (EReference)getAppointmentParticipant().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterHospitalization() {
		if (encounterHospitalizationEClass == null) {
			encounterHospitalizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(100);
		}
		return encounterHospitalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_PreAdmissionIdentifier() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_Origin() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_AdmitSource() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_AdmittingDiagnosis() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_ReAdmission() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_DietPreference() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_SpecialCourtesy() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_SpecialArrangement() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_Destination() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_DischargeDisposition() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_DischargeDiagnosis() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterLocation() {
		if (encounterLocationEClass == null) {
			encounterLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(101);
		}
		return encounterLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterLocation_Location() {
        return (EReference)getEncounterLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterLocation_Status() {
        return (EReference)getEncounterLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterLocation_Period() {
        return (EReference)getEncounterLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReferenceContextRelated() {
		if (documentReferenceContextRelatedEClass == null) {
			documentReferenceContextRelatedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(102);
		}
		return documentReferenceContextRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContextRelated_Identifier() {
        return (EReference)getDocumentReferenceContextRelated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContextRelated_Ref() {
        return (EReference)getDocumentReferenceContextRelated().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalImpression() {
		if (clinicalImpressionEClass == null) {
			clinicalImpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(103);
		}
		return clinicalImpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Identifier() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Status() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Code() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Description() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Subject() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Assessor() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Date() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Effectivex() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Context() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Previous() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Problem() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Investigation() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Protocol() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Summary() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Finding() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_PrognosisCodeableConcept() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_PrognosisReference() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Action() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Note() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalImpressionInvestigation() {
		if (clinicalImpressionInvestigationEClass == null) {
			clinicalImpressionInvestigationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(104);
		}
		return clinicalImpressionInvestigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionInvestigation_Code() {
        return (EReference)getClinicalImpressionInvestigation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionInvestigation_Item() {
        return (EReference)getClinicalImpressionInvestigation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalImpressionFinding() {
		if (clinicalImpressionFindingEClass == null) {
			clinicalImpressionFindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(105);
		}
		return clinicalImpressionFindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionFinding_Itemx() {
        return (EReference)getClinicalImpressionFinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionFinding_Basis() {
        return (EReference)getClinicalImpressionFinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRiskAssessment() {
		if (riskAssessmentEClass == null) {
			riskAssessmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(106);
		}
		return riskAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Identifier() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_BasedOn() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Parent() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Status() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Code() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Subject() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Context() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Occurrencex() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Condition() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Performer() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Reasonx() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Method() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Basis() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Prediction() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Mitigation() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Note() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRiskAssessmentPrediction() {
		if (riskAssessmentPredictionEClass == null) {
			riskAssessmentPredictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(107);
		}
		return riskAssessmentPredictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_Outcome() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_Probabilityx() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_RelativeRisk() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_Whenx() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_Rationale() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntolerance() {
		if (allergyIntoleranceEClass == null) {
			allergyIntoleranceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(108);
		}
		return allergyIntoleranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Identifier() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_ClinicalStatus() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_VerificationStatus() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Type() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Category() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Criticality() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Code() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Patient() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Onsetx() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_AssertedDate() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Recorder() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Asserter() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_LastOccurrence() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Note() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Reaction() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntoleranceReaction() {
		if (allergyIntoleranceReactionEClass == null) {
			allergyIntoleranceReactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(109);
		}
		return allergyIntoleranceReactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Substance() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Certainty() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Manifestation() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Description() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Onset() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Severity() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_ExposureRoute() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Note() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		if (observationEClass == null) {
			observationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(110);
		}
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Identifier() {
        return (EReference)getObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Status() {
        return (EReference)getObservation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Category() {
        return (EReference)getObservation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Code() {
        return (EReference)getObservation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Subject() {
        return (EReference)getObservation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Encounter() {
        return (EReference)getObservation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Effectivex() {
        return (EReference)getObservation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Issued() {
        return (EReference)getObservation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Performer() {
        return (EReference)getObservation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Valuex() {
        return (EReference)getObservation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_DataAbsentReason() {
        return (EReference)getObservation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Interpretation() {
        return (EReference)getObservation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Comment() {
        return (EReference)getObservation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_BodySite() {
        return (EReference)getObservation().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Method() {
        return (EReference)getObservation().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Specimen() {
        return (EReference)getObservation().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Device() {
        return (EReference)getObservation().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ReferenceRange() {
        return (EReference)getObservation().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Related() {
        return (EReference)getObservation().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Component() {
        return (EReference)getObservation().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecimen() {
		if (specimenEClass == null) {
			specimenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(111);
		}
		return specimenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Identifier() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_AccessionIdentifier() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Status() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Type() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Subject() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_ReceivedTime() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Parent() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Request() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Collection() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Treatment() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Container() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Note() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecimenCollection() {
		if (specimenCollectionEClass == null) {
			specimenCollectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(112);
		}
		return specimenCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_Collector() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_Collectedx() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_Quantity() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_Method() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_BodySite() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecimenTreatment() {
		if (specimenTreatmentEClass == null) {
			specimenTreatmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(113);
		}
		return specimenTreatmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenTreatment_Description() {
        return (EReference)getSpecimenTreatment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenTreatment_Procedure() {
        return (EReference)getSpecimenTreatment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenTreatment_Additive() {
        return (EReference)getSpecimenTreatment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenTreatment_Timex() {
        return (EReference)getSpecimenTreatment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecimenContainer() {
		if (specimenContainerEClass == null) {
			specimenContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(114);
		}
		return specimenContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Identifier() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Description() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Type() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Capacity() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_SpecimenQuantity() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Additivex() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationReferenceRange() {
		if (observationReferenceRangeEClass == null) {
			observationReferenceRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(115);
		}
		return observationReferenceRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_Low() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_High() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_Meaning() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_Age() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_Text() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationRelated() {
		if (observationRelatedEClass == null) {
			observationRelatedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(116);
		}
		return observationRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationRelated_Type() {
        return (EReference)getObservationRelated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationRelated_Target() {
        return (EReference)getObservationRelated().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationComponent() {
		if (observationComponentEClass == null) {
			observationComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(117);
		}
		return observationComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationComponent_Code() {
        return (EReference)getObservationComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationComponent_Valuex() {
        return (EReference)getObservationComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationComponent_DataAbsentReason() {
        return (EReference)getObservationComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationComponent_Interpretation() {
        return (EReference)getObservationComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationComponent_ReferenceRange() {
        return (EReference)getObservationComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticRequest() {
		if (diagnosticRequestEClass == null) {
			diagnosticRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(118);
		}
		return diagnosticRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Identifier() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Definition() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_BasedOn() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Replaces() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Requisition() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Status() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Intent() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Priority() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Code() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Subject() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Context() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Occurrencex() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_AuthoredOn() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Requester() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_PerformerType() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Performer() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_ReasonCode() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_ReasonReference() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_SupportingInformation() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_Note() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticRequest_RelevantHistory() {
        return (EReference)getDiagnosticRequest().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenance() {
		if (provenanceEClass == null) {
			provenanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(119);
		}
		return provenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Target() {
        return (EReference)getProvenance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Period() {
        return (EReference)getProvenance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Recorded() {
        return (EReference)getProvenance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Reason() {
        return (EReference)getProvenance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Activity() {
        return (EReference)getProvenance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Location() {
        return (EReference)getProvenance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Policy() {
        return (EReference)getProvenance().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Agent() {
        return (EReference)getProvenance().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Entity() {
        return (EReference)getProvenance().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Signature() {
        return (EReference)getProvenance().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenanceAgent() {
		if (provenanceAgentEClass == null) {
			provenanceAgentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(120);
		}
		return provenanceAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgent_Role() {
        return (EReference)getProvenanceAgent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgent_Whox() {
        return (EReference)getProvenanceAgent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgent_OnBehalfOfx() {
        return (EReference)getProvenanceAgent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgent_RelatedAgentType() {
        return (EReference)getProvenanceAgent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenanceEntity() {
		if (provenanceEntityEClass == null) {
			provenanceEntityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(121);
		}
		return provenanceEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceEntity_Role() {
        return (EReference)getProvenanceEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceEntity_Reference() {
        return (EReference)getProvenanceEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceEntity_Agent() {
        return (EReference)getProvenanceEntity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureRequest() {
		if (procedureRequestEClass == null) {
			procedureRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(122);
		}
		return procedureRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Identifier() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Subject() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Code() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_BodySite() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Reasonx() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Scheduledx() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Encounter() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Performer() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Status() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_SupportingInfo() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Notes() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_AsNeededx() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_OrderedOn() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Orderer() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Priority() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceMetric() {
		if (deviceMetricEClass == null) {
			deviceMetricEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(123);
		}
		return deviceMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Type() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Identifier() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Unit() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Source() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Parent() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_OperationalStatus() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Color() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Category() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_MeasurementPeriod() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Calibration() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceComponent() {
		if (deviceComponentEClass == null) {
			deviceComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(124);
		}
		return deviceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_Type() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_Identifier() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_LastSystemChange() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_Source() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_Parent() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_OperationalStatus() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_ParameterGroup() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_MeasurementPrinciple() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_ProductionSpecification() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_LanguageCode() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceComponentProductionSpecification() {
		if (deviceComponentProductionSpecificationEClass == null) {
			deviceComponentProductionSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(125);
		}
		return deviceComponentProductionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponentProductionSpecification_SpecType() {
        return (EReference)getDeviceComponentProductionSpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponentProductionSpecification_ComponentId() {
        return (EReference)getDeviceComponentProductionSpecification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponentProductionSpecification_ProductionSpec() {
        return (EReference)getDeviceComponentProductionSpecification().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceMetricCalibration() {
		if (deviceMetricCalibrationEClass == null) {
			deviceMetricCalibrationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(126);
		}
		return deviceMetricCalibrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetricCalibration_Type() {
        return (EReference)getDeviceMetricCalibration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetricCalibration_State() {
        return (EReference)getDeviceMetricCalibration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetricCalibration_Time() {
        return (EReference)getDeviceMetricCalibration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireResponse() {
		if (questionnaireResponseEClass == null) {
			questionnaireResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(127);
		}
		return questionnaireResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Identifier() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_BasedOn() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Parent() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Questionnaire() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Status() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Subject() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Context() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Author() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Authored() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Source() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Item() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaire() {
		if (questionnaireEClass == null) {
			questionnaireEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(128);
		}
		return questionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Url() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Identifier() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Version() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Status() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Date() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Publisher() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Telecom() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_UseContext() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Title() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Concept() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_SubjectType() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Item() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireItem() {
		if (questionnaireItemEClass == null) {
			questionnaireItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(129);
		}
		return questionnaireItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_LinkId() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_Definition() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_Concept() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_Prefix() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_Text() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_Type() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_EnableWhen() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_Required() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_Repeats() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_ReadOnly() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_MaxLength() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_Options() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_Option() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_Initialx() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItem_Item() {
        return (EReference)getQuestionnaireItem().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireItemEnableWhen() {
		if (questionnaireItemEnableWhenEClass == null) {
			questionnaireItemEnableWhenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(130);
		}
		return questionnaireItemEnableWhenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItemEnableWhen_Question() {
        return (EReference)getQuestionnaireItemEnableWhen().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItemEnableWhen_HasAnswer() {
        return (EReference)getQuestionnaireItemEnableWhen().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItemEnableWhen_Answerx() {
        return (EReference)getQuestionnaireItemEnableWhen().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireItemOption() {
		if (questionnaireItemOptionEClass == null) {
			questionnaireItemOptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(131);
		}
		return questionnaireItemOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireItemOption_Valuex() {
        return (EReference)getQuestionnaireItemOption().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireResponseItem() {
		if (questionnaireResponseItemEClass == null) {
			questionnaireResponseItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(132);
		}
		return questionnaireResponseItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseItem_LinkId() {
        return (EReference)getQuestionnaireResponseItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseItem_Definition() {
        return (EReference)getQuestionnaireResponseItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseItem_Text() {
        return (EReference)getQuestionnaireResponseItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseItem_Subject() {
        return (EReference)getQuestionnaireResponseItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseItem_Answer() {
        return (EReference)getQuestionnaireResponseItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseItem_Item() {
        return (EReference)getQuestionnaireResponseItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireResponseItemAnswer() {
		if (questionnaireResponseItemAnswerEClass == null) {
			questionnaireResponseItemAnswerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(133);
		}
		return questionnaireResponseItemAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseItemAnswer_Valuex() {
        return (EReference)getQuestionnaireResponseItemAnswer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseItemAnswer_Item() {
        return (EReference)getQuestionnaireResponseItemAnswer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlan() {
		if (carePlanEClass == null) {
			carePlanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(134);
		}
		return carePlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Identifier() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Status() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Category() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Description() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Subject() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Context() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Period() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Modified() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Author() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_CareTeam() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Addresses() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Support() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Definition() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_RelatedPlan() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Goal() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Activity() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Note() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanRelatedPlan() {
		if (carePlanRelatedPlanEClass == null) {
			carePlanRelatedPlanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(135);
		}
		return carePlanRelatedPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanRelatedPlan_Code() {
        return (EReference)getCarePlanRelatedPlan().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanRelatedPlan_Plan() {
        return (EReference)getCarePlanRelatedPlan().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		if (goalEClass == null) {
			goalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(136);
		}
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Identifier() {
        return (EReference)getGoal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Status() {
        return (EReference)getGoal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Category() {
        return (EReference)getGoal().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Priority() {
        return (EReference)getGoal().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Description() {
        return (EReference)getGoal().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Subject() {
        return (EReference)getGoal().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Startx() {
        return (EReference)getGoal().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Targetx() {
        return (EReference)getGoal().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_StatusDate() {
        return (EReference)getGoal().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_StatusReason() {
        return (EReference)getGoal().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_ExpressedBy() {
        return (EReference)getGoal().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Addresses() {
        return (EReference)getGoal().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Note() {
        return (EReference)getGoal().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Outcome() {
        return (EReference)getGoal().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalOutcome() {
		if (goalOutcomeEClass == null) {
			goalOutcomeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(137);
		}
		return goalOutcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalOutcome_Resultx() {
        return (EReference)getGoalOutcome().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanActivity() {
		if (carePlanActivityEClass == null) {
			carePlanActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(138);
		}
		return carePlanActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivity_ActionResulting() {
        return (EReference)getCarePlanActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivity_Outcome() {
        return (EReference)getCarePlanActivity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivity_Progress() {
        return (EReference)getCarePlanActivity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivity_Reference() {
        return (EReference)getCarePlanActivity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivity_Detail() {
        return (EReference)getCarePlanActivity().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanActivityDetail() {
		if (carePlanActivityDetailEClass == null) {
			carePlanActivityDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(139);
		}
		return carePlanActivityDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Category() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Definition() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Code() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_ReasonCode() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_ReasonReference() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Goal() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Status() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_StatusReason() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Prohibited() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Scheduledx() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Location() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Performer() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Productx() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_DailyAmount() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Quantity() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Description() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationStatement() {
		if (medicationStatementEClass == null) {
			medicationStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(140);
		}
		return medicationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Identifier() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Status() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Medicationx() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Subject() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Effectivex() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_InformationSource() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_DerivedFrom() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_DateAsserted() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_NotTaken() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_ReasonNotTaken() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_ReasonForUseCodeableConcept() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_ReasonForUseReference() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Note() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Category() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Dosage() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionRequest() {
		if (nutritionRequestEClass == null) {
			nutritionRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(141);
		}
		return nutritionRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequest_Identifier() {
        return (EReference)getNutritionRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequest_Status() {
        return (EReference)getNutritionRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequest_Patient() {
        return (EReference)getNutritionRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequest_Encounter() {
        return (EReference)getNutritionRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequest_DateTime() {
        return (EReference)getNutritionRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequest_Orderer() {
        return (EReference)getNutritionRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequest_AllergyIntolerance() {
        return (EReference)getNutritionRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequest_FoodPreferenceModifier() {
        return (EReference)getNutritionRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequest_ExcludeFoodModifier() {
        return (EReference)getNutritionRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequest_OralDiet() {
        return (EReference)getNutritionRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequest_Supplement() {
        return (EReference)getNutritionRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequest_EnteralFormula() {
        return (EReference)getNutritionRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionRequestOralDiet() {
		if (nutritionRequestOralDietEClass == null) {
			nutritionRequestOralDietEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(142);
		}
		return nutritionRequestOralDietEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestOralDiet_Type() {
        return (EReference)getNutritionRequestOralDiet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestOralDiet_Schedule() {
        return (EReference)getNutritionRequestOralDiet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestOralDiet_Nutrient() {
        return (EReference)getNutritionRequestOralDiet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestOralDiet_Texture() {
        return (EReference)getNutritionRequestOralDiet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestOralDiet_FluidConsistencyType() {
        return (EReference)getNutritionRequestOralDiet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestOralDiet_Instruction() {
        return (EReference)getNutritionRequestOralDiet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionRequestOralDietNutrient() {
		if (nutritionRequestOralDietNutrientEClass == null) {
			nutritionRequestOralDietNutrientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(143);
		}
		return nutritionRequestOralDietNutrientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestOralDietNutrient_Modifier() {
        return (EReference)getNutritionRequestOralDietNutrient().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestOralDietNutrient_Amount() {
        return (EReference)getNutritionRequestOralDietNutrient().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionRequestOralDietTexture() {
		if (nutritionRequestOralDietTextureEClass == null) {
			nutritionRequestOralDietTextureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(144);
		}
		return nutritionRequestOralDietTextureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestOralDietTexture_Modifier() {
        return (EReference)getNutritionRequestOralDietTexture().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestOralDietTexture_FoodType() {
        return (EReference)getNutritionRequestOralDietTexture().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionRequestSupplement() {
		if (nutritionRequestSupplementEClass == null) {
			nutritionRequestSupplementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(145);
		}
		return nutritionRequestSupplementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestSupplement_Type() {
        return (EReference)getNutritionRequestSupplement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestSupplement_ProductName() {
        return (EReference)getNutritionRequestSupplement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestSupplement_Schedule() {
        return (EReference)getNutritionRequestSupplement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestSupplement_Quantity() {
        return (EReference)getNutritionRequestSupplement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestSupplement_Instruction() {
        return (EReference)getNutritionRequestSupplement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionRequestEnteralFormula() {
		if (nutritionRequestEnteralFormulaEClass == null) {
			nutritionRequestEnteralFormulaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(146);
		}
		return nutritionRequestEnteralFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestEnteralFormula_BaseFormulaType() {
        return (EReference)getNutritionRequestEnteralFormula().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestEnteralFormula_BaseFormulaProductName() {
        return (EReference)getNutritionRequestEnteralFormula().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestEnteralFormula_AdditiveType() {
        return (EReference)getNutritionRequestEnteralFormula().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestEnteralFormula_AdditiveProductName() {
        return (EReference)getNutritionRequestEnteralFormula().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestEnteralFormula_CaloricDensity() {
        return (EReference)getNutritionRequestEnteralFormula().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestEnteralFormula_RouteofAdministration() {
        return (EReference)getNutritionRequestEnteralFormula().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestEnteralFormula_Administration() {
        return (EReference)getNutritionRequestEnteralFormula().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestEnteralFormula_MaxVolumeToDeliver() {
        return (EReference)getNutritionRequestEnteralFormula().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestEnteralFormula_AdministrationInstruction() {
        return (EReference)getNutritionRequestEnteralFormula().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionRequestEnteralFormulaAdministration() {
		if (nutritionRequestEnteralFormulaAdministrationEClass == null) {
			nutritionRequestEnteralFormulaAdministrationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(147);
		}
		return nutritionRequestEnteralFormulaAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestEnteralFormulaAdministration_Schedule() {
        return (EReference)getNutritionRequestEnteralFormulaAdministration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestEnteralFormulaAdministration_Quantity() {
        return (EReference)getNutritionRequestEnteralFormulaAdministration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionRequestEnteralFormulaAdministration_Ratex() {
        return (EReference)getNutritionRequestEnteralFormulaAdministration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationRequest() {
		if (communicationRequestEClass == null) {
			communicationRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(148);
		}
		return communicationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Identifier() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Category() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Sender() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Recipient() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Payload() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Medium() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Requester() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Status() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Topic() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Context() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Scheduledx() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Reason() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_RequestedOn() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Subject() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Priority() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationRequestPayload() {
		if (communicationRequestPayloadEClass == null) {
			communicationRequestPayloadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(149);
		}
		return communicationRequestPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequestPayload_Contentx() {
        return (EReference)getCommunicationRequestPayload().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceUseRequest() {
		if (deviceUseRequestEClass == null) {
			deviceUseRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(150);
		}
		return deviceUseRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Identifier() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Definition() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_BasedOn() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Replaces() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Requisition() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Status() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Stage() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Devicex() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Subject() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Context() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Occurrencex() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Authored() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Requester() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_PerformerType() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Performer() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_ReasonCode() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_ReasonReference() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_SupportingInfo() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Note() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_RelevantHistory() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationRequest() {
		if (medicationRequestEClass == null) {
			medicationRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(151);
		}
		return medicationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_Identifier() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_Definition() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_BasedOn() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_Requisition() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_Status() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_Stage() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_Medicationx() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_Patient() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_Context() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_SupportingInformation() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_DateWritten() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_Requester() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_ReasonCode() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_ReasonReference() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_Note() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_Category() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_DosageInstruction() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_DispenseRequest() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_Substitution() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_PriorPrescription() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequest_EventHistory() {
        return (EReference)getMedicationRequest().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationRequestDispenseRequest() {
		if (medicationRequestDispenseRequestEClass == null) {
			medicationRequestDispenseRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(152);
		}
		return medicationRequestDispenseRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequestDispenseRequest_ValidityPeriod() {
        return (EReference)getMedicationRequestDispenseRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequestDispenseRequest_NumberOfRepeatsAllowed() {
        return (EReference)getMedicationRequestDispenseRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequestDispenseRequest_Quantity() {
        return (EReference)getMedicationRequestDispenseRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequestDispenseRequest_ExpectedSupplyDuration() {
        return (EReference)getMedicationRequestDispenseRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequestDispenseRequest_Performer() {
        return (EReference)getMedicationRequestDispenseRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationRequestSubstitution() {
		if (medicationRequestSubstitutionEClass == null) {
			medicationRequestSubstitutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(153);
		}
		return medicationRequestSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequestSubstitution_Allowed() {
        return (EReference)getMedicationRequestSubstitution().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationRequestSubstitution_Reason() {
        return (EReference)getMedicationRequestSubstitution().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRequest() {
		if (processRequestEClass == null) {
			processRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(154);
		}
		return processRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Identifier() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Status() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Action() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Target() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Created() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Provider() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Organization() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Request() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Response() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Nullify() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Reference() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Item() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Include() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Exclude() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Period() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRequestItems() {
		if (processRequestItemsEClass == null) {
			processRequestItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(155);
		}
		return processRequestItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequestItems_SequenceLinkId() {
        return (EReference)getProcessRequestItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisionPrescription() {
		if (visionPrescriptionEClass == null) {
			visionPrescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(156);
		}
		return visionPrescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Identifier() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Status() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Patient() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Encounter() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_DateWritten() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Prescriber() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Reasonx() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Dispense() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisionPrescriptionDispense() {
		if (visionPrescriptionDispenseEClass == null) {
			visionPrescriptionDispenseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(157);
		}
		return visionPrescriptionDispenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Product() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Eye() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Sphere() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Cylinder() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Axis() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Prism() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Base() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Add() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Power() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_BackCurve() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Diameter() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Duration() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Color() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Brand() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Note() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		if (procedureEClass == null) {
			procedureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(158);
		}
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Identifier() {
        return (EReference)getProcedure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Status() {
        return (EReference)getProcedure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Category() {
        return (EReference)getProcedure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Code() {
        return (EReference)getProcedure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Subject() {
        return (EReference)getProcedure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Encounter() {
        return (EReference)getProcedure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Performedx() {
        return (EReference)getProcedure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Performer() {
        return (EReference)getProcedure().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Location() {
        return (EReference)getProcedure().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_ReasonReference() {
        return (EReference)getProcedure().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_ReasonCode() {
        return (EReference)getProcedure().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_NotPerformed() {
        return (EReference)getProcedure().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_ReasonNotPerformed() {
        return (EReference)getProcedure().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_BodySite() {
        return (EReference)getProcedure().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Outcome() {
        return (EReference)getProcedure().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Report() {
        return (EReference)getProcedure().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Complication() {
        return (EReference)getProcedure().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_FollowUp() {
        return (EReference)getProcedure().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Request() {
        return (EReference)getProcedure().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Notes() {
        return (EReference)getProcedure().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_FocalDevice() {
        return (EReference)getProcedure().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_UsedReference() {
        return (EReference)getProcedure().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_UsedCode() {
        return (EReference)getProcedure().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Component() {
        return (EReference)getProcedure().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedurePerformer() {
		if (procedurePerformerEClass == null) {
			procedurePerformerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(159);
		}
		return procedurePerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedurePerformer_Actor() {
        return (EReference)getProcedurePerformer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedurePerformer_Role() {
        return (EReference)getProcedurePerformer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticReport() {
		if (diagnosticReportEClass == null) {
			diagnosticReportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(160);
		}
		return diagnosticReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Identifier() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Status() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Category() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Code() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Subject() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Encounter() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Effectivex() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Issued() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Performer() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Request() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Specimen() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Result() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_ImagingStudy() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Image() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Conclusion() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_CodedDiagnosis() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_PresentedForm() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticReportImage() {
		if (diagnosticReportImageEClass == null) {
			diagnosticReportImageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(161);
		}
		return diagnosticReportImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReportImage_Comment() {
        return (EReference)getDiagnosticReportImage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReportImage_Link() {
        return (EReference)getDiagnosticReportImage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedia() {
		if (mediaEClass == null) {
			mediaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(162);
		}
		return mediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Identifier() {
        return (EReference)getMedia().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Type() {
        return (EReference)getMedia().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Subtype() {
        return (EReference)getMedia().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_View() {
        return (EReference)getMedia().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Subject() {
        return (EReference)getMedia().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Operator() {
        return (EReference)getMedia().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_DeviceName() {
        return (EReference)getMedia().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Height() {
        return (EReference)getMedia().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Width() {
        return (EReference)getMedia().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Frames() {
        return (EReference)getMedia().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Duration() {
        return (EReference)getMedia().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Content() {
        return (EReference)getMedia().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureFocalDevice() {
		if (procedureFocalDeviceEClass == null) {
			procedureFocalDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(163);
		}
		return procedureFocalDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureFocalDevice_Action() {
        return (EReference)getProcedureFocalDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureFocalDevice_Manipulated() {
        return (EReference)getProcedureFocalDevice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingStudy() {
		if (imagingStudyEClass == null) {
			imagingStudyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(164);
		}
		return imagingStudyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Uid() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Accession() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Identifier() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Availability() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_ModalityList() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Patient() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Context() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Started() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_BasedOn() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Referrer() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Interpreter() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_BaseLocation() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_NumberOfSeries() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_NumberOfInstances() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Procedure() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Reason() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Description() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Series() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingStudyStudyBaseLocation() {
		if (imagingStudyStudyBaseLocationEClass == null) {
			imagingStudyStudyBaseLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(165);
		}
		return imagingStudyStudyBaseLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudyStudyBaseLocation_Type() {
        return (EReference)getImagingStudyStudyBaseLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudyStudyBaseLocation_Url() {
        return (EReference)getImagingStudyStudyBaseLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingStudySeries() {
		if (imagingStudySeriesEClass == null) {
			imagingStudySeriesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(166);
		}
		return imagingStudySeriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Uid() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Number() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Modality() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Description() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_NumberOfInstances() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Availability() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_BaseLocation() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_BodySite() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Laterality() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Started() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Instance() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingStudySeriesSeriesBaseLocation() {
		if (imagingStudySeriesSeriesBaseLocationEClass == null) {
			imagingStudySeriesSeriesBaseLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(167);
		}
		return imagingStudySeriesSeriesBaseLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeriesSeriesBaseLocation_Type() {
        return (EReference)getImagingStudySeriesSeriesBaseLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeriesSeriesBaseLocation_Url() {
        return (EReference)getImagingStudySeriesSeriesBaseLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingStudySeriesInstance() {
		if (imagingStudySeriesInstanceEClass == null) {
			imagingStudySeriesInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(168);
		}
		return imagingStudySeriesInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeriesInstance_Uid() {
        return (EReference)getImagingStudySeriesInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeriesInstance_Number() {
        return (EReference)getImagingStudySeriesInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeriesInstance_SopClass() {
        return (EReference)getImagingStudySeriesInstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeriesInstance_Title() {
        return (EReference)getImagingStudySeriesInstance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingManifest() {
		if (imagingManifestEClass == null) {
			imagingManifestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(169);
		}
		return imagingManifestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifest_Uid() {
        return (EReference)getImagingManifest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifest_Patient() {
        return (EReference)getImagingManifest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifest_AuthoringTime() {
        return (EReference)getImagingManifest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifest_Author() {
        return (EReference)getImagingManifest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifest_Title() {
        return (EReference)getImagingManifest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifest_Description() {
        return (EReference)getImagingManifest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifest_Study() {
        return (EReference)getImagingManifest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingManifestStudy() {
		if (imagingManifestStudyEClass == null) {
			imagingManifestStudyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(170);
		}
		return imagingManifestStudyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifestStudy_Uid() {
        return (EReference)getImagingManifestStudy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifestStudy_ImagingStudy() {
        return (EReference)getImagingManifestStudy().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifestStudy_BaseLocation() {
        return (EReference)getImagingManifestStudy().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifestStudy_Series() {
        return (EReference)getImagingManifestStudy().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingManifestStudyStudyBaseLocation() {
		if (imagingManifestStudyStudyBaseLocationEClass == null) {
			imagingManifestStudyStudyBaseLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(171);
		}
		return imagingManifestStudyStudyBaseLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifestStudyStudyBaseLocation_Type() {
        return (EReference)getImagingManifestStudyStudyBaseLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifestStudyStudyBaseLocation_Url() {
        return (EReference)getImagingManifestStudyStudyBaseLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingManifestStudySeries() {
		if (imagingManifestStudySeriesEClass == null) {
			imagingManifestStudySeriesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(172);
		}
		return imagingManifestStudySeriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifestStudySeries_Uid() {
        return (EReference)getImagingManifestStudySeries().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifestStudySeries_BaseLocation() {
        return (EReference)getImagingManifestStudySeries().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifestStudySeries_Instance() {
        return (EReference)getImagingManifestStudySeries().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingManifestStudySeriesSeriesBaseLocation() {
		if (imagingManifestStudySeriesSeriesBaseLocationEClass == null) {
			imagingManifestStudySeriesSeriesBaseLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(173);
		}
		return imagingManifestStudySeriesSeriesBaseLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifestStudySeriesSeriesBaseLocation_Type() {
        return (EReference)getImagingManifestStudySeriesSeriesBaseLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifestStudySeriesSeriesBaseLocation_Url() {
        return (EReference)getImagingManifestStudySeriesSeriesBaseLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingManifestStudySeriesInstance() {
		if (imagingManifestStudySeriesInstanceEClass == null) {
			imagingManifestStudySeriesInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(174);
		}
		return imagingManifestStudySeriesInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifestStudySeriesInstance_SopClass() {
        return (EReference)getImagingManifestStudySeriesInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingManifestStudySeriesInstance_Uid() {
        return (EReference)getImagingManifestStudySeriesInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationAdministration() {
		if (medicationAdministrationEClass == null) {
			medicationAdministrationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(175);
		}
		return medicationAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Identifier() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Status() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Medicationx() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Patient() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Encounter() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_SupportingInformation() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Effectivex() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Performer() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_ReasonReference() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Prescription() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_NotGiven() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_ReasonNotGiven() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_ReasonGiven() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Device() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Note() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Dosage() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_EventHistory() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationAdministrationDosage() {
		if (medicationAdministrationDosageEClass == null) {
			medicationAdministrationDosageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(176);
		}
		return medicationAdministrationDosageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Text() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Site() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Route() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Method() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Dose() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Ratex() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		if (sequenceEClass == null) {
			sequenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(177);
		}
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Identifier() {
        return (EReference)getSequence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Type() {
        return (EReference)getSequence().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_CoordinateSystem() {
        return (EReference)getSequence().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Patient() {
        return (EReference)getSequence().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Specimen() {
        return (EReference)getSequence().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Device() {
        return (EReference)getSequence().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Performer() {
        return (EReference)getSequence().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Quantity() {
        return (EReference)getSequence().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_ReferenceSeq() {
        return (EReference)getSequence().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Variant() {
        return (EReference)getSequence().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_ObservedSeq() {
        return (EReference)getSequence().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Quality() {
        return (EReference)getSequence().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_ReadCoverage() {
        return (EReference)getSequence().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Repository() {
        return (EReference)getSequence().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Pointer() {
        return (EReference)getSequence().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_StructureVariant() {
        return (EReference)getSequence().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceReferenceSeq() {
		if (sequenceReferenceSeqEClass == null) {
			sequenceReferenceSeqEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(178);
		}
		return sequenceReferenceSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceReferenceSeq_Chromosome() {
        return (EReference)getSequenceReferenceSeq().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceReferenceSeq_GenomeBuild() {
        return (EReference)getSequenceReferenceSeq().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceReferenceSeq_ReferenceSeqId() {
        return (EReference)getSequenceReferenceSeq().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceReferenceSeq_ReferenceSeqPointer() {
        return (EReference)getSequenceReferenceSeq().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceReferenceSeq_ReferenceSeqString() {
        return (EReference)getSequenceReferenceSeq().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceReferenceSeq_Strand() {
        return (EReference)getSequenceReferenceSeq().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceReferenceSeq_WindowStart() {
        return (EReference)getSequenceReferenceSeq().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceReferenceSeq_WindowEnd() {
        return (EReference)getSequenceReferenceSeq().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceVariant() {
		if (sequenceVariantEClass == null) {
			sequenceVariantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(179);
		}
		return sequenceVariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceVariant_Start() {
        return (EReference)getSequenceVariant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceVariant_End() {
        return (EReference)getSequenceVariant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceVariant_ObservedAllele() {
        return (EReference)getSequenceVariant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceVariant_ReferenceAllele() {
        return (EReference)getSequenceVariant().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceVariant_Cigar() {
        return (EReference)getSequenceVariant().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceVariant_VariantPointer() {
        return (EReference)getSequenceVariant().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceQuality() {
		if (sequenceQualityEClass == null) {
			sequenceQualityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(180);
		}
		return sequenceQualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_Type() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_StandardSequence() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_Start() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_End() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_Score() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_Method() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_TruthTp() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_QueryTp() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_TruthFn() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_QueryFp() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_GtFp() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_Precision() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_Recall() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceQuality_FScore() {
        return (EReference)getSequenceQuality().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceRepository() {
		if (sequenceRepositoryEClass == null) {
			sequenceRepositoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(181);
		}
		return sequenceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceRepository_Type() {
        return (EReference)getSequenceRepository().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceRepository_Url() {
        return (EReference)getSequenceRepository().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceRepository_Name() {
        return (EReference)getSequenceRepository().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceRepository_DatasetId() {
        return (EReference)getSequenceRepository().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceRepository_VariantsetId() {
        return (EReference)getSequenceRepository().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceRepository_ReadsetId() {
        return (EReference)getSequenceRepository().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceStructureVariant() {
		if (sequenceStructureVariantEClass == null) {
			sequenceStructureVariantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(182);
		}
		return sequenceStructureVariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceStructureVariant_PrecisionOfBoundaries() {
        return (EReference)getSequenceStructureVariant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceStructureVariant_ReportedaCghRatio() {
        return (EReference)getSequenceStructureVariant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceStructureVariant_Length() {
        return (EReference)getSequenceStructureVariant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceStructureVariant_Outer() {
        return (EReference)getSequenceStructureVariant().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceStructureVariant_Inner() {
        return (EReference)getSequenceStructureVariant().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceStructureVariantOuter() {
		if (sequenceStructureVariantOuterEClass == null) {
			sequenceStructureVariantOuterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(183);
		}
		return sequenceStructureVariantOuterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceStructureVariantOuter_Start() {
        return (EReference)getSequenceStructureVariantOuter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceStructureVariantOuter_End() {
        return (EReference)getSequenceStructureVariantOuter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceStructureVariantInner() {
		if (sequenceStructureVariantInnerEClass == null) {
			sequenceStructureVariantInnerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(184);
		}
		return sequenceStructureVariantInnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceStructureVariantInner_Start() {
        return (EReference)getSequenceStructureVariantInner().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceStructureVariantInner_End() {
        return (EReference)getSequenceStructureVariantInner().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyMemberHistory() {
		if (familyMemberHistoryEClass == null) {
			familyMemberHistoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(185);
		}
		return familyMemberHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Identifier() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Patient() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Date() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Status() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Name() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Relationship() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Gender() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Bornx() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Agex() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_EstimatedAge() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Deceasedx() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Note() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Condition() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyMemberHistoryCondition() {
		if (familyMemberHistoryConditionEClass == null) {
			familyMemberHistoryConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(186);
		}
		return familyMemberHistoryConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_Code() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_Outcome() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_Onsetx() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_Note() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposition() {
		if (compositionEClass == null) {
			compositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(187);
		}
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Identifier() {
        return (EReference)getComposition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Date() {
        return (EReference)getComposition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Type() {
        return (EReference)getComposition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Class() {
        return (EReference)getComposition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Title() {
        return (EReference)getComposition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Status() {
        return (EReference)getComposition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Confidentiality() {
        return (EReference)getComposition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Subject() {
        return (EReference)getComposition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Author() {
        return (EReference)getComposition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Attester() {
        return (EReference)getComposition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Custodian() {
        return (EReference)getComposition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Event() {
        return (EReference)getComposition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Encounter() {
        return (EReference)getComposition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Section() {
        return (EReference)getComposition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionAttester() {
		if (compositionAttesterEClass == null) {
			compositionAttesterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(188);
		}
		return compositionAttesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionAttester_Mode() {
        return (EReference)getCompositionAttester().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionAttester_Time() {
        return (EReference)getCompositionAttester().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionAttester_Party() {
        return (EReference)getCompositionAttester().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionEvent() {
		if (compositionEventEClass == null) {
			compositionEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(189);
		}
		return compositionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionEvent_Code() {
        return (EReference)getCompositionEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionEvent_Period() {
        return (EReference)getCompositionEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionEvent_Detail() {
        return (EReference)getCompositionEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionSection() {
		if (compositionSectionEClass == null) {
			compositionSectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(190);
		}
		return compositionSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Title() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Code() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Text() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Mode() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_OrderedBy() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Entry() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_EmptyReason() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Section() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunication() {
		if (communicationEClass == null) {
			communicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(191);
		}
		return communicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Identifier() {
        return (EReference)getCommunication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_BasedOn() {
        return (EReference)getCommunication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Parent() {
        return (EReference)getCommunication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Status() {
        return (EReference)getCommunication().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Category() {
        return (EReference)getCommunication().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Medium() {
        return (EReference)getCommunication().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Subject() {
        return (EReference)getCommunication().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Topic() {
        return (EReference)getCommunication().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Context() {
        return (EReference)getCommunication().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Sent() {
        return (EReference)getCommunication().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Received() {
        return (EReference)getCommunication().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Sender() {
        return (EReference)getCommunication().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Recipient() {
        return (EReference)getCommunication().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Reason() {
        return (EReference)getCommunication().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Payload() {
        return (EReference)getCommunication().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Note() {
        return (EReference)getCommunication().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationPayload() {
		if (communicationPayloadEClass == null) {
			communicationPayloadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(192);
		}
		return communicationPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationPayload_Contentx() {
        return (EReference)getCommunicationPayload().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingSystem() {
		if (namingSystemEClass == null) {
			namingSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(193);
		}
		return namingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Name() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Status() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Kind() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Date() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Publisher() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Contact() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Responsible() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Type() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Description() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_UseContext() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Jurisdiction() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Usage() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_UniqueId() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_ReplacedBy() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingSystemUniqueId() {
		if (namingSystemUniqueIdEClass == null) {
			namingSystemUniqueIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(194);
		}
		return namingSystemUniqueIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemUniqueId_Type() {
        return (EReference)getNamingSystemUniqueId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemUniqueId_Value() {
        return (EReference)getNamingSystemUniqueId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemUniqueId_Preferred() {
        return (EReference)getNamingSystemUniqueId().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemUniqueId_Comment() {
        return (EReference)getNamingSystemUniqueId().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemUniqueId_Period() {
        return (EReference)getNamingSystemUniqueId().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMap() {
		if (conceptMapEClass == null) {
			conceptMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(195);
		}
		return conceptMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Url() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Identifier() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Version() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Name() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Title() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Status() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Experimental() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Publisher() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Contact() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Date() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Description() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_UseContext() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Jurisdiction() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Purpose() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Copyright() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Sourcex() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Targetx() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Group() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMapGroup() {
		if (conceptMapGroupEClass == null) {
			conceptMapGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(196);
		}
		return conceptMapGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroup_Source() {
        return (EReference)getConceptMapGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroup_SourceVersion() {
        return (EReference)getConceptMapGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroup_Target() {
        return (EReference)getConceptMapGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroup_TargetVersion() {
        return (EReference)getConceptMapGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroup_Element() {
        return (EReference)getConceptMapGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMapGroupSourceElement() {
		if (conceptMapGroupSourceElementEClass == null) {
			conceptMapGroupSourceElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(197);
		}
		return conceptMapGroupSourceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroupSourceElement_Code() {
        return (EReference)getConceptMapGroupSourceElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroupSourceElement_Target() {
        return (EReference)getConceptMapGroupSourceElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMapGroupSourceElementTargetElement() {
		if (conceptMapGroupSourceElementTargetElementEClass == null) {
			conceptMapGroupSourceElementTargetElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(198);
		}
		return conceptMapGroupSourceElementTargetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroupSourceElementTargetElement_Code() {
        return (EReference)getConceptMapGroupSourceElementTargetElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroupSourceElementTargetElement_Equivalence() {
        return (EReference)getConceptMapGroupSourceElementTargetElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroupSourceElementTargetElement_Comments() {
        return (EReference)getConceptMapGroupSourceElementTargetElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroupSourceElementTargetElement_DependsOn() {
        return (EReference)getConceptMapGroupSourceElementTargetElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroupSourceElementTargetElement_Product() {
        return (EReference)getConceptMapGroupSourceElementTargetElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMapGroupSourceElementTargetElementOtherElement() {
		if (conceptMapGroupSourceElementTargetElementOtherElementEClass == null) {
			conceptMapGroupSourceElementTargetElementOtherElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(199);
		}
		return conceptMapGroupSourceElementTargetElementOtherElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroupSourceElementTargetElementOtherElement_Property() {
        return (EReference)getConceptMapGroupSourceElementTargetElementOtherElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroupSourceElementTargetElementOtherElement_System() {
        return (EReference)getConceptMapGroupSourceElementTargetElementOtherElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapGroupSourceElementTargetElementOtherElement_Code() {
        return (EReference)getConceptMapGroupSourceElementTargetElementOtherElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestGroup() {
		if (requestGroupEClass == null) {
			requestGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(200);
		}
		return requestGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroup_Identifier() {
        return (EReference)getRequestGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroup_Subject() {
        return (EReference)getRequestGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroup_Context() {
        return (EReference)getRequestGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroup_OccurrenceDateTime() {
        return (EReference)getRequestGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroup_Author() {
        return (EReference)getRequestGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroup_Reasonx() {
        return (EReference)getRequestGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroup_Note() {
        return (EReference)getRequestGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroup_Action() {
        return (EReference)getRequestGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestGroupAction() {
		if (requestGroupActionEClass == null) {
			requestGroupActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(201);
		}
		return requestGroupActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_ActionIdentifier() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_Label() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_Title() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_Description() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_TextEquivalent() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_Code() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_Documentation() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_Condition() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_RelatedAction() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_Timingx() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_Participant() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_Type() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_GroupingBehavior() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_SelectionBehavior() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_RequiredBehavior() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_PrecheckBehavior() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_CardinalityBehavior() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_Resource() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupAction_Action() {
        return (EReference)getRequestGroupAction().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestGroupActionCondition() {
		if (requestGroupActionConditionEClass == null) {
			requestGroupActionConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(202);
		}
		return requestGroupActionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupActionCondition_Kind() {
        return (EReference)getRequestGroupActionCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupActionCondition_Description() {
        return (EReference)getRequestGroupActionCondition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupActionCondition_Language() {
        return (EReference)getRequestGroupActionCondition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupActionCondition_Expression() {
        return (EReference)getRequestGroupActionCondition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestGroupActionRelatedAction() {
		if (requestGroupActionRelatedActionEClass == null) {
			requestGroupActionRelatedActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(203);
		}
		return requestGroupActionRelatedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupActionRelatedAction_ActionIdentifier() {
        return (EReference)getRequestGroupActionRelatedAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupActionRelatedAction_Relationship() {
        return (EReference)getRequestGroupActionRelatedAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestGroupActionRelatedAction_Offsetx() {
        return (EReference)getRequestGroupActionRelatedAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		if (personEClass == null) {
			personEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(204);
		}
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Identifier() {
        return (EReference)getPerson().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Name() {
        return (EReference)getPerson().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Telecom() {
        return (EReference)getPerson().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Gender() {
        return (EReference)getPerson().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_BirthDate() {
        return (EReference)getPerson().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Address() {
        return (EReference)getPerson().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Photo() {
        return (EReference)getPerson().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_ManagingOrganization() {
        return (EReference)getPerson().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Active() {
        return (EReference)getPerson().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Link() {
        return (EReference)getPerson().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonLink() {
		if (personLinkEClass == null) {
			personLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(205);
		}
		return personLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLink_Target() {
        return (EReference)getPersonLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLink_Assurance() {
        return (EReference)getPersonLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlag() {
		if (flagEClass == null) {
			flagEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(206);
		}
		return flagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Identifier() {
        return (EReference)getFlag().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Category() {
        return (EReference)getFlag().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Status() {
        return (EReference)getFlag().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Period() {
        return (EReference)getFlag().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Subject() {
        return (EReference)getFlag().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Encounter() {
        return (EReference)getFlag().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Author() {
        return (EReference)getFlag().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Code() {
        return (EReference)getFlag().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystem() {
		if (codeSystemEClass == null) {
			codeSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(207);
		}
		return codeSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Url() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Identifier() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Version() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Name() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Title() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Status() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Experimental() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Publisher() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Contact() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Date() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Description() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_UseContext() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Jurisdiction() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Purpose() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Copyright() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_CaseSensitive() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_ValueSet() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_HierarchyMeaning() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Compositional() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_VersionNeeded() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Content() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Count() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Filter() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Property() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_Concept() {
        return (EReference)getCodeSystem().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemFilter() {
		if (codeSystemFilterEClass == null) {
			codeSystemFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(208);
		}
		return codeSystemFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemFilter_Code() {
        return (EReference)getCodeSystemFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemFilter_Description() {
        return (EReference)getCodeSystemFilter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemFilter_Operator() {
        return (EReference)getCodeSystemFilter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemFilter_Value() {
        return (EReference)getCodeSystemFilter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemProperty() {
		if (codeSystemPropertyEClass == null) {
			codeSystemPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(209);
		}
		return codeSystemPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemProperty_Code() {
        return (EReference)getCodeSystemProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemProperty_Uri() {
        return (EReference)getCodeSystemProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemProperty_Description() {
        return (EReference)getCodeSystemProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemProperty_Type() {
        return (EReference)getCodeSystemProperty().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemConceptDefinition() {
		if (codeSystemConceptDefinitionEClass == null) {
			codeSystemConceptDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(210);
		}
		return codeSystemConceptDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConceptDefinition_Code() {
        return (EReference)getCodeSystemConceptDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConceptDefinition_Display() {
        return (EReference)getCodeSystemConceptDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConceptDefinition_Definition() {
        return (EReference)getCodeSystemConceptDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConceptDefinition_Designation() {
        return (EReference)getCodeSystemConceptDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConceptDefinition_Property() {
        return (EReference)getCodeSystemConceptDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConceptDefinition_Concept() {
        return (EReference)getCodeSystemConceptDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemConceptDefinitionDesignation() {
		if (codeSystemConceptDefinitionDesignationEClass == null) {
			codeSystemConceptDefinitionDesignationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(211);
		}
		return codeSystemConceptDefinitionDesignationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConceptDefinitionDesignation_Language() {
        return (EReference)getCodeSystemConceptDefinitionDesignation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConceptDefinitionDesignation_Use() {
        return (EReference)getCodeSystemConceptDefinitionDesignation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConceptDefinitionDesignation_Value() {
        return (EReference)getCodeSystemConceptDefinitionDesignation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemConceptDefinitionConceptProperty() {
		if (codeSystemConceptDefinitionConceptPropertyEClass == null) {
			codeSystemConceptDefinitionConceptPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(212);
		}
		return codeSystemConceptDefinitionConceptPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConceptDefinitionConceptProperty_Code() {
        return (EReference)getCodeSystemConceptDefinitionConceptProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConceptDefinitionConceptProperty_Valuex() {
        return (EReference)getCodeSystemConceptDefinitionConceptProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinary() {
		if (binaryEClass == null) {
			binaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(213);
		}
		return binaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_ContentType() {
        return (EReference)getBinary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_SecurityContext() {
        return (EReference)getBinary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_Content() {
        return (EReference)getBinary().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentManifest() {
		if (documentManifestEClass == null) {
			documentManifestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(214);
		}
		return documentManifestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_MasterIdentifier() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Identifier() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Subject() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Recipient() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Type() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Author() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Created() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Source() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Status() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Description() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Content() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Related() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentManifestContent() {
		if (documentManifestContentEClass == null) {
			documentManifestContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(215);
		}
		return documentManifestContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifestContent_Px() {
        return (EReference)getDocumentManifestContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentManifestRelated() {
		if (documentManifestRelatedEClass == null) {
			documentManifestRelatedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(216);
		}
		return documentManifestRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifestRelated_Identifier() {
        return (EReference)getDocumentManifestRelated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifestRelated_Ref() {
        return (EReference)getDocumentManifestRelated().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentReconciliation() {
		if (paymentReconciliationEClass == null) {
			paymentReconciliationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(217);
		}
		return paymentReconciliationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Identifier() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Status() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Period() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Created() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Organization() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Request() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Outcome() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Disposition() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_RequestProvider() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_RequestOrganization() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Detail() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Form() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Total() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Note() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentReconciliationDetails() {
		if (paymentReconciliationDetailsEClass == null) {
			paymentReconciliationDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(218);
		}
		return paymentReconciliationDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Type() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Request() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Response() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Submitter() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Payee() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Date() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Amount() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentReconciliationNotes() {
		if (paymentReconciliationNotesEClass == null) {
			paymentReconciliationNotesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(219);
		}
		return paymentReconciliationNotesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationNotes_Type() {
        return (EReference)getPaymentReconciliationNotes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationNotes_Text() {
        return (EReference)getPaymentReconciliationNotes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceUseStatement() {
		if (deviceUseStatementEClass == null) {
			deviceUseStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(220);
		}
		return deviceUseStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_BodySite() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_WhenUsed() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Device() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Identifier() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Indication() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Notes() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_RecordedOn() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Subject() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Timingx() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScript() {
		if (testScriptEClass == null) {
			testScriptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(221);
		}
		return testScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Url() {
        return (EReference)getTestScript().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Identifier() {
        return (EReference)getTestScript().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Version() {
        return (EReference)getTestScript().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Name() {
        return (EReference)getTestScript().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Title() {
        return (EReference)getTestScript().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Status() {
        return (EReference)getTestScript().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Experimental() {
        return (EReference)getTestScript().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Publisher() {
        return (EReference)getTestScript().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Contact() {
        return (EReference)getTestScript().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Date() {
        return (EReference)getTestScript().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Description() {
        return (EReference)getTestScript().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_UseContext() {
        return (EReference)getTestScript().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Jurisdiction() {
        return (EReference)getTestScript().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Purpose() {
        return (EReference)getTestScript().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Copyright() {
        return (EReference)getTestScript().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Origin() {
        return (EReference)getTestScript().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Destination() {
        return (EReference)getTestScript().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Metadata() {
        return (EReference)getTestScript().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Fixture() {
        return (EReference)getTestScript().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Profile() {
        return (EReference)getTestScript().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Variable() {
        return (EReference)getTestScript().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Rule() {
        return (EReference)getTestScript().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Ruleset() {
        return (EReference)getTestScript().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Setup() {
        return (EReference)getTestScript().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Test() {
        return (EReference)getTestScript().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Teardown() {
        return (EReference)getTestScript().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptOrigin() {
		if (testScriptOriginEClass == null) {
			testScriptOriginEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(222);
		}
		return testScriptOriginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptOrigin_Index() {
        return (EReference)getTestScriptOrigin().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptOrigin_Profile() {
        return (EReference)getTestScriptOrigin().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptDestination() {
		if (testScriptDestinationEClass == null) {
			testScriptDestinationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(223);
		}
		return testScriptDestinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptDestination_Index() {
        return (EReference)getTestScriptDestination().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptDestination_Profile() {
        return (EReference)getTestScriptDestination().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptMetadata() {
		if (testScriptMetadataEClass == null) {
			testScriptMetadataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(224);
		}
		return testScriptMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadata_Link() {
        return (EReference)getTestScriptMetadata().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadata_Capability() {
        return (EReference)getTestScriptMetadata().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptMetadataLink() {
		if (testScriptMetadataLinkEClass == null) {
			testScriptMetadataLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(225);
		}
		return testScriptMetadataLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataLink_Url() {
        return (EReference)getTestScriptMetadataLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataLink_Description() {
        return (EReference)getTestScriptMetadataLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptMetadataCapability() {
		if (testScriptMetadataCapabilityEClass == null) {
			testScriptMetadataCapabilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(226);
		}
		return testScriptMetadataCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataCapability_Required() {
        return (EReference)getTestScriptMetadataCapability().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataCapability_Validated() {
        return (EReference)getTestScriptMetadataCapability().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataCapability_Description() {
        return (EReference)getTestScriptMetadataCapability().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataCapability_Origin() {
        return (EReference)getTestScriptMetadataCapability().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataCapability_Destination() {
        return (EReference)getTestScriptMetadataCapability().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataCapability_Link() {
        return (EReference)getTestScriptMetadataCapability().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataCapability_Capabilities() {
        return (EReference)getTestScriptMetadataCapability().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatement() {
		if (capabilityStatementEClass == null) {
			capabilityStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(227);
		}
		return capabilityStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Url() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Version() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Name() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Title() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Status() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Experimental() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Date() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Publisher() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Contact() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Description() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_UseContext() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Jurisdiction() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Purpose() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Copyright() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Kind() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Instantiates() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Software() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Implementation() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_FhirVersion() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_AcceptUnknown() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Format() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_PatchFormat() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_ImplementationGuide() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Profile() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Rest() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Messaging() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatement_Document() {
        return (EReference)getCapabilityStatement().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementSoftware() {
		if (capabilityStatementSoftwareEClass == null) {
			capabilityStatementSoftwareEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(228);
		}
		return capabilityStatementSoftwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementSoftware_Name() {
        return (EReference)getCapabilityStatementSoftware().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementSoftware_Version() {
        return (EReference)getCapabilityStatementSoftware().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementSoftware_ReleaseDate() {
        return (EReference)getCapabilityStatementSoftware().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementImplementation() {
		if (capabilityStatementImplementationEClass == null) {
			capabilityStatementImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(229);
		}
		return capabilityStatementImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementImplementation_Description() {
        return (EReference)getCapabilityStatementImplementation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementImplementation_Url() {
        return (EReference)getCapabilityStatementImplementation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementRest() {
		if (capabilityStatementRestEClass == null) {
			capabilityStatementRestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(230);
		}
		return capabilityStatementRestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRest_Mode() {
        return (EReference)getCapabilityStatementRest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRest_Documentation() {
        return (EReference)getCapabilityStatementRest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRest_Security() {
        return (EReference)getCapabilityStatementRest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRest_Resource() {
        return (EReference)getCapabilityStatementRest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRest_Interaction() {
        return (EReference)getCapabilityStatementRest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRest_SearchParam() {
        return (EReference)getCapabilityStatementRest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRest_Operation() {
        return (EReference)getCapabilityStatementRest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRest_Compartment() {
        return (EReference)getCapabilityStatementRest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementRestSecurity() {
		if (capabilityStatementRestSecurityEClass == null) {
			capabilityStatementRestSecurityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(231);
		}
		return capabilityStatementRestSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestSecurity_Cors() {
        return (EReference)getCapabilityStatementRestSecurity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestSecurity_Service() {
        return (EReference)getCapabilityStatementRestSecurity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestSecurity_Description() {
        return (EReference)getCapabilityStatementRestSecurity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestSecurity_Certificate() {
        return (EReference)getCapabilityStatementRestSecurity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementRestSecurityCertificate() {
		if (capabilityStatementRestSecurityCertificateEClass == null) {
			capabilityStatementRestSecurityCertificateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(232);
		}
		return capabilityStatementRestSecurityCertificateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestSecurityCertificate_Type() {
        return (EReference)getCapabilityStatementRestSecurityCertificate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestSecurityCertificate_Blob() {
        return (EReference)getCapabilityStatementRestSecurityCertificate().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementRestResource() {
		if (capabilityStatementRestResourceEClass == null) {
			capabilityStatementRestResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(233);
		}
		return capabilityStatementRestResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_Type() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_Profile() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_Documentation() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_Interaction() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_Versioning() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_ReadHistory() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_UpdateCreate() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_ConditionalCreate() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_ConditionalRead() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_ConditionalUpdate() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_ConditionalDelete() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_ReferencePolicy() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_SearchInclude() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_SearchRevInclude() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResource_SearchParam() {
        return (EReference)getCapabilityStatementRestResource().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementRestResourceResourceInteraction() {
		if (capabilityStatementRestResourceResourceInteractionEClass == null) {
			capabilityStatementRestResourceResourceInteractionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(234);
		}
		return capabilityStatementRestResourceResourceInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResourceResourceInteraction_Code() {
        return (EReference)getCapabilityStatementRestResourceResourceInteraction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResourceResourceInteraction_Documentation() {
        return (EReference)getCapabilityStatementRestResourceResourceInteraction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementRestResourceSearchParam() {
		if (capabilityStatementRestResourceSearchParamEClass == null) {
			capabilityStatementRestResourceSearchParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(235);
		}
		return capabilityStatementRestResourceSearchParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResourceSearchParam_Name() {
        return (EReference)getCapabilityStatementRestResourceSearchParam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResourceSearchParam_Definition() {
        return (EReference)getCapabilityStatementRestResourceSearchParam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResourceSearchParam_Type() {
        return (EReference)getCapabilityStatementRestResourceSearchParam().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestResourceSearchParam_Documentation() {
        return (EReference)getCapabilityStatementRestResourceSearchParam().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementRestSystemInteraction() {
		if (capabilityStatementRestSystemInteractionEClass == null) {
			capabilityStatementRestSystemInteractionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(236);
		}
		return capabilityStatementRestSystemInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestSystemInteraction_Code() {
        return (EReference)getCapabilityStatementRestSystemInteraction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestSystemInteraction_Documentation() {
        return (EReference)getCapabilityStatementRestSystemInteraction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementRestOperation() {
		if (capabilityStatementRestOperationEClass == null) {
			capabilityStatementRestOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(237);
		}
		return capabilityStatementRestOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestOperation_Name() {
        return (EReference)getCapabilityStatementRestOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementRestOperation_Definition() {
        return (EReference)getCapabilityStatementRestOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinition() {
		if (operationDefinitionEClass == null) {
			operationDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(238);
		}
		return operationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Url() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Version() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Name() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Status() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Kind() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Experimental() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Date() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Publisher() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Contact() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Description() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_UseContext() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Jurisdiction() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Purpose() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Idempotent() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Code() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Comment() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Base() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Resource() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_System() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Type() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Instance() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Parameter() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Overload() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinitionParameter() {
		if (operationDefinitionParameterEClass == null) {
			operationDefinitionParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(239);
		}
		return operationDefinitionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Name() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Use() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Min() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Max() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Documentation() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Type() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_SearchType() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Profile() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Binding() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Part() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinitionParameterBinding() {
		if (operationDefinitionParameterBindingEClass == null) {
			operationDefinitionParameterBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(240);
		}
		return operationDefinitionParameterBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameterBinding_Strength() {
        return (EReference)getOperationDefinitionParameterBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameterBinding_ValueSetx() {
        return (EReference)getOperationDefinitionParameterBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinitionOverload() {
		if (operationDefinitionOverloadEClass == null) {
			operationDefinitionOverloadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(241);
		}
		return operationDefinitionOverloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionOverload_ParameterName() {
        return (EReference)getOperationDefinitionOverload().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionOverload_Comment() {
        return (EReference)getOperationDefinitionOverload().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementMessaging() {
		if (capabilityStatementMessagingEClass == null) {
			capabilityStatementMessagingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(242);
		}
		return capabilityStatementMessagingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementMessaging_Endpoint() {
        return (EReference)getCapabilityStatementMessaging().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementMessaging_ReliableCache() {
        return (EReference)getCapabilityStatementMessaging().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementMessaging_Documentation() {
        return (EReference)getCapabilityStatementMessaging().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementMessaging_Event() {
        return (EReference)getCapabilityStatementMessaging().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementMessagingEndpoint() {
		if (capabilityStatementMessagingEndpointEClass == null) {
			capabilityStatementMessagingEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(243);
		}
		return capabilityStatementMessagingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementMessagingEndpoint_Protocol() {
        return (EReference)getCapabilityStatementMessagingEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementMessagingEndpoint_Address() {
        return (EReference)getCapabilityStatementMessagingEndpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementMessagingEvent() {
		if (capabilityStatementMessagingEventEClass == null) {
			capabilityStatementMessagingEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(244);
		}
		return capabilityStatementMessagingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementMessagingEvent_Code() {
        return (EReference)getCapabilityStatementMessagingEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementMessagingEvent_Category() {
        return (EReference)getCapabilityStatementMessagingEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementMessagingEvent_Mode() {
        return (EReference)getCapabilityStatementMessagingEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementMessagingEvent_Focus() {
        return (EReference)getCapabilityStatementMessagingEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementMessagingEvent_Request() {
        return (EReference)getCapabilityStatementMessagingEvent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementMessagingEvent_Response() {
        return (EReference)getCapabilityStatementMessagingEvent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementMessagingEvent_Documentation() {
        return (EReference)getCapabilityStatementMessagingEvent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityStatementDocument() {
		if (capabilityStatementDocumentEClass == null) {
			capabilityStatementDocumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(245);
		}
		return capabilityStatementDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementDocument_Mode() {
        return (EReference)getCapabilityStatementDocument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementDocument_Documentation() {
        return (EReference)getCapabilityStatementDocument().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityStatementDocument_Profile() {
        return (EReference)getCapabilityStatementDocument().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptFixture() {
		if (testScriptFixtureEClass == null) {
			testScriptFixtureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(246);
		}
		return testScriptFixtureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptFixture_Autocreate() {
        return (EReference)getTestScriptFixture().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptFixture_Autodelete() {
        return (EReference)getTestScriptFixture().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptFixture_Resource() {
        return (EReference)getTestScriptFixture().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptVariable() {
		if (testScriptVariableEClass == null) {
			testScriptVariableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(247);
		}
		return testScriptVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptVariable_Name() {
        return (EReference)getTestScriptVariable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptVariable_DefaultValue() {
        return (EReference)getTestScriptVariable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptVariable_Description() {
        return (EReference)getTestScriptVariable().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptVariable_Expression() {
        return (EReference)getTestScriptVariable().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptVariable_HeaderField() {
        return (EReference)getTestScriptVariable().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptVariable_Hint() {
        return (EReference)getTestScriptVariable().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptVariable_Path() {
        return (EReference)getTestScriptVariable().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptVariable_SourceId() {
        return (EReference)getTestScriptVariable().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptRule() {
		if (testScriptRuleEClass == null) {
			testScriptRuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(248);
		}
		return testScriptRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptRule_Resource() {
        return (EReference)getTestScriptRule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptRule_Param() {
        return (EReference)getTestScriptRule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptRuleRuleParam() {
		if (testScriptRuleRuleParamEClass == null) {
			testScriptRuleRuleParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(249);
		}
		return testScriptRuleRuleParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptRuleRuleParam_Name() {
        return (EReference)getTestScriptRuleRuleParam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptRuleRuleParam_Value() {
        return (EReference)getTestScriptRuleRuleParam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptRuleset() {
		if (testScriptRulesetEClass == null) {
			testScriptRulesetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(250);
		}
		return testScriptRulesetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptRuleset_Resource() {
        return (EReference)getTestScriptRuleset().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptRuleset_Rule() {
        return (EReference)getTestScriptRuleset().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptRulesetRulesetRule() {
		if (testScriptRulesetRulesetRuleEClass == null) {
			testScriptRulesetRulesetRuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(251);
		}
		return testScriptRulesetRulesetRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptRulesetRulesetRule_RuleId() {
        return (EReference)getTestScriptRulesetRulesetRule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptRulesetRulesetRule_Param() {
        return (EReference)getTestScriptRulesetRulesetRule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptRulesetRulesetRuleRulesetRuleParam() {
		if (testScriptRulesetRulesetRuleRulesetRuleParamEClass == null) {
			testScriptRulesetRulesetRuleRulesetRuleParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(252);
		}
		return testScriptRulesetRulesetRuleRulesetRuleParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptRulesetRulesetRuleRulesetRuleParam_Name() {
        return (EReference)getTestScriptRulesetRulesetRuleRulesetRuleParam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptRulesetRulesetRuleRulesetRuleParam_Value() {
        return (EReference)getTestScriptRulesetRulesetRuleRulesetRuleParam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetup() {
		if (testScriptSetupEClass == null) {
			testScriptSetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(253);
		}
		return testScriptSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetup_Action() {
        return (EReference)getTestScriptSetup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetupSetupAction() {
		if (testScriptSetupSetupActionEClass == null) {
			testScriptSetupSetupActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(254);
		}
		return testScriptSetupSetupActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupAction_Operation() {
        return (EReference)getTestScriptSetupSetupAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupAction_Assert() {
        return (EReference)getTestScriptSetupSetupAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetupSetupActionOperation() {
		if (testScriptSetupSetupActionOperationEClass == null) {
			testScriptSetupSetupActionOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(255);
		}
		return testScriptSetupSetupActionOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_Type() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_Resource() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_Label() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_Description() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_Accept() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_ContentType() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_Destination() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_EncodeRequestUrl() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_Origin() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_Params() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_RequestHeader() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_RequestId() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_ResponseId() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_SourceId() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_TargetId() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperation_Url() {
        return (EReference)getTestScriptSetupSetupActionOperation().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetupSetupActionOperationRequestHeader() {
		if (testScriptSetupSetupActionOperationRequestHeaderEClass == null) {
			testScriptSetupSetupActionOperationRequestHeaderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(256);
		}
		return testScriptSetupSetupActionOperationRequestHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperationRequestHeader_Field() {
        return (EReference)getTestScriptSetupSetupActionOperationRequestHeader().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionOperationRequestHeader_Value() {
        return (EReference)getTestScriptSetupSetupActionOperationRequestHeader().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetupSetupActionAssert() {
		if (testScriptSetupSetupActionAssertEClass == null) {
			testScriptSetupSetupActionAssertEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(257);
		}
		return testScriptSetupSetupActionAssertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_Label() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_Description() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_Direction() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_CompareToSourceId() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_CompareToSourceExpression() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_CompareToSourcePath() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_ContentType() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_Expression() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_HeaderField() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_MinimumId() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_NavigationLinks() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_Operator() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_Path() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_RequestUrl() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_Resource() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_Response() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_ResponseCode() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_Rule() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_Ruleset() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_SourceId() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_ValidateProfileId() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_Value() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssert_WarningOnly() {
        return (EReference)getTestScriptSetupSetupActionAssert().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetupSetupActionAssertActionAssertRule() {
		if (testScriptSetupSetupActionAssertActionAssertRuleEClass == null) {
			testScriptSetupSetupActionAssertActionAssertRuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(258);
		}
		return testScriptSetupSetupActionAssertActionAssertRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssertActionAssertRule_RuleId() {
        return (EReference)getTestScriptSetupSetupActionAssertActionAssertRule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssertActionAssertRule_Param() {
        return (EReference)getTestScriptSetupSetupActionAssertActionAssertRule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam() {
		if (testScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParamEClass == null) {
			testScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(259);
		}
		return testScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam_Name() {
        return (EReference)getTestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam_Value() {
        return (EReference)getTestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetupSetupActionAssertActionAssertRuleset() {
		if (testScriptSetupSetupActionAssertActionAssertRulesetEClass == null) {
			testScriptSetupSetupActionAssertActionAssertRulesetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(260);
		}
		return testScriptSetupSetupActionAssertActionAssertRulesetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssertActionAssertRuleset_RulesetId() {
        return (EReference)getTestScriptSetupSetupActionAssertActionAssertRuleset().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssertActionAssertRuleset_Rule() {
        return (EReference)getTestScriptSetupSetupActionAssertActionAssertRuleset().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule() {
		if (testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleEClass == null) {
			testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(261);
		}
		return testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule_RuleId() {
        return (EReference)getTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule_Param() {
        return (EReference)getTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam() {
		if (testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParamEClass == null) {
			testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(262);
		}
		return testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam_Name() {
        return (EReference)getTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam_Value() {
        return (EReference)getTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptTest() {
		if (testScriptTestEClass == null) {
			testScriptTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(263);
		}
		return testScriptTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTest_Name() {
        return (EReference)getTestScriptTest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTest_Description() {
        return (EReference)getTestScriptTest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTest_Action() {
        return (EReference)getTestScriptTest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptTestTestAction() {
		if (testScriptTestTestActionEClass == null) {
			testScriptTestTestActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(264);
		}
		return testScriptTestTestActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTestTestAction_Operation() {
        return (EReference)getTestScriptTestTestAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTestTestAction_Assert() {
        return (EReference)getTestScriptTestTestAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptTeardown() {
		if (testScriptTeardownEClass == null) {
			testScriptTeardownEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(265);
		}
		return testScriptTeardownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTeardown_Action() {
        return (EReference)getTestScriptTeardown().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptTeardownTeardownAction() {
		if (testScriptTeardownTeardownActionEClass == null) {
			testScriptTeardownTeardownActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(266);
		}
		return testScriptTeardownTeardownActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTeardownTeardownAction_Operation() {
        return (EReference)getTestScriptTeardownTeardownAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElement() {
		if (dataElementEClass == null) {
			dataElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(267);
		}
		return dataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Url() {
        return (EReference)getDataElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Identifier() {
        return (EReference)getDataElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Version() {
        return (EReference)getDataElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Status() {
        return (EReference)getDataElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Experimental() {
        return (EReference)getDataElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Publisher() {
        return (EReference)getDataElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Date() {
        return (EReference)getDataElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Name() {
        return (EReference)getDataElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Title() {
        return (EReference)getDataElement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Contact() {
        return (EReference)getDataElement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_UseContext() {
        return (EReference)getDataElement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Jurisdiction() {
        return (EReference)getDataElement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Copyright() {
        return (EReference)getDataElement().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Stringency() {
        return (EReference)getDataElement().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Mapping() {
        return (EReference)getDataElement().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Element() {
        return (EReference)getDataElement().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElementMapping() {
		if (dataElementMappingEClass == null) {
			dataElementMappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(268);
		}
		return dataElementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementMapping_Identity() {
        return (EReference)getDataElementMapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementMapping_Uri() {
        return (EReference)getDataElementMapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementMapping_Name() {
        return (EReference)getDataElementMapping().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementMapping_Comment() {
        return (EReference)getDataElementMapping().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageHeader() {
		if (messageHeaderEClass == null) {
			messageHeaderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(269);
		}
		return messageHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Timestamp() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Event() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Response() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Source() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Destination() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Enterer() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Author() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Receiver() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Responsible() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Reason() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Data() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageHeaderResponse() {
		if (messageHeaderResponseEClass == null) {
			messageHeaderResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(270);
		}
		return messageHeaderResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderResponse_Identifier() {
        return (EReference)getMessageHeaderResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderResponse_Code() {
        return (EReference)getMessageHeaderResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderResponse_Details() {
        return (EReference)getMessageHeaderResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationOutcome() {
		if (operationOutcomeEClass == null) {
			operationOutcomeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(271);
		}
		return operationOutcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcome_Issue() {
        return (EReference)getOperationOutcome().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationOutcomeIssue() {
		if (operationOutcomeIssueEClass == null) {
			operationOutcomeIssueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(272);
		}
		return operationOutcomeIssueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Severity() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Code() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Details() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Diagnostics() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Location() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Expression() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageHeaderMessageSource() {
		if (messageHeaderMessageSourceEClass == null) {
			messageHeaderMessageSourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(273);
		}
		return messageHeaderMessageSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageSource_Name() {
        return (EReference)getMessageHeaderMessageSource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageSource_Software() {
        return (EReference)getMessageHeaderMessageSource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageSource_Version() {
        return (EReference)getMessageHeaderMessageSource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageSource_Contact() {
        return (EReference)getMessageHeaderMessageSource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageSource_Endpoint() {
        return (EReference)getMessageHeaderMessageSource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageHeaderMessageDestination() {
		if (messageHeaderMessageDestinationEClass == null) {
			messageHeaderMessageDestinationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(274);
		}
		return messageHeaderMessageDestinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageDestination_Name() {
        return (EReference)getMessageHeaderMessageDestination().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageDestination_Target() {
        return (EReference)getMessageHeaderMessageDestination().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageDestination_Endpoint() {
        return (EReference)getMessageHeaderMessageDestination().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscription() {
		if (subscriptionEClass == null) {
			subscriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(275);
		}
		return subscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Criteria() {
        return (EReference)getSubscription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Contact() {
        return (EReference)getSubscription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Reason() {
        return (EReference)getSubscription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Status() {
        return (EReference)getSubscription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Error() {
        return (EReference)getSubscription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Channel() {
        return (EReference)getSubscription().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_End() {
        return (EReference)getSubscription().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Tag() {
        return (EReference)getSubscription().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscriptionChannel() {
		if (subscriptionChannelEClass == null) {
			subscriptionChannelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(276);
		}
		return subscriptionChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionChannel_Type() {
        return (EReference)getSubscriptionChannel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionChannel_Endpoint() {
        return (EReference)getSubscriptionChannel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionChannel_Payload() {
        return (EReference)getSubscriptionChannel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionChannel_Header() {
        return (EReference)getSubscriptionChannel().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodySite() {
		if (bodySiteEClass == null) {
			bodySiteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(277);
		}
		return bodySiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Patient() {
        return (EReference)getBodySite().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Identifier() {
        return (EReference)getBodySite().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Code() {
        return (EReference)getBodySite().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Modifier() {
        return (EReference)getBodySite().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Description() {
        return (EReference)getBodySite().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Image() {
        return (EReference)getBodySite().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDefinition() {
		if (serviceDefinitionEClass == null) {
			serviceDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(278);
		}
		return serviceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Url() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Identifier() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Version() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Name() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Title() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Status() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Experimental() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Date() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Description() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Purpose() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Usage() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_ApprovalDate() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_LastReviewDate() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_EffectivePeriod() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_UseContext() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Jurisdiction() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Topic() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Contributor() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Publisher() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Contact() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Copyright() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_RelatedArtifact() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_Trigger() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_DataRequirement() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefinition_OperationDefinition() {
        return (EReference)getServiceDefinition().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnrollmentResponse() {
		if (enrollmentResponseEClass == null) {
			enrollmentResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(279);
		}
		return enrollmentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Identifier() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Status() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Request() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Outcome() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Disposition() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Created() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Organization() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_RequestProvider() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_RequestOrganization() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnrollmentRequest() {
		if (enrollmentRequestEClass == null) {
			enrollmentRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(280);
		}
		return enrollmentRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Identifier() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Status() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Created() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Insurer() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Provider() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Organization() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Subject() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Coverage() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRecommendation() {
		if (immunizationRecommendationEClass == null) {
			immunizationRecommendationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(281);
		}
		return immunizationRecommendationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendation_Identifier() {
        return (EReference)getImmunizationRecommendation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendation_Patient() {
        return (EReference)getImmunizationRecommendation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendation_Recommendation() {
        return (EReference)getImmunizationRecommendation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRecommendationRecommendation() {
		if (immunizationRecommendationRecommendationEClass == null) {
			immunizationRecommendationRecommendationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(282);
		}
		return immunizationRecommendationRecommendationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_Date() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_VaccineCode() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_DoseNumber() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_ForecastStatus() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_DateCriterion() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_Protocol() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_SupportingImmunization() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_SupportingPatientInformation() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRecommendationRecommendationDateCriterion() {
		if (immunizationRecommendationRecommendationDateCriterionEClass == null) {
			immunizationRecommendationRecommendationDateCriterionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(283);
		}
		return immunizationRecommendationRecommendationDateCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendationDateCriterion_Code() {
        return (EReference)getImmunizationRecommendationRecommendationDateCriterion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendationDateCriterion_Value() {
        return (EReference)getImmunizationRecommendationRecommendationDateCriterion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRecommendationRecommendationProtocol() {
		if (immunizationRecommendationRecommendationProtocolEClass == null) {
			immunizationRecommendationRecommendationProtocolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(284);
		}
		return immunizationRecommendationRecommendationProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendationProtocol_DoseSequence() {
        return (EReference)getImmunizationRecommendationRecommendationProtocol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendationProtocol_Description() {
        return (EReference)getImmunizationRecommendationRecommendationProtocol().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendationProtocol_Authority() {
        return (EReference)getImmunizationRecommendationRecommendationProtocol().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendationProtocol_Series() {
        return (EReference)getImmunizationRecommendationRecommendationProtocol().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunization() {
		if (immunizationEClass == null) {
			immunizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(285);
		}
		return immunizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Identifier() {
        return (EReference)getImmunization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Status() {
        return (EReference)getImmunization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Date() {
        return (EReference)getImmunization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_VaccineCode() {
        return (EReference)getImmunization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Patient() {
        return (EReference)getImmunization().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_WasNotGiven() {
        return (EReference)getImmunization().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_PrimarySource() {
        return (EReference)getImmunization().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_ReportOrigin() {
        return (EReference)getImmunization().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Performer() {
        return (EReference)getImmunization().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Requester() {
        return (EReference)getImmunization().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Encounter() {
        return (EReference)getImmunization().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Manufacturer() {
        return (EReference)getImmunization().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Location() {
        return (EReference)getImmunization().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_LotNumber() {
        return (EReference)getImmunization().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_ExpirationDate() {
        return (EReference)getImmunization().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Site() {
        return (EReference)getImmunization().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Route() {
        return (EReference)getImmunization().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_DoseQuantity() {
        return (EReference)getImmunization().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Note() {
        return (EReference)getImmunization().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Explanation() {
        return (EReference)getImmunization().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Reaction() {
        return (EReference)getImmunization().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_VaccinationProtocol() {
        return (EReference)getImmunization().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationExplanation() {
		if (immunizationExplanationEClass == null) {
			immunizationExplanationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(286);
		}
		return immunizationExplanationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationExplanation_Reason() {
        return (EReference)getImmunizationExplanation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationExplanation_ReasonNotGiven() {
        return (EReference)getImmunizationExplanation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationReaction() {
		if (immunizationReactionEClass == null) {
			immunizationReactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(287);
		}
		return immunizationReactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationReaction_Date() {
        return (EReference)getImmunizationReaction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationReaction_Detail() {
        return (EReference)getImmunizationReaction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationReaction_Reported() {
        return (EReference)getImmunizationReaction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationVaccinationProtocol() {
		if (immunizationVaccinationProtocolEClass == null) {
			immunizationVaccinationProtocolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(288);
		}
		return immunizationVaccinationProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_DoseSequence() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_Description() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_Authority() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_Series() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_SeriesDoses() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_TargetDisease() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_DoseStatus() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_DoseStatusReason() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundle() {
		if (bundleEClass == null) {
			bundleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(289);
		}
		return bundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Type() {
        return (EReference)getBundle().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Identifier() {
        return (EReference)getBundle().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Total() {
        return (EReference)getBundle().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Link() {
        return (EReference)getBundle().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Entry() {
        return (EReference)getBundle().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Signature() {
        return (EReference)getBundle().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleLink() {
		if (bundleLinkEClass == null) {
			bundleLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(290);
		}
		return bundleLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleLink_Relation() {
        return (EReference)getBundleLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleLink_Url() {
        return (EReference)getBundleLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleEntry() {
		if (bundleEntryEClass == null) {
			bundleEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(291);
		}
		return bundleEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Link() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_FullUrl() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Resource() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Search() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Request() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Response() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleEntrySearch() {
		if (bundleEntrySearchEClass == null) {
			bundleEntrySearchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(292);
		}
		return bundleEntrySearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntrySearch_Mode() {
        return (EReference)getBundleEntrySearch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntrySearch_Score() {
        return (EReference)getBundleEntrySearch().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleEntryRequest() {
		if (bundleEntryRequestEClass == null) {
			bundleEntryRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(293);
		}
		return bundleEntryRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryRequest_Method() {
        return (EReference)getBundleEntryRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryRequest_Url() {
        return (EReference)getBundleEntryRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryRequest_IfNoneMatch() {
        return (EReference)getBundleEntryRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryRequest_IfModifiedSince() {
        return (EReference)getBundleEntryRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryRequest_IfMatch() {
        return (EReference)getBundleEntryRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryRequest_IfNoneExist() {
        return (EReference)getBundleEntryRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleEntryResponse() {
		if (bundleEntryResponseEClass == null) {
			bundleEntryResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(294);
		}
		return bundleEntryResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryResponse_Status() {
        return (EReference)getBundleEntryResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryResponse_Location() {
        return (EReference)getBundleEntryResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryResponse_Etag() {
        return (EReference)getBundleEntryResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryResponse_LastModified() {
        return (EReference)getBundleEntryResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryResponse_Outcome() {
        return (EReference)getBundleEntryResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestReport() {
		if (testReportEClass == null) {
			testReportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(295);
		}
		return testReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReport_Identifier() {
        return (EReference)getTestReport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReport_Name() {
        return (EReference)getTestReport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReport_Status() {
        return (EReference)getTestReport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReport_Score() {
        return (EReference)getTestReport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReport_Tester() {
        return (EReference)getTestReport().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReport_TestScript() {
        return (EReference)getTestReport().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReport_Issued() {
        return (EReference)getTestReport().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReport_Participant() {
        return (EReference)getTestReport().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReport_Setup() {
        return (EReference)getTestReport().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReport_Test() {
        return (EReference)getTestReport().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReport_Teardown() {
        return (EReference)getTestReport().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestReportParticipant() {
		if (testReportParticipantEClass == null) {
			testReportParticipantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(296);
		}
		return testReportParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportParticipant_Type() {
        return (EReference)getTestReportParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportParticipant_Uri() {
        return (EReference)getTestReportParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportParticipant_Display() {
        return (EReference)getTestReportParticipant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestReportSetup() {
		if (testReportSetupEClass == null) {
			testReportSetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(297);
		}
		return testReportSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportSetup_Action() {
        return (EReference)getTestReportSetup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestReportSetupSetupAction() {
		if (testReportSetupSetupActionEClass == null) {
			testReportSetupSetupActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(298);
		}
		return testReportSetupSetupActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportSetupSetupAction_Operation() {
        return (EReference)getTestReportSetupSetupAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportSetupSetupAction_Assert() {
        return (EReference)getTestReportSetupSetupAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestReportSetupSetupActionOperation() {
		if (testReportSetupSetupActionOperationEClass == null) {
			testReportSetupSetupActionOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(299);
		}
		return testReportSetupSetupActionOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportSetupSetupActionOperation_Result() {
        return (EReference)getTestReportSetupSetupActionOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportSetupSetupActionOperation_Message() {
        return (EReference)getTestReportSetupSetupActionOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportSetupSetupActionOperation_Detail() {
        return (EReference)getTestReportSetupSetupActionOperation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestReportSetupSetupActionAssert() {
		if (testReportSetupSetupActionAssertEClass == null) {
			testReportSetupSetupActionAssertEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(300);
		}
		return testReportSetupSetupActionAssertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportSetupSetupActionAssert_Result() {
        return (EReference)getTestReportSetupSetupActionAssert().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportSetupSetupActionAssert_Message() {
        return (EReference)getTestReportSetupSetupActionAssert().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportSetupSetupActionAssert_Detail() {
        return (EReference)getTestReportSetupSetupActionAssert().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestReportTest() {
		if (testReportTestEClass == null) {
			testReportTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(301);
		}
		return testReportTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportTest_Name() {
        return (EReference)getTestReportTest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportTest_Description() {
        return (EReference)getTestReportTest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportTest_Action() {
        return (EReference)getTestReportTest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestReportTestTestAction() {
		if (testReportTestTestActionEClass == null) {
			testReportTestTestActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(302);
		}
		return testReportTestTestActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportTestTestAction_Operation() {
        return (EReference)getTestReportTestTestAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportTestTestAction_Assert() {
        return (EReference)getTestReportTestTestAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestReportTeardown() {
		if (testReportTeardownEClass == null) {
			testReportTeardownEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(303);
		}
		return testReportTeardownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportTeardown_Action() {
        return (EReference)getTestReportTeardown().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestReportTeardownTeardownAction() {
		if (testReportTeardownTeardownActionEClass == null) {
			testReportTeardownTeardownActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(304);
		}
		return testReportTeardownTeardownActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestReportTeardownTeardownAction_Operation() {
        return (EReference)getTestReportTeardownTeardownAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEligibilityResponse() {
		if (eligibilityResponseEClass == null) {
			eligibilityResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(305);
		}
		return eligibilityResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Identifier() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Status() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Created() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_RequestProvider() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_RequestOrganization() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Request() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Outcome() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Disposition() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Insurer() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Inforce() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Insurance() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Form() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Error() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEligibilityRequest() {
		if (eligibilityRequestEClass == null) {
			eligibilityRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(306);
		}
		return eligibilityRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Identifier() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Status() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Priority() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Patient() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Servicedx() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Created() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Enterer() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Provider() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Organization() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Insurer() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Facility() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Coverage() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_BusinessArrangement() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_BenefitCategory() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_BenefitSubCategory() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEligibilityResponseInsurance() {
		if (eligibilityResponseInsuranceEClass == null) {
			eligibilityResponseInsuranceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(307);
		}
		return eligibilityResponseInsuranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsurance_Coverage() {
        return (EReference)getEligibilityResponseInsurance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsurance_Contract() {
        return (EReference)getEligibilityResponseInsurance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsurance_BenefitBalance() {
        return (EReference)getEligibilityResponseInsurance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEligibilityResponseInsuranceBenefits() {
		if (eligibilityResponseInsuranceBenefitsEClass == null) {
			eligibilityResponseInsuranceBenefitsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(308);
		}
		return eligibilityResponseInsuranceBenefitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsuranceBenefits_Category() {
        return (EReference)getEligibilityResponseInsuranceBenefits().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsuranceBenefits_SubCategory() {
        return (EReference)getEligibilityResponseInsuranceBenefits().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsuranceBenefits_Excluded() {
        return (EReference)getEligibilityResponseInsuranceBenefits().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsuranceBenefits_Name() {
        return (EReference)getEligibilityResponseInsuranceBenefits().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsuranceBenefits_Description() {
        return (EReference)getEligibilityResponseInsuranceBenefits().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsuranceBenefits_Network() {
        return (EReference)getEligibilityResponseInsuranceBenefits().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsuranceBenefits_Unit() {
        return (EReference)getEligibilityResponseInsuranceBenefits().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsuranceBenefits_Term() {
        return (EReference)getEligibilityResponseInsuranceBenefits().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsuranceBenefits_Financial() {
        return (EReference)getEligibilityResponseInsuranceBenefits().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEligibilityResponseInsuranceBenefitsBenefit() {
		if (eligibilityResponseInsuranceBenefitsBenefitEClass == null) {
			eligibilityResponseInsuranceBenefitsBenefitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(309);
		}
		return eligibilityResponseInsuranceBenefitsBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsuranceBenefitsBenefit_Type() {
        return (EReference)getEligibilityResponseInsuranceBenefitsBenefit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsuranceBenefitsBenefit_Benefitx() {
        return (EReference)getEligibilityResponseInsuranceBenefitsBenefit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseInsuranceBenefitsBenefit_BenefitUsedx() {
        return (EReference)getEligibilityResponseInsuranceBenefitsBenefit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEligibilityResponseErrors() {
		if (eligibilityResponseErrorsEClass == null) {
			eligibilityResponseErrorsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(310);
		}
		return eligibilityResponseErrorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponseErrors_Code() {
        return (EReference)getEligibilityResponseErrors().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameters() {
		if (parametersEClass == null) {
			parametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(311);
		}
		return parametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameters_Parameter() {
        return (EReference)getParameters().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametersParameter() {
		if (parametersParameterEClass == null) {
			parametersParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(312);
		}
		return parametersParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_Name() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_Valuex() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_Resource() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_Part() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationDispense() {
		if (medicationDispenseEClass == null) {
			medicationDispenseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(313);
		}
		return medicationDispenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Identifier() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Status() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Medicationx() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Patient() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_SupportingInformation() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Dispenser() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_DispensingOrganization() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_AuthorizingPrescription() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Type() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Quantity() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_DaysSupply() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_WhenPrepared() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_WhenHandedOver() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Destination() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Receiver() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Note() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_DosageInstruction() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Substitution() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_EventHistory() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationDispenseSubstitution() {
		if (medicationDispenseSubstitutionEClass == null) {
			medicationDispenseSubstitutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(314);
		}
		return medicationDispenseSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseSubstitution_Type() {
        return (EReference)getMedicationDispenseSubstitution().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseSubstitution_Reason() {
        return (EReference)getMedicationDispenseSubstitution().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseSubstitution_ResponsibleParty() {
        return (EReference)getMedicationDispenseSubstitution().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureReport() {
		if (measureReportEClass == null) {
			measureReportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(315);
		}
		return measureReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReport_Measure() {
        return (EReference)getMeasureReport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReport_Type() {
        return (EReference)getMeasureReport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReport_Patient() {
        return (EReference)getMeasureReport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReport_Period() {
        return (EReference)getMeasureReport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReport_Status() {
        return (EReference)getMeasureReport().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReport_Date() {
        return (EReference)getMeasureReport().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReport_ReportingOrganization() {
        return (EReference)getMeasureReport().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReport_Group() {
        return (EReference)getMeasureReport().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReport_EvaluatedResources() {
        return (EReference)getMeasureReport().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasure() {
		if (measureEClass == null) {
			measureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(316);
		}
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Url() {
        return (EReference)getMeasure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Identifier() {
        return (EReference)getMeasure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Version() {
        return (EReference)getMeasure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Name() {
        return (EReference)getMeasure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Title() {
        return (EReference)getMeasure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Status() {
        return (EReference)getMeasure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Experimental() {
        return (EReference)getMeasure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Date() {
        return (EReference)getMeasure().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Description() {
        return (EReference)getMeasure().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Purpose() {
        return (EReference)getMeasure().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Usage() {
        return (EReference)getMeasure().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_ApprovalDate() {
        return (EReference)getMeasure().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_LastReviewDate() {
        return (EReference)getMeasure().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_EffectivePeriod() {
        return (EReference)getMeasure().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_UseContext() {
        return (EReference)getMeasure().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Jurisdiction() {
        return (EReference)getMeasure().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Topic() {
        return (EReference)getMeasure().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Contributor() {
        return (EReference)getMeasure().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Publisher() {
        return (EReference)getMeasure().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Contact() {
        return (EReference)getMeasure().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Copyright() {
        return (EReference)getMeasure().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_RelatedArtifact() {
        return (EReference)getMeasure().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Library() {
        return (EReference)getMeasure().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Disclaimer() {
        return (EReference)getMeasure().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Scoring() {
        return (EReference)getMeasure().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_CompositeScoring() {
        return (EReference)getMeasure().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Type() {
        return (EReference)getMeasure().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_RiskAdjustment() {
        return (EReference)getMeasure().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_RateAggregation() {
        return (EReference)getMeasure().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Rationale() {
        return (EReference)getMeasure().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_ClinicalRecommendationStatement() {
        return (EReference)getMeasure().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_ImprovementNotation() {
        return (EReference)getMeasure().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Definition() {
        return (EReference)getMeasure().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Guidance() {
        return (EReference)getMeasure().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Set() {
        return (EReference)getMeasure().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Group() {
        return (EReference)getMeasure().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_SupplementalData() {
        return (EReference)getMeasure().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureGroup() {
		if (measureGroupEClass == null) {
			measureGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(317);
		}
		return measureGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureGroup_Identifier() {
        return (EReference)getMeasureGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureGroup_Name() {
        return (EReference)getMeasureGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureGroup_Description() {
        return (EReference)getMeasureGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureGroup_Population() {
        return (EReference)getMeasureGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureGroup_Stratifier() {
        return (EReference)getMeasureGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureGroupPopulation() {
		if (measureGroupPopulationEClass == null) {
			measureGroupPopulationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(318);
		}
		return measureGroupPopulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureGroupPopulation_Type() {
        return (EReference)getMeasureGroupPopulation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureGroupPopulation_Identifier() {
        return (EReference)getMeasureGroupPopulation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureGroupPopulation_Name() {
        return (EReference)getMeasureGroupPopulation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureGroupPopulation_Description() {
        return (EReference)getMeasureGroupPopulation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureGroupPopulation_Criteria() {
        return (EReference)getMeasureGroupPopulation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureGroupStratifier() {
		if (measureGroupStratifierEClass == null) {
			measureGroupStratifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(319);
		}
		return measureGroupStratifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureGroupStratifier_Identifier() {
        return (EReference)getMeasureGroupStratifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureGroupStratifier_Criteria() {
        return (EReference)getMeasureGroupStratifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureGroupStratifier_Path() {
        return (EReference)getMeasureGroupStratifier().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureSupplementalData() {
		if (measureSupplementalDataEClass == null) {
			measureSupplementalDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(320);
		}
		return measureSupplementalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureSupplementalData_Identifier() {
        return (EReference)getMeasureSupplementalData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureSupplementalData_Usage() {
        return (EReference)getMeasureSupplementalData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureSupplementalData_Criteria() {
        return (EReference)getMeasureSupplementalData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureSupplementalData_Path() {
        return (EReference)getMeasureSupplementalData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureReportGroup() {
		if (measureReportGroupEClass == null) {
			measureReportGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(321);
		}
		return measureReportGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroup_Identifier() {
        return (EReference)getMeasureReportGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroup_Population() {
        return (EReference)getMeasureReportGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroup_MeasureScore() {
        return (EReference)getMeasureReportGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroup_Stratifier() {
        return (EReference)getMeasureReportGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroup_SupplementalData() {
        return (EReference)getMeasureReportGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureReportGroupPopulation() {
		if (measureReportGroupPopulationEClass == null) {
			measureReportGroupPopulationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(322);
		}
		return measureReportGroupPopulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupPopulation_Type() {
        return (EReference)getMeasureReportGroupPopulation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupPopulation_Count() {
        return (EReference)getMeasureReportGroupPopulation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupPopulation_Patients() {
        return (EReference)getMeasureReportGroupPopulation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		if (listEClass == null) {
			listEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(323);
		}
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Identifier() {
        return (EReference)getList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Status() {
        return (EReference)getList().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Mode() {
        return (EReference)getList().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Title() {
        return (EReference)getList().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Code() {
        return (EReference)getList().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Subject() {
        return (EReference)getList().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Encounter() {
        return (EReference)getList().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Date() {
        return (EReference)getList().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Source() {
        return (EReference)getList().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_OrderedBy() {
        return (EReference)getList().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Note() {
        return (EReference)getList().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Entry() {
        return (EReference)getList().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_EmptyReason() {
        return (EReference)getList().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListEntry() {
		if (listEntryEClass == null) {
			listEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(324);
		}
		return listEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntry_Flag() {
        return (EReference)getListEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntry_Deleted() {
        return (EReference)getListEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntry_Date() {
        return (EReference)getListEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntry_Item() {
        return (EReference)getListEntry().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureReportGroupStratifier() {
		if (measureReportGroupStratifierEClass == null) {
			measureReportGroupStratifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(325);
		}
		return measureReportGroupStratifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupStratifier_Identifier() {
        return (EReference)getMeasureReportGroupStratifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupStratifier_Group() {
        return (EReference)getMeasureReportGroupStratifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureReportGroupStratifierStratifierGroup() {
		if (measureReportGroupStratifierStratifierGroupEClass == null) {
			measureReportGroupStratifierStratifierGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(326);
		}
		return measureReportGroupStratifierStratifierGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupStratifierStratifierGroup_Value() {
        return (EReference)getMeasureReportGroupStratifierStratifierGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupStratifierStratifierGroup_Population() {
        return (EReference)getMeasureReportGroupStratifierStratifierGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupStratifierStratifierGroup_MeasureScore() {
        return (EReference)getMeasureReportGroupStratifierStratifierGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation() {
		if (measureReportGroupStratifierStratifierGroupStratifierGroupPopulationEClass == null) {
			measureReportGroupStratifierStratifierGroupStratifierGroupPopulationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(327);
		}
		return measureReportGroupStratifierStratifierGroupStratifierGroupPopulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation_Type() {
        return (EReference)getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation_Count() {
        return (EReference)getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation_Patients() {
        return (EReference)getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureReportGroupSupplementalData() {
		if (measureReportGroupSupplementalDataEClass == null) {
			measureReportGroupSupplementalDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(328);
		}
		return measureReportGroupSupplementalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupSupplementalData_Identifier() {
        return (EReference)getMeasureReportGroupSupplementalData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupSupplementalData_Group() {
        return (EReference)getMeasureReportGroupSupplementalData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureReportGroupSupplementalDataSupplementalDataGroup() {
		if (measureReportGroupSupplementalDataSupplementalDataGroupEClass == null) {
			measureReportGroupSupplementalDataSupplementalDataGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(329);
		}
		return measureReportGroupSupplementalDataSupplementalDataGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupSupplementalDataSupplementalDataGroup_Value() {
        return (EReference)getMeasureReportGroupSupplementalDataSupplementalDataGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupSupplementalDataSupplementalDataGroup_Count() {
        return (EReference)getMeasureReportGroupSupplementalDataSupplementalDataGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureReportGroupSupplementalDataSupplementalDataGroup_Patients() {
        return (EReference)getMeasureReportGroupSupplementalDataSupplementalDataGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponse() {
		if (claimResponseEClass == null) {
			claimResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(330);
		}
		return claimResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Identifier() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Status() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Created() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Insurer() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_RequestProvider() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_RequestOrganization() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Request() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Outcome() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Disposition() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_PayeeType() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Item() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_AddItem() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Error() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_TotalCost() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_UnallocDeductable() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_TotalBenefit() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Payment() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Reserved() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Form() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Note() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_CommunicationRequest() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Insurance() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaim() {
		if (claimEClass == null) {
			claimEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(331);
		}
		return claimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Identifier() {
        return (EReference)getClaim().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Status() {
        return (EReference)getClaim().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Type() {
        return (EReference)getClaim().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_SubType() {
        return (EReference)getClaim().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Use() {
        return (EReference)getClaim().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Patient() {
        return (EReference)getClaim().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_BillablePeriod() {
        return (EReference)getClaim().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Created() {
        return (EReference)getClaim().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Enterer() {
        return (EReference)getClaim().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Insurer() {
        return (EReference)getClaim().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Provider() {
        return (EReference)getClaim().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Organization() {
        return (EReference)getClaim().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Priority() {
        return (EReference)getClaim().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_FundsReserve() {
        return (EReference)getClaim().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Related() {
        return (EReference)getClaim().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Prescription() {
        return (EReference)getClaim().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_OriginalPrescription() {
        return (EReference)getClaim().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Payee() {
        return (EReference)getClaim().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Referral() {
        return (EReference)getClaim().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Facility() {
        return (EReference)getClaim().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_CareTeam() {
        return (EReference)getClaim().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Information() {
        return (EReference)getClaim().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Diagnosis() {
        return (EReference)getClaim().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Procedure() {
        return (EReference)getClaim().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Insurance() {
        return (EReference)getClaim().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Accident() {
        return (EReference)getClaim().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_EmploymentImpacted() {
        return (EReference)getClaim().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Hospitalization() {
        return (EReference)getClaim().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Item() {
        return (EReference)getClaim().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Total() {
        return (EReference)getClaim().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimRelatedClaim() {
		if (claimRelatedClaimEClass == null) {
			claimRelatedClaimEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(332);
		}
		return claimRelatedClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimRelatedClaim_Claim() {
        return (EReference)getClaimRelatedClaim().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimRelatedClaim_Relationship() {
        return (EReference)getClaimRelatedClaim().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimRelatedClaim_Reference() {
        return (EReference)getClaimRelatedClaim().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimPayee() {
		if (claimPayeeEClass == null) {
			claimPayeeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(333);
		}
		return claimPayeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimPayee_Type() {
        return (EReference)getClaimPayee().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimPayee_ResourceType() {
        return (EReference)getClaimPayee().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimPayee_Party() {
        return (EReference)getClaimPayee().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimCareTeam() {
		if (claimCareTeamEClass == null) {
			claimCareTeamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(334);
		}
		return claimCareTeamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCareTeam_Sequence() {
        return (EReference)getClaimCareTeam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCareTeam_Provider() {
        return (EReference)getClaimCareTeam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCareTeam_Responsible() {
        return (EReference)getClaimCareTeam().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCareTeam_Role() {
        return (EReference)getClaimCareTeam().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCareTeam_Qualification() {
        return (EReference)getClaimCareTeam().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimSpecialCondition() {
		if (claimSpecialConditionEClass == null) {
			claimSpecialConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(335);
		}
		return claimSpecialConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSpecialCondition_Category() {
        return (EReference)getClaimSpecialCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSpecialCondition_Code() {
        return (EReference)getClaimSpecialCondition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSpecialCondition_Timingx() {
        return (EReference)getClaimSpecialCondition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSpecialCondition_Valuex() {
        return (EReference)getClaimSpecialCondition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSpecialCondition_Reason() {
        return (EReference)getClaimSpecialCondition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimDiagnosis() {
		if (claimDiagnosisEClass == null) {
			claimDiagnosisEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(336);
		}
		return claimDiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDiagnosis_Sequence() {
        return (EReference)getClaimDiagnosis().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDiagnosis_Diagnosisx() {
        return (EReference)getClaimDiagnosis().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDiagnosis_Type() {
        return (EReference)getClaimDiagnosis().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDiagnosis_PackageCode() {
        return (EReference)getClaimDiagnosis().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimProcedure() {
		if (claimProcedureEClass == null) {
			claimProcedureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(337);
		}
		return claimProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimProcedure_Sequence() {
        return (EReference)getClaimProcedure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimProcedure_Date() {
        return (EReference)getClaimProcedure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimProcedure_Procedurex() {
        return (EReference)getClaimProcedure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimInsurance() {
		if (claimInsuranceEClass == null) {
			claimInsuranceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(338);
		}
		return claimInsuranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimInsurance_Sequence() {
        return (EReference)getClaimInsurance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimInsurance_Focal() {
        return (EReference)getClaimInsurance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimInsurance_Coverage() {
        return (EReference)getClaimInsurance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimInsurance_BusinessArrangement() {
        return (EReference)getClaimInsurance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimInsurance_PreAuthRef() {
        return (EReference)getClaimInsurance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimInsurance_ClaimResponse() {
        return (EReference)getClaimInsurance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimAccident() {
		if (claimAccidentEClass == null) {
			claimAccidentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(339);
		}
		return claimAccidentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimAccident_Date() {
        return (EReference)getClaimAccident().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimAccident_Type() {
        return (EReference)getClaimAccident().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimAccident_Locationx() {
        return (EReference)getClaimAccident().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimItem() {
		if (claimItemEClass == null) {
			claimItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(340);
		}
		return claimItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Sequence() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_CareTeamLinkId() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_DiagnosisLinkId() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_ProcedureLinkId() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_InformationLinkId() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Revenue() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Category() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Service() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Modifier() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_ProgramCode() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Servicedx() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Locationx() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Quantity() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_UnitPrice() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Factor() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Net() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Udi() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_BodySite() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_SubSite() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Detail() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Prosthesis() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimItemDetail() {
		if (claimItemDetailEClass == null) {
			claimItemDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(341);
		}
		return claimItemDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetail_Sequence() {
        return (EReference)getClaimItemDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetail_Revenue() {
        return (EReference)getClaimItemDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetail_Category() {
        return (EReference)getClaimItemDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetail_Service() {
        return (EReference)getClaimItemDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetail_Modifier() {
        return (EReference)getClaimItemDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetail_ProgramCode() {
        return (EReference)getClaimItemDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetail_Quantity() {
        return (EReference)getClaimItemDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetail_UnitPrice() {
        return (EReference)getClaimItemDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetail_Factor() {
        return (EReference)getClaimItemDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetail_Net() {
        return (EReference)getClaimItemDetail().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetail_Udi() {
        return (EReference)getClaimItemDetail().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetail_SubDetail() {
        return (EReference)getClaimItemDetail().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimItemDetailSubDetail() {
		if (claimItemDetailSubDetailEClass == null) {
			claimItemDetailSubDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(342);
		}
		return claimItemDetailSubDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetailSubDetail_Sequence() {
        return (EReference)getClaimItemDetailSubDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetailSubDetail_Revenue() {
        return (EReference)getClaimItemDetailSubDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetailSubDetail_Category() {
        return (EReference)getClaimItemDetailSubDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetailSubDetail_Service() {
        return (EReference)getClaimItemDetailSubDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetailSubDetail_Modifier() {
        return (EReference)getClaimItemDetailSubDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetailSubDetail_ProgramCode() {
        return (EReference)getClaimItemDetailSubDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetailSubDetail_Quantity() {
        return (EReference)getClaimItemDetailSubDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetailSubDetail_UnitPrice() {
        return (EReference)getClaimItemDetailSubDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetailSubDetail_Factor() {
        return (EReference)getClaimItemDetailSubDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetailSubDetail_Net() {
        return (EReference)getClaimItemDetailSubDetail().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemDetailSubDetail_Udi() {
        return (EReference)getClaimItemDetailSubDetail().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimItemProsthesis() {
		if (claimItemProsthesisEClass == null) {
			claimItemProsthesisEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(343);
		}
		return claimItemProsthesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemProsthesis_Initial() {
        return (EReference)getClaimItemProsthesis().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemProsthesis_PriorDate() {
        return (EReference)getClaimItemProsthesis().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemProsthesis_PriorMaterial() {
        return (EReference)getClaimItemProsthesis().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseItem() {
		if (claimResponseItemEClass == null) {
			claimResponseItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(344);
		}
		return claimResponseItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItem_SequenceLinkId() {
        return (EReference)getClaimResponseItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItem_NoteNumber() {
        return (EReference)getClaimResponseItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItem_Adjudication() {
        return (EReference)getClaimResponseItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItem_Detail() {
        return (EReference)getClaimResponseItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseItemAdjudication() {
		if (claimResponseItemAdjudicationEClass == null) {
			claimResponseItemAdjudicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(345);
		}
		return claimResponseItemAdjudicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemAdjudication_Category() {
        return (EReference)getClaimResponseItemAdjudication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemAdjudication_Reason() {
        return (EReference)getClaimResponseItemAdjudication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemAdjudication_Amount() {
        return (EReference)getClaimResponseItemAdjudication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemAdjudication_Value() {
        return (EReference)getClaimResponseItemAdjudication().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseItemItemDetail() {
		if (claimResponseItemItemDetailEClass == null) {
			claimResponseItemItemDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(346);
		}
		return claimResponseItemItemDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemItemDetail_SequenceLinkId() {
        return (EReference)getClaimResponseItemItemDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemItemDetail_NoteNumber() {
        return (EReference)getClaimResponseItemItemDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemItemDetail_Adjudication() {
        return (EReference)getClaimResponseItemItemDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemItemDetail_SubDetail() {
        return (EReference)getClaimResponseItemItemDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseItemItemDetailSubDetail() {
		if (claimResponseItemItemDetailSubDetailEClass == null) {
			claimResponseItemItemDetailSubDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(347);
		}
		return claimResponseItemItemDetailSubDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemItemDetailSubDetail_SequenceLinkId() {
        return (EReference)getClaimResponseItemItemDetailSubDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemItemDetailSubDetail_NoteNumber() {
        return (EReference)getClaimResponseItemItemDetailSubDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemItemDetailSubDetail_Adjudication() {
        return (EReference)getClaimResponseItemItemDetailSubDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseAddedItem() {
		if (claimResponseAddedItemEClass == null) {
			claimResponseAddedItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(348);
		}
		return claimResponseAddedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_SequenceLinkId() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_Revenue() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_Category() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_Service() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_Modifier() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_Fee() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_NoteNumber() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_Adjudication() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_Detail() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseAddedItemAddedItemsDetail() {
		if (claimResponseAddedItemAddedItemsDetailEClass == null) {
			claimResponseAddedItemAddedItemsDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(349);
		}
		return claimResponseAddedItemAddedItemsDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemsDetail_Revenue() {
        return (EReference)getClaimResponseAddedItemAddedItemsDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemsDetail_Category() {
        return (EReference)getClaimResponseAddedItemAddedItemsDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemsDetail_Service() {
        return (EReference)getClaimResponseAddedItemAddedItemsDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemsDetail_Modifier() {
        return (EReference)getClaimResponseAddedItemAddedItemsDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemsDetail_Fee() {
        return (EReference)getClaimResponseAddedItemAddedItemsDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemsDetail_NoteNumber() {
        return (EReference)getClaimResponseAddedItemAddedItemsDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemsDetail_Adjudication() {
        return (EReference)getClaimResponseAddedItemAddedItemsDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseError() {
		if (claimResponseErrorEClass == null) {
			claimResponseErrorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(350);
		}
		return claimResponseErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseError_SequenceLinkId() {
        return (EReference)getClaimResponseError().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseError_DetailSequenceLinkId() {
        return (EReference)getClaimResponseError().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseError_SubdetailSequenceLinkId() {
        return (EReference)getClaimResponseError().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseError_Code() {
        return (EReference)getClaimResponseError().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponsePayment() {
		if (claimResponsePaymentEClass == null) {
			claimResponsePaymentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(351);
		}
		return claimResponsePaymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponsePayment_Type() {
        return (EReference)getClaimResponsePayment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponsePayment_Adjustment() {
        return (EReference)getClaimResponsePayment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponsePayment_AdjustmentReason() {
        return (EReference)getClaimResponsePayment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponsePayment_Date() {
        return (EReference)getClaimResponsePayment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponsePayment_Amount() {
        return (EReference)getClaimResponsePayment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponsePayment_Identifier() {
        return (EReference)getClaimResponsePayment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseNote() {
		if (claimResponseNoteEClass == null) {
			claimResponseNoteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(352);
		}
		return claimResponseNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseNote_Number() {
        return (EReference)getClaimResponseNote().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseNote_Type() {
        return (EReference)getClaimResponseNote().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseNote_Text() {
        return (EReference)getClaimResponseNote().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseNote_Language() {
        return (EReference)getClaimResponseNote().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseInsurance() {
		if (claimResponseInsuranceEClass == null) {
			claimResponseInsuranceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(353);
		}
		return claimResponseInsuranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseInsurance_Sequence() {
        return (EReference)getClaimResponseInsurance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseInsurance_Focal() {
        return (EReference)getClaimResponseInsurance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseInsurance_Coverage() {
        return (EReference)getClaimResponseInsurance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseInsurance_BusinessArrangement() {
        return (EReference)getClaimResponseInsurance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseInsurance_PreAuthRef() {
        return (EReference)getClaimResponseInsurance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseInsurance_ClaimResponse() {
        return (EReference)getClaimResponseInsurance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		if (taskEClass == null) {
			taskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(354);
		}
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Identifier() {
        return (EReference)getTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Definitionx() {
        return (EReference)getTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_BasedOn() {
        return (EReference)getTask().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_GroupIdentifier() {
        return (EReference)getTask().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_PartOf() {
        return (EReference)getTask().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Status() {
        return (EReference)getTask().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_StatusReason() {
        return (EReference)getTask().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_BusinessStatus() {
        return (EReference)getTask().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Intent() {
        return (EReference)getTask().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Priority() {
        return (EReference)getTask().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Code() {
        return (EReference)getTask().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Description() {
        return (EReference)getTask().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Focus() {
        return (EReference)getTask().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_For() {
        return (EReference)getTask().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Context() {
        return (EReference)getTask().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ExecutionPeriod() {
        return (EReference)getTask().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_AuthoredOn() {
        return (EReference)getTask().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_LastModified() {
        return (EReference)getTask().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Requester() {
        return (EReference)getTask().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_PerformerType() {
        return (EReference)getTask().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Owner() {
        return (EReference)getTask().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Reason() {
        return (EReference)getTask().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Note() {
        return (EReference)getTask().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_RelevantHistory() {
        return (EReference)getTask().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Restriction() {
        return (EReference)getTask().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Input() {
        return (EReference)getTask().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Output() {
        return (EReference)getTask().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskRequester() {
		if (taskRequesterEClass == null) {
			taskRequesterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(355);
		}
		return taskRequesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRequester_Agent() {
        return (EReference)getTaskRequester().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRequester_OnBehalfOf() {
        return (EReference)getTaskRequester().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskRestriction() {
		if (taskRestrictionEClass == null) {
			taskRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(356);
		}
		return taskRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRestriction_Repetitions() {
        return (EReference)getTaskRestriction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRestriction_Period() {
        return (EReference)getTaskRestriction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRestriction_Recipient() {
        return (EReference)getTaskRestriction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskParameter() {
		if (taskParameterEClass == null) {
			taskParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(357);
		}
		return taskParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskParameter_Type() {
        return (EReference)getTaskParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskParameter_Valuex() {
        return (EReference)getTaskParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskOutput() {
		if (taskOutputEClass == null) {
			taskOutputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(358);
		}
		return taskOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskOutput_Type() {
        return (EReference)getTaskOutput().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskOutput_Valuex() {
        return (EReference)getTaskOutput().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefit() {
		if (explanationOfBenefitEClass == null) {
			explanationOfBenefitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(359);
		}
		return explanationOfBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Identifier() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Status() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Type() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_SubType() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Patient() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_BillablePeriod() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Created() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Enterer() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Insurer() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Provider() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Organization() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Referral() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Facility() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Claim() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_ClaimResponse() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Outcome() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Disposition() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Related() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Prescription() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_OriginalPrescription() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Payee() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Information() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_CareTeam() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Diagnosis() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Procedure() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Precedence() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Insurance() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Accident() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_EmploymentImpacted() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Hospitalization() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Item() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_AddItem() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_TotalCost() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_UnallocDeductable() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_TotalBenefit() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Payment() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Form() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Note() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_BenefitBalance() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitRelatedClaim() {
		if (explanationOfBenefitRelatedClaimEClass == null) {
			explanationOfBenefitRelatedClaimEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(360);
		}
		return explanationOfBenefitRelatedClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitRelatedClaim_Claim() {
        return (EReference)getExplanationOfBenefitRelatedClaim().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitRelatedClaim_Relationship() {
        return (EReference)getExplanationOfBenefitRelatedClaim().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitRelatedClaim_Reference() {
        return (EReference)getExplanationOfBenefitRelatedClaim().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitPayee() {
		if (explanationOfBenefitPayeeEClass == null) {
			explanationOfBenefitPayeeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(361);
		}
		return explanationOfBenefitPayeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitPayee_Type() {
        return (EReference)getExplanationOfBenefitPayee().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitPayee_ResourceType() {
        return (EReference)getExplanationOfBenefitPayee().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitPayee_Partyx() {
        return (EReference)getExplanationOfBenefitPayee().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitSupportingInformation() {
		if (explanationOfBenefitSupportingInformationEClass == null) {
			explanationOfBenefitSupportingInformationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(362);
		}
		return explanationOfBenefitSupportingInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitSupportingInformation_Category() {
        return (EReference)getExplanationOfBenefitSupportingInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitSupportingInformation_Code() {
        return (EReference)getExplanationOfBenefitSupportingInformation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitSupportingInformation_Timingx() {
        return (EReference)getExplanationOfBenefitSupportingInformation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitSupportingInformation_Valuex() {
        return (EReference)getExplanationOfBenefitSupportingInformation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitSupportingInformation_Reason() {
        return (EReference)getExplanationOfBenefitSupportingInformation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitCareTeam() {
		if (explanationOfBenefitCareTeamEClass == null) {
			explanationOfBenefitCareTeamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(363);
		}
		return explanationOfBenefitCareTeamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitCareTeam_Sequence() {
        return (EReference)getExplanationOfBenefitCareTeam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitCareTeam_Provider() {
        return (EReference)getExplanationOfBenefitCareTeam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitCareTeam_Responsible() {
        return (EReference)getExplanationOfBenefitCareTeam().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitCareTeam_Role() {
        return (EReference)getExplanationOfBenefitCareTeam().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitCareTeam_Qualification() {
        return (EReference)getExplanationOfBenefitCareTeam().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitDiagnosis() {
		if (explanationOfBenefitDiagnosisEClass == null) {
			explanationOfBenefitDiagnosisEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(364);
		}
		return explanationOfBenefitDiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitDiagnosis_Sequence() {
        return (EReference)getExplanationOfBenefitDiagnosis().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitDiagnosis_Diagnosisx() {
        return (EReference)getExplanationOfBenefitDiagnosis().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitDiagnosis_Type() {
        return (EReference)getExplanationOfBenefitDiagnosis().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitDiagnosis_PackageCode() {
        return (EReference)getExplanationOfBenefitDiagnosis().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitProcedure() {
		if (explanationOfBenefitProcedureEClass == null) {
			explanationOfBenefitProcedureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(365);
		}
		return explanationOfBenefitProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitProcedure_Sequence() {
        return (EReference)getExplanationOfBenefitProcedure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitProcedure_Date() {
        return (EReference)getExplanationOfBenefitProcedure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitProcedure_Procedurex() {
        return (EReference)getExplanationOfBenefitProcedure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitInsurance() {
		if (explanationOfBenefitInsuranceEClass == null) {
			explanationOfBenefitInsuranceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(366);
		}
		return explanationOfBenefitInsuranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitInsurance_Coverage() {
        return (EReference)getExplanationOfBenefitInsurance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitInsurance_PreAuthRef() {
        return (EReference)getExplanationOfBenefitInsurance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitAccident() {
		if (explanationOfBenefitAccidentEClass == null) {
			explanationOfBenefitAccidentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(367);
		}
		return explanationOfBenefitAccidentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAccident_Date() {
        return (EReference)getExplanationOfBenefitAccident().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAccident_Type() {
        return (EReference)getExplanationOfBenefitAccident().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAccident_Locationx() {
        return (EReference)getExplanationOfBenefitAccident().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitItem() {
		if (explanationOfBenefitItemEClass == null) {
			explanationOfBenefitItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(368);
		}
		return explanationOfBenefitItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Sequence() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_CareTeamLinkId() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_DiagnosisLinkId() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_ProcedureLinkId() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_InformationLinkId() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Revenue() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Category() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Service() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Modifier() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_ProgramCode() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Servicedx() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Locationx() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Quantity() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_UnitPrice() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Factor() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Net() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Udi() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_BodySite() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_SubSite() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_NoteNumber() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Adjudication() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Detail() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItem_Prosthesis() {
        return (EReference)getExplanationOfBenefitItem().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitItemAdjudication() {
		if (explanationOfBenefitItemAdjudicationEClass == null) {
			explanationOfBenefitItemAdjudicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(369);
		}
		return explanationOfBenefitItemAdjudicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemAdjudication_Category() {
        return (EReference)getExplanationOfBenefitItemAdjudication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemAdjudication_Reason() {
        return (EReference)getExplanationOfBenefitItemAdjudication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemAdjudication_Amount() {
        return (EReference)getExplanationOfBenefitItemAdjudication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemAdjudication_Value() {
        return (EReference)getExplanationOfBenefitItemAdjudication().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitItemDetail() {
		if (explanationOfBenefitItemDetailEClass == null) {
			explanationOfBenefitItemDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(370);
		}
		return explanationOfBenefitItemDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_Sequence() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_Type() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_Revenue() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_Category() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_Service() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_Modifier() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_ProgramCode() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_Quantity() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_UnitPrice() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_Factor() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_Net() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_Udi() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_NoteNumber() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_Adjudication() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetail_SubDetail() {
        return (EReference)getExplanationOfBenefitItemDetail().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitItemDetailSubDetail() {
		if (explanationOfBenefitItemDetailSubDetailEClass == null) {
			explanationOfBenefitItemDetailSubDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(371);
		}
		return explanationOfBenefitItemDetailSubDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_Sequence() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_Type() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_Revenue() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_Category() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_Service() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_Modifier() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_ProgramCode() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_Quantity() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_UnitPrice() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_Factor() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_Net() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_Udi() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_NoteNumber() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemDetailSubDetail_Adjudication() {
        return (EReference)getExplanationOfBenefitItemDetailSubDetail().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitItemProsthesis() {
		if (explanationOfBenefitItemProsthesisEClass == null) {
			explanationOfBenefitItemProsthesisEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(372);
		}
		return explanationOfBenefitItemProsthesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemProsthesis_Initial() {
        return (EReference)getExplanationOfBenefitItemProsthesis().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemProsthesis_PriorDate() {
        return (EReference)getExplanationOfBenefitItemProsthesis().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitItemProsthesis_PriorMaterial() {
        return (EReference)getExplanationOfBenefitItemProsthesis().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitAddedItem() {
		if (explanationOfBenefitAddedItemEClass == null) {
			explanationOfBenefitAddedItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(373);
		}
		return explanationOfBenefitAddedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItem_SequenceLinkId() {
        return (EReference)getExplanationOfBenefitAddedItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItem_Revenue() {
        return (EReference)getExplanationOfBenefitAddedItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItem_Category() {
        return (EReference)getExplanationOfBenefitAddedItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItem_Service() {
        return (EReference)getExplanationOfBenefitAddedItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItem_Modifier() {
        return (EReference)getExplanationOfBenefitAddedItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItem_Fee() {
        return (EReference)getExplanationOfBenefitAddedItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItem_NoteNumber() {
        return (EReference)getExplanationOfBenefitAddedItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItem_Adjudication() {
        return (EReference)getExplanationOfBenefitAddedItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItem_Detail() {
        return (EReference)getExplanationOfBenefitAddedItem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitAddedItemAddedItemsDetail() {
		if (explanationOfBenefitAddedItemAddedItemsDetailEClass == null) {
			explanationOfBenefitAddedItemAddedItemsDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(374);
		}
		return explanationOfBenefitAddedItemAddedItemsDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItemAddedItemsDetail_Revenue() {
        return (EReference)getExplanationOfBenefitAddedItemAddedItemsDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItemAddedItemsDetail_Category() {
        return (EReference)getExplanationOfBenefitAddedItemAddedItemsDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItemAddedItemsDetail_Service() {
        return (EReference)getExplanationOfBenefitAddedItemAddedItemsDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItemAddedItemsDetail_Modifier() {
        return (EReference)getExplanationOfBenefitAddedItemAddedItemsDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItemAddedItemsDetail_Fee() {
        return (EReference)getExplanationOfBenefitAddedItemAddedItemsDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItemAddedItemsDetail_NoteNumber() {
        return (EReference)getExplanationOfBenefitAddedItemAddedItemsDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitAddedItemAddedItemsDetail_Adjudication() {
        return (EReference)getExplanationOfBenefitAddedItemAddedItemsDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitPayment() {
		if (explanationOfBenefitPaymentEClass == null) {
			explanationOfBenefitPaymentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(375);
		}
		return explanationOfBenefitPaymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitPayment_Type() {
        return (EReference)getExplanationOfBenefitPayment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitPayment_Adjustment() {
        return (EReference)getExplanationOfBenefitPayment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitPayment_AdjustmentReason() {
        return (EReference)getExplanationOfBenefitPayment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitPayment_Date() {
        return (EReference)getExplanationOfBenefitPayment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitPayment_Amount() {
        return (EReference)getExplanationOfBenefitPayment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitPayment_Identifier() {
        return (EReference)getExplanationOfBenefitPayment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitNote() {
		if (explanationOfBenefitNoteEClass == null) {
			explanationOfBenefitNoteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(376);
		}
		return explanationOfBenefitNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitNote_Number() {
        return (EReference)getExplanationOfBenefitNote().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitNote_Type() {
        return (EReference)getExplanationOfBenefitNote().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitNote_Text() {
        return (EReference)getExplanationOfBenefitNote().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitNote_Language() {
        return (EReference)getExplanationOfBenefitNote().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitBenefitBalance() {
		if (explanationOfBenefitBenefitBalanceEClass == null) {
			explanationOfBenefitBenefitBalanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(377);
		}
		return explanationOfBenefitBenefitBalanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitBenefitBalance_Category() {
        return (EReference)getExplanationOfBenefitBenefitBalance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitBenefitBalance_SubCategory() {
        return (EReference)getExplanationOfBenefitBenefitBalance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitBenefitBalance_Excluded() {
        return (EReference)getExplanationOfBenefitBenefitBalance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitBenefitBalance_Name() {
        return (EReference)getExplanationOfBenefitBenefitBalance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitBenefitBalance_Description() {
        return (EReference)getExplanationOfBenefitBenefitBalance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitBenefitBalance_Network() {
        return (EReference)getExplanationOfBenefitBenefitBalance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitBenefitBalance_Unit() {
        return (EReference)getExplanationOfBenefitBenefitBalance().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitBenefitBalance_Term() {
        return (EReference)getExplanationOfBenefitBenefitBalance().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitBenefitBalance_Financial() {
        return (EReference)getExplanationOfBenefitBenefitBalance().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefitBenefitBalanceBenefit() {
		if (explanationOfBenefitBenefitBalanceBenefitEClass == null) {
			explanationOfBenefitBenefitBalanceBenefitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(378);
		}
		return explanationOfBenefitBenefitBalanceBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitBenefitBalanceBenefit_Type() {
        return (EReference)getExplanationOfBenefitBenefitBalanceBenefit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitBenefitBalanceBenefit_Benefitx() {
        return (EReference)getExplanationOfBenefitBenefitBalanceBenefit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefitBenefitBalanceBenefit_BenefitUsedx() {
        return (EReference)getExplanationOfBenefitBenefitBalanceBenefit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationGuide() {
		if (implementationGuideEClass == null) {
			implementationGuideEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(379);
		}
		return implementationGuideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Url() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Version() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Name() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Status() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Experimental() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Publisher() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Contact() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Date() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Description() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_UseContext() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Jurisdiction() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Copyright() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_FhirVersion() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Dependency() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Package() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Global() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Binary() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Page() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationGuideDependency() {
		if (implementationGuideDependencyEClass == null) {
			implementationGuideDependencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(380);
		}
		return implementationGuideDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuideDependency_Type() {
        return (EReference)getImplementationGuideDependency().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuideDependency_Uri() {
        return (EReference)getImplementationGuideDependency().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationGuidePackage() {
		if (implementationGuidePackageEClass == null) {
			implementationGuidePackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(381);
		}
		return implementationGuidePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackage_Name() {
        return (EReference)getImplementationGuidePackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackage_Description() {
        return (EReference)getImplementationGuidePackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackage_Resource() {
        return (EReference)getImplementationGuidePackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationGuidePackageResource() {
		if (implementationGuidePackageResourceEClass == null) {
			implementationGuidePackageResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(382);
		}
		return implementationGuidePackageResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackageResource_Example() {
        return (EReference)getImplementationGuidePackageResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackageResource_Name() {
        return (EReference)getImplementationGuidePackageResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackageResource_Description() {
        return (EReference)getImplementationGuidePackageResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackageResource_Acronym() {
        return (EReference)getImplementationGuidePackageResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackageResource_Sourcex() {
        return (EReference)getImplementationGuidePackageResource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackageResource_ExampleFor() {
        return (EReference)getImplementationGuidePackageResource().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationGuideGlobal() {
		if (implementationGuideGlobalEClass == null) {
			implementationGuideGlobalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(383);
		}
		return implementationGuideGlobalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuideGlobal_Type() {
        return (EReference)getImplementationGuideGlobal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuideGlobal_Profile() {
        return (EReference)getImplementationGuideGlobal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationGuidePage() {
		if (implementationGuidePageEClass == null) {
			implementationGuidePageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(384);
		}
		return implementationGuidePageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Source() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Title() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Kind() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Type() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Package() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Format() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Page() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchParameter() {
		if (searchParameterEClass == null) {
			searchParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(385);
		}
		return searchParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Url() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Version() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Name() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Status() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Experimental() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Date() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Publisher() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Contact() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_UseContext() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Jurisdiction() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Purpose() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Code() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Base() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Type() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_DerivedFrom() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Description() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Expression() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Xpath() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_XpathUsage() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Target() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Comparator() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Modifier() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Chain() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Component() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchParameterComponent() {
		if (searchParameterComponentEClass == null) {
			searchParameterComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(386);
		}
		return searchParameterComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameterComponent_Definition() {
        return (EReference)getSearchParameterComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameterComponent_Expression() {
        return (EReference)getSearchParameterComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionProfile() {
		if (expansionProfileEClass == null) {
			expansionProfileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(387);
		}
		return expansionProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_Url() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_Identifier() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_Version() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_Name() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_Status() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_Experimental() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_Publisher() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_Contact() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_Date() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_Description() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_UseContext() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_Jurisdiction() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_FixedVersion() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_ExcludedSystem() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_IncludeDesignations() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_Designation() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_IncludeDefinition() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_ActiveOnly() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_ExcludeNested() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_ExcludeNotForUi() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_ExcludePostCoordinated() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_DisplayLanguage() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfile_LimitedExpansion() {
        return (EReference)getExpansionProfile().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionProfileFixedVersion() {
		if (expansionProfileFixedVersionEClass == null) {
			expansionProfileFixedVersionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(388);
		}
		return expansionProfileFixedVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfileFixedVersion_System() {
        return (EReference)getExpansionProfileFixedVersion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfileFixedVersion_Version() {
        return (EReference)getExpansionProfileFixedVersion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfileFixedVersion_Mode() {
        return (EReference)getExpansionProfileFixedVersion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionProfileExcludedSystem() {
		if (expansionProfileExcludedSystemEClass == null) {
			expansionProfileExcludedSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(389);
		}
		return expansionProfileExcludedSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfileExcludedSystem_System() {
        return (EReference)getExpansionProfileExcludedSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfileExcludedSystem_Version() {
        return (EReference)getExpansionProfileExcludedSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionProfileDesignation() {
		if (expansionProfileDesignationEClass == null) {
			expansionProfileDesignationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(390);
		}
		return expansionProfileDesignationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfileDesignation_Include() {
        return (EReference)getExpansionProfileDesignation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfileDesignation_Exclude() {
        return (EReference)getExpansionProfileDesignation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionProfileDesignationDesignationInclude() {
		if (expansionProfileDesignationDesignationIncludeEClass == null) {
			expansionProfileDesignationDesignationIncludeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(391);
		}
		return expansionProfileDesignationDesignationIncludeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfileDesignationDesignationInclude_Designation() {
        return (EReference)getExpansionProfileDesignationDesignationInclude().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation() {
		if (expansionProfileDesignationDesignationIncludeDesignationIncludeDesignationEClass == null) {
			expansionProfileDesignationDesignationIncludeDesignationIncludeDesignationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(392);
		}
		return expansionProfileDesignationDesignationIncludeDesignationIncludeDesignationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation_Language() {
        return (EReference)getExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation_Use() {
        return (EReference)getExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionProfileDesignationDesignationExclude() {
		if (expansionProfileDesignationDesignationExcludeEClass == null) {
			expansionProfileDesignationDesignationExcludeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(393);
		}
		return expansionProfileDesignationDesignationExcludeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfileDesignationDesignationExclude_Designation() {
        return (EReference)getExpansionProfileDesignationDesignationExclude().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation() {
		if (expansionProfileDesignationDesignationExcludeDesignationExcludeDesignationEClass == null) {
			expansionProfileDesignationDesignationExcludeDesignationExcludeDesignationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(394);
		}
		return expansionProfileDesignationDesignationExcludeDesignationExcludeDesignationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation_Language() {
        return (EReference)getExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation_Use() {
        return (EReference)getExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentDefinition() {
		if (compartmentDefinitionEClass == null) {
			compartmentDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(395);
		}
		return compartmentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Url() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Name() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Title() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Status() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Experimental() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Publisher() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Contact() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Date() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Description() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Purpose() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_UseContext() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Jurisdiction() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Code() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Search() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinition_Resource() {
        return (EReference)getCompartmentDefinition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentDefinitionResource() {
		if (compartmentDefinitionResourceEClass == null) {
			compartmentDefinitionResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(396);
		}
		return compartmentDefinitionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinitionResource_Code() {
        return (EReference)getCompartmentDefinitionResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinitionResource_Param() {
        return (EReference)getCompartmentDefinitionResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentDefinitionResource_Documentation() {
        return (EReference)getCompartmentDefinitionResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessResponse() {
		if (processResponseEClass == null) {
			processResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(397);
		}
		return processResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Identifier() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Status() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Created() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Organization() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Request() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Outcome() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Disposition() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_RequestProvider() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_RequestOrganization() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Form() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Note() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Error() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_CommunicationRequest() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessResponseNote() {
		if (processResponseNoteEClass == null) {
			processResponseNoteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(398);
		}
		return processResponseNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponseNote_Type() {
        return (EReference)getProcessResponseNote().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponseNote_Text() {
        return (EReference)getProcessResponseNote().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractitionerRole() {
		if (practitionerRoleEClass == null) {
			practitionerRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(399);
		}
		return practitionerRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Identifier() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Active() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Practitioner() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Organization() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Code() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Specialty() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Location() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_HealthcareService() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Telecom() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Period() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_AvailableTime() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_NotAvailable() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_AvailabilityExceptions() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRole_Endpoint() {
        return (EReference)getPractitionerRole().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractitionerRoleAvailableTime() {
		if (practitionerRoleAvailableTimeEClass == null) {
			practitionerRoleAvailableTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(400);
		}
		return practitionerRoleAvailableTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRoleAvailableTime_DaysOfWeek() {
        return (EReference)getPractitionerRoleAvailableTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRoleAvailableTime_AllDay() {
        return (EReference)getPractitionerRoleAvailableTime().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRoleAvailableTime_AvailableStartTime() {
        return (EReference)getPractitionerRoleAvailableTime().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRoleAvailableTime_AvailableEndTime() {
        return (EReference)getPractitionerRoleAvailableTime().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractitionerRoleNotAvailable() {
		if (practitionerRoleNotAvailableEClass == null) {
			practitionerRoleNotAvailableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(401);
		}
		return practitionerRoleNotAvailableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRoleNotAvailable_Description() {
        return (EReference)getPractitionerRoleNotAvailable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerRoleNotAvailable_During() {
        return (EReference)getPractitionerRoleNotAvailable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentNotice() {
		if (paymentNoticeEClass == null) {
			paymentNoticeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(402);
		}
		return paymentNoticeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Identifier() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Status() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Request() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Response() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_StatusDate() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Created() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Target() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Provider() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Organization() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_PaymentStatus() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkage() {
		if (linkageEClass == null) {
			linkageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(403);
		}
		return linkageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkage_Author() {
        return (EReference)getLinkage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkage_Item() {
        return (EReference)getLinkage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkageItem() {
		if (linkageItemEClass == null) {
			linkageItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(404);
		}
		return linkageItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkageItem_Type() {
        return (EReference)getLinkageItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkageItem_Resource() {
        return (EReference)getLinkageItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyRequest() {
		if (supplyRequestEClass == null) {
			supplyRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(405);
		}
		return supplyRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Patient() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Source() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Date() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Identifier() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Status() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Kind() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_OrderedItemx() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Supplier() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Reasonx() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_When() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyRequestWhen() {
		if (supplyRequestWhenEClass == null) {
			supplyRequestWhenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(406);
		}
		return supplyRequestWhenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequestWhen_Code() {
        return (EReference)getSupplyRequestWhen().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequestWhen_Schedule() {
        return (EReference)getSupplyRequestWhen().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuidanceResponse() {
		if (guidanceResponseEClass == null) {
			guidanceResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(407);
		}
		return guidanceResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_RequestId() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_Identifier() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_Module() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_Status() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_Subject() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_Context() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_OccurrenceDateTime() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_Performer() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_Reasonx() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_Note() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_EvaluationMessage() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_OutputParameters() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_Result() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceResponse_DataRequirement() {
        return (EReference)getGuidanceResponse().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDefinition() {
		if (messageDefinitionEClass == null) {
			messageDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(408);
		}
		return messageDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Url() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Version() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Name() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Title() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Status() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Experimental() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Date() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Publisher() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Contact() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Description() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_UseContext() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Jurisdiction() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Purpose() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Copyright() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Base() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Parent() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Replaces() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Event() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Category() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Focus() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_ResponseRequired() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_AllowedResponse() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDefinitionFocus() {
		if (messageDefinitionFocusEClass == null) {
			messageDefinitionFocusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(409);
		}
		return messageDefinitionFocusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinitionFocus_Code() {
        return (EReference)getMessageDefinitionFocus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinitionFocus_Profile() {
        return (EReference)getMessageDefinitionFocus().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinitionFocus_Min() {
        return (EReference)getMessageDefinitionFocus().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinitionFocus_Max() {
        return (EReference)getMessageDefinitionFocus().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDefinitionAllowedResponse() {
		if (messageDefinitionAllowedResponseEClass == null) {
			messageDefinitionAllowedResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(410);
		}
		return messageDefinitionAllowedResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinitionAllowedResponse_Message() {
        return (EReference)getMessageDefinitionAllowedResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinitionAllowedResponse_Situation() {
        return (EReference)getMessageDefinitionAllowedResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetectedIssue() {
		if (detectedIssueEClass == null) {
			detectedIssueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(411);
		}
		return detectedIssueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Patient() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Category() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Severity() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Implicated() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Detail() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Date() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Author() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Identifier() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Reference() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Mitigation() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetectedIssueMitigation() {
		if (detectedIssueMitigationEClass == null) {
			detectedIssueMitigationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(412);
		}
		return detectedIssueMitigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssueMitigation_Action() {
        return (EReference)getDetectedIssueMitigation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssueMitigation_Date() {
        return (EReference)getDetectedIssueMitigation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssueMitigation_Author() {
        return (EReference)getDetectedIssueMitigation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointmentResponse() {
		if (appointmentResponseEClass == null) {
			appointmentResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(413);
		}
		return appointmentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Identifier() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Appointment() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Start() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_End() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_ParticipantType() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Actor() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_ParticipantStatus() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Comment() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEvent() {
		if (auditEventEClass == null) {
			auditEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(414);
		}
		return auditEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Type() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Subtype() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Action() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Recorded() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Outcome() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_OutcomeDesc() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_PurposeOfEvent() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Agent() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Source() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Entity() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventAgent() {
		if (auditEventAgentEClass == null) {
			auditEventAgentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(415);
		}
		return auditEventAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventAgent_Role() {
        return (EReference)getAuditEventAgent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventAgent_Reference() {
        return (EReference)getAuditEventAgent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventAgent_UserId() {
        return (EReference)getAuditEventAgent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventAgent_AltId() {
        return (EReference)getAuditEventAgent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventAgent_Name() {
        return (EReference)getAuditEventAgent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventAgent_Requestor() {
        return (EReference)getAuditEventAgent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventAgent_Location() {
        return (EReference)getAuditEventAgent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventAgent_Policy() {
        return (EReference)getAuditEventAgent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventAgent_Media() {
        return (EReference)getAuditEventAgent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventAgent_Network() {
        return (EReference)getAuditEventAgent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventAgent_PurposeOfUse() {
        return (EReference)getAuditEventAgent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventAgentNetwork() {
		if (auditEventAgentNetworkEClass == null) {
			auditEventAgentNetworkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(416);
		}
		return auditEventAgentNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventAgentNetwork_Address() {
        return (EReference)getAuditEventAgentNetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventAgentNetwork_Type() {
        return (EReference)getAuditEventAgentNetwork().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventSource() {
		if (auditEventSourceEClass == null) {
			auditEventSourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(417);
		}
		return auditEventSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventSource_Site() {
        return (EReference)getAuditEventSource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventSource_Identifier() {
        return (EReference)getAuditEventSource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventSource_Type() {
        return (EReference)getAuditEventSource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventEntity() {
		if (auditEventEntityEClass == null) {
			auditEventEntityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(418);
		}
		return auditEventEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEntity_Identifier() {
        return (EReference)getAuditEventEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEntity_Reference() {
        return (EReference)getAuditEventEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEntity_Type() {
        return (EReference)getAuditEventEntity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEntity_Role() {
        return (EReference)getAuditEventEntity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEntity_Lifecycle() {
        return (EReference)getAuditEventEntity().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEntity_SecurityLabel() {
        return (EReference)getAuditEventEntity().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEntity_Name() {
        return (EReference)getAuditEventEntity().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEntity_Description() {
        return (EReference)getAuditEventEntity().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEntity_Query() {
        return (EReference)getAuditEventEntity().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEntity_Detail() {
        return (EReference)getAuditEventEntity().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventEntityDetail() {
		if (auditEventEntityDetailEClass == null) {
			auditEventEntityDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(419);
		}
		return auditEventEntityDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEntityDetail_Type() {
        return (EReference)getAuditEventEntityDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEntityDetail_Value() {
        return (EReference)getAuditEventEntityDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasic() {
		if (basicEClass == null) {
			basicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(420);
		}
		return basicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Identifier() {
        return (EReference)getBasic().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Code() {
        return (EReference)getBasic().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Subject() {
        return (EReference)getBasic().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Created() {
        return (EReference)getBasic().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Author() {
        return (EReference)getBasic().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyDelivery() {
		if (supplyDeliveryEClass == null) {
			supplyDeliveryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(421);
		}
		return supplyDeliveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Identifier() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Status() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Patient() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Type() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Quantity() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_SuppliedItemx() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Supplier() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_WhenPrepared() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Time() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Destination() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Receiver() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		if (organizationEClass == null) {
			organizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(422);
		}
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Identifier() {
        return (EReference)getOrganization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Active() {
        return (EReference)getOrganization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Type() {
        return (EReference)getOrganization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Name() {
        return (EReference)getOrganization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Alias() {
        return (EReference)getOrganization().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Telecom() {
        return (EReference)getOrganization().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Address() {
        return (EReference)getOrganization().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_PartOf() {
        return (EReference)getOrganization().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Contact() {
        return (EReference)getOrganization().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Endpoint() {
        return (EReference)getOrganization().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationContact() {
		if (organizationContactEClass == null) {
			organizationContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI).getEClassifiers().get(423);
		}
		return organizationContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationContact_Purpose() {
        return (EReference)getOrganizationContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationContact_Name() {
        return (EReference)getOrganizationContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationContact_Telecom() {
        return (EReference)getOrganizationContact().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationContact_Address() {
        return (EReference)getOrganizationContact().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesFactory getResourcesFactory() {
		return (ResourcesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.eclipse.mdht.uml.fhir.core.resources." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ResourcesPackageImpl
