/**
 */
package ContenuPedagogique;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Departement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.Departement#getNom <em>Nom</em>}</li>
 *   <li>{@link ContenuPedagogique.Departement#getEnseignants <em>Enseignants</em>}</li>
 *   <li>{@link ContenuPedagogique.Departement#getFormations <em>Formations</em>}</li>
 *   <li>{@link ContenuPedagogique.Departement#getDescription <em>Description</em>}</li>
 *   <li>{@link ContenuPedagogique.Departement#getDirige <em>Dirige</em>}</li>
 *   <li>{@link ContenuPedagogique.Departement#getTelDept <em>Tel Dept</em>}</li>
 *   <li>{@link ContenuPedagogique.Departement#getPOBoxDept <em>PO Box Dept</em>}</li>
 *   <li>{@link ContenuPedagogique.Departement#getAcces <em>Acces</em>}</li>
 * </ul>
 *
 * @see ContenuPedagogique.ContenuPedagogiquePackage#getDepartement()
 * @model
 * @generated
 */
public interface Departement extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getDepartement_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Departement#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Enseignants</b></em>' containment reference list.
	 * The list contents are of type {@link ContenuPedagogique.Enseignant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseignants</em>' containment reference list.
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getDepartement_Enseignants()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Enseignant> getEnseignants();

	/**
	 * Returns the value of the '<em><b>Formations</b></em>' containment reference list.
	 * The list contents are of type {@link ContenuPedagogique.Formation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formations</em>' containment reference list.
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getDepartement_Formations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Formation> getFormations();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getDepartement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Departement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Dirige</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ContenuPedagogique.Enseignant#getChef <em>Chef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dirige</em>' reference.
	 * @see #setDirige(Enseignant)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getDepartement_Dirige()
	 * @see ContenuPedagogique.Enseignant#getChef
	 * @model opposite="chef" required="true"
	 * @generated
	 */
	Enseignant getDirige();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Departement#getDirige <em>Dirige</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dirige</em>' reference.
	 * @see #getDirige()
	 * @generated
	 */
	void setDirige(Enseignant value);

	/**
	 * Returns the value of the '<em><b>Tel Dept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tel Dept</em>' attribute.
	 * @see #setTelDept(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getDepartement_TelDept()
	 * @model
	 * @generated
	 */
	String getTelDept();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Departement#getTelDept <em>Tel Dept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tel Dept</em>' attribute.
	 * @see #getTelDept()
	 * @generated
	 */
	void setTelDept(String value);

	/**
	 * Returns the value of the '<em><b>PO Box Dept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PO Box Dept</em>' attribute.
	 * @see #setPOBoxDept(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getDepartement_POBoxDept()
	 * @model
	 * @generated
	 */
	String getPOBoxDept();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Departement#getPOBoxDept <em>PO Box Dept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PO Box Dept</em>' attribute.
	 * @see #getPOBoxDept()
	 * @generated
	 */
	void setPOBoxDept(String value);

	/**
	 * Returns the value of the '<em><b>Acces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acces</em>' attribute.
	 * @see #setAcces(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getDepartement_Acces()
	 * @model
	 * @generated
	 */
	String getAcces();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Departement#getAcces <em>Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acces</em>' attribute.
	 * @see #getAcces()
	 * @generated
	 */
	void setAcces(String value);

} // Departement
