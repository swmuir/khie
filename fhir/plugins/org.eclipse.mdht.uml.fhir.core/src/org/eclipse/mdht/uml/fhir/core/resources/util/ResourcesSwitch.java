/**
 */
package org.eclipse.mdht.uml.fhir.core.resources.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Element;
import org.eclipse.mdht.uml.fhir.core.resources.*;

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
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage
 * @generated
 */
public class ResourcesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourcesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesSwitch() {
		if (modelPackage == null) {
			modelPackage = ResourcesPackage.eINSTANCE;
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
			case ResourcesPackage.PRACTITIONER: {
				Practitioner practitioner = (Practitioner)theEObject;
				T result = casePractitioner(practitioner);
				if (result == null) result = caseDomainResource(practitioner);
				if (result == null) result = caseResource(practitioner);
				if (result == null) result = caseBase(practitioner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOMAIN_RESOURCE: {
				DomainResource domainResource = (DomainResource)theEObject;
				T result = caseDomainResource(domainResource);
				if (result == null) result = caseResource(domainResource);
				if (result == null) result = caseBase(domainResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseBase(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PRACTITIONER_ROLE: {
				PractitionerRole practitionerRole = (PractitionerRole)theEObject;
				T result = casePractitionerRole(practitionerRole);
				if (result == null) result = caseBackboneElement(practitionerRole);
				if (result == null) result = caseDataType(practitionerRole);
				if (result == null) result = caseElement(practitionerRole);
				if (result == null) result = caseBase(practitionerRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseDomainResource(location);
				if (result == null) result = caseResource(location);
				if (result == null) result = caseBase(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LOCATION_POSITION: {
				LocationPosition locationPosition = (LocationPosition)theEObject;
				T result = caseLocationPosition(locationPosition);
				if (result == null) result = caseBackboneElement(locationPosition);
				if (result == null) result = caseDataType(locationPosition);
				if (result == null) result = caseElement(locationPosition);
				if (result == null) result = caseBase(locationPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENDPOINT: {
				Endpoint endpoint = (Endpoint)theEObject;
				T result = caseEndpoint(endpoint);
				if (result == null) result = caseDomainResource(endpoint);
				if (result == null) result = caseResource(endpoint);
				if (result == null) result = caseBase(endpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.HEALTHCARE_SERVICE: {
				HealthcareService healthcareService = (HealthcareService)theEObject;
				T result = caseHealthcareService(healthcareService);
				if (result == null) result = caseDomainResource(healthcareService);
				if (result == null) result = caseResource(healthcareService);
				if (result == null) result = caseBase(healthcareService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME: {
				HealthcareServiceAvailableTime healthcareServiceAvailableTime = (HealthcareServiceAvailableTime)theEObject;
				T result = caseHealthcareServiceAvailableTime(healthcareServiceAvailableTime);
				if (result == null) result = caseBackboneElement(healthcareServiceAvailableTime);
				if (result == null) result = caseDataType(healthcareServiceAvailableTime);
				if (result == null) result = caseElement(healthcareServiceAvailableTime);
				if (result == null) result = caseBase(healthcareServiceAvailableTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE: {
				HealthcareServiceNotAvailable healthcareServiceNotAvailable = (HealthcareServiceNotAvailable)theEObject;
				T result = caseHealthcareServiceNotAvailable(healthcareServiceNotAvailable);
				if (result == null) result = caseBackboneElement(healthcareServiceNotAvailable);
				if (result == null) result = caseDataType(healthcareServiceNotAvailable);
				if (result == null) result = caseElement(healthcareServiceNotAvailable);
				if (result == null) result = caseBase(healthcareServiceNotAvailable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PRACTITIONER_QUALIFICATION: {
				PractitionerQualification practitionerQualification = (PractitionerQualification)theEObject;
				T result = casePractitionerQualification(practitionerQualification);
				if (result == null) result = caseBackboneElement(practitionerQualification);
				if (result == null) result = caseDataType(practitionerQualification);
				if (result == null) result = caseElement(practitionerQualification);
				if (result == null) result = caseBase(practitionerQualification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PATIENT: {
				Patient patient = (Patient)theEObject;
				T result = casePatient(patient);
				if (result == null) result = caseDomainResource(patient);
				if (result == null) result = caseResource(patient);
				if (result == null) result = caseBase(patient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PATIENT_CONTACT: {
				PatientContact patientContact = (PatientContact)theEObject;
				T result = casePatientContact(patientContact);
				if (result == null) result = caseBackboneElement(patientContact);
				if (result == null) result = caseDataType(patientContact);
				if (result == null) result = caseElement(patientContact);
				if (result == null) result = caseBase(patientContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PATIENT_ANIMAL: {
				PatientAnimal patientAnimal = (PatientAnimal)theEObject;
				T result = casePatientAnimal(patientAnimal);
				if (result == null) result = caseBackboneElement(patientAnimal);
				if (result == null) result = caseDataType(patientAnimal);
				if (result == null) result = caseElement(patientAnimal);
				if (result == null) result = caseBase(patientAnimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PATIENT_COMMUNICATION: {
				PatientCommunication patientCommunication = (PatientCommunication)theEObject;
				T result = casePatientCommunication(patientCommunication);
				if (result == null) result = caseBackboneElement(patientCommunication);
				if (result == null) result = caseDataType(patientCommunication);
				if (result == null) result = caseElement(patientCommunication);
				if (result == null) result = caseBase(patientCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PATIENT_LINK: {
				PatientLink patientLink = (PatientLink)theEObject;
				T result = casePatientLink(patientLink);
				if (result == null) result = caseBackboneElement(patientLink);
				if (result == null) result = caseDataType(patientLink);
				if (result == null) result = caseElement(patientLink);
				if (result == null) result = caseBase(patientLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RELATED_PERSON: {
				RelatedPerson relatedPerson = (RelatedPerson)theEObject;
				T result = caseRelatedPerson(relatedPerson);
				if (result == null) result = caseDomainResource(relatedPerson);
				if (result == null) result = caseResource(relatedPerson);
				if (result == null) result = caseBase(relatedPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseDomainResource(device);
				if (result == null) result = caseResource(device);
				if (result == null) result = caseBase(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseDomainResource(library);
				if (result == null) result = caseResource(library);
				if (result == null) result = caseBase(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_DEFINITION: {
				StructureDefinition structureDefinition = (StructureDefinition)theEObject;
				T result = caseStructureDefinition(structureDefinition);
				if (result == null) result = caseDomainResource(structureDefinition);
				if (result == null) result = caseResource(structureDefinition);
				if (result == null) result = caseBase(structureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_DEFINITION_MAPPING: {
				StructureDefinitionMapping structureDefinitionMapping = (StructureDefinitionMapping)theEObject;
				T result = caseStructureDefinitionMapping(structureDefinitionMapping);
				if (result == null) result = caseBackboneElement(structureDefinitionMapping);
				if (result == null) result = caseDataType(structureDefinitionMapping);
				if (result == null) result = caseElement(structureDefinitionMapping);
				if (result == null) result = caseBase(structureDefinitionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_DEFINITION_SNAPSHOT: {
				StructureDefinitionSnapshot structureDefinitionSnapshot = (StructureDefinitionSnapshot)theEObject;
				T result = caseStructureDefinitionSnapshot(structureDefinitionSnapshot);
				if (result == null) result = caseBackboneElement(structureDefinitionSnapshot);
				if (result == null) result = caseDataType(structureDefinitionSnapshot);
				if (result == null) result = caseElement(structureDefinitionSnapshot);
				if (result == null) result = caseBase(structureDefinitionSnapshot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_DEFINITION_DIFFERENTIAL: {
				StructureDefinitionDifferential structureDefinitionDifferential = (StructureDefinitionDifferential)theEObject;
				T result = caseStructureDefinitionDifferential(structureDefinitionDifferential);
				if (result == null) result = caseBackboneElement(structureDefinitionDifferential);
				if (result == null) result = caseDataType(structureDefinitionDifferential);
				if (result == null) result = caseElement(structureDefinitionDifferential);
				if (result == null) result = caseBase(structureDefinitionDifferential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET: {
				ValueSet valueSet = (ValueSet)theEObject;
				T result = caseValueSet(valueSet);
				if (result == null) result = caseDomainResource(valueSet);
				if (result == null) result = caseResource(valueSet);
				if (result == null) result = caseBase(valueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_COMPOSE: {
				ValueSetCompose valueSetCompose = (ValueSetCompose)theEObject;
				T result = caseValueSetCompose(valueSetCompose);
				if (result == null) result = caseBackboneElement(valueSetCompose);
				if (result == null) result = caseDataType(valueSetCompose);
				if (result == null) result = caseElement(valueSetCompose);
				if (result == null) result = caseBase(valueSetCompose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET: {
				ValueSetComposeConceptSet valueSetComposeConceptSet = (ValueSetComposeConceptSet)theEObject;
				T result = caseValueSetComposeConceptSet(valueSetComposeConceptSet);
				if (result == null) result = caseBackboneElement(valueSetComposeConceptSet);
				if (result == null) result = caseDataType(valueSetComposeConceptSet);
				if (result == null) result = caseElement(valueSetComposeConceptSet);
				if (result == null) result = caseBase(valueSetComposeConceptSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE: {
				ValueSetComposeConceptSetConceptReference valueSetComposeConceptSetConceptReference = (ValueSetComposeConceptSetConceptReference)theEObject;
				T result = caseValueSetComposeConceptSetConceptReference(valueSetComposeConceptSetConceptReference);
				if (result == null) result = caseBackboneElement(valueSetComposeConceptSetConceptReference);
				if (result == null) result = caseDataType(valueSetComposeConceptSetConceptReference);
				if (result == null) result = caseElement(valueSetComposeConceptSetConceptReference);
				if (result == null) result = caseBase(valueSetComposeConceptSetConceptReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE_DESIGNATION: {
				ValueSetComposeConceptSetConceptReferenceDesignation valueSetComposeConceptSetConceptReferenceDesignation = (ValueSetComposeConceptSetConceptReferenceDesignation)theEObject;
				T result = caseValueSetComposeConceptSetConceptReferenceDesignation(valueSetComposeConceptSetConceptReferenceDesignation);
				if (result == null) result = caseBackboneElement(valueSetComposeConceptSetConceptReferenceDesignation);
				if (result == null) result = caseDataType(valueSetComposeConceptSetConceptReferenceDesignation);
				if (result == null) result = caseElement(valueSetComposeConceptSetConceptReferenceDesignation);
				if (result == null) result = caseBase(valueSetComposeConceptSetConceptReferenceDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_FILTER: {
				ValueSetComposeConceptSetFilter valueSetComposeConceptSetFilter = (ValueSetComposeConceptSetFilter)theEObject;
				T result = caseValueSetComposeConceptSetFilter(valueSetComposeConceptSetFilter);
				if (result == null) result = caseBackboneElement(valueSetComposeConceptSetFilter);
				if (result == null) result = caseDataType(valueSetComposeConceptSetFilter);
				if (result == null) result = caseElement(valueSetComposeConceptSetFilter);
				if (result == null) result = caseBase(valueSetComposeConceptSetFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_EXPANSION: {
				ValueSetExpansion valueSetExpansion = (ValueSetExpansion)theEObject;
				T result = caseValueSetExpansion(valueSetExpansion);
				if (result == null) result = caseBackboneElement(valueSetExpansion);
				if (result == null) result = caseDataType(valueSetExpansion);
				if (result == null) result = caseElement(valueSetExpansion);
				if (result == null) result = caseBase(valueSetExpansion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_EXPANSION_PARAMETER: {
				ValueSetExpansionParameter valueSetExpansionParameter = (ValueSetExpansionParameter)theEObject;
				T result = caseValueSetExpansionParameter(valueSetExpansionParameter);
				if (result == null) result = caseBackboneElement(valueSetExpansionParameter);
				if (result == null) result = caseDataType(valueSetExpansionParameter);
				if (result == null) result = caseElement(valueSetExpansionParameter);
				if (result == null) result = caseBase(valueSetExpansionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS: {
				ValueSetExpansionContains valueSetExpansionContains = (ValueSetExpansionContains)theEObject;
				T result = caseValueSetExpansionContains(valueSetExpansionContains);
				if (result == null) result = caseBackboneElement(valueSetExpansionContains);
				if (result == null) result = caseDataType(valueSetExpansionContains);
				if (result == null) result = caseElement(valueSetExpansionContains);
				if (result == null) result = caseBase(valueSetExpansionContains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RESEARCH_SUBJECT: {
				ResearchSubject researchSubject = (ResearchSubject)theEObject;
				T result = caseResearchSubject(researchSubject);
				if (result == null) result = caseDomainResource(researchSubject);
				if (result == null) result = caseResource(researchSubject);
				if (result == null) result = caseBase(researchSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RESEARCH_STUDY: {
				ResearchStudy researchStudy = (ResearchStudy)theEObject;
				T result = caseResearchStudy(researchStudy);
				if (result == null) result = caseDomainResource(researchStudy);
				if (result == null) result = caseResource(researchStudy);
				if (result == null) result = caseBase(researchStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PLAN_DEFINITION: {
				PlanDefinition planDefinition = (PlanDefinition)theEObject;
				T result = casePlanDefinition(planDefinition);
				if (result == null) result = caseDomainResource(planDefinition);
				if (result == null) result = caseResource(planDefinition);
				if (result == null) result = caseBase(planDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION: {
				PlanDefinitionActionDefinition planDefinitionActionDefinition = (PlanDefinitionActionDefinition)theEObject;
				T result = casePlanDefinitionActionDefinition(planDefinitionActionDefinition);
				if (result == null) result = caseBackboneElement(planDefinitionActionDefinition);
				if (result == null) result = caseDataType(planDefinitionActionDefinition);
				if (result == null) result = caseElement(planDefinitionActionDefinition);
				if (result == null) result = caseBase(planDefinitionActionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION_CONDITION: {
				PlanDefinitionActionDefinitionCondition planDefinitionActionDefinitionCondition = (PlanDefinitionActionDefinitionCondition)theEObject;
				T result = casePlanDefinitionActionDefinitionCondition(planDefinitionActionDefinitionCondition);
				if (result == null) result = caseBackboneElement(planDefinitionActionDefinitionCondition);
				if (result == null) result = caseDataType(planDefinitionActionDefinitionCondition);
				if (result == null) result = caseElement(planDefinitionActionDefinitionCondition);
				if (result == null) result = caseBase(planDefinitionActionDefinitionCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION_RELATED_ACTION: {
				PlanDefinitionActionDefinitionRelatedAction planDefinitionActionDefinitionRelatedAction = (PlanDefinitionActionDefinitionRelatedAction)theEObject;
				T result = casePlanDefinitionActionDefinitionRelatedAction(planDefinitionActionDefinitionRelatedAction);
				if (result == null) result = caseBackboneElement(planDefinitionActionDefinitionRelatedAction);
				if (result == null) result = caseDataType(planDefinitionActionDefinitionRelatedAction);
				if (result == null) result = caseElement(planDefinitionActionDefinitionRelatedAction);
				if (result == null) result = caseBase(planDefinitionActionDefinitionRelatedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ACTIVITY_DEFINITION: {
				ActivityDefinition activityDefinition = (ActivityDefinition)theEObject;
				T result = caseActivityDefinition(activityDefinition);
				if (result == null) result = caseDomainResource(activityDefinition);
				if (result == null) result = caseResource(activityDefinition);
				if (result == null) result = caseBase(activityDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP: {
				StructureMap structureMap = (StructureMap)theEObject;
				T result = caseStructureMap(structureMap);
				if (result == null) result = caseDomainResource(structureMap);
				if (result == null) result = caseResource(structureMap);
				if (result == null) result = caseBase(structureMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_STRUCTURE: {
				StructureMapStructure structureMapStructure = (StructureMapStructure)theEObject;
				T result = caseStructureMapStructure(structureMapStructure);
				if (result == null) result = caseBackboneElement(structureMapStructure);
				if (result == null) result = caseDataType(structureMapStructure);
				if (result == null) result = caseElement(structureMapStructure);
				if (result == null) result = caseBase(structureMapStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP: {
				StructureMapGroup structureMapGroup = (StructureMapGroup)theEObject;
				T result = caseStructureMapGroup(structureMapGroup);
				if (result == null) result = caseBackboneElement(structureMapGroup);
				if (result == null) result = caseDataType(structureMapGroup);
				if (result == null) result = caseElement(structureMapGroup);
				if (result == null) result = caseBase(structureMapGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT: {
				StructureMapGroupInput structureMapGroupInput = (StructureMapGroupInput)theEObject;
				T result = caseStructureMapGroupInput(structureMapGroupInput);
				if (result == null) result = caseBackboneElement(structureMapGroupInput);
				if (result == null) result = caseDataType(structureMapGroupInput);
				if (result == null) result = caseElement(structureMapGroupInput);
				if (result == null) result = caseBase(structureMapGroupInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE: {
				StructureMapGroupRule structureMapGroupRule = (StructureMapGroupRule)theEObject;
				T result = caseStructureMapGroupRule(structureMapGroupRule);
				if (result == null) result = caseBackboneElement(structureMapGroupRule);
				if (result == null) result = caseDataType(structureMapGroupRule);
				if (result == null) result = caseElement(structureMapGroupRule);
				if (result == null) result = caseBase(structureMapGroupRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE: {
				StructureMapGroupRuleSource structureMapGroupRuleSource = (StructureMapGroupRuleSource)theEObject;
				T result = caseStructureMapGroupRuleSource(structureMapGroupRuleSource);
				if (result == null) result = caseBackboneElement(structureMapGroupRuleSource);
				if (result == null) result = caseDataType(structureMapGroupRuleSource);
				if (result == null) result = caseElement(structureMapGroupRuleSource);
				if (result == null) result = caseBase(structureMapGroupRuleSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET: {
				StructureMapGroupRuleTarget structureMapGroupRuleTarget = (StructureMapGroupRuleTarget)theEObject;
				T result = caseStructureMapGroupRuleTarget(structureMapGroupRuleTarget);
				if (result == null) result = caseBackboneElement(structureMapGroupRuleTarget);
				if (result == null) result = caseDataType(structureMapGroupRuleTarget);
				if (result == null) result = caseElement(structureMapGroupRuleTarget);
				if (result == null) result = caseBase(structureMapGroupRuleTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET_PARAMETER: {
				StructureMapGroupRuleTargetParameter structureMapGroupRuleTargetParameter = (StructureMapGroupRuleTargetParameter)theEObject;
				T result = caseStructureMapGroupRuleTargetParameter(structureMapGroupRuleTargetParameter);
				if (result == null) result = caseBackboneElement(structureMapGroupRuleTargetParameter);
				if (result == null) result = caseDataType(structureMapGroupRuleTargetParameter);
				if (result == null) result = caseElement(structureMapGroupRuleTargetParameter);
				if (result == null) result = caseBase(structureMapGroupRuleTargetParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_DEPENDENT: {
				StructureMapGroupRuleDependent structureMapGroupRuleDependent = (StructureMapGroupRuleDependent)theEObject;
				T result = caseStructureMapGroupRuleDependent(structureMapGroupRuleDependent);
				if (result == null) result = caseBackboneElement(structureMapGroupRuleDependent);
				if (result == null) result = caseDataType(structureMapGroupRuleDependent);
				if (result == null) result = caseElement(structureMapGroupRuleDependent);
				if (result == null) result = caseBase(structureMapGroupRuleDependent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ACTIVITY_DEFINITION_DYNAMIC_VALUE: {
				ActivityDefinitionDynamicValue activityDefinitionDynamicValue = (ActivityDefinitionDynamicValue)theEObject;
				T result = caseActivityDefinitionDynamicValue(activityDefinitionDynamicValue);
				if (result == null) result = caseBackboneElement(activityDefinitionDynamicValue);
				if (result == null) result = caseDataType(activityDefinitionDynamicValue);
				if (result == null) result = caseElement(activityDefinitionDynamicValue);
				if (result == null) result = caseBase(activityDefinitionDynamicValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION_DYNAMIC_VALUE: {
				PlanDefinitionActionDefinitionDynamicValue planDefinitionActionDefinitionDynamicValue = (PlanDefinitionActionDefinitionDynamicValue)theEObject;
				T result = casePlanDefinitionActionDefinitionDynamicValue(planDefinitionActionDefinitionDynamicValue);
				if (result == null) result = caseBackboneElement(planDefinitionActionDefinitionDynamicValue);
				if (result == null) result = caseDataType(planDefinitionActionDefinitionDynamicValue);
				if (result == null) result = caseElement(planDefinitionActionDefinitionDynamicValue);
				if (result == null) result = caseBase(planDefinitionActionDefinitionDynamicValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseDomainResource(group);
				if (result == null) result = caseResource(group);
				if (result == null) result = caseBase(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GROUP_CHARACTERISTIC: {
				GroupCharacteristic groupCharacteristic = (GroupCharacteristic)theEObject;
				T result = caseGroupCharacteristic(groupCharacteristic);
				if (result == null) result = caseBackboneElement(groupCharacteristic);
				if (result == null) result = caseDataType(groupCharacteristic);
				if (result == null) result = caseElement(groupCharacteristic);
				if (result == null) result = caseBase(groupCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GROUP_MEMBER: {
				GroupMember groupMember = (GroupMember)theEObject;
				T result = caseGroupMember(groupMember);
				if (result == null) result = caseBackboneElement(groupMember);
				if (result == null) result = caseDataType(groupMember);
				if (result == null) result = caseElement(groupMember);
				if (result == null) result = caseBase(groupMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RESEARCH_STUDY_ARM: {
				ResearchStudyArm researchStudyArm = (ResearchStudyArm)theEObject;
				T result = caseResearchStudyArm(researchStudyArm);
				if (result == null) result = caseBackboneElement(researchStudyArm);
				if (result == null) result = caseDataType(researchStudyArm);
				if (result == null) result = caseElement(researchStudyArm);
				if (result == null) result = caseBase(researchStudyArm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONSENT: {
				Consent consent = (Consent)theEObject;
				T result = caseConsent(consent);
				if (result == null) result = caseDomainResource(consent);
				if (result == null) result = caseResource(consent);
				if (result == null) result = caseBase(consent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONSENT_EXCEPT: {
				ConsentExcept consentExcept = (ConsentExcept)theEObject;
				T result = caseConsentExcept(consentExcept);
				if (result == null) result = caseBackboneElement(consentExcept);
				if (result == null) result = caseDataType(consentExcept);
				if (result == null) result = caseElement(consentExcept);
				if (result == null) result = caseBase(consentExcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONSENT_EXCEPT_ACTOR: {
				ConsentExceptActor consentExceptActor = (ConsentExceptActor)theEObject;
				T result = caseConsentExceptActor(consentExceptActor);
				if (result == null) result = caseBackboneElement(consentExceptActor);
				if (result == null) result = caseDataType(consentExceptActor);
				if (result == null) result = caseElement(consentExceptActor);
				if (result == null) result = caseBase(consentExceptActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONSENT_EXCEPT_DATA: {
				ConsentExceptData consentExceptData = (ConsentExceptData)theEObject;
				T result = caseConsentExceptData(consentExceptData);
				if (result == null) result = caseBackboneElement(consentExceptData);
				if (result == null) result = caseDataType(consentExceptData);
				if (result == null) result = caseElement(consentExceptData);
				if (result == null) result = caseBase(consentExceptData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SCHEDULE: {
				Schedule schedule = (Schedule)theEObject;
				T result = caseSchedule(schedule);
				if (result == null) result = caseDomainResource(schedule);
				if (result == null) result = caseResource(schedule);
				if (result == null) result = caseBase(schedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION: {
				Medication medication = (Medication)theEObject;
				T result = caseMedication(medication);
				if (result == null) result = caseDomainResource(medication);
				if (result == null) result = caseResource(medication);
				if (result == null) result = caseBase(medication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_PRODUCT: {
				MedicationProduct medicationProduct = (MedicationProduct)theEObject;
				T result = caseMedicationProduct(medicationProduct);
				if (result == null) result = caseBackboneElement(medicationProduct);
				if (result == null) result = caseDataType(medicationProduct);
				if (result == null) result = caseElement(medicationProduct);
				if (result == null) result = caseBase(medicationProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_PRODUCT_INGREDIENT: {
				MedicationProductIngredient medicationProductIngredient = (MedicationProductIngredient)theEObject;
				T result = caseMedicationProductIngredient(medicationProductIngredient);
				if (result == null) result = caseBackboneElement(medicationProductIngredient);
				if (result == null) result = caseDataType(medicationProductIngredient);
				if (result == null) result = caseElement(medicationProductIngredient);
				if (result == null) result = caseBase(medicationProductIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_PRODUCT_BATCH: {
				MedicationProductBatch medicationProductBatch = (MedicationProductBatch)theEObject;
				T result = caseMedicationProductBatch(medicationProductBatch);
				if (result == null) result = caseBackboneElement(medicationProductBatch);
				if (result == null) result = caseDataType(medicationProductBatch);
				if (result == null) result = caseElement(medicationProductBatch);
				if (result == null) result = caseBase(medicationProductBatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_PACKAGE: {
				MedicationPackage medicationPackage = (MedicationPackage)theEObject;
				T result = caseMedicationPackage(medicationPackage);
				if (result == null) result = caseBackboneElement(medicationPackage);
				if (result == null) result = caseDataType(medicationPackage);
				if (result == null) result = caseElement(medicationPackage);
				if (result == null) result = caseBase(medicationPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_PACKAGE_CONTENT: {
				MedicationPackageContent medicationPackageContent = (MedicationPackageContent)theEObject;
				T result = caseMedicationPackageContent(medicationPackageContent);
				if (result == null) result = caseBackboneElement(medicationPackageContent);
				if (result == null) result = caseDataType(medicationPackageContent);
				if (result == null) result = caseElement(medicationPackageContent);
				if (result == null) result = caseBase(medicationPackageContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE: {
				Substance substance = (Substance)theEObject;
				T result = caseSubstance(substance);
				if (result == null) result = caseDomainResource(substance);
				if (result == null) result = caseResource(substance);
				if (result == null) result = caseBase(substance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_INSTANCE: {
				SubstanceInstance substanceInstance = (SubstanceInstance)theEObject;
				T result = caseSubstanceInstance(substanceInstance);
				if (result == null) result = caseBackboneElement(substanceInstance);
				if (result == null) result = caseDataType(substanceInstance);
				if (result == null) result = caseElement(substanceInstance);
				if (result == null) result = caseBase(substanceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_INGREDIENT: {
				SubstanceIngredient substanceIngredient = (SubstanceIngredient)theEObject;
				T result = caseSubstanceIngredient(substanceIngredient);
				if (result == null) result = caseBackboneElement(substanceIngredient);
				if (result == null) result = caseDataType(substanceIngredient);
				if (result == null) result = caseElement(substanceIngredient);
				if (result == null) result = caseBase(substanceIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_REFERENCE: {
				DocumentReference documentReference = (DocumentReference)theEObject;
				T result = caseDocumentReference(documentReference);
				if (result == null) result = caseDomainResource(documentReference);
				if (result == null) result = caseResource(documentReference);
				if (result == null) result = caseBase(documentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_REFERENCE_RELATES_TO: {
				DocumentReferenceRelatesTo documentReferenceRelatesTo = (DocumentReferenceRelatesTo)theEObject;
				T result = caseDocumentReferenceRelatesTo(documentReferenceRelatesTo);
				if (result == null) result = caseBackboneElement(documentReferenceRelatesTo);
				if (result == null) result = caseDataType(documentReferenceRelatesTo);
				if (result == null) result = caseElement(documentReferenceRelatesTo);
				if (result == null) result = caseBase(documentReferenceRelatesTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTENT: {
				DocumentReferenceContent documentReferenceContent = (DocumentReferenceContent)theEObject;
				T result = caseDocumentReferenceContent(documentReferenceContent);
				if (result == null) result = caseBackboneElement(documentReferenceContent);
				if (result == null) result = caseDataType(documentReferenceContent);
				if (result == null) result = caseElement(documentReferenceContent);
				if (result == null) result = caseBase(documentReferenceContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT: {
				DocumentReferenceContext documentReferenceContext = (DocumentReferenceContext)theEObject;
				T result = caseDocumentReferenceContext(documentReferenceContext);
				if (result == null) result = caseBackboneElement(documentReferenceContext);
				if (result == null) result = caseDataType(documentReferenceContext);
				if (result == null) result = caseElement(documentReferenceContext);
				if (result == null) result = caseBase(documentReferenceContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENCOUNTER: {
				Encounter encounter = (Encounter)theEObject;
				T result = caseEncounter(encounter);
				if (result == null) result = caseDomainResource(encounter);
				if (result == null) result = caseResource(encounter);
				if (result == null) result = caseBase(encounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENCOUNTER_STATUS_HISTORY: {
				EncounterStatusHistory encounterStatusHistory = (EncounterStatusHistory)theEObject;
				T result = caseEncounterStatusHistory(encounterStatusHistory);
				if (result == null) result = caseBackboneElement(encounterStatusHistory);
				if (result == null) result = caseDataType(encounterStatusHistory);
				if (result == null) result = caseElement(encounterStatusHistory);
				if (result == null) result = caseBase(encounterStatusHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EPISODE_OF_CARE: {
				EpisodeOfCare episodeOfCare = (EpisodeOfCare)theEObject;
				T result = caseEpisodeOfCare(episodeOfCare);
				if (result == null) result = caseDomainResource(episodeOfCare);
				if (result == null) result = caseResource(episodeOfCare);
				if (result == null) result = caseBase(episodeOfCare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EPISODE_OF_CARE_STATUS_HISTORY: {
				EpisodeOfCareStatusHistory episodeOfCareStatusHistory = (EpisodeOfCareStatusHistory)theEObject;
				T result = caseEpisodeOfCareStatusHistory(episodeOfCareStatusHistory);
				if (result == null) result = caseBackboneElement(episodeOfCareStatusHistory);
				if (result == null) result = caseDataType(episodeOfCareStatusHistory);
				if (result == null) result = caseElement(episodeOfCareStatusHistory);
				if (result == null) result = caseBase(episodeOfCareStatusHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseDomainResource(condition);
				if (result == null) result = caseResource(condition);
				if (result == null) result = caseBase(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONDITION_STAGE: {
				ConditionStage conditionStage = (ConditionStage)theEObject;
				T result = caseConditionStage(conditionStage);
				if (result == null) result = caseBackboneElement(conditionStage);
				if (result == null) result = caseDataType(conditionStage);
				if (result == null) result = caseElement(conditionStage);
				if (result == null) result = caseBase(conditionStage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONDITION_EVIDENCE: {
				ConditionEvidence conditionEvidence = (ConditionEvidence)theEObject;
				T result = caseConditionEvidence(conditionEvidence);
				if (result == null) result = caseBackboneElement(conditionEvidence);
				if (result == null) result = caseDataType(conditionEvidence);
				if (result == null) result = caseElement(conditionEvidence);
				if (result == null) result = caseBase(conditionEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.REFERRAL_REQUEST: {
				ReferralRequest referralRequest = (ReferralRequest)theEObject;
				T result = caseReferralRequest(referralRequest);
				if (result == null) result = caseDomainResource(referralRequest);
				if (result == null) result = caseResource(referralRequest);
				if (result == null) result = caseBase(referralRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CARE_TEAM: {
				CareTeam careTeam = (CareTeam)theEObject;
				T result = caseCareTeam(careTeam);
				if (result == null) result = caseDomainResource(careTeam);
				if (result == null) result = caseResource(careTeam);
				if (result == null) result = caseBase(careTeam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CARE_TEAM_PARTICIPANT: {
				CareTeamParticipant careTeamParticipant = (CareTeamParticipant)theEObject;
				T result = caseCareTeamParticipant(careTeamParticipant);
				if (result == null) result = caseBackboneElement(careTeamParticipant);
				if (result == null) result = caseDataType(careTeamParticipant);
				if (result == null) result = caseElement(careTeamParticipant);
				if (result == null) result = caseBase(careTeamParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T result = caseAccount(account);
				if (result == null) result = caseDomainResource(account);
				if (result == null) result = caseResource(account);
				if (result == null) result = caseBase(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE: {
				Coverage coverage = (Coverage)theEObject;
				T result = caseCoverage(coverage);
				if (result == null) result = caseDomainResource(coverage);
				if (result == null) result = caseResource(coverage);
				if (result == null) result = caseBase(coverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_GROUP: {
				CoverageGroup coverageGroup = (CoverageGroup)theEObject;
				T result = caseCoverageGroup(coverageGroup);
				if (result == null) result = caseBackboneElement(coverageGroup);
				if (result == null) result = caseDataType(coverageGroup);
				if (result == null) result = caseElement(coverageGroup);
				if (result == null) result = caseBase(coverageGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT: {
				Contract contract = (Contract)theEObject;
				T result = caseContract(contract);
				if (result == null) result = caseDomainResource(contract);
				if (result == null) result = caseResource(contract);
				if (result == null) result = caseBase(contract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_AGENT: {
				ContractAgent contractAgent = (ContractAgent)theEObject;
				T result = caseContractAgent(contractAgent);
				if (result == null) result = caseBackboneElement(contractAgent);
				if (result == null) result = caseDataType(contractAgent);
				if (result == null) result = caseElement(contractAgent);
				if (result == null) result = caseBase(contractAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_SIGNATORY: {
				ContractSignatory contractSignatory = (ContractSignatory)theEObject;
				T result = caseContractSignatory(contractSignatory);
				if (result == null) result = caseBackboneElement(contractSignatory);
				if (result == null) result = caseDataType(contractSignatory);
				if (result == null) result = caseElement(contractSignatory);
				if (result == null) result = caseBase(contractSignatory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_VALUED_ITEM: {
				ContractValuedItem contractValuedItem = (ContractValuedItem)theEObject;
				T result = caseContractValuedItem(contractValuedItem);
				if (result == null) result = caseBackboneElement(contractValuedItem);
				if (result == null) result = caseDataType(contractValuedItem);
				if (result == null) result = caseElement(contractValuedItem);
				if (result == null) result = caseBase(contractValuedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_TERM: {
				ContractTerm contractTerm = (ContractTerm)theEObject;
				T result = caseContractTerm(contractTerm);
				if (result == null) result = caseBackboneElement(contractTerm);
				if (result == null) result = caseDataType(contractTerm);
				if (result == null) result = caseElement(contractTerm);
				if (result == null) result = caseBase(contractTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_TERM_TERM_AGENT: {
				ContractTermTermAgent contractTermTermAgent = (ContractTermTermAgent)theEObject;
				T result = caseContractTermTermAgent(contractTermTermAgent);
				if (result == null) result = caseBackboneElement(contractTermTermAgent);
				if (result == null) result = caseDataType(contractTermTermAgent);
				if (result == null) result = caseElement(contractTermTermAgent);
				if (result == null) result = caseBase(contractTermTermAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_TERM_TERM_VALUED_ITEM: {
				ContractTermTermValuedItem contractTermTermValuedItem = (ContractTermTermValuedItem)theEObject;
				T result = caseContractTermTermValuedItem(contractTermTermValuedItem);
				if (result == null) result = caseBackboneElement(contractTermTermValuedItem);
				if (result == null) result = caseDataType(contractTermTermValuedItem);
				if (result == null) result = caseElement(contractTermTermValuedItem);
				if (result == null) result = caseBase(contractTermTermValuedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_FRIENDLY_LANGUAGE: {
				ContractFriendlyLanguage contractFriendlyLanguage = (ContractFriendlyLanguage)theEObject;
				T result = caseContractFriendlyLanguage(contractFriendlyLanguage);
				if (result == null) result = caseBackboneElement(contractFriendlyLanguage);
				if (result == null) result = caseDataType(contractFriendlyLanguage);
				if (result == null) result = caseElement(contractFriendlyLanguage);
				if (result == null) result = caseBase(contractFriendlyLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_LEGAL_LANGUAGE: {
				ContractLegalLanguage contractLegalLanguage = (ContractLegalLanguage)theEObject;
				T result = caseContractLegalLanguage(contractLegalLanguage);
				if (result == null) result = caseBackboneElement(contractLegalLanguage);
				if (result == null) result = caseDataType(contractLegalLanguage);
				if (result == null) result = caseElement(contractLegalLanguage);
				if (result == null) result = caseBase(contractLegalLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_COMPUTABLE_LANGUAGE: {
				ContractComputableLanguage contractComputableLanguage = (ContractComputableLanguage)theEObject;
				T result = caseContractComputableLanguage(contractComputableLanguage);
				if (result == null) result = caseBackboneElement(contractComputableLanguage);
				if (result == null) result = caseDataType(contractComputableLanguage);
				if (result == null) result = caseElement(contractComputableLanguage);
				if (result == null) result = caseBase(contractComputableLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ACCOUNT_GUARANTOR: {
				AccountGuarantor accountGuarantor = (AccountGuarantor)theEObject;
				T result = caseAccountGuarantor(accountGuarantor);
				if (result == null) result = caseBackboneElement(accountGuarantor);
				if (result == null) result = caseDataType(accountGuarantor);
				if (result == null) result = caseElement(accountGuarantor);
				if (result == null) result = caseBase(accountGuarantor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENCOUNTER_PARTICIPANT: {
				EncounterParticipant encounterParticipant = (EncounterParticipant)theEObject;
				T result = caseEncounterParticipant(encounterParticipant);
				if (result == null) result = caseBackboneElement(encounterParticipant);
				if (result == null) result = caseDataType(encounterParticipant);
				if (result == null) result = caseElement(encounterParticipant);
				if (result == null) result = caseBase(encounterParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.APPOINTMENT: {
				Appointment appointment = (Appointment)theEObject;
				T result = caseAppointment(appointment);
				if (result == null) result = caseDomainResource(appointment);
				if (result == null) result = caseResource(appointment);
				if (result == null) result = caseBase(appointment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SLOT: {
				Slot slot = (Slot)theEObject;
				T result = caseSlot(slot);
				if (result == null) result = caseDomainResource(slot);
				if (result == null) result = caseResource(slot);
				if (result == null) result = caseBase(slot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.APPOINTMENT_PARTICIPANT: {
				AppointmentParticipant appointmentParticipant = (AppointmentParticipant)theEObject;
				T result = caseAppointmentParticipant(appointmentParticipant);
				if (result == null) result = caseBackboneElement(appointmentParticipant);
				if (result == null) result = caseDataType(appointmentParticipant);
				if (result == null) result = caseElement(appointmentParticipant);
				if (result == null) result = caseBase(appointmentParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENCOUNTER_HOSPITALIZATION: {
				EncounterHospitalization encounterHospitalization = (EncounterHospitalization)theEObject;
				T result = caseEncounterHospitalization(encounterHospitalization);
				if (result == null) result = caseBackboneElement(encounterHospitalization);
				if (result == null) result = caseDataType(encounterHospitalization);
				if (result == null) result = caseElement(encounterHospitalization);
				if (result == null) result = caseBase(encounterHospitalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENCOUNTER_LOCATION: {
				EncounterLocation encounterLocation = (EncounterLocation)theEObject;
				T result = caseEncounterLocation(encounterLocation);
				if (result == null) result = caseBackboneElement(encounterLocation);
				if (result == null) result = caseDataType(encounterLocation);
				if (result == null) result = caseElement(encounterLocation);
				if (result == null) result = caseBase(encounterLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT_RELATED: {
				DocumentReferenceContextRelated documentReferenceContextRelated = (DocumentReferenceContextRelated)theEObject;
				T result = caseDocumentReferenceContextRelated(documentReferenceContextRelated);
				if (result == null) result = caseBackboneElement(documentReferenceContextRelated);
				if (result == null) result = caseDataType(documentReferenceContextRelated);
				if (result == null) result = caseElement(documentReferenceContextRelated);
				if (result == null) result = caseBase(documentReferenceContextRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLINICAL_IMPRESSION: {
				ClinicalImpression clinicalImpression = (ClinicalImpression)theEObject;
				T result = caseClinicalImpression(clinicalImpression);
				if (result == null) result = caseDomainResource(clinicalImpression);
				if (result == null) result = caseResource(clinicalImpression);
				if (result == null) result = caseBase(clinicalImpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLINICAL_IMPRESSION_INVESTIGATION: {
				ClinicalImpressionInvestigation clinicalImpressionInvestigation = (ClinicalImpressionInvestigation)theEObject;
				T result = caseClinicalImpressionInvestigation(clinicalImpressionInvestigation);
				if (result == null) result = caseBackboneElement(clinicalImpressionInvestigation);
				if (result == null) result = caseDataType(clinicalImpressionInvestigation);
				if (result == null) result = caseElement(clinicalImpressionInvestigation);
				if (result == null) result = caseBase(clinicalImpressionInvestigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING: {
				ClinicalImpressionFinding clinicalImpressionFinding = (ClinicalImpressionFinding)theEObject;
				T result = caseClinicalImpressionFinding(clinicalImpressionFinding);
				if (result == null) result = caseBackboneElement(clinicalImpressionFinding);
				if (result == null) result = caseDataType(clinicalImpressionFinding);
				if (result == null) result = caseElement(clinicalImpressionFinding);
				if (result == null) result = caseBase(clinicalImpressionFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RISK_ASSESSMENT: {
				RiskAssessment riskAssessment = (RiskAssessment)theEObject;
				T result = caseRiskAssessment(riskAssessment);
				if (result == null) result = caseDomainResource(riskAssessment);
				if (result == null) result = caseResource(riskAssessment);
				if (result == null) result = caseBase(riskAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION: {
				RiskAssessmentPrediction riskAssessmentPrediction = (RiskAssessmentPrediction)theEObject;
				T result = caseRiskAssessmentPrediction(riskAssessmentPrediction);
				if (result == null) result = caseBackboneElement(riskAssessmentPrediction);
				if (result == null) result = caseDataType(riskAssessmentPrediction);
				if (result == null) result = caseElement(riskAssessmentPrediction);
				if (result == null) result = caseBase(riskAssessmentPrediction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ALLERGY_INTOLERANCE: {
				AllergyIntolerance allergyIntolerance = (AllergyIntolerance)theEObject;
				T result = caseAllergyIntolerance(allergyIntolerance);
				if (result == null) result = caseDomainResource(allergyIntolerance);
				if (result == null) result = caseResource(allergyIntolerance);
				if (result == null) result = caseBase(allergyIntolerance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION: {
				AllergyIntoleranceReaction allergyIntoleranceReaction = (AllergyIntoleranceReaction)theEObject;
				T result = caseAllergyIntoleranceReaction(allergyIntoleranceReaction);
				if (result == null) result = caseBackboneElement(allergyIntoleranceReaction);
				if (result == null) result = caseDataType(allergyIntoleranceReaction);
				if (result == null) result = caseElement(allergyIntoleranceReaction);
				if (result == null) result = caseBase(allergyIntoleranceReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = caseDomainResource(observation);
				if (result == null) result = caseResource(observation);
				if (result == null) result = caseBase(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SPECIMEN: {
				Specimen specimen = (Specimen)theEObject;
				T result = caseSpecimen(specimen);
				if (result == null) result = caseDomainResource(specimen);
				if (result == null) result = caseResource(specimen);
				if (result == null) result = caseBase(specimen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SPECIMEN_COLLECTION: {
				SpecimenCollection specimenCollection = (SpecimenCollection)theEObject;
				T result = caseSpecimenCollection(specimenCollection);
				if (result == null) result = caseBackboneElement(specimenCollection);
				if (result == null) result = caseDataType(specimenCollection);
				if (result == null) result = caseElement(specimenCollection);
				if (result == null) result = caseBase(specimenCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SPECIMEN_TREATMENT: {
				SpecimenTreatment specimenTreatment = (SpecimenTreatment)theEObject;
				T result = caseSpecimenTreatment(specimenTreatment);
				if (result == null) result = caseBackboneElement(specimenTreatment);
				if (result == null) result = caseDataType(specimenTreatment);
				if (result == null) result = caseElement(specimenTreatment);
				if (result == null) result = caseBase(specimenTreatment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SPECIMEN_CONTAINER: {
				SpecimenContainer specimenContainer = (SpecimenContainer)theEObject;
				T result = caseSpecimenContainer(specimenContainer);
				if (result == null) result = caseBackboneElement(specimenContainer);
				if (result == null) result = caseDataType(specimenContainer);
				if (result == null) result = caseElement(specimenContainer);
				if (result == null) result = caseBase(specimenContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE: {
				ObservationReferenceRange observationReferenceRange = (ObservationReferenceRange)theEObject;
				T result = caseObservationReferenceRange(observationReferenceRange);
				if (result == null) result = caseBackboneElement(observationReferenceRange);
				if (result == null) result = caseDataType(observationReferenceRange);
				if (result == null) result = caseElement(observationReferenceRange);
				if (result == null) result = caseBase(observationReferenceRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OBSERVATION_RELATED: {
				ObservationRelated observationRelated = (ObservationRelated)theEObject;
				T result = caseObservationRelated(observationRelated);
				if (result == null) result = caseBackboneElement(observationRelated);
				if (result == null) result = caseDataType(observationRelated);
				if (result == null) result = caseElement(observationRelated);
				if (result == null) result = caseBase(observationRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OBSERVATION_COMPONENT: {
				ObservationComponent observationComponent = (ObservationComponent)theEObject;
				T result = caseObservationComponent(observationComponent);
				if (result == null) result = caseBackboneElement(observationComponent);
				if (result == null) result = caseDataType(observationComponent);
				if (result == null) result = caseElement(observationComponent);
				if (result == null) result = caseBase(observationComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DIAGNOSTIC_REQUEST: {
				DiagnosticRequest diagnosticRequest = (DiagnosticRequest)theEObject;
				T result = caseDiagnosticRequest(diagnosticRequest);
				if (result == null) result = caseDomainResource(diagnosticRequest);
				if (result == null) result = caseResource(diagnosticRequest);
				if (result == null) result = caseBase(diagnosticRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROVENANCE: {
				Provenance provenance = (Provenance)theEObject;
				T result = caseProvenance(provenance);
				if (result == null) result = caseDomainResource(provenance);
				if (result == null) result = caseResource(provenance);
				if (result == null) result = caseBase(provenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROVENANCE_AGENT: {
				ProvenanceAgent provenanceAgent = (ProvenanceAgent)theEObject;
				T result = caseProvenanceAgent(provenanceAgent);
				if (result == null) result = caseBackboneElement(provenanceAgent);
				if (result == null) result = caseDataType(provenanceAgent);
				if (result == null) result = caseElement(provenanceAgent);
				if (result == null) result = caseBase(provenanceAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROVENANCE_ENTITY: {
				ProvenanceEntity provenanceEntity = (ProvenanceEntity)theEObject;
				T result = caseProvenanceEntity(provenanceEntity);
				if (result == null) result = caseBackboneElement(provenanceEntity);
				if (result == null) result = caseDataType(provenanceEntity);
				if (result == null) result = caseElement(provenanceEntity);
				if (result == null) result = caseBase(provenanceEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROCEDURE_REQUEST: {
				ProcedureRequest procedureRequest = (ProcedureRequest)theEObject;
				T result = caseProcedureRequest(procedureRequest);
				if (result == null) result = caseDomainResource(procedureRequest);
				if (result == null) result = caseResource(procedureRequest);
				if (result == null) result = caseBase(procedureRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_METRIC: {
				DeviceMetric deviceMetric = (DeviceMetric)theEObject;
				T result = caseDeviceMetric(deviceMetric);
				if (result == null) result = caseDomainResource(deviceMetric);
				if (result == null) result = caseResource(deviceMetric);
				if (result == null) result = caseBase(deviceMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_COMPONENT: {
				DeviceComponent deviceComponent = (DeviceComponent)theEObject;
				T result = caseDeviceComponent(deviceComponent);
				if (result == null) result = caseDomainResource(deviceComponent);
				if (result == null) result = caseResource(deviceComponent);
				if (result == null) result = caseBase(deviceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION: {
				DeviceComponentProductionSpecification deviceComponentProductionSpecification = (DeviceComponentProductionSpecification)theEObject;
				T result = caseDeviceComponentProductionSpecification(deviceComponentProductionSpecification);
				if (result == null) result = caseBackboneElement(deviceComponentProductionSpecification);
				if (result == null) result = caseDataType(deviceComponentProductionSpecification);
				if (result == null) result = caseElement(deviceComponentProductionSpecification);
				if (result == null) result = caseBase(deviceComponentProductionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION: {
				DeviceMetricCalibration deviceMetricCalibration = (DeviceMetricCalibration)theEObject;
				T result = caseDeviceMetricCalibration(deviceMetricCalibration);
				if (result == null) result = caseBackboneElement(deviceMetricCalibration);
				if (result == null) result = caseDataType(deviceMetricCalibration);
				if (result == null) result = caseElement(deviceMetricCalibration);
				if (result == null) result = caseBase(deviceMetricCalibration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE: {
				QuestionnaireResponse questionnaireResponse = (QuestionnaireResponse)theEObject;
				T result = caseQuestionnaireResponse(questionnaireResponse);
				if (result == null) result = caseDomainResource(questionnaireResponse);
				if (result == null) result = caseResource(questionnaireResponse);
				if (result == null) result = caseBase(questionnaireResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE: {
				Questionnaire questionnaire = (Questionnaire)theEObject;
				T result = caseQuestionnaire(questionnaire);
				if (result == null) result = caseDomainResource(questionnaire);
				if (result == null) result = caseResource(questionnaire);
				if (result == null) result = caseBase(questionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE_ITEM: {
				QuestionnaireItem questionnaireItem = (QuestionnaireItem)theEObject;
				T result = caseQuestionnaireItem(questionnaireItem);
				if (result == null) result = caseBackboneElement(questionnaireItem);
				if (result == null) result = caseDataType(questionnaireItem);
				if (result == null) result = caseElement(questionnaireItem);
				if (result == null) result = caseBase(questionnaireItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN: {
				QuestionnaireItemEnableWhen questionnaireItemEnableWhen = (QuestionnaireItemEnableWhen)theEObject;
				T result = caseQuestionnaireItemEnableWhen(questionnaireItemEnableWhen);
				if (result == null) result = caseBackboneElement(questionnaireItemEnableWhen);
				if (result == null) result = caseDataType(questionnaireItemEnableWhen);
				if (result == null) result = caseElement(questionnaireItemEnableWhen);
				if (result == null) result = caseBase(questionnaireItemEnableWhen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE_ITEM_OPTION: {
				QuestionnaireItemOption questionnaireItemOption = (QuestionnaireItemOption)theEObject;
				T result = caseQuestionnaireItemOption(questionnaireItemOption);
				if (result == null) result = caseBackboneElement(questionnaireItemOption);
				if (result == null) result = caseDataType(questionnaireItemOption);
				if (result == null) result = caseElement(questionnaireItemOption);
				if (result == null) result = caseBase(questionnaireItemOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM: {
				QuestionnaireResponseItem questionnaireResponseItem = (QuestionnaireResponseItem)theEObject;
				T result = caseQuestionnaireResponseItem(questionnaireResponseItem);
				if (result == null) result = caseBackboneElement(questionnaireResponseItem);
				if (result == null) result = caseDataType(questionnaireResponseItem);
				if (result == null) result = caseElement(questionnaireResponseItem);
				if (result == null) result = caseBase(questionnaireResponseItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER: {
				QuestionnaireResponseItemAnswer questionnaireResponseItemAnswer = (QuestionnaireResponseItemAnswer)theEObject;
				T result = caseQuestionnaireResponseItemAnswer(questionnaireResponseItemAnswer);
				if (result == null) result = caseBackboneElement(questionnaireResponseItemAnswer);
				if (result == null) result = caseDataType(questionnaireResponseItemAnswer);
				if (result == null) result = caseElement(questionnaireResponseItemAnswer);
				if (result == null) result = caseBase(questionnaireResponseItemAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CARE_PLAN: {
				CarePlan carePlan = (CarePlan)theEObject;
				T result = caseCarePlan(carePlan);
				if (result == null) result = caseDomainResource(carePlan);
				if (result == null) result = caseResource(carePlan);
				if (result == null) result = caseBase(carePlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CARE_PLAN_RELATED_PLAN: {
				CarePlanRelatedPlan carePlanRelatedPlan = (CarePlanRelatedPlan)theEObject;
				T result = caseCarePlanRelatedPlan(carePlanRelatedPlan);
				if (result == null) result = caseBackboneElement(carePlanRelatedPlan);
				if (result == null) result = caseDataType(carePlanRelatedPlan);
				if (result == null) result = caseElement(carePlanRelatedPlan);
				if (result == null) result = caseBase(carePlanRelatedPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseDomainResource(goal);
				if (result == null) result = caseResource(goal);
				if (result == null) result = caseBase(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GOAL_OUTCOME: {
				GoalOutcome goalOutcome = (GoalOutcome)theEObject;
				T result = caseGoalOutcome(goalOutcome);
				if (result == null) result = caseBackboneElement(goalOutcome);
				if (result == null) result = caseDataType(goalOutcome);
				if (result == null) result = caseElement(goalOutcome);
				if (result == null) result = caseBase(goalOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CARE_PLAN_ACTIVITY: {
				CarePlanActivity carePlanActivity = (CarePlanActivity)theEObject;
				T result = caseCarePlanActivity(carePlanActivity);
				if (result == null) result = caseBackboneElement(carePlanActivity);
				if (result == null) result = caseDataType(carePlanActivity);
				if (result == null) result = caseElement(carePlanActivity);
				if (result == null) result = caseBase(carePlanActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL: {
				CarePlanActivityDetail carePlanActivityDetail = (CarePlanActivityDetail)theEObject;
				T result = caseCarePlanActivityDetail(carePlanActivityDetail);
				if (result == null) result = caseBackboneElement(carePlanActivityDetail);
				if (result == null) result = caseDataType(carePlanActivityDetail);
				if (result == null) result = caseElement(carePlanActivityDetail);
				if (result == null) result = caseBase(carePlanActivityDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_STATEMENT: {
				MedicationStatement medicationStatement = (MedicationStatement)theEObject;
				T result = caseMedicationStatement(medicationStatement);
				if (result == null) result = caseDomainResource(medicationStatement);
				if (result == null) result = caseResource(medicationStatement);
				if (result == null) result = caseBase(medicationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_REQUEST: {
				NutritionRequest nutritionRequest = (NutritionRequest)theEObject;
				T result = caseNutritionRequest(nutritionRequest);
				if (result == null) result = caseDomainResource(nutritionRequest);
				if (result == null) result = caseResource(nutritionRequest);
				if (result == null) result = caseBase(nutritionRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET: {
				NutritionRequestOralDiet nutritionRequestOralDiet = (NutritionRequestOralDiet)theEObject;
				T result = caseNutritionRequestOralDiet(nutritionRequestOralDiet);
				if (result == null) result = caseBackboneElement(nutritionRequestOralDiet);
				if (result == null) result = caseDataType(nutritionRequestOralDiet);
				if (result == null) result = caseElement(nutritionRequestOralDiet);
				if (result == null) result = caseBase(nutritionRequestOralDiet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_NUTRIENT: {
				NutritionRequestOralDietNutrient nutritionRequestOralDietNutrient = (NutritionRequestOralDietNutrient)theEObject;
				T result = caseNutritionRequestOralDietNutrient(nutritionRequestOralDietNutrient);
				if (result == null) result = caseBackboneElement(nutritionRequestOralDietNutrient);
				if (result == null) result = caseDataType(nutritionRequestOralDietNutrient);
				if (result == null) result = caseElement(nutritionRequestOralDietNutrient);
				if (result == null) result = caseBase(nutritionRequestOralDietNutrient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE: {
				NutritionRequestOralDietTexture nutritionRequestOralDietTexture = (NutritionRequestOralDietTexture)theEObject;
				T result = caseNutritionRequestOralDietTexture(nutritionRequestOralDietTexture);
				if (result == null) result = caseBackboneElement(nutritionRequestOralDietTexture);
				if (result == null) result = caseDataType(nutritionRequestOralDietTexture);
				if (result == null) result = caseElement(nutritionRequestOralDietTexture);
				if (result == null) result = caseBase(nutritionRequestOralDietTexture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_REQUEST_SUPPLEMENT: {
				NutritionRequestSupplement nutritionRequestSupplement = (NutritionRequestSupplement)theEObject;
				T result = caseNutritionRequestSupplement(nutritionRequestSupplement);
				if (result == null) result = caseBackboneElement(nutritionRequestSupplement);
				if (result == null) result = caseDataType(nutritionRequestSupplement);
				if (result == null) result = caseElement(nutritionRequestSupplement);
				if (result == null) result = caseBase(nutritionRequestSupplement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA: {
				NutritionRequestEnteralFormula nutritionRequestEnteralFormula = (NutritionRequestEnteralFormula)theEObject;
				T result = caseNutritionRequestEnteralFormula(nutritionRequestEnteralFormula);
				if (result == null) result = caseBackboneElement(nutritionRequestEnteralFormula);
				if (result == null) result = caseDataType(nutritionRequestEnteralFormula);
				if (result == null) result = caseElement(nutritionRequestEnteralFormula);
				if (result == null) result = caseBase(nutritionRequestEnteralFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION: {
				NutritionRequestEnteralFormulaAdministration nutritionRequestEnteralFormulaAdministration = (NutritionRequestEnteralFormulaAdministration)theEObject;
				T result = caseNutritionRequestEnteralFormulaAdministration(nutritionRequestEnteralFormulaAdministration);
				if (result == null) result = caseBackboneElement(nutritionRequestEnteralFormulaAdministration);
				if (result == null) result = caseDataType(nutritionRequestEnteralFormulaAdministration);
				if (result == null) result = caseElement(nutritionRequestEnteralFormulaAdministration);
				if (result == null) result = caseBase(nutritionRequestEnteralFormulaAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMMUNICATION_REQUEST: {
				CommunicationRequest communicationRequest = (CommunicationRequest)theEObject;
				T result = caseCommunicationRequest(communicationRequest);
				if (result == null) result = caseDomainResource(communicationRequest);
				if (result == null) result = caseResource(communicationRequest);
				if (result == null) result = caseBase(communicationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMMUNICATION_REQUEST_PAYLOAD: {
				CommunicationRequestPayload communicationRequestPayload = (CommunicationRequestPayload)theEObject;
				T result = caseCommunicationRequestPayload(communicationRequestPayload);
				if (result == null) result = caseBackboneElement(communicationRequestPayload);
				if (result == null) result = caseDataType(communicationRequestPayload);
				if (result == null) result = caseElement(communicationRequestPayload);
				if (result == null) result = caseBase(communicationRequestPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_USE_REQUEST: {
				DeviceUseRequest deviceUseRequest = (DeviceUseRequest)theEObject;
				T result = caseDeviceUseRequest(deviceUseRequest);
				if (result == null) result = caseDomainResource(deviceUseRequest);
				if (result == null) result = caseResource(deviceUseRequest);
				if (result == null) result = caseBase(deviceUseRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_REQUEST: {
				MedicationRequest medicationRequest = (MedicationRequest)theEObject;
				T result = caseMedicationRequest(medicationRequest);
				if (result == null) result = caseDomainResource(medicationRequest);
				if (result == null) result = caseResource(medicationRequest);
				if (result == null) result = caseBase(medicationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST: {
				MedicationRequestDispenseRequest medicationRequestDispenseRequest = (MedicationRequestDispenseRequest)theEObject;
				T result = caseMedicationRequestDispenseRequest(medicationRequestDispenseRequest);
				if (result == null) result = caseBackboneElement(medicationRequestDispenseRequest);
				if (result == null) result = caseDataType(medicationRequestDispenseRequest);
				if (result == null) result = caseElement(medicationRequestDispenseRequest);
				if (result == null) result = caseBase(medicationRequestDispenseRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_REQUEST_SUBSTITUTION: {
				MedicationRequestSubstitution medicationRequestSubstitution = (MedicationRequestSubstitution)theEObject;
				T result = caseMedicationRequestSubstitution(medicationRequestSubstitution);
				if (result == null) result = caseBackboneElement(medicationRequestSubstitution);
				if (result == null) result = caseDataType(medicationRequestSubstitution);
				if (result == null) result = caseElement(medicationRequestSubstitution);
				if (result == null) result = caseBase(medicationRequestSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROCESS_REQUEST: {
				ProcessRequest processRequest = (ProcessRequest)theEObject;
				T result = caseProcessRequest(processRequest);
				if (result == null) result = caseDomainResource(processRequest);
				if (result == null) result = caseResource(processRequest);
				if (result == null) result = caseBase(processRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROCESS_REQUEST_ITEMS: {
				ProcessRequestItems processRequestItems = (ProcessRequestItems)theEObject;
				T result = caseProcessRequestItems(processRequestItems);
				if (result == null) result = caseBackboneElement(processRequestItems);
				if (result == null) result = caseDataType(processRequestItems);
				if (result == null) result = caseElement(processRequestItems);
				if (result == null) result = caseBase(processRequestItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VISION_PRESCRIPTION: {
				VisionPrescription visionPrescription = (VisionPrescription)theEObject;
				T result = caseVisionPrescription(visionPrescription);
				if (result == null) result = caseDomainResource(visionPrescription);
				if (result == null) result = caseResource(visionPrescription);
				if (result == null) result = caseBase(visionPrescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE: {
				VisionPrescriptionDispense visionPrescriptionDispense = (VisionPrescriptionDispense)theEObject;
				T result = caseVisionPrescriptionDispense(visionPrescriptionDispense);
				if (result == null) result = caseBackboneElement(visionPrescriptionDispense);
				if (result == null) result = caseDataType(visionPrescriptionDispense);
				if (result == null) result = caseElement(visionPrescriptionDispense);
				if (result == null) result = caseBase(visionPrescriptionDispense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseDomainResource(procedure);
				if (result == null) result = caseResource(procedure);
				if (result == null) result = caseBase(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROCEDURE_PERFORMER: {
				ProcedurePerformer procedurePerformer = (ProcedurePerformer)theEObject;
				T result = caseProcedurePerformer(procedurePerformer);
				if (result == null) result = caseBackboneElement(procedurePerformer);
				if (result == null) result = caseDataType(procedurePerformer);
				if (result == null) result = caseElement(procedurePerformer);
				if (result == null) result = caseBase(procedurePerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DIAGNOSTIC_REPORT: {
				DiagnosticReport diagnosticReport = (DiagnosticReport)theEObject;
				T result = caseDiagnosticReport(diagnosticReport);
				if (result == null) result = caseDomainResource(diagnosticReport);
				if (result == null) result = caseResource(diagnosticReport);
				if (result == null) result = caseBase(diagnosticReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DIAGNOSTIC_REPORT_IMAGE: {
				DiagnosticReportImage diagnosticReportImage = (DiagnosticReportImage)theEObject;
				T result = caseDiagnosticReportImage(diagnosticReportImage);
				if (result == null) result = caseBackboneElement(diagnosticReportImage);
				if (result == null) result = caseDataType(diagnosticReportImage);
				if (result == null) result = caseElement(diagnosticReportImage);
				if (result == null) result = caseBase(diagnosticReportImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDIA: {
				Media media = (Media)theEObject;
				T result = caseMedia(media);
				if (result == null) result = caseDomainResource(media);
				if (result == null) result = caseResource(media);
				if (result == null) result = caseBase(media);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROCEDURE_FOCAL_DEVICE: {
				ProcedureFocalDevice procedureFocalDevice = (ProcedureFocalDevice)theEObject;
				T result = caseProcedureFocalDevice(procedureFocalDevice);
				if (result == null) result = caseBackboneElement(procedureFocalDevice);
				if (result == null) result = caseDataType(procedureFocalDevice);
				if (result == null) result = caseElement(procedureFocalDevice);
				if (result == null) result = caseBase(procedureFocalDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_STUDY: {
				ImagingStudy imagingStudy = (ImagingStudy)theEObject;
				T result = caseImagingStudy(imagingStudy);
				if (result == null) result = caseDomainResource(imagingStudy);
				if (result == null) result = caseResource(imagingStudy);
				if (result == null) result = caseBase(imagingStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_STUDY_STUDY_BASE_LOCATION: {
				ImagingStudyStudyBaseLocation imagingStudyStudyBaseLocation = (ImagingStudyStudyBaseLocation)theEObject;
				T result = caseImagingStudyStudyBaseLocation(imagingStudyStudyBaseLocation);
				if (result == null) result = caseBackboneElement(imagingStudyStudyBaseLocation);
				if (result == null) result = caseDataType(imagingStudyStudyBaseLocation);
				if (result == null) result = caseElement(imagingStudyStudyBaseLocation);
				if (result == null) result = caseBase(imagingStudyStudyBaseLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_STUDY_SERIES: {
				ImagingStudySeries imagingStudySeries = (ImagingStudySeries)theEObject;
				T result = caseImagingStudySeries(imagingStudySeries);
				if (result == null) result = caseBackboneElement(imagingStudySeries);
				if (result == null) result = caseDataType(imagingStudySeries);
				if (result == null) result = caseElement(imagingStudySeries);
				if (result == null) result = caseBase(imagingStudySeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_STUDY_SERIES_SERIES_BASE_LOCATION: {
				ImagingStudySeriesSeriesBaseLocation imagingStudySeriesSeriesBaseLocation = (ImagingStudySeriesSeriesBaseLocation)theEObject;
				T result = caseImagingStudySeriesSeriesBaseLocation(imagingStudySeriesSeriesBaseLocation);
				if (result == null) result = caseBackboneElement(imagingStudySeriesSeriesBaseLocation);
				if (result == null) result = caseDataType(imagingStudySeriesSeriesBaseLocation);
				if (result == null) result = caseElement(imagingStudySeriesSeriesBaseLocation);
				if (result == null) result = caseBase(imagingStudySeriesSeriesBaseLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_STUDY_SERIES_INSTANCE: {
				ImagingStudySeriesInstance imagingStudySeriesInstance = (ImagingStudySeriesInstance)theEObject;
				T result = caseImagingStudySeriesInstance(imagingStudySeriesInstance);
				if (result == null) result = caseBackboneElement(imagingStudySeriesInstance);
				if (result == null) result = caseDataType(imagingStudySeriesInstance);
				if (result == null) result = caseElement(imagingStudySeriesInstance);
				if (result == null) result = caseBase(imagingStudySeriesInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_MANIFEST: {
				ImagingManifest imagingManifest = (ImagingManifest)theEObject;
				T result = caseImagingManifest(imagingManifest);
				if (result == null) result = caseDomainResource(imagingManifest);
				if (result == null) result = caseResource(imagingManifest);
				if (result == null) result = caseBase(imagingManifest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_MANIFEST_STUDY: {
				ImagingManifestStudy imagingManifestStudy = (ImagingManifestStudy)theEObject;
				T result = caseImagingManifestStudy(imagingManifestStudy);
				if (result == null) result = caseBackboneElement(imagingManifestStudy);
				if (result == null) result = caseDataType(imagingManifestStudy);
				if (result == null) result = caseElement(imagingManifestStudy);
				if (result == null) result = caseBase(imagingManifestStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_STUDY_BASE_LOCATION: {
				ImagingManifestStudyStudyBaseLocation imagingManifestStudyStudyBaseLocation = (ImagingManifestStudyStudyBaseLocation)theEObject;
				T result = caseImagingManifestStudyStudyBaseLocation(imagingManifestStudyStudyBaseLocation);
				if (result == null) result = caseBackboneElement(imagingManifestStudyStudyBaseLocation);
				if (result == null) result = caseDataType(imagingManifestStudyStudyBaseLocation);
				if (result == null) result = caseElement(imagingManifestStudyStudyBaseLocation);
				if (result == null) result = caseBase(imagingManifestStudyStudyBaseLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES: {
				ImagingManifestStudySeries imagingManifestStudySeries = (ImagingManifestStudySeries)theEObject;
				T result = caseImagingManifestStudySeries(imagingManifestStudySeries);
				if (result == null) result = caseBackboneElement(imagingManifestStudySeries);
				if (result == null) result = caseDataType(imagingManifestStudySeries);
				if (result == null) result = caseElement(imagingManifestStudySeries);
				if (result == null) result = caseBase(imagingManifestStudySeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES_SERIES_BASE_LOCATION: {
				ImagingManifestStudySeriesSeriesBaseLocation imagingManifestStudySeriesSeriesBaseLocation = (ImagingManifestStudySeriesSeriesBaseLocation)theEObject;
				T result = caseImagingManifestStudySeriesSeriesBaseLocation(imagingManifestStudySeriesSeriesBaseLocation);
				if (result == null) result = caseBackboneElement(imagingManifestStudySeriesSeriesBaseLocation);
				if (result == null) result = caseDataType(imagingManifestStudySeriesSeriesBaseLocation);
				if (result == null) result = caseElement(imagingManifestStudySeriesSeriesBaseLocation);
				if (result == null) result = caseBase(imagingManifestStudySeriesSeriesBaseLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES_INSTANCE: {
				ImagingManifestStudySeriesInstance imagingManifestStudySeriesInstance = (ImagingManifestStudySeriesInstance)theEObject;
				T result = caseImagingManifestStudySeriesInstance(imagingManifestStudySeriesInstance);
				if (result == null) result = caseBackboneElement(imagingManifestStudySeriesInstance);
				if (result == null) result = caseDataType(imagingManifestStudySeriesInstance);
				if (result == null) result = caseElement(imagingManifestStudySeriesInstance);
				if (result == null) result = caseBase(imagingManifestStudySeriesInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_ADMINISTRATION: {
				MedicationAdministration medicationAdministration = (MedicationAdministration)theEObject;
				T result = caseMedicationAdministration(medicationAdministration);
				if (result == null) result = caseDomainResource(medicationAdministration);
				if (result == null) result = caseResource(medicationAdministration);
				if (result == null) result = caseBase(medicationAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_ADMINISTRATION_DOSAGE: {
				MedicationAdministrationDosage medicationAdministrationDosage = (MedicationAdministrationDosage)theEObject;
				T result = caseMedicationAdministrationDosage(medicationAdministrationDosage);
				if (result == null) result = caseBackboneElement(medicationAdministrationDosage);
				if (result == null) result = caseDataType(medicationAdministrationDosage);
				if (result == null) result = caseElement(medicationAdministrationDosage);
				if (result == null) result = caseBase(medicationAdministrationDosage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseDomainResource(sequence);
				if (result == null) result = caseResource(sequence);
				if (result == null) result = caseBase(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ: {
				SequenceReferenceSeq sequenceReferenceSeq = (SequenceReferenceSeq)theEObject;
				T result = caseSequenceReferenceSeq(sequenceReferenceSeq);
				if (result == null) result = caseBackboneElement(sequenceReferenceSeq);
				if (result == null) result = caseDataType(sequenceReferenceSeq);
				if (result == null) result = caseElement(sequenceReferenceSeq);
				if (result == null) result = caseBase(sequenceReferenceSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SEQUENCE_VARIANT: {
				SequenceVariant sequenceVariant = (SequenceVariant)theEObject;
				T result = caseSequenceVariant(sequenceVariant);
				if (result == null) result = caseBackboneElement(sequenceVariant);
				if (result == null) result = caseDataType(sequenceVariant);
				if (result == null) result = caseElement(sequenceVariant);
				if (result == null) result = caseBase(sequenceVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SEQUENCE_QUALITY: {
				SequenceQuality sequenceQuality = (SequenceQuality)theEObject;
				T result = caseSequenceQuality(sequenceQuality);
				if (result == null) result = caseBackboneElement(sequenceQuality);
				if (result == null) result = caseDataType(sequenceQuality);
				if (result == null) result = caseElement(sequenceQuality);
				if (result == null) result = caseBase(sequenceQuality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SEQUENCE_REPOSITORY: {
				SequenceRepository sequenceRepository = (SequenceRepository)theEObject;
				T result = caseSequenceRepository(sequenceRepository);
				if (result == null) result = caseBackboneElement(sequenceRepository);
				if (result == null) result = caseDataType(sequenceRepository);
				if (result == null) result = caseElement(sequenceRepository);
				if (result == null) result = caseBase(sequenceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT: {
				SequenceStructureVariant sequenceStructureVariant = (SequenceStructureVariant)theEObject;
				T result = caseSequenceStructureVariant(sequenceStructureVariant);
				if (result == null) result = caseBackboneElement(sequenceStructureVariant);
				if (result == null) result = caseDataType(sequenceStructureVariant);
				if (result == null) result = caseElement(sequenceStructureVariant);
				if (result == null) result = caseBase(sequenceStructureVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT_OUTER: {
				SequenceStructureVariantOuter sequenceStructureVariantOuter = (SequenceStructureVariantOuter)theEObject;
				T result = caseSequenceStructureVariantOuter(sequenceStructureVariantOuter);
				if (result == null) result = caseBackboneElement(sequenceStructureVariantOuter);
				if (result == null) result = caseDataType(sequenceStructureVariantOuter);
				if (result == null) result = caseElement(sequenceStructureVariantOuter);
				if (result == null) result = caseBase(sequenceStructureVariantOuter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT_INNER: {
				SequenceStructureVariantInner sequenceStructureVariantInner = (SequenceStructureVariantInner)theEObject;
				T result = caseSequenceStructureVariantInner(sequenceStructureVariantInner);
				if (result == null) result = caseBackboneElement(sequenceStructureVariantInner);
				if (result == null) result = caseDataType(sequenceStructureVariantInner);
				if (result == null) result = caseElement(sequenceStructureVariantInner);
				if (result == null) result = caseBase(sequenceStructureVariantInner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.FAMILY_MEMBER_HISTORY: {
				FamilyMemberHistory familyMemberHistory = (FamilyMemberHistory)theEObject;
				T result = caseFamilyMemberHistory(familyMemberHistory);
				if (result == null) result = caseDomainResource(familyMemberHistory);
				if (result == null) result = caseResource(familyMemberHistory);
				if (result == null) result = caseBase(familyMemberHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION: {
				FamilyMemberHistoryCondition familyMemberHistoryCondition = (FamilyMemberHistoryCondition)theEObject;
				T result = caseFamilyMemberHistoryCondition(familyMemberHistoryCondition);
				if (result == null) result = caseBackboneElement(familyMemberHistoryCondition);
				if (result == null) result = caseDataType(familyMemberHistoryCondition);
				if (result == null) result = caseElement(familyMemberHistoryCondition);
				if (result == null) result = caseBase(familyMemberHistoryCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseDomainResource(composition);
				if (result == null) result = caseResource(composition);
				if (result == null) result = caseBase(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMPOSITION_ATTESTER: {
				CompositionAttester compositionAttester = (CompositionAttester)theEObject;
				T result = caseCompositionAttester(compositionAttester);
				if (result == null) result = caseBackboneElement(compositionAttester);
				if (result == null) result = caseDataType(compositionAttester);
				if (result == null) result = caseElement(compositionAttester);
				if (result == null) result = caseBase(compositionAttester);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMPOSITION_EVENT: {
				CompositionEvent compositionEvent = (CompositionEvent)theEObject;
				T result = caseCompositionEvent(compositionEvent);
				if (result == null) result = caseBackboneElement(compositionEvent);
				if (result == null) result = caseDataType(compositionEvent);
				if (result == null) result = caseElement(compositionEvent);
				if (result == null) result = caseBase(compositionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMPOSITION_SECTION: {
				CompositionSection compositionSection = (CompositionSection)theEObject;
				T result = caseCompositionSection(compositionSection);
				if (result == null) result = caseBackboneElement(compositionSection);
				if (result == null) result = caseDataType(compositionSection);
				if (result == null) result = caseElement(compositionSection);
				if (result == null) result = caseBase(compositionSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMMUNICATION: {
				Communication communication = (Communication)theEObject;
				T result = caseCommunication(communication);
				if (result == null) result = caseDomainResource(communication);
				if (result == null) result = caseResource(communication);
				if (result == null) result = caseBase(communication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMMUNICATION_PAYLOAD: {
				CommunicationPayload communicationPayload = (CommunicationPayload)theEObject;
				T result = caseCommunicationPayload(communicationPayload);
				if (result == null) result = caseBackboneElement(communicationPayload);
				if (result == null) result = caseDataType(communicationPayload);
				if (result == null) result = caseElement(communicationPayload);
				if (result == null) result = caseBase(communicationPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NAMING_SYSTEM: {
				NamingSystem namingSystem = (NamingSystem)theEObject;
				T result = caseNamingSystem(namingSystem);
				if (result == null) result = caseDomainResource(namingSystem);
				if (result == null) result = caseResource(namingSystem);
				if (result == null) result = caseBase(namingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID: {
				NamingSystemUniqueId namingSystemUniqueId = (NamingSystemUniqueId)theEObject;
				T result = caseNamingSystemUniqueId(namingSystemUniqueId);
				if (result == null) result = caseBackboneElement(namingSystemUniqueId);
				if (result == null) result = caseDataType(namingSystemUniqueId);
				if (result == null) result = caseElement(namingSystemUniqueId);
				if (result == null) result = caseBase(namingSystemUniqueId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONCEPT_MAP: {
				ConceptMap conceptMap = (ConceptMap)theEObject;
				T result = caseConceptMap(conceptMap);
				if (result == null) result = caseDomainResource(conceptMap);
				if (result == null) result = caseResource(conceptMap);
				if (result == null) result = caseBase(conceptMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONCEPT_MAP_GROUP: {
				ConceptMapGroup conceptMapGroup = (ConceptMapGroup)theEObject;
				T result = caseConceptMapGroup(conceptMapGroup);
				if (result == null) result = caseBackboneElement(conceptMapGroup);
				if (result == null) result = caseDataType(conceptMapGroup);
				if (result == null) result = caseElement(conceptMapGroup);
				if (result == null) result = caseBase(conceptMapGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT: {
				ConceptMapGroupSourceElement conceptMapGroupSourceElement = (ConceptMapGroupSourceElement)theEObject;
				T result = caseConceptMapGroupSourceElement(conceptMapGroupSourceElement);
				if (result == null) result = caseBackboneElement(conceptMapGroupSourceElement);
				if (result == null) result = caseDataType(conceptMapGroupSourceElement);
				if (result == null) result = caseElement(conceptMapGroupSourceElement);
				if (result == null) result = caseBase(conceptMapGroupSourceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT: {
				ConceptMapGroupSourceElementTargetElement conceptMapGroupSourceElementTargetElement = (ConceptMapGroupSourceElementTargetElement)theEObject;
				T result = caseConceptMapGroupSourceElementTargetElement(conceptMapGroupSourceElementTargetElement);
				if (result == null) result = caseBackboneElement(conceptMapGroupSourceElementTargetElement);
				if (result == null) result = caseDataType(conceptMapGroupSourceElementTargetElement);
				if (result == null) result = caseElement(conceptMapGroupSourceElementTargetElement);
				if (result == null) result = caseBase(conceptMapGroupSourceElementTargetElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT: {
				ConceptMapGroupSourceElementTargetElementOtherElement conceptMapGroupSourceElementTargetElementOtherElement = (ConceptMapGroupSourceElementTargetElementOtherElement)theEObject;
				T result = caseConceptMapGroupSourceElementTargetElementOtherElement(conceptMapGroupSourceElementTargetElementOtherElement);
				if (result == null) result = caseBackboneElement(conceptMapGroupSourceElementTargetElementOtherElement);
				if (result == null) result = caseDataType(conceptMapGroupSourceElementTargetElementOtherElement);
				if (result == null) result = caseElement(conceptMapGroupSourceElementTargetElementOtherElement);
				if (result == null) result = caseBase(conceptMapGroupSourceElementTargetElementOtherElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.REQUEST_GROUP: {
				RequestGroup requestGroup = (RequestGroup)theEObject;
				T result = caseRequestGroup(requestGroup);
				if (result == null) result = caseDomainResource(requestGroup);
				if (result == null) result = caseResource(requestGroup);
				if (result == null) result = caseBase(requestGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.REQUEST_GROUP_ACTION: {
				RequestGroupAction requestGroupAction = (RequestGroupAction)theEObject;
				T result = caseRequestGroupAction(requestGroupAction);
				if (result == null) result = caseBackboneElement(requestGroupAction);
				if (result == null) result = caseDataType(requestGroupAction);
				if (result == null) result = caseElement(requestGroupAction);
				if (result == null) result = caseBase(requestGroupAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.REQUEST_GROUP_ACTION_CONDITION: {
				RequestGroupActionCondition requestGroupActionCondition = (RequestGroupActionCondition)theEObject;
				T result = caseRequestGroupActionCondition(requestGroupActionCondition);
				if (result == null) result = caseBackboneElement(requestGroupActionCondition);
				if (result == null) result = caseDataType(requestGroupActionCondition);
				if (result == null) result = caseElement(requestGroupActionCondition);
				if (result == null) result = caseBase(requestGroupActionCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION: {
				RequestGroupActionRelatedAction requestGroupActionRelatedAction = (RequestGroupActionRelatedAction)theEObject;
				T result = caseRequestGroupActionRelatedAction(requestGroupActionRelatedAction);
				if (result == null) result = caseBackboneElement(requestGroupActionRelatedAction);
				if (result == null) result = caseDataType(requestGroupActionRelatedAction);
				if (result == null) result = caseElement(requestGroupActionRelatedAction);
				if (result == null) result = caseBase(requestGroupActionRelatedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseDomainResource(person);
				if (result == null) result = caseResource(person);
				if (result == null) result = caseBase(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PERSON_LINK: {
				PersonLink personLink = (PersonLink)theEObject;
				T result = casePersonLink(personLink);
				if (result == null) result = caseBackboneElement(personLink);
				if (result == null) result = caseDataType(personLink);
				if (result == null) result = caseElement(personLink);
				if (result == null) result = caseBase(personLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.FLAG: {
				Flag flag = (Flag)theEObject;
				T result = caseFlag(flag);
				if (result == null) result = caseDomainResource(flag);
				if (result == null) result = caseResource(flag);
				if (result == null) result = caseBase(flag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CODE_SYSTEM: {
				CodeSystem codeSystem = (CodeSystem)theEObject;
				T result = caseCodeSystem(codeSystem);
				if (result == null) result = caseDomainResource(codeSystem);
				if (result == null) result = caseResource(codeSystem);
				if (result == null) result = caseBase(codeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CODE_SYSTEM_FILTER: {
				CodeSystemFilter codeSystemFilter = (CodeSystemFilter)theEObject;
				T result = caseCodeSystemFilter(codeSystemFilter);
				if (result == null) result = caseBackboneElement(codeSystemFilter);
				if (result == null) result = caseDataType(codeSystemFilter);
				if (result == null) result = caseElement(codeSystemFilter);
				if (result == null) result = caseBase(codeSystemFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CODE_SYSTEM_PROPERTY: {
				CodeSystemProperty codeSystemProperty = (CodeSystemProperty)theEObject;
				T result = caseCodeSystemProperty(codeSystemProperty);
				if (result == null) result = caseBackboneElement(codeSystemProperty);
				if (result == null) result = caseDataType(codeSystemProperty);
				if (result == null) result = caseElement(codeSystemProperty);
				if (result == null) result = caseBase(codeSystemProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION: {
				CodeSystemConceptDefinition codeSystemConceptDefinition = (CodeSystemConceptDefinition)theEObject;
				T result = caseCodeSystemConceptDefinition(codeSystemConceptDefinition);
				if (result == null) result = caseBackboneElement(codeSystemConceptDefinition);
				if (result == null) result = caseDataType(codeSystemConceptDefinition);
				if (result == null) result = caseElement(codeSystemConceptDefinition);
				if (result == null) result = caseBase(codeSystemConceptDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION_DESIGNATION: {
				CodeSystemConceptDefinitionDesignation codeSystemConceptDefinitionDesignation = (CodeSystemConceptDefinitionDesignation)theEObject;
				T result = caseCodeSystemConceptDefinitionDesignation(codeSystemConceptDefinitionDesignation);
				if (result == null) result = caseBackboneElement(codeSystemConceptDefinitionDesignation);
				if (result == null) result = caseDataType(codeSystemConceptDefinitionDesignation);
				if (result == null) result = caseElement(codeSystemConceptDefinitionDesignation);
				if (result == null) result = caseBase(codeSystemConceptDefinitionDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION_CONCEPT_PROPERTY: {
				CodeSystemConceptDefinitionConceptProperty codeSystemConceptDefinitionConceptProperty = (CodeSystemConceptDefinitionConceptProperty)theEObject;
				T result = caseCodeSystemConceptDefinitionConceptProperty(codeSystemConceptDefinitionConceptProperty);
				if (result == null) result = caseBackboneElement(codeSystemConceptDefinitionConceptProperty);
				if (result == null) result = caseDataType(codeSystemConceptDefinitionConceptProperty);
				if (result == null) result = caseElement(codeSystemConceptDefinitionConceptProperty);
				if (result == null) result = caseBase(codeSystemConceptDefinitionConceptProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BINARY: {
				Binary binary = (Binary)theEObject;
				T result = caseBinary(binary);
				if (result == null) result = caseResource(binary);
				if (result == null) result = caseBase(binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_MANIFEST: {
				DocumentManifest documentManifest = (DocumentManifest)theEObject;
				T result = caseDocumentManifest(documentManifest);
				if (result == null) result = caseDomainResource(documentManifest);
				if (result == null) result = caseResource(documentManifest);
				if (result == null) result = caseBase(documentManifest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_MANIFEST_CONTENT: {
				DocumentManifestContent documentManifestContent = (DocumentManifestContent)theEObject;
				T result = caseDocumentManifestContent(documentManifestContent);
				if (result == null) result = caseBackboneElement(documentManifestContent);
				if (result == null) result = caseDataType(documentManifestContent);
				if (result == null) result = caseElement(documentManifestContent);
				if (result == null) result = caseBase(documentManifestContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_MANIFEST_RELATED: {
				DocumentManifestRelated documentManifestRelated = (DocumentManifestRelated)theEObject;
				T result = caseDocumentManifestRelated(documentManifestRelated);
				if (result == null) result = caseBackboneElement(documentManifestRelated);
				if (result == null) result = caseDataType(documentManifestRelated);
				if (result == null) result = caseElement(documentManifestRelated);
				if (result == null) result = caseBase(documentManifestRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PAYMENT_RECONCILIATION: {
				PaymentReconciliation paymentReconciliation = (PaymentReconciliation)theEObject;
				T result = casePaymentReconciliation(paymentReconciliation);
				if (result == null) result = caseDomainResource(paymentReconciliation);
				if (result == null) result = caseResource(paymentReconciliation);
				if (result == null) result = caseBase(paymentReconciliation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS: {
				PaymentReconciliationDetails paymentReconciliationDetails = (PaymentReconciliationDetails)theEObject;
				T result = casePaymentReconciliationDetails(paymentReconciliationDetails);
				if (result == null) result = caseBackboneElement(paymentReconciliationDetails);
				if (result == null) result = caseDataType(paymentReconciliationDetails);
				if (result == null) result = caseElement(paymentReconciliationDetails);
				if (result == null) result = caseBase(paymentReconciliationDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PAYMENT_RECONCILIATION_NOTES: {
				PaymentReconciliationNotes paymentReconciliationNotes = (PaymentReconciliationNotes)theEObject;
				T result = casePaymentReconciliationNotes(paymentReconciliationNotes);
				if (result == null) result = caseBackboneElement(paymentReconciliationNotes);
				if (result == null) result = caseDataType(paymentReconciliationNotes);
				if (result == null) result = caseElement(paymentReconciliationNotes);
				if (result == null) result = caseBase(paymentReconciliationNotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_USE_STATEMENT: {
				DeviceUseStatement deviceUseStatement = (DeviceUseStatement)theEObject;
				T result = caseDeviceUseStatement(deviceUseStatement);
				if (result == null) result = caseDomainResource(deviceUseStatement);
				if (result == null) result = caseResource(deviceUseStatement);
				if (result == null) result = caseBase(deviceUseStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT: {
				TestScript testScript = (TestScript)theEObject;
				T result = caseTestScript(testScript);
				if (result == null) result = caseDomainResource(testScript);
				if (result == null) result = caseResource(testScript);
				if (result == null) result = caseBase(testScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_ORIGIN: {
				TestScriptOrigin testScriptOrigin = (TestScriptOrigin)theEObject;
				T result = caseTestScriptOrigin(testScriptOrigin);
				if (result == null) result = caseBackboneElement(testScriptOrigin);
				if (result == null) result = caseDataType(testScriptOrigin);
				if (result == null) result = caseElement(testScriptOrigin);
				if (result == null) result = caseBase(testScriptOrigin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_DESTINATION: {
				TestScriptDestination testScriptDestination = (TestScriptDestination)theEObject;
				T result = caseTestScriptDestination(testScriptDestination);
				if (result == null) result = caseBackboneElement(testScriptDestination);
				if (result == null) result = caseDataType(testScriptDestination);
				if (result == null) result = caseElement(testScriptDestination);
				if (result == null) result = caseBase(testScriptDestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_METADATA: {
				TestScriptMetadata testScriptMetadata = (TestScriptMetadata)theEObject;
				T result = caseTestScriptMetadata(testScriptMetadata);
				if (result == null) result = caseBackboneElement(testScriptMetadata);
				if (result == null) result = caseDataType(testScriptMetadata);
				if (result == null) result = caseElement(testScriptMetadata);
				if (result == null) result = caseBase(testScriptMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_METADATA_LINK: {
				TestScriptMetadataLink testScriptMetadataLink = (TestScriptMetadataLink)theEObject;
				T result = caseTestScriptMetadataLink(testScriptMetadataLink);
				if (result == null) result = caseBackboneElement(testScriptMetadataLink);
				if (result == null) result = caseDataType(testScriptMetadataLink);
				if (result == null) result = caseElement(testScriptMetadataLink);
				if (result == null) result = caseBase(testScriptMetadataLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY: {
				TestScriptMetadataCapability testScriptMetadataCapability = (TestScriptMetadataCapability)theEObject;
				T result = caseTestScriptMetadataCapability(testScriptMetadataCapability);
				if (result == null) result = caseBackboneElement(testScriptMetadataCapability);
				if (result == null) result = caseDataType(testScriptMetadataCapability);
				if (result == null) result = caseElement(testScriptMetadataCapability);
				if (result == null) result = caseBase(testScriptMetadataCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT: {
				CapabilityStatement capabilityStatement = (CapabilityStatement)theEObject;
				T result = caseCapabilityStatement(capabilityStatement);
				if (result == null) result = caseDomainResource(capabilityStatement);
				if (result == null) result = caseResource(capabilityStatement);
				if (result == null) result = caseBase(capabilityStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE: {
				CapabilityStatementSoftware capabilityStatementSoftware = (CapabilityStatementSoftware)theEObject;
				T result = caseCapabilityStatementSoftware(capabilityStatementSoftware);
				if (result == null) result = caseBackboneElement(capabilityStatementSoftware);
				if (result == null) result = caseDataType(capabilityStatementSoftware);
				if (result == null) result = caseElement(capabilityStatementSoftware);
				if (result == null) result = caseBase(capabilityStatementSoftware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_IMPLEMENTATION: {
				CapabilityStatementImplementation capabilityStatementImplementation = (CapabilityStatementImplementation)theEObject;
				T result = caseCapabilityStatementImplementation(capabilityStatementImplementation);
				if (result == null) result = caseBackboneElement(capabilityStatementImplementation);
				if (result == null) result = caseDataType(capabilityStatementImplementation);
				if (result == null) result = caseElement(capabilityStatementImplementation);
				if (result == null) result = caseBase(capabilityStatementImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST: {
				CapabilityStatementRest capabilityStatementRest = (CapabilityStatementRest)theEObject;
				T result = caseCapabilityStatementRest(capabilityStatementRest);
				if (result == null) result = caseBackboneElement(capabilityStatementRest);
				if (result == null) result = caseDataType(capabilityStatementRest);
				if (result == null) result = caseElement(capabilityStatementRest);
				if (result == null) result = caseBase(capabilityStatementRest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY: {
				CapabilityStatementRestSecurity capabilityStatementRestSecurity = (CapabilityStatementRestSecurity)theEObject;
				T result = caseCapabilityStatementRestSecurity(capabilityStatementRestSecurity);
				if (result == null) result = caseBackboneElement(capabilityStatementRestSecurity);
				if (result == null) result = caseDataType(capabilityStatementRestSecurity);
				if (result == null) result = caseElement(capabilityStatementRestSecurity);
				if (result == null) result = caseBase(capabilityStatementRestSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY_CERTIFICATE: {
				CapabilityStatementRestSecurityCertificate capabilityStatementRestSecurityCertificate = (CapabilityStatementRestSecurityCertificate)theEObject;
				T result = caseCapabilityStatementRestSecurityCertificate(capabilityStatementRestSecurityCertificate);
				if (result == null) result = caseBackboneElement(capabilityStatementRestSecurityCertificate);
				if (result == null) result = caseDataType(capabilityStatementRestSecurityCertificate);
				if (result == null) result = caseElement(capabilityStatementRestSecurityCertificate);
				if (result == null) result = caseBase(capabilityStatementRestSecurityCertificate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE: {
				CapabilityStatementRestResource capabilityStatementRestResource = (CapabilityStatementRestResource)theEObject;
				T result = caseCapabilityStatementRestResource(capabilityStatementRestResource);
				if (result == null) result = caseBackboneElement(capabilityStatementRestResource);
				if (result == null) result = caseDataType(capabilityStatementRestResource);
				if (result == null) result = caseElement(capabilityStatementRestResource);
				if (result == null) result = caseBase(capabilityStatementRestResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_RESOURCE_INTERACTION: {
				CapabilityStatementRestResourceResourceInteraction capabilityStatementRestResourceResourceInteraction = (CapabilityStatementRestResourceResourceInteraction)theEObject;
				T result = caseCapabilityStatementRestResourceResourceInteraction(capabilityStatementRestResourceResourceInteraction);
				if (result == null) result = caseBackboneElement(capabilityStatementRestResourceResourceInteraction);
				if (result == null) result = caseDataType(capabilityStatementRestResourceResourceInteraction);
				if (result == null) result = caseElement(capabilityStatementRestResourceResourceInteraction);
				if (result == null) result = caseBase(capabilityStatementRestResourceResourceInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_SEARCH_PARAM: {
				CapabilityStatementRestResourceSearchParam capabilityStatementRestResourceSearchParam = (CapabilityStatementRestResourceSearchParam)theEObject;
				T result = caseCapabilityStatementRestResourceSearchParam(capabilityStatementRestResourceSearchParam);
				if (result == null) result = caseBackboneElement(capabilityStatementRestResourceSearchParam);
				if (result == null) result = caseDataType(capabilityStatementRestResourceSearchParam);
				if (result == null) result = caseElement(capabilityStatementRestResourceSearchParam);
				if (result == null) result = caseBase(capabilityStatementRestResourceSearchParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SYSTEM_INTERACTION: {
				CapabilityStatementRestSystemInteraction capabilityStatementRestSystemInteraction = (CapabilityStatementRestSystemInteraction)theEObject;
				T result = caseCapabilityStatementRestSystemInteraction(capabilityStatementRestSystemInteraction);
				if (result == null) result = caseBackboneElement(capabilityStatementRestSystemInteraction);
				if (result == null) result = caseDataType(capabilityStatementRestSystemInteraction);
				if (result == null) result = caseElement(capabilityStatementRestSystemInteraction);
				if (result == null) result = caseBase(capabilityStatementRestSystemInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_OPERATION: {
				CapabilityStatementRestOperation capabilityStatementRestOperation = (CapabilityStatementRestOperation)theEObject;
				T result = caseCapabilityStatementRestOperation(capabilityStatementRestOperation);
				if (result == null) result = caseBackboneElement(capabilityStatementRestOperation);
				if (result == null) result = caseDataType(capabilityStatementRestOperation);
				if (result == null) result = caseElement(capabilityStatementRestOperation);
				if (result == null) result = caseBase(capabilityStatementRestOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OPERATION_DEFINITION: {
				OperationDefinition operationDefinition = (OperationDefinition)theEObject;
				T result = caseOperationDefinition(operationDefinition);
				if (result == null) result = caseDomainResource(operationDefinition);
				if (result == null) result = caseResource(operationDefinition);
				if (result == null) result = caseBase(operationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER: {
				OperationDefinitionParameter operationDefinitionParameter = (OperationDefinitionParameter)theEObject;
				T result = caseOperationDefinitionParameter(operationDefinitionParameter);
				if (result == null) result = caseBackboneElement(operationDefinitionParameter);
				if (result == null) result = caseDataType(operationDefinitionParameter);
				if (result == null) result = caseElement(operationDefinitionParameter);
				if (result == null) result = caseBase(operationDefinitionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING: {
				OperationDefinitionParameterBinding operationDefinitionParameterBinding = (OperationDefinitionParameterBinding)theEObject;
				T result = caseOperationDefinitionParameterBinding(operationDefinitionParameterBinding);
				if (result == null) result = caseBackboneElement(operationDefinitionParameterBinding);
				if (result == null) result = caseDataType(operationDefinitionParameterBinding);
				if (result == null) result = caseElement(operationDefinitionParameterBinding);
				if (result == null) result = caseBase(operationDefinitionParameterBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OPERATION_DEFINITION_OVERLOAD: {
				OperationDefinitionOverload operationDefinitionOverload = (OperationDefinitionOverload)theEObject;
				T result = caseOperationDefinitionOverload(operationDefinitionOverload);
				if (result == null) result = caseBackboneElement(operationDefinitionOverload);
				if (result == null) result = caseDataType(operationDefinitionOverload);
				if (result == null) result = caseElement(operationDefinitionOverload);
				if (result == null) result = caseBase(operationDefinitionOverload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING: {
				CapabilityStatementMessaging capabilityStatementMessaging = (CapabilityStatementMessaging)theEObject;
				T result = caseCapabilityStatementMessaging(capabilityStatementMessaging);
				if (result == null) result = caseBackboneElement(capabilityStatementMessaging);
				if (result == null) result = caseDataType(capabilityStatementMessaging);
				if (result == null) result = caseElement(capabilityStatementMessaging);
				if (result == null) result = caseBase(capabilityStatementMessaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_ENDPOINT: {
				CapabilityStatementMessagingEndpoint capabilityStatementMessagingEndpoint = (CapabilityStatementMessagingEndpoint)theEObject;
				T result = caseCapabilityStatementMessagingEndpoint(capabilityStatementMessagingEndpoint);
				if (result == null) result = caseBackboneElement(capabilityStatementMessagingEndpoint);
				if (result == null) result = caseDataType(capabilityStatementMessagingEndpoint);
				if (result == null) result = caseElement(capabilityStatementMessagingEndpoint);
				if (result == null) result = caseBase(capabilityStatementMessagingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_EVENT: {
				CapabilityStatementMessagingEvent capabilityStatementMessagingEvent = (CapabilityStatementMessagingEvent)theEObject;
				T result = caseCapabilityStatementMessagingEvent(capabilityStatementMessagingEvent);
				if (result == null) result = caseBackboneElement(capabilityStatementMessagingEvent);
				if (result == null) result = caseDataType(capabilityStatementMessagingEvent);
				if (result == null) result = caseElement(capabilityStatementMessagingEvent);
				if (result == null) result = caseBase(capabilityStatementMessagingEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT: {
				CapabilityStatementDocument capabilityStatementDocument = (CapabilityStatementDocument)theEObject;
				T result = caseCapabilityStatementDocument(capabilityStatementDocument);
				if (result == null) result = caseBackboneElement(capabilityStatementDocument);
				if (result == null) result = caseDataType(capabilityStatementDocument);
				if (result == null) result = caseElement(capabilityStatementDocument);
				if (result == null) result = caseBase(capabilityStatementDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_FIXTURE: {
				TestScriptFixture testScriptFixture = (TestScriptFixture)theEObject;
				T result = caseTestScriptFixture(testScriptFixture);
				if (result == null) result = caseBackboneElement(testScriptFixture);
				if (result == null) result = caseDataType(testScriptFixture);
				if (result == null) result = caseElement(testScriptFixture);
				if (result == null) result = caseBase(testScriptFixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_VARIABLE: {
				TestScriptVariable testScriptVariable = (TestScriptVariable)theEObject;
				T result = caseTestScriptVariable(testScriptVariable);
				if (result == null) result = caseBackboneElement(testScriptVariable);
				if (result == null) result = caseDataType(testScriptVariable);
				if (result == null) result = caseElement(testScriptVariable);
				if (result == null) result = caseBase(testScriptVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_RULE: {
				TestScriptRule testScriptRule = (TestScriptRule)theEObject;
				T result = caseTestScriptRule(testScriptRule);
				if (result == null) result = caseBackboneElement(testScriptRule);
				if (result == null) result = caseDataType(testScriptRule);
				if (result == null) result = caseElement(testScriptRule);
				if (result == null) result = caseBase(testScriptRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_RULE_RULE_PARAM: {
				TestScriptRuleRuleParam testScriptRuleRuleParam = (TestScriptRuleRuleParam)theEObject;
				T result = caseTestScriptRuleRuleParam(testScriptRuleRuleParam);
				if (result == null) result = caseBackboneElement(testScriptRuleRuleParam);
				if (result == null) result = caseDataType(testScriptRuleRuleParam);
				if (result == null) result = caseElement(testScriptRuleRuleParam);
				if (result == null) result = caseBase(testScriptRuleRuleParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_RULESET: {
				TestScriptRuleset testScriptRuleset = (TestScriptRuleset)theEObject;
				T result = caseTestScriptRuleset(testScriptRuleset);
				if (result == null) result = caseBackboneElement(testScriptRuleset);
				if (result == null) result = caseDataType(testScriptRuleset);
				if (result == null) result = caseElement(testScriptRuleset);
				if (result == null) result = caseBase(testScriptRuleset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE: {
				TestScriptRulesetRulesetRule testScriptRulesetRulesetRule = (TestScriptRulesetRulesetRule)theEObject;
				T result = caseTestScriptRulesetRulesetRule(testScriptRulesetRulesetRule);
				if (result == null) result = caseBackboneElement(testScriptRulesetRulesetRule);
				if (result == null) result = caseDataType(testScriptRulesetRulesetRule);
				if (result == null) result = caseElement(testScriptRulesetRulesetRule);
				if (result == null) result = caseBase(testScriptRulesetRulesetRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE_RULESET_RULE_PARAM: {
				TestScriptRulesetRulesetRuleRulesetRuleParam testScriptRulesetRulesetRuleRulesetRuleParam = (TestScriptRulesetRulesetRuleRulesetRuleParam)theEObject;
				T result = caseTestScriptRulesetRulesetRuleRulesetRuleParam(testScriptRulesetRulesetRuleRulesetRuleParam);
				if (result == null) result = caseBackboneElement(testScriptRulesetRulesetRuleRulesetRuleParam);
				if (result == null) result = caseDataType(testScriptRulesetRulesetRuleRulesetRuleParam);
				if (result == null) result = caseElement(testScriptRulesetRulesetRuleRulesetRuleParam);
				if (result == null) result = caseBase(testScriptRulesetRulesetRuleRulesetRuleParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP: {
				TestScriptSetup testScriptSetup = (TestScriptSetup)theEObject;
				T result = caseTestScriptSetup(testScriptSetup);
				if (result == null) result = caseBackboneElement(testScriptSetup);
				if (result == null) result = caseDataType(testScriptSetup);
				if (result == null) result = caseElement(testScriptSetup);
				if (result == null) result = caseBase(testScriptSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION: {
				TestScriptSetupSetupAction testScriptSetupSetupAction = (TestScriptSetupSetupAction)theEObject;
				T result = caseTestScriptSetupSetupAction(testScriptSetupSetupAction);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupAction);
				if (result == null) result = caseDataType(testScriptSetupSetupAction);
				if (result == null) result = caseElement(testScriptSetupSetupAction);
				if (result == null) result = caseBase(testScriptSetupSetupAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION: {
				TestScriptSetupSetupActionOperation testScriptSetupSetupActionOperation = (TestScriptSetupSetupActionOperation)theEObject;
				T result = caseTestScriptSetupSetupActionOperation(testScriptSetupSetupActionOperation);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionOperation);
				if (result == null) result = caseDataType(testScriptSetupSetupActionOperation);
				if (result == null) result = caseElement(testScriptSetupSetupActionOperation);
				if (result == null) result = caseBase(testScriptSetupSetupActionOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER: {
				TestScriptSetupSetupActionOperationRequestHeader testScriptSetupSetupActionOperationRequestHeader = (TestScriptSetupSetupActionOperationRequestHeader)theEObject;
				T result = caseTestScriptSetupSetupActionOperationRequestHeader(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = caseDataType(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = caseElement(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = caseBase(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT: {
				TestScriptSetupSetupActionAssert testScriptSetupSetupActionAssert = (TestScriptSetupSetupActionAssert)theEObject;
				T result = caseTestScriptSetupSetupActionAssert(testScriptSetupSetupActionAssert);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionAssert);
				if (result == null) result = caseDataType(testScriptSetupSetupActionAssert);
				if (result == null) result = caseElement(testScriptSetupSetupActionAssert);
				if (result == null) result = caseBase(testScriptSetupSetupActionAssert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULE: {
				TestScriptSetupSetupActionAssertActionAssertRule testScriptSetupSetupActionAssertActionAssertRule = (TestScriptSetupSetupActionAssertActionAssertRule)theEObject;
				T result = caseTestScriptSetupSetupActionAssertActionAssertRule(testScriptSetupSetupActionAssertActionAssertRule);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionAssertActionAssertRule);
				if (result == null) result = caseDataType(testScriptSetupSetupActionAssertActionAssertRule);
				if (result == null) result = caseElement(testScriptSetupSetupActionAssertActionAssertRule);
				if (result == null) result = caseBase(testScriptSetupSetupActionAssertActionAssertRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULE_ACTION_ASSERT_RULE_PARAM: {
				TestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam testScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam = (TestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam)theEObject;
				T result = caseTestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam(testScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam);
				if (result == null) result = caseDataType(testScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam);
				if (result == null) result = caseElement(testScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam);
				if (result == null) result = caseBase(testScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET: {
				TestScriptSetupSetupActionAssertActionAssertRuleset testScriptSetupSetupActionAssertActionAssertRuleset = (TestScriptSetupSetupActionAssertActionAssertRuleset)theEObject;
				T result = caseTestScriptSetupSetupActionAssertActionAssertRuleset(testScriptSetupSetupActionAssertActionAssertRuleset);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionAssertActionAssertRuleset);
				if (result == null) result = caseDataType(testScriptSetupSetupActionAssertActionAssertRuleset);
				if (result == null) result = caseElement(testScriptSetupSetupActionAssertActionAssertRuleset);
				if (result == null) result = caseBase(testScriptSetupSetupActionAssertActionAssertRuleset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET_ACTION_ASSERT_RULESET_RULE: {
				TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule = (TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule)theEObject;
				T result = caseTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule(testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule);
				if (result == null) result = caseDataType(testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule);
				if (result == null) result = caseElement(testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule);
				if (result == null) result = caseBase(testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET_ACTION_ASSERT_RULESET_RULE_PARAM: {
				TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam = (TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam)theEObject;
				T result = caseTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam(testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam);
				if (result == null) result = caseDataType(testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam);
				if (result == null) result = caseElement(testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam);
				if (result == null) result = caseBase(testScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_TEST: {
				TestScriptTest testScriptTest = (TestScriptTest)theEObject;
				T result = caseTestScriptTest(testScriptTest);
				if (result == null) result = caseBackboneElement(testScriptTest);
				if (result == null) result = caseDataType(testScriptTest);
				if (result == null) result = caseElement(testScriptTest);
				if (result == null) result = caseBase(testScriptTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION: {
				TestScriptTestTestAction testScriptTestTestAction = (TestScriptTestTestAction)theEObject;
				T result = caseTestScriptTestTestAction(testScriptTestTestAction);
				if (result == null) result = caseBackboneElement(testScriptTestTestAction);
				if (result == null) result = caseDataType(testScriptTestTestAction);
				if (result == null) result = caseElement(testScriptTestTestAction);
				if (result == null) result = caseBase(testScriptTestTestAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_TEARDOWN: {
				TestScriptTeardown testScriptTeardown = (TestScriptTeardown)theEObject;
				T result = caseTestScriptTeardown(testScriptTeardown);
				if (result == null) result = caseBackboneElement(testScriptTeardown);
				if (result == null) result = caseDataType(testScriptTeardown);
				if (result == null) result = caseElement(testScriptTeardown);
				if (result == null) result = caseBase(testScriptTeardown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_TEARDOWN_TEARDOWN_ACTION: {
				TestScriptTeardownTeardownAction testScriptTeardownTeardownAction = (TestScriptTeardownTeardownAction)theEObject;
				T result = caseTestScriptTeardownTeardownAction(testScriptTeardownTeardownAction);
				if (result == null) result = caseBackboneElement(testScriptTeardownTeardownAction);
				if (result == null) result = caseDataType(testScriptTeardownTeardownAction);
				if (result == null) result = caseElement(testScriptTeardownTeardownAction);
				if (result == null) result = caseBase(testScriptTeardownTeardownAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DATA_ELEMENT: {
				DataElement dataElement = (DataElement)theEObject;
				T result = caseDataElement(dataElement);
				if (result == null) result = caseDomainResource(dataElement);
				if (result == null) result = caseResource(dataElement);
				if (result == null) result = caseBase(dataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DATA_ELEMENT_MAPPING: {
				DataElementMapping dataElementMapping = (DataElementMapping)theEObject;
				T result = caseDataElementMapping(dataElementMapping);
				if (result == null) result = caseBackboneElement(dataElementMapping);
				if (result == null) result = caseDataType(dataElementMapping);
				if (result == null) result = caseElement(dataElementMapping);
				if (result == null) result = caseBase(dataElementMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_HEADER: {
				MessageHeader messageHeader = (MessageHeader)theEObject;
				T result = caseMessageHeader(messageHeader);
				if (result == null) result = caseDomainResource(messageHeader);
				if (result == null) result = caseResource(messageHeader);
				if (result == null) result = caseBase(messageHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_HEADER_RESPONSE: {
				MessageHeaderResponse messageHeaderResponse = (MessageHeaderResponse)theEObject;
				T result = caseMessageHeaderResponse(messageHeaderResponse);
				if (result == null) result = caseBackboneElement(messageHeaderResponse);
				if (result == null) result = caseDataType(messageHeaderResponse);
				if (result == null) result = caseElement(messageHeaderResponse);
				if (result == null) result = caseBase(messageHeaderResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OPERATION_OUTCOME: {
				OperationOutcome operationOutcome = (OperationOutcome)theEObject;
				T result = caseOperationOutcome(operationOutcome);
				if (result == null) result = caseDomainResource(operationOutcome);
				if (result == null) result = caseResource(operationOutcome);
				if (result == null) result = caseBase(operationOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE: {
				OperationOutcomeIssue operationOutcomeIssue = (OperationOutcomeIssue)theEObject;
				T result = caseOperationOutcomeIssue(operationOutcomeIssue);
				if (result == null) result = caseBackboneElement(operationOutcomeIssue);
				if (result == null) result = caseDataType(operationOutcomeIssue);
				if (result == null) result = caseElement(operationOutcomeIssue);
				if (result == null) result = caseBase(operationOutcomeIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_SOURCE: {
				MessageHeaderMessageSource messageHeaderMessageSource = (MessageHeaderMessageSource)theEObject;
				T result = caseMessageHeaderMessageSource(messageHeaderMessageSource);
				if (result == null) result = caseBackboneElement(messageHeaderMessageSource);
				if (result == null) result = caseDataType(messageHeaderMessageSource);
				if (result == null) result = caseElement(messageHeaderMessageSource);
				if (result == null) result = caseBase(messageHeaderMessageSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION: {
				MessageHeaderMessageDestination messageHeaderMessageDestination = (MessageHeaderMessageDestination)theEObject;
				T result = caseMessageHeaderMessageDestination(messageHeaderMessageDestination);
				if (result == null) result = caseBackboneElement(messageHeaderMessageDestination);
				if (result == null) result = caseDataType(messageHeaderMessageDestination);
				if (result == null) result = caseElement(messageHeaderMessageDestination);
				if (result == null) result = caseBase(messageHeaderMessageDestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSCRIPTION: {
				Subscription subscription = (Subscription)theEObject;
				T result = caseSubscription(subscription);
				if (result == null) result = caseDomainResource(subscription);
				if (result == null) result = caseResource(subscription);
				if (result == null) result = caseBase(subscription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSCRIPTION_CHANNEL: {
				SubscriptionChannel subscriptionChannel = (SubscriptionChannel)theEObject;
				T result = caseSubscriptionChannel(subscriptionChannel);
				if (result == null) result = caseBackboneElement(subscriptionChannel);
				if (result == null) result = caseDataType(subscriptionChannel);
				if (result == null) result = caseElement(subscriptionChannel);
				if (result == null) result = caseBase(subscriptionChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BODY_SITE: {
				BodySite bodySite = (BodySite)theEObject;
				T result = caseBodySite(bodySite);
				if (result == null) result = caseDomainResource(bodySite);
				if (result == null) result = caseResource(bodySite);
				if (result == null) result = caseBase(bodySite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SERVICE_DEFINITION: {
				ServiceDefinition serviceDefinition = (ServiceDefinition)theEObject;
				T result = caseServiceDefinition(serviceDefinition);
				if (result == null) result = caseDomainResource(serviceDefinition);
				if (result == null) result = caseResource(serviceDefinition);
				if (result == null) result = caseBase(serviceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENROLLMENT_RESPONSE: {
				EnrollmentResponse enrollmentResponse = (EnrollmentResponse)theEObject;
				T result = caseEnrollmentResponse(enrollmentResponse);
				if (result == null) result = caseDomainResource(enrollmentResponse);
				if (result == null) result = caseResource(enrollmentResponse);
				if (result == null) result = caseBase(enrollmentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENROLLMENT_REQUEST: {
				EnrollmentRequest enrollmentRequest = (EnrollmentRequest)theEObject;
				T result = caseEnrollmentRequest(enrollmentRequest);
				if (result == null) result = caseDomainResource(enrollmentRequest);
				if (result == null) result = caseResource(enrollmentRequest);
				if (result == null) result = caseBase(enrollmentRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION: {
				ImmunizationRecommendation immunizationRecommendation = (ImmunizationRecommendation)theEObject;
				T result = caseImmunizationRecommendation(immunizationRecommendation);
				if (result == null) result = caseDomainResource(immunizationRecommendation);
				if (result == null) result = caseResource(immunizationRecommendation);
				if (result == null) result = caseBase(immunizationRecommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: {
				ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation = (ImmunizationRecommendationRecommendation)theEObject;
				T result = caseImmunizationRecommendationRecommendation(immunizationRecommendationRecommendation);
				if (result == null) result = caseBackboneElement(immunizationRecommendationRecommendation);
				if (result == null) result = caseDataType(immunizationRecommendationRecommendation);
				if (result == null) result = caseElement(immunizationRecommendationRecommendation);
				if (result == null) result = caseBase(immunizationRecommendationRecommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_DATE_CRITERION: {
				ImmunizationRecommendationRecommendationDateCriterion immunizationRecommendationRecommendationDateCriterion = (ImmunizationRecommendationRecommendationDateCriterion)theEObject;
				T result = caseImmunizationRecommendationRecommendationDateCriterion(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = caseBackboneElement(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = caseDataType(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = caseElement(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = caseBase(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL: {
				ImmunizationRecommendationRecommendationProtocol immunizationRecommendationRecommendationProtocol = (ImmunizationRecommendationRecommendationProtocol)theEObject;
				T result = caseImmunizationRecommendationRecommendationProtocol(immunizationRecommendationRecommendationProtocol);
				if (result == null) result = caseBackboneElement(immunizationRecommendationRecommendationProtocol);
				if (result == null) result = caseDataType(immunizationRecommendationRecommendationProtocol);
				if (result == null) result = caseElement(immunizationRecommendationRecommendationProtocol);
				if (result == null) result = caseBase(immunizationRecommendationRecommendationProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION: {
				Immunization immunization = (Immunization)theEObject;
				T result = caseImmunization(immunization);
				if (result == null) result = caseDomainResource(immunization);
				if (result == null) result = caseResource(immunization);
				if (result == null) result = caseBase(immunization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_EXPLANATION: {
				ImmunizationExplanation immunizationExplanation = (ImmunizationExplanation)theEObject;
				T result = caseImmunizationExplanation(immunizationExplanation);
				if (result == null) result = caseBackboneElement(immunizationExplanation);
				if (result == null) result = caseDataType(immunizationExplanation);
				if (result == null) result = caseElement(immunizationExplanation);
				if (result == null) result = caseBase(immunizationExplanation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_REACTION: {
				ImmunizationReaction immunizationReaction = (ImmunizationReaction)theEObject;
				T result = caseImmunizationReaction(immunizationReaction);
				if (result == null) result = caseBackboneElement(immunizationReaction);
				if (result == null) result = caseDataType(immunizationReaction);
				if (result == null) result = caseElement(immunizationReaction);
				if (result == null) result = caseBase(immunizationReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_VACCINATION_PROTOCOL: {
				ImmunizationVaccinationProtocol immunizationVaccinationProtocol = (ImmunizationVaccinationProtocol)theEObject;
				T result = caseImmunizationVaccinationProtocol(immunizationVaccinationProtocol);
				if (result == null) result = caseBackboneElement(immunizationVaccinationProtocol);
				if (result == null) result = caseDataType(immunizationVaccinationProtocol);
				if (result == null) result = caseElement(immunizationVaccinationProtocol);
				if (result == null) result = caseBase(immunizationVaccinationProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BUNDLE: {
				Bundle bundle = (Bundle)theEObject;
				T result = caseBundle(bundle);
				if (result == null) result = caseResource(bundle);
				if (result == null) result = caseBase(bundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BUNDLE_LINK: {
				BundleLink bundleLink = (BundleLink)theEObject;
				T result = caseBundleLink(bundleLink);
				if (result == null) result = caseBackboneElement(bundleLink);
				if (result == null) result = caseDataType(bundleLink);
				if (result == null) result = caseElement(bundleLink);
				if (result == null) result = caseBase(bundleLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BUNDLE_ENTRY: {
				BundleEntry bundleEntry = (BundleEntry)theEObject;
				T result = caseBundleEntry(bundleEntry);
				if (result == null) result = caseBackboneElement(bundleEntry);
				if (result == null) result = caseDataType(bundleEntry);
				if (result == null) result = caseElement(bundleEntry);
				if (result == null) result = caseBase(bundleEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BUNDLE_ENTRY_SEARCH: {
				BundleEntrySearch bundleEntrySearch = (BundleEntrySearch)theEObject;
				T result = caseBundleEntrySearch(bundleEntrySearch);
				if (result == null) result = caseBackboneElement(bundleEntrySearch);
				if (result == null) result = caseDataType(bundleEntrySearch);
				if (result == null) result = caseElement(bundleEntrySearch);
				if (result == null) result = caseBase(bundleEntrySearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST: {
				BundleEntryRequest bundleEntryRequest = (BundleEntryRequest)theEObject;
				T result = caseBundleEntryRequest(bundleEntryRequest);
				if (result == null) result = caseBackboneElement(bundleEntryRequest);
				if (result == null) result = caseDataType(bundleEntryRequest);
				if (result == null) result = caseElement(bundleEntryRequest);
				if (result == null) result = caseBase(bundleEntryRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BUNDLE_ENTRY_RESPONSE: {
				BundleEntryResponse bundleEntryResponse = (BundleEntryResponse)theEObject;
				T result = caseBundleEntryResponse(bundleEntryResponse);
				if (result == null) result = caseBackboneElement(bundleEntryResponse);
				if (result == null) result = caseDataType(bundleEntryResponse);
				if (result == null) result = caseElement(bundleEntryResponse);
				if (result == null) result = caseBase(bundleEntryResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT: {
				TestReport testReport = (TestReport)theEObject;
				T result = caseTestReport(testReport);
				if (result == null) result = caseDomainResource(testReport);
				if (result == null) result = caseResource(testReport);
				if (result == null) result = caseBase(testReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_PARTICIPANT: {
				TestReportParticipant testReportParticipant = (TestReportParticipant)theEObject;
				T result = caseTestReportParticipant(testReportParticipant);
				if (result == null) result = caseBackboneElement(testReportParticipant);
				if (result == null) result = caseDataType(testReportParticipant);
				if (result == null) result = caseElement(testReportParticipant);
				if (result == null) result = caseBase(testReportParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_SETUP: {
				TestReportSetup testReportSetup = (TestReportSetup)theEObject;
				T result = caseTestReportSetup(testReportSetup);
				if (result == null) result = caseBackboneElement(testReportSetup);
				if (result == null) result = caseDataType(testReportSetup);
				if (result == null) result = caseElement(testReportSetup);
				if (result == null) result = caseBase(testReportSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION: {
				TestReportSetupSetupAction testReportSetupSetupAction = (TestReportSetupSetupAction)theEObject;
				T result = caseTestReportSetupSetupAction(testReportSetupSetupAction);
				if (result == null) result = caseBackboneElement(testReportSetupSetupAction);
				if (result == null) result = caseDataType(testReportSetupSetupAction);
				if (result == null) result = caseElement(testReportSetupSetupAction);
				if (result == null) result = caseBase(testReportSetupSetupAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_OPERATION: {
				TestReportSetupSetupActionOperation testReportSetupSetupActionOperation = (TestReportSetupSetupActionOperation)theEObject;
				T result = caseTestReportSetupSetupActionOperation(testReportSetupSetupActionOperation);
				if (result == null) result = caseBackboneElement(testReportSetupSetupActionOperation);
				if (result == null) result = caseDataType(testReportSetupSetupActionOperation);
				if (result == null) result = caseElement(testReportSetupSetupActionOperation);
				if (result == null) result = caseBase(testReportSetupSetupActionOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT: {
				TestReportSetupSetupActionAssert testReportSetupSetupActionAssert = (TestReportSetupSetupActionAssert)theEObject;
				T result = caseTestReportSetupSetupActionAssert(testReportSetupSetupActionAssert);
				if (result == null) result = caseBackboneElement(testReportSetupSetupActionAssert);
				if (result == null) result = caseDataType(testReportSetupSetupActionAssert);
				if (result == null) result = caseElement(testReportSetupSetupActionAssert);
				if (result == null) result = caseBase(testReportSetupSetupActionAssert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_TEST: {
				TestReportTest testReportTest = (TestReportTest)theEObject;
				T result = caseTestReportTest(testReportTest);
				if (result == null) result = caseBackboneElement(testReportTest);
				if (result == null) result = caseDataType(testReportTest);
				if (result == null) result = caseElement(testReportTest);
				if (result == null) result = caseBase(testReportTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION: {
				TestReportTestTestAction testReportTestTestAction = (TestReportTestTestAction)theEObject;
				T result = caseTestReportTestTestAction(testReportTestTestAction);
				if (result == null) result = caseBackboneElement(testReportTestTestAction);
				if (result == null) result = caseDataType(testReportTestTestAction);
				if (result == null) result = caseElement(testReportTestTestAction);
				if (result == null) result = caseBase(testReportTestTestAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_TEARDOWN: {
				TestReportTeardown testReportTeardown = (TestReportTeardown)theEObject;
				T result = caseTestReportTeardown(testReportTeardown);
				if (result == null) result = caseBackboneElement(testReportTeardown);
				if (result == null) result = caseDataType(testReportTeardown);
				if (result == null) result = caseElement(testReportTeardown);
				if (result == null) result = caseBase(testReportTeardown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_TEARDOWN_TEARDOWN_ACTION: {
				TestReportTeardownTeardownAction testReportTeardownTeardownAction = (TestReportTeardownTeardownAction)theEObject;
				T result = caseTestReportTeardownTeardownAction(testReportTeardownTeardownAction);
				if (result == null) result = caseBackboneElement(testReportTeardownTeardownAction);
				if (result == null) result = caseDataType(testReportTeardownTeardownAction);
				if (result == null) result = caseElement(testReportTeardownTeardownAction);
				if (result == null) result = caseBase(testReportTeardownTeardownAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ELIGIBILITY_RESPONSE: {
				EligibilityResponse eligibilityResponse = (EligibilityResponse)theEObject;
				T result = caseEligibilityResponse(eligibilityResponse);
				if (result == null) result = caseDomainResource(eligibilityResponse);
				if (result == null) result = caseResource(eligibilityResponse);
				if (result == null) result = caseBase(eligibilityResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ELIGIBILITY_REQUEST: {
				EligibilityRequest eligibilityRequest = (EligibilityRequest)theEObject;
				T result = caseEligibilityRequest(eligibilityRequest);
				if (result == null) result = caseDomainResource(eligibilityRequest);
				if (result == null) result = caseResource(eligibilityRequest);
				if (result == null) result = caseBase(eligibilityRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE: {
				EligibilityResponseInsurance eligibilityResponseInsurance = (EligibilityResponseInsurance)theEObject;
				T result = caseEligibilityResponseInsurance(eligibilityResponseInsurance);
				if (result == null) result = caseBackboneElement(eligibilityResponseInsurance);
				if (result == null) result = caseDataType(eligibilityResponseInsurance);
				if (result == null) result = caseElement(eligibilityResponseInsurance);
				if (result == null) result = caseBase(eligibilityResponseInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS: {
				EligibilityResponseInsuranceBenefits eligibilityResponseInsuranceBenefits = (EligibilityResponseInsuranceBenefits)theEObject;
				T result = caseEligibilityResponseInsuranceBenefits(eligibilityResponseInsuranceBenefits);
				if (result == null) result = caseBackboneElement(eligibilityResponseInsuranceBenefits);
				if (result == null) result = caseDataType(eligibilityResponseInsuranceBenefits);
				if (result == null) result = caseElement(eligibilityResponseInsuranceBenefits);
				if (result == null) result = caseBase(eligibilityResponseInsuranceBenefits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ELIGIBILITY_RESPONSE_INSURANCE_BENEFITS_BENEFIT: {
				EligibilityResponseInsuranceBenefitsBenefit eligibilityResponseInsuranceBenefitsBenefit = (EligibilityResponseInsuranceBenefitsBenefit)theEObject;
				T result = caseEligibilityResponseInsuranceBenefitsBenefit(eligibilityResponseInsuranceBenefitsBenefit);
				if (result == null) result = caseBackboneElement(eligibilityResponseInsuranceBenefitsBenefit);
				if (result == null) result = caseDataType(eligibilityResponseInsuranceBenefitsBenefit);
				if (result == null) result = caseElement(eligibilityResponseInsuranceBenefitsBenefit);
				if (result == null) result = caseBase(eligibilityResponseInsuranceBenefitsBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ELIGIBILITY_RESPONSE_ERRORS: {
				EligibilityResponseErrors eligibilityResponseErrors = (EligibilityResponseErrors)theEObject;
				T result = caseEligibilityResponseErrors(eligibilityResponseErrors);
				if (result == null) result = caseBackboneElement(eligibilityResponseErrors);
				if (result == null) result = caseDataType(eligibilityResponseErrors);
				if (result == null) result = caseElement(eligibilityResponseErrors);
				if (result == null) result = caseBase(eligibilityResponseErrors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PARAMETERS: {
				Parameters parameters = (Parameters)theEObject;
				T result = caseParameters(parameters);
				if (result == null) result = caseResource(parameters);
				if (result == null) result = caseBase(parameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PARAMETERS_PARAMETER: {
				ParametersParameter parametersParameter = (ParametersParameter)theEObject;
				T result = caseParametersParameter(parametersParameter);
				if (result == null) result = caseBackboneElement(parametersParameter);
				if (result == null) result = caseDataType(parametersParameter);
				if (result == null) result = caseElement(parametersParameter);
				if (result == null) result = caseBase(parametersParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_DISPENSE: {
				MedicationDispense medicationDispense = (MedicationDispense)theEObject;
				T result = caseMedicationDispense(medicationDispense);
				if (result == null) result = caseDomainResource(medicationDispense);
				if (result == null) result = caseResource(medicationDispense);
				if (result == null) result = caseBase(medicationDispense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION: {
				MedicationDispenseSubstitution medicationDispenseSubstitution = (MedicationDispenseSubstitution)theEObject;
				T result = caseMedicationDispenseSubstitution(medicationDispenseSubstitution);
				if (result == null) result = caseBackboneElement(medicationDispenseSubstitution);
				if (result == null) result = caseDataType(medicationDispenseSubstitution);
				if (result == null) result = caseElement(medicationDispenseSubstitution);
				if (result == null) result = caseBase(medicationDispenseSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT: {
				MeasureReport measureReport = (MeasureReport)theEObject;
				T result = caseMeasureReport(measureReport);
				if (result == null) result = caseDomainResource(measureReport);
				if (result == null) result = caseResource(measureReport);
				if (result == null) result = caseBase(measureReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE: {
				Measure measure = (Measure)theEObject;
				T result = caseMeasure(measure);
				if (result == null) result = caseDomainResource(measure);
				if (result == null) result = caseResource(measure);
				if (result == null) result = caseBase(measure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_GROUP: {
				MeasureGroup measureGroup = (MeasureGroup)theEObject;
				T result = caseMeasureGroup(measureGroup);
				if (result == null) result = caseBackboneElement(measureGroup);
				if (result == null) result = caseDataType(measureGroup);
				if (result == null) result = caseElement(measureGroup);
				if (result == null) result = caseBase(measureGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_GROUP_POPULATION: {
				MeasureGroupPopulation measureGroupPopulation = (MeasureGroupPopulation)theEObject;
				T result = caseMeasureGroupPopulation(measureGroupPopulation);
				if (result == null) result = caseBackboneElement(measureGroupPopulation);
				if (result == null) result = caseDataType(measureGroupPopulation);
				if (result == null) result = caseElement(measureGroupPopulation);
				if (result == null) result = caseBase(measureGroupPopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_GROUP_STRATIFIER: {
				MeasureGroupStratifier measureGroupStratifier = (MeasureGroupStratifier)theEObject;
				T result = caseMeasureGroupStratifier(measureGroupStratifier);
				if (result == null) result = caseBackboneElement(measureGroupStratifier);
				if (result == null) result = caseDataType(measureGroupStratifier);
				if (result == null) result = caseElement(measureGroupStratifier);
				if (result == null) result = caseBase(measureGroupStratifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA: {
				MeasureSupplementalData measureSupplementalData = (MeasureSupplementalData)theEObject;
				T result = caseMeasureSupplementalData(measureSupplementalData);
				if (result == null) result = caseBackboneElement(measureSupplementalData);
				if (result == null) result = caseDataType(measureSupplementalData);
				if (result == null) result = caseElement(measureSupplementalData);
				if (result == null) result = caseBase(measureSupplementalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT_GROUP: {
				MeasureReportGroup measureReportGroup = (MeasureReportGroup)theEObject;
				T result = caseMeasureReportGroup(measureReportGroup);
				if (result == null) result = caseBackboneElement(measureReportGroup);
				if (result == null) result = caseDataType(measureReportGroup);
				if (result == null) result = caseElement(measureReportGroup);
				if (result == null) result = caseBase(measureReportGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT_GROUP_POPULATION: {
				MeasureReportGroupPopulation measureReportGroupPopulation = (MeasureReportGroupPopulation)theEObject;
				T result = caseMeasureReportGroupPopulation(measureReportGroupPopulation);
				if (result == null) result = caseBackboneElement(measureReportGroupPopulation);
				if (result == null) result = caseDataType(measureReportGroupPopulation);
				if (result == null) result = caseElement(measureReportGroupPopulation);
				if (result == null) result = caseBase(measureReportGroupPopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseDomainResource(list);
				if (result == null) result = caseResource(list);
				if (result == null) result = caseBase(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LIST_ENTRY: {
				ListEntry listEntry = (ListEntry)theEObject;
				T result = caseListEntry(listEntry);
				if (result == null) result = caseBackboneElement(listEntry);
				if (result == null) result = caseDataType(listEntry);
				if (result == null) result = caseElement(listEntry);
				if (result == null) result = caseBase(listEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER: {
				MeasureReportGroupStratifier measureReportGroupStratifier = (MeasureReportGroupStratifier)theEObject;
				T result = caseMeasureReportGroupStratifier(measureReportGroupStratifier);
				if (result == null) result = caseBackboneElement(measureReportGroupStratifier);
				if (result == null) result = caseDataType(measureReportGroupStratifier);
				if (result == null) result = caseElement(measureReportGroupStratifier);
				if (result == null) result = caseBase(measureReportGroupStratifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP: {
				MeasureReportGroupStratifierStratifierGroup measureReportGroupStratifierStratifierGroup = (MeasureReportGroupStratifierStratifierGroup)theEObject;
				T result = caseMeasureReportGroupStratifierStratifierGroup(measureReportGroupStratifierStratifierGroup);
				if (result == null) result = caseBackboneElement(measureReportGroupStratifierStratifierGroup);
				if (result == null) result = caseDataType(measureReportGroupStratifierStratifierGroup);
				if (result == null) result = caseElement(measureReportGroupStratifierStratifierGroup);
				if (result == null) result = caseBase(measureReportGroupStratifierStratifierGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION: {
				MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation measureReportGroupStratifierStratifierGroupStratifierGroupPopulation = (MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation)theEObject;
				T result = caseMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation(measureReportGroupStratifierStratifierGroupStratifierGroupPopulation);
				if (result == null) result = caseBackboneElement(measureReportGroupStratifierStratifierGroupStratifierGroupPopulation);
				if (result == null) result = caseDataType(measureReportGroupStratifierStratifierGroupStratifierGroupPopulation);
				if (result == null) result = caseElement(measureReportGroupStratifierStratifierGroupStratifierGroupPopulation);
				if (result == null) result = caseBase(measureReportGroupStratifierStratifierGroupStratifierGroupPopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA: {
				MeasureReportGroupSupplementalData measureReportGroupSupplementalData = (MeasureReportGroupSupplementalData)theEObject;
				T result = caseMeasureReportGroupSupplementalData(measureReportGroupSupplementalData);
				if (result == null) result = caseBackboneElement(measureReportGroupSupplementalData);
				if (result == null) result = caseDataType(measureReportGroupSupplementalData);
				if (result == null) result = caseElement(measureReportGroupSupplementalData);
				if (result == null) result = caseBase(measureReportGroupSupplementalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT_GROUP_SUPPLEMENTAL_DATA_SUPPLEMENTAL_DATA_GROUP: {
				MeasureReportGroupSupplementalDataSupplementalDataGroup measureReportGroupSupplementalDataSupplementalDataGroup = (MeasureReportGroupSupplementalDataSupplementalDataGroup)theEObject;
				T result = caseMeasureReportGroupSupplementalDataSupplementalDataGroup(measureReportGroupSupplementalDataSupplementalDataGroup);
				if (result == null) result = caseBackboneElement(measureReportGroupSupplementalDataSupplementalDataGroup);
				if (result == null) result = caseDataType(measureReportGroupSupplementalDataSupplementalDataGroup);
				if (result == null) result = caseElement(measureReportGroupSupplementalDataSupplementalDataGroup);
				if (result == null) result = caseBase(measureReportGroupSupplementalDataSupplementalDataGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE: {
				ClaimResponse claimResponse = (ClaimResponse)theEObject;
				T result = caseClaimResponse(claimResponse);
				if (result == null) result = caseDomainResource(claimResponse);
				if (result == null) result = caseResource(claimResponse);
				if (result == null) result = caseBase(claimResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM: {
				Claim claim = (Claim)theEObject;
				T result = caseClaim(claim);
				if (result == null) result = caseDomainResource(claim);
				if (result == null) result = caseResource(claim);
				if (result == null) result = caseBase(claim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RELATED_CLAIM: {
				ClaimRelatedClaim claimRelatedClaim = (ClaimRelatedClaim)theEObject;
				T result = caseClaimRelatedClaim(claimRelatedClaim);
				if (result == null) result = caseBackboneElement(claimRelatedClaim);
				if (result == null) result = caseDataType(claimRelatedClaim);
				if (result == null) result = caseElement(claimRelatedClaim);
				if (result == null) result = caseBase(claimRelatedClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_PAYEE: {
				ClaimPayee claimPayee = (ClaimPayee)theEObject;
				T result = caseClaimPayee(claimPayee);
				if (result == null) result = caseBackboneElement(claimPayee);
				if (result == null) result = caseDataType(claimPayee);
				if (result == null) result = caseElement(claimPayee);
				if (result == null) result = caseBase(claimPayee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_CARE_TEAM: {
				ClaimCareTeam claimCareTeam = (ClaimCareTeam)theEObject;
				T result = caseClaimCareTeam(claimCareTeam);
				if (result == null) result = caseBackboneElement(claimCareTeam);
				if (result == null) result = caseDataType(claimCareTeam);
				if (result == null) result = caseElement(claimCareTeam);
				if (result == null) result = caseBase(claimCareTeam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_SPECIAL_CONDITION: {
				ClaimSpecialCondition claimSpecialCondition = (ClaimSpecialCondition)theEObject;
				T result = caseClaimSpecialCondition(claimSpecialCondition);
				if (result == null) result = caseBackboneElement(claimSpecialCondition);
				if (result == null) result = caseDataType(claimSpecialCondition);
				if (result == null) result = caseElement(claimSpecialCondition);
				if (result == null) result = caseBase(claimSpecialCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_DIAGNOSIS: {
				ClaimDiagnosis claimDiagnosis = (ClaimDiagnosis)theEObject;
				T result = caseClaimDiagnosis(claimDiagnosis);
				if (result == null) result = caseBackboneElement(claimDiagnosis);
				if (result == null) result = caseDataType(claimDiagnosis);
				if (result == null) result = caseElement(claimDiagnosis);
				if (result == null) result = caseBase(claimDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_PROCEDURE: {
				ClaimProcedure claimProcedure = (ClaimProcedure)theEObject;
				T result = caseClaimProcedure(claimProcedure);
				if (result == null) result = caseBackboneElement(claimProcedure);
				if (result == null) result = caseDataType(claimProcedure);
				if (result == null) result = caseElement(claimProcedure);
				if (result == null) result = caseBase(claimProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_INSURANCE: {
				ClaimInsurance claimInsurance = (ClaimInsurance)theEObject;
				T result = caseClaimInsurance(claimInsurance);
				if (result == null) result = caseBackboneElement(claimInsurance);
				if (result == null) result = caseDataType(claimInsurance);
				if (result == null) result = caseElement(claimInsurance);
				if (result == null) result = caseBase(claimInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_ACCIDENT: {
				ClaimAccident claimAccident = (ClaimAccident)theEObject;
				T result = caseClaimAccident(claimAccident);
				if (result == null) result = caseBackboneElement(claimAccident);
				if (result == null) result = caseDataType(claimAccident);
				if (result == null) result = caseElement(claimAccident);
				if (result == null) result = caseBase(claimAccident);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_ITEM: {
				ClaimItem claimItem = (ClaimItem)theEObject;
				T result = caseClaimItem(claimItem);
				if (result == null) result = caseBackboneElement(claimItem);
				if (result == null) result = caseDataType(claimItem);
				if (result == null) result = caseElement(claimItem);
				if (result == null) result = caseBase(claimItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_ITEM_DETAIL: {
				ClaimItemDetail claimItemDetail = (ClaimItemDetail)theEObject;
				T result = caseClaimItemDetail(claimItemDetail);
				if (result == null) result = caseBackboneElement(claimItemDetail);
				if (result == null) result = caseDataType(claimItemDetail);
				if (result == null) result = caseElement(claimItemDetail);
				if (result == null) result = caseBase(claimItemDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_ITEM_DETAIL_SUB_DETAIL: {
				ClaimItemDetailSubDetail claimItemDetailSubDetail = (ClaimItemDetailSubDetail)theEObject;
				T result = caseClaimItemDetailSubDetail(claimItemDetailSubDetail);
				if (result == null) result = caseBackboneElement(claimItemDetailSubDetail);
				if (result == null) result = caseDataType(claimItemDetailSubDetail);
				if (result == null) result = caseElement(claimItemDetailSubDetail);
				if (result == null) result = caseBase(claimItemDetailSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS: {
				ClaimItemProsthesis claimItemProsthesis = (ClaimItemProsthesis)theEObject;
				T result = caseClaimItemProsthesis(claimItemProsthesis);
				if (result == null) result = caseBackboneElement(claimItemProsthesis);
				if (result == null) result = caseDataType(claimItemProsthesis);
				if (result == null) result = caseElement(claimItemProsthesis);
				if (result == null) result = caseBase(claimItemProsthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ITEM: {
				ClaimResponseItem claimResponseItem = (ClaimResponseItem)theEObject;
				T result = caseClaimResponseItem(claimResponseItem);
				if (result == null) result = caseBackboneElement(claimResponseItem);
				if (result == null) result = caseDataType(claimResponseItem);
				if (result == null) result = caseElement(claimResponseItem);
				if (result == null) result = caseBase(claimResponseItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ADJUDICATION: {
				ClaimResponseItemAdjudication claimResponseItemAdjudication = (ClaimResponseItemAdjudication)theEObject;
				T result = caseClaimResponseItemAdjudication(claimResponseItemAdjudication);
				if (result == null) result = caseBackboneElement(claimResponseItemAdjudication);
				if (result == null) result = caseDataType(claimResponseItemAdjudication);
				if (result == null) result = caseElement(claimResponseItemAdjudication);
				if (result == null) result = caseBase(claimResponseItemAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL: {
				ClaimResponseItemItemDetail claimResponseItemItemDetail = (ClaimResponseItemItemDetail)theEObject;
				T result = caseClaimResponseItemItemDetail(claimResponseItemItemDetail);
				if (result == null) result = caseBackboneElement(claimResponseItemItemDetail);
				if (result == null) result = caseDataType(claimResponseItemItemDetail);
				if (result == null) result = caseElement(claimResponseItemItemDetail);
				if (result == null) result = caseBase(claimResponseItemItemDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL_SUB_DETAIL: {
				ClaimResponseItemItemDetailSubDetail claimResponseItemItemDetailSubDetail = (ClaimResponseItemItemDetailSubDetail)theEObject;
				T result = caseClaimResponseItemItemDetailSubDetail(claimResponseItemItemDetailSubDetail);
				if (result == null) result = caseBackboneElement(claimResponseItemItemDetailSubDetail);
				if (result == null) result = caseDataType(claimResponseItemItemDetailSubDetail);
				if (result == null) result = caseElement(claimResponseItemItemDetailSubDetail);
				if (result == null) result = caseBase(claimResponseItemItemDetailSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM: {
				ClaimResponseAddedItem claimResponseAddedItem = (ClaimResponseAddedItem)theEObject;
				T result = caseClaimResponseAddedItem(claimResponseAddedItem);
				if (result == null) result = caseBackboneElement(claimResponseAddedItem);
				if (result == null) result = caseDataType(claimResponseAddedItem);
				if (result == null) result = caseElement(claimResponseAddedItem);
				if (result == null) result = caseBase(claimResponseAddedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM_ADDED_ITEMS_DETAIL: {
				ClaimResponseAddedItemAddedItemsDetail claimResponseAddedItemAddedItemsDetail = (ClaimResponseAddedItemAddedItemsDetail)theEObject;
				T result = caseClaimResponseAddedItemAddedItemsDetail(claimResponseAddedItemAddedItemsDetail);
				if (result == null) result = caseBackboneElement(claimResponseAddedItemAddedItemsDetail);
				if (result == null) result = caseDataType(claimResponseAddedItemAddedItemsDetail);
				if (result == null) result = caseElement(claimResponseAddedItemAddedItemsDetail);
				if (result == null) result = caseBase(claimResponseAddedItemAddedItemsDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ERROR: {
				ClaimResponseError claimResponseError = (ClaimResponseError)theEObject;
				T result = caseClaimResponseError(claimResponseError);
				if (result == null) result = caseBackboneElement(claimResponseError);
				if (result == null) result = caseDataType(claimResponseError);
				if (result == null) result = caseElement(claimResponseError);
				if (result == null) result = caseBase(claimResponseError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_PAYMENT: {
				ClaimResponsePayment claimResponsePayment = (ClaimResponsePayment)theEObject;
				T result = caseClaimResponsePayment(claimResponsePayment);
				if (result == null) result = caseBackboneElement(claimResponsePayment);
				if (result == null) result = caseDataType(claimResponsePayment);
				if (result == null) result = caseElement(claimResponsePayment);
				if (result == null) result = caseBase(claimResponsePayment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_NOTE: {
				ClaimResponseNote claimResponseNote = (ClaimResponseNote)theEObject;
				T result = caseClaimResponseNote(claimResponseNote);
				if (result == null) result = caseBackboneElement(claimResponseNote);
				if (result == null) result = caseDataType(claimResponseNote);
				if (result == null) result = caseElement(claimResponseNote);
				if (result == null) result = caseBase(claimResponseNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE: {
				ClaimResponseInsurance claimResponseInsurance = (ClaimResponseInsurance)theEObject;
				T result = caseClaimResponseInsurance(claimResponseInsurance);
				if (result == null) result = caseBackboneElement(claimResponseInsurance);
				if (result == null) result = caseDataType(claimResponseInsurance);
				if (result == null) result = caseElement(claimResponseInsurance);
				if (result == null) result = caseBase(claimResponseInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseDomainResource(task);
				if (result == null) result = caseResource(task);
				if (result == null) result = caseBase(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TASK_REQUESTER: {
				TaskRequester taskRequester = (TaskRequester)theEObject;
				T result = caseTaskRequester(taskRequester);
				if (result == null) result = caseBackboneElement(taskRequester);
				if (result == null) result = caseDataType(taskRequester);
				if (result == null) result = caseElement(taskRequester);
				if (result == null) result = caseBase(taskRequester);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TASK_RESTRICTION: {
				TaskRestriction taskRestriction = (TaskRestriction)theEObject;
				T result = caseTaskRestriction(taskRestriction);
				if (result == null) result = caseBackboneElement(taskRestriction);
				if (result == null) result = caseDataType(taskRestriction);
				if (result == null) result = caseElement(taskRestriction);
				if (result == null) result = caseBase(taskRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TASK_PARAMETER: {
				TaskParameter taskParameter = (TaskParameter)theEObject;
				T result = caseTaskParameter(taskParameter);
				if (result == null) result = caseBackboneElement(taskParameter);
				if (result == null) result = caseDataType(taskParameter);
				if (result == null) result = caseElement(taskParameter);
				if (result == null) result = caseBase(taskParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TASK_OUTPUT: {
				TaskOutput taskOutput = (TaskOutput)theEObject;
				T result = caseTaskOutput(taskOutput);
				if (result == null) result = caseBackboneElement(taskOutput);
				if (result == null) result = caseDataType(taskOutput);
				if (result == null) result = caseElement(taskOutput);
				if (result == null) result = caseBase(taskOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT: {
				ExplanationOfBenefit explanationOfBenefit = (ExplanationOfBenefit)theEObject;
				T result = caseExplanationOfBenefit(explanationOfBenefit);
				if (result == null) result = caseDomainResource(explanationOfBenefit);
				if (result == null) result = caseResource(explanationOfBenefit);
				if (result == null) result = caseBase(explanationOfBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_RELATED_CLAIM: {
				ExplanationOfBenefitRelatedClaim explanationOfBenefitRelatedClaim = (ExplanationOfBenefitRelatedClaim)theEObject;
				T result = caseExplanationOfBenefitRelatedClaim(explanationOfBenefitRelatedClaim);
				if (result == null) result = caseBackboneElement(explanationOfBenefitRelatedClaim);
				if (result == null) result = caseDataType(explanationOfBenefitRelatedClaim);
				if (result == null) result = caseElement(explanationOfBenefitRelatedClaim);
				if (result == null) result = caseBase(explanationOfBenefitRelatedClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PAYEE: {
				ExplanationOfBenefitPayee explanationOfBenefitPayee = (ExplanationOfBenefitPayee)theEObject;
				T result = caseExplanationOfBenefitPayee(explanationOfBenefitPayee);
				if (result == null) result = caseBackboneElement(explanationOfBenefitPayee);
				if (result == null) result = caseDataType(explanationOfBenefitPayee);
				if (result == null) result = caseElement(explanationOfBenefitPayee);
				if (result == null) result = caseBase(explanationOfBenefitPayee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_SUPPORTING_INFORMATION: {
				ExplanationOfBenefitSupportingInformation explanationOfBenefitSupportingInformation = (ExplanationOfBenefitSupportingInformation)theEObject;
				T result = caseExplanationOfBenefitSupportingInformation(explanationOfBenefitSupportingInformation);
				if (result == null) result = caseBackboneElement(explanationOfBenefitSupportingInformation);
				if (result == null) result = caseDataType(explanationOfBenefitSupportingInformation);
				if (result == null) result = caseElement(explanationOfBenefitSupportingInformation);
				if (result == null) result = caseBase(explanationOfBenefitSupportingInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM: {
				ExplanationOfBenefitCareTeam explanationOfBenefitCareTeam = (ExplanationOfBenefitCareTeam)theEObject;
				T result = caseExplanationOfBenefitCareTeam(explanationOfBenefitCareTeam);
				if (result == null) result = caseBackboneElement(explanationOfBenefitCareTeam);
				if (result == null) result = caseDataType(explanationOfBenefitCareTeam);
				if (result == null) result = caseElement(explanationOfBenefitCareTeam);
				if (result == null) result = caseBase(explanationOfBenefitCareTeam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS: {
				ExplanationOfBenefitDiagnosis explanationOfBenefitDiagnosis = (ExplanationOfBenefitDiagnosis)theEObject;
				T result = caseExplanationOfBenefitDiagnosis(explanationOfBenefitDiagnosis);
				if (result == null) result = caseBackboneElement(explanationOfBenefitDiagnosis);
				if (result == null) result = caseDataType(explanationOfBenefitDiagnosis);
				if (result == null) result = caseElement(explanationOfBenefitDiagnosis);
				if (result == null) result = caseBase(explanationOfBenefitDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE: {
				ExplanationOfBenefitProcedure explanationOfBenefitProcedure = (ExplanationOfBenefitProcedure)theEObject;
				T result = caseExplanationOfBenefitProcedure(explanationOfBenefitProcedure);
				if (result == null) result = caseBackboneElement(explanationOfBenefitProcedure);
				if (result == null) result = caseDataType(explanationOfBenefitProcedure);
				if (result == null) result = caseElement(explanationOfBenefitProcedure);
				if (result == null) result = caseBase(explanationOfBenefitProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE: {
				ExplanationOfBenefitInsurance explanationOfBenefitInsurance = (ExplanationOfBenefitInsurance)theEObject;
				T result = caseExplanationOfBenefitInsurance(explanationOfBenefitInsurance);
				if (result == null) result = caseBackboneElement(explanationOfBenefitInsurance);
				if (result == null) result = caseDataType(explanationOfBenefitInsurance);
				if (result == null) result = caseElement(explanationOfBenefitInsurance);
				if (result == null) result = caseBase(explanationOfBenefitInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ACCIDENT: {
				ExplanationOfBenefitAccident explanationOfBenefitAccident = (ExplanationOfBenefitAccident)theEObject;
				T result = caseExplanationOfBenefitAccident(explanationOfBenefitAccident);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAccident);
				if (result == null) result = caseDataType(explanationOfBenefitAccident);
				if (result == null) result = caseElement(explanationOfBenefitAccident);
				if (result == null) result = caseBase(explanationOfBenefitAccident);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM: {
				ExplanationOfBenefitItem explanationOfBenefitItem = (ExplanationOfBenefitItem)theEObject;
				T result = caseExplanationOfBenefitItem(explanationOfBenefitItem);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItem);
				if (result == null) result = caseDataType(explanationOfBenefitItem);
				if (result == null) result = caseElement(explanationOfBenefitItem);
				if (result == null) result = caseBase(explanationOfBenefitItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_ADJUDICATION: {
				ExplanationOfBenefitItemAdjudication explanationOfBenefitItemAdjudication = (ExplanationOfBenefitItemAdjudication)theEObject;
				T result = caseExplanationOfBenefitItemAdjudication(explanationOfBenefitItemAdjudication);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItemAdjudication);
				if (result == null) result = caseDataType(explanationOfBenefitItemAdjudication);
				if (result == null) result = caseElement(explanationOfBenefitItemAdjudication);
				if (result == null) result = caseBase(explanationOfBenefitItemAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL: {
				ExplanationOfBenefitItemDetail explanationOfBenefitItemDetail = (ExplanationOfBenefitItemDetail)theEObject;
				T result = caseExplanationOfBenefitItemDetail(explanationOfBenefitItemDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItemDetail);
				if (result == null) result = caseDataType(explanationOfBenefitItemDetail);
				if (result == null) result = caseElement(explanationOfBenefitItemDetail);
				if (result == null) result = caseBase(explanationOfBenefitItemDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL_SUB_DETAIL: {
				ExplanationOfBenefitItemDetailSubDetail explanationOfBenefitItemDetailSubDetail = (ExplanationOfBenefitItemDetailSubDetail)theEObject;
				T result = caseExplanationOfBenefitItemDetailSubDetail(explanationOfBenefitItemDetailSubDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItemDetailSubDetail);
				if (result == null) result = caseDataType(explanationOfBenefitItemDetailSubDetail);
				if (result == null) result = caseElement(explanationOfBenefitItemDetailSubDetail);
				if (result == null) result = caseBase(explanationOfBenefitItemDetailSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_PROSTHESIS: {
				ExplanationOfBenefitItemProsthesis explanationOfBenefitItemProsthesis = (ExplanationOfBenefitItemProsthesis)theEObject;
				T result = caseExplanationOfBenefitItemProsthesis(explanationOfBenefitItemProsthesis);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItemProsthesis);
				if (result == null) result = caseDataType(explanationOfBenefitItemProsthesis);
				if (result == null) result = caseElement(explanationOfBenefitItemProsthesis);
				if (result == null) result = caseBase(explanationOfBenefitItemProsthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM: {
				ExplanationOfBenefitAddedItem explanationOfBenefitAddedItem = (ExplanationOfBenefitAddedItem)theEObject;
				T result = caseExplanationOfBenefitAddedItem(explanationOfBenefitAddedItem);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAddedItem);
				if (result == null) result = caseDataType(explanationOfBenefitAddedItem);
				if (result == null) result = caseElement(explanationOfBenefitAddedItem);
				if (result == null) result = caseBase(explanationOfBenefitAddedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL: {
				ExplanationOfBenefitAddedItemAddedItemsDetail explanationOfBenefitAddedItemAddedItemsDetail = (ExplanationOfBenefitAddedItemAddedItemsDetail)theEObject;
				T result = caseExplanationOfBenefitAddedItemAddedItemsDetail(explanationOfBenefitAddedItemAddedItemsDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAddedItemAddedItemsDetail);
				if (result == null) result = caseDataType(explanationOfBenefitAddedItemAddedItemsDetail);
				if (result == null) result = caseElement(explanationOfBenefitAddedItemAddedItemsDetail);
				if (result == null) result = caseBase(explanationOfBenefitAddedItemAddedItemsDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PAYMENT: {
				ExplanationOfBenefitPayment explanationOfBenefitPayment = (ExplanationOfBenefitPayment)theEObject;
				T result = caseExplanationOfBenefitPayment(explanationOfBenefitPayment);
				if (result == null) result = caseBackboneElement(explanationOfBenefitPayment);
				if (result == null) result = caseDataType(explanationOfBenefitPayment);
				if (result == null) result = caseElement(explanationOfBenefitPayment);
				if (result == null) result = caseBase(explanationOfBenefitPayment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_NOTE: {
				ExplanationOfBenefitNote explanationOfBenefitNote = (ExplanationOfBenefitNote)theEObject;
				T result = caseExplanationOfBenefitNote(explanationOfBenefitNote);
				if (result == null) result = caseBackboneElement(explanationOfBenefitNote);
				if (result == null) result = caseDataType(explanationOfBenefitNote);
				if (result == null) result = caseElement(explanationOfBenefitNote);
				if (result == null) result = caseBase(explanationOfBenefitNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE: {
				ExplanationOfBenefitBenefitBalance explanationOfBenefitBenefitBalance = (ExplanationOfBenefitBenefitBalance)theEObject;
				T result = caseExplanationOfBenefitBenefitBalance(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseBackboneElement(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseDataType(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseElement(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseBase(explanationOfBenefitBenefitBalance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT: {
				ExplanationOfBenefitBenefitBalanceBenefit explanationOfBenefitBenefitBalanceBenefit = (ExplanationOfBenefitBenefitBalanceBenefit)theEObject;
				T result = caseExplanationOfBenefitBenefitBalanceBenefit(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = caseBackboneElement(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = caseDataType(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = caseElement(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = caseBase(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE: {
				ImplementationGuide implementationGuide = (ImplementationGuide)theEObject;
				T result = caseImplementationGuide(implementationGuide);
				if (result == null) result = caseDomainResource(implementationGuide);
				if (result == null) result = caseResource(implementationGuide);
				if (result == null) result = caseBase(implementationGuide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEPENDENCY: {
				ImplementationGuideDependency implementationGuideDependency = (ImplementationGuideDependency)theEObject;
				T result = caseImplementationGuideDependency(implementationGuideDependency);
				if (result == null) result = caseBackboneElement(implementationGuideDependency);
				if (result == null) result = caseDataType(implementationGuideDependency);
				if (result == null) result = caseElement(implementationGuideDependency);
				if (result == null) result = caseBase(implementationGuideDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE: {
				ImplementationGuidePackage implementationGuidePackage = (ImplementationGuidePackage)theEObject;
				T result = caseImplementationGuidePackage(implementationGuidePackage);
				if (result == null) result = caseBackboneElement(implementationGuidePackage);
				if (result == null) result = caseDataType(implementationGuidePackage);
				if (result == null) result = caseElement(implementationGuidePackage);
				if (result == null) result = caseBase(implementationGuidePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE: {
				ImplementationGuidePackageResource implementationGuidePackageResource = (ImplementationGuidePackageResource)theEObject;
				T result = caseImplementationGuidePackageResource(implementationGuidePackageResource);
				if (result == null) result = caseBackboneElement(implementationGuidePackageResource);
				if (result == null) result = caseDataType(implementationGuidePackageResource);
				if (result == null) result = caseElement(implementationGuidePackageResource);
				if (result == null) result = caseBase(implementationGuidePackageResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_GLOBAL: {
				ImplementationGuideGlobal implementationGuideGlobal = (ImplementationGuideGlobal)theEObject;
				T result = caseImplementationGuideGlobal(implementationGuideGlobal);
				if (result == null) result = caseBackboneElement(implementationGuideGlobal);
				if (result == null) result = caseDataType(implementationGuideGlobal);
				if (result == null) result = caseElement(implementationGuideGlobal);
				if (result == null) result = caseBase(implementationGuideGlobal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PAGE: {
				ImplementationGuidePage implementationGuidePage = (ImplementationGuidePage)theEObject;
				T result = caseImplementationGuidePage(implementationGuidePage);
				if (result == null) result = caseBackboneElement(implementationGuidePage);
				if (result == null) result = caseDataType(implementationGuidePage);
				if (result == null) result = caseElement(implementationGuidePage);
				if (result == null) result = caseBase(implementationGuidePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SEARCH_PARAMETER: {
				SearchParameter searchParameter = (SearchParameter)theEObject;
				T result = caseSearchParameter(searchParameter);
				if (result == null) result = caseDomainResource(searchParameter);
				if (result == null) result = caseResource(searchParameter);
				if (result == null) result = caseBase(searchParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SEARCH_PARAMETER_COMPONENT: {
				SearchParameterComponent searchParameterComponent = (SearchParameterComponent)theEObject;
				T result = caseSearchParameterComponent(searchParameterComponent);
				if (result == null) result = caseBackboneElement(searchParameterComponent);
				if (result == null) result = caseDataType(searchParameterComponent);
				if (result == null) result = caseElement(searchParameterComponent);
				if (result == null) result = caseBase(searchParameterComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPANSION_PROFILE: {
				ExpansionProfile expansionProfile = (ExpansionProfile)theEObject;
				T result = caseExpansionProfile(expansionProfile);
				if (result == null) result = caseDomainResource(expansionProfile);
				if (result == null) result = caseResource(expansionProfile);
				if (result == null) result = caseBase(expansionProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPANSION_PROFILE_FIXED_VERSION: {
				ExpansionProfileFixedVersion expansionProfileFixedVersion = (ExpansionProfileFixedVersion)theEObject;
				T result = caseExpansionProfileFixedVersion(expansionProfileFixedVersion);
				if (result == null) result = caseBackboneElement(expansionProfileFixedVersion);
				if (result == null) result = caseDataType(expansionProfileFixedVersion);
				if (result == null) result = caseElement(expansionProfileFixedVersion);
				if (result == null) result = caseBase(expansionProfileFixedVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPANSION_PROFILE_EXCLUDED_SYSTEM: {
				ExpansionProfileExcludedSystem expansionProfileExcludedSystem = (ExpansionProfileExcludedSystem)theEObject;
				T result = caseExpansionProfileExcludedSystem(expansionProfileExcludedSystem);
				if (result == null) result = caseBackboneElement(expansionProfileExcludedSystem);
				if (result == null) result = caseDataType(expansionProfileExcludedSystem);
				if (result == null) result = caseElement(expansionProfileExcludedSystem);
				if (result == null) result = caseBase(expansionProfileExcludedSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION: {
				ExpansionProfileDesignation expansionProfileDesignation = (ExpansionProfileDesignation)theEObject;
				T result = caseExpansionProfileDesignation(expansionProfileDesignation);
				if (result == null) result = caseBackboneElement(expansionProfileDesignation);
				if (result == null) result = caseDataType(expansionProfileDesignation);
				if (result == null) result = caseElement(expansionProfileDesignation);
				if (result == null) result = caseBase(expansionProfileDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_INCLUDE: {
				ExpansionProfileDesignationDesignationInclude expansionProfileDesignationDesignationInclude = (ExpansionProfileDesignationDesignationInclude)theEObject;
				T result = caseExpansionProfileDesignationDesignationInclude(expansionProfileDesignationDesignationInclude);
				if (result == null) result = caseBackboneElement(expansionProfileDesignationDesignationInclude);
				if (result == null) result = caseDataType(expansionProfileDesignationDesignationInclude);
				if (result == null) result = caseElement(expansionProfileDesignationDesignationInclude);
				if (result == null) result = caseBase(expansionProfileDesignationDesignationInclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_INCLUDE_DESIGNATION_INCLUDE_DESIGNATION: {
				ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation = (ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation)theEObject;
				T result = caseExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation(expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation);
				if (result == null) result = caseBackboneElement(expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation);
				if (result == null) result = caseDataType(expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation);
				if (result == null) result = caseElement(expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation);
				if (result == null) result = caseBase(expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE: {
				ExpansionProfileDesignationDesignationExclude expansionProfileDesignationDesignationExclude = (ExpansionProfileDesignationDesignationExclude)theEObject;
				T result = caseExpansionProfileDesignationDesignationExclude(expansionProfileDesignationDesignationExclude);
				if (result == null) result = caseBackboneElement(expansionProfileDesignationDesignationExclude);
				if (result == null) result = caseDataType(expansionProfileDesignationDesignationExclude);
				if (result == null) result = caseElement(expansionProfileDesignationDesignationExclude);
				if (result == null) result = caseBase(expansionProfileDesignationDesignationExclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION: {
				ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation = (ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation)theEObject;
				T result = caseExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation(expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation);
				if (result == null) result = caseBackboneElement(expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation);
				if (result == null) result = caseDataType(expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation);
				if (result == null) result = caseElement(expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation);
				if (result == null) result = caseBase(expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMPARTMENT_DEFINITION: {
				CompartmentDefinition compartmentDefinition = (CompartmentDefinition)theEObject;
				T result = caseCompartmentDefinition(compartmentDefinition);
				if (result == null) result = caseDomainResource(compartmentDefinition);
				if (result == null) result = caseResource(compartmentDefinition);
				if (result == null) result = caseBase(compartmentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMPARTMENT_DEFINITION_RESOURCE: {
				CompartmentDefinitionResource compartmentDefinitionResource = (CompartmentDefinitionResource)theEObject;
				T result = caseCompartmentDefinitionResource(compartmentDefinitionResource);
				if (result == null) result = caseBackboneElement(compartmentDefinitionResource);
				if (result == null) result = caseDataType(compartmentDefinitionResource);
				if (result == null) result = caseElement(compartmentDefinitionResource);
				if (result == null) result = caseBase(compartmentDefinitionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROCESS_RESPONSE: {
				ProcessResponse processResponse = (ProcessResponse)theEObject;
				T result = caseProcessResponse(processResponse);
				if (result == null) result = caseDomainResource(processResponse);
				if (result == null) result = caseResource(processResponse);
				if (result == null) result = caseBase(processResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROCESS_RESPONSE_NOTE: {
				ProcessResponseNote processResponseNote = (ProcessResponseNote)theEObject;
				T result = caseProcessResponseNote(processResponseNote);
				if (result == null) result = caseBackboneElement(processResponseNote);
				if (result == null) result = caseDataType(processResponseNote);
				if (result == null) result = caseElement(processResponseNote);
				if (result == null) result = caseBase(processResponseNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PRACTITIONER_ROLE: {
				PractitionerRole practitionerRole = (PractitionerRole)theEObject;
				T result = caseResources_PractitionerRole(practitionerRole);
				if (result == null) result = caseDomainResource(practitionerRole);
				if (result == null) result = caseResource(practitionerRole);
				if (result == null) result = caseBase(practitionerRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME: {
				PractitionerRoleAvailableTime practitionerRoleAvailableTime = (PractitionerRoleAvailableTime)theEObject;
				T result = casePractitionerRoleAvailableTime(practitionerRoleAvailableTime);
				if (result == null) result = caseBackboneElement(practitionerRoleAvailableTime);
				if (result == null) result = caseDataType(practitionerRoleAvailableTime);
				if (result == null) result = caseElement(practitionerRoleAvailableTime);
				if (result == null) result = caseBase(practitionerRoleAvailableTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PRACTITIONER_ROLE_NOT_AVAILABLE: {
				PractitionerRoleNotAvailable practitionerRoleNotAvailable = (PractitionerRoleNotAvailable)theEObject;
				T result = casePractitionerRoleNotAvailable(practitionerRoleNotAvailable);
				if (result == null) result = caseBackboneElement(practitionerRoleNotAvailable);
				if (result == null) result = caseDataType(practitionerRoleNotAvailable);
				if (result == null) result = caseElement(practitionerRoleNotAvailable);
				if (result == null) result = caseBase(practitionerRoleNotAvailable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PAYMENT_NOTICE: {
				PaymentNotice paymentNotice = (PaymentNotice)theEObject;
				T result = casePaymentNotice(paymentNotice);
				if (result == null) result = caseDomainResource(paymentNotice);
				if (result == null) result = caseResource(paymentNotice);
				if (result == null) result = caseBase(paymentNotice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LINKAGE: {
				Linkage linkage = (Linkage)theEObject;
				T result = caseLinkage(linkage);
				if (result == null) result = caseDomainResource(linkage);
				if (result == null) result = caseResource(linkage);
				if (result == null) result = caseBase(linkage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LINKAGE_ITEM: {
				LinkageItem linkageItem = (LinkageItem)theEObject;
				T result = caseLinkageItem(linkageItem);
				if (result == null) result = caseBackboneElement(linkageItem);
				if (result == null) result = caseDataType(linkageItem);
				if (result == null) result = caseElement(linkageItem);
				if (result == null) result = caseBase(linkageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUPPLY_REQUEST: {
				SupplyRequest supplyRequest = (SupplyRequest)theEObject;
				T result = caseSupplyRequest(supplyRequest);
				if (result == null) result = caseDomainResource(supplyRequest);
				if (result == null) result = caseResource(supplyRequest);
				if (result == null) result = caseBase(supplyRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUPPLY_REQUEST_WHEN: {
				SupplyRequestWhen supplyRequestWhen = (SupplyRequestWhen)theEObject;
				T result = caseSupplyRequestWhen(supplyRequestWhen);
				if (result == null) result = caseBackboneElement(supplyRequestWhen);
				if (result == null) result = caseDataType(supplyRequestWhen);
				if (result == null) result = caseElement(supplyRequestWhen);
				if (result == null) result = caseBase(supplyRequestWhen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GUIDANCE_RESPONSE: {
				GuidanceResponse guidanceResponse = (GuidanceResponse)theEObject;
				T result = caseGuidanceResponse(guidanceResponse);
				if (result == null) result = caseDomainResource(guidanceResponse);
				if (result == null) result = caseResource(guidanceResponse);
				if (result == null) result = caseBase(guidanceResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_DEFINITION: {
				MessageDefinition messageDefinition = (MessageDefinition)theEObject;
				T result = caseMessageDefinition(messageDefinition);
				if (result == null) result = caseDomainResource(messageDefinition);
				if (result == null) result = caseResource(messageDefinition);
				if (result == null) result = caseBase(messageDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS: {
				MessageDefinitionFocus messageDefinitionFocus = (MessageDefinitionFocus)theEObject;
				T result = caseMessageDefinitionFocus(messageDefinitionFocus);
				if (result == null) result = caseBackboneElement(messageDefinitionFocus);
				if (result == null) result = caseDataType(messageDefinitionFocus);
				if (result == null) result = caseElement(messageDefinitionFocus);
				if (result == null) result = caseBase(messageDefinitionFocus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE: {
				MessageDefinitionAllowedResponse messageDefinitionAllowedResponse = (MessageDefinitionAllowedResponse)theEObject;
				T result = caseMessageDefinitionAllowedResponse(messageDefinitionAllowedResponse);
				if (result == null) result = caseBackboneElement(messageDefinitionAllowedResponse);
				if (result == null) result = caseDataType(messageDefinitionAllowedResponse);
				if (result == null) result = caseElement(messageDefinitionAllowedResponse);
				if (result == null) result = caseBase(messageDefinitionAllowedResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DETECTED_ISSUE: {
				DetectedIssue detectedIssue = (DetectedIssue)theEObject;
				T result = caseDetectedIssue(detectedIssue);
				if (result == null) result = caseDomainResource(detectedIssue);
				if (result == null) result = caseResource(detectedIssue);
				if (result == null) result = caseBase(detectedIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DETECTED_ISSUE_MITIGATION: {
				DetectedIssueMitigation detectedIssueMitigation = (DetectedIssueMitigation)theEObject;
				T result = caseDetectedIssueMitigation(detectedIssueMitigation);
				if (result == null) result = caseBackboneElement(detectedIssueMitigation);
				if (result == null) result = caseDataType(detectedIssueMitigation);
				if (result == null) result = caseElement(detectedIssueMitigation);
				if (result == null) result = caseBase(detectedIssueMitigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.APPOINTMENT_RESPONSE: {
				AppointmentResponse appointmentResponse = (AppointmentResponse)theEObject;
				T result = caseAppointmentResponse(appointmentResponse);
				if (result == null) result = caseDomainResource(appointmentResponse);
				if (result == null) result = caseResource(appointmentResponse);
				if (result == null) result = caseBase(appointmentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.AUDIT_EVENT: {
				AuditEvent auditEvent = (AuditEvent)theEObject;
				T result = caseAuditEvent(auditEvent);
				if (result == null) result = caseDomainResource(auditEvent);
				if (result == null) result = caseResource(auditEvent);
				if (result == null) result = caseBase(auditEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.AUDIT_EVENT_AGENT: {
				AuditEventAgent auditEventAgent = (AuditEventAgent)theEObject;
				T result = caseAuditEventAgent(auditEventAgent);
				if (result == null) result = caseBackboneElement(auditEventAgent);
				if (result == null) result = caseDataType(auditEventAgent);
				if (result == null) result = caseElement(auditEventAgent);
				if (result == null) result = caseBase(auditEventAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.AUDIT_EVENT_AGENT_NETWORK: {
				AuditEventAgentNetwork auditEventAgentNetwork = (AuditEventAgentNetwork)theEObject;
				T result = caseAuditEventAgentNetwork(auditEventAgentNetwork);
				if (result == null) result = caseBackboneElement(auditEventAgentNetwork);
				if (result == null) result = caseDataType(auditEventAgentNetwork);
				if (result == null) result = caseElement(auditEventAgentNetwork);
				if (result == null) result = caseBase(auditEventAgentNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.AUDIT_EVENT_SOURCE: {
				AuditEventSource auditEventSource = (AuditEventSource)theEObject;
				T result = caseAuditEventSource(auditEventSource);
				if (result == null) result = caseBackboneElement(auditEventSource);
				if (result == null) result = caseDataType(auditEventSource);
				if (result == null) result = caseElement(auditEventSource);
				if (result == null) result = caseBase(auditEventSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.AUDIT_EVENT_ENTITY: {
				AuditEventEntity auditEventEntity = (AuditEventEntity)theEObject;
				T result = caseAuditEventEntity(auditEventEntity);
				if (result == null) result = caseBackboneElement(auditEventEntity);
				if (result == null) result = caseDataType(auditEventEntity);
				if (result == null) result = caseElement(auditEventEntity);
				if (result == null) result = caseBase(auditEventEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.AUDIT_EVENT_ENTITY_DETAIL: {
				AuditEventEntityDetail auditEventEntityDetail = (AuditEventEntityDetail)theEObject;
				T result = caseAuditEventEntityDetail(auditEventEntityDetail);
				if (result == null) result = caseBackboneElement(auditEventEntityDetail);
				if (result == null) result = caseDataType(auditEventEntityDetail);
				if (result == null) result = caseElement(auditEventEntityDetail);
				if (result == null) result = caseBase(auditEventEntityDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BASIC: {
				Basic basic = (Basic)theEObject;
				T result = caseBasic(basic);
				if (result == null) result = caseDomainResource(basic);
				if (result == null) result = caseResource(basic);
				if (result == null) result = caseBase(basic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUPPLY_DELIVERY: {
				SupplyDelivery supplyDelivery = (SupplyDelivery)theEObject;
				T result = caseSupplyDelivery(supplyDelivery);
				if (result == null) result = caseDomainResource(supplyDelivery);
				if (result == null) result = caseResource(supplyDelivery);
				if (result == null) result = caseBase(supplyDelivery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseDomainResource(organization);
				if (result == null) result = caseResource(organization);
				if (result == null) result = caseBase(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ORGANIZATION_CONTACT: {
				OrganizationContact organizationContact = (OrganizationContact)theEObject;
				T result = caseOrganizationContact(organizationContact);
				if (result == null) result = caseBackboneElement(organizationContact);
				if (result == null) result = caseDataType(organizationContact);
				if (result == null) result = caseElement(organizationContact);
				if (result == null) result = caseBase(organizationContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetComposeConceptSet(ValueSetComposeConceptSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set Concept Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set Concept Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetComposeConceptSetConceptReference(ValueSetComposeConceptSetConceptReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set Concept Reference Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set Concept Reference Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetComposeConceptSetConceptReferenceDesignation(ValueSetComposeConceptSetConceptReferenceDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetComposeConceptSetFilter(ValueSetComposeConceptSetFilter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Expansion Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Expansion Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetExpansionParameter(ValueSetExpansionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Expansion Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Expansion Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetExpansionContains(ValueSetExpansionContains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchSubject(ResearchSubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Study</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Study</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchStudy(ResearchStudy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinition(PlanDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Action Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Action Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionActionDefinition(PlanDefinitionActionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Action Definition Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Action Definition Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionActionDefinitionCondition(PlanDefinitionActionDefinitionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Action Definition Related Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Action Definition Related Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionActionDefinitionRelatedAction(PlanDefinitionActionDefinitionRelatedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDefinition(ActivityDefinition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroupInput(StructureMapGroupInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroupRule(StructureMapGroupRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group Rule Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group Rule Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroupRuleSource(StructureMapGroupRuleSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group Rule Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group Rule Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroupRuleTarget(StructureMapGroupRuleTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group Rule Target Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group Rule Target Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroupRuleTargetParameter(StructureMapGroupRuleTargetParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group Rule Dependent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group Rule Dependent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroupRuleDependent(StructureMapGroupRuleDependent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Definition Dynamic Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Definition Dynamic Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDefinitionDynamicValue(ActivityDefinitionDynamicValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Action Definition Dynamic Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Action Definition Dynamic Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionActionDefinitionDynamicValue(PlanDefinitionActionDefinitionDynamicValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Research Study Arm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Study Arm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchStudyArm(ResearchStudyArm object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Consent Except Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Except Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentExceptActor(ConsentExceptActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Except Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Except Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentExceptData(ConsentExceptData object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication Product Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Product Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationProductIngredient(MedicationProductIngredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Product Batch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Product Batch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationProductBatch(MedicationProductBatch object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication Package Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Package Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationPackageContent(MedicationPackageContent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageGroup(CoverageGroup object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Contract Signatory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Signatory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractSignatory(ContractSignatory object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term Term Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term Term Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTermTermAgent(ContractTermTermAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term Term Valued Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term Term Valued Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTermTermValuedItem(ContractTermTermValuedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Friendly Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Friendly Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractFriendlyLanguage(ContractFriendlyLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Legal Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Legal Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractLegalLanguage(ContractLegalLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Computable Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Computable Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractComputableLanguage(ContractComputableLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Guarantor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Guarantor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountGuarantor(AccountGuarantor object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Context Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Context Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceContextRelated(DocumentReferenceContextRelated object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression Investigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression Investigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpressionInvestigation(ClinicalImpressionInvestigation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticRequest(DiagnosticRequest object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Item Enable When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Item Enable When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireItemEnableWhen(QuestionnaireItemEnableWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Item Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Item Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireItemOption(QuestionnaireItemOption object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response Item Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response Item Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponseItemAnswer(QuestionnaireResponseItemAnswer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Activity Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Activity Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanActivityDetail(CarePlanActivityDetail object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionRequest(NutritionRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Request Oral Diet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Request Oral Diet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionRequestOralDiet(NutritionRequestOralDiet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Request Oral Diet Nutrient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Request Oral Diet Nutrient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionRequestOralDietNutrient(NutritionRequestOralDietNutrient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Request Oral Diet Texture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Request Oral Diet Texture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionRequestOralDietTexture(NutritionRequestOralDietTexture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Request Supplement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Request Supplement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionRequestSupplement(NutritionRequestSupplement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Request Enteral Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Request Enteral Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionRequestEnteralFormula(NutritionRequestEnteralFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Request Enteral Formula Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Request Enteral Formula Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionRequestEnteralFormulaAdministration(NutritionRequestEnteralFormulaAdministration object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationRequest(MedicationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Request Dispense Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Request Dispense Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationRequestDispenseRequest(MedicationRequestDispenseRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Request Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Request Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationRequestSubstitution(MedicationRequestSubstitution object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Process Request Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Request Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessRequestItems(ProcessRequestItems object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study Study Base Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study Study Base Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudyStudyBaseLocation(ImagingStudyStudyBaseLocation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study Series Series Base Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study Series Series Base Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudySeriesSeriesBaseLocation(ImagingStudySeriesSeriesBaseLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study Series Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study Series Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudySeriesInstance(ImagingStudySeriesInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Manifest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingManifest(ImagingManifest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Manifest Study</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Manifest Study</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingManifestStudy(ImagingManifestStudy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Manifest Study Study Base Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Manifest Study Study Base Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingManifestStudyStudyBaseLocation(ImagingManifestStudyStudyBaseLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Manifest Study Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Manifest Study Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingManifestStudySeries(ImagingManifestStudySeries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Manifest Study Series Series Base Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Manifest Study Series Series Base Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingManifestStudySeriesSeriesBaseLocation(ImagingManifestStudySeriesSeriesBaseLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Manifest Study Series Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Manifest Study Series Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingManifestStudySeriesInstance(ImagingManifestStudySeriesInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceVariant(SequenceVariant object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Structure Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Structure Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceStructureVariant(SequenceStructureVariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Structure Variant Outer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Structure Variant Outer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceStructureVariantOuter(SequenceStructureVariantOuter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Structure Variant Inner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Structure Variant Inner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceStructureVariantInner(SequenceStructureVariantInner object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapGroup(ConceptMapGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Group Source Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Group Source Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapGroupSourceElement(ConceptMapGroupSourceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Group Source Element Target Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Group Source Element Target Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapGroupSourceElementTargetElement(ConceptMapGroupSourceElementTargetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Group Source Element Target Element Other Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Group Source Element Target Element Other Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapGroupSourceElementTargetElementOtherElement(ConceptMapGroupSourceElementTargetElementOtherElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestGroup(RequestGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Group Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Group Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestGroupAction(RequestGroupAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Group Action Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Group Action Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestGroupActionCondition(RequestGroupActionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Group Action Related Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Group Action Related Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestGroupActionRelatedAction(RequestGroupActionRelatedAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Code System Concept Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Concept Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemConceptDefinition(CodeSystemConceptDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Concept Definition Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Concept Definition Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemConceptDefinitionDesignation(CodeSystemConceptDefinitionDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Concept Definition Concept Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Concept Definition Concept Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemConceptDefinitionConceptProperty(CodeSystemConceptDefinitionConceptProperty object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Payment Reconciliation Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Reconciliation Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentReconciliationDetails(PaymentReconciliationDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Reconciliation Notes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Reconciliation Notes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentReconciliationNotes(PaymentReconciliationNotes object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Metadata Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Metadata Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptMetadataLink(TestScriptMetadataLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Metadata Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Metadata Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptMetadataCapability(TestScriptMetadataCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatement(CapabilityStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementSoftware(CapabilityStatementSoftware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementImplementation(CapabilityStatementImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRest(CapabilityStatementRest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRestSecurity(CapabilityStatementRestSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest Security Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest Security Certificate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRestSecurityCertificate(CapabilityStatementRestSecurityCertificate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRestResource(CapabilityStatementRestResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource Resource Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource Resource Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRestResourceResourceInteraction(CapabilityStatementRestResourceResourceInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource Search Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource Search Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRestResourceSearchParam(CapabilityStatementRestResourceSearchParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest System Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest System Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRestSystemInteraction(CapabilityStatementRestSystemInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRestOperation(CapabilityStatementRestOperation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Parameter Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionParameterBinding(OperationDefinitionParameterBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Overload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Overload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionOverload(OperationDefinitionOverload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Messaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Messaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementMessaging(CapabilityStatementMessaging object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Messaging Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Messaging Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementMessagingEndpoint(CapabilityStatementMessagingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Messaging Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Messaging Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementMessagingEvent(CapabilityStatementMessagingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementDocument(CapabilityStatementDocument object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Rule Rule Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Rule Rule Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptRuleRuleParam(TestScriptRuleRuleParam object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Ruleset Ruleset Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Ruleset Ruleset Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptRulesetRulesetRule(TestScriptRulesetRulesetRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Ruleset Ruleset Rule Ruleset Rule Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Ruleset Ruleset Rule Ruleset Rule Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptRulesetRulesetRuleRulesetRuleParam(TestScriptRulesetRulesetRuleRulesetRuleParam object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetupSetupAction(TestScriptSetupSetupAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetupSetupActionOperation(TestScriptSetupSetupActionOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Operation Request Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Operation Request Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetupSetupActionOperationRequestHeader(TestScriptSetupSetupActionOperationRequestHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetupSetupActionAssert(TestScriptSetupSetupActionAssert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert Action Assert Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert Action Assert Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetupSetupActionAssertActionAssertRule(TestScriptSetupSetupActionAssertActionAssertRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert Action Assert Rule Action Assert Rule Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert Action Assert Rule Action Assert Rule Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam(TestScriptSetupSetupActionAssertActionAssertRuleActionAssertRuleParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert Action Assert Ruleset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert Action Assert Ruleset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetupSetupActionAssertActionAssertRuleset(TestScriptSetupSetupActionAssertActionAssertRuleset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert Action Assert Ruleset Action Assert Ruleset Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert Action Assert Ruleset Action Assert Ruleset Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule(TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert Action Assert Ruleset Action Assert Ruleset Rule Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert Action Assert Ruleset Action Assert Ruleset Rule Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam(TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Test Test Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Test Test Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptTestTestAction(TestScriptTestTestAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Teardown Teardown Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Teardown Teardown Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptTeardownTeardownAction(TestScriptTeardownTeardownAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Message Header Message Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header Message Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeaderMessageSource(MessageHeaderMessageSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Header Message Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header Message Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeaderMessageDestination(MessageHeaderMessageDestination object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Service Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDefinition(ServiceDefinition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation Date Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation Date Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRecommendationRecommendationDateCriterion(ImmunizationRecommendationRecommendationDateCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRecommendationRecommendationProtocol(ImmunizationRecommendationRecommendationProtocol object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Entry Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Entry Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleEntrySearch(BundleEntrySearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Entry Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Entry Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleEntryRequest(BundleEntryRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Entry Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Entry Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleEntryResponse(BundleEntryResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReport(TestReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportParticipant(TestReportParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportSetup(TestReportSetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Setup Setup Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Setup Setup Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportSetupSetupAction(TestReportSetupSetupAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Setup Setup Action Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Setup Setup Action Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportSetupSetupActionOperation(TestReportSetupSetupActionOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Setup Setup Action Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Setup Setup Action Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportSetupSetupActionAssert(TestReportSetupSetupActionAssert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportTest(TestReportTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Test Test Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Test Test Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportTestTestAction(TestReportTestTestAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Teardown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Teardown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportTeardown(TestReportTeardown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Teardown Teardown Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Teardown Teardown Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportTeardownTeardownAction(TestReportTeardownTeardownAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Response Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Response Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityResponseInsurance(EligibilityResponseInsurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Response Insurance Benefits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Response Insurance Benefits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityResponseInsuranceBenefits(EligibilityResponseInsuranceBenefits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Response Insurance Benefits Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Response Insurance Benefits Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityResponseInsuranceBenefitsBenefit(EligibilityResponseInsuranceBenefitsBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Response Errors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Response Errors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityResponseErrors(EligibilityResponseErrors object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Measure Group Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Group Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroupPopulation(MeasureGroupPopulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Group Stratifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Group Stratifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroupStratifier(MeasureGroupStratifier object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroupPopulation(MeasureReportGroupPopulation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroupStratifier(MeasureReportGroupStratifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier Stratifier Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier Stratifier Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroupStratifierStratifierGroup(MeasureReportGroupStratifierStratifierGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier Stratifier Group Stratifier Group Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier Stratifier Group Stratifier Group Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation(MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group Supplemental Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group Supplemental Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroupSupplementalData(MeasureReportGroupSupplementalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group Supplemental Data Supplemental Data Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group Supplemental Data Supplemental Data Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroupSupplementalDataSupplementalDataGroup(MeasureReportGroupSupplementalDataSupplementalDataGroup object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Claim Related Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Related Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimRelatedClaim(ClaimRelatedClaim object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Claim Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Care Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimCareTeam(ClaimCareTeam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Special Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Special Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimSpecialCondition(ClaimSpecialCondition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Claim Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimInsurance(ClaimInsurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Accident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Accident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimAccident(ClaimAccident object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Claim Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Item Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimItemDetail(ClaimItemDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Item Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Item Detail Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimItemDetailSubDetail(ClaimItemDetailSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Item Prosthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Item Prosthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimItemProsthesis(ClaimItemProsthesis object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Item Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Item Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItemAdjudication(ClaimResponseItemAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Item Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Item Item Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItemItemDetail(ClaimResponseItemItemDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Item Item Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Item Item Detail Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItemItemDetailSubDetail(ClaimResponseItemItemDetailSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Added Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Added Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAddedItem(ClaimResponseAddedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Added Item Added Items Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Added Item Added Items Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAddedItemAddedItemsDetail(ClaimResponseAddedItemAddedItemsDetail object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponsePayment(ClaimResponsePayment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseInsurance(ClaimResponseInsurance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Task Requester</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Requester</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskRequester(TaskRequester object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskRestriction(TaskRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskParameter(TaskParameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Related Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Related Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitRelatedClaim(ExplanationOfBenefitRelatedClaim object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Supporting Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Supporting Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitSupportingInformation(ExplanationOfBenefitSupportingInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Care Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitCareTeam(ExplanationOfBenefitCareTeam object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitInsurance(ExplanationOfBenefitInsurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Accident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Accident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAccident(ExplanationOfBenefitAccident object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItemAdjudication(ExplanationOfBenefitItemAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItemDetail(ExplanationOfBenefitItemDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Detail Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItemDetailSubDetail(ExplanationOfBenefitItemDetailSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Prosthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Prosthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItemProsthesis(ExplanationOfBenefitItemProsthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAddedItem(ExplanationOfBenefitAddedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item Added Items Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item Added Items Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAddedItemAddedItemsDetail(ExplanationOfBenefitAddedItemAddedItemsDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitPayment(ExplanationOfBenefitPayment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Benefit Balance Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Benefit Balance Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitBenefitBalanceBenefit(ExplanationOfBenefitBenefitBalanceBenefit object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Package Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Package Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuidePackageResource(ImplementationGuidePackageResource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Search Parameter Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Parameter Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchParameterComponent(SearchParameterComponent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Fixed Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Fixed Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileFixedVersion(ExpansionProfileFixedVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Excluded System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Excluded System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileExcludedSystem(ExpansionProfileExcludedSystem object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileDesignationDesignationInclude(ExpansionProfileDesignationDesignationInclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Include Designation Include Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Include Designation Include Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation(ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Exclude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Exclude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileDesignationDesignationExclude(ExpansionProfileDesignationDesignationExclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Exclude Designation Exclude Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Exclude Designation Exclude Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation(ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Process Response Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Response Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessResponseNote(ProcessResponseNote object) {
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
	public T caseResources_PractitionerRole(PractitionerRole object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Message Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDefinition(MessageDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Definition Focus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Definition Focus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDefinitionFocus(MessageDefinitionFocus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Definition Allowed Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Definition Allowed Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDefinitionAllowedResponse(MessageDefinitionAllowedResponse object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Agent Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Agent Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventAgentNetwork(AuditEventAgentNetwork object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Entity Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Entity Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventEntityDetail(AuditEventEntityDetail object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase(Base object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
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

} //ResourcesSwitch
