/**
 */
package ContenuPedagogique.impl;

import ContenuPedagogique.ContenuPedagogiquePackage;
import ContenuPedagogique.ContenuPedagogiqueTables;
import ContenuPedagogique.Enseignant;
import ContenuPedagogique.Programmation;
import ContenuPedagogique.Ressource;
import ContenuPedagogique.Semestre;
import ContenuPedagogique.TypeUE;
import ContenuPedagogique.Ue;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

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
	protected static final TypeUE TYPE_EDEFAULT = TypeUE.OPTIONNELLE;

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
	public boolean UeSpe1Sem(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Ue::UeSpe1Sem";
		try {
			/**
			 *
			 * inv UeSpe1Sem:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.type = TypeUE::Specialisee implies
			 *         self.semestres->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContenuPedagogiquePackage.Literals.UE___UE_SPE1_SEM__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContenuPedagogiqueTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ TypeUE type = this.getType();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null : ContenuPedagogiqueTables.ENUMid_TypeUE.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
				final /*@NonInvalid*/ boolean eq = BOXED_type == ContenuPedagogiqueTables.ELITid_Specialisee;
				final /*@NonInvalid*/ Boolean result;
				if (!eq) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ List<Semestre> semestres = this.getSemestres();
					final /*@NonInvalid*/ OrderedSetValue BOXED_semestres = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres);
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_semestres);
					final /*@NonInvalid*/ boolean eq_0 = size.equals(ContenuPedagogiqueTables.INT_1);
					if (eq_0) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						result = ValueUtil.FALSE_VALUE;
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
	public boolean UeCodeDiff(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Ue::UeCodeDiff";
		try {
			/**
			 *
			 * inv UeCodeDiff:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = Ue.allInstances()
			 *         ->forAll(ue1, ue2 | ue1 <> ue2 implies ue1.code <> ue2.code)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContenuPedagogiquePackage.Literals.UE___UE_CODE_DIFF__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContenuPedagogiqueTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_ContenuPedagogique_c_c_Ue = idResolver.getClass(ContenuPedagogiqueTables.CLSSid_Ue, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, ContenuPedagogiqueTables.SET_CLSSid_Ue, TYP_ContenuPedagogique_c_c_Ue);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, allInstances);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * ue1 <> ue2 implies ue1.code <> ue2.code
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							@SuppressWarnings("unused")
							final /*@NonInvalid*/ SetValue allInstances = (SetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object ue1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object ue2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Ue local_0 = (Ue)ue1;
								final /*@NonInvalid*/ Ue local_1 = (Ue)ue2;
								final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1) : (local_1 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_ne_0;
									try {
										if (local_0 == null) {
											throw new InvalidValueException("Null source for \'\'http://www.ContenuPedagogique.com\'::Ue::code\'");
										}
										final /*@Thrown*/ String code = local_0.getCode();
										if (local_1 == null) {
											throw new InvalidValueException("Null source for \'\'http://www.ContenuPedagogique.com\'::Ue::code\'");
										}
										final /*@Thrown*/ String code_0 = local_1.getCode();
										final /*@Thrown*/ boolean ne_0 = (code != null) ? !code.equals(code_0) : (code_0 != null);
										CAUGHT_ne_0 = ne_0;
									}
									catch (Exception e) {
										CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_ne_0 == ValueUtil.TRUE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										if (CAUGHT_ne_0 instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_ne_0;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							}
							catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_result_0, allInstances, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ContenuPedagogiqueTables.INT_0).booleanValue();
				local_4 = logDiagnostic;
			}
			return local_4;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ContenuPedagogiquePackage.UE___UE_SPE1_SEM__DIAGNOSTICCHAIN_MAP:
				return UeSpe1Sem((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ContenuPedagogiquePackage.UE___UE_CODE_DIFF__DIAGNOSTICCHAIN_MAP:
				return UeCodeDiff((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
