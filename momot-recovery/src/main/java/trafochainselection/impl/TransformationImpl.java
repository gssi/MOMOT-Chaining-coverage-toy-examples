/**
 */
package trafochainselection.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import trafochainselection.Metamodel;
import trafochainselection.TrafochainselectionPackage;
import trafochainselection.Transformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafochainselection.impl.TransformationImpl#getId <em>Id</em>}</li>
 *   <li>{@link trafochainselection.impl.TransformationImpl#getSrcMMCoverage <em>Src MM Coverage</em>}</li>
 *   <li>{@link trafochainselection.impl.TransformationImpl#getTrgMMCoverage <em>Trg MM Coverage</em>}</li>
 *   <li>{@link trafochainselection.impl.TransformationImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link trafochainselection.impl.TransformationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrcMMCoverage() <em>Src MM Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcMMCoverage()
	 * @generated
	 * @ordered
	 */
	protected static final double SRC_MM_COVERAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSrcMMCoverage() <em>Src MM Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcMMCoverage()
	 * @generated
	 * @ordered
	 */
	protected double srcMMCoverage = SRC_MM_COVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrgMMCoverage() <em>Trg MM Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrgMMCoverage()
	 * @generated
	 * @ordered
	 */
	protected static final double TRG_MM_COVERAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTrgMMCoverage() <em>Trg MM Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrgMMCoverage()
	 * @generated
	 * @ordered
	 */
	protected double trgMMCoverage = TRG_MM_COVERAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Metamodel src;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Metamodel target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafochainselectionPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafochainselectionPackage.TRANSFORMATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSrcMMCoverage() {
		return srcMMCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrcMMCoverage(double newSrcMMCoverage) {
		double oldSrcMMCoverage = srcMMCoverage;
		srcMMCoverage = newSrcMMCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafochainselectionPackage.TRANSFORMATION__SRC_MM_COVERAGE, oldSrcMMCoverage, srcMMCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTrgMMCoverage() {
		return trgMMCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrgMMCoverage(double newTrgMMCoverage) {
		double oldTrgMMCoverage = trgMMCoverage;
		trgMMCoverage = newTrgMMCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafochainselectionPackage.TRANSFORMATION__TRG_MM_COVERAGE, oldTrgMMCoverage, trgMMCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metamodel getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject)src;
			src = (Metamodel)eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrafochainselectionPackage.TRANSFORMATION__SRC, oldSrc, src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrc(Metamodel newSrc) {
		Metamodel oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafochainselectionPackage.TRANSFORMATION__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metamodel getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Metamodel)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrafochainselectionPackage.TRANSFORMATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Metamodel newTarget) {
		Metamodel oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafochainselectionPackage.TRANSFORMATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrafochainselectionPackage.TRANSFORMATION__ID:
				return getId();
			case TrafochainselectionPackage.TRANSFORMATION__SRC_MM_COVERAGE:
				return getSrcMMCoverage();
			case TrafochainselectionPackage.TRANSFORMATION__TRG_MM_COVERAGE:
				return getTrgMMCoverage();
			case TrafochainselectionPackage.TRANSFORMATION__SRC:
				if (resolve) return getSrc();
				return basicGetSrc();
			case TrafochainselectionPackage.TRANSFORMATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case TrafochainselectionPackage.TRANSFORMATION__ID:
				setId((String)newValue);
				return;
			case TrafochainselectionPackage.TRANSFORMATION__SRC_MM_COVERAGE:
				setSrcMMCoverage((Double)newValue);
				return;
			case TrafochainselectionPackage.TRANSFORMATION__TRG_MM_COVERAGE:
				setTrgMMCoverage((Double)newValue);
				return;
			case TrafochainselectionPackage.TRANSFORMATION__SRC:
				setSrc((Metamodel)newValue);
				return;
			case TrafochainselectionPackage.TRANSFORMATION__TARGET:
				setTarget((Metamodel)newValue);
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
			case TrafochainselectionPackage.TRANSFORMATION__ID:
				setId(ID_EDEFAULT);
				return;
			case TrafochainselectionPackage.TRANSFORMATION__SRC_MM_COVERAGE:
				setSrcMMCoverage(SRC_MM_COVERAGE_EDEFAULT);
				return;
			case TrafochainselectionPackage.TRANSFORMATION__TRG_MM_COVERAGE:
				setTrgMMCoverage(TRG_MM_COVERAGE_EDEFAULT);
				return;
			case TrafochainselectionPackage.TRANSFORMATION__SRC:
				setSrc((Metamodel)null);
				return;
			case TrafochainselectionPackage.TRANSFORMATION__TARGET:
				setTarget((Metamodel)null);
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
			case TrafochainselectionPackage.TRANSFORMATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TrafochainselectionPackage.TRANSFORMATION__SRC_MM_COVERAGE:
				return srcMMCoverage != SRC_MM_COVERAGE_EDEFAULT;
			case TrafochainselectionPackage.TRANSFORMATION__TRG_MM_COVERAGE:
				return trgMMCoverage != TRG_MM_COVERAGE_EDEFAULT;
			case TrafochainselectionPackage.TRANSFORMATION__SRC:
				return src != null;
			case TrafochainselectionPackage.TRANSFORMATION__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", srcMMCoverage: ");
		result.append(srcMMCoverage);
		result.append(", trgMMCoverage: ");
		result.append(trgMMCoverage);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
