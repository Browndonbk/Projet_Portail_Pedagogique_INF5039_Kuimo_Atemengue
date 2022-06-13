/**
 */
package ContenuPedagogique;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type PROGR</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ContenuPedagogique.ContenuPedagogiquePackage#getTypePROGR()
 * @model
 * @generated
 */
public enum TypePROGR implements Enumerator {
	/**
	 * The '<em><b>Cours Magistral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COURS_MAGISTRAL_VALUE
	 * @generated
	 * @ordered
	 */
	COURS_MAGISTRAL(0, "Cours_Magistral", "Cours Magistral"),

	/**
	 * The '<em><b>Travaux Dirigés</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVAUX_DIRIGÉS_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVAUX_DIRIGÉS(1, "Travaux_Dirigés", "Travaux Dirig\u00e9s"),

	/**
	 * The '<em><b>Travaux Pratriques</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVAUX_PRATRIQUES_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVAUX_PRATRIQUES(2, "Travaux_Pratriques", "Travaux Pratriques"),

	/**
	 * The '<em><b>Contrôle Continu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRÔLE_CONTINU_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRÔLE_CONTINU(3, "Contrôle_Continu", "Contr\u00f4le Continu"),

	/**
	 * The '<em><b>Examen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXAMEN_VALUE
	 * @generated
	 * @ordered
	 */
	EXAMEN(4, "Examen", "Examen"),

	/**
	 * The '<em><b>Rattrapage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATTRAPAGE_VALUE
	 * @generated
	 * @ordered
	 */
	RATTRAPAGE(5, "Rattrapage", "Rattrapage");

	/**
	 * The '<em><b>Cours Magistral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COURS_MAGISTRAL
	 * @model name="Cours_Magistral" literal="Cours Magistral"
	 * @generated
	 * @ordered
	 */
	public static final int COURS_MAGISTRAL_VALUE = 0;

	/**
	 * The '<em><b>Travaux Dirigés</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVAUX_DIRIGÉS
	 * @model name="Travaux_Dirigés" literal="Travaux Dirig\351s"
	 * @generated
	 * @ordered
	 */
	public static final int TRAVAUX_DIRIGÉS_VALUE = 1;

	/**
	 * The '<em><b>Travaux Pratriques</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVAUX_PRATRIQUES
	 * @model name="Travaux_Pratriques" literal="Travaux Pratriques"
	 * @generated
	 * @ordered
	 */
	public static final int TRAVAUX_PRATRIQUES_VALUE = 2;

	/**
	 * The '<em><b>Contrôle Continu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRÔLE_CONTINU
	 * @model name="Contrôle_Continu" literal="Contr\364le Continu"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRÔLE_CONTINU_VALUE = 3;

	/**
	 * The '<em><b>Examen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXAMEN
	 * @model name="Examen"
	 * @generated
	 * @ordered
	 */
	public static final int EXAMEN_VALUE = 4;

	/**
	 * The '<em><b>Rattrapage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATTRAPAGE
	 * @model name="Rattrapage"
	 * @generated
	 * @ordered
	 */
	public static final int RATTRAPAGE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Type PROGR</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypePROGR[] VALUES_ARRAY =
		new TypePROGR[] {
			COURS_MAGISTRAL,
			TRAVAUX_DIRIGÉS,
			TRAVAUX_PRATRIQUES,
			CONTRÔLE_CONTINU,
			EXAMEN,
			RATTRAPAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type PROGR</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypePROGR> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type PROGR</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypePROGR get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypePROGR result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type PROGR</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypePROGR getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypePROGR result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type PROGR</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypePROGR get(int value) {
		switch (value) {
			case COURS_MAGISTRAL_VALUE: return COURS_MAGISTRAL;
			case TRAVAUX_DIRIGÉS_VALUE: return TRAVAUX_DIRIGÉS;
			case TRAVAUX_PRATRIQUES_VALUE: return TRAVAUX_PRATRIQUES;
			case CONTRÔLE_CONTINU_VALUE: return CONTRÔLE_CONTINU;
			case EXAMEN_VALUE: return EXAMEN;
			case RATTRAPAGE_VALUE: return RATTRAPAGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypePROGR(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypePROGR
