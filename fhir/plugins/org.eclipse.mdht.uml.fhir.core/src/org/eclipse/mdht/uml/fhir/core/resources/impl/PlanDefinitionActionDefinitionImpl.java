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
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact;
import org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ActivityDefinition;
import org.eclipse.mdht.uml.fhir.core.resources.PlanDefinitionActionDefinition;
import org.eclipse.mdht.uml.fhir.core.resources.PlanDefinitionActionDefinitionCondition;
import org.eclipse.mdht.uml.fhir.core.resources.PlanDefinitionActionDefinitionDynamicValue;
import org.eclipse.mdht.uml.fhir.core.resources.PlanDefinitionActionDefinitionRelatedAction;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.StructureMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Definition Action Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getDocumentations <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getTriggerDefinitions <em>Trigger Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getConditions <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getRelatedActions <em>Related Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getTimingx <em>Timingx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getParticipantTypes <em>Participant Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getActivityDefinition <em>Activity Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getDynamicValues <em>Dynamic Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PlanDefinitionActionDefinitionImpl#getActionDefinitions <em>Action Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanDefinitionActionDefinitionImpl extends BackboneElementImpl implements PlanDefinitionActionDefinition {
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
	 * The cached value of the '{@link #getTriggerDefinitions() <em>Trigger Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TriggerDefinition> triggerDefinitions;

	/**
	 * The cached value of the '{@link #getConditions() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionActionDefinitionCondition> conditions;

	/**
	 * The cached value of the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirement> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirement> outputs;

	/**
	 * The cached value of the '{@link #getRelatedActions() <em>Related Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionActionDefinitionRelatedAction> relatedActions;

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
	 * The cached value of the '{@link #getParticipantTypes() <em>Participant Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> participantTypes;

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
	 * The cached value of the '{@link #getActivityDefinition() <em>Activity Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityDefinition()
	 * @generated
	 * @ordered
	 */
	protected ActivityDefinition activityDefinition;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected StructureMap transform;

	/**
	 * The cached value of the '{@link #getDynamicValues() <em>Dynamic Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicValues()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionActionDefinitionDynamicValue> dynamicValues;

	/**
	 * The cached value of the '{@link #getActionDefinitions() <em>Action Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionActionDefinition> actionDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanDefinitionActionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPlanDefinitionActionDefinition();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER, oldActionIdentifier, actionIdentifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER, oldActionIdentifier, actionIdentifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL, oldLabel, label));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE, oldTitle, title));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT, oldTextEquivalent, textEquivalent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT, oldTextEquivalent, textEquivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCodes() {
		if (codes == null) {
			codes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CODE);
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
			documentations = new EObjectResolvingEList<RelatedArtifact>(RelatedArtifact.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DOCUMENTATION);
		}
		return documentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TriggerDefinition> getTriggerDefinitions() {
		if (triggerDefinitions == null) {
			triggerDefinitions = new EObjectResolvingEList<TriggerDefinition>(TriggerDefinition.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRIGGER_DEFINITION);
		}
		return triggerDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanDefinitionActionDefinitionCondition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<PlanDefinitionActionDefinitionCondition>(PlanDefinitionActionDefinitionCondition.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirement> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<DataRequirement>(DataRequirement.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__INPUT);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirement> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectResolvingEList<DataRequirement>(DataRequirement.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__OUTPUT);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanDefinitionActionDefinitionRelatedAction> getRelatedActions() {
		if (relatedActions == null) {
			relatedActions = new EObjectContainmentEList<PlanDefinitionActionDefinitionRelatedAction>(PlanDefinitionActionDefinitionRelatedAction.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__RELATED_ACTION);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMINGX, oldTimingx, timingx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMINGX, oldTimingx, timingx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getParticipantTypes() {
		if (participantTypes == null) {
			participantTypes = new EObjectResolvingEList<Code>(Code.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__PARTICIPANT_TYPE);
		}
		return participantTypes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR, oldGroupingBehavior, groupingBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR, oldGroupingBehavior, groupingBehavior));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR, oldSelectionBehavior, selectionBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR, oldSelectionBehavior, selectionBehavior));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR, oldRequiredBehavior, requiredBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR, oldRequiredBehavior, requiredBehavior));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR, oldPrecheckBehavior, precheckBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR, oldPrecheckBehavior, precheckBehavior));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR, oldCardinalityBehavior, cardinalityBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR, oldCardinalityBehavior, cardinalityBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinition getActivityDefinition() {
		if (activityDefinition != null && activityDefinition.eIsProxy()) {
			InternalEObject oldActivityDefinition = (InternalEObject)activityDefinition;
			activityDefinition = (ActivityDefinition)eResolveProxy(oldActivityDefinition);
			if (activityDefinition != oldActivityDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION, oldActivityDefinition, activityDefinition));
			}
		}
		return activityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinition basicGetActivityDefinition() {
		return activityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityDefinition(ActivityDefinition newActivityDefinition) {
		ActivityDefinition oldActivityDefinition = activityDefinition;
		activityDefinition = newActivityDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION, oldActivityDefinition, activityDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMap getTransform() {
		if (transform != null && transform.eIsProxy()) {
			InternalEObject oldTransform = (InternalEObject)transform;
			transform = (StructureMap)eResolveProxy(oldTransform);
			if (transform != oldTransform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM, oldTransform, transform));
			}
		}
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMap basicGetTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(StructureMap newTransform) {
		StructureMap oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM, oldTransform, transform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanDefinitionActionDefinitionDynamicValue> getDynamicValues() {
		if (dynamicValues == null) {
			dynamicValues = new EObjectContainmentEList<PlanDefinitionActionDefinitionDynamicValue>(PlanDefinitionActionDefinitionDynamicValue.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DYNAMIC_VALUE);
		}
		return dynamicValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanDefinitionActionDefinition> getActionDefinitions() {
		if (actionDefinitions == null) {
			actionDefinitions = new EObjectContainmentEList<PlanDefinitionActionDefinition>(PlanDefinitionActionDefinition.class, this, ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_DEFINITION);
		}
		return actionDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__RELATED_ACTION:
				return ((InternalEList<?>)getRelatedActions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DYNAMIC_VALUE:
				return ((InternalEList<?>)getDynamicValues()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_DEFINITION:
				return ((InternalEList<?>)getActionDefinitions()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER:
				if (resolve) return getActionIdentifier();
				return basicGetActionIdentifier();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL:
				if (resolve) return getLabel();
				return basicGetLabel();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT:
				if (resolve) return getTextEquivalent();
				return basicGetTextEquivalent();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CODE:
				return getCodes();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DOCUMENTATION:
				return getDocumentations();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRIGGER_DEFINITION:
				return getTriggerDefinitions();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION:
				return getConditions();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__INPUT:
				return getInputs();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__OUTPUT:
				return getOutputs();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__RELATED_ACTION:
				return getRelatedActions();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMINGX:
				if (resolve) return getTimingx();
				return basicGetTimingx();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__PARTICIPANT_TYPE:
				return getParticipantTypes();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR:
				if (resolve) return getGroupingBehavior();
				return basicGetGroupingBehavior();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR:
				if (resolve) return getSelectionBehavior();
				return basicGetSelectionBehavior();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR:
				if (resolve) return getRequiredBehavior();
				return basicGetRequiredBehavior();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR:
				if (resolve) return getPrecheckBehavior();
				return basicGetPrecheckBehavior();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR:
				if (resolve) return getCardinalityBehavior();
				return basicGetCardinalityBehavior();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION:
				if (resolve) return getActivityDefinition();
				return basicGetActivityDefinition();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM:
				if (resolve) return getTransform();
				return basicGetTransform();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DYNAMIC_VALUE:
				return getDynamicValues();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_DEFINITION:
				return getActionDefinitions();
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
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT:
				setTextEquivalent((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DOCUMENTATION:
				getDocumentations().clear();
				getDocumentations().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRIGGER_DEFINITION:
				getTriggerDefinitions().clear();
				getTriggerDefinitions().addAll((Collection<? extends TriggerDefinition>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION:
				getConditions().clear();
				getConditions().addAll((Collection<? extends PlanDefinitionActionDefinitionCondition>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__INPUT:
				getInputs().clear();
				getInputs().addAll((Collection<? extends DataRequirement>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__OUTPUT:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends DataRequirement>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__RELATED_ACTION:
				getRelatedActions().clear();
				getRelatedActions().addAll((Collection<? extends PlanDefinitionActionDefinitionRelatedAction>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMINGX:
				setTimingx((DataType)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__PARTICIPANT_TYPE:
				getParticipantTypes().clear();
				getParticipantTypes().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE:
				setType((Coding)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR:
				setGroupingBehavior((Code)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR:
				setSelectionBehavior((Code)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR:
				setRequiredBehavior((Code)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((Code)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((Code)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION:
				setActivityDefinition((ActivityDefinition)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM:
				setTransform((StructureMap)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DYNAMIC_VALUE:
				getDynamicValues().clear();
				getDynamicValues().addAll((Collection<? extends PlanDefinitionActionDefinitionDynamicValue>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_DEFINITION:
				getActionDefinitions().clear();
				getActionDefinitions().addAll((Collection<? extends PlanDefinitionActionDefinition>)newValue);
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
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT:
				setTextEquivalent((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CODE:
				getCodes().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DOCUMENTATION:
				getDocumentations().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRIGGER_DEFINITION:
				getTriggerDefinitions().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION:
				getConditions().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__INPUT:
				getInputs().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__OUTPUT:
				getOutputs().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__RELATED_ACTION:
				getRelatedActions().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMINGX:
				setTimingx((DataType)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__PARTICIPANT_TYPE:
				getParticipantTypes().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE:
				setType((Coding)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR:
				setGroupingBehavior((Code)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR:
				setSelectionBehavior((Code)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR:
				setRequiredBehavior((Code)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((Code)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((Code)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION:
				setActivityDefinition((ActivityDefinition)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM:
				setTransform((StructureMap)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DYNAMIC_VALUE:
				getDynamicValues().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_DEFINITION:
				getActionDefinitions().clear();
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
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_IDENTIFIER:
				return actionIdentifier != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__LABEL:
				return label != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TITLE:
				return title != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TEXT_EQUIVALENT:
				return textEquivalent != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CODE:
				return codes != null && !codes.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DOCUMENTATION:
				return documentations != null && !documentations.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRIGGER_DEFINITION:
				return triggerDefinitions != null && !triggerDefinitions.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CONDITION:
				return conditions != null && !conditions.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__INPUT:
				return inputs != null && !inputs.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__OUTPUT:
				return outputs != null && !outputs.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__RELATED_ACTION:
				return relatedActions != null && !relatedActions.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TIMINGX:
				return timingx != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__PARTICIPANT_TYPE:
				return participantTypes != null && !participantTypes.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TYPE:
				return type != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__GROUPING_BEHAVIOR:
				return groupingBehavior != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__SELECTION_BEHAVIOR:
				return selectionBehavior != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__REQUIRED_BEHAVIOR:
				return requiredBehavior != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__PRECHECK_BEHAVIOR:
				return precheckBehavior != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__CARDINALITY_BEHAVIOR:
				return cardinalityBehavior != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTIVITY_DEFINITION:
				return activityDefinition != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__TRANSFORM:
				return transform != null;
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__DYNAMIC_VALUE:
				return dynamicValues != null && !dynamicValues.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DEFINITION__ACTION_DEFINITION:
				return actionDefinitions != null && !actionDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlanDefinitionActionDefinitionImpl
