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
package org.hl7.fhir.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.hl7.fhir.Account;
import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.ActionDefinition;
import org.hl7.fhir.ActionDefinitionBehavior;
import org.hl7.fhir.ActionDefinitionCustomization;
import org.hl7.fhir.ActionDefinitionRelatedAction;
import org.hl7.fhir.ActionList;
import org.hl7.fhir.ActionRelationshipAnchor;
import org.hl7.fhir.ActionRelationshipType;
import org.hl7.fhir.ActionType;
import org.hl7.fhir.ActivityDefinitionCategory;
import org.hl7.fhir.Address;
import org.hl7.fhir.AddressType;
import org.hl7.fhir.AddressUse;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.Age;
import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.AllergyIntoleranceCertainty;
import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.AllergyIntoleranceStatus;
import org.hl7.fhir.AllergyIntoleranceType;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.AuditEventAgent;
import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.AuditEventEntity;
import org.hl7.fhir.AuditEventNetwork;
import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.AuditEventParticipantNetworkType;
import org.hl7.fhir.AuditEventSource;
import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Basic;
import org.hl7.fhir.Binary;
import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.BodySite;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.BundleLink;
import org.hl7.fhir.BundleRequest;
import org.hl7.fhir.BundleResponse;
import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.CarePlan;
import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CarePlanActivityStatus;
import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.CarePlanRelatedPlan;
import org.hl7.fhir.CarePlanRelationship;
import org.hl7.fhir.CarePlanStatus;
import org.hl7.fhir.CareTeam;
import org.hl7.fhir.CareTeamParticipant;
import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimCoverage;
import org.hl7.fhir.ClaimDetail;
import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.ClaimMissingTeeth;
import org.hl7.fhir.ClaimOnset;
import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.ClaimProcedure;
import org.hl7.fhir.ClaimProsthesis;
import org.hl7.fhir.ClaimRelated;
import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.ClaimResponseAdjudication1;
import org.hl7.fhir.ClaimResponseAdjudication2;
import org.hl7.fhir.ClaimResponseAdjudication3;
import org.hl7.fhir.ClaimResponseAdjudication4;
import org.hl7.fhir.ClaimResponseCoverage;
import org.hl7.fhir.ClaimResponseDetail;
import org.hl7.fhir.ClaimResponseDetail1;
import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.ClaimResponseNote;
import org.hl7.fhir.ClaimResponseSubDetail;
import org.hl7.fhir.ClaimSubDetail;
import org.hl7.fhir.ClaimType;
import org.hl7.fhir.ClaimType2;
import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.ClinicalImpressionInvestigations;
import org.hl7.fhir.ClinicalImpressionRuledOut;
import org.hl7.fhir.ClinicalImpressionStatus;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeSystem;
import org.hl7.fhir.CodeSystemConcept;
import org.hl7.fhir.CodeSystemContact;
import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.CodeSystemDesignation;
import org.hl7.fhir.CodeSystemFilter;
import org.hl7.fhir.CodeSystemProperty;
import org.hl7.fhir.CodeSystemProperty1;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.CommunicationRequestStatus;
import org.hl7.fhir.CommunicationStatus;
import org.hl7.fhir.CompartmentDefinition;
import org.hl7.fhir.CompartmentDefinitionContact;
import org.hl7.fhir.CompartmentDefinitionResource;
import org.hl7.fhir.CompartmentType;
import org.hl7.fhir.Composition;
import org.hl7.fhir.CompositionAttestationMode;
import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.CompositionEvent;
import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.ConceptMapContact;
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionEvidence;
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.ConditionVerificationStatus;
import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.Conformance;
import org.hl7.fhir.ConformanceCertificate;
import org.hl7.fhir.ConformanceContact;
import org.hl7.fhir.ConformanceDocument;
import org.hl7.fhir.ConformanceEndpoint;
import org.hl7.fhir.ConformanceEvent;
import org.hl7.fhir.ConformanceEventMode;
import org.hl7.fhir.ConformanceImplementation;
import org.hl7.fhir.ConformanceInteraction;
import org.hl7.fhir.ConformanceInteraction1;
import org.hl7.fhir.ConformanceMessaging;
import org.hl7.fhir.ConformanceOperation;
import org.hl7.fhir.ConformanceResource;
import org.hl7.fhir.ConformanceResourceStatus;
import org.hl7.fhir.ConformanceRest;
import org.hl7.fhir.ConformanceSearchParam;
import org.hl7.fhir.ConformanceSecurity;
import org.hl7.fhir.ConformanceSoftware;
import org.hl7.fhir.ConformanceStatementKind;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentAgent;
import org.hl7.fhir.ConsentAgent1;
import org.hl7.fhir.ConsentExcept;
import org.hl7.fhir.ConsentFriendly;
import org.hl7.fhir.ConsentLegal;
import org.hl7.fhir.ConsentStatus;
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.ContentType;
import org.hl7.fhir.Contract;
import org.hl7.fhir.ContractAgent;
import org.hl7.fhir.ContractAgent1;
import org.hl7.fhir.ContractFriendly;
import org.hl7.fhir.ContractLegal;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.ContractValuedItem1;
import org.hl7.fhir.Count;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.DWebType;
import org.hl7.fhir.DataElement;
import org.hl7.fhir.DataElementContact;
import org.hl7.fhir.DataElementMapping;
import org.hl7.fhir.DataElementStringency;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DataRequirementCodeFilter;
import org.hl7.fhir.DataRequirementDateFilter;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DaysOfWeek;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.DecisionSupportRule;
import org.hl7.fhir.DecisionSupportServiceModule;
import org.hl7.fhir.DetectedIssue;
import org.hl7.fhir.DetectedIssueMitigation;
import org.hl7.fhir.DetectedIssueSeverity;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceComponent;
import org.hl7.fhir.DeviceComponentProductionSpecification;
import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.DeviceMetricCalibration;
import org.hl7.fhir.DeviceMetricCalibrationState;
import org.hl7.fhir.DeviceMetricCalibrationType;
import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.DeviceMetricColor;
import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.DeviceStatus;
import org.hl7.fhir.DeviceUseRequest;
import org.hl7.fhir.DeviceUseRequestPriority;
import org.hl7.fhir.DeviceUseRequestStatus;
import org.hl7.fhir.DeviceUseStatement;
import org.hl7.fhir.DiagnosticOrder;
import org.hl7.fhir.DiagnosticOrderEvent;
import org.hl7.fhir.DiagnosticOrderItem;
import org.hl7.fhir.DiagnosticOrderPriority;
import org.hl7.fhir.DiagnosticOrderStatus;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DiagnosticReportImage;
import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.DigitalMediaType;
import org.hl7.fhir.Distance;
import org.hl7.fhir.DocumentManifest;
import org.hl7.fhir.DocumentManifestContent;
import org.hl7.fhir.DocumentManifestRelated;
import org.hl7.fhir.DocumentMode;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.DocumentReferenceContent;
import org.hl7.fhir.DocumentReferenceContext;
import org.hl7.fhir.DocumentReferenceRelated;
import org.hl7.fhir.DocumentReferenceRelatesTo;
import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.DocumentRelationshipType;
import org.hl7.fhir.DocumentRoot;
import org.hl7.fhir.DomainResource;
import org.hl7.fhir.Duration;
import org.hl7.fhir.Element;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionBase;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.ElementDefinitionMapping;
import org.hl7.fhir.ElementDefinitionSlicing;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.EligibilityRequest;
import org.hl7.fhir.EligibilityResponse;
import org.hl7.fhir.EligibilityResponseBenefitBalance;
import org.hl7.fhir.EligibilityResponseError;
import org.hl7.fhir.EligibilityResponseFinancial;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterClass;
import org.hl7.fhir.EncounterHospitalization;
import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.EncounterLocationStatus;
import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.EncounterState;
import org.hl7.fhir.EncounterStatusHistory;
import org.hl7.fhir.Endpoint;
import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.EpisodeOfCareStatusHistory;
import org.hl7.fhir.EventTiming;
import org.hl7.fhir.ExpansionProfile;
import org.hl7.fhir.ExpansionProfileCodeSystem;
import org.hl7.fhir.ExpansionProfileCodeSystem1;
import org.hl7.fhir.ExpansionProfileCodeSystem2;
import org.hl7.fhir.ExpansionProfileContact;
import org.hl7.fhir.ExpansionProfileDesignation;
import org.hl7.fhir.ExpansionProfileDesignation1;
import org.hl7.fhir.ExpansionProfileDesignation2;
import org.hl7.fhir.ExpansionProfileExclude;
import org.hl7.fhir.ExpansionProfileExclude1;
import org.hl7.fhir.ExpansionProfileInclude;
import org.hl7.fhir.ExpansionProfileInclude1;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.ExplanationOfBenefitAddItem;
import org.hl7.fhir.ExplanationOfBenefitAdjudication;
import org.hl7.fhir.ExplanationOfBenefitAdjudication1;
import org.hl7.fhir.ExplanationOfBenefitAdjudication2;
import org.hl7.fhir.ExplanationOfBenefitAdjudication3;
import org.hl7.fhir.ExplanationOfBenefitAdjudication4;
import org.hl7.fhir.ExplanationOfBenefitBenefitBalance;
import org.hl7.fhir.ExplanationOfBenefitCoverage;
import org.hl7.fhir.ExplanationOfBenefitDetail;
import org.hl7.fhir.ExplanationOfBenefitDetail1;
import org.hl7.fhir.ExplanationOfBenefitDiagnosis;
import org.hl7.fhir.ExplanationOfBenefitFinancial;
import org.hl7.fhir.ExplanationOfBenefitItem;
import org.hl7.fhir.ExplanationOfBenefitMissingTeeth;
import org.hl7.fhir.ExplanationOfBenefitNote;
import org.hl7.fhir.ExplanationOfBenefitOnset;
import org.hl7.fhir.ExplanationOfBenefitPayee;
import org.hl7.fhir.ExplanationOfBenefitProcedure;
import org.hl7.fhir.ExplanationOfBenefitProsthesis;
import org.hl7.fhir.ExplanationOfBenefitRelated;
import org.hl7.fhir.ExplanationOfBenefitSubDetail;
import org.hl7.fhir.Extension;
import org.hl7.fhir.ExtensionContext;
import org.hl7.fhir.FamilyHistoryStatus;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FilterOperator;
import org.hl7.fhir.Flag;
import org.hl7.fhir.FlagStatus;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GoalOutcome;
import org.hl7.fhir.GoalStatus;
import org.hl7.fhir.Group;
import org.hl7.fhir.GroupCharacteristic;
import org.hl7.fhir.GroupMember;
import org.hl7.fhir.GroupType;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.GuidanceResponseAction;
import org.hl7.fhir.GuidanceResponseBehavior;
import org.hl7.fhir.GuidanceResponseRelatedAction;
import org.hl7.fhir.GuidanceResponseStatus;
import org.hl7.fhir.GuideDependencyType;
import org.hl7.fhir.GuidePageKind;
import org.hl7.fhir.HTTPVerb;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.HealthcareServiceAvailableTime;
import org.hl7.fhir.HealthcareServiceNotAvailable;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.IdentifierUse;
import org.hl7.fhir.IdentityAssuranceLevel;
import org.hl7.fhir.ImagingExcerpt;
import org.hl7.fhir.ImagingExcerptDicom;
import org.hl7.fhir.ImagingExcerptDicom1;
import org.hl7.fhir.ImagingExcerptDicom2;
import org.hl7.fhir.ImagingExcerptInstance;
import org.hl7.fhir.ImagingExcerptSeries;
import org.hl7.fhir.ImagingExcerptStudy;
import org.hl7.fhir.ImagingExcerptViewable;
import org.hl7.fhir.ImagingObjectSelection;
import org.hl7.fhir.ImagingObjectSelectionFrame;
import org.hl7.fhir.ImagingObjectSelectionInstance;
import org.hl7.fhir.ImagingObjectSelectionSeries;
import org.hl7.fhir.ImagingObjectSelectionStudy;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationExplanation;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationProtocol;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.ImmunizationVaccinationProtocol;
import org.hl7.fhir.ImplementationGuide;
import org.hl7.fhir.ImplementationGuideContact;
import org.hl7.fhir.ImplementationGuideDependency;
import org.hl7.fhir.ImplementationGuideGlobal;
import org.hl7.fhir.ImplementationGuidePackage;
import org.hl7.fhir.ImplementationGuidePage;
import org.hl7.fhir.ImplementationGuideResource;
import org.hl7.fhir.InstanceAvailability;
import org.hl7.fhir.Instant;
import org.hl7.fhir.IssueSeverity;
import org.hl7.fhir.IssueType;
import org.hl7.fhir.Library;
import org.hl7.fhir.LibraryCodeSystem;
import org.hl7.fhir.LibraryLibrary;
import org.hl7.fhir.LibraryModel;
import org.hl7.fhir.LibraryValueSet;
import org.hl7.fhir.LinkType;
import org.hl7.fhir.Linkage;
import org.hl7.fhir.LinkageItem;
import org.hl7.fhir.LinkageType;
import org.hl7.fhir.List;
import org.hl7.fhir.ListEntry;
import org.hl7.fhir.ListMode;
import org.hl7.fhir.ListStatus;
import org.hl7.fhir.Location;
import org.hl7.fhir.LocationMode;
import org.hl7.fhir.LocationPosition;
import org.hl7.fhir.LocationStatus;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MeasmntPrinciple;
import org.hl7.fhir.Measure;
import org.hl7.fhir.MeasureDataUsage;
import org.hl7.fhir.MeasureGroup;
import org.hl7.fhir.MeasurePopulation;
import org.hl7.fhir.MeasurePopulationType;
import org.hl7.fhir.MeasureReport;
import org.hl7.fhir.MeasureReportGroup;
import org.hl7.fhir.MeasureReportGroup1;
import org.hl7.fhir.MeasureReportGroup2;
import org.hl7.fhir.MeasureReportPopulation;
import org.hl7.fhir.MeasureReportPopulation1;
import org.hl7.fhir.MeasureReportStatus;
import org.hl7.fhir.MeasureReportStratifier;
import org.hl7.fhir.MeasureReportSupplementalData;
import org.hl7.fhir.MeasureReportType;
import org.hl7.fhir.MeasureScoring;
import org.hl7.fhir.MeasureStratifier;
import org.hl7.fhir.MeasureSupplementalData;
import org.hl7.fhir.MeasureType;
import org.hl7.fhir.Media;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.MedicationAdministrationEventHistory;
import org.hl7.fhir.MedicationAdministrationStatus;
import org.hl7.fhir.MedicationBatch;
import org.hl7.fhir.MedicationContent;
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationDispenseDosageInstruction;
import org.hl7.fhir.MedicationDispenseEventHistory;
import org.hl7.fhir.MedicationDispenseStatus;
import org.hl7.fhir.MedicationDispenseSubstitution;
import org.hl7.fhir.MedicationIngredient;
import org.hl7.fhir.MedicationOrder;
import org.hl7.fhir.MedicationOrderDispenseRequest;
import org.hl7.fhir.MedicationOrderDosageInstruction;
import org.hl7.fhir.MedicationOrderEventHistory;
import org.hl7.fhir.MedicationOrderStatus;
import org.hl7.fhir.MedicationOrderSubstitution;
import org.hl7.fhir.MedicationPackage;
import org.hl7.fhir.MedicationProduct;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatementDosage;
import org.hl7.fhir.MedicationStatementStatus;
import org.hl7.fhir.MessageHeader;
import org.hl7.fhir.MessageHeaderDestination;
import org.hl7.fhir.MessageHeaderResponse;
import org.hl7.fhir.MessageHeaderSource;
import org.hl7.fhir.MessageSignificanceCategory;
import org.hl7.fhir.Meta;
import org.hl7.fhir.ModuleDefinition;
import org.hl7.fhir.ModuleDefinitionCodeFilter;
import org.hl7.fhir.ModuleDefinitionCodeSystem;
import org.hl7.fhir.ModuleDefinitionData;
import org.hl7.fhir.ModuleDefinitionDateFilter;
import org.hl7.fhir.ModuleDefinitionLibrary;
import org.hl7.fhir.ModuleDefinitionModel;
import org.hl7.fhir.ModuleDefinitionParameter;
import org.hl7.fhir.ModuleDefinitionValueSet;
import org.hl7.fhir.ModuleMetadata;
import org.hl7.fhir.ModuleMetadataContact;
import org.hl7.fhir.ModuleMetadataContact1;
import org.hl7.fhir.ModuleMetadataContributor;
import org.hl7.fhir.ModuleMetadataContributorType;
import org.hl7.fhir.ModuleMetadataCoverage;
import org.hl7.fhir.ModuleMetadataRelatedResource;
import org.hl7.fhir.ModuleMetadataResourceType;
import org.hl7.fhir.ModuleMetadataStatus;
import org.hl7.fhir.ModuleMetadataType;
import org.hl7.fhir.Money;
import org.hl7.fhir.NameUse;
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NamingSystemContact;
import org.hl7.fhir.NamingSystemIdentifierType;
import org.hl7.fhir.NamingSystemType;
import org.hl7.fhir.NamingSystemUniqueId;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.NarrativeStatus;
import org.hl7.fhir.NoteType;
import org.hl7.fhir.NutritionOrder;
import org.hl7.fhir.NutritionOrderAdministration;
import org.hl7.fhir.NutritionOrderEnteralFormula;
import org.hl7.fhir.NutritionOrderNutrient;
import org.hl7.fhir.NutritionOrderOralDiet;
import org.hl7.fhir.NutritionOrderStatus;
import org.hl7.fhir.NutritionOrderSupplement;
import org.hl7.fhir.NutritionOrderTexture;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationComponent;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.ObservationRelated;
import org.hl7.fhir.ObservationRelationshipType;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.Oid;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationDefinitionBinding;
import org.hl7.fhir.OperationDefinitionContact;
import org.hl7.fhir.OperationDefinitionParameter;
import org.hl7.fhir.OperationKind;
import org.hl7.fhir.OperationOutcome;
import org.hl7.fhir.OperationOutcomeIssue;
import org.hl7.fhir.OperationParameterUse;
import org.hl7.fhir.Order;
import org.hl7.fhir.OrderResponse;
import org.hl7.fhir.OrderSet;
import org.hl7.fhir.OrderStatus;
import org.hl7.fhir.OrderWhen;
import org.hl7.fhir.Organization;
import org.hl7.fhir.OrganizationContact;
import org.hl7.fhir.ParameterDefinition;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.ParticipantRequired;
import org.hl7.fhir.ParticipantType;
import org.hl7.fhir.ParticipationStatus;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PatientAnimal;
import org.hl7.fhir.PatientCommunication;
import org.hl7.fhir.PatientContact;
import org.hl7.fhir.PatientLink;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.PaymentReconciliationDetail;
import org.hl7.fhir.PaymentReconciliationNote;
import org.hl7.fhir.Period;
import org.hl7.fhir.Person;
import org.hl7.fhir.PersonLink;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.PractitionerPractitionerRole;
import org.hl7.fhir.PractitionerQualification;
import org.hl7.fhir.PractitionerRole;
import org.hl7.fhir.PractitionerRoleAvailableTime;
import org.hl7.fhir.PractitionerRoleNotAvailable;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureFocalDevice;
import org.hl7.fhir.ProcedurePerformer;
import org.hl7.fhir.ProcedureRequest;
import org.hl7.fhir.ProcedureRequestPriority;
import org.hl7.fhir.ProcedureRequestStatus;
import org.hl7.fhir.ProcedureStatus;
import org.hl7.fhir.ProcessRequest;
import org.hl7.fhir.ProcessRequestItem;
import org.hl7.fhir.ProcessResponse;
import org.hl7.fhir.ProcessResponseNotes;
import org.hl7.fhir.PropertyRepresentation;
import org.hl7.fhir.PropertyType;
import org.hl7.fhir.Protocol;
import org.hl7.fhir.ProtocolActivity;
import org.hl7.fhir.ProtocolComponent;
import org.hl7.fhir.ProtocolCondition;
import org.hl7.fhir.ProtocolDetail;
import org.hl7.fhir.ProtocolNext;
import org.hl7.fhir.ProtocolPrecondition;
import org.hl7.fhir.ProtocolStatus;
import org.hl7.fhir.ProtocolStep;
import org.hl7.fhir.ProtocolType;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.ProvenanceEntityRole;
import org.hl7.fhir.ProvenanceRelatedAgent;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuantityComparator;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireEnableWhen;
import org.hl7.fhir.QuestionnaireItem;
import org.hl7.fhir.QuestionnaireItemType;
import org.hl7.fhir.QuestionnaireOption;
import org.hl7.fhir.QuestionnaireResponse;
import org.hl7.fhir.QuestionnaireResponseAnswer;
import org.hl7.fhir.QuestionnaireResponseItem;
import org.hl7.fhir.QuestionnaireResponseStatus;
import org.hl7.fhir.QuestionnaireStatus;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ReferenceVersionRules;
import org.hl7.fhir.ReferralCategory;
import org.hl7.fhir.ReferralRequest;
import org.hl7.fhir.ReferralStatus;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RemittanceOutcome;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.ResourceVersionPolicy;
import org.hl7.fhir.ResponseType;
import org.hl7.fhir.RestfulConformanceMode;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.RiskAssessmentPrediction;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.SampledDataDataType;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchEntryMode;
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.SearchParameterContact;
import org.hl7.fhir.Sequence;
import org.hl7.fhir.SequenceInner;
import org.hl7.fhir.SequenceOuter;
import org.hl7.fhir.SequenceQuality;
import org.hl7.fhir.SequenceReferenceSeq;
import org.hl7.fhir.SequenceRepository;
import org.hl7.fhir.SequenceStructureVariation;
import org.hl7.fhir.SequenceType;
import org.hl7.fhir.SequenceVariation;
import org.hl7.fhir.Signature;
import org.hl7.fhir.SimpleQuantity;
import org.hl7.fhir.SlicingRules;
import org.hl7.fhir.Slot;
import org.hl7.fhir.SlotStatus;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenCollection;
import org.hl7.fhir.SpecimenContainer;
import org.hl7.fhir.SpecimenStatus;
import org.hl7.fhir.SpecimenTreatment;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionContact;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionKind;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
import org.hl7.fhir.StructureMap;
import org.hl7.fhir.StructureMapContact;
import org.hl7.fhir.StructureMapContextType;
import org.hl7.fhir.StructureMapDependent;
import org.hl7.fhir.StructureMapGroup;
import org.hl7.fhir.StructureMapInput;
import org.hl7.fhir.StructureMapInputMode;
import org.hl7.fhir.StructureMapListMode;
import org.hl7.fhir.StructureMapModelMode;
import org.hl7.fhir.StructureMapParameter;
import org.hl7.fhir.StructureMapRule;
import org.hl7.fhir.StructureMapSource;
import org.hl7.fhir.StructureMapStructure;
import org.hl7.fhir.StructureMapTarget;
import org.hl7.fhir.StructureMapTransform;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.SubscriptionChannel;
import org.hl7.fhir.SubscriptionChannelType;
import org.hl7.fhir.SubscriptionStatus;
import org.hl7.fhir.Substance;
import org.hl7.fhir.SubstanceIngredient;
import org.hl7.fhir.SubstanceInstance;
import org.hl7.fhir.SupplyDelivery;
import org.hl7.fhir.SupplyDeliveryStatus;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.SupplyRequestStatus;
import org.hl7.fhir.SupplyRequestWhen;
import org.hl7.fhir.SystemRestfulInteraction;
import org.hl7.fhir.Task;
import org.hl7.fhir.TaskFulfillment;
import org.hl7.fhir.TaskInput;
import org.hl7.fhir.TaskOutput;
import org.hl7.fhir.TaskPriority;
import org.hl7.fhir.TaskStatus;
import org.hl7.fhir.TestScript;
import org.hl7.fhir.TestScriptAction;
import org.hl7.fhir.TestScriptAction1;
import org.hl7.fhir.TestScriptAction2;
import org.hl7.fhir.TestScriptAssert;
import org.hl7.fhir.TestScriptCapability;
import org.hl7.fhir.TestScriptContact;
import org.hl7.fhir.TestScriptDestination;
import org.hl7.fhir.TestScriptFixture;
import org.hl7.fhir.TestScriptLink;
import org.hl7.fhir.TestScriptMetadata;
import org.hl7.fhir.TestScriptOperation;
import org.hl7.fhir.TestScriptOrigin;
import org.hl7.fhir.TestScriptParam;
import org.hl7.fhir.TestScriptParam1;
import org.hl7.fhir.TestScriptParam2;
import org.hl7.fhir.TestScriptParam3;
import org.hl7.fhir.TestScriptRequestHeader;
import org.hl7.fhir.TestScriptRule;
import org.hl7.fhir.TestScriptRule1;
import org.hl7.fhir.TestScriptRule2;
import org.hl7.fhir.TestScriptRule3;
import org.hl7.fhir.TestScriptRuleset;
import org.hl7.fhir.TestScriptRuleset1;
import org.hl7.fhir.TestScriptSetup;
import org.hl7.fhir.TestScriptTeardown;
import org.hl7.fhir.TestScriptTest;
import org.hl7.fhir.TestScriptVariable;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TimingRepeat;
import org.hl7.fhir.TransactionMode;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.TriggerType;
import org.hl7.fhir.TypeDerivationRule;
import org.hl7.fhir.TypeRestfulInteraction;
import org.hl7.fhir.UnitsOfTime;
import org.hl7.fhir.UnknownContentCode;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Use;
import org.hl7.fhir.Uuid;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.ValueSetCompose;
import org.hl7.fhir.ValueSetConcept;
import org.hl7.fhir.ValueSetContact;
import org.hl7.fhir.ValueSetContains;
import org.hl7.fhir.ValueSetDesignation;
import org.hl7.fhir.ValueSetExpansion;
import org.hl7.fhir.ValueSetFilter;
import org.hl7.fhir.ValueSetInclude;
import org.hl7.fhir.ValueSetParameter;
import org.hl7.fhir.VisionBase;
import org.hl7.fhir.VisionEyes;
import org.hl7.fhir.VisionPrescription;
import org.hl7.fhir.VisionPrescriptionDispense;
import org.hl7.fhir.XPathUsageType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage
 * @generated
 */
