/**
 */
package ContenuPedagogique.impl;

import ContenuPedagogique.ContenuPedagogiqueFactory;
import ContenuPedagogique.ContenuPedagogiquePackage;
import ContenuPedagogique.Departement;
import ContenuPedagogique.Enseignant;
import ContenuPedagogique.Formation;
import ContenuPedagogique.Niveau;
import ContenuPedagogique.Programmation;
import ContenuPedagogique.Ressource;
import ContenuPedagogique.Semestre;
import ContenuPedagogique.Specialite;
import ContenuPedagogique.TypePROGR;
import ContenuPedagogique.TypeUE;
import ContenuPedagogique.Ue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenuPedagogiquePackageImpl extends EPackageImpl implements ContenuPedagogiquePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass niveauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enseignantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semestreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeUEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typePROGREEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContenuPedagogiquePackageImpl() {
		super(eNS_URI, ContenuPedagogiqueFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ContenuPedagogiquePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContenuPedagogiquePackage init() {
		if (isInited) return (ContenuPedagogiquePackage)EPackage.Registry.INSTANCE.getEPackage(ContenuPedagogiquePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContenuPedagogiquePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContenuPedagogiquePackageImpl theContenuPedagogiquePackage = registeredContenuPedagogiquePackage instanceof ContenuPedagogiquePackageImpl ? (ContenuPedagogiquePackageImpl)registeredContenuPedagogiquePackage : new ContenuPedagogiquePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theContenuPedagogiquePackage.createPackageContents();

		// Initialize created meta-data
		theContenuPedagogiquePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContenuPedagogiquePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContenuPedagogiquePackage.eNS_URI, theContenuPedagogiquePackage);
		return theContenuPedagogiquePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartement() {
		return departementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartement_Nom() {
		return (EAttribute)departementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartement_Enseignants() {
		return (EReference)departementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartement_Formations() {
		return (EReference)departementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartement_Description() {
		return (EAttribute)departementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartement_Dirige() {
		return (EReference)departementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartement_TelDept() {
		return (EAttribute)departementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartement_POBoxDept() {
		return (EAttribute)departementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartement_Acces() {
		return (EAttribute)departementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNiveau() {
		return niveauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNiveau_Niveau() {
		return (EAttribute)niveauEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNiveau_Description() {
		return (EAttribute)niveauEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNiveau_Responsablite() {
		return (EReference)niveauEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNiveau_Ues() {
		return (EReference)niveauEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNiveau_Specialites() {
		return (EReference)niveauEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNiveau_Semestres() {
		return (EReference)niveauEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNiveau_Nom() {
		return (EAttribute)niveauEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialite() {
		return specialiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialite_Semestres() {
		return (EReference)specialiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialite_Nom() {
		return (EAttribute)specialiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialite_Description() {
		return (EAttribute)specialiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUe() {
		return ueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUe_Code() {
		return (EAttribute)ueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUe_Nom() {
		return (EAttribute)ueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUe_Objectif() {
		return (EAttribute)ueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUe_Type() {
		return (EAttribute)ueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUe_Ressources() {
		return (EReference)ueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUe_Semestres() {
		return (EReference)ueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUe_EstEnseigne() {
		return (EReference)ueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUe_Contenu() {
		return (EAttribute)ueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUe_Credit() {
		return (EAttribute)ueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUe_Programmations() {
		return (EReference)ueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnseignant() {
		return enseignantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnseignant_Responsable() {
		return (EReference)enseignantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Nom() {
		return (EAttribute)enseignantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnseignant_Enseigne() {
		return (EReference)enseignantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnseignant_Chef() {
		return (EReference)enseignantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Email() {
		return (EAttribute)enseignantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Bureau() {
		return (EAttribute)enseignantEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessource() {
		return ressourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessource_Nom() {
		return (EAttribute)ressourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessource_Lien() {
		return (EAttribute)ressourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemestre() {
		return semestreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemestre_Nom() {
		return (EAttribute)semestreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemestre_Ues() {
		return (EReference)semestreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormation() {
		return formationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_Niveaux() {
		return (EReference)formationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormation_Nom() {
		return (EAttribute)formationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgrammation() {
		return programmationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammation_Type() {
		return (EAttribute)programmationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammation_Jour() {
		return (EAttribute)programmationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammation_Heure() {
		return (EAttribute)programmationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammation_Salle() {
		return (EAttribute)programmationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeUE() {
		return typeUEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypePROGR() {
		return typePROGREEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenuPedagogiqueFactory getContenuPedagogiqueFactory() {
		return (ContenuPedagogiqueFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		departementEClass = createEClass(DEPARTEMENT);
		createEAttribute(departementEClass, DEPARTEMENT__NOM);
		createEReference(departementEClass, DEPARTEMENT__ENSEIGNANTS);
		createEReference(departementEClass, DEPARTEMENT__FORMATIONS);
		createEAttribute(departementEClass, DEPARTEMENT__DESCRIPTION);
		createEReference(departementEClass, DEPARTEMENT__DIRIGE);
		createEAttribute(departementEClass, DEPARTEMENT__TEL_DEPT);
		createEAttribute(departementEClass, DEPARTEMENT__PO_BOX_DEPT);
		createEAttribute(departementEClass, DEPARTEMENT__ACCES);

		niveauEClass = createEClass(NIVEAU);
		createEAttribute(niveauEClass, NIVEAU__NIVEAU);
		createEAttribute(niveauEClass, NIVEAU__DESCRIPTION);
		createEReference(niveauEClass, NIVEAU__RESPONSABLITE);
		createEReference(niveauEClass, NIVEAU__UES);
		createEReference(niveauEClass, NIVEAU__SPECIALITES);
		createEReference(niveauEClass, NIVEAU__SEMESTRES);
		createEAttribute(niveauEClass, NIVEAU__NOM);

		specialiteEClass = createEClass(SPECIALITE);
		createEReference(specialiteEClass, SPECIALITE__SEMESTRES);
		createEAttribute(specialiteEClass, SPECIALITE__NOM);
		createEAttribute(specialiteEClass, SPECIALITE__DESCRIPTION);

		ueEClass = createEClass(UE);
		createEAttribute(ueEClass, UE__CODE);
		createEAttribute(ueEClass, UE__NOM);
		createEAttribute(ueEClass, UE__OBJECTIF);
		createEAttribute(ueEClass, UE__TYPE);
		createEReference(ueEClass, UE__RESSOURCES);
		createEReference(ueEClass, UE__SEMESTRES);
		createEReference(ueEClass, UE__EST_ENSEIGNE);
		createEAttribute(ueEClass, UE__CONTENU);
		createEAttribute(ueEClass, UE__CREDIT);
		createEReference(ueEClass, UE__PROGRAMMATIONS);

		enseignantEClass = createEClass(ENSEIGNANT);
		createEReference(enseignantEClass, ENSEIGNANT__RESPONSABLE);
		createEAttribute(enseignantEClass, ENSEIGNANT__NOM);
		createEReference(enseignantEClass, ENSEIGNANT__ENSEIGNE);
		createEReference(enseignantEClass, ENSEIGNANT__CHEF);
		createEAttribute(enseignantEClass, ENSEIGNANT__EMAIL);
		createEAttribute(enseignantEClass, ENSEIGNANT__BUREAU);

		ressourceEClass = createEClass(RESSOURCE);
		createEAttribute(ressourceEClass, RESSOURCE__NOM);
		createEAttribute(ressourceEClass, RESSOURCE__LIEN);

		semestreEClass = createEClass(SEMESTRE);
		createEAttribute(semestreEClass, SEMESTRE__NOM);
		createEReference(semestreEClass, SEMESTRE__UES);

		formationEClass = createEClass(FORMATION);
		createEReference(formationEClass, FORMATION__NIVEAUX);
		createEAttribute(formationEClass, FORMATION__NOM);

		programmationEClass = createEClass(PROGRAMMATION);
		createEAttribute(programmationEClass, PROGRAMMATION__TYPE);
		createEAttribute(programmationEClass, PROGRAMMATION__JOUR);
		createEAttribute(programmationEClass, PROGRAMMATION__HEURE);
		createEAttribute(programmationEClass, PROGRAMMATION__SALLE);

		// Create enums
		typeUEEEnum = createEEnum(TYPE_UE);
		typePROGREEnum = createEEnum(TYPE_PROGR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(departementEClass, Departement.class, "Departement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepartement_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartement_Enseignants(), this.getEnseignant(), null, "enseignants", null, 1, -1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartement_Formations(), this.getFormation(), null, "formations", null, 1, -1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartement_Dirige(), this.getEnseignant(), this.getEnseignant_Chef(), "dirige", null, 1, 1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartement_TelDept(), ecorePackage.getEString(), "TelDept", null, 0, 1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartement_POBoxDept(), ecorePackage.getEString(), "POBoxDept", null, 0, 1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartement_Acces(), ecorePackage.getEString(), "acces", null, 0, 1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(niveauEClass, Niveau.class, "Niveau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNiveau_Niveau(), ecorePackage.getEInt(), "niveau", null, 0, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNiveau_Description(), ecorePackage.getEString(), "description", null, 0, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNiveau_Responsablite(), this.getEnseignant(), this.getEnseignant_Responsable(), "responsablite", null, 1, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNiveau_Ues(), this.getUe(), null, "ues", null, 1, -1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNiveau_Specialites(), this.getSpecialite(), null, "specialites", null, 0, -1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNiveau_Semestres(), this.getSemestre(), null, "semestres", null, 0, -1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNiveau_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Niveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialiteEClass, Specialite.class, "Specialite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecialite_Semestres(), this.getSemestre(), null, "semestres", null, 1, -1, Specialite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialite_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Specialite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialite_Description(), ecorePackage.getEString(), "description", null, 0, 1, Specialite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ueEClass, Ue.class, "Ue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUe_Code(), ecorePackage.getEString(), "code", null, 0, 1, Ue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUe_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Ue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUe_Objectif(), ecorePackage.getEString(), "objectif", null, 0, 1, Ue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUe_Type(), this.getTypeUE(), "type", null, 0, 1, Ue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUe_Ressources(), this.getRessource(), null, "ressources", null, 0, -1, Ue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUe_Semestres(), this.getSemestre(), this.getSemestre_Ues(), "semestres", null, 1, -1, Ue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUe_EstEnseigne(), this.getEnseignant(), this.getEnseignant_Enseigne(), "EstEnseigne", null, 1, 1, Ue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUe_Contenu(), ecorePackage.getEString(), "Contenu", null, 0, 1, Ue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUe_Credit(), ecorePackage.getEInt(), "credit", null, 0, 1, Ue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUe_Programmations(), this.getProgrammation(), null, "programmations", null, 0, -1, Ue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enseignantEClass, Enseignant.class, "Enseignant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnseignant_Responsable(), this.getNiveau(), this.getNiveau_Responsablite(), "responsable", null, 0, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnseignant_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnseignant_Enseigne(), this.getUe(), this.getUe_EstEnseigne(), "enseigne", null, 0, -1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnseignant_Chef(), this.getDepartement(), this.getDepartement_Dirige(), "chef", null, 0, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnseignant_Email(), ecorePackage.getEString(), "email", null, 0, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnseignant_Bureau(), ecorePackage.getEString(), "bureau", null, 0, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ressourceEClass, Ressource.class, "Ressource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRessource_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRessource_Lien(), ecorePackage.getEString(), "lien", null, 0, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semestreEClass, Semestre.class, "Semestre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemestre_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemestre_Ues(), this.getUe(), this.getUe_Semestres(), "ues", null, 1, -1, Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formationEClass, Formation.class, "Formation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormation_Niveaux(), this.getNiveau(), null, "niveaux", null, 0, -1, Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormation_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmationEClass, Programmation.class, "Programmation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgrammation_Type(), this.getTypePROGR(), "type", null, 0, 1, Programmation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgrammation_Jour(), ecorePackage.getEString(), "jour", null, 0, 1, Programmation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgrammation_Heure(), ecorePackage.getEString(), "heure", null, 0, 1, Programmation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgrammation_Salle(), ecorePackage.getEString(), "salle", null, 0, 1, Programmation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeUEEEnum, TypeUE.class, "TypeUE");
		addEEnumLiteral(typeUEEEnum, TypeUE.OBLIGATOIRE);
		addEEnumLiteral(typeUEEEnum, TypeUE.OPTIONNELLE);

		initEEnum(typePROGREEnum, TypePROGR.class, "TypePROGR");
		addEEnumLiteral(typePROGREEnum, TypePROGR.COURS_MAGISTRAL);
		addEEnumLiteral(typePROGREEnum, TypePROGR.TRAVAUX_DIRIGÉS);
		addEEnumLiteral(typePROGREEnum, TypePROGR.TRAVAUX_PRATRIQUES);
		addEEnumLiteral(typePROGREEnum, TypePROGR.CONTRÔLE_CONTINU);
		addEEnumLiteral(typePROGREEnum, TypePROGR.EXAMEN);
		addEEnumLiteral(typePROGREEnum, TypePROGR.RATTRAPAGE);

		// Create resource
		createResource(eNS_URI);
	}

} //ContenuPedagogiquePackageImpl
