/**
 */
package ContenuPedagogique;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ContenuPedagogique.ContenuPedagogiquePackage
 * @generated
 */
public interface ContenuPedagogiqueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenuPedagogiqueFactory eINSTANCE = ContenuPedagogique.impl.ContenuPedagogiqueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Departement</em>'.
	 * @generated
	 */
	Departement createDepartement();

	/**
	 * Returns a new object of class '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Niveau</em>'.
	 * @generated
	 */
	Niveau createNiveau();

	/**
	 * Returns a new object of class '<em>Specialite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialite</em>'.
	 * @generated
	 */
	Specialite createSpecialite();

	/**
	 * Returns a new object of class '<em>Ue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ue</em>'.
	 * @generated
	 */
	Ue createUe();

	/**
	 * Returns a new object of class '<em>Enseignant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enseignant</em>'.
	 * @generated
	 */
	Enseignant createEnseignant();

	/**
	 * Returns a new object of class '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ressource</em>'.
	 * @generated
	 */
	Ressource createRessource();

	/**
	 * Returns a new object of class '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semestre</em>'.
	 * @generated
	 */
	Semestre createSemestre();

	/**
	 * Returns a new object of class '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formation</em>'.
	 * @generated
	 */
	Formation createFormation();

	/**
	 * Returns a new object of class '<em>Programmation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programmation</em>'.
	 * @generated
	 */
	Programmation createProgrammation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContenuPedagogiquePackage getContenuPedagogiquePackage();

} //ContenuPedagogiqueFactory
