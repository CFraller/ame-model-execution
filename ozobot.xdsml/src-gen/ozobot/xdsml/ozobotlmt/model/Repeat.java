/**
 */
package ozobot.xdsml.ozobotlmt.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozobot.xdsml.ozobotlmt.model.Repeat#getCount <em>Count</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotlmt.model.Repeat#getBlock <em>Block</em>}</li>
 *   <li>{@link ozobot.xdsml.ozobotlmt.model.Repeat#getRuntimeCounter <em>Runtime Counter</em>}</li>
 * </ul>
 *
 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getRepeat()
 * @model
 * @generated
 */
public interface Repeat extends Command {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getRepeat_Count()
	 * @model default="0"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotlmt.model.Repeat#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

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
	 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getRepeat_Block()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotlmt.model.Repeat#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

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
	 * @see ozobot.xdsml.ozobotlmt.model.ModelPackage#getRepeat_RuntimeCounter()
	 * @model unique="false"
	 * @generated
	 */
	int getRuntimeCounter();

	/**
	 * Sets the value of the '{@link ozobot.xdsml.ozobotlmt.model.Repeat#getRuntimeCounter <em>Runtime Counter</em>}' attribute.
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

} // Repeat
