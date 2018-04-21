/**
 */
package ozobot.model;

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
 *   <li>{@link ozobot.model.Ozobot#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @see ozobot.model.ModelPackage#getOzobot()
 * @model
 * @generated
 */
public interface Ozobot extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link ozobot.model.OzobotProgram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see ozobot.model.ModelPackage#getOzobot_Programs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OzobotProgram> getPrograms();

} // Ozobot
