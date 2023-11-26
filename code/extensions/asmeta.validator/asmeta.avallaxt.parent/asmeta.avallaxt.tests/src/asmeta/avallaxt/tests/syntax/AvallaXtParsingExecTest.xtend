/*
 * generated by Xtext 2.14.0
 */
package asmeta.avallaxt.tests.syntax

import com.google.inject.Inject
import asmeta.avallaxt.avalla.Exec
import asmeta.avallaxt.avalla.Scenario
import asmeta.avallaxt.tests.AvallaInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(AvallaInjectorProvider)
class AvallaXtParsingExecTest {
	@Inject
	ParseHelper<Scenario> parseHelper
	
	
	@Test
	def void checkExec1() {
		val result = parseHelper.parse('''
			scenario alpha
			load lll
			exec  sc1:=1; 
			
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: �errors.join(", ")�''', errors.isEmpty)
		println((result as Scenario).elements.get(0))
		Assert.assertTrue((result as Scenario).elements.get(0) instanceof Exec);
		Assert.assertEquals("sc1:=1",((result as Scenario).elements.get(0) as Exec).rule)
	}
	@Test
	def void checkExec2() {
		val result = parseHelper.parse('''
			scenario alpha
			load lll
			exec  par 
			      sc1:=1
			      hh:= 0
			      endpar; 
			
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: �errors.join(", ")�''', errors.isEmpty)
	}
	
}
