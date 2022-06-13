/**
 */
package ContenuPedagogique.impl;

import ContenuPedagogique.ContenuPedagogiquePackage;
import ContenuPedagogique.Departement;
import ContenuPedagogique.Enseignant;
import ContenuPedagogique.Formation;

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
 * An implementation of the model object '<em><b>Departement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.impl.DepartementImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.DepartementImpl#getEnseignants <em>Enseignants</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.DepartementImpl#getFormations <em>Formations</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.DepartementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.DepartementImpl#getDirige <em>Dirige</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.DepartementImpl#getTelDept <em>Tel Dept</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.DepartementImpl#getPOBoxDept <em>PO Box Dept</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.DepartementImpl#getAcces <em>Acces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartementImpl extends MinimalEObjectImpl.Container implements Departement {
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
	 * The cached value of the '{@link #getEnseignants() <em>Enseignants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnseignants()
	 * @generated
	 * @ordered
	 */
	protected EList<Enseignant> enseignants;

	/**
	 * The cached value of the '{@link #getFormations() <em>Formations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormations()
	 * @generated
	 * @ordered
	 */
	protected EList<Formation> formations;

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
	 * The cached value of the '{@link #getDirige() <em>Dirige</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirige()
	 * @generated
	 * @ordered
	 */
	protected Enseignant dirige;

	/**
	 * The default value of the '{@link #getTelDept() <em>Tel Dept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelDept()
	 * @generated
	 * @ordered
	 */
	protected static final String TEL_DEPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelDept() <em>Tel Dept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelDept()
	 * @generated
	 * @ordered
	 */
	protected String telDept = TEL_DEPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPOBoxDept() <em>PO Box Dept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOBoxDept()
	 * @generated
	 * @ordered
	 */
	protected static final String PO_BOX_DEPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPOBoxDept() <em>PO Box Dept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOBoxDept()
	 * @generated
	 * @ordered
	 */
	protected String poBoxDept = PO_BOX_DEPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcces() <em>Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcces()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcces() <em>Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcces()
	 * @generated
	 * @ordered
	 */
	protected String acces = ACCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenuPedagogiquePackage.Literals.DEPARTEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.DEPARTEMENT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enseignant> getEnseignants() {
		if (enseignants == null) {
			enseignants = new EObjectContainmentEList<Enseignant>(Enseignant.class, this, ContenuPedagogiquePackage.DEPARTEMENT__ENSEIGNANTS);
		}
		return enseignants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formation> getFormations() {
		if (formations == null) {
			formations = new EObjectContainmentEList<Formation>(Formation.class, this, ContenuPedagogiquePackage.DEPARTEMENT__FORMATIONS);
		}
		return formations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.DEPARTEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant getDirige() {
		if (dirige != null && dirige.eIsProxy()) {
			InternalEObject oldDirige = (InternalEObject)dirige;
			dirige = (Enseignant)eResolveProxy(oldDirige);
			if (dirige != oldDirige) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenuPedagogiquePackage.DEPARTEMENT__DIRIGE, oldDirige, dirige));
			}
		}
		return dirige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant basicGetDirige() {
		return dirige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirige(Enseignant newDirige, NotificationChain msgs) {
		Enseignant oldDirige = dirige;
		dirige = newDirige;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.DEPARTEMENT__DIRIGE, oldDirige, newDirige);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirige(Enseignant newDirige) {
		if (newDirige != dirige) {
			NotificationChain msgs = null;
			if (dirige != null)
				msgs = ((InternalEObject)dirige).eInverseRemove(this, ContenuPedagogiquePackage.ENSEIGNANT__CHEF, Enseignant.class, msgs);
			if (newDirige != null)
				msgs = ((InternalEObject)newDirige).eInverseAdd(this, ContenuPedagogiquePackage.ENSEIGNANT__CHEF, Enseignant.class, msgs);
			msgs = basicSetDirige(newDirige, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.DEPARTEMENT__DIRIGE, newDirige, newDirige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelDept() {
		return telDept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelDept(String newTelDept) {
		String oldTelDept = telDept;
		telDept = newTelDept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.DEPARTEMENT__TEL_DEPT, oldTelDept, telDept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPOBoxDept() {
		return poBoxDept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPOBoxDept(String newPOBoxDept) {
		String oldPOBoxDept = poBoxDept;
		poBoxDept = newPOBoxDept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.DEPARTEMENT__PO_BOX_DEPT, oldPOBoxDept, poBoxDept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcces() {
		return acces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcces(String newAcces) {
		String oldAcces = acces;
		acces = newAcces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.DEPARTEMENT__ACCES, oldAcces, acces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenuPedagogiquePackage.DEPARTEMENT__DIRIGE:
				if (dirige != null)
					msgs = ((InternalEObject)dirige).eInverseRemove(this, ContenuPedagogiquePackage.ENSEIGNANT__CHEF, Enseignant.class, msgs);
				return basicSetDirige((Enseignant)otherEnd, msgs);
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
			case ContenuPedagogiquePackage.DEPARTEMENT__ENSEIGNANTS:
				return ((InternalEList<?>)getEnseignants()).basicRemove(otherEnd, msgs);
			case ContenuPedagogiquePackage.DEPARTEMENT__FORMATIONS:
				return ((InternalEList<?>)getFormations()).basicRemove(otherEnd, msgs);
			case ContenuPedagogiquePackage.DEPARTEMENT__DIRIGE:
				return basicSetDirige(null, msgs);
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
			case ContenuPedagogiquePackage.DEPARTEMENT__NOM:
				return getNom();
			case ContenuPedagogiquePackage.DEPARTEMENT__ENSEIGNANTS:
				return getEnseignants();
			case ContenuPedagogiquePackage.DEPARTEMENT__FORMATIONS:
				return getFormations();
			case ContenuPedagogiquePackage.DEPARTEMENT__DESCRIPTION:
				return getDescription();
			case ContenuPedagogiquePackage.DEPARTEMENT__DIRIGE:
				if (resolve) return getDirige();
				return basicGetDirige();
			case ContenuPedagogiquePackage.DEPARTEMENT__TEL_DEPT:
				return getTelDept();
			case ContenuPedagogiquePackage.DEPARTEMENT__PO_BOX_DEPT:
				return getPOBoxDept();
			case ContenuPedagogiquePackage.DEPARTEMENT__ACCES:
				return getAcces();
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
			case ContenuPedagogiquePackage.DEPARTEMENT__NOM:
				setNom((String)newValue);
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__ENSEIGNANTS:
				getEnseignants().clear();
				getEnseignants().addAll((Collection<? extends Enseignant>)newValue);
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__FORMATIONS:
				getFormations().clear();
				getFormations().addAll((Collection<? extends Formation>)newValue);
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__DIRIGE:
				setDirige((Enseignant)newValue);
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__TEL_DEPT:
				setTelDept((String)newValue);
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__PO_BOX_DEPT:
				setPOBoxDept((String)newValue);
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__ACCES:
				setAcces((String)newValue);
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
			case ContenuPedagogiquePackage.DEPARTEMENT__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__ENSEIGNANTS:
				getEnseignants().clear();
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__FORMATIONS:
				getFormations().clear();
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__DIRIGE:
				setDirige((Enseignant)null);
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__TEL_DEPT:
				setTelDept(TEL_DEPT_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__PO_BOX_DEPT:
				setPOBoxDept(PO_BOX_DEPT_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.DEPARTEMENT__ACCES:
				setAcces(ACCES_EDEFAULT);
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
			case ContenuPedagogiquePackage.DEPARTEMENT__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case ContenuPedagogiquePackage.DEPARTEMENT__ENSEIGNANTS:
				return enseignants != null && !enseignants.isEmpty();
			case ContenuPedagogiquePackage.DEPARTEMENT__FORMATIONS:
				return formations != null && !formations.isEmpty();
			case ContenuPedagogiquePackage.DEPARTEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ContenuPedagogiquePackage.DEPARTEMENT__DIRIGE:
				return dirige != null;
			case ContenuPedagogiquePackage.DEPARTEMENT__TEL_DEPT:
				return TEL_DEPT_EDEFAULT == null ? telDept != null : !TEL_DEPT_EDEFAULT.equals(telDept);
			case ContenuPedagogiquePackage.DEPARTEMENT__PO_BOX_DEPT:
				return PO_BOX_DEPT_EDEFAULT == null ? poBoxDept != null : !PO_BOX_DEPT_EDEFAULT.equals(poBoxDept);
			case ContenuPedagogiquePackage.DEPARTEMENT__ACCES:
				return ACCES_EDEFAULT == null ? acces != null : !ACCES_EDEFAULT.equals(acces);
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
		result.append(", description: ");
		result.append(description);
		result.append(", TelDept: ");
		result.append(telDept);
		result.append(", POBoxDept: ");
		result.append(poBoxDept);
		result.append(", acces: ");
		result.append(acces);
		result.append(')');
		return result.toString();
	}

} //DepartementImpl
