/**
 *
 * $Id$
 */
package ContenuPedagogique.validation;

import ContenuPedagogique.Ue;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ContenuPedagogique.Semestre}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SemestreValidator {
	boolean validate();

	boolean validateNom(String value);
	boolean validateUes(EList<Ue> value);
}
