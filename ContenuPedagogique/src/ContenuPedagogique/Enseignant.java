/**
 */
package ContenuPedagogique;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enseignant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.Enseignant#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link ContenuPedagogique.Enseignant#getNom <em>Nom</em>}</li>
 *   <li>{@link ContenuPedagogique.Enseignant#getEnseigne <em>Enseigne</em>}</li>
 *   <li>{@link ContenuPedagogique.Enseignant#getChef <em>Chef</em>}</li>
 *   <li>{@link ContenuPedagogique.Enseignant#getEmail <em>Email</em>}</li>
 *   <li>{@link ContenuPedagogique.Enseignant#getBureau <em>Bureau</em>}</li>
 *   <li>{@link ContenuPedagogique.Enseignant#getGrade <em>Grade</em>}</li>
 * </ul>
 *
 * @see ContenuPedagogique.ContenuPedagogiquePackage#getEnseignant()
 * @model
 * @generated
 */
public interface Enseignant extends EObject {
	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ContenuPedagogique.Niveau#getResponsablite <em>Responsablite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference.
	 * @see #setResponsable(Niveau)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getEnseignant_Responsable()
	 * @see ContenuPedagogique.Niveau#getResponsablite
	 * @model opposite="responsablite"
	 * @generated
	 */
	Niveau getResponsable();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Enseignant#getResponsable <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' reference.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(Niveau value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getEnseignant_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Enseignant#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Enseigne</b></em>' reference list.
	 * The list contents are of type {@link ContenuPedagogique.Ue}.
	 * It is bidirectional and its opposite is '{@link ContenuPedagogique.Ue#getEstEnseigne <em>Est Enseigne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseigne</em>' reference list.
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getEnseignant_Enseigne()
	 * @see ContenuPedagogique.Ue#getEstEnseigne
	 * @model opposite="EstEnseigne"
	 * @generated
	 */
	EList<Ue> getEnseigne();

	/**
	 * Returns the value of the '<em><b>Chef</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ContenuPedagogique.Departement#getDirige <em>Dirige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chef</em>' reference.
	 * @see #setChef(Departement)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getEnseignant_Chef()
	 * @see ContenuPedagogique.Departement#getDirige
	 * @model opposite="dirige"
	 * @generated
	 */
	Departement getChef();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Enseignant#getChef <em>Chef</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chef</em>' reference.
	 * @see #getChef()
	 * @generated
	 */
	void setChef(Departement value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getEnseignant_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Enseignant#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Bureau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bureau</em>' attribute.
	 * @see #setBureau(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getEnseignant_Bureau()
	 * @model
	 * @generated
	 */
	String getBureau();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Enseignant#getBureau <em>Bureau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bureau</em>' attribute.
	 * @see #getBureau()
	 * @generated
	 */
	void setBureau(String value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * The literals are from the enumeration {@link ContenuPedagogique.TypeGRADE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see ContenuPedagogique.TypeGRADE
	 * @see #setGrade(TypeGRADE)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getEnseignant_Grade()
	 * @model
	 * @generated
	 */
	TypeGRADE getGrade();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Enseignant#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see ContenuPedagogique.TypeGRADE
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(TypeGRADE value);

} // Enseignant
