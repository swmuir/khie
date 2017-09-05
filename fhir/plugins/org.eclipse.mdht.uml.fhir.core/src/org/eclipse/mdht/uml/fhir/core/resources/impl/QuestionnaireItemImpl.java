/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireItem;
import org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireItemEnableWhen;
import org.eclipse.mdht.uml.fhir.core.resources.QuestionnaireItemOption;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.ValueSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getConcepts <em>Concept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getEnableWhens <em>Enable When</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getOptions <em>Option</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getInitialx <em>Initialx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.QuestionnaireItemImpl#getItems <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireItemImpl extends BackboneElementImpl implements QuestionnaireItem {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String linkId;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Uri definition;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concept</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> concepts;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String prefix;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String text;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getEnableWhens() <em>Enable When</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableWhens()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireItemEnableWhen> enableWhens;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean required;

	/**
	 * The cached value of the '{@link #getRepeats() <em>Repeats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeats()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean repeats;

	/**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean readOnly;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer maxLength;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected ValueSet options;

	/**
	 * The cached value of the '{@link #getOptions() <em>Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireItemOption> options;

	/**
	 * The cached value of the '{@link #getOptions() <em>Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireItemOption> options;

	/**
	 * The cached value of the '{@link #getInitialx() <em>Initialx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialx()
	 * @generated
	 * @ordered
	 */
	protected Base initialx;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getQuestionnaireItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getLinkId() {
		if (linkId != null && linkId.eIsProxy()) {
			InternalEObject oldLinkId = (InternalEObject)linkId;
			linkId = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldLinkId);
			if (linkId != oldLinkId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID, oldLinkId, linkId));
			}
		}
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(org.eclipse.mdht.uml.fhir.core.dataTypes.String newLinkId) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID, oldLinkId, linkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (Uri)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Uri newDefinition) {
		Uri oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectResolvingEList<Coding>(Coding.class, this, ResourcesPackage.QUESTIONNAIRE_ITEM__CONCEPT);
		}
		return concepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getPrefix() {
		if (prefix != null && prefix.eIsProxy()) {
			InternalEObject oldPrefix = (InternalEObject)prefix;
			prefix = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldPrefix);
			if (prefix != oldPrefix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX, oldPrefix, prefix));
			}
		}
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(org.eclipse.mdht.uml.fhir.core.dataTypes.String newPrefix) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.eclipse.mdht.uml.fhir.core.dataTypes.String newText) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireItemEnableWhen> getEnableWhens() {
		if (enableWhens == null) {
			enableWhens = new EObjectContainmentEList<QuestionnaireItemEnableWhen>(QuestionnaireItemEnableWhen.class, this, ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN);
		}
		return enableWhens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getRequired() {
		if (required != null && required.eIsProxy()) {
			InternalEObject oldRequired = (InternalEObject)required;
			required = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldRequired);
			if (required != oldRequired) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED, oldRequired, required));
			}
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newRequired) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getRepeats() {
		if (repeats != null && repeats.eIsProxy()) {
			InternalEObject oldRepeats = (InternalEObject)repeats;
			repeats = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldRepeats);
			if (repeats != oldRepeats) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS, oldRepeats, repeats));
			}
		}
		return repeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetRepeats() {
		return repeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeats(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newRepeats) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldRepeats = repeats;
		repeats = newRepeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS, oldRepeats, repeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getReadOnly() {
		if (readOnly != null && readOnly.eIsProxy()) {
			InternalEObject oldReadOnly = (InternalEObject)readOnly;
			readOnly = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldReadOnly);
			if (readOnly != oldReadOnly) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY, oldReadOnly, readOnly));
			}
		}
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newReadOnly) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getMaxLength() {
		if (maxLength != null && maxLength.eIsProxy()) {
			InternalEObject oldMaxLength = (InternalEObject)maxLength;
			maxLength = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldMaxLength);
			if (maxLength != oldMaxLength) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, oldMaxLength, maxLength));
			}
		}
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newMaxLength) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet getOptions() {
		if (options != null && options.eIsProxy()) {
			InternalEObject oldOptions = (InternalEObject)options;
			options = (ValueSet)eResolveProxy(oldOptions);
			if (options != oldOptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM__OPTIONS, oldOptions, options));
			}
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireItemOption> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<QuestionnaireItemOption>(QuestionnaireItemOption.class, this, ResourcesPackage.QUESTIONNAIRE_ITEM__OPTION);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet basicGetOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(ValueSet newOptions) {
		ValueSet oldOptions = options;
		options = newOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__OPTIONS, oldOptions, options));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireItemOption> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<QuestionnaireItemOption>(QuestionnaireItemOption.class, this, ResourcesPackage.QUESTIONNAIRE_ITEM__OPTION);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getInitialx() {
		if (initialx != null && initialx.eIsProxy()) {
			InternalEObject oldInitialx = (InternalEObject)initialx;
			initialx = (Base)eResolveProxy(oldInitialx);
			if (initialx != oldInitialx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.QUESTIONNAIRE_ITEM__INITIALX, oldInitialx, initialx));
			}
		}
		return initialx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetInitialx() {
		return initialx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialx(Base newInitialx) {
		Base oldInitialx = initialx;
		initialx = newInitialx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__INITIALX, oldInitialx, initialx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<QuestionnaireItem>(QuestionnaireItem.class, this, ResourcesPackage.QUESTIONNAIRE_ITEM__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				return ((InternalEList<?>)getEnableWhens()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__OPTION:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				if (resolve) return getLinkId();
				return basicGetLinkId();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__CONCEPT:
				return getConcepts();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX:
				if (resolve) return getPrefix();
				return basicGetPrefix();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				return getEnableWhens();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				if (resolve) return getRequired();
				return basicGetRequired();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS:
				if (resolve) return getRepeats();
				return basicGetRepeats();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				if (resolve) return getReadOnly();
				return basicGetReadOnly();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				if (resolve) return getMaxLength();
				return basicGetMaxLength();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__OPTIONS:
				if (resolve) return getOptions();
				return basicGetOptions();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__OPTION:
				return getOptions();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__INITIALX:
				if (resolve) return getInitialx();
				return basicGetInitialx();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ITEM:
				return getItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				setLinkId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				setDefinition((Uri)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__CONCEPT:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX:
				setPrefix((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				getEnableWhens().clear();
				getEnableWhens().addAll((Collection<? extends QuestionnaireItemEnableWhen>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				setRequired((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS:
				setRepeats((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				setReadOnly((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				setMaxLength((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__OPTIONS:
				setOptions((ValueSet)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__OPTION:
				getOptions().clear();
				getOptions().addAll((Collection<? extends QuestionnaireItemOption>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__INITIALX:
				setInitialx((Base)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends QuestionnaireItem>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				setLinkId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				setDefinition((Uri)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__CONCEPT:
				getConcepts().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX:
				setPrefix((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				getEnableWhens().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				setRequired((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS:
				setRepeats((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				setReadOnly((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				setMaxLength((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__OPTIONS:
				setOptions((ValueSet)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__OPTION:
				getOptions().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__INITIALX:
				setInitialx((Base)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ITEM:
				getItems().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				return linkId != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				return definition != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__CONCEPT:
				return concepts != null && !concepts.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX:
				return prefix != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT:
				return text != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE:
				return type != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				return enableWhens != null && !enableWhens.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				return required != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS:
				return repeats != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				return readOnly != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				return maxLength != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__OPTIONS:
				return options != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__OPTION:
				return options != null && !options.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__INITIALX:
				return initialx != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ITEM:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireItemImpl
