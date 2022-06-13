/**
 */
package ContenuPedagogique.impl;

import ContenuPedagogique.ContenuPedagogiquePackage;
import ContenuPedagogique.Enseignant;
import ContenuPedagogique.Programmation;
import ContenuPedagogique.Ressource;
import ContenuPedagogique.Semestre;
import ContenuPedagogique.TypeUE;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.impl.UeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.UeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.UeImpl#getObjectif <em>Objectif</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.UeImpl#getType <em>Type</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.UeImpl#getRessources <em>Ressources</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.UeImpl#getSemestres <em>Semestres</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.UeImpl#getEstEnseigne <em>Est Enseigne</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.UeImpl#getContenu <em>Contenu</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.UeImpl#getCredit <em>Credit</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.UeImpl#getProgrammations <em>Programmations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UeImpl extends MinimalEObjectImpl.Container implements Ue {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
	 * The default value of the '{@link #getObjectif() <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectif() <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectif()
	 * @generated
	 * @ordered
	 */
	protected String objectif = OBJECTIF_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeUE TYPE_EDEFAULT = TypeUE.OBLIGATOIRE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeUE type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessources() <em>Ressources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessources()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressources;

	/**
	 * The cached value of the '{@link #getSemestres() <em>Semestres</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemestres()
	 * @generated
	 * @ordered
	 */
	protected EList<Semestre> semestres;

	/**
	 * The cached value of the '{@link #getEstEnseigne() <em>Est Enseigne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstEnseigne()
	 * @generated
	 * @ordered
	 */
	protected Enseignant estEnseigne;

	/**
	 * The default value of the '{@link #getContenu() <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContenu() <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected String contenu = CONTENU_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected int credit = CREDIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgrammations() <em>Programmations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammations()
	 * @generated
	 * @ordered
	 */
	protected EList<Programmation> programmations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenuPedagogiquePackage.Literals.UE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.UE__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.UE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectif() {
		return objectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectif(String newObjectif) {
		String oldObjectif = objectif;
		objectif = newObjectif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.UE__OBJECTIF, oldObjectif, objectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUE getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeUE newType) {
		TypeUE oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.UE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ressource> getRessources() {
		if (ressources == null) {
			ressources = new EObjectContainmentEList<Ressource>(Ressource.class, this, ContenuPedagogiquePackage.UE__RESSOURCES);
		}
		return ressources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semestre> getSemestres() {
		if (semestres == null) {
			semestres = new EObjectWithInverseResolvingEList.ManyInverse<Semestre>(Semestre.class, this, ContenuPedagogiquePackage.UE__SEMESTRES, ContenuPedagogiquePackage.SEMESTRE__UES);
		}
		return semestres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant getEstEnseigne() {
		if (estEnseigne != null && estEnseigne.eIsProxy()) {
			InternalEObject oldEstEnseigne = (InternalEObject)estEnseigne;
			estEnseigne = (Enseignant)eResolveProxy(oldEstEnseigne);
			if (estEnseigne != oldEstEnseigne) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenuPedagogiquePackage.UE__EST_ENSEIGNE, oldEstEnseigne, estEnseigne));
			}
		}
		return estEnseigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant basicGetEstEnseigne() {
		return estEnseigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstEnseigne(Enseignant newEstEnseigne, NotificationChain msgs) {
		Enseignant oldEstEnseigne = estEnseigne;
		estEnseigne = newEstEnseigne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.UE__EST_ENSEIGNE, oldEstEnseigne, newEstEnseigne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstEnseigne(Enseignant newEstEnseigne) {
		if (newEstEnseigne != estEnseigne) {
			NotificationChain msgs = null;
			if (estEnseigne != null)
				msgs = ((InternalEObject)estEnseigne).eInverseRemove(this, ContenuPedagogiquePackage.ENSEIGNANT__ENSEIGNE, Enseignant.class, msgs);
			if (newEstEnseigne != null)
				msgs = ((InternalEObject)newEstEnseigne).eInverseAdd(this, ContenuPedagogiquePackage.ENSEIGNANT__ENSEIGNE, Enseignant.class, msgs);
			msgs = basicSetEstEnseigne(newEstEnseigne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.UE__EST_ENSEIGNE, newEstEnseigne, newEstEnseigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContenu() {
		return contenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenu(String newContenu) {
		String oldContenu = contenu;
		contenu = newContenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.UE__CONTENU, oldContenu, contenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCredit() {
		return credit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredit(int newCredit) {
		int oldCredit = credit;
		credit = newCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.UE__CREDIT, oldCredit, credit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Programmation> getProgrammations() {
		if (programmations == null) {
			programmations = new EObjectContainmentEList<Programmation>(Programmation.class, this, ContenuPedagogiquePackage.UE__PROGRAMMATIONS);
		}
		return programmations;
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
			case ContenuPedagogiquePackage.UE__SEMESTRES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemestres()).basicAdd(otherEnd, msgs);
			case ContenuPedagogiquePackage.UE__EST_ENSEIGNE:
				if (estEnseigne != null)
					msgs = ((InternalEObject)estEnseigne).eInverseRemove(this, ContenuPedagogiquePackage.ENSEIGNANT__ENSEIGNE, Enseignant.class, msgs);
				return basicSetEstEnseigne((Enseignant)otherEnd, msgs);
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
			case ContenuPedagogiquePackage.UE__RESSOURCES:
				return ((InternalEList<?>)getRessources()).basicRemove(otherEnd, msgs);
			case ContenuPedagogiquePackage.UE__SEMESTRES:
				return ((InternalEList<?>)getSemestres()).basicRemove(otherEnd, msgs);
			case ContenuPedagogiquePackage.UE__EST_ENSEIGNE:
				return basicSetEstEnseigne(null, msgs);
			case ContenuPedagogiquePackage.UE__PROGRAMMATIONS:
				return ((InternalEList<?>)getProgrammations()).basicRemove(otherEnd, msgs);
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
			case ContenuPedagogiquePackage.UE__CODE:
				return getCode();
			case ContenuPedagogiquePackage.UE__NOM:
				return getNom();
			case ContenuPedagogiquePackage.UE__OBJECTIF:
				return getObjectif();
			case ContenuPedagogiquePackage.UE__TYPE:
				return getType();
			case ContenuPedagogiquePackage.UE__RESSOURCES:
				return getRessources();
			case ContenuPedagogiquePackage.UE__SEMESTRES:
				return getSemestres();
			case ContenuPedagogiquePackage.UE__EST_ENSEIGNE:
				if (resolve) return getEstEnseigne();
				return basicGetEstEnseigne();
			case ContenuPedagogiquePackage.UE__CONTENU:
				return getContenu();
			case ContenuPedagogiquePackage.UE__CREDIT:
				return getCredit();
			case ContenuPedagogiquePackage.UE__PROGRAMMATIONS:
				return getProgrammations();
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
			case ContenuPedagogiquePackage.UE__CODE:
				setCode((String)newValue);
				return;
			case ContenuPedagogiquePackage.UE__NOM:
				setNom((String)newValue);
				return;
			case ContenuPedagogiquePackage.UE__OBJECTIF:
				setObjectif((String)newValue);
				return;
			case ContenuPedagogiquePackage.UE__TYPE:
				setType((TypeUE)newValue);
				return;
			case ContenuPedagogiquePackage.UE__RESSOURCES:
				getRessources().clear();
				getRessources().addAll((Collection<? extends Ressource>)newValue);
				return;
			case ContenuPedagogiquePackage.UE__SEMESTRES:
				getSemestres().clear();
				getSemestres().addAll((Collection<? extends Semestre>)newValue);
				return;
			case ContenuPedagogiquePackage.UE__EST_ENSEIGNE:
				setEstEnseigne((Enseignant)newValue);
				return;
			case ContenuPedagogiquePackage.UE__CONTENU:
				setContenu((String)newValue);
				return;
			case ContenuPedagogiquePackage.UE__CREDIT:
				setCredit((Integer)newValue);
				return;
			case ContenuPedagogiquePackage.UE__PROGRAMMATIONS:
				getProgrammations().clear();
				getProgrammations().addAll((Collection<? extends Programmation>)newValue);
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
			case ContenuPedagogiquePackage.UE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.UE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.UE__OBJECTIF:
				setObjectif(OBJECTIF_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.UE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.UE__RESSOURCES:
				getRessources().clear();
				return;
			case ContenuPedagogiquePackage.UE__SEMESTRES:
				getSemestres().clear();
				return;
			case ContenuPedagogiquePackage.UE__EST_ENSEIGNE:
				setEstEnseigne((Enseignant)null);
				return;
			case ContenuPedagogiquePackage.UE__CONTENU:
				setContenu(CONTENU_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.UE__CREDIT:
				setCredit(CREDIT_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.UE__PROGRAMMATIONS:
				getProgrammations().clear();
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
			case ContenuPedagogiquePackage.UE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case ContenuPedagogiquePackage.UE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case ContenuPedagogiquePackage.UE__OBJECTIF:
				return OBJECTIF_EDEFAULT == null ? objectif != null : !OBJECTIF_EDEFAULT.equals(objectif);
			case ContenuPedagogiquePackage.UE__TYPE:
				return type != TYPE_EDEFAULT;
			case ContenuPedagogiquePackage.UE__RESSOURCES:
				return ressources != null && !ressources.isEmpty();
			case ContenuPedagogiquePackage.UE__SEMESTRES:
				return semestres != null && !semestres.isEmpty();
			case ContenuPedagogiquePackage.UE__EST_ENSEIGNE:
				return estEnseigne != null;
			case ContenuPedagogiquePackage.UE__CONTENU:
				return CONTENU_EDEFAULT == null ? contenu != null : !CONTENU_EDEFAULT.equals(contenu);
			case ContenuPedagogiquePackage.UE__CREDIT:
				return credit != CREDIT_EDEFAULT;
			case ContenuPedagogiquePackage.UE__PROGRAMMATIONS:
				return programmations != null && !programmations.isEmpty();
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
		result.append(" (code: ");
		result.append(code);
		result.append(", nom: ");
		result.append(nom);
		result.append(", objectif: ");
		result.append(objectif);
		result.append(", type: ");
		result.append(type);
		result.append(", Contenu: ");
		result.append(contenu);
		result.append(", credit: ");
		result.append(credit);
		result.append(')');
		return result.toString();
	}

} //UeImpl
