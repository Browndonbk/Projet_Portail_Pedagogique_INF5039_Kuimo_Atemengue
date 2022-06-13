/**
 */
package ContenuPedagogique;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.Formation#getNiveaux <em>Niveaux</em>}</li>
 *   <li>{@link ContenuPedagogique.Formation#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see ContenuPedagogique.ContenuPedagogiquePackage#getFormation()
 * @model
 * @generated
 */
public interface Formation extends EObject {
	/**
	 * Returns the value of the '<em><b>Niveaux</b></em>' containment reference list.
	 * The list contents are of type {@link ContenuPedagogique.Niveau}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveaux</em>' containment reference list.
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getFormation_Niveaux()
	 * @model containment="true"
	 * @generated
	 */
	EList<Niveau> getNiveaux();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getFormation_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Formation#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Formation
