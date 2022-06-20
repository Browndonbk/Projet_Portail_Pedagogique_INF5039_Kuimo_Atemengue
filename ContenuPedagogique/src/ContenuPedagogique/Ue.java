/**
 */
package ContenuPedagogique;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.Ue#getCode <em>Code</em>}</li>
 *   <li>{@link ContenuPedagogique.Ue#getNom <em>Nom</em>}</li>
 *   <li>{@link ContenuPedagogique.Ue#getObjectif <em>Objectif</em>}</li>
 *   <li>{@link ContenuPedagogique.Ue#getType <em>Type</em>}</li>
 *   <li>{@link ContenuPedagogique.Ue#getRessources <em>Ressources</em>}</li>
 *   <li>{@link ContenuPedagogique.Ue#getSemestres <em>Semestres</em>}</li>
 *   <li>{@link ContenuPedagogique.Ue#getEstEnseigne <em>Est Enseigne</em>}</li>
 *   <li>{@link ContenuPedagogique.Ue#getContenu <em>Contenu</em>}</li>
 *   <li>{@link ContenuPedagogique.Ue#getCredit <em>Credit</em>}</li>
 *   <li>{@link ContenuPedagogique.Ue#getProgrammations <em>Programmations</em>}</li>
 * </ul>
 *
 * @see ContenuPedagogique.ContenuPedagogiquePackage#getUe()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UeCodeDiff'"
 * @generated
 */
public interface Ue extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getUe_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Ue#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getUe_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Ue#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Objectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectif</em>' attribute.
	 * @see #setObjectif(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getUe_Objectif()
	 * @model
	 * @generated
	 */
	String getObjectif();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Ue#getObjectif <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectif</em>' attribute.
	 * @see #getObjectif()
	 * @generated
	 */
	void setObjectif(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ContenuPedagogique.TypeUE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ContenuPedagogique.TypeUE
	 * @see #setType(TypeUE)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getUe_Type()
	 * @model
	 * @generated
	 */
	TypeUE getType();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Ue#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ContenuPedagogique.TypeUE
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeUE value);

	/**
	 * Returns the value of the '<em><b>Ressources</b></em>' containment reference list.
	 * The list contents are of type {@link ContenuPedagogique.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressources</em>' containment reference list.
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getUe_Ressources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ressource> getRessources();

	/**
	 * Returns the value of the '<em><b>Semestres</b></em>' reference list.
	 * The list contents are of type {@link ContenuPedagogique.Semestre}.
	 * It is bidirectional and its opposite is '{@link ContenuPedagogique.Semestre#getUes <em>Ues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semestres</em>' reference list.
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getUe_Semestres()
	 * @see ContenuPedagogique.Semestre#getUes
	 * @model opposite="ues" required="true"
	 * @generated
	 */
	EList<Semestre> getSemestres();

	/**
	 * Returns the value of the '<em><b>Est Enseigne</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ContenuPedagogique.Enseignant#getEnseigne <em>Enseigne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Enseigne</em>' reference.
	 * @see #setEstEnseigne(Enseignant)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getUe_EstEnseigne()
	 * @see ContenuPedagogique.Enseignant#getEnseigne
	 * @model opposite="enseigne" required="true"
	 * @generated
	 */
	Enseignant getEstEnseigne();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Ue#getEstEnseigne <em>Est Enseigne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Enseigne</em>' reference.
	 * @see #getEstEnseigne()
	 * @generated
	 */
	void setEstEnseigne(Enseignant value);

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' attribute.
	 * @see #setContenu(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getUe_Contenu()
	 * @model
	 * @generated
	 */
	String getContenu();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Ue#getContenu <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' attribute.
	 * @see #getContenu()
	 * @generated
	 */
	void setContenu(String value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(int)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getUe_Credit()
	 * @model required="true"
	 * @generated
	 */
	int getCredit();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Ue#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(int value);

	/**
	 * Returns the value of the '<em><b>Programmations</b></em>' containment reference list.
	 * The list contents are of type {@link ContenuPedagogique.Programmation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmations</em>' containment reference list.
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getUe_Programmations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programmation> getProgrammations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.type=TypeUE::Specialisee implies self.semestres-&gt;size()=1'"
	 * @generated
	 */
	boolean UeSpe1Sem(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Ue.allInstances() -&gt; forAll(ue1, ue2 | ue1 &lt;&gt; ue2 implies ue1.code &lt;&gt; ue2.code)'"
	 * @generated
	 */
	boolean UeCodeDiff(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Ue
