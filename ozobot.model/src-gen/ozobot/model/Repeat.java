/**
 */
package ozobot.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ozobot.model.Repeat#getCount <em>Count</em>}</li>
 *   <li>{@link ozobot.model.Repeat#getBlock <em>Block</em>}</li>
 *   <li>{@link ozobot.model.Repeat#getLoopCounter <em>Loop Counter</em>}</li>
 * </ul>
 *
 * @see ozobot.model.ModelPackage#getRepeat()
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
	 * @see ozobot.model.ModelPackage#getRepeat_Count()
	 * @model default="0"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link ozobot.model.Repeat#getCount <em>Count</em>}' attribute.
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
	 * @see ozobot.model.ModelPackage#getRepeat_Block()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link ozobot.model.Repeat#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Loop Counter</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Counter</em>' attribute.
	 * @see #setLoopCounter(int)
	 * @see ozobot.model.ModelPackage#getRepeat_LoopCounter()
	 * @model default="0"
	 * @generated
	 */
	int getLoopCounter();

	/**
	 * Sets the value of the '{@link ozobot.model.Repeat#getLoopCounter <em>Loop Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Counter</em>' attribute.
	 * @see #getLoopCounter()
	 * @generated
	 */
	void setLoopCounter(int value);

} // Repeat
