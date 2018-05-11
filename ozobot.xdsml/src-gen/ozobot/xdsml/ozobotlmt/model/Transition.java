/**
 */
package ozobot.xdsml.ozobotlmt.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozobot.xdsml.ozobotlmt.model.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotlmt.model.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ozobot.xdsml.ozobotlmt.model.Command#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Command)
	 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getTransition_Source()
	 * @see ozobot.xdsml.ozobotlmt.model.Command#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Command getSource();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotlmt.model.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Command value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ozobot.xdsml.ozobotlmt.model.Command#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Command)
	 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getTransition_Target()
	 * @see ozobot.xdsml.ozobotlmt.model.Command#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Command getTarget();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotlmt.model.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Command value);

} // Transition
