/**
 */
package ContenuPedagogique.impl;

import ContenuPedagogique.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenuPedagogiqueFactoryImpl extends EFactoryImpl implements ContenuPedagogiqueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenuPedagogiqueFactory init() {
		try {
			ContenuPedagogiqueFactory theContenuPedagogiqueFactory = (ContenuPedagogiqueFactory)EPackage.Registry.INSTANCE.getEFactory(ContenuPedagogiquePackage.eNS_URI);
			if (theContenuPedagogiqueFactory != null) {
				return theContenuPedagogiqueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenuPedagogiqueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenuPedagogiqueFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ContenuPedagogiquePackage.DEPARTEMENT: return createDepartement();
			case ContenuPedagogiquePackage.NIVEAU: return createNiveau();
			case ContenuPedagogiquePackage.SPECIALITE: return createSpecialite();
			case ContenuPedagogiquePackage.UE: return createUe();
			case ContenuPedagogiquePackage.ENSEIGNANT: return createEnseignant();
			case ContenuPedagogiquePackage.RESSOURCE: return createRessource();
			case ContenuPedagogiquePackage.SEMESTRE: return createSemestre();
			case ContenuPedagogiquePackage.FORMATION: return createFormation();
			case ContenuPedagogiquePackage.PROGRAMMATION: return createProgrammation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ContenuPedagogiquePackage.TYPE_UE:
				return createTypeUEFromString(eDataType, initialValue);
			case ContenuPedagogiquePackage.TYPE_PROGR:
				return createTypePROGRFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ContenuPedagogiquePackage.TYPE_UE:
				return convertTypeUEToString(eDataType, instanceValue);
			case ContenuPedagogiquePackage.TYPE_PROGR:
				return convertTypePROGRToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departement createDepartement() {
		DepartementImpl departement = new DepartementImpl();
		return departement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Niveau createNiveau() {
		NiveauImpl niveau = new NiveauImpl();
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialite createSpecialite() {
		SpecialiteImpl specialite = new SpecialiteImpl();
		return specialite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ue createUe() {
		UeImpl ue = new UeImpl();
		return ue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant createEnseignant() {
		EnseignantImpl enseignant = new EnseignantImpl();
		return enseignant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource createRessource() {
		RessourceImpl ressource = new RessourceImpl();
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semestre createSemestre() {
		SemestreImpl semestre = new SemestreImpl();
		return semestre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formation createFormation() {
		FormationImpl formation = new FormationImpl();
		return formation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programmation createProgrammation() {
		ProgrammationImpl programmation = new ProgrammationImpl();
		return programmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUE createTypeUEFromString(EDataType eDataType, String initialValue) {
		TypeUE result = TypeUE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeUEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePROGR createTypePROGRFromString(EDataType eDataType, String initialValue) {
		TypePROGR result = TypePROGR.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypePROGRToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenuPedagogiquePackage getContenuPedagogiquePackage() {
		return (ContenuPedagogiquePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenuPedagogiquePackage getPackage() {
		return ContenuPedagogiquePackage.eINSTANCE;
	}

} //ContenuPedagogiqueFactoryImpl
