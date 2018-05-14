/**
 */
package ozobot.xdsml.ozobotlmt.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozobot.xdsml.ozobotlmt.model.RepeatAspect#getRuntimeCounter <em>Runtime Counter</em>}</li>
 * </ul>
 *
 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getRepeatAspect()
 * @model
 * @generated
 */
public interface RepeatAspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Runtime Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Counter</em>' attribute.
	 * @see #setRuntimeCounter(int)
	 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getRepeatAspect_RuntimeCounter()
	 * @model unique="false"
	 * @generated
	 */
	int getRuntimeCounter();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotlmt.model.RepeatAspect#getRuntimeCounter <em>Runtime Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Counter</em>' attribute.
	 * @see #getRuntimeCounter()
	 * @generated
	 */
	void setRuntimeCounter(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // RepeatAspect
