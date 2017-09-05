/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Quantity;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.SequenceQuality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getStandardSequence <em>Standard Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getTruthTp <em>Truth Tp</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getQueryTp <em>Query Tp</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getTruthFn <em>Truth Fn</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getQueryFp <em>Query Fp</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getGtFp <em>Gt Fp</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getRecall <em>Recall</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceQualityImpl#getFScore <em>FScore</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceQualityImpl extends BackboneElementImpl implements SequenceQuality {
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
	 * The cached value of the '{@link #getStandardSequence() <em>Standard Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardSequence()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept standardSequence;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer end;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected Quantity score;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getTruthTp() <em>Truth Tp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruthTp()
	 * @generated
	 * @ordered
	 */
	protected Decimal truthTp;

	/**
	 * The cached value of the '{@link #getQueryTp() <em>Query Tp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryTp()
	 * @generated
	 * @ordered
	 */
	protected Decimal queryTp;

	/**
	 * The cached value of the '{@link #getTruthFn() <em>Truth Fn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruthFn()
	 * @generated
	 * @ordered
	 */
	protected Decimal truthFn;

	/**
	 * The cached value of the '{@link #getQueryFp() <em>Query Fp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryFp()
	 * @generated
	 * @ordered
	 */
	protected Decimal queryFp;

	/**
	 * The cached value of the '{@link #getGtFp() <em>Gt Fp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGtFp()
	 * @generated
	 * @ordered
	 */
	protected Decimal gtFp;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Decimal precision;

	/**
	 * The cached value of the '{@link #getRecall() <em>Recall</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecall()
	 * @generated
	 * @ordered
	 */
	protected Decimal recall;

	/**
	 * The cached value of the '{@link #getFScore() <em>FScore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFScore()
	 * @generated
	 * @ordered
	 */
	protected Decimal fScore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceQualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSequenceQuality();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStandardSequence() {
		if (standardSequence != null && standardSequence.eIsProxy()) {
			InternalEObject oldStandardSequence = (InternalEObject)standardSequence;
			standardSequence = (CodeableConcept)eResolveProxy(oldStandardSequence);
			if (standardSequence != oldStandardSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE, oldStandardSequence, standardSequence));
			}
		}
		return standardSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetStandardSequence() {
		return standardSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardSequence(CodeableConcept newStandardSequence) {
		CodeableConcept oldStandardSequence = standardSequence;
		standardSequence = newStandardSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE, oldStandardSequence, standardSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newStart) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newEnd) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getScore() {
		if (score != null && score.eIsProxy()) {
			InternalEObject oldScore = (InternalEObject)score;
			score = (Quantity)eResolveProxy(oldScore);
			if (score != oldScore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__SCORE, oldScore, score));
			}
		}
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity basicGetScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(Quantity newScore) {
		Quantity oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (CodeableConcept)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getTruthTp() {
		if (truthTp != null && truthTp.eIsProxy()) {
			InternalEObject oldTruthTp = (InternalEObject)truthTp;
			truthTp = (Decimal)eResolveProxy(oldTruthTp);
			if (truthTp != oldTruthTp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__TRUTH_TP, oldTruthTp, truthTp));
			}
		}
		return truthTp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetTruthTp() {
		return truthTp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTruthTp(Decimal newTruthTp) {
		Decimal oldTruthTp = truthTp;
		truthTp = newTruthTp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__TRUTH_TP, oldTruthTp, truthTp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getQueryTp() {
		if (queryTp != null && queryTp.eIsProxy()) {
			InternalEObject oldQueryTp = (InternalEObject)queryTp;
			queryTp = (Decimal)eResolveProxy(oldQueryTp);
			if (queryTp != oldQueryTp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__QUERY_TP, oldQueryTp, queryTp));
			}
		}
		return queryTp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetQueryTp() {
		return queryTp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryTp(Decimal newQueryTp) {
		Decimal oldQueryTp = queryTp;
		queryTp = newQueryTp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__QUERY_TP, oldQueryTp, queryTp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getTruthFn() {
		if (truthFn != null && truthFn.eIsProxy()) {
			InternalEObject oldTruthFn = (InternalEObject)truthFn;
			truthFn = (Decimal)eResolveProxy(oldTruthFn);
			if (truthFn != oldTruthFn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__TRUTH_FN, oldTruthFn, truthFn));
			}
		}
		return truthFn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetTruthFn() {
		return truthFn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTruthFn(Decimal newTruthFn) {
		Decimal oldTruthFn = truthFn;
		truthFn = newTruthFn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__TRUTH_FN, oldTruthFn, truthFn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getQueryFp() {
		if (queryFp != null && queryFp.eIsProxy()) {
			InternalEObject oldQueryFp = (InternalEObject)queryFp;
			queryFp = (Decimal)eResolveProxy(oldQueryFp);
			if (queryFp != oldQueryFp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__QUERY_FP, oldQueryFp, queryFp));
			}
		}
		return queryFp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetQueryFp() {
		return queryFp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryFp(Decimal newQueryFp) {
		Decimal oldQueryFp = queryFp;
		queryFp = newQueryFp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__QUERY_FP, oldQueryFp, queryFp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getGtFp() {
		if (gtFp != null && gtFp.eIsProxy()) {
			InternalEObject oldGtFp = (InternalEObject)gtFp;
			gtFp = (Decimal)eResolveProxy(oldGtFp);
			if (gtFp != oldGtFp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__GT_FP, oldGtFp, gtFp));
			}
		}
		return gtFp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetGtFp() {
		return gtFp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGtFp(Decimal newGtFp) {
		Decimal oldGtFp = gtFp;
		gtFp = newGtFp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__GT_FP, oldGtFp, gtFp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPrecision() {
		if (precision != null && precision.eIsProxy()) {
			InternalEObject oldPrecision = (InternalEObject)precision;
			precision = (Decimal)eResolveProxy(oldPrecision);
			if (precision != oldPrecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__PRECISION, oldPrecision, precision));
			}
		}
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(Decimal newPrecision) {
		Decimal oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getRecall() {
		if (recall != null && recall.eIsProxy()) {
			InternalEObject oldRecall = (InternalEObject)recall;
			recall = (Decimal)eResolveProxy(oldRecall);
			if (recall != oldRecall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__RECALL, oldRecall, recall));
			}
		}
		return recall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetRecall() {
		return recall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecall(Decimal newRecall) {
		Decimal oldRecall = recall;
		recall = newRecall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__RECALL, oldRecall, recall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFScore() {
		if (fScore != null && fScore.eIsProxy()) {
			InternalEObject oldFScore = (InternalEObject)fScore;
			fScore = (Decimal)eResolveProxy(oldFScore);
			if (fScore != oldFScore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_QUALITY__FSCORE, oldFScore, fScore));
			}
		}
		return fScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetFScore() {
		return fScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFScore(Decimal newFScore) {
		Decimal oldFScore = fScore;
		fScore = newFScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_QUALITY__FSCORE, oldFScore, fScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.SEQUENCE_QUALITY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				if (resolve) return getStandardSequence();
				return basicGetStandardSequence();
			case ResourcesPackage.SEQUENCE_QUALITY__START:
				if (resolve) return getStart();
				return basicGetStart();
			case ResourcesPackage.SEQUENCE_QUALITY__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case ResourcesPackage.SEQUENCE_QUALITY__SCORE:
				if (resolve) return getScore();
				return basicGetScore();
			case ResourcesPackage.SEQUENCE_QUALITY__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case ResourcesPackage.SEQUENCE_QUALITY__TRUTH_TP:
				if (resolve) return getTruthTp();
				return basicGetTruthTp();
			case ResourcesPackage.SEQUENCE_QUALITY__QUERY_TP:
				if (resolve) return getQueryTp();
				return basicGetQueryTp();
			case ResourcesPackage.SEQUENCE_QUALITY__TRUTH_FN:
				if (resolve) return getTruthFn();
				return basicGetTruthFn();
			case ResourcesPackage.SEQUENCE_QUALITY__QUERY_FP:
				if (resolve) return getQueryFp();
				return basicGetQueryFp();
			case ResourcesPackage.SEQUENCE_QUALITY__GT_FP:
				if (resolve) return getGtFp();
				return basicGetGtFp();
			case ResourcesPackage.SEQUENCE_QUALITY__PRECISION:
				if (resolve) return getPrecision();
				return basicGetPrecision();
			case ResourcesPackage.SEQUENCE_QUALITY__RECALL:
				if (resolve) return getRecall();
				return basicGetRecall();
			case ResourcesPackage.SEQUENCE_QUALITY__FSCORE:
				if (resolve) return getFScore();
				return basicGetFScore();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.SEQUENCE_QUALITY__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				setStandardSequence((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__START:
				setStart((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__END:
				setEnd((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__SCORE:
				setScore((Quantity)newValue);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__TRUTH_TP:
				setTruthTp((Decimal)newValue);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__QUERY_TP:
				setQueryTp((Decimal)newValue);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__TRUTH_FN:
				setTruthFn((Decimal)newValue);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__QUERY_FP:
				setQueryFp((Decimal)newValue);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__GT_FP:
				setGtFp((Decimal)newValue);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__PRECISION:
				setPrecision((Decimal)newValue);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__RECALL:
				setRecall((Decimal)newValue);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__FSCORE:
				setFScore((Decimal)newValue);
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
			case ResourcesPackage.SEQUENCE_QUALITY__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				setStandardSequence((CodeableConcept)null);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__START:
				setStart((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__END:
				setEnd((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__SCORE:
				setScore((Quantity)null);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__TRUTH_TP:
				setTruthTp((Decimal)null);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__QUERY_TP:
				setQueryTp((Decimal)null);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__TRUTH_FN:
				setTruthFn((Decimal)null);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__QUERY_FP:
				setQueryFp((Decimal)null);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__GT_FP:
				setGtFp((Decimal)null);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__PRECISION:
				setPrecision((Decimal)null);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__RECALL:
				setRecall((Decimal)null);
				return;
			case ResourcesPackage.SEQUENCE_QUALITY__FSCORE:
				setFScore((Decimal)null);
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
			case ResourcesPackage.SEQUENCE_QUALITY__TYPE:
				return type != null;
			case ResourcesPackage.SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				return standardSequence != null;
			case ResourcesPackage.SEQUENCE_QUALITY__START:
				return start != null;
			case ResourcesPackage.SEQUENCE_QUALITY__END:
				return end != null;
			case ResourcesPackage.SEQUENCE_QUALITY__SCORE:
				return score != null;
			case ResourcesPackage.SEQUENCE_QUALITY__METHOD:
				return method != null;
			case ResourcesPackage.SEQUENCE_QUALITY__TRUTH_TP:
				return truthTp != null;
			case ResourcesPackage.SEQUENCE_QUALITY__QUERY_TP:
				return queryTp != null;
			case ResourcesPackage.SEQUENCE_QUALITY__TRUTH_FN:
				return truthFn != null;
			case ResourcesPackage.SEQUENCE_QUALITY__QUERY_FP:
				return queryFp != null;
			case ResourcesPackage.SEQUENCE_QUALITY__GT_FP:
				return gtFp != null;
			case ResourcesPackage.SEQUENCE_QUALITY__PRECISION:
				return precision != null;
			case ResourcesPackage.SEQUENCE_QUALITY__RECALL:
				return recall != null;
			case ResourcesPackage.SEQUENCE_QUALITY__FSCORE:
				return fScore != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceQualityImpl
