/**
 */
package ozobot.xdsml.ozobotl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozobot.xdsml.ozobotl.model.Rotate#getDirection <em>Direction</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotl.model.Rotate#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotl.model.Rotate#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getRotate()
 * @model
 * @generated
 */
public interface Rotate extends Command {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ozobot.xdsml.ozobotl.model.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see ozobot.xdsml.ozobotl.model.Direction
	 * @see #setDirection(Direction)
	 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getRotate_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotl.model.Rotate#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see ozobot.xdsml.ozobotl.model.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Velocity</b></em>' attribute.
	 * The literals are from the enumeration {@link ozobot.xdsml.ozobotl.model.Velocity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity</em>' attribute.
	 * @see ozobot.xdsml.ozobotl.model.Velocity
	 * @see #setVelocity(Velocity)
	 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getRotate_Velocity()
	 * @model
	 * @generated
	 */
	Velocity getVelocity();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotl.model.Rotate#getVelocity <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity</em>' attribute.
	 * @see ozobot.xdsml.ozobotl.model.Velocity
	 * @see #getVelocity()
	 * @generated
	 */
	void setVelocity(Velocity value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(float)
	 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getRotate_Angle()
	 * @model default="0"
	 * @generated
	 */
	float getAngle();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotl.model.Rotate#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(float value);

} // Rotate
