/**
 */
package ozobot.xdsml.ozobotlmt.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozobot.xdsml.ozobotlmt.model.CommandAspect#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getCommandAspect()
 * @model abstract="true"
 * @generated
 */
public interface CommandAspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getCommandAspect_Topic()
	 * @model unique="false"
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotlmt.model.CommandAspect#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // CommandAspect
