/**
 */
package ContenuPedagogique.tests;

import ContenuPedagogique.ContenuPedagogiqueFactory;
import ContenuPedagogique.Niveau;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Niveau</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NiveauTest extends TestCase {

	/**
	 * The fixture for this Niveau test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Niveau fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NiveauTest.class);
	}

	/**
	 * Constructs a new Niveau test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NiveauTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Niveau test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Niveau fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Niveau test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Niveau getFixture() {
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
		setFixture(ContenuPedagogiqueFactory.eINSTANCE.createNiveau());
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

} //NiveauTest
