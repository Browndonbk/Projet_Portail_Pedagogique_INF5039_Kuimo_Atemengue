/**
 */
package ContenuPedagogique;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ContenuPedagogique.ContenuPedagogiqueFactory
 * @model kind="package"
 * @generated
 */
public interface ContenuPedagogiquePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ContenuPedagogique";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ContenuPedagogique.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ContenuPedagogique";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenuPedagogiquePackage eINSTANCE = ContenuPedagogique.impl.ContenuPedagogiquePackageImpl.init();

	/**
	 * The meta object id for the '{@link ContenuPedagogique.impl.DepartementImpl <em>Departement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ContenuPedagogique.impl.DepartementImpl
	 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getDepartement()
	 * @generated
	 */
	int DEPARTEMENT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Enseignants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__ENSEIGNANTS = 1;

	/**
	 * The feature id for the '<em><b>Formations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__FORMATIONS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Dirige</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__DIRIGE = 4;

	/**
	 * The feature id for the '<em><b>Tel Dept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__TEL_DEPT = 5;

	/**
	 * The feature id for the '<em><b>PO Box Dept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__PO_BOX_DEPT = 6;

	/**
	 * The feature id for the '<em><b>Acces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__ACCES = 7;

	/**
	 * The number of structural features of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ContenuPedagogique.impl.NiveauImpl <em>Niveau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ContenuPedagogique.impl.NiveauImpl
	 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getNiveau()
	 * @generated
	 */
	int NIVEAU = 1;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__NIVEAU = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Responsablite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__RESPONSABLITE = 2;

	/**
	 * The feature id for the '<em><b>Ues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__UES = 3;

	/**
	 * The feature id for the '<em><b>Specialites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__SPECIALITES = 4;

	/**
	 * The feature id for the '<em><b>Semestres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__SEMESTRES = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__NOM = 6;

	/**
	 * The number of structural features of the '<em>Niveau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Niveau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ContenuPedagogique.impl.SpecialiteImpl <em>Specialite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ContenuPedagogique.impl.SpecialiteImpl
	 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getSpecialite()
	 * @generated
	 */
	int SPECIALITE = 2;

	/**
	 * The feature id for the '<em><b>Semestres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE__SEMESTRES = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Specialite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Specialite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ContenuPedagogique.impl.UeImpl <em>Ue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ContenuPedagogique.impl.UeImpl
	 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getUe()
	 * @generated
	 */
	int UE = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Objectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__OBJECTIF = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Ressources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__RESSOURCES = 4;

	/**
	 * The feature id for the '<em><b>Semestres</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__SEMESTRES = 5;

	/**
	 * The feature id for the '<em><b>Est Enseigne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__EST_ENSEIGNE = 6;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__CONTENU = 7;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__CREDIT = 8;

	/**
	 * The feature id for the '<em><b>Programmations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__PROGRAMMATIONS = 9;

	/**
	 * The number of structural features of the '<em>Ue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Ue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ContenuPedagogique.impl.EnseignantImpl <em>Enseignant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ContenuPedagogique.impl.EnseignantImpl
	 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getEnseignant()
	 * @generated
	 */
	int ENSEIGNANT = 4;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__RESPONSABLE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__NOM = 1;

	/**
	 * The feature id for the '<em><b>Enseigne</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__ENSEIGNE = 2;

	/**
	 * The feature id for the '<em><b>Chef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__CHEF = 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__EMAIL = 4;

	/**
	 * The feature id for the '<em><b>Bureau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__BUREAU = 5;

	/**
	 * The number of structural features of the '<em>Enseignant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Enseignant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ContenuPedagogique.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ContenuPedagogique.impl.RessourceImpl
	 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__LIEN = 1;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ContenuPedagogique.impl.SemestreImpl <em>Semestre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ContenuPedagogique.impl.SemestreImpl
	 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getSemestre()
	 * @generated
	 */
	int SEMESTRE = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Ues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__UES = 1;

	/**
	 * The number of structural features of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ContenuPedagogique.impl.FormationImpl <em>Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ContenuPedagogique.impl.FormationImpl
	 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getFormation()
	 * @generated
	 */
	int FORMATION = 7;

	/**
	 * The feature id for the '<em><b>Niveaux</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NIVEAUX = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NOM = 1;

	/**
	 * The number of structural features of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ContenuPedagogique.impl.ProgrammationImpl <em>Programmation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ContenuPedagogique.impl.ProgrammationImpl
	 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getProgrammation()
	 * @generated
	 */
	int PROGRAMMATION = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Jour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION__JOUR = 1;

	/**
	 * The feature id for the '<em><b>Heure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION__HEURE = 2;

	/**
	 * The feature id for the '<em><b>Salle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION__SALLE = 3;

	/**
	 * The number of structural features of the '<em>Programmation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Programmation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ContenuPedagogique.TypeUE <em>Type UE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ContenuPedagogique.TypeUE
	 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getTypeUE()
	 * @generated
	 */
	int TYPE_UE = 9;

	/**
	 * The meta object id for the '{@link ContenuPedagogique.TypePROGR <em>Type PROGR</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ContenuPedagogique.TypePROGR
	 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getTypePROGR()
	 * @generated
	 */
	int TYPE_PROGR = 10;


	/**
	 * Returns the meta object for class '{@link ContenuPedagogique.Departement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departement</em>'.
	 * @see ContenuPedagogique.Departement
	 * @generated
	 */
	EClass getDepartement();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Departement#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see ContenuPedagogique.Departement#getNom()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link ContenuPedagogique.Departement#getEnseignants <em>Enseignants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enseignants</em>'.
	 * @see ContenuPedagogique.Departement#getEnseignants()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Enseignants();

	/**
	 * Returns the meta object for the containment reference list '{@link ContenuPedagogique.Departement#getFormations <em>Formations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formations</em>'.
	 * @see ContenuPedagogique.Departement#getFormations()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Formations();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Departement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ContenuPedagogique.Departement#getDescription()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_Description();

	/**
	 * Returns the meta object for the reference '{@link ContenuPedagogique.Departement#getDirige <em>Dirige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dirige</em>'.
	 * @see ContenuPedagogique.Departement#getDirige()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Dirige();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Departement#getTelDept <em>Tel Dept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tel Dept</em>'.
	 * @see ContenuPedagogique.Departement#getTelDept()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_TelDept();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Departement#getPOBoxDept <em>PO Box Dept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PO Box Dept</em>'.
	 * @see ContenuPedagogique.Departement#getPOBoxDept()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_POBoxDept();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Departement#getAcces <em>Acces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acces</em>'.
	 * @see ContenuPedagogique.Departement#getAcces()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_Acces();

	/**
	 * Returns the meta object for class '{@link ContenuPedagogique.Niveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Niveau</em>'.
	 * @see ContenuPedagogique.Niveau
	 * @generated
	 */
	EClass getNiveau();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Niveau#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Niveau</em>'.
	 * @see ContenuPedagogique.Niveau#getNiveau()
	 * @see #getNiveau()
	 * @generated
	 */
	EAttribute getNiveau_Niveau();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Niveau#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ContenuPedagogique.Niveau#getDescription()
	 * @see #getNiveau()
	 * @generated
	 */
	EAttribute getNiveau_Description();

	/**
	 * Returns the meta object for the reference '{@link ContenuPedagogique.Niveau#getResponsablite <em>Responsablite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsablite</em>'.
	 * @see ContenuPedagogique.Niveau#getResponsablite()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Responsablite();

	/**
	 * Returns the meta object for the containment reference list '{@link ContenuPedagogique.Niveau#getUes <em>Ues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ues</em>'.
	 * @see ContenuPedagogique.Niveau#getUes()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Ues();

	/**
	 * Returns the meta object for the containment reference list '{@link ContenuPedagogique.Niveau#getSpecialites <em>Specialites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialites</em>'.
	 * @see ContenuPedagogique.Niveau#getSpecialites()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Specialites();

	/**
	 * Returns the meta object for the containment reference list '{@link ContenuPedagogique.Niveau#getSemestres <em>Semestres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semestres</em>'.
	 * @see ContenuPedagogique.Niveau#getSemestres()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Semestres();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Niveau#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see ContenuPedagogique.Niveau#getNom()
	 * @see #getNiveau()
	 * @generated
	 */
	EAttribute getNiveau_Nom();

	/**
	 * Returns the meta object for class '{@link ContenuPedagogique.Specialite <em>Specialite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialite</em>'.
	 * @see ContenuPedagogique.Specialite
	 * @generated
	 */
	EClass getSpecialite();

	/**
	 * Returns the meta object for the containment reference list '{@link ContenuPedagogique.Specialite#getSemestres <em>Semestres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semestres</em>'.
	 * @see ContenuPedagogique.Specialite#getSemestres()
	 * @see #getSpecialite()
	 * @generated
	 */
	EReference getSpecialite_Semestres();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Specialite#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see ContenuPedagogique.Specialite#getNom()
	 * @see #getSpecialite()
	 * @generated
	 */
	EAttribute getSpecialite_Nom();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Specialite#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ContenuPedagogique.Specialite#getDescription()
	 * @see #getSpecialite()
	 * @generated
	 */
	EAttribute getSpecialite_Description();

	/**
	 * Returns the meta object for class '{@link ContenuPedagogique.Ue <em>Ue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ue</em>'.
	 * @see ContenuPedagogique.Ue
	 * @generated
	 */
	EClass getUe();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Ue#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see ContenuPedagogique.Ue#getCode()
	 * @see #getUe()
	 * @generated
	 */
	EAttribute getUe_Code();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Ue#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see ContenuPedagogique.Ue#getNom()
	 * @see #getUe()
	 * @generated
	 */
	EAttribute getUe_Nom();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Ue#getObjectif <em>Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objectif</em>'.
	 * @see ContenuPedagogique.Ue#getObjectif()
	 * @see #getUe()
	 * @generated
	 */
	EAttribute getUe_Objectif();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Ue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ContenuPedagogique.Ue#getType()
	 * @see #getUe()
	 * @generated
	 */
	EAttribute getUe_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link ContenuPedagogique.Ue#getRessources <em>Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ressources</em>'.
	 * @see ContenuPedagogique.Ue#getRessources()
	 * @see #getUe()
	 * @generated
	 */
	EReference getUe_Ressources();

	/**
	 * Returns the meta object for the reference list '{@link ContenuPedagogique.Ue#getSemestres <em>Semestres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semestres</em>'.
	 * @see ContenuPedagogique.Ue#getSemestres()
	 * @see #getUe()
	 * @generated
	 */
	EReference getUe_Semestres();

	/**
	 * Returns the meta object for the reference '{@link ContenuPedagogique.Ue#getEstEnseigne <em>Est Enseigne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Est Enseigne</em>'.
	 * @see ContenuPedagogique.Ue#getEstEnseigne()
	 * @see #getUe()
	 * @generated
	 */
	EReference getUe_EstEnseigne();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Ue#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenu</em>'.
	 * @see ContenuPedagogique.Ue#getContenu()
	 * @see #getUe()
	 * @generated
	 */
	EAttribute getUe_Contenu();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Ue#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit</em>'.
	 * @see ContenuPedagogique.Ue#getCredit()
	 * @see #getUe()
	 * @generated
	 */
	EAttribute getUe_Credit();

	/**
	 * Returns the meta object for the containment reference list '{@link ContenuPedagogique.Ue#getProgrammations <em>Programmations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmations</em>'.
	 * @see ContenuPedagogique.Ue#getProgrammations()
	 * @see #getUe()
	 * @generated
	 */
	EReference getUe_Programmations();

	/**
	 * Returns the meta object for class '{@link ContenuPedagogique.Enseignant <em>Enseignant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enseignant</em>'.
	 * @see ContenuPedagogique.Enseignant
	 * @generated
	 */
	EClass getEnseignant();

	/**
	 * Returns the meta object for the reference '{@link ContenuPedagogique.Enseignant#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable</em>'.
	 * @see ContenuPedagogique.Enseignant#getResponsable()
	 * @see #getEnseignant()
	 * @generated
	 */
	EReference getEnseignant_Responsable();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Enseignant#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see ContenuPedagogique.Enseignant#getNom()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Nom();

	/**
	 * Returns the meta object for the reference list '{@link ContenuPedagogique.Enseignant#getEnseigne <em>Enseigne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enseigne</em>'.
	 * @see ContenuPedagogique.Enseignant#getEnseigne()
	 * @see #getEnseignant()
	 * @generated
	 */
	EReference getEnseignant_Enseigne();

	/**
	 * Returns the meta object for the reference '{@link ContenuPedagogique.Enseignant#getChef <em>Chef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chef</em>'.
	 * @see ContenuPedagogique.Enseignant#getChef()
	 * @see #getEnseignant()
	 * @generated
	 */
	EReference getEnseignant_Chef();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Enseignant#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see ContenuPedagogique.Enseignant#getEmail()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Email();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Enseignant#getBureau <em>Bureau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bureau</em>'.
	 * @see ContenuPedagogique.Enseignant#getBureau()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Bureau();

	/**
	 * Returns the meta object for class '{@link ContenuPedagogique.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see ContenuPedagogique.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Ressource#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see ContenuPedagogique.Ressource#getNom()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Nom();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Ressource#getLien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lien</em>'.
	 * @see ContenuPedagogique.Ressource#getLien()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Lien();

	/**
	 * Returns the meta object for class '{@link ContenuPedagogique.Semestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semestre</em>'.
	 * @see ContenuPedagogique.Semestre
	 * @generated
	 */
	EClass getSemestre();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Semestre#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see ContenuPedagogique.Semestre#getNom()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_Nom();

	/**
	 * Returns the meta object for the reference list '{@link ContenuPedagogique.Semestre#getUes <em>Ues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ues</em>'.
	 * @see ContenuPedagogique.Semestre#getUes()
	 * @see #getSemestre()
	 * @generated
	 */
	EReference getSemestre_Ues();

	/**
	 * Returns the meta object for class '{@link ContenuPedagogique.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formation</em>'.
	 * @see ContenuPedagogique.Formation
	 * @generated
	 */
	EClass getFormation();

	/**
	 * Returns the meta object for the containment reference list '{@link ContenuPedagogique.Formation#getNiveaux <em>Niveaux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Niveaux</em>'.
	 * @see ContenuPedagogique.Formation#getNiveaux()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Niveaux();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Formation#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see ContenuPedagogique.Formation#getNom()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Nom();

	/**
	 * Returns the meta object for class '{@link ContenuPedagogique.Programmation <em>Programmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programmation</em>'.
	 * @see ContenuPedagogique.Programmation
	 * @generated
	 */
	EClass getProgrammation();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Programmation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ContenuPedagogique.Programmation#getType()
	 * @see #getProgrammation()
	 * @generated
	 */
	EAttribute getProgrammation_Type();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Programmation#getJour <em>Jour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jour</em>'.
	 * @see ContenuPedagogique.Programmation#getJour()
	 * @see #getProgrammation()
	 * @generated
	 */
	EAttribute getProgrammation_Jour();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Programmation#getHeure <em>Heure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure</em>'.
	 * @see ContenuPedagogique.Programmation#getHeure()
	 * @see #getProgrammation()
	 * @generated
	 */
	EAttribute getProgrammation_Heure();

	/**
	 * Returns the meta object for the attribute '{@link ContenuPedagogique.Programmation#getSalle <em>Salle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salle</em>'.
	 * @see ContenuPedagogique.Programmation#getSalle()
	 * @see #getProgrammation()
	 * @generated
	 */
	EAttribute getProgrammation_Salle();

	/**
	 * Returns the meta object for enum '{@link ContenuPedagogique.TypeUE <em>Type UE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type UE</em>'.
	 * @see ContenuPedagogique.TypeUE
	 * @generated
	 */
	EEnum getTypeUE();

	/**
	 * Returns the meta object for enum '{@link ContenuPedagogique.TypePROGR <em>Type PROGR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type PROGR</em>'.
	 * @see ContenuPedagogique.TypePROGR
	 * @generated
	 */
	EEnum getTypePROGR();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenuPedagogiqueFactory getContenuPedagogiqueFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ContenuPedagogique.impl.DepartementImpl <em>Departement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ContenuPedagogique.impl.DepartementImpl
		 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getDepartement()
		 * @generated
		 */
		EClass DEPARTEMENT = eINSTANCE.getDepartement();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__NOM = eINSTANCE.getDepartement_Nom();

		/**
		 * The meta object literal for the '<em><b>Enseignants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__ENSEIGNANTS = eINSTANCE.getDepartement_Enseignants();

		/**
		 * The meta object literal for the '<em><b>Formations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__FORMATIONS = eINSTANCE.getDepartement_Formations();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__DESCRIPTION = eINSTANCE.getDepartement_Description();

		/**
		 * The meta object literal for the '<em><b>Dirige</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__DIRIGE = eINSTANCE.getDepartement_Dirige();

		/**
		 * The meta object literal for the '<em><b>Tel Dept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__TEL_DEPT = eINSTANCE.getDepartement_TelDept();

		/**
		 * The meta object literal for the '<em><b>PO Box Dept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__PO_BOX_DEPT = eINSTANCE.getDepartement_POBoxDept();

		/**
		 * The meta object literal for the '<em><b>Acces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__ACCES = eINSTANCE.getDepartement_Acces();

		/**
		 * The meta object literal for the '{@link ContenuPedagogique.impl.NiveauImpl <em>Niveau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ContenuPedagogique.impl.NiveauImpl
		 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getNiveau()
		 * @generated
		 */
		EClass NIVEAU = eINSTANCE.getNiveau();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NIVEAU__NIVEAU = eINSTANCE.getNiveau_Niveau();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NIVEAU__DESCRIPTION = eINSTANCE.getNiveau_Description();

		/**
		 * The meta object literal for the '<em><b>Responsablite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__RESPONSABLITE = eINSTANCE.getNiveau_Responsablite();

		/**
		 * The meta object literal for the '<em><b>Ues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__UES = eINSTANCE.getNiveau_Ues();

		/**
		 * The meta object literal for the '<em><b>Specialites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__SPECIALITES = eINSTANCE.getNiveau_Specialites();

		/**
		 * The meta object literal for the '<em><b>Semestres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__SEMESTRES = eINSTANCE.getNiveau_Semestres();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NIVEAU__NOM = eINSTANCE.getNiveau_Nom();

		/**
		 * The meta object literal for the '{@link ContenuPedagogique.impl.SpecialiteImpl <em>Specialite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ContenuPedagogique.impl.SpecialiteImpl
		 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getSpecialite()
		 * @generated
		 */
		EClass SPECIALITE = eINSTANCE.getSpecialite();

		/**
		 * The meta object literal for the '<em><b>Semestres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALITE__SEMESTRES = eINSTANCE.getSpecialite_Semestres();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALITE__NOM = eINSTANCE.getSpecialite_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALITE__DESCRIPTION = eINSTANCE.getSpecialite_Description();

		/**
		 * The meta object literal for the '{@link ContenuPedagogique.impl.UeImpl <em>Ue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ContenuPedagogique.impl.UeImpl
		 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getUe()
		 * @generated
		 */
		EClass UE = eINSTANCE.getUe();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__CODE = eINSTANCE.getUe_Code();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__NOM = eINSTANCE.getUe_Nom();

		/**
		 * The meta object literal for the '<em><b>Objectif</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__OBJECTIF = eINSTANCE.getUe_Objectif();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__TYPE = eINSTANCE.getUe_Type();

		/**
		 * The meta object literal for the '<em><b>Ressources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__RESSOURCES = eINSTANCE.getUe_Ressources();

		/**
		 * The meta object literal for the '<em><b>Semestres</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__SEMESTRES = eINSTANCE.getUe_Semestres();

		/**
		 * The meta object literal for the '<em><b>Est Enseigne</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__EST_ENSEIGNE = eINSTANCE.getUe_EstEnseigne();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__CONTENU = eINSTANCE.getUe_Contenu();

		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__CREDIT = eINSTANCE.getUe_Credit();

		/**
		 * The meta object literal for the '<em><b>Programmations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__PROGRAMMATIONS = eINSTANCE.getUe_Programmations();

		/**
		 * The meta object literal for the '{@link ContenuPedagogique.impl.EnseignantImpl <em>Enseignant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ContenuPedagogique.impl.EnseignantImpl
		 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getEnseignant()
		 * @generated
		 */
		EClass ENSEIGNANT = eINSTANCE.getEnseignant();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSEIGNANT__RESPONSABLE = eINSTANCE.getEnseignant_Responsable();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__NOM = eINSTANCE.getEnseignant_Nom();

		/**
		 * The meta object literal for the '<em><b>Enseigne</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSEIGNANT__ENSEIGNE = eINSTANCE.getEnseignant_Enseigne();

		/**
		 * The meta object literal for the '<em><b>Chef</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSEIGNANT__CHEF = eINSTANCE.getEnseignant_Chef();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__EMAIL = eINSTANCE.getEnseignant_Email();

		/**
		 * The meta object literal for the '<em><b>Bureau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__BUREAU = eINSTANCE.getEnseignant_Bureau();

		/**
		 * The meta object literal for the '{@link ContenuPedagogique.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ContenuPedagogique.impl.RessourceImpl
		 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__NOM = eINSTANCE.getRessource_Nom();

		/**
		 * The meta object literal for the '<em><b>Lien</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__LIEN = eINSTANCE.getRessource_Lien();

		/**
		 * The meta object literal for the '{@link ContenuPedagogique.impl.SemestreImpl <em>Semestre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ContenuPedagogique.impl.SemestreImpl
		 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getSemestre()
		 * @generated
		 */
		EClass SEMESTRE = eINSTANCE.getSemestre();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__NOM = eINSTANCE.getSemestre_Nom();

		/**
		 * The meta object literal for the '<em><b>Ues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTRE__UES = eINSTANCE.getSemestre_Ues();

		/**
		 * The meta object literal for the '{@link ContenuPedagogique.impl.FormationImpl <em>Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ContenuPedagogique.impl.FormationImpl
		 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getFormation()
		 * @generated
		 */
		EClass FORMATION = eINSTANCE.getFormation();

		/**
		 * The meta object literal for the '<em><b>Niveaux</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__NIVEAUX = eINSTANCE.getFormation_Niveaux();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__NOM = eINSTANCE.getFormation_Nom();

		/**
		 * The meta object literal for the '{@link ContenuPedagogique.impl.ProgrammationImpl <em>Programmation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ContenuPedagogique.impl.ProgrammationImpl
		 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getProgrammation()
		 * @generated
		 */
		EClass PROGRAMMATION = eINSTANCE.getProgrammation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMATION__TYPE = eINSTANCE.getProgrammation_Type();

		/**
		 * The meta object literal for the '<em><b>Jour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMATION__JOUR = eINSTANCE.getProgrammation_Jour();

		/**
		 * The meta object literal for the '<em><b>Heure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMATION__HEURE = eINSTANCE.getProgrammation_Heure();

		/**
		 * The meta object literal for the '<em><b>Salle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMATION__SALLE = eINSTANCE.getProgrammation_Salle();

		/**
		 * The meta object literal for the '{@link ContenuPedagogique.TypeUE <em>Type UE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ContenuPedagogique.TypeUE
		 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getTypeUE()
		 * @generated
		 */
		EEnum TYPE_UE = eINSTANCE.getTypeUE();

		/**
		 * The meta object literal for the '{@link ContenuPedagogique.TypePROGR <em>Type PROGR</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ContenuPedagogique.TypePROGR
		 * @see ContenuPedagogique.impl.ContenuPedagogiquePackageImpl#getTypePROGR()
		 * @generated
		 */
		EEnum TYPE_PROGR = eINSTANCE.getTypePROGR();

	}

} //ContenuPedagogiquePackage
