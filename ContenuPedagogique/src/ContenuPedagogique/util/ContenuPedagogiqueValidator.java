/**
 */
package ContenuPedagogique.util;

import ContenuPedagogique.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ContenuPedagogique.ContenuPedagogiquePackage
 * @generated
 */
public class ContenuPedagogiqueValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ContenuPedagogiqueValidator INSTANCE = new ContenuPedagogiqueValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ContenuPedagogique";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Pas Spe Ue1 Sem' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__PAS_SPE_UE1_SEM = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sem Lie Ue Meme Niv' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__SEM_LIE_UE_MEME_NIV = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ue Spe Lie Sem Spe Niv' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__UE_SPE_LIE_SEM_SPE_NIV = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Si Sem Pas Spe' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__SI_SEM_PAS_SPE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Si Sem Alors2' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__SI_SEM_ALORS2 = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Si Spe Ue Fon1 Sem PSpe' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__SI_SPE_UE_FON1_SEM_PSPE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Si Spe Pas Sem' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__SI_SPE_PAS_SEM = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Niv Nom Diff' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__NIV_NOM_DIFF = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ue Lie Sem Meme Niv' of 'Niveau'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NIVEAU__UE_LIE_SEM_MEME_NIV = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ue Spe AM1' of 'Specialite'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SPECIALITE__UE_SPE_AM1 = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ue Spe1 Sem' of 'Ue'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UE__UE_SPE1_SEM = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ue Code Diff' of 'Ue'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UE__UE_CODE_DIFF = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Form Nom Diff' of 'Formation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORMATION__FORM_NOM_DIFF = 13;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 13;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenuPedagogiqueValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ContenuPedagogiquePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ContenuPedagogiquePackage.DEPARTEMENT:
				return validateDepartement((Departement)value, diagnostics, context);
			case ContenuPedagogiquePackage.NIVEAU:
				return validateNiveau((Niveau)value, diagnostics, context);
			case ContenuPedagogiquePackage.SPECIALITE:
				return validateSpecialite((Specialite)value, diagnostics, context);
			case ContenuPedagogiquePackage.UE:
				return validateUe((Ue)value, diagnostics, context);
			case ContenuPedagogiquePackage.ENSEIGNANT:
				return validateEnseignant((Enseignant)value, diagnostics, context);
			case ContenuPedagogiquePackage.RESSOURCE:
				return validateRessource((Ressource)value, diagnostics, context);
			case ContenuPedagogiquePackage.SEMESTRE:
				return validateSemestre((Semestre)value, diagnostics, context);
			case ContenuPedagogiquePackage.FORMATION:
				return validateFormation((Formation)value, diagnostics, context);
			case ContenuPedagogiquePackage.PROGRAMMATION:
				return validateProgrammation((Programmation)value, diagnostics, context);
			case ContenuPedagogiquePackage.TYPE_UE:
				return validateTypeUE((TypeUE)value, diagnostics, context);
			case ContenuPedagogiquePackage.TYPE_PROGR:
				return validateTypePROGR((TypePROGR)value, diagnostics, context);
			case ContenuPedagogiquePackage.TYPE_GRADE:
				return validateTypeGRADE((TypeGRADE)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement(Departement departement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(departement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(niveau, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_UeLieSemMemeNiv(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_PasSpeUe1Sem(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_SemLieUeMemeNiv(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_UeSpeLieSemSpeNiv(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_SiSemPasSpe(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_SiSemAlors2(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_SiSpeUeFon1SemPSpe(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_SiSpePasSem(niveau, diagnostics, context);
		if (result || diagnostics != null) result &= validateNiveau_NivNomDiff(niveau, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UeLieSemMemeNiv constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_UeLieSemMemeNiv(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.UeLieSemMemeNiv(diagnostics, context);
	}

	/**
	 * Validates the PasSpeUe1Sem constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_PasSpeUe1Sem(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.PasSpeUe1Sem(diagnostics, context);
	}

	/**
	 * Validates the SemLieUeMemeNiv constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_SemLieUeMemeNiv(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.SemLieUeMemeNiv(diagnostics, context);
	}

	/**
	 * Validates the UeSpeLieSemSpeNiv constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_UeSpeLieSemSpeNiv(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.UeSpeLieSemSpeNiv(diagnostics, context);
	}

	/**
	 * Validates the SiSemPasSpe constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_SiSemPasSpe(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.SiSemPasSpe(diagnostics, context);
	}

	/**
	 * Validates the SiSemAlors2 constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_SiSemAlors2(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.SiSemAlors2(diagnostics, context);
	}

	/**
	 * Validates the SiSpeUeFon1SemPSpe constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_SiSpeUeFon1SemPSpe(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.SiSpeUeFon1SemPSpe(diagnostics, context);
	}

	/**
	 * Validates the SiSpePasSem constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_SiSpePasSem(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.SiSpePasSem(diagnostics, context);
	}

	/**
	 * Validates the NivNomDiff constraint of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau_NivNomDiff(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return niveau.NivNomDiff(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialite(Specialite specialite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specialite, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specialite, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialite_UeSpeAM1(specialite, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UeSpeAM1 constraint of '<em>Specialite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialite_UeSpeAM1(Specialite specialite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return specialite.UeSpeAM1(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUe(Ue ue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validateUe_UeCodeDiff(ue, diagnostics, context);
		if (result || diagnostics != null) result &= validateUe_UeSpe1Sem(ue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UeCodeDiff constraint of '<em>Ue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUe_UeCodeDiff(Ue ue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ue.UeCodeDiff(diagnostics, context);
	}

	/**
	 * Validates the UeSpe1Sem constraint of '<em>Ue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUe_UeSpe1Sem(Ue ue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ue.UeSpe1Sem(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnseignant(Enseignant enseignant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enseignant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRessource(Ressource ressource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ressource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemestre(Semestre semestre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semestre, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormation(Formation formation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(formation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(formation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormation_FormNomDiff(formation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FormNomDiff constraint of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormation_FormNomDiff(Formation formation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return formation.FormNomDiff(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammation(Programmation programmation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programmation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeUE(TypeUE typeUE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypePROGR(TypePROGR typePROGR, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeGRADE(TypeGRADE typeGRADE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ContenuPedagogiqueValidator
