/**
 */
package ozobot.xdsml.ozobotl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ozobot Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozobot.xdsml.ozobotl.model.OzobotProgram#getBlock <em>Block</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotl.model.OzobotProgram#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getOzobotProgram()
 * @model
 * @generated
 */
public interface OzobotProgram extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getOzobotProgram_Block()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotl.model.OzobotProgram#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' reference.
	 * @see #setCurrent(Command)
	 * @see ozobot.xdsml.ozobotl.model.ModelPackage#getOzobotProgram_Current()
	 * @model required="true"
	 * @generated
	 */
	Command getCurrent();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotl.model.OzobotProgram#getCurrent <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' reference.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(Command value);

} // OzobotProgram
