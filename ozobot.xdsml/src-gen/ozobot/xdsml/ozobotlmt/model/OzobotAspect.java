/**
 */
package ozobot.xdsml.ozobotlmt.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ozobot Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozobot.xdsml.ozobotlmt.model.OzobotAspect#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotlmt.model.OzobotAspect#getXposition <em>Xposition</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotlmt.model.OzobotAspect#getYposition <em>Yposition</em>}</li>
 * </ul>
 *
 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getOzobotAspect()
 * @model
 * @generated
 */
public interface OzobotAspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(float)
	 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getOzobotAspect_Orientation()
	 * @model unique="false"
	 * @generated
	 */
	float getOrientation();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotlmt.model.OzobotAspect#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(float value);

	/**
	 * Returns the value of the '<em><b>Xposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xposition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xposition</em>' attribute.
	 * @see #setXposition(float)
	 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getOzobotAspect_Xposition()
	 * @model unique="false"
	 * @generated
	 */
	float getXposition();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotlmt.model.OzobotAspect#getXposition <em>Xposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xposition</em>' attribute.
	 * @see #getXposition()
	 * @generated
	 */
	void setXposition(float value);

	/**
	 * Returns the value of the '<em><b>Yposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yposition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yposition</em>' attribute.
	 * @see #setYposition(float)
	 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getOzobotAspect_Yposition()
	 * @model unique="false"
	 * @generated
	 */
	float getYposition();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotlmt.model.OzobotAspect#getYposition <em>Yposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yposition</em>' attribute.
	 * @see #getYposition()
	 * @generated
	 */
	void setYposition(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // OzobotAspect
