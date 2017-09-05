/**
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.mdht.uml.fhir.core.resources.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcesFactoryImpl extends EFactoryImpl implements ResourcesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourcesFactory init() {
		try {
			ResourcesFactory theResourcesFactory = (ResourcesFactory)EPackage.Registry.INSTANCE.getEFactory(ResourcesPackage.eNS_URI);
			if (theResourcesFactory != null) {
				return theResourcesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourcesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesFactoryImpl() {
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
			case ResourcesPackage.PRACTITIONER: return createPractitioner();
			case ResourcesPackage.PRACTITIONER_ROLE: return createPractitionerRole();
			case ResourcesPackage.LOCATION: return createLocation();
			case ResourcesPackage.LOCATION_POSITION: return createLocationPosition();
			case ResourcesPackage.ENDPOINT: return createEndpoint();
			case ResourcesPackage.HEALTHCARE_SERVICE: return createHealthcareService();
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME: return createHealthcareServiceAvailableTime();
			case ResourcesPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE: return createHealthcareServiceNotAvailable();
			case ResourcesPackage.PRACTITIONER_QUALIFICATION: return createPractitionerQualification();
			case ResourcesPackage.PATIENT: return createPatient();
			case ResourcesPackage.PATIENT_CONTACT: return createPatientContact();
			case ResourcesPackage.PATIENT_ANIMAL: return createPatientAnimal();
			case ResourcesPackage.PATIENT_COMMUNICATION: return createPatientCommunication();
			case ResourcesPackage.PATIENT_LINK: return createPatientLink();
			case ResourcesPackage.RELATED_PERSON: return createRelatedPerson();
			case ResourcesPackage.DEVICE: return createDevice();
			case ResourcesPackage.LIBRARY: return createLibrary();
			case ResourcesPackage.STRUCTURE_DEFINITION: return createStructureDefinition();
			case ResourcesPackage.STRUCTURE_DEFINITION_MAPPING: return createStructureDefinitionMapping();
			case ResourcesPackage.STRUCTURE_DEFINITION_SNAPSHOT: return createStructureDefinitionSnapshot();
			case ResourcesPackage.STRUCTURE_DEFINITION_DIFFERENTIAL: return createStructureDefinitionDifferential();
			case ResourcesPackage.VALUE_SET: return createValueSet();
			case ResourcesPackage.VALUE_SET_COMPOSE: return createValueSetCompose();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET: return createValueSetComposeConceptSet();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE: return createValueSetComposeConceptSetConceptReference();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE_DESIGNATION: return createValueSetComposeConceptSetConceptReferenceDesignation();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_FILTER: return createValueSetComposeConceptSetFilter();
			case ResourcesPackage.VALUE_SET_EXPANSION: return createValueSetExpansion();
			case ResourcesPackage.VALUE_SET_EXPANSION_PARAMETER: return createValueSetExpansionParameter();
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS: return createValueSetExpansionContains();
			case ResourcesPackage.RESEARCH_SUBJECT: return createResearchSubject();
			case ResourcesPackage.RESEARCH_STUDY: return createResearchStudy();
			case ResourcesPackage.PLAN_DEFINITION: return createPlanDefinition();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION: return createPlanDefinitionActionDefinition();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION_CONDITION: return createPlanDefinitionActionDefinitionCondition();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION_RELATED_ACTION: return createPlanDefinitionActionDefinitionRelatedAction();
			case ResourcesPackage.ACTIVITY_DEFINITION: return createActivityDefinition();
			case ResourcesPackage.STRUCTURE_MAP: return createStructureMap();
			case ResourcesPackage.STRUCTURE_MAP_STRUCTURE: return createStructureMapStructure();
			case ResourcesPackage.STRUCTURE_MAP_GROUP: return createStructureMapGroup();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT: return createStructureMapGroupInput();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE: return createStructureMapGroupRule();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE: return createStructureMapGroupRuleSource();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET: return createStructureMapGroupRuleTarget();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET_PARAMETER: return createStructureMapGroupRuleTargetParameter();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_DEPENDENT: return createStructureMapGroupRuleDependent();
			case ResourcesPackage.ACTIVITY_DEFINITION_DYNAMIC_VALUE: return createActivityDefinitionDynamicValue();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION_DYNAMIC_VALUE: return createPlanDefinitionActionDefinitionDynamicValue();
			case ResourcesPackage.GROUP: return createGroup();
			case ResourcesPackage.GROUP_CHARACTERISTIC: return createGroupCharacteristic();
			case ResourcesPackage.GROUP_MEMBER: return createGroupMember();
			case ResourcesPackage.RESEARCH_STUDY_ARM: return createResearchStudyArm();
			case ResourcesPackage.CONSENT: return createConsent();
			case ResourcesPackage.CONSENT_EXCEPT: return createConsentExcept();
			case ResourcesPackage.CONSENT_EXCEPT_ACTOR: return createConsentExceptActor();
			case ResourcesPackage.CONSENT_EXCEPT_DATA: return createConsentExceptData();
			case ResourcesPackage.SCHEDULE: return createSchedule();
			case ResourcesPackage.MEDICATION: return createMedication();
			case ResourcesPackage.MEDICATION_PRODUCT: return createMedicationProduct();
			case ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT: return createMedicationProductIngredient();
			case ResourcesPackage.MEDICATION_PRODUCT_BATCH: return createMedicationProductBatch();
			case ResourcesPackage.MEDICATION_PACKAGE: return createMedicationPackage();
			case ResourcesPackage.MEDICATION_PACKAGE_CONTENT: return createMedicationPackageContent();
			case ResourcesPackage.SUBSTANCE: return createSubstance();
			case ResourcesPackage.SUBSTANCE_INSTANCE: return createSubstanceInstance();
			case ResourcesPackage.SUBSTANCE_INGREDIENT: return createSubstanceIngredient();
			case ResourcesPackage.DOCUMENT_REFERENCE: return createDocumentReference();
			case ResourcesPackage.DOCUMENT_REFERENCE_RELATES_TO: return createDocumentReferenceRelatesTo();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTENT: return createDocumentReferenceContent();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT: return createDocumentReferenceContext();
			case ResourcesPackage.ENCOUNTER: return createEncounter();
			case ResourcesPackage.ENCOUNTER_STATUS_HISTORY: return createEncounterStatusHistory();
			case ResourcesPackage.EPISODE_OF_CARE: return createEpisodeOfCare();
			case ResourcesPackage.EPISODE_OF_CARE_STATUS_HISTORY: return createEpisodeOfCareStatusHistory();
			case ResourcesPackage.CONDITION: return createCondition();
			case ResourcesPackage.CONDITION_STAGE: return createConditionStage();
			case ResourcesPackage.CONDITION_EVIDENCE: return createConditionEvidence();
			case ResourcesPackage.REFERRAL_REQUEST: return createReferralRequest();
			case ResourcesPackage.CARE_TEAM: return createCareTeam();
			case ResourcesPackage.CARE_TEAM_PARTICIPANT: return createCareTeamParticipant();
			case ResourcesPackage.ACCOUNT: return createAccount();
			case ResourcesPackage.COVERAGE: return createCoverage();
			case ResourcesPackage.COVERAGE_GROUP: return createCoverageGroup();
			case ResourcesPackage.CONTRACT: return createContract();
			case ResourcesPackage.CONTRACT_AGENT: return createContractAgent();
			case ResourcesPackage.CONTRACT_SIGNATORY: return createContractSignatory();
			case ResourcesPackage.CONTRACT_VALUED_ITEM: return createContractValuedItem();
			case ResourcesPackage.CONTRACT_TERM: return createContractTerm();
			case ResourcesPackage.CONTRACT_TERM_TERM_AGENT: return createContractTermTermAgent();
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM: return createContractTermTermValuedItem();
			case ResourcesPackage.CONTRACT_FRIENDLY_LANGUAGE: return createContractFriendlyLanguage();
			case ResourcesPackage.CONTRACT_LEGAL_LANGUAGE: return createContractLegalLanguage();
			case ResourcesPackage.CONTRACT_COMPUTABLE_LANGUAGE: return createContractComputableLanguage();
			case ResourcesPackage.ACCOUNT_GUARANTOR: return createAccountGuarantor();
			case ResourcesPackage.ENCOUNTER_PARTICIPANT: return createEncounterParticipant();
			case ResourcesPackage.APPOINTMENT: return createAppointment();
			case ResourcesPackage.SLOT: return createSlot();
			case ResourcesPackage.APPOINTMENT_PARTICIPANT: return createAppointmentParticipant();
			case ResourcesPackage.ENCOUNTER_HOSPITALIZATION: return createEncounterHospitalization();
			case ResourcesPackage.ENCOUNTER_LOCATION: return createEncounterLocation();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT_RELATED: return createDocumentReferenceContextRelated();
			case ResourcesPackage.CLINICAL_IMPRESSION: return createClinicalImpression();
			case ResourcesPackage.CLINICAL_IMPRESSION_INVESTIGATION: return createClinicalImpressionInvestigation();
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING: return createClinicalImpressionFinding();
			case ResourcesPackage.RISK_ASSESSMENT: return createRiskAssessment();
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION: return createRiskAssessmentPrediction();
			case ResourcesPackage.ALLERGY_INTOLERANCE: return createAllergyIntolerance();
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION: return createAllergyIntoleranceReaction();
			case ResourcesPackage.OBSERVATION: return createObservation();
			case ResourcesPackage.SPECIMEN: return createSpecimen();
			case ResourcesPackage.SPECIMEN_COLLECTION: return createSpecimenCollection();
			case ResourcesPackage.SPECIMEN_TREATMENT: return createSpecimenTreatment();
			case ResourcesPackage.SPECIMEN_CONTAINER: return createSpecimenContainer();
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE: return createObservationReferenceRange();
			case ResourcesPackage.OBSERVATION_RELATED: return createObservationRelated();
			case ResourcesPackage.OBSERVATION_COMPONENT: return createObservationComponent();
			case ResourcesPackage.DIAGNOSTIC_REQUEST: return createDiagnosticRequest();
			case ResourcesPackage.PROVENANCE: return createProvenance();
			case ResourcesPackage.PROVENANCE_AGENT: return createProvenanceAgent();
			case ResourcesPackage.PROVENANCE_ENTITY: return createProvenanceEntity();
			case ResourcesPackage.PROCEDURE_REQUEST: return createProcedureRequest();
			case ResourcesPackage.DEVICE_METRIC: return createDeviceMetric();
			case ResourcesPackage.DEVICE_COMPONENT: return createDeviceComponent();
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION: return createDeviceComponentProductionSpecification();
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION: return createDeviceMetricCalibration();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE: return createQuestionnaireResponse();
			case ResourcesPackage.QUESTIONNAIRE: return createQuestionnaire();
			case ResourcesPackage.QUESTIONNAIRE_ITEM: return createQuestionnaireItem();
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN: return createQuestionnaireItemEnableWhen();
			case ResourcesPackage.QUESTIONNAIRE_ITEM_OPTION: return createQuestionnaireItemOption();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM: return createQuestionnaireResponseItem();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER: return createQuestionnaireResponseItemAnswer();
			case ResourcesPackage.CARE_PLAN: return createCarePlan();
			case ResourcesPackage.CARE_PLAN_RELATED_PLAN: return createCarePlanRelatedPlan();
			case ResourcesPackage.GOAL: return createGoal();
			case ResourcesPackage.GOAL_OUTCOME: return createGoalOutcome();
			case ResourcesPackage.CARE_PLAN_ACTIVITY: return createCarePlanActivity();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL: return createCarePlanActivityDetail();
			case ResourcesPackage.MEDICATION_STATEMENT: return createMedicationStatement();
			case ResourcesPackage.NUTRITION_REQUEST: return createNutritionRequest();
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET: return createNutritionRequestOralDiet();
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_NUTRIENT: return createNutritionRequestOralDietNutrient();
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE: return createNutritionRequestOralDietTexture();
			case ResourcesPackage.NUTRITION_REQUEST_SUPPLEMENT: return createNutritionRequestSupplement();
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA: return createNutritionRequestEnteralFormula();
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION: return createNutritionRequestEnteralFormulaAdministration();
			case ResourcesPackage.COMMUNICATION_REQUEST: return createCommunicationRequest();
			case ResourcesPackage.COMMUNICATION_REQUEST_PAYLOAD: return createCommunicationRequestPayload();
			case ResourcesPackage.DEVICE_USE_REQUEST: return createDeviceUseRequest();
			case ResourcesPackage.MEDICATION_REQUEST: return createMedicationRequest();
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST: return createMedicationRequestDispenseRequest();
			case ResourcesPackage.MEDICATION_REQUEST_SUBSTITUTION: return createMedicationRequestSubstitution();
			case ResourcesPackage.PROCESS_REQUEST: return createProcessRequest();
			case ResourcesPackage.PROCESS_REQUEST_ITEMS: return createProcessRequestItems();
			case ResourcesPackage.VISION_PRESCRIPTION: return createVisionPrescription();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE: return createVisionPrescriptionDispense();
			case ResourcesPackage.PROCEDURE: return createProcedure();
			case ResourcesPackage.PROCEDURE_PERFORMER: return createProcedurePerformer();
			case ResourcesPackage.DIAGNOSTIC_REPORT: return createDiagnosticReport();
			case ResourcesPackage.DIAGNOSTIC_REPORT_IMAGE: return createDiagnosticReportImage();
			case ResourcesPackage.MEDIA: return createMedia();
			case ResourcesPackage.PROCEDURE_FOCAL_DEVICE: return createProcedureFocalDevice();
			case ResourcesPackage.IMAGING_STUDY: return createImagingStudy();
			case ResourcesPackage.IMAGING_STUDY_STUDY_BASE_LOCATION: return createImagingStudyStudyBaseLocation();
			case ResourcesPackage.IMAGING_STUDY_SERIES: return createImagingStudySeries();
			case ResourcesPackage.IMAGING_STUDY_SERIES_SERIES_BASE_LOCATION: return createImagingStudySeriesSeriesBaseLocation();
			case ResourcesPackage.IMAGING_STUDY_SERIES_INSTANCE: return createImagingStudySeriesInstance();
			case ResourcesPackage.IMAGING_MANIFEST: return createImagingManifest();
			case ResourcesPackage.IMAGING_MANIFEST_STUDY: return createImagingManifestStudy();
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_STUDY_BASE_LOCATION: return createImagingManifestStudyStudyBaseLocation();
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES: return createImagingManifestStudySeries();
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES_SERIES_BASE_LOCATION: return createImagingManifestStudySeriesSeriesBaseLocation();
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES_INSTANCE: return createImagingManifestStudySeriesInstance();
			case ResourcesPackage.MEDICATION_ADMINISTRATION: return createMedicationAdministration();
			case ResourcesPackage.MEDICATION_ADMINISTRATION_DOSAGE: return createMedicationAdministrationDosage();
			case ResourcesPackage.SEQUENCE: return createSequence();
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ: return createSequenceReferenceSeq();
			case ResourcesPackage.SEQUENCE_VARIANT: return createSequenceVariant();
			case ResourcesPackage.SEQUENCE_QUALITY: return createSequenceQuality();
			case ResourcesPackage.SEQUENCE_REPOSITORY: return createSequenceRepository();
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT: return createSequenceStructureVariant();
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT_OUTER: return createSequenceStructureVariantOuter();
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT_INNER: return createSequenceStructureVariantInner();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY: return createFamilyMemberHistory();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION: return createFamilyMemberHistoryCondition();
			case ResourcesPackage.COMPOSITION: return createComposition();
			case ResourcesPackage.COMPOSITION_ATTESTER: return createCompositionAttester();
			case ResourcesPackage.COMPOSITION_EVENT: return createCompositionEvent();
			case ResourcesPackage.COMPOSITION_SECTION: return createCompositionSection();
			case ResourcesPackage.COMMUNICATION: return createCommunication();
			case ResourcesPackage.COMMUNICATION_PAYLOAD: return createCommunicationPayload();
			case ResourcesPackage.NAMING_SYSTEM: return createNamingSystem();
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID: return createNamingSystemUniqueId();
			case ResourcesPackage.CONCEPT_MAP: return createConceptMap();
			case ResourcesPackage.CONCEPT_MAP_GROUP: return createConceptMapGroup();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT: return createConceptMapGroupSourceElement();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT: return createConceptMapGroupSourceElementTargetElement();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT: return createConceptMapGroupSourceElementTargetElementOtherElement();
			case ResourcesPackage.REQUEST_GROUP: return createRequestGroup();
			case ResourcesPackage.REQUEST_GROUP_ACTION: return createRequestGroupAction();
			case ResourcesPackage.REQUEST_GROUP_ACTION_CONDITION: return createRequestGroupActionCondition();
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION: return createRequestGroupActionRelatedAction();
			case ResourcesPackage.PERSON: return createPerson();
			case ResourcesPackage.PERSON_LINK: return createPersonLink();
			case ResourcesPackage.FLAG: return createFlag();
			case ResourcesPackage.CODE_SYSTEM: return createCodeSystem();
			case ResourcesPackage.CODE_SYSTEM_FILTER: return createCodeSystemFilter();
			case ResourcesPackage.CODE_SYSTEM_PROPERTY: return createCodeSystemProperty();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION: return createCodeSystemConceptDefinition();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION_DESIGNATION: return createCodeSystemConceptDefinitionDesignation();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION_CONCEPT_PROPERTY: return createCodeSystemConceptDefinitionConceptProperty();
			case ResourcesPackage.BINARY: return createBinary();
			case ResourcesPackage.DOCUMENT_MANIFEST: return createDocumentManifest();
			case ResourcesPackage.DOCUMENT_MANIFEST_CONTENT: return createDocumentManifestContent();
			case ResourcesPackage.DOCUMENT_MANIFEST_RELATED: return createDocumentManifestRelated();
			case ResourcesPackage.PAYMENT_RECONCILIATION: return createPaymentReconciliation();
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS: return createPaymentReconciliationDetails();
			case ResourcesPackage.PAYMENT_RECONCILIATION_NOTES: return createPaymentReconciliationNotes();
			case ResourcesPackage.DEVICE_USE_STATEMENT: return createDeviceUseStatement();
			case ResourcesPackage.TEST_SCRIPT: return createTestScript();
			case ResourcesPackage.TEST_SCRIPT_ORIGIN: return createTestScriptOrigin();
			case ResourcesPackage.TEST_SCRIPT_DESTINATION: return createTestScriptDestination();
			case ResourcesPackage.TEST_SCRIPT_METADATA: return createTestScriptMetadata();
			case ResourcesPackage.TEST_SCRIPT_METADATA_LINK: return createTestScriptMetadataLink();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY: return createTestScriptMetadataCapability();
			case ResourcesPackage.CAPABILITY_STATEMENT: return createCapabilityStatement();
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE: return createCapabilityStatementSoftware();
			case ResourcesPackage.CAPABILITY_STATEMENT_IMPLEMENTATION: return createCapabilityStatementImplementation();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST: return createCapabilityStatementRest();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY: return createCapabilityStatementRestSecurity();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY_CERTIFICATE: return createCapabilityStatementRestSecurityCertificate();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE: return createCapabilityStatementRestResource();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_RESOURCE_INTERACTION: return createCapabilityStatementRestResourceResourceInteraction();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_SEARCH_PARAM: return createCapabilityStatementRestResourceSearchParam();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SYSTEM_INTERACTION: return createCapabilityStatementRestSystemInteraction();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_OPERATION: return createCapabilityStatementRestOperation();
			case ResourcesPackage.OPERATION_DEFINITION: return createOperationDefinition();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER: return createOperationDefinitionParameter();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING: return createOperationDefinitionParameterBinding();
			case ResourcesPackage.OPERATION_DEFINITION_OVERLOAD: return createOperationDefinitionOverload();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING: return createCapabilityStatementMessaging();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_ENDPOINT: return createCapabilityStatementMessagingEndpoint();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT: return createCapabilityStatementMessagingEvent();
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT: return createCapabilityStatementDocument();
			case ResourcesPackage.TEST_SCRIPT_FIXTURE: return createTestScriptFixture();
			case ResourcesPackage.TEST_SCRIPT_VARIABLE: return createTestScriptVariable();
			case ResourcesPackage.TEST_SCRIPT_RULE: return createTestScriptRule();
			case ResourcesPackage.TEST_SCRIPT_RULE_RULE_PARAM: return createTestScriptRuleRuleParam();
			case ResourcesPackage.TEST_SCRIPT_RULESET: return createTestScriptRuleset();
			case ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE: return createTestScriptRulesetRulesetRule();
			case ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE_RULESET_RULE_PARAM: return createTestScriptRulesetRulesetRuleRulesetRuleParam();
			case ResourcesPackage.TEST_SCRIPT_SETUP: return createTestScriptSetup();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION: return createTestScriptSetupSetupAction();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION: return createTestScriptSetupSetupActionOperation();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER: return createTestScriptSetupSetupActionOperationRequestHeader();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT: return createTestScriptSetupSetupActionAssert();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULE: return createTestScriptSetupSetupActionAssertActionAssertRule();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULE_ACTION_ASSERT_RULE_PARAM: return createTestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET: return createTestScriptSetupSetupActionAssertActionAssertRuleset();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET_ACTION_ASSERT_RULESET_RULE: return createTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET_ACTION_ASSERT_RULESET_RULE_PARAM: return createTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam();
			case ResourcesPackage.TEST_SCRIPT_TEST: return createTestScriptTest();
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION: return createTestScriptTestTestAction();
			case ResourcesPackage.TEST_SCRIPT_TEARDOWN: return createTestScriptTeardown();
			case ResourcesPackage.TEST_SCRIPT_TEARDOWN_TEARDOWN_ACTION: return createTestScriptTeardownTeardownAction();
			case ResourcesPackage.DATA_ELEMENT: return createDataElement();
			case ResourcesPackage.DATA_ELEMENT_MAPPING: return createDataElementMapping();
			case ResourcesPackage.MESSAGE_HEADER: return createMessageHeader();
			case ResourcesPackage.MESSAGE_HEADER_RESPONSE: return createMessageHeaderResponse();
			case ResourcesPackage.OPERATION_OUTCOME: return createOperationOutcome();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE: return createOperationOutcomeIssue();
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_SOURCE: return createMessageHeaderMessageSource();
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION: return createMessageHeaderMessageDestination();
			case ResourcesPackage.SUBSCRIPTION: return createSubscription();
			case ResourcesPackage.SUBSCRIPTION_CHANNEL: return createSubscriptionChannel();
			case ResourcesPackage.BODY_SITE: return createBodySite();
			case ResourcesPackage.SERVICE_DEFINITION: return createServiceDefinition();
			case ResourcesPackage.ENROLLMENT_RESPONSE: return createEnrollmentResponse();
			case ResourcesPackage.ENROLLMENT_REQUEST: return createEnrollmentRequest();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION: return createImmunizationRecommendation();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: return createImmunizationRecommendationRecommendation();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_DATE_CRITERION: return createImmunizationRecommendationRecommendationDateCriterion();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL: return createImmunizationRecommendationRecommendationProtocol();
			case ResourcesPackage.IMMUNIZATION: return createImmunization();
			case ResourcesPackage.IMMUNIZATION_EXPLANATION: return createImmunizationExplanation();
			case ResourcesPackage.IMMUNIZATION_REACTION: return createImmunizationReaction();
			case ResourcesPackage.IMMUNIZATION_VACCINATION_PROTOCOL: return createImmunizationVaccinationProtocol();
			case ResourcesPackage.BUNDLE: return createBundle();
			case ResourcesPackage.BUNDLE_LINK: return createBundleLink();
			case ResourcesPackage.BUNDLE_ENTRY: return createBundleEntry();
			case ResourcesPackage.BUNDLE_ENTRY_SEARCH: return createBundleEntrySearch();
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST: return createBundleEntryRequest();
			case ResourcesPackage.BUNDLE_ENTRY_RESPONSE: return createBundleEntryResponse();
			case ResourcesPackage.TEST_REPORT: return createTestReport();
			case ResourcesPackage.TEST_REPORT_PARTICIPANT: return createTestReportParticipant();
			case ResourcesPackage.TEST_REPORT_SETUP: return createTestReportSetup();
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION: return createTestReportSetupSetupAction();
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_OPERATION: return createTestReportSetupSetupActionOperation();
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT: return createTestReportSetupSetupActionAssert();
			case ResourcesPackage.TEST_REPORT_TEST: return createTestReportTest();
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION: return createTestReportTestTestAction();
			case ResourcesPackage.TEST_REPORT_TEARDOWN: return createTestReportTeardown();
			case ResourcesPackage.TEST_REPORT_TEARDOWN_TEARDOWN_ACTION: return createTestReportTeardownTeardownAction();
			case ResourcesPackage.ELIGIBILITY_RESPONSE: return createEligibilityResponse();
			case ResourcesPackage.ELIGIBILITY_REQUEST: return createEligibilityRequest();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE: return createEligibilityResponseInsurance();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS: return createEligibilityResponseInsuranceBenefits();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT: return createEligibilityResponseInsuranceBenefitsBenefit();
			case ResourcesPackage.ELIGIBILITY_RESPONSE_ERRORS: return createEligibilityResponseErrors();
			case ResourcesPackage.PARAMETERS: return createParameters();
			case ResourcesPackage.PARAMETERS_PARAMETER: return createParametersParameter();
			case ResourcesPackage.MEDICATION_DISPENSE: return createMedicationDispense();
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION: return createMedicationDispenseSubstitution();
			case ResourcesPackage.MEASURE_REPORT: return createMeasureReport();
			case ResourcesPackage.MEASURE: return createMeasure();
			case ResourcesPackage.MEASURE_GROUP: return createMeasureGroup();
			case ResourcesPackage.MEASURE_GROUP_POPULATION: return createMeasureGroupPopulation();
			case ResourcesPackage.MEASURE_GROUP_STRATIFIER: return createMeasureGroupStratifier();
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA: return createMeasureSupplementalData();
			case ResourcesPackage.MEASURE_REPORT_GROUP: return createMeasureReportGroup();
			case ResourcesPackage.MEASURE_REPORT_GROUP_POPULATION: return createMeasureReportGroupPopulation();
			case ResourcesPackage.LIST: return createList();
			case ResourcesPackage.LIST_ENTRY: return createListEntry();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER: return createMeasureReportGroupStratifier();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP: return createMeasureReportGroupStratifierStratifierGroup();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION: return createMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation();
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA: return createMeasureReportGroupSupplementalData();
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP: return createMeasureReportGroupSupplementalDataSupplementalDataGroup();
			case ResourcesPackage.CLAIM_RESPONSE: return createClaimResponse();
			case ResourcesPackage.CLAIM: return createClaim();
			case ResourcesPackage.CLAIM_RELATED_CLAIM: return createClaimRelatedClaim();
			case ResourcesPackage.CLAIM_PAYEE: return createClaimPayee();
			case ResourcesPackage.CLAIM_CARE_TEAM: return createClaimCareTeam();
			case ResourcesPackage.CLAIM_SPECIAL_CONDITION: return createClaimSpecialCondition();
			case ResourcesPackage.CLAIM_DIAGNOSIS: return createClaimDiagnosis();
			case ResourcesPackage.CLAIM_PROCEDURE: return createClaimProcedure();
			case ResourcesPackage.CLAIM_INSURANCE: return createClaimInsurance();
			case ResourcesPackage.CLAIM_ACCIDENT: return createClaimAccident();
			case ResourcesPackage.CLAIM_ITEM: return createClaimItem();
			case ResourcesPackage.CLAIM_ITEM_DETAIL: return createClaimItemDetail();
			case ResourcesPackage.CLAIM_ITEM_DETAIL_SUB_DETAIL: return createClaimItemDetailSubDetail();
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS: return createClaimItemProsthesis();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM: return createClaimResponseItem();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ADJUDICATION: return createClaimResponseItemAdjudication();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL: return createClaimResponseItemItemDetail();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL_SUB_DETAIL: return createClaimResponseItemItemDetailSubDetail();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM: return createClaimResponseAddedItem();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM_ADDED_ITEMS_DETAIL: return createClaimResponseAddedItemAddedItemsDetail();
			case ResourcesPackage.CLAIM_RESPONSE_ERROR: return createClaimResponseError();
			case ResourcesPackage.CLAIM_RESPONSE_PAYMENT: return createClaimResponsePayment();
			case ResourcesPackage.CLAIM_RESPONSE_NOTE: return createClaimResponseNote();
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE: return createClaimResponseInsurance();
			case ResourcesPackage.TASK: return createTask();
			case ResourcesPackage.TASK_REQUESTER: return createTaskRequester();
			case ResourcesPackage.TASK_RESTRICTION: return createTaskRestriction();
			case ResourcesPackage.TASK_PARAMETER: return createTaskParameter();
			case ResourcesPackage.TASK_OUTPUT: return createTaskOutput();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT: return createExplanationOfBenefit();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_RELATED_CLAIM: return createExplanationOfBenefitRelatedClaim();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PAYEE: return createExplanationOfBenefitPayee();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_SUPPORTING_INFORMATION: return createExplanationOfBenefitSupportingInformation();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM: return createExplanationOfBenefitCareTeam();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS: return createExplanationOfBenefitDiagnosis();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE: return createExplanationOfBenefitProcedure();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE: return createExplanationOfBenefitInsurance();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ACCIDENT: return createExplanationOfBenefitAccident();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM: return createExplanationOfBenefitItem();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_ADJUDICATION: return createExplanationOfBenefitItemAdjudication();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL: return createExplanationOfBenefitItemDetail();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL_SUB_DETAIL: return createExplanationOfBenefitItemDetailSubDetail();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_PROSTHESIS: return createExplanationOfBenefitItemProsthesis();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM: return createExplanationOfBenefitAddedItem();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL: return createExplanationOfBenefitAddedItemAddedItemsDetail();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PAYMENT: return createExplanationOfBenefitPayment();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_NOTE: return createExplanationOfBenefitNote();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE: return createExplanationOfBenefitBenefitBalance();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT: return createExplanationOfBenefitBenefitBalanceBenefit();
			case ResourcesPackage.IMPLEMENTATION_GUIDE: return createImplementationGuide();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEPENDENCY: return createImplementationGuideDependency();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE: return createImplementationGuidePackage();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE: return createImplementationGuidePackageResource();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_GLOBAL: return createImplementationGuideGlobal();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PAGE: return createImplementationGuidePage();
			case ResourcesPackage.SEARCH_PARAMETER: return createSearchParameter();
			case ResourcesPackage.SEARCH_PARAMETER_COMPONENT: return createSearchParameterComponent();
			case ResourcesPackage.EXPANSION_PROFILE: return createExpansionProfile();
			case ResourcesPackage.EXPANSION_PROFILE_FIXED_VERSION: return createExpansionProfileFixedVersion();
			case ResourcesPackage.EXPANSION_PROFILE_EXCLUDED_SYSTEM: return createExpansionProfileExcludedSystem();
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION: return createExpansionProfileDesignation();
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_INCLUDE: return createExpansionProfileDesignationDesignationInclude();
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_INCLUDE_DESIGNATION_INCLUDE_DESIGNATION: return createExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation();
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE: return createExpansionProfileDesignationDesignationExclude();
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION: return createExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation();
			case ResourcesPackage.COMPARTMENT_DEFINITION: return createCompartmentDefinition();
			case ResourcesPackage.COMPARTMENT_DEFINITION_RESOURCE: return createCompartmentDefinitionResource();
			case ResourcesPackage.PROCESS_RESPONSE: return createProcessResponse();
			case ResourcesPackage.PROCESS_RESPONSE_NOTE: return createProcessResponseNote();
			case ResourcesPackage.PRACTITIONER_ROLE: return createPractitionerRole();
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME: return createPractitionerRoleAvailableTime();
			case ResourcesPackage.PRACTITIONER_ROLE_NOT_AVAILABLE: return createPractitionerRoleNotAvailable();
			case ResourcesPackage.PAYMENT_NOTICE: return createPaymentNotice();
			case ResourcesPackage.LINKAGE: return createLinkage();
			case ResourcesPackage.LINKAGE_ITEM: return createLinkageItem();
			case ResourcesPackage.SUPPLY_REQUEST: return createSupplyRequest();
			case ResourcesPackage.SUPPLY_REQUEST_WHEN: return createSupplyRequestWhen();
			case ResourcesPackage.GUIDANCE_RESPONSE: return createGuidanceResponse();
			case ResourcesPackage.MESSAGE_DEFINITION: return createMessageDefinition();
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS: return createMessageDefinitionFocus();
			case ResourcesPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE: return createMessageDefinitionAllowedResponse();
			case ResourcesPackage.DETECTED_ISSUE: return createDetectedIssue();
			case ResourcesPackage.DETECTED_ISSUE_MITIGATION: return createDetectedIssueMitigation();
			case ResourcesPackage.APPOINTMENT_RESPONSE: return createAppointmentResponse();
			case ResourcesPackage.AUDIT_EVENT: return createAuditEvent();
			case ResourcesPackage.AUDIT_EVENT_AGENT: return createAuditEventAgent();
			case ResourcesPackage.AUDIT_EVENT_AGENT_NETWORK: return createAuditEventAgentNetwork();
			case ResourcesPackage.AUDIT_EVENT_SOURCE: return createAuditEventSource();
			case ResourcesPackage.AUDIT_EVENT_ENTITY: return createAuditEventEntity();
			case ResourcesPackage.AUDIT_EVENT_ENTITY_DETAIL: return createAuditEventEntityDetail();
			case ResourcesPackage.BASIC: return createBasic();
			case ResourcesPackage.SUPPLY_DELIVERY: return createSupplyDelivery();
			case ResourcesPackage.ORGANIZATION: return createOrganization();
			case ResourcesPackage.ORGANIZATION_CONTACT: return createOrganizationContact();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner createPractitioner() {
		PractitionerImpl practitioner = new PractitionerImpl();
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRole createPractitionerRole() {
		PractitionerRoleImpl practitionerRole = new PractitionerRoleImpl();
		return practitionerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRole createPractitionerRole() {
		PractitionerRoleImpl practitionerRole = new PractitionerRoleImpl();
		return practitionerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPosition createLocationPosition() {
		LocationPositionImpl locationPosition = new LocationPositionImpl();
		return locationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint createEndpoint() {
		EndpointImpl endpoint = new EndpointImpl();
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareService createHealthcareService() {
		HealthcareServiceImpl healthcareService = new HealthcareServiceImpl();
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareServiceAvailableTime createHealthcareServiceAvailableTime() {
		HealthcareServiceAvailableTimeImpl healthcareServiceAvailableTime = new HealthcareServiceAvailableTimeImpl();
		return healthcareServiceAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareServiceNotAvailable createHealthcareServiceNotAvailable() {
		HealthcareServiceNotAvailableImpl healthcareServiceNotAvailable = new HealthcareServiceNotAvailableImpl();
		return healthcareServiceNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerQualification createPractitionerQualification() {
		PractitionerQualificationImpl practitionerQualification = new PractitionerQualificationImpl();
		return practitionerQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientContact createPatientContact() {
		PatientContactImpl patientContact = new PatientContactImpl();
		return patientContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAnimal createPatientAnimal() {
		PatientAnimalImpl patientAnimal = new PatientAnimalImpl();
		return patientAnimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientCommunication createPatientCommunication() {
		PatientCommunicationImpl patientCommunication = new PatientCommunicationImpl();
		return patientCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientLink createPatientLink() {
		PatientLinkImpl patientLink = new PatientLinkImpl();
		return patientLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPerson createRelatedPerson() {
		RelatedPersonImpl relatedPerson = new RelatedPersonImpl();
		return relatedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition createStructureDefinition() {
		StructureDefinitionImpl structureDefinition = new StructureDefinitionImpl();
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionMapping createStructureDefinitionMapping() {
		StructureDefinitionMappingImpl structureDefinitionMapping = new StructureDefinitionMappingImpl();
		return structureDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionSnapshot createStructureDefinitionSnapshot() {
		StructureDefinitionSnapshotImpl structureDefinitionSnapshot = new StructureDefinitionSnapshotImpl();
		return structureDefinitionSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionDifferential createStructureDefinitionDifferential() {
		StructureDefinitionDifferentialImpl structureDefinitionDifferential = new StructureDefinitionDifferentialImpl();
		return structureDefinitionDifferential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet createValueSet() {
		ValueSetImpl valueSet = new ValueSetImpl();
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCompose createValueSetCompose() {
		ValueSetComposeImpl valueSetCompose = new ValueSetComposeImpl();
		return valueSetCompose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetComposeConceptSet createValueSetComposeConceptSet() {
		ValueSetComposeConceptSetImpl valueSetComposeConceptSet = new ValueSetComposeConceptSetImpl();
		return valueSetComposeConceptSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetComposeConceptSetConceptReference createValueSetComposeConceptSetConceptReference() {
		ValueSetComposeConceptSetConceptReferenceImpl valueSetComposeConceptSetConceptReference = new ValueSetComposeConceptSetConceptReferenceImpl();
		return valueSetComposeConceptSetConceptReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetComposeConceptSetConceptReferenceDesignation createValueSetComposeConceptSetConceptReferenceDesignation() {
		ValueSetComposeConceptSetConceptReferenceDesignationImpl valueSetComposeConceptSetConceptReferenceDesignation = new ValueSetComposeConceptSetConceptReferenceDesignationImpl();
		return valueSetComposeConceptSetConceptReferenceDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetComposeConceptSetFilter createValueSetComposeConceptSetFilter() {
		ValueSetComposeConceptSetFilterImpl valueSetComposeConceptSetFilter = new ValueSetComposeConceptSetFilterImpl();
		return valueSetComposeConceptSetFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetExpansion createValueSetExpansion() {
		ValueSetExpansionImpl valueSetExpansion = new ValueSetExpansionImpl();
		return valueSetExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetExpansionParameter createValueSetExpansionParameter() {
		ValueSetExpansionParameterImpl valueSetExpansionParameter = new ValueSetExpansionParameterImpl();
		return valueSetExpansionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetExpansionContains createValueSetExpansionContains() {
		ValueSetExpansionContainsImpl valueSetExpansionContains = new ValueSetExpansionContainsImpl();
		return valueSetExpansionContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchSubject createResearchSubject() {
		ResearchSubjectImpl researchSubject = new ResearchSubjectImpl();
		return researchSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudy createResearchStudy() {
		ResearchStudyImpl researchStudy = new ResearchStudyImpl();
		return researchStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinition createPlanDefinition() {
		PlanDefinitionImpl planDefinition = new PlanDefinitionImpl();
		return planDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionActionDefinition createPlanDefinitionActionDefinition() {
		PlanDefinitionActionDefinitionImpl planDefinitionActionDefinition = new PlanDefinitionActionDefinitionImpl();
		return planDefinitionActionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionActionDefinitionCondition createPlanDefinitionActionDefinitionCondition() {
		PlanDefinitionActionDefinitionConditionImpl planDefinitionActionDefinitionCondition = new PlanDefinitionActionDefinitionConditionImpl();
		return planDefinitionActionDefinitionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionActionDefinitionRelatedAction createPlanDefinitionActionDefinitionRelatedAction() {
		PlanDefinitionActionDefinitionRelatedActionImpl planDefinitionActionDefinitionRelatedAction = new PlanDefinitionActionDefinitionRelatedActionImpl();
		return planDefinitionActionDefinitionRelatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinition createActivityDefinition() {
		ActivityDefinitionImpl activityDefinition = new ActivityDefinitionImpl();
		return activityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMap createStructureMap() {
		StructureMapImpl structureMap = new StructureMapImpl();
		return structureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapStructure createStructureMapStructure() {
		StructureMapStructureImpl structureMapStructure = new StructureMapStructureImpl();
		return structureMapStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroup createStructureMapGroup() {
		StructureMapGroupImpl structureMapGroup = new StructureMapGroupImpl();
		return structureMapGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupInput createStructureMapGroupInput() {
		StructureMapGroupInputImpl structureMapGroupInput = new StructureMapGroupInputImpl();
		return structureMapGroupInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupRule createStructureMapGroupRule() {
		StructureMapGroupRuleImpl structureMapGroupRule = new StructureMapGroupRuleImpl();
		return structureMapGroupRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupRuleSource createStructureMapGroupRuleSource() {
		StructureMapGroupRuleSourceImpl structureMapGroupRuleSource = new StructureMapGroupRuleSourceImpl();
		return structureMapGroupRuleSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupRuleTarget createStructureMapGroupRuleTarget() {
		StructureMapGroupRuleTargetImpl structureMapGroupRuleTarget = new StructureMapGroupRuleTargetImpl();
		return structureMapGroupRuleTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupRuleTargetParameter createStructureMapGroupRuleTargetParameter() {
		StructureMapGroupRuleTargetParameterImpl structureMapGroupRuleTargetParameter = new StructureMapGroupRuleTargetParameterImpl();
		return structureMapGroupRuleTargetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupRuleDependent createStructureMapGroupRuleDependent() {
		StructureMapGroupRuleDependentImpl structureMapGroupRuleDependent = new StructureMapGroupRuleDependentImpl();
		return structureMapGroupRuleDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinitionDynamicValue createActivityDefinitionDynamicValue() {
		ActivityDefinitionDynamicValueImpl activityDefinitionDynamicValue = new ActivityDefinitionDynamicValueImpl();
		return activityDefinitionDynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionActionDefinitionDynamicValue createPlanDefinitionActionDefinitionDynamicValue() {
		PlanDefinitionActionDefinitionDynamicValueImpl planDefinitionActionDefinitionDynamicValue = new PlanDefinitionActionDefinitionDynamicValueImpl();
		return planDefinitionActionDefinitionDynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupCharacteristic createGroupCharacteristic() {
		GroupCharacteristicImpl groupCharacteristic = new GroupCharacteristicImpl();
		return groupCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMember createGroupMember() {
		GroupMemberImpl groupMember = new GroupMemberImpl();
		return groupMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyArm createResearchStudyArm() {
		ResearchStudyArmImpl researchStudyArm = new ResearchStudyArmImpl();
		return researchStudyArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consent createConsent() {
		ConsentImpl consent = new ConsentImpl();
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentExcept createConsentExcept() {
		ConsentExceptImpl consentExcept = new ConsentExceptImpl();
		return consentExcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentExceptActor createConsentExceptActor() {
		ConsentExceptActorImpl consentExceptActor = new ConsentExceptActorImpl();
		return consentExceptActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentExceptData createConsentExceptData() {
		ConsentExceptDataImpl consentExceptData = new ConsentExceptDataImpl();
		return consentExceptData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationProduct createMedicationProduct() {
		MedicationProductImpl medicationProduct = new MedicationProductImpl();
		return medicationProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationProductIngredient createMedicationProductIngredient() {
		MedicationProductIngredientImpl medicationProductIngredient = new MedicationProductIngredientImpl();
		return medicationProductIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationProductBatch createMedicationProductBatch() {
		MedicationProductBatchImpl medicationProductBatch = new MedicationProductBatchImpl();
		return medicationProductBatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPackage createMedicationPackage() {
		MedicationPackageImpl medicationPackage = new MedicationPackageImpl();
		return medicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPackageContent createMedicationPackageContent() {
		MedicationPackageContentImpl medicationPackageContent = new MedicationPackageContentImpl();
		return medicationPackageContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substance createSubstance() {
		SubstanceImpl substance = new SubstanceImpl();
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceInstance createSubstanceInstance() {
		SubstanceInstanceImpl substanceInstance = new SubstanceInstanceImpl();
		return substanceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceIngredient createSubstanceIngredient() {
		SubstanceIngredientImpl substanceIngredient = new SubstanceIngredientImpl();
		return substanceIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReference createDocumentReference() {
		DocumentReferenceImpl documentReference = new DocumentReferenceImpl();
		return documentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceRelatesTo createDocumentReferenceRelatesTo() {
		DocumentReferenceRelatesToImpl documentReferenceRelatesTo = new DocumentReferenceRelatesToImpl();
		return documentReferenceRelatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceContent createDocumentReferenceContent() {
		DocumentReferenceContentImpl documentReferenceContent = new DocumentReferenceContentImpl();
		return documentReferenceContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceContext createDocumentReferenceContext() {
		DocumentReferenceContextImpl documentReferenceContext = new DocumentReferenceContextImpl();
		return documentReferenceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatusHistory createEncounterStatusHistory() {
		EncounterStatusHistoryImpl encounterStatusHistory = new EncounterStatusHistoryImpl();
		return encounterStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCare createEpisodeOfCare() {
		EpisodeOfCareImpl episodeOfCare = new EpisodeOfCareImpl();
		return episodeOfCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusHistory createEpisodeOfCareStatusHistory() {
		EpisodeOfCareStatusHistoryImpl episodeOfCareStatusHistory = new EpisodeOfCareStatusHistoryImpl();
		return episodeOfCareStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionStage createConditionStage() {
		ConditionStageImpl conditionStage = new ConditionStageImpl();
		return conditionStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEvidence createConditionEvidence() {
		ConditionEvidenceImpl conditionEvidence = new ConditionEvidenceImpl();
		return conditionEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequest createReferralRequest() {
		ReferralRequestImpl referralRequest = new ReferralRequestImpl();
		return referralRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeam createCareTeam() {
		CareTeamImpl careTeam = new CareTeamImpl();
		return careTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamParticipant createCareTeamParticipant() {
		CareTeamParticipantImpl careTeamParticipant = new CareTeamParticipantImpl();
		return careTeamParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage createCoverage() {
		CoverageImpl coverage = new CoverageImpl();
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageGroup createCoverageGroup() {
		CoverageGroupImpl coverageGroup = new CoverageGroupImpl();
		return coverageGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractAgent createContractAgent() {
		ContractAgentImpl contractAgent = new ContractAgentImpl();
		return contractAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractSignatory createContractSignatory() {
		ContractSignatoryImpl contractSignatory = new ContractSignatoryImpl();
		return contractSignatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractValuedItem createContractValuedItem() {
		ContractValuedItemImpl contractValuedItem = new ContractValuedItemImpl();
		return contractValuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTerm createContractTerm() {
		ContractTermImpl contractTerm = new ContractTermImpl();
		return contractTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTermTermAgent createContractTermTermAgent() {
		ContractTermTermAgentImpl contractTermTermAgent = new ContractTermTermAgentImpl();
		return contractTermTermAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTermTermValuedItem createContractTermTermValuedItem() {
		ContractTermTermValuedItemImpl contractTermTermValuedItem = new ContractTermTermValuedItemImpl();
		return contractTermTermValuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractFriendlyLanguage createContractFriendlyLanguage() {
		ContractFriendlyLanguageImpl contractFriendlyLanguage = new ContractFriendlyLanguageImpl();
		return contractFriendlyLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractLegalLanguage createContractLegalLanguage() {
		ContractLegalLanguageImpl contractLegalLanguage = new ContractLegalLanguageImpl();
		return contractLegalLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractComputableLanguage createContractComputableLanguage() {
		ContractComputableLanguageImpl contractComputableLanguage = new ContractComputableLanguageImpl();
		return contractComputableLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountGuarantor createAccountGuarantor() {
		AccountGuarantorImpl accountGuarantor = new AccountGuarantorImpl();
		return accountGuarantor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterParticipant createEncounterParticipant() {
		EncounterParticipantImpl encounterParticipant = new EncounterParticipantImpl();
		return encounterParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment createAppointment() {
		AppointmentImpl appointment = new AppointmentImpl();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentParticipant createAppointmentParticipant() {
		AppointmentParticipantImpl appointmentParticipant = new AppointmentParticipantImpl();
		return appointmentParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterHospitalization createEncounterHospitalization() {
		EncounterHospitalizationImpl encounterHospitalization = new EncounterHospitalizationImpl();
		return encounterHospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocation createEncounterLocation() {
		EncounterLocationImpl encounterLocation = new EncounterLocationImpl();
		return encounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceContextRelated createDocumentReferenceContextRelated() {
		DocumentReferenceContextRelatedImpl documentReferenceContextRelated = new DocumentReferenceContextRelatedImpl();
		return documentReferenceContextRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpression createClinicalImpression() {
		ClinicalImpressionImpl clinicalImpression = new ClinicalImpressionImpl();
		return clinicalImpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionInvestigation createClinicalImpressionInvestigation() {
		ClinicalImpressionInvestigationImpl clinicalImpressionInvestigation = new ClinicalImpressionInvestigationImpl();
		return clinicalImpressionInvestigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionFinding createClinicalImpressionFinding() {
		ClinicalImpressionFindingImpl clinicalImpressionFinding = new ClinicalImpressionFindingImpl();
		return clinicalImpressionFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment createRiskAssessment() {
		RiskAssessmentImpl riskAssessment = new RiskAssessmentImpl();
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessmentPrediction createRiskAssessmentPrediction() {
		RiskAssessmentPredictionImpl riskAssessmentPrediction = new RiskAssessmentPredictionImpl();
		return riskAssessmentPrediction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntolerance createAllergyIntolerance() {
		AllergyIntoleranceImpl allergyIntolerance = new AllergyIntoleranceImpl();
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceReaction createAllergyIntoleranceReaction() {
		AllergyIntoleranceReactionImpl allergyIntoleranceReaction = new AllergyIntoleranceReactionImpl();
		return allergyIntoleranceReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen createSpecimen() {
		SpecimenImpl specimen = new SpecimenImpl();
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCollection createSpecimenCollection() {
		SpecimenCollectionImpl specimenCollection = new SpecimenCollectionImpl();
		return specimenCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenTreatment createSpecimenTreatment() {
		SpecimenTreatmentImpl specimenTreatment = new SpecimenTreatmentImpl();
		return specimenTreatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainer createSpecimenContainer() {
		SpecimenContainerImpl specimenContainer = new SpecimenContainerImpl();
		return specimenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationReferenceRange createObservationReferenceRange() {
		ObservationReferenceRangeImpl observationReferenceRange = new ObservationReferenceRangeImpl();
		return observationReferenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelated createObservationRelated() {
		ObservationRelatedImpl observationRelated = new ObservationRelatedImpl();
		return observationRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationComponent createObservationComponent() {
		ObservationComponentImpl observationComponent = new ObservationComponentImpl();
		return observationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticRequest createDiagnosticRequest() {
		DiagnosticRequestImpl diagnosticRequest = new DiagnosticRequestImpl();
		return diagnosticRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provenance createProvenance() {
		ProvenanceImpl provenance = new ProvenanceImpl();
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceAgent createProvenanceAgent() {
		ProvenanceAgentImpl provenanceAgent = new ProvenanceAgentImpl();
		return provenanceAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntity createProvenanceEntity() {
		ProvenanceEntityImpl provenanceEntity = new ProvenanceEntityImpl();
		return provenanceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequest createProcedureRequest() {
		ProcedureRequestImpl procedureRequest = new ProcedureRequestImpl();
		return procedureRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetric createDeviceMetric() {
		DeviceMetricImpl deviceMetric = new DeviceMetricImpl();
		return deviceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponent createDeviceComponent() {
		DeviceComponentImpl deviceComponent = new DeviceComponentImpl();
		return deviceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponentProductionSpecification createDeviceComponentProductionSpecification() {
		DeviceComponentProductionSpecificationImpl deviceComponentProductionSpecification = new DeviceComponentProductionSpecificationImpl();
		return deviceComponentProductionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibration createDeviceMetricCalibration() {
		DeviceMetricCalibrationImpl deviceMetricCalibration = new DeviceMetricCalibrationImpl();
		return deviceMetricCalibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponse createQuestionnaireResponse() {
		QuestionnaireResponseImpl questionnaireResponse = new QuestionnaireResponseImpl();
		return questionnaireResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItem createQuestionnaireItem() {
		QuestionnaireItemImpl questionnaireItem = new QuestionnaireItemImpl();
		return questionnaireItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemEnableWhen createQuestionnaireItemEnableWhen() {
		QuestionnaireItemEnableWhenImpl questionnaireItemEnableWhen = new QuestionnaireItemEnableWhenImpl();
		return questionnaireItemEnableWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemOption createQuestionnaireItemOption() {
		QuestionnaireItemOptionImpl questionnaireItemOption = new QuestionnaireItemOptionImpl();
		return questionnaireItemOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseItem createQuestionnaireResponseItem() {
		QuestionnaireResponseItemImpl questionnaireResponseItem = new QuestionnaireResponseItemImpl();
		return questionnaireResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseItemAnswer createQuestionnaireResponseItemAnswer() {
		QuestionnaireResponseItemAnswerImpl questionnaireResponseItemAnswer = new QuestionnaireResponseItemAnswerImpl();
		return questionnaireResponseItemAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlan createCarePlan() {
		CarePlanImpl carePlan = new CarePlanImpl();
		return carePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanRelatedPlan createCarePlanRelatedPlan() {
		CarePlanRelatedPlanImpl carePlanRelatedPlan = new CarePlanRelatedPlanImpl();
		return carePlanRelatedPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalOutcome createGoalOutcome() {
		GoalOutcomeImpl goalOutcome = new GoalOutcomeImpl();
		return goalOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivity createCarePlanActivity() {
		CarePlanActivityImpl carePlanActivity = new CarePlanActivityImpl();
		return carePlanActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityDetail createCarePlanActivityDetail() {
		CarePlanActivityDetailImpl carePlanActivityDetail = new CarePlanActivityDetailImpl();
		return carePlanActivityDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatement createMedicationStatement() {
		MedicationStatementImpl medicationStatement = new MedicationStatementImpl();
		return medicationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequest createNutritionRequest() {
		NutritionRequestImpl nutritionRequest = new NutritionRequestImpl();
		return nutritionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestOralDiet createNutritionRequestOralDiet() {
		NutritionRequestOralDietImpl nutritionRequestOralDiet = new NutritionRequestOralDietImpl();
		return nutritionRequestOralDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestOralDietNutrient createNutritionRequestOralDietNutrient() {
		NutritionRequestOralDietNutrientImpl nutritionRequestOralDietNutrient = new NutritionRequestOralDietNutrientImpl();
		return nutritionRequestOralDietNutrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestOralDietTexture createNutritionRequestOralDietTexture() {
		NutritionRequestOralDietTextureImpl nutritionRequestOralDietTexture = new NutritionRequestOralDietTextureImpl();
		return nutritionRequestOralDietTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestSupplement createNutritionRequestSupplement() {
		NutritionRequestSupplementImpl nutritionRequestSupplement = new NutritionRequestSupplementImpl();
		return nutritionRequestSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestEnteralFormula createNutritionRequestEnteralFormula() {
		NutritionRequestEnteralFormulaImpl nutritionRequestEnteralFormula = new NutritionRequestEnteralFormulaImpl();
		return nutritionRequestEnteralFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionRequestEnteralFormulaAdministration createNutritionRequestEnteralFormulaAdministration() {
		NutritionRequestEnteralFormulaAdministrationImpl nutritionRequestEnteralFormulaAdministration = new NutritionRequestEnteralFormulaAdministrationImpl();
		return nutritionRequestEnteralFormulaAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequest createCommunicationRequest() {
		CommunicationRequestImpl communicationRequest = new CommunicationRequestImpl();
		return communicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestPayload createCommunicationRequestPayload() {
		CommunicationRequestPayloadImpl communicationRequestPayload = new CommunicationRequestPayloadImpl();
		return communicationRequestPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequest createDeviceUseRequest() {
		DeviceUseRequestImpl deviceUseRequest = new DeviceUseRequestImpl();
		return deviceUseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequest createMedicationRequest() {
		MedicationRequestImpl medicationRequest = new MedicationRequestImpl();
		return medicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestDispenseRequest createMedicationRequestDispenseRequest() {
		MedicationRequestDispenseRequestImpl medicationRequestDispenseRequest = new MedicationRequestDispenseRequestImpl();
		return medicationRequestDispenseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestSubstitution createMedicationRequestSubstitution() {
		MedicationRequestSubstitutionImpl medicationRequestSubstitution = new MedicationRequestSubstitutionImpl();
		return medicationRequestSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequest createProcessRequest() {
		ProcessRequestImpl processRequest = new ProcessRequestImpl();
		return processRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequestItems createProcessRequestItems() {
		ProcessRequestItemsImpl processRequestItems = new ProcessRequestItemsImpl();
		return processRequestItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescription createVisionPrescription() {
		VisionPrescriptionImpl visionPrescription = new VisionPrescriptionImpl();
		return visionPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescriptionDispense createVisionPrescriptionDispense() {
		VisionPrescriptionDispenseImpl visionPrescriptionDispense = new VisionPrescriptionDispenseImpl();
		return visionPrescriptionDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePerformer createProcedurePerformer() {
		ProcedurePerformerImpl procedurePerformer = new ProcedurePerformerImpl();
		return procedurePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReport createDiagnosticReport() {
		DiagnosticReportImpl diagnosticReport = new DiagnosticReportImpl();
		return diagnosticReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportImage createDiagnosticReportImage() {
		DiagnosticReportImageImpl diagnosticReportImage = new DiagnosticReportImageImpl();
		return diagnosticReportImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureFocalDevice createProcedureFocalDevice() {
		ProcedureFocalDeviceImpl procedureFocalDevice = new ProcedureFocalDeviceImpl();
		return procedureFocalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudy createImagingStudy() {
		ImagingStudyImpl imagingStudy = new ImagingStudyImpl();
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudyStudyBaseLocation createImagingStudyStudyBaseLocation() {
		ImagingStudyStudyBaseLocationImpl imagingStudyStudyBaseLocation = new ImagingStudyStudyBaseLocationImpl();
		return imagingStudyStudyBaseLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudySeries createImagingStudySeries() {
		ImagingStudySeriesImpl imagingStudySeries = new ImagingStudySeriesImpl();
		return imagingStudySeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudySeriesSeriesBaseLocation createImagingStudySeriesSeriesBaseLocation() {
		ImagingStudySeriesSeriesBaseLocationImpl imagingStudySeriesSeriesBaseLocation = new ImagingStudySeriesSeriesBaseLocationImpl();
		return imagingStudySeriesSeriesBaseLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudySeriesInstance createImagingStudySeriesInstance() {
		ImagingStudySeriesInstanceImpl imagingStudySeriesInstance = new ImagingStudySeriesInstanceImpl();
		return imagingStudySeriesInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifest createImagingManifest() {
		ImagingManifestImpl imagingManifest = new ImagingManifestImpl();
		return imagingManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifestStudy createImagingManifestStudy() {
		ImagingManifestStudyImpl imagingManifestStudy = new ImagingManifestStudyImpl();
		return imagingManifestStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifestStudyStudyBaseLocation createImagingManifestStudyStudyBaseLocation() {
		ImagingManifestStudyStudyBaseLocationImpl imagingManifestStudyStudyBaseLocation = new ImagingManifestStudyStudyBaseLocationImpl();
		return imagingManifestStudyStudyBaseLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifestStudySeries createImagingManifestStudySeries() {
		ImagingManifestStudySeriesImpl imagingManifestStudySeries = new ImagingManifestStudySeriesImpl();
		return imagingManifestStudySeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifestStudySeriesSeriesBaseLocation createImagingManifestStudySeriesSeriesBaseLocation() {
		ImagingManifestStudySeriesSeriesBaseLocationImpl imagingManifestStudySeriesSeriesBaseLocation = new ImagingManifestStudySeriesSeriesBaseLocationImpl();
		return imagingManifestStudySeriesSeriesBaseLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifestStudySeriesInstance createImagingManifestStudySeriesInstance() {
		ImagingManifestStudySeriesInstanceImpl imagingManifestStudySeriesInstance = new ImagingManifestStudySeriesInstanceImpl();
		return imagingManifestStudySeriesInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministration createMedicationAdministration() {
		MedicationAdministrationImpl medicationAdministration = new MedicationAdministrationImpl();
		return medicationAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationDosage createMedicationAdministrationDosage() {
		MedicationAdministrationDosageImpl medicationAdministrationDosage = new MedicationAdministrationDosageImpl();
		return medicationAdministrationDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceReferenceSeq createSequenceReferenceSeq() {
		SequenceReferenceSeqImpl sequenceReferenceSeq = new SequenceReferenceSeqImpl();
		return sequenceReferenceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceVariant createSequenceVariant() {
		SequenceVariantImpl sequenceVariant = new SequenceVariantImpl();
		return sequenceVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceQuality createSequenceQuality() {
		SequenceQualityImpl sequenceQuality = new SequenceQualityImpl();
		return sequenceQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceRepository createSequenceRepository() {
		SequenceRepositoryImpl sequenceRepository = new SequenceRepositoryImpl();
		return sequenceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceStructureVariant createSequenceStructureVariant() {
		SequenceStructureVariantImpl sequenceStructureVariant = new SequenceStructureVariantImpl();
		return sequenceStructureVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceStructureVariantOuter createSequenceStructureVariantOuter() {
		SequenceStructureVariantOuterImpl sequenceStructureVariantOuter = new SequenceStructureVariantOuterImpl();
		return sequenceStructureVariantOuter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceStructureVariantInner createSequenceStructureVariantInner() {
		SequenceStructureVariantInnerImpl sequenceStructureVariantInner = new SequenceStructureVariantInnerImpl();
		return sequenceStructureVariantInner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistory createFamilyMemberHistory() {
		FamilyMemberHistoryImpl familyMemberHistory = new FamilyMemberHistoryImpl();
		return familyMemberHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistoryCondition createFamilyMemberHistoryCondition() {
		FamilyMemberHistoryConditionImpl familyMemberHistoryCondition = new FamilyMemberHistoryConditionImpl();
		return familyMemberHistoryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttester createCompositionAttester() {
		CompositionAttesterImpl compositionAttester = new CompositionAttesterImpl();
		return compositionAttester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionEvent createCompositionEvent() {
		CompositionEventImpl compositionEvent = new CompositionEventImpl();
		return compositionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionSection createCompositionSection() {
		CompositionSectionImpl compositionSection = new CompositionSectionImpl();
		return compositionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPayload createCommunicationPayload() {
		CommunicationPayloadImpl communicationPayload = new CommunicationPayloadImpl();
		return communicationPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystem createNamingSystem() {
		NamingSystemImpl namingSystem = new NamingSystemImpl();
		return namingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemUniqueId createNamingSystemUniqueId() {
		NamingSystemUniqueIdImpl namingSystemUniqueId = new NamingSystemUniqueIdImpl();
		return namingSystemUniqueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMap createConceptMap() {
		ConceptMapImpl conceptMap = new ConceptMapImpl();
		return conceptMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroup createConceptMapGroup() {
		ConceptMapGroupImpl conceptMapGroup = new ConceptMapGroupImpl();
		return conceptMapGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroupSourceElement createConceptMapGroupSourceElement() {
		ConceptMapGroupSourceElementImpl conceptMapGroupSourceElement = new ConceptMapGroupSourceElementImpl();
		return conceptMapGroupSourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroupSourceElementTargetElement createConceptMapGroupSourceElementTargetElement() {
		ConceptMapGroupSourceElementTargetElementImpl conceptMapGroupSourceElementTargetElement = new ConceptMapGroupSourceElementTargetElementImpl();
		return conceptMapGroupSourceElementTargetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroupSourceElementTargetElementOtherElement createConceptMapGroupSourceElementTargetElementOtherElement() {
		ConceptMapGroupSourceElementTargetElementOtherElementImpl conceptMapGroupSourceElementTargetElementOtherElement = new ConceptMapGroupSourceElementTargetElementOtherElementImpl();
		return conceptMapGroupSourceElementTargetElementOtherElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestGroup createRequestGroup() {
		RequestGroupImpl requestGroup = new RequestGroupImpl();
		return requestGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestGroupAction createRequestGroupAction() {
		RequestGroupActionImpl requestGroupAction = new RequestGroupActionImpl();
		return requestGroupAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestGroupActionCondition createRequestGroupActionCondition() {
		RequestGroupActionConditionImpl requestGroupActionCondition = new RequestGroupActionConditionImpl();
		return requestGroupActionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestGroupActionRelatedAction createRequestGroupActionRelatedAction() {
		RequestGroupActionRelatedActionImpl requestGroupActionRelatedAction = new RequestGroupActionRelatedActionImpl();
		return requestGroupActionRelatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonLink createPersonLink() {
		PersonLinkImpl personLink = new PersonLinkImpl();
		return personLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flag createFlag() {
		FlagImpl flag = new FlagImpl();
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystem createCodeSystem() {
		CodeSystemImpl codeSystem = new CodeSystemImpl();
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemFilter createCodeSystemFilter() {
		CodeSystemFilterImpl codeSystemFilter = new CodeSystemFilterImpl();
		return codeSystemFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemProperty createCodeSystemProperty() {
		CodeSystemPropertyImpl codeSystemProperty = new CodeSystemPropertyImpl();
		return codeSystemProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemConceptDefinition createCodeSystemConceptDefinition() {
		CodeSystemConceptDefinitionImpl codeSystemConceptDefinition = new CodeSystemConceptDefinitionImpl();
		return codeSystemConceptDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemConceptDefinitionDesignation createCodeSystemConceptDefinitionDesignation() {
		CodeSystemConceptDefinitionDesignationImpl codeSystemConceptDefinitionDesignation = new CodeSystemConceptDefinitionDesignationImpl();
		return codeSystemConceptDefinitionDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemConceptDefinitionConceptProperty createCodeSystemConceptDefinitionConceptProperty() {
		CodeSystemConceptDefinitionConceptPropertyImpl codeSystemConceptDefinitionConceptProperty = new CodeSystemConceptDefinitionConceptPropertyImpl();
		return codeSystemConceptDefinitionConceptProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifest createDocumentManifest() {
		DocumentManifestImpl documentManifest = new DocumentManifestImpl();
		return documentManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifestContent createDocumentManifestContent() {
		DocumentManifestContentImpl documentManifestContent = new DocumentManifestContentImpl();
		return documentManifestContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifestRelated createDocumentManifestRelated() {
		DocumentManifestRelatedImpl documentManifestRelated = new DocumentManifestRelatedImpl();
		return documentManifestRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliation createPaymentReconciliation() {
		PaymentReconciliationImpl paymentReconciliation = new PaymentReconciliationImpl();
		return paymentReconciliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationDetails createPaymentReconciliationDetails() {
		PaymentReconciliationDetailsImpl paymentReconciliationDetails = new PaymentReconciliationDetailsImpl();
		return paymentReconciliationDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationNotes createPaymentReconciliationNotes() {
		PaymentReconciliationNotesImpl paymentReconciliationNotes = new PaymentReconciliationNotesImpl();
		return paymentReconciliationNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseStatement createDeviceUseStatement() {
		DeviceUseStatementImpl deviceUseStatement = new DeviceUseStatementImpl();
		return deviceUseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScript createTestScript() {
		TestScriptImpl testScript = new TestScriptImpl();
		return testScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptOrigin createTestScriptOrigin() {
		TestScriptOriginImpl testScriptOrigin = new TestScriptOriginImpl();
		return testScriptOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptDestination createTestScriptDestination() {
		TestScriptDestinationImpl testScriptDestination = new TestScriptDestinationImpl();
		return testScriptDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptMetadata createTestScriptMetadata() {
		TestScriptMetadataImpl testScriptMetadata = new TestScriptMetadataImpl();
		return testScriptMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptMetadataLink createTestScriptMetadataLink() {
		TestScriptMetadataLinkImpl testScriptMetadataLink = new TestScriptMetadataLinkImpl();
		return testScriptMetadataLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptMetadataCapability createTestScriptMetadataCapability() {
		TestScriptMetadataCapabilityImpl testScriptMetadataCapability = new TestScriptMetadataCapabilityImpl();
		return testScriptMetadataCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatement createCapabilityStatement() {
		CapabilityStatementImpl capabilityStatement = new CapabilityStatementImpl();
		return capabilityStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementSoftware createCapabilityStatementSoftware() {
		CapabilityStatementSoftwareImpl capabilityStatementSoftware = new CapabilityStatementSoftwareImpl();
		return capabilityStatementSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementImplementation createCapabilityStatementImplementation() {
		CapabilityStatementImplementationImpl capabilityStatementImplementation = new CapabilityStatementImplementationImpl();
		return capabilityStatementImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementRest createCapabilityStatementRest() {
		CapabilityStatementRestImpl capabilityStatementRest = new CapabilityStatementRestImpl();
		return capabilityStatementRest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementRestSecurity createCapabilityStatementRestSecurity() {
		CapabilityStatementRestSecurityImpl capabilityStatementRestSecurity = new CapabilityStatementRestSecurityImpl();
		return capabilityStatementRestSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementRestSecurityCertificate createCapabilityStatementRestSecurityCertificate() {
		CapabilityStatementRestSecurityCertificateImpl capabilityStatementRestSecurityCertificate = new CapabilityStatementRestSecurityCertificateImpl();
		return capabilityStatementRestSecurityCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementRestResource createCapabilityStatementRestResource() {
		CapabilityStatementRestResourceImpl capabilityStatementRestResource = new CapabilityStatementRestResourceImpl();
		return capabilityStatementRestResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementRestResourceResourceInteraction createCapabilityStatementRestResourceResourceInteraction() {
		CapabilityStatementRestResourceResourceInteractionImpl capabilityStatementRestResourceResourceInteraction = new CapabilityStatementRestResourceResourceInteractionImpl();
		return capabilityStatementRestResourceResourceInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementRestResourceSearchParam createCapabilityStatementRestResourceSearchParam() {
		CapabilityStatementRestResourceSearchParamImpl capabilityStatementRestResourceSearchParam = new CapabilityStatementRestResourceSearchParamImpl();
		return capabilityStatementRestResourceSearchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementRestSystemInteraction createCapabilityStatementRestSystemInteraction() {
		CapabilityStatementRestSystemInteractionImpl capabilityStatementRestSystemInteraction = new CapabilityStatementRestSystemInteractionImpl();
		return capabilityStatementRestSystemInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementRestOperation createCapabilityStatementRestOperation() {
		CapabilityStatementRestOperationImpl capabilityStatementRestOperation = new CapabilityStatementRestOperationImpl();
		return capabilityStatementRestOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition createOperationDefinition() {
		OperationDefinitionImpl operationDefinition = new OperationDefinitionImpl();
		return operationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionParameter createOperationDefinitionParameter() {
		OperationDefinitionParameterImpl operationDefinitionParameter = new OperationDefinitionParameterImpl();
		return operationDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionParameterBinding createOperationDefinitionParameterBinding() {
		OperationDefinitionParameterBindingImpl operationDefinitionParameterBinding = new OperationDefinitionParameterBindingImpl();
		return operationDefinitionParameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionOverload createOperationDefinitionOverload() {
		OperationDefinitionOverloadImpl operationDefinitionOverload = new OperationDefinitionOverloadImpl();
		return operationDefinitionOverload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementMessaging createCapabilityStatementMessaging() {
		CapabilityStatementMessagingImpl capabilityStatementMessaging = new CapabilityStatementMessagingImpl();
		return capabilityStatementMessaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementMessagingEndpoint createCapabilityStatementMessagingEndpoint() {
		CapabilityStatementMessagingEndpointImpl capabilityStatementMessagingEndpoint = new CapabilityStatementMessagingEndpointImpl();
		return capabilityStatementMessagingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementMessagingEvent createCapabilityStatementMessagingEvent() {
		CapabilityStatementMessagingEventImpl capabilityStatementMessagingEvent = new CapabilityStatementMessagingEventImpl();
		return capabilityStatementMessagingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementDocument createCapabilityStatementDocument() {
		CapabilityStatementDocumentImpl capabilityStatementDocument = new CapabilityStatementDocumentImpl();
		return capabilityStatementDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptFixture createTestScriptFixture() {
		TestScriptFixtureImpl testScriptFixture = new TestScriptFixtureImpl();
		return testScriptFixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptVariable createTestScriptVariable() {
		TestScriptVariableImpl testScriptVariable = new TestScriptVariableImpl();
		return testScriptVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRule createTestScriptRule() {
		TestScriptRuleImpl testScriptRule = new TestScriptRuleImpl();
		return testScriptRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRuleRuleParam createTestScriptRuleRuleParam() {
		TestScriptRuleRuleParamImpl testScriptRuleRuleParam = new TestScriptRuleRuleParamImpl();
		return testScriptRuleRuleParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRuleset createTestScriptRuleset() {
		TestScriptRulesetImpl testScriptRuleset = new TestScriptRulesetImpl();
		return testScriptRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRulesetRulesetRule createTestScriptRulesetRulesetRule() {
		TestScriptRulesetRulesetRuleImpl testScriptRulesetRulesetRule = new TestScriptRulesetRulesetRuleImpl();
		return testScriptRulesetRulesetRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRulesetRulesetRuleRulesetRuleParam createTestScriptRulesetRulesetRuleRulesetRuleParam() {
		TestScriptRulesetRulesetRuleRulesetRuleParamImpl testScriptRulesetRulesetRuleRulesetRuleParam = new TestScriptRulesetRulesetRuleRulesetRuleParamImpl();
		return testScriptRulesetRulesetRuleRulesetRuleParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetup createTestScriptSetup() {
		TestScriptSetupImpl testScriptSetup = new TestScriptSetupImpl();
		return testScriptSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupAction createTestScriptSetupSetupAction() {
		TestScriptSetupSetupActionImpl testScriptSetupSetupAction = new TestScriptSetupSetupActionImpl();
		return testScriptSetupSetupAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionOperation createTestScriptSetupSetupActionOperation() {
		TestScriptSetupSetupActionOperationImpl testScriptSetupSetupActionOperation = new TestScriptSetupSetupActionOperationImpl();
		return testScriptSetupSetupActionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionOperationRequestHeader createTestScriptSetupSetupActionOperationRequestHeader() {
		TestScriptSetupSetupActionOperationRequestHeaderImpl testScriptSetupSetupActionOperationRequestHeader = new TestScriptSetupSetupActionOperationRequestHeaderImpl();
		return testScriptSetupSetupActionOperationRequestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionAssert createTestScriptSetupSetupActionAssert() {
		TestScriptSetupSetupActionAssertImpl testScriptSetupSetupActionAssert = new TestScriptSetupSetupActionAssertImpl();
		return testScriptSetupSetupActionAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionAssertActionAssertRule createTestScriptSetupSetupActionAssertActionAssertRule() {
		TestScriptSetupSetupActionAssertActionAssertRuleImpl testScriptSetupSetupActionAssertActionAssertRule = new TestScriptSetupSetupActionAssertActionAssertRuleImpl();
		return testScriptSetupSetupActionAssertActionAssertRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam createTestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam() {
		TestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParamImpl testScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam = new TestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParamImpl();
		return testScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionAssertActionAssertRuleset createTestScriptSetupSetupActionAssertActionAssertRuleset() {
		TestScriptSetupSetupActionAssertActionAssertRulesetImpl testScriptSetupSetupActionAssertActionAssertRuleset = new TestScriptSetupSetupActionAssertActionAssertRulesetImpl();
		return testScriptSetupSetupActionAssertActionAssertRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule createTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule() {
		TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleImpl testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule = new TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleImpl();
		return testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam createTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam() {
		TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParamImpl testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam = new TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParamImpl();
		return testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTest createTestScriptTest() {
		TestScriptTestImpl testScriptTest = new TestScriptTestImpl();
		return testScriptTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTestTestAction createTestScriptTestTestAction() {
		TestScriptTestTestActionImpl testScriptTestTestAction = new TestScriptTestTestActionImpl();
		return testScriptTestTestAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTeardown createTestScriptTeardown() {
		TestScriptTeardownImpl testScriptTeardown = new TestScriptTeardownImpl();
		return testScriptTeardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTeardownTeardownAction createTestScriptTeardownTeardownAction() {
		TestScriptTeardownTeardownActionImpl testScriptTeardownTeardownAction = new TestScriptTeardownTeardownActionImpl();
		return testScriptTeardownTeardownAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement createDataElement() {
		DataElementImpl dataElement = new DataElementImpl();
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementMapping createDataElementMapping() {
		DataElementMappingImpl dataElementMapping = new DataElementMappingImpl();
		return dataElementMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeader createMessageHeader() {
		MessageHeaderImpl messageHeader = new MessageHeaderImpl();
		return messageHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderResponse createMessageHeaderResponse() {
		MessageHeaderResponseImpl messageHeaderResponse = new MessageHeaderResponseImpl();
		return messageHeaderResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcome createOperationOutcome() {
		OperationOutcomeImpl operationOutcome = new OperationOutcomeImpl();
		return operationOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcomeIssue createOperationOutcomeIssue() {
		OperationOutcomeIssueImpl operationOutcomeIssue = new OperationOutcomeIssueImpl();
		return operationOutcomeIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderMessageSource createMessageHeaderMessageSource() {
		MessageHeaderMessageSourceImpl messageHeaderMessageSource = new MessageHeaderMessageSourceImpl();
		return messageHeaderMessageSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderMessageDestination createMessageHeaderMessageDestination() {
		MessageHeaderMessageDestinationImpl messageHeaderMessageDestination = new MessageHeaderMessageDestinationImpl();
		return messageHeaderMessageDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannel createSubscriptionChannel() {
		SubscriptionChannelImpl subscriptionChannel = new SubscriptionChannelImpl();
		return subscriptionChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodySite createBodySite() {
		BodySiteImpl bodySite = new BodySiteImpl();
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDefinition createServiceDefinition() {
		ServiceDefinitionImpl serviceDefinition = new ServiceDefinitionImpl();
		return serviceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentResponse createEnrollmentResponse() {
		EnrollmentResponseImpl enrollmentResponse = new EnrollmentResponseImpl();
		return enrollmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequest createEnrollmentRequest() {
		EnrollmentRequestImpl enrollmentRequest = new EnrollmentRequestImpl();
		return enrollmentRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendation createImmunizationRecommendation() {
		ImmunizationRecommendationImpl immunizationRecommendation = new ImmunizationRecommendationImpl();
		return immunizationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationRecommendation createImmunizationRecommendationRecommendation() {
		ImmunizationRecommendationRecommendationImpl immunizationRecommendationRecommendation = new ImmunizationRecommendationRecommendationImpl();
		return immunizationRecommendationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationRecommendationDateCriterion createImmunizationRecommendationRecommendationDateCriterion() {
		ImmunizationRecommendationRecommendationDateCriterionImpl immunizationRecommendationRecommendationDateCriterion = new ImmunizationRecommendationRecommendationDateCriterionImpl();
		return immunizationRecommendationRecommendationDateCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationRecommendationProtocol createImmunizationRecommendationRecommendationProtocol() {
		ImmunizationRecommendationRecommendationProtocolImpl immunizationRecommendationRecommendationProtocol = new ImmunizationRecommendationRecommendationProtocolImpl();
		return immunizationRecommendationRecommendationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Immunization createImmunization() {
		ImmunizationImpl immunization = new ImmunizationImpl();
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationExplanation createImmunizationExplanation() {
		ImmunizationExplanationImpl immunizationExplanation = new ImmunizationExplanationImpl();
		return immunizationExplanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationReaction createImmunizationReaction() {
		ImmunizationReactionImpl immunizationReaction = new ImmunizationReactionImpl();
		return immunizationReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationVaccinationProtocol createImmunizationVaccinationProtocol() {
		ImmunizationVaccinationProtocolImpl immunizationVaccinationProtocol = new ImmunizationVaccinationProtocolImpl();
		return immunizationVaccinationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleLink createBundleLink() {
		BundleLinkImpl bundleLink = new BundleLinkImpl();
		return bundleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntry createBundleEntry() {
		BundleEntryImpl bundleEntry = new BundleEntryImpl();
		return bundleEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntrySearch createBundleEntrySearch() {
		BundleEntrySearchImpl bundleEntrySearch = new BundleEntrySearchImpl();
		return bundleEntrySearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntryRequest createBundleEntryRequest() {
		BundleEntryRequestImpl bundleEntryRequest = new BundleEntryRequestImpl();
		return bundleEntryRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntryResponse createBundleEntryResponse() {
		BundleEntryResponseImpl bundleEntryResponse = new BundleEntryResponseImpl();
		return bundleEntryResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReport createTestReport() {
		TestReportImpl testReport = new TestReportImpl();
		return testReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportParticipant createTestReportParticipant() {
		TestReportParticipantImpl testReportParticipant = new TestReportParticipantImpl();
		return testReportParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportSetup createTestReportSetup() {
		TestReportSetupImpl testReportSetup = new TestReportSetupImpl();
		return testReportSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportSetupSetupAction createTestReportSetupSetupAction() {
		TestReportSetupSetupActionImpl testReportSetupSetupAction = new TestReportSetupSetupActionImpl();
		return testReportSetupSetupAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportSetupSetupActionOperation createTestReportSetupSetupActionOperation() {
		TestReportSetupSetupActionOperationImpl testReportSetupSetupActionOperation = new TestReportSetupSetupActionOperationImpl();
		return testReportSetupSetupActionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportSetupSetupActionAssert createTestReportSetupSetupActionAssert() {
		TestReportSetupSetupActionAssertImpl testReportSetupSetupActionAssert = new TestReportSetupSetupActionAssertImpl();
		return testReportSetupSetupActionAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportTest createTestReportTest() {
		TestReportTestImpl testReportTest = new TestReportTestImpl();
		return testReportTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportTestTestAction createTestReportTestTestAction() {
		TestReportTestTestActionImpl testReportTestTestAction = new TestReportTestTestActionImpl();
		return testReportTestTestAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportTeardown createTestReportTeardown() {
		TestReportTeardownImpl testReportTeardown = new TestReportTeardownImpl();
		return testReportTeardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportTeardownTeardownAction createTestReportTeardownTeardownAction() {
		TestReportTeardownTeardownActionImpl testReportTeardownTeardownAction = new TestReportTeardownTeardownActionImpl();
		return testReportTeardownTeardownAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponse createEligibilityResponse() {
		EligibilityResponseImpl eligibilityResponse = new EligibilityResponseImpl();
		return eligibilityResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequest createEligibilityRequest() {
		EligibilityRequestImpl eligibilityRequest = new EligibilityRequestImpl();
		return eligibilityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseInsurance createEligibilityResponseInsurance() {
		EligibilityResponseInsuranceImpl eligibilityResponseInsurance = new EligibilityResponseInsuranceImpl();
		return eligibilityResponseInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseInsuranceBenefits createEligibilityResponseInsuranceBenefits() {
		EligibilityResponseInsuranceBenefitsImpl eligibilityResponseInsuranceBenefits = new EligibilityResponseInsuranceBenefitsImpl();
		return eligibilityResponseInsuranceBenefits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseInsuranceBenefitsBenefit createEligibilityResponseInsuranceBenefitsBenefit() {
		EligibilityResponseInsuranceBenefitsBenefitImpl eligibilityResponseInsuranceBenefitsBenefit = new EligibilityResponseInsuranceBenefitsBenefitImpl();
		return eligibilityResponseInsuranceBenefitsBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseErrors createEligibilityResponseErrors() {
		EligibilityResponseErrorsImpl eligibilityResponseErrors = new EligibilityResponseErrorsImpl();
		return eligibilityResponseErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersParameter createParametersParameter() {
		ParametersParameterImpl parametersParameter = new ParametersParameterImpl();
		return parametersParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense createMedicationDispense() {
		MedicationDispenseImpl medicationDispense = new MedicationDispenseImpl();
		return medicationDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseSubstitution createMedicationDispenseSubstitution() {
		MedicationDispenseSubstitutionImpl medicationDispenseSubstitution = new MedicationDispenseSubstitutionImpl();
		return medicationDispenseSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReport createMeasureReport() {
		MeasureReportImpl measureReport = new MeasureReportImpl();
		return measureReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroup createMeasureGroup() {
		MeasureGroupImpl measureGroup = new MeasureGroupImpl();
		return measureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupPopulation createMeasureGroupPopulation() {
		MeasureGroupPopulationImpl measureGroupPopulation = new MeasureGroupPopulationImpl();
		return measureGroupPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupStratifier createMeasureGroupStratifier() {
		MeasureGroupStratifierImpl measureGroupStratifier = new MeasureGroupStratifierImpl();
		return measureGroupStratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureSupplementalData createMeasureSupplementalData() {
		MeasureSupplementalDataImpl measureSupplementalData = new MeasureSupplementalDataImpl();
		return measureSupplementalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportGroup createMeasureReportGroup() {
		MeasureReportGroupImpl measureReportGroup = new MeasureReportGroupImpl();
		return measureReportGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportGroupPopulation createMeasureReportGroupPopulation() {
		MeasureReportGroupPopulationImpl measureReportGroupPopulation = new MeasureReportGroupPopulationImpl();
		return measureReportGroupPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEntry createListEntry() {
		ListEntryImpl listEntry = new ListEntryImpl();
		return listEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportGroupStratifier createMeasureReportGroupStratifier() {
		MeasureReportGroupStratifierImpl measureReportGroupStratifier = new MeasureReportGroupStratifierImpl();
		return measureReportGroupStratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportGroupStratifierStratifierGroup createMeasureReportGroupStratifierStratifierGroup() {
		MeasureReportGroupStratifierStratifierGroupImpl measureReportGroupStratifierStratifierGroup = new MeasureReportGroupStratifierStratifierGroupImpl();
		return measureReportGroupStratifierStratifierGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation createMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation() {
		MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulationImpl measureReportGroupStratifierStratifierGroupStratifierGroupPopulation = new MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulationImpl();
		return measureReportGroupStratifierStratifierGroupStratifierGroupPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportGroupSupplementalData createMeasureReportGroupSupplementalData() {
		MeasureReportGroupSupplementalDataImpl measureReportGroupSupplementalData = new MeasureReportGroupSupplementalDataImpl();
		return measureReportGroupSupplementalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportGroupSupplementalDataSupplementalDataGroup createMeasureReportGroupSupplementalDataSupplementalDataGroup() {
		MeasureReportGroupSupplementalDataSupplementalDataGroupImpl measureReportGroupSupplementalDataSupplementalDataGroup = new MeasureReportGroupSupplementalDataSupplementalDataGroupImpl();
		return measureReportGroupSupplementalDataSupplementalDataGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse createClaimResponse() {
		ClaimResponseImpl claimResponse = new ClaimResponseImpl();
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimRelatedClaim createClaimRelatedClaim() {
		ClaimRelatedClaimImpl claimRelatedClaim = new ClaimRelatedClaimImpl();
		return claimRelatedClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimPayee createClaimPayee() {
		ClaimPayeeImpl claimPayee = new ClaimPayeeImpl();
		return claimPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimCareTeam createClaimCareTeam() {
		ClaimCareTeamImpl claimCareTeam = new ClaimCareTeamImpl();
		return claimCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimSpecialCondition createClaimSpecialCondition() {
		ClaimSpecialConditionImpl claimSpecialCondition = new ClaimSpecialConditionImpl();
		return claimSpecialCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimDiagnosis createClaimDiagnosis() {
		ClaimDiagnosisImpl claimDiagnosis = new ClaimDiagnosisImpl();
		return claimDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimProcedure createClaimProcedure() {
		ClaimProcedureImpl claimProcedure = new ClaimProcedureImpl();
		return claimProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimInsurance createClaimInsurance() {
		ClaimInsuranceImpl claimInsurance = new ClaimInsuranceImpl();
		return claimInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimAccident createClaimAccident() {
		ClaimAccidentImpl claimAccident = new ClaimAccidentImpl();
		return claimAccident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimItem createClaimItem() {
		ClaimItemImpl claimItem = new ClaimItemImpl();
		return claimItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimItemDetail createClaimItemDetail() {
		ClaimItemDetailImpl claimItemDetail = new ClaimItemDetailImpl();
		return claimItemDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimItemDetailSubDetail createClaimItemDetailSubDetail() {
		ClaimItemDetailSubDetailImpl claimItemDetailSubDetail = new ClaimItemDetailSubDetailImpl();
		return claimItemDetailSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimItemProsthesis createClaimItemProsthesis() {
		ClaimItemProsthesisImpl claimItemProsthesis = new ClaimItemProsthesisImpl();
		return claimItemProsthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItem createClaimResponseItem() {
		ClaimResponseItemImpl claimResponseItem = new ClaimResponseItemImpl();
		return claimResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItemAdjudication createClaimResponseItemAdjudication() {
		ClaimResponseItemAdjudicationImpl claimResponseItemAdjudication = new ClaimResponseItemAdjudicationImpl();
		return claimResponseItemAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItemItemDetail createClaimResponseItemItemDetail() {
		ClaimResponseItemItemDetailImpl claimResponseItemItemDetail = new ClaimResponseItemItemDetailImpl();
		return claimResponseItemItemDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItemItemDetailSubDetail createClaimResponseItemItemDetailSubDetail() {
		ClaimResponseItemItemDetailSubDetailImpl claimResponseItemItemDetailSubDetail = new ClaimResponseItemItemDetailSubDetailImpl();
		return claimResponseItemItemDetailSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAddedItem createClaimResponseAddedItem() {
		ClaimResponseAddedItemImpl claimResponseAddedItem = new ClaimResponseAddedItemImpl();
		return claimResponseAddedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAddedItemAddedItemsDetail createClaimResponseAddedItemAddedItemsDetail() {
		ClaimResponseAddedItemAddedItemsDetailImpl claimResponseAddedItemAddedItemsDetail = new ClaimResponseAddedItemAddedItemsDetailImpl();
		return claimResponseAddedItemAddedItemsDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseError createClaimResponseError() {
		ClaimResponseErrorImpl claimResponseError = new ClaimResponseErrorImpl();
		return claimResponseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponsePayment createClaimResponsePayment() {
		ClaimResponsePaymentImpl claimResponsePayment = new ClaimResponsePaymentImpl();
		return claimResponsePayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseNote createClaimResponseNote() {
		ClaimResponseNoteImpl claimResponseNote = new ClaimResponseNoteImpl();
		return claimResponseNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseInsurance createClaimResponseInsurance() {
		ClaimResponseInsuranceImpl claimResponseInsurance = new ClaimResponseInsuranceImpl();
		return claimResponseInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRequester createTaskRequester() {
		TaskRequesterImpl taskRequester = new TaskRequesterImpl();
		return taskRequester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRestriction createTaskRestriction() {
		TaskRestrictionImpl taskRestriction = new TaskRestrictionImpl();
		return taskRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskParameter createTaskParameter() {
		TaskParameterImpl taskParameter = new TaskParameterImpl();
		return taskParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskOutput createTaskOutput() {
		TaskOutputImpl taskOutput = new TaskOutputImpl();
		return taskOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefit createExplanationOfBenefit() {
		ExplanationOfBenefitImpl explanationOfBenefit = new ExplanationOfBenefitImpl();
		return explanationOfBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitRelatedClaim createExplanationOfBenefitRelatedClaim() {
		ExplanationOfBenefitRelatedClaimImpl explanationOfBenefitRelatedClaim = new ExplanationOfBenefitRelatedClaimImpl();
		return explanationOfBenefitRelatedClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayee createExplanationOfBenefitPayee() {
		ExplanationOfBenefitPayeeImpl explanationOfBenefitPayee = new ExplanationOfBenefitPayeeImpl();
		return explanationOfBenefitPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitSupportingInformation createExplanationOfBenefitSupportingInformation() {
		ExplanationOfBenefitSupportingInformationImpl explanationOfBenefitSupportingInformation = new ExplanationOfBenefitSupportingInformationImpl();
		return explanationOfBenefitSupportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitCareTeam createExplanationOfBenefitCareTeam() {
		ExplanationOfBenefitCareTeamImpl explanationOfBenefitCareTeam = new ExplanationOfBenefitCareTeamImpl();
		return explanationOfBenefitCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitDiagnosis createExplanationOfBenefitDiagnosis() {
		ExplanationOfBenefitDiagnosisImpl explanationOfBenefitDiagnosis = new ExplanationOfBenefitDiagnosisImpl();
		return explanationOfBenefitDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitProcedure createExplanationOfBenefitProcedure() {
		ExplanationOfBenefitProcedureImpl explanationOfBenefitProcedure = new ExplanationOfBenefitProcedureImpl();
		return explanationOfBenefitProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitInsurance createExplanationOfBenefitInsurance() {
		ExplanationOfBenefitInsuranceImpl explanationOfBenefitInsurance = new ExplanationOfBenefitInsuranceImpl();
		return explanationOfBenefitInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAccident createExplanationOfBenefitAccident() {
		ExplanationOfBenefitAccidentImpl explanationOfBenefitAccident = new ExplanationOfBenefitAccidentImpl();
		return explanationOfBenefitAccident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItem createExplanationOfBenefitItem() {
		ExplanationOfBenefitItemImpl explanationOfBenefitItem = new ExplanationOfBenefitItemImpl();
		return explanationOfBenefitItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItemAdjudication createExplanationOfBenefitItemAdjudication() {
		ExplanationOfBenefitItemAdjudicationImpl explanationOfBenefitItemAdjudication = new ExplanationOfBenefitItemAdjudicationImpl();
		return explanationOfBenefitItemAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItemDetail createExplanationOfBenefitItemDetail() {
		ExplanationOfBenefitItemDetailImpl explanationOfBenefitItemDetail = new ExplanationOfBenefitItemDetailImpl();
		return explanationOfBenefitItemDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItemDetailSubDetail createExplanationOfBenefitItemDetailSubDetail() {
		ExplanationOfBenefitItemDetailSubDetailImpl explanationOfBenefitItemDetailSubDetail = new ExplanationOfBenefitItemDetailSubDetailImpl();
		return explanationOfBenefitItemDetailSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItemProsthesis createExplanationOfBenefitItemProsthesis() {
		ExplanationOfBenefitItemProsthesisImpl explanationOfBenefitItemProsthesis = new ExplanationOfBenefitItemProsthesisImpl();
		return explanationOfBenefitItemProsthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAddedItem createExplanationOfBenefitAddedItem() {
		ExplanationOfBenefitAddedItemImpl explanationOfBenefitAddedItem = new ExplanationOfBenefitAddedItemImpl();
		return explanationOfBenefitAddedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAddedItemAddedItemsDetail createExplanationOfBenefitAddedItemAddedItemsDetail() {
		ExplanationOfBenefitAddedItemAddedItemsDetailImpl explanationOfBenefitAddedItemAddedItemsDetail = new ExplanationOfBenefitAddedItemAddedItemsDetailImpl();
		return explanationOfBenefitAddedItemAddedItemsDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayment createExplanationOfBenefitPayment() {
		ExplanationOfBenefitPaymentImpl explanationOfBenefitPayment = new ExplanationOfBenefitPaymentImpl();
		return explanationOfBenefitPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitNote createExplanationOfBenefitNote() {
		ExplanationOfBenefitNoteImpl explanationOfBenefitNote = new ExplanationOfBenefitNoteImpl();
		return explanationOfBenefitNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitBenefitBalance createExplanationOfBenefitBenefitBalance() {
		ExplanationOfBenefitBenefitBalanceImpl explanationOfBenefitBenefitBalance = new ExplanationOfBenefitBenefitBalanceImpl();
		return explanationOfBenefitBenefitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitBenefitBalanceBenefit createExplanationOfBenefitBenefitBalanceBenefit() {
		ExplanationOfBenefitBenefitBalanceBenefitImpl explanationOfBenefitBenefitBalanceBenefit = new ExplanationOfBenefitBenefitBalanceBenefitImpl();
		return explanationOfBenefitBenefitBalanceBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuide createImplementationGuide() {
		ImplementationGuideImpl implementationGuide = new ImplementationGuideImpl();
		return implementationGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideDependency createImplementationGuideDependency() {
		ImplementationGuideDependencyImpl implementationGuideDependency = new ImplementationGuideDependencyImpl();
		return implementationGuideDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePackage createImplementationGuidePackage() {
		ImplementationGuidePackageImpl implementationGuidePackage = new ImplementationGuidePackageImpl();
		return implementationGuidePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePackageResource createImplementationGuidePackageResource() {
		ImplementationGuidePackageResourceImpl implementationGuidePackageResource = new ImplementationGuidePackageResourceImpl();
		return implementationGuidePackageResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideGlobal createImplementationGuideGlobal() {
		ImplementationGuideGlobalImpl implementationGuideGlobal = new ImplementationGuideGlobalImpl();
		return implementationGuideGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePage createImplementationGuidePage() {
		ImplementationGuidePageImpl implementationGuidePage = new ImplementationGuidePageImpl();
		return implementationGuidePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameter createSearchParameter() {
		SearchParameterImpl searchParameter = new SearchParameterImpl();
		return searchParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameterComponent createSearchParameterComponent() {
		SearchParameterComponentImpl searchParameterComponent = new SearchParameterComponentImpl();
		return searchParameterComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfile createExpansionProfile() {
		ExpansionProfileImpl expansionProfile = new ExpansionProfileImpl();
		return expansionProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileFixedVersion createExpansionProfileFixedVersion() {
		ExpansionProfileFixedVersionImpl expansionProfileFixedVersion = new ExpansionProfileFixedVersionImpl();
		return expansionProfileFixedVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileExcludedSystem createExpansionProfileExcludedSystem() {
		ExpansionProfileExcludedSystemImpl expansionProfileExcludedSystem = new ExpansionProfileExcludedSystemImpl();
		return expansionProfileExcludedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignation createExpansionProfileDesignation() {
		ExpansionProfileDesignationImpl expansionProfileDesignation = new ExpansionProfileDesignationImpl();
		return expansionProfileDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignationDesignationInclude createExpansionProfileDesignationDesignationInclude() {
		ExpansionProfileDesignationDesignationIncludeImpl expansionProfileDesignationDesignationInclude = new ExpansionProfileDesignationDesignationIncludeImpl();
		return expansionProfileDesignationDesignationInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation createExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation() {
		ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignationImpl expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation = new ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignationImpl();
		return expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignationDesignationExclude createExpansionProfileDesignationDesignationExclude() {
		ExpansionProfileDesignationDesignationExcludeImpl expansionProfileDesignationDesignationExclude = new ExpansionProfileDesignationDesignationExcludeImpl();
		return expansionProfileDesignationDesignationExclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation createExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation() {
		ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation = new ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl();
		return expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentDefinition createCompartmentDefinition() {
		CompartmentDefinitionImpl compartmentDefinition = new CompartmentDefinitionImpl();
		return compartmentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentDefinitionResource createCompartmentDefinitionResource() {
		CompartmentDefinitionResourceImpl compartmentDefinitionResource = new CompartmentDefinitionResourceImpl();
		return compartmentDefinitionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponse createProcessResponse() {
		ProcessResponseImpl processResponse = new ProcessResponseImpl();
		return processResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponseNote createProcessResponseNote() {
		ProcessResponseNoteImpl processResponseNote = new ProcessResponseNoteImpl();
		return processResponseNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRole createPractitionerRole() {
		PractitionerRoleImpl practitionerRole = new PractitionerRoleImpl();
		return practitionerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRoleAvailableTime createPractitionerRoleAvailableTime() {
		PractitionerRoleAvailableTimeImpl practitionerRoleAvailableTime = new PractitionerRoleAvailableTimeImpl();
		return practitionerRoleAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRoleNotAvailable createPractitionerRoleNotAvailable() {
		PractitionerRoleNotAvailableImpl practitionerRoleNotAvailable = new PractitionerRoleNotAvailableImpl();
		return practitionerRoleNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentNotice createPaymentNotice() {
		PaymentNoticeImpl paymentNotice = new PaymentNoticeImpl();
		return paymentNotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linkage createLinkage() {
		LinkageImpl linkage = new LinkageImpl();
		return linkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageItem createLinkageItem() {
		LinkageItemImpl linkageItem = new LinkageItemImpl();
		return linkageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequest createSupplyRequest() {
		SupplyRequestImpl supplyRequest = new SupplyRequestImpl();
		return supplyRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestWhen createSupplyRequestWhen() {
		SupplyRequestWhenImpl supplyRequestWhen = new SupplyRequestWhenImpl();
		return supplyRequestWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponse createGuidanceResponse() {
		GuidanceResponseImpl guidanceResponse = new GuidanceResponseImpl();
		return guidanceResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinition createMessageDefinition() {
		MessageDefinitionImpl messageDefinition = new MessageDefinitionImpl();
		return messageDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinitionFocus createMessageDefinitionFocus() {
		MessageDefinitionFocusImpl messageDefinitionFocus = new MessageDefinitionFocusImpl();
		return messageDefinitionFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinitionAllowedResponse createMessageDefinitionAllowedResponse() {
		MessageDefinitionAllowedResponseImpl messageDefinitionAllowedResponse = new MessageDefinitionAllowedResponseImpl();
		return messageDefinitionAllowedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssue createDetectedIssue() {
		DetectedIssueImpl detectedIssue = new DetectedIssueImpl();
		return detectedIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueMitigation createDetectedIssueMitigation() {
		DetectedIssueMitigationImpl detectedIssueMitigation = new DetectedIssueMitigationImpl();
		return detectedIssueMitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentResponse createAppointmentResponse() {
		AppointmentResponseImpl appointmentResponse = new AppointmentResponseImpl();
		return appointmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEvent createAuditEvent() {
		AuditEventImpl auditEvent = new AuditEventImpl();
		return auditEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgent createAuditEventAgent() {
		AuditEventAgentImpl auditEventAgent = new AuditEventAgentImpl();
		return auditEventAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgentNetwork createAuditEventAgentNetwork() {
		AuditEventAgentNetworkImpl auditEventAgentNetwork = new AuditEventAgentNetworkImpl();
		return auditEventAgentNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSource createAuditEventSource() {
		AuditEventSourceImpl auditEventSource = new AuditEventSourceImpl();
		return auditEventSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEntity createAuditEventEntity() {
		AuditEventEntityImpl auditEventEntity = new AuditEventEntityImpl();
		return auditEventEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEntityDetail createAuditEventEntityDetail() {
		AuditEventEntityDetailImpl auditEventEntityDetail = new AuditEventEntityDetailImpl();
		return auditEventEntityDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDelivery createSupplyDelivery() {
		SupplyDeliveryImpl supplyDelivery = new SupplyDeliveryImpl();
		return supplyDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationContact createOrganizationContact() {
		OrganizationContactImpl organizationContact = new OrganizationContactImpl();
		return organizationContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesPackage getResourcesPackage() {
		return (ResourcesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourcesPackage getPackage() {
		return ResourcesPackage.eINSTANCE;
	}

} //ResourcesFactoryImpl
