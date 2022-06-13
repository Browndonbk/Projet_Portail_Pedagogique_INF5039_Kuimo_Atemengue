/**
 */
package ContenuPedagogique.impl;

import ContenuPedagogique.ContenuPedagogiquePackage;
import ContenuPedagogique.Programmation;
import ContenuPedagogique.TypePROGR;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programmation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.impl.ProgrammationImpl#getType <em>Type</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.ProgrammationImpl#getJour <em>Jour</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.ProgrammationImpl#getHeure <em>Heure</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.ProgrammationImpl#getSalle <em>Salle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammationImpl extends MinimalEObjectImpl.Container implements Programmation {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypePROGR TYPE_EDEFAULT = TypePROGR.COURS_MAGISTRAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypePROGR type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJour() <em>Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJour()
	 * @generated
	 * @ordered
	 */
	protected static final String JOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJour() <em>Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJour()
	 * @generated
	 * @ordered
	 */
	protected String jour = JOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeure() <em>Heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeure()
	 * @generated
	 * @ordered
	 */
	protected static final String HEURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeure() <em>Heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeure()
	 * @generated
	 * @ordered
	 */
	protected String heure = HEURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalle() <em>Salle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalle()
	 * @generated
	 * @ordered
	 */
	protected static final String SALLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalle() <em>Salle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalle()
	 * @generated
	 * @ordered
	 */
	protected String salle = SALLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenuPedagogiquePackage.Literals.PROGRAMMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePROGR getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypePROGR newType) {
		TypePROGR oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.PROGRAMMATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJour() {
		return jour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJour(String newJour) {
		String oldJour = jour;
		jour = newJour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.PROGRAMMATION__JOUR, oldJour, jour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeure() {
		return heure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeure(String newHeure) {
		String oldHeure = heure;
		heure = newHeure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.PROGRAMMATION__HEURE, oldHeure, heure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSalle() {
		return salle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalle(String newSalle) {
		String oldSalle = salle;
		salle = newSalle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.PROGRAMMATION__SALLE, oldSalle, salle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContenuPedagogiquePackage.PROGRAMMATION__TYPE:
				return getType();
			case ContenuPedagogiquePackage.PROGRAMMATION__JOUR:
				return getJour();
			case ContenuPedagogiquePackage.PROGRAMMATION__HEURE:
				return getHeure();
			case ContenuPedagogiquePackage.PROGRAMMATION__SALLE:
				return getSalle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContenuPedagogiquePackage.PROGRAMMATION__TYPE:
				setType((TypePROGR)newValue);
				return;
			case ContenuPedagogiquePackage.PROGRAMMATION__JOUR:
				setJour((String)newValue);
				return;
			case ContenuPedagogiquePackage.PROGRAMMATION__HEURE:
				setHeure((String)newValue);
				return;
			case ContenuPedagogiquePackage.PROGRAMMATION__SALLE:
				setSalle((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContenuPedagogiquePackage.PROGRAMMATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.PROGRAMMATION__JOUR:
				setJour(JOUR_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.PROGRAMMATION__HEURE:
				setHeure(HEURE_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.PROGRAMMATION__SALLE:
				setSalle(SALLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContenuPedagogiquePackage.PROGRAMMATION__TYPE:
				return type != TYPE_EDEFAULT;
			case ContenuPedagogiquePackage.PROGRAMMATION__JOUR:
				return JOUR_EDEFAULT == null ? jour != null : !JOUR_EDEFAULT.equals(jour);
			case ContenuPedagogiquePackage.PROGRAMMATION__HEURE:
				return HEURE_EDEFAULT == null ? heure != null : !HEURE_EDEFAULT.equals(heure);
			case ContenuPedagogiquePackage.PROGRAMMATION__SALLE:
				return SALLE_EDEFAULT == null ? salle != null : !SALLE_EDEFAULT.equals(salle);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", jour: ");
		result.append(jour);
		result.append(", heure: ");
		result.append(heure);
		result.append(", salle: ");
		result.append(salle);
		result.append(')');
		return result.toString();
	}

} //ProgrammationImpl
