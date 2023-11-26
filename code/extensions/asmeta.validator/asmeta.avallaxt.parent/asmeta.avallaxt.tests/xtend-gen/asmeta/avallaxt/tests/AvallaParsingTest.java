/**
 * generated by Xtext 2.16.0
 */
package asmeta.avallaxt.tests;

import asmeta.avallaxt.avalla.Scenario;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(AvallaInjectorProvider.class)
@SuppressWarnings("all")
public class AvallaParsingTest {
  @Inject
  private ParseHelper<Scenario> parseHelper;

  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("scenario alpha");
      _builder.newLine();
      _builder.append("load lll");
      _builder.newLine();
      final Scenario result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: �errors.join(\", \")�");
      Assert.assertTrue(_builder_1.toString(), errors.isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
