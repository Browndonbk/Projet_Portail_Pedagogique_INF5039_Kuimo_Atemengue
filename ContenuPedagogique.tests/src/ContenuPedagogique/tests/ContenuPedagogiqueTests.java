/**
 */
package ContenuPedagogique.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ContenuPedagogique</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenuPedagogiqueTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ContenuPedagogiqueTests("ContenuPedagogique Tests");
		suite.addTestSuite(NiveauTest.class);
		suite.addTestSuite(SpecialiteTest.class);
		suite.addTestSuite(UeTest.class);
		suite.addTestSuite(FormationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenuPedagogiqueTests(String name) {
		super(name);
	}

} //ContenuPedagogiqueTests
