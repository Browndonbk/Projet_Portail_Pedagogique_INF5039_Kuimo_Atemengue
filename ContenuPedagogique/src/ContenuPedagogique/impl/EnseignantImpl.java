/**
 */
package ContenuPedagogique.impl;

import ContenuPedagogique.ContenuPedagogiquePackage;
import ContenuPedagogique.Departement;
import ContenuPedagogique.Enseignant;
import ContenuPedagogique.Niveau;
import ContenuPedagogique.Ue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enseignant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.impl.EnseignantImpl#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.EnseignantImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.EnseignantImpl#getEnseigne <em>Enseigne</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.EnseignantImpl#getChef <em>Chef</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.EnseignantImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.EnseignantImpl#getBureau <em>Bureau</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnseignantImpl extends MinimalEObjectImpl.Container implements Enseignant {
	/**
	 * The cached value of the '{@link #getResponsable() <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsable()
	 * @generated
	 * @ordered
	 */
	protected Niveau responsable;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnseigne() <em>Enseigne</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnseigne()
	 * @generated
	 * @ordered
	 */
	protected EList<Ue> enseigne;

	/**
	 * The cached value of the '{@link #getChef() <em>Chef</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChef()
	 * @generated
	 * @ordered
	 */
	protected Departement chef;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBureau() <em>Bureau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBureau()
	 * @generated
	 * @ordered
	 */
	protected static final String BUREAU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBureau() <em>Bureau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBureau()
	 * @generated
	 * @ordered
	 */
	protected String bureau = BUREAU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnseignantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenuPedagogiquePackage.Literals.ENSEIGNANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Niveau getResponsable() {
		if (responsable != null && responsable.eIsProxy()) {
			InternalEObject oldResponsable = (InternalEObject)responsable;
			responsable = (Niveau)eResolveProxy(oldResponsable);
			if (responsable != oldResponsable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenuPedagogiquePackage.ENSEIGNANT__RESPONSABLE, oldResponsable, responsable));
			}
		}
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Niveau basicGetResponsable() {
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsable(Niveau newResponsable, NotificationChain msgs) {
		Niveau oldResponsable = responsable;
		responsable = newResponsable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.ENSEIGNANT__RESPONSABLE, oldResponsable, newResponsable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsable(Niveau newResponsable) {
		if (newResponsable != responsable) {
			NotificationChain msgs = null;
			if (responsable != null)
				msgs = ((InternalEObject)responsable).eInverseRemove(this, ContenuPedagogiquePackage.NIVEAU__RESPONSABLITE, Niveau.class, msgs);
			if (newResponsable != null)
				msgs = ((InternalEObject)newResponsable).eInverseAdd(this, ContenuPedagogiquePackage.NIVEAU__RESPONSABLITE, Niveau.class, msgs);
			msgs = basicSetResponsable(newResponsable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.ENSEIGNANT__RESPONSABLE, newResponsable, newResponsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.ENSEIGNANT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ue> getEnseigne() {
		if (enseigne == null) {
			enseigne = new EObjectWithInverseResolvingEList<Ue>(Ue.class, this, ContenuPedagogiquePackage.ENSEIGNANT__ENSEIGNE, ContenuPedagogiquePackage.UE__EST_ENSEIGNE);
		}
		return enseigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departement getChef() {
		if (chef != null && chef.eIsProxy()) {
			InternalEObject oldChef = (InternalEObject)chef;
			chef = (Departement)eResolveProxy(oldChef);
			if (chef != oldChef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenuPedagogiquePackage.ENSEIGNANT__CHEF, oldChef, chef));
			}
		}
		return chef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departement basicGetChef() {
		return chef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChef(Departement newChef, NotificationChain msgs) {
		Departement oldChef = chef;
		chef = newChef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.ENSEIGNANT__CHEF, oldChef, newChef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChef(Departement newChef) {
		if (newChef != chef) {
			NotificationChain msgs = null;
			if (chef != null)
				msgs = ((InternalEObject)chef).eInverseRemove(this, ContenuPedagogiquePackage.DEPARTEMENT__DIRIGE, Departement.class, msgs);
			if (newChef != null)
				msgs = ((InternalEObject)newChef).eInverseAdd(this, ContenuPedagogiquePackage.DEPARTEMENT__DIRIGE, Departement.class, msgs);
			msgs = basicSetChef(newChef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.ENSEIGNANT__CHEF, newChef, newChef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.ENSEIGNANT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBureau() {
		return bureau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBureau(String newBureau) {
		String oldBureau = bureau;
		bureau = newBureau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.ENSEIGNANT__BUREAU, oldBureau, bureau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenuPedagogiquePackage.ENSEIGNANT__RESPONSABLE:
				if (responsable != null)
					msgs = ((InternalEObject)responsable).eInverseRemove(this, ContenuPedagogiquePackage.NIVEAU__RESPONSABLITE, Niveau.class, msgs);
				return basicSetResponsable((Niveau)otherEnd, msgs);
			case ContenuPedagogiquePackage.ENSEIGNANT__ENSEIGNE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnseigne()).basicAdd(otherEnd, msgs);
			case ContenuPedagogiquePackage.ENSEIGNANT__CHEF:
				if (chef != null)
					msgs = ((InternalEObject)chef).eInverseRemove(this, ContenuPedagogiquePackage.DEPARTEMENT__DIRIGE, Departement.class, msgs);
				return basicSetChef((Departement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenuPedagogiquePackage.ENSEIGNANT__RESPONSABLE:
				return basicSetResponsable(null, msgs);
			case ContenuPedagogiquePackage.ENSEIGNANT__ENSEIGNE:
				return ((InternalEList<?>)getEnseigne()).basicRemove(otherEnd, msgs);
			case ContenuPedagogiquePackage.ENSEIGNANT__CHEF:
				return basicSetChef(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContenuPedagogiquePackage.ENSEIGNANT__RESPONSABLE:
				if (resolve) return getResponsable();
				return basicGetResponsable();
			case ContenuPedagogiquePackage.ENSEIGNANT__NOM:
				return getNom();
			case ContenuPedagogiquePackage.ENSEIGNANT__ENSEIGNE:
				return getEnseigne();
			case ContenuPedagogiquePackage.ENSEIGNANT__CHEF:
				if (resolve) return getChef();
				return basicGetChef();
			case ContenuPedagogiquePackage.ENSEIGNANT__EMAIL:
				return getEmail();
			case ContenuPedagogiquePackage.ENSEIGNANT__BUREAU:
				return getBureau();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContenuPedagogiquePackage.ENSEIGNANT__RESPONSABLE:
				setResponsable((Niveau)newValue);
				return;
			case ContenuPedagogiquePackage.ENSEIGNANT__NOM:
				setNom((String)newValue);
				return;
			case ContenuPedagogiquePackage.ENSEIGNANT__ENSEIGNE:
				getEnseigne().clear();
				getEnseigne().addAll((Collection<? extends Ue>)newValue);
				return;
			case ContenuPedagogiquePackage.ENSEIGNANT__CHEF:
				setChef((Departement)newValue);
				return;
			case ContenuPedagogiquePackage.ENSEIGNANT__EMAIL:
				setEmail((String)newValue);
				return;
			case ContenuPedagogiquePackage.ENSEIGNANT__BUREAU:
				setBureau((String)newValue);
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
			case ContenuPedagogiquePackage.ENSEIGNANT__RESPONSABLE:
				setResponsable((Niveau)null);
				return;
			case ContenuPedagogiquePackage.ENSEIGNANT__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.ENSEIGNANT__ENSEIGNE:
				getEnseigne().clear();
				return;
			case ContenuPedagogiquePackage.ENSEIGNANT__CHEF:
				setChef((Departement)null);
				return;
			case ContenuPedagogiquePackage.ENSEIGNANT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.ENSEIGNANT__BUREAU:
				setBureau(BUREAU_EDEFAULT);
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
			case ContenuPedagogiquePackage.ENSEIGNANT__RESPONSABLE:
				return responsable != null;
			case ContenuPedagogiquePackage.ENSEIGNANT__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case ContenuPedagogiquePackage.ENSEIGNANT__ENSEIGNE:
				return enseigne != null && !enseigne.isEmpty();
			case ContenuPedagogiquePackage.ENSEIGNANT__CHEF:
				return chef != null;
			case ContenuPedagogiquePackage.ENSEIGNANT__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ContenuPedagogiquePackage.ENSEIGNANT__BUREAU:
				return BUREAU_EDEFAULT == null ? bureau != null : !BUREAU_EDEFAULT.equals(bureau);
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", email: ");
		result.append(email);
		result.append(", bureau: ");
		result.append(bureau);
		result.append(')');
		return result.toString();
	}

} //EnseignantImpl
