/**
 */
package ozobot.xdsml.ozobotl.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ozobot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozobot.xdsml.ozobotl.model.Ozobot#getPrograms <em>Programs</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotl.model.Ozobot#getXposition <em>Xposition</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotl.model.Ozobot#getYposition <em>Yposition</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotl.model.Ozobot#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getOzobot()
 * @model
 * @generated
 */
public interface Ozobot extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link ozobot.xdsml.ozobotl.model.OzobotProgram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getOzobot_Programs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OzobotProgram> getPrograms();

	/**
	 * Returns the value of the '<em><b>Xposition</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xposition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xposition</em>' attribute.
	 * @see #setXposition(double)
	 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getOzobot_Xposition()
	 * @model default="0"
	 * @generated
	 */
	double getXposition();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotl.model.Ozobot#getXposition <em>Xposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xposition</em>' attribute.
	 * @see #getXposition()
	 * @generated
	 */
	void setXposition(double value);

	/**
	 * Returns the value of the '<em><b>Yposition</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yposition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yposition</em>' attribute.
	 * @see #setYposition(double)
	 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getOzobot_Yposition()
	 * @model default="0"
	 * @generated
	 */
	double getYposition();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotl.model.Ozobot#getYposition <em>Yposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yposition</em>' attribute.
	 * @see #getYposition()
	 * @generated
	 */
	void setYposition(double value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(double)
	 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getOzobot_Orientation()
	 * @model default="0"
	 * @generated
	 */
	double getOrientation();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotl.model.Ozobot#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(double value);

} // Ozobot
