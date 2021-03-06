/**
 */
package ozobot.xdsml.ozobotl.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ozobot.xdsml.ozobotl.model.Block;
import ozobot.xdsml.ozobotl.model.Command;
import ozobot.xdsml.ozobotl.model.ModelPackage;
import ozobot.xdsml.ozobotl.model.OzobotProgram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ozobot Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ozobot.xdsml.ozobotl.model.impl.OzobotProgramImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotl.model.impl.OzobotProgramImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotl.model.impl.OzobotProgramImpl#getCurrentCommand <em>Current Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OzobotProgramImpl extends NamedElementImpl implements OzobotProgram {
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected Block block;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected Command current;

	/**
	 * The cached value of the '{@link #getCurrentCommand() <em>Current Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCommand()
	 * @generated
	 * @ordered
	 */
	protected Command currentCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OzobotProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.OZOBOT_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs) {
		Block oldBlock = block;
		block = newBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.OZOBOT_PROGRAM__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(Block newBlock) {
		if (newBlock != block) {
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.OZOBOT_PROGRAM__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.OZOBOT_PROGRAM__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OZOBOT_PROGRAM__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getCurrent() {
		if (current != null && current.eIsProxy()) {
			InternalEObject oldCurrent = (InternalEObject)current;
			current = (Command)eResolveProxy(oldCurrent);
			if (current != oldCurrent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.OZOBOT_PROGRAM__CURRENT, oldCurrent, current));
			}
		}
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(Command newCurrent) {
		Command oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OZOBOT_PROGRAM__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getCurrentCommand() {
		if (currentCommand != null && currentCommand.eIsProxy()) {
			InternalEObject oldCurrentCommand = (InternalEObject)currentCommand;
			currentCommand = (Command)eResolveProxy(oldCurrentCommand);
			if (currentCommand != oldCurrentCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.OZOBOT_PROGRAM__CURRENT_COMMAND, oldCurrentCommand, currentCommand));
			}
		}
		return currentCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetCurrentCommand() {
		return currentCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentCommand(Command newCurrentCommand) {
		Command oldCurrentCommand = currentCommand;
		currentCommand = newCurrentCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OZOBOT_PROGRAM__CURRENT_COMMAND, oldCurrentCommand, currentCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.OZOBOT_PROGRAM__BLOCK:
				return basicSetBlock(null, msgs);
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
			case ModelPackage.OZOBOT_PROGRAM__BLOCK:
				return getBlock();
			case ModelPackage.OZOBOT_PROGRAM__CURRENT:
				if (resolve) return getCurrent();
				return basicGetCurrent();
			case ModelPackage.OZOBOT_PROGRAM__CURRENT_COMMAND:
				if (resolve) return getCurrentCommand();
				return basicGetCurrentCommand();
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
			case ModelPackage.OZOBOT_PROGRAM__BLOCK:
				setBlock((Block)newValue);
				return;
			case ModelPackage.OZOBOT_PROGRAM__CURRENT:
				setCurrent((Command)newValue);
				return;
			case ModelPackage.OZOBOT_PROGRAM__CURRENT_COMMAND:
				setCurrentCommand((Command)newValue);
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
			case ModelPackage.OZOBOT_PROGRAM__BLOCK:
				setBlock((Block)null);
				return;
			case ModelPackage.OZOBOT_PROGRAM__CURRENT:
				setCurrent((Command)null);
				return;
			case ModelPackage.OZOBOT_PROGRAM__CURRENT_COMMAND:
				setCurrentCommand((Command)null);
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
			case ModelPackage.OZOBOT_PROGRAM__BLOCK:
				return block != null;
			case ModelPackage.OZOBOT_PROGRAM__CURRENT:
				return current != null;
			case ModelPackage.OZOBOT_PROGRAM__CURRENT_COMMAND:
				return currentCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //OzobotProgramImpl