public class FhirSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FhirPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirSwitch() {
		if (modelPackage == null) {
			modelPackage = FhirPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FhirPackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T result = caseAccount(account);
				if (result == null) result = caseDomainResource(account);
				if (result == null) result = caseResource(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACCOUNT_STATUS: {
				AccountStatus accountStatus = (AccountStatus)theEObject;
				T result = caseAccountStatus(accountStatus);
				if (result == null) result = caseElement(accountStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_DEFINITION: {
				ActionDefinition actionDefinition = (ActionDefinition)theEObject;
				T result = caseActionDefinition(actionDefinition);
				if (result == null) result = caseElement(actionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_DEFINITION_BEHAVIOR: {
				ActionDefinitionBehavior actionDefinitionBehavior = (ActionDefinitionBehavior)theEObject;
				T result = caseActionDefinitionBehavior(actionDefinitionBehavior);
				if (result == null) result = caseElement(actionDefinitionBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_DEFINITION_CUSTOMIZATION: {
				ActionDefinitionCustomization actionDefinitionCustomization = (ActionDefinitionCustomization)theEObject;
				T result = caseActionDefinitionCustomization(actionDefinitionCustomization);
				if (result == null) result = caseElement(actionDefinitionCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION: {
				ActionDefinitionRelatedAction actionDefinitionRelatedAction = (ActionDefinitionRelatedAction)theEObject;
				T result = caseActionDefinitionRelatedAction(actionDefinitionRelatedAction);
				if (result == null) result = caseElement(actionDefinitionRelatedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_LIST: {
				ActionList actionList = (ActionList)theEObject;
				T result = caseActionList(actionList);
				if (result == null) result = caseElement(actionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_RELATIONSHIP_ANCHOR: {
				ActionRelationshipAnchor actionRelationshipAnchor = (ActionRelationshipAnchor)theEObject;
				T result = caseActionRelationshipAnchor(actionRelationshipAnchor);
				if (result == null) result = caseElement(actionRelationshipAnchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_RELATIONSHIP_TYPE: {
				ActionRelationshipType actionRelationshipType = (ActionRelationshipType)theEObject;
				T result = caseActionRelationshipType(actionRelationshipType);
				if (result == null) result = caseElement(actionRelationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_TYPE: {
				ActionType actionType = (ActionType)theEObject;
				T result = caseActionType(actionType);
				if (result == null) result = caseElement(actionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTIVITY_DEFINITION_CATEGORY: {
				ActivityDefinitionCategory activityDefinitionCategory = (ActivityDefinitionCategory)theEObject;
				T result = caseActivityDefinitionCategory(activityDefinitionCategory);
				if (result == null) result = caseElement(activityDefinitionCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ADDRESS: {
				Address address = (Address)theEObject;
				T result = caseAddress(address);
				if (result == null) result = caseElement(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = caseElement(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ADDRESS_USE: {
				AddressUse addressUse = (AddressUse)theEObject;
				T result = caseAddressUse(addressUse);
				if (result == null) result = caseElement(addressUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ADMINISTRATIVE_GENDER: {
				AdministrativeGender administrativeGender = (AdministrativeGender)theEObject;
				T result = caseAdministrativeGender(administrativeGender);
				if (result == null) result = caseElement(administrativeGender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AGE: {
				Age age = (Age)theEObject;
				T result = caseAge(age);
				if (result == null) result = caseQuantity(age);
				if (result == null) result = caseElement(age);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AGGREGATION_MODE: {
				AggregationMode aggregationMode = (AggregationMode)theEObject;
				T result = caseAggregationMode(aggregationMode);
				if (result == null) result = caseElement(aggregationMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE: {
				AllergyIntolerance allergyIntolerance = (AllergyIntolerance)theEObject;
				T result = caseAllergyIntolerance(allergyIntolerance);
				if (result == null) result = caseDomainResource(allergyIntolerance);
				if (result == null) result = caseResource(allergyIntolerance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY: {
				AllergyIntoleranceCategory allergyIntoleranceCategory = (AllergyIntoleranceCategory)theEObject;
				T result = caseAllergyIntoleranceCategory(allergyIntoleranceCategory);
				if (result == null) result = caseElement(allergyIntoleranceCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY: {
				AllergyIntoleranceCertainty allergyIntoleranceCertainty = (AllergyIntoleranceCertainty)theEObject;
				T result = caseAllergyIntoleranceCertainty(allergyIntoleranceCertainty);
				if (result == null) result = caseElement(allergyIntoleranceCertainty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY: {
				AllergyIntoleranceCriticality allergyIntoleranceCriticality = (AllergyIntoleranceCriticality)theEObject;
				T result = caseAllergyIntoleranceCriticality(allergyIntoleranceCriticality);
				if (result == null) result = caseElement(allergyIntoleranceCriticality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION: {
				AllergyIntoleranceReaction allergyIntoleranceReaction = (AllergyIntoleranceReaction)theEObject;
				T result = caseAllergyIntoleranceReaction(allergyIntoleranceReaction);
				if (result == null) result = caseBackboneElement(allergyIntoleranceReaction);
				if (result == null) result = caseElement(allergyIntoleranceReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY: {
				AllergyIntoleranceSeverity allergyIntoleranceSeverity = (AllergyIntoleranceSeverity)theEObject;
				T result = caseAllergyIntoleranceSeverity(allergyIntoleranceSeverity);
				if (result == null) result = caseElement(allergyIntoleranceSeverity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS: {
				AllergyIntoleranceStatus allergyIntoleranceStatus = (AllergyIntoleranceStatus)theEObject;
				T result = caseAllergyIntoleranceStatus(allergyIntoleranceStatus);
				if (result == null) result = caseElement(allergyIntoleranceStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE: {
				AllergyIntoleranceType allergyIntoleranceType = (AllergyIntoleranceType)theEObject;
				T result = caseAllergyIntoleranceType(allergyIntoleranceType);
				if (result == null) result = caseElement(allergyIntoleranceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseElement(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.APPOINTMENT: {
				Appointment appointment = (Appointment)theEObject;
				T result = caseAppointment(appointment);
				if (result == null) result = caseDomainResource(appointment);
				if (result == null) result = caseResource(appointment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.APPOINTMENT_PARTICIPANT: {
				AppointmentParticipant appointmentParticipant = (AppointmentParticipant)theEObject;
				T result = caseAppointmentParticipant(appointmentParticipant);
				if (result == null) result = caseBackboneElement(appointmentParticipant);
				if (result == null) result = caseElement(appointmentParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.APPOINTMENT_RESPONSE: {
				AppointmentResponse appointmentResponse = (AppointmentResponse)theEObject;
				T result = caseAppointmentResponse(appointmentResponse);
				if (result == null) result = caseDomainResource(appointmentResponse);
				if (result == null) result = caseResource(appointmentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.APPOINTMENT_STATUS: {
				AppointmentStatus appointmentStatus = (AppointmentStatus)theEObject;
				T result = caseAppointmentStatus(appointmentStatus);
				if (result == null) result = caseElement(appointmentStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ASSERTION_DIRECTION_TYPE: {
				AssertionDirectionType assertionDirectionType = (AssertionDirectionType)theEObject;
				T result = caseAssertionDirectionType(assertionDirectionType);
				if (result == null) result = caseElement(assertionDirectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ASSERTION_OPERATOR_TYPE: {
				AssertionOperatorType assertionOperatorType = (AssertionOperatorType)theEObject;
				T result = caseAssertionOperatorType(assertionOperatorType);
				if (result == null) result = caseElement(assertionOperatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ASSERTION_RESPONSE_TYPES: {
				AssertionResponseTypes assertionResponseTypes = (AssertionResponseTypes)theEObject;
				T result = caseAssertionResponseTypes(assertionResponseTypes);
				if (result == null) result = caseElement(assertionResponseTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ATTACHMENT: {
				Attachment attachment = (Attachment)theEObject;
				T result = caseAttachment(attachment);
				if (result == null) result = caseElement(attachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT: {
				AuditEvent auditEvent = (AuditEvent)theEObject;
				T result = caseAuditEvent(auditEvent);
				if (result == null) result = caseDomainResource(auditEvent);
				if (result == null) result = caseResource(auditEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_ACTION: {
				AuditEventAction auditEventAction = (AuditEventAction)theEObject;
				T result = caseAuditEventAction(auditEventAction);
				if (result == null) result = caseElement(auditEventAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_AGENT: {
				AuditEventAgent auditEventAgent = (AuditEventAgent)theEObject;
				T result = caseAuditEventAgent(auditEventAgent);
				if (result == null) result = caseBackboneElement(auditEventAgent);
				if (result == null) result = caseElement(auditEventAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_DETAIL: {
				AuditEventDetail auditEventDetail = (AuditEventDetail)theEObject;
				T result = caseAuditEventDetail(auditEventDetail);
				if (result == null) result = caseBackboneElement(auditEventDetail);
				if (result == null) result = caseElement(auditEventDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_ENTITY: {
				AuditEventEntity auditEventEntity = (AuditEventEntity)theEObject;
				T result = caseAuditEventEntity(auditEventEntity);
				if (result == null) result = caseBackboneElement(auditEventEntity);
				if (result == null) result = caseElement(auditEventEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_NETWORK: {
				AuditEventNetwork auditEventNetwork = (AuditEventNetwork)theEObject;
				T result = caseAuditEventNetwork(auditEventNetwork);
				if (result == null) result = caseBackboneElement(auditEventNetwork);
				if (result == null) result = caseElement(auditEventNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_OUTCOME: {
				AuditEventOutcome auditEventOutcome = (AuditEventOutcome)theEObject;
				T result = caseAuditEventOutcome(auditEventOutcome);
				if (result == null) result = caseElement(auditEventOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE: {
				AuditEventParticipantNetworkType auditEventParticipantNetworkType = (AuditEventParticipantNetworkType)theEObject;
				T result = caseAuditEventParticipantNetworkType(auditEventParticipantNetworkType);
				if (result == null) result = caseElement(auditEventParticipantNetworkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_SOURCE: {
				AuditEventSource auditEventSource = (AuditEventSource)theEObject;
				T result = caseAuditEventSource(auditEventSource);
				if (result == null) result = caseBackboneElement(auditEventSource);
				if (result == null) result = caseElement(auditEventSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BACKBONE_ELEMENT: {
				BackboneElement backboneElement = (BackboneElement)theEObject;
				T result = caseBackboneElement(backboneElement);
				if (result == null) result = caseElement(backboneElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BASE64_BINARY: {
				Base64Binary base64Binary = (Base64Binary)theEObject;
				T result = caseBase64Binary(base64Binary);
				if (result == null) result = caseElement(base64Binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BASIC: {
				Basic basic = (Basic)theEObject;
				T result = caseBasic(basic);
				if (result == null) result = caseDomainResource(basic);
				if (result == null) result = caseResource(basic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BINARY: {
				Binary binary = (Binary)theEObject;
				T result = caseBinary(binary);
				if (result == null) result = caseResource(binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BINDING_STRENGTH: {
				BindingStrength bindingStrength = (BindingStrength)theEObject;
				T result = caseBindingStrength(bindingStrength);
				if (result == null) result = caseElement(bindingStrength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BODY_SITE: {
				BodySite bodySite = (BodySite)theEObject;
				T result = caseBodySite(bodySite);
				if (result == null) result = caseDomainResource(bodySite);
				if (result == null) result = caseResource(bodySite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BOOLEAN: {
				org.hl7.fhir.Boolean boolean_ = (org.hl7.fhir.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseElement(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE: {
				Bundle bundle = (Bundle)theEObject;
				T result = caseBundle(bundle);
				if (result == null) result = caseResource(bundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE_ENTRY: {
				BundleEntry bundleEntry = (BundleEntry)theEObject;
				T result = caseBundleEntry(bundleEntry);
				if (result == null) result = caseBackboneElement(bundleEntry);
				if (result == null) result = caseElement(bundleEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE_LINK: {
				BundleLink bundleLink = (BundleLink)theEObject;
				T result = caseBundleLink(bundleLink);
				if (result == null) result = caseBackboneElement(bundleLink);
				if (result == null) result = caseElement(bundleLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE_REQUEST: {
				BundleRequest bundleRequest = (BundleRequest)theEObject;
				T result = caseBundleRequest(bundleRequest);
				if (result == null) result = caseBackboneElement(bundleRequest);
				if (result == null) result = caseElement(bundleRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE_RESPONSE: {
				BundleResponse bundleResponse = (BundleResponse)theEObject;
				T result = caseBundleResponse(bundleResponse);
				if (result == null) result = caseBackboneElement(bundleResponse);
				if (result == null) result = caseElement(bundleResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE_SEARCH: {
				BundleSearch bundleSearch = (BundleSearch)theEObject;
				T result = caseBundleSearch(bundleSearch);
				if (result == null) result = caseBackboneElement(bundleSearch);
				if (result == null) result = caseElement(bundleSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE_TYPE: {
				BundleType bundleType = (BundleType)theEObject;
				T result = caseBundleType(bundleType);
				if (result == null) result = caseElement(bundleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_PLAN: {
				CarePlan carePlan = (CarePlan)theEObject;
				T result = caseCarePlan(carePlan);
				if (result == null) result = caseDomainResource(carePlan);
				if (result == null) result = caseResource(carePlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_PLAN_ACTIVITY: {
				CarePlanActivity carePlanActivity = (CarePlanActivity)theEObject;
				T result = caseCarePlanActivity(carePlanActivity);
				if (result == null) result = caseBackboneElement(carePlanActivity);
				if (result == null) result = caseElement(carePlanActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS: {
				CarePlanActivityStatus carePlanActivityStatus = (CarePlanActivityStatus)theEObject;
				T result = caseCarePlanActivityStatus(carePlanActivityStatus);
				if (result == null) result = caseElement(carePlanActivityStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_PLAN_DETAIL: {
				CarePlanDetail carePlanDetail = (CarePlanDetail)theEObject;
				T result = caseCarePlanDetail(carePlanDetail);
				if (result == null) result = caseBackboneElement(carePlanDetail);
				if (result == null) result = caseElement(carePlanDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_PLAN_RELATED_PLAN: {
				CarePlanRelatedPlan carePlanRelatedPlan = (CarePlanRelatedPlan)theEObject;
				T result = caseCarePlanRelatedPlan(carePlanRelatedPlan);
				if (result == null) result = caseBackboneElement(carePlanRelatedPlan);
				if (result == null) result = caseElement(carePlanRelatedPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_PLAN_RELATIONSHIP: {
				CarePlanRelationship carePlanRelationship = (CarePlanRelationship)theEObject;
				T result = caseCarePlanRelationship(carePlanRelationship);
				if (result == null) result = caseElement(carePlanRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_PLAN_STATUS: {
				CarePlanStatus carePlanStatus = (CarePlanStatus)theEObject;
				T result = caseCarePlanStatus(carePlanStatus);
				if (result == null) result = caseElement(carePlanStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_TEAM: {
				CareTeam careTeam = (CareTeam)theEObject;
				T result = caseCareTeam(careTeam);
				if (result == null) result = caseDomainResource(careTeam);
				if (result == null) result = caseResource(careTeam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_TEAM_PARTICIPANT: {
				CareTeamParticipant careTeamParticipant = (CareTeamParticipant)theEObject;
				T result = caseCareTeamParticipant(careTeamParticipant);
				if (result == null) result = caseBackboneElement(careTeamParticipant);
				if (result == null) result = caseElement(careTeamParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM: {
				Claim claim = (Claim)theEObject;
				T result = caseClaim(claim);
				if (result == null) result = caseDomainResource(claim);
				if (result == null) result = caseResource(claim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_COVERAGE: {
				ClaimCoverage claimCoverage = (ClaimCoverage)theEObject;
				T result = caseClaimCoverage(claimCoverage);
				if (result == null) result = caseBackboneElement(claimCoverage);
				if (result == null) result = caseElement(claimCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_DETAIL: {
				ClaimDetail claimDetail = (ClaimDetail)theEObject;
				T result = caseClaimDetail(claimDetail);
				if (result == null) result = caseBackboneElement(claimDetail);
				if (result == null) result = caseElement(claimDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_DIAGNOSIS: {
				ClaimDiagnosis claimDiagnosis = (ClaimDiagnosis)theEObject;
				T result = caseClaimDiagnosis(claimDiagnosis);
				if (result == null) result = caseBackboneElement(claimDiagnosis);
				if (result == null) result = caseElement(claimDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_ITEM: {
				ClaimItem claimItem = (ClaimItem)theEObject;
				T result = caseClaimItem(claimItem);
				if (result == null) result = caseBackboneElement(claimItem);
				if (result == null) result = caseElement(claimItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_MISSING_TEETH: {
				ClaimMissingTeeth claimMissingTeeth = (ClaimMissingTeeth)theEObject;
				T result = caseClaimMissingTeeth(claimMissingTeeth);
				if (result == null) result = caseBackboneElement(claimMissingTeeth);
				if (result == null) result = caseElement(claimMissingTeeth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_ONSET: {
				ClaimOnset claimOnset = (ClaimOnset)theEObject;
				T result = caseClaimOnset(claimOnset);
				if (result == null) result = caseBackboneElement(claimOnset);
				if (result == null) result = caseElement(claimOnset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_PAYEE: {
				ClaimPayee claimPayee = (ClaimPayee)theEObject;
				T result = caseClaimPayee(claimPayee);
				if (result == null) result = caseBackboneElement(claimPayee);
				if (result == null) result = caseElement(claimPayee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_PROCEDURE: {
				ClaimProcedure claimProcedure = (ClaimProcedure)theEObject;
				T result = caseClaimProcedure(claimProcedure);
				if (result == null) result = caseBackboneElement(claimProcedure);
				if (result == null) result = caseElement(claimProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_PROSTHESIS: {
				ClaimProsthesis claimProsthesis = (ClaimProsthesis)theEObject;
				T result = caseClaimProsthesis(claimProsthesis);
				if (result == null) result = caseBackboneElement(claimProsthesis);
				if (result == null) result = caseElement(claimProsthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RELATED: {
				ClaimRelated claimRelated = (ClaimRelated)theEObject;
				T result = caseClaimRelated(claimRelated);
				if (result == null) result = caseBackboneElement(claimRelated);
				if (result == null) result = caseElement(claimRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE: {
				ClaimResponse claimResponse = (ClaimResponse)theEObject;
				T result = caseClaimResponse(claimResponse);
				if (result == null) result = caseDomainResource(claimResponse);
				if (result == null) result = caseResource(claimResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM: {
				ClaimResponseAddItem claimResponseAddItem = (ClaimResponseAddItem)theEObject;
				T result = caseClaimResponseAddItem(claimResponseAddItem);
				if (result == null) result = caseBackboneElement(claimResponseAddItem);
				if (result == null) result = caseElement(claimResponseAddItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION: {
				ClaimResponseAdjudication claimResponseAdjudication = (ClaimResponseAdjudication)theEObject;
				T result = caseClaimResponseAdjudication(claimResponseAdjudication);
				if (result == null) result = caseBackboneElement(claimResponseAdjudication);
				if (result == null) result = caseElement(claimResponseAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION1: {
				ClaimResponseAdjudication1 claimResponseAdjudication1 = (ClaimResponseAdjudication1)theEObject;
				T result = caseClaimResponseAdjudication1(claimResponseAdjudication1);
				if (result == null) result = caseBackboneElement(claimResponseAdjudication1);
				if (result == null) result = caseElement(claimResponseAdjudication1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION2: {
				ClaimResponseAdjudication2 claimResponseAdjudication2 = (ClaimResponseAdjudication2)theEObject;
				T result = caseClaimResponseAdjudication2(claimResponseAdjudication2);
				if (result == null) result = caseBackboneElement(claimResponseAdjudication2);
				if (result == null) result = caseElement(claimResponseAdjudication2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION3: {
				ClaimResponseAdjudication3 claimResponseAdjudication3 = (ClaimResponseAdjudication3)theEObject;
				T result = caseClaimResponseAdjudication3(claimResponseAdjudication3);
				if (result == null) result = caseBackboneElement(claimResponseAdjudication3);
				if (result == null) result = caseElement(claimResponseAdjudication3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION4: {
				ClaimResponseAdjudication4 claimResponseAdjudication4 = (ClaimResponseAdjudication4)theEObject;
				T result = caseClaimResponseAdjudication4(claimResponseAdjudication4);
				if (result == null) result = caseBackboneElement(claimResponseAdjudication4);
				if (result == null) result = caseElement(claimResponseAdjudication4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_COVERAGE: {
				ClaimResponseCoverage claimResponseCoverage = (ClaimResponseCoverage)theEObject;
				T result = caseClaimResponseCoverage(claimResponseCoverage);
				if (result == null) result = caseBackboneElement(claimResponseCoverage);
				if (result == null) result = caseElement(claimResponseCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_DETAIL: {
				ClaimResponseDetail claimResponseDetail = (ClaimResponseDetail)theEObject;
				T result = caseClaimResponseDetail(claimResponseDetail);
				if (result == null) result = caseBackboneElement(claimResponseDetail);
				if (result == null) result = caseElement(claimResponseDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_DETAIL1: {
				ClaimResponseDetail1 claimResponseDetail1 = (ClaimResponseDetail1)theEObject;
				T result = caseClaimResponseDetail1(claimResponseDetail1);
				if (result == null) result = caseBackboneElement(claimResponseDetail1);
				if (result == null) result = caseElement(claimResponseDetail1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_ERROR: {
				ClaimResponseError claimResponseError = (ClaimResponseError)theEObject;
				T result = caseClaimResponseError(claimResponseError);
				if (result == null) result = caseBackboneElement(claimResponseError);
				if (result == null) result = caseElement(claimResponseError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_ITEM: {
				ClaimResponseItem claimResponseItem = (ClaimResponseItem)theEObject;
				T result = caseClaimResponseItem(claimResponseItem);
				if (result == null) result = caseBackboneElement(claimResponseItem);
				if (result == null) result = caseElement(claimResponseItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_NOTE: {
				ClaimResponseNote claimResponseNote = (ClaimResponseNote)theEObject;
				T result = caseClaimResponseNote(claimResponseNote);
				if (result == null) result = caseBackboneElement(claimResponseNote);
				if (result == null) result = caseElement(claimResponseNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL: {
				ClaimResponseSubDetail claimResponseSubDetail = (ClaimResponseSubDetail)theEObject;
				T result = caseClaimResponseSubDetail(claimResponseSubDetail);
				if (result == null) result = caseBackboneElement(claimResponseSubDetail);
				if (result == null) result = caseElement(claimResponseSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_SUB_DETAIL: {
				ClaimSubDetail claimSubDetail = (ClaimSubDetail)theEObject;
				T result = caseClaimSubDetail(claimSubDetail);
				if (result == null) result = caseBackboneElement(claimSubDetail);
				if (result == null) result = caseElement(claimSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_TYPE: {
				ClaimType claimType = (ClaimType)theEObject;
				T result = caseClaimType(claimType);
				if (result == null) result = caseElement(claimType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_TYPE2: {
				ClaimType2 claimType2 = (ClaimType2)theEObject;
				T result = caseClaimType2(claimType2);
				if (result == null) result = caseElement(claimType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLINICAL_IMPRESSION: {
				ClinicalImpression clinicalImpression = (ClinicalImpression)theEObject;
				T result = caseClinicalImpression(clinicalImpression);
				if (result == null) result = caseDomainResource(clinicalImpression);
				if (result == null) result = caseResource(clinicalImpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLINICAL_IMPRESSION_FINDING: {
				ClinicalImpressionFinding clinicalImpressionFinding = (ClinicalImpressionFinding)theEObject;
				T result = caseClinicalImpressionFinding(clinicalImpressionFinding);
				if (result == null) result = caseBackboneElement(clinicalImpressionFinding);
				if (result == null) result = caseElement(clinicalImpressionFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLINICAL_IMPRESSION_INVESTIGATIONS: {
				ClinicalImpressionInvestigations clinicalImpressionInvestigations = (ClinicalImpressionInvestigations)theEObject;
				T result = caseClinicalImpressionInvestigations(clinicalImpressionInvestigations);
				if (result == null) result = caseBackboneElement(clinicalImpressionInvestigations);
				if (result == null) result = caseElement(clinicalImpressionInvestigations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLINICAL_IMPRESSION_RULED_OUT: {
				ClinicalImpressionRuledOut clinicalImpressionRuledOut = (ClinicalImpressionRuledOut)theEObject;
				T result = caseClinicalImpressionRuledOut(clinicalImpressionRuledOut);
				if (result == null) result = caseBackboneElement(clinicalImpressionRuledOut);
				if (result == null) result = caseElement(clinicalImpressionRuledOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLINICAL_IMPRESSION_STATUS: {
				ClinicalImpressionStatus clinicalImpressionStatus = (ClinicalImpressionStatus)theEObject;
				T result = caseClinicalImpressionStatus(clinicalImpressionStatus);
				if (result == null) result = caseElement(clinicalImpressionStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE: {
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = caseElement(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODEABLE_CONCEPT: {
				CodeableConcept codeableConcept = (CodeableConcept)theEObject;
				T result = caseCodeableConcept(codeableConcept);
				if (result == null) result = caseElement(codeableConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM: {
				CodeSystem codeSystem = (CodeSystem)theEObject;
				T result = caseCodeSystem(codeSystem);
				if (result == null) result = caseDomainResource(codeSystem);
				if (result == null) result = caseResource(codeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_CONCEPT: {
				CodeSystemConcept codeSystemConcept = (CodeSystemConcept)theEObject;
				T result = caseCodeSystemConcept(codeSystemConcept);
				if (result == null) result = caseBackboneElement(codeSystemConcept);
				if (result == null) result = caseElement(codeSystemConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_CONTACT: {
				CodeSystemContact codeSystemContact = (CodeSystemContact)theEObject;
				T result = caseCodeSystemContact(codeSystemContact);
				if (result == null) result = caseBackboneElement(codeSystemContact);
				if (result == null) result = caseElement(codeSystemContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE: {
				CodeSystemContentMode codeSystemContentMode = (CodeSystemContentMode)theEObject;
				T result = caseCodeSystemContentMode(codeSystemContentMode);
				if (result == null) result = caseElement(codeSystemContentMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_DESIGNATION: {
				CodeSystemDesignation codeSystemDesignation = (CodeSystemDesignation)theEObject;
				T result = caseCodeSystemDesignation(codeSystemDesignation);
				if (result == null) result = caseBackboneElement(codeSystemDesignation);
				if (result == null) result = caseElement(codeSystemDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_FILTER: {
				CodeSystemFilter codeSystemFilter = (CodeSystemFilter)theEObject;
				T result = caseCodeSystemFilter(codeSystemFilter);
				if (result == null) result = caseBackboneElement(codeSystemFilter);
				if (result == null) result = caseElement(codeSystemFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_PROPERTY: {
				CodeSystemProperty codeSystemProperty = (CodeSystemProperty)theEObject;
				T result = caseCodeSystemProperty(codeSystemProperty);
				if (result == null) result = caseBackboneElement(codeSystemProperty);
				if (result == null) result = caseElement(codeSystemProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_PROPERTY1: {
				CodeSystemProperty1 codeSystemProperty1 = (CodeSystemProperty1)theEObject;
				T result = caseCodeSystemProperty1(codeSystemProperty1);
				if (result == null) result = caseBackboneElement(codeSystemProperty1);
				if (result == null) result = caseElement(codeSystemProperty1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODING: {
				Coding coding = (Coding)theEObject;
				T result = caseCoding(coding);
				if (result == null) result = caseElement(coding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMMUNICATION: {
				Communication communication = (Communication)theEObject;
				T result = caseCommunication(communication);
				if (result == null) result = caseDomainResource(communication);
				if (result == null) result = caseResource(communication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMMUNICATION_PAYLOAD: {
				CommunicationPayload communicationPayload = (CommunicationPayload)theEObject;
				T result = caseCommunicationPayload(communicationPayload);
				if (result == null) result = caseBackboneElement(communicationPayload);
				if (result == null) result = caseElement(communicationPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMMUNICATION_REQUEST: {
				CommunicationRequest communicationRequest = (CommunicationRequest)theEObject;
				T result = caseCommunicationRequest(communicationRequest);
				if (result == null) result = caseDomainResource(communicationRequest);
				if (result == null) result = caseResource(communicationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD: {
				CommunicationRequestPayload communicationRequestPayload = (CommunicationRequestPayload)theEObject;
				T result = caseCommunicationRequestPayload(communicationRequestPayload);
				if (result == null) result = caseBackboneElement(communicationRequestPayload);
				if (result == null) result = caseElement(communicationRequestPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMMUNICATION_REQUEST_STATUS: {
				CommunicationRequestStatus communicationRequestStatus = (CommunicationRequestStatus)theEObject;
				T result = caseCommunicationRequestStatus(communicationRequestStatus);
				if (result == null) result = caseElement(communicationRequestStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMMUNICATION_STATUS: {
				CommunicationStatus communicationStatus = (CommunicationStatus)theEObject;
				T result = caseCommunicationStatus(communicationStatus);
				if (result == null) result = caseElement(communicationStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPARTMENT_DEFINITION: {
				CompartmentDefinition compartmentDefinition = (CompartmentDefinition)theEObject;
				T result = caseCompartmentDefinition(compartmentDefinition);
				if (result == null) result = caseDomainResource(compartmentDefinition);
				if (result == null) result = caseResource(compartmentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPARTMENT_DEFINITION_CONTACT: {
				CompartmentDefinitionContact compartmentDefinitionContact = (CompartmentDefinitionContact)theEObject;
				T result = caseCompartmentDefinitionContact(compartmentDefinitionContact);
				if (result == null) result = caseBackboneElement(compartmentDefinitionContact);
				if (result == null) result = caseElement(compartmentDefinitionContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE: {
				CompartmentDefinitionResource compartmentDefinitionResource = (CompartmentDefinitionResource)theEObject;
				T result = caseCompartmentDefinitionResource(compartmentDefinitionResource);
				if (result == null) result = caseBackboneElement(compartmentDefinitionResource);
				if (result == null) result = caseElement(compartmentDefinitionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPARTMENT_TYPE: {
				CompartmentType compartmentType = (CompartmentType)theEObject;
				T result = caseCompartmentType(compartmentType);
				if (result == null) result = caseElement(compartmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseDomainResource(composition);
				if (result == null) result = caseResource(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPOSITION_ATTESTATION_MODE: {
				CompositionAttestationMode compositionAttestationMode = (CompositionAttestationMode)theEObject;
				T result = caseCompositionAttestationMode(compositionAttestationMode);
				if (result == null) result = caseElement(compositionAttestationMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPOSITION_ATTESTER: {
				CompositionAttester compositionAttester = (CompositionAttester)theEObject;
				T result = caseCompositionAttester(compositionAttester);
				if (result == null) result = caseBackboneElement(compositionAttester);
				if (result == null) result = caseElement(compositionAttester);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPOSITION_EVENT: {
				CompositionEvent compositionEvent = (CompositionEvent)theEObject;
				T result = caseCompositionEvent(compositionEvent);
				if (result == null) result = caseBackboneElement(compositionEvent);
				if (result == null) result = caseElement(compositionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPOSITION_SECTION: {
				CompositionSection compositionSection = (CompositionSection)theEObject;
				T result = caseCompositionSection(compositionSection);
				if (result == null) result = caseBackboneElement(compositionSection);
				if (result == null) result = caseElement(compositionSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPOSITION_STATUS: {
				CompositionStatus compositionStatus = (CompositionStatus)theEObject;
				T result = caseCompositionStatus(compositionStatus);
				if (result == null) result = caseElement(compositionStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP: {
				ConceptMap conceptMap = (ConceptMap)theEObject;
				T result = caseConceptMap(conceptMap);
				if (result == null) result = caseDomainResource(conceptMap);
				if (result == null) result = caseResource(conceptMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP_CONTACT: {
				ConceptMapContact conceptMapContact = (ConceptMapContact)theEObject;
				T result = caseConceptMapContact(conceptMapContact);
				if (result == null) result = caseBackboneElement(conceptMapContact);
				if (result == null) result = caseElement(conceptMapContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP_DEPENDS_ON: {
				ConceptMapDependsOn conceptMapDependsOn = (ConceptMapDependsOn)theEObject;
				T result = caseConceptMapDependsOn(conceptMapDependsOn);
				if (result == null) result = caseBackboneElement(conceptMapDependsOn);
				if (result == null) result = caseElement(conceptMapDependsOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP_ELEMENT: {
				ConceptMapElement conceptMapElement = (ConceptMapElement)theEObject;
				T result = caseConceptMapElement(conceptMapElement);
				if (result == null) result = caseBackboneElement(conceptMapElement);
				if (result == null) result = caseElement(conceptMapElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE: {
				ConceptMapEquivalence conceptMapEquivalence = (ConceptMapEquivalence)theEObject;
				T result = caseConceptMapEquivalence(conceptMapEquivalence);
				if (result == null) result = caseElement(conceptMapEquivalence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP_TARGET: {
				ConceptMapTarget conceptMapTarget = (ConceptMapTarget)theEObject;
				T result = caseConceptMapTarget(conceptMapTarget);
				if (result == null) result = caseBackboneElement(conceptMapTarget);
				if (result == null) result = caseElement(conceptMapTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseDomainResource(condition);
				if (result == null) result = caseResource(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONDITIONAL_DELETE_STATUS: {
				ConditionalDeleteStatus conditionalDeleteStatus = (ConditionalDeleteStatus)theEObject;
				T result = caseConditionalDeleteStatus(conditionalDeleteStatus);
				if (result == null) result = caseElement(conditionalDeleteStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONDITION_EVIDENCE: {
				ConditionEvidence conditionEvidence = (ConditionEvidence)theEObject;
				T result = caseConditionEvidence(conditionEvidence);
				if (result == null) result = caseBackboneElement(conditionEvidence);
				if (result == null) result = caseElement(conditionEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONDITION_STAGE: {
				ConditionStage conditionStage = (ConditionStage)theEObject;
				T result = caseConditionStage(conditionStage);
				if (result == null) result = caseBackboneElement(conditionStage);
				if (result == null) result = caseElement(conditionStage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONDITION_VERIFICATION_STATUS: {
				ConditionVerificationStatus conditionVerificationStatus = (ConditionVerificationStatus)theEObject;
				T result = caseConditionVerificationStatus(conditionVerificationStatus);
				if (result == null) result = caseElement(conditionVerificationStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE: {
				Conformance conformance = (Conformance)theEObject;
				T result = caseConformance(conformance);
				if (result == null) result = caseDomainResource(conformance);
				if (result == null) result = caseResource(conformance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_CERTIFICATE: {
				ConformanceCertificate conformanceCertificate = (ConformanceCertificate)theEObject;
				T result = caseConformanceCertificate(conformanceCertificate);
				if (result == null) result = caseBackboneElement(conformanceCertificate);
				if (result == null) result = caseElement(conformanceCertificate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_CONTACT: {
				ConformanceContact conformanceContact = (ConformanceContact)theEObject;
				T result = caseConformanceContact(conformanceContact);
				if (result == null) result = caseBackboneElement(conformanceContact);
				if (result == null) result = caseElement(conformanceContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_DOCUMENT: {
				ConformanceDocument conformanceDocument = (ConformanceDocument)theEObject;
				T result = caseConformanceDocument(conformanceDocument);
				if (result == null) result = caseBackboneElement(conformanceDocument);
				if (result == null) result = caseElement(conformanceDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_ENDPOINT: {
				ConformanceEndpoint conformanceEndpoint = (ConformanceEndpoint)theEObject;
				T result = caseConformanceEndpoint(conformanceEndpoint);
				if (result == null) result = caseBackboneElement(conformanceEndpoint);
				if (result == null) result = caseElement(conformanceEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_EVENT: {
				ConformanceEvent conformanceEvent = (ConformanceEvent)theEObject;
				T result = caseConformanceEvent(conformanceEvent);
				if (result == null) result = caseBackboneElement(conformanceEvent);
				if (result == null) result = caseElement(conformanceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_EVENT_MODE: {
				ConformanceEventMode conformanceEventMode = (ConformanceEventMode)theEObject;
				T result = caseConformanceEventMode(conformanceEventMode);
				if (result == null) result = caseElement(conformanceEventMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_IMPLEMENTATION: {
				ConformanceImplementation conformanceImplementation = (ConformanceImplementation)theEObject;
				T result = caseConformanceImplementation(conformanceImplementation);
				if (result == null) result = caseBackboneElement(conformanceImplementation);
				if (result == null) result = caseElement(conformanceImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_INTERACTION: {
				ConformanceInteraction conformanceInteraction = (ConformanceInteraction)theEObject;
				T result = caseConformanceInteraction(conformanceInteraction);
				if (result == null) result = caseBackboneElement(conformanceInteraction);
				if (result == null) result = caseElement(conformanceInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_INTERACTION1: {
				ConformanceInteraction1 conformanceInteraction1 = (ConformanceInteraction1)theEObject;
				T result = caseConformanceInteraction1(conformanceInteraction1);
				if (result == null) result = caseBackboneElement(conformanceInteraction1);
				if (result == null) result = caseElement(conformanceInteraction1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_MESSAGING: {
				ConformanceMessaging conformanceMessaging = (ConformanceMessaging)theEObject;
				T result = caseConformanceMessaging(conformanceMessaging);
				if (result == null) result = caseBackboneElement(conformanceMessaging);
				if (result == null) result = caseElement(conformanceMessaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_OPERATION: {
				ConformanceOperation conformanceOperation = (ConformanceOperation)theEObject;
				T result = caseConformanceOperation(conformanceOperation);
				if (result == null) result = caseBackboneElement(conformanceOperation);
				if (result == null) result = caseElement(conformanceOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_RESOURCE: {
				ConformanceResource conformanceResource = (ConformanceResource)theEObject;
				T result = caseConformanceResource(conformanceResource);
				if (result == null) result = caseBackboneElement(conformanceResource);
				if (result == null) result = caseElement(conformanceResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS: {
				ConformanceResourceStatus conformanceResourceStatus = (ConformanceResourceStatus)theEObject;
				T result = caseConformanceResourceStatus(conformanceResourceStatus);
				if (result == null) result = caseElement(conformanceResourceStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_REST: {
				ConformanceRest conformanceRest = (ConformanceRest)theEObject;
				T result = caseConformanceRest(conformanceRest);
				if (result == null) result = caseBackboneElement(conformanceRest);
				if (result == null) result = caseElement(conformanceRest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_SEARCH_PARAM: {
				ConformanceSearchParam conformanceSearchParam = (ConformanceSearchParam)theEObject;
				T result = caseConformanceSearchParam(conformanceSearchParam);
				if (result == null) result = caseBackboneElement(conformanceSearchParam);
				if (result == null) result = caseElement(conformanceSearchParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_SECURITY: {
				ConformanceSecurity conformanceSecurity = (ConformanceSecurity)theEObject;
				T result = caseConformanceSecurity(conformanceSecurity);
				if (result == null) result = caseBackboneElement(conformanceSecurity);
				if (result == null) result = caseElement(conformanceSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_SOFTWARE: {
				ConformanceSoftware conformanceSoftware = (ConformanceSoftware)theEObject;
				T result = caseConformanceSoftware(conformanceSoftware);
				if (result == null) result = caseBackboneElement(conformanceSoftware);
				if (result == null) result = caseElement(conformanceSoftware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONFORMANCE_STATEMENT_KIND: {
				ConformanceStatementKind conformanceStatementKind = (ConformanceStatementKind)theEObject;
				T result = caseConformanceStatementKind(conformanceStatementKind);
				if (result == null) result = caseElement(conformanceStatementKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT: {
				Consent consent = (Consent)theEObject;
				T result = caseConsent(consent);
				if (result == null) result = caseDomainResource(consent);
				if (result == null) result = caseResource(consent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_AGENT: {
				ConsentAgent consentAgent = (ConsentAgent)theEObject;
				T result = caseConsentAgent(consentAgent);
				if (result == null) result = caseBackboneElement(consentAgent);
				if (result == null) result = caseElement(consentAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_AGENT1: {
				ConsentAgent1 consentAgent1 = (ConsentAgent1)theEObject;
				T result = caseConsentAgent1(consentAgent1);
				if (result == null) result = caseBackboneElement(consentAgent1);
				if (result == null) result = caseElement(consentAgent1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_EXCEPT: {
				ConsentExcept consentExcept = (ConsentExcept)theEObject;
				T result = caseConsentExcept(consentExcept);
				if (result == null) result = caseBackboneElement(consentExcept);
				if (result == null) result = caseElement(consentExcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_FRIENDLY: {
				ConsentFriendly consentFriendly = (ConsentFriendly)theEObject;
				T result = caseConsentFriendly(consentFriendly);
				if (result == null) result = caseBackboneElement(consentFriendly);
				if (result == null) result = caseElement(consentFriendly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_LEGAL: {
				ConsentLegal consentLegal = (ConsentLegal)theEObject;
				T result = caseConsentLegal(consentLegal);
				if (result == null) result = caseBackboneElement(consentLegal);
				if (result == null) result = caseElement(consentLegal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_STATUS: {
				ConsentStatus consentStatus = (ConsentStatus)theEObject;
				T result = caseConsentStatus(consentStatus);
				if (result == null) result = caseElement(consentStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSTRAINT_SEVERITY: {
				ConstraintSeverity constraintSeverity = (ConstraintSeverity)theEObject;
				T result = caseConstraintSeverity(constraintSeverity);
				if (result == null) result = caseElement(constraintSeverity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTACT_POINT: {
				ContactPoint contactPoint = (ContactPoint)theEObject;
				T result = caseContactPoint(contactPoint);
				if (result == null) result = caseElement(contactPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTACT_POINT_SYSTEM: {
				ContactPointSystem contactPointSystem = (ContactPointSystem)theEObject;
				T result = caseContactPointSystem(contactPointSystem);
				if (result == null) result = caseElement(contactPointSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTACT_POINT_USE: {
				ContactPointUse contactPointUse = (ContactPointUse)theEObject;
				T result = caseContactPointUse(contactPointUse);
				if (result == null) result = caseElement(contactPointUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTENT_TYPE: {
				ContentType contentType = (ContentType)theEObject;
				T result = caseContentType(contentType);
				if (result == null) result = caseElement(contentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT: {
				Contract contract = (Contract)theEObject;
				T result = caseContract(contract);
				if (result == null) result = caseDomainResource(contract);
				if (result == null) result = caseResource(contract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_AGENT: {
				ContractAgent contractAgent = (ContractAgent)theEObject;
				T result = caseContractAgent(contractAgent);
				if (result == null) result = caseBackboneElement(contractAgent);
				if (result == null) result = caseElement(contractAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_AGENT1: {
				ContractAgent1 contractAgent1 = (ContractAgent1)theEObject;
				T result = caseContractAgent1(contractAgent1);
				if (result == null) result = caseBackboneElement(contractAgent1);
				if (result == null) result = caseElement(contractAgent1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_FRIENDLY: {
				ContractFriendly contractFriendly = (ContractFriendly)theEObject;
				T result = caseContractFriendly(contractFriendly);
				if (result == null) result = caseBackboneElement(contractFriendly);
				if (result == null) result = caseElement(contractFriendly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_LEGAL: {
				ContractLegal contractLegal = (ContractLegal)theEObject;
				T result = caseContractLegal(contractLegal);
				if (result == null) result = caseBackboneElement(contractLegal);
				if (result == null) result = caseElement(contractLegal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_RULE: {
				ContractRule contractRule = (ContractRule)theEObject;
				T result = caseContractRule(contractRule);
				if (result == null) result = caseBackboneElement(contractRule);
				if (result == null) result = caseElement(contractRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_SIGNER: {
				ContractSigner contractSigner = (ContractSigner)theEObject;
				T result = caseContractSigner(contractSigner);
				if (result == null) result = caseBackboneElement(contractSigner);
				if (result == null) result = caseElement(contractSigner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_TERM: {
				ContractTerm contractTerm = (ContractTerm)theEObject;
				T result = caseContractTerm(contractTerm);
				if (result == null) result = caseBackboneElement(contractTerm);
				if (result == null) result = caseElement(contractTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_VALUED_ITEM: {
				ContractValuedItem contractValuedItem = (ContractValuedItem)theEObject;
				T result = caseContractValuedItem(contractValuedItem);
				if (result == null) result = caseBackboneElement(contractValuedItem);
				if (result == null) result = caseElement(contractValuedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_VALUED_ITEM1: {
				ContractValuedItem1 contractValuedItem1 = (ContractValuedItem1)theEObject;
				T result = caseContractValuedItem1(contractValuedItem1);
				if (result == null) result = caseBackboneElement(contractValuedItem1);
				if (result == null) result = caseElement(contractValuedItem1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COUNT: {
				Count count = (Count)theEObject;
				T result = caseCount(count);
				if (result == null) result = caseQuantity(count);
				if (result == null) result = caseElement(count);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE: {
				Coverage coverage = (Coverage)theEObject;
				T result = caseCoverage(coverage);
				if (result == null) result = caseDomainResource(coverage);
				if (result == null) result = caseResource(coverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATA_ELEMENT: {
				DataElement dataElement = (DataElement)theEObject;
				T result = caseDataElement(dataElement);
				if (result == null) result = caseDomainResource(dataElement);
				if (result == null) result = caseResource(dataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATA_ELEMENT_CONTACT: {
				DataElementContact dataElementContact = (DataElementContact)theEObject;
				T result = caseDataElementContact(dataElementContact);
				if (result == null) result = caseBackboneElement(dataElementContact);
				if (result == null) result = caseElement(dataElementContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATA_ELEMENT_MAPPING: {
				DataElementMapping dataElementMapping = (DataElementMapping)theEObject;
				T result = caseDataElementMapping(dataElementMapping);
				if (result == null) result = caseBackboneElement(dataElementMapping);
				if (result == null) result = caseElement(dataElementMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATA_ELEMENT_STRINGENCY: {
				DataElementStringency dataElementStringency = (DataElementStringency)theEObject;
				T result = caseDataElementStringency(dataElementStringency);
				if (result == null) result = caseElement(dataElementStringency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATA_REQUIREMENT: {
				DataRequirement dataRequirement = (DataRequirement)theEObject;
				T result = caseDataRequirement(dataRequirement);
				if (result == null) result = caseElement(dataRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER: {
				DataRequirementCodeFilter dataRequirementCodeFilter = (DataRequirementCodeFilter)theEObject;
				T result = caseDataRequirementCodeFilter(dataRequirementCodeFilter);
				if (result == null) result = caseElement(dataRequirementCodeFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER: {
				DataRequirementDateFilter dataRequirementDateFilter = (DataRequirementDateFilter)theEObject;
				T result = caseDataRequirementDateFilter(dataRequirementDateFilter);
				if (result == null) result = caseElement(dataRequirementDateFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = caseElement(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = caseElement(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DAYS_OF_WEEK: {
				DaysOfWeek daysOfWeek = (DaysOfWeek)theEObject;
				T result = caseDaysOfWeek(daysOfWeek);
				if (result == null) result = caseElement(daysOfWeek);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DECIMAL: {
				Decimal decimal = (Decimal)theEObject;
				T result = caseDecimal(decimal);
				if (result == null) result = caseElement(decimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DECISION_SUPPORT_RULE: {
				DecisionSupportRule decisionSupportRule = (DecisionSupportRule)theEObject;
				T result = caseDecisionSupportRule(decisionSupportRule);
				if (result == null) result = caseDomainResource(decisionSupportRule);
				if (result == null) result = caseResource(decisionSupportRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE: {
				DecisionSupportServiceModule decisionSupportServiceModule = (DecisionSupportServiceModule)theEObject;
				T result = caseDecisionSupportServiceModule(decisionSupportServiceModule);
				if (result == null) result = caseDomainResource(decisionSupportServiceModule);
				if (result == null) result = caseResource(decisionSupportServiceModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DETECTED_ISSUE: {
				DetectedIssue detectedIssue = (DetectedIssue)theEObject;
				T result = caseDetectedIssue(detectedIssue);
				if (result == null) result = caseDomainResource(detectedIssue);
				if (result == null) result = caseResource(detectedIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DETECTED_ISSUE_MITIGATION: {
				DetectedIssueMitigation detectedIssueMitigation = (DetectedIssueMitigation)theEObject;
				T result = caseDetectedIssueMitigation(detectedIssueMitigation);
				if (result == null) result = caseBackboneElement(detectedIssueMitigation);
				if (result == null) result = caseElement(detectedIssueMitigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DETECTED_ISSUE_SEVERITY: {
				DetectedIssueSeverity detectedIssueSeverity = (DetectedIssueSeverity)theEObject;
				T result = caseDetectedIssueSeverity(detectedIssueSeverity);
				if (result == null) result = caseElement(detectedIssueSeverity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseDomainResource(device);
				if (result == null) result = caseResource(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_COMPONENT: {
				DeviceComponent deviceComponent = (DeviceComponent)theEObject;
				T result = caseDeviceComponent(deviceComponent);
				if (result == null) result = caseDomainResource(deviceComponent);
				if (result == null) result = caseResource(deviceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION: {
				DeviceComponentProductionSpecification deviceComponentProductionSpecification = (DeviceComponentProductionSpecification)theEObject;
				T result = caseDeviceComponentProductionSpecification(deviceComponentProductionSpecification);
				if (result == null) result = caseBackboneElement(deviceComponentProductionSpecification);
				if (result == null) result = caseElement(deviceComponentProductionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC: {
				DeviceMetric deviceMetric = (DeviceMetric)theEObject;
				T result = caseDeviceMetric(deviceMetric);
				if (result == null) result = caseDomainResource(deviceMetric);
				if (result == null) result = caseResource(deviceMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC_CALIBRATION: {
				DeviceMetricCalibration deviceMetricCalibration = (DeviceMetricCalibration)theEObject;
				T result = caseDeviceMetricCalibration(deviceMetricCalibration);
				if (result == null) result = caseBackboneElement(deviceMetricCalibration);
				if (result == null) result = caseElement(deviceMetricCalibration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE: {
				DeviceMetricCalibrationState deviceMetricCalibrationState = (DeviceMetricCalibrationState)theEObject;
				T result = caseDeviceMetricCalibrationState(deviceMetricCalibrationState);
				if (result == null) result = caseElement(deviceMetricCalibrationState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE: {
				DeviceMetricCalibrationType deviceMetricCalibrationType = (DeviceMetricCalibrationType)theEObject;
				T result = caseDeviceMetricCalibrationType(deviceMetricCalibrationType);
				if (result == null) result = caseElement(deviceMetricCalibrationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC_CATEGORY: {
				DeviceMetricCategory deviceMetricCategory = (DeviceMetricCategory)theEObject;
				T result = caseDeviceMetricCategory(deviceMetricCategory);
				if (result == null) result = caseElement(deviceMetricCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC_COLOR: {
				DeviceMetricColor deviceMetricColor = (DeviceMetricColor)theEObject;
				T result = caseDeviceMetricColor(deviceMetricColor);
				if (result == null) result = caseElement(deviceMetricColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS: {
				DeviceMetricOperationalStatus deviceMetricOperationalStatus = (DeviceMetricOperationalStatus)theEObject;
				T result = caseDeviceMetricOperationalStatus(deviceMetricOperationalStatus);
				if (result == null) result = caseElement(deviceMetricOperationalStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_STATUS: {
				DeviceStatus deviceStatus = (DeviceStatus)theEObject;
				T result = caseDeviceStatus(deviceStatus);
				if (result == null) result = caseElement(deviceStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_USE_REQUEST: {
				DeviceUseRequest deviceUseRequest = (DeviceUseRequest)theEObject;
				T result = caseDeviceUseRequest(deviceUseRequest);
				if (result == null) result = caseDomainResource(deviceUseRequest);
				if (result == null) result = caseResource(deviceUseRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_USE_REQUEST_PRIORITY: {
				DeviceUseRequestPriority deviceUseRequestPriority = (DeviceUseRequestPriority)theEObject;
				T result = caseDeviceUseRequestPriority(deviceUseRequestPriority);
				if (result == null) result = caseElement(deviceUseRequestPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_USE_REQUEST_STATUS: {
				DeviceUseRequestStatus deviceUseRequestStatus = (DeviceUseRequestStatus)theEObject;
				T result = caseDeviceUseRequestStatus(deviceUseRequestStatus);
				if (result == null) result = caseElement(deviceUseRequestStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_USE_STATEMENT: {
				DeviceUseStatement deviceUseStatement = (DeviceUseStatement)theEObject;
				T result = caseDeviceUseStatement(deviceUseStatement);
				if (result == null) result = caseDomainResource(deviceUseStatement);
				if (result == null) result = caseResource(deviceUseStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DIAGNOSTIC_ORDER: {
				DiagnosticOrder diagnosticOrder = (DiagnosticOrder)theEObject;
				T result = caseDiagnosticOrder(diagnosticOrder);
				if (result == null) result = caseDomainResource(diagnosticOrder);
				if (result == null) result = caseResource(diagnosticOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DIAGNOSTIC_ORDER_EVENT: {
				DiagnosticOrderEvent diagnosticOrderEvent = (DiagnosticOrderEvent)theEObject;
				T result = caseDiagnosticOrderEvent(diagnosticOrderEvent);
				if (result == null) result = caseBackboneElement(diagnosticOrderEvent);
				if (result == null) result = caseElement(diagnosticOrderEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM: {
				DiagnosticOrderItem diagnosticOrderItem = (DiagnosticOrderItem)theEObject;
				T result = caseDiagnosticOrderItem(diagnosticOrderItem);
				if (result == null) result = caseBackboneElement(diagnosticOrderItem);
				if (result == null) result = caseElement(diagnosticOrderItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DIAGNOSTIC_ORDER_PRIORITY: {
				DiagnosticOrderPriority diagnosticOrderPriority = (DiagnosticOrderPriority)theEObject;
				T result = caseDiagnosticOrderPriority(diagnosticOrderPriority);
				if (result == null) result = caseElement(diagnosticOrderPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DIAGNOSTIC_ORDER_STATUS: {
				DiagnosticOrderStatus diagnosticOrderStatus = (DiagnosticOrderStatus)theEObject;
				T result = caseDiagnosticOrderStatus(diagnosticOrderStatus);
				if (result == null) result = caseElement(diagnosticOrderStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DIAGNOSTIC_REPORT: {
				DiagnosticReport diagnosticReport = (DiagnosticReport)theEObject;
				T result = caseDiagnosticReport(diagnosticReport);
				if (result == null) result = caseDomainResource(diagnosticReport);
				if (result == null) result = caseResource(diagnosticReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DIAGNOSTIC_REPORT_IMAGE: {
				DiagnosticReportImage diagnosticReportImage = (DiagnosticReportImage)theEObject;
				T result = caseDiagnosticReportImage(diagnosticReportImage);
				if (result == null) result = caseBackboneElement(diagnosticReportImage);
				if (result == null) result = caseElement(diagnosticReportImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS: {
				DiagnosticReportStatus diagnosticReportStatus = (DiagnosticReportStatus)theEObject;
				T result = caseDiagnosticReportStatus(diagnosticReportStatus);
				if (result == null) result = caseElement(diagnosticReportStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DIGITAL_MEDIA_TYPE: {
				DigitalMediaType digitalMediaType = (DigitalMediaType)theEObject;
				T result = caseDigitalMediaType(digitalMediaType);
				if (result == null) result = caseElement(digitalMediaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DISTANCE: {
				Distance distance = (Distance)theEObject;
				T result = caseDistance(distance);
				if (result == null) result = caseQuantity(distance);
				if (result == null) result = caseElement(distance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_MANIFEST: {
				DocumentManifest documentManifest = (DocumentManifest)theEObject;
				T result = caseDocumentManifest(documentManifest);
				if (result == null) result = caseDomainResource(documentManifest);
				if (result == null) result = caseResource(documentManifest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT: {
				DocumentManifestContent documentManifestContent = (DocumentManifestContent)theEObject;
				T result = caseDocumentManifestContent(documentManifestContent);
				if (result == null) result = caseBackboneElement(documentManifestContent);
				if (result == null) result = caseElement(documentManifestContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_MANIFEST_RELATED: {
				DocumentManifestRelated documentManifestRelated = (DocumentManifestRelated)theEObject;
				T result = caseDocumentManifestRelated(documentManifestRelated);
				if (result == null) result = caseBackboneElement(documentManifestRelated);
				if (result == null) result = caseElement(documentManifestRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_MODE: {
				DocumentMode documentMode = (DocumentMode)theEObject;
				T result = caseDocumentMode(documentMode);
				if (result == null) result = caseElement(documentMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_REFERENCE: {
				DocumentReference documentReference = (DocumentReference)theEObject;
				T result = caseDocumentReference(documentReference);
				if (result == null) result = caseDomainResource(documentReference);
				if (result == null) result = caseResource(documentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT: {
				DocumentReferenceContent documentReferenceContent = (DocumentReferenceContent)theEObject;
				T result = caseDocumentReferenceContent(documentReferenceContent);
				if (result == null) result = caseBackboneElement(documentReferenceContent);
				if (result == null) result = caseElement(documentReferenceContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT: {
				DocumentReferenceContext documentReferenceContext = (DocumentReferenceContext)theEObject;
				T result = caseDocumentReferenceContext(documentReferenceContext);
				if (result == null) result = caseBackboneElement(documentReferenceContext);
				if (result == null) result = caseElement(documentReferenceContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_REFERENCE_RELATED: {
				DocumentReferenceRelated documentReferenceRelated = (DocumentReferenceRelated)theEObject;
				T result = caseDocumentReferenceRelated(documentReferenceRelated);
				if (result == null) result = caseBackboneElement(documentReferenceRelated);
				if (result == null) result = caseElement(documentReferenceRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_REFERENCE_RELATES_TO: {
				DocumentReferenceRelatesTo documentReferenceRelatesTo = (DocumentReferenceRelatesTo)theEObject;
				T result = caseDocumentReferenceRelatesTo(documentReferenceRelatesTo);
				if (result == null) result = caseBackboneElement(documentReferenceRelatesTo);
				if (result == null) result = caseElement(documentReferenceRelatesTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_REFERENCE_STATUS: {
				DocumentReferenceStatus documentReferenceStatus = (DocumentReferenceStatus)theEObject;
				T result = caseDocumentReferenceStatus(documentReferenceStatus);
				if (result == null) result = caseElement(documentReferenceStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE: {
				DocumentRelationshipType documentRelationshipType = (DocumentRelationshipType)theEObject;
				T result = caseDocumentRelationshipType(documentRelationshipType);
				if (result == null) result = caseElement(documentRelationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOMAIN_RESOURCE: {
				DomainResource domainResource = (DomainResource)theEObject;
				T result = caseDomainResource(domainResource);
				if (result == null) result = caseResource(domainResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DURATION: {
				Duration duration = (Duration)theEObject;
				T result = caseDuration(duration);
				if (result == null) result = caseQuantity(duration);
				if (result == null) result = caseElement(duration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DWEB_TYPE: {
				DWebType dWebType = (DWebType)theEObject;
				T result = caseDWebType(dWebType);
				if (result == null) result = caseElement(dWebType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION: {
				ElementDefinition elementDefinition = (ElementDefinition)theEObject;
				T result = caseElementDefinition(elementDefinition);
				if (result == null) result = caseElement(elementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_BASE: {
				ElementDefinitionBase elementDefinitionBase = (ElementDefinitionBase)theEObject;
				T result = caseElementDefinitionBase(elementDefinitionBase);
				if (result == null) result = caseElement(elementDefinitionBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_BINDING: {
				ElementDefinitionBinding elementDefinitionBinding = (ElementDefinitionBinding)theEObject;
				T result = caseElementDefinitionBinding(elementDefinitionBinding);
				if (result == null) result = caseElement(elementDefinitionBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_CONSTRAINT: {
				ElementDefinitionConstraint elementDefinitionConstraint = (ElementDefinitionConstraint)theEObject;
				T result = caseElementDefinitionConstraint(elementDefinitionConstraint);
				if (result == null) result = caseElement(elementDefinitionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_MAPPING: {
				ElementDefinitionMapping elementDefinitionMapping = (ElementDefinitionMapping)theEObject;
				T result = caseElementDefinitionMapping(elementDefinitionMapping);
				if (result == null) result = caseElement(elementDefinitionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_SLICING: {
				ElementDefinitionSlicing elementDefinitionSlicing = (ElementDefinitionSlicing)theEObject;
				T result = caseElementDefinitionSlicing(elementDefinitionSlicing);
				if (result == null) result = caseElement(elementDefinitionSlicing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_TYPE: {
				ElementDefinitionType elementDefinitionType = (ElementDefinitionType)theEObject;
				T result = caseElementDefinitionType(elementDefinitionType);
				if (result == null) result = caseElement(elementDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELIGIBILITY_REQUEST: {
				EligibilityRequest eligibilityRequest = (EligibilityRequest)theEObject;
				T result = caseEligibilityRequest(eligibilityRequest);
				if (result == null) result = caseDomainResource(eligibilityRequest);
				if (result == null) result = caseResource(eligibilityRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELIGIBILITY_RESPONSE: {
				EligibilityResponse eligibilityResponse = (EligibilityResponse)theEObject;
				T result = caseEligibilityResponse(eligibilityResponse);
				if (result == null) result = caseDomainResource(eligibilityResponse);
				if (result == null) result = caseResource(eligibilityResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE: {
				EligibilityResponseBenefitBalance eligibilityResponseBenefitBalance = (EligibilityResponseBenefitBalance)theEObject;
				T result = caseEligibilityResponseBenefitBalance(eligibilityResponseBenefitBalance);
				if (result == null) result = caseBackboneElement(eligibilityResponseBenefitBalance);
				if (result == null) result = caseElement(eligibilityResponseBenefitBalance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELIGIBILITY_RESPONSE_ERROR: {
				EligibilityResponseError eligibilityResponseError = (EligibilityResponseError)theEObject;
				T result = caseEligibilityResponseError(eligibilityResponseError);
				if (result == null) result = caseBackboneElement(eligibilityResponseError);
				if (result == null) result = caseElement(eligibilityResponseError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL: {
				EligibilityResponseFinancial eligibilityResponseFinancial = (EligibilityResponseFinancial)theEObject;
				T result = caseEligibilityResponseFinancial(eligibilityResponseFinancial);
				if (result == null) result = caseBackboneElement(eligibilityResponseFinancial);
				if (result == null) result = caseElement(eligibilityResponseFinancial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER: {
				Encounter encounter = (Encounter)theEObject;
				T result = caseEncounter(encounter);
				if (result == null) result = caseDomainResource(encounter);
				if (result == null) result = caseResource(encounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_CLASS: {
				EncounterClass encounterClass = (EncounterClass)theEObject;
				T result = caseEncounterClass(encounterClass);
				if (result == null) result = caseElement(encounterClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_HOSPITALIZATION: {
				EncounterHospitalization encounterHospitalization = (EncounterHospitalization)theEObject;
				T result = caseEncounterHospitalization(encounterHospitalization);
				if (result == null) result = caseBackboneElement(encounterHospitalization);
				if (result == null) result = caseElement(encounterHospitalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_LOCATION: {
				EncounterLocation encounterLocation = (EncounterLocation)theEObject;
				T result = caseEncounterLocation(encounterLocation);
				if (result == null) result = caseBackboneElement(encounterLocation);
				if (result == null) result = caseElement(encounterLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_LOCATION_STATUS: {
				EncounterLocationStatus encounterLocationStatus = (EncounterLocationStatus)theEObject;
				T result = caseEncounterLocationStatus(encounterLocationStatus);
				if (result == null) result = caseElement(encounterLocationStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_PARTICIPANT: {
				EncounterParticipant encounterParticipant = (EncounterParticipant)theEObject;
				T result = caseEncounterParticipant(encounterParticipant);
				if (result == null) result = caseBackboneElement(encounterParticipant);
				if (result == null) result = caseElement(encounterParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_STATE: {
				EncounterState encounterState = (EncounterState)theEObject;
				T result = caseEncounterState(encounterState);
				if (result == null) result = caseElement(encounterState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_STATUS_HISTORY: {
				EncounterStatusHistory encounterStatusHistory = (EncounterStatusHistory)theEObject;
				T result = caseEncounterStatusHistory(encounterStatusHistory);
				if (result == null) result = caseBackboneElement(encounterStatusHistory);
				if (result == null) result = caseElement(encounterStatusHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENDPOINT: {
				Endpoint endpoint = (Endpoint)theEObject;
				T result = caseEndpoint(endpoint);
				if (result == null) result = caseDomainResource(endpoint);
				if (result == null) result = caseResource(endpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENDPOINT_STATUS: {
				EndpointStatus endpointStatus = (EndpointStatus)theEObject;
				T result = caseEndpointStatus(endpointStatus);
				if (result == null) result = caseElement(endpointStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENROLLMENT_REQUEST: {
				EnrollmentRequest enrollmentRequest = (EnrollmentRequest)theEObject;
				T result = caseEnrollmentRequest(enrollmentRequest);
				if (result == null) result = caseDomainResource(enrollmentRequest);
				if (result == null) result = caseResource(enrollmentRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENROLLMENT_RESPONSE: {
				EnrollmentResponse enrollmentResponse = (EnrollmentResponse)theEObject;
				T result = caseEnrollmentResponse(enrollmentResponse);
				if (result == null) result = caseDomainResource(enrollmentResponse);
				if (result == null) result = caseResource(enrollmentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EPISODE_OF_CARE: {
				EpisodeOfCare episodeOfCare = (EpisodeOfCare)theEObject;
				T result = caseEpisodeOfCare(episodeOfCare);
				if (result == null) result = caseDomainResource(episodeOfCare);
				if (result == null) result = caseResource(episodeOfCare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EPISODE_OF_CARE_STATUS: {
				EpisodeOfCareStatus episodeOfCareStatus = (EpisodeOfCareStatus)theEObject;
				T result = caseEpisodeOfCareStatus(episodeOfCareStatus);
				if (result == null) result = caseElement(episodeOfCareStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EPISODE_OF_CARE_STATUS_HISTORY: {
				EpisodeOfCareStatusHistory episodeOfCareStatusHistory = (EpisodeOfCareStatusHistory)theEObject;
				T result = caseEpisodeOfCareStatusHistory(episodeOfCareStatusHistory);
				if (result == null) result = caseBackboneElement(episodeOfCareStatusHistory);
				if (result == null) result = caseElement(episodeOfCareStatusHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EVENT_TIMING: {
				EventTiming eventTiming = (EventTiming)theEObject;
				T result = caseEventTiming(eventTiming);
				if (result == null) result = caseElement(eventTiming);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPANSION_PROFILE: {
				ExpansionProfile expansionProfile = (ExpansionProfile)theEObject;
				T result = caseExpansionProfile(expansionProfile);
				if (result == null) result = caseDomainResource(expansionProfile);
				if (result == null) result = caseResource(expansionProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM: {
				ExpansionProfileCodeSystem expansionProfileCodeSystem = (ExpansionProfileCodeSystem)theEObject;
				T result = caseExpansionProfileCodeSystem(expansionProfileCodeSystem);
				if (result == null) result = caseBackboneElement(expansionProfileCodeSystem);
				if (result == null) result = caseElement(expansionProfileCodeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM1: {
				ExpansionProfileCodeSystem1 expansionProfileCodeSystem1 = (ExpansionProfileCodeSystem1)theEObject;
				T result = caseExpansionProfileCodeSystem1(expansionProfileCodeSystem1);
				if (result == null) result = caseBackboneElement(expansionProfileCodeSystem1);
				if (result == null) result = caseElement(expansionProfileCodeSystem1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM2: {
				ExpansionProfileCodeSystem2 expansionProfileCodeSystem2 = (ExpansionProfileCodeSystem2)theEObject;
				T result = caseExpansionProfileCodeSystem2(expansionProfileCodeSystem2);
				if (result == null) result = caseBackboneElement(expansionProfileCodeSystem2);
				if (result == null) result = caseElement(expansionProfileCodeSystem2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPANSION_PROFILE_CONTACT: {
				ExpansionProfileContact expansionProfileContact = (ExpansionProfileContact)theEObject;
				T result = caseExpansionProfileContact(expansionProfileContact);
				if (result == null) result = caseBackboneElement(expansionProfileContact);
				if (result == null) result = caseElement(expansionProfileContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION: {
				ExpansionProfileDesignation expansionProfileDesignation = (ExpansionProfileDesignation)theEObject;
				T result = caseExpansionProfileDesignation(expansionProfileDesignation);
				if (result == null) result = caseBackboneElement(expansionProfileDesignation);
				if (result == null) result = caseElement(expansionProfileDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION1: {
				ExpansionProfileDesignation1 expansionProfileDesignation1 = (ExpansionProfileDesignation1)theEObject;
				T result = caseExpansionProfileDesignation1(expansionProfileDesignation1);
				if (result == null) result = caseBackboneElement(expansionProfileDesignation1);
				if (result == null) result = caseElement(expansionProfileDesignation1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION2: {
				ExpansionProfileDesignation2 expansionProfileDesignation2 = (ExpansionProfileDesignation2)theEObject;
				T result = caseExpansionProfileDesignation2(expansionProfileDesignation2);
				if (result == null) result = caseBackboneElement(expansionProfileDesignation2);
				if (result == null) result = caseElement(expansionProfileDesignation2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPANSION_PROFILE_EXCLUDE: {
				ExpansionProfileExclude expansionProfileExclude = (ExpansionProfileExclude)theEObject;
				T result = caseExpansionProfileExclude(expansionProfileExclude);
				if (result == null) result = caseBackboneElement(expansionProfileExclude);
				if (result == null) result = caseElement(expansionProfileExclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPANSION_PROFILE_EXCLUDE1: {
				ExpansionProfileExclude1 expansionProfileExclude1 = (ExpansionProfileExclude1)theEObject;
				T result = caseExpansionProfileExclude1(expansionProfileExclude1);
				if (result == null) result = caseBackboneElement(expansionProfileExclude1);
				if (result == null) result = caseElement(expansionProfileExclude1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPANSION_PROFILE_INCLUDE: {
				ExpansionProfileInclude expansionProfileInclude = (ExpansionProfileInclude)theEObject;
				T result = caseExpansionProfileInclude(expansionProfileInclude);
				if (result == null) result = caseBackboneElement(expansionProfileInclude);
				if (result == null) result = caseElement(expansionProfileInclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPANSION_PROFILE_INCLUDE1: {
				ExpansionProfileInclude1 expansionProfileInclude1 = (ExpansionProfileInclude1)theEObject;
				T result = caseExpansionProfileInclude1(expansionProfileInclude1);
				if (result == null) result = caseBackboneElement(expansionProfileInclude1);
				if (result == null) result = caseElement(expansionProfileInclude1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT: {
				ExplanationOfBenefit explanationOfBenefit = (ExplanationOfBenefit)theEObject;
				T result = caseExplanationOfBenefit(explanationOfBenefit);
				if (result == null) result = caseDomainResource(explanationOfBenefit);
				if (result == null) result = caseResource(explanationOfBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADD_ITEM: {
				ExplanationOfBenefitAddItem explanationOfBenefitAddItem = (ExplanationOfBenefitAddItem)theEObject;
				T result = caseExplanationOfBenefitAddItem(explanationOfBenefitAddItem);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAddItem);
				if (result == null) result = caseElement(explanationOfBenefitAddItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION: {
				ExplanationOfBenefitAdjudication explanationOfBenefitAdjudication = (ExplanationOfBenefitAdjudication)theEObject;
				T result = caseExplanationOfBenefitAdjudication(explanationOfBenefitAdjudication);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAdjudication);
				if (result == null) result = caseElement(explanationOfBenefitAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION1: {
				ExplanationOfBenefitAdjudication1 explanationOfBenefitAdjudication1 = (ExplanationOfBenefitAdjudication1)theEObject;
				T result = caseExplanationOfBenefitAdjudication1(explanationOfBenefitAdjudication1);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAdjudication1);
				if (result == null) result = caseElement(explanationOfBenefitAdjudication1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION2: {
				ExplanationOfBenefitAdjudication2 explanationOfBenefitAdjudication2 = (ExplanationOfBenefitAdjudication2)theEObject;
				T result = caseExplanationOfBenefitAdjudication2(explanationOfBenefitAdjudication2);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAdjudication2);
				if (result == null) result = caseElement(explanationOfBenefitAdjudication2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION3: {
				ExplanationOfBenefitAdjudication3 explanationOfBenefitAdjudication3 = (ExplanationOfBenefitAdjudication3)theEObject;
				T result = caseExplanationOfBenefitAdjudication3(explanationOfBenefitAdjudication3);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAdjudication3);
				if (result == null) result = caseElement(explanationOfBenefitAdjudication3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION4: {
				ExplanationOfBenefitAdjudication4 explanationOfBenefitAdjudication4 = (ExplanationOfBenefitAdjudication4)theEObject;
				T result = caseExplanationOfBenefitAdjudication4(explanationOfBenefitAdjudication4);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAdjudication4);
				if (result == null) result = caseElement(explanationOfBenefitAdjudication4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE: {
				ExplanationOfBenefitBenefitBalance explanationOfBenefitBenefitBalance = (ExplanationOfBenefitBenefitBalance)theEObject;
				T result = caseExplanationOfBenefitBenefitBalance(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseBackboneElement(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseElement(explanationOfBenefitBenefitBalance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE: {
				ExplanationOfBenefitCoverage explanationOfBenefitCoverage = (ExplanationOfBenefitCoverage)theEObject;
				T result = caseExplanationOfBenefitCoverage(explanationOfBenefitCoverage);
				if (result == null) result = caseBackboneElement(explanationOfBenefitCoverage);
				if (result == null) result = caseElement(explanationOfBenefitCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL: {
				ExplanationOfBenefitDetail explanationOfBenefitDetail = (ExplanationOfBenefitDetail)theEObject;
				T result = caseExplanationOfBenefitDetail(explanationOfBenefitDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitDetail);
				if (result == null) result = caseElement(explanationOfBenefitDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL1: {
				ExplanationOfBenefitDetail1 explanationOfBenefitDetail1 = (ExplanationOfBenefitDetail1)theEObject;
				T result = caseExplanationOfBenefitDetail1(explanationOfBenefitDetail1);
				if (result == null) result = caseBackboneElement(explanationOfBenefitDetail1);
				if (result == null) result = caseElement(explanationOfBenefitDetail1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS: {
				ExplanationOfBenefitDiagnosis explanationOfBenefitDiagnosis = (ExplanationOfBenefitDiagnosis)theEObject;
				T result = caseExplanationOfBenefitDiagnosis(explanationOfBenefitDiagnosis);
				if (result == null) result = caseBackboneElement(explanationOfBenefitDiagnosis);
				if (result == null) result = caseElement(explanationOfBenefitDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_FINANCIAL: {
				ExplanationOfBenefitFinancial explanationOfBenefitFinancial = (ExplanationOfBenefitFinancial)theEObject;
				T result = caseExplanationOfBenefitFinancial(explanationOfBenefitFinancial);
				if (result == null) result = caseBackboneElement(explanationOfBenefitFinancial);
				if (result == null) result = caseElement(explanationOfBenefitFinancial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM: {
				ExplanationOfBenefitItem explanationOfBenefitItem = (ExplanationOfBenefitItem)theEObject;
				T result = caseExplanationOfBenefitItem(explanationOfBenefitItem);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItem);
				if (result == null) result = caseElement(explanationOfBenefitItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH: {
				ExplanationOfBenefitMissingTeeth explanationOfBenefitMissingTeeth = (ExplanationOfBenefitMissingTeeth)theEObject;
				T result = caseExplanationOfBenefitMissingTeeth(explanationOfBenefitMissingTeeth);
				if (result == null) result = caseBackboneElement(explanationOfBenefitMissingTeeth);
				if (result == null) result = caseElement(explanationOfBenefitMissingTeeth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_NOTE: {
				ExplanationOfBenefitNote explanationOfBenefitNote = (ExplanationOfBenefitNote)theEObject;
				T result = caseExplanationOfBenefitNote(explanationOfBenefitNote);
				if (result == null) result = caseBackboneElement(explanationOfBenefitNote);
				if (result == null) result = caseElement(explanationOfBenefitNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET: {
				ExplanationOfBenefitOnset explanationOfBenefitOnset = (ExplanationOfBenefitOnset)theEObject;
				T result = caseExplanationOfBenefitOnset(explanationOfBenefitOnset);
				if (result == null) result = caseBackboneElement(explanationOfBenefitOnset);
				if (result == null) result = caseElement(explanationOfBenefitOnset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE: {
				ExplanationOfBenefitPayee explanationOfBenefitPayee = (ExplanationOfBenefitPayee)theEObject;
				T result = caseExplanationOfBenefitPayee(explanationOfBenefitPayee);
				if (result == null) result = caseBackboneElement(explanationOfBenefitPayee);
				if (result == null) result = caseElement(explanationOfBenefitPayee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCEDURE: {
				ExplanationOfBenefitProcedure explanationOfBenefitProcedure = (ExplanationOfBenefitProcedure)theEObject;
				T result = caseExplanationOfBenefitProcedure(explanationOfBenefitProcedure);
				if (result == null) result = caseBackboneElement(explanationOfBenefitProcedure);
				if (result == null) result = caseElement(explanationOfBenefitProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROSTHESIS: {
				ExplanationOfBenefitProsthesis explanationOfBenefitProsthesis = (ExplanationOfBenefitProsthesis)theEObject;
				T result = caseExplanationOfBenefitProsthesis(explanationOfBenefitProsthesis);
				if (result == null) result = caseBackboneElement(explanationOfBenefitProsthesis);
				if (result == null) result = caseElement(explanationOfBenefitProsthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED: {
				ExplanationOfBenefitRelated explanationOfBenefitRelated = (ExplanationOfBenefitRelated)theEObject;
				T result = caseExplanationOfBenefitRelated(explanationOfBenefitRelated);
				if (result == null) result = caseBackboneElement(explanationOfBenefitRelated);
				if (result == null) result = caseElement(explanationOfBenefitRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUB_DETAIL: {
				ExplanationOfBenefitSubDetail explanationOfBenefitSubDetail = (ExplanationOfBenefitSubDetail)theEObject;
				T result = caseExplanationOfBenefitSubDetail(explanationOfBenefitSubDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitSubDetail);
				if (result == null) result = caseElement(explanationOfBenefitSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseElement(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXTENSION_CONTEXT: {
				ExtensionContext extensionContext = (ExtensionContext)theEObject;
				T result = caseExtensionContext(extensionContext);
				if (result == null) result = caseElement(extensionContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FAMILY_HISTORY_STATUS: {
				FamilyHistoryStatus familyHistoryStatus = (FamilyHistoryStatus)theEObject;
				T result = caseFamilyHistoryStatus(familyHistoryStatus);
				if (result == null) result = caseElement(familyHistoryStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FAMILY_MEMBER_HISTORY: {
				FamilyMemberHistory familyMemberHistory = (FamilyMemberHistory)theEObject;
				T result = caseFamilyMemberHistory(familyMemberHistory);
				if (result == null) result = caseDomainResource(familyMemberHistory);
				if (result == null) result = caseResource(familyMemberHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION: {
				FamilyMemberHistoryCondition familyMemberHistoryCondition = (FamilyMemberHistoryCondition)theEObject;
				T result = caseFamilyMemberHistoryCondition(familyMemberHistoryCondition);
				if (result == null) result = caseBackboneElement(familyMemberHistoryCondition);
				if (result == null) result = caseElement(familyMemberHistoryCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FILTER_OPERATOR: {
				FilterOperator filterOperator = (FilterOperator)theEObject;
				T result = caseFilterOperator(filterOperator);
				if (result == null) result = caseElement(filterOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FLAG: {
				Flag flag = (Flag)theEObject;
				T result = caseFlag(flag);
				if (result == null) result = caseDomainResource(flag);
				if (result == null) result = caseResource(flag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FLAG_STATUS: {
				FlagStatus flagStatus = (FlagStatus)theEObject;
				T result = caseFlagStatus(flagStatus);
				if (result == null) result = caseElement(flagStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseDomainResource(goal);
				if (result == null) result = caseResource(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GOAL_OUTCOME: {
				GoalOutcome goalOutcome = (GoalOutcome)theEObject;
				T result = caseGoalOutcome(goalOutcome);
				if (result == null) result = caseBackboneElement(goalOutcome);
				if (result == null) result = caseElement(goalOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GOAL_STATUS: {
				GoalStatus goalStatus = (GoalStatus)theEObject;
				T result = caseGoalStatus(goalStatus);
				if (result == null) result = caseElement(goalStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseDomainResource(group);
				if (result == null) result = caseResource(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GROUP_CHARACTERISTIC: {
				GroupCharacteristic groupCharacteristic = (GroupCharacteristic)theEObject;
				T result = caseGroupCharacteristic(groupCharacteristic);
				if (result == null) result = caseBackboneElement(groupCharacteristic);
				if (result == null) result = caseElement(groupCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GROUP_MEMBER: {
				GroupMember groupMember = (GroupMember)theEObject;
				T result = caseGroupMember(groupMember);
				if (result == null) result = caseBackboneElement(groupMember);
				if (result == null) result = caseElement(groupMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GROUP_TYPE: {
				GroupType groupType = (GroupType)theEObject;
				T result = caseGroupType(groupType);
				if (result == null) result = caseElement(groupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GUIDANCE_RESPONSE: {
				GuidanceResponse guidanceResponse = (GuidanceResponse)theEObject;
				T result = caseGuidanceResponse(guidanceResponse);
				if (result == null) result = caseDomainResource(guidanceResponse);
				if (result == null) result = caseResource(guidanceResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GUIDANCE_RESPONSE_ACTION: {
				GuidanceResponseAction guidanceResponseAction = (GuidanceResponseAction)theEObject;
				T result = caseGuidanceResponseAction(guidanceResponseAction);
				if (result == null) result = caseBackboneElement(guidanceResponseAction);
				if (result == null) result = caseElement(guidanceResponseAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GUIDANCE_RESPONSE_BEHAVIOR: {
				GuidanceResponseBehavior guidanceResponseBehavior = (GuidanceResponseBehavior)theEObject;
				T result = caseGuidanceResponseBehavior(guidanceResponseBehavior);
				if (result == null) result = caseBackboneElement(guidanceResponseBehavior);
				if (result == null) result = caseElement(guidanceResponseBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION: {
				GuidanceResponseRelatedAction guidanceResponseRelatedAction = (GuidanceResponseRelatedAction)theEObject;
				T result = caseGuidanceResponseRelatedAction(guidanceResponseRelatedAction);
				if (result == null) result = caseBackboneElement(guidanceResponseRelatedAction);
				if (result == null) result = caseElement(guidanceResponseRelatedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GUIDANCE_RESPONSE_STATUS: {
				GuidanceResponseStatus guidanceResponseStatus = (GuidanceResponseStatus)theEObject;
				T result = caseGuidanceResponseStatus(guidanceResponseStatus);
				if (result == null) result = caseElement(guidanceResponseStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GUIDE_DEPENDENCY_TYPE: {
				GuideDependencyType guideDependencyType = (GuideDependencyType)theEObject;
				T result = caseGuideDependencyType(guideDependencyType);
				if (result == null) result = caseElement(guideDependencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GUIDE_PAGE_KIND: {
				GuidePageKind guidePageKind = (GuidePageKind)theEObject;
				T result = caseGuidePageKind(guidePageKind);
				if (result == null) result = caseElement(guidePageKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.HEALTHCARE_SERVICE: {
				HealthcareService healthcareService = (HealthcareService)theEObject;
				T result = caseHealthcareService(healthcareService);
				if (result == null) result = caseDomainResource(healthcareService);
				if (result == null) result = caseResource(healthcareService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME: {
				HealthcareServiceAvailableTime healthcareServiceAvailableTime = (HealthcareServiceAvailableTime)theEObject;
				T result = caseHealthcareServiceAvailableTime(healthcareServiceAvailableTime);
				if (result == null) result = caseBackboneElement(healthcareServiceAvailableTime);
				if (result == null) result = caseElement(healthcareServiceAvailableTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE: {
				HealthcareServiceNotAvailable healthcareServiceNotAvailable = (HealthcareServiceNotAvailable)theEObject;
				T result = caseHealthcareServiceNotAvailable(healthcareServiceNotAvailable);
				if (result == null) result = caseBackboneElement(healthcareServiceNotAvailable);
				if (result == null) result = caseElement(healthcareServiceNotAvailable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.HTTP_VERB: {
				HTTPVerb httpVerb = (HTTPVerb)theEObject;
				T result = caseHTTPVerb(httpVerb);
				if (result == null) result = caseElement(httpVerb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.HUMAN_NAME: {
				HumanName humanName = (HumanName)theEObject;
				T result = caseHumanName(humanName);
				if (result == null) result = caseElement(humanName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ID: {
				Id id = (Id)theEObject;
				T result = caseId(id);
				if (result == null) result = caseElement(id);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = caseElement(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IDENTIFIER_USE: {
				IdentifierUse identifierUse = (IdentifierUse)theEObject;
				T result = caseIdentifierUse(identifierUse);
				if (result == null) result = caseElement(identifierUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL: {
				IdentityAssuranceLevel identityAssuranceLevel = (IdentityAssuranceLevel)theEObject;
				T result = caseIdentityAssuranceLevel(identityAssuranceLevel);
				if (result == null) result = caseElement(identityAssuranceLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_EXCERPT: {
				ImagingExcerpt imagingExcerpt = (ImagingExcerpt)theEObject;
				T result = caseImagingExcerpt(imagingExcerpt);
				if (result == null) result = caseDomainResource(imagingExcerpt);
				if (result == null) result = caseResource(imagingExcerpt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_EXCERPT_DICOM: {
				ImagingExcerptDicom imagingExcerptDicom = (ImagingExcerptDicom)theEObject;
				T result = caseImagingExcerptDicom(imagingExcerptDicom);
				if (result == null) result = caseBackboneElement(imagingExcerptDicom);
				if (result == null) result = caseElement(imagingExcerptDicom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_EXCERPT_DICOM1: {
				ImagingExcerptDicom1 imagingExcerptDicom1 = (ImagingExcerptDicom1)theEObject;
				T result = caseImagingExcerptDicom1(imagingExcerptDicom1);
				if (result == null) result = caseBackboneElement(imagingExcerptDicom1);
				if (result == null) result = caseElement(imagingExcerptDicom1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_EXCERPT_DICOM2: {
				ImagingExcerptDicom2 imagingExcerptDicom2 = (ImagingExcerptDicom2)theEObject;
				T result = caseImagingExcerptDicom2(imagingExcerptDicom2);
				if (result == null) result = caseBackboneElement(imagingExcerptDicom2);
				if (result == null) result = caseElement(imagingExcerptDicom2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_EXCERPT_INSTANCE: {
				ImagingExcerptInstance imagingExcerptInstance = (ImagingExcerptInstance)theEObject;
				T result = caseImagingExcerptInstance(imagingExcerptInstance);
				if (result == null) result = caseBackboneElement(imagingExcerptInstance);
				if (result == null) result = caseElement(imagingExcerptInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_EXCERPT_SERIES: {
				ImagingExcerptSeries imagingExcerptSeries = (ImagingExcerptSeries)theEObject;
				T result = caseImagingExcerptSeries(imagingExcerptSeries);
				if (result == null) result = caseBackboneElement(imagingExcerptSeries);
				if (result == null) result = caseElement(imagingExcerptSeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_EXCERPT_STUDY: {
				ImagingExcerptStudy imagingExcerptStudy = (ImagingExcerptStudy)theEObject;
				T result = caseImagingExcerptStudy(imagingExcerptStudy);
				if (result == null) result = caseBackboneElement(imagingExcerptStudy);
				if (result == null) result = caseElement(imagingExcerptStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_EXCERPT_VIEWABLE: {
				ImagingExcerptViewable imagingExcerptViewable = (ImagingExcerptViewable)theEObject;
				T result = caseImagingExcerptViewable(imagingExcerptViewable);
				if (result == null) result = caseBackboneElement(imagingExcerptViewable);
				if (result == null) result = caseElement(imagingExcerptViewable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_OBJECT_SELECTION: {
				ImagingObjectSelection imagingObjectSelection = (ImagingObjectSelection)theEObject;
				T result = caseImagingObjectSelection(imagingObjectSelection);
				if (result == null) result = caseDomainResource(imagingObjectSelection);
				if (result == null) result = caseResource(imagingObjectSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_OBJECT_SELECTION_FRAME: {
				ImagingObjectSelectionFrame imagingObjectSelectionFrame = (ImagingObjectSelectionFrame)theEObject;
				T result = caseImagingObjectSelectionFrame(imagingObjectSelectionFrame);
				if (result == null) result = caseBackboneElement(imagingObjectSelectionFrame);
				if (result == null) result = caseElement(imagingObjectSelectionFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE: {
				ImagingObjectSelectionInstance imagingObjectSelectionInstance = (ImagingObjectSelectionInstance)theEObject;
				T result = caseImagingObjectSelectionInstance(imagingObjectSelectionInstance);
				if (result == null) result = caseBackboneElement(imagingObjectSelectionInstance);
				if (result == null) result = caseElement(imagingObjectSelectionInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_OBJECT_SELECTION_SERIES: {
				ImagingObjectSelectionSeries imagingObjectSelectionSeries = (ImagingObjectSelectionSeries)theEObject;
				T result = caseImagingObjectSelectionSeries(imagingObjectSelectionSeries);
				if (result == null) result = caseBackboneElement(imagingObjectSelectionSeries);
				if (result == null) result = caseElement(imagingObjectSelectionSeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_OBJECT_SELECTION_STUDY: {
				ImagingObjectSelectionStudy imagingObjectSelectionStudy = (ImagingObjectSelectionStudy)theEObject;
				T result = caseImagingObjectSelectionStudy(imagingObjectSelectionStudy);
				if (result == null) result = caseBackboneElement(imagingObjectSelectionStudy);
				if (result == null) result = caseElement(imagingObjectSelectionStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_STUDY: {
				ImagingStudy imagingStudy = (ImagingStudy)theEObject;
				T result = caseImagingStudy(imagingStudy);
				if (result == null) result = caseDomainResource(imagingStudy);
				if (result == null) result = caseResource(imagingStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_STUDY_INSTANCE: {
				ImagingStudyInstance imagingStudyInstance = (ImagingStudyInstance)theEObject;
				T result = caseImagingStudyInstance(imagingStudyInstance);
				if (result == null) result = caseBackboneElement(imagingStudyInstance);
				if (result == null) result = caseElement(imagingStudyInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_STUDY_SERIES: {
				ImagingStudySeries imagingStudySeries = (ImagingStudySeries)theEObject;
				T result = caseImagingStudySeries(imagingStudySeries);
				if (result == null) result = caseBackboneElement(imagingStudySeries);
				if (result == null) result = caseElement(imagingStudySeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION: {
				Immunization immunization = (Immunization)theEObject;
				T result = caseImmunization(immunization);
				if (result == null) result = caseDomainResource(immunization);
				if (result == null) result = caseResource(immunization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_EXPLANATION: {
				ImmunizationExplanation immunizationExplanation = (ImmunizationExplanation)theEObject;
				T result = caseImmunizationExplanation(immunizationExplanation);
				if (result == null) result = caseBackboneElement(immunizationExplanation);
				if (result == null) result = caseElement(immunizationExplanation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_REACTION: {
				ImmunizationReaction immunizationReaction = (ImmunizationReaction)theEObject;
				T result = caseImmunizationReaction(immunizationReaction);
				if (result == null) result = caseBackboneElement(immunizationReaction);
				if (result == null) result = caseElement(immunizationReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_RECOMMENDATION: {
				ImmunizationRecommendation immunizationRecommendation = (ImmunizationRecommendation)theEObject;
				T result = caseImmunizationRecommendation(immunizationRecommendation);
				if (result == null) result = caseDomainResource(immunizationRecommendation);
				if (result == null) result = caseResource(immunizationRecommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION: {
				ImmunizationRecommendationDateCriterion immunizationRecommendationDateCriterion = (ImmunizationRecommendationDateCriterion)theEObject;
				T result = caseImmunizationRecommendationDateCriterion(immunizationRecommendationDateCriterion);
				if (result == null) result = caseBackboneElement(immunizationRecommendationDateCriterion);
				if (result == null) result = caseElement(immunizationRecommendationDateCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL: {
				ImmunizationRecommendationProtocol immunizationRecommendationProtocol = (ImmunizationRecommendationProtocol)theEObject;
				T result = caseImmunizationRecommendationProtocol(immunizationRecommendationProtocol);
				if (result == null) result = caseBackboneElement(immunizationRecommendationProtocol);
				if (result == null) result = caseElement(immunizationRecommendationProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: {
				ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation = (ImmunizationRecommendationRecommendation)theEObject;
				T result = caseImmunizationRecommendationRecommendation(immunizationRecommendationRecommendation);
				if (result == null) result = caseBackboneElement(immunizationRecommendationRecommendation);
				if (result == null) result = caseElement(immunizationRecommendationRecommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL: {
				ImmunizationVaccinationProtocol immunizationVaccinationProtocol = (ImmunizationVaccinationProtocol)theEObject;
				T result = caseImmunizationVaccinationProtocol(immunizationVaccinationProtocol);
				if (result == null) result = caseBackboneElement(immunizationVaccinationProtocol);
				if (result == null) result = caseElement(immunizationVaccinationProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE: {
				ImplementationGuide implementationGuide = (ImplementationGuide)theEObject;
				T result = caseImplementationGuide(implementationGuide);
				if (result == null) result = caseDomainResource(implementationGuide);
				if (result == null) result = caseResource(implementationGuide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_CONTACT: {
				ImplementationGuideContact implementationGuideContact = (ImplementationGuideContact)theEObject;
				T result = caseImplementationGuideContact(implementationGuideContact);
				if (result == null) result = caseBackboneElement(implementationGuideContact);
				if (result == null) result = caseElement(implementationGuideContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_DEPENDENCY: {
				ImplementationGuideDependency implementationGuideDependency = (ImplementationGuideDependency)theEObject;
				T result = caseImplementationGuideDependency(implementationGuideDependency);
				if (result == null) result = caseBackboneElement(implementationGuideDependency);
				if (result == null) result = caseElement(implementationGuideDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_GLOBAL: {
				ImplementationGuideGlobal implementationGuideGlobal = (ImplementationGuideGlobal)theEObject;
				T result = caseImplementationGuideGlobal(implementationGuideGlobal);
				if (result == null) result = caseBackboneElement(implementationGuideGlobal);
				if (result == null) result = caseElement(implementationGuideGlobal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_PACKAGE: {
				ImplementationGuidePackage implementationGuidePackage = (ImplementationGuidePackage)theEObject;
				T result = caseImplementationGuidePackage(implementationGuidePackage);
				if (result == null) result = caseBackboneElement(implementationGuidePackage);
				if (result == null) result = caseElement(implementationGuidePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE: {
				ImplementationGuidePage implementationGuidePage = (ImplementationGuidePage)theEObject;
				T result = caseImplementationGuidePage(implementationGuidePage);
				if (result == null) result = caseBackboneElement(implementationGuidePage);
				if (result == null) result = caseElement(implementationGuidePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE: {
				ImplementationGuideResource implementationGuideResource = (ImplementationGuideResource)theEObject;
				T result = caseImplementationGuideResource(implementationGuideResource);
				if (result == null) result = caseBackboneElement(implementationGuideResource);
				if (result == null) result = caseElement(implementationGuideResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INSTANCE_AVAILABILITY: {
				InstanceAvailability instanceAvailability = (InstanceAvailability)theEObject;
				T result = caseInstanceAvailability(instanceAvailability);
				if (result == null) result = caseElement(instanceAvailability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INSTANT: {
				Instant instant = (Instant)theEObject;
				T result = caseInstant(instant);
				if (result == null) result = caseElement(instant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INTEGER: {
				org.hl7.fhir.Integer integer = (org.hl7.fhir.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseElement(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ISSUE_SEVERITY: {
				IssueSeverity issueSeverity = (IssueSeverity)theEObject;
				T result = caseIssueSeverity(issueSeverity);
				if (result == null) result = caseElement(issueSeverity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ISSUE_TYPE: {
				IssueType issueType = (IssueType)theEObject;
				T result = caseIssueType(issueType);
				if (result == null) result = caseElement(issueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseDomainResource(library);
				if (result == null) result = caseResource(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIBRARY_CODE_SYSTEM: {
				LibraryCodeSystem libraryCodeSystem = (LibraryCodeSystem)theEObject;
				T result = caseLibraryCodeSystem(libraryCodeSystem);
				if (result == null) result = caseBackboneElement(libraryCodeSystem);
				if (result == null) result = caseElement(libraryCodeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIBRARY_LIBRARY: {
				LibraryLibrary libraryLibrary = (LibraryLibrary)theEObject;
				T result = caseLibraryLibrary(libraryLibrary);
				if (result == null) result = caseBackboneElement(libraryLibrary);
				if (result == null) result = caseElement(libraryLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIBRARY_MODEL: {
				LibraryModel libraryModel = (LibraryModel)theEObject;
				T result = caseLibraryModel(libraryModel);
				if (result == null) result = caseBackboneElement(libraryModel);
				if (result == null) result = caseElement(libraryModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIBRARY_VALUE_SET: {
				LibraryValueSet libraryValueSet = (LibraryValueSet)theEObject;
				T result = caseLibraryValueSet(libraryValueSet);
				if (result == null) result = caseBackboneElement(libraryValueSet);
				if (result == null) result = caseElement(libraryValueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LINKAGE: {
				Linkage linkage = (Linkage)theEObject;
				T result = caseLinkage(linkage);
				if (result == null) result = caseDomainResource(linkage);
				if (result == null) result = caseResource(linkage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LINKAGE_ITEM: {
				LinkageItem linkageItem = (LinkageItem)theEObject;
				T result = caseLinkageItem(linkageItem);
				if (result == null) result = caseBackboneElement(linkageItem);
				if (result == null) result = caseElement(linkageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LINKAGE_TYPE: {
				LinkageType linkageType = (LinkageType)theEObject;
				T result = caseLinkageType(linkageType);
				if (result == null) result = caseElement(linkageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LINK_TYPE: {
				LinkType linkType = (LinkType)theEObject;
				T result = caseLinkType(linkType);
				if (result == null) result = caseElement(linkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseDomainResource(list);
				if (result == null) result = caseResource(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIST_ENTRY: {
				ListEntry listEntry = (ListEntry)theEObject;
				T result = caseListEntry(listEntry);
				if (result == null) result = caseBackboneElement(listEntry);
				if (result == null) result = caseElement(listEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIST_MODE: {
				ListMode listMode = (ListMode)theEObject;
				T result = caseListMode(listMode);
				if (result == null) result = caseElement(listMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIST_STATUS: {
				ListStatus listStatus = (ListStatus)theEObject;
				T result = caseListStatus(listStatus);
				if (result == null) result = caseElement(listStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseDomainResource(location);
				if (result == null) result = caseResource(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LOCATION_MODE: {
				LocationMode locationMode = (LocationMode)theEObject;
				T result = caseLocationMode(locationMode);
				if (result == null) result = caseElement(locationMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LOCATION_POSITION: {
				LocationPosition locationPosition = (LocationPosition)theEObject;
				T result = caseLocationPosition(locationPosition);
				if (result == null) result = caseBackboneElement(locationPosition);
				if (result == null) result = caseElement(locationPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LOCATION_STATUS: {
				LocationStatus locationStatus = (LocationStatus)theEObject;
				T result = caseLocationStatus(locationStatus);
				if (result == null) result = caseElement(locationStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MARKDOWN: {
				Markdown markdown = (Markdown)theEObject;
				T result = caseMarkdown(markdown);
				if (result == null) result = caseElement(markdown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASMNT_PRINCIPLE: {
				MeasmntPrinciple measmntPrinciple = (MeasmntPrinciple)theEObject;
				T result = caseMeasmntPrinciple(measmntPrinciple);
				if (result == null) result = caseElement(measmntPrinciple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE: {
				Measure measure = (Measure)theEObject;
				T result = caseMeasure(measure);
				if (result == null) result = caseDomainResource(measure);
				if (result == null) result = caseResource(measure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_DATA_USAGE: {
				MeasureDataUsage measureDataUsage = (MeasureDataUsage)theEObject;
				T result = caseMeasureDataUsage(measureDataUsage);
				if (result == null) result = caseElement(measureDataUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_GROUP: {
				MeasureGroup measureGroup = (MeasureGroup)theEObject;
				T result = caseMeasureGroup(measureGroup);
				if (result == null) result = caseBackboneElement(measureGroup);
				if (result == null) result = caseElement(measureGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_POPULATION: {
				MeasurePopulation measurePopulation = (MeasurePopulation)theEObject;
				T result = caseMeasurePopulation(measurePopulation);
				if (result == null) result = caseBackboneElement(measurePopulation);
				if (result == null) result = caseElement(measurePopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_POPULATION_TYPE: {
				MeasurePopulationType measurePopulationType = (MeasurePopulationType)theEObject;
				T result = caseMeasurePopulationType(measurePopulationType);
				if (result == null) result = caseElement(measurePopulationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT: {
				MeasureReport measureReport = (MeasureReport)theEObject;
				T result = caseMeasureReport(measureReport);
				if (result == null) result = caseDomainResource(measureReport);
				if (result == null) result = caseResource(measureReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_GROUP: {
				MeasureReportGroup measureReportGroup = (MeasureReportGroup)theEObject;
				T result = caseMeasureReportGroup(measureReportGroup);
				if (result == null) result = caseBackboneElement(measureReportGroup);
				if (result == null) result = caseElement(measureReportGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_GROUP1: {
				MeasureReportGroup1 measureReportGroup1 = (MeasureReportGroup1)theEObject;
				T result = caseMeasureReportGroup1(measureReportGroup1);
				if (result == null) result = caseBackboneElement(measureReportGroup1);
				if (result == null) result = caseElement(measureReportGroup1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_GROUP2: {
				MeasureReportGroup2 measureReportGroup2 = (MeasureReportGroup2)theEObject;
				T result = caseMeasureReportGroup2(measureReportGroup2);
				if (result == null) result = caseBackboneElement(measureReportGroup2);
				if (result == null) result = caseElement(measureReportGroup2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_POPULATION: {
				MeasureReportPopulation measureReportPopulation = (MeasureReportPopulation)theEObject;
				T result = caseMeasureReportPopulation(measureReportPopulation);
				if (result == null) result = caseBackboneElement(measureReportPopulation);
				if (result == null) result = caseElement(measureReportPopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_POPULATION1: {
				MeasureReportPopulation1 measureReportPopulation1 = (MeasureReportPopulation1)theEObject;
				T result = caseMeasureReportPopulation1(measureReportPopulation1);
				if (result == null) result = caseBackboneElement(measureReportPopulation1);
				if (result == null) result = caseElement(measureReportPopulation1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_STATUS: {
				MeasureReportStatus measureReportStatus = (MeasureReportStatus)theEObject;
				T result = caseMeasureReportStatus(measureReportStatus);
				if (result == null) result = caseElement(measureReportStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_STRATIFIER: {
				MeasureReportStratifier measureReportStratifier = (MeasureReportStratifier)theEObject;
				T result = caseMeasureReportStratifier(measureReportStratifier);
				if (result == null) result = caseBackboneElement(measureReportStratifier);
				if (result == null) result = caseElement(measureReportStratifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_SUPPLEMENTAL_DATA: {
				MeasureReportSupplementalData measureReportSupplementalData = (MeasureReportSupplementalData)theEObject;
				T result = caseMeasureReportSupplementalData(measureReportSupplementalData);
				if (result == null) result = caseBackboneElement(measureReportSupplementalData);
				if (result == null) result = caseElement(measureReportSupplementalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_TYPE: {
				MeasureReportType measureReportType = (MeasureReportType)theEObject;
				T result = caseMeasureReportType(measureReportType);
				if (result == null) result = caseElement(measureReportType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_SCORING: {
				MeasureScoring measureScoring = (MeasureScoring)theEObject;
				T result = caseMeasureScoring(measureScoring);
				if (result == null) result = caseElement(measureScoring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_STRATIFIER: {
				MeasureStratifier measureStratifier = (MeasureStratifier)theEObject;
				T result = caseMeasureStratifier(measureStratifier);
				if (result == null) result = caseBackboneElement(measureStratifier);
				if (result == null) result = caseElement(measureStratifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA: {
				MeasureSupplementalData measureSupplementalData = (MeasureSupplementalData)theEObject;
				T result = caseMeasureSupplementalData(measureSupplementalData);
				if (result == null) result = caseBackboneElement(measureSupplementalData);
				if (result == null) result = caseElement(measureSupplementalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_TYPE: {
				MeasureType measureType = (MeasureType)theEObject;
				T result = caseMeasureType(measureType);
				if (result == null) result = caseElement(measureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDIA: {
				Media media = (Media)theEObject;
				T result = caseMedia(media);
				if (result == null) result = caseDomainResource(media);
				if (result == null) result = caseResource(media);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION: {
				Medication medication = (Medication)theEObject;
				T result = caseMedication(medication);
				if (result == null) result = caseDomainResource(medication);
				if (result == null) result = caseResource(medication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_ADMINISTRATION: {
				MedicationAdministration medicationAdministration = (MedicationAdministration)theEObject;
				T result = caseMedicationAdministration(medicationAdministration);
				if (result == null) result = caseDomainResource(medicationAdministration);
				if (result == null) result = caseResource(medicationAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE: {
				MedicationAdministrationDosage medicationAdministrationDosage = (MedicationAdministrationDosage)theEObject;
				T result = caseMedicationAdministrationDosage(medicationAdministrationDosage);
				if (result == null) result = caseBackboneElement(medicationAdministrationDosage);
				if (result == null) result = caseElement(medicationAdministrationDosage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_ADMINISTRATION_EVENT_HISTORY: {
				MedicationAdministrationEventHistory medicationAdministrationEventHistory = (MedicationAdministrationEventHistory)theEObject;
				T result = caseMedicationAdministrationEventHistory(medicationAdministrationEventHistory);
				if (result == null) result = caseBackboneElement(medicationAdministrationEventHistory);
				if (result == null) result = caseElement(medicationAdministrationEventHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS: {
				MedicationAdministrationStatus medicationAdministrationStatus = (MedicationAdministrationStatus)theEObject;
				T result = caseMedicationAdministrationStatus(medicationAdministrationStatus);
				if (result == null) result = caseElement(medicationAdministrationStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_BATCH: {
				MedicationBatch medicationBatch = (MedicationBatch)theEObject;
				T result = caseMedicationBatch(medicationBatch);
				if (result == null) result = caseBackboneElement(medicationBatch);
				if (result == null) result = caseElement(medicationBatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_CONTENT: {
				MedicationContent medicationContent = (MedicationContent)theEObject;
				T result = caseMedicationContent(medicationContent);
				if (result == null) result = caseBackboneElement(medicationContent);
				if (result == null) result = caseElement(medicationContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_DISPENSE: {
				MedicationDispense medicationDispense = (MedicationDispense)theEObject;
				T result = caseMedicationDispense(medicationDispense);
				if (result == null) result = caseDomainResource(medicationDispense);
				if (result == null) result = caseResource(medicationDispense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION: {
				MedicationDispenseDosageInstruction medicationDispenseDosageInstruction = (MedicationDispenseDosageInstruction)theEObject;
				T result = caseMedicationDispenseDosageInstruction(medicationDispenseDosageInstruction);
				if (result == null) result = caseBackboneElement(medicationDispenseDosageInstruction);
				if (result == null) result = caseElement(medicationDispenseDosageInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_DISPENSE_EVENT_HISTORY: {
				MedicationDispenseEventHistory medicationDispenseEventHistory = (MedicationDispenseEventHistory)theEObject;
				T result = caseMedicationDispenseEventHistory(medicationDispenseEventHistory);
				if (result == null) result = caseBackboneElement(medicationDispenseEventHistory);
				if (result == null) result = caseElement(medicationDispenseEventHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_DISPENSE_STATUS: {
				MedicationDispenseStatus medicationDispenseStatus = (MedicationDispenseStatus)theEObject;
				T result = caseMedicationDispenseStatus(medicationDispenseStatus);
				if (result == null) result = caseElement(medicationDispenseStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION: {
				MedicationDispenseSubstitution medicationDispenseSubstitution = (MedicationDispenseSubstitution)theEObject;
				T result = caseMedicationDispenseSubstitution(medicationDispenseSubstitution);
				if (result == null) result = caseBackboneElement(medicationDispenseSubstitution);
				if (result == null) result = caseElement(medicationDispenseSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_INGREDIENT: {
				MedicationIngredient medicationIngredient = (MedicationIngredient)theEObject;
				T result = caseMedicationIngredient(medicationIngredient);
				if (result == null) result = caseBackboneElement(medicationIngredient);
				if (result == null) result = caseElement(medicationIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_ORDER: {
				MedicationOrder medicationOrder = (MedicationOrder)theEObject;
				T result = caseMedicationOrder(medicationOrder);
				if (result == null) result = caseDomainResource(medicationOrder);
				if (result == null) result = caseResource(medicationOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_ORDER_DISPENSE_REQUEST: {
				MedicationOrderDispenseRequest medicationOrderDispenseRequest = (MedicationOrderDispenseRequest)theEObject;
				T result = caseMedicationOrderDispenseRequest(medicationOrderDispenseRequest);
				if (result == null) result = caseBackboneElement(medicationOrderDispenseRequest);
				if (result == null) result = caseElement(medicationOrderDispenseRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_ORDER_DOSAGE_INSTRUCTION: {
				MedicationOrderDosageInstruction medicationOrderDosageInstruction = (MedicationOrderDosageInstruction)theEObject;
				T result = caseMedicationOrderDosageInstruction(medicationOrderDosageInstruction);
				if (result == null) result = caseBackboneElement(medicationOrderDosageInstruction);
				if (result == null) result = caseElement(medicationOrderDosageInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_ORDER_EVENT_HISTORY: {
				MedicationOrderEventHistory medicationOrderEventHistory = (MedicationOrderEventHistory)theEObject;
				T result = caseMedicationOrderEventHistory(medicationOrderEventHistory);
				if (result == null) result = caseBackboneElement(medicationOrderEventHistory);
				if (result == null) result = caseElement(medicationOrderEventHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_ORDER_STATUS: {
				MedicationOrderStatus medicationOrderStatus = (MedicationOrderStatus)theEObject;
				T result = caseMedicationOrderStatus(medicationOrderStatus);
				if (result == null) result = caseElement(medicationOrderStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_ORDER_SUBSTITUTION: {
				MedicationOrderSubstitution medicationOrderSubstitution = (MedicationOrderSubstitution)theEObject;
				T result = caseMedicationOrderSubstitution(medicationOrderSubstitution);
				if (result == null) result = caseBackboneElement(medicationOrderSubstitution);
				if (result == null) result = caseElement(medicationOrderSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_PACKAGE: {
				MedicationPackage medicationPackage = (MedicationPackage)theEObject;
				T result = caseMedicationPackage(medicationPackage);
				if (result == null) result = caseBackboneElement(medicationPackage);
				if (result == null) result = caseElement(medicationPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_PRODUCT: {
				MedicationProduct medicationProduct = (MedicationProduct)theEObject;
				T result = caseMedicationProduct(medicationProduct);
				if (result == null) result = caseBackboneElement(medicationProduct);
				if (result == null) result = caseElement(medicationProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_STATEMENT: {
				MedicationStatement medicationStatement = (MedicationStatement)theEObject;
				T result = caseMedicationStatement(medicationStatement);
				if (result == null) result = caseDomainResource(medicationStatement);
				if (result == null) result = caseResource(medicationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE: {
				MedicationStatementDosage medicationStatementDosage = (MedicationStatementDosage)theEObject;
				T result = caseMedicationStatementDosage(medicationStatementDosage);
				if (result == null) result = caseBackboneElement(medicationStatementDosage);
				if (result == null) result = caseElement(medicationStatementDosage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_STATEMENT_STATUS: {
				MedicationStatementStatus medicationStatementStatus = (MedicationStatementStatus)theEObject;
				T result = caseMedicationStatementStatus(medicationStatementStatus);
				if (result == null) result = caseElement(medicationStatementStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGE_HEADER: {
				MessageHeader messageHeader = (MessageHeader)theEObject;
				T result = caseMessageHeader(messageHeader);
				if (result == null) result = caseDomainResource(messageHeader);
				if (result == null) result = caseResource(messageHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGE_HEADER_DESTINATION: {
				MessageHeaderDestination messageHeaderDestination = (MessageHeaderDestination)theEObject;
				T result = caseMessageHeaderDestination(messageHeaderDestination);
				if (result == null) result = caseBackboneElement(messageHeaderDestination);
				if (result == null) result = caseElement(messageHeaderDestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGE_HEADER_RESPONSE: {
				MessageHeaderResponse messageHeaderResponse = (MessageHeaderResponse)theEObject;
				T result = caseMessageHeaderResponse(messageHeaderResponse);
				if (result == null) result = caseBackboneElement(messageHeaderResponse);
				if (result == null) result = caseElement(messageHeaderResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGE_HEADER_SOURCE: {
				MessageHeaderSource messageHeaderSource = (MessageHeaderSource)theEObject;
				T result = caseMessageHeaderSource(messageHeaderSource);
				if (result == null) result = caseBackboneElement(messageHeaderSource);
				if (result == null) result = caseElement(messageHeaderSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY: {
				MessageSignificanceCategory messageSignificanceCategory = (MessageSignificanceCategory)theEObject;
				T result = caseMessageSignificanceCategory(messageSignificanceCategory);
				if (result == null) result = caseElement(messageSignificanceCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.META: {
				Meta meta = (Meta)theEObject;
				T result = caseMeta(meta);
				if (result == null) result = caseElement(meta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_DEFINITION: {
				ModuleDefinition moduleDefinition = (ModuleDefinition)theEObject;
				T result = caseModuleDefinition(moduleDefinition);
				if (result == null) result = caseDomainResource(moduleDefinition);
				if (result == null) result = caseResource(moduleDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_DEFINITION_CODE_FILTER: {
				ModuleDefinitionCodeFilter moduleDefinitionCodeFilter = (ModuleDefinitionCodeFilter)theEObject;
				T result = caseModuleDefinitionCodeFilter(moduleDefinitionCodeFilter);
				if (result == null) result = caseBackboneElement(moduleDefinitionCodeFilter);
				if (result == null) result = caseElement(moduleDefinitionCodeFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_DEFINITION_CODE_SYSTEM: {
				ModuleDefinitionCodeSystem moduleDefinitionCodeSystem = (ModuleDefinitionCodeSystem)theEObject;
				T result = caseModuleDefinitionCodeSystem(moduleDefinitionCodeSystem);
				if (result == null) result = caseBackboneElement(moduleDefinitionCodeSystem);
				if (result == null) result = caseElement(moduleDefinitionCodeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_DEFINITION_DATA: {
				ModuleDefinitionData moduleDefinitionData = (ModuleDefinitionData)theEObject;
				T result = caseModuleDefinitionData(moduleDefinitionData);
				if (result == null) result = caseBackboneElement(moduleDefinitionData);
				if (result == null) result = caseElement(moduleDefinitionData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_DEFINITION_DATE_FILTER: {
				ModuleDefinitionDateFilter moduleDefinitionDateFilter = (ModuleDefinitionDateFilter)theEObject;
				T result = caseModuleDefinitionDateFilter(moduleDefinitionDateFilter);
				if (result == null) result = caseBackboneElement(moduleDefinitionDateFilter);
				if (result == null) result = caseElement(moduleDefinitionDateFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_DEFINITION_LIBRARY: {
				ModuleDefinitionLibrary moduleDefinitionLibrary = (ModuleDefinitionLibrary)theEObject;
				T result = caseModuleDefinitionLibrary(moduleDefinitionLibrary);
				if (result == null) result = caseBackboneElement(moduleDefinitionLibrary);
				if (result == null) result = caseElement(moduleDefinitionLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_DEFINITION_MODEL: {
				ModuleDefinitionModel moduleDefinitionModel = (ModuleDefinitionModel)theEObject;
				T result = caseModuleDefinitionModel(moduleDefinitionModel);
				if (result == null) result = caseBackboneElement(moduleDefinitionModel);
				if (result == null) result = caseElement(moduleDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_DEFINITION_PARAMETER: {
				ModuleDefinitionParameter moduleDefinitionParameter = (ModuleDefinitionParameter)theEObject;
				T result = caseModuleDefinitionParameter(moduleDefinitionParameter);
				if (result == null) result = caseBackboneElement(moduleDefinitionParameter);
				if (result == null) result = caseElement(moduleDefinitionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_DEFINITION_VALUE_SET: {
				ModuleDefinitionValueSet moduleDefinitionValueSet = (ModuleDefinitionValueSet)theEObject;
				T result = caseModuleDefinitionValueSet(moduleDefinitionValueSet);
				if (result == null) result = caseBackboneElement(moduleDefinitionValueSet);
				if (result == null) result = caseElement(moduleDefinitionValueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_METADATA: {
				ModuleMetadata moduleMetadata = (ModuleMetadata)theEObject;
				T result = caseModuleMetadata(moduleMetadata);
				if (result == null) result = caseElement(moduleMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_METADATA_CONTACT: {
				ModuleMetadataContact moduleMetadataContact = (ModuleMetadataContact)theEObject;
				T result = caseModuleMetadataContact(moduleMetadataContact);
				if (result == null) result = caseElement(moduleMetadataContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_METADATA_CONTACT1: {
				ModuleMetadataContact1 moduleMetadataContact1 = (ModuleMetadataContact1)theEObject;
				T result = caseModuleMetadataContact1(moduleMetadataContact1);
				if (result == null) result = caseElement(moduleMetadataContact1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR: {
				ModuleMetadataContributor moduleMetadataContributor = (ModuleMetadataContributor)theEObject;
				T result = caseModuleMetadataContributor(moduleMetadataContributor);
				if (result == null) result = caseElement(moduleMetadataContributor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR_TYPE: {
				ModuleMetadataContributorType moduleMetadataContributorType = (ModuleMetadataContributorType)theEObject;
				T result = caseModuleMetadataContributorType(moduleMetadataContributorType);
				if (result == null) result = caseElement(moduleMetadataContributorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_METADATA_COVERAGE: {
				ModuleMetadataCoverage moduleMetadataCoverage = (ModuleMetadataCoverage)theEObject;
				T result = caseModuleMetadataCoverage(moduleMetadataCoverage);
				if (result == null) result = caseElement(moduleMetadataCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_METADATA_RELATED_RESOURCE: {
				ModuleMetadataRelatedResource moduleMetadataRelatedResource = (ModuleMetadataRelatedResource)theEObject;
				T result = caseModuleMetadataRelatedResource(moduleMetadataRelatedResource);
				if (result == null) result = caseElement(moduleMetadataRelatedResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_METADATA_RESOURCE_TYPE: {
				ModuleMetadataResourceType moduleMetadataResourceType = (ModuleMetadataResourceType)theEObject;
				T result = caseModuleMetadataResourceType(moduleMetadataResourceType);
				if (result == null) result = caseElement(moduleMetadataResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_METADATA_STATUS: {
				ModuleMetadataStatus moduleMetadataStatus = (ModuleMetadataStatus)theEObject;
				T result = caseModuleMetadataStatus(moduleMetadataStatus);
				if (result == null) result = caseElement(moduleMetadataStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MODULE_METADATA_TYPE: {
				ModuleMetadataType moduleMetadataType = (ModuleMetadataType)theEObject;
				T result = caseModuleMetadataType(moduleMetadataType);
				if (result == null) result = caseElement(moduleMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MONEY: {
				Money money = (Money)theEObject;
				T result = caseMoney(money);
				if (result == null) result = caseQuantity(money);
				if (result == null) result = caseElement(money);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NAME_USE: {
				NameUse nameUse = (NameUse)theEObject;
				T result = caseNameUse(nameUse);
				if (result == null) result = caseElement(nameUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NAMING_SYSTEM: {
				NamingSystem namingSystem = (NamingSystem)theEObject;
				T result = caseNamingSystem(namingSystem);
				if (result == null) result = caseDomainResource(namingSystem);
				if (result == null) result = caseResource(namingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NAMING_SYSTEM_CONTACT: {
				NamingSystemContact namingSystemContact = (NamingSystemContact)theEObject;
				T result = caseNamingSystemContact(namingSystemContact);
				if (result == null) result = caseBackboneElement(namingSystemContact);
				if (result == null) result = caseElement(namingSystemContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE: {
				NamingSystemIdentifierType namingSystemIdentifierType = (NamingSystemIdentifierType)theEObject;
				T result = caseNamingSystemIdentifierType(namingSystemIdentifierType);
				if (result == null) result = caseElement(namingSystemIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NAMING_SYSTEM_TYPE: {
				NamingSystemType namingSystemType = (NamingSystemType)theEObject;
				T result = caseNamingSystemType(namingSystemType);
				if (result == null) result = caseElement(namingSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NAMING_SYSTEM_UNIQUE_ID: {
				NamingSystemUniqueId namingSystemUniqueId = (NamingSystemUniqueId)theEObject;
				T result = caseNamingSystemUniqueId(namingSystemUniqueId);
				if (result == null) result = caseBackboneElement(namingSystemUniqueId);
				if (result == null) result = caseElement(namingSystemUniqueId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NARRATIVE: {
				Narrative narrative = (Narrative)theEObject;
				T result = caseNarrative(narrative);
				if (result == null) result = caseElement(narrative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NARRATIVE_STATUS: {
				NarrativeStatus narrativeStatus = (NarrativeStatus)theEObject;
				T result = caseNarrativeStatus(narrativeStatus);
				if (result == null) result = caseElement(narrativeStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NOTE_TYPE: {
				NoteType noteType = (NoteType)theEObject;
				T result = caseNoteType(noteType);
				if (result == null) result = caseElement(noteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER: {
				NutritionOrder nutritionOrder = (NutritionOrder)theEObject;
				T result = caseNutritionOrder(nutritionOrder);
				if (result == null) result = caseDomainResource(nutritionOrder);
				if (result == null) result = caseResource(nutritionOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER_ADMINISTRATION: {
				NutritionOrderAdministration nutritionOrderAdministration = (NutritionOrderAdministration)theEObject;
				T result = caseNutritionOrderAdministration(nutritionOrderAdministration);
				if (result == null) result = caseBackboneElement(nutritionOrderAdministration);
				if (result == null) result = caseElement(nutritionOrderAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA: {
				NutritionOrderEnteralFormula nutritionOrderEnteralFormula = (NutritionOrderEnteralFormula)theEObject;
				T result = caseNutritionOrderEnteralFormula(nutritionOrderEnteralFormula);
				if (result == null) result = caseBackboneElement(nutritionOrderEnteralFormula);
				if (result == null) result = caseElement(nutritionOrderEnteralFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER_NUTRIENT: {
				NutritionOrderNutrient nutritionOrderNutrient = (NutritionOrderNutrient)theEObject;
				T result = caseNutritionOrderNutrient(nutritionOrderNutrient);
				if (result == null) result = caseBackboneElement(nutritionOrderNutrient);
				if (result == null) result = caseElement(nutritionOrderNutrient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER_ORAL_DIET: {
				NutritionOrderOralDiet nutritionOrderOralDiet = (NutritionOrderOralDiet)theEObject;
				T result = caseNutritionOrderOralDiet(nutritionOrderOralDiet);
				if (result == null) result = caseBackboneElement(nutritionOrderOralDiet);
				if (result == null) result = caseElement(nutritionOrderOralDiet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER_STATUS: {
				NutritionOrderStatus nutritionOrderStatus = (NutritionOrderStatus)theEObject;
				T result = caseNutritionOrderStatus(nutritionOrderStatus);
				if (result == null) result = caseElement(nutritionOrderStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT: {
				NutritionOrderSupplement nutritionOrderSupplement = (NutritionOrderSupplement)theEObject;
				T result = caseNutritionOrderSupplement(nutritionOrderSupplement);
				if (result == null) result = caseBackboneElement(nutritionOrderSupplement);
				if (result == null) result = caseElement(nutritionOrderSupplement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER_TEXTURE: {
				NutritionOrderTexture nutritionOrderTexture = (NutritionOrderTexture)theEObject;
				T result = caseNutritionOrderTexture(nutritionOrderTexture);
				if (result == null) result = caseBackboneElement(nutritionOrderTexture);
				if (result == null) result = caseElement(nutritionOrderTexture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = caseDomainResource(observation);
				if (result == null) result = caseResource(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION_COMPONENT: {
				ObservationComponent observationComponent = (ObservationComponent)theEObject;
				T result = caseObservationComponent(observationComponent);
				if (result == null) result = caseBackboneElement(observationComponent);
				if (result == null) result = caseElement(observationComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION_REFERENCE_RANGE: {
				ObservationReferenceRange observationReferenceRange = (ObservationReferenceRange)theEObject;
				T result = caseObservationReferenceRange(observationReferenceRange);
				if (result == null) result = caseBackboneElement(observationReferenceRange);
				if (result == null) result = caseElement(observationReferenceRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION_RELATED: {
				ObservationRelated observationRelated = (ObservationRelated)theEObject;
				T result = caseObservationRelated(observationRelated);
				if (result == null) result = caseBackboneElement(observationRelated);
				if (result == null) result = caseElement(observationRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE: {
				ObservationRelationshipType observationRelationshipType = (ObservationRelationshipType)theEObject;
				T result = caseObservationRelationshipType(observationRelationshipType);
				if (result == null) result = caseElement(observationRelationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION_STATUS: {
				ObservationStatus observationStatus = (ObservationStatus)theEObject;
				T result = caseObservationStatus(observationStatus);
				if (result == null) result = caseElement(observationStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OID: {
				Oid oid = (Oid)theEObject;
				T result = caseOid(oid);
				if (result == null) result = caseElement(oid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_DEFINITION: {
				OperationDefinition operationDefinition = (OperationDefinition)theEObject;
				T result = caseOperationDefinition(operationDefinition);
				if (result == null) result = caseDomainResource(operationDefinition);
				if (result == null) result = caseResource(operationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_DEFINITION_BINDING: {
				OperationDefinitionBinding operationDefinitionBinding = (OperationDefinitionBinding)theEObject;
				T result = caseOperationDefinitionBinding(operationDefinitionBinding);
				if (result == null) result = caseBackboneElement(operationDefinitionBinding);
				if (result == null) result = caseElement(operationDefinitionBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_DEFINITION_CONTACT: {
				OperationDefinitionContact operationDefinitionContact = (OperationDefinitionContact)theEObject;
				T result = caseOperationDefinitionContact(operationDefinitionContact);
				if (result == null) result = caseBackboneElement(operationDefinitionContact);
				if (result == null) result = caseElement(operationDefinitionContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_DEFINITION_PARAMETER: {
				OperationDefinitionParameter operationDefinitionParameter = (OperationDefinitionParameter)theEObject;
				T result = caseOperationDefinitionParameter(operationDefinitionParameter);
				if (result == null) result = caseBackboneElement(operationDefinitionParameter);
				if (result == null) result = caseElement(operationDefinitionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_KIND: {
				OperationKind operationKind = (OperationKind)theEObject;
				T result = caseOperationKind(operationKind);
				if (result == null) result = caseElement(operationKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_OUTCOME: {
				OperationOutcome operationOutcome = (OperationOutcome)theEObject;
				T result = caseOperationOutcome(operationOutcome);
				if (result == null) result = caseDomainResource(operationOutcome);
				if (result == null) result = caseResource(operationOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_OUTCOME_ISSUE: {
				OperationOutcomeIssue operationOutcomeIssue = (OperationOutcomeIssue)theEObject;
				T result = caseOperationOutcomeIssue(operationOutcomeIssue);
				if (result == null) result = caseBackboneElement(operationOutcomeIssue);
				if (result == null) result = caseElement(operationOutcomeIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_PARAMETER_USE: {
				OperationParameterUse operationParameterUse = (OperationParameterUse)theEObject;
				T result = caseOperationParameterUse(operationParameterUse);
				if (result == null) result = caseElement(operationParameterUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ORDER: {
				Order order = (Order)theEObject;
				T result = caseOrder(order);
				if (result == null) result = caseDomainResource(order);
				if (result == null) result = caseResource(order);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ORDER_RESPONSE: {
				OrderResponse orderResponse = (OrderResponse)theEObject;
				T result = caseOrderResponse(orderResponse);
				if (result == null) result = caseDomainResource(orderResponse);
				if (result == null) result = caseResource(orderResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ORDER_SET: {
				OrderSet orderSet = (OrderSet)theEObject;
				T result = caseOrderSet(orderSet);
				if (result == null) result = caseDomainResource(orderSet);
				if (result == null) result = caseResource(orderSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ORDER_STATUS: {
				OrderStatus orderStatus = (OrderStatus)theEObject;
				T result = caseOrderStatus(orderStatus);
				if (result == null) result = caseElement(orderStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ORDER_WHEN: {
				OrderWhen orderWhen = (OrderWhen)theEObject;
				T result = caseOrderWhen(orderWhen);
				if (result == null) result = caseBackboneElement(orderWhen);
				if (result == null) result = caseElement(orderWhen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseDomainResource(organization);
				if (result == null) result = caseResource(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ORGANIZATION_CONTACT: {
				OrganizationContact organizationContact = (OrganizationContact)theEObject;
				T result = caseOrganizationContact(organizationContact);
				if (result == null) result = caseBackboneElement(organizationContact);
				if (result == null) result = caseElement(organizationContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PARAMETER_DEFINITION: {
				ParameterDefinition parameterDefinition = (ParameterDefinition)theEObject;
				T result = caseParameterDefinition(parameterDefinition);
				if (result == null) result = caseElement(parameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PARAMETERS: {
				Parameters parameters = (Parameters)theEObject;
				T result = caseParameters(parameters);
				if (result == null) result = caseResource(parameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PARAMETERS_PARAMETER: {
				ParametersParameter parametersParameter = (ParametersParameter)theEObject;
				T result = caseParametersParameter(parametersParameter);
				if (result == null) result = caseBackboneElement(parametersParameter);
				if (result == null) result = caseElement(parametersParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PARTICIPANT_REQUIRED: {
				ParticipantRequired participantRequired = (ParticipantRequired)theEObject;
				T result = caseParticipantRequired(participantRequired);
				if (result == null) result = caseElement(participantRequired);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PARTICIPANT_TYPE: {
				ParticipantType participantType = (ParticipantType)theEObject;
				T result = caseParticipantType(participantType);
				if (result == null) result = caseElement(participantType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PARTICIPATION_STATUS: {
				ParticipationStatus participationStatus = (ParticipationStatus)theEObject;
				T result = caseParticipationStatus(participationStatus);
				if (result == null) result = caseElement(participationStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PATIENT: {
				Patient patient = (Patient)theEObject;
				T result = casePatient(patient);
				if (result == null) result = caseDomainResource(patient);
				if (result == null) result = caseResource(patient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PATIENT_ANIMAL: {
				PatientAnimal patientAnimal = (PatientAnimal)theEObject;
				T result = casePatientAnimal(patientAnimal);
				if (result == null) result = caseBackboneElement(patientAnimal);
				if (result == null) result = caseElement(patientAnimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PATIENT_COMMUNICATION: {
				PatientCommunication patientCommunication = (PatientCommunication)theEObject;
				T result = casePatientCommunication(patientCommunication);
				if (result == null) result = caseBackboneElement(patientCommunication);
				if (result == null) result = caseElement(patientCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PATIENT_CONTACT: {
				PatientContact patientContact = (PatientContact)theEObject;
				T result = casePatientContact(patientContact);
				if (result == null) result = caseBackboneElement(patientContact);
				if (result == null) result = caseElement(patientContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PATIENT_LINK: {
				PatientLink patientLink = (PatientLink)theEObject;
				T result = casePatientLink(patientLink);
				if (result == null) result = caseBackboneElement(patientLink);
				if (result == null) result = caseElement(patientLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PAYMENT_NOTICE: {
				PaymentNotice paymentNotice = (PaymentNotice)theEObject;
				T result = casePaymentNotice(paymentNotice);
				if (result == null) result = caseDomainResource(paymentNotice);
				if (result == null) result = caseResource(paymentNotice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PAYMENT_RECONCILIATION: {
				PaymentReconciliation paymentReconciliation = (PaymentReconciliation)theEObject;
				T result = casePaymentReconciliation(paymentReconciliation);
				if (result == null) result = caseDomainResource(paymentReconciliation);
				if (result == null) result = caseResource(paymentReconciliation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL: {
				PaymentReconciliationDetail paymentReconciliationDetail = (PaymentReconciliationDetail)theEObject;
				T result = casePaymentReconciliationDetail(paymentReconciliationDetail);
				if (result == null) result = caseBackboneElement(paymentReconciliationDetail);
				if (result == null) result = caseElement(paymentReconciliationDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PAYMENT_RECONCILIATION_NOTE: {
				PaymentReconciliationNote paymentReconciliationNote = (PaymentReconciliationNote)theEObject;
				T result = casePaymentReconciliationNote(paymentReconciliationNote);
				if (result == null) result = caseBackboneElement(paymentReconciliationNote);
				if (result == null) result = caseElement(paymentReconciliationNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PERIOD: {
				Period period = (Period)theEObject;
				T result = casePeriod(period);
				if (result == null) result = caseElement(period);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseDomainResource(person);
				if (result == null) result = caseResource(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PERSON_LINK: {
				PersonLink personLink = (PersonLink)theEObject;
				T result = casePersonLink(personLink);
				if (result == null) result = caseBackboneElement(personLink);
				if (result == null) result = caseElement(personLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.POSITIVE_INT: {
				PositiveInt positiveInt = (PositiveInt)theEObject;
				T result = casePositiveInt(positiveInt);
				if (result == null) result = caseElement(positiveInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PRACTITIONER: {
				Practitioner practitioner = (Practitioner)theEObject;
				T result = casePractitioner(practitioner);
				if (result == null) result = caseDomainResource(practitioner);
				if (result == null) result = caseResource(practitioner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE: {
				PractitionerPractitionerRole practitionerPractitionerRole = (PractitionerPractitionerRole)theEObject;
				T result = casePractitionerPractitionerRole(practitionerPractitionerRole);
				if (result == null) result = caseBackboneElement(practitionerPractitionerRole);
				if (result == null) result = caseElement(practitionerPractitionerRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PRACTITIONER_QUALIFICATION: {
				PractitionerQualification practitionerQualification = (PractitionerQualification)theEObject;
				T result = casePractitionerQualification(practitionerQualification);
				if (result == null) result = caseBackboneElement(practitionerQualification);
				if (result == null) result = caseElement(practitionerQualification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PRACTITIONER_ROLE: {
				PractitionerRole practitionerRole = (PractitionerRole)theEObject;
				T result = casePractitionerRole(practitionerRole);
				if (result == null) result = caseDomainResource(practitionerRole);
				if (result == null) result = caseResource(practitionerRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PRACTITIONER_ROLE_AVAILABLE_TIME: {
				PractitionerRoleAvailableTime practitionerRoleAvailableTime = (PractitionerRoleAvailableTime)theEObject;
				T result = casePractitionerRoleAvailableTime(practitionerRoleAvailableTime);
				if (result == null) result = caseBackboneElement(practitionerRoleAvailableTime);
				if (result == null) result = caseElement(practitionerRoleAvailableTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PRACTITIONER_ROLE_NOT_AVAILABLE: {
				PractitionerRoleNotAvailable practitionerRoleNotAvailable = (PractitionerRoleNotAvailable)theEObject;
				T result = casePractitionerRoleNotAvailable(practitionerRoleNotAvailable);
				if (result == null) result = caseBackboneElement(practitionerRoleNotAvailable);
				if (result == null) result = caseElement(practitionerRoleNotAvailable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseDomainResource(procedure);
				if (result == null) result = caseResource(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCEDURE_FOCAL_DEVICE: {
				ProcedureFocalDevice procedureFocalDevice = (ProcedureFocalDevice)theEObject;
				T result = caseProcedureFocalDevice(procedureFocalDevice);
				if (result == null) result = caseBackboneElement(procedureFocalDevice);
				if (result == null) result = caseElement(procedureFocalDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCEDURE_PERFORMER: {
				ProcedurePerformer procedurePerformer = (ProcedurePerformer)theEObject;
				T result = caseProcedurePerformer(procedurePerformer);
				if (result == null) result = caseBackboneElement(procedurePerformer);
				if (result == null) result = caseElement(procedurePerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCEDURE_REQUEST: {
				ProcedureRequest procedureRequest = (ProcedureRequest)theEObject;
				T result = caseProcedureRequest(procedureRequest);
				if (result == null) result = caseDomainResource(procedureRequest);
				if (result == null) result = caseResource(procedureRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY: {
				ProcedureRequestPriority procedureRequestPriority = (ProcedureRequestPriority)theEObject;
				T result = caseProcedureRequestPriority(procedureRequestPriority);
				if (result == null) result = caseElement(procedureRequestPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCEDURE_REQUEST_STATUS: {
				ProcedureRequestStatus procedureRequestStatus = (ProcedureRequestStatus)theEObject;
				T result = caseProcedureRequestStatus(procedureRequestStatus);
				if (result == null) result = caseElement(procedureRequestStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCEDURE_STATUS: {
				ProcedureStatus procedureStatus = (ProcedureStatus)theEObject;
				T result = caseProcedureStatus(procedureStatus);
				if (result == null) result = caseElement(procedureStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCESS_REQUEST: {
				ProcessRequest processRequest = (ProcessRequest)theEObject;
				T result = caseProcessRequest(processRequest);
				if (result == null) result = caseDomainResource(processRequest);
				if (result == null) result = caseResource(processRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCESS_REQUEST_ITEM: {
				ProcessRequestItem processRequestItem = (ProcessRequestItem)theEObject;
				T result = caseProcessRequestItem(processRequestItem);
				if (result == null) result = caseBackboneElement(processRequestItem);
				if (result == null) result = caseElement(processRequestItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCESS_RESPONSE: {
				ProcessResponse processResponse = (ProcessResponse)theEObject;
				T result = caseProcessResponse(processResponse);
				if (result == null) result = caseDomainResource(processResponse);
				if (result == null) result = caseResource(processResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCESS_RESPONSE_NOTES: {
				ProcessResponseNotes processResponseNotes = (ProcessResponseNotes)theEObject;
				T result = caseProcessResponseNotes(processResponseNotes);
				if (result == null) result = caseBackboneElement(processResponseNotes);
				if (result == null) result = caseElement(processResponseNotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROPERTY_REPRESENTATION: {
				PropertyRepresentation propertyRepresentation = (PropertyRepresentation)theEObject;
				T result = casePropertyRepresentation(propertyRepresentation);
				if (result == null) result = caseElement(propertyRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = caseElement(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROTOCOL: {
				Protocol protocol = (Protocol)theEObject;
				T result = caseProtocol(protocol);
				if (result == null) result = caseDomainResource(protocol);
				if (result == null) result = caseResource(protocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROTOCOL_ACTIVITY: {
				ProtocolActivity protocolActivity = (ProtocolActivity)theEObject;
				T result = caseProtocolActivity(protocolActivity);
				if (result == null) result = caseBackboneElement(protocolActivity);
				if (result == null) result = caseElement(protocolActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROTOCOL_COMPONENT: {
				ProtocolComponent protocolComponent = (ProtocolComponent)theEObject;
				T result = caseProtocolComponent(protocolComponent);
				if (result == null) result = caseBackboneElement(protocolComponent);
				if (result == null) result = caseElement(protocolComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROTOCOL_CONDITION: {
				ProtocolCondition protocolCondition = (ProtocolCondition)theEObject;
				T result = caseProtocolCondition(protocolCondition);
				if (result == null) result = caseBackboneElement(protocolCondition);
				if (result == null) result = caseElement(protocolCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROTOCOL_DETAIL: {
				ProtocolDetail protocolDetail = (ProtocolDetail)theEObject;
				T result = caseProtocolDetail(protocolDetail);
				if (result == null) result = caseBackboneElement(protocolDetail);
				if (result == null) result = caseElement(protocolDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROTOCOL_NEXT: {
				ProtocolNext protocolNext = (ProtocolNext)theEObject;
				T result = caseProtocolNext(protocolNext);
				if (result == null) result = caseBackboneElement(protocolNext);
				if (result == null) result = caseElement(protocolNext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROTOCOL_PRECONDITION: {
				ProtocolPrecondition protocolPrecondition = (ProtocolPrecondition)theEObject;
				T result = caseProtocolPrecondition(protocolPrecondition);
				if (result == null) result = caseBackboneElement(protocolPrecondition);
				if (result == null) result = caseElement(protocolPrecondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROTOCOL_STATUS: {
				ProtocolStatus protocolStatus = (ProtocolStatus)theEObject;
				T result = caseProtocolStatus(protocolStatus);
				if (result == null) result = caseElement(protocolStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROTOCOL_STEP: {
				ProtocolStep protocolStep = (ProtocolStep)theEObject;
				T result = caseProtocolStep(protocolStep);
				if (result == null) result = caseBackboneElement(protocolStep);
				if (result == null) result = caseElement(protocolStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROTOCOL_TYPE: {
				ProtocolType protocolType = (ProtocolType)theEObject;
				T result = caseProtocolType(protocolType);
				if (result == null) result = caseElement(protocolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROVENANCE: {
				Provenance provenance = (Provenance)theEObject;
				T result = caseProvenance(provenance);
				if (result == null) result = caseDomainResource(provenance);
				if (result == null) result = caseResource(provenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROVENANCE_AGENT: {
				ProvenanceAgent provenanceAgent = (ProvenanceAgent)theEObject;
				T result = caseProvenanceAgent(provenanceAgent);
				if (result == null) result = caseBackboneElement(provenanceAgent);
				if (result == null) result = caseElement(provenanceAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROVENANCE_ENTITY: {
				ProvenanceEntity provenanceEntity = (ProvenanceEntity)theEObject;
				T result = caseProvenanceEntity(provenanceEntity);
				if (result == null) result = caseBackboneElement(provenanceEntity);
				if (result == null) result = caseElement(provenanceEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROVENANCE_ENTITY_ROLE: {
				ProvenanceEntityRole provenanceEntityRole = (ProvenanceEntityRole)theEObject;
				T result = caseProvenanceEntityRole(provenanceEntityRole);
				if (result == null) result = caseElement(provenanceEntityRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROVENANCE_RELATED_AGENT: {
				ProvenanceRelatedAgent provenanceRelatedAgent = (ProvenanceRelatedAgent)theEObject;
				T result = caseProvenanceRelatedAgent(provenanceRelatedAgent);
				if (result == null) result = caseBackboneElement(provenanceRelatedAgent);
				if (result == null) result = caseElement(provenanceRelatedAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = caseElement(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUANTITY_COMPARATOR: {
				QuantityComparator quantityComparator = (QuantityComparator)theEObject;
				T result = caseQuantityComparator(quantityComparator);
				if (result == null) result = caseElement(quantityComparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE: {
				Questionnaire questionnaire = (Questionnaire)theEObject;
				T result = caseQuestionnaire(questionnaire);
				if (result == null) result = caseDomainResource(questionnaire);
				if (result == null) result = caseResource(questionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN: {
				QuestionnaireEnableWhen questionnaireEnableWhen = (QuestionnaireEnableWhen)theEObject;
				T result = caseQuestionnaireEnableWhen(questionnaireEnableWhen);
				if (result == null) result = caseBackboneElement(questionnaireEnableWhen);
				if (result == null) result = caseElement(questionnaireEnableWhen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_ITEM: {
				QuestionnaireItem questionnaireItem = (QuestionnaireItem)theEObject;
				T result = caseQuestionnaireItem(questionnaireItem);
				if (result == null) result = caseBackboneElement(questionnaireItem);
				if (result == null) result = caseElement(questionnaireItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE: {
				QuestionnaireItemType questionnaireItemType = (QuestionnaireItemType)theEObject;
				T result = caseQuestionnaireItemType(questionnaireItemType);
				if (result == null) result = caseElement(questionnaireItemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_OPTION: {
				QuestionnaireOption questionnaireOption = (QuestionnaireOption)theEObject;
				T result = caseQuestionnaireOption(questionnaireOption);
				if (result == null) result = caseBackboneElement(questionnaireOption);
				if (result == null) result = caseElement(questionnaireOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_RESPONSE: {
				QuestionnaireResponse questionnaireResponse = (QuestionnaireResponse)theEObject;
				T result = caseQuestionnaireResponse(questionnaireResponse);
				if (result == null) result = caseDomainResource(questionnaireResponse);
				if (result == null) result = caseResource(questionnaireResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ANSWER: {
				QuestionnaireResponseAnswer questionnaireResponseAnswer = (QuestionnaireResponseAnswer)theEObject;
				T result = caseQuestionnaireResponseAnswer(questionnaireResponseAnswer);
				if (result == null) result = caseBackboneElement(questionnaireResponseAnswer);
				if (result == null) result = caseElement(questionnaireResponseAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ITEM: {
				QuestionnaireResponseItem questionnaireResponseItem = (QuestionnaireResponseItem)theEObject;
				T result = caseQuestionnaireResponseItem(questionnaireResponseItem);
				if (result == null) result = caseBackboneElement(questionnaireResponseItem);
				if (result == null) result = caseElement(questionnaireResponseItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS: {
				QuestionnaireResponseStatus questionnaireResponseStatus = (QuestionnaireResponseStatus)theEObject;
				T result = caseQuestionnaireResponseStatus(questionnaireResponseStatus);
				if (result == null) result = caseElement(questionnaireResponseStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_STATUS: {
				QuestionnaireStatus questionnaireStatus = (QuestionnaireStatus)theEObject;
				T result = caseQuestionnaireStatus(questionnaireStatus);
				if (result == null) result = caseElement(questionnaireStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = caseElement(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RATIO: {
				Ratio ratio = (Ratio)theEObject;
				T result = caseRatio(ratio);
				if (result == null) result = caseElement(ratio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseElement(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REFERENCE_VERSION_RULES: {
				ReferenceVersionRules referenceVersionRules = (ReferenceVersionRules)theEObject;
				T result = caseReferenceVersionRules(referenceVersionRules);
				if (result == null) result = caseElement(referenceVersionRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REFERRAL_CATEGORY: {
				ReferralCategory referralCategory = (ReferralCategory)theEObject;
				T result = caseReferralCategory(referralCategory);
				if (result == null) result = caseElement(referralCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REFERRAL_REQUEST: {
				ReferralRequest referralRequest = (ReferralRequest)theEObject;
				T result = caseReferralRequest(referralRequest);
				if (result == null) result = caseDomainResource(referralRequest);
				if (result == null) result = caseResource(referralRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REFERRAL_STATUS: {
				ReferralStatus referralStatus = (ReferralStatus)theEObject;
				T result = caseReferralStatus(referralStatus);
				if (result == null) result = caseElement(referralStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RELATED_PERSON: {
				RelatedPerson relatedPerson = (RelatedPerson)theEObject;
				T result = caseRelatedPerson(relatedPerson);
				if (result == null) result = caseDomainResource(relatedPerson);
				if (result == null) result = caseResource(relatedPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REMITTANCE_OUTCOME: {
				RemittanceOutcome remittanceOutcome = (RemittanceOutcome)theEObject;
				T result = caseRemittanceOutcome(remittanceOutcome);
				if (result == null) result = caseElement(remittanceOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESOURCE_CONTAINER: {
				ResourceContainer resourceContainer = (ResourceContainer)theEObject;
				T result = caseResourceContainer(resourceContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESOURCE_VERSION_POLICY: {
				ResourceVersionPolicy resourceVersionPolicy = (ResourceVersionPolicy)theEObject;
				T result = caseResourceVersionPolicy(resourceVersionPolicy);
				if (result == null) result = caseElement(resourceVersionPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESPONSE_TYPE: {
				ResponseType responseType = (ResponseType)theEObject;
				T result = caseResponseType(responseType);
				if (result == null) result = caseElement(responseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESTFUL_CONFORMANCE_MODE: {
				RestfulConformanceMode restfulConformanceMode = (RestfulConformanceMode)theEObject;
				T result = caseRestfulConformanceMode(restfulConformanceMode);
				if (result == null) result = caseElement(restfulConformanceMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RISK_ASSESSMENT: {
				RiskAssessment riskAssessment = (RiskAssessment)theEObject;
				T result = caseRiskAssessment(riskAssessment);
				if (result == null) result = caseDomainResource(riskAssessment);
				if (result == null) result = caseResource(riskAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RISK_ASSESSMENT_PREDICTION: {
				RiskAssessmentPrediction riskAssessmentPrediction = (RiskAssessmentPrediction)theEObject;
				T result = caseRiskAssessmentPrediction(riskAssessmentPrediction);
				if (result == null) result = caseBackboneElement(riskAssessmentPrediction);
				if (result == null) result = caseElement(riskAssessmentPrediction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SAMPLED_DATA: {
				SampledData sampledData = (SampledData)theEObject;
				T result = caseSampledData(sampledData);
				if (result == null) result = caseElement(sampledData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SAMPLED_DATA_DATA_TYPE: {
				SampledDataDataType sampledDataDataType = (SampledDataDataType)theEObject;
				T result = caseSampledDataDataType(sampledDataDataType);
				if (result == null) result = caseElement(sampledDataDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SCHEDULE: {
				Schedule schedule = (Schedule)theEObject;
				T result = caseSchedule(schedule);
				if (result == null) result = caseDomainResource(schedule);
				if (result == null) result = caseResource(schedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEARCH_ENTRY_MODE: {
				SearchEntryMode searchEntryMode = (SearchEntryMode)theEObject;
				T result = caseSearchEntryMode(searchEntryMode);
				if (result == null) result = caseElement(searchEntryMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEARCH_MODIFIER_CODE: {
				SearchModifierCode searchModifierCode = (SearchModifierCode)theEObject;
				T result = caseSearchModifierCode(searchModifierCode);
				if (result == null) result = caseElement(searchModifierCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEARCH_PARAMETER: {
				SearchParameter searchParameter = (SearchParameter)theEObject;
				T result = caseSearchParameter(searchParameter);
				if (result == null) result = caseDomainResource(searchParameter);
				if (result == null) result = caseResource(searchParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEARCH_PARAMETER_CONTACT: {
				SearchParameterContact searchParameterContact = (SearchParameterContact)theEObject;
				T result = caseSearchParameterContact(searchParameterContact);
				if (result == null) result = caseBackboneElement(searchParameterContact);
				if (result == null) result = caseElement(searchParameterContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEARCH_PARAM_TYPE: {
				SearchParamType searchParamType = (SearchParamType)theEObject;
				T result = caseSearchParamType(searchParamType);
				if (result == null) result = caseElement(searchParamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseDomainResource(sequence);
				if (result == null) result = caseResource(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEQUENCE_INNER: {
				SequenceInner sequenceInner = (SequenceInner)theEObject;
				T result = caseSequenceInner(sequenceInner);
				if (result == null) result = caseBackboneElement(sequenceInner);
				if (result == null) result = caseElement(sequenceInner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEQUENCE_OUTER: {
				SequenceOuter sequenceOuter = (SequenceOuter)theEObject;
				T result = caseSequenceOuter(sequenceOuter);
				if (result == null) result = caseBackboneElement(sequenceOuter);
				if (result == null) result = caseElement(sequenceOuter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEQUENCE_QUALITY: {
				SequenceQuality sequenceQuality = (SequenceQuality)theEObject;
				T result = caseSequenceQuality(sequenceQuality);
				if (result == null) result = caseBackboneElement(sequenceQuality);
				if (result == null) result = caseElement(sequenceQuality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEQUENCE_REFERENCE_SEQ: {
				SequenceReferenceSeq sequenceReferenceSeq = (SequenceReferenceSeq)theEObject;
				T result = caseSequenceReferenceSeq(sequenceReferenceSeq);
				if (result == null) result = caseBackboneElement(sequenceReferenceSeq);
				if (result == null) result = caseElement(sequenceReferenceSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEQUENCE_REPOSITORY: {
				SequenceRepository sequenceRepository = (SequenceRepository)theEObject;
				T result = caseSequenceRepository(sequenceRepository);
				if (result == null) result = caseBackboneElement(sequenceRepository);
				if (result == null) result = caseElement(sequenceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEQUENCE_STRUCTURE_VARIATION: {
				SequenceStructureVariation sequenceStructureVariation = (SequenceStructureVariation)theEObject;
				T result = caseSequenceStructureVariation(sequenceStructureVariation);
				if (result == null) result = caseBackboneElement(sequenceStructureVariation);
				if (result == null) result = caseElement(sequenceStructureVariation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null) result = caseElement(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEQUENCE_VARIATION: {
				SequenceVariation sequenceVariation = (SequenceVariation)theEObject;
				T result = caseSequenceVariation(sequenceVariation);
				if (result == null) result = caseBackboneElement(sequenceVariation);
				if (result == null) result = caseElement(sequenceVariation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SIGNATURE: {
				Signature signature = (Signature)theEObject;
				T result = caseSignature(signature);
				if (result == null) result = caseElement(signature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SIMPLE_QUANTITY: {
				SimpleQuantity simpleQuantity = (SimpleQuantity)theEObject;
				T result = caseSimpleQuantity(simpleQuantity);
				if (result == null) result = caseQuantity(simpleQuantity);
				if (result == null) result = caseElement(simpleQuantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SLICING_RULES: {
				SlicingRules slicingRules = (SlicingRules)theEObject;
				T result = caseSlicingRules(slicingRules);
				if (result == null) result = caseElement(slicingRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SLOT: {
				Slot slot = (Slot)theEObject;
				T result = caseSlot(slot);
				if (result == null) result = caseDomainResource(slot);
				if (result == null) result = caseResource(slot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SLOT_STATUS: {
				SlotStatus slotStatus = (SlotStatus)theEObject;
				T result = caseSlotStatus(slotStatus);
				if (result == null) result = caseElement(slotStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN: {
				Specimen specimen = (Specimen)theEObject;
				T result = caseSpecimen(specimen);
				if (result == null) result = caseDomainResource(specimen);
				if (result == null) result = caseResource(specimen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_COLLECTION: {
				SpecimenCollection specimenCollection = (SpecimenCollection)theEObject;
				T result = caseSpecimenCollection(specimenCollection);
				if (result == null) result = caseBackboneElement(specimenCollection);
				if (result == null) result = caseElement(specimenCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_CONTAINER: {
				SpecimenContainer specimenContainer = (SpecimenContainer)theEObject;
				T result = caseSpecimenContainer(specimenContainer);
				if (result == null) result = caseBackboneElement(specimenContainer);
				if (result == null) result = caseElement(specimenContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_STATUS: {
				SpecimenStatus specimenStatus = (SpecimenStatus)theEObject;
				T result = caseSpecimenStatus(specimenStatus);
				if (result == null) result = caseElement(specimenStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_TREATMENT: {
				SpecimenTreatment specimenTreatment = (SpecimenTreatment)theEObject;
				T result = caseSpecimenTreatment(specimenTreatment);
				if (result == null) result = caseBackboneElement(specimenTreatment);
				if (result == null) result = caseElement(specimenTreatment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRING: {
				org.hl7.fhir.String string = (org.hl7.fhir.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseElement(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_DEFINITION: {
				StructureDefinition structureDefinition = (StructureDefinition)theEObject;
				T result = caseStructureDefinition(structureDefinition);
				if (result == null) result = caseDomainResource(structureDefinition);
				if (result == null) result = caseResource(structureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_DEFINITION_CONTACT: {
				StructureDefinitionContact structureDefinitionContact = (StructureDefinitionContact)theEObject;
				T result = caseStructureDefinitionContact(structureDefinitionContact);
				if (result == null) result = caseBackboneElement(structureDefinitionContact);
				if (result == null) result = caseElement(structureDefinitionContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_DEFINITION_DIFFERENTIAL: {
				StructureDefinitionDifferential structureDefinitionDifferential = (StructureDefinitionDifferential)theEObject;
				T result = caseStructureDefinitionDifferential(structureDefinitionDifferential);
				if (result == null) result = caseBackboneElement(structureDefinitionDifferential);
				if (result == null) result = caseElement(structureDefinitionDifferential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_DEFINITION_KIND: {
				StructureDefinitionKind structureDefinitionKind = (StructureDefinitionKind)theEObject;
				T result = caseStructureDefinitionKind(structureDefinitionKind);
				if (result == null) result = caseElement(structureDefinitionKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING: {
				StructureDefinitionMapping structureDefinitionMapping = (StructureDefinitionMapping)theEObject;
				T result = caseStructureDefinitionMapping(structureDefinitionMapping);
				if (result == null) result = caseBackboneElement(structureDefinitionMapping);
				if (result == null) result = caseElement(structureDefinitionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_DEFINITION_SNAPSHOT: {
				StructureDefinitionSnapshot structureDefinitionSnapshot = (StructureDefinitionSnapshot)theEObject;
				T result = caseStructureDefinitionSnapshot(structureDefinitionSnapshot);
				if (result == null) result = caseBackboneElement(structureDefinitionSnapshot);
				if (result == null) result = caseElement(structureDefinitionSnapshot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP: {
				StructureMap structureMap = (StructureMap)theEObject;
				T result = caseStructureMap(structureMap);
				if (result == null) result = caseDomainResource(structureMap);
				if (result == null) result = caseResource(structureMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_CONTACT: {
				StructureMapContact structureMapContact = (StructureMapContact)theEObject;
				T result = caseStructureMapContact(structureMapContact);
				if (result == null) result = caseBackboneElement(structureMapContact);
				if (result == null) result = caseElement(structureMapContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE: {
				StructureMapContextType structureMapContextType = (StructureMapContextType)theEObject;
				T result = caseStructureMapContextType(structureMapContextType);
				if (result == null) result = caseElement(structureMapContextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_DEPENDENT: {
				StructureMapDependent structureMapDependent = (StructureMapDependent)theEObject;
				T result = caseStructureMapDependent(structureMapDependent);
				if (result == null) result = caseBackboneElement(structureMapDependent);
				if (result == null) result = caseElement(structureMapDependent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_GROUP: {
				StructureMapGroup structureMapGroup = (StructureMapGroup)theEObject;
				T result = caseStructureMapGroup(structureMapGroup);
				if (result == null) result = caseBackboneElement(structureMapGroup);
				if (result == null) result = caseElement(structureMapGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_INPUT: {
				StructureMapInput structureMapInput = (StructureMapInput)theEObject;
				T result = caseStructureMapInput(structureMapInput);
				if (result == null) result = caseBackboneElement(structureMapInput);
				if (result == null) result = caseElement(structureMapInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE: {
				StructureMapInputMode structureMapInputMode = (StructureMapInputMode)theEObject;
				T result = caseStructureMapInputMode(structureMapInputMode);
				if (result == null) result = caseElement(structureMapInputMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_LIST_MODE: {
				StructureMapListMode structureMapListMode = (StructureMapListMode)theEObject;
				T result = caseStructureMapListMode(structureMapListMode);
				if (result == null) result = caseElement(structureMapListMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE: {
				StructureMapModelMode structureMapModelMode = (StructureMapModelMode)theEObject;
				T result = caseStructureMapModelMode(structureMapModelMode);
				if (result == null) result = caseElement(structureMapModelMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_PARAMETER: {
				StructureMapParameter structureMapParameter = (StructureMapParameter)theEObject;
				T result = caseStructureMapParameter(structureMapParameter);
				if (result == null) result = caseBackboneElement(structureMapParameter);
				if (result == null) result = caseElement(structureMapParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_RULE: {
				StructureMapRule structureMapRule = (StructureMapRule)theEObject;
				T result = caseStructureMapRule(structureMapRule);
				if (result == null) result = caseBackboneElement(structureMapRule);
				if (result == null) result = caseElement(structureMapRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_SOURCE: {
				StructureMapSource structureMapSource = (StructureMapSource)theEObject;
				T result = caseStructureMapSource(structureMapSource);
				if (result == null) result = caseBackboneElement(structureMapSource);
				if (result == null) result = caseElement(structureMapSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_STRUCTURE: {
				StructureMapStructure structureMapStructure = (StructureMapStructure)theEObject;
				T result = caseStructureMapStructure(structureMapStructure);
				if (result == null) result = caseBackboneElement(structureMapStructure);
				if (result == null) result = caseElement(structureMapStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_TARGET: {
				StructureMapTarget structureMapTarget = (StructureMapTarget)theEObject;
				T result = caseStructureMapTarget(structureMapTarget);
				if (result == null) result = caseBackboneElement(structureMapTarget);
				if (result == null) result = caseElement(structureMapTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_TRANSFORM: {
				StructureMapTransform structureMapTransform = (StructureMapTransform)theEObject;
				T result = caseStructureMapTransform(structureMapTransform);
				if (result == null) result = caseElement(structureMapTransform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSCRIPTION: {
				Subscription subscription = (Subscription)theEObject;
				T result = caseSubscription(subscription);
				if (result == null) result = caseDomainResource(subscription);
				if (result == null) result = caseResource(subscription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSCRIPTION_CHANNEL: {
				SubscriptionChannel subscriptionChannel = (SubscriptionChannel)theEObject;
				T result = caseSubscriptionChannel(subscriptionChannel);
				if (result == null) result = caseBackboneElement(subscriptionChannel);
				if (result == null) result = caseElement(subscriptionChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE: {
				SubscriptionChannelType subscriptionChannelType = (SubscriptionChannelType)theEObject;
				T result = caseSubscriptionChannelType(subscriptionChannelType);
				if (result == null) result = caseElement(subscriptionChannelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSCRIPTION_STATUS: {
				SubscriptionStatus subscriptionStatus = (SubscriptionStatus)theEObject;
				T result = caseSubscriptionStatus(subscriptionStatus);
				if (result == null) result = caseElement(subscriptionStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE: {
				Substance substance = (Substance)theEObject;
				T result = caseSubstance(substance);
				if (result == null) result = caseDomainResource(substance);
				if (result == null) result = caseResource(substance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_INGREDIENT: {
				SubstanceIngredient substanceIngredient = (SubstanceIngredient)theEObject;
				T result = caseSubstanceIngredient(substanceIngredient);
				if (result == null) result = caseBackboneElement(substanceIngredient);
				if (result == null) result = caseElement(substanceIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_INSTANCE: {
				SubstanceInstance substanceInstance = (SubstanceInstance)theEObject;
				T result = caseSubstanceInstance(substanceInstance);
				if (result == null) result = caseBackboneElement(substanceInstance);
				if (result == null) result = caseElement(substanceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUPPLY_DELIVERY: {
				SupplyDelivery supplyDelivery = (SupplyDelivery)theEObject;
				T result = caseSupplyDelivery(supplyDelivery);
				if (result == null) result = caseDomainResource(supplyDelivery);
				if (result == null) result = caseResource(supplyDelivery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUPPLY_DELIVERY_STATUS: {
				SupplyDeliveryStatus supplyDeliveryStatus = (SupplyDeliveryStatus)theEObject;
				T result = caseSupplyDeliveryStatus(supplyDeliveryStatus);
				if (result == null) result = caseElement(supplyDeliveryStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUPPLY_REQUEST: {
				SupplyRequest supplyRequest = (SupplyRequest)theEObject;
				T result = caseSupplyRequest(supplyRequest);
				if (result == null) result = caseDomainResource(supplyRequest);
				if (result == null) result = caseResource(supplyRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUPPLY_REQUEST_STATUS: {
				SupplyRequestStatus supplyRequestStatus = (SupplyRequestStatus)theEObject;
				T result = caseSupplyRequestStatus(supplyRequestStatus);
				if (result == null) result = caseElement(supplyRequestStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUPPLY_REQUEST_WHEN: {
				SupplyRequestWhen supplyRequestWhen = (SupplyRequestWhen)theEObject;
				T result = caseSupplyRequestWhen(supplyRequestWhen);
				if (result == null) result = caseBackboneElement(supplyRequestWhen);
				if (result == null) result = caseElement(supplyRequestWhen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION: {
				SystemRestfulInteraction systemRestfulInteraction = (SystemRestfulInteraction)theEObject;
				T result = caseSystemRestfulInteraction(systemRestfulInteraction);
				if (result == null) result = caseElement(systemRestfulInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseDomainResource(task);
				if (result == null) result = caseResource(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TASK_FULFILLMENT: {
				TaskFulfillment taskFulfillment = (TaskFulfillment)theEObject;
				T result = caseTaskFulfillment(taskFulfillment);
				if (result == null) result = caseBackboneElement(taskFulfillment);
				if (result == null) result = caseElement(taskFulfillment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TASK_INPUT: {
				TaskInput taskInput = (TaskInput)theEObject;
				T result = caseTaskInput(taskInput);
				if (result == null) result = caseBackboneElement(taskInput);
				if (result == null) result = caseElement(taskInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TASK_OUTPUT: {
				TaskOutput taskOutput = (TaskOutput)theEObject;
				T result = caseTaskOutput(taskOutput);
				if (result == null) result = caseBackboneElement(taskOutput);
				if (result == null) result = caseElement(taskOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TASK_PRIORITY: {
				TaskPriority taskPriority = (TaskPriority)theEObject;
				T result = caseTaskPriority(taskPriority);
				if (result == null) result = caseElement(taskPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TASK_STATUS: {
				TaskStatus taskStatus = (TaskStatus)theEObject;
				T result = caseTaskStatus(taskStatus);
				if (result == null) result = caseElement(taskStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT: {
				TestScript testScript = (TestScript)theEObject;
				T result = caseTestScript(testScript);
				if (result == null) result = caseDomainResource(testScript);
				if (result == null) result = caseResource(testScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_ACTION: {
				TestScriptAction testScriptAction = (TestScriptAction)theEObject;
				T result = caseTestScriptAction(testScriptAction);
				if (result == null) result = caseBackboneElement(testScriptAction);
				if (result == null) result = caseElement(testScriptAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_ACTION1: {
				TestScriptAction1 testScriptAction1 = (TestScriptAction1)theEObject;
				T result = caseTestScriptAction1(testScriptAction1);
				if (result == null) result = caseBackboneElement(testScriptAction1);
				if (result == null) result = caseElement(testScriptAction1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_ACTION2: {
				TestScriptAction2 testScriptAction2 = (TestScriptAction2)theEObject;
				T result = caseTestScriptAction2(testScriptAction2);
				if (result == null) result = caseBackboneElement(testScriptAction2);
				if (result == null) result = caseElement(testScriptAction2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_ASSERT: {
				TestScriptAssert testScriptAssert = (TestScriptAssert)theEObject;
				T result = caseTestScriptAssert(testScriptAssert);
				if (result == null) result = caseBackboneElement(testScriptAssert);
				if (result == null) result = caseElement(testScriptAssert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_CAPABILITY: {
				TestScriptCapability testScriptCapability = (TestScriptCapability)theEObject;
				T result = caseTestScriptCapability(testScriptCapability);
				if (result == null) result = caseBackboneElement(testScriptCapability);
				if (result == null) result = caseElement(testScriptCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_CONTACT: {
				TestScriptContact testScriptContact = (TestScriptContact)theEObject;
				T result = caseTestScriptContact(testScriptContact);
				if (result == null) result = caseBackboneElement(testScriptContact);
				if (result == null) result = caseElement(testScriptContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_DESTINATION: {
				TestScriptDestination testScriptDestination = (TestScriptDestination)theEObject;
				T result = caseTestScriptDestination(testScriptDestination);
				if (result == null) result = caseBackboneElement(testScriptDestination);
				if (result == null) result = caseElement(testScriptDestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_FIXTURE: {
				TestScriptFixture testScriptFixture = (TestScriptFixture)theEObject;
				T result = caseTestScriptFixture(testScriptFixture);
				if (result == null) result = caseBackboneElement(testScriptFixture);
				if (result == null) result = caseElement(testScriptFixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_LINK: {
				TestScriptLink testScriptLink = (TestScriptLink)theEObject;
				T result = caseTestScriptLink(testScriptLink);
				if (result == null) result = caseBackboneElement(testScriptLink);
				if (result == null) result = caseElement(testScriptLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_METADATA: {
				TestScriptMetadata testScriptMetadata = (TestScriptMetadata)theEObject;
				T result = caseTestScriptMetadata(testScriptMetadata);
				if (result == null) result = caseBackboneElement(testScriptMetadata);
				if (result == null) result = caseElement(testScriptMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_OPERATION: {
				TestScriptOperation testScriptOperation = (TestScriptOperation)theEObject;
				T result = caseTestScriptOperation(testScriptOperation);
				if (result == null) result = caseBackboneElement(testScriptOperation);
				if (result == null) result = caseElement(testScriptOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_ORIGIN: {
				TestScriptOrigin testScriptOrigin = (TestScriptOrigin)theEObject;
				T result = caseTestScriptOrigin(testScriptOrigin);
				if (result == null) result = caseBackboneElement(testScriptOrigin);
				if (result == null) result = caseElement(testScriptOrigin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_PARAM: {
				TestScriptParam testScriptParam = (TestScriptParam)theEObject;
				T result = caseTestScriptParam(testScriptParam);
				if (result == null) result = caseBackboneElement(testScriptParam);
				if (result == null) result = caseElement(testScriptParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_PARAM1: {
				TestScriptParam1 testScriptParam1 = (TestScriptParam1)theEObject;
				T result = caseTestScriptParam1(testScriptParam1);
				if (result == null) result = caseBackboneElement(testScriptParam1);
				if (result == null) result = caseElement(testScriptParam1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_PARAM2: {
				TestScriptParam2 testScriptParam2 = (TestScriptParam2)theEObject;
				T result = caseTestScriptParam2(testScriptParam2);
				if (result == null) result = caseBackboneElement(testScriptParam2);
				if (result == null) result = caseElement(testScriptParam2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_PARAM3: {
				TestScriptParam3 testScriptParam3 = (TestScriptParam3)theEObject;
				T result = caseTestScriptParam3(testScriptParam3);
				if (result == null) result = caseBackboneElement(testScriptParam3);
				if (result == null) result = caseElement(testScriptParam3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_REQUEST_HEADER: {
				TestScriptRequestHeader testScriptRequestHeader = (TestScriptRequestHeader)theEObject;
				T result = caseTestScriptRequestHeader(testScriptRequestHeader);
				if (result == null) result = caseBackboneElement(testScriptRequestHeader);
				if (result == null) result = caseElement(testScriptRequestHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_RULE: {
				TestScriptRule testScriptRule = (TestScriptRule)theEObject;
				T result = caseTestScriptRule(testScriptRule);
				if (result == null) result = caseBackboneElement(testScriptRule);
				if (result == null) result = caseElement(testScriptRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_RULE1: {
				TestScriptRule1 testScriptRule1 = (TestScriptRule1)theEObject;
				T result = caseTestScriptRule1(testScriptRule1);
				if (result == null) result = caseBackboneElement(testScriptRule1);
				if (result == null) result = caseElement(testScriptRule1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_RULE2: {
				TestScriptRule2 testScriptRule2 = (TestScriptRule2)theEObject;
				T result = caseTestScriptRule2(testScriptRule2);
				if (result == null) result = caseBackboneElement(testScriptRule2);
				if (result == null) result = caseElement(testScriptRule2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_RULE3: {
				TestScriptRule3 testScriptRule3 = (TestScriptRule3)theEObject;
				T result = caseTestScriptRule3(testScriptRule3);
				if (result == null) result = caseBackboneElement(testScriptRule3);
				if (result == null) result = caseElement(testScriptRule3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_RULESET: {
				TestScriptRuleset testScriptRuleset = (TestScriptRuleset)theEObject;
				T result = caseTestScriptRuleset(testScriptRuleset);
				if (result == null) result = caseBackboneElement(testScriptRuleset);
				if (result == null) result = caseElement(testScriptRuleset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_RULESET1: {
				TestScriptRuleset1 testScriptRuleset1 = (TestScriptRuleset1)theEObject;
				T result = caseTestScriptRuleset1(testScriptRuleset1);
				if (result == null) result = caseBackboneElement(testScriptRuleset1);
				if (result == null) result = caseElement(testScriptRuleset1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_SETUP: {
				TestScriptSetup testScriptSetup = (TestScriptSetup)theEObject;
				T result = caseTestScriptSetup(testScriptSetup);
				if (result == null) result = caseBackboneElement(testScriptSetup);
				if (result == null) result = caseElement(testScriptSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_TEARDOWN: {
				TestScriptTeardown testScriptTeardown = (TestScriptTeardown)theEObject;
				T result = caseTestScriptTeardown(testScriptTeardown);
				if (result == null) result = caseBackboneElement(testScriptTeardown);
				if (result == null) result = caseElement(testScriptTeardown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_TEST: {
				TestScriptTest testScriptTest = (TestScriptTest)theEObject;
				T result = caseTestScriptTest(testScriptTest);
				if (result == null) result = caseBackboneElement(testScriptTest);
				if (result == null) result = caseElement(testScriptTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_VARIABLE: {
				TestScriptVariable testScriptVariable = (TestScriptVariable)theEObject;
				T result = caseTestScriptVariable(testScriptVariable);
				if (result == null) result = caseBackboneElement(testScriptVariable);
				if (result == null) result = caseElement(testScriptVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = caseElement(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TIMING: {
				Timing timing = (Timing)theEObject;
				T result = caseTiming(timing);
				if (result == null) result = caseElement(timing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TIMING_REPEAT: {
				TimingRepeat timingRepeat = (TimingRepeat)theEObject;
				T result = caseTimingRepeat(timingRepeat);
				if (result == null) result = caseElement(timingRepeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TRANSACTION_MODE: {
				TransactionMode transactionMode = (TransactionMode)theEObject;
				T result = caseTransactionMode(transactionMode);
				if (result == null) result = caseElement(transactionMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TRIGGER_DEFINITION: {
				TriggerDefinition triggerDefinition = (TriggerDefinition)theEObject;
				T result = caseTriggerDefinition(triggerDefinition);
				if (result == null) result = caseElement(triggerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TRIGGER_TYPE: {
				TriggerType triggerType = (TriggerType)theEObject;
				T result = caseTriggerType(triggerType);
				if (result == null) result = caseElement(triggerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TYPE_DERIVATION_RULE: {
				TypeDerivationRule typeDerivationRule = (TypeDerivationRule)theEObject;
				T result = caseTypeDerivationRule(typeDerivationRule);
				if (result == null) result = caseElement(typeDerivationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TYPE_RESTFUL_INTERACTION: {
				TypeRestfulInteraction typeRestfulInteraction = (TypeRestfulInteraction)theEObject;
				T result = caseTypeRestfulInteraction(typeRestfulInteraction);
				if (result == null) result = caseElement(typeRestfulInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.UNITS_OF_TIME: {
				UnitsOfTime unitsOfTime = (UnitsOfTime)theEObject;
				T result = caseUnitsOfTime(unitsOfTime);
				if (result == null) result = caseElement(unitsOfTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.UNKNOWN_CONTENT_CODE: {
				UnknownContentCode unknownContentCode = (UnknownContentCode)theEObject;
				T result = caseUnknownContentCode(unknownContentCode);
				if (result == null) result = caseElement(unknownContentCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.UNSIGNED_INT: {
				UnsignedInt unsignedInt = (UnsignedInt)theEObject;
				T result = caseUnsignedInt(unsignedInt);
				if (result == null) result = caseElement(unsignedInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.URI: {
				Uri uri = (Uri)theEObject;
				T result = caseUri(uri);
				if (result == null) result = caseElement(uri);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.USE: {
				Use use = (Use)theEObject;
				T result = caseUse(use);
				if (result == null) result = caseElement(use);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.UUID: {
				Uuid uuid = (Uuid)theEObject;
				T result = caseUuid(uuid);
				if (result == null) result = caseElement(uuid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET: {
				ValueSet valueSet = (ValueSet)theEObject;
				T result = caseValueSet(valueSet);
				if (result == null) result = caseDomainResource(valueSet);
				if (result == null) result = caseResource(valueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_COMPOSE: {
				ValueSetCompose valueSetCompose = (ValueSetCompose)theEObject;
				T result = caseValueSetCompose(valueSetCompose);
				if (result == null) result = caseBackboneElement(valueSetCompose);
				if (result == null) result = caseElement(valueSetCompose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_CONCEPT: {
				ValueSetConcept valueSetConcept = (ValueSetConcept)theEObject;
				T result = caseValueSetConcept(valueSetConcept);
				if (result == null) result = caseBackboneElement(valueSetConcept);
				if (result == null) result = caseElement(valueSetConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_CONTACT: {
				ValueSetContact valueSetContact = (ValueSetContact)theEObject;
				T result = caseValueSetContact(valueSetContact);
				if (result == null) result = caseBackboneElement(valueSetContact);
				if (result == null) result = caseElement(valueSetContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_CONTAINS: {
				ValueSetContains valueSetContains = (ValueSetContains)theEObject;
				T result = caseValueSetContains(valueSetContains);
				if (result == null) result = caseBackboneElement(valueSetContains);
				if (result == null) result = caseElement(valueSetContains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_DESIGNATION: {
				ValueSetDesignation valueSetDesignation = (ValueSetDesignation)theEObject;
				T result = caseValueSetDesignation(valueSetDesignation);
				if (result == null) result = caseBackboneElement(valueSetDesignation);
				if (result == null) result = caseElement(valueSetDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_EXPANSION: {
				ValueSetExpansion valueSetExpansion = (ValueSetExpansion)theEObject;
				T result = caseValueSetExpansion(valueSetExpansion);
				if (result == null) result = caseBackboneElement(valueSetExpansion);
				if (result == null) result = caseElement(valueSetExpansion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_FILTER: {
				ValueSetFilter valueSetFilter = (ValueSetFilter)theEObject;
				T result = caseValueSetFilter(valueSetFilter);
				if (result == null) result = caseBackboneElement(valueSetFilter);
				if (result == null) result = caseElement(valueSetFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_INCLUDE: {
				ValueSetInclude valueSetInclude = (ValueSetInclude)theEObject;
				T result = caseValueSetInclude(valueSetInclude);
				if (result == null) result = caseBackboneElement(valueSetInclude);
				if (result == null) result = caseElement(valueSetInclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_PARAMETER: {
				ValueSetParameter valueSetParameter = (ValueSetParameter)theEObject;
				T result = caseValueSetParameter(valueSetParameter);
				if (result == null) result = caseBackboneElement(valueSetParameter);
				if (result == null) result = caseElement(valueSetParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VISION_BASE: {
				VisionBase visionBase = (VisionBase)theEObject;
				T result = caseVisionBase(visionBase);
				if (result == null) result = caseElement(visionBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VISION_EYES: {
				VisionEyes visionEyes = (VisionEyes)theEObject;
				T result = caseVisionEyes(visionEyes);
				if (result == null) result = caseElement(visionEyes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VISION_PRESCRIPTION: {
				VisionPrescription visionPrescription = (VisionPrescription)theEObject;
				T result = caseVisionPrescription(visionPrescription);
				if (result == null) result = caseDomainResource(visionPrescription);
				if (result == null) result = caseResource(visionPrescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE: {
				VisionPrescriptionDispense visionPrescriptionDispense = (VisionPrescriptionDispense)theEObject;
				T result = caseVisionPrescriptionDispense(visionPrescriptionDispense);
				if (result == null) result = caseBackboneElement(visionPrescriptionDispense);
				if (result == null) result = caseElement(visionPrescriptionDispense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.XPATH_USAGE_TYPE: {
				XPathUsageType xPathUsageType = (XPathUsageType)theEObject;
				T result = caseXPathUsageType(xPathUsageType);
				if (result == null) result = caseElement(xPathUsageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountStatus(AccountStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDefinition(ActionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Definition Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Definition Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDefinitionBehavior(ActionDefinitionBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Definition Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Definition Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDefinitionCustomization(ActionDefinitionCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Definition Related Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Definition Related Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDefinitionRelatedAction(ActionDefinitionRelatedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionList(ActionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Relationship Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Relationship Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionRelationshipAnchor(ActionRelationshipAnchor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionRelationshipType(ActionRelationshipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionType(ActionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Definition Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Definition Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDefinitionCategory(ActivityDefinitionCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressUse(AddressUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrative Gender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrative Gender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativeGender(AdministrativeGender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Age</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Age</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAge(Age object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationMode(AggregationMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntolerance(AllergyIntolerance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceCategory(AllergyIntoleranceCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Certainty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Certainty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceCertainty(AllergyIntoleranceCertainty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Criticality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Criticality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceCriticality(AllergyIntoleranceCriticality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Reaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceReaction(AllergyIntoleranceReaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Severity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Severity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceSeverity(AllergyIntoleranceSeverity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceStatus(AllergyIntoleranceStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceType(AllergyIntoleranceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointment(Appointment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointmentParticipant(AppointmentParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointmentResponse(AppointmentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointmentStatus(AppointmentStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion Direction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion Direction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertionDirectionType(AssertionDirectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion Operator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion Operator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertionOperatorType(AssertionOperatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion Response Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion Response Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertionResponseTypes(AssertionResponseTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEvent(AuditEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventAction(AuditEventAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventAgent(AuditEventAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventDetail(AuditEventDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventEntity(AuditEventEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventNetwork(AuditEventNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventOutcome(AuditEventOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Participant Network Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Participant Network Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventParticipantNetworkType(AuditEventParticipantNetworkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventSource(AuditEventSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backbone Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backbone Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackboneElement(BackboneElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base64 Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base64 Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase64Binary(Base64Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasic(Basic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinary(Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Strength</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Strength</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingStrength(BindingStrength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodySite(BodySite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(org.hl7.fhir.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundle(Bundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleEntry(BundleEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleLink(BundleLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleRequest(BundleRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleResponse(BundleResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleSearch(BundleSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleType(BundleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlan(CarePlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanActivity(CarePlanActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Activity Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Activity Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanActivityStatus(CarePlanActivityStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanDetail(CarePlanDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Related Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Related Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanRelatedPlan(CarePlanRelatedPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanRelationship(CarePlanRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanStatus(CarePlanStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCareTeam(CareTeam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Team Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Team Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCareTeamParticipant(CareTeamParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaim(Claim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimCoverage(ClaimCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimDetail(ClaimDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimDiagnosis(ClaimDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimItem(ClaimItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Missing Teeth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Missing Teeth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimMissingTeeth(ClaimMissingTeeth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Onset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Onset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimOnset(ClaimOnset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Payee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Payee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimPayee(ClaimPayee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimProcedure(ClaimProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Prosthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Prosthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimProsthesis(ClaimProsthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimRelated(ClaimRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponse(ClaimResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Add Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Add Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAddItem(ClaimResponseAddItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAdjudication(ClaimResponseAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Adjudication1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Adjudication1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAdjudication1(ClaimResponseAdjudication1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Adjudication2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Adjudication2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAdjudication2(ClaimResponseAdjudication2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Adjudication3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Adjudication3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAdjudication3(ClaimResponseAdjudication3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Adjudication4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Adjudication4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAdjudication4(ClaimResponseAdjudication4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseCoverage(ClaimResponseCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseDetail(ClaimResponseDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Detail1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Detail1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseDetail1(ClaimResponseDetail1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseError(ClaimResponseError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItem(ClaimResponseItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseNote(ClaimResponseNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseSubDetail(ClaimResponseSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimSubDetail(ClaimSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimType(ClaimType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimType2(ClaimType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpression(ClinicalImpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpressionFinding(ClinicalImpressionFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression Investigations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression Investigations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpressionInvestigations(ClinicalImpressionInvestigations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression Ruled Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression Ruled Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpressionRuledOut(ClinicalImpressionRuledOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpressionStatus(ClinicalImpressionStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Codeable Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Codeable Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeableConcept(CodeableConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystem(CodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemConcept(CodeSystemConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemContact(CodeSystemContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Content Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Content Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemContentMode(CodeSystemContentMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemDesignation(CodeSystemDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemFilter(CodeSystemFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemProperty(CodeSystemProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Property1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Property1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemProperty1(CodeSystemProperty1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoding(Coding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunication(Communication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationPayload(CommunicationPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationRequest(CommunicationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Request Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Request Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationRequestPayload(CommunicationRequestPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Request Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationRequestStatus(CommunicationRequestStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationStatus(CommunicationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentDefinition(CompartmentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Definition Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Definition Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentDefinitionContact(CompartmentDefinitionContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Definition Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Definition Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentDefinitionResource(CompartmentDefinitionResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentType(CompartmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Attestation Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Attestation Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionAttestationMode(CompositionAttestationMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Attester</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Attester</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionAttester(CompositionAttester object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionEvent(CompositionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionSection(CompositionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionStatus(CompositionStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMap(ConceptMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapContact(ConceptMapContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Depends On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Depends On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapDependsOn(ConceptMapDependsOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapElement(ConceptMapElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Equivalence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Equivalence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapEquivalence(ConceptMapEquivalence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapTarget(ConceptMapTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Delete Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Delete Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalDeleteStatus(ConditionalDeleteStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionEvidence(ConditionEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionStage(ConditionStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Verification Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Verification Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionVerificationStatus(ConditionVerificationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformance(Conformance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Certificate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceCertificate(ConformanceCertificate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceContact(ConformanceContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceDocument(ConformanceDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceEndpoint(ConformanceEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceEvent(ConformanceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Event Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Event Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceEventMode(ConformanceEventMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceImplementation(ConformanceImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceInteraction(ConformanceInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Interaction1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Interaction1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceInteraction1(ConformanceInteraction1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Messaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Messaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceMessaging(ConformanceMessaging object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceOperation(ConformanceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceResource(ConformanceResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Resource Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Resource Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceResourceStatus(ConformanceResourceStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Rest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Rest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceRest(ConformanceRest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Search Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Search Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceSearchParam(ConformanceSearchParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceSecurity(ConformanceSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceSoftware(ConformanceSoftware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Statement Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Statement Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceStatementKind(ConformanceStatementKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsent(Consent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentAgent(ConsentAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Agent1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Agent1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentAgent1(ConsentAgent1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Except</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Except</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentExcept(ConsentExcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Friendly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Friendly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentFriendly(ConsentFriendly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Legal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Legal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentLegal(ConsentLegal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentStatus(ConsentStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Severity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Severity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintSeverity(ConstraintSeverity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactPoint(ContactPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Point System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Point System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactPointSystem(ContactPointSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Point Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Point Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactPointUse(ContactPointUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentType(ContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContract(Contract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractAgent(ContractAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Agent1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Agent1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractAgent1(ContractAgent1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Friendly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Friendly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractFriendly(ContractFriendly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Legal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Legal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractLegal(ContractLegal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractRule(ContractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Signer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Signer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractSigner(ContractSigner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTerm(ContractTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Valued Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Valued Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractValuedItem(ContractValuedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Valued Item1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Valued Item1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractValuedItem1(ContractValuedItem1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCount(Count object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverage(Coverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElement(DataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElementContact(DataElementContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElementMapping(DataElementMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element Stringency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element Stringency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElementStringency(DataElementStringency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirement(DataRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement Code Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement Code Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirementCodeFilter(DataRequirementCodeFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement Date Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement Date Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirementDateFilter(DataRequirementDateFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Days Of Week</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Days Of Week</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaysOfWeek(DaysOfWeek object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimal(Decimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportRule(DecisionSupportRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Service Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Service Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportServiceModule(DecisionSupportServiceModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detected Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detected Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetectedIssue(DetectedIssue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detected Issue Mitigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detected Issue Mitigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetectedIssueMitigation(DetectedIssueMitigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detected Issue Severity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detected Issue Severity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetectedIssueSeverity(DetectedIssueSeverity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceComponent(DeviceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Component Production Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Component Production Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceComponentProductionSpecification(DeviceComponentProductionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetric(DeviceMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric Calibration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric Calibration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetricCalibration(DeviceMetricCalibration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric Calibration State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric Calibration State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetricCalibrationState(DeviceMetricCalibrationState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric Calibration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric Calibration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetricCalibrationType(DeviceMetricCalibrationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetricCategory(DeviceMetricCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetricColor(DeviceMetricColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric Operational Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric Operational Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetricOperationalStatus(DeviceMetricOperationalStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceStatus(DeviceStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Use Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Use Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceUseRequest(DeviceUseRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Use Request Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Use Request Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceUseRequestPriority(DeviceUseRequestPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Use Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Use Request Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceUseRequestStatus(DeviceUseRequestStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Use Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Use Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceUseStatement(DeviceUseStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticOrder(DiagnosticOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Order Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Order Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticOrderEvent(DiagnosticOrderEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Order Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Order Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticOrderItem(DiagnosticOrderItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Order Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Order Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticOrderPriority(DiagnosticOrderPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Order Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Order Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticOrderStatus(DiagnosticOrderStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticReport(DiagnosticReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Report Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Report Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticReportImage(DiagnosticReportImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Report Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Report Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticReportStatus(DiagnosticReportStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Media Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalMediaType(DigitalMediaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistance(Distance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Manifest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentManifest(DocumentManifest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Manifest Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Manifest Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentManifestContent(DocumentManifestContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Manifest Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Manifest Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentManifestRelated(DocumentManifestRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentMode(DocumentMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReference(DocumentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceContent(DocumentReferenceContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceContext(DocumentReferenceContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceRelated(DocumentReferenceRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Relates To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Relates To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceRelatesTo(DocumentReferenceRelatesTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceStatus(DocumentReferenceStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRelationshipType(DocumentRelationshipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainResource(DomainResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DWeb Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DWeb Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDWebType(DWebType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinition(ElementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionBase(ElementDefinitionBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionBinding(ElementDefinitionBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionConstraint(ElementDefinitionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionMapping(ElementDefinitionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Slicing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Slicing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionSlicing(ElementDefinitionSlicing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionType(ElementDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityRequest(EligibilityRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityResponse(EligibilityResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Response Benefit Balance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Response Benefit Balance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityResponseBenefitBalance(EligibilityResponseBenefitBalance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Response Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Response Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityResponseError(EligibilityResponseError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Response Financial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Response Financial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityResponseFinancial(EligibilityResponseFinancial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounter(Encounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterClass(EncounterClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Hospitalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Hospitalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterHospitalization(EncounterHospitalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterLocation(EncounterLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Location Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Location Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterLocationStatus(EncounterLocationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterParticipant(EncounterParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterState(EncounterState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Status History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Status History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterStatusHistory(EncounterStatusHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpoint(Endpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointStatus(EndpointStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enrollment Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enrollment Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnrollmentRequest(EnrollmentRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enrollment Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enrollment Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnrollmentResponse(EnrollmentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Episode Of Care</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Episode Of Care</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpisodeOfCare(EpisodeOfCare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Episode Of Care Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Episode Of Care Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpisodeOfCareStatus(EpisodeOfCareStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Episode Of Care Status History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Episode Of Care Status History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpisodeOfCareStatusHistory(EpisodeOfCareStatusHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Timing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Timing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventTiming(EventTiming object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfile(ExpansionProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileCodeSystem(ExpansionProfileCodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Code System1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Code System1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileCodeSystem1(ExpansionProfileCodeSystem1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Code System2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Code System2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileCodeSystem2(ExpansionProfileCodeSystem2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileContact(ExpansionProfileContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileDesignation(ExpansionProfileDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Designation1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Designation1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileDesignation1(ExpansionProfileDesignation1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Designation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Designation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileDesignation2(ExpansionProfileDesignation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Exclude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Exclude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileExclude(ExpansionProfileExclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Exclude1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Exclude1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileExclude1(ExpansionProfileExclude1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileInclude(ExpansionProfileInclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Include1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Include1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileInclude1(ExpansionProfileInclude1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefit(ExplanationOfBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Add Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Add Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAddItem(ExplanationOfBenefitAddItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAdjudication(ExplanationOfBenefitAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Adjudication1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Adjudication1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAdjudication1(ExplanationOfBenefitAdjudication1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Adjudication2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Adjudication2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAdjudication2(ExplanationOfBenefitAdjudication2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Adjudication3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Adjudication3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAdjudication3(ExplanationOfBenefitAdjudication3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Adjudication4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Adjudication4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAdjudication4(ExplanationOfBenefitAdjudication4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Benefit Balance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Benefit Balance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitBenefitBalance(ExplanationOfBenefitBenefitBalance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitCoverage(ExplanationOfBenefitCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitDetail(ExplanationOfBenefitDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Detail1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Detail1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitDetail1(ExplanationOfBenefitDetail1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitDiagnosis(ExplanationOfBenefitDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Financial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Financial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitFinancial(ExplanationOfBenefitFinancial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItem(ExplanationOfBenefitItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Missing Teeth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Missing Teeth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitMissingTeeth(ExplanationOfBenefitMissingTeeth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitNote(ExplanationOfBenefitNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Onset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Onset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitOnset(ExplanationOfBenefitOnset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Payee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Payee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitPayee(ExplanationOfBenefitPayee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitProcedure(ExplanationOfBenefitProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Prosthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Prosthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitProsthesis(ExplanationOfBenefitProsthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitRelated(ExplanationOfBenefitRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitSubDetail(ExplanationOfBenefitSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionContext(ExtensionContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryStatus(FamilyHistoryStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family Member History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family Member History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyMemberHistory(FamilyMemberHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family Member History Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family Member History Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyMemberHistoryCondition(FamilyMemberHistoryCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterOperator(FilterOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlag(Flag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flag Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flag Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlagStatus(FlagStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalOutcome(GoalOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalStatus(GoalStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupCharacteristic(GroupCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupMember(GroupMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupType(GroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidanceResponse(GuidanceResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance Response Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance Response Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidanceResponseAction(GuidanceResponseAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance Response Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance Response Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidanceResponseBehavior(GuidanceResponseBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance Response Related Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance Response Related Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidanceResponseRelatedAction(GuidanceResponseRelatedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance Response Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance Response Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidanceResponseStatus(GuidanceResponseStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guide Dependency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guide Dependency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuideDependencyType(GuideDependencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guide Page Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guide Page Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidePageKind(GuidePageKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareService(HealthcareService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Service Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Service Available Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareServiceAvailableTime(HealthcareServiceAvailableTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Service Not Available</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Service Not Available</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareServiceNotAvailable(HealthcareServiceNotAvailable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Verb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Verb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPVerb(HTTPVerb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanName(HumanName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseId(Id object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierUse(IdentifierUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity Assurance Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity Assurance Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentityAssuranceLevel(IdentityAssuranceLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Excerpt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Excerpt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingExcerpt(ImagingExcerpt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Excerpt Dicom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Excerpt Dicom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingExcerptDicom(ImagingExcerptDicom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Excerpt Dicom1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Excerpt Dicom1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingExcerptDicom1(ImagingExcerptDicom1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Excerpt Dicom2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Excerpt Dicom2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingExcerptDicom2(ImagingExcerptDicom2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Excerpt Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Excerpt Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingExcerptInstance(ImagingExcerptInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Excerpt Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Excerpt Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingExcerptSeries(ImagingExcerptSeries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Excerpt Study</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Excerpt Study</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingExcerptStudy(ImagingExcerptStudy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Excerpt Viewable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Excerpt Viewable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingExcerptViewable(ImagingExcerptViewable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Object Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Object Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingObjectSelection(ImagingObjectSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Object Selection Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Object Selection Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingObjectSelectionFrame(ImagingObjectSelectionFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Object Selection Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Object Selection Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingObjectSelectionInstance(ImagingObjectSelectionInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Object Selection Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Object Selection Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingObjectSelectionSeries(ImagingObjectSelectionSeries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Object Selection Study</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Object Selection Study</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingObjectSelectionStudy(ImagingObjectSelectionStudy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudy(ImagingStudy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudyInstance(ImagingStudyInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudySeries(ImagingStudySeries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunization(Immunization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Explanation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Explanation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationExplanation(ImmunizationExplanation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Reaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationReaction(ImmunizationReaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Recommendation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRecommendation(ImmunizationRecommendation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Recommendation Date Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Recommendation Date Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRecommendationDateCriterion(ImmunizationRecommendationDateCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Recommendation Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Recommendation Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRecommendationProtocol(ImmunizationRecommendationProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRecommendationRecommendation(ImmunizationRecommendationRecommendation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Vaccination Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Vaccination Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationVaccinationProtocol(ImmunizationVaccinationProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuide(ImplementationGuide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideContact(ImplementationGuideContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideDependency(ImplementationGuideDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Global</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Global</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideGlobal(ImplementationGuideGlobal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuidePackage(ImplementationGuidePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuidePage(ImplementationGuidePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideResource(ImplementationGuideResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Availability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Availability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceAvailability(InstanceAvailability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstant(Instant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(org.hl7.fhir.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Severity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Severity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssueSeverity(IssueSeverity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssueType(IssueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryCodeSystem(LibraryCodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryLibrary(LibraryLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryModel(LibraryModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryValueSet(LibraryValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linkage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkage(Linkage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linkage Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkage Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkageItem(LinkageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linkage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkageType(LinkageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkType(LinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListEntry(ListEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListMode(ListMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListStatus(ListStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationMode(LocationMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationPosition(LocationPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationStatus(LocationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markdown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markdown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkdown(Markdown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measmnt Principle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measmnt Principle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasmntPrinciple(MeasmntPrinciple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Data Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Data Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureDataUsage(MeasureDataUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroup(MeasureGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurePopulation(MeasurePopulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Population Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Population Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurePopulationType(MeasurePopulationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReport(MeasureReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroup(MeasureReportGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroup1(MeasureReportGroup1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroup2(MeasureReportGroup2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportPopulation(MeasureReportPopulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Population1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Population1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportPopulation1(MeasureReportPopulation1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportStatus(MeasureReportStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Stratifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Stratifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportStratifier(MeasureReportStratifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Supplemental Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Supplemental Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportSupplementalData(MeasureReportSupplementalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportType(MeasureReportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Scoring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Scoring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureScoring(MeasureScoring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Stratifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Stratifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureStratifier(MeasureStratifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Supplemental Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Supplemental Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureSupplementalData(MeasureSupplementalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureType(MeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedia(Media object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedication(Medication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationAdministration(MedicationAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Administration Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Administration Dosage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationAdministrationDosage(MedicationAdministrationDosage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Administration Event History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Administration Event History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationAdministrationEventHistory(MedicationAdministrationEventHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Administration Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Administration Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationAdministrationStatus(MedicationAdministrationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Batch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Batch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationBatch(MedicationBatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationContent(MedicationContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispense(MedicationDispense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense Dosage Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense Dosage Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispenseDosageInstruction(MedicationDispenseDosageInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense Event History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense Event History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispenseEventHistory(MedicationDispenseEventHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispenseStatus(MedicationDispenseStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispenseSubstitution(MedicationDispenseSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationIngredient(MedicationIngredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationOrder(MedicationOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Order Dispense Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Order Dispense Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationOrderDispenseRequest(MedicationOrderDispenseRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Order Dosage Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Order Dosage Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationOrderDosageInstruction(MedicationOrderDosageInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Order Event History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Order Event History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationOrderEventHistory(MedicationOrderEventHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Order Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Order Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationOrderStatus(MedicationOrderStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Order Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Order Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationOrderSubstitution(MedicationOrderSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationPackage(MedicationPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationProduct(MedicationProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationStatement(MedicationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Statement Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Statement Dosage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationStatementDosage(MedicationStatementDosage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Statement Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Statement Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationStatementStatus(MedicationStatementStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeader(MessageHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Header Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeaderDestination(MessageHeaderDestination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Header Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeaderResponse(MessageHeaderResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Header Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeaderSource(MessageHeaderSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Significance Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Significance Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageSignificanceCategory(MessageSignificanceCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeta(Meta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinition(ModuleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Code Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Code Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionCodeFilter(ModuleDefinitionCodeFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionCodeSystem(ModuleDefinitionCodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionData(ModuleDefinitionData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Date Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Date Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionDateFilter(ModuleDefinitionDateFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionLibrary(ModuleDefinitionLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionModel(ModuleDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionParameter(ModuleDefinitionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionValueSet(ModuleDefinitionValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadata(ModuleMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadataContact(ModuleMetadataContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata Contact1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata Contact1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadataContact1(ModuleMetadataContact1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata Contributor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata Contributor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadataContributor(ModuleMetadataContributor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata Contributor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata Contributor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadataContributorType(ModuleMetadataContributorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadataCoverage(ModuleMetadataCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata Related Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata Related Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadataRelatedResource(ModuleMetadataRelatedResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadataResourceType(ModuleMetadataResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadataStatus(ModuleMetadataStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadataType(ModuleMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Money</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Money</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoney(Money object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameUse(NameUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingSystem(NamingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming System Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming System Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingSystemContact(NamingSystemContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming System Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming System Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingSystemIdentifierType(NamingSystemIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingSystemType(NamingSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming System Unique Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming System Unique Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingSystemUniqueId(NamingSystemUniqueId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Narrative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Narrative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNarrative(Narrative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Narrative Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Narrative Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNarrativeStatus(NarrativeStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteType(NoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrder(NutritionOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderAdministration(NutritionOrderAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Enteral Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Enteral Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderEnteralFormula(NutritionOrderEnteralFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Nutrient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Nutrient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderNutrient(NutritionOrderNutrient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Oral Diet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Oral Diet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderOralDiet(NutritionOrderOralDiet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderStatus(NutritionOrderStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Supplement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Supplement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderSupplement(NutritionOrderSupplement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Texture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Texture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderTexture(NutritionOrderTexture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationComponent(ObservationComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Reference Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Reference Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationReferenceRange(ObservationReferenceRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationRelated(ObservationRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationRelationshipType(ObservationRelationshipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationStatus(ObservationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOid(Oid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinition(OperationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionBinding(OperationDefinitionBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionContact(OperationDefinitionContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionParameter(OperationDefinitionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationKind(OperationKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationOutcome(OperationOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Outcome Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Outcome Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationOutcomeIssue(OperationOutcomeIssue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Parameter Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Parameter Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationParameterUse(OperationParameterUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderResponse(OrderResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderSet(OrderSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderStatus(OrderStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderWhen(OrderWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationContact(OrganizationContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDefinition(ParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameters(Parameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersParameter(ParametersParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Required</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Required</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantRequired(ParticipantRequired object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantType(ParticipantType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participation Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participation Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipationStatus(ParticipationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Animal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Animal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientAnimal(PatientAnimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientCommunication(PatientCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientContact(PatientContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientLink(PatientLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Notice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Notice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentNotice(PaymentNotice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Reconciliation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Reconciliation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentReconciliation(PaymentReconciliation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Reconciliation Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Reconciliation Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentReconciliationDetail(PaymentReconciliationDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Reconciliation Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Reconciliation Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentReconciliationNote(PaymentReconciliationNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriod(Period object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonLink(PersonLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveInt(PositiveInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitioner(Practitioner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Practitioner Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Practitioner Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerPractitionerRole(PractitionerPractitionerRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Qualification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerQualification(PractitionerQualification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerRole(PractitionerRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Role Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Role Available Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerRoleAvailableTime(PractitionerRoleAvailableTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Role Not Available</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Role Not Available</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerRoleNotAvailable(PractitionerRoleNotAvailable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Focal Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Focal Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureFocalDevice(ProcedureFocalDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedurePerformer(ProcedurePerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureRequest(ProcedureRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Request Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Request Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureRequestPriority(ProcedureRequestPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Request Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureRequestStatus(ProcedureRequestStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureStatus(ProcedureStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessRequest(ProcessRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Request Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Request Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessRequestItem(ProcessRequestItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessResponse(ProcessResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Response Notes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Response Notes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessResponseNotes(ProcessResponseNotes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyRepresentation(PropertyRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocol(Protocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolActivity(ProtocolActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolComponent(ProtocolComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolCondition(ProtocolCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolDetail(ProtocolDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Next</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Next</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolNext(ProtocolNext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Precondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolPrecondition(ProtocolPrecondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolStatus(ProtocolStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolStep(ProtocolStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolType(ProtocolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenance(Provenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenanceAgent(ProvenanceAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenanceEntity(ProvenanceEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance Entity Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance Entity Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenanceEntityRole(ProvenanceEntityRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance Related Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance Related Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenanceRelatedAgent(ProvenanceRelatedAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Comparator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Comparator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityComparator(QuantityComparator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaire(Questionnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Enable When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Enable When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireEnableWhen(QuestionnaireEnableWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireItem(QuestionnaireItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireItemType(QuestionnaireItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireOption(QuestionnaireOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponse(QuestionnaireResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponseAnswer(QuestionnaireResponseAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponseItem(QuestionnaireResponseItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponseStatus(QuestionnaireResponseStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireStatus(QuestionnaireStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatio(Ratio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Version Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Version Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceVersionRules(ReferenceVersionRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referral Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referral Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferralCategory(ReferralCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referral Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referral Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferralRequest(ReferralRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referral Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referral Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferralStatus(ReferralStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedPerson(RelatedPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remittance Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remittance Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemittanceOutcome(RemittanceOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceContainer(ResourceContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Version Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Version Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceVersionPolicy(ResourceVersionPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseType(ResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restful Conformance Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restful Conformance Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestfulConformanceMode(RestfulConformanceMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskAssessment(RiskAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Assessment Prediction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Assessment Prediction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskAssessmentPrediction(RiskAssessmentPrediction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampled Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampled Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampledData(SampledData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampled Data Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampled Data Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampledDataDataType(SampledDataDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedule(Schedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Entry Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Entry Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchEntryMode(SearchEntryMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Modifier Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Modifier Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchModifierCode(SearchModifierCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchParameter(SearchParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Parameter Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Parameter Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchParameterContact(SearchParameterContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchParamType(SearchParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Inner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Inner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceInner(SequenceInner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Outer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Outer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceOuter(SequenceOuter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Quality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Quality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceQuality(SequenceQuality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Reference Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Reference Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceReferenceSeq(SequenceReferenceSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceRepository(SequenceRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Structure Variation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Structure Variation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceStructureVariation(SequenceStructureVariation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceType(SequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Variation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Variation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceVariation(SequenceVariation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignature(Signature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleQuantity(SimpleQuantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slicing Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slicing Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlicingRules(SlicingRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlot(Slot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotStatus(SlotStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimen(Specimen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenCollection(SpecimenCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenContainer(SpecimenContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenStatus(SpecimenStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Treatment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenTreatment(SpecimenTreatment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(org.hl7.fhir.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinition(StructureDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionContact(StructureDefinitionContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Differential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Differential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionDifferential(StructureDefinitionDifferential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionKind(StructureDefinitionKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionMapping(StructureDefinitionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Snapshot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Snapshot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionSnapshot(StructureDefinitionSnapshot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMap(StructureMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapContact(StructureMapContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapContextType(StructureMapContextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Dependent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Dependent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapDependent(StructureMapDependent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroup(StructureMapGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapInput(StructureMapInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Input Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Input Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapInputMode(StructureMapInputMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map List Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map List Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapListMode(StructureMapListMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Model Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Model Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapModelMode(StructureMapModelMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapParameter(StructureMapParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapRule(StructureMapRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapSource(StructureMapSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapStructure(StructureMapStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapTarget(StructureMapTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Transform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Transform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapTransform(StructureMapTransform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscription(Subscription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriptionChannel(SubscriptionChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription Channel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriptionChannelType(SubscriptionChannelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriptionStatus(SubscriptionStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstance(Substance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceIngredient(SubstanceIngredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceInstance(SubstanceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Delivery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyDelivery(SupplyDelivery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Delivery Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Delivery Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyDeliveryStatus(SupplyDeliveryStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyRequest(SupplyRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Request Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyRequestStatus(SupplyRequestStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Request When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Request When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyRequestWhen(SupplyRequestWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Restful Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Restful Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemRestfulInteraction(SystemRestfulInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Fulfillment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Fulfillment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskFulfillment(TaskFulfillment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskInput(TaskInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskOutput(TaskOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskPriority(TaskPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskStatus(TaskStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScript(TestScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptAction(TestScriptAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Action1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Action1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptAction1(TestScriptAction1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Action2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Action2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptAction2(TestScriptAction2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptAssert(TestScriptAssert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptCapability(TestScriptCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptContact(TestScriptContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptDestination(TestScriptDestination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Fixture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptFixture(TestScriptFixture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptLink(TestScriptLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptMetadata(TestScriptMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptOperation(TestScriptOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Origin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Origin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptOrigin(TestScriptOrigin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptParam(TestScriptParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Param1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Param1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptParam1(TestScriptParam1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Param2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Param2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptParam2(TestScriptParam2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Param3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Param3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptParam3(TestScriptParam3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Request Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Request Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptRequestHeader(TestScriptRequestHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptRule(TestScriptRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Rule1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Rule1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptRule1(TestScriptRule1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Rule2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Rule2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptRule2(TestScriptRule2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Rule3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Rule3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptRule3(TestScriptRule3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Ruleset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Ruleset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptRuleset(TestScriptRuleset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Ruleset1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Ruleset1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptRuleset1(TestScriptRuleset1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetup(TestScriptSetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Teardown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Teardown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptTeardown(TestScriptTeardown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptTest(TestScriptTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptVariable(TestScriptVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTiming(Timing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingRepeat(TimingRepeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionMode(TransactionMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerDefinition(TriggerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerType(TriggerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Derivation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Derivation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDerivationRule(TypeDerivationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Restful Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Restful Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRestfulInteraction(TypeRestfulInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Units Of Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Units Of Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitsOfTime(UnitsOfTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Content Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Content Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownContentCode(UnknownContentCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedInt(UnsignedInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUri(Uri object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUse(Use object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uuid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uuid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUuid(Uuid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSet(ValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Compose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Compose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetCompose(ValueSetCompose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetConcept(ValueSetConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetContact(ValueSetContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetContains(ValueSetContains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetDesignation(ValueSetDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Expansion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Expansion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetExpansion(ValueSetExpansion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetFilter(ValueSetFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetInclude(ValueSetInclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetParameter(ValueSetParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionBase(VisionBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Eyes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Eyes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionEyes(VisionEyes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Prescription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Prescription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionPrescription(VisionPrescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Prescription Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Prescription Dispense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionPrescriptionDispense(VisionPrescriptionDispense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPath Usage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPath Usage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXPathUsageType(XPathUsageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FhirSwitch
