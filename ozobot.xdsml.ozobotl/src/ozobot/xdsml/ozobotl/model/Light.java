/**
 */
package ozobot.xdsml.ozobotl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozobot.xdsml.ozobotl.model.Light#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getLight()
 * @model
 * @generated
 */
public interface Light extends Command {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link ozobot.xdsml.ozobotl.model.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see ozobot.xdsml.ozobotl.model.Color
	 * @see #setColor(Color)
	 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getLight_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotl.model.Light#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see ozobot.xdsml.ozobotl.model.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // Light
