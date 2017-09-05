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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.RequestGroupAction;
import org.eclipse.mdht.uml.fhir.core.resources.RequestGroupActionCondition;
import org.eclipse.mdht.uml.fhir.core.resources.RequestGroupActionRelatedAction;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Group Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getDocumentations <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getConditions <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getRelatedActions <em>Related Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getTimingx <em>Timingx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RequestGroupActionImpl#getActions <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequestGroupActionImpl extends BackboneElementImpl implements RequestGroupAction {
	/**
	 * The cached value of the '{@link #getActionIdentifier() <em>Action Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier actionIdentifier;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String label;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getTextEquivalent() <em>Text Equivalent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEquivalent()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String textEquivalent;

	/**
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> codes;

	/**
	 * The cached value of the '{@link #getDocumentations() <em>Documentation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentations()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> documentations;

	/**
	 * The cached value of the '{@link #getConditions() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestGroupActionCondition> conditions;

	/**
	 * The cached value of the '{@link #getRelatedActions() <em>Related Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestGroupActionRelatedAction> relatedActions;

	/**
	 * The cached value of the '{@link #getTimingx() <em>Timingx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingx()
	 * @generated
	 * @ordered
	 */
	protected DataType timingx;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> participants;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getGroupingBehavior() <em>Grouping Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code groupingBehavior;

	/**
	 * The cached value of the '{@link #getSelectionBehavior() <em>Selection Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code selectionBehavior;

	/**
	 * The cached value of the '{@link #getRequiredBehavior() <em>Required Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code requiredBehavior;

	/**
	 * The cached value of the '{@link #getPrecheckBehavior() <em>Precheck Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecheckBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code precheckBehavior;

	/**
	 * The cached value of the '{@link #getCardinalityBehavior() <em>Cardinality Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code cardinalityBehavior;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestGroupAction> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestGroupActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getRequestGroupAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getActionIdentifier() {
		if (actionIdentifier != null && actionIdentifier.eIsProxy()) {
			InternalEObject oldActionIdentifier = (InternalEObject)actionIdentifier;
			actionIdentifier = (Identifier)eResolveProxy(oldActionIdentifier);
			if (actionIdentifier != oldActionIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER, oldActionIdentifier, actionIdentifier));
			}
		}
		return actionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetActionIdentifier() {
		return actionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionIdentifier(Identifier newActionIdentifier) {
		Identifier oldActionIdentifier = actionIdentifier;
		actionIdentifier = newActionIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER, oldActionIdentifier, actionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getLabel() {
		if (label != null && label.eIsProxy()) {
			InternalEObject oldLabel = (InternalEObject)label;
			label = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldLabel);
			if (label != oldLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION__LABEL, oldLabel, label));
			}
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(org.eclipse.mdht.uml.fhir.core.dataTypes.String newLabel) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.eclipse.mdht.uml.fhir.core.dataTypes.String newTitle) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getTextEquivalent() {
		if (textEquivalent != null && textEquivalent.eIsProxy()) {
			InternalEObject oldTextEquivalent = (InternalEObject)textEquivalent;
			textEquivalent = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldTextEquivalent);
			if (textEquivalent != oldTextEquivalent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT, oldTextEquivalent, textEquivalent));
			}
		}
		return textEquivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetTextEquivalent() {
		return textEquivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEquivalent(org.eclipse.mdht.uml.fhir.core.dataTypes.String newTextEquivalent) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldTextEquivalent = textEquivalent;
		textEquivalent = newTextEquivalent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT, oldTextEquivalent, textEquivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCodes() {
		if (codes == null) {
			codes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.REQUEST_GROUP_ACTION__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedArtifact> getDocumentations() {
		if (documentations == null) {
			documentations = new EObjectResolvingEList<RelatedArtifact>(RelatedArtifact.class, this, ResourcesPackage.REQUEST_GROUP_ACTION__DOCUMENTATION);
		}
		return documentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestGroupActionCondition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<RequestGroupActionCondition>(RequestGroupActionCondition.class, this, ResourcesPackage.REQUEST_GROUP_ACTION__CONDITION);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestGroupActionRelatedAction> getRelatedActions() {
		if (relatedActions == null) {
			relatedActions = new EObjectContainmentEList<RequestGroupActionRelatedAction>(RequestGroupActionRelatedAction.class, this, ResourcesPackage.REQUEST_GROUP_ACTION__RELATED_ACTION);
		}
		return relatedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTimingx() {
		if (timingx != null && timingx.eIsProxy()) {
			InternalEObject oldTimingx = (InternalEObject)timingx;
			timingx = (DataType)eResolveProxy(oldTimingx);
			if (timingx != oldTimingx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION__TIMINGX, oldTimingx, timingx));
			}
		}
		return timingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetTimingx() {
		return timingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingx(DataType newTimingx) {
		DataType oldTimingx = timingx;
		timingx = newTimingx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION__TIMINGX, oldTimingx, timingx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getParticipants() {
		if (participants == null) {
			participants = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.REQUEST_GROUP_ACTION__PARTICIPANT);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Coding)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getGroupingBehavior() {
		if (groupingBehavior != null && groupingBehavior.eIsProxy()) {
			InternalEObject oldGroupingBehavior = (InternalEObject)groupingBehavior;
			groupingBehavior = (Code)eResolveProxy(oldGroupingBehavior);
			if (groupingBehavior != oldGroupingBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR, oldGroupingBehavior, groupingBehavior));
			}
		}
		return groupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetGroupingBehavior() {
		return groupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingBehavior(Code newGroupingBehavior) {
		Code oldGroupingBehavior = groupingBehavior;
		groupingBehavior = newGroupingBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR, oldGroupingBehavior, groupingBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getSelectionBehavior() {
		if (selectionBehavior != null && selectionBehavior.eIsProxy()) {
			InternalEObject oldSelectionBehavior = (InternalEObject)selectionBehavior;
			selectionBehavior = (Code)eResolveProxy(oldSelectionBehavior);
			if (selectionBehavior != oldSelectionBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR, oldSelectionBehavior, selectionBehavior));
			}
		}
		return selectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetSelectionBehavior() {
		return selectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionBehavior(Code newSelectionBehavior) {
		Code oldSelectionBehavior = selectionBehavior;
		selectionBehavior = newSelectionBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR, oldSelectionBehavior, selectionBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getRequiredBehavior() {
		if (requiredBehavior != null && requiredBehavior.eIsProxy()) {
			InternalEObject oldRequiredBehavior = (InternalEObject)requiredBehavior;
			requiredBehavior = (Code)eResolveProxy(oldRequiredBehavior);
			if (requiredBehavior != oldRequiredBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR, oldRequiredBehavior, requiredBehavior));
			}
		}
		return requiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetRequiredBehavior() {
		return requiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredBehavior(Code newRequiredBehavior) {
		Code oldRequiredBehavior = requiredBehavior;
		requiredBehavior = newRequiredBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR, oldRequiredBehavior, requiredBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getPrecheckBehavior() {
		if (precheckBehavior != null && precheckBehavior.eIsProxy()) {
			InternalEObject oldPrecheckBehavior = (InternalEObject)precheckBehavior;
			precheckBehavior = (Code)eResolveProxy(oldPrecheckBehavior);
			if (precheckBehavior != oldPrecheckBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR, oldPrecheckBehavior, precheckBehavior));
			}
		}
		return precheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetPrecheckBehavior() {
		return precheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecheckBehavior(Code newPrecheckBehavior) {
		Code oldPrecheckBehavior = precheckBehavior;
		precheckBehavior = newPrecheckBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR, oldPrecheckBehavior, precheckBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCardinalityBehavior() {
		if (cardinalityBehavior != null && cardinalityBehavior.eIsProxy()) {
			InternalEObject oldCardinalityBehavior = (InternalEObject)cardinalityBehavior;
			cardinalityBehavior = (Code)eResolveProxy(oldCardinalityBehavior);
			if (cardinalityBehavior != oldCardinalityBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR, oldCardinalityBehavior, cardinalityBehavior));
			}
		}
		return cardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCardinalityBehavior() {
		return cardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityBehavior(Code newCardinalityBehavior) {
		Code oldCardinalityBehavior = cardinalityBehavior;
		cardinalityBehavior = newCardinalityBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR, oldCardinalityBehavior, cardinalityBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.REQUEST_GROUP_ACTION__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestGroupAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<RequestGroupAction>(RequestGroupAction.class, this, ResourcesPackage.REQUEST_GROUP_ACTION__ACTION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.REQUEST_GROUP_ACTION__CONDITION:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.REQUEST_GROUP_ACTION__RELATED_ACTION:
				return ((InternalEList<?>)getRelatedActions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.REQUEST_GROUP_ACTION__ACTION:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER:
				if (resolve) return getActionIdentifier();
				return basicGetActionIdentifier();
			case ResourcesPackage.REQUEST_GROUP_ACTION__LABEL:
				if (resolve) return getLabel();
				return basicGetLabel();
			case ResourcesPackage.REQUEST_GROUP_ACTION__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case ResourcesPackage.REQUEST_GROUP_ACTION__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT:
				if (resolve) return getTextEquivalent();
				return basicGetTextEquivalent();
			case ResourcesPackage.REQUEST_GROUP_ACTION__CODE:
				return getCodes();
			case ResourcesPackage.REQUEST_GROUP_ACTION__DOCUMENTATION:
				return getDocumentations();
			case ResourcesPackage.REQUEST_GROUP_ACTION__CONDITION:
				return getConditions();
			case ResourcesPackage.REQUEST_GROUP_ACTION__RELATED_ACTION:
				return getRelatedActions();
			case ResourcesPackage.REQUEST_GROUP_ACTION__TIMINGX:
				if (resolve) return getTimingx();
				return basicGetTimingx();
			case ResourcesPackage.REQUEST_GROUP_ACTION__PARTICIPANT:
				return getParticipants();
			case ResourcesPackage.REQUEST_GROUP_ACTION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR:
				if (resolve) return getGroupingBehavior();
				return basicGetGroupingBehavior();
			case ResourcesPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR:
				if (resolve) return getSelectionBehavior();
				return basicGetSelectionBehavior();
			case ResourcesPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR:
				if (resolve) return getRequiredBehavior();
				return basicGetRequiredBehavior();
			case ResourcesPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR:
				if (resolve) return getPrecheckBehavior();
				return basicGetPrecheckBehavior();
			case ResourcesPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR:
				if (resolve) return getCardinalityBehavior();
				return basicGetCardinalityBehavior();
			case ResourcesPackage.REQUEST_GROUP_ACTION__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case ResourcesPackage.REQUEST_GROUP_ACTION__ACTION:
				return getActions();
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
			case ResourcesPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__DOCUMENTATION:
				getDocumentations().clear();
				getDocumentations().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__CONDITION:
				getConditions().clear();
				getConditions().addAll((Collection<? extends RequestGroupActionCondition>)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__RELATED_ACTION:
				getRelatedActions().clear();
				getRelatedActions().addAll((Collection<? extends RequestGroupActionRelatedAction>)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__TIMINGX:
				setTimingx((DataType)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__TYPE:
				setType((Coding)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR:
				setGroupingBehavior((Code)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR:
				setSelectionBehavior((Code)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR:
				setRequiredBehavior((Code)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((Code)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((Code)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__RESOURCE:
				setResource((Resource)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__ACTION:
				getActions().clear();
				getActions().addAll((Collection<? extends RequestGroupAction>)newValue);
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
			case ResourcesPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__CODE:
				getCodes().clear();
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__DOCUMENTATION:
				getDocumentations().clear();
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__CONDITION:
				getConditions().clear();
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__RELATED_ACTION:
				getRelatedActions().clear();
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__TIMINGX:
				setTimingx((DataType)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__PARTICIPANT:
				getParticipants().clear();
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__TYPE:
				setType((Coding)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR:
				setGroupingBehavior((Code)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR:
				setSelectionBehavior((Code)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR:
				setRequiredBehavior((Code)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((Code)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((Code)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__RESOURCE:
				setResource((Resource)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION__ACTION:
				getActions().clear();
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
			case ResourcesPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER:
				return actionIdentifier != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION__LABEL:
				return label != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION__TITLE:
				return title != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT:
				return textEquivalent != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION__CODE:
				return codes != null && !codes.isEmpty();
			case ResourcesPackage.REQUEST_GROUP_ACTION__DOCUMENTATION:
				return documentations != null && !documentations.isEmpty();
			case ResourcesPackage.REQUEST_GROUP_ACTION__CONDITION:
				return conditions != null && !conditions.isEmpty();
			case ResourcesPackage.REQUEST_GROUP_ACTION__RELATED_ACTION:
				return relatedActions != null && !relatedActions.isEmpty();
			case ResourcesPackage.REQUEST_GROUP_ACTION__TIMINGX:
				return timingx != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case ResourcesPackage.REQUEST_GROUP_ACTION__TYPE:
				return type != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR:
				return groupingBehavior != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR:
				return selectionBehavior != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR:
				return requiredBehavior != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR:
				return precheckBehavior != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR:
				return cardinalityBehavior != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION__RESOURCE:
				return resource != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION__ACTION:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequestGroupActionImpl
