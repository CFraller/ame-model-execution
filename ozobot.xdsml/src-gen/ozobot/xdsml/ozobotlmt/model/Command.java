/**
 */
package ozobot.xdsml.ozobotlmt.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozobot.xdsml.ozobotlmt.model.Command#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotlmt.model.Command#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getCommand()
 * @model abstract="true"
 * @generated
 */
public interface Command extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ozobot.xdsml.ozobotlmt.model.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(Transition)
	 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getCommand_Outgoing()
	 * @see ozobot.xdsml.ozobotlmt.model.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Transition getOutgoing();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotlmt.model.Command#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(Transition value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ozobot.xdsml.ozobotlmt.model.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(Transition)
	 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getCommand_Incoming()
	 * @see ozobot.xdsml.ozobotlmt.model.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Transition getIncoming();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotlmt.model.Command#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(Transition value);

} // Command
