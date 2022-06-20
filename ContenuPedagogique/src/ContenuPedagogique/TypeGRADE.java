/**
 */
package ContenuPedagogique;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type GRADE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ContenuPedagogique.ContenuPedagogiquePackage#getTypeGRADE()
 * @model
 * @generated
 */
public enum TypeGRADE implements Enumerator {
	/**
	 * The '<em><b>Assistant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSISTANT_VALUE
	 * @generated
	 * @ordered
	 */
	ASSISTANT(0, "Assistant", "Assistant"),

	/**
	 * The '<em><b>Charge de Cours</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGE_DE_COURS_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGE_DE_COURS(1, "Charge_de_Cours", "Charg\u00e9 de Cours"), /**
	 * The '<em><b>Maitre de Conferences</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAITRE_DE_CONFERENCES_VALUE
	 * @generated
	 * @ordered
	 */
	MAITRE_DE_CONFERENCES(2, "Maitre_de_Conferences", "Maitre de Conf\u00e9rences"), /**
	 * The '<em><b>Professeur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFESSEUR_VALUE
	 * @generated
	 * @ordered
	 */
	PROFESSEUR(3, "Professeur", "Professeur");

	/**
	 * The '<em><b>Assistant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSISTANT
	 * @model name="Assistant"
	 * @generated
	 * @ordered
	 */
	public static final int ASSISTANT_VALUE = 0;

	/**
	 * The '<em><b>Charge de Cours</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGE_DE_COURS
	 * @model name="Charge_de_Cours" literal="Charg\351 de Cours"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE_DE_COURS_VALUE = 1;

	/**
	 * The '<em><b>Maitre de Conferences</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAITRE_DE_CONFERENCES
	 * @model name="Maitre_de_Conferences" literal="Maitre de Conf\351rences"
	 * @generated
	 * @ordered
	 */
	public static final int MAITRE_DE_CONFERENCES_VALUE = 2;

	/**
	 * The '<em><b>Professeur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFESSEUR
	 * @model name="Professeur"
	 * @generated
	 * @ordered
	 */
	public static final int PROFESSEUR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type GRADE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeGRADE[] VALUES_ARRAY =
		new TypeGRADE[] {
			ASSISTANT,
			CHARGE_DE_COURS,
			MAITRE_DE_CONFERENCES,
			PROFESSEUR,
		};

	/**
	 * A public read-only list of all the '<em><b>Type GRADE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeGRADE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type GRADE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeGRADE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeGRADE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type GRADE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeGRADE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeGRADE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type GRADE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeGRADE get(int value) {
		switch (value) {
			case ASSISTANT_VALUE: return ASSISTANT;
			case CHARGE_DE_COURS_VALUE: return CHARGE_DE_COURS;
			case MAITRE_DE_CONFERENCES_VALUE: return MAITRE_DE_CONFERENCES;
			case PROFESSEUR_VALUE: return PROFESSEUR;
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
	private TypeGRADE(int value, String name, String literal) {
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
	
} //TypeGRADE
