/**
 */
package ContenuPedagogique;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.Ressource#getNom <em>Nom</em>}</li>
 *   <li>{@link ContenuPedagogique.Ressource#getLien <em>Lien</em>}</li>
 * </ul>
 *
 * @see ContenuPedagogique.ContenuPedagogiquePackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getRessource_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Ressource#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien</em>' attribute.
	 * @see #setLien(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getRessource_Lien()
	 * @model
	 * @generated
	 */
	String getLien();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Ressource#getLien <em>Lien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lien</em>' attribute.
	 * @see #getLien()
	 * @generated
	 */
	void setLien(String value);

} // Ressource
