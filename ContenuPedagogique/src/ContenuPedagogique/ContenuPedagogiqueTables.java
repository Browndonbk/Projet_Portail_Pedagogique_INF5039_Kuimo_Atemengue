/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /ContenuPedagogique/metamodels/ContenuPedagogique.ecore
 * using:
 *   /ContenuPedagogique/metamodels/ContenuPedagogique.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package ContenuPedagogique;

// import ContenuPedagogique.ContenuPedagogiquePackage;
// import ContenuPedagogique.ContenuPedagogiqueTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * ContenuPedagogiqueTables provides the dispatch tables for the ContenuPedagogique for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ContenuPedagogiqueTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ContenuPedagogiquePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_ContenuPedagogique_com = IdManager.getNsURIPackageId("http://www.ContenuPedagogique.com", null, ContenuPedagogiquePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = ContenuPedagogiqueTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Departement = ContenuPedagogiqueTables.PACKid_http_c_s_s_www_ContenuPedagogique_com.getClassId("Departement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Enseignant = ContenuPedagogiqueTables.PACKid_http_c_s_s_www_ContenuPedagogique_com.getClassId("Enseignant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Formation = ContenuPedagogiqueTables.PACKid_http_c_s_s_www_ContenuPedagogique_com.getClassId("Formation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Niveau = ContenuPedagogiqueTables.PACKid_http_c_s_s_www_ContenuPedagogique_com.getClassId("Niveau", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Programmation = ContenuPedagogiqueTables.PACKid_http_c_s_s_www_ContenuPedagogique_com.getClassId("Programmation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Ressource = ContenuPedagogiqueTables.PACKid_http_c_s_s_www_ContenuPedagogique_com.getClassId("Ressource", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Semestre = ContenuPedagogiqueTables.PACKid_http_c_s_s_www_ContenuPedagogique_com.getClassId("Semestre", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Specialite = ContenuPedagogiqueTables.PACKid_http_c_s_s_www_ContenuPedagogique_com.getClassId("Specialite", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Ue = ContenuPedagogiqueTables.PACKid_http_c_s_s_www_ContenuPedagogique_com.getClassId("Ue", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = ContenuPedagogiqueTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TypeGRADE = ContenuPedagogiqueTables.PACKid_http_c_s_s_www_ContenuPedagogique_com.getEnumerationId("TypeGRADE");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TypePROGR = ContenuPedagogiqueTables.PACKid_http_c_s_s_www_ContenuPedagogique_com.getEnumerationId("TypePROGR");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TypeUE = ContenuPedagogiqueTables.PACKid_http_c_s_s_www_ContenuPedagogique_com.getEnumerationId("TypeUE");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_2 = ValueUtil.integerValueOf("2");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Fondamentale = ContenuPedagogiqueTables.ENUMid_TypeUE.getEnumerationLiteralId("Fondamentale");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Specialisee = ContenuPedagogiqueTables.ENUMid_TypeUE.getEnumerationLiteralId("Specialisee");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Enseignant = TypeId.ORDERED_SET.getSpecializedId(ContenuPedagogiqueTables.CLSSid_Enseignant);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Formation = TypeId.ORDERED_SET.getSpecializedId(ContenuPedagogiqueTables.CLSSid_Formation);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Niveau = TypeId.ORDERED_SET.getSpecializedId(ContenuPedagogiqueTables.CLSSid_Niveau);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Programmation = TypeId.ORDERED_SET.getSpecializedId(ContenuPedagogiqueTables.CLSSid_Programmation);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Ressource = TypeId.ORDERED_SET.getSpecializedId(ContenuPedagogiqueTables.CLSSid_Ressource);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Semestre = TypeId.ORDERED_SET.getSpecializedId(ContenuPedagogiqueTables.CLSSid_Semestre);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Specialite = TypeId.ORDERED_SET.getSpecializedId(ContenuPedagogiqueTables.CLSSid_Specialite);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Ue = TypeId.ORDERED_SET.getSpecializedId(ContenuPedagogiqueTables.CLSSid_Ue);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Semestre = TypeId.SEQUENCE.getSpecializedId(ContenuPedagogiqueTables.CLSSid_Semestre);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Ue = TypeId.SEQUENCE.getSpecializedId(ContenuPedagogiqueTables.CLSSid_Ue);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Formation = TypeId.SET.getSpecializedId(ContenuPedagogiqueTables.CLSSid_Formation);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Niveau = TypeId.SET.getSpecializedId(ContenuPedagogiqueTables.CLSSid_Niveau);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Ue = TypeId.SET.getSpecializedId(ContenuPedagogiqueTables.CLSSid_Ue);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ContenuPedagogiqueTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContenuPedagogiqueTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Departement = new EcoreExecutorType(ContenuPedagogiquePackage.Literals.DEPARTEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Enseignant = new EcoreExecutorType(ContenuPedagogiquePackage.Literals.ENSEIGNANT, PACKAGE, 0);
		public static final EcoreExecutorType _Formation = new EcoreExecutorType(ContenuPedagogiquePackage.Literals.FORMATION, PACKAGE, 0);
		public static final EcoreExecutorType _Niveau = new EcoreExecutorType(ContenuPedagogiquePackage.Literals.NIVEAU, PACKAGE, 0);
		public static final EcoreExecutorType _Programmation = new EcoreExecutorType(ContenuPedagogiquePackage.Literals.PROGRAMMATION, PACKAGE, 0);
		public static final EcoreExecutorType _Ressource = new EcoreExecutorType(ContenuPedagogiquePackage.Literals.RESSOURCE, PACKAGE, 0);
		public static final EcoreExecutorType _Semestre = new EcoreExecutorType(ContenuPedagogiquePackage.Literals.SEMESTRE, PACKAGE, 0);
		public static final EcoreExecutorType _Specialite = new EcoreExecutorType(ContenuPedagogiquePackage.Literals.SPECIALITE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TypeGRADE = new EcoreExecutorEnumeration(ContenuPedagogiquePackage.Literals.TYPE_GRADE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TypePROGR = new EcoreExecutorEnumeration(ContenuPedagogiquePackage.Literals.TYPE_PROGR, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TypeUE = new EcoreExecutorEnumeration(ContenuPedagogiquePackage.Literals.TYPE_UE, PACKAGE, 0);
		public static final EcoreExecutorType _Ue = new EcoreExecutorType(ContenuPedagogiquePackage.Literals.UE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Departement,
			_Enseignant,
			_Formation,
			_Niveau,
			_Programmation,
			_Ressource,
			_Semestre,
			_Specialite,
			_TypeGRADE,
			_TypePROGR,
			_TypeUE,
			_Ue
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContenuPedagogiqueTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Departement__Departement = new ExecutorFragment(Types._Departement, ContenuPedagogiqueTables.Types._Departement);
		private static final ExecutorFragment _Departement__OclAny = new ExecutorFragment(Types._Departement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Departement__OclElement = new ExecutorFragment(Types._Departement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Enseignant__Enseignant = new ExecutorFragment(Types._Enseignant, ContenuPedagogiqueTables.Types._Enseignant);
		private static final ExecutorFragment _Enseignant__OclAny = new ExecutorFragment(Types._Enseignant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Enseignant__OclElement = new ExecutorFragment(Types._Enseignant, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Formation__Formation = new ExecutorFragment(Types._Formation, ContenuPedagogiqueTables.Types._Formation);
		private static final ExecutorFragment _Formation__OclAny = new ExecutorFragment(Types._Formation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Formation__OclElement = new ExecutorFragment(Types._Formation, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Niveau__Niveau = new ExecutorFragment(Types._Niveau, ContenuPedagogiqueTables.Types._Niveau);
		private static final ExecutorFragment _Niveau__OclAny = new ExecutorFragment(Types._Niveau, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Niveau__OclElement = new ExecutorFragment(Types._Niveau, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Programmation__OclAny = new ExecutorFragment(Types._Programmation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Programmation__OclElement = new ExecutorFragment(Types._Programmation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Programmation__Programmation = new ExecutorFragment(Types._Programmation, ContenuPedagogiqueTables.Types._Programmation);

		private static final ExecutorFragment _Ressource__OclAny = new ExecutorFragment(Types._Ressource, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Ressource__OclElement = new ExecutorFragment(Types._Ressource, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Ressource__Ressource = new ExecutorFragment(Types._Ressource, ContenuPedagogiqueTables.Types._Ressource);

		private static final ExecutorFragment _Semestre__OclAny = new ExecutorFragment(Types._Semestre, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Semestre__OclElement = new ExecutorFragment(Types._Semestre, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Semestre__Semestre = new ExecutorFragment(Types._Semestre, ContenuPedagogiqueTables.Types._Semestre);

		private static final ExecutorFragment _Specialite__OclAny = new ExecutorFragment(Types._Specialite, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Specialite__OclElement = new ExecutorFragment(Types._Specialite, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Specialite__Specialite = new ExecutorFragment(Types._Specialite, ContenuPedagogiqueTables.Types._Specialite);

		private static final ExecutorFragment _TypeGRADE__OclAny = new ExecutorFragment(Types._TypeGRADE, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TypeGRADE__OclElement = new ExecutorFragment(Types._TypeGRADE, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TypeGRADE__OclEnumeration = new ExecutorFragment(Types._TypeGRADE, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TypeGRADE__OclType = new ExecutorFragment(Types._TypeGRADE, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TypeGRADE__TypeGRADE = new ExecutorFragment(Types._TypeGRADE, ContenuPedagogiqueTables.Types._TypeGRADE);

		private static final ExecutorFragment _TypePROGR__OclAny = new ExecutorFragment(Types._TypePROGR, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TypePROGR__OclElement = new ExecutorFragment(Types._TypePROGR, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TypePROGR__OclEnumeration = new ExecutorFragment(Types._TypePROGR, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TypePROGR__OclType = new ExecutorFragment(Types._TypePROGR, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TypePROGR__TypePROGR = new ExecutorFragment(Types._TypePROGR, ContenuPedagogiqueTables.Types._TypePROGR);

		private static final ExecutorFragment _TypeUE__OclAny = new ExecutorFragment(Types._TypeUE, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TypeUE__OclElement = new ExecutorFragment(Types._TypeUE, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TypeUE__OclEnumeration = new ExecutorFragment(Types._TypeUE, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TypeUE__OclType = new ExecutorFragment(Types._TypeUE, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TypeUE__TypeUE = new ExecutorFragment(Types._TypeUE, ContenuPedagogiqueTables.Types._TypeUE);

		private static final ExecutorFragment _Ue__OclAny = new ExecutorFragment(Types._Ue, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Ue__OclElement = new ExecutorFragment(Types._Ue, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Ue__Ue = new ExecutorFragment(Types._Ue, ContenuPedagogiqueTables.Types._Ue);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContenuPedagogiqueTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContenuPedagogiqueTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContenuPedagogiqueTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Departement__POBoxDept = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.DEPARTEMENT__PO_BOX_DEPT, Types._Departement, 0);
		public static final ExecutorProperty _Departement__TelDept = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.DEPARTEMENT__TEL_DEPT, Types._Departement, 1);
		public static final ExecutorProperty _Departement__acces = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.DEPARTEMENT__ACCES, Types._Departement, 2);
		public static final ExecutorProperty _Departement__description = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.DEPARTEMENT__DESCRIPTION, Types._Departement, 3);
		public static final ExecutorProperty _Departement__dirige = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.DEPARTEMENT__DIRIGE, Types._Departement, 4);
		public static final ExecutorProperty _Departement__enseignants = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.DEPARTEMENT__ENSEIGNANTS, Types._Departement, 5);
		public static final ExecutorProperty _Departement__formations = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.DEPARTEMENT__FORMATIONS, Types._Departement, 6);
		public static final ExecutorProperty _Departement__nom = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.DEPARTEMENT__NOM, Types._Departement, 7);

		public static final ExecutorProperty _Enseignant__bureau = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.ENSEIGNANT__BUREAU, Types._Enseignant, 0);
		public static final ExecutorProperty _Enseignant__chef = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.ENSEIGNANT__CHEF, Types._Enseignant, 1);
		public static final ExecutorProperty _Enseignant__email = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.ENSEIGNANT__EMAIL, Types._Enseignant, 2);
		public static final ExecutorProperty _Enseignant__enseigne = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.ENSEIGNANT__ENSEIGNE, Types._Enseignant, 3);
		public static final ExecutorProperty _Enseignant__grade = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.ENSEIGNANT__GRADE, Types._Enseignant, 4);
		public static final ExecutorProperty _Enseignant__nom = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.ENSEIGNANT__NOM, Types._Enseignant, 5);
		public static final ExecutorProperty _Enseignant__responsable = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.ENSEIGNANT__RESPONSABLE, Types._Enseignant, 6);
		public static final ExecutorProperty _Enseignant__Departement__enseignants = new ExecutorPropertyWithImplementation("Departement", Types._Enseignant, 7, new EcoreLibraryOppositeProperty(ContenuPedagogiquePackage.Literals.DEPARTEMENT__ENSEIGNANTS));

		public static final ExecutorProperty _Formation__niveaux = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.FORMATION__NIVEAUX, Types._Formation, 0);
		public static final ExecutorProperty _Formation__nom = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.FORMATION__NOM, Types._Formation, 1);
		public static final ExecutorProperty _Formation__Departement__formations = new ExecutorPropertyWithImplementation("Departement", Types._Formation, 2, new EcoreLibraryOppositeProperty(ContenuPedagogiquePackage.Literals.DEPARTEMENT__FORMATIONS));

		public static final ExecutorProperty _Niveau__description = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.NIVEAU__DESCRIPTION, Types._Niveau, 0);
		public static final ExecutorProperty _Niveau__niveau = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.NIVEAU__NIVEAU, Types._Niveau, 1);
		public static final ExecutorProperty _Niveau__nom = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.NIVEAU__NOM, Types._Niveau, 2);
		public static final ExecutorProperty _Niveau__responsablite = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.NIVEAU__RESPONSABLITE, Types._Niveau, 3);
		public static final ExecutorProperty _Niveau__semestres = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.NIVEAU__SEMESTRES, Types._Niveau, 4);
		public static final ExecutorProperty _Niveau__specialites = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.NIVEAU__SPECIALITES, Types._Niveau, 5);
		public static final ExecutorProperty _Niveau__ues = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.NIVEAU__UES, Types._Niveau, 6);
		public static final ExecutorProperty _Niveau__Formation__niveaux = new ExecutorPropertyWithImplementation("Formation", Types._Niveau, 7, new EcoreLibraryOppositeProperty(ContenuPedagogiquePackage.Literals.FORMATION__NIVEAUX));

		public static final ExecutorProperty _Programmation__heure = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.PROGRAMMATION__HEURE, Types._Programmation, 0);
		public static final ExecutorProperty _Programmation__jour = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.PROGRAMMATION__JOUR, Types._Programmation, 1);
		public static final ExecutorProperty _Programmation__salle = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.PROGRAMMATION__SALLE, Types._Programmation, 2);
		public static final ExecutorProperty _Programmation__type = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.PROGRAMMATION__TYPE, Types._Programmation, 3);
		public static final ExecutorProperty _Programmation__Ue__programmations = new ExecutorPropertyWithImplementation("Ue", Types._Programmation, 4, new EcoreLibraryOppositeProperty(ContenuPedagogiquePackage.Literals.UE__PROGRAMMATIONS));

		public static final ExecutorProperty _Ressource__lien = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.RESSOURCE__LIEN, Types._Ressource, 0);
		public static final ExecutorProperty _Ressource__nom = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.RESSOURCE__NOM, Types._Ressource, 1);
		public static final ExecutorProperty _Ressource__Ue__ressources = new ExecutorPropertyWithImplementation("Ue", Types._Ressource, 2, new EcoreLibraryOppositeProperty(ContenuPedagogiquePackage.Literals.UE__RESSOURCES));

		public static final ExecutorProperty _Semestre__nom = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.SEMESTRE__NOM, Types._Semestre, 0);
		public static final ExecutorProperty _Semestre__ues = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.SEMESTRE__UES, Types._Semestre, 1);
		public static final ExecutorProperty _Semestre__Niveau__semestres = new ExecutorPropertyWithImplementation("Niveau", Types._Semestre, 2, new EcoreLibraryOppositeProperty(ContenuPedagogiquePackage.Literals.NIVEAU__SEMESTRES));
		public static final ExecutorProperty _Semestre__Specialite__semestres = new ExecutorPropertyWithImplementation("Specialite", Types._Semestre, 3, new EcoreLibraryOppositeProperty(ContenuPedagogiquePackage.Literals.SPECIALITE__SEMESTRES));

		public static final ExecutorProperty _Specialite__description = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.SPECIALITE__DESCRIPTION, Types._Specialite, 0);
		public static final ExecutorProperty _Specialite__nom = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.SPECIALITE__NOM, Types._Specialite, 1);
		public static final ExecutorProperty _Specialite__semestres = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.SPECIALITE__SEMESTRES, Types._Specialite, 2);
		public static final ExecutorProperty _Specialite__Niveau__specialites = new ExecutorPropertyWithImplementation("Niveau", Types._Specialite, 3, new EcoreLibraryOppositeProperty(ContenuPedagogiquePackage.Literals.NIVEAU__SPECIALITES));

		public static final ExecutorProperty _Ue__Contenu = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.UE__CONTENU, Types._Ue, 0);
		public static final ExecutorProperty _Ue__EstEnseigne = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.UE__EST_ENSEIGNE, Types._Ue, 1);
		public static final ExecutorProperty _Ue__code = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.UE__CODE, Types._Ue, 2);
		public static final ExecutorProperty _Ue__credit = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.UE__CREDIT, Types._Ue, 3);
		public static final ExecutorProperty _Ue__nom = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.UE__NOM, Types._Ue, 4);
		public static final ExecutorProperty _Ue__objectif = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.UE__OBJECTIF, Types._Ue, 5);
		public static final ExecutorProperty _Ue__programmations = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.UE__PROGRAMMATIONS, Types._Ue, 6);
		public static final ExecutorProperty _Ue__ressources = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.UE__RESSOURCES, Types._Ue, 7);
		public static final ExecutorProperty _Ue__semestres = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.UE__SEMESTRES, Types._Ue, 8);
		public static final ExecutorProperty _Ue__type = new EcoreExecutorProperty(ContenuPedagogiquePackage.Literals.UE__TYPE, Types._Ue, 9);
		public static final ExecutorProperty _Ue__Niveau__ues = new ExecutorPropertyWithImplementation("Niveau", Types._Ue, 10, new EcoreLibraryOppositeProperty(ContenuPedagogiquePackage.Literals.NIVEAU__UES));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContenuPedagogiqueTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Departement =
			{
				Fragments._Departement__OclAny /* 0 */,
				Fragments._Departement__OclElement /* 1 */,
				Fragments._Departement__Departement /* 2 */
			};
		private static final int /*@NonNull*/ [] __Departement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Enseignant =
			{
				Fragments._Enseignant__OclAny /* 0 */,
				Fragments._Enseignant__OclElement /* 1 */,
				Fragments._Enseignant__Enseignant /* 2 */
			};
		private static final int /*@NonNull*/ [] __Enseignant = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Formation =
			{
				Fragments._Formation__OclAny /* 0 */,
				Fragments._Formation__OclElement /* 1 */,
				Fragments._Formation__Formation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Formation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Niveau =
			{
				Fragments._Niveau__OclAny /* 0 */,
				Fragments._Niveau__OclElement /* 1 */,
				Fragments._Niveau__Niveau /* 2 */
			};
		private static final int /*@NonNull*/ [] __Niveau = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Programmation =
			{
				Fragments._Programmation__OclAny /* 0 */,
				Fragments._Programmation__OclElement /* 1 */,
				Fragments._Programmation__Programmation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Programmation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Ressource =
			{
				Fragments._Ressource__OclAny /* 0 */,
				Fragments._Ressource__OclElement /* 1 */,
				Fragments._Ressource__Ressource /* 2 */
			};
		private static final int /*@NonNull*/ [] __Ressource = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Semestre =
			{
				Fragments._Semestre__OclAny /* 0 */,
				Fragments._Semestre__OclElement /* 1 */,
				Fragments._Semestre__Semestre /* 2 */
			};
		private static final int /*@NonNull*/ [] __Semestre = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Specialite =
			{
				Fragments._Specialite__OclAny /* 0 */,
				Fragments._Specialite__OclElement /* 1 */,
				Fragments._Specialite__Specialite /* 2 */
			};
		private static final int /*@NonNull*/ [] __Specialite = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TypeGRADE =
			{
				Fragments._TypeGRADE__OclAny /* 0 */,
				Fragments._TypeGRADE__OclElement /* 1 */,
				Fragments._TypeGRADE__OclType /* 2 */,
				Fragments._TypeGRADE__OclEnumeration /* 3 */,
				Fragments._TypeGRADE__TypeGRADE /* 4 */
			};
		private static final int /*@NonNull*/ [] __TypeGRADE = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TypePROGR =
			{
				Fragments._TypePROGR__OclAny /* 0 */,
				Fragments._TypePROGR__OclElement /* 1 */,
				Fragments._TypePROGR__OclType /* 2 */,
				Fragments._TypePROGR__OclEnumeration /* 3 */,
				Fragments._TypePROGR__TypePROGR /* 4 */
			};
		private static final int /*@NonNull*/ [] __TypePROGR = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TypeUE =
			{
				Fragments._TypeUE__OclAny /* 0 */,
				Fragments._TypeUE__OclElement /* 1 */,
				Fragments._TypeUE__OclType /* 2 */,
				Fragments._TypeUE__OclEnumeration /* 3 */,
				Fragments._TypeUE__TypeUE /* 4 */
			};
		private static final int /*@NonNull*/ [] __TypeUE = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Ue =
			{
				Fragments._Ue__OclAny /* 0 */,
				Fragments._Ue__OclElement /* 1 */,
				Fragments._Ue__Ue /* 2 */
			};
		private static final int /*@NonNull*/ [] __Ue = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Departement.initFragments(_Departement, __Departement);
			Types._Enseignant.initFragments(_Enseignant, __Enseignant);
			Types._Formation.initFragments(_Formation, __Formation);
			Types._Niveau.initFragments(_Niveau, __Niveau);
			Types._Programmation.initFragments(_Programmation, __Programmation);
			Types._Ressource.initFragments(_Ressource, __Ressource);
			Types._Semestre.initFragments(_Semestre, __Semestre);
			Types._Specialite.initFragments(_Specialite, __Specialite);
			Types._TypeGRADE.initFragments(_TypeGRADE, __TypeGRADE);
			Types._TypePROGR.initFragments(_TypePROGR, __TypePROGR);
			Types._TypeUE.initFragments(_TypeUE, __TypeUE);
			Types._Ue.initFragments(_Ue, __Ue);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContenuPedagogiqueTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Departement__Departement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Departement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Departement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Enseignant__Enseignant = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Enseignant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enseignant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Formation__Formation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Formation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Formation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Niveau__Niveau = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Niveau__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Niveau__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Programmation__Programmation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Programmation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Programmation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Ressource__Ressource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Ressource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Ressource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Semestre__Semestre = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Semestre__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Semestre__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Specialite__Specialite = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Specialite__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Specialite__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TypeGRADE__TypeGRADE = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TypeGRADE__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TypeGRADE__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TypeGRADE__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TypeGRADE__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TypePROGR__TypePROGR = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TypePROGR__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TypePROGR__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TypePROGR__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TypePROGR__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TypeUE__TypeUE = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TypeUE__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TypeUE__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TypeUE__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TypeUE__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Ue__Ue = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Ue__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Ue__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Departement__Departement.initOperations(_Departement__Departement);
			Fragments._Departement__OclAny.initOperations(_Departement__OclAny);
			Fragments._Departement__OclElement.initOperations(_Departement__OclElement);

			Fragments._Enseignant__Enseignant.initOperations(_Enseignant__Enseignant);
			Fragments._Enseignant__OclAny.initOperations(_Enseignant__OclAny);
			Fragments._Enseignant__OclElement.initOperations(_Enseignant__OclElement);

			Fragments._Formation__Formation.initOperations(_Formation__Formation);
			Fragments._Formation__OclAny.initOperations(_Formation__OclAny);
			Fragments._Formation__OclElement.initOperations(_Formation__OclElement);

			Fragments._Niveau__Niveau.initOperations(_Niveau__Niveau);
			Fragments._Niveau__OclAny.initOperations(_Niveau__OclAny);
			Fragments._Niveau__OclElement.initOperations(_Niveau__OclElement);

			Fragments._Programmation__OclAny.initOperations(_Programmation__OclAny);
			Fragments._Programmation__OclElement.initOperations(_Programmation__OclElement);
			Fragments._Programmation__Programmation.initOperations(_Programmation__Programmation);

			Fragments._Ressource__OclAny.initOperations(_Ressource__OclAny);
			Fragments._Ressource__OclElement.initOperations(_Ressource__OclElement);
			Fragments._Ressource__Ressource.initOperations(_Ressource__Ressource);

			Fragments._Semestre__OclAny.initOperations(_Semestre__OclAny);
			Fragments._Semestre__OclElement.initOperations(_Semestre__OclElement);
			Fragments._Semestre__Semestre.initOperations(_Semestre__Semestre);

			Fragments._Specialite__OclAny.initOperations(_Specialite__OclAny);
			Fragments._Specialite__OclElement.initOperations(_Specialite__OclElement);
			Fragments._Specialite__Specialite.initOperations(_Specialite__Specialite);

			Fragments._TypeGRADE__OclAny.initOperations(_TypeGRADE__OclAny);
			Fragments._TypeGRADE__OclElement.initOperations(_TypeGRADE__OclElement);
			Fragments._TypeGRADE__OclEnumeration.initOperations(_TypeGRADE__OclEnumeration);
			Fragments._TypeGRADE__OclType.initOperations(_TypeGRADE__OclType);
			Fragments._TypeGRADE__TypeGRADE.initOperations(_TypeGRADE__TypeGRADE);

			Fragments._TypePROGR__OclAny.initOperations(_TypePROGR__OclAny);
			Fragments._TypePROGR__OclElement.initOperations(_TypePROGR__OclElement);
			Fragments._TypePROGR__OclEnumeration.initOperations(_TypePROGR__OclEnumeration);
			Fragments._TypePROGR__OclType.initOperations(_TypePROGR__OclType);
			Fragments._TypePROGR__TypePROGR.initOperations(_TypePROGR__TypePROGR);

			Fragments._TypeUE__OclAny.initOperations(_TypeUE__OclAny);
			Fragments._TypeUE__OclElement.initOperations(_TypeUE__OclElement);
			Fragments._TypeUE__OclEnumeration.initOperations(_TypeUE__OclEnumeration);
			Fragments._TypeUE__OclType.initOperations(_TypeUE__OclType);
			Fragments._TypeUE__TypeUE.initOperations(_TypeUE__TypeUE);

			Fragments._Ue__OclAny.initOperations(_Ue__OclAny);
			Fragments._Ue__OclElement.initOperations(_Ue__OclElement);
			Fragments._Ue__Ue.initOperations(_Ue__Ue);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContenuPedagogiqueTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Departement = {
			ContenuPedagogiqueTables.Properties._Departement__POBoxDept,
			ContenuPedagogiqueTables.Properties._Departement__TelDept,
			ContenuPedagogiqueTables.Properties._Departement__acces,
			ContenuPedagogiqueTables.Properties._Departement__description,
			ContenuPedagogiqueTables.Properties._Departement__dirige,
			ContenuPedagogiqueTables.Properties._Departement__enseignants,
			ContenuPedagogiqueTables.Properties._Departement__formations,
			ContenuPedagogiqueTables.Properties._Departement__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Enseignant = {
			ContenuPedagogiqueTables.Properties._Enseignant__bureau,
			ContenuPedagogiqueTables.Properties._Enseignant__chef,
			ContenuPedagogiqueTables.Properties._Enseignant__email,
			ContenuPedagogiqueTables.Properties._Enseignant__enseigne,
			ContenuPedagogiqueTables.Properties._Enseignant__grade,
			ContenuPedagogiqueTables.Properties._Enseignant__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ContenuPedagogiqueTables.Properties._Enseignant__responsable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Formation = {
			ContenuPedagogiqueTables.Properties._Formation__niveaux,
			ContenuPedagogiqueTables.Properties._Formation__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Niveau = {
			ContenuPedagogiqueTables.Properties._Niveau__description,
			ContenuPedagogiqueTables.Properties._Niveau__niveau,
			ContenuPedagogiqueTables.Properties._Niveau__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ContenuPedagogiqueTables.Properties._Niveau__responsablite,
			ContenuPedagogiqueTables.Properties._Niveau__semestres,
			ContenuPedagogiqueTables.Properties._Niveau__specialites,
			ContenuPedagogiqueTables.Properties._Niveau__ues
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Programmation = {
			ContenuPedagogiqueTables.Properties._Programmation__heure,
			ContenuPedagogiqueTables.Properties._Programmation__jour,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ContenuPedagogiqueTables.Properties._Programmation__salle,
			ContenuPedagogiqueTables.Properties._Programmation__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Ressource = {
			ContenuPedagogiqueTables.Properties._Ressource__lien,
			ContenuPedagogiqueTables.Properties._Ressource__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Semestre = {
			ContenuPedagogiqueTables.Properties._Semestre__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ContenuPedagogiqueTables.Properties._Semestre__ues
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Specialite = {
			ContenuPedagogiqueTables.Properties._Specialite__description,
			ContenuPedagogiqueTables.Properties._Specialite__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ContenuPedagogiqueTables.Properties._Specialite__semestres
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TypeGRADE = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TypePROGR = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TypeUE = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Ue = {
			ContenuPedagogiqueTables.Properties._Ue__Contenu,
			ContenuPedagogiqueTables.Properties._Ue__EstEnseigne,
			ContenuPedagogiqueTables.Properties._Ue__code,
			ContenuPedagogiqueTables.Properties._Ue__credit,
			ContenuPedagogiqueTables.Properties._Ue__nom,
			ContenuPedagogiqueTables.Properties._Ue__objectif,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ContenuPedagogiqueTables.Properties._Ue__programmations,
			ContenuPedagogiqueTables.Properties._Ue__ressources,
			ContenuPedagogiqueTables.Properties._Ue__semestres,
			ContenuPedagogiqueTables.Properties._Ue__type
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Departement__Departement.initProperties(_Departement);
			Fragments._Enseignant__Enseignant.initProperties(_Enseignant);
			Fragments._Formation__Formation.initProperties(_Formation);
			Fragments._Niveau__Niveau.initProperties(_Niveau);
			Fragments._Programmation__Programmation.initProperties(_Programmation);
			Fragments._Ressource__Ressource.initProperties(_Ressource);
			Fragments._Semestre__Semestre.initProperties(_Semestre);
			Fragments._Specialite__Specialite.initProperties(_Specialite);
			Fragments._TypeGRADE__TypeGRADE.initProperties(_TypeGRADE);
			Fragments._TypePROGR__TypePROGR.initProperties(_TypePROGR);
			Fragments._TypeUE__TypeUE.initProperties(_TypeUE);
			Fragments._Ue__Ue.initProperties(_Ue);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContenuPedagogiqueTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _TypeGRADE__Assistant = new EcoreExecutorEnumerationLiteral(ContenuPedagogiquePackage.Literals.TYPE_GRADE.getEEnumLiteral("Assistant"), Types._TypeGRADE, 0);
		public static final EcoreExecutorEnumerationLiteral _TypeGRADE__Charge_de_Cours = new EcoreExecutorEnumerationLiteral(ContenuPedagogiquePackage.Literals.TYPE_GRADE.getEEnumLiteral("Charge_de_Cours"), Types._TypeGRADE, 1);
		public static final EcoreExecutorEnumerationLiteral _TypeGRADE__Maitre_de_Conferences = new EcoreExecutorEnumerationLiteral(ContenuPedagogiquePackage.Literals.TYPE_GRADE.getEEnumLiteral("Maitre_de_Conferences"), Types._TypeGRADE, 2);
		public static final EcoreExecutorEnumerationLiteral _TypeGRADE__Professeur = new EcoreExecutorEnumerationLiteral(ContenuPedagogiquePackage.Literals.TYPE_GRADE.getEEnumLiteral("Professeur"), Types._TypeGRADE, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TypeGRADE = {
			_TypeGRADE__Assistant,
			_TypeGRADE__Charge_de_Cours,
			_TypeGRADE__Maitre_de_Conferences,
			_TypeGRADE__Professeur
		};

		public static final EcoreExecutorEnumerationLiteral _TypePROGR__Cours_Magistral = new EcoreExecutorEnumerationLiteral(ContenuPedagogiquePackage.Literals.TYPE_PROGR.getEEnumLiteral("Cours_Magistral"), Types._TypePROGR, 0);
		public static final EcoreExecutorEnumerationLiteral _TypePROGR__Travaux_Diriges = new EcoreExecutorEnumerationLiteral(ContenuPedagogiquePackage.Literals.TYPE_PROGR.getEEnumLiteral("Travaux_Diriges"), Types._TypePROGR, 1);
		public static final EcoreExecutorEnumerationLiteral _TypePROGR__Travaux_Pratriques = new EcoreExecutorEnumerationLiteral(ContenuPedagogiquePackage.Literals.TYPE_PROGR.getEEnumLiteral("Travaux_Pratriques"), Types._TypePROGR, 2);
		public static final EcoreExecutorEnumerationLiteral _TypePROGR__Controle_Continu = new EcoreExecutorEnumerationLiteral(ContenuPedagogiquePackage.Literals.TYPE_PROGR.getEEnumLiteral("Controle_Continu"), Types._TypePROGR, 3);
		public static final EcoreExecutorEnumerationLiteral _TypePROGR__Examen = new EcoreExecutorEnumerationLiteral(ContenuPedagogiquePackage.Literals.TYPE_PROGR.getEEnumLiteral("Examen"), Types._TypePROGR, 4);
		public static final EcoreExecutorEnumerationLiteral _TypePROGR__Rattrapage = new EcoreExecutorEnumerationLiteral(ContenuPedagogiquePackage.Literals.TYPE_PROGR.getEEnumLiteral("Rattrapage"), Types._TypePROGR, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TypePROGR = {
			_TypePROGR__Cours_Magistral,
			_TypePROGR__Travaux_Diriges,
			_TypePROGR__Travaux_Pratriques,
			_TypePROGR__Controle_Continu,
			_TypePROGR__Examen,
			_TypePROGR__Rattrapage
		};

		public static final EcoreExecutorEnumerationLiteral _TypeUE__Optionnelle = new EcoreExecutorEnumerationLiteral(ContenuPedagogiquePackage.Literals.TYPE_UE.getEEnumLiteral("Optionnelle"), Types._TypeUE, 0);
		public static final EcoreExecutorEnumerationLiteral _TypeUE__Specialisee = new EcoreExecutorEnumerationLiteral(ContenuPedagogiquePackage.Literals.TYPE_UE.getEEnumLiteral("Specialisee"), Types._TypeUE, 1);
		public static final EcoreExecutorEnumerationLiteral _TypeUE__Fondamentale = new EcoreExecutorEnumerationLiteral(ContenuPedagogiquePackage.Literals.TYPE_UE.getEEnumLiteral("Fondamentale"), Types._TypeUE, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TypeUE = {
			_TypeUE__Optionnelle,
			_TypeUE__Specialisee,
			_TypeUE__Fondamentale
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._TypeGRADE.initLiterals(_TypeGRADE);
			Types._TypePROGR.initLiterals(_TypePROGR);
			Types._TypeUE.initLiterals(_TypeUE);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContenuPedagogiqueTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new ContenuPedagogiqueTables();
	}

	private ContenuPedagogiqueTables() {
		super(ContenuPedagogiquePackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		ContenuPedagogiquePackage.Literals.FORMATION,
		ContenuPedagogiquePackage.Literals.NIVEAU,
		ContenuPedagogiquePackage.Literals.UE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
