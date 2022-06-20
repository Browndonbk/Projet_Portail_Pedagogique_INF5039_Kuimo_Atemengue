/**
 */
package ContenuPedagogique;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UeLieSemMemeNiv'"
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
	 * @model required="true"
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
	 * @model opposite="responsable" required="true"
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
	 * @model containment="true" upper="2"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='specialites-&gt;size()=0 implies self.ues -&gt; forAll(ue | ue.semestres-&gt;size()=1)'"
	 * @generated
	 */
	boolean PasSpeUe1Sem(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif specialites-&gt;size()=0 then\n\t\t\t\t  self.semestres.ues -&gt; forAll(ue | self.ues -&gt; includes(ue))\n\t\t\telse \n\t\t\t\tself.specialites.semestres.ues -&gt; forAll(ue | self.ues -&gt; includes(ue)) \n\t\t\tendif'"
	 * @generated
	 */
	boolean SemLieUeMemeNiv(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.ues -&gt; forAll( ue |\n\t\t\t\t\tue.type=TypeUE::Specialisee implies\n\t\t\t\t\t\tue.semestres -&gt; forAll(sem | self.specialites.semestres -&gt; includes(sem))\n\t\t\t\t)'"
	 * @generated
	 */
	boolean UeSpeLieSemSpeNiv(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='semestres-&gt;size()&gt;0 implies specialites-&gt;size()=0'"
	 * @generated
	 */
	boolean SiSemPasSpe(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='specialites-&gt;oclIsUndefined() and semestres-&gt;oclIsUndefined()=false implies semestres-&gt;size()=2'"
	 * @generated
	 */
	boolean SiSemAlors2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='specialites-&gt;size()&gt;0 implies self.ues -&gt; forAll(ue | \n\t\t\tue.type=TypeUE::Fondamentale implies\n\t\t\t\tself.specialites -&gt; forAll(spe |\n\t\t\t\t\tspe.semestres -&gt; one(sem | sem.ues -&gt; includes(ue))\n\t\t\t\t)\n\t\t\t)'"
	 * @generated
	 */
	boolean SiSpeUeFon1SemPSpe(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='specialites-&gt;size()&gt;0 implies semestres-&gt;size()=0'"
	 * @generated
	 */
	boolean SiSpePasSem(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Niveau.allInstances() -&gt; forAll(n1, n2 | n1 &lt;&gt; n2 implies n1.nom &lt;&gt; n2.nom)'"
	 * @generated
	 */
	boolean NivNomDiff(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif specialites-&gt;size()=0 then\n\t\t\t\tself.ues -&gt; forAll( ue |\n\t\t\t\t\tue.semestres -&gt; forAll(sem | self.semestres -&gt; includes(sem))\n\t\t\t\t)\n\t\t\telse \n\t\t\t\tself.ues -&gt; forAll( ue |\n\t\t\t\t\tue.semestres -&gt; forAll(sem | self.specialites.semestres -&gt; includes(sem))\n\t\t\t\t) \n\t\t\tendif'"
	 * @generated
	 */
	boolean UeLieSemMemeNiv(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Niveau
