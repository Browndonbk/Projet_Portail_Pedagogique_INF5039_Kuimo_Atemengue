/**
 */
package ContenuPedagogique;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Niveau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.Niveau#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link ContenuPedagogique.Niveau#getDescription <em>Description</em>}</li>
 *   <li>{@link ContenuPedagogique.Niveau#getResponsablite <em>Responsablite</em>}</li>
 *   <li>{@link ContenuPedagogique.Niveau#getUes <em>Ues</em>}</li>
 *   <li>{@link ContenuPedagogique.Niveau#getSpecialites <em>Specialites</em>}</li>
 *   <li>{@link ContenuPedagogique.Niveau#getSemestres <em>Semestres</em>}</li>
 *   <li>{@link ContenuPedagogique.Niveau#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see ContenuPedagogique.ContenuPedagogiquePackage#getNiveau()
 * @model
 * @generated
 */
public interface Niveau extends EObject {
	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see #setNiveau(int)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getNiveau_Niveau()
	 * @model
	 * @generated
	 */
	int getNiveau();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Niveau#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getNiveau_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Niveau#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Responsablite</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ContenuPedagogique.Enseignant#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsablite</em>' reference.
	 * @see #setResponsablite(Enseignant)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getNiveau_Responsablite()
	 * @see ContenuPedagogique.Enseignant#getResponsable
	 * @model opposite="responsable" required="true" ordered="false"
	 * @generated
	 */
	Enseignant getResponsablite();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Niveau#getResponsablite <em>Responsablite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsablite</em>' reference.
	 * @see #getResponsablite()
	 * @generated
	 */
	void setResponsablite(Enseignant value);

	/**
	 * Returns the value of the '<em><b>Ues</b></em>' containment reference list.
	 * The list contents are of type {@link ContenuPedagogique.Ue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ues</em>' containment reference list.
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getNiveau_Ues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Ue> getUes();

	/**
	 * Returns the value of the '<em><b>Specialites</b></em>' containment reference list.
	 * The list contents are of type {@link ContenuPedagogique.Specialite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialites</em>' containment reference list.
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getNiveau_Specialites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialite> getSpecialites();

	/**
	 * Returns the value of the '<em><b>Semestres</b></em>' containment reference list.
	 * The list contents are of type {@link ContenuPedagogique.Semestre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semestres</em>' containment reference list.
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getNiveau_Semestres()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semestre> getSemestres();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getNiveau_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Niveau#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Niveau
