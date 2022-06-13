/**
 */
package ContenuPedagogique.tests;

import ContenuPedagogique.ContenuPedagogiqueFactory;
import ContenuPedagogique.Specialite;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Specialite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecialiteTest extends TestCase {

	/**
	 * The fixture for this Specialite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Specialite fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpecialiteTest.class);
	}

	/**
	 * Constructs a new Specialite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialiteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Specialite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Specialite fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Specialite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Specialite getFixture() {
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
		setFixture(ContenuPedagogiqueFactory.eINSTANCE.createSpecialite());
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

} //SpecialiteTest
