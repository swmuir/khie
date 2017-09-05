/**
 */
package org.eclipse.mdht.uml.fhir.core.valueSets.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.mdht.uml.fhir.core.valueSets.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueSetsFactoryImpl extends EFactoryImpl implements ValueSetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValueSetsFactory init() {
		try {
			ValueSetsFactory theValueSetsFactory = (ValueSetsFactory)EPackage.Registry.INSTANCE.getEFactory(ValueSetsPackage.eNS_URI);
			if (theValueSetsFactory != null) {
				return theValueSetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValueSetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ValueSetsPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.RESOURCE_TYPE:
				return createResourceTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.ADDRESS_USE:
				return createAddressUseFromString(eDataType, initialValue);
			case ValueSetsPackage.ADDRESS_TYPE:
				return createAddressTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.QUANTITY_COMPARATOR:
				return createQuantityComparatorFromString(eDataType, initialValue);
			case ValueSetsPackage.ALL_SECURITY_LABELS:
				return createAllSecurityLabelsFromString(eDataType, initialValue);
			case ValueSetsPackage.COMMON_TAGS:
				return createCommonTagsFromString(eDataType, initialValue);
			case ValueSetsPackage.COMMON_LANGUAGES:
				return createCommonLanguagesFromString(eDataType, initialValue);
			case ValueSetsPackage.NARRATIVE_STATUS:
				return createNarrativeStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.IDENTIFIER_USE:
				return createIdentifierUseFromString(eDataType, initialValue);
			case ValueSetsPackage.IDENTIFIER_TYPE_CODES:
				return createIdentifierTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ORGANIZATION_TYPE:
				return createOrganizationTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTACT_POINT_SYSTEM:
				return createContactPointSystemFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTACT_POINT_USE:
				return createContactPointUseFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTACT_ENTITY_TYPE:
				return createContactEntityTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.NAME_USE:
				return createNameUseFromString(eDataType, initialValue);
			case ValueSetsPackage.ENDPOINT_STATUS:
				return createEndpointStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.ENDPOINT_CONNECTION_TYPE:
				return createEndpointConnectionTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.ENDPOINT_PAYLOAD_TYPE:
				return createEndpointPayloadTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.ADMINISTRATIVE_GENDER:
				return createAdministrativeGenderFromString(eDataType, initialValue);
			case ValueSetsPackage.PRACTITIONER_ROLE:
				return createPractitionerRoleFromString(eDataType, initialValue);
			case ValueSetsPackage.PRACTITIONER_SPECIALTY:
				return createPractitionerSpecialtyFromString(eDataType, initialValue);
			case ValueSetsPackage.LOCATION_STATUS:
				return createLocationStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.LOCATION_MODE:
				return createLocationModeFromString(eDataType, initialValue);
			case ValueSetsPackage.SERVICE_DELIVERY_LOCATION_ROLE_TYPE:
				return createServiceDeliveryLocationRoleTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.LOCATION_TYPE:
				return createLocationTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.SERVICE_CATEGORY:
				return createServiceCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.SERVICE_TYPE:
				return createServiceTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PRACTICE_SETTING_CODE_VALUE_SET:
				return createPracticeSettingCodeValueSetFromString(eDataType, initialValue);
			case ValueSetsPackage.SERVICE_PROVISION_CONDITIONS:
				return createServiceProvisionConditionsFromString(eDataType, initialValue);
			case ValueSetsPackage.REFERRAL_METHOD:
				return createReferralMethodFromString(eDataType, initialValue);
			case ValueSetsPackage.DAYS_OF_WEEK:
				return createDaysOfWeekFromString(eDataType, initialValue);
			case ValueSetsPackage.ANZSCO_AUSTRALIAN_AND_NEW_ZEALAND_STANDARD_CLASSIFICATION_OF_OCCUPATIONS2013_VERSION12:
				return createAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12FromString(eDataType, initialValue);
			case ValueSetsPackage.MARITAL_STATUS_CODES:
				return createMaritalStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.V2_CONTACT_ROLE:
				return createV2ContactRoleFromString(eDataType, initialValue);
			case ValueSetsPackage.ANIMAL_SPECIES:
				return createAnimalSpeciesFromString(eDataType, initialValue);
			case ValueSetsPackage.ANIMAL_BREEDS:
				return createAnimalBreedsFromString(eDataType, initialValue);
			case ValueSetsPackage.GENDER_STATUS:
				return createGenderStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.PATIENT_RELATIONSHIP_TYPE:
				return createPatientRelationshipTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.LINK_TYPE:
				return createLinkTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.SIGNATURE_TYPE_CODES:
				return createSignatureTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.DEVICE_STATUS:
				return createDeviceStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.DEVICE_TYPES:
				return createDeviceTypesFromString(eDataType, initialValue);
			case ValueSetsPackage.UNITS_OF_TIME:
				return createUnitsOfTimeFromString(eDataType, initialValue);
			case ValueSetsPackage.EVENT_TIMING:
				return createEventTimingFromString(eDataType, initialValue);
			case ValueSetsPackage.TIMING_ABBREVIATION:
				return createTimingAbbreviationFromString(eDataType, initialValue);
			case ValueSetsPackage.LIBRARY_TYPE:
				return createLibraryTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PUBLICATION_STATUS:
				return createPublicationStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.USAGE_CONTEXT_TYPE:
				return createUsageContextTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.JURISDICTION_VALUE_SET:
				return createJurisdictionValueSetFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRIBUTOR_TYPE:
				return createContributorTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.RELATED_ARTIFACT_TYPE:
				return createRelatedArtifactTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.OPERATION_PARAMETER_USE:
				return createOperationParameterUseFromString(eDataType, initialValue);
			case ValueSetsPackage.FHIR_ALL_TYPES:
				return createFhirAllTypesFromString(eDataType, initialValue);
			case ValueSetsPackage.STRUCTURE_DEFINITION_CODES:
				return createStructureDefinitionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.STRUCTURE_DEFINITION_KIND:
				return createStructureDefinitionKindFromString(eDataType, initialValue);
			case ValueSetsPackage.EXTENSION_CONTEXT:
				return createExtensionContextFromString(eDataType, initialValue);
			case ValueSetsPackage.FHIR_DEFINED_TYPE:
				return createFhirDefinedTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.TYPE_DERIVATION_RULE:
				return createTypeDerivationRuleFromString(eDataType, initialValue);
			case ValueSetsPackage.PROPERTY_REPRESENTATION:
				return createPropertyRepresentationFromString(eDataType, initialValue);
			case ValueSetsPackage.LOINC_CODES:
				return createLoincCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SLICING_RULES:
				return createSlicingRulesFromString(eDataType, initialValue);
			case ValueSetsPackage.AGGREGATION_MODE:
				return createAggregationModeFromString(eDataType, initialValue);
			case ValueSetsPackage.REFERENCE_VERSION_RULES:
				return createReferenceVersionRulesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSTRAINT_SEVERITY:
				return createConstraintSeverityFromString(eDataType, initialValue);
			case ValueSetsPackage.BINDING_STRENGTH:
				return createBindingStrengthFromString(eDataType, initialValue);
			case ValueSetsPackage.DESIGNATION_USE:
				return createDesignationUseFromString(eDataType, initialValue);
			case ValueSetsPackage.FILTER_OPERATOR:
				return createFilterOperatorFromString(eDataType, initialValue);
			case ValueSetsPackage.RESEARCH_SUBJECT_STATUS:
				return createResearchSubjectStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.PLAN_DEFINITION_TYPE:
				return createPlanDefinitionTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.TRIGGER_TYPE:
				return createTriggerTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PLAN_ACTION_CONDITION_KIND:
				return createPlanActionConditionKindFromString(eDataType, initialValue);
			case ValueSetsPackage.PLAN_ACTION_RELATIONSHIP_TYPE:
				return createPlanActionRelationshipTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PLAN_ACTION_PARTICIPANT_TYPE:
				return createPlanActionParticipantTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PLAN_ACTION_TYPE:
				return createPlanActionTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PLAN_ACTION_GROUPING_BEHAVIOR:
				return createPlanActionGroupingBehaviorFromString(eDataType, initialValue);
			case ValueSetsPackage.PLAN_ACTION_SELECTION_BEHAVIOR:
				return createPlanActionSelectionBehaviorFromString(eDataType, initialValue);
			case ValueSetsPackage.PLAN_ACTION_REQUIRED_BEHAVIOR:
				return createPlanActionRequiredBehaviorFromString(eDataType, initialValue);
			case ValueSetsPackage.PLAN_ACTION_PRECHECK_BEHAVIOR:
				return createPlanActionPrecheckBehaviorFromString(eDataType, initialValue);
			case ValueSetsPackage.PLAN_ACTION_CARDINALITY_BEHAVIOR:
				return createPlanActionCardinalityBehaviorFromString(eDataType, initialValue);
			case ValueSetsPackage.ACTIVITY_DEFINITION_CATEGORY:
				return createActivityDefinitionCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_MEDICATION_CODES:
				return createSnomedCtMedicationCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_FORM_CODES:
				return createSnomedCtFormCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SUBSTANCE_CATEGORY_CODES:
				return createSubstanceCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SUBSTANCE_CODE:
				return createSubstanceCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_FORM_CODES:
				return createSnomedCtFormCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_ADDITIONAL_DOSAGE_INSTRUCTIONS:
				return createSnomedCtAdditionalDosageInstructionsFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_MEDICATION_AS_NEEDED_REASON_CODES:
				return createSnomedCtMedicationAsNeededReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_ANATOMICAL_STRUCTURE_FOR_ADMINISTRATION_SITE_CODES:
				return createSnomedCtAnatomicalStructureForAdministrationSiteCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_ROUTE_CODES:
				return createSnomedCtRouteCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_ADMINISTRATION_METHOD_CODES:
				return createSnomedCtAdministrationMethodCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_BODY_STRUCTURES:
				return createSnomedCtBodyStructuresFromString(eDataType, initialValue);
			case ValueSetsPackage.STRUCTURE_MAP_MODEL_MODE:
				return createStructureMapModelModeFromString(eDataType, initialValue);
			case ValueSetsPackage.STRUCTURE_MAP_INPUT_MODE:
				return createStructureMapInputModeFromString(eDataType, initialValue);
			case ValueSetsPackage.STRUCTURE_MAP_CONTEXT_TYPE:
				return createStructureMapContextTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.STRUCTURE_MAP_LIST_MODE:
				return createStructureMapListModeFromString(eDataType, initialValue);
			case ValueSetsPackage.STRUCTURE_MAP_TRANSFORM:
				return createStructureMapTransformFromString(eDataType, initialValue);
			case ValueSetsPackage.RESEARCH_STUDY_STATUS:
				return createResearchStudyStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.GROUP_TYPE:
				return createGroupTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_STATUS:
				return createConsentStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_CATEGORY_CODES:
				return createConsentCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.DOCUMENT_TYPE_VALUE_SET:
				return createDocumentTypeValueSetFromString(eDataType, initialValue);
			case ValueSetsPackage.DOCUMENT_CLASS_VALUE_SET:
				return createDocumentClassValueSetFromString(eDataType, initialValue);
			case ValueSetsPackage.DOCUMENT_REFERENCE_STATUS:
				return createDocumentReferenceStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.COMPOSITION_STATUS:
				return createCompositionStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.DOCUMENT_RELATIONSHIP_TYPE:
				return createDocumentRelationshipTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.DOCUMENT_REFERENCE_FORMAT_CODE_SET:
				return createDocumentReferenceFormatCodeSetFromString(eDataType, initialValue);
			case ValueSetsPackage.ENCOUNTER_STATUS:
				return createEncounterStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.ACT_ENCOUNTER_CODE:
				return createActEncounterCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.ENCOUNTER_TYPE:
				return createEncounterTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_CODE_SYSTEM_ACT_PRIORITY:
				return createV3CodeSystemActPriorityFromString(eDataType, initialValue);
			case ValueSetsPackage.EPISODE_OF_CARE_STATUS:
				return createEpisodeOfCareStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITION_CLINICAL_STATUS_CODES:
				return createConditionClinicalStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITION_VERIFICATION_STATUS:
				return createConditionVerificationStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITION_CATEGORY_CODES:
				return createConditionCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITION_DIAGNOSIS_SEVERITY:
				return createConditionDiagnosisSeverityFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITION_PROBLEM_DIAGNOSIS_CODES:
				return createConditionProblemDiagnosisCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITION_STAGE:
				return createConditionStageFromString(eDataType, initialValue);
			case ValueSetsPackage.CLINICAL_IMPRESSION_STATUS:
				return createClinicalImpressionStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_CLINICAL_STATUS:
				return createAllergyIntoleranceClinicalStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_VERIFICATION_STATUS:
				return createAllergyIntoleranceVerificationStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_TYPE:
				return createAllergyIntoleranceTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_CATEGORY:
				return createAllergyIntoleranceCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_CRITICALITY:
				return createAllergyIntoleranceCriticalityFromString(eDataType, initialValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_SUBSTANCE_PRODUCT_CONDITION_AND_NEGATION_CODES:
				return createAllergyIntoleranceSubstanceProductConditionAndNegationCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_CERTAINTY:
				return createAllergyIntoleranceCertaintyFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_CLINICAL_FINDINGS:
				return createSnomedCtClinicalFindingsFromString(eDataType, initialValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_SEVERITY:
				return createAllergyIntoleranceSeverityFromString(eDataType, initialValue);
			case ValueSetsPackage.INVESTIGATION_TYPE:
				return createInvestigationTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.OBSERVATION_STATUS:
				return createObservationStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.OBSERVATION_CATEGORY_CODES:
				return createObservationCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.OBSERVATION_VALUE_ABSENT_REASON:
				return createObservationValueAbsentReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.OBSERVATION_INTERPRETATION_CODES:
				return createObservationInterpretationCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.OBSERVATION_METHODS:
				return createObservationMethodsFromString(eDataType, initialValue);
			case ValueSetsPackage.SPECIMEN_STATUS:
				return createSpecimenStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.V2_SPECIMEN_TYPE:
				return createV2SpecimenTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.REQUEST_STATUS:
				return createRequestStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.REQUEST_INTENT:
				return createRequestIntentFromString(eDataType, initialValue);
			case ValueSetsPackage.REQUEST_PRIORITY:
				return createRequestPriorityFromString(eDataType, initialValue);
			case ValueSetsPackage.LOINC_DIAGNOSTIC_REQUEST_CODES:
				return createLoincDiagnosticRequestCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PARTICIPANT_ROLES:
				return createParticipantRolesFromString(eDataType, initialValue);
			case ValueSetsPackage.PURPOSE_OF_USE:
				return createPurposeOfUseFromString(eDataType, initialValue);
			case ValueSetsPackage.PROVENANCE_EVENT_CURRENT_STATE:
				return createProvenanceEventCurrentStateFromString(eDataType, initialValue);
			case ValueSetsPackage.PROVENANCE_PARTICIPANT_ROLE:
				return createProvenanceParticipantRoleFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_CODE_SYSTEM_ROLE_LINK_TYPE:
				return createV3CodeSystemRoleLinkTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PROVENANCE_ENTITY_ROLE:
				return createProvenanceEntityRoleFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_CODESSNOMED_CT:
				return createProcedureCodessnomedCTFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_REASON_CODES:
				return createProcedureReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_REQUEST_STATUS:
				return createProcedureRequestStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_REQUEST_PRIORITY:
				return createProcedureRequestPriorityFromString(eDataType, initialValue);
			case ValueSetsPackage.SPECIMEN_COLLECTION_METHOD:
				return createSpecimenCollectionMethodFromString(eDataType, initialValue);
			case ValueSetsPackage.SPECIMEN_TREATMENT_PROCEDURE:
				return createSpecimenTreatmentProcedureFromString(eDataType, initialValue);
			case ValueSetsPackage.SPECIMEN_CONTAINER:
				return createSpecimenContainerFromString(eDataType, initialValue);
			case ValueSetsPackage.V2_ADDITIVE_PRESERVATIVE:
				return createV2AdditivePreservativeFromString(eDataType, initialValue);
			case ValueSetsPackage.MEASMNT_PRINCIPLE:
				return createMeasmntPrincipleFromString(eDataType, initialValue);
			case ValueSetsPackage.DEVICE_METRIC_OPERATIONAL_STATUS:
				return createDeviceMetricOperationalStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.DEVICE_METRIC_COLOR:
				return createDeviceMetricColorFromString(eDataType, initialValue);
			case ValueSetsPackage.DEVICE_METRIC_CATEGORY:
				return createDeviceMetricCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.DEVICE_METRIC_CALIBRATION_TYPE:
				return createDeviceMetricCalibrationTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.DEVICE_METRIC_CALIBRATION_STATE:
				return createDeviceMetricCalibrationStateFromString(eDataType, initialValue);
			case ValueSetsPackage.OBSERVATION_REFERENCE_RANGE_MEANING_CODES:
				return createObservationReferenceRangeMeaningCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.OBSERVATION_RELATIONSHIP_TYPE:
				return createObservationRelationshipTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CARE_PLAN_STATUS:
				return createCarePlanStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.CARE_PLAN_CATEGORY:
				return createCarePlanCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.QUESTIONNAIRE_STATUS:
				return createQuestionnaireStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTEXT_OF_USE_VALUE_SET:
				return createContextOfUseValueSetFromString(eDataType, initialValue);
			case ValueSetsPackage.QUESTIONNAIRE_QUESTION_CODES:
				return createQuestionnaireQuestionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.QUESTIONNAIRE_ITEM_TYPE:
				return createQuestionnaireItemTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.QUESTIONNAIRE_ANSWER_CODES:
				return createQuestionnaireAnswerCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CARE_PLAN_RELATIONSHIP:
				return createCarePlanRelationshipFromString(eDataType, initialValue);
			case ValueSetsPackage.GOAL_STATUS:
				return createGoalStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.GOAL_CATEGORY:
				return createGoalCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.GOAL_PRIORITY:
				return createGoalPriorityFromString(eDataType, initialValue);
			case ValueSetsPackage.GOAL_START_EVENT:
				return createGoalStartEventFromString(eDataType, initialValue);
			case ValueSetsPackage.GOAL_STATUS_REASON:
				return createGoalStatusReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_STATEMENT_STATUS:
				return createMedicationStatementStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_STATEMENT_NOT_TAKEN:
				return createMedicationStatementNotTakenFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_DRUGS_NOT_TAKENCOMPLETED_CODES:
				return createSnomedCtDrugsNotTakencompletedCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_STATEMENT_CATEGORY:
				return createMedicationStatementCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.NUTRITION_ORDER_STATUS:
				return createNutritionOrderStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.DIET:
				return createDietFromString(eDataType, initialValue);
			case ValueSetsPackage.FOOD_TYPE_CODES:
				return createFoodTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.DIET_CODES:
				return createDietCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.NUTRIENT_MODIFIER_CODES:
				return createNutrientModifierCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.TEXTURE_MODIFIER_CODES:
				return createTextureModifierCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.TEXTURE_MODIFIED_FOOD_TYPE_CODES:
				return createTextureModifiedFoodTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.FLUID_CONSISTENCY_TYPE_CODES:
				return createFluidConsistencyTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SUPPLEMENT_TYPE_CODES:
				return createSupplementTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ENTERAL_FORMULA_TYPE_CODES:
				return createEnteralFormulaTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ENTERAL_FORMULA_ADDITIVE_TYPE_CODE:
				return createEnteralFormulaAdditiveTypeCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.ENTERAL_ROUTE_CODES:
				return createEnteralRouteCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.RISK_PROBABILITY:
				return createRiskProbabilityFromString(eDataType, initialValue);
			case ValueSetsPackage.APPOINTMENT_STATUS:
				return createAppointmentStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.V2_APPOINTMENT_REASON_CODES:
				return createV2AppointmentReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ENCOUNTER_REASON_CODES:
				return createEncounterReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SLOT_STATUS:
				return createSlotStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.PARTICIPANT_TYPE:
				return createParticipantTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PARTICIPANT_REQUIRED:
				return createParticipantRequiredFromString(eDataType, initialValue);
			case ValueSetsPackage.PARTICIPATION_STATUS:
				return createParticipationStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_CODE_SYSTEM_PARTICIPATION_MODE:
				return createV3CodeSystemParticipationModeFromString(eDataType, initialValue);
			case ValueSetsPackage.COMMUNICATION_REQUEST_STATUS:
				return createCommunicationRequestStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_CODE_SYSTEM_ACT_REASON:
				return createV3CodeSystemActReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.REQUEST_STAGE:
				return createRequestStageFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_REQUEST_STATUS:
				return createMedicationRequestStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_REQUEST_STAGE:
				return createMedicationRequestStageFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_REQUEST_CATEGORY:
				return createMedicationRequestCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.SUBSTANCE_ADMIN_SUBSTITUTION_REASON:
				return createSubstanceAdminSubstitutionReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.FINANCIAL_RESOURCE_STATUS_CODES:
				return createFinancialResourceStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ACTION_LIST:
				return createActionListFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_VISION_PRESCRIPTION_PRODUCT_CODES:
				return createExampleVisionPrescriptionProductCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.VISION_EYES:
				return createVisionEyesFromString(eDataType, initialValue);
			case ValueSetsPackage.VISION_BASE:
				return createVisionBaseFromString(eDataType, initialValue);
			case ValueSetsPackage.CARE_PLAN_ACTIVITY_CATEGORY:
				return createCarePlanActivityCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.CARE_PLAN_ACTIVITY:
				return createCarePlanActivityFromString(eDataType, initialValue);
			case ValueSetsPackage.ACTIVITY_REASON:
				return createActivityReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.CARE_PLAN_ACTIVITY_STATUS:
				return createCarePlanActivityStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.REFERRAL_STATUS:
				return createReferralStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.REFERRAL_CATEGORY:
				return createReferralCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_STATUS:
				return createProcedureStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_CATEGORY_CODESSNOMED_CT:
				return createProcedureCategoryCodessnomedCTFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_PERFORMER_ROLE_CODES:
				return createProcedurePerformerRoleCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_NOT_PERFORMED_REASONSNOME_DCT:
				return createProcedureNotPerformedReasonsnomeDCTFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_OUTCOME_CODESSNOMED_CT:
				return createProcedureOutcomeCodessnomedCTFromString(eDataType, initialValue);
			case ValueSetsPackage.DIAGNOSTIC_REPORT_STATUS:
				return createDiagnosticReportStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.DIAGNOSTIC_SERVICE_SECTION_CODES:
				return createDiagnosticServiceSectionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.LOINC_DIAGNOSTIC_REPORT_CODES:
				return createLoincDiagnosticReportCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.INSTANCE_AVAILABILITY:
				return createInstanceAvailabilityFromString(eDataType, initialValue);
			case ValueSetsPackage.ACQUISITION_MODALITY_CODES:
				return createAcquisitionModalityCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.DWEB_TYPE:
				return createDWebTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.LATERALITY:
				return createLateralityFromString(eDataType, initialValue);
			case ValueSetsPackage.KO_STITLE:
				return createKoStitleFromString(eDataType, initialValue);
			case ValueSetsPackage.DIGITAL_MEDIA_TYPE:
				return createDigitalMediaTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDIA_SUB_TYPE:
				return createMediaSubTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDIA_COLLECTION_VIEW_PROJECTION:
				return createMediaCollectionViewProjectionFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_CLINICAL_FINDINGS:
				return createSnomedCtClinicalFindingsFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_FOLLOW_UP_CODESSNOMED_CT:
				return createProcedureFollowUpCodessnomedCTFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_DEVICE_ACTION_CODES:
				return createProcedureDeviceActionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_ADMINISTRATION_STATUS:
				return createMedicationAdministrationStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_REASON_MEDICATION_NOT_GIVEN_CODES:
				return createSnomedCtReasonMedicationNotGivenCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.REASON_MEDICATION_GIVEN_CODES:
				return createReasonMedicationGivenCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.QUESTIONNAIRE_RESPONSE_STATUS:
				return createQuestionnaireResponseStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.SEQUENCE_TYPE:
				return createSequenceTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CHROMOSOMEHUMAN:
				return createChromosomehumanFromString(eDataType, initialValue);
			case ValueSetsPackage.ENSEMBL:
				return createEnsemblFromString(eDataType, initialValue);
			case ValueSetsPackage.QUALITY_TYPE:
				return createQualityTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.REPOSITORY_TYPE:
				return createRepositoryTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.FAMILY_HISTORY_STATUS:
				return createFamilyHistoryStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.FAMILY_MEMBER:
				return createFamilyMemberFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITION_OUTCOME_CODES:
				return createConditionOutcomeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CLINICAL_IMPRESSION_PROGNOSIS:
				return createClinicalImpressionPrognosisFromString(eDataType, initialValue);
			case ValueSetsPackage.MANIFESTATION_AND_SYMPTOM_CODES:
				return createManifestationAndSymptomCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ACCOUNT_STATUS:
				return createAccountStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.COVERAGE_TYPE_CODES:
				return createCoverageTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.POLICYHOLDER_RELATIONSHIP_CODES:
				return createPolicyholderRelationshipCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_TYPE_CODES:
				return createContractTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_SUBTYPE_CODES:
				return createContractSubtypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_ACTION_CODES:
				return createContractActionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_ACTOR_ROLE_CODES:
				return createContractActorRoleCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_SIGNER_TYPE_CODES:
				return createContractSignerTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_TERM_TYPE_CODES:
				return createContractTermTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_TERM_TYPE_CODES:
				return createContractTermTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.FHIR_DOCUMENT_TYPE_CODES:
				return createFhirDocumentTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.FHIR_DOCUMENT_CLASS_CODES:
				return createFhirDocumentClassCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONFIDENTIALITY_CLASSIFICATION:
				return createConfidentialityClassificationFromString(eDataType, initialValue);
			case ValueSetsPackage.COMPOSITION_ATTESTATION_MODE:
				return createCompositionAttestationModeFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_CODE_SYSTEM_ACT_CODE:
				return createV3CodeSystemActCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.DOCUMENT_SECTION_CODES:
				return createDocumentSectionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.LIST_MODE:
				return createListModeFromString(eDataType, initialValue);
			case ValueSetsPackage.LIST_ORDER_CODES:
				return createListOrderCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.LIST_EMPTY_REASONS:
				return createListEmptyReasonsFromString(eDataType, initialValue);
			case ValueSetsPackage.ADMIT_SOURCE:
				return createAdmitSourceFromString(eDataType, initialValue);
			case ValueSetsPackage.V2_RE_ADMISSION_INDICATOR:
				return createV2ReAdmissionIndicatorFromString(eDataType, initialValue);
			case ValueSetsPackage.SPECIAL_COURTESY:
				return createSpecialCourtesyFromString(eDataType, initialValue);
			case ValueSetsPackage.SPECIAL_ARRANGEMENTS:
				return createSpecialArrangementsFromString(eDataType, initialValue);
			case ValueSetsPackage.DISCHARGE_DISPOSITION:
				return createDischargeDispositionFromString(eDataType, initialValue);
			case ValueSetsPackage.ENCOUNTER_LOCATION_STATUS:
				return createEncounterLocationStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.FACILITY_TYPE_CODE_VALUE_SET:
				return createFacilityTypeCodeValueSetFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_EXCEPT_TYPE:
				return createConsentExceptTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_ACTOR_ROLES:
				return createConsentActorRolesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_ACTION_CODES:
				return createConsentActionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_CONTENT_CLASS:
				return createConsentContentClassFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_CONTENT_CODES:
				return createConsentContentCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_DATA_MEANING:
				return createConsentDataMeaningFromString(eDataType, initialValue);
			case ValueSetsPackage.COMMUNICATION_STATUS:
				return createCommunicationStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.NAMING_SYSTEM_TYPE:
				return createNamingSystemTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.NAMING_SYSTEM_IDENTIFIER_TYPE:
				return createNamingSystemIdentifierTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CONCEPT_MAP_EQUIVALENCE:
				return createConceptMapEquivalenceFromString(eDataType, initialValue);
			case ValueSetsPackage.IDENTITY_ASSURANCE_LEVEL:
				return createIdentityAssuranceLevelFromString(eDataType, initialValue);
			case ValueSetsPackage.FLAG_CATEGORY:
				return createFlagCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.FLAG_STATUS:
				return createFlagStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.FLAG_CODE:
				return createFlagCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.CODE_SYSTEM_HIERARCHY_MEANING:
				return createCodeSystemHierarchyMeaningFromString(eDataType, initialValue);
			case ValueSetsPackage.CODE_SYSTEM_CONTENT_MODE:
				return createCodeSystemContentModeFromString(eDataType, initialValue);
			case ValueSetsPackage.PROPERTY_TYPE:
				return createPropertyTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CLAIM_PROCESSING_CODES:
				return createClaimProcessingCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PAYMENT_TYPE_CODES:
				return createPaymentTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.FORM_CODES:
				return createFormCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.NOTE_TYPE:
				return createNoteTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.TEST_SCRIPT_PROFILE_ORIGIN_TYPE:
				return createTestScriptProfileOriginTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.TEST_SCRIPT_PROFILE_DESTINATION_TYPE:
				return createTestScriptProfileDestinationTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CAPABILITY_STATEMENT_KIND:
				return createCapabilityStatementKindFromString(eDataType, initialValue);
			case ValueSetsPackage.UNKNOWN_CONTENT_CODE:
				return createUnknownContentCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.RESTFUL_CAPABILITY_MODE:
				return createRestfulCapabilityModeFromString(eDataType, initialValue);
			case ValueSetsPackage.RESTFUL_SECURITY_SERVICE:
				return createRestfulSecurityServiceFromString(eDataType, initialValue);
			case ValueSetsPackage.TYPE_RESTFUL_INTERACTION:
				return createTypeRestfulInteractionFromString(eDataType, initialValue);
			case ValueSetsPackage.RESOURCE_VERSION_POLICY:
				return createResourceVersionPolicyFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITIONAL_READ_STATUS:
				return createConditionalReadStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITIONAL_DELETE_STATUS:
				return createConditionalDeleteStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.REFERENCE_HANDLING_POLICY:
				return createReferenceHandlingPolicyFromString(eDataType, initialValue);
			case ValueSetsPackage.SEARCH_PARAM_TYPE:
				return createSearchParamTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.SYSTEM_RESTFUL_INTERACTION:
				return createSystemRestfulInteractionFromString(eDataType, initialValue);
			case ValueSetsPackage.OPERATION_KIND:
				return createOperationKindFromString(eDataType, initialValue);
			case ValueSetsPackage.MESSAGE_TRANSPORT:
				return createMessageTransportFromString(eDataType, initialValue);
			case ValueSetsPackage.MESSAGE_EVENT:
				return createMessageEventFromString(eDataType, initialValue);
			case ValueSetsPackage.MESSAGE_SIGNIFICANCE_CATEGORY:
				return createMessageSignificanceCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.EVENT_CAPABILITY_MODE:
				return createEventCapabilityModeFromString(eDataType, initialValue);
			case ValueSetsPackage.DOCUMENT_MODE:
				return createDocumentModeFromString(eDataType, initialValue);
			case ValueSetsPackage.TEST_SCRIPT_OPERATION_CODE:
				return createTestScriptOperationCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTENT_TYPE:
				return createContentTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.ASSERTION_DIRECTION_TYPE:
				return createAssertionDirectionTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.ASSERTION_OPERATOR_TYPE:
				return createAssertionOperatorTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.ASSERTION_RESPONSE_TYPES:
				return createAssertionResponseTypesFromString(eDataType, initialValue);
			case ValueSetsPackage.DATA_ELEMENT_STRINGENCY:
				return createDataElementStringencyFromString(eDataType, initialValue);
			case ValueSetsPackage.RESPONSE_TYPE:
				return createResponseTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.ISSUE_SEVERITY:
				return createIssueSeverityFromString(eDataType, initialValue);
			case ValueSetsPackage.ISSUE_TYPE:
				return createIssueTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.OPERATION_OUTCOME_CODES:
				return createOperationOutcomeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_MESSAGE_REASON_CODES:
				return createExampleMessageReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SUBSCRIPTION_STATUS:
				return createSubscriptionStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.SUBSCRIPTION_CHANNEL_TYPE:
				return createSubscriptionChannelTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.SUBSCRIPTION_TAG:
				return createSubscriptionTagFromString(eDataType, initialValue);
			case ValueSetsPackage.BODYSITE_LOCATION_MODIFIER:
				return createBodysiteLocationModifierFromString(eDataType, initialValue);
			case ValueSetsPackage.VACCINE_ADMINISTERED_VALUE_SET:
				return createVaccineAdministeredValueSetFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_RECOMMENDATION_STATUS_CODES:
				return createImmunizationRecommendationStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION_CODES:
				return createImmunizationRecommendationDateCriterionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_STATUS_CODES:
				return createImmunizationStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_ORIGIN:
				return createImmunizationOriginFromString(eDataType, initialValue);
			case ValueSetsPackage.CODES_FOR_IMMUNIZATION_SITE_OF_ADMINISTRATION:
				return createCodesForImmunizationSiteOfAdministrationFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_ROUTE_CODES:
				return createImmunizationRouteCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_REASON_CODES:
				return createImmunizationReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_REASONS_FOR_NOT_IMMUNIZING_CODES:
				return createImmunizationReasonsForNotImmunizingCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.VACCINATION_PROTOCOL_DOSE_TARGET_CODES:
				return createVaccinationProtocolDoseTargetCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.VACCINATION_PROTOCOL_DOSE_STATUS_CODES:
				return createVaccinationProtocolDoseStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.VACCINATION_PROTOCOL_DOSE_STATUS_REASON_CODES:
				return createVaccinationProtocolDoseStatusReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.BUNDLE_TYPE:
				return createBundleTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.SEARCH_ENTRY_MODE:
				return createSearchEntryModeFromString(eDataType, initialValue);
			case ValueSetsPackage.HTTP_VERB:
				return createHttpVerbFromString(eDataType, initialValue);
			case ValueSetsPackage.TEST_REPORT_STATUS:
				return createTestReportStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.TEST_REPORT_PARTICIPANT_TYPE:
				return createTestReportParticipantTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.TEST_REPORT_RESULT_CODES:
				return createTestReportResultCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PRIORITY_CODES:
				return createPriorityCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.BENEFIT_CATEGORY_CODES:
				return createBenefitCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.BENEFIT_SUB_CATEGORY_CODES:
				return createBenefitSubCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.NETWORK_TYPE_CODES:
				return createNetworkTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.UNIT_TYPE_CODES:
				return createUnitTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.BENEFIT_TERM_CODES:
				return createBenefitTermCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.BENEFIT_TYPE_CODES:
				return createBenefitTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ADJUDICATION_ERROR_CODES:
				return createAdjudicationErrorCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_DISPENSE_STATUS:
				return createMedicationDispenseStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.ACT_PHARMACY_SUPPLY_TYPE:
				return createActPharmacySupplyTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.ACT_SUBSTANCE_ADMIN_SUBSTITUTION_CODE:
				return createActSubstanceAdminSubstitutionCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.MEASURE_SCORING:
				return createMeasureScoringFromString(eDataType, initialValue);
			case ValueSetsPackage.COMPOSITE_MEASURE_SCORING:
				return createCompositeMeasureScoringFromString(eDataType, initialValue);
			case ValueSetsPackage.MEASURE_TYPE:
				return createMeasureTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.MEASURE_POPULATION_TYPE:
				return createMeasurePopulationTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.MEASURE_DATA_USAGE:
				return createMeasureDataUsageFromString(eDataType, initialValue);
			case ValueSetsPackage.MEASURE_REPORT_TYPE:
				return createMeasureReportTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.MEASURE_REPORT_STATUS:
				return createMeasureReportStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.LIST_STATUS:
				return createListStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_USE_CODES_FOR_LIST:
				return createExampleUseCodesForListFromString(eDataType, initialValue);
			case ValueSetsPackage.PATIENT_MEDICINE_CHANGE_TYPES:
				return createPatientMedicineChangeTypesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_CLAIM_TYPE_CODES:
				return createExampleClaimTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_CLAIM_SUB_TYPE_CODES:
				return createExampleClaimSubTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.USE:
				return createUseFromString(eDataType, initialValue);
			case ValueSetsPackage.FUNDS_RESERVATION_CODES:
				return createFundsReservationCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_RELATED_CLAIM_RELATIONSHIP_CODES:
				return createExampleRelatedClaimRelationshipCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PAYEE_TYPE_CODES:
				return createPayeeTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PAYEE_RESOURCE_TYPE:
				return createPayeeResourceTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CLAIM_CARE_TEAM_ROLE_CODES:
				return createClaimCareTeamRoleCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_PROVIDER_QUALIFICATION_CODES:
				return createExampleProviderQualificationCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CLAIM_INFORMATION_CATEGORY_CODES:
				return createClaimInformationCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXCEPTION_CODES:
				return createExceptionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MISSING_TOOTH_REASON_CODES:
				return createMissingToothReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IC_D10_CODES:
				return createIcD10CodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_DIAGNOSIS_TYPE_CODES:
				return createExampleDiagnosisTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_DIAGNOSIS_RELATED_GROUP_CODES:
				return createExampleDiagnosisRelatedGroupCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IC_D10_PROCEDURE_CODES:
				return createIcD10ProcedureCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ACT_INCIDENT_CODE:
				return createActIncidentCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_REVENUE_CENTER_CODES:
				return createExampleRevenueCenterCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.USCLS_CODES:
				return createUsclsCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MODIFIER_TYPE_CODES:
				return createModifierTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_PROGRAM_REASON_CODES:
				return createExampleProgramReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_SERVICE_PLACE_CODES:
				return createExampleServicePlaceCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ORAL_SITE_CODES:
				return createOralSiteCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SURFACE_CODES:
				return createSurfaceCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ORAL_PROSTHO_MATERIAL_TYPE_CODES:
				return createOralProsthoMaterialTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ADJUDICATION_CODES:
				return createAdjudicationCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ADJUDICATION_REASON_CODES:
				return createAdjudicationReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_PAYMENT_TYPE_CODES:
				return createExamplePaymentTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PAYMENT_ADJUSTMENT_REASON_CODES:
				return createPaymentAdjustmentReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.TASK_STATUS:
				return createTaskStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.TASK_PERFORMER_TYPE:
				return createTaskPerformerTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.EXPLANATION_OF_BENEFIT_STATUS:
				return createExplanationOfBenefitStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.PAYEE_RESOURCE_TYPE:
				return createPayeeResourceTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.ACT_INVOICE_GROUP_CODE:
				return createActInvoiceGroupCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.GUIDE_DEPENDENCY_TYPE:
				return createGuideDependencyTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.GUIDE_PAGE_KIND:
				return createGuidePageKindFromString(eDataType, initialValue);
			case ValueSetsPackage.XPATH_USAGE_TYPE:
				return createXPathUsageTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.SEARCH_COMPARATOR:
				return createSearchComparatorFromString(eDataType, initialValue);
			case ValueSetsPackage.SEARCH_MODIFIER_CODE:
				return createSearchModifierCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.SYSTEM_VERSION_PROCESSING_MODE:
				return createSystemVersionProcessingModeFromString(eDataType, initialValue);
			case ValueSetsPackage.COMPARTMENT_TYPE:
				return createCompartmentTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCESS_OUTCOME_CODES:
				return createProcessOutcomeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PAYMENT_STATUS_CODES:
				return createPaymentStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.LINKAGE_TYPE:
				return createLinkageTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.SUPPLY_REQUEST_STATUS:
				return createSupplyRequestStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.SUPPLY_TYPE:
				return createSupplyTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMED_CT_SUPPLY_ITEM:
				return createSnomedCtSupplyItemFromString(eDataType, initialValue);
			case ValueSetsPackage.SUPPLY_REQUEST_REASON:
				return createSupplyRequestReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.SUPPLY_REQUEST_WHEN:
				return createSupplyRequestWhenFromString(eDataType, initialValue);
			case ValueSetsPackage.GUIDANCE_RESPONSE_STATUS:
				return createGuidanceResponseStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.DETECTED_ISSUE_CATEGORY:
				return createDetectedIssueCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.DETECTED_ISSUE_SEVERITY:
				return createDetectedIssueSeverityFromString(eDataType, initialValue);
			case ValueSetsPackage.DETECTED_ISSUE_MITIGATION_ACTION:
				return createDetectedIssueMitigationActionFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_ID:
				return createAuditEventIdFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_SUB_TYPE:
				return createAuditEventSubTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_ACTION:
				return createAuditEventActionFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_OUTCOME:
				return createAuditEventOutcomeFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_AGENT_ROLE_ID_CODE:
				return createAuditAgentRoleIdCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDIA_TYPE_CODE:
				return createMediaTypeCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE:
				return createAuditEventAgentNetworkTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_SOURCE_TYPE:
				return createAuditEventSourceTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_ENTITY_TYPE:
				return createAuditEventEntityTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_ENTITY_ROLE:
				return createAuditEventEntityRoleFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_ENTITY_LIFECYCLE:
				return createAuditEventEntityLifecycleFromString(eDataType, initialValue);
			case ValueSetsPackage.BASIC_RESOURCE_TYPES:
				return createBasicResourceTypesFromString(eDataType, initialValue);
			case ValueSetsPackage.SUPPLY_DELIVERY_STATUS:
				return createSupplyDeliveryStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.SUPPLY_ITEM_TYPE:
				return createSupplyItemTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ValueSetsPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.RESOURCE_TYPE:
				return convertResourceTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.ADDRESS_USE:
				return convertAddressUseToString(eDataType, instanceValue);
			case ValueSetsPackage.ADDRESS_TYPE:
				return convertAddressTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.QUANTITY_COMPARATOR:
				return convertQuantityComparatorToString(eDataType, instanceValue);
			case ValueSetsPackage.ALL_SECURITY_LABELS:
				return convertAllSecurityLabelsToString(eDataType, instanceValue);
			case ValueSetsPackage.COMMON_TAGS:
				return convertCommonTagsToString(eDataType, instanceValue);
			case ValueSetsPackage.COMMON_LANGUAGES:
				return convertCommonLanguagesToString(eDataType, instanceValue);
			case ValueSetsPackage.NARRATIVE_STATUS:
				return convertNarrativeStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.IDENTIFIER_USE:
				return convertIdentifierUseToString(eDataType, instanceValue);
			case ValueSetsPackage.IDENTIFIER_TYPE_CODES:
				return convertIdentifierTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ORGANIZATION_TYPE:
				return convertOrganizationTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTACT_POINT_SYSTEM:
				return convertContactPointSystemToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTACT_POINT_USE:
				return convertContactPointUseToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTACT_ENTITY_TYPE:
				return convertContactEntityTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.NAME_USE:
				return convertNameUseToString(eDataType, instanceValue);
			case ValueSetsPackage.ENDPOINT_STATUS:
				return convertEndpointStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.ENDPOINT_CONNECTION_TYPE:
				return convertEndpointConnectionTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.ENDPOINT_PAYLOAD_TYPE:
				return convertEndpointPayloadTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.ADMINISTRATIVE_GENDER:
				return convertAdministrativeGenderToString(eDataType, instanceValue);
			case ValueSetsPackage.PRACTITIONER_ROLE:
				return convertPractitionerRoleToString(eDataType, instanceValue);
			case ValueSetsPackage.PRACTITIONER_SPECIALTY:
				return convertPractitionerSpecialtyToString(eDataType, instanceValue);
			case ValueSetsPackage.LOCATION_STATUS:
				return convertLocationStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.LOCATION_MODE:
				return convertLocationModeToString(eDataType, instanceValue);
			case ValueSetsPackage.SERVICE_DELIVERY_LOCATION_ROLE_TYPE:
				return convertServiceDeliveryLocationRoleTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.LOCATION_TYPE:
				return convertLocationTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.SERVICE_CATEGORY:
				return convertServiceCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.SERVICE_TYPE:
				return convertServiceTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PRACTICE_SETTING_CODE_VALUE_SET:
				return convertPracticeSettingCodeValueSetToString(eDataType, instanceValue);
			case ValueSetsPackage.SERVICE_PROVISION_CONDITIONS:
				return convertServiceProvisionConditionsToString(eDataType, instanceValue);
			case ValueSetsPackage.REFERRAL_METHOD:
				return convertReferralMethodToString(eDataType, instanceValue);
			case ValueSetsPackage.DAYS_OF_WEEK:
				return convertDaysOfWeekToString(eDataType, instanceValue);
			case ValueSetsPackage.ANZSCO_AUSTRALIAN_AND_NEW_ZEALAND_STANDARD_CLASSIFICATION_OF_OCCUPATIONS2013_VERSION12:
				return convertAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12ToString(eDataType, instanceValue);
			case ValueSetsPackage.MARITAL_STATUS_CODES:
				return convertMaritalStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.V2_CONTACT_ROLE:
				return convertV2ContactRoleToString(eDataType, instanceValue);
			case ValueSetsPackage.ANIMAL_SPECIES:
				return convertAnimalSpeciesToString(eDataType, instanceValue);
			case ValueSetsPackage.ANIMAL_BREEDS:
				return convertAnimalBreedsToString(eDataType, instanceValue);
			case ValueSetsPackage.GENDER_STATUS:
				return convertGenderStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.PATIENT_RELATIONSHIP_TYPE:
				return convertPatientRelationshipTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.LINK_TYPE:
				return convertLinkTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.SIGNATURE_TYPE_CODES:
				return convertSignatureTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.DEVICE_STATUS:
				return convertDeviceStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.DEVICE_TYPES:
				return convertDeviceTypesToString(eDataType, instanceValue);
			case ValueSetsPackage.UNITS_OF_TIME:
				return convertUnitsOfTimeToString(eDataType, instanceValue);
			case ValueSetsPackage.EVENT_TIMING:
				return convertEventTimingToString(eDataType, instanceValue);
			case ValueSetsPackage.TIMING_ABBREVIATION:
				return convertTimingAbbreviationToString(eDataType, instanceValue);
			case ValueSetsPackage.LIBRARY_TYPE:
				return convertLibraryTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PUBLICATION_STATUS:
				return convertPublicationStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.USAGE_CONTEXT_TYPE:
				return convertUsageContextTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.JURISDICTION_VALUE_SET:
				return convertJurisdictionValueSetToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRIBUTOR_TYPE:
				return convertContributorTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.RELATED_ARTIFACT_TYPE:
				return convertRelatedArtifactTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.OPERATION_PARAMETER_USE:
				return convertOperationParameterUseToString(eDataType, instanceValue);
			case ValueSetsPackage.FHIR_ALL_TYPES:
				return convertFhirAllTypesToString(eDataType, instanceValue);
			case ValueSetsPackage.STRUCTURE_DEFINITION_CODES:
				return convertStructureDefinitionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.STRUCTURE_DEFINITION_KIND:
				return convertStructureDefinitionKindToString(eDataType, instanceValue);
			case ValueSetsPackage.EXTENSION_CONTEXT:
				return convertExtensionContextToString(eDataType, instanceValue);
			case ValueSetsPackage.FHIR_DEFINED_TYPE:
				return convertFhirDefinedTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.TYPE_DERIVATION_RULE:
				return convertTypeDerivationRuleToString(eDataType, instanceValue);
			case ValueSetsPackage.PROPERTY_REPRESENTATION:
				return convertPropertyRepresentationToString(eDataType, instanceValue);
			case ValueSetsPackage.LOINC_CODES:
				return convertLoincCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SLICING_RULES:
				return convertSlicingRulesToString(eDataType, instanceValue);
			case ValueSetsPackage.AGGREGATION_MODE:
				return convertAggregationModeToString(eDataType, instanceValue);
			case ValueSetsPackage.REFERENCE_VERSION_RULES:
				return convertReferenceVersionRulesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSTRAINT_SEVERITY:
				return convertConstraintSeverityToString(eDataType, instanceValue);
			case ValueSetsPackage.BINDING_STRENGTH:
				return convertBindingStrengthToString(eDataType, instanceValue);
			case ValueSetsPackage.DESIGNATION_USE:
				return convertDesignationUseToString(eDataType, instanceValue);
			case ValueSetsPackage.FILTER_OPERATOR:
				return convertFilterOperatorToString(eDataType, instanceValue);
			case ValueSetsPackage.RESEARCH_SUBJECT_STATUS:
				return convertResearchSubjectStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.PLAN_DEFINITION_TYPE:
				return convertPlanDefinitionTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.TRIGGER_TYPE:
				return convertTriggerTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PLAN_ACTION_CONDITION_KIND:
				return convertPlanActionConditionKindToString(eDataType, instanceValue);
			case ValueSetsPackage.PLAN_ACTION_RELATIONSHIP_TYPE:
				return convertPlanActionRelationshipTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PLAN_ACTION_PARTICIPANT_TYPE:
				return convertPlanActionParticipantTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PLAN_ACTION_TYPE:
				return convertPlanActionTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PLAN_ACTION_GROUPING_BEHAVIOR:
				return convertPlanActionGroupingBehaviorToString(eDataType, instanceValue);
			case ValueSetsPackage.PLAN_ACTION_SELECTION_BEHAVIOR:
				return convertPlanActionSelectionBehaviorToString(eDataType, instanceValue);
			case ValueSetsPackage.PLAN_ACTION_REQUIRED_BEHAVIOR:
				return convertPlanActionRequiredBehaviorToString(eDataType, instanceValue);
			case ValueSetsPackage.PLAN_ACTION_PRECHECK_BEHAVIOR:
				return convertPlanActionPrecheckBehaviorToString(eDataType, instanceValue);
			case ValueSetsPackage.PLAN_ACTION_CARDINALITY_BEHAVIOR:
				return convertPlanActionCardinalityBehaviorToString(eDataType, instanceValue);
			case ValueSetsPackage.ACTIVITY_DEFINITION_CATEGORY:
				return convertActivityDefinitionCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_MEDICATION_CODES:
				return convertSnomedCtMedicationCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_FORM_CODES:
				return convertSnomedCtFormCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SUBSTANCE_CATEGORY_CODES:
				return convertSubstanceCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SUBSTANCE_CODE:
				return convertSubstanceCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_FORM_CODES:
				return convertSnomedCtFormCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_ADDITIONAL_DOSAGE_INSTRUCTIONS:
				return convertSnomedCtAdditionalDosageInstructionsToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_MEDICATION_AS_NEEDED_REASON_CODES:
				return convertSnomedCtMedicationAsNeededReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_ANATOMICAL_STRUCTURE_FOR_ADMINISTRATION_SITE_CODES:
				return convertSnomedCtAnatomicalStructureForAdministrationSiteCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_ROUTE_CODES:
				return convertSnomedCtRouteCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_ADMINISTRATION_METHOD_CODES:
				return convertSnomedCtAdministrationMethodCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_BODY_STRUCTURES:
				return convertSnomedCtBodyStructuresToString(eDataType, instanceValue);
			case ValueSetsPackage.STRUCTURE_MAP_MODEL_MODE:
				return convertStructureMapModelModeToString(eDataType, instanceValue);
			case ValueSetsPackage.STRUCTURE_MAP_INPUT_MODE:
				return convertStructureMapInputModeToString(eDataType, instanceValue);
			case ValueSetsPackage.STRUCTURE_MAP_CONTEXT_TYPE:
				return convertStructureMapContextTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.STRUCTURE_MAP_LIST_MODE:
				return convertStructureMapListModeToString(eDataType, instanceValue);
			case ValueSetsPackage.STRUCTURE_MAP_TRANSFORM:
				return convertStructureMapTransformToString(eDataType, instanceValue);
			case ValueSetsPackage.RESEARCH_STUDY_STATUS:
				return convertResearchStudyStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.GROUP_TYPE:
				return convertGroupTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_STATUS:
				return convertConsentStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_CATEGORY_CODES:
				return convertConsentCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.DOCUMENT_TYPE_VALUE_SET:
				return convertDocumentTypeValueSetToString(eDataType, instanceValue);
			case ValueSetsPackage.DOCUMENT_CLASS_VALUE_SET:
				return convertDocumentClassValueSetToString(eDataType, instanceValue);
			case ValueSetsPackage.DOCUMENT_REFERENCE_STATUS:
				return convertDocumentReferenceStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.COMPOSITION_STATUS:
				return convertCompositionStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.DOCUMENT_RELATIONSHIP_TYPE:
				return convertDocumentRelationshipTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.DOCUMENT_REFERENCE_FORMAT_CODE_SET:
				return convertDocumentReferenceFormatCodeSetToString(eDataType, instanceValue);
			case ValueSetsPackage.ENCOUNTER_STATUS:
				return convertEncounterStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.ACT_ENCOUNTER_CODE:
				return convertActEncounterCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.ENCOUNTER_TYPE:
				return convertEncounterTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_CODE_SYSTEM_ACT_PRIORITY:
				return convertV3CodeSystemActPriorityToString(eDataType, instanceValue);
			case ValueSetsPackage.EPISODE_OF_CARE_STATUS:
				return convertEpisodeOfCareStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITION_CLINICAL_STATUS_CODES:
				return convertConditionClinicalStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITION_VERIFICATION_STATUS:
				return convertConditionVerificationStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITION_CATEGORY_CODES:
				return convertConditionCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITION_DIAGNOSIS_SEVERITY:
				return convertConditionDiagnosisSeverityToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITION_PROBLEM_DIAGNOSIS_CODES:
				return convertConditionProblemDiagnosisCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITION_STAGE:
				return convertConditionStageToString(eDataType, instanceValue);
			case ValueSetsPackage.CLINICAL_IMPRESSION_STATUS:
				return convertClinicalImpressionStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_CLINICAL_STATUS:
				return convertAllergyIntoleranceClinicalStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_VERIFICATION_STATUS:
				return convertAllergyIntoleranceVerificationStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_TYPE:
				return convertAllergyIntoleranceTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_CATEGORY:
				return convertAllergyIntoleranceCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_CRITICALITY:
				return convertAllergyIntoleranceCriticalityToString(eDataType, instanceValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_SUBSTANCE_PRODUCT_CONDITION_AND_NEGATION_CODES:
				return convertAllergyIntoleranceSubstanceProductConditionAndNegationCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_CERTAINTY:
				return convertAllergyIntoleranceCertaintyToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_CLINICAL_FINDINGS:
				return convertSnomedCtClinicalFindingsToString(eDataType, instanceValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_SEVERITY:
				return convertAllergyIntoleranceSeverityToString(eDataType, instanceValue);
			case ValueSetsPackage.INVESTIGATION_TYPE:
				return convertInvestigationTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.OBSERVATION_STATUS:
				return convertObservationStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.OBSERVATION_CATEGORY_CODES:
				return convertObservationCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.OBSERVATION_VALUE_ABSENT_REASON:
				return convertObservationValueAbsentReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.OBSERVATION_INTERPRETATION_CODES:
				return convertObservationInterpretationCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.OBSERVATION_METHODS:
				return convertObservationMethodsToString(eDataType, instanceValue);
			case ValueSetsPackage.SPECIMEN_STATUS:
				return convertSpecimenStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.V2_SPECIMEN_TYPE:
				return convertV2SpecimenTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.REQUEST_STATUS:
				return convertRequestStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.REQUEST_INTENT:
				return convertRequestIntentToString(eDataType, instanceValue);
			case ValueSetsPackage.REQUEST_PRIORITY:
				return convertRequestPriorityToString(eDataType, instanceValue);
			case ValueSetsPackage.LOINC_DIAGNOSTIC_REQUEST_CODES:
				return convertLoincDiagnosticRequestCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PARTICIPANT_ROLES:
				return convertParticipantRolesToString(eDataType, instanceValue);
			case ValueSetsPackage.PURPOSE_OF_USE:
				return convertPurposeOfUseToString(eDataType, instanceValue);
			case ValueSetsPackage.PROVENANCE_EVENT_CURRENT_STATE:
				return convertProvenanceEventCurrentStateToString(eDataType, instanceValue);
			case ValueSetsPackage.PROVENANCE_PARTICIPANT_ROLE:
				return convertProvenanceParticipantRoleToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_CODE_SYSTEM_ROLE_LINK_TYPE:
				return convertV3CodeSystemRoleLinkTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PROVENANCE_ENTITY_ROLE:
				return convertProvenanceEntityRoleToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_CODESSNOMED_CT:
				return convertProcedureCodessnomedCTToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_REASON_CODES:
				return convertProcedureReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_REQUEST_STATUS:
				return convertProcedureRequestStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_REQUEST_PRIORITY:
				return convertProcedureRequestPriorityToString(eDataType, instanceValue);
			case ValueSetsPackage.SPECIMEN_COLLECTION_METHOD:
				return convertSpecimenCollectionMethodToString(eDataType, instanceValue);
			case ValueSetsPackage.SPECIMEN_TREATMENT_PROCEDURE:
				return convertSpecimenTreatmentProcedureToString(eDataType, instanceValue);
			case ValueSetsPackage.SPECIMEN_CONTAINER:
				return convertSpecimenContainerToString(eDataType, instanceValue);
			case ValueSetsPackage.V2_ADDITIVE_PRESERVATIVE:
				return convertV2AdditivePreservativeToString(eDataType, instanceValue);
			case ValueSetsPackage.MEASMNT_PRINCIPLE:
				return convertMeasmntPrincipleToString(eDataType, instanceValue);
			case ValueSetsPackage.DEVICE_METRIC_OPERATIONAL_STATUS:
				return convertDeviceMetricOperationalStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.DEVICE_METRIC_COLOR:
				return convertDeviceMetricColorToString(eDataType, instanceValue);
			case ValueSetsPackage.DEVICE_METRIC_CATEGORY:
				return convertDeviceMetricCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.DEVICE_METRIC_CALIBRATION_TYPE:
				return convertDeviceMetricCalibrationTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.DEVICE_METRIC_CALIBRATION_STATE:
				return convertDeviceMetricCalibrationStateToString(eDataType, instanceValue);
			case ValueSetsPackage.OBSERVATION_REFERENCE_RANGE_MEANING_CODES:
				return convertObservationReferenceRangeMeaningCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.OBSERVATION_RELATIONSHIP_TYPE:
				return convertObservationRelationshipTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CARE_PLAN_STATUS:
				return convertCarePlanStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.CARE_PLAN_CATEGORY:
				return convertCarePlanCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.QUESTIONNAIRE_STATUS:
				return convertQuestionnaireStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTEXT_OF_USE_VALUE_SET:
				return convertContextOfUseValueSetToString(eDataType, instanceValue);
			case ValueSetsPackage.QUESTIONNAIRE_QUESTION_CODES:
				return convertQuestionnaireQuestionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.QUESTIONNAIRE_ITEM_TYPE:
				return convertQuestionnaireItemTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.QUESTIONNAIRE_ANSWER_CODES:
				return convertQuestionnaireAnswerCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CARE_PLAN_RELATIONSHIP:
				return convertCarePlanRelationshipToString(eDataType, instanceValue);
			case ValueSetsPackage.GOAL_STATUS:
				return convertGoalStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.GOAL_CATEGORY:
				return convertGoalCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.GOAL_PRIORITY:
				return convertGoalPriorityToString(eDataType, instanceValue);
			case ValueSetsPackage.GOAL_START_EVENT:
				return convertGoalStartEventToString(eDataType, instanceValue);
			case ValueSetsPackage.GOAL_STATUS_REASON:
				return convertGoalStatusReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_STATEMENT_STATUS:
				return convertMedicationStatementStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_STATEMENT_NOT_TAKEN:
				return convertMedicationStatementNotTakenToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_DRUGS_NOT_TAKENCOMPLETED_CODES:
				return convertSnomedCtDrugsNotTakencompletedCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_STATEMENT_CATEGORY:
				return convertMedicationStatementCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.NUTRITION_ORDER_STATUS:
				return convertNutritionOrderStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.DIET:
				return convertDietToString(eDataType, instanceValue);
			case ValueSetsPackage.FOOD_TYPE_CODES:
				return convertFoodTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.DIET_CODES:
				return convertDietCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.NUTRIENT_MODIFIER_CODES:
				return convertNutrientModifierCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.TEXTURE_MODIFIER_CODES:
				return convertTextureModifierCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.TEXTURE_MODIFIED_FOOD_TYPE_CODES:
				return convertTextureModifiedFoodTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.FLUID_CONSISTENCY_TYPE_CODES:
				return convertFluidConsistencyTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SUPPLEMENT_TYPE_CODES:
				return convertSupplementTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ENTERAL_FORMULA_TYPE_CODES:
				return convertEnteralFormulaTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ENTERAL_FORMULA_ADDITIVE_TYPE_CODE:
				return convertEnteralFormulaAdditiveTypeCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.ENTERAL_ROUTE_CODES:
				return convertEnteralRouteCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.RISK_PROBABILITY:
				return convertRiskProbabilityToString(eDataType, instanceValue);
			case ValueSetsPackage.APPOINTMENT_STATUS:
				return convertAppointmentStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.V2_APPOINTMENT_REASON_CODES:
				return convertV2AppointmentReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ENCOUNTER_REASON_CODES:
				return convertEncounterReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SLOT_STATUS:
				return convertSlotStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.PARTICIPANT_TYPE:
				return convertParticipantTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PARTICIPANT_REQUIRED:
				return convertParticipantRequiredToString(eDataType, instanceValue);
			case ValueSetsPackage.PARTICIPATION_STATUS:
				return convertParticipationStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_CODE_SYSTEM_PARTICIPATION_MODE:
				return convertV3CodeSystemParticipationModeToString(eDataType, instanceValue);
			case ValueSetsPackage.COMMUNICATION_REQUEST_STATUS:
				return convertCommunicationRequestStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_CODE_SYSTEM_ACT_REASON:
				return convertV3CodeSystemActReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.REQUEST_STAGE:
				return convertRequestStageToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_REQUEST_STATUS:
				return convertMedicationRequestStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_REQUEST_STAGE:
				return convertMedicationRequestStageToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_REQUEST_CATEGORY:
				return convertMedicationRequestCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.SUBSTANCE_ADMIN_SUBSTITUTION_REASON:
				return convertSubstanceAdminSubstitutionReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.FINANCIAL_RESOURCE_STATUS_CODES:
				return convertFinancialResourceStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ACTION_LIST:
				return convertActionListToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_VISION_PRESCRIPTION_PRODUCT_CODES:
				return convertExampleVisionPrescriptionProductCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.VISION_EYES:
				return convertVisionEyesToString(eDataType, instanceValue);
			case ValueSetsPackage.VISION_BASE:
				return convertVisionBaseToString(eDataType, instanceValue);
			case ValueSetsPackage.CARE_PLAN_ACTIVITY_CATEGORY:
				return convertCarePlanActivityCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.CARE_PLAN_ACTIVITY:
				return convertCarePlanActivityToString(eDataType, instanceValue);
			case ValueSetsPackage.ACTIVITY_REASON:
				return convertActivityReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.CARE_PLAN_ACTIVITY_STATUS:
				return convertCarePlanActivityStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.REFERRAL_STATUS:
				return convertReferralStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.REFERRAL_CATEGORY:
				return convertReferralCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_STATUS:
				return convertProcedureStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_CATEGORY_CODESSNOMED_CT:
				return convertProcedureCategoryCodessnomedCTToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_PERFORMER_ROLE_CODES:
				return convertProcedurePerformerRoleCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_NOT_PERFORMED_REASONSNOME_DCT:
				return convertProcedureNotPerformedReasonsnomeDCTToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_OUTCOME_CODESSNOMED_CT:
				return convertProcedureOutcomeCodessnomedCTToString(eDataType, instanceValue);
			case ValueSetsPackage.DIAGNOSTIC_REPORT_STATUS:
				return convertDiagnosticReportStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.DIAGNOSTIC_SERVICE_SECTION_CODES:
				return convertDiagnosticServiceSectionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.LOINC_DIAGNOSTIC_REPORT_CODES:
				return convertLoincDiagnosticReportCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.INSTANCE_AVAILABILITY:
				return convertInstanceAvailabilityToString(eDataType, instanceValue);
			case ValueSetsPackage.ACQUISITION_MODALITY_CODES:
				return convertAcquisitionModalityCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.DWEB_TYPE:
				return convertDWebTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.LATERALITY:
				return convertLateralityToString(eDataType, instanceValue);
			case ValueSetsPackage.KO_STITLE:
				return convertKoStitleToString(eDataType, instanceValue);
			case ValueSetsPackage.DIGITAL_MEDIA_TYPE:
				return convertDigitalMediaTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDIA_SUB_TYPE:
				return convertMediaSubTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDIA_COLLECTION_VIEW_PROJECTION:
				return convertMediaCollectionViewProjectionToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_CLINICAL_FINDINGS:
				return convertSnomedCtClinicalFindingsToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_FOLLOW_UP_CODESSNOMED_CT:
				return convertProcedureFollowUpCodessnomedCTToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_DEVICE_ACTION_CODES:
				return convertProcedureDeviceActionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_ADMINISTRATION_STATUS:
				return convertMedicationAdministrationStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_REASON_MEDICATION_NOT_GIVEN_CODES:
				return convertSnomedCtReasonMedicationNotGivenCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.REASON_MEDICATION_GIVEN_CODES:
				return convertReasonMedicationGivenCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.QUESTIONNAIRE_RESPONSE_STATUS:
				return convertQuestionnaireResponseStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.SEQUENCE_TYPE:
				return convertSequenceTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CHROMOSOMEHUMAN:
				return convertChromosomehumanToString(eDataType, instanceValue);
			case ValueSetsPackage.ENSEMBL:
				return convertEnsemblToString(eDataType, instanceValue);
			case ValueSetsPackage.QUALITY_TYPE:
				return convertQualityTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.REPOSITORY_TYPE:
				return convertRepositoryTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.FAMILY_HISTORY_STATUS:
				return convertFamilyHistoryStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.FAMILY_MEMBER:
				return convertFamilyMemberToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITION_OUTCOME_CODES:
				return convertConditionOutcomeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CLINICAL_IMPRESSION_PROGNOSIS:
				return convertClinicalImpressionPrognosisToString(eDataType, instanceValue);
			case ValueSetsPackage.MANIFESTATION_AND_SYMPTOM_CODES:
				return convertManifestationAndSymptomCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ACCOUNT_STATUS:
				return convertAccountStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.COVERAGE_TYPE_CODES:
				return convertCoverageTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.POLICYHOLDER_RELATIONSHIP_CODES:
				return convertPolicyholderRelationshipCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_TYPE_CODES:
				return convertContractTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_SUBTYPE_CODES:
				return convertContractSubtypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_ACTION_CODES:
				return convertContractActionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_ACTOR_ROLE_CODES:
				return convertContractActorRoleCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_SIGNER_TYPE_CODES:
				return convertContractSignerTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_TERM_TYPE_CODES:
				return convertContractTermTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_TERM_TYPE_CODES:
				return convertContractTermTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.FHIR_DOCUMENT_TYPE_CODES:
				return convertFhirDocumentTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.FHIR_DOCUMENT_CLASS_CODES:
				return convertFhirDocumentClassCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONFIDENTIALITY_CLASSIFICATION:
				return convertConfidentialityClassificationToString(eDataType, instanceValue);
			case ValueSetsPackage.COMPOSITION_ATTESTATION_MODE:
				return convertCompositionAttestationModeToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_CODE_SYSTEM_ACT_CODE:
				return convertV3CodeSystemActCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.DOCUMENT_SECTION_CODES:
				return convertDocumentSectionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.LIST_MODE:
				return convertListModeToString(eDataType, instanceValue);
			case ValueSetsPackage.LIST_ORDER_CODES:
				return convertListOrderCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.LIST_EMPTY_REASONS:
				return convertListEmptyReasonsToString(eDataType, instanceValue);
			case ValueSetsPackage.ADMIT_SOURCE:
				return convertAdmitSourceToString(eDataType, instanceValue);
			case ValueSetsPackage.V2_RE_ADMISSION_INDICATOR:
				return convertV2ReAdmissionIndicatorToString(eDataType, instanceValue);
			case ValueSetsPackage.SPECIAL_COURTESY:
				return convertSpecialCourtesyToString(eDataType, instanceValue);
			case ValueSetsPackage.SPECIAL_ARRANGEMENTS:
				return convertSpecialArrangementsToString(eDataType, instanceValue);
			case ValueSetsPackage.DISCHARGE_DISPOSITION:
				return convertDischargeDispositionToString(eDataType, instanceValue);
			case ValueSetsPackage.ENCOUNTER_LOCATION_STATUS:
				return convertEncounterLocationStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.FACILITY_TYPE_CODE_VALUE_SET:
				return convertFacilityTypeCodeValueSetToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_EXCEPT_TYPE:
				return convertConsentExceptTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_ACTOR_ROLES:
				return convertConsentActorRolesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_ACTION_CODES:
				return convertConsentActionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_CONTENT_CLASS:
				return convertConsentContentClassToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_CONTENT_CODES:
				return convertConsentContentCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_DATA_MEANING:
				return convertConsentDataMeaningToString(eDataType, instanceValue);
			case ValueSetsPackage.COMMUNICATION_STATUS:
				return convertCommunicationStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.NAMING_SYSTEM_TYPE:
				return convertNamingSystemTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.NAMING_SYSTEM_IDENTIFIER_TYPE:
				return convertNamingSystemIdentifierTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CONCEPT_MAP_EQUIVALENCE:
				return convertConceptMapEquivalenceToString(eDataType, instanceValue);
			case ValueSetsPackage.IDENTITY_ASSURANCE_LEVEL:
				return convertIdentityAssuranceLevelToString(eDataType, instanceValue);
			case ValueSetsPackage.FLAG_CATEGORY:
				return convertFlagCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.FLAG_STATUS:
				return convertFlagStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.FLAG_CODE:
				return convertFlagCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.CODE_SYSTEM_HIERARCHY_MEANING:
				return convertCodeSystemHierarchyMeaningToString(eDataType, instanceValue);
			case ValueSetsPackage.CODE_SYSTEM_CONTENT_MODE:
				return convertCodeSystemContentModeToString(eDataType, instanceValue);
			case ValueSetsPackage.PROPERTY_TYPE:
				return convertPropertyTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CLAIM_PROCESSING_CODES:
				return convertClaimProcessingCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PAYMENT_TYPE_CODES:
				return convertPaymentTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.FORM_CODES:
				return convertFormCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.NOTE_TYPE:
				return convertNoteTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.TEST_SCRIPT_PROFILE_ORIGIN_TYPE:
				return convertTestScriptProfileOriginTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.TEST_SCRIPT_PROFILE_DESTINATION_TYPE:
				return convertTestScriptProfileDestinationTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CAPABILITY_STATEMENT_KIND:
				return convertCapabilityStatementKindToString(eDataType, instanceValue);
			case ValueSetsPackage.UNKNOWN_CONTENT_CODE:
				return convertUnknownContentCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.RESTFUL_CAPABILITY_MODE:
				return convertRestfulCapabilityModeToString(eDataType, instanceValue);
			case ValueSetsPackage.RESTFUL_SECURITY_SERVICE:
				return convertRestfulSecurityServiceToString(eDataType, instanceValue);
			case ValueSetsPackage.TYPE_RESTFUL_INTERACTION:
				return convertTypeRestfulInteractionToString(eDataType, instanceValue);
			case ValueSetsPackage.RESOURCE_VERSION_POLICY:
				return convertResourceVersionPolicyToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITIONAL_READ_STATUS:
				return convertConditionalReadStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITIONAL_DELETE_STATUS:
				return convertConditionalDeleteStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.REFERENCE_HANDLING_POLICY:
				return convertReferenceHandlingPolicyToString(eDataType, instanceValue);
			case ValueSetsPackage.SEARCH_PARAM_TYPE:
				return convertSearchParamTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.SYSTEM_RESTFUL_INTERACTION:
				return convertSystemRestfulInteractionToString(eDataType, instanceValue);
			case ValueSetsPackage.OPERATION_KIND:
				return convertOperationKindToString(eDataType, instanceValue);
			case ValueSetsPackage.MESSAGE_TRANSPORT:
				return convertMessageTransportToString(eDataType, instanceValue);
			case ValueSetsPackage.MESSAGE_EVENT:
				return convertMessageEventToString(eDataType, instanceValue);
			case ValueSetsPackage.MESSAGE_SIGNIFICANCE_CATEGORY:
				return convertMessageSignificanceCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.EVENT_CAPABILITY_MODE:
				return convertEventCapabilityModeToString(eDataType, instanceValue);
			case ValueSetsPackage.DOCUMENT_MODE:
				return convertDocumentModeToString(eDataType, instanceValue);
			case ValueSetsPackage.TEST_SCRIPT_OPERATION_CODE:
				return convertTestScriptOperationCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTENT_TYPE:
				return convertContentTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.ASSERTION_DIRECTION_TYPE:
				return convertAssertionDirectionTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.ASSERTION_OPERATOR_TYPE:
				return convertAssertionOperatorTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.ASSERTION_RESPONSE_TYPES:
				return convertAssertionResponseTypesToString(eDataType, instanceValue);
			case ValueSetsPackage.DATA_ELEMENT_STRINGENCY:
				return convertDataElementStringencyToString(eDataType, instanceValue);
			case ValueSetsPackage.RESPONSE_TYPE:
				return convertResponseTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.ISSUE_SEVERITY:
				return convertIssueSeverityToString(eDataType, instanceValue);
			case ValueSetsPackage.ISSUE_TYPE:
				return convertIssueTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.OPERATION_OUTCOME_CODES:
				return convertOperationOutcomeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_MESSAGE_REASON_CODES:
				return convertExampleMessageReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SUBSCRIPTION_STATUS:
				return convertSubscriptionStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.SUBSCRIPTION_CHANNEL_TYPE:
				return convertSubscriptionChannelTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.SUBSCRIPTION_TAG:
				return convertSubscriptionTagToString(eDataType, instanceValue);
			case ValueSetsPackage.BODYSITE_LOCATION_MODIFIER:
				return convertBodysiteLocationModifierToString(eDataType, instanceValue);
			case ValueSetsPackage.VACCINE_ADMINISTERED_VALUE_SET:
				return convertVaccineAdministeredValueSetToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_RECOMMENDATION_STATUS_CODES:
				return convertImmunizationRecommendationStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION_CODES:
				return convertImmunizationRecommendationDateCriterionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_STATUS_CODES:
				return convertImmunizationStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_ORIGIN:
				return convertImmunizationOriginToString(eDataType, instanceValue);
			case ValueSetsPackage.CODES_FOR_IMMUNIZATION_SITE_OF_ADMINISTRATION:
				return convertCodesForImmunizationSiteOfAdministrationToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_ROUTE_CODES:
				return convertImmunizationRouteCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_REASON_CODES:
				return convertImmunizationReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_REASONS_FOR_NOT_IMMUNIZING_CODES:
				return convertImmunizationReasonsForNotImmunizingCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.VACCINATION_PROTOCOL_DOSE_TARGET_CODES:
				return convertVaccinationProtocolDoseTargetCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.VACCINATION_PROTOCOL_DOSE_STATUS_CODES:
				return convertVaccinationProtocolDoseStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.VACCINATION_PROTOCOL_DOSE_STATUS_REASON_CODES:
				return convertVaccinationProtocolDoseStatusReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.BUNDLE_TYPE:
				return convertBundleTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.SEARCH_ENTRY_MODE:
				return convertSearchEntryModeToString(eDataType, instanceValue);
			case ValueSetsPackage.HTTP_VERB:
				return convertHttpVerbToString(eDataType, instanceValue);
			case ValueSetsPackage.TEST_REPORT_STATUS:
				return convertTestReportStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.TEST_REPORT_PARTICIPANT_TYPE:
				return convertTestReportParticipantTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.TEST_REPORT_RESULT_CODES:
				return convertTestReportResultCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PRIORITY_CODES:
				return convertPriorityCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.BENEFIT_CATEGORY_CODES:
				return convertBenefitCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.BENEFIT_SUB_CATEGORY_CODES:
				return convertBenefitSubCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.NETWORK_TYPE_CODES:
				return convertNetworkTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.UNIT_TYPE_CODES:
				return convertUnitTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.BENEFIT_TERM_CODES:
				return convertBenefitTermCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.BENEFIT_TYPE_CODES:
				return convertBenefitTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ADJUDICATION_ERROR_CODES:
				return convertAdjudicationErrorCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_DISPENSE_STATUS:
				return convertMedicationDispenseStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.ACT_PHARMACY_SUPPLY_TYPE:
				return convertActPharmacySupplyTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.ACT_SUBSTANCE_ADMIN_SUBSTITUTION_CODE:
				return convertActSubstanceAdminSubstitutionCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.MEASURE_SCORING:
				return convertMeasureScoringToString(eDataType, instanceValue);
			case ValueSetsPackage.COMPOSITE_MEASURE_SCORING:
				return convertCompositeMeasureScoringToString(eDataType, instanceValue);
			case ValueSetsPackage.MEASURE_TYPE:
				return convertMeasureTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.MEASURE_POPULATION_TYPE:
				return convertMeasurePopulationTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.MEASURE_DATA_USAGE:
				return convertMeasureDataUsageToString(eDataType, instanceValue);
			case ValueSetsPackage.MEASURE_REPORT_TYPE:
				return convertMeasureReportTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.MEASURE_REPORT_STATUS:
				return convertMeasureReportStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.LIST_STATUS:
				return convertListStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_USE_CODES_FOR_LIST:
				return convertExampleUseCodesForListToString(eDataType, instanceValue);
			case ValueSetsPackage.PATIENT_MEDICINE_CHANGE_TYPES:
				return convertPatientMedicineChangeTypesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_CLAIM_TYPE_CODES:
				return convertExampleClaimTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_CLAIM_SUB_TYPE_CODES:
				return convertExampleClaimSubTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.USE:
				return convertUseToString(eDataType, instanceValue);
			case ValueSetsPackage.FUNDS_RESERVATION_CODES:
				return convertFundsReservationCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_RELATED_CLAIM_RELATIONSHIP_CODES:
				return convertExampleRelatedClaimRelationshipCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PAYEE_TYPE_CODES:
				return convertPayeeTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PAYEE_RESOURCE_TYPE:
				return convertPayeeResourceTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CLAIM_CARE_TEAM_ROLE_CODES:
				return convertClaimCareTeamRoleCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_PROVIDER_QUALIFICATION_CODES:
				return convertExampleProviderQualificationCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CLAIM_INFORMATION_CATEGORY_CODES:
				return convertClaimInformationCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXCEPTION_CODES:
				return convertExceptionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MISSING_TOOTH_REASON_CODES:
				return convertMissingToothReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IC_D10_CODES:
				return convertIcD10CodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_DIAGNOSIS_TYPE_CODES:
				return convertExampleDiagnosisTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_DIAGNOSIS_RELATED_GROUP_CODES:
				return convertExampleDiagnosisRelatedGroupCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IC_D10_PROCEDURE_CODES:
				return convertIcD10ProcedureCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ACT_INCIDENT_CODE:
				return convertActIncidentCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_REVENUE_CENTER_CODES:
				return convertExampleRevenueCenterCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.USCLS_CODES:
				return convertUsclsCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MODIFIER_TYPE_CODES:
				return convertModifierTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_PROGRAM_REASON_CODES:
				return convertExampleProgramReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_SERVICE_PLACE_CODES:
				return convertExampleServicePlaceCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ORAL_SITE_CODES:
				return convertOralSiteCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SURFACE_CODES:
				return convertSurfaceCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ORAL_PROSTHO_MATERIAL_TYPE_CODES:
				return convertOralProsthoMaterialTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ADJUDICATION_CODES:
				return convertAdjudicationCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ADJUDICATION_REASON_CODES:
				return convertAdjudicationReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_PAYMENT_TYPE_CODES:
				return convertExamplePaymentTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PAYMENT_ADJUSTMENT_REASON_CODES:
				return convertPaymentAdjustmentReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.TASK_STATUS:
				return convertTaskStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.TASK_PERFORMER_TYPE:
				return convertTaskPerformerTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.EXPLANATION_OF_BENEFIT_STATUS:
				return convertExplanationOfBenefitStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.PAYEE_RESOURCE_TYPE:
				return convertPayeeResourceTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.ACT_INVOICE_GROUP_CODE:
				return convertActInvoiceGroupCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.GUIDE_DEPENDENCY_TYPE:
				return convertGuideDependencyTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.GUIDE_PAGE_KIND:
				return convertGuidePageKindToString(eDataType, instanceValue);
			case ValueSetsPackage.XPATH_USAGE_TYPE:
				return convertXPathUsageTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.SEARCH_COMPARATOR:
				return convertSearchComparatorToString(eDataType, instanceValue);
			case ValueSetsPackage.SEARCH_MODIFIER_CODE:
				return convertSearchModifierCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.SYSTEM_VERSION_PROCESSING_MODE:
				return convertSystemVersionProcessingModeToString(eDataType, instanceValue);
			case ValueSetsPackage.COMPARTMENT_TYPE:
				return convertCompartmentTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCESS_OUTCOME_CODES:
				return convertProcessOutcomeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PAYMENT_STATUS_CODES:
				return convertPaymentStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.LINKAGE_TYPE:
				return convertLinkageTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.SUPPLY_REQUEST_STATUS:
				return convertSupplyRequestStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.SUPPLY_TYPE:
				return convertSupplyTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMED_CT_SUPPLY_ITEM:
				return convertSnomedCtSupplyItemToString(eDataType, instanceValue);
			case ValueSetsPackage.SUPPLY_REQUEST_REASON:
				return convertSupplyRequestReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.SUPPLY_REQUEST_WHEN:
				return convertSupplyRequestWhenToString(eDataType, instanceValue);
			case ValueSetsPackage.GUIDANCE_RESPONSE_STATUS:
				return convertGuidanceResponseStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.DETECTED_ISSUE_CATEGORY:
				return convertDetectedIssueCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.DETECTED_ISSUE_SEVERITY:
				return convertDetectedIssueSeverityToString(eDataType, instanceValue);
			case ValueSetsPackage.DETECTED_ISSUE_MITIGATION_ACTION:
				return convertDetectedIssueMitigationActionToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_ID:
				return convertAuditEventIdToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_SUB_TYPE:
				return convertAuditEventSubTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_ACTION:
				return convertAuditEventActionToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_OUTCOME:
				return convertAuditEventOutcomeToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_AGENT_ROLE_ID_CODE:
				return convertAuditAgentRoleIdCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDIA_TYPE_CODE:
				return convertMediaTypeCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE:
				return convertAuditEventAgentNetworkTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_SOURCE_TYPE:
				return convertAuditEventSourceTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_ENTITY_TYPE:
				return convertAuditEventEntityTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_ENTITY_ROLE:
				return convertAuditEventEntityRoleToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_ENTITY_LIFECYCLE:
				return convertAuditEventEntityLifecycleToString(eDataType, instanceValue);
			case ValueSetsPackage.BASIC_RESOURCE_TYPES:
				return convertBasicResourceTypesToString(eDataType, instanceValue);
			case ValueSetsPackage.SUPPLY_DELIVERY_STATUS:
				return convertSupplyDeliveryStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.SUPPLY_ITEM_TYPE:
				return convertSupplyItemTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceTypeFromString(EDataType eDataType, String initialValue) {
		ResourceType result = ResourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUse createAddressUseFromString(EDataType eDataType, String initialValue) {
		AddressUse result = AddressUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType createAddressTypeFromString(EDataType eDataType, String initialValue) {
		AddressType result = AddressType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparator createQuantityComparatorFromString(EDataType eDataType, String initialValue) {
		QuantityComparator result = QuantityComparator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityComparatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllSecurityLabels createAllSecurityLabelsFromString(EDataType eDataType, String initialValue) {
		AllSecurityLabels result = AllSecurityLabels.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllSecurityLabelsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonTags createCommonTagsFromString(EDataType eDataType, String initialValue) {
		CommonTags result = CommonTags.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommonTagsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonLanguages createCommonLanguagesFromString(EDataType eDataType, String initialValue) {
		CommonLanguages result = CommonLanguages.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommonLanguagesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatus createNarrativeStatusFromString(EDataType eDataType, String initialValue) {
		NarrativeStatus result = NarrativeStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNarrativeStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUse createIdentifierUseFromString(EDataType eDataType, String initialValue) {
		IdentifierUse result = IdentifierUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierTypeCodes createIdentifierTypeCodesFromString(EDataType eDataType, String initialValue) {
		IdentifierTypeCodes result = IdentifierTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationType createOrganizationTypeFromString(EDataType eDataType, String initialValue) {
		OrganizationType result = OrganizationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrganizationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystem createContactPointSystemFromString(EDataType eDataType, String initialValue) {
		ContactPointSystem result = ContactPointSystem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointSystemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUse createContactPointUseFromString(EDataType eDataType, String initialValue) {
		ContactPointUse result = ContactPointUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactEntityType createContactEntityTypeFromString(EDataType eDataType, String initialValue) {
		ContactEntityType result = ContactEntityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactEntityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUse createNameUseFromString(EDataType eDataType, String initialValue) {
		NameUse result = NameUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointStatus createEndpointStatusFromString(EDataType eDataType, String initialValue) {
		EndpointStatus result = EndpointStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointConnectionType createEndpointConnectionTypeFromString(EDataType eDataType, String initialValue) {
		EndpointConnectionType result = EndpointConnectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointConnectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointPayloadType createEndpointPayloadTypeFromString(EDataType eDataType, String initialValue) {
		EndpointPayloadType result = EndpointPayloadType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointPayloadTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGender createAdministrativeGenderFromString(EDataType eDataType, String initialValue) {
		AdministrativeGender result = AdministrativeGender.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrativeGenderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRole createPractitionerRoleFromString(EDataType eDataType, String initialValue) {
		PractitionerRole result = PractitionerRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPractitionerRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerSpecialty createPractitionerSpecialtyFromString(EDataType eDataType, String initialValue) {
		PractitionerSpecialty result = PractitionerSpecialty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPractitionerSpecialtyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatus createLocationStatusFromString(EDataType eDataType, String initialValue) {
		LocationStatus result = LocationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationMode createLocationModeFromString(EDataType eDataType, String initialValue) {
		LocationMode result = LocationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryLocationRoleType createServiceDeliveryLocationRoleTypeFromString(EDataType eDataType, String initialValue) {
		ServiceDeliveryLocationRoleType result = ServiceDeliveryLocationRoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceDeliveryLocationRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationTypeFromString(EDataType eDataType, String initialValue) {
		LocationType result = LocationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCategory createServiceCategoryFromString(EDataType eDataType, String initialValue) {
		ServiceCategory result = ServiceCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceTypeFromString(EDataType eDataType, String initialValue) {
		ServiceType result = ServiceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PracticeSettingCodeValueSet createPracticeSettingCodeValueSetFromString(EDataType eDataType, String initialValue) {
		PracticeSettingCodeValueSet result = PracticeSettingCodeValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPracticeSettingCodeValueSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProvisionConditions createServiceProvisionConditionsFromString(EDataType eDataType, String initialValue) {
		ServiceProvisionConditions result = ServiceProvisionConditions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceProvisionConditionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralMethod createReferralMethodFromString(EDataType eDataType, String initialValue) {
		ReferralMethod result = ReferralMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferralMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaysOfWeek createDaysOfWeekFromString(EDataType eDataType, String initialValue) {
		DaysOfWeek result = DaysOfWeek.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaysOfWeekToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12 createAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12FromString(EDataType eDataType, String initialValue) {
		AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12 result = AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaritalStatusCodes createMaritalStatusCodesFromString(EDataType eDataType, String initialValue) {
		MaritalStatusCodes result = MaritalStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaritalStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V2ContactRole createV2ContactRoleFromString(EDataType eDataType, String initialValue) {
		V2ContactRole result = V2ContactRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV2ContactRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimalSpecies createAnimalSpeciesFromString(EDataType eDataType, String initialValue) {
		AnimalSpecies result = AnimalSpecies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnimalSpeciesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimalBreeds createAnimalBreedsFromString(EDataType eDataType, String initialValue) {
		AnimalBreeds result = AnimalBreeds.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnimalBreedsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderStatus createGenderStatusFromString(EDataType eDataType, String initialValue) {
		GenderStatus result = GenderStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientRelationshipType createPatientRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		PatientRelationshipType result = PatientRelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkTypeFromString(EDataType eDataType, String initialValue) {
		LinkType result = LinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureTypeCodes createSignatureTypeCodesFromString(EDataType eDataType, String initialValue) {
		SignatureTypeCodes result = SignatureTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignatureTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceStatus createDeviceStatusFromString(EDataType eDataType, String initialValue) {
		DeviceStatus result = DeviceStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceTypes createDeviceTypesFromString(EDataType eDataType, String initialValue) {
		DeviceTypes result = DeviceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTime createUnitsOfTimeFromString(EDataType eDataType, String initialValue) {
		UnitsOfTime result = UnitsOfTime.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsOfTimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTiming createEventTimingFromString(EDataType eDataType, String initialValue) {
		EventTiming result = EventTiming.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTimingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingAbbreviation createTimingAbbreviationFromString(EDataType eDataType, String initialValue) {
		TimingAbbreviation result = TimingAbbreviation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimingAbbreviationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryType createLibraryTypeFromString(EDataType eDataType, String initialValue) {
		LibraryType result = LibraryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLibraryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatus createPublicationStatusFromString(EDataType eDataType, String initialValue) {
		PublicationStatus result = PublicationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageContextType createUsageContextTypeFromString(EDataType eDataType, String initialValue) {
		UsageContextType result = UsageContextType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageContextTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JurisdictionValueSet createJurisdictionValueSetFromString(EDataType eDataType, String initialValue) {
		JurisdictionValueSet result = JurisdictionValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJurisdictionValueSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorType createContributorTypeFromString(EDataType eDataType, String initialValue) {
		ContributorType result = ContributorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifactType createRelatedArtifactTypeFromString(EDataType eDataType, String initialValue) {
		RelatedArtifactType result = RelatedArtifactType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelatedArtifactTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUse createOperationParameterUseFromString(EDataType eDataType, String initialValue) {
		OperationParameterUse result = OperationParameterUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirAllTypes createFhirAllTypesFromString(EDataType eDataType, String initialValue) {
		FhirAllTypes result = FhirAllTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFhirAllTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionCodes createStructureDefinitionCodesFromString(EDataType eDataType, String initialValue) {
		StructureDefinitionCodes result = StructureDefinitionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionKind createStructureDefinitionKindFromString(EDataType eDataType, String initialValue) {
		StructureDefinitionKind result = StructureDefinitionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContext createExtensionContextFromString(EDataType eDataType, String initialValue) {
		ExtensionContext result = ExtensionContext.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionContextToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirDefinedType createFhirDefinedTypeFromString(EDataType eDataType, String initialValue) {
		FhirDefinedType result = FhirDefinedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFhirDefinedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDerivationRule createTypeDerivationRuleFromString(EDataType eDataType, String initialValue) {
		TypeDerivationRule result = TypeDerivationRule.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDerivationRuleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentation createPropertyRepresentationFromString(EDataType eDataType, String initialValue) {
		PropertyRepresentation result = PropertyRepresentation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRepresentationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoincCodes createLoincCodesFromString(EDataType eDataType, String initialValue) {
		LoincCodes result = LoincCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoincCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRules createSlicingRulesFromString(EDataType eDataType, String initialValue) {
		SlicingRules result = SlicingRules.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlicingRulesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationMode createAggregationModeFromString(EDataType eDataType, String initialValue) {
		AggregationMode result = AggregationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersionRules createReferenceVersionRulesFromString(EDataType eDataType, String initialValue) {
		ReferenceVersionRules result = ReferenceVersionRules.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceVersionRulesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverity createConstraintSeverityFromString(EDataType eDataType, String initialValue) {
		ConstraintSeverity result = ConstraintSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrength createBindingStrengthFromString(EDataType eDataType, String initialValue) {
		BindingStrength result = BindingStrength.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignationUse createDesignationUseFromString(EDataType eDataType, String initialValue) {
		DesignationUse result = DesignationUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDesignationUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperator createFilterOperatorFromString(EDataType eDataType, String initialValue) {
		FilterOperator result = FilterOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchSubjectStatus createResearchSubjectStatusFromString(EDataType eDataType, String initialValue) {
		ResearchSubjectStatus result = ResearchSubjectStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchSubjectStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionType createPlanDefinitionTypeFromString(EDataType eDataType, String initialValue) {
		PlanDefinitionType result = PlanDefinitionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanDefinitionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerType createTriggerTypeFromString(EDataType eDataType, String initialValue) {
		TriggerType result = TriggerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionConditionKind createPlanActionConditionKindFromString(EDataType eDataType, String initialValue) {
		PlanActionConditionKind result = PlanActionConditionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionConditionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionRelationshipType createPlanActionRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		PlanActionRelationshipType result = PlanActionRelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionParticipantType createPlanActionParticipantTypeFromString(EDataType eDataType, String initialValue) {
		PlanActionParticipantType result = PlanActionParticipantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionParticipantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionType createPlanActionTypeFromString(EDataType eDataType, String initialValue) {
		PlanActionType result = PlanActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionGroupingBehavior createPlanActionGroupingBehaviorFromString(EDataType eDataType, String initialValue) {
		PlanActionGroupingBehavior result = PlanActionGroupingBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionGroupingBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionSelectionBehavior createPlanActionSelectionBehaviorFromString(EDataType eDataType, String initialValue) {
		PlanActionSelectionBehavior result = PlanActionSelectionBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionSelectionBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionRequiredBehavior createPlanActionRequiredBehaviorFromString(EDataType eDataType, String initialValue) {
		PlanActionRequiredBehavior result = PlanActionRequiredBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionRequiredBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionPrecheckBehavior createPlanActionPrecheckBehaviorFromString(EDataType eDataType, String initialValue) {
		PlanActionPrecheckBehavior result = PlanActionPrecheckBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionPrecheckBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanActionCardinalityBehavior createPlanActionCardinalityBehaviorFromString(EDataType eDataType, String initialValue) {
		PlanActionCardinalityBehavior result = PlanActionCardinalityBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanActionCardinalityBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinitionCategory createActivityDefinitionCategoryFromString(EDataType eDataType, String initialValue) {
		ActivityDefinitionCategory result = ActivityDefinitionCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityDefinitionCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtMedicationCodes createSnomedCtMedicationCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtMedicationCodes result = SnomedCtMedicationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtMedicationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtFormCodes createSnomedCtFormCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtFormCodes result = SnomedCtFormCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtFormCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtFormCodes createSnomedCtFormCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtFormCodes result = SnomedCtFormCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtFormCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceCategoryCodes createSubstanceCategoryCodesFromString(EDataType eDataType, String initialValue) {
		SubstanceCategoryCodes result = SubstanceCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstanceCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceCode createSubstanceCodeFromString(EDataType eDataType, String initialValue) {
		SubstanceCode result = SubstanceCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstanceCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtFormCodes createSnomedCtFormCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtFormCodes result = SnomedCtFormCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtFormCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtAdditionalDosageInstructions createSnomedCtAdditionalDosageInstructionsFromString(EDataType eDataType, String initialValue) {
		SnomedCtAdditionalDosageInstructions result = SnomedCtAdditionalDosageInstructions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtAdditionalDosageInstructionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtMedicationAsNeededReasonCodes createSnomedCtMedicationAsNeededReasonCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtMedicationAsNeededReasonCodes result = SnomedCtMedicationAsNeededReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtMedicationAsNeededReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtAnatomicalStructureForAdministrationSiteCodes createSnomedCtAnatomicalStructureForAdministrationSiteCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtAnatomicalStructureForAdministrationSiteCodes result = SnomedCtAnatomicalStructureForAdministrationSiteCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtAnatomicalStructureForAdministrationSiteCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtRouteCodes createSnomedCtRouteCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtRouteCodes result = SnomedCtRouteCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtRouteCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtAdministrationMethodCodes createSnomedCtAdministrationMethodCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtAdministrationMethodCodes result = SnomedCtAdministrationMethodCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtAdministrationMethodCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtBodyStructures createSnomedCtBodyStructuresFromString(EDataType eDataType, String initialValue) {
		SnomedCtBodyStructures result = SnomedCtBodyStructures.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtBodyStructuresToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapModelMode createStructureMapModelModeFromString(EDataType eDataType, String initialValue) {
		StructureMapModelMode result = StructureMapModelMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapModelModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInputMode createStructureMapInputModeFromString(EDataType eDataType, String initialValue) {
		StructureMapInputMode result = StructureMapInputMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapInputModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapContextType createStructureMapContextTypeFromString(EDataType eDataType, String initialValue) {
		StructureMapContextType result = StructureMapContextType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapContextTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapListMode createStructureMapListModeFromString(EDataType eDataType, String initialValue) {
		StructureMapListMode result = StructureMapListMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapListModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTransform createStructureMapTransformFromString(EDataType eDataType, String initialValue) {
		StructureMapTransform result = StructureMapTransform.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTransformToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyStatus createResearchStudyStatusFromString(EDataType eDataType, String initialValue) {
		ResearchStudyStatus result = ResearchStudyStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchStudyStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupTypeFromString(EDataType eDataType, String initialValue) {
		GroupType result = GroupType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStatus createConsentStatusFromString(EDataType eDataType, String initialValue) {
		ConsentStatus result = ConsentStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentCategoryCodes createConsentCategoryCodesFromString(EDataType eDataType, String initialValue) {
		ConsentCategoryCodes result = ConsentCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentTypeValueSet createDocumentTypeValueSetFromString(EDataType eDataType, String initialValue) {
		DocumentTypeValueSet result = DocumentTypeValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentTypeValueSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentClassValueSet createDocumentClassValueSetFromString(EDataType eDataType, String initialValue) {
		DocumentClassValueSet result = DocumentClassValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentClassValueSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatus createDocumentReferenceStatusFromString(EDataType eDataType, String initialValue) {
		DocumentReferenceStatus result = DocumentReferenceStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatus createCompositionStatusFromString(EDataType eDataType, String initialValue) {
		CompositionStatus result = CompositionStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRelationshipType createDocumentRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		DocumentRelationshipType result = DocumentRelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceFormatCodeSet createDocumentReferenceFormatCodeSetFromString(EDataType eDataType, String initialValue) {
		DocumentReferenceFormatCodeSet result = DocumentReferenceFormatCodeSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceFormatCodeSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatus createEncounterStatusFromString(EDataType eDataType, String initialValue) {
		EncounterStatus result = EncounterStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActEncounterCode createActEncounterCodeFromString(EDataType eDataType, String initialValue) {
		ActEncounterCode result = ActEncounterCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActEncounterCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterType createEncounterTypeFromString(EDataType eDataType, String initialValue) {
		EncounterType result = EncounterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3CodeSystemActPriority createV3CodeSystemActPriorityFromString(EDataType eDataType, String initialValue) {
		V3CodeSystemActPriority result = V3CodeSystemActPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3CodeSystemActPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatus createEpisodeOfCareStatusFromString(EDataType eDataType, String initialValue) {
		EpisodeOfCareStatus result = EpisodeOfCareStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpisodeOfCareStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionClinicalStatusCodes createConditionClinicalStatusCodesFromString(EDataType eDataType, String initialValue) {
		ConditionClinicalStatusCodes result = ConditionClinicalStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionClinicalStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionVerificationStatus createConditionVerificationStatusFromString(EDataType eDataType, String initialValue) {
		ConditionVerificationStatus result = ConditionVerificationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionVerificationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionCategoryCodes createConditionCategoryCodesFromString(EDataType eDataType, String initialValue) {
		ConditionCategoryCodes result = ConditionCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionDiagnosisSeverity createConditionDiagnosisSeverityFromString(EDataType eDataType, String initialValue) {
		ConditionDiagnosisSeverity result = ConditionDiagnosisSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionDiagnosisSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionProblemDiagnosisCodes createConditionProblemDiagnosisCodesFromString(EDataType eDataType, String initialValue) {
		ConditionProblemDiagnosisCodes result = ConditionProblemDiagnosisCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionProblemDiagnosisCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionStage createConditionStageFromString(EDataType eDataType, String initialValue) {
		ConditionStage result = ConditionStage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionStageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionStatus createClinicalImpressionStatusFromString(EDataType eDataType, String initialValue) {
		ClinicalImpressionStatus result = ClinicalImpressionStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalImpressionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceClinicalStatus createAllergyIntoleranceClinicalStatusFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceClinicalStatus result = AllergyIntoleranceClinicalStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceClinicalStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceVerificationStatus createAllergyIntoleranceVerificationStatusFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceVerificationStatus result = AllergyIntoleranceVerificationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceVerificationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceType createAllergyIntoleranceTypeFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceType result = AllergyIntoleranceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategory createAllergyIntoleranceCategoryFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCategory result = AllergyIntoleranceCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticality createAllergyIntoleranceCriticalityFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCriticality result = AllergyIntoleranceCriticality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCriticalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSubstanceProductConditionAndNegationCodes createAllergyIntoleranceSubstanceProductConditionAndNegationCodesFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceSubstanceProductConditionAndNegationCodes result = AllergyIntoleranceSubstanceProductConditionAndNegationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSubstanceProductConditionAndNegationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCertainty createAllergyIntoleranceCertaintyFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCertainty result = AllergyIntoleranceCertainty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCertaintyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtClinicalFindings createSnomedCtClinicalFindingsFromString(EDataType eDataType, String initialValue) {
		SnomedCtClinicalFindings result = SnomedCtClinicalFindings.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtClinicalFindingsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtClinicalFindings createSnomedCtClinicalFindingsFromString(EDataType eDataType, String initialValue) {
		SnomedCtClinicalFindings result = SnomedCtClinicalFindings.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtClinicalFindingsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverity createAllergyIntoleranceSeverityFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceSeverity result = AllergyIntoleranceSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvestigationType createInvestigationTypeFromString(EDataType eDataType, String initialValue) {
		InvestigationType result = InvestigationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvestigationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatus createObservationStatusFromString(EDataType eDataType, String initialValue) {
		ObservationStatus result = ObservationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationCategoryCodes createObservationCategoryCodesFromString(EDataType eDataType, String initialValue) {
		ObservationCategoryCodes result = ObservationCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationValueAbsentReason createObservationValueAbsentReasonFromString(EDataType eDataType, String initialValue) {
		ObservationValueAbsentReason result = ObservationValueAbsentReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationValueAbsentReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationInterpretationCodes createObservationInterpretationCodesFromString(EDataType eDataType, String initialValue) {
		ObservationInterpretationCodes result = ObservationInterpretationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationInterpretationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationMethods createObservationMethodsFromString(EDataType eDataType, String initialValue) {
		ObservationMethods result = ObservationMethods.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationMethodsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenStatus createSpecimenStatusFromString(EDataType eDataType, String initialValue) {
		SpecimenStatus result = SpecimenStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V2SpecimenType createV2SpecimenTypeFromString(EDataType eDataType, String initialValue) {
		V2SpecimenType result = V2SpecimenType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV2SpecimenTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatus createRequestStatusFromString(EDataType eDataType, String initialValue) {
		RequestStatus result = RequestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestIntent createRequestIntentFromString(EDataType eDataType, String initialValue) {
		RequestIntent result = RequestIntent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestIntentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPriority createRequestPriorityFromString(EDataType eDataType, String initialValue) {
		RequestPriority result = RequestPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoincDiagnosticRequestCodes createLoincDiagnosticRequestCodesFromString(EDataType eDataType, String initialValue) {
		LoincDiagnosticRequestCodes result = LoincDiagnosticRequestCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoincDiagnosticRequestCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRoles createParticipantRolesFromString(EDataType eDataType, String initialValue) {
		ParticipantRoles result = ParticipantRoles.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantRolesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeOfUse createPurposeOfUseFromString(EDataType eDataType, String initialValue) {
		PurposeOfUse result = PurposeOfUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPurposeOfUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEventCurrentState createProvenanceEventCurrentStateFromString(EDataType eDataType, String initialValue) {
		ProvenanceEventCurrentState result = ProvenanceEventCurrentState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEventCurrentStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceParticipantRole createProvenanceParticipantRoleFromString(EDataType eDataType, String initialValue) {
		ProvenanceParticipantRole result = ProvenanceParticipantRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceParticipantRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3CodeSystemRoleLinkType createV3CodeSystemRoleLinkTypeFromString(EDataType eDataType, String initialValue) {
		V3CodeSystemRoleLinkType result = V3CodeSystemRoleLinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3CodeSystemRoleLinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRole createProvenanceEntityRoleFromString(EDataType eDataType, String initialValue) {
		ProvenanceEntityRole result = ProvenanceEntityRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEntityRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureCodessnomedCT createProcedureCodessnomedCTFromString(EDataType eDataType, String initialValue) {
		ProcedureCodessnomedCT result = ProcedureCodessnomedCT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureCodessnomedCTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureReasonCodes createProcedureReasonCodesFromString(EDataType eDataType, String initialValue) {
		ProcedureReasonCodes result = ProcedureReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestStatus createProcedureRequestStatusFromString(EDataType eDataType, String initialValue) {
		ProcedureRequestStatus result = ProcedureRequestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRequestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestPriority createProcedureRequestPriorityFromString(EDataType eDataType, String initialValue) {
		ProcedureRequestPriority result = ProcedureRequestPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRequestPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCollectionMethod createSpecimenCollectionMethodFromString(EDataType eDataType, String initialValue) {
		SpecimenCollectionMethod result = SpecimenCollectionMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenCollectionMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenTreatmentProcedure createSpecimenTreatmentProcedureFromString(EDataType eDataType, String initialValue) {
		SpecimenTreatmentProcedure result = SpecimenTreatmentProcedure.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenTreatmentProcedureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainer createSpecimenContainerFromString(EDataType eDataType, String initialValue) {
		SpecimenContainer result = SpecimenContainer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenContainerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V2AdditivePreservative createV2AdditivePreservativeFromString(EDataType eDataType, String initialValue) {
		V2AdditivePreservative result = V2AdditivePreservative.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV2AdditivePreservativeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasmntPrinciple createMeasmntPrincipleFromString(EDataType eDataType, String initialValue) {
		MeasmntPrinciple result = MeasmntPrinciple.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasmntPrincipleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatus createDeviceMetricOperationalStatusFromString(EDataType eDataType, String initialValue) {
		DeviceMetricOperationalStatus result = DeviceMetricOperationalStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricOperationalStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColor createDeviceMetricColorFromString(EDataType eDataType, String initialValue) {
		DeviceMetricColor result = DeviceMetricColor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategory createDeviceMetricCategoryFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCategory result = DeviceMetricCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationType createDeviceMetricCalibrationTypeFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationType result = DeviceMetricCalibrationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationState createDeviceMetricCalibrationStateFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationState result = DeviceMetricCalibrationState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationReferenceRangeMeaningCodes createObservationReferenceRangeMeaningCodesFromString(EDataType eDataType, String initialValue) {
		ObservationReferenceRangeMeaningCodes result = ObservationReferenceRangeMeaningCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationReferenceRangeMeaningCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelationshipType createObservationRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		ObservationRelationshipType result = ObservationRelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanStatus createCarePlanStatusFromString(EDataType eDataType, String initialValue) {
		CarePlanStatus result = CarePlanStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanCategory createCarePlanCategoryFromString(EDataType eDataType, String initialValue) {
		CarePlanCategory result = CarePlanCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireStatus createQuestionnaireStatusFromString(EDataType eDataType, String initialValue) {
		QuestionnaireStatus result = QuestionnaireStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextOfUseValueSet createContextOfUseValueSetFromString(EDataType eDataType, String initialValue) {
		ContextOfUseValueSet result = ContextOfUseValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextOfUseValueSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireQuestionCodes createQuestionnaireQuestionCodesFromString(EDataType eDataType, String initialValue) {
		QuestionnaireQuestionCodes result = QuestionnaireQuestionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireQuestionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemType createQuestionnaireItemTypeFromString(EDataType eDataType, String initialValue) {
		QuestionnaireItemType result = QuestionnaireItemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswerCodes createQuestionnaireAnswerCodesFromString(EDataType eDataType, String initialValue) {
		QuestionnaireAnswerCodes result = QuestionnaireAnswerCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireAnswerCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanRelationship createCarePlanRelationshipFromString(EDataType eDataType, String initialValue) {
		CarePlanRelationship result = CarePlanRelationship.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanRelationshipToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStatus createGoalStatusFromString(EDataType eDataType, String initialValue) {
		GoalStatus result = GoalStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalCategory createGoalCategoryFromString(EDataType eDataType, String initialValue) {
		GoalCategory result = GoalCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalPriority createGoalPriorityFromString(EDataType eDataType, String initialValue) {
		GoalPriority result = GoalPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStartEvent createGoalStartEventFromString(EDataType eDataType, String initialValue) {
		GoalStartEvent result = GoalStartEvent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalStartEventToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStatusReason createGoalStatusReasonFromString(EDataType eDataType, String initialValue) {
		GoalStatusReason result = GoalStatusReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalStatusReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatus createMedicationStatementStatusFromString(EDataType eDataType, String initialValue) {
		MedicationStatementStatus result = MedicationStatementStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementNotTaken createMedicationStatementNotTakenFromString(EDataType eDataType, String initialValue) {
		MedicationStatementNotTaken result = MedicationStatementNotTaken.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementNotTakenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtDrugsNotTakencompletedCodes createSnomedCtDrugsNotTakencompletedCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtDrugsNotTakencompletedCodes result = SnomedCtDrugsNotTakencompletedCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtDrugsNotTakencompletedCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementCategory createMedicationStatementCategoryFromString(EDataType eDataType, String initialValue) {
		MedicationStatementCategory result = MedicationStatementCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderStatus createNutritionOrderStatusFromString(EDataType eDataType, String initialValue) {
		NutritionOrderStatus result = NutritionOrderStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNutritionOrderStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diet createDietFromString(EDataType eDataType, String initialValue) {
		Diet result = Diet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDietToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodTypeCodes createFoodTypeCodesFromString(EDataType eDataType, String initialValue) {
		FoodTypeCodes result = FoodTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFoodTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DietCodes createDietCodesFromString(EDataType eDataType, String initialValue) {
		DietCodes result = DietCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDietCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutrientModifierCodes createNutrientModifierCodesFromString(EDataType eDataType, String initialValue) {
		NutrientModifierCodes result = NutrientModifierCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNutrientModifierCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureModifierCodes createTextureModifierCodesFromString(EDataType eDataType, String initialValue) {
		TextureModifierCodes result = TextureModifierCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureModifierCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureModifiedFoodTypeCodes createTextureModifiedFoodTypeCodesFromString(EDataType eDataType, String initialValue) {
		TextureModifiedFoodTypeCodes result = TextureModifiedFoodTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureModifiedFoodTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FluidConsistencyTypeCodes createFluidConsistencyTypeCodesFromString(EDataType eDataType, String initialValue) {
		FluidConsistencyTypeCodes result = FluidConsistencyTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFluidConsistencyTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplementTypeCodes createSupplementTypeCodesFromString(EDataType eDataType, String initialValue) {
		SupplementTypeCodes result = SupplementTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplementTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnteralFormulaTypeCodes createEnteralFormulaTypeCodesFromString(EDataType eDataType, String initialValue) {
		EnteralFormulaTypeCodes result = EnteralFormulaTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnteralFormulaTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnteralFormulaAdditiveTypeCode createEnteralFormulaAdditiveTypeCodeFromString(EDataType eDataType, String initialValue) {
		EnteralFormulaAdditiveTypeCode result = EnteralFormulaAdditiveTypeCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnteralFormulaAdditiveTypeCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnteralRouteCodes createEnteralRouteCodesFromString(EDataType eDataType, String initialValue) {
		EnteralRouteCodes result = EnteralRouteCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnteralRouteCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskProbability createRiskProbabilityFromString(EDataType eDataType, String initialValue) {
		RiskProbability result = RiskProbability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRiskProbabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatus createAppointmentStatusFromString(EDataType eDataType, String initialValue) {
		AppointmentStatus result = AppointmentStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V2AppointmentReasonCodes createV2AppointmentReasonCodesFromString(EDataType eDataType, String initialValue) {
		V2AppointmentReasonCodes result = V2AppointmentReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV2AppointmentReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterReasonCodes createEncounterReasonCodesFromString(EDataType eDataType, String initialValue) {
		EncounterReasonCodes result = EncounterReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatus createSlotStatusFromString(EDataType eDataType, String initialValue) {
		SlotStatus result = SlotStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlotStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantType createParticipantTypeFromString(EDataType eDataType, String initialValue) {
		ParticipantType result = ParticipantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRequired createParticipantRequiredFromString(EDataType eDataType, String initialValue) {
		ParticipantRequired result = ParticipantRequired.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantRequiredToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatus createParticipationStatusFromString(EDataType eDataType, String initialValue) {
		ParticipationStatus result = ParticipationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3CodeSystemParticipationMode createV3CodeSystemParticipationModeFromString(EDataType eDataType, String initialValue) {
		V3CodeSystemParticipationMode result = V3CodeSystemParticipationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3CodeSystemParticipationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestStatus createCommunicationRequestStatusFromString(EDataType eDataType, String initialValue) {
		CommunicationRequestStatus result = CommunicationRequestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationRequestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3CodeSystemActReason createV3CodeSystemActReasonFromString(EDataType eDataType, String initialValue) {
		V3CodeSystemActReason result = V3CodeSystemActReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3CodeSystemActReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStage createRequestStageFromString(EDataType eDataType, String initialValue) {
		RequestStage result = RequestStage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestStageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestStatus createMedicationRequestStatusFromString(EDataType eDataType, String initialValue) {
		MedicationRequestStatus result = MedicationRequestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestStage createMedicationRequestStageFromString(EDataType eDataType, String initialValue) {
		MedicationRequestStage result = MedicationRequestStage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestStageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestCategory createMedicationRequestCategoryFromString(EDataType eDataType, String initialValue) {
		MedicationRequestCategory result = MedicationRequestCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceAdminSubstitutionReason createSubstanceAdminSubstitutionReasonFromString(EDataType eDataType, String initialValue) {
		SubstanceAdminSubstitutionReason result = SubstanceAdminSubstitutionReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstanceAdminSubstitutionReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialResourceStatusCodes createFinancialResourceStatusCodesFromString(EDataType eDataType, String initialValue) {
		FinancialResourceStatusCodes result = FinancialResourceStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinancialResourceStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionList createActionListFromString(EDataType eDataType, String initialValue) {
		ActionList result = ActionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleVisionPrescriptionProductCodes createExampleVisionPrescriptionProductCodesFromString(EDataType eDataType, String initialValue) {
		ExampleVisionPrescriptionProductCodes result = ExampleVisionPrescriptionProductCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleVisionPrescriptionProductCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyes createVisionEyesFromString(EDataType eDataType, String initialValue) {
		VisionEyes result = VisionEyes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionEyesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBase createVisionBaseFromString(EDataType eDataType, String initialValue) {
		VisionBase result = VisionBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityCategory createCarePlanActivityCategoryFromString(EDataType eDataType, String initialValue) {
		CarePlanActivityCategory result = CarePlanActivityCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivity createCarePlanActivityFromString(EDataType eDataType, String initialValue) {
		CarePlanActivity result = CarePlanActivity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityReason createActivityReasonFromString(EDataType eDataType, String initialValue) {
		ActivityReason result = ActivityReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatus createCarePlanActivityStatusFromString(EDataType eDataType, String initialValue) {
		CarePlanActivityStatus result = CarePlanActivityStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralStatus createReferralStatusFromString(EDataType eDataType, String initialValue) {
		ReferralStatus result = ReferralStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferralStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralCategory createReferralCategoryFromString(EDataType eDataType, String initialValue) {
		ReferralCategory result = ReferralCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferralCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureStatus createProcedureStatusFromString(EDataType eDataType, String initialValue) {
		ProcedureStatus result = ProcedureStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureCategoryCodessnomedCT createProcedureCategoryCodessnomedCTFromString(EDataType eDataType, String initialValue) {
		ProcedureCategoryCodessnomedCT result = ProcedureCategoryCodessnomedCT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureCategoryCodessnomedCTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePerformerRoleCodes createProcedurePerformerRoleCodesFromString(EDataType eDataType, String initialValue) {
		ProcedurePerformerRoleCodes result = ProcedurePerformerRoleCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedurePerformerRoleCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNotPerformedReasonsnomeDCT createProcedureNotPerformedReasonsnomeDCTFromString(EDataType eDataType, String initialValue) {
		ProcedureNotPerformedReasonsnomeDCT result = ProcedureNotPerformedReasonsnomeDCT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureNotPerformedReasonsnomeDCTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureOutcomeCodessnomedCT createProcedureOutcomeCodessnomedCTFromString(EDataType eDataType, String initialValue) {
		ProcedureOutcomeCodessnomedCT result = ProcedureOutcomeCodessnomedCT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureOutcomeCodessnomedCTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatus createDiagnosticReportStatusFromString(EDataType eDataType, String initialValue) {
		DiagnosticReportStatus result = DiagnosticReportStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticReportStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticServiceSectionCodes createDiagnosticServiceSectionCodesFromString(EDataType eDataType, String initialValue) {
		DiagnosticServiceSectionCodes result = DiagnosticServiceSectionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticServiceSectionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoincDiagnosticReportCodes createLoincDiagnosticReportCodesFromString(EDataType eDataType, String initialValue) {
		LoincDiagnosticReportCodes result = LoincDiagnosticReportCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoincDiagnosticReportCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAvailability createInstanceAvailabilityFromString(EDataType eDataType, String initialValue) {
		InstanceAvailability result = InstanceAvailability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceAvailabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquisitionModalityCodes createAcquisitionModalityCodesFromString(EDataType eDataType, String initialValue) {
		AcquisitionModalityCodes result = AcquisitionModalityCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcquisitionModalityCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DWebType createDWebTypeFromString(EDataType eDataType, String initialValue) {
		DWebType result = DWebType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDWebTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Laterality createLateralityFromString(EDataType eDataType, String initialValue) {
		Laterality result = Laterality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLateralityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KoStitle createKoStitleFromString(EDataType eDataType, String initialValue) {
		KoStitle result = KoStitle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKoStitleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalMediaType createDigitalMediaTypeFromString(EDataType eDataType, String initialValue) {
		DigitalMediaType result = DigitalMediaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigitalMediaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaSubType createMediaSubTypeFromString(EDataType eDataType, String initialValue) {
		MediaSubType result = MediaSubType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaSubTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaCollectionViewProjection createMediaCollectionViewProjectionFromString(EDataType eDataType, String initialValue) {
		MediaCollectionViewProjection result = MediaCollectionViewProjection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaCollectionViewProjectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtClinicalFindings createSnomedCtClinicalFindingsFromString(EDataType eDataType, String initialValue) {
		SnomedCtClinicalFindings result = SnomedCtClinicalFindings.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtClinicalFindingsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureFollowUpCodessnomedCT createProcedureFollowUpCodessnomedCTFromString(EDataType eDataType, String initialValue) {
		ProcedureFollowUpCodessnomedCT result = ProcedureFollowUpCodessnomedCT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureFollowUpCodessnomedCTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDeviceActionCodes createProcedureDeviceActionCodesFromString(EDataType eDataType, String initialValue) {
		ProcedureDeviceActionCodes result = ProcedureDeviceActionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureDeviceActionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatus createMedicationAdministrationStatusFromString(EDataType eDataType, String initialValue) {
		MedicationAdministrationStatus result = MedicationAdministrationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationAdministrationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtReasonMedicationNotGivenCodes createSnomedCtReasonMedicationNotGivenCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtReasonMedicationNotGivenCodes result = SnomedCtReasonMedicationNotGivenCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtReasonMedicationNotGivenCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonMedicationGivenCodes createReasonMedicationGivenCodesFromString(EDataType eDataType, String initialValue) {
		ReasonMedicationGivenCodes result = ReasonMedicationGivenCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReasonMedicationGivenCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseStatus createQuestionnaireResponseStatusFromString(EDataType eDataType, String initialValue) {
		QuestionnaireResponseStatus result = QuestionnaireResponseStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireResponseStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceTypeFromString(EDataType eDataType, String initialValue) {
		SequenceType result = SequenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chromosomehuman createChromosomehumanFromString(EDataType eDataType, String initialValue) {
		Chromosomehuman result = Chromosomehuman.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChromosomehumanToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ensembl createEnsemblFromString(EDataType eDataType, String initialValue) {
		Ensembl result = Ensembl.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnsemblToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityType createQualityTypeFromString(EDataType eDataType, String initialValue) {
		QualityType result = QualityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryType createRepositoryTypeFromString(EDataType eDataType, String initialValue) {
		RepositoryType result = RepositoryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepositoryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryStatus createFamilyHistoryStatusFromString(EDataType eDataType, String initialValue) {
		FamilyHistoryStatus result = FamilyHistoryStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyHistoryStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMember createFamilyMemberFromString(EDataType eDataType, String initialValue) {
		FamilyMember result = FamilyMember.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyMemberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionOutcomeCodes createConditionOutcomeCodesFromString(EDataType eDataType, String initialValue) {
		ConditionOutcomeCodes result = ConditionOutcomeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionOutcomeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionPrognosis createClinicalImpressionPrognosisFromString(EDataType eDataType, String initialValue) {
		ClinicalImpressionPrognosis result = ClinicalImpressionPrognosis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalImpressionPrognosisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestationAndSymptomCodes createManifestationAndSymptomCodesFromString(EDataType eDataType, String initialValue) {
		ManifestationAndSymptomCodes result = ManifestationAndSymptomCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManifestationAndSymptomCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountStatus createAccountStatusFromString(EDataType eDataType, String initialValue) {
		AccountStatus result = AccountStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageTypeCodes createCoverageTypeCodesFromString(EDataType eDataType, String initialValue) {
		CoverageTypeCodes result = CoverageTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoverageTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyholderRelationshipCodes createPolicyholderRelationshipCodesFromString(EDataType eDataType, String initialValue) {
		PolicyholderRelationshipCodes result = PolicyholderRelationshipCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolicyholderRelationshipCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTypeCodes createContractTypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractTypeCodes result = ContractTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractSubtypeCodes createContractSubtypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractSubtypeCodes result = ContractSubtypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractSubtypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractActionCodes createContractActionCodesFromString(EDataType eDataType, String initialValue) {
		ContractActionCodes result = ContractActionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractActionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractActorRoleCodes createContractActorRoleCodesFromString(EDataType eDataType, String initialValue) {
		ContractActorRoleCodes result = ContractActorRoleCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractActorRoleCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractSignerTypeCodes createContractSignerTypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractSignerTypeCodes result = ContractSignerTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractSignerTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTermTypeCodes createContractTermTypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractTermTypeCodes result = ContractTermTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractTermTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTermTypeCodes createContractTermTypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractTermTypeCodes result = ContractTermTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractTermTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTermTypeCodes createContractTermTypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractTermTypeCodes result = ContractTermTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractTermTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirDocumentTypeCodes createFhirDocumentTypeCodesFromString(EDataType eDataType, String initialValue) {
		FhirDocumentTypeCodes result = FhirDocumentTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFhirDocumentTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirDocumentClassCodes createFhirDocumentClassCodesFromString(EDataType eDataType, String initialValue) {
		FhirDocumentClassCodes result = FhirDocumentClassCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFhirDocumentClassCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialityClassification createConfidentialityClassificationFromString(EDataType eDataType, String initialValue) {
		ConfidentialityClassification result = ConfidentialityClassification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityClassificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttestationMode createCompositionAttestationModeFromString(EDataType eDataType, String initialValue) {
		CompositionAttestationMode result = CompositionAttestationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionAttestationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3CodeSystemActCode createV3CodeSystemActCodeFromString(EDataType eDataType, String initialValue) {
		V3CodeSystemActCode result = V3CodeSystemActCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3CodeSystemActCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentSectionCodes createDocumentSectionCodesFromString(EDataType eDataType, String initialValue) {
		DocumentSectionCodes result = DocumentSectionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentSectionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListMode createListModeFromString(EDataType eDataType, String initialValue) {
		ListMode result = ListMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOrderCodes createListOrderCodesFromString(EDataType eDataType, String initialValue) {
		ListOrderCodes result = ListOrderCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListOrderCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEmptyReasons createListEmptyReasonsFromString(EDataType eDataType, String initialValue) {
		ListEmptyReasons result = ListEmptyReasons.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListEmptyReasonsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmitSource createAdmitSourceFromString(EDataType eDataType, String initialValue) {
		AdmitSource result = AdmitSource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdmitSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V2ReAdmissionIndicator createV2ReAdmissionIndicatorFromString(EDataType eDataType, String initialValue) {
		V2ReAdmissionIndicator result = V2ReAdmissionIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV2ReAdmissionIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialCourtesy createSpecialCourtesyFromString(EDataType eDataType, String initialValue) {
		SpecialCourtesy result = SpecialCourtesy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialCourtesyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialArrangements createSpecialArrangementsFromString(EDataType eDataType, String initialValue) {
		SpecialArrangements result = SpecialArrangements.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialArrangementsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDisposition createDischargeDispositionFromString(EDataType eDataType, String initialValue) {
		DischargeDisposition result = DischargeDisposition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDischargeDispositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatus createEncounterLocationStatusFromString(EDataType eDataType, String initialValue) {
		EncounterLocationStatus result = EncounterLocationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterLocationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityTypeCodeValueSet createFacilityTypeCodeValueSetFromString(EDataType eDataType, String initialValue) {
		FacilityTypeCodeValueSet result = FacilityTypeCodeValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacilityTypeCodeValueSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentExceptType createConsentExceptTypeFromString(EDataType eDataType, String initialValue) {
		ConsentExceptType result = ConsentExceptType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentExceptTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentActorRoles createConsentActorRolesFromString(EDataType eDataType, String initialValue) {
		ConsentActorRoles result = ConsentActorRoles.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentActorRolesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentActionCodes createConsentActionCodesFromString(EDataType eDataType, String initialValue) {
		ConsentActionCodes result = ConsentActionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentActionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentContentClass createConsentContentClassFromString(EDataType eDataType, String initialValue) {
		ConsentContentClass result = ConsentContentClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentContentClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentContentCodes createConsentContentCodesFromString(EDataType eDataType, String initialValue) {
		ConsentContentCodes result = ConsentContentCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentContentCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDataMeaning createConsentDataMeaningFromString(EDataType eDataType, String initialValue) {
		ConsentDataMeaning result = ConsentDataMeaning.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentDataMeaningToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationStatus createCommunicationStatusFromString(EDataType eDataType, String initialValue) {
		CommunicationStatus result = CommunicationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemType createNamingSystemTypeFromString(EDataType eDataType, String initialValue) {
		NamingSystemType result = NamingSystemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierType createNamingSystemIdentifierTypeFromString(EDataType eDataType, String initialValue) {
		NamingSystemIdentifierType result = NamingSystemIdentifierType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemIdentifierTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalence createConceptMapEquivalenceFromString(EDataType eDataType, String initialValue) {
		ConceptMapEquivalence result = ConceptMapEquivalence.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapEquivalenceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevel createIdentityAssuranceLevelFromString(EDataType eDataType, String initialValue) {
		IdentityAssuranceLevel result = IdentityAssuranceLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityAssuranceLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagCategory createFlagCategoryFromString(EDataType eDataType, String initialValue) {
		FlagCategory result = FlagCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatus createFlagStatusFromString(EDataType eDataType, String initialValue) {
		FlagStatus result = FlagStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagCode createFlagCodeFromString(EDataType eDataType, String initialValue) {
		FlagCode result = FlagCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemHierarchyMeaning createCodeSystemHierarchyMeaningFromString(EDataType eDataType, String initialValue) {
		CodeSystemHierarchyMeaning result = CodeSystemHierarchyMeaning.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemHierarchyMeaningToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContentMode createCodeSystemContentModeFromString(EDataType eDataType, String initialValue) {
		CodeSystemContentMode result = CodeSystemContentMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemContentModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyTypeFromString(EDataType eDataType, String initialValue) {
		PropertyType result = PropertyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimProcessingCodes createClaimProcessingCodesFromString(EDataType eDataType, String initialValue) {
		ClaimProcessingCodes result = ClaimProcessingCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimProcessingCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentTypeCodes createPaymentTypeCodesFromString(EDataType eDataType, String initialValue) {
		PaymentTypeCodes result = PaymentTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormCodes createFormCodesFromString(EDataType eDataType, String initialValue) {
		FormCodes result = FormCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType createNoteTypeFromString(EDataType eDataType, String initialValue) {
		NoteType result = NoteType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptProfileOriginType createTestScriptProfileOriginTypeFromString(EDataType eDataType, String initialValue) {
		TestScriptProfileOriginType result = TestScriptProfileOriginType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestScriptProfileOriginTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptProfileDestinationType createTestScriptProfileDestinationTypeFromString(EDataType eDataType, String initialValue) {
		TestScriptProfileDestinationType result = TestScriptProfileDestinationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestScriptProfileDestinationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementKind createCapabilityStatementKindFromString(EDataType eDataType, String initialValue) {
		CapabilityStatementKind result = CapabilityStatementKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityStatementKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownContentCode createUnknownContentCodeFromString(EDataType eDataType, String initialValue) {
		UnknownContentCode result = UnknownContentCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnknownContentCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulCapabilityMode createRestfulCapabilityModeFromString(EDataType eDataType, String initialValue) {
		RestfulCapabilityMode result = RestfulCapabilityMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulCapabilityModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulSecurityService createRestfulSecurityServiceFromString(EDataType eDataType, String initialValue) {
		RestfulSecurityService result = RestfulSecurityService.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulSecurityServiceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteraction createTypeRestfulInteractionFromString(EDataType eDataType, String initialValue) {
		TypeRestfulInteraction result = TypeRestfulInteraction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestfulInteractionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicy createResourceVersionPolicyFromString(EDataType eDataType, String initialValue) {
		ResourceVersionPolicy result = ResourceVersionPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceVersionPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalReadStatus createConditionalReadStatusFromString(EDataType eDataType, String initialValue) {
		ConditionalReadStatus result = ConditionalReadStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalReadStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatus createConditionalDeleteStatusFromString(EDataType eDataType, String initialValue) {
		ConditionalDeleteStatus result = ConditionalDeleteStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalDeleteStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceHandlingPolicy createReferenceHandlingPolicyFromString(EDataType eDataType, String initialValue) {
		ReferenceHandlingPolicy result = ReferenceHandlingPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceHandlingPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamType createSearchParamTypeFromString(EDataType eDataType, String initialValue) {
		SearchParamType result = SearchParamType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchParamTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteraction createSystemRestfulInteractionFromString(EDataType eDataType, String initialValue) {
		SystemRestfulInteraction result = SystemRestfulInteraction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemRestfulInteractionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKind createOperationKindFromString(EDataType eDataType, String initialValue) {
		OperationKind result = OperationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTransport createMessageTransportFromString(EDataType eDataType, String initialValue) {
		MessageTransport result = MessageTransport.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTransportToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEvent createMessageEventFromString(EDataType eDataType, String initialValue) {
		MessageEvent result = MessageEvent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageEventToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategory createMessageSignificanceCategoryFromString(EDataType eDataType, String initialValue) {
		MessageSignificanceCategory result = MessageSignificanceCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSignificanceCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCapabilityMode createEventCapabilityModeFromString(EDataType eDataType, String initialValue) {
		EventCapabilityMode result = EventCapabilityMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventCapabilityModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentMode createDocumentModeFromString(EDataType eDataType, String initialValue) {
		DocumentMode result = DocumentMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptOperationCode createTestScriptOperationCodeFromString(EDataType eDataType, String initialValue) {
		TestScriptOperationCode result = TestScriptOperationCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestScriptOperationCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType createContentTypeFromString(EDataType eDataType, String initialValue) {
		ContentType result = ContentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionType createAssertionDirectionTypeFromString(EDataType eDataType, String initialValue) {
		AssertionDirectionType result = AssertionDirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorType createAssertionOperatorTypeFromString(EDataType eDataType, String initialValue) {
		AssertionOperatorType result = AssertionOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypes createAssertionResponseTypesFromString(EDataType eDataType, String initialValue) {
		AssertionResponseTypes result = AssertionResponseTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionResponseTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementStringency createDataElementStringencyFromString(EDataType eDataType, String initialValue) {
		DataElementStringency result = DataElementStringency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataElementStringencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseType createResponseTypeFromString(EDataType eDataType, String initialValue) {
		ResponseType result = ResponseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverity createIssueSeverityFromString(EDataType eDataType, String initialValue) {
		IssueSeverity result = IssueSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueType createIssueTypeFromString(EDataType eDataType, String initialValue) {
		IssueType result = IssueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcomeCodes createOperationOutcomeCodesFromString(EDataType eDataType, String initialValue) {
		OperationOutcomeCodes result = OperationOutcomeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationOutcomeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleMessageReasonCodes createExampleMessageReasonCodesFromString(EDataType eDataType, String initialValue) {
		ExampleMessageReasonCodes result = ExampleMessageReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleMessageReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatus createSubscriptionStatusFromString(EDataType eDataType, String initialValue) {
		SubscriptionStatus result = SubscriptionStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannelType createSubscriptionChannelTypeFromString(EDataType eDataType, String initialValue) {
		SubscriptionChannelType result = SubscriptionChannelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionChannelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionTag createSubscriptionTagFromString(EDataType eDataType, String initialValue) {
		SubscriptionTag result = SubscriptionTag.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionTagToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodysiteLocationModifier createBodysiteLocationModifierFromString(EDataType eDataType, String initialValue) {
		BodysiteLocationModifier result = BodysiteLocationModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBodysiteLocationModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaccineAdministeredValueSet createVaccineAdministeredValueSetFromString(EDataType eDataType, String initialValue) {
		VaccineAdministeredValueSet result = VaccineAdministeredValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVaccineAdministeredValueSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationStatusCodes createImmunizationRecommendationStatusCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationRecommendationStatusCodes result = ImmunizationRecommendationStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationRecommendationStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationDateCriterionCodes createImmunizationRecommendationDateCriterionCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationRecommendationDateCriterionCodes result = ImmunizationRecommendationDateCriterionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationRecommendationDateCriterionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationStatusCodes createImmunizationStatusCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationStatusCodes result = ImmunizationStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationOrigin createImmunizationOriginFromString(EDataType eDataType, String initialValue) {
		ImmunizationOrigin result = ImmunizationOrigin.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationOriginToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodesForImmunizationSiteOfAdministration createCodesForImmunizationSiteOfAdministrationFromString(EDataType eDataType, String initialValue) {
		CodesForImmunizationSiteOfAdministration result = CodesForImmunizationSiteOfAdministration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodesForImmunizationSiteOfAdministrationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRouteCodes createImmunizationRouteCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationRouteCodes result = ImmunizationRouteCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationRouteCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationReasonCodes createImmunizationReasonCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationReasonCodes result = ImmunizationReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationReasonsForNotImmunizingCodes createImmunizationReasonsForNotImmunizingCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationReasonsForNotImmunizingCodes result = ImmunizationReasonsForNotImmunizingCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationReasonsForNotImmunizingCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaccinationProtocolDoseTargetCodes createVaccinationProtocolDoseTargetCodesFromString(EDataType eDataType, String initialValue) {
		VaccinationProtocolDoseTargetCodes result = VaccinationProtocolDoseTargetCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVaccinationProtocolDoseTargetCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaccinationProtocolDoseStatusCodes createVaccinationProtocolDoseStatusCodesFromString(EDataType eDataType, String initialValue) {
		VaccinationProtocolDoseStatusCodes result = VaccinationProtocolDoseStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVaccinationProtocolDoseStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaccinationProtocolDoseStatusReasonCodes createVaccinationProtocolDoseStatusReasonCodesFromString(EDataType eDataType, String initialValue) {
		VaccinationProtocolDoseStatusReasonCodes result = VaccinationProtocolDoseStatusReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVaccinationProtocolDoseStatusReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleType createBundleTypeFromString(EDataType eDataType, String initialValue) {
		BundleType result = BundleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBundleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryMode createSearchEntryModeFromString(EDataType eDataType, String initialValue) {
		SearchEntryMode result = SearchEntryMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchEntryModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpVerb createHttpVerbFromString(EDataType eDataType, String initialValue) {
		HttpVerb result = HttpVerb.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpVerbToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportStatus createTestReportStatusFromString(EDataType eDataType, String initialValue) {
		TestReportStatus result = TestReportStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportParticipantType createTestReportParticipantTypeFromString(EDataType eDataType, String initialValue) {
		TestReportParticipantType result = TestReportParticipantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportParticipantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportResultCodes createTestReportResultCodesFromString(EDataType eDataType, String initialValue) {
		TestReportResultCodes result = TestReportResultCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportResultCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityCodes createPriorityCodesFromString(EDataType eDataType, String initialValue) {
		PriorityCodes result = PriorityCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenefitCategoryCodes createBenefitCategoryCodesFromString(EDataType eDataType, String initialValue) {
		BenefitCategoryCodes result = BenefitCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBenefitCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenefitSubCategoryCodes createBenefitSubCategoryCodesFromString(EDataType eDataType, String initialValue) {
		BenefitSubCategoryCodes result = BenefitSubCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBenefitSubCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkTypeCodes createNetworkTypeCodesFromString(EDataType eDataType, String initialValue) {
		NetworkTypeCodes result = NetworkTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNetworkTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTypeCodes createUnitTypeCodesFromString(EDataType eDataType, String initialValue) {
		UnitTypeCodes result = UnitTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenefitTermCodes createBenefitTermCodesFromString(EDataType eDataType, String initialValue) {
		BenefitTermCodes result = BenefitTermCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBenefitTermCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenefitTypeCodes createBenefitTypeCodesFromString(EDataType eDataType, String initialValue) {
		BenefitTypeCodes result = BenefitTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBenefitTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjudicationErrorCodes createAdjudicationErrorCodesFromString(EDataType eDataType, String initialValue) {
		AdjudicationErrorCodes result = AdjudicationErrorCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjudicationErrorCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatus createMedicationDispenseStatusFromString(EDataType eDataType, String initialValue) {
		MedicationDispenseStatus result = MedicationDispenseStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationDispenseStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActPharmacySupplyType createActPharmacySupplyTypeFromString(EDataType eDataType, String initialValue) {
		ActPharmacySupplyType result = ActPharmacySupplyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActPharmacySupplyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActSubstanceAdminSubstitutionCode createActSubstanceAdminSubstitutionCodeFromString(EDataType eDataType, String initialValue) {
		ActSubstanceAdminSubstitutionCode result = ActSubstanceAdminSubstitutionCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActSubstanceAdminSubstitutionCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureScoring createMeasureScoringFromString(EDataType eDataType, String initialValue) {
		MeasureScoring result = MeasureScoring.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureScoringToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMeasureScoring createCompositeMeasureScoringFromString(EDataType eDataType, String initialValue) {
		CompositeMeasureScoring result = CompositeMeasureScoring.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositeMeasureScoringToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType createMeasureTypeFromString(EDataType eDataType, String initialValue) {
		MeasureType result = MeasureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurePopulationType createMeasurePopulationTypeFromString(EDataType eDataType, String initialValue) {
		MeasurePopulationType result = MeasurePopulationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurePopulationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureDataUsage createMeasureDataUsageFromString(EDataType eDataType, String initialValue) {
		MeasureDataUsage result = MeasureDataUsage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureDataUsageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportType createMeasureReportTypeFromString(EDataType eDataType, String initialValue) {
		MeasureReportType result = MeasureReportType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStatus createMeasureReportStatusFromString(EDataType eDataType, String initialValue) {
		MeasureReportStatus result = MeasureReportStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatus createListStatusFromString(EDataType eDataType, String initialValue) {
		ListStatus result = ListStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleUseCodesForList createExampleUseCodesForListFromString(EDataType eDataType, String initialValue) {
		ExampleUseCodesForList result = ExampleUseCodesForList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleUseCodesForListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientMedicineChangeTypes createPatientMedicineChangeTypesFromString(EDataType eDataType, String initialValue) {
		PatientMedicineChangeTypes result = PatientMedicineChangeTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientMedicineChangeTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleClaimTypeCodes createExampleClaimTypeCodesFromString(EDataType eDataType, String initialValue) {
		ExampleClaimTypeCodes result = ExampleClaimTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleClaimTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleClaimSubTypeCodes createExampleClaimSubTypeCodesFromString(EDataType eDataType, String initialValue) {
		ExampleClaimSubTypeCodes result = ExampleClaimSubTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleClaimSubTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Use createUseFromString(EDataType eDataType, String initialValue) {
		Use result = Use.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FundsReservationCodes createFundsReservationCodesFromString(EDataType eDataType, String initialValue) {
		FundsReservationCodes result = FundsReservationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFundsReservationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleRelatedClaimRelationshipCodes createExampleRelatedClaimRelationshipCodesFromString(EDataType eDataType, String initialValue) {
		ExampleRelatedClaimRelationshipCodes result = ExampleRelatedClaimRelationshipCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleRelatedClaimRelationshipCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayeeTypeCodes createPayeeTypeCodesFromString(EDataType eDataType, String initialValue) {
		PayeeTypeCodes result = PayeeTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPayeeTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayeeResourceType createPayeeResourceTypeFromString(EDataType eDataType, String initialValue) {
		PayeeResourceType result = PayeeResourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPayeeResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayeeResourceType createPayeeResourceTypeFromString(EDataType eDataType, String initialValue) {
		PayeeResourceType result = PayeeResourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPayeeResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimCareTeamRoleCodes createClaimCareTeamRoleCodesFromString(EDataType eDataType, String initialValue) {
		ClaimCareTeamRoleCodes result = ClaimCareTeamRoleCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimCareTeamRoleCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleProviderQualificationCodes createExampleProviderQualificationCodesFromString(EDataType eDataType, String initialValue) {
		ExampleProviderQualificationCodes result = ExampleProviderQualificationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleProviderQualificationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimInformationCategoryCodes createClaimInformationCategoryCodesFromString(EDataType eDataType, String initialValue) {
		ClaimInformationCategoryCodes result = ClaimInformationCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimInformationCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionCodes createExceptionCodesFromString(EDataType eDataType, String initialValue) {
		ExceptionCodes result = ExceptionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissingToothReasonCodes createMissingToothReasonCodesFromString(EDataType eDataType, String initialValue) {
		MissingToothReasonCodes result = MissingToothReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMissingToothReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IcD10Codes createIcD10CodesFromString(EDataType eDataType, String initialValue) {
		IcD10Codes result = IcD10Codes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIcD10CodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleDiagnosisTypeCodes createExampleDiagnosisTypeCodesFromString(EDataType eDataType, String initialValue) {
		ExampleDiagnosisTypeCodes result = ExampleDiagnosisTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleDiagnosisTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleDiagnosisRelatedGroupCodes createExampleDiagnosisRelatedGroupCodesFromString(EDataType eDataType, String initialValue) {
		ExampleDiagnosisRelatedGroupCodes result = ExampleDiagnosisRelatedGroupCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleDiagnosisRelatedGroupCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IcD10ProcedureCodes createIcD10ProcedureCodesFromString(EDataType eDataType, String initialValue) {
		IcD10ProcedureCodes result = IcD10ProcedureCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIcD10ProcedureCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActIncidentCode createActIncidentCodeFromString(EDataType eDataType, String initialValue) {
		ActIncidentCode result = ActIncidentCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActIncidentCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleRevenueCenterCodes createExampleRevenueCenterCodesFromString(EDataType eDataType, String initialValue) {
		ExampleRevenueCenterCodes result = ExampleRevenueCenterCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleRevenueCenterCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsclsCodes createUsclsCodesFromString(EDataType eDataType, String initialValue) {
		UsclsCodes result = UsclsCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsclsCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifierTypeCodes createModifierTypeCodesFromString(EDataType eDataType, String initialValue) {
		ModifierTypeCodes result = ModifierTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModifierTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleProgramReasonCodes createExampleProgramReasonCodesFromString(EDataType eDataType, String initialValue) {
		ExampleProgramReasonCodes result = ExampleProgramReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleProgramReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleServicePlaceCodes createExampleServicePlaceCodesFromString(EDataType eDataType, String initialValue) {
		ExampleServicePlaceCodes result = ExampleServicePlaceCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleServicePlaceCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OralSiteCodes createOralSiteCodesFromString(EDataType eDataType, String initialValue) {
		OralSiteCodes result = OralSiteCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOralSiteCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceCodes createSurfaceCodesFromString(EDataType eDataType, String initialValue) {
		SurfaceCodes result = SurfaceCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSurfaceCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OralProsthoMaterialTypeCodes createOralProsthoMaterialTypeCodesFromString(EDataType eDataType, String initialValue) {
		OralProsthoMaterialTypeCodes result = OralProsthoMaterialTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOralProsthoMaterialTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjudicationCodes createAdjudicationCodesFromString(EDataType eDataType, String initialValue) {
		AdjudicationCodes result = AdjudicationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjudicationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjudicationReasonCodes createAdjudicationReasonCodesFromString(EDataType eDataType, String initialValue) {
		AdjudicationReasonCodes result = AdjudicationReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjudicationReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamplePaymentTypeCodes createExamplePaymentTypeCodesFromString(EDataType eDataType, String initialValue) {
		ExamplePaymentTypeCodes result = ExamplePaymentTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExamplePaymentTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentAdjustmentReasonCodes createPaymentAdjustmentReasonCodesFromString(EDataType eDataType, String initialValue) {
		PaymentAdjustmentReasonCodes result = PaymentAdjustmentReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentAdjustmentReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatus createTaskStatusFromString(EDataType eDataType, String initialValue) {
		TaskStatus result = TaskStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPerformerType createTaskPerformerTypeFromString(EDataType eDataType, String initialValue) {
		TaskPerformerType result = TaskPerformerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskPerformerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitStatus createExplanationOfBenefitStatusFromString(EDataType eDataType, String initialValue) {
		ExplanationOfBenefitStatus result = ExplanationOfBenefitStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExplanationOfBenefitStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayeeResourceType createPayeeResourceTypeFromString(EDataType eDataType, String initialValue) {
		PayeeResourceType result = PayeeResourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPayeeResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActInvoiceGroupCode createActInvoiceGroupCodeFromString(EDataType eDataType, String initialValue) {
		ActInvoiceGroupCode result = ActInvoiceGroupCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActInvoiceGroupCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuideDependencyType createGuideDependencyTypeFromString(EDataType eDataType, String initialValue) {
		GuideDependencyType result = GuideDependencyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuideDependencyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageKind createGuidePageKindFromString(EDataType eDataType, String initialValue) {
		GuidePageKind result = GuidePageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidePageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathUsageType createXPathUsageTypeFromString(EDataType eDataType, String initialValue) {
		XPathUsageType result = XPathUsageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXPathUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchComparator createSearchComparatorFromString(EDataType eDataType, String initialValue) {
		SearchComparator result = SearchComparator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchComparatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchModifierCode createSearchModifierCodeFromString(EDataType eDataType, String initialValue) {
		SearchModifierCode result = SearchModifierCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchModifierCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemVersionProcessingMode createSystemVersionProcessingModeFromString(EDataType eDataType, String initialValue) {
		SystemVersionProcessingMode result = SystemVersionProcessingMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemVersionProcessingModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentType createCompartmentTypeFromString(EDataType eDataType, String initialValue) {
		CompartmentType result = CompartmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompartmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessOutcomeCodes createProcessOutcomeCodesFromString(EDataType eDataType, String initialValue) {
		ProcessOutcomeCodes result = ProcessOutcomeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessOutcomeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentStatusCodes createPaymentStatusCodesFromString(EDataType eDataType, String initialValue) {
		PaymentStatusCodes result = PaymentStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageType createLinkageTypeFromString(EDataType eDataType, String initialValue) {
		LinkageType result = LinkageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatus createSupplyRequestStatusFromString(EDataType eDataType, String initialValue) {
		SupplyRequestStatus result = SupplyRequestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyType createSupplyTypeFromString(EDataType eDataType, String initialValue) {
		SupplyType result = SupplyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtSupplyItem createSnomedCtSupplyItemFromString(EDataType eDataType, String initialValue) {
		SnomedCtSupplyItem result = SnomedCtSupplyItem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtSupplyItemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestReason createSupplyRequestReasonFromString(EDataType eDataType, String initialValue) {
		SupplyRequestReason result = SupplyRequestReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestWhen createSupplyRequestWhenFromString(EDataType eDataType, String initialValue) {
		SupplyRequestWhen result = SupplyRequestWhen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestWhenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatus createGuidanceResponseStatusFromString(EDataType eDataType, String initialValue) {
		GuidanceResponseStatus result = GuidanceResponseStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidanceResponseStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueCategory createDetectedIssueCategoryFromString(EDataType eDataType, String initialValue) {
		DetectedIssueCategory result = DetectedIssueCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueSeverity createDetectedIssueSeverityFromString(EDataType eDataType, String initialValue) {
		DetectedIssueSeverity result = DetectedIssueSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueMitigationAction createDetectedIssueMitigationActionFromString(EDataType eDataType, String initialValue) {
		DetectedIssueMitigationAction result = DetectedIssueMitigationAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueMitigationActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventId createAuditEventIdFromString(EDataType eDataType, String initialValue) {
		AuditEventId result = AuditEventId.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventIdToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSubType createAuditEventSubTypeFromString(EDataType eDataType, String initialValue) {
		AuditEventSubType result = AuditEventSubType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventSubTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAction createAuditEventActionFromString(EDataType eDataType, String initialValue) {
		AuditEventAction result = AuditEventAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcome createAuditEventOutcomeFromString(EDataType eDataType, String initialValue) {
		AuditEventOutcome result = AuditEventOutcome.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventOutcomeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditAgentRoleIdCode createAuditAgentRoleIdCodeFromString(EDataType eDataType, String initialValue) {
		AuditAgentRoleIdCode result = AuditAgentRoleIdCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditAgentRoleIdCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeCode createMediaTypeCodeFromString(EDataType eDataType, String initialValue) {
		MediaTypeCode result = MediaTypeCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgentNetworkType createAuditEventAgentNetworkTypeFromString(EDataType eDataType, String initialValue) {
		AuditEventAgentNetworkType result = AuditEventAgentNetworkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventAgentNetworkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSourceType createAuditEventSourceTypeFromString(EDataType eDataType, String initialValue) {
		AuditEventSourceType result = AuditEventSourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEntityType createAuditEventEntityTypeFromString(EDataType eDataType, String initialValue) {
		AuditEventEntityType result = AuditEventEntityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventEntityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEntityRole createAuditEventEntityRoleFromString(EDataType eDataType, String initialValue) {
		AuditEventEntityRole result = AuditEventEntityRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventEntityRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEntityLifecycle createAuditEventEntityLifecycleFromString(EDataType eDataType, String initialValue) {
		AuditEventEntityLifecycle result = AuditEventEntityLifecycle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventEntityLifecycleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicResourceTypes createBasicResourceTypesFromString(EDataType eDataType, String initialValue) {
		BasicResourceTypes result = BasicResourceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasicResourceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliveryStatus createSupplyDeliveryStatusFromString(EDataType eDataType, String initialValue) {
		SupplyDeliveryStatus result = SupplyDeliveryStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyDeliveryStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyItemType createSupplyItemTypeFromString(EDataType eDataType, String initialValue) {
		SupplyItemType result = SupplyItemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyItemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetsPackage getValueSetsPackage() {
		return (ValueSetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValueSetsPackage getPackage() {
		return ValueSetsPackage.eINSTANCE;
	}

} //ValueSetsFactoryImpl
