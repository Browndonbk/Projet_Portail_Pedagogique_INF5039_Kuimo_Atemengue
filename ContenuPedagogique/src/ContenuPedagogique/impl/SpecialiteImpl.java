/**
 */
package ContenuPedagogique.impl;

import ContenuPedagogique.ContenuPedagogiquePackage;
import ContenuPedagogique.ContenuPedagogiqueTables;
import ContenuPedagogique.Semestre;
import ContenuPedagogique.Specialite;

import ContenuPedagogique.TypeUE;
import ContenuPedagogique.Ue;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ContenuPedagogique.impl.SpecialiteImpl#getSemestres <em>Semestres</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.SpecialiteImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link ContenuPedagogique.impl.SpecialiteImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialiteImpl extends MinimalEObjectImpl.Container implements Specialite {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenuPedagogiquePackage.Literals.SPECIALITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semestre> getSemestres() {
		if (semestres == null) {
			semestres = new EObjectContainmentEList<Semestre>(Semestre.class, this, ContenuPedagogiquePackage.SPECIALITE__SEMESTRES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.SPECIALITE__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenuPedagogiquePackage.SPECIALITE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UeSpeAM1(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Specialite::UeSpeAM1";
		try {
			/**
			 *
			 * inv UeSpeAM1:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.semestres.ues->exists(ue | ue.type = TypeUE::Specialisee)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContenuPedagogiquePackage.Literals.SPECIALITE___UE_SPE_AM1__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContenuPedagogiqueTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Semestre> semestres = this.getSemestres();
				final /*@NonInvalid*/ OrderedSetValue BOXED_semestres = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(ContenuPedagogiqueTables.SEQ_CLSSid_Ue);
				Iterator<Object> ITERATOR__1 = BOXED_semestres.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Semestre _1 = (Semestre)ITERATOR__1.next();
					/**
					 * ues
					 */
					final /*@NonInvalid*/ List<Ue> ues = _1.getUes();
					final /*@NonInvalid*/ OrderedSetValue BOXED_ues = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Ue, ues);
					//
					for (Object value : BOXED_ues.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_ue = collect.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_ue.hasNext()) {
						if (accumulator_0 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator_0;
						}
						break;
					}
					/*@NonInvalid*/ Ue ue = (Ue)ITERATOR_ue.next();
					/**
					 * ue.type = TypeUE::Specialisee
					 */
					final /*@NonInvalid*/ TypeUE type = ue.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null : ContenuPedagogiqueTables.ENUMid_TypeUE.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_type == ContenuPedagogiqueTables.ELITid_Specialisee;
					//
					if (eq) {					// Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break;														// Stop immediately
					}
					else if (!eq) {				// Normal unsuccessful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ContenuPedagogiqueTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenuPedagogiquePackage.SPECIALITE__SEMESTRES:
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
			case ContenuPedagogiquePackage.SPECIALITE__SEMESTRES:
				return getSemestres();
			case ContenuPedagogiquePackage.SPECIALITE__NOM:
				return getNom();
			case ContenuPedagogiquePackage.SPECIALITE__DESCRIPTION:
				return getDescription();
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
			case ContenuPedagogiquePackage.SPECIALITE__SEMESTRES:
				getSemestres().clear();
				getSemestres().addAll((Collection<? extends Semestre>)newValue);
				return;
			case ContenuPedagogiquePackage.SPECIALITE__NOM:
				setNom((String)newValue);
				return;
			case ContenuPedagogiquePackage.SPECIALITE__DESCRIPTION:
				setDescription((String)newValue);
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
			case ContenuPedagogiquePackage.SPECIALITE__SEMESTRES:
				getSemestres().clear();
				return;
			case ContenuPedagogiquePackage.SPECIALITE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case ContenuPedagogiquePackage.SPECIALITE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ContenuPedagogiquePackage.SPECIALITE__SEMESTRES:
				return semestres != null && !semestres.isEmpty();
			case ContenuPedagogiquePackage.SPECIALITE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case ContenuPedagogiquePackage.SPECIALITE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ContenuPedagogiquePackage.SPECIALITE___UE_SPE_AM1__DIAGNOSTICCHAIN_MAP:
				return UeSpeAM1((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(')');
		return result.toString();
	}

} //SpecialiteImpl
