/**
 */
package ContenuPedagogique;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programmation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.Programmation#getType <em>Type</em>}</li>
 *   <li>{@link ContenuPedagogique.Programmation#getJour <em>Jour</em>}</li>
 *   <li>{@link ContenuPedagogique.Programmation#getHeure <em>Heure</em>}</li>
 *   <li>{@link ContenuPedagogique.Programmation#getSalle <em>Salle</em>}</li>
 * </ul>
 *
 * @see ContenuPedagogique.ContenuPedagogiquePackage#getProgrammation()
 * @model
 * @generated
 */
public interface Programmation extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ContenuPedagogique.TypePROGR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ContenuPedagogique.TypePROGR
	 * @see #setType(TypePROGR)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getProgrammation_Type()
	 * @model
	 * @generated
	 */
	TypePROGR getType();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Programmation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ContenuPedagogique.TypePROGR
	 * @see #getType()
	 * @generated
	 */
	void setType(TypePROGR value);

	/**
	 * Returns the value of the '<em><b>Jour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jour</em>' attribute.
	 * @see #setJour(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getProgrammation_Jour()
	 * @model
	 * @generated
	 */
	String getJour();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Programmation#getJour <em>Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jour</em>' attribute.
	 * @see #getJour()
	 * @generated
	 */
	void setJour(String value);

	/**
	 * Returns the value of the '<em><b>Heure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure</em>' attribute.
	 * @see #setHeure(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getProgrammation_Heure()
	 * @model
	 * @generated
	 */
	String getHeure();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Programmation#getHeure <em>Heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure</em>' attribute.
	 * @see #getHeure()
	 * @generated
	 */
	void setHeure(String value);

	/**
	 * Returns the value of the '<em><b>Salle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salle</em>' attribute.
	 * @see #setSalle(String)
	 * @see ContenuPedagogique.ContenuPedagogiquePackage#getProgrammation_Salle()
	 * @model
	 * @generated
	 */
	String getSalle();

	/**
	 * Sets the value of the '{@link ContenuPedagogique.Programmation#getSalle <em>Salle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salle</em>' attribute.
	 * @see #getSalle()
	 * @generated
	 */
	void setSalle(String value);

} // Programmation
