/**
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesFactory
 * @model kind="package"
 * @generated
 */
public interface DataTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///fhiRCore/dataTypes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fhiRCore.dataTypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypesPackage eINSTANCE = org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BaseImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getBase()
	 * @generated
	 */
	int BASE = 1;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EXTENSION = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.StringImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getString()
	 * @generated
	 */
	int STRING = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ExtensionImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__URL = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUEX = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UriImpl <em>Uri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UriImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getUri()
	 * @generated
	 */
	int URI = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.Base64BinaryImpl <em>Base64 Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.Base64BinaryImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getBase64Binary()
	 * @generated
	 */
	int BASE64_BINARY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base64 Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base64 Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BooleanImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CodeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ID = STRING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__EXTENSION = STRING__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__VALUE = STRING__VALUE;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DateImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DateTimeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DecimalImpl <em>Decimal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DecimalImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDecimal()
	 * @generated
	 */
	int DECIMAL = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.IdImpl <em>Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.IdImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getId()
	 * @generated
	 */
	int ID = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__ID = STRING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__EXTENSION = STRING__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__VALUE = STRING__VALUE;

	/**
	 * The number of structural features of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.InstantImpl <em>Instant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.InstantImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getInstant()
	 * @generated
	 */
	int INSTANT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.IntegerImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MarkdownImpl <em>Markdown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MarkdownImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getMarkdown()
	 * @generated
	 */
	int MARKDOWN = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__ID = STRING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__EXTENSION = STRING__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__VALUE = STRING__VALUE;

	/**
	 * The number of structural features of the '<em>Markdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Markdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.OidImpl <em>Oid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.OidImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getOid()
	 * @generated
	 */
	int OID = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__ID = URI__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__EXTENSION = URI__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__VALUE = URI__VALUE;

	/**
	 * The number of structural features of the '<em>Oid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID_FEATURE_COUNT = URI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Oid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID_OPERATION_COUNT = URI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.PositiveIntImpl <em>Positive Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.PositiveIntImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getPositiveInt()
	 * @generated
	 */
	int POSITIVE_INT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT__ID = INTEGER__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT__EXTENSION = INTEGER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT__VALUE = INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>Positive Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UnsignedIntImpl <em>Unsigned Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UnsignedIntImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getUnsignedInt()
	 * @generated
	 */
	int UNSIGNED_INT = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT__ID = INTEGER__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT__EXTENSION = INTEGER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT__VALUE = INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>Unsigned Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unsigned Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AddressImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__USE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TYPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TEXT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__LINE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>District</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__DISTRICT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__POSTAL_CODE = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__PERIOD = DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.PeriodImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__START = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__END = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.QuantityImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__COMPARATOR = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__UNIT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__SYSTEM = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__CODE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AgeImpl <em>Age</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AgeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getAge()
	 * @generated
	 */
	int AGE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AnnotationImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Authorx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__AUTHORX = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TIME = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TEXT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MetaImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getMeta()
	 * @generated
	 */
	int META = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Version Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__VERSION_ID = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Updated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__LAST_UPDATED = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__PROFILE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Security</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__SECURITY = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__TAG = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CodingImpl <em>Coding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CodingImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getCoding()
	 * @generated
	 */
	int CODING = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__SYSTEM = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__VERSION = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__CODE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__DISPLAY = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__USER_SELECTED = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Coding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Coding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.NarrativeImpl <em>Narrative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.NarrativeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getNarrative()
	 * @generated
	 */
	int NARRATIVE = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__STATUS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Div</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__DIV = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Narrative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Narrative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.XhtmlImpl <em>Xhtml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.XhtmlImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getXhtml()
	 * @generated
	 */
	int XHTML = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML__EXTENSION = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML__EXTENSION = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML__VALUE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xhtml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Xhtml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl <em>Backbone Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getBackboneElement()
	 * @generated
	 */
	int BACKBONE_ELEMENT = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT__MODIFIER_EXTENSION = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Backbone Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Backbone Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.xhtmlValueImpl <em>xhtml Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.xhtmlValueImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getxhtmlValue()
	 * @generated
	 */
	int XHTML_VALUE = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VALUE__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VALUE__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VALUE__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The number of structural features of the '<em>xhtml Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VALUE_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>xhtml Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VALUE_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.IdentifierImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__USE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__TYPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__SYSTEM = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__VALUE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__PERIOD = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assigner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ASSIGNER = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CodeableConceptImpl <em>Codeable Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CodeableConceptImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getCodeableConcept()
	 * @generated
	 */
	int CODEABLE_CONCEPT = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__CODING = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__TEXT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Codeable Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Codeable Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.HumanNameImpl <em>Human Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.HumanNameImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getHumanName()
	 * @generated
	 */
	int HUMAN_NAME = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__USE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__TEXT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Family</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__FAMILY = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Given</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__GIVEN = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__PREFIX = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__SUFFIX = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__PERIOD = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Human Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Human Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ContactPointImpl <em>Contact Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ContactPointImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getContactPoint()
	 * @generated
	 */
	int CONTACT_POINT = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__SYSTEM = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__VALUE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__USE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__RANK = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__PERIOD = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Contact Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Contact Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AttachmentImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CONTENT_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__LANGUAGE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__DATA = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__URL = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__SIZE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__HASH = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__TITLE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Creation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CREATION = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UsageContextImpl <em>Usage Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UsageContextImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getUsageContext()
	 * @generated
	 */
	int USAGE_CONTEXT = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__CODE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__VALUEX = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Usage Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Usage Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ContributorImpl <em>Contributor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ContributorImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getContributor()
	 * @generated
	 */
	int CONTRIBUTOR = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__NAME = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__CONTACT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ContactDetailImpl <em>Contact Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ContactDetailImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getContactDetail()
	 * @generated
	 */
	int CONTACT_DETAIL = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__TELECOM = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contact Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Contact Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.RelatedArtifactImpl <em>Related Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.RelatedArtifactImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getRelatedArtifact()
	 * @generated
	 */
	int RELATED_ARTIFACT = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__DISPLAY = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__CITATION = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__URL = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__DOCUMENT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__RESOURCE = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Related Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Related Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ParameterDefinitionImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getParameterDefinition()
	 * @generated
	 */
	int PARAMETER_DEFINITION = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__USE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__MIN = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__MAX = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__DOCUMENTATION = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__TYPE = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__PROFILE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinition()
	 * @generated
	 */
	int ELEMENT_DEFINITION = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__PATH = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__REPRESENTATION = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slice Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__SLICE_NAME = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__LABEL = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CODE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Slicing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__SLICING = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Short</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__SHORT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__DEFINITION = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__COMMENTS = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__REQUIREMENTS = DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__ALIAS = DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MIN = DATA_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MAX = DATA_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__BASE = DATA_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Content Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CONTENT_REFERENCE = DATA_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__TYPE = DATA_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Default Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__DEFAULT_VALUEX = DATA_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Meaning When Missing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MEANING_WHEN_MISSING = DATA_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Fixedx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__FIXEDX = DATA_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Patternx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__PATTERNX = DATA_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Example</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__EXAMPLE = DATA_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Min Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MIN_VALUEX = DATA_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Max Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MAX_VALUEX = DATA_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MAX_LENGTH = DATA_TYPE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CONDITION = DATA_TYPE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CONSTRAINT = DATA_TYPE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Must Support</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MUST_SUPPORT = DATA_TYPE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Is Modifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__IS_MODIFIER = DATA_TYPE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Is Summary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__IS_SUMMARY = DATA_TYPE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__BINDING = DATA_TYPE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MAPPING = DATA_TYPE_FEATURE_COUNT + 30;

	/**
	 * The number of structural features of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 31;

	/**
	 * The number of operations of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement1Impl <em>Element Definition Element1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement1Impl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement1()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT1 = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Discriminator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1__ORDERED = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1__RULES = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element Definition Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Element Definition Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement2Impl <em>Element Definition Element2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement2Impl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement2()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT2 = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2__PATH = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2__MIN = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2__MAX = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Definition Element2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element Definition Element2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement3Impl <em>Element Definition Element3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement3Impl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement3()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT3 = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__CODE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__PROFILE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__AGGREGATION = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Versioning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__VERSIONING = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Element Definition Element3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Element Definition Element3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement4Impl <em>Element Definition Element4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement4Impl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement4()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT4 = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT4__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT4__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT4__LABEL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT4__VALUEX = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Definition Element4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT4_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element Definition Element4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT4_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement5Impl <em>Element Definition Element5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement5Impl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement5()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT5 = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__KEY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__SEVERITY = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Human</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__HUMAN = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__EXPRESSION = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__XPATH = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__SOURCE = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Element Definition Element5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Element Definition Element5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement6Impl <em>Element Definition Element6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement6Impl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement6()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT6 = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6__STRENGTH = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6__DESCRIPTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Setx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6__VALUE_SETX = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Definition Element6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element Definition Element6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement7Impl <em>Element Definition Element7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement7Impl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement7()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT7 = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7__IDENTITY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7__LANGUAGE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7__MAP = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Definition Element7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element Definition Element7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementImpl <em>Data Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDataRequirement()
	 * @generated
	 */
	int DATA_REQUIREMENT = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__PROFILE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Must Support</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__MUST_SUPPORT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Code Filter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__CODE_FILTER = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Date Filter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__DATE_FILTER = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementElement1Impl <em>Data Requirement Element1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementElement1Impl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDataRequirementElement1()
	 * @generated
	 */
	int DATA_REQUIREMENT_ELEMENT1 = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1__PATH = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Setx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1__VALUE_SETX = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Code</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1__VALUE_CODE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Coding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1__VALUE_CODING = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Codeable Concept</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1__VALUE_CODEABLE_CONCEPT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Requirement Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Requirement Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementElement2Impl <em>Data Requirement Element2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementElement2Impl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDataRequirementElement2()
	 * @generated
	 */
	int DATA_REQUIREMENT_ELEMENT2 = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT2__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT2__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT2__PATH = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT2__VALUEX = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Requirement Element2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT2_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Requirement Element2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT2_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TriggerDefinitionImpl <em>Trigger Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TriggerDefinitionImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getTriggerDefinition()
	 * @generated
	 */
	int TRIGGER_DEFINITION = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__EVENT_NAME = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Timingx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__EVENT_TIMINGX = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__EVENT_DATA = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Trigger Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Trigger Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SimpleQuantityImpl <em>Simple Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SimpleQuantityImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getSimpleQuantity()
	 * @generated
	 */
	int SIMPLE_QUANTITY = 53;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__COMPARATOR = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__CODE = QUANTITY__CODE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__COMPARATOR = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl <em>Dosage Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDosageInstruction()
	 * @generated
	 */
	int DOSAGE_INSTRUCTION = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__SEQUENCE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__TEXT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additional Instructions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__TIMING = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>As Neededx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__AS_NEEDEDX = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__SITE = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__ROUTE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__METHOD = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dosex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__DOSEX = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max Dose Per Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD = DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Dose Per Administration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__MAX_DOSE_PER_ADMINISTRATION = DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Max Dose Per Lifetime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__MAX_DOSE_PER_LIFETIME = DATA_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Ratex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION__RATEX = DATA_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Dosage Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Dosage Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_INSTRUCTION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingImpl <em>Timing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getTiming()
	 * @generated
	 */
	int TIMING = 55;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__EVENT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__REPEAT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__CODE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl <em>Timing Element1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getTimingElement1()
	 * @generated
	 */
	int TIMING_ELEMENT1 = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Boundsx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__BOUNDSX = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__COUNT_MAX = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__DURATION = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duration Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__DURATION_MAX = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Duration Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__DURATION_UNIT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__FREQUENCY = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Frequency Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__FREQUENCY_MAX = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__PERIOD = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Period Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__PERIOD_MAX = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Period Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__PERIOD_UNIT = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Day Of Week</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__DAY_OF_WEEK = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Time Of Day</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__TIME_OF_DAY = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__WHEN = ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__OFFSET = ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Timing Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Timing Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.RatioImpl <em>Ratio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.RatioImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getRatio()
	 * @generated
	 */
	int RATIO = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Numerator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__NUMERATOR = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__DENOMINATOR = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MoneyImpl <em>Money</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MoneyImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getMoney()
	 * @generated
	 */
	int MONEY = 58;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Money</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Money</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SignatureImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 59;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__WHEN = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Whox</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__WHOX = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Behalf Ofx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ON_BEHALF_OFX = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__CONTENT_TYPE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Blob</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__BLOB = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DurationImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 60;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.RangeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 61;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Low</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__LOW = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__HIGH = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ReferenceImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 62;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IDENTIFIER = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DISPLAY = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CountImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 63;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DistanceImpl <em>Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DistanceImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDistance()
	 * @generated
	 */
	int DISTANCE = 64;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SampledDataImpl <em>Sampled Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SampledDataImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getSampledData()
	 * @generated
	 */
	int SAMPLED_DATA = 65;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__ORIGIN = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__PERIOD = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__FACTOR = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__LOWER_LIMIT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__UPPER_LIMIT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__DIMENSIONS = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__DATA = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Sampled Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Sampled Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UuidImpl <em>Uuid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UuidImpl
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getUuid()
	 * @generated
	 */
	int UUID = 66;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID__ID = URI__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID__EXTENSION = URI__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID__VALUE = URI__VALUE;

	/**
	 * The number of structural features of the '<em>Uuid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_FEATURE_COUNT = URI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uuid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_OPERATION_COUNT = URI_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Element#getExtensions <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extension</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Element#getExtensions()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Extension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Base
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.String#getValue()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Extension#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Url</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Extension#getUrl()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Url();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Extension#getValuex <em>Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valuex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Extension#getValuex()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Valuex();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Uri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Uri
	 * @generated
	 */
	EClass getUri();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Uri#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Uri#getValue()
	 * @see #getUri()
	 * @generated
	 */
	EAttribute getUri_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Base64Binary <em>Base64 Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base64 Binary</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Base64Binary
	 * @generated
	 */
	EClass getBase64Binary();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Base64Binary#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Base64Binary#getValue()
	 * @see #getBase64Binary()
	 * @generated
	 */
	EAttribute getBase64Binary_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean#isValue()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Date#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Date#getValue()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime#getValue()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal
	 * @generated
	 */
	EClass getDecimal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal#getValue()
	 * @see #getDecimal()
	 * @generated
	 */
	EAttribute getDecimal_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Id
	 * @generated
	 */
	EClass getId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Instant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instant</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Instant
	 * @generated
	 */
	EClass getInstant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Instant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Instant#getValue()
	 * @see #getInstant()
	 * @generated
	 */
	EAttribute getInstant_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Integer#getValue()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Markdown <em>Markdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markdown</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Markdown
	 * @generated
	 */
	EClass getMarkdown();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Oid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oid</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Oid
	 * @generated
	 */
	EClass getOid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.PositiveInt <em>Positive Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Int</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.PositiveInt
	 * @generated
	 */
	EClass getPositiveInt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Time#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Time#getValue()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.UnsignedInt <em>Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Int</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.UnsignedInt
	 * @generated
	 */
	EClass getUnsignedInt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getUse()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Use();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getType()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getText()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Text();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getLines <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getLines()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Line();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_City();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getDistrict <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>District</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getDistrict()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_District();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_State();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Postal Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getPostalCode()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_PostalCode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Country();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Address#getPeriod()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Period();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Period#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Period#getStart()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_Start();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Period#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Period#getEnd()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_End();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Age <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Age
	 * @generated
	 */
	EClass getAge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity#getValue()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comparator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity#getComparator()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Comparator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity#getUnit()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Unit();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity#getSystem()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_System();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity#getCode()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Code();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation#getAuthorx <em>Authorx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authorx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation#getAuthorx()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Authorx();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation#getTime()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Time();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getVersionId <em>Version Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version Id</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getVersionId()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_VersionId();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getLastUpdated <em>Last Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Updated</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getLastUpdated()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_LastUpdated();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getProfiles <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Profile</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getProfiles()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Profile();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getSecurities <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getSecurities()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Security();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getTags <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tag</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Meta#getTags()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Tag();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Coding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Coding
	 * @generated
	 */
	EClass getCoding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Coding#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Coding#getSystem()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_System();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Coding#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Coding#getVersion()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Version();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Coding#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Coding#getCode()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Code();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Coding#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Coding#getDisplay()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Display();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Coding#getUserSelected <em>User Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Selected</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Coding#getUserSelected()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_UserSelected();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Narrative <em>Narrative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Narrative</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Narrative
	 * @generated
	 */
	EClass getNarrative();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Narrative#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Narrative#getStatus()
	 * @see #getNarrative()
	 * @generated
	 */
	EReference getNarrative_Status();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Narrative#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Div</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Narrative#getDiv()
	 * @see #getNarrative()
	 * @generated
	 */
	EReference getNarrative_Div();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Xhtml <em>Xhtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xhtml</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Xhtml
	 * @generated
	 */
	EClass getXhtml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Xhtml#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Xhtml#getExtension()
	 * @see #getXhtml()
	 * @generated
	 */
	EAttribute getXhtml_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Xhtml#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Xhtml#getValue()
	 * @see #getXhtml()
	 * @generated
	 */
	EReference getXhtml_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.xhtmlValue <em>xhtml Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xhtml Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.xhtmlValue
	 * @generated
	 */
	EClass getxhtmlValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement <em>Backbone Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backbone Element</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement
	 * @generated
	 */
	EClass getBackboneElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement#getModifierExtensions <em>Modifier Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modifier Extension</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement#getModifierExtensions()
	 * @see #getBackboneElement()
	 * @generated
	 */
	EReference getBackboneElement_ModifierExtension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier#getUse()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Use();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier#getType()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier#getSystem()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_System();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier#getValue()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier#getPeriod()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Period();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier#getAssigner <em>Assigner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigner</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier#getAssigner()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Assigner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept <em>Codeable Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Codeable Concept</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept
	 * @generated
	 */
	EClass getCodeableConcept();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept#getCodings <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coding</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept#getCodings()
	 * @see #getCodeableConcept()
	 * @generated
	 */
	EReference getCodeableConcept_Coding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept#getText()
	 * @see #getCodeableConcept()
	 * @generated
	 */
	EReference getCodeableConcept_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName <em>Human Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Name</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName
	 * @generated
	 */
	EClass getHumanName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getUse()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Use();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getText()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Text();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Family</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getFamily()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Family();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getGivens <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Given</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getGivens()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Given();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getPrefixes <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prefix</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getPrefixes()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Prefix();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getSuffixes <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Suffix</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getSuffixes()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Suffix();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName#getPeriod()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Period();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Point</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint
	 * @generated
	 */
	EClass getContactPoint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint#getSystem()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_System();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint#getValue()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint#getUse()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Use();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rank</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint#getRank()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Rank();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint#getPeriod()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Period();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getContentType()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_ContentType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getLanguage()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Language();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getData()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Data();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Url</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getUrl()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Url();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Size</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getSize()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Size();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hash</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getHash()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Hash();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Title</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getTitle()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Title();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getCreation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Creation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment#getCreation()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Creation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext <em>Usage Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Context</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext
	 * @generated
	 */
	EClass getUsageContext();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext#getCode()
	 * @see #getUsageContext()
	 * @generated
	 */
	EReference getUsageContext_Code();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext#getValuex <em>Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valuex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext#getValuex()
	 * @see #getUsageContext()
	 * @generated
	 */
	EReference getUsageContext_Valuex();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Contributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributor</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Contributor
	 * @generated
	 */
	EClass getContributor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Contributor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Contributor#getType()
	 * @see #getContributor()
	 * @generated
	 */
	EReference getContributor_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Contributor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Contributor#getName()
	 * @see #getContributor()
	 * @generated
	 */
	EReference getContributor_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Contributor#getContacts <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Contributor#getContacts()
	 * @see #getContributor()
	 * @generated
	 */
	EReference getContributor_Contact();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ContactDetail <em>Contact Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Detail</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ContactDetail
	 * @generated
	 */
	EClass getContactDetail();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ContactDetail#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ContactDetail#getName()
	 * @see #getContactDetail()
	 * @generated
	 */
	EReference getContactDetail_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ContactDetail#getTelecoms <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Telecom</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ContactDetail#getTelecoms()
	 * @see #getContactDetail()
	 * @generated
	 */
	EReference getContactDetail_Telecom();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact <em>Related Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Artifact</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact
	 * @generated
	 */
	EClass getRelatedArtifact();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact#getType()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact#getDisplay()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Display();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Citation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact#getCitation()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Citation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Url</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact#getUrl()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Url();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact#getDocument()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Document();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact#getResource()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Resource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Definition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition
	 * @generated
	 */
	EClass getParameterDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getName()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getUse()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Use();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getMin()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Min();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getMax()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Max();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Documentation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getDocumentation()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Documentation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getType()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Profile</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ParameterDefinition#getProfile()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Profile();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition <em>Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition
	 * @generated
	 */
	EClass getElementDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getPath()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getRepresentations <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Representation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getRepresentations()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Representation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getSliceName <em>Slice Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slice Name</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getSliceName()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_SliceName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getLabel()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Label();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getCodes <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getCodes()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Code();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getSlicing <em>Slicing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slicing</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getSlicing()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Slicing();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getShort <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Short</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getShort()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Short();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getDefinition()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Definition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comments</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getComments()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirements</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getRequirements()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Requirements();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alias</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getAlias()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Alias();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMin()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Min();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMax()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Max();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getBase()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Base();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getContentReference <em>Content Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Reference</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getContentReference()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_ContentReference();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getTypes <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getTypes()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getDefaultValuex <em>Default Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Valuex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getDefaultValuex()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_DefaultValuex();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meaning When Missing</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMeaningWhenMissing()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MeaningWhenMissing();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getFixedx <em>Fixedx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixedx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getFixedx()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Fixedx();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getPatternx <em>Patternx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Patternx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getPatternx()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Patternx();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getExamples <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Example</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getExamples()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Example();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMinValuex <em>Min Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Valuex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMinValuex()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MinValuex();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMaxValuex <em>Max Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Valuex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMaxValuex()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MaxValuex();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Length</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMaxLength()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MaxLength();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getConditions <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getConditions()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Condition();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getConstraints <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getConstraints()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Constraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMustSupport <em>Must Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Must Support</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMustSupport()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MustSupport();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getIsModifier <em>Is Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Modifier</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getIsModifier()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_IsModifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getIsSummary <em>Is Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Summary</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getIsSummary()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_IsSummary();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getBinding()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Binding();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMappings <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mapping</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinition#getMappings()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Mapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement1 <em>Element Definition Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element1</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement1
	 * @generated
	 */
	EClass getElementDefinitionElement1();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement1#getDiscriminators <em>Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discriminator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement1#getDiscriminators()
	 * @see #getElementDefinitionElement1()
	 * @generated
	 */
	EReference getElementDefinitionElement1_Discriminator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement1#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement1#getDescription()
	 * @see #getElementDefinitionElement1()
	 * @generated
	 */
	EReference getElementDefinitionElement1_Description();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement1#getOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ordered</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement1#getOrdered()
	 * @see #getElementDefinitionElement1()
	 * @generated
	 */
	EReference getElementDefinitionElement1_Ordered();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement1#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rules</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement1#getRules()
	 * @see #getElementDefinitionElement1()
	 * @generated
	 */
	EReference getElementDefinitionElement1_Rules();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement2 <em>Element Definition Element2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element2</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement2
	 * @generated
	 */
	EClass getElementDefinitionElement2();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement2#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement2#getPath()
	 * @see #getElementDefinitionElement2()
	 * @generated
	 */
	EReference getElementDefinitionElement2_Path();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement2#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement2#getMin()
	 * @see #getElementDefinitionElement2()
	 * @generated
	 */
	EReference getElementDefinitionElement2_Min();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement2#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement2#getMax()
	 * @see #getElementDefinitionElement2()
	 * @generated
	 */
	EReference getElementDefinitionElement2_Max();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3 <em>Element Definition Element3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element3</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3
	 * @generated
	 */
	EClass getElementDefinitionElement3();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getCode()
	 * @see #getElementDefinitionElement3()
	 * @generated
	 */
	EReference getElementDefinitionElement3_Code();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Profile</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getProfile()
	 * @see #getElementDefinitionElement3()
	 * @generated
	 */
	EReference getElementDefinitionElement3_Profile();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getTargetProfile <em>Target Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Profile</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getTargetProfile()
	 * @see #getElementDefinitionElement3()
	 * @generated
	 */
	EReference getElementDefinitionElement3_TargetProfile();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getAggregations <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aggregation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getAggregations()
	 * @see #getElementDefinitionElement3()
	 * @generated
	 */
	EReference getElementDefinitionElement3_Aggregation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getVersioning <em>Versioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Versioning</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getVersioning()
	 * @see #getElementDefinitionElement3()
	 * @generated
	 */
	EReference getElementDefinitionElement3_Versioning();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement4 <em>Element Definition Element4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element4</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement4
	 * @generated
	 */
	EClass getElementDefinitionElement4();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement4#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement4#getLabel()
	 * @see #getElementDefinitionElement4()
	 * @generated
	 */
	EReference getElementDefinitionElement4_Label();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement4#getValuex <em>Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valuex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement4#getValuex()
	 * @see #getElementDefinitionElement4()
	 * @generated
	 */
	EReference getElementDefinitionElement4_Valuex();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5 <em>Element Definition Element5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element5</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5
	 * @generated
	 */
	EClass getElementDefinitionElement5();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getKey()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Key();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirements</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getRequirements()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Requirements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Severity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getSeverity()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Severity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getHuman <em>Human</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Human</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getHuman()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Human();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getExpression()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Expression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xpath</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getXpath()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Xpath();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5#getSource()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Source();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement6 <em>Element Definition Element6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element6</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement6
	 * @generated
	 */
	EClass getElementDefinitionElement6();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement6#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Strength</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement6#getStrength()
	 * @see #getElementDefinitionElement6()
	 * @generated
	 */
	EReference getElementDefinitionElement6_Strength();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement6#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement6#getDescription()
	 * @see #getElementDefinitionElement6()
	 * @generated
	 */
	EReference getElementDefinitionElement6_Description();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement6#getValueSetx <em>Value Setx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Setx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement6#getValueSetx()
	 * @see #getElementDefinitionElement6()
	 * @generated
	 */
	EReference getElementDefinitionElement6_ValueSetx();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement7 <em>Element Definition Element7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element7</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement7
	 * @generated
	 */
	EClass getElementDefinitionElement7();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement7#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement7#getIdentity()
	 * @see #getElementDefinitionElement7()
	 * @generated
	 */
	EReference getElementDefinitionElement7_Identity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement7#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement7#getLanguage()
	 * @see #getElementDefinitionElement7()
	 * @generated
	 */
	EReference getElementDefinitionElement7_Language();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement7#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement7#getMap()
	 * @see #getElementDefinitionElement7()
	 * @generated
	 */
	EReference getElementDefinitionElement7_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement <em>Data Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Requirement</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement
	 * @generated
	 */
	EClass getDataRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement#getType()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement#getProfiles <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Profile</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement#getProfiles()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_Profile();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement#getMustSupports <em>Must Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Must Support</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement#getMustSupports()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_MustSupport();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement#getCodeFilters <em>Code Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Code Filter</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement#getCodeFilters()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_CodeFilter();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement#getDateFilters <em>Date Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Date Filter</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement#getDateFilters()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_DateFilter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1 <em>Data Requirement Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Requirement Element1</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1
	 * @generated
	 */
	EClass getDataRequirementElement1();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getPath()
	 * @see #getDataRequirementElement1()
	 * @generated
	 */
	EReference getDataRequirementElement1_Path();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getValueSetx <em>Value Setx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Setx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getValueSetx()
	 * @see #getDataRequirementElement1()
	 * @generated
	 */
	EReference getDataRequirementElement1_ValueSetx();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getValueCodes <em>Value Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getValueCodes()
	 * @see #getDataRequirementElement1()
	 * @generated
	 */
	EReference getDataRequirementElement1_ValueCode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getValueCodings <em>Value Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value Coding</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getValueCodings()
	 * @see #getDataRequirementElement1()
	 * @generated
	 */
	EReference getDataRequirementElement1_ValueCoding();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getValueCodeableConcepts <em>Value Codeable Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value Codeable Concept</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getValueCodeableConcepts()
	 * @see #getDataRequirementElement1()
	 * @generated
	 */
	EReference getDataRequirementElement1_ValueCodeableConcept();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement2 <em>Data Requirement Element2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Requirement Element2</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement2
	 * @generated
	 */
	EClass getDataRequirementElement2();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement2#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement2#getPath()
	 * @see #getDataRequirementElement2()
	 * @generated
	 */
	EReference getDataRequirementElement2_Path();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement2#getValuex <em>Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valuex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement2#getValuex()
	 * @see #getDataRequirementElement2()
	 * @generated
	 */
	EReference getDataRequirementElement2_Valuex();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition <em>Trigger Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Definition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition
	 * @generated
	 */
	EClass getTriggerDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getType()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Name</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getEventName()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_EventName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getEventTimingx <em>Event Timingx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Timingx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getEventTimingx()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_EventTimingx();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getEventData <em>Event Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Data</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getEventData()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_EventData();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.SimpleQuantity <em>Simple Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Quantity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.SimpleQuantity
	 * @generated
	 */
	EClass getSimpleQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.SimpleQuantity#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.SimpleQuantity#getComparator()
	 * @see #getSimpleQuantity()
	 * @generated
	 */
	EAttribute getSimpleQuantity_Comparator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction <em>Dosage Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dosage Instruction</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction
	 * @generated
	 */
	EClass getDosageInstruction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sequence</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getSequence()
	 * @see #getDosageInstruction()
	 * @generated
	 */
	EReference getDosageInstruction_Sequence();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getText()
	 * @see #getDosageInstruction()
	 * @generated
	 */
	EReference getDosageInstruction_Text();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getAdditionalInstructions <em>Additional Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional Instructions</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getAdditionalInstructions()
	 * @see #getDosageInstruction()
	 * @generated
	 */
	EReference getDosageInstruction_AdditionalInstructions();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getTiming <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timing</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getTiming()
	 * @see #getDosageInstruction()
	 * @generated
	 */
	EReference getDosageInstruction_Timing();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getAsNeededx <em>As Neededx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>As Neededx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getAsNeededx()
	 * @see #getDosageInstruction()
	 * @generated
	 */
	EReference getDosageInstruction_AsNeededx();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Site</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getSite()
	 * @see #getDosageInstruction()
	 * @generated
	 */
	EReference getDosageInstruction_Site();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getRoute()
	 * @see #getDosageInstruction()
	 * @generated
	 */
	EReference getDosageInstruction_Route();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMethod()
	 * @see #getDosageInstruction()
	 * @generated
	 */
	EReference getDosageInstruction_Method();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getDosex <em>Dosex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dosex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getDosex()
	 * @see #getDosageInstruction()
	 * @generated
	 */
	EReference getDosageInstruction_Dosex();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMaxDosePerPeriod <em>Max Dose Per Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Dose Per Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMaxDosePerPeriod()
	 * @see #getDosageInstruction()
	 * @generated
	 */
	EReference getDosageInstruction_MaxDosePerPeriod();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Dose Per Administration</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMaxDosePerAdministration()
	 * @see #getDosageInstruction()
	 * @generated
	 */
	EReference getDosageInstruction_MaxDosePerAdministration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Dose Per Lifetime</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMaxDosePerLifetime()
	 * @see #getDosageInstruction()
	 * @generated
	 */
	EReference getDosageInstruction_MaxDosePerLifetime();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getRatex <em>Ratex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ratex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getRatex()
	 * @see #getDosageInstruction()
	 * @generated
	 */
	EReference getDosageInstruction_Ratex();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Timing
	 * @generated
	 */
	EClass getTiming();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Timing#getEvents <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Timing#getEvents()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Event();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Timing#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repeat</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Timing#getRepeat()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Repeat();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Timing#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Timing#getCode()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Code();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1 <em>Timing Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Element1</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1
	 * @generated
	 */
	EClass getTimingElement1();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getBoundsx <em>Boundsx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Boundsx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getBoundsx()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_Boundsx();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Count</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getCount()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_Count();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getCountMax <em>Count Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Count Max</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getCountMax()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_CountMax();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duration</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDuration()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_Duration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDurationMax <em>Duration Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duration Max</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDurationMax()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_DurationMax();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDurationUnit <em>Duration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duration Unit</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDurationUnit()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_DurationUnit();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frequency</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getFrequency()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_Frequency();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getFrequencyMax <em>Frequency Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frequency Max</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getFrequencyMax()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_FrequencyMax();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getPeriod()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_Period();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getPeriodMax <em>Period Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period Max</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getPeriodMax()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_PeriodMax();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getPeriodUnit <em>Period Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period Unit</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getPeriodUnit()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_PeriodUnit();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDayOfWeeks <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Day Of Week</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getDayOfWeeks()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_DayOfWeek();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getTimeOfDaies <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Of Day</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getTimeOfDaies()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_TimeOfDay();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>When</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getWhen()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_When();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Offset</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.TimingElement1#getOffset()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_Offset();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Ratio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Ratio
	 * @generated
	 */
	EClass getRatio();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Ratio#getNumerator <em>Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Numerator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Ratio#getNumerator()
	 * @see #getRatio()
	 * @generated
	 */
	EReference getRatio_Numerator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Ratio#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Denominator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Ratio#getDenominator()
	 * @see #getRatio()
	 * @generated
	 */
	EReference getRatio_Denominator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Money <em>Money</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Money</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Money
	 * @generated
	 */
	EClass getMoney();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Signature#getTypes <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Signature#getTypes()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Signature#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>When</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Signature#getWhen()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_When();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Signature#getWhox <em>Whox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Whox</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Signature#getWhox()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Whox();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Signature#getOnBehalfOfx <em>On Behalf Ofx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Behalf Ofx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Signature#getOnBehalfOfx()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_OnBehalfOfx();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Signature#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Signature#getContentType()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_ContentType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Signature#getBlob <em>Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blob</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Signature#getBlob()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Blob();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Range#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Low</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Range#getLow()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_Low();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Range#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>High</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Range#getHigh()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_High();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Reference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Reference#getReference()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Reference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Reference#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifier</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Reference#getIdentifier()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Identifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Reference#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Reference#getDisplay()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Display();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Distance
	 * @generated
	 */
	EClass getDistance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData <em>Sampled Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sampled Data</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData
	 * @generated
	 */
	EClass getSampledData();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getOrigin()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Origin();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getPeriod()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Period();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Factor</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getFactor()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Factor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lower Limit</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getLowerLimit()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_LowerLimit();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Upper Limit</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getUpperLimit()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_UpperLimit();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimensions</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getDimensions()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Dimensions();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.SampledData#getData()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Data();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.Uuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uuid</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.Uuid
	 * @generated
	 */
	EClass getUuid();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataTypesFactory getDataTypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__EXTENSION = eINSTANCE.getElement_Extension();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BaseImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.StringImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__VALUE = eINSTANCE.getString_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ExtensionImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__URL = eINSTANCE.getExtension_Url();

		/**
		 * The meta object literal for the '<em><b>Valuex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUEX = eINSTANCE.getExtension_Valuex();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UriImpl <em>Uri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UriImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getUri()
		 * @generated
		 */
		EClass URI = eINSTANCE.getUri();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI__VALUE = eINSTANCE.getUri_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.Base64BinaryImpl <em>Base64 Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.Base64BinaryImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getBase64Binary()
		 * @generated
		 */
		EClass BASE64_BINARY = eINSTANCE.getBase64Binary();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64_BINARY__VALUE = eINSTANCE.getBase64Binary_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BooleanImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__VALUE = eINSTANCE.getBoolean_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CodeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DateImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__VALUE = eINSTANCE.getDate_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DateTimeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDateTime()
		 * @generated
		 */
		EClass DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__VALUE = eINSTANCE.getDateTime_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DecimalImpl <em>Decimal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DecimalImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDecimal()
		 * @generated
		 */
		EClass DECIMAL = eINSTANCE.getDecimal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL__VALUE = eINSTANCE.getDecimal_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.IdImpl <em>Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.IdImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getId()
		 * @generated
		 */
		EClass ID = eINSTANCE.getId();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.InstantImpl <em>Instant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.InstantImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getInstant()
		 * @generated
		 */
		EClass INSTANT = eINSTANCE.getInstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANT__VALUE = eINSTANCE.getInstant_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.IntegerImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MarkdownImpl <em>Markdown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MarkdownImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getMarkdown()
		 * @generated
		 */
		EClass MARKDOWN = eINSTANCE.getMarkdown();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.OidImpl <em>Oid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.OidImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getOid()
		 * @generated
		 */
		EClass OID = eINSTANCE.getOid();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.PositiveIntImpl <em>Positive Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.PositiveIntImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getPositiveInt()
		 * @generated
		 */
		EClass POSITIVE_INT = eINSTANCE.getPositiveInt();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__VALUE = eINSTANCE.getTime_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UnsignedIntImpl <em>Unsigned Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UnsignedIntImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getUnsignedInt()
		 * @generated
		 */
		EClass UNSIGNED_INT = eINSTANCE.getUnsignedInt();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AddressImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__USE = eINSTANCE.getAddress_Use();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__TYPE = eINSTANCE.getAddress_Type();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__TEXT = eINSTANCE.getAddress_Text();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__LINE = eINSTANCE.getAddress_Line();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>District</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__DISTRICT = eINSTANCE.getAddress_District();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__STATE = eINSTANCE.getAddress_State();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__POSTAL_CODE = eINSTANCE.getAddress_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__PERIOD = eINSTANCE.getAddress_Period();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.PeriodImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__START = eINSTANCE.getPeriod_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__END = eINSTANCE.getPeriod_End();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AgeImpl <em>Age</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AgeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getAge()
		 * @generated
		 */
		EClass AGE = eINSTANCE.getAge();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.QuantityImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__COMPARATOR = eINSTANCE.getQuantity_Comparator();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__UNIT = eINSTANCE.getQuantity_Unit();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__SYSTEM = eINSTANCE.getQuantity_System();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__CODE = eINSTANCE.getQuantity_Code();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AnnotationImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Authorx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__AUTHORX = eINSTANCE.getAnnotation_Authorx();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__TIME = eINSTANCE.getAnnotation_Time();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MetaImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

		/**
		 * The meta object literal for the '<em><b>Version Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__VERSION_ID = eINSTANCE.getMeta_VersionId();

		/**
		 * The meta object literal for the '<em><b>Last Updated</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__LAST_UPDATED = eINSTANCE.getMeta_LastUpdated();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__PROFILE = eINSTANCE.getMeta_Profile();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__SECURITY = eINSTANCE.getMeta_Security();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__TAG = eINSTANCE.getMeta_Tag();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CodingImpl <em>Coding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CodingImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getCoding()
		 * @generated
		 */
		EClass CODING = eINSTANCE.getCoding();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__SYSTEM = eINSTANCE.getCoding_System();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__VERSION = eINSTANCE.getCoding_Version();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__CODE = eINSTANCE.getCoding_Code();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__DISPLAY = eINSTANCE.getCoding_Display();

		/**
		 * The meta object literal for the '<em><b>User Selected</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__USER_SELECTED = eINSTANCE.getCoding_UserSelected();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.NarrativeImpl <em>Narrative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.NarrativeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getNarrative()
		 * @generated
		 */
		EClass NARRATIVE = eINSTANCE.getNarrative();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARRATIVE__STATUS = eINSTANCE.getNarrative_Status();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARRATIVE__DIV = eINSTANCE.getNarrative_Div();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.XhtmlImpl <em>Xhtml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.XhtmlImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getXhtml()
		 * @generated
		 */
		EClass XHTML = eINSTANCE.getXhtml();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XHTML__EXTENSION = eINSTANCE.getXhtml_Extension();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XHTML__VALUE = eINSTANCE.getXhtml_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.xhtmlValueImpl <em>xhtml Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.xhtmlValueImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getxhtmlValue()
		 * @generated
		 */
		EClass XHTML_VALUE = eINSTANCE.getxhtmlValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl <em>Backbone Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getBackboneElement()
		 * @generated
		 */
		EClass BACKBONE_ELEMENT = eINSTANCE.getBackboneElement();

		/**
		 * The meta object literal for the '<em><b>Modifier Extension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKBONE_ELEMENT__MODIFIER_EXTENSION = eINSTANCE.getBackboneElement_ModifierExtension();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.IdentifierImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__USE = eINSTANCE.getIdentifier_Use();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__TYPE = eINSTANCE.getIdentifier_Type();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__SYSTEM = eINSTANCE.getIdentifier_System();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__VALUE = eINSTANCE.getIdentifier_Value();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__PERIOD = eINSTANCE.getIdentifier_Period();

		/**
		 * The meta object literal for the '<em><b>Assigner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__ASSIGNER = eINSTANCE.getIdentifier_Assigner();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CodeableConceptImpl <em>Codeable Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CodeableConceptImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getCodeableConcept()
		 * @generated
		 */
		EClass CODEABLE_CONCEPT = eINSTANCE.getCodeableConcept();

		/**
		 * The meta object literal for the '<em><b>Coding</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODEABLE_CONCEPT__CODING = eINSTANCE.getCodeableConcept_Coding();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODEABLE_CONCEPT__TEXT = eINSTANCE.getCodeableConcept_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.HumanNameImpl <em>Human Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.HumanNameImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getHumanName()
		 * @generated
		 */
		EClass HUMAN_NAME = eINSTANCE.getHumanName();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__USE = eINSTANCE.getHumanName_Use();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__TEXT = eINSTANCE.getHumanName_Text();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__FAMILY = eINSTANCE.getHumanName_Family();

		/**
		 * The meta object literal for the '<em><b>Given</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__GIVEN = eINSTANCE.getHumanName_Given();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__PREFIX = eINSTANCE.getHumanName_Prefix();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__SUFFIX = eINSTANCE.getHumanName_Suffix();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__PERIOD = eINSTANCE.getHumanName_Period();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ContactPointImpl <em>Contact Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ContactPointImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getContactPoint()
		 * @generated
		 */
		EClass CONTACT_POINT = eINSTANCE.getContactPoint();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__SYSTEM = eINSTANCE.getContactPoint_System();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__VALUE = eINSTANCE.getContactPoint_Value();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__USE = eINSTANCE.getContactPoint_Use();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__RANK = eINSTANCE.getContactPoint_Rank();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__PERIOD = eINSTANCE.getContactPoint_Period();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.AttachmentImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__CONTENT_TYPE = eINSTANCE.getAttachment_ContentType();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__LANGUAGE = eINSTANCE.getAttachment_Language();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__DATA = eINSTANCE.getAttachment_Data();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__URL = eINSTANCE.getAttachment_Url();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__SIZE = eINSTANCE.getAttachment_Size();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__HASH = eINSTANCE.getAttachment_Hash();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__TITLE = eINSTANCE.getAttachment_Title();

		/**
		 * The meta object literal for the '<em><b>Creation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__CREATION = eINSTANCE.getAttachment_Creation();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UsageContextImpl <em>Usage Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UsageContextImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getUsageContext()
		 * @generated
		 */
		EClass USAGE_CONTEXT = eINSTANCE.getUsageContext();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CONTEXT__CODE = eINSTANCE.getUsageContext_Code();

		/**
		 * The meta object literal for the '<em><b>Valuex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CONTEXT__VALUEX = eINSTANCE.getUsageContext_Valuex();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ContributorImpl <em>Contributor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ContributorImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getContributor()
		 * @generated
		 */
		EClass CONTRIBUTOR = eINSTANCE.getContributor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTOR__TYPE = eINSTANCE.getContributor_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTOR__NAME = eINSTANCE.getContributor_Name();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTOR__CONTACT = eINSTANCE.getContributor_Contact();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ContactDetailImpl <em>Contact Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ContactDetailImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getContactDetail()
		 * @generated
		 */
		EClass CONTACT_DETAIL = eINSTANCE.getContactDetail();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_DETAIL__NAME = eINSTANCE.getContactDetail_Name();

		/**
		 * The meta object literal for the '<em><b>Telecom</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_DETAIL__TELECOM = eINSTANCE.getContactDetail_Telecom();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.RelatedArtifactImpl <em>Related Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.RelatedArtifactImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getRelatedArtifact()
		 * @generated
		 */
		EClass RELATED_ARTIFACT = eINSTANCE.getRelatedArtifact();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__TYPE = eINSTANCE.getRelatedArtifact_Type();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__DISPLAY = eINSTANCE.getRelatedArtifact_Display();

		/**
		 * The meta object literal for the '<em><b>Citation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__CITATION = eINSTANCE.getRelatedArtifact_Citation();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__URL = eINSTANCE.getRelatedArtifact_Url();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__DOCUMENT = eINSTANCE.getRelatedArtifact_Document();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__RESOURCE = eINSTANCE.getRelatedArtifact_Resource();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ParameterDefinitionImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getParameterDefinition()
		 * @generated
		 */
		EClass PARAMETER_DEFINITION = eINSTANCE.getParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__NAME = eINSTANCE.getParameterDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__USE = eINSTANCE.getParameterDefinition_Use();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__MIN = eINSTANCE.getParameterDefinition_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__MAX = eINSTANCE.getParameterDefinition_Max();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__DOCUMENTATION = eINSTANCE.getParameterDefinition_Documentation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__TYPE = eINSTANCE.getParameterDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__PROFILE = eINSTANCE.getParameterDefinition_Profile();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinition()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION = eINSTANCE.getElementDefinition();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__PATH = eINSTANCE.getElementDefinition_Path();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__REPRESENTATION = eINSTANCE.getElementDefinition_Representation();

		/**
		 * The meta object literal for the '<em><b>Slice Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__SLICE_NAME = eINSTANCE.getElementDefinition_SliceName();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__LABEL = eINSTANCE.getElementDefinition_Label();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__CODE = eINSTANCE.getElementDefinition_Code();

		/**
		 * The meta object literal for the '<em><b>Slicing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__SLICING = eINSTANCE.getElementDefinition_Slicing();

		/**
		 * The meta object literal for the '<em><b>Short</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__SHORT = eINSTANCE.getElementDefinition_Short();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__DEFINITION = eINSTANCE.getElementDefinition_Definition();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__COMMENTS = eINSTANCE.getElementDefinition_Comments();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__REQUIREMENTS = eINSTANCE.getElementDefinition_Requirements();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__ALIAS = eINSTANCE.getElementDefinition_Alias();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MIN = eINSTANCE.getElementDefinition_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MAX = eINSTANCE.getElementDefinition_Max();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__BASE = eINSTANCE.getElementDefinition_Base();

		/**
		 * The meta object literal for the '<em><b>Content Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__CONTENT_REFERENCE = eINSTANCE.getElementDefinition_ContentReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__TYPE = eINSTANCE.getElementDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Default Valuex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__DEFAULT_VALUEX = eINSTANCE.getElementDefinition_DefaultValuex();

		/**
		 * The meta object literal for the '<em><b>Meaning When Missing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MEANING_WHEN_MISSING = eINSTANCE.getElementDefinition_MeaningWhenMissing();

		/**
		 * The meta object literal for the '<em><b>Fixedx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__FIXEDX = eINSTANCE.getElementDefinition_Fixedx();

		/**
		 * The meta object literal for the '<em><b>Patternx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__PATTERNX = eINSTANCE.getElementDefinition_Patternx();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__EXAMPLE = eINSTANCE.getElementDefinition_Example();

		/**
		 * The meta object literal for the '<em><b>Min Valuex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MIN_VALUEX = eINSTANCE.getElementDefinition_MinValuex();

		/**
		 * The meta object literal for the '<em><b>Max Valuex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MAX_VALUEX = eINSTANCE.getElementDefinition_MaxValuex();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MAX_LENGTH = eINSTANCE.getElementDefinition_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__CONDITION = eINSTANCE.getElementDefinition_Condition();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__CONSTRAINT = eINSTANCE.getElementDefinition_Constraint();

		/**
		 * The meta object literal for the '<em><b>Must Support</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MUST_SUPPORT = eINSTANCE.getElementDefinition_MustSupport();

		/**
		 * The meta object literal for the '<em><b>Is Modifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__IS_MODIFIER = eINSTANCE.getElementDefinition_IsModifier();

		/**
		 * The meta object literal for the '<em><b>Is Summary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__IS_SUMMARY = eINSTANCE.getElementDefinition_IsSummary();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__BINDING = eINSTANCE.getElementDefinition_Binding();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MAPPING = eINSTANCE.getElementDefinition_Mapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement1Impl <em>Element Definition Element1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement1Impl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement1()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT1 = eINSTANCE.getElementDefinitionElement1();

		/**
		 * The meta object literal for the '<em><b>Discriminator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR = eINSTANCE.getElementDefinitionElement1_Discriminator();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION = eINSTANCE.getElementDefinitionElement1_Description();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT1__ORDERED = eINSTANCE.getElementDefinitionElement1_Ordered();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT1__RULES = eINSTANCE.getElementDefinitionElement1_Rules();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement2Impl <em>Element Definition Element2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement2Impl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement2()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT2 = eINSTANCE.getElementDefinitionElement2();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT2__PATH = eINSTANCE.getElementDefinitionElement2_Path();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT2__MIN = eINSTANCE.getElementDefinitionElement2_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT2__MAX = eINSTANCE.getElementDefinitionElement2_Max();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement3Impl <em>Element Definition Element3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement3Impl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement3()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT3 = eINSTANCE.getElementDefinitionElement3();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT3__CODE = eINSTANCE.getElementDefinitionElement3_Code();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT3__PROFILE = eINSTANCE.getElementDefinitionElement3_Profile();

		/**
		 * The meta object literal for the '<em><b>Target Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE = eINSTANCE.getElementDefinitionElement3_TargetProfile();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT3__AGGREGATION = eINSTANCE.getElementDefinitionElement3_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Versioning</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT3__VERSIONING = eINSTANCE.getElementDefinitionElement3_Versioning();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement4Impl <em>Element Definition Element4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement4Impl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement4()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT4 = eINSTANCE.getElementDefinitionElement4();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT4__LABEL = eINSTANCE.getElementDefinitionElement4_Label();

		/**
		 * The meta object literal for the '<em><b>Valuex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT4__VALUEX = eINSTANCE.getElementDefinitionElement4_Valuex();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement5Impl <em>Element Definition Element5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement5Impl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement5()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT5 = eINSTANCE.getElementDefinitionElement5();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__KEY = eINSTANCE.getElementDefinitionElement5_Key();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS = eINSTANCE.getElementDefinitionElement5_Requirements();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__SEVERITY = eINSTANCE.getElementDefinitionElement5_Severity();

		/**
		 * The meta object literal for the '<em><b>Human</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__HUMAN = eINSTANCE.getElementDefinitionElement5_Human();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__EXPRESSION = eINSTANCE.getElementDefinitionElement5_Expression();

		/**
		 * The meta object literal for the '<em><b>Xpath</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__XPATH = eINSTANCE.getElementDefinitionElement5_Xpath();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__SOURCE = eINSTANCE.getElementDefinitionElement5_Source();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement6Impl <em>Element Definition Element6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement6Impl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement6()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT6 = eINSTANCE.getElementDefinitionElement6();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT6__STRENGTH = eINSTANCE.getElementDefinitionElement6_Strength();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT6__DESCRIPTION = eINSTANCE.getElementDefinitionElement6_Description();

		/**
		 * The meta object literal for the '<em><b>Value Setx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT6__VALUE_SETX = eINSTANCE.getElementDefinitionElement6_ValueSetx();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement7Impl <em>Element Definition Element7</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement7Impl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement7()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT7 = eINSTANCE.getElementDefinitionElement7();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT7__IDENTITY = eINSTANCE.getElementDefinitionElement7_Identity();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT7__LANGUAGE = eINSTANCE.getElementDefinitionElement7_Language();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT7__MAP = eINSTANCE.getElementDefinitionElement7_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementImpl <em>Data Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDataRequirement()
		 * @generated
		 */
		EClass DATA_REQUIREMENT = eINSTANCE.getDataRequirement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__TYPE = eINSTANCE.getDataRequirement_Type();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__PROFILE = eINSTANCE.getDataRequirement_Profile();

		/**
		 * The meta object literal for the '<em><b>Must Support</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__MUST_SUPPORT = eINSTANCE.getDataRequirement_MustSupport();

		/**
		 * The meta object literal for the '<em><b>Code Filter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__CODE_FILTER = eINSTANCE.getDataRequirement_CodeFilter();

		/**
		 * The meta object literal for the '<em><b>Date Filter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__DATE_FILTER = eINSTANCE.getDataRequirement_DateFilter();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementElement1Impl <em>Data Requirement Element1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementElement1Impl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDataRequirementElement1()
		 * @generated
		 */
		EClass DATA_REQUIREMENT_ELEMENT1 = eINSTANCE.getDataRequirementElement1();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT1__PATH = eINSTANCE.getDataRequirementElement1_Path();

		/**
		 * The meta object literal for the '<em><b>Value Setx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT1__VALUE_SETX = eINSTANCE.getDataRequirementElement1_ValueSetx();

		/**
		 * The meta object literal for the '<em><b>Value Code</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT1__VALUE_CODE = eINSTANCE.getDataRequirementElement1_ValueCode();

		/**
		 * The meta object literal for the '<em><b>Value Coding</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT1__VALUE_CODING = eINSTANCE.getDataRequirementElement1_ValueCoding();

		/**
		 * The meta object literal for the '<em><b>Value Codeable Concept</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT1__VALUE_CODEABLE_CONCEPT = eINSTANCE.getDataRequirementElement1_ValueCodeableConcept();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementElement2Impl <em>Data Requirement Element2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementElement2Impl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDataRequirementElement2()
		 * @generated
		 */
		EClass DATA_REQUIREMENT_ELEMENT2 = eINSTANCE.getDataRequirementElement2();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT2__PATH = eINSTANCE.getDataRequirementElement2_Path();

		/**
		 * The meta object literal for the '<em><b>Valuex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT2__VALUEX = eINSTANCE.getDataRequirementElement2_Valuex();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TriggerDefinitionImpl <em>Trigger Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TriggerDefinitionImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getTriggerDefinition()
		 * @generated
		 */
		EClass TRIGGER_DEFINITION = eINSTANCE.getTriggerDefinition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__TYPE = eINSTANCE.getTriggerDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__EVENT_NAME = eINSTANCE.getTriggerDefinition_EventName();

		/**
		 * The meta object literal for the '<em><b>Event Timingx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__EVENT_TIMINGX = eINSTANCE.getTriggerDefinition_EventTimingx();

		/**
		 * The meta object literal for the '<em><b>Event Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__EVENT_DATA = eINSTANCE.getTriggerDefinition_EventData();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SimpleQuantityImpl <em>Simple Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SimpleQuantityImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getSimpleQuantity()
		 * @generated
		 */
		EClass SIMPLE_QUANTITY = eINSTANCE.getSimpleQuantity();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_QUANTITY__COMPARATOR = eINSTANCE.getSimpleQuantity_Comparator();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl <em>Dosage Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDosageInstruction()
		 * @generated
		 */
		EClass DOSAGE_INSTRUCTION = eINSTANCE.getDosageInstruction();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_INSTRUCTION__SEQUENCE = eINSTANCE.getDosageInstruction_Sequence();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_INSTRUCTION__TEXT = eINSTANCE.getDosageInstruction_Text();

		/**
		 * The meta object literal for the '<em><b>Additional Instructions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS = eINSTANCE.getDosageInstruction_AdditionalInstructions();

		/**
		 * The meta object literal for the '<em><b>Timing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_INSTRUCTION__TIMING = eINSTANCE.getDosageInstruction_Timing();

		/**
		 * The meta object literal for the '<em><b>As Neededx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_INSTRUCTION__AS_NEEDEDX = eINSTANCE.getDosageInstruction_AsNeededx();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_INSTRUCTION__SITE = eINSTANCE.getDosageInstruction_Site();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_INSTRUCTION__ROUTE = eINSTANCE.getDosageInstruction_Route();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_INSTRUCTION__METHOD = eINSTANCE.getDosageInstruction_Method();

		/**
		 * The meta object literal for the '<em><b>Dosex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_INSTRUCTION__DOSEX = eINSTANCE.getDosageInstruction_Dosex();

		/**
		 * The meta object literal for the '<em><b>Max Dose Per Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD = eINSTANCE.getDosageInstruction_MaxDosePerPeriod();

		/**
		 * The meta object literal for the '<em><b>Max Dose Per Administration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_INSTRUCTION__MAX_DOSE_PER_ADMINISTRATION = eINSTANCE.getDosageInstruction_MaxDosePerAdministration();

		/**
		 * The meta object literal for the '<em><b>Max Dose Per Lifetime</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_INSTRUCTION__MAX_DOSE_PER_LIFETIME = eINSTANCE.getDosageInstruction_MaxDosePerLifetime();

		/**
		 * The meta object literal for the '<em><b>Ratex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_INSTRUCTION__RATEX = eINSTANCE.getDosageInstruction_Ratex();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingImpl <em>Timing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getTiming()
		 * @generated
		 */
		EClass TIMING = eINSTANCE.getTiming();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__EVENT = eINSTANCE.getTiming_Event();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__REPEAT = eINSTANCE.getTiming_Repeat();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__CODE = eINSTANCE.getTiming_Code();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl <em>Timing Element1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TimingElement1Impl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getTimingElement1()
		 * @generated
		 */
		EClass TIMING_ELEMENT1 = eINSTANCE.getTimingElement1();

		/**
		 * The meta object literal for the '<em><b>Boundsx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__BOUNDSX = eINSTANCE.getTimingElement1_Boundsx();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__COUNT = eINSTANCE.getTimingElement1_Count();

		/**
		 * The meta object literal for the '<em><b>Count Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__COUNT_MAX = eINSTANCE.getTimingElement1_CountMax();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__DURATION = eINSTANCE.getTimingElement1_Duration();

		/**
		 * The meta object literal for the '<em><b>Duration Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__DURATION_MAX = eINSTANCE.getTimingElement1_DurationMax();

		/**
		 * The meta object literal for the '<em><b>Duration Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__DURATION_UNIT = eINSTANCE.getTimingElement1_DurationUnit();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__FREQUENCY = eINSTANCE.getTimingElement1_Frequency();

		/**
		 * The meta object literal for the '<em><b>Frequency Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__FREQUENCY_MAX = eINSTANCE.getTimingElement1_FrequencyMax();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__PERIOD = eINSTANCE.getTimingElement1_Period();

		/**
		 * The meta object literal for the '<em><b>Period Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__PERIOD_MAX = eINSTANCE.getTimingElement1_PeriodMax();

		/**
		 * The meta object literal for the '<em><b>Period Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__PERIOD_UNIT = eINSTANCE.getTimingElement1_PeriodUnit();

		/**
		 * The meta object literal for the '<em><b>Day Of Week</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__DAY_OF_WEEK = eINSTANCE.getTimingElement1_DayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Time Of Day</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__TIME_OF_DAY = eINSTANCE.getTimingElement1_TimeOfDay();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__WHEN = eINSTANCE.getTimingElement1_When();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__OFFSET = eINSTANCE.getTimingElement1_Offset();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.RatioImpl <em>Ratio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.RatioImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getRatio()
		 * @generated
		 */
		EClass RATIO = eINSTANCE.getRatio();

		/**
		 * The meta object literal for the '<em><b>Numerator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO__NUMERATOR = eINSTANCE.getRatio_Numerator();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO__DENOMINATOR = eINSTANCE.getRatio_Denominator();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MoneyImpl <em>Money</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.MoneyImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getMoney()
		 * @generated
		 */
		EClass MONEY = eINSTANCE.getMoney();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SignatureImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__TYPE = eINSTANCE.getSignature_Type();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__WHEN = eINSTANCE.getSignature_When();

		/**
		 * The meta object literal for the '<em><b>Whox</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__WHOX = eINSTANCE.getSignature_Whox();

		/**
		 * The meta object literal for the '<em><b>On Behalf Ofx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__ON_BEHALF_OFX = eINSTANCE.getSignature_OnBehalfOfx();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__CONTENT_TYPE = eINSTANCE.getSignature_ContentType();

		/**
		 * The meta object literal for the '<em><b>Blob</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__BLOB = eINSTANCE.getSignature_Blob();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DurationImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.RangeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__LOW = eINSTANCE.getRange_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__HIGH = eINSTANCE.getRange_High();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ReferenceImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REFERENCE = eINSTANCE.getReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__IDENTIFIER = eINSTANCE.getReference_Identifier();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__DISPLAY = eINSTANCE.getReference_Display();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.CountImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DistanceImpl <em>Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DistanceImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getDistance()
		 * @generated
		 */
		EClass DISTANCE = eINSTANCE.getDistance();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SampledDataImpl <em>Sampled Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.SampledDataImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getSampledData()
		 * @generated
		 */
		EClass SAMPLED_DATA = eINSTANCE.getSampledData();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__ORIGIN = eINSTANCE.getSampledData_Origin();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__PERIOD = eINSTANCE.getSampledData_Period();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__FACTOR = eINSTANCE.getSampledData_Factor();

		/**
		 * The meta object literal for the '<em><b>Lower Limit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__LOWER_LIMIT = eINSTANCE.getSampledData_LowerLimit();

		/**
		 * The meta object literal for the '<em><b>Upper Limit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__UPPER_LIMIT = eINSTANCE.getSampledData_UpperLimit();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__DIMENSIONS = eINSTANCE.getSampledData_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__DATA = eINSTANCE.getSampledData_Data();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UuidImpl <em>Uuid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.UuidImpl
		 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataTypesPackageImpl#getUuid()
		 * @generated
		 */
		EClass UUID = eINSTANCE.getUuid();

	}

} //DataTypesPackage
