/**
 */
package ozobot.xdsml.ozobotl.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ozobot.xdsml.ozobotl.model.ModelPackage;
import ozobot.xdsml.ozobotl.model.Ozobot;
import ozobot.xdsml.ozobotl.model.OzobotProgram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ozobot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ozobot.xdsml.ozobotl.model.impl.OzobotImpl#getPrograms <em>Programs</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotl.model.impl.OzobotImpl#getXposition <em>Xposition</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotl.model.impl.OzobotImpl#getYposition <em>Yposition</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotl.model.impl.OzobotImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OzobotImpl extends NamedElementImpl implements Ozobot {
	/**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<OzobotProgram> programs;

	/**
	 * The default value of the '{@link #getXposition() <em>Xposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXposition()
	 * @generated
	 * @ordered
	 */
	protected static final double XPOSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXposition() <em>Xposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXposition()
	 * @generated
	 * @ordered
	 */
	protected double xposition = XPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYposition() <em>Yposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYposition()
	 * @generated
	 * @ordered
	 */
	protected static final double YPOSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYposition() <em>Yposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYposition()
	 * @generated
	 * @ordered
	 */
	protected double yposition = YPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIENTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected double orientation = ORIENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OzobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.OZOBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OzobotProgram> getPrograms() {
		if (programs == null) {
			programs = new EObjectContainmentEList<OzobotProgram>(OzobotProgram.class, this, ModelPackage.OZOBOT__PROGRAMS);
		}
		return programs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXposition() {
		return xposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXposition(double newXposition) {
		double oldXposition = xposition;
		xposition = newXposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OZOBOT__XPOSITION, oldXposition, xposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYposition() {
		return yposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYposition(double newYposition) {
		double oldYposition = yposition;
		yposition = newYposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OZOBOT__YPOSITION, oldYposition, yposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(double newOrientation) {
		double oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OZOBOT__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.OZOBOT__PROGRAMS:
				return ((InternalEList<?>)getPrograms()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.OZOBOT__PROGRAMS:
				return getPrograms();
			case ModelPackage.OZOBOT__XPOSITION:
				return getXposition();
			case ModelPackage.OZOBOT__YPOSITION:
				return getYposition();
			case ModelPackage.OZOBOT__ORIENTATION:
				return getOrientation();
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
			case ModelPackage.OZOBOT__PROGRAMS:
				getPrograms().clear();
				getPrograms().addAll((Collection<? extends OzobotProgram>)newValue);
				return;
			case ModelPackage.OZOBOT__XPOSITION:
				setXposition((Double)newValue);
				return;
			case ModelPackage.OZOBOT__YPOSITION:
				setYposition((Double)newValue);
				return;
			case ModelPackage.OZOBOT__ORIENTATION:
				setOrientation((Double)newValue);
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
			case ModelPackage.OZOBOT__PROGRAMS:
				getPrograms().clear();
				return;
			case ModelPackage.OZOBOT__XPOSITION:
				setXposition(XPOSITION_EDEFAULT);
				return;
			case ModelPackage.OZOBOT__YPOSITION:
				setYposition(YPOSITION_EDEFAULT);
				return;
			case ModelPackage.OZOBOT__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
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
			case ModelPackage.OZOBOT__PROGRAMS:
				return programs != null && !programs.isEmpty();
			case ModelPackage.OZOBOT__XPOSITION:
				return xposition != XPOSITION_EDEFAULT;
			case ModelPackage.OZOBOT__YPOSITION:
				return yposition != YPOSITION_EDEFAULT;
			case ModelPackage.OZOBOT__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xposition: ");
		result.append(xposition);
		result.append(", yposition: ");
		result.append(yposition);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} //OzobotImpl
