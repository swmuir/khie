/**
 */
package org.eclipse.mdht.uml.fhir.core.valueSets;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ValueSetsFactory
 * @model kind="package"
 * @generated
 */
public interface ValueSetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "valueSets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///fhiRCore/valueSets.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fhiRCore.valueSets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValueSetsPackage eINSTANCE = org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DataType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ResourceType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AddressUse <em>Address Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AddressUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAddressUse()
	 * @generated
	 */
	int ADDRESS_USE = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AddressType <em>Address Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AddressType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QuantityComparator <em>Quantity Comparator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QuantityComparator
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getQuantityComparator()
	 * @generated
	 */
	int QUANTITY_COMPARATOR = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllSecurityLabels <em>All Security Labels</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllSecurityLabels
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAllSecurityLabels()
	 * @generated
	 */
	int ALL_SECURITY_LABELS = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CommonTags <em>Common Tags</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CommonTags
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCommonTags()
	 * @generated
	 */
	int COMMON_TAGS = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CommonLanguages <em>Common Languages</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CommonLanguages
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCommonLanguages()
	 * @generated
	 */
	int COMMON_LANGUAGES = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NarrativeStatus <em>Narrative Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NarrativeStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getNarrativeStatus()
	 * @generated
	 */
	int NARRATIVE_STATUS = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IdentifierUse <em>Identifier Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IdentifierUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getIdentifierUse()
	 * @generated
	 */
	int IDENTIFIER_USE = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IdentifierTypeCodes <em>Identifier Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IdentifierTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getIdentifierTypeCodes()
	 * @generated
	 */
	int IDENTIFIER_TYPE_CODES = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.OrganizationType <em>Organization Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.OrganizationType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getOrganizationType()
	 * @generated
	 */
	int ORGANIZATION_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContactPointSystem <em>Contact Point System</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContactPointSystem
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContactPointSystem()
	 * @generated
	 */
	int CONTACT_POINT_SYSTEM = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContactPointUse <em>Contact Point Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContactPointUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContactPointUse()
	 * @generated
	 */
	int CONTACT_POINT_USE = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContactEntityType <em>Contact Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContactEntityType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContactEntityType()
	 * @generated
	 */
	int CONTACT_ENTITY_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NameUse <em>Name Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NameUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getNameUse()
	 * @generated
	 */
	int NAME_USE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EndpointStatus <em>Endpoint Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EndpointStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEndpointStatus()
	 * @generated
	 */
	int ENDPOINT_STATUS = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EndpointConnectionType <em>Endpoint Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EndpointConnectionType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEndpointConnectionType()
	 * @generated
	 */
	int ENDPOINT_CONNECTION_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EndpointPayloadType <em>Endpoint Payload Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EndpointPayloadType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEndpointPayloadType()
	 * @generated
	 */
	int ENDPOINT_PAYLOAD_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AdministrativeGender <em>Administrative Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AdministrativeGender
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAdministrativeGender()
	 * @generated
	 */
	int ADMINISTRATIVE_GENDER = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PractitionerRole <em>Practitioner Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PractitionerRole
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPractitionerRole()
	 * @generated
	 */
	int PRACTITIONER_ROLE = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PractitionerSpecialty <em>Practitioner Specialty</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PractitionerSpecialty
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPractitionerSpecialty()
	 * @generated
	 */
	int PRACTITIONER_SPECIALTY = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LocationStatus <em>Location Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LocationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getLocationStatus()
	 * @generated
	 */
	int LOCATION_STATUS = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LocationMode <em>Location Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LocationMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getLocationMode()
	 * @generated
	 */
	int LOCATION_MODE = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ServiceDeliveryLocationRoleType <em>Service Delivery Location Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ServiceDeliveryLocationRoleType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getServiceDeliveryLocationRoleType()
	 * @generated
	 */
	int SERVICE_DELIVERY_LOCATION_ROLE_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LocationType <em>Location Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LocationType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ServiceCategory <em>Service Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ServiceCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getServiceCategory()
	 * @generated
	 */
	int SERVICE_CATEGORY = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ServiceType <em>Service Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ServiceType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PracticeSettingCodeValueSet <em>Practice Setting Code Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PracticeSettingCodeValueSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPracticeSettingCodeValueSet()
	 * @generated
	 */
	int PRACTICE_SETTING_CODE_VALUE_SET = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ServiceProvisionConditions <em>Service Provision Conditions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ServiceProvisionConditions
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getServiceProvisionConditions()
	 * @generated
	 */
	int SERVICE_PROVISION_CONDITIONS = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ReferralMethod <em>Referral Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ReferralMethod
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getReferralMethod()
	 * @generated
	 */
	int REFERRAL_METHOD = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DaysOfWeek <em>Days Of Week</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DaysOfWeek
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDaysOfWeek()
	 * @generated
	 */
	int DAYS_OF_WEEK = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12 <em>Anzsco Australian And New Zealand Standard Classification Of Occupations2013 Version12</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12()
	 * @generated
	 */
	int ANZSCO_AUSTRALIAN_AND_NEW_ZEALAND_STANDARD_CLASSIFICATION_OF_OCCUPATIONS2013_VERSION12 = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MaritalStatusCodes <em>Marital Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MaritalStatusCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMaritalStatusCodes()
	 * @generated
	 */
	int MARITAL_STATUS_CODES = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V2ContactRole <em>V2 Contact Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V2ContactRole
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getV2ContactRole()
	 * @generated
	 */
	int V2_CONTACT_ROLE = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AnimalSpecies <em>Animal Species</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AnimalSpecies
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAnimalSpecies()
	 * @generated
	 */
	int ANIMAL_SPECIES = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AnimalBreeds <em>Animal Breeds</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AnimalBreeds
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAnimalBreeds()
	 * @generated
	 */
	int ANIMAL_BREEDS = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GenderStatus <em>Gender Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GenderStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getGenderStatus()
	 * @generated
	 */
	int GENDER_STATUS = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PatientRelationshipType <em>Patient Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PatientRelationshipType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPatientRelationshipType()
	 * @generated
	 */
	int PATIENT_RELATIONSHIP_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LinkType <em>Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LinkType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SignatureTypeCodes <em>Signature Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SignatureTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSignatureTypeCodes()
	 * @generated
	 */
	int SIGNATURE_TYPE_CODES = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceStatus <em>Device Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDeviceStatus()
	 * @generated
	 */
	int DEVICE_STATUS = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceTypes <em>Device Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceTypes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDeviceTypes()
	 * @generated
	 */
	int DEVICE_TYPES = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.UnitsOfTime <em>Units Of Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.UnitsOfTime
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getUnitsOfTime()
	 * @generated
	 */
	int UNITS_OF_TIME = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EventTiming <em>Event Timing</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EventTiming
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEventTiming()
	 * @generated
	 */
	int EVENT_TIMING = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TimingAbbreviation <em>Timing Abbreviation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TimingAbbreviation
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTimingAbbreviation()
	 * @generated
	 */
	int TIMING_ABBREVIATION = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LibraryType <em>Library Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LibraryType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getLibraryType()
	 * @generated
	 */
	int LIBRARY_TYPE = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PublicationStatus <em>Publication Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PublicationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPublicationStatus()
	 * @generated
	 */
	int PUBLICATION_STATUS = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.UsageContextType <em>Usage Context Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.UsageContextType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getUsageContextType()
	 * @generated
	 */
	int USAGE_CONTEXT_TYPE = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.JurisdictionValueSet <em>Jurisdiction Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.JurisdictionValueSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getJurisdictionValueSet()
	 * @generated
	 */
	int JURISDICTION_VALUE_SET = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContributorType <em>Contributor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContributorType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContributorType()
	 * @generated
	 */
	int CONTRIBUTOR_TYPE = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RelatedArtifactType <em>Related Artifact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RelatedArtifactType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getRelatedArtifactType()
	 * @generated
	 */
	int RELATED_ARTIFACT_TYPE = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.OperationParameterUse <em>Operation Parameter Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.OperationParameterUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getOperationParameterUse()
	 * @generated
	 */
	int OPERATION_PARAMETER_USE = 52;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FhirAllTypes <em>Fhir All Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FhirAllTypes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFhirAllTypes()
	 * @generated
	 */
	int FHIR_ALL_TYPES = 53;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureDefinitionCodes <em>Structure Definition Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureDefinitionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getStructureDefinitionCodes()
	 * @generated
	 */
	int STRUCTURE_DEFINITION_CODES = 54;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureDefinitionKind <em>Structure Definition Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureDefinitionKind
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getStructureDefinitionKind()
	 * @generated
	 */
	int STRUCTURE_DEFINITION_KIND = 55;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExtensionContext <em>Extension Context</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExtensionContext
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExtensionContext()
	 * @generated
	 */
	int EXTENSION_CONTEXT = 56;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FhirDefinedType <em>Fhir Defined Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FhirDefinedType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFhirDefinedType()
	 * @generated
	 */
	int FHIR_DEFINED_TYPE = 57;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TypeDerivationRule <em>Type Derivation Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TypeDerivationRule
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTypeDerivationRule()
	 * @generated
	 */
	int TYPE_DERIVATION_RULE = 58;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PropertyRepresentation <em>Property Representation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PropertyRepresentation
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPropertyRepresentation()
	 * @generated
	 */
	int PROPERTY_REPRESENTATION = 59;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LoincCodes <em>Loinc Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LoincCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getLoincCodes()
	 * @generated
	 */
	int LOINC_CODES = 60;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SlicingRules <em>Slicing Rules</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SlicingRules
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSlicingRules()
	 * @generated
	 */
	int SLICING_RULES = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AggregationMode <em>Aggregation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AggregationMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAggregationMode()
	 * @generated
	 */
	int AGGREGATION_MODE = 62;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ReferenceVersionRules <em>Reference Version Rules</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ReferenceVersionRules
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getReferenceVersionRules()
	 * @generated
	 */
	int REFERENCE_VERSION_RULES = 63;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConstraintSeverity <em>Constraint Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConstraintSeverity
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConstraintSeverity()
	 * @generated
	 */
	int CONSTRAINT_SEVERITY = 64;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BindingStrength <em>Binding Strength</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BindingStrength
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getBindingStrength()
	 * @generated
	 */
	int BINDING_STRENGTH = 65;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DesignationUse <em>Designation Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DesignationUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDesignationUse()
	 * @generated
	 */
	int DESIGNATION_USE = 66;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FilterOperator <em>Filter Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FilterOperator
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFilterOperator()
	 * @generated
	 */
	int FILTER_OPERATOR = 67;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ResearchSubjectStatus <em>Research Subject Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ResearchSubjectStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getResearchSubjectStatus()
	 * @generated
	 */
	int RESEARCH_SUBJECT_STATUS = 68;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanDefinitionType <em>Plan Definition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanDefinitionType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPlanDefinitionType()
	 * @generated
	 */
	int PLAN_DEFINITION_TYPE = 69;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TriggerType <em>Trigger Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TriggerType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTriggerType()
	 * @generated
	 */
	int TRIGGER_TYPE = 70;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionConditionKind <em>Plan Action Condition Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionConditionKind
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPlanActionConditionKind()
	 * @generated
	 */
	int PLAN_ACTION_CONDITION_KIND = 71;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionRelationshipType <em>Plan Action Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionRelationshipType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPlanActionRelationshipType()
	 * @generated
	 */
	int PLAN_ACTION_RELATIONSHIP_TYPE = 72;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionParticipantType <em>Plan Action Participant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionParticipantType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPlanActionParticipantType()
	 * @generated
	 */
	int PLAN_ACTION_PARTICIPANT_TYPE = 73;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionType <em>Plan Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPlanActionType()
	 * @generated
	 */
	int PLAN_ACTION_TYPE = 74;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionGroupingBehavior <em>Plan Action Grouping Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionGroupingBehavior
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPlanActionGroupingBehavior()
	 * @generated
	 */
	int PLAN_ACTION_GROUPING_BEHAVIOR = 75;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionSelectionBehavior <em>Plan Action Selection Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionSelectionBehavior
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPlanActionSelectionBehavior()
	 * @generated
	 */
	int PLAN_ACTION_SELECTION_BEHAVIOR = 76;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionRequiredBehavior <em>Plan Action Required Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionRequiredBehavior
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPlanActionRequiredBehavior()
	 * @generated
	 */
	int PLAN_ACTION_REQUIRED_BEHAVIOR = 77;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionPrecheckBehavior <em>Plan Action Precheck Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionPrecheckBehavior
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPlanActionPrecheckBehavior()
	 * @generated
	 */
	int PLAN_ACTION_PRECHECK_BEHAVIOR = 78;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionCardinalityBehavior <em>Plan Action Cardinality Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionCardinalityBehavior
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPlanActionCardinalityBehavior()
	 * @generated
	 */
	int PLAN_ACTION_CARDINALITY_BEHAVIOR = 79;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActivityDefinitionCategory <em>Activity Definition Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActivityDefinitionCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getActivityDefinitionCategory()
	 * @generated
	 */
	int ACTIVITY_DEFINITION_CATEGORY = 80;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtMedicationCodes <em>Snomed Ct Medication Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtMedicationCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtMedicationCodes()
	 * @generated
	 */
	int SNOMED_CT_MEDICATION_CODES = 81;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtFormCodes <em>Snomed Ct Form Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtFormCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtFormCodes()
	 * @generated
	 */
	int SNOMED_CT_FORM_CODES = 82;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtFormCodes <em>Snomed Ct Form Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtFormCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtFormCodes()
	 * @generated
	 */
	int SNOMED_CT_FORM_CODES = 85;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SubstanceCategoryCodes <em>Substance Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SubstanceCategoryCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSubstanceCategoryCodes()
	 * @generated
	 */
	int SUBSTANCE_CATEGORY_CODES = 83;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SubstanceCode <em>Substance Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SubstanceCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSubstanceCode()
	 * @generated
	 */
	int SUBSTANCE_CODE = 84;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtFormCodes <em>Snomed Ct Form Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtFormCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtFormCodes()
	 * @generated
	 */
	int SNOMED_CT_FORM_CODES = 85;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtAdditionalDosageInstructions <em>Snomed Ct Additional Dosage Instructions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtAdditionalDosageInstructions
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtAdditionalDosageInstructions()
	 * @generated
	 */
	int SNOMED_CT_ADDITIONAL_DOSAGE_INSTRUCTIONS = 86;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtMedicationAsNeededReasonCodes <em>Snomed Ct Medication As Needed Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtMedicationAsNeededReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtMedicationAsNeededReasonCodes()
	 * @generated
	 */
	int SNOMED_CT_MEDICATION_AS_NEEDED_REASON_CODES = 87;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtAnatomicalStructureForAdministrationSiteCodes <em>Snomed Ct Anatomical Structure For Administration Site Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtAnatomicalStructureForAdministrationSiteCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtAnatomicalStructureForAdministrationSiteCodes()
	 * @generated
	 */
	int SNOMED_CT_ANATOMICAL_STRUCTURE_FOR_ADMINISTRATION_SITE_CODES = 88;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtRouteCodes <em>Snomed Ct Route Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtRouteCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtRouteCodes()
	 * @generated
	 */
	int SNOMED_CT_ROUTE_CODES = 89;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtAdministrationMethodCodes <em>Snomed Ct Administration Method Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtAdministrationMethodCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtAdministrationMethodCodes()
	 * @generated
	 */
	int SNOMED_CT_ADMINISTRATION_METHOD_CODES = 90;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtBodyStructures <em>Snomed Ct Body Structures</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtBodyStructures
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtBodyStructures()
	 * @generated
	 */
	int SNOMED_CT_BODY_STRUCTURES = 91;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapModelMode <em>Structure Map Model Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapModelMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getStructureMapModelMode()
	 * @generated
	 */
	int STRUCTURE_MAP_MODEL_MODE = 92;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapInputMode <em>Structure Map Input Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapInputMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getStructureMapInputMode()
	 * @generated
	 */
	int STRUCTURE_MAP_INPUT_MODE = 93;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapContextType <em>Structure Map Context Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapContextType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getStructureMapContextType()
	 * @generated
	 */
	int STRUCTURE_MAP_CONTEXT_TYPE = 94;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapListMode <em>Structure Map List Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapListMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getStructureMapListMode()
	 * @generated
	 */
	int STRUCTURE_MAP_LIST_MODE = 95;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapTransform <em>Structure Map Transform</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapTransform
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getStructureMapTransform()
	 * @generated
	 */
	int STRUCTURE_MAP_TRANSFORM = 96;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ResearchStudyStatus <em>Research Study Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ResearchStudyStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getResearchStudyStatus()
	 * @generated
	 */
	int RESEARCH_STUDY_STATUS = 97;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GroupType <em>Group Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GroupType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getGroupType()
	 * @generated
	 */
	int GROUP_TYPE = 98;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentStatus <em>Consent Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConsentStatus()
	 * @generated
	 */
	int CONSENT_STATUS = 99;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentCategoryCodes <em>Consent Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentCategoryCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConsentCategoryCodes()
	 * @generated
	 */
	int CONSENT_CATEGORY_CODES = 100;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentTypeValueSet <em>Document Type Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentTypeValueSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDocumentTypeValueSet()
	 * @generated
	 */
	int DOCUMENT_TYPE_VALUE_SET = 101;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentClassValueSet <em>Document Class Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentClassValueSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDocumentClassValueSet()
	 * @generated
	 */
	int DOCUMENT_CLASS_VALUE_SET = 102;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentReferenceStatus <em>Document Reference Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentReferenceStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDocumentReferenceStatus()
	 * @generated
	 */
	int DOCUMENT_REFERENCE_STATUS = 103;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CompositionStatus <em>Composition Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CompositionStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCompositionStatus()
	 * @generated
	 */
	int COMPOSITION_STATUS = 104;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentRelationshipType <em>Document Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentRelationshipType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDocumentRelationshipType()
	 * @generated
	 */
	int DOCUMENT_RELATIONSHIP_TYPE = 105;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentReferenceFormatCodeSet <em>Document Reference Format Code Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentReferenceFormatCodeSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDocumentReferenceFormatCodeSet()
	 * @generated
	 */
	int DOCUMENT_REFERENCE_FORMAT_CODE_SET = 106;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EncounterStatus <em>Encounter Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EncounterStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEncounterStatus()
	 * @generated
	 */
	int ENCOUNTER_STATUS = 107;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActEncounterCode <em>Act Encounter Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActEncounterCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getActEncounterCode()
	 * @generated
	 */
	int ACT_ENCOUNTER_CODE = 108;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EncounterType <em>Encounter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EncounterType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEncounterType()
	 * @generated
	 */
	int ENCOUNTER_TYPE = 109;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemActPriority <em>V3 Code System Act Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemActPriority
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getV3CodeSystemActPriority()
	 * @generated
	 */
	int V3_CODE_SYSTEM_ACT_PRIORITY = 110;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EpisodeOfCareStatus <em>Episode Of Care Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EpisodeOfCareStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEpisodeOfCareStatus()
	 * @generated
	 */
	int EPISODE_OF_CARE_STATUS = 111;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionClinicalStatusCodes <em>Condition Clinical Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionClinicalStatusCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConditionClinicalStatusCodes()
	 * @generated
	 */
	int CONDITION_CLINICAL_STATUS_CODES = 112;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionVerificationStatus <em>Condition Verification Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionVerificationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConditionVerificationStatus()
	 * @generated
	 */
	int CONDITION_VERIFICATION_STATUS = 113;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionCategoryCodes <em>Condition Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionCategoryCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConditionCategoryCodes()
	 * @generated
	 */
	int CONDITION_CATEGORY_CODES = 114;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionDiagnosisSeverity <em>Condition Diagnosis Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionDiagnosisSeverity
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConditionDiagnosisSeverity()
	 * @generated
	 */
	int CONDITION_DIAGNOSIS_SEVERITY = 115;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionProblemDiagnosisCodes <em>Condition Problem Diagnosis Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionProblemDiagnosisCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConditionProblemDiagnosisCodes()
	 * @generated
	 */
	int CONDITION_PROBLEM_DIAGNOSIS_CODES = 116;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionStage <em>Condition Stage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionStage
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConditionStage()
	 * @generated
	 */
	int CONDITION_STAGE = 117;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ClinicalImpressionStatus <em>Clinical Impression Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ClinicalImpressionStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getClinicalImpressionStatus()
	 * @generated
	 */
	int CLINICAL_IMPRESSION_STATUS = 118;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceClinicalStatus <em>Allergy Intolerance Clinical Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceClinicalStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAllergyIntoleranceClinicalStatus()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_CLINICAL_STATUS = 119;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceVerificationStatus <em>Allergy Intolerance Verification Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceVerificationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAllergyIntoleranceVerificationStatus()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_VERIFICATION_STATUS = 120;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceType <em>Allergy Intolerance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAllergyIntoleranceType()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_TYPE = 121;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceCategory <em>Allergy Intolerance Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAllergyIntoleranceCategory()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_CATEGORY = 122;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceCriticality <em>Allergy Intolerance Criticality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceCriticality
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAllergyIntoleranceCriticality()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_CRITICALITY = 123;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceSubstanceProductConditionAndNegationCodes <em>Allergy Intolerance Substance Product Condition And Negation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceSubstanceProductConditionAndNegationCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAllergyIntoleranceSubstanceProductConditionAndNegationCodes()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_SUBSTANCE_PRODUCT_CONDITION_AND_NEGATION_CODES = 124;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceCertainty <em>Allergy Intolerance Certainty</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceCertainty
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAllergyIntoleranceCertainty()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_CERTAINTY = 125;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtClinicalFindings <em>Snomed Ct Clinical Findings</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtClinicalFindings
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtClinicalFindings()
	 * @generated
	 */
	int SNOMED_CT_CLINICAL_FINDINGS = 126;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtClinicalFindings <em>Snomed Ct Clinical Findings</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtClinicalFindings
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtClinicalFindings()
	 * @generated
	 */
	int SNOMED_CT_CLINICAL_FINDINGS = 234;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceSeverity <em>Allergy Intolerance Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceSeverity
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAllergyIntoleranceSeverity()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_SEVERITY = 127;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.InvestigationType <em>Investigation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.InvestigationType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getInvestigationType()
	 * @generated
	 */
	int INVESTIGATION_TYPE = 128;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationStatus <em>Observation Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getObservationStatus()
	 * @generated
	 */
	int OBSERVATION_STATUS = 129;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationCategoryCodes <em>Observation Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationCategoryCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getObservationCategoryCodes()
	 * @generated
	 */
	int OBSERVATION_CATEGORY_CODES = 130;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationValueAbsentReason <em>Observation Value Absent Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationValueAbsentReason
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getObservationValueAbsentReason()
	 * @generated
	 */
	int OBSERVATION_VALUE_ABSENT_REASON = 131;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationInterpretationCodes <em>Observation Interpretation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationInterpretationCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getObservationInterpretationCodes()
	 * @generated
	 */
	int OBSERVATION_INTERPRETATION_CODES = 132;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationMethods <em>Observation Methods</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationMethods
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getObservationMethods()
	 * @generated
	 */
	int OBSERVATION_METHODS = 133;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenStatus <em>Specimen Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSpecimenStatus()
	 * @generated
	 */
	int SPECIMEN_STATUS = 134;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V2SpecimenType <em>V2 Specimen Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V2SpecimenType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getV2SpecimenType()
	 * @generated
	 */
	int V2_SPECIMEN_TYPE = 135;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RequestStatus <em>Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RequestStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getRequestStatus()
	 * @generated
	 */
	int REQUEST_STATUS = 136;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RequestIntent <em>Request Intent</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RequestIntent
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getRequestIntent()
	 * @generated
	 */
	int REQUEST_INTENT = 137;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RequestPriority <em>Request Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RequestPriority
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getRequestPriority()
	 * @generated
	 */
	int REQUEST_PRIORITY = 138;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LoincDiagnosticRequestCodes <em>Loinc Diagnostic Request Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LoincDiagnosticRequestCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getLoincDiagnosticRequestCodes()
	 * @generated
	 */
	int LOINC_DIAGNOSTIC_REQUEST_CODES = 139;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ParticipantRoles <em>Participant Roles</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ParticipantRoles
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getParticipantRoles()
	 * @generated
	 */
	int PARTICIPANT_ROLES = 140;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PurposeOfUse <em>Purpose Of Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PurposeOfUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPurposeOfUse()
	 * @generated
	 */
	int PURPOSE_OF_USE = 141;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProvenanceEventCurrentState <em>Provenance Event Current State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProvenanceEventCurrentState
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProvenanceEventCurrentState()
	 * @generated
	 */
	int PROVENANCE_EVENT_CURRENT_STATE = 142;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProvenanceParticipantRole <em>Provenance Participant Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProvenanceParticipantRole
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProvenanceParticipantRole()
	 * @generated
	 */
	int PROVENANCE_PARTICIPANT_ROLE = 143;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemRoleLinkType <em>V3 Code System Role Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemRoleLinkType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getV3CodeSystemRoleLinkType()
	 * @generated
	 */
	int V3_CODE_SYSTEM_ROLE_LINK_TYPE = 144;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProvenanceEntityRole <em>Provenance Entity Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProvenanceEntityRole
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProvenanceEntityRole()
	 * @generated
	 */
	int PROVENANCE_ENTITY_ROLE = 145;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureCodessnomedCT <em>Procedure Codessnomed CT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureCodessnomedCT
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProcedureCodessnomedCT()
	 * @generated
	 */
	int PROCEDURE_CODESSNOMED_CT = 146;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureReasonCodes <em>Procedure Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProcedureReasonCodes()
	 * @generated
	 */
	int PROCEDURE_REASON_CODES = 147;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureRequestStatus <em>Procedure Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureRequestStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProcedureRequestStatus()
	 * @generated
	 */
	int PROCEDURE_REQUEST_STATUS = 148;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureRequestPriority <em>Procedure Request Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureRequestPriority
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProcedureRequestPriority()
	 * @generated
	 */
	int PROCEDURE_REQUEST_PRIORITY = 149;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenCollectionMethod <em>Specimen Collection Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenCollectionMethod
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSpecimenCollectionMethod()
	 * @generated
	 */
	int SPECIMEN_COLLECTION_METHOD = 150;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenTreatmentProcedure <em>Specimen Treatment Procedure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenTreatmentProcedure
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSpecimenTreatmentProcedure()
	 * @generated
	 */
	int SPECIMEN_TREATMENT_PROCEDURE = 151;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenContainer <em>Specimen Container</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenContainer
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSpecimenContainer()
	 * @generated
	 */
	int SPECIMEN_CONTAINER = 152;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V2AdditivePreservative <em>V2 Additive Preservative</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V2AdditivePreservative
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getV2AdditivePreservative()
	 * @generated
	 */
	int V2_ADDITIVE_PRESERVATIVE = 153;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasmntPrinciple <em>Measmnt Principle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasmntPrinciple
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMeasmntPrinciple()
	 * @generated
	 */
	int MEASMNT_PRINCIPLE = 154;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricOperationalStatus <em>Device Metric Operational Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricOperationalStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDeviceMetricOperationalStatus()
	 * @generated
	 */
	int DEVICE_METRIC_OPERATIONAL_STATUS = 155;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricColor <em>Device Metric Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricColor
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDeviceMetricColor()
	 * @generated
	 */
	int DEVICE_METRIC_COLOR = 156;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricCategory <em>Device Metric Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDeviceMetricCategory()
	 * @generated
	 */
	int DEVICE_METRIC_CATEGORY = 157;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricCalibrationType <em>Device Metric Calibration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricCalibrationType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDeviceMetricCalibrationType()
	 * @generated
	 */
	int DEVICE_METRIC_CALIBRATION_TYPE = 158;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricCalibrationState <em>Device Metric Calibration State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricCalibrationState
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDeviceMetricCalibrationState()
	 * @generated
	 */
	int DEVICE_METRIC_CALIBRATION_STATE = 159;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationReferenceRangeMeaningCodes <em>Observation Reference Range Meaning Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationReferenceRangeMeaningCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getObservationReferenceRangeMeaningCodes()
	 * @generated
	 */
	int OBSERVATION_REFERENCE_RANGE_MEANING_CODES = 160;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationRelationshipType <em>Observation Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationRelationshipType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getObservationRelationshipType()
	 * @generated
	 */
	int OBSERVATION_RELATIONSHIP_TYPE = 161;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanStatus <em>Care Plan Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCarePlanStatus()
	 * @generated
	 */
	int CARE_PLAN_STATUS = 162;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanCategory <em>Care Plan Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCarePlanCategory()
	 * @generated
	 */
	int CARE_PLAN_CATEGORY = 163;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireStatus <em>Questionnaire Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getQuestionnaireStatus()
	 * @generated
	 */
	int QUESTIONNAIRE_STATUS = 164;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContextOfUseValueSet <em>Context Of Use Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContextOfUseValueSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContextOfUseValueSet()
	 * @generated
	 */
	int CONTEXT_OF_USE_VALUE_SET = 165;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireQuestionCodes <em>Questionnaire Question Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireQuestionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getQuestionnaireQuestionCodes()
	 * @generated
	 */
	int QUESTIONNAIRE_QUESTION_CODES = 166;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireItemType <em>Questionnaire Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireItemType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getQuestionnaireItemType()
	 * @generated
	 */
	int QUESTIONNAIRE_ITEM_TYPE = 167;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireAnswerCodes <em>Questionnaire Answer Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireAnswerCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getQuestionnaireAnswerCodes()
	 * @generated
	 */
	int QUESTIONNAIRE_ANSWER_CODES = 168;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanRelationship <em>Care Plan Relationship</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanRelationship
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCarePlanRelationship()
	 * @generated
	 */
	int CARE_PLAN_RELATIONSHIP = 169;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GoalStatus <em>Goal Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GoalStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getGoalStatus()
	 * @generated
	 */
	int GOAL_STATUS = 170;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GoalCategory <em>Goal Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GoalCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getGoalCategory()
	 * @generated
	 */
	int GOAL_CATEGORY = 171;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GoalPriority <em>Goal Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GoalPriority
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getGoalPriority()
	 * @generated
	 */
	int GOAL_PRIORITY = 172;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GoalStartEvent <em>Goal Start Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GoalStartEvent
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getGoalStartEvent()
	 * @generated
	 */
	int GOAL_START_EVENT = 173;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GoalStatusReason <em>Goal Status Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GoalStatusReason
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getGoalStatusReason()
	 * @generated
	 */
	int GOAL_STATUS_REASON = 174;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationStatementStatus <em>Medication Statement Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationStatementStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMedicationStatementStatus()
	 * @generated
	 */
	int MEDICATION_STATEMENT_STATUS = 175;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationStatementNotTaken <em>Medication Statement Not Taken</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationStatementNotTaken
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMedicationStatementNotTaken()
	 * @generated
	 */
	int MEDICATION_STATEMENT_NOT_TAKEN = 176;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtDrugsNotTakencompletedCodes <em>Snomed Ct Drugs Not Takencompleted Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtDrugsNotTakencompletedCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtDrugsNotTakencompletedCodes()
	 * @generated
	 */
	int SNOMED_CT_DRUGS_NOT_TAKENCOMPLETED_CODES = 177;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationStatementCategory <em>Medication Statement Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationStatementCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMedicationStatementCategory()
	 * @generated
	 */
	int MEDICATION_STATEMENT_CATEGORY = 178;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NutritionOrderStatus <em>Nutrition Order Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NutritionOrderStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getNutritionOrderStatus()
	 * @generated
	 */
	int NUTRITION_ORDER_STATUS = 179;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.Diet <em>Diet</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.Diet
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDiet()
	 * @generated
	 */
	int DIET = 180;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FoodTypeCodes <em>Food Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FoodTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFoodTypeCodes()
	 * @generated
	 */
	int FOOD_TYPE_CODES = 181;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DietCodes <em>Diet Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DietCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDietCodes()
	 * @generated
	 */
	int DIET_CODES = 182;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NutrientModifierCodes <em>Nutrient Modifier Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NutrientModifierCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getNutrientModifierCodes()
	 * @generated
	 */
	int NUTRIENT_MODIFIER_CODES = 183;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TextureModifierCodes <em>Texture Modifier Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TextureModifierCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTextureModifierCodes()
	 * @generated
	 */
	int TEXTURE_MODIFIER_CODES = 184;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TextureModifiedFoodTypeCodes <em>Texture Modified Food Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TextureModifiedFoodTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTextureModifiedFoodTypeCodes()
	 * @generated
	 */
	int TEXTURE_MODIFIED_FOOD_TYPE_CODES = 185;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FluidConsistencyTypeCodes <em>Fluid Consistency Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FluidConsistencyTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFluidConsistencyTypeCodes()
	 * @generated
	 */
	int FLUID_CONSISTENCY_TYPE_CODES = 186;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplementTypeCodes <em>Supplement Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplementTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSupplementTypeCodes()
	 * @generated
	 */
	int SUPPLEMENT_TYPE_CODES = 187;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EnteralFormulaTypeCodes <em>Enteral Formula Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EnteralFormulaTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEnteralFormulaTypeCodes()
	 * @generated
	 */
	int ENTERAL_FORMULA_TYPE_CODES = 188;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EnteralFormulaAdditiveTypeCode <em>Enteral Formula Additive Type Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EnteralFormulaAdditiveTypeCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEnteralFormulaAdditiveTypeCode()
	 * @generated
	 */
	int ENTERAL_FORMULA_ADDITIVE_TYPE_CODE = 189;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EnteralRouteCodes <em>Enteral Route Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EnteralRouteCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEnteralRouteCodes()
	 * @generated
	 */
	int ENTERAL_ROUTE_CODES = 190;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RiskProbability <em>Risk Probability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RiskProbability
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getRiskProbability()
	 * @generated
	 */
	int RISK_PROBABILITY = 191;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AppointmentStatus <em>Appointment Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AppointmentStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAppointmentStatus()
	 * @generated
	 */
	int APPOINTMENT_STATUS = 192;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V2AppointmentReasonCodes <em>V2 Appointment Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V2AppointmentReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getV2AppointmentReasonCodes()
	 * @generated
	 */
	int V2_APPOINTMENT_REASON_CODES = 193;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EncounterReasonCodes <em>Encounter Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EncounterReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEncounterReasonCodes()
	 * @generated
	 */
	int ENCOUNTER_REASON_CODES = 194;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SlotStatus <em>Slot Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SlotStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSlotStatus()
	 * @generated
	 */
	int SLOT_STATUS = 195;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ParticipantType <em>Participant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ParticipantType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getParticipantType()
	 * @generated
	 */
	int PARTICIPANT_TYPE = 196;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ParticipantRequired <em>Participant Required</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ParticipantRequired
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getParticipantRequired()
	 * @generated
	 */
	int PARTICIPANT_REQUIRED = 197;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ParticipationStatus <em>Participation Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ParticipationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getParticipationStatus()
	 * @generated
	 */
	int PARTICIPATION_STATUS = 198;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemParticipationMode <em>V3 Code System Participation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemParticipationMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getV3CodeSystemParticipationMode()
	 * @generated
	 */
	int V3_CODE_SYSTEM_PARTICIPATION_MODE = 199;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CommunicationRequestStatus <em>Communication Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CommunicationRequestStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCommunicationRequestStatus()
	 * @generated
	 */
	int COMMUNICATION_REQUEST_STATUS = 200;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemActReason <em>V3 Code System Act Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemActReason
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getV3CodeSystemActReason()
	 * @generated
	 */
	int V3_CODE_SYSTEM_ACT_REASON = 201;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RequestStage <em>Request Stage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RequestStage
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getRequestStage()
	 * @generated
	 */
	int REQUEST_STAGE = 202;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationRequestStatus <em>Medication Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationRequestStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMedicationRequestStatus()
	 * @generated
	 */
	int MEDICATION_REQUEST_STATUS = 203;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationRequestStage <em>Medication Request Stage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationRequestStage
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMedicationRequestStage()
	 * @generated
	 */
	int MEDICATION_REQUEST_STAGE = 204;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationRequestCategory <em>Medication Request Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationRequestCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMedicationRequestCategory()
	 * @generated
	 */
	int MEDICATION_REQUEST_CATEGORY = 205;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SubstanceAdminSubstitutionReason <em>Substance Admin Substitution Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SubstanceAdminSubstitutionReason
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSubstanceAdminSubstitutionReason()
	 * @generated
	 */
	int SUBSTANCE_ADMIN_SUBSTITUTION_REASON = 206;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FinancialResourceStatusCodes <em>Financial Resource Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FinancialResourceStatusCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFinancialResourceStatusCodes()
	 * @generated
	 */
	int FINANCIAL_RESOURCE_STATUS_CODES = 207;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActionList <em>Action List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActionList
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getActionList()
	 * @generated
	 */
	int ACTION_LIST = 208;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleVisionPrescriptionProductCodes <em>Example Vision Prescription Product Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleVisionPrescriptionProductCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExampleVisionPrescriptionProductCodes()
	 * @generated
	 */
	int EXAMPLE_VISION_PRESCRIPTION_PRODUCT_CODES = 209;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.VisionEyes <em>Vision Eyes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.VisionEyes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getVisionEyes()
	 * @generated
	 */
	int VISION_EYES = 210;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.VisionBase <em>Vision Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.VisionBase
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getVisionBase()
	 * @generated
	 */
	int VISION_BASE = 211;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanActivityCategory <em>Care Plan Activity Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanActivityCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCarePlanActivityCategory()
	 * @generated
	 */
	int CARE_PLAN_ACTIVITY_CATEGORY = 212;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanActivity <em>Care Plan Activity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanActivity
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCarePlanActivity()
	 * @generated
	 */
	int CARE_PLAN_ACTIVITY = 213;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActivityReason <em>Activity Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActivityReason
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getActivityReason()
	 * @generated
	 */
	int ACTIVITY_REASON = 214;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanActivityStatus <em>Care Plan Activity Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanActivityStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCarePlanActivityStatus()
	 * @generated
	 */
	int CARE_PLAN_ACTIVITY_STATUS = 215;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ReferralStatus <em>Referral Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ReferralStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getReferralStatus()
	 * @generated
	 */
	int REFERRAL_STATUS = 216;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ReferralCategory <em>Referral Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ReferralCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getReferralCategory()
	 * @generated
	 */
	int REFERRAL_CATEGORY = 217;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureStatus <em>Procedure Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProcedureStatus()
	 * @generated
	 */
	int PROCEDURE_STATUS = 218;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureCategoryCodessnomedCT <em>Procedure Category Codessnomed CT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureCategoryCodessnomedCT
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProcedureCategoryCodessnomedCT()
	 * @generated
	 */
	int PROCEDURE_CATEGORY_CODESSNOMED_CT = 219;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedurePerformerRoleCodes <em>Procedure Performer Role Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedurePerformerRoleCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProcedurePerformerRoleCodes()
	 * @generated
	 */
	int PROCEDURE_PERFORMER_ROLE_CODES = 220;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureNotPerformedReasonsnomeDCT <em>Procedure Not Performed Reasonsnome DCT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureNotPerformedReasonsnomeDCT
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProcedureNotPerformedReasonsnomeDCT()
	 * @generated
	 */
	int PROCEDURE_NOT_PERFORMED_REASONSNOME_DCT = 221;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureOutcomeCodessnomedCT <em>Procedure Outcome Codessnomed CT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureOutcomeCodessnomedCT
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProcedureOutcomeCodessnomedCT()
	 * @generated
	 */
	int PROCEDURE_OUTCOME_CODESSNOMED_CT = 222;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DiagnosticReportStatus <em>Diagnostic Report Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DiagnosticReportStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDiagnosticReportStatus()
	 * @generated
	 */
	int DIAGNOSTIC_REPORT_STATUS = 223;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DiagnosticServiceSectionCodes <em>Diagnostic Service Section Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DiagnosticServiceSectionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDiagnosticServiceSectionCodes()
	 * @generated
	 */
	int DIAGNOSTIC_SERVICE_SECTION_CODES = 224;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LoincDiagnosticReportCodes <em>Loinc Diagnostic Report Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LoincDiagnosticReportCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getLoincDiagnosticReportCodes()
	 * @generated
	 */
	int LOINC_DIAGNOSTIC_REPORT_CODES = 225;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.InstanceAvailability <em>Instance Availability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.InstanceAvailability
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getInstanceAvailability()
	 * @generated
	 */
	int INSTANCE_AVAILABILITY = 226;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AcquisitionModalityCodes <em>Acquisition Modality Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AcquisitionModalityCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAcquisitionModalityCodes()
	 * @generated
	 */
	int ACQUISITION_MODALITY_CODES = 227;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DWebType <em>DWeb Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DWebType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDWebType()
	 * @generated
	 */
	int DWEB_TYPE = 228;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.Laterality <em>Laterality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.Laterality
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getLaterality()
	 * @generated
	 */
	int LATERALITY = 229;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.KoStitle <em>Ko Stitle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.KoStitle
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getKoStitle()
	 * @generated
	 */
	int KO_STITLE = 230;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DigitalMediaType <em>Digital Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DigitalMediaType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDigitalMediaType()
	 * @generated
	 */
	int DIGITAL_MEDIA_TYPE = 231;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MediaSubType <em>Media Sub Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MediaSubType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMediaSubType()
	 * @generated
	 */
	int MEDIA_SUB_TYPE = 232;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MediaCollectionViewProjection <em>Media Collection View Projection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MediaCollectionViewProjection
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMediaCollectionViewProjection()
	 * @generated
	 */
	int MEDIA_COLLECTION_VIEW_PROJECTION = 233;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtClinicalFindings <em>Snomed Ct Clinical Findings</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtClinicalFindings
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtClinicalFindings()
	 * @generated
	 */
	int SNOMED_CT_CLINICAL_FINDINGS = 234;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureFollowUpCodessnomedCT <em>Procedure Follow Up Codessnomed CT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureFollowUpCodessnomedCT
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProcedureFollowUpCodessnomedCT()
	 * @generated
	 */
	int PROCEDURE_FOLLOW_UP_CODESSNOMED_CT = 235;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureDeviceActionCodes <em>Procedure Device Action Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureDeviceActionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProcedureDeviceActionCodes()
	 * @generated
	 */
	int PROCEDURE_DEVICE_ACTION_CODES = 236;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationAdministrationStatus <em>Medication Administration Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationAdministrationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMedicationAdministrationStatus()
	 * @generated
	 */
	int MEDICATION_ADMINISTRATION_STATUS = 237;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtReasonMedicationNotGivenCodes <em>Snomed Ct Reason Medication Not Given Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtReasonMedicationNotGivenCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtReasonMedicationNotGivenCodes()
	 * @generated
	 */
	int SNOMED_CT_REASON_MEDICATION_NOT_GIVEN_CODES = 238;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ReasonMedicationGivenCodes <em>Reason Medication Given Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ReasonMedicationGivenCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getReasonMedicationGivenCodes()
	 * @generated
	 */
	int REASON_MEDICATION_GIVEN_CODES = 239;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireResponseStatus <em>Questionnaire Response Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireResponseStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getQuestionnaireResponseStatus()
	 * @generated
	 */
	int QUESTIONNAIRE_RESPONSE_STATUS = 240;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SequenceType <em>Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SequenceType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 241;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.Chromosomehuman <em>Chromosomehuman</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.Chromosomehuman
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getChromosomehuman()
	 * @generated
	 */
	int CHROMOSOMEHUMAN = 242;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.Ensembl <em>Ensembl</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.Ensembl
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEnsembl()
	 * @generated
	 */
	int ENSEMBL = 243;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QualityType <em>Quality Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QualityType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getQualityType()
	 * @generated
	 */
	int QUALITY_TYPE = 244;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RepositoryType <em>Repository Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RepositoryType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getRepositoryType()
	 * @generated
	 */
	int REPOSITORY_TYPE = 245;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FamilyHistoryStatus <em>Family History Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FamilyHistoryStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFamilyHistoryStatus()
	 * @generated
	 */
	int FAMILY_HISTORY_STATUS = 246;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FamilyMember <em>Family Member</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FamilyMember
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFamilyMember()
	 * @generated
	 */
	int FAMILY_MEMBER = 247;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionOutcomeCodes <em>Condition Outcome Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionOutcomeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConditionOutcomeCodes()
	 * @generated
	 */
	int CONDITION_OUTCOME_CODES = 248;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ClinicalImpressionPrognosis <em>Clinical Impression Prognosis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ClinicalImpressionPrognosis
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getClinicalImpressionPrognosis()
	 * @generated
	 */
	int CLINICAL_IMPRESSION_PROGNOSIS = 249;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ManifestationAndSymptomCodes <em>Manifestation And Symptom Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ManifestationAndSymptomCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getManifestationAndSymptomCodes()
	 * @generated
	 */
	int MANIFESTATION_AND_SYMPTOM_CODES = 250;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AccountStatus <em>Account Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AccountStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAccountStatus()
	 * @generated
	 */
	int ACCOUNT_STATUS = 251;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CoverageTypeCodes <em>Coverage Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CoverageTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCoverageTypeCodes()
	 * @generated
	 */
	int COVERAGE_TYPE_CODES = 252;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PolicyholderRelationshipCodes <em>Policyholder Relationship Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PolicyholderRelationshipCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPolicyholderRelationshipCodes()
	 * @generated
	 */
	int POLICYHOLDER_RELATIONSHIP_CODES = 253;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractTypeCodes <em>Contract Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContractTypeCodes()
	 * @generated
	 */
	int CONTRACT_TYPE_CODES = 254;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractSubtypeCodes <em>Contract Subtype Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractSubtypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContractSubtypeCodes()
	 * @generated
	 */
	int CONTRACT_SUBTYPE_CODES = 255;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractActionCodes <em>Contract Action Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractActionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContractActionCodes()
	 * @generated
	 */
	int CONTRACT_ACTION_CODES = 256;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractActorRoleCodes <em>Contract Actor Role Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractActorRoleCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContractActorRoleCodes()
	 * @generated
	 */
	int CONTRACT_ACTOR_ROLE_CODES = 257;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractSignerTypeCodes <em>Contract Signer Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractSignerTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContractSignerTypeCodes()
	 * @generated
	 */
	int CONTRACT_SIGNER_TYPE_CODES = 258;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractTermTypeCodes <em>Contract Term Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractTermTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContractTermTypeCodes()
	 * @generated
	 */
	int CONTRACT_TERM_TYPE_CODES = 259;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractTermTypeCodes <em>Contract Term Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractTermTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContractTermTypeCodes()
	 * @generated
	 */
	int CONTRACT_TERM_TYPE_CODES = 260;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractTermTypeCodes <em>Contract Term Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractTermTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContractTermTypeCodes()
	 * @generated
	 */
	int CONTRACT_TERM_TYPE_CODES = 260;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FhirDocumentTypeCodes <em>Fhir Document Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FhirDocumentTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFhirDocumentTypeCodes()
	 * @generated
	 */
	int FHIR_DOCUMENT_TYPE_CODES = 261;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FhirDocumentClassCodes <em>Fhir Document Class Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FhirDocumentClassCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFhirDocumentClassCodes()
	 * @generated
	 */
	int FHIR_DOCUMENT_CLASS_CODES = 262;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConfidentialityClassification <em>Confidentiality Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConfidentialityClassification
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConfidentialityClassification()
	 * @generated
	 */
	int CONFIDENTIALITY_CLASSIFICATION = 263;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CompositionAttestationMode <em>Composition Attestation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CompositionAttestationMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCompositionAttestationMode()
	 * @generated
	 */
	int COMPOSITION_ATTESTATION_MODE = 264;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemActCode <em>V3 Code System Act Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemActCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getV3CodeSystemActCode()
	 * @generated
	 */
	int V3_CODE_SYSTEM_ACT_CODE = 265;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentSectionCodes <em>Document Section Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentSectionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDocumentSectionCodes()
	 * @generated
	 */
	int DOCUMENT_SECTION_CODES = 266;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ListMode <em>List Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ListMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getListMode()
	 * @generated
	 */
	int LIST_MODE = 267;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ListOrderCodes <em>List Order Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ListOrderCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getListOrderCodes()
	 * @generated
	 */
	int LIST_ORDER_CODES = 268;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ListEmptyReasons <em>List Empty Reasons</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ListEmptyReasons
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getListEmptyReasons()
	 * @generated
	 */
	int LIST_EMPTY_REASONS = 269;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AdmitSource <em>Admit Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AdmitSource
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAdmitSource()
	 * @generated
	 */
	int ADMIT_SOURCE = 270;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V2ReAdmissionIndicator <em>V2 Re Admission Indicator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V2ReAdmissionIndicator
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getV2ReAdmissionIndicator()
	 * @generated
	 */
	int V2_RE_ADMISSION_INDICATOR = 271;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SpecialCourtesy <em>Special Courtesy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SpecialCourtesy
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSpecialCourtesy()
	 * @generated
	 */
	int SPECIAL_COURTESY = 272;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SpecialArrangements <em>Special Arrangements</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SpecialArrangements
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSpecialArrangements()
	 * @generated
	 */
	int SPECIAL_ARRANGEMENTS = 273;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DischargeDisposition <em>Discharge Disposition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DischargeDisposition
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDischargeDisposition()
	 * @generated
	 */
	int DISCHARGE_DISPOSITION = 274;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EncounterLocationStatus <em>Encounter Location Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EncounterLocationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEncounterLocationStatus()
	 * @generated
	 */
	int ENCOUNTER_LOCATION_STATUS = 275;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FacilityTypeCodeValueSet <em>Facility Type Code Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FacilityTypeCodeValueSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFacilityTypeCodeValueSet()
	 * @generated
	 */
	int FACILITY_TYPE_CODE_VALUE_SET = 276;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentExceptType <em>Consent Except Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentExceptType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConsentExceptType()
	 * @generated
	 */
	int CONSENT_EXCEPT_TYPE = 277;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentActorRoles <em>Consent Actor Roles</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentActorRoles
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConsentActorRoles()
	 * @generated
	 */
	int CONSENT_ACTOR_ROLES = 278;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentActionCodes <em>Consent Action Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentActionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConsentActionCodes()
	 * @generated
	 */
	int CONSENT_ACTION_CODES = 279;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentContentClass <em>Consent Content Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentContentClass
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConsentContentClass()
	 * @generated
	 */
	int CONSENT_CONTENT_CLASS = 280;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentContentCodes <em>Consent Content Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentContentCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConsentContentCodes()
	 * @generated
	 */
	int CONSENT_CONTENT_CODES = 281;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentDataMeaning <em>Consent Data Meaning</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentDataMeaning
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConsentDataMeaning()
	 * @generated
	 */
	int CONSENT_DATA_MEANING = 282;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CommunicationStatus <em>Communication Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CommunicationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCommunicationStatus()
	 * @generated
	 */
	int COMMUNICATION_STATUS = 283;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NamingSystemType <em>Naming System Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NamingSystemType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getNamingSystemType()
	 * @generated
	 */
	int NAMING_SYSTEM_TYPE = 284;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NamingSystemIdentifierType <em>Naming System Identifier Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NamingSystemIdentifierType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getNamingSystemIdentifierType()
	 * @generated
	 */
	int NAMING_SYSTEM_IDENTIFIER_TYPE = 285;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConceptMapEquivalence <em>Concept Map Equivalence</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConceptMapEquivalence
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConceptMapEquivalence()
	 * @generated
	 */
	int CONCEPT_MAP_EQUIVALENCE = 286;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IdentityAssuranceLevel <em>Identity Assurance Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IdentityAssuranceLevel
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getIdentityAssuranceLevel()
	 * @generated
	 */
	int IDENTITY_ASSURANCE_LEVEL = 287;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FlagCategory <em>Flag Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FlagCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFlagCategory()
	 * @generated
	 */
	int FLAG_CATEGORY = 288;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FlagStatus <em>Flag Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FlagStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFlagStatus()
	 * @generated
	 */
	int FLAG_STATUS = 289;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FlagCode <em>Flag Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FlagCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFlagCode()
	 * @generated
	 */
	int FLAG_CODE = 290;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CodeSystemHierarchyMeaning <em>Code System Hierarchy Meaning</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CodeSystemHierarchyMeaning
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCodeSystemHierarchyMeaning()
	 * @generated
	 */
	int CODE_SYSTEM_HIERARCHY_MEANING = 291;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CodeSystemContentMode <em>Code System Content Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CodeSystemContentMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCodeSystemContentMode()
	 * @generated
	 */
	int CODE_SYSTEM_CONTENT_MODE = 292;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PropertyType <em>Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PropertyType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 293;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ClaimProcessingCodes <em>Claim Processing Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ClaimProcessingCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getClaimProcessingCodes()
	 * @generated
	 */
	int CLAIM_PROCESSING_CODES = 294;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PaymentTypeCodes <em>Payment Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PaymentTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPaymentTypeCodes()
	 * @generated
	 */
	int PAYMENT_TYPE_CODES = 295;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FormCodes <em>Form Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FormCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFormCodes()
	 * @generated
	 */
	int FORM_CODES = 296;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NoteType <em>Note Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NoteType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getNoteType()
	 * @generated
	 */
	int NOTE_TYPE = 297;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TestScriptProfileOriginType <em>Test Script Profile Origin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TestScriptProfileOriginType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTestScriptProfileOriginType()
	 * @generated
	 */
	int TEST_SCRIPT_PROFILE_ORIGIN_TYPE = 298;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TestScriptProfileDestinationType <em>Test Script Profile Destination Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TestScriptProfileDestinationType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTestScriptProfileDestinationType()
	 * @generated
	 */
	int TEST_SCRIPT_PROFILE_DESTINATION_TYPE = 299;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CapabilityStatementKind <em>Capability Statement Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CapabilityStatementKind
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCapabilityStatementKind()
	 * @generated
	 */
	int CAPABILITY_STATEMENT_KIND = 300;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.UnknownContentCode <em>Unknown Content Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.UnknownContentCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getUnknownContentCode()
	 * @generated
	 */
	int UNKNOWN_CONTENT_CODE = 301;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RestfulCapabilityMode <em>Restful Capability Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RestfulCapabilityMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getRestfulCapabilityMode()
	 * @generated
	 */
	int RESTFUL_CAPABILITY_MODE = 302;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RestfulSecurityService <em>Restful Security Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RestfulSecurityService
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getRestfulSecurityService()
	 * @generated
	 */
	int RESTFUL_SECURITY_SERVICE = 303;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TypeRestfulInteraction <em>Type Restful Interaction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TypeRestfulInteraction
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTypeRestfulInteraction()
	 * @generated
	 */
	int TYPE_RESTFUL_INTERACTION = 304;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ResourceVersionPolicy <em>Resource Version Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ResourceVersionPolicy
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getResourceVersionPolicy()
	 * @generated
	 */
	int RESOURCE_VERSION_POLICY = 305;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionalReadStatus <em>Conditional Read Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionalReadStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConditionalReadStatus()
	 * @generated
	 */
	int CONDITIONAL_READ_STATUS = 306;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionalDeleteStatus <em>Conditional Delete Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionalDeleteStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getConditionalDeleteStatus()
	 * @generated
	 */
	int CONDITIONAL_DELETE_STATUS = 307;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ReferenceHandlingPolicy <em>Reference Handling Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ReferenceHandlingPolicy
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getReferenceHandlingPolicy()
	 * @generated
	 */
	int REFERENCE_HANDLING_POLICY = 308;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SearchParamType <em>Search Param Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SearchParamType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSearchParamType()
	 * @generated
	 */
	int SEARCH_PARAM_TYPE = 309;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SystemRestfulInteraction <em>System Restful Interaction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SystemRestfulInteraction
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSystemRestfulInteraction()
	 * @generated
	 */
	int SYSTEM_RESTFUL_INTERACTION = 310;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.OperationKind <em>Operation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.OperationKind
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getOperationKind()
	 * @generated
	 */
	int OPERATION_KIND = 311;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MessageTransport <em>Message Transport</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MessageTransport
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMessageTransport()
	 * @generated
	 */
	int MESSAGE_TRANSPORT = 312;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MessageEvent <em>Message Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MessageEvent
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMessageEvent()
	 * @generated
	 */
	int MESSAGE_EVENT = 313;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MessageSignificanceCategory <em>Message Significance Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MessageSignificanceCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMessageSignificanceCategory()
	 * @generated
	 */
	int MESSAGE_SIGNIFICANCE_CATEGORY = 314;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EventCapabilityMode <em>Event Capability Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EventCapabilityMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getEventCapabilityMode()
	 * @generated
	 */
	int EVENT_CAPABILITY_MODE = 315;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentMode <em>Document Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDocumentMode()
	 * @generated
	 */
	int DOCUMENT_MODE = 316;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TestScriptOperationCode <em>Test Script Operation Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TestScriptOperationCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTestScriptOperationCode()
	 * @generated
	 */
	int TEST_SCRIPT_OPERATION_CODE = 317;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContentType <em>Content Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContentType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 318;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AssertionDirectionType <em>Assertion Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AssertionDirectionType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAssertionDirectionType()
	 * @generated
	 */
	int ASSERTION_DIRECTION_TYPE = 319;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AssertionOperatorType <em>Assertion Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AssertionOperatorType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAssertionOperatorType()
	 * @generated
	 */
	int ASSERTION_OPERATOR_TYPE = 320;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AssertionResponseTypes <em>Assertion Response Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AssertionResponseTypes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAssertionResponseTypes()
	 * @generated
	 */
	int ASSERTION_RESPONSE_TYPES = 321;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DataElementStringency <em>Data Element Stringency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DataElementStringency
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDataElementStringency()
	 * @generated
	 */
	int DATA_ELEMENT_STRINGENCY = 322;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ResponseType <em>Response Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ResponseType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getResponseType()
	 * @generated
	 */
	int RESPONSE_TYPE = 323;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IssueSeverity <em>Issue Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IssueSeverity
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getIssueSeverity()
	 * @generated
	 */
	int ISSUE_SEVERITY = 324;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IssueType <em>Issue Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IssueType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getIssueType()
	 * @generated
	 */
	int ISSUE_TYPE = 325;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.OperationOutcomeCodes <em>Operation Outcome Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.OperationOutcomeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getOperationOutcomeCodes()
	 * @generated
	 */
	int OPERATION_OUTCOME_CODES = 326;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleMessageReasonCodes <em>Example Message Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleMessageReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExampleMessageReasonCodes()
	 * @generated
	 */
	int EXAMPLE_MESSAGE_REASON_CODES = 327;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SubscriptionStatus <em>Subscription Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SubscriptionStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSubscriptionStatus()
	 * @generated
	 */
	int SUBSCRIPTION_STATUS = 328;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SubscriptionChannelType <em>Subscription Channel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SubscriptionChannelType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSubscriptionChannelType()
	 * @generated
	 */
	int SUBSCRIPTION_CHANNEL_TYPE = 329;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SubscriptionTag <em>Subscription Tag</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SubscriptionTag
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSubscriptionTag()
	 * @generated
	 */
	int SUBSCRIPTION_TAG = 330;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BodysiteLocationModifier <em>Bodysite Location Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BodysiteLocationModifier
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getBodysiteLocationModifier()
	 * @generated
	 */
	int BODYSITE_LOCATION_MODIFIER = 331;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.VaccineAdministeredValueSet <em>Vaccine Administered Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.VaccineAdministeredValueSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getVaccineAdministeredValueSet()
	 * @generated
	 */
	int VACCINE_ADMINISTERED_VALUE_SET = 332;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationRecommendationStatusCodes <em>Immunization Recommendation Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationRecommendationStatusCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getImmunizationRecommendationStatusCodes()
	 * @generated
	 */
	int IMMUNIZATION_RECOMMENDATION_STATUS_CODES = 333;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationRecommendationDateCriterionCodes <em>Immunization Recommendation Date Criterion Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationRecommendationDateCriterionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getImmunizationRecommendationDateCriterionCodes()
	 * @generated
	 */
	int IMMUNIZATION_RECOMMENDATION_DATE_CRITERION_CODES = 334;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationStatusCodes <em>Immunization Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationStatusCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getImmunizationStatusCodes()
	 * @generated
	 */
	int IMMUNIZATION_STATUS_CODES = 335;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationOrigin <em>Immunization Origin</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationOrigin
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getImmunizationOrigin()
	 * @generated
	 */
	int IMMUNIZATION_ORIGIN = 336;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CodesForImmunizationSiteOfAdministration <em>Codes For Immunization Site Of Administration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CodesForImmunizationSiteOfAdministration
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCodesForImmunizationSiteOfAdministration()
	 * @generated
	 */
	int CODES_FOR_IMMUNIZATION_SITE_OF_ADMINISTRATION = 337;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationRouteCodes <em>Immunization Route Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationRouteCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getImmunizationRouteCodes()
	 * @generated
	 */
	int IMMUNIZATION_ROUTE_CODES = 338;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationReasonCodes <em>Immunization Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getImmunizationReasonCodes()
	 * @generated
	 */
	int IMMUNIZATION_REASON_CODES = 339;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationReasonsForNotImmunizingCodes <em>Immunization Reasons For Not Immunizing Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationReasonsForNotImmunizingCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getImmunizationReasonsForNotImmunizingCodes()
	 * @generated
	 */
	int IMMUNIZATION_REASONS_FOR_NOT_IMMUNIZING_CODES = 340;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.VaccinationProtocolDoseTargetCodes <em>Vaccination Protocol Dose Target Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.VaccinationProtocolDoseTargetCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getVaccinationProtocolDoseTargetCodes()
	 * @generated
	 */
	int VACCINATION_PROTOCOL_DOSE_TARGET_CODES = 341;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.VaccinationProtocolDoseStatusCodes <em>Vaccination Protocol Dose Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.VaccinationProtocolDoseStatusCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getVaccinationProtocolDoseStatusCodes()
	 * @generated
	 */
	int VACCINATION_PROTOCOL_DOSE_STATUS_CODES = 342;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.VaccinationProtocolDoseStatusReasonCodes <em>Vaccination Protocol Dose Status Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.VaccinationProtocolDoseStatusReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getVaccinationProtocolDoseStatusReasonCodes()
	 * @generated
	 */
	int VACCINATION_PROTOCOL_DOSE_STATUS_REASON_CODES = 343;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BundleType <em>Bundle Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BundleType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getBundleType()
	 * @generated
	 */
	int BUNDLE_TYPE = 344;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SearchEntryMode <em>Search Entry Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SearchEntryMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSearchEntryMode()
	 * @generated
	 */
	int SEARCH_ENTRY_MODE = 345;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.HttpVerb <em>Http Verb</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.HttpVerb
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getHttpVerb()
	 * @generated
	 */
	int HTTP_VERB = 346;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TestReportStatus <em>Test Report Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TestReportStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTestReportStatus()
	 * @generated
	 */
	int TEST_REPORT_STATUS = 347;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TestReportParticipantType <em>Test Report Participant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TestReportParticipantType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTestReportParticipantType()
	 * @generated
	 */
	int TEST_REPORT_PARTICIPANT_TYPE = 348;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TestReportResultCodes <em>Test Report Result Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TestReportResultCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTestReportResultCodes()
	 * @generated
	 */
	int TEST_REPORT_RESULT_CODES = 349;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PriorityCodes <em>Priority Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PriorityCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPriorityCodes()
	 * @generated
	 */
	int PRIORITY_CODES = 350;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BenefitCategoryCodes <em>Benefit Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BenefitCategoryCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getBenefitCategoryCodes()
	 * @generated
	 */
	int BENEFIT_CATEGORY_CODES = 351;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BenefitSubCategoryCodes <em>Benefit Sub Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BenefitSubCategoryCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getBenefitSubCategoryCodes()
	 * @generated
	 */
	int BENEFIT_SUB_CATEGORY_CODES = 352;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NetworkTypeCodes <em>Network Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NetworkTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getNetworkTypeCodes()
	 * @generated
	 */
	int NETWORK_TYPE_CODES = 353;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.UnitTypeCodes <em>Unit Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.UnitTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getUnitTypeCodes()
	 * @generated
	 */
	int UNIT_TYPE_CODES = 354;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BenefitTermCodes <em>Benefit Term Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BenefitTermCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getBenefitTermCodes()
	 * @generated
	 */
	int BENEFIT_TERM_CODES = 355;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BenefitTypeCodes <em>Benefit Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BenefitTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getBenefitTypeCodes()
	 * @generated
	 */
	int BENEFIT_TYPE_CODES = 356;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AdjudicationErrorCodes <em>Adjudication Error Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AdjudicationErrorCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAdjudicationErrorCodes()
	 * @generated
	 */
	int ADJUDICATION_ERROR_CODES = 357;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationDispenseStatus <em>Medication Dispense Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationDispenseStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMedicationDispenseStatus()
	 * @generated
	 */
	int MEDICATION_DISPENSE_STATUS = 358;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActPharmacySupplyType <em>Act Pharmacy Supply Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActPharmacySupplyType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getActPharmacySupplyType()
	 * @generated
	 */
	int ACT_PHARMACY_SUPPLY_TYPE = 359;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActSubstanceAdminSubstitutionCode <em>Act Substance Admin Substitution Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActSubstanceAdminSubstitutionCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getActSubstanceAdminSubstitutionCode()
	 * @generated
	 */
	int ACT_SUBSTANCE_ADMIN_SUBSTITUTION_CODE = 360;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasureScoring <em>Measure Scoring</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasureScoring
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMeasureScoring()
	 * @generated
	 */
	int MEASURE_SCORING = 361;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CompositeMeasureScoring <em>Composite Measure Scoring</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CompositeMeasureScoring
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCompositeMeasureScoring()
	 * @generated
	 */
	int COMPOSITE_MEASURE_SCORING = 362;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasureType <em>Measure Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasureType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMeasureType()
	 * @generated
	 */
	int MEASURE_TYPE = 363;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasurePopulationType <em>Measure Population Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasurePopulationType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMeasurePopulationType()
	 * @generated
	 */
	int MEASURE_POPULATION_TYPE = 364;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasureDataUsage <em>Measure Data Usage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasureDataUsage
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMeasureDataUsage()
	 * @generated
	 */
	int MEASURE_DATA_USAGE = 365;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasureReportType <em>Measure Report Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasureReportType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMeasureReportType()
	 * @generated
	 */
	int MEASURE_REPORT_TYPE = 366;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasureReportStatus <em>Measure Report Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasureReportStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMeasureReportStatus()
	 * @generated
	 */
	int MEASURE_REPORT_STATUS = 367;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ListStatus <em>List Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ListStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getListStatus()
	 * @generated
	 */
	int LIST_STATUS = 368;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleUseCodesForList <em>Example Use Codes For List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleUseCodesForList
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExampleUseCodesForList()
	 * @generated
	 */
	int EXAMPLE_USE_CODES_FOR_LIST = 369;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PatientMedicineChangeTypes <em>Patient Medicine Change Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PatientMedicineChangeTypes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPatientMedicineChangeTypes()
	 * @generated
	 */
	int PATIENT_MEDICINE_CHANGE_TYPES = 370;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleClaimTypeCodes <em>Example Claim Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleClaimTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExampleClaimTypeCodes()
	 * @generated
	 */
	int EXAMPLE_CLAIM_TYPE_CODES = 371;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleClaimSubTypeCodes <em>Example Claim Sub Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleClaimSubTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExampleClaimSubTypeCodes()
	 * @generated
	 */
	int EXAMPLE_CLAIM_SUB_TYPE_CODES = 372;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.Use <em>Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.Use
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getUse()
	 * @generated
	 */
	int USE = 373;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FundsReservationCodes <em>Funds Reservation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FundsReservationCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getFundsReservationCodes()
	 * @generated
	 */
	int FUNDS_RESERVATION_CODES = 374;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleRelatedClaimRelationshipCodes <em>Example Related Claim Relationship Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleRelatedClaimRelationshipCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExampleRelatedClaimRelationshipCodes()
	 * @generated
	 */
	int EXAMPLE_RELATED_CLAIM_RELATIONSHIP_CODES = 375;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PayeeTypeCodes <em>Payee Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PayeeTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPayeeTypeCodes()
	 * @generated
	 */
	int PAYEE_TYPE_CODES = 376;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PayeeResourceType <em>Payee Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PayeeResourceType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPayeeResourceType()
	 * @generated
	 */
	int PAYEE_RESOURCE_TYPE = 377;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PayeeResourceType <em>Payee Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PayeeResourceType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPayeeResourceType()
	 * @generated
	 */
	int PAYEE_RESOURCE_TYPE = 403;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ClaimCareTeamRoleCodes <em>Claim Care Team Role Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ClaimCareTeamRoleCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getClaimCareTeamRoleCodes()
	 * @generated
	 */
	int CLAIM_CARE_TEAM_ROLE_CODES = 378;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleProviderQualificationCodes <em>Example Provider Qualification Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleProviderQualificationCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExampleProviderQualificationCodes()
	 * @generated
	 */
	int EXAMPLE_PROVIDER_QUALIFICATION_CODES = 379;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ClaimInformationCategoryCodes <em>Claim Information Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ClaimInformationCategoryCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getClaimInformationCategoryCodes()
	 * @generated
	 */
	int CLAIM_INFORMATION_CATEGORY_CODES = 380;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExceptionCodes <em>Exception Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExceptionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExceptionCodes()
	 * @generated
	 */
	int EXCEPTION_CODES = 381;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MissingToothReasonCodes <em>Missing Tooth Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MissingToothReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMissingToothReasonCodes()
	 * @generated
	 */
	int MISSING_TOOTH_REASON_CODES = 382;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IcD10Codes <em>Ic D10 Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IcD10Codes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getIcD10Codes()
	 * @generated
	 */
	int IC_D10_CODES = 383;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleDiagnosisTypeCodes <em>Example Diagnosis Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleDiagnosisTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExampleDiagnosisTypeCodes()
	 * @generated
	 */
	int EXAMPLE_DIAGNOSIS_TYPE_CODES = 384;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleDiagnosisRelatedGroupCodes <em>Example Diagnosis Related Group Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleDiagnosisRelatedGroupCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExampleDiagnosisRelatedGroupCodes()
	 * @generated
	 */
	int EXAMPLE_DIAGNOSIS_RELATED_GROUP_CODES = 385;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IcD10ProcedureCodes <em>Ic D10 Procedure Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IcD10ProcedureCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getIcD10ProcedureCodes()
	 * @generated
	 */
	int IC_D10_PROCEDURE_CODES = 386;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActIncidentCode <em>Act Incident Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActIncidentCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getActIncidentCode()
	 * @generated
	 */
	int ACT_INCIDENT_CODE = 387;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleRevenueCenterCodes <em>Example Revenue Center Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleRevenueCenterCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExampleRevenueCenterCodes()
	 * @generated
	 */
	int EXAMPLE_REVENUE_CENTER_CODES = 388;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.UsclsCodes <em>Uscls Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.UsclsCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getUsclsCodes()
	 * @generated
	 */
	int USCLS_CODES = 389;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ModifierTypeCodes <em>Modifier Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ModifierTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getModifierTypeCodes()
	 * @generated
	 */
	int MODIFIER_TYPE_CODES = 390;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleProgramReasonCodes <em>Example Program Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleProgramReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExampleProgramReasonCodes()
	 * @generated
	 */
	int EXAMPLE_PROGRAM_REASON_CODES = 391;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleServicePlaceCodes <em>Example Service Place Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleServicePlaceCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExampleServicePlaceCodes()
	 * @generated
	 */
	int EXAMPLE_SERVICE_PLACE_CODES = 392;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.OralSiteCodes <em>Oral Site Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.OralSiteCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getOralSiteCodes()
	 * @generated
	 */
	int ORAL_SITE_CODES = 393;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SurfaceCodes <em>Surface Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SurfaceCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSurfaceCodes()
	 * @generated
	 */
	int SURFACE_CODES = 394;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.OralProsthoMaterialTypeCodes <em>Oral Prostho Material Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.OralProsthoMaterialTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getOralProsthoMaterialTypeCodes()
	 * @generated
	 */
	int ORAL_PROSTHO_MATERIAL_TYPE_CODES = 395;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AdjudicationCodes <em>Adjudication Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AdjudicationCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAdjudicationCodes()
	 * @generated
	 */
	int ADJUDICATION_CODES = 396;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AdjudicationReasonCodes <em>Adjudication Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AdjudicationReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAdjudicationReasonCodes()
	 * @generated
	 */
	int ADJUDICATION_REASON_CODES = 397;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExamplePaymentTypeCodes <em>Example Payment Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExamplePaymentTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExamplePaymentTypeCodes()
	 * @generated
	 */
	int EXAMPLE_PAYMENT_TYPE_CODES = 398;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PaymentAdjustmentReasonCodes <em>Payment Adjustment Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PaymentAdjustmentReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPaymentAdjustmentReasonCodes()
	 * @generated
	 */
	int PAYMENT_ADJUSTMENT_REASON_CODES = 399;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TaskStatus <em>Task Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TaskStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTaskStatus()
	 * @generated
	 */
	int TASK_STATUS = 400;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TaskPerformerType <em>Task Performer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TaskPerformerType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getTaskPerformerType()
	 * @generated
	 */
	int TASK_PERFORMER_TYPE = 401;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExplanationOfBenefitStatus <em>Explanation Of Benefit Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExplanationOfBenefitStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getExplanationOfBenefitStatus()
	 * @generated
	 */
	int EXPLANATION_OF_BENEFIT_STATUS = 402;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PayeeResourceType <em>Payee Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PayeeResourceType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPayeeResourceType()
	 * @generated
	 */
	int PAYEE_RESOURCE_TYPE = 403;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActInvoiceGroupCode <em>Act Invoice Group Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActInvoiceGroupCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getActInvoiceGroupCode()
	 * @generated
	 */
	int ACT_INVOICE_GROUP_CODE = 404;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GuideDependencyType <em>Guide Dependency Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GuideDependencyType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getGuideDependencyType()
	 * @generated
	 */
	int GUIDE_DEPENDENCY_TYPE = 405;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GuidePageKind <em>Guide Page Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GuidePageKind
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getGuidePageKind()
	 * @generated
	 */
	int GUIDE_PAGE_KIND = 406;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.XPathUsageType <em>XPath Usage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.XPathUsageType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getXPathUsageType()
	 * @generated
	 */
	int XPATH_USAGE_TYPE = 407;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SearchComparator <em>Search Comparator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SearchComparator
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSearchComparator()
	 * @generated
	 */
	int SEARCH_COMPARATOR = 408;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SearchModifierCode <em>Search Modifier Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SearchModifierCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSearchModifierCode()
	 * @generated
	 */
	int SEARCH_MODIFIER_CODE = 409;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SystemVersionProcessingMode <em>System Version Processing Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SystemVersionProcessingMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSystemVersionProcessingMode()
	 * @generated
	 */
	int SYSTEM_VERSION_PROCESSING_MODE = 410;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CompartmentType <em>Compartment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CompartmentType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getCompartmentType()
	 * @generated
	 */
	int COMPARTMENT_TYPE = 411;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcessOutcomeCodes <em>Process Outcome Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcessOutcomeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getProcessOutcomeCodes()
	 * @generated
	 */
	int PROCESS_OUTCOME_CODES = 412;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PaymentStatusCodes <em>Payment Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PaymentStatusCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getPaymentStatusCodes()
	 * @generated
	 */
	int PAYMENT_STATUS_CODES = 413;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LinkageType <em>Linkage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LinkageType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getLinkageType()
	 * @generated
	 */
	int LINKAGE_TYPE = 414;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplyRequestStatus <em>Supply Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplyRequestStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSupplyRequestStatus()
	 * @generated
	 */
	int SUPPLY_REQUEST_STATUS = 415;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplyType <em>Supply Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplyType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSupplyType()
	 * @generated
	 */
	int SUPPLY_TYPE = 416;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtSupplyItem <em>Snomed Ct Supply Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtSupplyItem
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSnomedCtSupplyItem()
	 * @generated
	 */
	int SNOMED_CT_SUPPLY_ITEM = 417;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplyRequestReason <em>Supply Request Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplyRequestReason
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSupplyRequestReason()
	 * @generated
	 */
	int SUPPLY_REQUEST_REASON = 418;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplyRequestWhen <em>Supply Request When</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplyRequestWhen
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSupplyRequestWhen()
	 * @generated
	 */
	int SUPPLY_REQUEST_WHEN = 419;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GuidanceResponseStatus <em>Guidance Response Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GuidanceResponseStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getGuidanceResponseStatus()
	 * @generated
	 */
	int GUIDANCE_RESPONSE_STATUS = 420;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DetectedIssueCategory <em>Detected Issue Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DetectedIssueCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDetectedIssueCategory()
	 * @generated
	 */
	int DETECTED_ISSUE_CATEGORY = 421;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DetectedIssueSeverity <em>Detected Issue Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DetectedIssueSeverity
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDetectedIssueSeverity()
	 * @generated
	 */
	int DETECTED_ISSUE_SEVERITY = 422;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DetectedIssueMitigationAction <em>Detected Issue Mitigation Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DetectedIssueMitigationAction
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getDetectedIssueMitigationAction()
	 * @generated
	 */
	int DETECTED_ISSUE_MITIGATION_ACTION = 423;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventId <em>Audit Event Id</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventId
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAuditEventId()
	 * @generated
	 */
	int AUDIT_EVENT_ID = 424;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventSubType <em>Audit Event Sub Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventSubType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAuditEventSubType()
	 * @generated
	 */
	int AUDIT_EVENT_SUB_TYPE = 425;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventAction <em>Audit Event Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventAction
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAuditEventAction()
	 * @generated
	 */
	int AUDIT_EVENT_ACTION = 426;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventOutcome <em>Audit Event Outcome</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventOutcome
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAuditEventOutcome()
	 * @generated
	 */
	int AUDIT_EVENT_OUTCOME = 427;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditAgentRoleIdCode <em>Audit Agent Role Id Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditAgentRoleIdCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAuditAgentRoleIdCode()
	 * @generated
	 */
	int AUDIT_AGENT_ROLE_ID_CODE = 428;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MediaTypeCode <em>Media Type Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MediaTypeCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getMediaTypeCode()
	 * @generated
	 */
	int MEDIA_TYPE_CODE = 429;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventAgentNetworkType <em>Audit Event Agent Network Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventAgentNetworkType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAuditEventAgentNetworkType()
	 * @generated
	 */
	int AUDIT_EVENT_AGENT_NETWORK_TYPE = 430;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventSourceType <em>Audit Event Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventSourceType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAuditEventSourceType()
	 * @generated
	 */
	int AUDIT_EVENT_SOURCE_TYPE = 431;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventEntityType <em>Audit Event Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventEntityType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAuditEventEntityType()
	 * @generated
	 */
	int AUDIT_EVENT_ENTITY_TYPE = 432;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventEntityRole <em>Audit Event Entity Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventEntityRole
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAuditEventEntityRole()
	 * @generated
	 */
	int AUDIT_EVENT_ENTITY_ROLE = 433;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventEntityLifecycle <em>Audit Event Entity Lifecycle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventEntityLifecycle
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getAuditEventEntityLifecycle()
	 * @generated
	 */
	int AUDIT_EVENT_ENTITY_LIFECYCLE = 434;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BasicResourceTypes <em>Basic Resource Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BasicResourceTypes
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getBasicResourceTypes()
	 * @generated
	 */
	int BASIC_RESOURCE_TYPES = 435;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplyDeliveryStatus <em>Supply Delivery Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplyDeliveryStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSupplyDeliveryStatus()
	 * @generated
	 */
	int SUPPLY_DELIVERY_STATUS = 436;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplyItemType <em>Supply Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplyItemType
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.impl.ValueSetsPackageImpl#getSupplyItemType()
	 * @generated
	 */
	int SUPPLY_ITEM_TYPE = 437;


	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AddressUse <em>Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Address Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AddressUse
	 * @generated
	 */
	EEnum getAddressUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Address Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AddressType
	 * @generated
	 */
	EEnum getAddressType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QuantityComparator <em>Quantity Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantity Comparator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QuantityComparator
	 * @generated
	 */
	EEnum getQuantityComparator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllSecurityLabels <em>All Security Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>All Security Labels</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllSecurityLabels
	 * @generated
	 */
	EEnum getAllSecurityLabels();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CommonTags <em>Common Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Common Tags</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CommonTags
	 * @generated
	 */
	EEnum getCommonTags();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CommonLanguages <em>Common Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Common Languages</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CommonLanguages
	 * @generated
	 */
	EEnum getCommonLanguages();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NarrativeStatus <em>Narrative Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Narrative Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NarrativeStatus
	 * @generated
	 */
	EEnum getNarrativeStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IdentifierUse <em>Identifier Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identifier Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IdentifierUse
	 * @generated
	 */
	EEnum getIdentifierUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IdentifierTypeCodes <em>Identifier Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identifier Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IdentifierTypeCodes
	 * @generated
	 */
	EEnum getIdentifierTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Organization Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.OrganizationType
	 * @generated
	 */
	EEnum getOrganizationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContactPointSystem <em>Contact Point System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Point System</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContactPointSystem
	 * @generated
	 */
	EEnum getContactPointSystem();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContactPointUse <em>Contact Point Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Point Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContactPointUse
	 * @generated
	 */
	EEnum getContactPointUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContactEntityType <em>Contact Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Entity Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContactEntityType
	 * @generated
	 */
	EEnum getContactEntityType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NameUse <em>Name Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NameUse
	 * @generated
	 */
	EEnum getNameUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EndpointStatus <em>Endpoint Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endpoint Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EndpointStatus
	 * @generated
	 */
	EEnum getEndpointStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EndpointConnectionType <em>Endpoint Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endpoint Connection Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EndpointConnectionType
	 * @generated
	 */
	EEnum getEndpointConnectionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EndpointPayloadType <em>Endpoint Payload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endpoint Payload Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EndpointPayloadType
	 * @generated
	 */
	EEnum getEndpointPayloadType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AdministrativeGender <em>Administrative Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Administrative Gender</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AdministrativeGender
	 * @generated
	 */
	EEnum getAdministrativeGender();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PractitionerRole <em>Practitioner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Practitioner Role</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PractitionerRole
	 * @generated
	 */
	EEnum getPractitionerRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PractitionerSpecialty <em>Practitioner Specialty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Practitioner Specialty</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PractitionerSpecialty
	 * @generated
	 */
	EEnum getPractitionerSpecialty();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LocationStatus <em>Location Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LocationStatus
	 * @generated
	 */
	EEnum getLocationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LocationMode <em>Location Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LocationMode
	 * @generated
	 */
	EEnum getLocationMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ServiceDeliveryLocationRoleType <em>Service Delivery Location Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Delivery Location Role Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ServiceDeliveryLocationRoleType
	 * @generated
	 */
	EEnum getServiceDeliveryLocationRoleType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LocationType
	 * @generated
	 */
	EEnum getLocationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ServiceCategory
	 * @generated
	 */
	EEnum getServiceCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ServiceType
	 * @generated
	 */
	EEnum getServiceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PracticeSettingCodeValueSet <em>Practice Setting Code Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Practice Setting Code Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PracticeSettingCodeValueSet
	 * @generated
	 */
	EEnum getPracticeSettingCodeValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ServiceProvisionConditions <em>Service Provision Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Provision Conditions</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ServiceProvisionConditions
	 * @generated
	 */
	EEnum getServiceProvisionConditions();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ReferralMethod <em>Referral Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referral Method</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ReferralMethod
	 * @generated
	 */
	EEnum getReferralMethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DaysOfWeek <em>Days Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Days Of Week</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DaysOfWeek
	 * @generated
	 */
	EEnum getDaysOfWeek();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12 <em>Anzsco Australian And New Zealand Standard Classification Of Occupations2013 Version12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Anzsco Australian And New Zealand Standard Classification Of Occupations2013 Version12</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12
	 * @generated
	 */
	EEnum getAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MaritalStatusCodes <em>Marital Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Marital Status Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MaritalStatusCodes
	 * @generated
	 */
	EEnum getMaritalStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V2ContactRole <em>V2 Contact Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V2 Contact Role</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V2ContactRole
	 * @generated
	 */
	EEnum getV2ContactRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AnimalSpecies <em>Animal Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Animal Species</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AnimalSpecies
	 * @generated
	 */
	EEnum getAnimalSpecies();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AnimalBreeds <em>Animal Breeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Animal Breeds</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AnimalBreeds
	 * @generated
	 */
	EEnum getAnimalBreeds();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GenderStatus <em>Gender Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GenderStatus
	 * @generated
	 */
	EEnum getGenderStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PatientRelationshipType <em>Patient Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Patient Relationship Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PatientRelationshipType
	 * @generated
	 */
	EEnum getPatientRelationshipType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LinkType
	 * @generated
	 */
	EEnum getLinkType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SignatureTypeCodes <em>Signature Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signature Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SignatureTypeCodes
	 * @generated
	 */
	EEnum getSignatureTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceStatus <em>Device Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceStatus
	 * @generated
	 */
	EEnum getDeviceStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceTypes <em>Device Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Types</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceTypes
	 * @generated
	 */
	EEnum getDeviceTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.UnitsOfTime <em>Units Of Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Of Time</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.UnitsOfTime
	 * @generated
	 */
	EEnum getUnitsOfTime();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EventTiming <em>Event Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Timing</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EventTiming
	 * @generated
	 */
	EEnum getEventTiming();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TimingAbbreviation <em>Timing Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timing Abbreviation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TimingAbbreviation
	 * @generated
	 */
	EEnum getTimingAbbreviation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LibraryType <em>Library Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Library Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LibraryType
	 * @generated
	 */
	EEnum getLibraryType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PublicationStatus <em>Publication Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Publication Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PublicationStatus
	 * @generated
	 */
	EEnum getPublicationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.UsageContextType <em>Usage Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Usage Context Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.UsageContextType
	 * @generated
	 */
	EEnum getUsageContextType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.JurisdictionValueSet <em>Jurisdiction Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jurisdiction Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.JurisdictionValueSet
	 * @generated
	 */
	EEnum getJurisdictionValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContributorType <em>Contributor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contributor Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContributorType
	 * @generated
	 */
	EEnum getContributorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RelatedArtifactType <em>Related Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Related Artifact Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RelatedArtifactType
	 * @generated
	 */
	EEnum getRelatedArtifactType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.OperationParameterUse <em>Operation Parameter Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Parameter Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.OperationParameterUse
	 * @generated
	 */
	EEnum getOperationParameterUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FhirAllTypes <em>Fhir All Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir All Types</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FhirAllTypes
	 * @generated
	 */
	EEnum getFhirAllTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureDefinitionCodes <em>Structure Definition Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Definition Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureDefinitionCodes
	 * @generated
	 */
	EEnum getStructureDefinitionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureDefinitionKind <em>Structure Definition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Definition Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureDefinitionKind
	 * @generated
	 */
	EEnum getStructureDefinitionKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExtensionContext <em>Extension Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Extension Context</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExtensionContext
	 * @generated
	 */
	EEnum getExtensionContext();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FhirDefinedType <em>Fhir Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Defined Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FhirDefinedType
	 * @generated
	 */
	EEnum getFhirDefinedType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TypeDerivationRule <em>Type Derivation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Derivation Rule</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TypeDerivationRule
	 * @generated
	 */
	EEnum getTypeDerivationRule();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PropertyRepresentation <em>Property Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Representation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PropertyRepresentation
	 * @generated
	 */
	EEnum getPropertyRepresentation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LoincCodes <em>Loinc Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loinc Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LoincCodes
	 * @generated
	 */
	EEnum getLoincCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SlicingRules <em>Slicing Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Slicing Rules</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SlicingRules
	 * @generated
	 */
	EEnum getSlicingRules();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AggregationMode <em>Aggregation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AggregationMode
	 * @generated
	 */
	EEnum getAggregationMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ReferenceVersionRules <em>Reference Version Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Version Rules</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ReferenceVersionRules
	 * @generated
	 */
	EEnum getReferenceVersionRules();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConstraintSeverity <em>Constraint Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Severity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConstraintSeverity
	 * @generated
	 */
	EEnum getConstraintSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BindingStrength <em>Binding Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Strength</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BindingStrength
	 * @generated
	 */
	EEnum getBindingStrength();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DesignationUse <em>Designation Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Designation Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DesignationUse
	 * @generated
	 */
	EEnum getDesignationUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FilterOperator <em>Filter Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Operator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FilterOperator
	 * @generated
	 */
	EEnum getFilterOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ResearchSubjectStatus <em>Research Subject Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Research Subject Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ResearchSubjectStatus
	 * @generated
	 */
	EEnum getResearchSubjectStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanDefinitionType <em>Plan Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Definition Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanDefinitionType
	 * @generated
	 */
	EEnum getPlanDefinitionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TriggerType
	 * @generated
	 */
	EEnum getTriggerType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionConditionKind <em>Plan Action Condition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Action Condition Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionConditionKind
	 * @generated
	 */
	EEnum getPlanActionConditionKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionRelationshipType <em>Plan Action Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Action Relationship Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionRelationshipType
	 * @generated
	 */
	EEnum getPlanActionRelationshipType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionParticipantType <em>Plan Action Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Action Participant Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionParticipantType
	 * @generated
	 */
	EEnum getPlanActionParticipantType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionType <em>Plan Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Action Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionType
	 * @generated
	 */
	EEnum getPlanActionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionGroupingBehavior <em>Plan Action Grouping Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Action Grouping Behavior</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionGroupingBehavior
	 * @generated
	 */
	EEnum getPlanActionGroupingBehavior();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionSelectionBehavior <em>Plan Action Selection Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Action Selection Behavior</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionSelectionBehavior
	 * @generated
	 */
	EEnum getPlanActionSelectionBehavior();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionRequiredBehavior <em>Plan Action Required Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Action Required Behavior</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionRequiredBehavior
	 * @generated
	 */
	EEnum getPlanActionRequiredBehavior();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionPrecheckBehavior <em>Plan Action Precheck Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Action Precheck Behavior</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionPrecheckBehavior
	 * @generated
	 */
	EEnum getPlanActionPrecheckBehavior();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionCardinalityBehavior <em>Plan Action Cardinality Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Action Cardinality Behavior</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PlanActionCardinalityBehavior
	 * @generated
	 */
	EEnum getPlanActionCardinalityBehavior();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActivityDefinitionCategory <em>Activity Definition Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Definition Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActivityDefinitionCategory
	 * @generated
	 */
	EEnum getActivityDefinitionCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtMedicationCodes <em>Snomed Ct Medication Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Medication Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtMedicationCodes
	 * @generated
	 */
	EEnum getSnomedCtMedicationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtFormCodes <em>Snomed Ct Form Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Form Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtFormCodes
	 * @generated
	 */
	EEnum getSnomedCtFormCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtFormCodes <em>Snomed Ct Form Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Form Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtFormCodes
	 * @generated
	 */
	EEnum getSnomedCtFormCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SubstanceCategoryCodes <em>Substance Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Substance Category Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SubstanceCategoryCodes
	 * @generated
	 */
	EEnum getSubstanceCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SubstanceCode <em>Substance Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Substance Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SubstanceCode
	 * @generated
	 */
	EEnum getSubstanceCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtFormCodes <em>Snomed Ct Form Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Form Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtFormCodes
	 * @generated
	 */
	EEnum getSnomedCtFormCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtAdditionalDosageInstructions <em>Snomed Ct Additional Dosage Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Additional Dosage Instructions</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtAdditionalDosageInstructions
	 * @generated
	 */
	EEnum getSnomedCtAdditionalDosageInstructions();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtMedicationAsNeededReasonCodes <em>Snomed Ct Medication As Needed Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Medication As Needed Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtMedicationAsNeededReasonCodes
	 * @generated
	 */
	EEnum getSnomedCtMedicationAsNeededReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtAnatomicalStructureForAdministrationSiteCodes <em>Snomed Ct Anatomical Structure For Administration Site Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Anatomical Structure For Administration Site Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtAnatomicalStructureForAdministrationSiteCodes
	 * @generated
	 */
	EEnum getSnomedCtAnatomicalStructureForAdministrationSiteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtRouteCodes <em>Snomed Ct Route Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Route Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtRouteCodes
	 * @generated
	 */
	EEnum getSnomedCtRouteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtAdministrationMethodCodes <em>Snomed Ct Administration Method Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Administration Method Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtAdministrationMethodCodes
	 * @generated
	 */
	EEnum getSnomedCtAdministrationMethodCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtBodyStructures <em>Snomed Ct Body Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Body Structures</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtBodyStructures
	 * @generated
	 */
	EEnum getSnomedCtBodyStructures();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapModelMode <em>Structure Map Model Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Map Model Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapModelMode
	 * @generated
	 */
	EEnum getStructureMapModelMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapInputMode <em>Structure Map Input Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Map Input Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapInputMode
	 * @generated
	 */
	EEnum getStructureMapInputMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapContextType <em>Structure Map Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Map Context Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapContextType
	 * @generated
	 */
	EEnum getStructureMapContextType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapListMode <em>Structure Map List Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Map List Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapListMode
	 * @generated
	 */
	EEnum getStructureMapListMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapTransform <em>Structure Map Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Map Transform</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.StructureMapTransform
	 * @generated
	 */
	EEnum getStructureMapTransform();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ResearchStudyStatus <em>Research Study Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Research Study Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ResearchStudyStatus
	 * @generated
	 */
	EEnum getResearchStudyStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Group Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GroupType
	 * @generated
	 */
	EEnum getGroupType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentStatus <em>Consent Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentStatus
	 * @generated
	 */
	EEnum getConsentStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentCategoryCodes <em>Consent Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Category Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentCategoryCodes
	 * @generated
	 */
	EEnum getConsentCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentTypeValueSet <em>Document Type Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Type Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentTypeValueSet
	 * @generated
	 */
	EEnum getDocumentTypeValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentClassValueSet <em>Document Class Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Class Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentClassValueSet
	 * @generated
	 */
	EEnum getDocumentClassValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentReferenceStatus <em>Document Reference Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Reference Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentReferenceStatus
	 * @generated
	 */
	EEnum getDocumentReferenceStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CompositionStatus <em>Composition Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composition Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CompositionStatus
	 * @generated
	 */
	EEnum getCompositionStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentRelationshipType <em>Document Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Relationship Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentRelationshipType
	 * @generated
	 */
	EEnum getDocumentRelationshipType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentReferenceFormatCodeSet <em>Document Reference Format Code Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Reference Format Code Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentReferenceFormatCodeSet
	 * @generated
	 */
	EEnum getDocumentReferenceFormatCodeSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EncounterStatus <em>Encounter Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EncounterStatus
	 * @generated
	 */
	EEnum getEncounterStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActEncounterCode <em>Act Encounter Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Encounter Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActEncounterCode
	 * @generated
	 */
	EEnum getActEncounterCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EncounterType <em>Encounter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EncounterType
	 * @generated
	 */
	EEnum getEncounterType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemActPriority <em>V3 Code System Act Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Code System Act Priority</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemActPriority
	 * @generated
	 */
	EEnum getV3CodeSystemActPriority();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EpisodeOfCareStatus <em>Episode Of Care Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Episode Of Care Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EpisodeOfCareStatus
	 * @generated
	 */
	EEnum getEpisodeOfCareStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionClinicalStatusCodes <em>Condition Clinical Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Clinical Status Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionClinicalStatusCodes
	 * @generated
	 */
	EEnum getConditionClinicalStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionVerificationStatus <em>Condition Verification Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Verification Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionVerificationStatus
	 * @generated
	 */
	EEnum getConditionVerificationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionCategoryCodes <em>Condition Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Category Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionCategoryCodes
	 * @generated
	 */
	EEnum getConditionCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionDiagnosisSeverity <em>Condition Diagnosis Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Diagnosis Severity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionDiagnosisSeverity
	 * @generated
	 */
	EEnum getConditionDiagnosisSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionProblemDiagnosisCodes <em>Condition Problem Diagnosis Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Problem Diagnosis Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionProblemDiagnosisCodes
	 * @generated
	 */
	EEnum getConditionProblemDiagnosisCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionStage <em>Condition Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Stage</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionStage
	 * @generated
	 */
	EEnum getConditionStage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ClinicalImpressionStatus <em>Clinical Impression Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clinical Impression Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ClinicalImpressionStatus
	 * @generated
	 */
	EEnum getClinicalImpressionStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceClinicalStatus <em>Allergy Intolerance Clinical Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Clinical Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceClinicalStatus
	 * @generated
	 */
	EEnum getAllergyIntoleranceClinicalStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceVerificationStatus <em>Allergy Intolerance Verification Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Verification Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceVerificationStatus
	 * @generated
	 */
	EEnum getAllergyIntoleranceVerificationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceType <em>Allergy Intolerance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceType
	 * @generated
	 */
	EEnum getAllergyIntoleranceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceCategory <em>Allergy Intolerance Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceCategory
	 * @generated
	 */
	EEnum getAllergyIntoleranceCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceCriticality <em>Allergy Intolerance Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Criticality</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceCriticality
	 * @generated
	 */
	EEnum getAllergyIntoleranceCriticality();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceSubstanceProductConditionAndNegationCodes <em>Allergy Intolerance Substance Product Condition And Negation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Substance Product Condition And Negation Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceSubstanceProductConditionAndNegationCodes
	 * @generated
	 */
	EEnum getAllergyIntoleranceSubstanceProductConditionAndNegationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceCertainty <em>Allergy Intolerance Certainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Certainty</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceCertainty
	 * @generated
	 */
	EEnum getAllergyIntoleranceCertainty();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtClinicalFindings <em>Snomed Ct Clinical Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Clinical Findings</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtClinicalFindings
	 * @generated
	 */
	EEnum getSnomedCtClinicalFindings();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtClinicalFindings <em>Snomed Ct Clinical Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Clinical Findings</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtClinicalFindings
	 * @generated
	 */
	EEnum getSnomedCtClinicalFindings();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceSeverity <em>Allergy Intolerance Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Severity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AllergyIntoleranceSeverity
	 * @generated
	 */
	EEnum getAllergyIntoleranceSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.InvestigationType <em>Investigation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Investigation Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.InvestigationType
	 * @generated
	 */
	EEnum getInvestigationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationStatus <em>Observation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationStatus
	 * @generated
	 */
	EEnum getObservationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationCategoryCodes <em>Observation Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Category Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationCategoryCodes
	 * @generated
	 */
	EEnum getObservationCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationValueAbsentReason <em>Observation Value Absent Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Value Absent Reason</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationValueAbsentReason
	 * @generated
	 */
	EEnum getObservationValueAbsentReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationInterpretationCodes <em>Observation Interpretation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Interpretation Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationInterpretationCodes
	 * @generated
	 */
	EEnum getObservationInterpretationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationMethods <em>Observation Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Methods</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationMethods
	 * @generated
	 */
	EEnum getObservationMethods();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenStatus <em>Specimen Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenStatus
	 * @generated
	 */
	EEnum getSpecimenStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V2SpecimenType <em>V2 Specimen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V2 Specimen Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V2SpecimenType
	 * @generated
	 */
	EEnum getV2SpecimenType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RequestStatus <em>Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Request Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RequestStatus
	 * @generated
	 */
	EEnum getRequestStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RequestIntent <em>Request Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Request Intent</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RequestIntent
	 * @generated
	 */
	EEnum getRequestIntent();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RequestPriority <em>Request Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Request Priority</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RequestPriority
	 * @generated
	 */
	EEnum getRequestPriority();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LoincDiagnosticRequestCodes <em>Loinc Diagnostic Request Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loinc Diagnostic Request Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LoincDiagnosticRequestCodes
	 * @generated
	 */
	EEnum getLoincDiagnosticRequestCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ParticipantRoles <em>Participant Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participant Roles</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ParticipantRoles
	 * @generated
	 */
	EEnum getParticipantRoles();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PurposeOfUse <em>Purpose Of Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Purpose Of Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PurposeOfUse
	 * @generated
	 */
	EEnum getPurposeOfUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProvenanceEventCurrentState <em>Provenance Event Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance Event Current State</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProvenanceEventCurrentState
	 * @generated
	 */
	EEnum getProvenanceEventCurrentState();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProvenanceParticipantRole <em>Provenance Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance Participant Role</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProvenanceParticipantRole
	 * @generated
	 */
	EEnum getProvenanceParticipantRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemRoleLinkType <em>V3 Code System Role Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Code System Role Link Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemRoleLinkType
	 * @generated
	 */
	EEnum getV3CodeSystemRoleLinkType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProvenanceEntityRole <em>Provenance Entity Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance Entity Role</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProvenanceEntityRole
	 * @generated
	 */
	EEnum getProvenanceEntityRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureCodessnomedCT <em>Procedure Codessnomed CT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Codessnomed CT</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureCodessnomedCT
	 * @generated
	 */
	EEnum getProcedureCodessnomedCT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureReasonCodes <em>Procedure Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureReasonCodes
	 * @generated
	 */
	EEnum getProcedureReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureRequestStatus <em>Procedure Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Request Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureRequestStatus
	 * @generated
	 */
	EEnum getProcedureRequestStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureRequestPriority <em>Procedure Request Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Request Priority</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureRequestPriority
	 * @generated
	 */
	EEnum getProcedureRequestPriority();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenCollectionMethod <em>Specimen Collection Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Collection Method</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenCollectionMethod
	 * @generated
	 */
	EEnum getSpecimenCollectionMethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenTreatmentProcedure <em>Specimen Treatment Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Treatment Procedure</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenTreatmentProcedure
	 * @generated
	 */
	EEnum getSpecimenTreatmentProcedure();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenContainer <em>Specimen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Container</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SpecimenContainer
	 * @generated
	 */
	EEnum getSpecimenContainer();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V2AdditivePreservative <em>V2 Additive Preservative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V2 Additive Preservative</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V2AdditivePreservative
	 * @generated
	 */
	EEnum getV2AdditivePreservative();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasmntPrinciple <em>Measmnt Principle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measmnt Principle</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasmntPrinciple
	 * @generated
	 */
	EEnum getMeasmntPrinciple();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricOperationalStatus <em>Device Metric Operational Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Metric Operational Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricOperationalStatus
	 * @generated
	 */
	EEnum getDeviceMetricOperationalStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricColor <em>Device Metric Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Metric Color</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricColor
	 * @generated
	 */
	EEnum getDeviceMetricColor();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricCategory <em>Device Metric Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Metric Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricCategory
	 * @generated
	 */
	EEnum getDeviceMetricCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricCalibrationType <em>Device Metric Calibration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Metric Calibration Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricCalibrationType
	 * @generated
	 */
	EEnum getDeviceMetricCalibrationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricCalibrationState <em>Device Metric Calibration State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Metric Calibration State</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DeviceMetricCalibrationState
	 * @generated
	 */
	EEnum getDeviceMetricCalibrationState();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationReferenceRangeMeaningCodes <em>Observation Reference Range Meaning Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Reference Range Meaning Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationReferenceRangeMeaningCodes
	 * @generated
	 */
	EEnum getObservationReferenceRangeMeaningCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ObservationRelationshipType <em>Observation Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Relationship Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ObservationRelationshipType
	 * @generated
	 */
	EEnum getObservationRelationshipType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanStatus <em>Care Plan Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanStatus
	 * @generated
	 */
	EEnum getCarePlanStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanCategory <em>Care Plan Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanCategory
	 * @generated
	 */
	EEnum getCarePlanCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireStatus <em>Questionnaire Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireStatus
	 * @generated
	 */
	EEnum getQuestionnaireStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContextOfUseValueSet <em>Context Of Use Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Context Of Use Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContextOfUseValueSet
	 * @generated
	 */
	EEnum getContextOfUseValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireQuestionCodes <em>Questionnaire Question Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Question Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireQuestionCodes
	 * @generated
	 */
	EEnum getQuestionnaireQuestionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireItemType <em>Questionnaire Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Item Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireItemType
	 * @generated
	 */
	EEnum getQuestionnaireItemType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireAnswerCodes <em>Questionnaire Answer Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Answer Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireAnswerCodes
	 * @generated
	 */
	EEnum getQuestionnaireAnswerCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanRelationship <em>Care Plan Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Relationship</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanRelationship
	 * @generated
	 */
	EEnum getCarePlanRelationship();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GoalStatus <em>Goal Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GoalStatus
	 * @generated
	 */
	EEnum getGoalStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GoalCategory <em>Goal Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GoalCategory
	 * @generated
	 */
	EEnum getGoalCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GoalPriority <em>Goal Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Priority</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GoalPriority
	 * @generated
	 */
	EEnum getGoalPriority();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GoalStartEvent <em>Goal Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Start Event</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GoalStartEvent
	 * @generated
	 */
	EEnum getGoalStartEvent();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GoalStatusReason <em>Goal Status Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Status Reason</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GoalStatusReason
	 * @generated
	 */
	EEnum getGoalStatusReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationStatementStatus <em>Medication Statement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Statement Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationStatementStatus
	 * @generated
	 */
	EEnum getMedicationStatementStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationStatementNotTaken <em>Medication Statement Not Taken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Statement Not Taken</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationStatementNotTaken
	 * @generated
	 */
	EEnum getMedicationStatementNotTaken();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtDrugsNotTakencompletedCodes <em>Snomed Ct Drugs Not Takencompleted Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Drugs Not Takencompleted Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtDrugsNotTakencompletedCodes
	 * @generated
	 */
	EEnum getSnomedCtDrugsNotTakencompletedCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationStatementCategory <em>Medication Statement Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Statement Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationStatementCategory
	 * @generated
	 */
	EEnum getMedicationStatementCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NutritionOrderStatus <em>Nutrition Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nutrition Order Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NutritionOrderStatus
	 * @generated
	 */
	EEnum getNutritionOrderStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.Diet <em>Diet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diet</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.Diet
	 * @generated
	 */
	EEnum getDiet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FoodTypeCodes <em>Food Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Food Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FoodTypeCodes
	 * @generated
	 */
	EEnum getFoodTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DietCodes <em>Diet Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diet Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DietCodes
	 * @generated
	 */
	EEnum getDietCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NutrientModifierCodes <em>Nutrient Modifier Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nutrient Modifier Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NutrientModifierCodes
	 * @generated
	 */
	EEnum getNutrientModifierCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TextureModifierCodes <em>Texture Modifier Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Modifier Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TextureModifierCodes
	 * @generated
	 */
	EEnum getTextureModifierCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TextureModifiedFoodTypeCodes <em>Texture Modified Food Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Modified Food Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TextureModifiedFoodTypeCodes
	 * @generated
	 */
	EEnum getTextureModifiedFoodTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FluidConsistencyTypeCodes <em>Fluid Consistency Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fluid Consistency Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FluidConsistencyTypeCodes
	 * @generated
	 */
	EEnum getFluidConsistencyTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplementTypeCodes <em>Supplement Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supplement Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplementTypeCodes
	 * @generated
	 */
	EEnum getSupplementTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EnteralFormulaTypeCodes <em>Enteral Formula Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enteral Formula Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EnteralFormulaTypeCodes
	 * @generated
	 */
	EEnum getEnteralFormulaTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EnteralFormulaAdditiveTypeCode <em>Enteral Formula Additive Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enteral Formula Additive Type Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EnteralFormulaAdditiveTypeCode
	 * @generated
	 */
	EEnum getEnteralFormulaAdditiveTypeCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EnteralRouteCodes <em>Enteral Route Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enteral Route Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EnteralRouteCodes
	 * @generated
	 */
	EEnum getEnteralRouteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RiskProbability <em>Risk Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Probability</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RiskProbability
	 * @generated
	 */
	EEnum getRiskProbability();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AppointmentStatus <em>Appointment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Appointment Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AppointmentStatus
	 * @generated
	 */
	EEnum getAppointmentStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V2AppointmentReasonCodes <em>V2 Appointment Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V2 Appointment Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V2AppointmentReasonCodes
	 * @generated
	 */
	EEnum getV2AppointmentReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EncounterReasonCodes <em>Encounter Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EncounterReasonCodes
	 * @generated
	 */
	EEnum getEncounterReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SlotStatus <em>Slot Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Slot Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SlotStatus
	 * @generated
	 */
	EEnum getSlotStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ParticipantType <em>Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participant Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ParticipantType
	 * @generated
	 */
	EEnum getParticipantType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ParticipantRequired <em>Participant Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participant Required</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ParticipantRequired
	 * @generated
	 */
	EEnum getParticipantRequired();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ParticipationStatus <em>Participation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participation Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ParticipationStatus
	 * @generated
	 */
	EEnum getParticipationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemParticipationMode <em>V3 Code System Participation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Code System Participation Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemParticipationMode
	 * @generated
	 */
	EEnum getV3CodeSystemParticipationMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CommunicationRequestStatus <em>Communication Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Request Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CommunicationRequestStatus
	 * @generated
	 */
	EEnum getCommunicationRequestStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemActReason <em>V3 Code System Act Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Code System Act Reason</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemActReason
	 * @generated
	 */
	EEnum getV3CodeSystemActReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RequestStage <em>Request Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Request Stage</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RequestStage
	 * @generated
	 */
	EEnum getRequestStage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationRequestStatus <em>Medication Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Request Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationRequestStatus
	 * @generated
	 */
	EEnum getMedicationRequestStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationRequestStage <em>Medication Request Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Request Stage</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationRequestStage
	 * @generated
	 */
	EEnum getMedicationRequestStage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationRequestCategory <em>Medication Request Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Request Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationRequestCategory
	 * @generated
	 */
	EEnum getMedicationRequestCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SubstanceAdminSubstitutionReason <em>Substance Admin Substitution Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Substance Admin Substitution Reason</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SubstanceAdminSubstitutionReason
	 * @generated
	 */
	EEnum getSubstanceAdminSubstitutionReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FinancialResourceStatusCodes <em>Financial Resource Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Financial Resource Status Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FinancialResourceStatusCodes
	 * @generated
	 */
	EEnum getFinancialResourceStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActionList <em>Action List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action List</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActionList
	 * @generated
	 */
	EEnum getActionList();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleVisionPrescriptionProductCodes <em>Example Vision Prescription Product Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Vision Prescription Product Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleVisionPrescriptionProductCodes
	 * @generated
	 */
	EEnum getExampleVisionPrescriptionProductCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.VisionEyes <em>Vision Eyes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vision Eyes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.VisionEyes
	 * @generated
	 */
	EEnum getVisionEyes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.VisionBase <em>Vision Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vision Base</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.VisionBase
	 * @generated
	 */
	EEnum getVisionBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanActivityCategory <em>Care Plan Activity Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Activity Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanActivityCategory
	 * @generated
	 */
	EEnum getCarePlanActivityCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanActivity <em>Care Plan Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Activity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanActivity
	 * @generated
	 */
	EEnum getCarePlanActivity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActivityReason <em>Activity Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Reason</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActivityReason
	 * @generated
	 */
	EEnum getActivityReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanActivityStatus <em>Care Plan Activity Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Activity Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CarePlanActivityStatus
	 * @generated
	 */
	EEnum getCarePlanActivityStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ReferralStatus <em>Referral Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referral Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ReferralStatus
	 * @generated
	 */
	EEnum getReferralStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ReferralCategory <em>Referral Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referral Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ReferralCategory
	 * @generated
	 */
	EEnum getReferralCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureStatus <em>Procedure Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureStatus
	 * @generated
	 */
	EEnum getProcedureStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureCategoryCodessnomedCT <em>Procedure Category Codessnomed CT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Category Codessnomed CT</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureCategoryCodessnomedCT
	 * @generated
	 */
	EEnum getProcedureCategoryCodessnomedCT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedurePerformerRoleCodes <em>Procedure Performer Role Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Performer Role Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedurePerformerRoleCodes
	 * @generated
	 */
	EEnum getProcedurePerformerRoleCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureNotPerformedReasonsnomeDCT <em>Procedure Not Performed Reasonsnome DCT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Not Performed Reasonsnome DCT</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureNotPerformedReasonsnomeDCT
	 * @generated
	 */
	EEnum getProcedureNotPerformedReasonsnomeDCT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureOutcomeCodessnomedCT <em>Procedure Outcome Codessnomed CT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Outcome Codessnomed CT</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureOutcomeCodessnomedCT
	 * @generated
	 */
	EEnum getProcedureOutcomeCodessnomedCT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DiagnosticReportStatus <em>Diagnostic Report Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagnostic Report Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DiagnosticReportStatus
	 * @generated
	 */
	EEnum getDiagnosticReportStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DiagnosticServiceSectionCodes <em>Diagnostic Service Section Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagnostic Service Section Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DiagnosticServiceSectionCodes
	 * @generated
	 */
	EEnum getDiagnosticServiceSectionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LoincDiagnosticReportCodes <em>Loinc Diagnostic Report Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loinc Diagnostic Report Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LoincDiagnosticReportCodes
	 * @generated
	 */
	EEnum getLoincDiagnosticReportCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.InstanceAvailability <em>Instance Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance Availability</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.InstanceAvailability
	 * @generated
	 */
	EEnum getInstanceAvailability();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AcquisitionModalityCodes <em>Acquisition Modality Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Acquisition Modality Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AcquisitionModalityCodes
	 * @generated
	 */
	EEnum getAcquisitionModalityCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DWebType <em>DWeb Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DWeb Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DWebType
	 * @generated
	 */
	EEnum getDWebType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.Laterality <em>Laterality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Laterality</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.Laterality
	 * @generated
	 */
	EEnum getLaterality();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.KoStitle <em>Ko Stitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ko Stitle</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.KoStitle
	 * @generated
	 */
	EEnum getKoStitle();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DigitalMediaType <em>Digital Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Digital Media Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DigitalMediaType
	 * @generated
	 */
	EEnum getDigitalMediaType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MediaSubType <em>Media Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Sub Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MediaSubType
	 * @generated
	 */
	EEnum getMediaSubType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MediaCollectionViewProjection <em>Media Collection View Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Collection View Projection</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MediaCollectionViewProjection
	 * @generated
	 */
	EEnum getMediaCollectionViewProjection();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtClinicalFindings <em>Snomed Ct Clinical Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Clinical Findings</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtClinicalFindings
	 * @generated
	 */
	EEnum getSnomedCtClinicalFindings();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureFollowUpCodessnomedCT <em>Procedure Follow Up Codessnomed CT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Follow Up Codessnomed CT</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureFollowUpCodessnomedCT
	 * @generated
	 */
	EEnum getProcedureFollowUpCodessnomedCT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureDeviceActionCodes <em>Procedure Device Action Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Device Action Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcedureDeviceActionCodes
	 * @generated
	 */
	EEnum getProcedureDeviceActionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationAdministrationStatus <em>Medication Administration Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Administration Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationAdministrationStatus
	 * @generated
	 */
	EEnum getMedicationAdministrationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtReasonMedicationNotGivenCodes <em>Snomed Ct Reason Medication Not Given Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Reason Medication Not Given Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtReasonMedicationNotGivenCodes
	 * @generated
	 */
	EEnum getSnomedCtReasonMedicationNotGivenCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ReasonMedicationGivenCodes <em>Reason Medication Given Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reason Medication Given Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ReasonMedicationGivenCodes
	 * @generated
	 */
	EEnum getReasonMedicationGivenCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireResponseStatus <em>Questionnaire Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Response Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QuestionnaireResponseStatus
	 * @generated
	 */
	EEnum getQuestionnaireResponseStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sequence Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SequenceType
	 * @generated
	 */
	EEnum getSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.Chromosomehuman <em>Chromosomehuman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Chromosomehuman</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.Chromosomehuman
	 * @generated
	 */
	EEnum getChromosomehuman();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.Ensembl <em>Ensembl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ensembl</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.Ensembl
	 * @generated
	 */
	EEnum getEnsembl();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.QualityType <em>Quality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quality Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.QualityType
	 * @generated
	 */
	EEnum getQualityType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RepositoryType <em>Repository Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repository Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RepositoryType
	 * @generated
	 */
	EEnum getRepositoryType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FamilyHistoryStatus <em>Family History Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Family History Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FamilyHistoryStatus
	 * @generated
	 */
	EEnum getFamilyHistoryStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FamilyMember <em>Family Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Family Member</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FamilyMember
	 * @generated
	 */
	EEnum getFamilyMember();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionOutcomeCodes <em>Condition Outcome Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Outcome Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionOutcomeCodes
	 * @generated
	 */
	EEnum getConditionOutcomeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ClinicalImpressionPrognosis <em>Clinical Impression Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clinical Impression Prognosis</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ClinicalImpressionPrognosis
	 * @generated
	 */
	EEnum getClinicalImpressionPrognosis();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ManifestationAndSymptomCodes <em>Manifestation And Symptom Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Manifestation And Symptom Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ManifestationAndSymptomCodes
	 * @generated
	 */
	EEnum getManifestationAndSymptomCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AccountStatus <em>Account Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Account Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AccountStatus
	 * @generated
	 */
	EEnum getAccountStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CoverageTypeCodes <em>Coverage Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coverage Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CoverageTypeCodes
	 * @generated
	 */
	EEnum getCoverageTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PolicyholderRelationshipCodes <em>Policyholder Relationship Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Policyholder Relationship Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PolicyholderRelationshipCodes
	 * @generated
	 */
	EEnum getPolicyholderRelationshipCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractTypeCodes <em>Contract Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractTypeCodes
	 * @generated
	 */
	EEnum getContractTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractSubtypeCodes <em>Contract Subtype Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Subtype Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractSubtypeCodes
	 * @generated
	 */
	EEnum getContractSubtypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractActionCodes <em>Contract Action Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Action Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractActionCodes
	 * @generated
	 */
	EEnum getContractActionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractActorRoleCodes <em>Contract Actor Role Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Actor Role Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractActorRoleCodes
	 * @generated
	 */
	EEnum getContractActorRoleCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractSignerTypeCodes <em>Contract Signer Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Signer Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractSignerTypeCodes
	 * @generated
	 */
	EEnum getContractSignerTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractTermTypeCodes <em>Contract Term Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Term Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractTermTypeCodes
	 * @generated
	 */
	EEnum getContractTermTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractTermTypeCodes <em>Contract Term Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Term Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractTermTypeCodes
	 * @generated
	 */
	EEnum getContractTermTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContractTermTypeCodes <em>Contract Term Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Term Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContractTermTypeCodes
	 * @generated
	 */
	EEnum getContractTermTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FhirDocumentTypeCodes <em>Fhir Document Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Document Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FhirDocumentTypeCodes
	 * @generated
	 */
	EEnum getFhirDocumentTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FhirDocumentClassCodes <em>Fhir Document Class Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Document Class Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FhirDocumentClassCodes
	 * @generated
	 */
	EEnum getFhirDocumentClassCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConfidentialityClassification <em>Confidentiality Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidentiality Classification</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConfidentialityClassification
	 * @generated
	 */
	EEnum getConfidentialityClassification();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CompositionAttestationMode <em>Composition Attestation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composition Attestation Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CompositionAttestationMode
	 * @generated
	 */
	EEnum getCompositionAttestationMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemActCode <em>V3 Code System Act Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Code System Act Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V3CodeSystemActCode
	 * @generated
	 */
	EEnum getV3CodeSystemActCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentSectionCodes <em>Document Section Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Section Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentSectionCodes
	 * @generated
	 */
	EEnum getDocumentSectionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ListMode <em>List Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ListMode
	 * @generated
	 */
	EEnum getListMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ListOrderCodes <em>List Order Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Order Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ListOrderCodes
	 * @generated
	 */
	EEnum getListOrderCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ListEmptyReasons <em>List Empty Reasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Empty Reasons</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ListEmptyReasons
	 * @generated
	 */
	EEnum getListEmptyReasons();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AdmitSource <em>Admit Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Admit Source</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AdmitSource
	 * @generated
	 */
	EEnum getAdmitSource();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.V2ReAdmissionIndicator <em>V2 Re Admission Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V2 Re Admission Indicator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.V2ReAdmissionIndicator
	 * @generated
	 */
	EEnum getV2ReAdmissionIndicator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SpecialCourtesy <em>Special Courtesy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Courtesy</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SpecialCourtesy
	 * @generated
	 */
	EEnum getSpecialCourtesy();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SpecialArrangements <em>Special Arrangements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Arrangements</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SpecialArrangements
	 * @generated
	 */
	EEnum getSpecialArrangements();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DischargeDisposition <em>Discharge Disposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discharge Disposition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DischargeDisposition
	 * @generated
	 */
	EEnum getDischargeDisposition();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EncounterLocationStatus <em>Encounter Location Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter Location Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EncounterLocationStatus
	 * @generated
	 */
	EEnum getEncounterLocationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FacilityTypeCodeValueSet <em>Facility Type Code Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Facility Type Code Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FacilityTypeCodeValueSet
	 * @generated
	 */
	EEnum getFacilityTypeCodeValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentExceptType <em>Consent Except Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Except Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentExceptType
	 * @generated
	 */
	EEnum getConsentExceptType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentActorRoles <em>Consent Actor Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Actor Roles</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentActorRoles
	 * @generated
	 */
	EEnum getConsentActorRoles();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentActionCodes <em>Consent Action Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Action Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentActionCodes
	 * @generated
	 */
	EEnum getConsentActionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentContentClass <em>Consent Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Content Class</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentContentClass
	 * @generated
	 */
	EEnum getConsentContentClass();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentContentCodes <em>Consent Content Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Content Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentContentCodes
	 * @generated
	 */
	EEnum getConsentContentCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConsentDataMeaning <em>Consent Data Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Data Meaning</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConsentDataMeaning
	 * @generated
	 */
	EEnum getConsentDataMeaning();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CommunicationStatus <em>Communication Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CommunicationStatus
	 * @generated
	 */
	EEnum getCommunicationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NamingSystemType <em>Naming System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Naming System Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NamingSystemType
	 * @generated
	 */
	EEnum getNamingSystemType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NamingSystemIdentifierType <em>Naming System Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Naming System Identifier Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NamingSystemIdentifierType
	 * @generated
	 */
	EEnum getNamingSystemIdentifierType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConceptMapEquivalence <em>Concept Map Equivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Concept Map Equivalence</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConceptMapEquivalence
	 * @generated
	 */
	EEnum getConceptMapEquivalence();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IdentityAssuranceLevel <em>Identity Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identity Assurance Level</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IdentityAssuranceLevel
	 * @generated
	 */
	EEnum getIdentityAssuranceLevel();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FlagCategory <em>Flag Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flag Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FlagCategory
	 * @generated
	 */
	EEnum getFlagCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FlagStatus <em>Flag Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flag Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FlagStatus
	 * @generated
	 */
	EEnum getFlagStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FlagCode <em>Flag Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flag Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FlagCode
	 * @generated
	 */
	EEnum getFlagCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CodeSystemHierarchyMeaning <em>Code System Hierarchy Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Code System Hierarchy Meaning</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CodeSystemHierarchyMeaning
	 * @generated
	 */
	EEnum getCodeSystemHierarchyMeaning();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CodeSystemContentMode <em>Code System Content Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Code System Content Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CodeSystemContentMode
	 * @generated
	 */
	EEnum getCodeSystemContentMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PropertyType
	 * @generated
	 */
	EEnum getPropertyType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ClaimProcessingCodes <em>Claim Processing Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Claim Processing Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ClaimProcessingCodes
	 * @generated
	 */
	EEnum getClaimProcessingCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PaymentTypeCodes <em>Payment Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PaymentTypeCodes
	 * @generated
	 */
	EEnum getPaymentTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FormCodes <em>Form Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Form Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FormCodes
	 * @generated
	 */
	EEnum getFormCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Note Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NoteType
	 * @generated
	 */
	EEnum getNoteType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TestScriptProfileOriginType <em>Test Script Profile Origin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Script Profile Origin Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TestScriptProfileOriginType
	 * @generated
	 */
	EEnum getTestScriptProfileOriginType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TestScriptProfileDestinationType <em>Test Script Profile Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Script Profile Destination Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TestScriptProfileDestinationType
	 * @generated
	 */
	EEnum getTestScriptProfileDestinationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CapabilityStatementKind <em>Capability Statement Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Capability Statement Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CapabilityStatementKind
	 * @generated
	 */
	EEnum getCapabilityStatementKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.UnknownContentCode <em>Unknown Content Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unknown Content Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.UnknownContentCode
	 * @generated
	 */
	EEnum getUnknownContentCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RestfulCapabilityMode <em>Restful Capability Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Restful Capability Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RestfulCapabilityMode
	 * @generated
	 */
	EEnum getRestfulCapabilityMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.RestfulSecurityService <em>Restful Security Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Restful Security Service</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.RestfulSecurityService
	 * @generated
	 */
	EEnum getRestfulSecurityService();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TypeRestfulInteraction <em>Type Restful Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Restful Interaction</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TypeRestfulInteraction
	 * @generated
	 */
	EEnum getTypeRestfulInteraction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ResourceVersionPolicy <em>Resource Version Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Version Policy</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ResourceVersionPolicy
	 * @generated
	 */
	EEnum getResourceVersionPolicy();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionalReadStatus <em>Conditional Read Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conditional Read Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionalReadStatus
	 * @generated
	 */
	EEnum getConditionalReadStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ConditionalDeleteStatus <em>Conditional Delete Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conditional Delete Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ConditionalDeleteStatus
	 * @generated
	 */
	EEnum getConditionalDeleteStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ReferenceHandlingPolicy <em>Reference Handling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Handling Policy</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ReferenceHandlingPolicy
	 * @generated
	 */
	EEnum getReferenceHandlingPolicy();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SearchParamType <em>Search Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Search Param Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SearchParamType
	 * @generated
	 */
	EEnum getSearchParamType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SystemRestfulInteraction <em>System Restful Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Restful Interaction</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SystemRestfulInteraction
	 * @generated
	 */
	EEnum getSystemRestfulInteraction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.OperationKind <em>Operation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.OperationKind
	 * @generated
	 */
	EEnum getOperationKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MessageTransport <em>Message Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Transport</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MessageTransport
	 * @generated
	 */
	EEnum getMessageTransport();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Event</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MessageEvent
	 * @generated
	 */
	EEnum getMessageEvent();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MessageSignificanceCategory <em>Message Significance Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Significance Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MessageSignificanceCategory
	 * @generated
	 */
	EEnum getMessageSignificanceCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.EventCapabilityMode <em>Event Capability Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Capability Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.EventCapabilityMode
	 * @generated
	 */
	EEnum getEventCapabilityMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DocumentMode <em>Document Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DocumentMode
	 * @generated
	 */
	EEnum getDocumentMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TestScriptOperationCode <em>Test Script Operation Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Script Operation Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TestScriptOperationCode
	 * @generated
	 */
	EEnum getTestScriptOperationCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Content Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ContentType
	 * @generated
	 */
	EEnum getContentType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AssertionDirectionType <em>Assertion Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion Direction Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AssertionDirectionType
	 * @generated
	 */
	EEnum getAssertionDirectionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AssertionOperatorType <em>Assertion Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion Operator Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AssertionOperatorType
	 * @generated
	 */
	EEnum getAssertionOperatorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AssertionResponseTypes <em>Assertion Response Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion Response Types</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AssertionResponseTypes
	 * @generated
	 */
	EEnum getAssertionResponseTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DataElementStringency <em>Data Element Stringency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Element Stringency</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DataElementStringency
	 * @generated
	 */
	EEnum getDataElementStringency();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Response Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ResponseType
	 * @generated
	 */
	EEnum getResponseType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IssueSeverity <em>Issue Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Severity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IssueSeverity
	 * @generated
	 */
	EEnum getIssueSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IssueType
	 * @generated
	 */
	EEnum getIssueType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.OperationOutcomeCodes <em>Operation Outcome Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Outcome Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.OperationOutcomeCodes
	 * @generated
	 */
	EEnum getOperationOutcomeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleMessageReasonCodes <em>Example Message Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Message Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleMessageReasonCodes
	 * @generated
	 */
	EEnum getExampleMessageReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SubscriptionStatus <em>Subscription Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subscription Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SubscriptionStatus
	 * @generated
	 */
	EEnum getSubscriptionStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SubscriptionChannelType <em>Subscription Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subscription Channel Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SubscriptionChannelType
	 * @generated
	 */
	EEnum getSubscriptionChannelType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SubscriptionTag <em>Subscription Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subscription Tag</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SubscriptionTag
	 * @generated
	 */
	EEnum getSubscriptionTag();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BodysiteLocationModifier <em>Bodysite Location Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bodysite Location Modifier</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BodysiteLocationModifier
	 * @generated
	 */
	EEnum getBodysiteLocationModifier();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.VaccineAdministeredValueSet <em>Vaccine Administered Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vaccine Administered Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.VaccineAdministeredValueSet
	 * @generated
	 */
	EEnum getVaccineAdministeredValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationRecommendationStatusCodes <em>Immunization Recommendation Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Recommendation Status Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationRecommendationStatusCodes
	 * @generated
	 */
	EEnum getImmunizationRecommendationStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationRecommendationDateCriterionCodes <em>Immunization Recommendation Date Criterion Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Recommendation Date Criterion Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationRecommendationDateCriterionCodes
	 * @generated
	 */
	EEnum getImmunizationRecommendationDateCriterionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationStatusCodes <em>Immunization Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Status Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationStatusCodes
	 * @generated
	 */
	EEnum getImmunizationStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationOrigin <em>Immunization Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Origin</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationOrigin
	 * @generated
	 */
	EEnum getImmunizationOrigin();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CodesForImmunizationSiteOfAdministration <em>Codes For Immunization Site Of Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Codes For Immunization Site Of Administration</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CodesForImmunizationSiteOfAdministration
	 * @generated
	 */
	EEnum getCodesForImmunizationSiteOfAdministration();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationRouteCodes <em>Immunization Route Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Route Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationRouteCodes
	 * @generated
	 */
	EEnum getImmunizationRouteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationReasonCodes <em>Immunization Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationReasonCodes
	 * @generated
	 */
	EEnum getImmunizationReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationReasonsForNotImmunizingCodes <em>Immunization Reasons For Not Immunizing Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Reasons For Not Immunizing Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ImmunizationReasonsForNotImmunizingCodes
	 * @generated
	 */
	EEnum getImmunizationReasonsForNotImmunizingCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.VaccinationProtocolDoseTargetCodes <em>Vaccination Protocol Dose Target Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vaccination Protocol Dose Target Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.VaccinationProtocolDoseTargetCodes
	 * @generated
	 */
	EEnum getVaccinationProtocolDoseTargetCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.VaccinationProtocolDoseStatusCodes <em>Vaccination Protocol Dose Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vaccination Protocol Dose Status Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.VaccinationProtocolDoseStatusCodes
	 * @generated
	 */
	EEnum getVaccinationProtocolDoseStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.VaccinationProtocolDoseStatusReasonCodes <em>Vaccination Protocol Dose Status Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vaccination Protocol Dose Status Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.VaccinationProtocolDoseStatusReasonCodes
	 * @generated
	 */
	EEnum getVaccinationProtocolDoseStatusReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BundleType <em>Bundle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bundle Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BundleType
	 * @generated
	 */
	EEnum getBundleType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SearchEntryMode <em>Search Entry Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Search Entry Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SearchEntryMode
	 * @generated
	 */
	EEnum getSearchEntryMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.HttpVerb <em>Http Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Verb</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.HttpVerb
	 * @generated
	 */
	EEnum getHttpVerb();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TestReportStatus <em>Test Report Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Report Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TestReportStatus
	 * @generated
	 */
	EEnum getTestReportStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TestReportParticipantType <em>Test Report Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Report Participant Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TestReportParticipantType
	 * @generated
	 */
	EEnum getTestReportParticipantType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TestReportResultCodes <em>Test Report Result Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Report Result Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TestReportResultCodes
	 * @generated
	 */
	EEnum getTestReportResultCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PriorityCodes <em>Priority Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PriorityCodes
	 * @generated
	 */
	EEnum getPriorityCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BenefitCategoryCodes <em>Benefit Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Category Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BenefitCategoryCodes
	 * @generated
	 */
	EEnum getBenefitCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BenefitSubCategoryCodes <em>Benefit Sub Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Sub Category Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BenefitSubCategoryCodes
	 * @generated
	 */
	EEnum getBenefitSubCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.NetworkTypeCodes <em>Network Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.NetworkTypeCodes
	 * @generated
	 */
	EEnum getNetworkTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.UnitTypeCodes <em>Unit Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.UnitTypeCodes
	 * @generated
	 */
	EEnum getUnitTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BenefitTermCodes <em>Benefit Term Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Term Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BenefitTermCodes
	 * @generated
	 */
	EEnum getBenefitTermCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BenefitTypeCodes <em>Benefit Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BenefitTypeCodes
	 * @generated
	 */
	EEnum getBenefitTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AdjudicationErrorCodes <em>Adjudication Error Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjudication Error Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AdjudicationErrorCodes
	 * @generated
	 */
	EEnum getAdjudicationErrorCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MedicationDispenseStatus <em>Medication Dispense Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Dispense Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MedicationDispenseStatus
	 * @generated
	 */
	EEnum getMedicationDispenseStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActPharmacySupplyType <em>Act Pharmacy Supply Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Pharmacy Supply Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActPharmacySupplyType
	 * @generated
	 */
	EEnum getActPharmacySupplyType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActSubstanceAdminSubstitutionCode <em>Act Substance Admin Substitution Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Substance Admin Substitution Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActSubstanceAdminSubstitutionCode
	 * @generated
	 */
	EEnum getActSubstanceAdminSubstitutionCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasureScoring <em>Measure Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Scoring</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasureScoring
	 * @generated
	 */
	EEnum getMeasureScoring();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CompositeMeasureScoring <em>Composite Measure Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composite Measure Scoring</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CompositeMeasureScoring
	 * @generated
	 */
	EEnum getCompositeMeasureScoring();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasureType
	 * @generated
	 */
	EEnum getMeasureType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasurePopulationType <em>Measure Population Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Population Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasurePopulationType
	 * @generated
	 */
	EEnum getMeasurePopulationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasureDataUsage <em>Measure Data Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Data Usage</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasureDataUsage
	 * @generated
	 */
	EEnum getMeasureDataUsage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasureReportType <em>Measure Report Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Report Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasureReportType
	 * @generated
	 */
	EEnum getMeasureReportType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MeasureReportStatus <em>Measure Report Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Report Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MeasureReportStatus
	 * @generated
	 */
	EEnum getMeasureReportStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ListStatus <em>List Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ListStatus
	 * @generated
	 */
	EEnum getListStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleUseCodesForList <em>Example Use Codes For List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Use Codes For List</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleUseCodesForList
	 * @generated
	 */
	EEnum getExampleUseCodesForList();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PatientMedicineChangeTypes <em>Patient Medicine Change Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Patient Medicine Change Types</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PatientMedicineChangeTypes
	 * @generated
	 */
	EEnum getPatientMedicineChangeTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleClaimTypeCodes <em>Example Claim Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Claim Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleClaimTypeCodes
	 * @generated
	 */
	EEnum getExampleClaimTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleClaimSubTypeCodes <em>Example Claim Sub Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Claim Sub Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleClaimSubTypeCodes
	 * @generated
	 */
	EEnum getExampleClaimSubTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.Use <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.Use
	 * @generated
	 */
	EEnum getUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.FundsReservationCodes <em>Funds Reservation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Funds Reservation Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.FundsReservationCodes
	 * @generated
	 */
	EEnum getFundsReservationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleRelatedClaimRelationshipCodes <em>Example Related Claim Relationship Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Related Claim Relationship Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleRelatedClaimRelationshipCodes
	 * @generated
	 */
	EEnum getExampleRelatedClaimRelationshipCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PayeeTypeCodes <em>Payee Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payee Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PayeeTypeCodes
	 * @generated
	 */
	EEnum getPayeeTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PayeeResourceType <em>Payee Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payee Resource Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PayeeResourceType
	 * @generated
	 */
	EEnum getPayeeResourceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PayeeResourceType <em>Payee Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payee Resource Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PayeeResourceType
	 * @generated
	 */
	EEnum getPayeeResourceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ClaimCareTeamRoleCodes <em>Claim Care Team Role Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Claim Care Team Role Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ClaimCareTeamRoleCodes
	 * @generated
	 */
	EEnum getClaimCareTeamRoleCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleProviderQualificationCodes <em>Example Provider Qualification Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Provider Qualification Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleProviderQualificationCodes
	 * @generated
	 */
	EEnum getExampleProviderQualificationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ClaimInformationCategoryCodes <em>Claim Information Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Claim Information Category Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ClaimInformationCategoryCodes
	 * @generated
	 */
	EEnum getClaimInformationCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExceptionCodes <em>Exception Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exception Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExceptionCodes
	 * @generated
	 */
	EEnum getExceptionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MissingToothReasonCodes <em>Missing Tooth Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Missing Tooth Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MissingToothReasonCodes
	 * @generated
	 */
	EEnum getMissingToothReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IcD10Codes <em>Ic D10 Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ic D10 Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IcD10Codes
	 * @generated
	 */
	EEnum getIcD10Codes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleDiagnosisTypeCodes <em>Example Diagnosis Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Diagnosis Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleDiagnosisTypeCodes
	 * @generated
	 */
	EEnum getExampleDiagnosisTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleDiagnosisRelatedGroupCodes <em>Example Diagnosis Related Group Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Diagnosis Related Group Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleDiagnosisRelatedGroupCodes
	 * @generated
	 */
	EEnum getExampleDiagnosisRelatedGroupCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.IcD10ProcedureCodes <em>Ic D10 Procedure Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ic D10 Procedure Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.IcD10ProcedureCodes
	 * @generated
	 */
	EEnum getIcD10ProcedureCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActIncidentCode <em>Act Incident Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Incident Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActIncidentCode
	 * @generated
	 */
	EEnum getActIncidentCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleRevenueCenterCodes <em>Example Revenue Center Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Revenue Center Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleRevenueCenterCodes
	 * @generated
	 */
	EEnum getExampleRevenueCenterCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.UsclsCodes <em>Uscls Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Uscls Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.UsclsCodes
	 * @generated
	 */
	EEnum getUsclsCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ModifierTypeCodes <em>Modifier Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modifier Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ModifierTypeCodes
	 * @generated
	 */
	EEnum getModifierTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleProgramReasonCodes <em>Example Program Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Program Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleProgramReasonCodes
	 * @generated
	 */
	EEnum getExampleProgramReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExampleServicePlaceCodes <em>Example Service Place Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Service Place Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExampleServicePlaceCodes
	 * @generated
	 */
	EEnum getExampleServicePlaceCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.OralSiteCodes <em>Oral Site Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Oral Site Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.OralSiteCodes
	 * @generated
	 */
	EEnum getOralSiteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SurfaceCodes <em>Surface Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Surface Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SurfaceCodes
	 * @generated
	 */
	EEnum getSurfaceCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.OralProsthoMaterialTypeCodes <em>Oral Prostho Material Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Oral Prostho Material Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.OralProsthoMaterialTypeCodes
	 * @generated
	 */
	EEnum getOralProsthoMaterialTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AdjudicationCodes <em>Adjudication Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjudication Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AdjudicationCodes
	 * @generated
	 */
	EEnum getAdjudicationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AdjudicationReasonCodes <em>Adjudication Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjudication Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AdjudicationReasonCodes
	 * @generated
	 */
	EEnum getAdjudicationReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExamplePaymentTypeCodes <em>Example Payment Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Payment Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExamplePaymentTypeCodes
	 * @generated
	 */
	EEnum getExamplePaymentTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PaymentAdjustmentReasonCodes <em>Payment Adjustment Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Adjustment Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PaymentAdjustmentReasonCodes
	 * @generated
	 */
	EEnum getPaymentAdjustmentReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TaskStatus <em>Task Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TaskStatus
	 * @generated
	 */
	EEnum getTaskStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.TaskPerformerType <em>Task Performer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Performer Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.TaskPerformerType
	 * @generated
	 */
	EEnum getTaskPerformerType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ExplanationOfBenefitStatus <em>Explanation Of Benefit Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Explanation Of Benefit Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ExplanationOfBenefitStatus
	 * @generated
	 */
	EEnum getExplanationOfBenefitStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PayeeResourceType <em>Payee Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payee Resource Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PayeeResourceType
	 * @generated
	 */
	EEnum getPayeeResourceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ActInvoiceGroupCode <em>Act Invoice Group Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Invoice Group Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ActInvoiceGroupCode
	 * @generated
	 */
	EEnum getActInvoiceGroupCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GuideDependencyType <em>Guide Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guide Dependency Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GuideDependencyType
	 * @generated
	 */
	EEnum getGuideDependencyType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GuidePageKind <em>Guide Page Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guide Page Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GuidePageKind
	 * @generated
	 */
	EEnum getGuidePageKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.XPathUsageType <em>XPath Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XPath Usage Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.XPathUsageType
	 * @generated
	 */
	EEnum getXPathUsageType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SearchComparator <em>Search Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Search Comparator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SearchComparator
	 * @generated
	 */
	EEnum getSearchComparator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SearchModifierCode <em>Search Modifier Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Search Modifier Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SearchModifierCode
	 * @generated
	 */
	EEnum getSearchModifierCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SystemVersionProcessingMode <em>System Version Processing Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Version Processing Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SystemVersionProcessingMode
	 * @generated
	 */
	EEnum getSystemVersionProcessingMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.CompartmentType <em>Compartment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compartment Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.CompartmentType
	 * @generated
	 */
	EEnum getCompartmentType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.ProcessOutcomeCodes <em>Process Outcome Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Outcome Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.ProcessOutcomeCodes
	 * @generated
	 */
	EEnum getProcessOutcomeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.PaymentStatusCodes <em>Payment Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Status Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.PaymentStatusCodes
	 * @generated
	 */
	EEnum getPaymentStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.LinkageType <em>Linkage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Linkage Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.LinkageType
	 * @generated
	 */
	EEnum getLinkageType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplyRequestStatus <em>Supply Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Request Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplyRequestStatus
	 * @generated
	 */
	EEnum getSupplyRequestStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplyType <em>Supply Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplyType
	 * @generated
	 */
	EEnum getSupplyType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtSupplyItem <em>Snomed Ct Supply Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Supply Item</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SnomedCtSupplyItem
	 * @generated
	 */
	EEnum getSnomedCtSupplyItem();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplyRequestReason <em>Supply Request Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Request Reason</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplyRequestReason
	 * @generated
	 */
	EEnum getSupplyRequestReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplyRequestWhen <em>Supply Request When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Request When</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplyRequestWhen
	 * @generated
	 */
	EEnum getSupplyRequestWhen();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.GuidanceResponseStatus <em>Guidance Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guidance Response Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.GuidanceResponseStatus
	 * @generated
	 */
	EEnum getGuidanceResponseStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DetectedIssueCategory <em>Detected Issue Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Detected Issue Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DetectedIssueCategory
	 * @generated
	 */
	EEnum getDetectedIssueCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DetectedIssueSeverity <em>Detected Issue Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Detected Issue Severity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DetectedIssueSeverity
	 * @generated
	 */
	EEnum getDetectedIssueSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.DetectedIssueMitigationAction <em>Detected Issue Mitigation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Detected Issue Mitigation Action</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.DetectedIssueMitigationAction
	 * @generated
	 */
	EEnum getDetectedIssueMitigationAction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventId <em>Audit Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Id</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventId
	 * @generated
	 */
	EEnum getAuditEventId();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventSubType <em>Audit Event Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Sub Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventSubType
	 * @generated
	 */
	EEnum getAuditEventSubType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventAction <em>Audit Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Action</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventAction
	 * @generated
	 */
	EEnum getAuditEventAction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventOutcome <em>Audit Event Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Outcome</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventOutcome
	 * @generated
	 */
	EEnum getAuditEventOutcome();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditAgentRoleIdCode <em>Audit Agent Role Id Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Agent Role Id Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditAgentRoleIdCode
	 * @generated
	 */
	EEnum getAuditAgentRoleIdCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.MediaTypeCode <em>Media Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.MediaTypeCode
	 * @generated
	 */
	EEnum getMediaTypeCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventAgentNetworkType <em>Audit Event Agent Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Agent Network Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventAgentNetworkType
	 * @generated
	 */
	EEnum getAuditEventAgentNetworkType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventSourceType <em>Audit Event Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Source Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventSourceType
	 * @generated
	 */
	EEnum getAuditEventSourceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventEntityType <em>Audit Event Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Entity Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventEntityType
	 * @generated
	 */
	EEnum getAuditEventEntityType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventEntityRole <em>Audit Event Entity Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Entity Role</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventEntityRole
	 * @generated
	 */
	EEnum getAuditEventEntityRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventEntityLifecycle <em>Audit Event Entity Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Entity Lifecycle</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.AuditEventEntityLifecycle
	 * @generated
	 */
	EEnum getAuditEventEntityLifecycle();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.BasicResourceTypes <em>Basic Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basic Resource Types</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.BasicResourceTypes
	 * @generated
	 */
	EEnum getBasicResourceTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplyDeliveryStatus <em>Supply Delivery Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Delivery Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplyDeliveryStatus
	 * @generated
	 */
	EEnum getSupplyDeliveryStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueSets.SupplyItemType <em>Supply Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Item Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueSets.SupplyItemType
	 * @generated
	 */
	EEnum getSupplyItemType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValueSetsFactory getValueSetsFactory();

} //ValueSetsPackage
