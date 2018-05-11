/**
 */
package ozobot.xdsml.ozobotl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozobot.xdsml.ozobotl.model.Move#getDistance <em>Distance</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotl.model.Move#getVelocity <em>Velocity</em>}</li>
 * </ul>
 *
 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends Command {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getMove_Distance()
	 * @model default="0"
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotl.model.Move#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

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
	 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getMove_Velocity()
	 * @model
	 * @generated
	 */
	Velocity getVelocity();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotl.model.Move#getVelocity <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity</em>' attribute.
	 * @see ozobot.xdsml.ozobotl.model.Velocity
	 * @see #getVelocity()
	 * @generated
	 */
	void setVelocity(Velocity value);

} // Move
