/**
 */
package org.eclipse.mdht.uml.fhir.core.valueSets.impl;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.impl.ResourcesPackageImpl;
import org.eclipse.mdht.uml.fhir.core.valueSets.ValueSetsFactory;
import org.eclipse.mdht.uml.fhir.core.valueSets.ValueSetsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueSetsPackageImpl extends EPackageImpl implements ValueSetsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "valueSets.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addressUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addressTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantityComparatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allSecurityLabelsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commonTagsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commonLanguagesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum narrativeStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identifierUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identifierTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum organizationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactPointSystemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactPointUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactEntityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nameUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endpointStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endpointConnectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endpointPayloadTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum administrativeGenderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum practitionerRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum practitionerSpecialtyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceDeliveryLocationRoleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum practiceSettingCodeValueSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceProvisionConditionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referralMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum daysOfWeekEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maritalStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v2ContactRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum animalSpeciesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum animalBreedsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signatureTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsOfTimeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTimingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timingAbbreviationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum libraryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum publicationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usageContextTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jurisdictionValueSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contributorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relatedArtifactTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationParameterUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fhirAllTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureDefinitionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureDefinitionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum extensionContextEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fhirDefinedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeDerivationRuleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyRepresentationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loincCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum slicingRulesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceVersionRulesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingStrengthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum designationUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum researchSubjectStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planDefinitionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planActionConditionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planActionRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planActionParticipantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planActionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planActionGroupingBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planActionSelectionBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planActionRequiredBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planActionPrecheckBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planActionCardinalityBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activityDefinitionCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtMedicationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtFormCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtFormCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum substanceCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum substanceCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtFormCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtAdditionalDosageInstructionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtMedicationAsNeededReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtAnatomicalStructureForAdministrationSiteCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtRouteCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtAdministrationMethodCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtBodyStructuresEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureMapModelModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureMapInputModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureMapContextTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureMapListModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureMapTransformEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum researchStudyStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum groupTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentTypeValueSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentClassValueSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentReferenceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositionStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentReferenceFormatCodeSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encounterStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actEncounterCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encounterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3CodeSystemActPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum episodeOfCareStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionClinicalStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionVerificationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionDiagnosisSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionProblemDiagnosisCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionStageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clinicalImpressionStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceClinicalStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceVerificationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceCriticalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceSubstanceProductConditionAndNegationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceCertaintyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtClinicalFindingsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtClinicalFindingsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum investigationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationValueAbsentReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationInterpretationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationMethodsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specimenStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v2SpecimenTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestIntentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loincDiagnosticRequestCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participantRolesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum purposeOfUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum provenanceEventCurrentStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum provenanceParticipantRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3CodeSystemRoleLinkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum provenanceEntityRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureCodessnomedCTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureRequestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureRequestPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specimenCollectionMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specimenTreatmentProcedureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specimenContainerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v2AdditivePreservativeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measmntPrincipleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricOperationalStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricColorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricCalibrationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricCalibrationStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationReferenceRangeMeaningCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionnaireStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextOfUseValueSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionnaireQuestionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionnaireItemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionnaireAnswerCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanRelationshipEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalStartEventEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalStatusReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationStatementStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationStatementNotTakenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtDrugsNotTakencompletedCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationStatementCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nutritionOrderStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dietEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum foodTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dietCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nutrientModifierCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textureModifierCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textureModifiedFoodTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fluidConsistencyTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplementTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enteralFormulaTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enteralFormulaAdditiveTypeCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enteralRouteCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskProbabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum appointmentStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v2AppointmentReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encounterReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum slotStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participantRequiredEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3CodeSystemParticipationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationRequestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3CodeSystemActReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestStageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationRequestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationRequestStageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationRequestCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum substanceAdminSubstitutionReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum financialResourceStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleVisionPrescriptionProductCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visionEyesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visionBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanActivityCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanActivityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activityReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanActivityStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referralStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referralCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureCategoryCodessnomedCTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedurePerformerRoleCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureNotPerformedReasonsnomeDCTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureOutcomeCodessnomedCTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagnosticReportStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagnosticServiceSectionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loincDiagnosticReportCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceAvailabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum acquisitionModalityCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dWebTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lateralityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum koStitleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum digitalMediaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaSubTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaCollectionViewProjectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtClinicalFindingsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureFollowUpCodessnomedCTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureDeviceActionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationAdministrationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtReasonMedicationNotGivenCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reasonMedicationGivenCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionnaireResponseStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sequenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chromosomehumanEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ensemblEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qualityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum repositoryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum familyHistoryStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum familyMemberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionOutcomeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clinicalImpressionPrognosisEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum manifestationAndSymptomCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accountStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coverageTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum policyholderRelationshipCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractSubtypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractActionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractActorRoleCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractSignerTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractTermTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractTermTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractTermTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fhirDocumentTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fhirDocumentClassCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidentialityClassificationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositionAttestationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3CodeSystemActCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentSectionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listOrderCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listEmptyReasonsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum admitSourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v2ReAdmissionIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specialCourtesyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specialArrangementsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dischargeDispositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encounterLocationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum facilityTypeCodeValueSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentExceptTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentActorRolesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentActionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentContentClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentContentCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentDataMeaningEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum namingSystemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum namingSystemIdentifierTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conceptMapEquivalenceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identityAssuranceLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flagCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flagStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flagCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codeSystemHierarchyMeaningEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codeSystemContentModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum claimProcessingCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noteTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testScriptProfileOriginTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testScriptProfileDestinationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum capabilityStatementKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unknownContentCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restfulCapabilityModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restfulSecurityServiceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeRestfulInteractionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceVersionPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionalReadStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionalDeleteStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceHandlingPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchParamTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemRestfulInteractionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageTransportEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageEventEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageSignificanceCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventCapabilityModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testScriptOperationCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assertionDirectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assertionOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assertionResponseTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataElementStringencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum responseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationOutcomeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleMessageReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subscriptionStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subscriptionChannelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subscriptionTagEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bodysiteLocationModifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vaccineAdministeredValueSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationRecommendationStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationRecommendationDateCriterionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationOriginEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codesForImmunizationSiteOfAdministrationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationRouteCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationReasonsForNotImmunizingCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vaccinationProtocolDoseTargetCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vaccinationProtocolDoseStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vaccinationProtocolDoseStatusReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bundleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchEntryModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpVerbEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testReportStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testReportParticipantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testReportResultCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorityCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum benefitCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum benefitSubCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum benefitTermCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum benefitTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adjudicationErrorCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationDispenseStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actPharmacySupplyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actSubstanceAdminSubstitutionCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measureScoringEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositeMeasureScoringEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measureTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurePopulationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measureDataUsageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measureReportTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measureReportStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleUseCodesForListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientMedicineChangeTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleClaimTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleClaimSubTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum useEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fundsReservationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleRelatedClaimRelationshipCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum payeeTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum payeeResourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum payeeResourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum claimCareTeamRoleCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleProviderQualificationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum claimInformationCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exceptionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum missingToothReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum icD10CodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleDiagnosisTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleDiagnosisRelatedGroupCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum icD10ProcedureCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actIncidentCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleRevenueCenterCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usclsCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modifierTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleProgramReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleServicePlaceCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oralSiteCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum surfaceCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oralProsthoMaterialTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adjudicationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adjudicationReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum examplePaymentTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentAdjustmentReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskPerformerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum explanationOfBenefitStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum payeeResourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actInvoiceGroupCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guideDependencyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guidePageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xPathUsageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchComparatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchModifierCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemVersionProcessingModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compartmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processOutcomeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyRequestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtSupplyItemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyRequestReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyRequestWhenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guidanceResponseStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum detectedIssueCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum detectedIssueSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum detectedIssueMitigationActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventIdEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventSubTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventOutcomeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditAgentRoleIdCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaTypeCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventAgentNetworkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventSourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventEntityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventEntityRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventEntityLifecycleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basicResourceTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyDeliveryStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyItemTypeEEnum = null;

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
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ValueSetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValueSetsPackageImpl() {
		super(eNS_URI, ValueSetsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ValueSetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ValueSetsPackage init() {
		if (isInited) return (ValueSetsPackage)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI);

		// Obtain or create and register package
		ValueSetsPackageImpl theValueSetsPackage = (ValueSetsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValueSetsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ValueSetsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) instanceof ResourcesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) : ResourcesPackage.eINSTANCE);

		// Load packages
		theValueSetsPackage.loadPackage();
		theResourcesPackage.loadPackage();

		// Create package meta-data objects
		theDataTypesPackage.createPackageContents();

		// Initialize created meta-data
		theDataTypesPackage.initializePackageContents();

		// Fix loaded packages
		theValueSetsPackage.fixPackageContents();
		theResourcesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theValueSetsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValueSetsPackage.eNS_URI, theValueSetsPackage);
		return theValueSetsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		if (dataTypeEEnum == null) {
			dataTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceType() {
		if (resourceTypeEEnum == null) {
			resourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return resourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAddressUse() {
		if (addressUseEEnum == null) {
			addressUseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return addressUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAddressType() {
		if (addressTypeEEnum == null) {
			addressTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return addressTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantityComparator() {
		if (quantityComparatorEEnum == null) {
			quantityComparatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return quantityComparatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllSecurityLabels() {
		if (allSecurityLabelsEEnum == null) {
			allSecurityLabelsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return allSecurityLabelsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommonTags() {
		if (commonTagsEEnum == null) {
			commonTagsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return commonTagsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommonLanguages() {
		if (commonLanguagesEEnum == null) {
			commonLanguagesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return commonLanguagesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNarrativeStatus() {
		if (narrativeStatusEEnum == null) {
			narrativeStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return narrativeStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIdentifierUse() {
		if (identifierUseEEnum == null) {
			identifierUseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return identifierUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIdentifierTypeCodes() {
		if (identifierTypeCodesEEnum == null) {
			identifierTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return identifierTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrganizationType() {
		if (organizationTypeEEnum == null) {
			organizationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return organizationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContactPointSystem() {
		if (contactPointSystemEEnum == null) {
			contactPointSystemEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return contactPointSystemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContactPointUse() {
		if (contactPointUseEEnum == null) {
			contactPointUseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(13);
		}
		return contactPointUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContactEntityType() {
		if (contactEntityTypeEEnum == null) {
			contactEntityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(14);
		}
		return contactEntityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNameUse() {
		if (nameUseEEnum == null) {
			nameUseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(15);
		}
		return nameUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEndpointStatus() {
		if (endpointStatusEEnum == null) {
			endpointStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(16);
		}
		return endpointStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEndpointConnectionType() {
		if (endpointConnectionTypeEEnum == null) {
			endpointConnectionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(17);
		}
		return endpointConnectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEndpointPayloadType() {
		if (endpointPayloadTypeEEnum == null) {
			endpointPayloadTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(18);
		}
		return endpointPayloadTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdministrativeGender() {
		if (administrativeGenderEEnum == null) {
			administrativeGenderEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(19);
		}
		return administrativeGenderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPractitionerRole() {
		if (practitionerRoleEEnum == null) {
			practitionerRoleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(20);
		}
		return practitionerRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPractitionerSpecialty() {
		if (practitionerSpecialtyEEnum == null) {
			practitionerSpecialtyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(21);
		}
		return practitionerSpecialtyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationStatus() {
		if (locationStatusEEnum == null) {
			locationStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(22);
		}
		return locationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationMode() {
		if (locationModeEEnum == null) {
			locationModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(23);
		}
		return locationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceDeliveryLocationRoleType() {
		if (serviceDeliveryLocationRoleTypeEEnum == null) {
			serviceDeliveryLocationRoleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(24);
		}
		return serviceDeliveryLocationRoleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationType() {
		if (locationTypeEEnum == null) {
			locationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(25);
		}
		return locationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceCategory() {
		if (serviceCategoryEEnum == null) {
			serviceCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(26);
		}
		return serviceCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceType() {
		if (serviceTypeEEnum == null) {
			serviceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(27);
		}
		return serviceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPracticeSettingCodeValueSet() {
		if (practiceSettingCodeValueSetEEnum == null) {
			practiceSettingCodeValueSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(28);
		}
		return practiceSettingCodeValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceProvisionConditions() {
		if (serviceProvisionConditionsEEnum == null) {
			serviceProvisionConditionsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(29);
		}
		return serviceProvisionConditionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferralMethod() {
		if (referralMethodEEnum == null) {
			referralMethodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(30);
		}
		return referralMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDaysOfWeek() {
		if (daysOfWeekEEnum == null) {
			daysOfWeekEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(31);
		}
		return daysOfWeekEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12() {
		if (anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum == null) {
			anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(32);
		}
		return anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaritalStatusCodes() {
		if (maritalStatusCodesEEnum == null) {
			maritalStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(33);
		}
		return maritalStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV2ContactRole() {
		if (v2ContactRoleEEnum == null) {
			v2ContactRoleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(34);
		}
		return v2ContactRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnimalSpecies() {
		if (animalSpeciesEEnum == null) {
			animalSpeciesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(35);
		}
		return animalSpeciesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnimalBreeds() {
		if (animalBreedsEEnum == null) {
			animalBreedsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(36);
		}
		return animalBreedsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenderStatus() {
		if (genderStatusEEnum == null) {
			genderStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(37);
		}
		return genderStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatientRelationshipType() {
		if (patientRelationshipTypeEEnum == null) {
			patientRelationshipTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(38);
		}
		return patientRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkType() {
		if (linkTypeEEnum == null) {
			linkTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(39);
		}
		return linkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSignatureTypeCodes() {
		if (signatureTypeCodesEEnum == null) {
			signatureTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(40);
		}
		return signatureTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceStatus() {
		if (deviceStatusEEnum == null) {
			deviceStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(41);
		}
		return deviceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceTypes() {
		if (deviceTypesEEnum == null) {
			deviceTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(42);
		}
		return deviceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitsOfTime() {
		if (unitsOfTimeEEnum == null) {
			unitsOfTimeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(43);
		}
		return unitsOfTimeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventTiming() {
		if (eventTimingEEnum == null) {
			eventTimingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(44);
		}
		return eventTimingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimingAbbreviation() {
		if (timingAbbreviationEEnum == null) {
			timingAbbreviationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(45);
		}
		return timingAbbreviationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLibraryType() {
		if (libraryTypeEEnum == null) {
			libraryTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(46);
		}
		return libraryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPublicationStatus() {
		if (publicationStatusEEnum == null) {
			publicationStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(47);
		}
		return publicationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUsageContextType() {
		if (usageContextTypeEEnum == null) {
			usageContextTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(48);
		}
		return usageContextTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJurisdictionValueSet() {
		if (jurisdictionValueSetEEnum == null) {
			jurisdictionValueSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(49);
		}
		return jurisdictionValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContributorType() {
		if (contributorTypeEEnum == null) {
			contributorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(50);
		}
		return contributorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelatedArtifactType() {
		if (relatedArtifactTypeEEnum == null) {
			relatedArtifactTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(51);
		}
		return relatedArtifactTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationParameterUse() {
		if (operationParameterUseEEnum == null) {
			operationParameterUseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(52);
		}
		return operationParameterUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFhirAllTypes() {
		if (fhirAllTypesEEnum == null) {
			fhirAllTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(53);
		}
		return fhirAllTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStructureDefinitionCodes() {
		if (structureDefinitionCodesEEnum == null) {
			structureDefinitionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(54);
		}
		return structureDefinitionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStructureDefinitionKind() {
		if (structureDefinitionKindEEnum == null) {
			structureDefinitionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(55);
		}
		return structureDefinitionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExtensionContext() {
		if (extensionContextEEnum == null) {
			extensionContextEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(56);
		}
		return extensionContextEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFhirDefinedType() {
		if (fhirDefinedTypeEEnum == null) {
			fhirDefinedTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(57);
		}
		return fhirDefinedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeDerivationRule() {
		if (typeDerivationRuleEEnum == null) {
			typeDerivationRuleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(58);
		}
		return typeDerivationRuleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyRepresentation() {
		if (propertyRepresentationEEnum == null) {
			propertyRepresentationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(59);
		}
		return propertyRepresentationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLoincCodes() {
		if (loincCodesEEnum == null) {
			loincCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(60);
		}
		return loincCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSlicingRules() {
		if (slicingRulesEEnum == null) {
			slicingRulesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(61);
		}
		return slicingRulesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationMode() {
		if (aggregationModeEEnum == null) {
			aggregationModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(62);
		}
		return aggregationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceVersionRules() {
		if (referenceVersionRulesEEnum == null) {
			referenceVersionRulesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(63);
		}
		return referenceVersionRulesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintSeverity() {
		if (constraintSeverityEEnum == null) {
			constraintSeverityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(64);
		}
		return constraintSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBindingStrength() {
		if (bindingStrengthEEnum == null) {
			bindingStrengthEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(65);
		}
		return bindingStrengthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDesignationUse() {
		if (designationUseEEnum == null) {
			designationUseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(66);
		}
		return designationUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterOperator() {
		if (filterOperatorEEnum == null) {
			filterOperatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(67);
		}
		return filterOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResearchSubjectStatus() {
		if (researchSubjectStatusEEnum == null) {
			researchSubjectStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(68);
		}
		return researchSubjectStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanDefinitionType() {
		if (planDefinitionTypeEEnum == null) {
			planDefinitionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(69);
		}
		return planDefinitionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTriggerType() {
		if (triggerTypeEEnum == null) {
			triggerTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(70);
		}
		return triggerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanActionConditionKind() {
		if (planActionConditionKindEEnum == null) {
			planActionConditionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(71);
		}
		return planActionConditionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanActionRelationshipType() {
		if (planActionRelationshipTypeEEnum == null) {
			planActionRelationshipTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(72);
		}
		return planActionRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanActionParticipantType() {
		if (planActionParticipantTypeEEnum == null) {
			planActionParticipantTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(73);
		}
		return planActionParticipantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanActionType() {
		if (planActionTypeEEnum == null) {
			planActionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(74);
		}
		return planActionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanActionGroupingBehavior() {
		if (planActionGroupingBehaviorEEnum == null) {
			planActionGroupingBehaviorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(75);
		}
		return planActionGroupingBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanActionSelectionBehavior() {
		if (planActionSelectionBehaviorEEnum == null) {
			planActionSelectionBehaviorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(76);
		}
		return planActionSelectionBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanActionRequiredBehavior() {
		if (planActionRequiredBehaviorEEnum == null) {
			planActionRequiredBehaviorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(77);
		}
		return planActionRequiredBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanActionPrecheckBehavior() {
		if (planActionPrecheckBehaviorEEnum == null) {
			planActionPrecheckBehaviorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(78);
		}
		return planActionPrecheckBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanActionCardinalityBehavior() {
		if (planActionCardinalityBehaviorEEnum == null) {
			planActionCardinalityBehaviorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(79);
		}
		return planActionCardinalityBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActivityDefinitionCategory() {
		if (activityDefinitionCategoryEEnum == null) {
			activityDefinitionCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(80);
		}
		return activityDefinitionCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtMedicationCodes() {
		if (snomedCtMedicationCodesEEnum == null) {
			snomedCtMedicationCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(81);
		}
		return snomedCtMedicationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtFormCodes() {
		if (snomedCtFormCodesEEnum == null) {
			snomedCtFormCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(82);
		}
		return snomedCtFormCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtFormCodes() {
		if (snomedCtFormCodesEEnum == null) {
			snomedCtFormCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(85);
		}
		return snomedCtFormCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubstanceCategoryCodes() {
		if (substanceCategoryCodesEEnum == null) {
			substanceCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(83);
		}
		return substanceCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubstanceCode() {
		if (substanceCodeEEnum == null) {
			substanceCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(84);
		}
		return substanceCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtFormCodes() {
		if (snomedCtFormCodesEEnum == null) {
			snomedCtFormCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(85);
		}
		return snomedCtFormCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtAdditionalDosageInstructions() {
		if (snomedCtAdditionalDosageInstructionsEEnum == null) {
			snomedCtAdditionalDosageInstructionsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(86);
		}
		return snomedCtAdditionalDosageInstructionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtMedicationAsNeededReasonCodes() {
		if (snomedCtMedicationAsNeededReasonCodesEEnum == null) {
			snomedCtMedicationAsNeededReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(87);
		}
		return snomedCtMedicationAsNeededReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtAnatomicalStructureForAdministrationSiteCodes() {
		if (snomedCtAnatomicalStructureForAdministrationSiteCodesEEnum == null) {
			snomedCtAnatomicalStructureForAdministrationSiteCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(88);
		}
		return snomedCtAnatomicalStructureForAdministrationSiteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtRouteCodes() {
		if (snomedCtRouteCodesEEnum == null) {
			snomedCtRouteCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(89);
		}
		return snomedCtRouteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtAdministrationMethodCodes() {
		if (snomedCtAdministrationMethodCodesEEnum == null) {
			snomedCtAdministrationMethodCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(90);
		}
		return snomedCtAdministrationMethodCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtBodyStructures() {
		if (snomedCtBodyStructuresEEnum == null) {
			snomedCtBodyStructuresEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(91);
		}
		return snomedCtBodyStructuresEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStructureMapModelMode() {
		if (structureMapModelModeEEnum == null) {
			structureMapModelModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(92);
		}
		return structureMapModelModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStructureMapInputMode() {
		if (structureMapInputModeEEnum == null) {
			structureMapInputModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(93);
		}
		return structureMapInputModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStructureMapContextType() {
		if (structureMapContextTypeEEnum == null) {
			structureMapContextTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(94);
		}
		return structureMapContextTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStructureMapListMode() {
		if (structureMapListModeEEnum == null) {
			structureMapListModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(95);
		}
		return structureMapListModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStructureMapTransform() {
		if (structureMapTransformEEnum == null) {
			structureMapTransformEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(96);
		}
		return structureMapTransformEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResearchStudyStatus() {
		if (researchStudyStatusEEnum == null) {
			researchStudyStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(97);
		}
		return researchStudyStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGroupType() {
		if (groupTypeEEnum == null) {
			groupTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(98);
		}
		return groupTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsentStatus() {
		if (consentStatusEEnum == null) {
			consentStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(99);
		}
		return consentStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsentCategoryCodes() {
		if (consentCategoryCodesEEnum == null) {
			consentCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(100);
		}
		return consentCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentTypeValueSet() {
		if (documentTypeValueSetEEnum == null) {
			documentTypeValueSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(101);
		}
		return documentTypeValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentClassValueSet() {
		if (documentClassValueSetEEnum == null) {
			documentClassValueSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(102);
		}
		return documentClassValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentReferenceStatus() {
		if (documentReferenceStatusEEnum == null) {
			documentReferenceStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(103);
		}
		return documentReferenceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompositionStatus() {
		if (compositionStatusEEnum == null) {
			compositionStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(104);
		}
		return compositionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentRelationshipType() {
		if (documentRelationshipTypeEEnum == null) {
			documentRelationshipTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(105);
		}
		return documentRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentReferenceFormatCodeSet() {
		if (documentReferenceFormatCodeSetEEnum == null) {
			documentReferenceFormatCodeSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(106);
		}
		return documentReferenceFormatCodeSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncounterStatus() {
		if (encounterStatusEEnum == null) {
			encounterStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(107);
		}
		return encounterStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActEncounterCode() {
		if (actEncounterCodeEEnum == null) {
			actEncounterCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(108);
		}
		return actEncounterCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncounterType() {
		if (encounterTypeEEnum == null) {
			encounterTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(109);
		}
		return encounterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV3CodeSystemActPriority() {
		if (v3CodeSystemActPriorityEEnum == null) {
			v3CodeSystemActPriorityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(110);
		}
		return v3CodeSystemActPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEpisodeOfCareStatus() {
		if (episodeOfCareStatusEEnum == null) {
			episodeOfCareStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(111);
		}
		return episodeOfCareStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionClinicalStatusCodes() {
		if (conditionClinicalStatusCodesEEnum == null) {
			conditionClinicalStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(112);
		}
		return conditionClinicalStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionVerificationStatus() {
		if (conditionVerificationStatusEEnum == null) {
			conditionVerificationStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(113);
		}
		return conditionVerificationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionCategoryCodes() {
		if (conditionCategoryCodesEEnum == null) {
			conditionCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(114);
		}
		return conditionCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionDiagnosisSeverity() {
		if (conditionDiagnosisSeverityEEnum == null) {
			conditionDiagnosisSeverityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(115);
		}
		return conditionDiagnosisSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionProblemDiagnosisCodes() {
		if (conditionProblemDiagnosisCodesEEnum == null) {
			conditionProblemDiagnosisCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(116);
		}
		return conditionProblemDiagnosisCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionStage() {
		if (conditionStageEEnum == null) {
			conditionStageEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(117);
		}
		return conditionStageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClinicalImpressionStatus() {
		if (clinicalImpressionStatusEEnum == null) {
			clinicalImpressionStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(118);
		}
		return clinicalImpressionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceClinicalStatus() {
		if (allergyIntoleranceClinicalStatusEEnum == null) {
			allergyIntoleranceClinicalStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(119);
		}
		return allergyIntoleranceClinicalStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceVerificationStatus() {
		if (allergyIntoleranceVerificationStatusEEnum == null) {
			allergyIntoleranceVerificationStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(120);
		}
		return allergyIntoleranceVerificationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceType() {
		if (allergyIntoleranceTypeEEnum == null) {
			allergyIntoleranceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(121);
		}
		return allergyIntoleranceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceCategory() {
		if (allergyIntoleranceCategoryEEnum == null) {
			allergyIntoleranceCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(122);
		}
		return allergyIntoleranceCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceCriticality() {
		if (allergyIntoleranceCriticalityEEnum == null) {
			allergyIntoleranceCriticalityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(123);
		}
		return allergyIntoleranceCriticalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceSubstanceProductConditionAndNegationCodes() {
		if (allergyIntoleranceSubstanceProductConditionAndNegationCodesEEnum == null) {
			allergyIntoleranceSubstanceProductConditionAndNegationCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(124);
		}
		return allergyIntoleranceSubstanceProductConditionAndNegationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceCertainty() {
		if (allergyIntoleranceCertaintyEEnum == null) {
			allergyIntoleranceCertaintyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(125);
		}
		return allergyIntoleranceCertaintyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtClinicalFindings() {
		if (snomedCtClinicalFindingsEEnum == null) {
			snomedCtClinicalFindingsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(126);
		}
		return snomedCtClinicalFindingsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtClinicalFindings() {
		if (snomedCtClinicalFindingsEEnum == null) {
			snomedCtClinicalFindingsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(234);
		}
		return snomedCtClinicalFindingsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceSeverity() {
		if (allergyIntoleranceSeverityEEnum == null) {
			allergyIntoleranceSeverityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(127);
		}
		return allergyIntoleranceSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvestigationType() {
		if (investigationTypeEEnum == null) {
			investigationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(128);
		}
		return investigationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationStatus() {
		if (observationStatusEEnum == null) {
			observationStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(129);
		}
		return observationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationCategoryCodes() {
		if (observationCategoryCodesEEnum == null) {
			observationCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(130);
		}
		return observationCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationValueAbsentReason() {
		if (observationValueAbsentReasonEEnum == null) {
			observationValueAbsentReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(131);
		}
		return observationValueAbsentReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationInterpretationCodes() {
		if (observationInterpretationCodesEEnum == null) {
			observationInterpretationCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(132);
		}
		return observationInterpretationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationMethods() {
		if (observationMethodsEEnum == null) {
			observationMethodsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(133);
		}
		return observationMethodsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecimenStatus() {
		if (specimenStatusEEnum == null) {
			specimenStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(134);
		}
		return specimenStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV2SpecimenType() {
		if (v2SpecimenTypeEEnum == null) {
			v2SpecimenTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(135);
		}
		return v2SpecimenTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequestStatus() {
		if (requestStatusEEnum == null) {
			requestStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(136);
		}
		return requestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequestIntent() {
		if (requestIntentEEnum == null) {
			requestIntentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(137);
		}
		return requestIntentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequestPriority() {
		if (requestPriorityEEnum == null) {
			requestPriorityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(138);
		}
		return requestPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLoincDiagnosticRequestCodes() {
		if (loincDiagnosticRequestCodesEEnum == null) {
			loincDiagnosticRequestCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(139);
		}
		return loincDiagnosticRequestCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipantRoles() {
		if (participantRolesEEnum == null) {
			participantRolesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(140);
		}
		return participantRolesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPurposeOfUse() {
		if (purposeOfUseEEnum == null) {
			purposeOfUseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(141);
		}
		return purposeOfUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProvenanceEventCurrentState() {
		if (provenanceEventCurrentStateEEnum == null) {
			provenanceEventCurrentStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(142);
		}
		return provenanceEventCurrentStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProvenanceParticipantRole() {
		if (provenanceParticipantRoleEEnum == null) {
			provenanceParticipantRoleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(143);
		}
		return provenanceParticipantRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV3CodeSystemRoleLinkType() {
		if (v3CodeSystemRoleLinkTypeEEnum == null) {
			v3CodeSystemRoleLinkTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(144);
		}
		return v3CodeSystemRoleLinkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProvenanceEntityRole() {
		if (provenanceEntityRoleEEnum == null) {
			provenanceEntityRoleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(145);
		}
		return provenanceEntityRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureCodessnomedCT() {
		if (procedureCodessnomedCTEEnum == null) {
			procedureCodessnomedCTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(146);
		}
		return procedureCodessnomedCTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureReasonCodes() {
		if (procedureReasonCodesEEnum == null) {
			procedureReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(147);
		}
		return procedureReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureRequestStatus() {
		if (procedureRequestStatusEEnum == null) {
			procedureRequestStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(148);
		}
		return procedureRequestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureRequestPriority() {
		if (procedureRequestPriorityEEnum == null) {
			procedureRequestPriorityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(149);
		}
		return procedureRequestPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecimenCollectionMethod() {
		if (specimenCollectionMethodEEnum == null) {
			specimenCollectionMethodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(150);
		}
		return specimenCollectionMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecimenTreatmentProcedure() {
		if (specimenTreatmentProcedureEEnum == null) {
			specimenTreatmentProcedureEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(151);
		}
		return specimenTreatmentProcedureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecimenContainer() {
		if (specimenContainerEEnum == null) {
			specimenContainerEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(152);
		}
		return specimenContainerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV2AdditivePreservative() {
		if (v2AdditivePreservativeEEnum == null) {
			v2AdditivePreservativeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(153);
		}
		return v2AdditivePreservativeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasmntPrinciple() {
		if (measmntPrincipleEEnum == null) {
			measmntPrincipleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(154);
		}
		return measmntPrincipleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricOperationalStatus() {
		if (deviceMetricOperationalStatusEEnum == null) {
			deviceMetricOperationalStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(155);
		}
		return deviceMetricOperationalStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricColor() {
		if (deviceMetricColorEEnum == null) {
			deviceMetricColorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(156);
		}
		return deviceMetricColorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricCategory() {
		if (deviceMetricCategoryEEnum == null) {
			deviceMetricCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(157);
		}
		return deviceMetricCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricCalibrationType() {
		if (deviceMetricCalibrationTypeEEnum == null) {
			deviceMetricCalibrationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(158);
		}
		return deviceMetricCalibrationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricCalibrationState() {
		if (deviceMetricCalibrationStateEEnum == null) {
			deviceMetricCalibrationStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(159);
		}
		return deviceMetricCalibrationStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationReferenceRangeMeaningCodes() {
		if (observationReferenceRangeMeaningCodesEEnum == null) {
			observationReferenceRangeMeaningCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(160);
		}
		return observationReferenceRangeMeaningCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationRelationshipType() {
		if (observationRelationshipTypeEEnum == null) {
			observationRelationshipTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(161);
		}
		return observationRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanStatus() {
		if (carePlanStatusEEnum == null) {
			carePlanStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(162);
		}
		return carePlanStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanCategory() {
		if (carePlanCategoryEEnum == null) {
			carePlanCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(163);
		}
		return carePlanCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionnaireStatus() {
		if (questionnaireStatusEEnum == null) {
			questionnaireStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(164);
		}
		return questionnaireStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContextOfUseValueSet() {
		if (contextOfUseValueSetEEnum == null) {
			contextOfUseValueSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(165);
		}
		return contextOfUseValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionnaireQuestionCodes() {
		if (questionnaireQuestionCodesEEnum == null) {
			questionnaireQuestionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(166);
		}
		return questionnaireQuestionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionnaireItemType() {
		if (questionnaireItemTypeEEnum == null) {
			questionnaireItemTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(167);
		}
		return questionnaireItemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionnaireAnswerCodes() {
		if (questionnaireAnswerCodesEEnum == null) {
			questionnaireAnswerCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(168);
		}
		return questionnaireAnswerCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanRelationship() {
		if (carePlanRelationshipEEnum == null) {
			carePlanRelationshipEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(169);
		}
		return carePlanRelationshipEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoalStatus() {
		if (goalStatusEEnum == null) {
			goalStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(170);
		}
		return goalStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoalCategory() {
		if (goalCategoryEEnum == null) {
			goalCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(171);
		}
		return goalCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoalPriority() {
		if (goalPriorityEEnum == null) {
			goalPriorityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(172);
		}
		return goalPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoalStartEvent() {
		if (goalStartEventEEnum == null) {
			goalStartEventEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(173);
		}
		return goalStartEventEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoalStatusReason() {
		if (goalStatusReasonEEnum == null) {
			goalStatusReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(174);
		}
		return goalStatusReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationStatementStatus() {
		if (medicationStatementStatusEEnum == null) {
			medicationStatementStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(175);
		}
		return medicationStatementStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationStatementNotTaken() {
		if (medicationStatementNotTakenEEnum == null) {
			medicationStatementNotTakenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(176);
		}
		return medicationStatementNotTakenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtDrugsNotTakencompletedCodes() {
		if (snomedCtDrugsNotTakencompletedCodesEEnum == null) {
			snomedCtDrugsNotTakencompletedCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(177);
		}
		return snomedCtDrugsNotTakencompletedCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationStatementCategory() {
		if (medicationStatementCategoryEEnum == null) {
			medicationStatementCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(178);
		}
		return medicationStatementCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNutritionOrderStatus() {
		if (nutritionOrderStatusEEnum == null) {
			nutritionOrderStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(179);
		}
		return nutritionOrderStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiet() {
		if (dietEEnum == null) {
			dietEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(180);
		}
		return dietEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFoodTypeCodes() {
		if (foodTypeCodesEEnum == null) {
			foodTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(181);
		}
		return foodTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDietCodes() {
		if (dietCodesEEnum == null) {
			dietCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(182);
		}
		return dietCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNutrientModifierCodes() {
		if (nutrientModifierCodesEEnum == null) {
			nutrientModifierCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(183);
		}
		return nutrientModifierCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextureModifierCodes() {
		if (textureModifierCodesEEnum == null) {
			textureModifierCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(184);
		}
		return textureModifierCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextureModifiedFoodTypeCodes() {
		if (textureModifiedFoodTypeCodesEEnum == null) {
			textureModifiedFoodTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(185);
		}
		return textureModifiedFoodTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFluidConsistencyTypeCodes() {
		if (fluidConsistencyTypeCodesEEnum == null) {
			fluidConsistencyTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(186);
		}
		return fluidConsistencyTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplementTypeCodes() {
		if (supplementTypeCodesEEnum == null) {
			supplementTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(187);
		}
		return supplementTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnteralFormulaTypeCodes() {
		if (enteralFormulaTypeCodesEEnum == null) {
			enteralFormulaTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(188);
		}
		return enteralFormulaTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnteralFormulaAdditiveTypeCode() {
		if (enteralFormulaAdditiveTypeCodeEEnum == null) {
			enteralFormulaAdditiveTypeCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(189);
		}
		return enteralFormulaAdditiveTypeCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnteralRouteCodes() {
		if (enteralRouteCodesEEnum == null) {
			enteralRouteCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(190);
		}
		return enteralRouteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRiskProbability() {
		if (riskProbabilityEEnum == null) {
			riskProbabilityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(191);
		}
		return riskProbabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAppointmentStatus() {
		if (appointmentStatusEEnum == null) {
			appointmentStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(192);
		}
		return appointmentStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV2AppointmentReasonCodes() {
		if (v2AppointmentReasonCodesEEnum == null) {
			v2AppointmentReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(193);
		}
		return v2AppointmentReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncounterReasonCodes() {
		if (encounterReasonCodesEEnum == null) {
			encounterReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(194);
		}
		return encounterReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSlotStatus() {
		if (slotStatusEEnum == null) {
			slotStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(195);
		}
		return slotStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipantType() {
		if (participantTypeEEnum == null) {
			participantTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(196);
		}
		return participantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipantRequired() {
		if (participantRequiredEEnum == null) {
			participantRequiredEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(197);
		}
		return participantRequiredEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipationStatus() {
		if (participationStatusEEnum == null) {
			participationStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(198);
		}
		return participationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV3CodeSystemParticipationMode() {
		if (v3CodeSystemParticipationModeEEnum == null) {
			v3CodeSystemParticipationModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(199);
		}
		return v3CodeSystemParticipationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationRequestStatus() {
		if (communicationRequestStatusEEnum == null) {
			communicationRequestStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(200);
		}
		return communicationRequestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV3CodeSystemActReason() {
		if (v3CodeSystemActReasonEEnum == null) {
			v3CodeSystemActReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(201);
		}
		return v3CodeSystemActReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequestStage() {
		if (requestStageEEnum == null) {
			requestStageEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(202);
		}
		return requestStageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationRequestStatus() {
		if (medicationRequestStatusEEnum == null) {
			medicationRequestStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(203);
		}
		return medicationRequestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationRequestStage() {
		if (medicationRequestStageEEnum == null) {
			medicationRequestStageEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(204);
		}
		return medicationRequestStageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationRequestCategory() {
		if (medicationRequestCategoryEEnum == null) {
			medicationRequestCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(205);
		}
		return medicationRequestCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubstanceAdminSubstitutionReason() {
		if (substanceAdminSubstitutionReasonEEnum == null) {
			substanceAdminSubstitutionReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(206);
		}
		return substanceAdminSubstitutionReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFinancialResourceStatusCodes() {
		if (financialResourceStatusCodesEEnum == null) {
			financialResourceStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(207);
		}
		return financialResourceStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionList() {
		if (actionListEEnum == null) {
			actionListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(208);
		}
		return actionListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleVisionPrescriptionProductCodes() {
		if (exampleVisionPrescriptionProductCodesEEnum == null) {
			exampleVisionPrescriptionProductCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(209);
		}
		return exampleVisionPrescriptionProductCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisionEyes() {
		if (visionEyesEEnum == null) {
			visionEyesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(210);
		}
		return visionEyesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisionBase() {
		if (visionBaseEEnum == null) {
			visionBaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(211);
		}
		return visionBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanActivityCategory() {
		if (carePlanActivityCategoryEEnum == null) {
			carePlanActivityCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(212);
		}
		return carePlanActivityCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanActivity() {
		if (carePlanActivityEEnum == null) {
			carePlanActivityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(213);
		}
		return carePlanActivityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActivityReason() {
		if (activityReasonEEnum == null) {
			activityReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(214);
		}
		return activityReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanActivityStatus() {
		if (carePlanActivityStatusEEnum == null) {
			carePlanActivityStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(215);
		}
		return carePlanActivityStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferralStatus() {
		if (referralStatusEEnum == null) {
			referralStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(216);
		}
		return referralStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferralCategory() {
		if (referralCategoryEEnum == null) {
			referralCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(217);
		}
		return referralCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureStatus() {
		if (procedureStatusEEnum == null) {
			procedureStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(218);
		}
		return procedureStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureCategoryCodessnomedCT() {
		if (procedureCategoryCodessnomedCTEEnum == null) {
			procedureCategoryCodessnomedCTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(219);
		}
		return procedureCategoryCodessnomedCTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedurePerformerRoleCodes() {
		if (procedurePerformerRoleCodesEEnum == null) {
			procedurePerformerRoleCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(220);
		}
		return procedurePerformerRoleCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureNotPerformedReasonsnomeDCT() {
		if (procedureNotPerformedReasonsnomeDCTEEnum == null) {
			procedureNotPerformedReasonsnomeDCTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(221);
		}
		return procedureNotPerformedReasonsnomeDCTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureOutcomeCodessnomedCT() {
		if (procedureOutcomeCodessnomedCTEEnum == null) {
			procedureOutcomeCodessnomedCTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(222);
		}
		return procedureOutcomeCodessnomedCTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagnosticReportStatus() {
		if (diagnosticReportStatusEEnum == null) {
			diagnosticReportStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(223);
		}
		return diagnosticReportStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagnosticServiceSectionCodes() {
		if (diagnosticServiceSectionCodesEEnum == null) {
			diagnosticServiceSectionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(224);
		}
		return diagnosticServiceSectionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLoincDiagnosticReportCodes() {
		if (loincDiagnosticReportCodesEEnum == null) {
			loincDiagnosticReportCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(225);
		}
		return loincDiagnosticReportCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstanceAvailability() {
		if (instanceAvailabilityEEnum == null) {
			instanceAvailabilityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(226);
		}
		return instanceAvailabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAcquisitionModalityCodes() {
		if (acquisitionModalityCodesEEnum == null) {
			acquisitionModalityCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(227);
		}
		return acquisitionModalityCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDWebType() {
		if (dWebTypeEEnum == null) {
			dWebTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(228);
		}
		return dWebTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLaterality() {
		if (lateralityEEnum == null) {
			lateralityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(229);
		}
		return lateralityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKoStitle() {
		if (koStitleEEnum == null) {
			koStitleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(230);
		}
		return koStitleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDigitalMediaType() {
		if (digitalMediaTypeEEnum == null) {
			digitalMediaTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(231);
		}
		return digitalMediaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMediaSubType() {
		if (mediaSubTypeEEnum == null) {
			mediaSubTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(232);
		}
		return mediaSubTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMediaCollectionViewProjection() {
		if (mediaCollectionViewProjectionEEnum == null) {
			mediaCollectionViewProjectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(233);
		}
		return mediaCollectionViewProjectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtClinicalFindings() {
		if (snomedCtClinicalFindingsEEnum == null) {
			snomedCtClinicalFindingsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(234);
		}
		return snomedCtClinicalFindingsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureFollowUpCodessnomedCT() {
		if (procedureFollowUpCodessnomedCTEEnum == null) {
			procedureFollowUpCodessnomedCTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(235);
		}
		return procedureFollowUpCodessnomedCTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureDeviceActionCodes() {
		if (procedureDeviceActionCodesEEnum == null) {
			procedureDeviceActionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(236);
		}
		return procedureDeviceActionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationAdministrationStatus() {
		if (medicationAdministrationStatusEEnum == null) {
			medicationAdministrationStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(237);
		}
		return medicationAdministrationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtReasonMedicationNotGivenCodes() {
		if (snomedCtReasonMedicationNotGivenCodesEEnum == null) {
			snomedCtReasonMedicationNotGivenCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(238);
		}
		return snomedCtReasonMedicationNotGivenCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReasonMedicationGivenCodes() {
		if (reasonMedicationGivenCodesEEnum == null) {
			reasonMedicationGivenCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(239);
		}
		return reasonMedicationGivenCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionnaireResponseStatus() {
		if (questionnaireResponseStatusEEnum == null) {
			questionnaireResponseStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(240);
		}
		return questionnaireResponseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSequenceType() {
		if (sequenceTypeEEnum == null) {
			sequenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(241);
		}
		return sequenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChromosomehuman() {
		if (chromosomehumanEEnum == null) {
			chromosomehumanEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(242);
		}
		return chromosomehumanEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnsembl() {
		if (ensemblEEnum == null) {
			ensemblEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(243);
		}
		return ensemblEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQualityType() {
		if (qualityTypeEEnum == null) {
			qualityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(244);
		}
		return qualityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRepositoryType() {
		if (repositoryTypeEEnum == null) {
			repositoryTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(245);
		}
		return repositoryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFamilyHistoryStatus() {
		if (familyHistoryStatusEEnum == null) {
			familyHistoryStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(246);
		}
		return familyHistoryStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFamilyMember() {
		if (familyMemberEEnum == null) {
			familyMemberEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(247);
		}
		return familyMemberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionOutcomeCodes() {
		if (conditionOutcomeCodesEEnum == null) {
			conditionOutcomeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(248);
		}
		return conditionOutcomeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClinicalImpressionPrognosis() {
		if (clinicalImpressionPrognosisEEnum == null) {
			clinicalImpressionPrognosisEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(249);
		}
		return clinicalImpressionPrognosisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getManifestationAndSymptomCodes() {
		if (manifestationAndSymptomCodesEEnum == null) {
			manifestationAndSymptomCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(250);
		}
		return manifestationAndSymptomCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccountStatus() {
		if (accountStatusEEnum == null) {
			accountStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(251);
		}
		return accountStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCoverageTypeCodes() {
		if (coverageTypeCodesEEnum == null) {
			coverageTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(252);
		}
		return coverageTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPolicyholderRelationshipCodes() {
		if (policyholderRelationshipCodesEEnum == null) {
			policyholderRelationshipCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(253);
		}
		return policyholderRelationshipCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractTypeCodes() {
		if (contractTypeCodesEEnum == null) {
			contractTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(254);
		}
		return contractTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractSubtypeCodes() {
		if (contractSubtypeCodesEEnum == null) {
			contractSubtypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(255);
		}
		return contractSubtypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractActionCodes() {
		if (contractActionCodesEEnum == null) {
			contractActionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(256);
		}
		return contractActionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractActorRoleCodes() {
		if (contractActorRoleCodesEEnum == null) {
			contractActorRoleCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(257);
		}
		return contractActorRoleCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractSignerTypeCodes() {
		if (contractSignerTypeCodesEEnum == null) {
			contractSignerTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(258);
		}
		return contractSignerTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractTermTypeCodes() {
		if (contractTermTypeCodesEEnum == null) {
			contractTermTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(259);
		}
		return contractTermTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractTermTypeCodes() {
		if (contractTermTypeCodesEEnum == null) {
			contractTermTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(260);
		}
		return contractTermTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractTermTypeCodes() {
		if (contractTermTypeCodesEEnum == null) {
			contractTermTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(260);
		}
		return contractTermTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFhirDocumentTypeCodes() {
		if (fhirDocumentTypeCodesEEnum == null) {
			fhirDocumentTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(261);
		}
		return fhirDocumentTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFhirDocumentClassCodes() {
		if (fhirDocumentClassCodesEEnum == null) {
			fhirDocumentClassCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(262);
		}
		return fhirDocumentClassCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConfidentialityClassification() {
		if (confidentialityClassificationEEnum == null) {
			confidentialityClassificationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(263);
		}
		return confidentialityClassificationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompositionAttestationMode() {
		if (compositionAttestationModeEEnum == null) {
			compositionAttestationModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(264);
		}
		return compositionAttestationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV3CodeSystemActCode() {
		if (v3CodeSystemActCodeEEnum == null) {
			v3CodeSystemActCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(265);
		}
		return v3CodeSystemActCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentSectionCodes() {
		if (documentSectionCodesEEnum == null) {
			documentSectionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(266);
		}
		return documentSectionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListMode() {
		if (listModeEEnum == null) {
			listModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(267);
		}
		return listModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListOrderCodes() {
		if (listOrderCodesEEnum == null) {
			listOrderCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(268);
		}
		return listOrderCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListEmptyReasons() {
		if (listEmptyReasonsEEnum == null) {
			listEmptyReasonsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(269);
		}
		return listEmptyReasonsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdmitSource() {
		if (admitSourceEEnum == null) {
			admitSourceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(270);
		}
		return admitSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV2ReAdmissionIndicator() {
		if (v2ReAdmissionIndicatorEEnum == null) {
			v2ReAdmissionIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(271);
		}
		return v2ReAdmissionIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecialCourtesy() {
		if (specialCourtesyEEnum == null) {
			specialCourtesyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(272);
		}
		return specialCourtesyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecialArrangements() {
		if (specialArrangementsEEnum == null) {
			specialArrangementsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(273);
		}
		return specialArrangementsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDischargeDisposition() {
		if (dischargeDispositionEEnum == null) {
			dischargeDispositionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(274);
		}
		return dischargeDispositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncounterLocationStatus() {
		if (encounterLocationStatusEEnum == null) {
			encounterLocationStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(275);
		}
		return encounterLocationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFacilityTypeCodeValueSet() {
		if (facilityTypeCodeValueSetEEnum == null) {
			facilityTypeCodeValueSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(276);
		}
		return facilityTypeCodeValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsentExceptType() {
		if (consentExceptTypeEEnum == null) {
			consentExceptTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(277);
		}
		return consentExceptTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsentActorRoles() {
		if (consentActorRolesEEnum == null) {
			consentActorRolesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(278);
		}
		return consentActorRolesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsentActionCodes() {
		if (consentActionCodesEEnum == null) {
			consentActionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(279);
		}
		return consentActionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsentContentClass() {
		if (consentContentClassEEnum == null) {
			consentContentClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(280);
		}
		return consentContentClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsentContentCodes() {
		if (consentContentCodesEEnum == null) {
			consentContentCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(281);
		}
		return consentContentCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsentDataMeaning() {
		if (consentDataMeaningEEnum == null) {
			consentDataMeaningEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(282);
		}
		return consentDataMeaningEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationStatus() {
		if (communicationStatusEEnum == null) {
			communicationStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(283);
		}
		return communicationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNamingSystemType() {
		if (namingSystemTypeEEnum == null) {
			namingSystemTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(284);
		}
		return namingSystemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNamingSystemIdentifierType() {
		if (namingSystemIdentifierTypeEEnum == null) {
			namingSystemIdentifierTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(285);
		}
		return namingSystemIdentifierTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConceptMapEquivalence() {
		if (conceptMapEquivalenceEEnum == null) {
			conceptMapEquivalenceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(286);
		}
		return conceptMapEquivalenceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIdentityAssuranceLevel() {
		if (identityAssuranceLevelEEnum == null) {
			identityAssuranceLevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(287);
		}
		return identityAssuranceLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlagCategory() {
		if (flagCategoryEEnum == null) {
			flagCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(288);
		}
		return flagCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlagStatus() {
		if (flagStatusEEnum == null) {
			flagStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(289);
		}
		return flagStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlagCode() {
		if (flagCodeEEnum == null) {
			flagCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(290);
		}
		return flagCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodeSystemHierarchyMeaning() {
		if (codeSystemHierarchyMeaningEEnum == null) {
			codeSystemHierarchyMeaningEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(291);
		}
		return codeSystemHierarchyMeaningEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodeSystemContentMode() {
		if (codeSystemContentModeEEnum == null) {
			codeSystemContentModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(292);
		}
		return codeSystemContentModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyType() {
		if (propertyTypeEEnum == null) {
			propertyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(293);
		}
		return propertyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClaimProcessingCodes() {
		if (claimProcessingCodesEEnum == null) {
			claimProcessingCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(294);
		}
		return claimProcessingCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaymentTypeCodes() {
		if (paymentTypeCodesEEnum == null) {
			paymentTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(295);
		}
		return paymentTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormCodes() {
		if (formCodesEEnum == null) {
			formCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(296);
		}
		return formCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNoteType() {
		if (noteTypeEEnum == null) {
			noteTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(297);
		}
		return noteTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestScriptProfileOriginType() {
		if (testScriptProfileOriginTypeEEnum == null) {
			testScriptProfileOriginTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(298);
		}
		return testScriptProfileOriginTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestScriptProfileDestinationType() {
		if (testScriptProfileDestinationTypeEEnum == null) {
			testScriptProfileDestinationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(299);
		}
		return testScriptProfileDestinationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCapabilityStatementKind() {
		if (capabilityStatementKindEEnum == null) {
			capabilityStatementKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(300);
		}
		return capabilityStatementKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnknownContentCode() {
		if (unknownContentCodeEEnum == null) {
			unknownContentCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(301);
		}
		return unknownContentCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestfulCapabilityMode() {
		if (restfulCapabilityModeEEnum == null) {
			restfulCapabilityModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(302);
		}
		return restfulCapabilityModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestfulSecurityService() {
		if (restfulSecurityServiceEEnum == null) {
			restfulSecurityServiceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(303);
		}
		return restfulSecurityServiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeRestfulInteraction() {
		if (typeRestfulInteractionEEnum == null) {
			typeRestfulInteractionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(304);
		}
		return typeRestfulInteractionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceVersionPolicy() {
		if (resourceVersionPolicyEEnum == null) {
			resourceVersionPolicyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(305);
		}
		return resourceVersionPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionalReadStatus() {
		if (conditionalReadStatusEEnum == null) {
			conditionalReadStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(306);
		}
		return conditionalReadStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionalDeleteStatus() {
		if (conditionalDeleteStatusEEnum == null) {
			conditionalDeleteStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(307);
		}
		return conditionalDeleteStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceHandlingPolicy() {
		if (referenceHandlingPolicyEEnum == null) {
			referenceHandlingPolicyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(308);
		}
		return referenceHandlingPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSearchParamType() {
		if (searchParamTypeEEnum == null) {
			searchParamTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(309);
		}
		return searchParamTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemRestfulInteraction() {
		if (systemRestfulInteractionEEnum == null) {
			systemRestfulInteractionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(310);
		}
		return systemRestfulInteractionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationKind() {
		if (operationKindEEnum == null) {
			operationKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(311);
		}
		return operationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageTransport() {
		if (messageTransportEEnum == null) {
			messageTransportEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(312);
		}
		return messageTransportEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageEvent() {
		if (messageEventEEnum == null) {
			messageEventEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(313);
		}
		return messageEventEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageSignificanceCategory() {
		if (messageSignificanceCategoryEEnum == null) {
			messageSignificanceCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(314);
		}
		return messageSignificanceCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventCapabilityMode() {
		if (eventCapabilityModeEEnum == null) {
			eventCapabilityModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(315);
		}
		return eventCapabilityModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentMode() {
		if (documentModeEEnum == null) {
			documentModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(316);
		}
		return documentModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestScriptOperationCode() {
		if (testScriptOperationCodeEEnum == null) {
			testScriptOperationCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(317);
		}
		return testScriptOperationCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContentType() {
		if (contentTypeEEnum == null) {
			contentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(318);
		}
		return contentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssertionDirectionType() {
		if (assertionDirectionTypeEEnum == null) {
			assertionDirectionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(319);
		}
		return assertionDirectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssertionOperatorType() {
		if (assertionOperatorTypeEEnum == null) {
			assertionOperatorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(320);
		}
		return assertionOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssertionResponseTypes() {
		if (assertionResponseTypesEEnum == null) {
			assertionResponseTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(321);
		}
		return assertionResponseTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataElementStringency() {
		if (dataElementStringencyEEnum == null) {
			dataElementStringencyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(322);
		}
		return dataElementStringencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResponseType() {
		if (responseTypeEEnum == null) {
			responseTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(323);
		}
		return responseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIssueSeverity() {
		if (issueSeverityEEnum == null) {
			issueSeverityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(324);
		}
		return issueSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIssueType() {
		if (issueTypeEEnum == null) {
			issueTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(325);
		}
		return issueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationOutcomeCodes() {
		if (operationOutcomeCodesEEnum == null) {
			operationOutcomeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(326);
		}
		return operationOutcomeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleMessageReasonCodes() {
		if (exampleMessageReasonCodesEEnum == null) {
			exampleMessageReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(327);
		}
		return exampleMessageReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubscriptionStatus() {
		if (subscriptionStatusEEnum == null) {
			subscriptionStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(328);
		}
		return subscriptionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubscriptionChannelType() {
		if (subscriptionChannelTypeEEnum == null) {
			subscriptionChannelTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(329);
		}
		return subscriptionChannelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubscriptionTag() {
		if (subscriptionTagEEnum == null) {
			subscriptionTagEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(330);
		}
		return subscriptionTagEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBodysiteLocationModifier() {
		if (bodysiteLocationModifierEEnum == null) {
			bodysiteLocationModifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(331);
		}
		return bodysiteLocationModifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVaccineAdministeredValueSet() {
		if (vaccineAdministeredValueSetEEnum == null) {
			vaccineAdministeredValueSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(332);
		}
		return vaccineAdministeredValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImmunizationRecommendationStatusCodes() {
		if (immunizationRecommendationStatusCodesEEnum == null) {
			immunizationRecommendationStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(333);
		}
		return immunizationRecommendationStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImmunizationRecommendationDateCriterionCodes() {
		if (immunizationRecommendationDateCriterionCodesEEnum == null) {
			immunizationRecommendationDateCriterionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(334);
		}
		return immunizationRecommendationDateCriterionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImmunizationStatusCodes() {
		if (immunizationStatusCodesEEnum == null) {
			immunizationStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(335);
		}
		return immunizationStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImmunizationOrigin() {
		if (immunizationOriginEEnum == null) {
			immunizationOriginEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(336);
		}
		return immunizationOriginEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodesForImmunizationSiteOfAdministration() {
		if (codesForImmunizationSiteOfAdministrationEEnum == null) {
			codesForImmunizationSiteOfAdministrationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(337);
		}
		return codesForImmunizationSiteOfAdministrationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImmunizationRouteCodes() {
		if (immunizationRouteCodesEEnum == null) {
			immunizationRouteCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(338);
		}
		return immunizationRouteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImmunizationReasonCodes() {
		if (immunizationReasonCodesEEnum == null) {
			immunizationReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(339);
		}
		return immunizationReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImmunizationReasonsForNotImmunizingCodes() {
		if (immunizationReasonsForNotImmunizingCodesEEnum == null) {
			immunizationReasonsForNotImmunizingCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(340);
		}
		return immunizationReasonsForNotImmunizingCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVaccinationProtocolDoseTargetCodes() {
		if (vaccinationProtocolDoseTargetCodesEEnum == null) {
			vaccinationProtocolDoseTargetCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(341);
		}
		return vaccinationProtocolDoseTargetCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVaccinationProtocolDoseStatusCodes() {
		if (vaccinationProtocolDoseStatusCodesEEnum == null) {
			vaccinationProtocolDoseStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(342);
		}
		return vaccinationProtocolDoseStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVaccinationProtocolDoseStatusReasonCodes() {
		if (vaccinationProtocolDoseStatusReasonCodesEEnum == null) {
			vaccinationProtocolDoseStatusReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(343);
		}
		return vaccinationProtocolDoseStatusReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBundleType() {
		if (bundleTypeEEnum == null) {
			bundleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(344);
		}
		return bundleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSearchEntryMode() {
		if (searchEntryModeEEnum == null) {
			searchEntryModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(345);
		}
		return searchEntryModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpVerb() {
		if (httpVerbEEnum == null) {
			httpVerbEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(346);
		}
		return httpVerbEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestReportStatus() {
		if (testReportStatusEEnum == null) {
			testReportStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(347);
		}
		return testReportStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestReportParticipantType() {
		if (testReportParticipantTypeEEnum == null) {
			testReportParticipantTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(348);
		}
		return testReportParticipantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestReportResultCodes() {
		if (testReportResultCodesEEnum == null) {
			testReportResultCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(349);
		}
		return testReportResultCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorityCodes() {
		if (priorityCodesEEnum == null) {
			priorityCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(350);
		}
		return priorityCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBenefitCategoryCodes() {
		if (benefitCategoryCodesEEnum == null) {
			benefitCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(351);
		}
		return benefitCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBenefitSubCategoryCodes() {
		if (benefitSubCategoryCodesEEnum == null) {
			benefitSubCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(352);
		}
		return benefitSubCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNetworkTypeCodes() {
		if (networkTypeCodesEEnum == null) {
			networkTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(353);
		}
		return networkTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitTypeCodes() {
		if (unitTypeCodesEEnum == null) {
			unitTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(354);
		}
		return unitTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBenefitTermCodes() {
		if (benefitTermCodesEEnum == null) {
			benefitTermCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(355);
		}
		return benefitTermCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBenefitTypeCodes() {
		if (benefitTypeCodesEEnum == null) {
			benefitTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(356);
		}
		return benefitTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdjudicationErrorCodes() {
		if (adjudicationErrorCodesEEnum == null) {
			adjudicationErrorCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(357);
		}
		return adjudicationErrorCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationDispenseStatus() {
		if (medicationDispenseStatusEEnum == null) {
			medicationDispenseStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(358);
		}
		return medicationDispenseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActPharmacySupplyType() {
		if (actPharmacySupplyTypeEEnum == null) {
			actPharmacySupplyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(359);
		}
		return actPharmacySupplyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActSubstanceAdminSubstitutionCode() {
		if (actSubstanceAdminSubstitutionCodeEEnum == null) {
			actSubstanceAdminSubstitutionCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(360);
		}
		return actSubstanceAdminSubstitutionCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasureScoring() {
		if (measureScoringEEnum == null) {
			measureScoringEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(361);
		}
		return measureScoringEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompositeMeasureScoring() {
		if (compositeMeasureScoringEEnum == null) {
			compositeMeasureScoringEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(362);
		}
		return compositeMeasureScoringEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasureType() {
		if (measureTypeEEnum == null) {
			measureTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(363);
		}
		return measureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasurePopulationType() {
		if (measurePopulationTypeEEnum == null) {
			measurePopulationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(364);
		}
		return measurePopulationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasureDataUsage() {
		if (measureDataUsageEEnum == null) {
			measureDataUsageEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(365);
		}
		return measureDataUsageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasureReportType() {
		if (measureReportTypeEEnum == null) {
			measureReportTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(366);
		}
		return measureReportTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasureReportStatus() {
		if (measureReportStatusEEnum == null) {
			measureReportStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(367);
		}
		return measureReportStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListStatus() {
		if (listStatusEEnum == null) {
			listStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(368);
		}
		return listStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleUseCodesForList() {
		if (exampleUseCodesForListEEnum == null) {
			exampleUseCodesForListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(369);
		}
		return exampleUseCodesForListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatientMedicineChangeTypes() {
		if (patientMedicineChangeTypesEEnum == null) {
			patientMedicineChangeTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(370);
		}
		return patientMedicineChangeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleClaimTypeCodes() {
		if (exampleClaimTypeCodesEEnum == null) {
			exampleClaimTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(371);
		}
		return exampleClaimTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleClaimSubTypeCodes() {
		if (exampleClaimSubTypeCodesEEnum == null) {
			exampleClaimSubTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(372);
		}
		return exampleClaimSubTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUse() {
		if (useEEnum == null) {
			useEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(373);
		}
		return useEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFundsReservationCodes() {
		if (fundsReservationCodesEEnum == null) {
			fundsReservationCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(374);
		}
		return fundsReservationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleRelatedClaimRelationshipCodes() {
		if (exampleRelatedClaimRelationshipCodesEEnum == null) {
			exampleRelatedClaimRelationshipCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(375);
		}
		return exampleRelatedClaimRelationshipCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPayeeTypeCodes() {
		if (payeeTypeCodesEEnum == null) {
			payeeTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(376);
		}
		return payeeTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPayeeResourceType() {
		if (payeeResourceTypeEEnum == null) {
			payeeResourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(377);
		}
		return payeeResourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPayeeResourceType() {
		if (payeeResourceTypeEEnum == null) {
			payeeResourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(403);
		}
		return payeeResourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClaimCareTeamRoleCodes() {
		if (claimCareTeamRoleCodesEEnum == null) {
			claimCareTeamRoleCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(378);
		}
		return claimCareTeamRoleCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleProviderQualificationCodes() {
		if (exampleProviderQualificationCodesEEnum == null) {
			exampleProviderQualificationCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(379);
		}
		return exampleProviderQualificationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClaimInformationCategoryCodes() {
		if (claimInformationCategoryCodesEEnum == null) {
			claimInformationCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(380);
		}
		return claimInformationCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExceptionCodes() {
		if (exceptionCodesEEnum == null) {
			exceptionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(381);
		}
		return exceptionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMissingToothReasonCodes() {
		if (missingToothReasonCodesEEnum == null) {
			missingToothReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(382);
		}
		return missingToothReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIcD10Codes() {
		if (icD10CodesEEnum == null) {
			icD10CodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(383);
		}
		return icD10CodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleDiagnosisTypeCodes() {
		if (exampleDiagnosisTypeCodesEEnum == null) {
			exampleDiagnosisTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(384);
		}
		return exampleDiagnosisTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleDiagnosisRelatedGroupCodes() {
		if (exampleDiagnosisRelatedGroupCodesEEnum == null) {
			exampleDiagnosisRelatedGroupCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(385);
		}
		return exampleDiagnosisRelatedGroupCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIcD10ProcedureCodes() {
		if (icD10ProcedureCodesEEnum == null) {
			icD10ProcedureCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(386);
		}
		return icD10ProcedureCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActIncidentCode() {
		if (actIncidentCodeEEnum == null) {
			actIncidentCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(387);
		}
		return actIncidentCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleRevenueCenterCodes() {
		if (exampleRevenueCenterCodesEEnum == null) {
			exampleRevenueCenterCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(388);
		}
		return exampleRevenueCenterCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUsclsCodes() {
		if (usclsCodesEEnum == null) {
			usclsCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(389);
		}
		return usclsCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModifierTypeCodes() {
		if (modifierTypeCodesEEnum == null) {
			modifierTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(390);
		}
		return modifierTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleProgramReasonCodes() {
		if (exampleProgramReasonCodesEEnum == null) {
			exampleProgramReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(391);
		}
		return exampleProgramReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleServicePlaceCodes() {
		if (exampleServicePlaceCodesEEnum == null) {
			exampleServicePlaceCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(392);
		}
		return exampleServicePlaceCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOralSiteCodes() {
		if (oralSiteCodesEEnum == null) {
			oralSiteCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(393);
		}
		return oralSiteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSurfaceCodes() {
		if (surfaceCodesEEnum == null) {
			surfaceCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(394);
		}
		return surfaceCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOralProsthoMaterialTypeCodes() {
		if (oralProsthoMaterialTypeCodesEEnum == null) {
			oralProsthoMaterialTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(395);
		}
		return oralProsthoMaterialTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdjudicationCodes() {
		if (adjudicationCodesEEnum == null) {
			adjudicationCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(396);
		}
		return adjudicationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdjudicationReasonCodes() {
		if (adjudicationReasonCodesEEnum == null) {
			adjudicationReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(397);
		}
		return adjudicationReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExamplePaymentTypeCodes() {
		if (examplePaymentTypeCodesEEnum == null) {
			examplePaymentTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(398);
		}
		return examplePaymentTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaymentAdjustmentReasonCodes() {
		if (paymentAdjustmentReasonCodesEEnum == null) {
			paymentAdjustmentReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(399);
		}
		return paymentAdjustmentReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskStatus() {
		if (taskStatusEEnum == null) {
			taskStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(400);
		}
		return taskStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskPerformerType() {
		if (taskPerformerTypeEEnum == null) {
			taskPerformerTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(401);
		}
		return taskPerformerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExplanationOfBenefitStatus() {
		if (explanationOfBenefitStatusEEnum == null) {
			explanationOfBenefitStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(402);
		}
		return explanationOfBenefitStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPayeeResourceType() {
		if (payeeResourceTypeEEnum == null) {
			payeeResourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(403);
		}
		return payeeResourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActInvoiceGroupCode() {
		if (actInvoiceGroupCodeEEnum == null) {
			actInvoiceGroupCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(404);
		}
		return actInvoiceGroupCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuideDependencyType() {
		if (guideDependencyTypeEEnum == null) {
			guideDependencyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(405);
		}
		return guideDependencyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuidePageKind() {
		if (guidePageKindEEnum == null) {
			guidePageKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(406);
		}
		return guidePageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXPathUsageType() {
		if (xPathUsageTypeEEnum == null) {
			xPathUsageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(407);
		}
		return xPathUsageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSearchComparator() {
		if (searchComparatorEEnum == null) {
			searchComparatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(408);
		}
		return searchComparatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSearchModifierCode() {
		if (searchModifierCodeEEnum == null) {
			searchModifierCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(409);
		}
		return searchModifierCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemVersionProcessingMode() {
		if (systemVersionProcessingModeEEnum == null) {
			systemVersionProcessingModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(410);
		}
		return systemVersionProcessingModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompartmentType() {
		if (compartmentTypeEEnum == null) {
			compartmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(411);
		}
		return compartmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessOutcomeCodes() {
		if (processOutcomeCodesEEnum == null) {
			processOutcomeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(412);
		}
		return processOutcomeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaymentStatusCodes() {
		if (paymentStatusCodesEEnum == null) {
			paymentStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(413);
		}
		return paymentStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkageType() {
		if (linkageTypeEEnum == null) {
			linkageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(414);
		}
		return linkageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyRequestStatus() {
		if (supplyRequestStatusEEnum == null) {
			supplyRequestStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(415);
		}
		return supplyRequestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyType() {
		if (supplyTypeEEnum == null) {
			supplyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(416);
		}
		return supplyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtSupplyItem() {
		if (snomedCtSupplyItemEEnum == null) {
			snomedCtSupplyItemEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(417);
		}
		return snomedCtSupplyItemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyRequestReason() {
		if (supplyRequestReasonEEnum == null) {
			supplyRequestReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(418);
		}
		return supplyRequestReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyRequestWhen() {
		if (supplyRequestWhenEEnum == null) {
			supplyRequestWhenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(419);
		}
		return supplyRequestWhenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuidanceResponseStatus() {
		if (guidanceResponseStatusEEnum == null) {
			guidanceResponseStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(420);
		}
		return guidanceResponseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDetectedIssueCategory() {
		if (detectedIssueCategoryEEnum == null) {
			detectedIssueCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(421);
		}
		return detectedIssueCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDetectedIssueSeverity() {
		if (detectedIssueSeverityEEnum == null) {
			detectedIssueSeverityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(422);
		}
		return detectedIssueSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDetectedIssueMitigationAction() {
		if (detectedIssueMitigationActionEEnum == null) {
			detectedIssueMitigationActionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(423);
		}
		return detectedIssueMitigationActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventId() {
		if (auditEventIdEEnum == null) {
			auditEventIdEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(424);
		}
		return auditEventIdEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventSubType() {
		if (auditEventSubTypeEEnum == null) {
			auditEventSubTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(425);
		}
		return auditEventSubTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventAction() {
		if (auditEventActionEEnum == null) {
			auditEventActionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(426);
		}
		return auditEventActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventOutcome() {
		if (auditEventOutcomeEEnum == null) {
			auditEventOutcomeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(427);
		}
		return auditEventOutcomeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditAgentRoleIdCode() {
		if (auditAgentRoleIdCodeEEnum == null) {
			auditAgentRoleIdCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(428);
		}
		return auditAgentRoleIdCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMediaTypeCode() {
		if (mediaTypeCodeEEnum == null) {
			mediaTypeCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(429);
		}
		return mediaTypeCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventAgentNetworkType() {
		if (auditEventAgentNetworkTypeEEnum == null) {
			auditEventAgentNetworkTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(430);
		}
		return auditEventAgentNetworkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventSourceType() {
		if (auditEventSourceTypeEEnum == null) {
			auditEventSourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(431);
		}
		return auditEventSourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventEntityType() {
		if (auditEventEntityTypeEEnum == null) {
			auditEventEntityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(432);
		}
		return auditEventEntityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventEntityRole() {
		if (auditEventEntityRoleEEnum == null) {
			auditEventEntityRoleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(433);
		}
		return auditEventEntityRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventEntityLifecycle() {
		if (auditEventEntityLifecycleEEnum == null) {
			auditEventEntityLifecycleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(434);
		}
		return auditEventEntityLifecycleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasicResourceTypes() {
		if (basicResourceTypesEEnum == null) {
			basicResourceTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(435);
		}
		return basicResourceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyDeliveryStatus() {
		if (supplyDeliveryStatusEEnum == null) {
			supplyDeliveryStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(436);
		}
		return supplyDeliveryStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyItemType() {
		if (supplyItemTypeEEnum == null) {
			supplyItemTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(437);
		}
		return supplyItemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetsFactory getValueSetsFactory() {
		return (ValueSetsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.eclipse.mdht.uml.fhir.core.valueSets." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ValueSetsPackageImpl
