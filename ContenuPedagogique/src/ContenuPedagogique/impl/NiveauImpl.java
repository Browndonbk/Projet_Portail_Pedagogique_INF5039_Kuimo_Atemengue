/**
 */
package ContenuPedagogique.impl;

import ContenuPedagogique.ContenuPedagogiquePackage;
import ContenuPedagogique.ContenuPedagogiqueTables;
import ContenuPedagogique.Enseignant;
import ContenuPedagogique.Niveau;
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
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;
import org.eclipse.ocl.pivot.values.SetValue;

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
	public boolean PasSpeUe1Sem(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::PasSpeUe1Sem";
		try {
			/**
			 *
			 * inv PasSpeUe1Sem:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = specialites->size() = 0 implies
			 *         self.ues->forAll(ue | ue.semestres->size() = 1)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContenuPedagogiquePackage.Literals.NIVEAU___PAS_SPE_UE1_SEM__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContenuPedagogiqueTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Specialite> specialites = this.getSpecialites();
					final /*@NonInvalid*/ OrderedSetValue BOXED_specialites = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Specialite, specialites);
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_specialites);
					final /*@NonInvalid*/ boolean eq = size.equals(ContenuPedagogiqueTables.INT_0);
					final /*@Thrown*/ Boolean result;
					if (!eq) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ List<Ue> ues = this.getUes();
						final /*@NonInvalid*/ OrderedSetValue BOXED_ues = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Ue, ues);
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_ue = BOXED_ues.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_ue.hasNext()) {
								if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Ue ue = (Ue)ITERATOR_ue.next();
							/**
							 * ue.semestres->size() = 1
							 */
							final /*@NonInvalid*/ List<Semestre> semestres = ue.getSemestres();
							final /*@NonInvalid*/ OrderedSetValue BOXED_semestres = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres);
							final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_semestres);
							final /*@NonInvalid*/ boolean eq_0 = size_0.equals(ContenuPedagogiqueTables.INT_1);
							//
							if (!eq_0) {					// Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break;														// Stop immediately
							}
							else if (eq_0) {				// Normal successful body evaluation result
								;															// Carry on
							}
							else {															// Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (forAll == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ContenuPedagogiqueTables.INT_0).booleanValue();
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
	public boolean SemLieUeMemeNiv(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::SemLieUeMemeNiv";
		try {
			/**
			 *
			 * inv SemLieUeMemeNiv:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if specialites->size() = 0
			 *         then
			 *           self.semestres.ues->forAll(ue | self.ues->includes(ue))
			 *         else
			 *           self.specialites.semestres.ues->forAll(ue |
			 *             self.ues->includes(ue))
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContenuPedagogiquePackage.Literals.NIVEAU___SEM_LIE_UE_MEME_NIV__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContenuPedagogiqueTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Specialite> specialites = this.getSpecialites();
				final /*@NonInvalid*/ OrderedSetValue BOXED_specialites = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Specialite, specialites);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_specialites);
				final /*@NonInvalid*/ boolean eq = size.equals(ContenuPedagogiqueTables.INT_0);
				/*@NonInvalid*/ Boolean result;
				if (eq) {
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
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_ue = collect.iterator();
					/*@NonInvalid*/ Boolean forAll;
					while (true) {
						if (!ITERATOR_ue.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								forAll = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Ue ue = (Ue)ITERATOR_ue.next();
						/**
						 * self.ues->includes(ue)
						 */
						final /*@NonInvalid*/ List<Ue> ues_0 = this.getUes();
						final /*@NonInvalid*/ OrderedSetValue BOXED_ues_0 = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Ue, ues_0);
						final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_ues_0, ue).booleanValue();
						//
						if (!includes) {					// Normal unsuccessful body evaluation result
							forAll = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (includes) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else {															// Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					result = forAll;
				}
				else {
					/*@Thrown*/ Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(ContenuPedagogiqueTables.SEQ_CLSSid_Semestre);
					Iterator<Object> ITERATOR__1_0 = BOXED_specialites.iterator();
					/*@NonInvalid*/ SequenceValue collect_1;
					while (true) {
						if (!ITERATOR__1_0.hasNext()) {
							collect_1 = accumulator_1;
							break;
						}
						/*@NonInvalid*/ Specialite _1_0 = (Specialite)ITERATOR__1_0.next();
						/**
						 * semestres
						 */
						final /*@NonInvalid*/ List<Semestre> semestres_0 = _1_0.getSemestres();
						final /*@NonInvalid*/ OrderedSetValue BOXED_semestres_0 = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres_0);
						//
						for (Object value : BOXED_semestres_0.flatten().getElements()) {
							accumulator_1.add(value);
						}
					}
					/*@Thrown*/ Accumulator accumulator_2 = ValueUtil.createSequenceAccumulatorValue(ContenuPedagogiqueTables.SEQ_CLSSid_Ue);
					Iterator<Object> ITERATOR__1_1 = collect_1.iterator();
					/*@NonInvalid*/ SequenceValue collect_0;
					while (true) {
						if (!ITERATOR__1_1.hasNext()) {
							collect_0 = accumulator_2;
							break;
						}
						/*@NonInvalid*/ Semestre _1_1 = (Semestre)ITERATOR__1_1.next();
						/**
						 * ues
						 */
						final /*@NonInvalid*/ List<Ue> ues_1 = _1_1.getUes();
						final /*@NonInvalid*/ OrderedSetValue BOXED_ues_1 = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Ue, ues_1);
						//
						for (Object value : BOXED_ues_1.flatten().getElements()) {
							accumulator_2.add(value);
						}
					}
					/*@Thrown*/ Object accumulator_3 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_ue_0 = collect_0.iterator();
					/*@NonInvalid*/ Boolean forAll_0;
					while (true) {
						if (!ITERATOR_ue_0.hasNext()) {
							if (accumulator_3 == ValueUtil.TRUE_VALUE) {
								forAll_0 = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_3;
							}
							break;
						}
						/*@NonInvalid*/ Ue ue_0 = (Ue)ITERATOR_ue_0.next();
						/**
						 * self.ues->includes(ue)
						 */
						final /*@NonInvalid*/ List<Ue> ues_2 = this.getUes();
						final /*@NonInvalid*/ OrderedSetValue BOXED_ues_2 = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Ue, ues_2);
						final /*@NonInvalid*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_ues_2, ue_0).booleanValue();
						//
						if (!includes_0) {					// Normal unsuccessful body evaluation result
							forAll_0 = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (includes_0) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else {															// Impossible badly typed result
							accumulator_3 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					result = forAll_0;
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
	public boolean UeSpeLieSemSpeNiv(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::UeSpeLieSemSpeNiv";
		try {
			/**
			 *
			 * inv UeSpeLieSemSpeNiv:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.ues->forAll(ue | ue.type = TypeUE::Specialisee implies
			 *           ue.semestres->forAll(sem |
			 *             self.specialites.semestres->includes(sem)))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContenuPedagogiquePackage.Literals.NIVEAU___UE_SPE_LIE_SEM_SPE_NIV__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContenuPedagogiqueTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Ue> ues = this.getUes();
					final /*@NonInvalid*/ OrderedSetValue BOXED_ues = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Ue, ues);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_ue = BOXED_ues.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_ue.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Ue ue = (Ue)ITERATOR_ue.next();
						/**
						 * ue.type = TypeUE::Specialisee implies
						 * ue.semestres->forAll(sem | self.specialites.semestres->includes(sem))
						 */
						/*@Caught*/ Object CAUGHT_implies;
						try {
							final /*@NonInvalid*/ TypeUE type = ue.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null : ContenuPedagogiqueTables.ENUMid_TypeUE.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq = BOXED_type == ContenuPedagogiqueTables.ELITid_Specialisee;
							final /*@Thrown*/ Boolean implies;
							if (!eq) {
								implies = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@NonInvalid*/ List<Semestre> semestres = ue.getSemestres();
								final /*@NonInvalid*/ OrderedSetValue BOXED_semestres = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres);
								/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
								Iterator<Object> ITERATOR_sem = BOXED_semestres.iterator();
								/*@NonInvalid*/ Boolean forAll;
								while (true) {
									if (!ITERATOR_sem.hasNext()) {
										if (accumulator_0 == ValueUtil.TRUE_VALUE) {
											forAll = ValueUtil.TRUE_VALUE;
										}
										else {
											throw (InvalidValueException)accumulator_0;
										}
										break;
									}
									/*@NonInvalid*/ Semestre sem = (Semestre)ITERATOR_sem.next();
									/**
									 * self.specialites.semestres->includes(sem)
									 */
									final /*@NonInvalid*/ List<Specialite> specialites = this.getSpecialites();
									final /*@NonInvalid*/ OrderedSetValue BOXED_specialites = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Specialite, specialites);
									/*@Thrown*/ Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(ContenuPedagogiqueTables.SEQ_CLSSid_Semestre);
									Iterator<Object> ITERATOR__1 = BOXED_specialites.iterator();
									/*@NonInvalid*/ SequenceValue collect;
									while (true) {
										if (!ITERATOR__1.hasNext()) {
											collect = accumulator_1;
											break;
										}
										/*@NonInvalid*/ Specialite _1 = (Specialite)ITERATOR__1.next();
										/**
										 * semestres
										 */
										final /*@NonInvalid*/ List<Semestre> semestres_0 = _1.getSemestres();
										final /*@NonInvalid*/ OrderedSetValue BOXED_semestres_0 = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres_0);
										//
										for (Object value : BOXED_semestres_0.flatten().getElements()) {
											accumulator_1.add(value);
										}
									}
									final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(collect, sem).booleanValue();
									//
									if (!includes) {					// Normal unsuccessful body evaluation result
										forAll = ValueUtil.FALSE_VALUE;
										break;														// Stop immediately
									}
									else if (includes) {				// Normal successful body evaluation result
										;															// Carry on
									}
									else {															// Impossible badly typed result
										accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
									}
								}
								if (forAll == ValueUtil.TRUE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									if (forAll == null) {
										implies = null;
									}
									else {
										implies = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_implies = implies;
						}
						catch (Exception e) {
							CAUGHT_implies = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_implies == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_implies instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_implies;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ContenuPedagogiqueTables.INT_0).booleanValue();
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
	public boolean SiSemPasSpe(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::SiSemPasSpe";
		try {
			/**
			 *
			 * inv SiSemPasSpe:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = semestres->size() > 0 implies
			 *         specialites->size() = 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContenuPedagogiquePackage.Literals.NIVEAU___SI_SEM_PAS_SPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContenuPedagogiqueTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Semestre> semestres = this.getSemestres();
				final /*@NonInvalid*/ OrderedSetValue BOXED_semestres = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_semestres);
				final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, ContenuPedagogiqueTables.INT_0).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!gt) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ List<Specialite> specialites = this.getSpecialites();
					final /*@NonInvalid*/ OrderedSetValue BOXED_specialites = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Specialite, specialites);
					final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_specialites);
					final /*@NonInvalid*/ boolean eq = size_0.equals(ContenuPedagogiqueTables.INT_0);
					if (eq) {
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
	public boolean SiSemAlors2(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::SiSemAlors2";
		try {
			/**
			 *
			 * inv SiSemAlors2:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = specialites->oclIsUndefined() and
			 *         semestres->oclIsUndefined() = false implies
			 *         semestres->size() = 2
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContenuPedagogiquePackage.Literals.NIVEAU___SI_SEM_ALORS2__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContenuPedagogiqueTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Boolean and = ValueUtil.FALSE_VALUE;
					final /*@Thrown*/ Boolean result;
					if (and == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ List<Semestre> semestres = this.getSemestres();
						final /*@NonInvalid*/ OrderedSetValue BOXED_semestres = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres);
						final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_semestres);
						final /*@NonInvalid*/ boolean eq = size.equals(ContenuPedagogiqueTables.INT_2);
						if (eq) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (and == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ContenuPedagogiqueTables.INT_0).booleanValue();
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
	public boolean SiSpeUeFon1SemPSpe(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::SiSpeUeFon1SemPSpe";
		try {
			/**
			 *
			 * inv SiSpeUeFon1SemPSpe:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = specialites->size() > 0 implies
			 *         self.ues->forAll(ue | ue.type = TypeUE::Fondamentale implies
			 *           self.specialites->forAll(spe |
			 *             spe.semestres->one(sem | sem.ues->includes(ue))))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContenuPedagogiquePackage.Literals.NIVEAU___SI_SPE_UE_FON1_SEM_PSPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContenuPedagogiqueTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Specialite> specialites = this.getSpecialites();
					final /*@NonInvalid*/ OrderedSetValue BOXED_specialites = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Specialite, specialites);
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_specialites);
					final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, ContenuPedagogiqueTables.INT_0).booleanValue();
					final /*@Thrown*/ Boolean result;
					if (!gt) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final /*@NonInvalid*/ List<Ue> ues = this.getUes();
							final /*@NonInvalid*/ OrderedSetValue BOXED_ues = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Ue, ues);
							/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_ue = BOXED_ues.iterator();
							/*@Thrown*/ Boolean forAll;
							while (true) {
								if (!ITERATOR_ue.hasNext()) {
									if (accumulator == null) {
										forAll = null;
									}
									else if (accumulator == ValueUtil.TRUE_VALUE) {
										forAll = ValueUtil.TRUE_VALUE;
									}
									else {
										throw (InvalidValueException)accumulator;
									}
									break;
								}
								/*@NonInvalid*/ Ue ue = (Ue)ITERATOR_ue.next();
								/**
								 * ue.type = TypeUE::Fondamentale implies
								 * self.specialites->forAll(spe |
								 *   spe.semestres->one(sem | sem.ues->includes(ue)))
								 */
								/*@Caught*/ Object CAUGHT_implies;
								try {
									final /*@NonInvalid*/ TypeUE type = ue.getType();
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null : ContenuPedagogiqueTables.ENUMid_TypeUE.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
									final /*@NonInvalid*/ boolean eq = BOXED_type == ContenuPedagogiqueTables.ELITid_Fondamentale;
									final /*@Thrown*/ Boolean implies;
									if (!eq) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
										Iterator<Object> ITERATOR_spe = BOXED_specialites.iterator();
										/*@NonInvalid*/ Boolean forAll_0;
										while (true) {
											if (!ITERATOR_spe.hasNext()) {
												if (accumulator_0 == ValueUtil.TRUE_VALUE) {
													forAll_0 = ValueUtil.TRUE_VALUE;
												}
												else {
													throw (InvalidValueException)accumulator_0;
												}
												break;
											}
											/*@NonInvalid*/ Specialite spe = (Specialite)ITERATOR_spe.next();
											/**
											 * spe.semestres->one(sem | sem.ues->includes(ue))
											 */
											final /*@NonInvalid*/ List<Semestre> semestres = spe.getSemestres();
											final /*@NonInvalid*/ OrderedSetValue BOXED_semestres = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres);
											/*@Thrown*/ boolean accumulator_1 = ValueUtil.FALSE_VALUE;
											Iterator<Object> ITERATOR_sem = BOXED_semestres.iterator();
											/*@NonInvalid*/ boolean one;
											while (true) {
												if (!ITERATOR_sem.hasNext()) {
													one = accumulator_1;
													break;
												}
												/*@NonInvalid*/ Semestre sem = (Semestre)ITERATOR_sem.next();
												/**
												 * sem.ues->includes(ue)
												 */
												final /*@NonInvalid*/ List<Ue> ues_0 = sem.getUes();
												final /*@NonInvalid*/ OrderedSetValue BOXED_ues_0 = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Ue, ues_0);
												final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_ues_0, ue).booleanValue();
												//
												if (includes) {			// Carry on till something found
													if (accumulator_1) {
														one = false;
														break;
													}
													else {
														accumulator_1 = true;
													}
												}
											}
											//
											if (!one) {					// Normal unsuccessful body evaluation result
												forAll_0 = ValueUtil.FALSE_VALUE;
												break;														// Stop immediately
											}
											else if (one) {				// Normal successful body evaluation result
												;															// Carry on
											}
											else {															// Impossible badly typed result
												accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
											}
										}
										if (forAll_0 == ValueUtil.TRUE_VALUE) {
											implies = ValueUtil.TRUE_VALUE;
										}
										else {
											if (forAll_0 == null) {
												implies = null;
											}
											else {
												implies = ValueUtil.FALSE_VALUE;
											}
										}
									}
									CAUGHT_implies = implies;
								}
								catch (Exception e) {
									CAUGHT_implies = ValueUtil.createInvalidValue(e);
								}
								//
								if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
									forAll = ValueUtil.FALSE_VALUE;
									break;														// Stop immediately
								}
								else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
									;															// Carry on
								}
								else if (CAUGHT_implies == null) {								// Abnormal null body evaluation result
									if (accumulator == ValueUtil.TRUE_VALUE) {
										accumulator = null;										// Cache a null failure
									}
								}
								else if (CAUGHT_implies instanceof InvalidValueException) {		// Abnormal exception evaluation result
									accumulator = CAUGHT_implies;									// Cache an exception failure
								}
								else {															// Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						}
						catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_forAll instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_forAll;
							}
							if (CAUGHT_forAll == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ContenuPedagogiqueTables.INT_0).booleanValue();
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
	public boolean SiSpePasSem(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::SiSpePasSem";
		try {
			/**
			 *
			 * inv SiSpePasSem:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = specialites->size() > 0 implies
			 *         semestres->size() = 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContenuPedagogiquePackage.Literals.NIVEAU___SI_SPE_PAS_SEM__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContenuPedagogiqueTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Specialite> specialites = this.getSpecialites();
				final /*@NonInvalid*/ OrderedSetValue BOXED_specialites = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Specialite, specialites);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_specialites);
				final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, ContenuPedagogiqueTables.INT_0).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!gt) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ List<Semestre> semestres = this.getSemestres();
					final /*@NonInvalid*/ OrderedSetValue BOXED_semestres = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres);
					final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_semestres);
					final /*@NonInvalid*/ boolean eq = size_0.equals(ContenuPedagogiqueTables.INT_0);
					if (eq) {
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
	public boolean NivNomDiff(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::NivNomDiff";
		try {
			/**
			 *
			 * inv NivNomDiff:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = Niveau.allInstances()
			 *         ->forAll(n1, n2 | n1 <> n2 implies n1.nom <> n2.nom)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContenuPedagogiquePackage.Literals.NIVEAU___NIV_NOM_DIFF__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContenuPedagogiqueTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_ContenuPedagogique_c_c_Niveau = idResolver.getClass(ContenuPedagogiqueTables.CLSSid_Niveau, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, ContenuPedagogiqueTables.SET_CLSSid_Niveau, TYP_ContenuPedagogique_c_c_Niveau);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, allInstances);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * n1 <> n2 implies n1.nom <> n2.nom
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							@SuppressWarnings("unused")
							final /*@NonInvalid*/ SetValue allInstances = (SetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object n1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object n2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Niveau local_0 = (Niveau)n1;
								final /*@NonInvalid*/ Niveau local_1 = (Niveau)n2;
								final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1) : (local_1 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_ne_0;
									try {
										if (local_0 == null) {
											throw new InvalidValueException("Null source for \'\'http://www.ContenuPedagogique.com\'::Niveau::nom\'");
										}
										final /*@Thrown*/ String nom = local_0.getNom();
										if (local_1 == null) {
											throw new InvalidValueException("Null source for \'\'http://www.ContenuPedagogique.com\'::Niveau::nom\'");
										}
										final /*@Thrown*/ String nom_0 = local_1.getNom();
										final /*@Thrown*/ boolean ne_0 = (nom != null) ? !nom.equals(nom_0) : (nom_0 != null);
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
	public boolean UeLieSemMemeNiv(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Niveau::UeLieSemMemeNiv";
		try {
			/**
			 *
			 * inv UeLieSemMemeNiv:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if specialites->size() = 0
			 *         then
			 *           self.ues->forAll(ue |
			 *             ue.semestres->forAll(sem | self.semestres->includes(sem)))
			 *         else
			 *           self.ues->forAll(ue |
			 *             ue.semestres->forAll(sem |
			 *               self.specialites.semestres->includes(sem)))
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContenuPedagogiquePackage.Literals.NIVEAU___UE_LIE_SEM_MEME_NIV__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContenuPedagogiqueTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Specialite> specialites = this.getSpecialites();
					final /*@NonInvalid*/ List<Ue> ues_0 = this.getUes();
					final /*@NonInvalid*/ OrderedSetValue BOXED_specialites = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Specialite, specialites);
					final /*@NonInvalid*/ OrderedSetValue BOXED_ues_0 = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Ue, ues_0);
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_specialites);
					final /*@NonInvalid*/ boolean eq = size.equals(ContenuPedagogiqueTables.INT_0);
					/*@Thrown*/ Boolean result;
					if (eq) {
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_ue = BOXED_ues_0.iterator();
						/*@Thrown*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_ue.hasNext()) {
								if (accumulator == null) {
									forAll = null;
								}
								else if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Ue ue = (Ue)ITERATOR_ue.next();
							/**
							 *
							 * ue.semestres->forAll(sem | self.semestres->includes(sem))
							 */
							final /*@NonInvalid*/ List<Semestre> semestres = ue.getSemestres();
							final /*@NonInvalid*/ OrderedSetValue BOXED_semestres = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres);
							/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_sem = BOXED_semestres.iterator();
							/*@NonInvalid*/ Boolean forAll_0;
							while (true) {
								if (!ITERATOR_sem.hasNext()) {
									if (accumulator_0 == ValueUtil.TRUE_VALUE) {
										forAll_0 = ValueUtil.TRUE_VALUE;
									}
									else {
										throw (InvalidValueException)accumulator_0;
									}
									break;
								}
								/*@NonInvalid*/ Semestre sem = (Semestre)ITERATOR_sem.next();
								/**
								 * self.semestres->includes(sem)
								 */
								final /*@NonInvalid*/ List<Semestre> semestres_0 = this.getSemestres();
								final /*@NonInvalid*/ OrderedSetValue BOXED_semestres_0 = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres_0);
								final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_semestres_0, sem).booleanValue();
								//
								if (!includes) {					// Normal unsuccessful body evaluation result
									forAll_0 = ValueUtil.FALSE_VALUE;
									break;														// Stop immediately
								}
								else if (includes) {				// Normal successful body evaluation result
									;															// Carry on
								}
								else {															// Impossible badly typed result
									accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							//
							if (forAll_0 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break;														// Stop immediately
							}
							else if (forAll_0 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
								;															// Carry on
							}
							else if (forAll_0 == null) {								// Abnormal null body evaluation result
								if (accumulator == ValueUtil.TRUE_VALUE) {
									accumulator = null;										// Cache a null failure
								}
							}
							else {															// Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						result = forAll;
					}
					else {
						/*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_ue_0 = BOXED_ues_0.iterator();
						/*@Thrown*/ Boolean forAll_1;
						while (true) {
							if (!ITERATOR_ue_0.hasNext()) {
								if (accumulator_1 == null) {
									forAll_1 = null;
								}
								else if (accumulator_1 == ValueUtil.TRUE_VALUE) {
									forAll_1 = ValueUtil.TRUE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator_1;
								}
								break;
							}
							/*@NonInvalid*/ Ue ue_0 = (Ue)ITERATOR_ue_0.next();
							/**
							 *
							 * ue.semestres->forAll(sem | self.specialites.semestres->includes(sem))
							 */
							final /*@NonInvalid*/ List<Semestre> semestres_1 = ue_0.getSemestres();
							final /*@NonInvalid*/ OrderedSetValue BOXED_semestres_1 = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres_1);
							/*@Thrown*/ Object accumulator_2 = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_sem_0 = BOXED_semestres_1.iterator();
							/*@NonInvalid*/ Boolean forAll_2;
							while (true) {
								if (!ITERATOR_sem_0.hasNext()) {
									if (accumulator_2 == ValueUtil.TRUE_VALUE) {
										forAll_2 = ValueUtil.TRUE_VALUE;
									}
									else {
										throw (InvalidValueException)accumulator_2;
									}
									break;
								}
								/*@NonInvalid*/ Semestre sem_0 = (Semestre)ITERATOR_sem_0.next();
								/**
								 * self.specialites.semestres->includes(sem)
								 */
								/*@Thrown*/ Accumulator accumulator_3 = ValueUtil.createSequenceAccumulatorValue(ContenuPedagogiqueTables.SEQ_CLSSid_Semestre);
								Iterator<Object> ITERATOR__1 = BOXED_specialites.iterator();
								/*@NonInvalid*/ SequenceValue collect;
								while (true) {
									if (!ITERATOR__1.hasNext()) {
										collect = accumulator_3;
										break;
									}
									/*@NonInvalid*/ Specialite _1 = (Specialite)ITERATOR__1.next();
									/**
									 * semestres
									 */
									final /*@NonInvalid*/ List<Semestre> semestres_2 = _1.getSemestres();
									final /*@NonInvalid*/ OrderedSetValue BOXED_semestres_2 = idResolver.createOrderedSetOfAll(ContenuPedagogiqueTables.ORD_CLSSid_Semestre, semestres_2);
									//
									for (Object value : BOXED_semestres_2.flatten().getElements()) {
										accumulator_3.add(value);
									}
								}
								final /*@NonInvalid*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE.evaluate(collect, sem_0).booleanValue();
								//
								if (!includes_0) {					// Normal unsuccessful body evaluation result
									forAll_2 = ValueUtil.FALSE_VALUE;
									break;														// Stop immediately
								}
								else if (includes_0) {				// Normal successful body evaluation result
									;															// Carry on
								}
								else {															// Impossible badly typed result
									accumulator_2 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							//
							if (forAll_2 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
								forAll_1 = ValueUtil.FALSE_VALUE;
								break;														// Stop immediately
							}
							else if (forAll_2 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
								;															// Carry on
							}
							else if (forAll_2 == null) {								// Abnormal null body evaluation result
								if (accumulator_1 == ValueUtil.TRUE_VALUE) {
									accumulator_1 = null;										// Cache a null failure
								}
							}
							else {															// Impossible badly typed result
								accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						result = forAll_1;
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ContenuPedagogiqueTables.INT_0).booleanValue();
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ContenuPedagogiquePackage.NIVEAU___PAS_SPE_UE1_SEM__DIAGNOSTICCHAIN_MAP:
				return PasSpeUe1Sem((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ContenuPedagogiquePackage.NIVEAU___SEM_LIE_UE_MEME_NIV__DIAGNOSTICCHAIN_MAP:
				return SemLieUeMemeNiv((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ContenuPedagogiquePackage.NIVEAU___UE_SPE_LIE_SEM_SPE_NIV__DIAGNOSTICCHAIN_MAP:
				return UeSpeLieSemSpeNiv((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ContenuPedagogiquePackage.NIVEAU___SI_SEM_PAS_SPE__DIAGNOSTICCHAIN_MAP:
				return SiSemPasSpe((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ContenuPedagogiquePackage.NIVEAU___SI_SEM_ALORS2__DIAGNOSTICCHAIN_MAP:
				return SiSemAlors2((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ContenuPedagogiquePackage.NIVEAU___SI_SPE_UE_FON1_SEM_PSPE__DIAGNOSTICCHAIN_MAP:
				return SiSpeUeFon1SemPSpe((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ContenuPedagogiquePackage.NIVEAU___SI_SPE_PAS_SEM__DIAGNOSTICCHAIN_MAP:
				return SiSpePasSem((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ContenuPedagogiquePackage.NIVEAU___NIV_NOM_DIFF__DIAGNOSTICCHAIN_MAP:
				return NivNomDiff((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ContenuPedagogiquePackage.NIVEAU___UE_LIE_SEM_MEME_NIV__DIAGNOSTICCHAIN_MAP:
				return UeLieSemMemeNiv((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
