/**
 */
package ContenuPedagogique;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FormNomDiff'"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Formation.allInstances() -&gt; forAll(p1, p2 | p1 &lt;&gt; p2 implies p1.nom &lt;&gt; p2.nom)'"
	 * @generated
	 */
	boolean FormNomDiff(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Formation
