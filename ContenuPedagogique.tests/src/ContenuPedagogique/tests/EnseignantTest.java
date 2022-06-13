/**
 */
package ContenuPedagogique.tests;

import ContenuPedagogique.ContenuPedagogiqueFactory;
import ContenuPedagogique.Enseignant;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enseignant</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnseignantTest extends TestCase {

	/**
	 * The fixture for this Enseignant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Enseignant fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnseignantTest.class);
	}

	/**
	 * Constructs a new Enseignant test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnseignantTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Enseignant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Enseignant fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Enseignant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Enseignant getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContenuPedagogiqueFactory.eINSTANCE.createEnseignant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EnseignantTest
