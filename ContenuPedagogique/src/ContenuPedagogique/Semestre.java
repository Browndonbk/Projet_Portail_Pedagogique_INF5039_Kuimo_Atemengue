/**
 */
package ContenuPedagogique;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.Semestre#getNom <em>Nom</em>}</li>
 *   <li>{@link ContenuPedagogique.Semestre#getUes <em>Ues</em>}</li>
 * </ul>
 *
 * @see ContenuPedagogique.ContenuPedagogiquePackage#getSemestre()
 * @model
 * @generated
 */
public interface Semestre extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getSemestre_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Semestre#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Ues</b></em>' reference list.
	 * The list contents are of type {@link ContenuPedagogique.Ue}.
	 * It is bidirectional and its opposite is '{@link ContenuPedagogique.Ue#getSemestres <em>Semestres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ues</em>' reference list.
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getSemestre_Ues()
	 * @see ContenuPedagogique.Ue#getSemestres
	 * @model opposite="semestres" required="true"
	 * @generated
	 */
	EList<Ue> getUes();

} // Semestre
