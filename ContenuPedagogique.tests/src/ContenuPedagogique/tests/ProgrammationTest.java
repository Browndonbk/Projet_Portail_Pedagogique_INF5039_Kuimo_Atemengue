/**
 */
package ContenuPedagogique.tests;

import ContenuPedagogique.ContenuPedagogiqueFactory;
import ContenuPedagogique.Programmation;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Programmation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgrammationTest extends TestCase {

	/**
	 * The fixture for this Programmation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Programmation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgrammationTest.class);
	}

	/**
	 * Constructs a new Programmation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Programmation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Programmation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Programmation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Programmation getFixture() {
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
		setFixture(ContenuPedagogiqueFactory.eINSTANCE.createProgrammation());
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

} //ProgrammationTest
