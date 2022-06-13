/**
 */
package ContenuPedagogique.impl;

import ContenuPedagogique.ContenuPedagogiquePackage;
import ContenuPedagogique.Enseignant;
import ContenuPedagogique.Niveau;
import ContenuPedagogique.Semestre;
import ContenuPedagogique.Specialite;
import ContenuPedagogique.Ue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Niveau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.impl.NiveauImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.NiveauImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.NiveauImpl#getResponsablite <em>Responsablite</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.NiveauImpl#getUes <em>Ues</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.NiveauImpl#getSpecialites <em>Specialites</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.NiveauImpl#getSemestres <em>Semestres</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.NiveauImpl#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NiveauImpl extends MinimalEObjectImpl.Container implements Niveau {
	/**
	 * The default value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected static final int NIVEAU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected int niveau = NIVEAU_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponsablite() <em>Responsablite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsablite()
	 * @generated
	 * @ordered
	 */
	protected Enseignant responsablite;

	/**
	 * The cached value of the '{@link #getUes() <em>Ues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUes()
	 * @generated
	 * @ordered
	 */
	protected EList<Ue> ues;

	/**
	 * The cached value of the '{@link #getSpecialites() <em>Specialites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialites()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialite> specialites;

	/**
	 * The cached value of the '{@link #getSemestres() <em>Semestres</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemestres()
	 * @generated
	 * @ordered
	 */
	protected EList<Semestre> semestres;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NiveauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenuPedagogiquePackage.Literals.NIVEAU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNiveau() {
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveau(int newNiveau) {
		int oldNiveau = niveau;
		niveau = newNiveau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.NIVEAU__NIVEAU, oldNiveau, niveau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.NIVEAU__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant getResponsablite() {
		if (responsablite != null && responsablite.eIsProxy()) {
			InternalEObject oldResponsablite = (InternalEObject)responsablite;
			responsablite = (Enseignant)eResolveProxy(oldResponsablite);
			if (responsablite != oldResponsablite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenuPedagogiquePackage.NIVEAU__RESPONSABLITE, oldResponsablite, responsablite));
			}
		}
		return responsablite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant basicGetResponsablite() {
		return responsablite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsablite(Enseignant newResponsablite, NotificationChain msgs) {
		Enseignant oldResponsablite = responsablite;
		responsablite = newResponsablite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.NIVEAU__RESPONSABLITE, oldResponsablite, newResponsablite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsablite(Enseignant newResponsablite) {
		if (newResponsablite != responsablite) {
			NotificationChain msgs = null;
			if (responsablite != null)
				msgs = ((InternalEObject)responsablite).eInverseRemove(this, ContenuPedagogiquePackage.ENSEIGNANT__RESPONSABLE, Enseignant.class, msgs);
			if (newResponsablite != null)
				msgs = ((InternalEObject)newResponsablite).eInverseAdd(this, ContenuPedagogiquePackage.ENSEIGNANT__RESPONSABLE, Enseignant.class, msgs);
			msgs = basicSetResponsablite(newResponsablite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.NIVEAU__RESPONSABLITE, newResponsablite, newResponsablite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ue> getUes() {
		if (ues == null) {
			ues = new EObjectContainmentEList<Ue>(Ue.class, this, ContenuPedagogiquePackage.NIVEAU__UES);
		}
		return ues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialite> getSpecialites() {
		if (specialites == null) {
			specialites = new EObjectContainmentEList<Specialite>(Specialite.class, this, ContenuPedagogiquePackage.NIVEAU__SPECIALITES);
		}
		return specialites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semestre> getSemestres() {
		if (semestres == null) {
			semestres = new EObjectContainmentEList<Semestre>(Semestre.class, this, ContenuPedagogiquePackage.NIVEAU__SEMESTRES);
		}
		return semestres;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.NIVEAU__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenuPedagogiquePackage.NIVEAU__RESPONSABLITE:
				if (responsablite != null)
					msgs = ((InternalEObject)responsablite).eInverseRemove(this, ContenuPedagogiquePackage.ENSEIGNANT__RESPONSABLE, Enseignant.class, msgs);
				return basicSetResponsablite((Enseignant)otherEnd, msgs);
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
			case ContenuPedagogiquePackage.NIVEAU__RESPONSABLITE:
				return basicSetResponsablite(null, msgs);
			case ContenuPedagogiquePackage.NIVEAU__UES:
				return ((InternalEList<?>)getUes()).basicRemove(otherEnd, msgs);
			case ContenuPedagogiquePackage.NIVEAU__SPECIALITES:
				return ((InternalEList<?>)getSpecialites()).basicRemove(otherEnd, msgs);
			case ContenuPedagogiquePackage.NIVEAU__SEMESTRES:
				return ((InternalEList<?>)getSemestres()).basicRemove(otherEnd, msgs);
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
			case ContenuPedagogiquePackage.NIVEAU__NIVEAU:
				return getNiveau();
			case ContenuPedagogiquePackage.NIVEAU__DESCRIPTION:
				return getDescription();
			case ContenuPedagogiquePackage.NIVEAU__RESPONSABLITE:
				if (resolve) return getResponsablite();
				return basicGetResponsablite();
			case ContenuPedagogiquePackage.NIVEAU__UES:
				return getUes();
			case ContenuPedagogiquePackage.NIVEAU__SPECIALITES:
				return getSpecialites();
			case ContenuPedagogiquePackage.NIVEAU__SEMESTRES:
				return getSemestres();
			case ContenuPedagogiquePackage.NIVEAU__NOM:
				return getNom();
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
			case ContenuPedagogiquePackage.NIVEAU__NIVEAU:
				setNiveau((Integer)newValue);
				return;
			case ContenuPedagogiquePackage.NIVEAU__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContenuPedagogiquePackage.NIVEAU__RESPONSABLITE:
				setResponsablite((Enseignant)newValue);
				return;
			case ContenuPedagogiquePackage.NIVEAU__UES:
				getUes().clear();
				getUes().addAll((Collection<? extends Ue>)newValue);
				return;
			case ContenuPedagogiquePackage.NIVEAU__SPECIALITES:
				getSpecialites().clear();
				getSpecialites().addAll((Collection<? extends Specialite>)newValue);
				return;
			case ContenuPedagogiquePackage.NIVEAU__SEMESTRES:
				getSemestres().clear();
				getSemestres().addAll((Collection<? extends Semestre>)newValue);
				return;
			case ContenuPedagogiquePackage.NIVEAU__NOM:
				setNom((String)newValue);
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
			case ContenuPedagogiquePackage.NIVEAU__NIVEAU:
				setNiveau(NIVEAU_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.NIVEAU__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.NIVEAU__RESPONSABLITE:
				setResponsablite((Enseignant)null);
				return;
			case ContenuPedagogiquePackage.NIVEAU__UES:
				getUes().clear();
				return;
			case ContenuPedagogiquePackage.NIVEAU__SPECIALITES:
				getSpecialites().clear();
				return;
			case ContenuPedagogiquePackage.NIVEAU__SEMESTRES:
				getSemestres().clear();
				return;
			case ContenuPedagogiquePackage.NIVEAU__NOM:
				setNom(NOM_EDEFAULT);
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
			case ContenuPedagogiquePackage.NIVEAU__NIVEAU:
				return niveau != NIVEAU_EDEFAULT;
			case ContenuPedagogiquePackage.NIVEAU__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ContenuPedagogiquePackage.NIVEAU__RESPONSABLITE:
				return responsablite != null;
			case ContenuPedagogiquePackage.NIVEAU__UES:
				return ues != null && !ues.isEmpty();
			case ContenuPedagogiquePackage.NIVEAU__SPECIALITES:
				return specialites != null && !specialites.isEmpty();
			case ContenuPedagogiquePackage.NIVEAU__SEMESTRES:
				return semestres != null && !semestres.isEmpty();
			case ContenuPedagogiquePackage.NIVEAU__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
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
		result.append(" (niveau: ");
		result.append(niveau);
		result.append(", description: ");
		result.append(description);
		result.append(", nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //NiveauImpl
