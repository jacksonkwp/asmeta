import static org.junit.Assert.*;
import org.junit.Test;

public class SIS_Test_1 {
	@Test
	public void SIS_Test() {
		SIS sis = new SIS();
		assertNotNull(sis);
		//Check
		assertEquals(sis.pressure.oldValue, sis.pressure.oldValue.TOOLOW);
		//Check
		assertEquals(sis.waterpressure.oldValue.value, Integer.valueOf(3));
		//Check
		assertFalse(sis.overridden.oldValue);
		//Set
		sis.delta.Value = new SIS_sig.Delta();
		sis.delta.Value.value = -2;
		//Set
		sis.block.Value = sis.block.Value.ON;
		//Set
		sis.reset.Value = sis.reset.Value.OFF;
		//Step
		sis.UpdateASM();
		//Check
		assertEquals(sis.safetyInjection.oldValue, sis.safetyInjection.oldValue.ON);
		//Check
		assertTrue(sis.overridden.oldValue);
		//Check
		assertEquals(sis.waterpressure.oldValue.value, Integer.valueOf(1));
		//Check
		assertEquals(sis.pressure.oldValue, sis.pressure.oldValue.TOOLOW);
		//Set
		sis.reset.Value = sis.reset.Value.OFF;
		//Set
		sis.delta.Value = new SIS_sig.Delta();
		sis.delta.Value.value = -1;
		//Set
		sis.block.Value = sis.block.Value.OFF;
		//Step
		sis.UpdateASM();
		//Check
		assertEquals(sis.pressure.oldValue, sis.pressure.oldValue.TOOLOW);
		//Check
		assertTrue(sis.overridden.oldValue);
		//Check
		assertEquals(sis.safetyInjection.oldValue, sis.safetyInjection.oldValue.OFF);
		//Check
		assertEquals(sis.waterpressure.oldValue.value, Integer.valueOf(0));
		//Set
		sis.delta.Value = new SIS_sig.Delta();
		sis.delta.Value.value = -1;
		//Set
		sis.block.Value = sis.block.Value.ON;
		//Set
		sis.reset.Value = sis.reset.Value.ON;
		//Step
		sis.UpdateASM();
		//Check
		assertEquals(sis.waterpressure.oldValue.value, Integer.valueOf(0));
		//Check
		assertFalse(sis.overridden.oldValue);
		//Check
		assertEquals(sis.pressure.oldValue, sis.pressure.oldValue.TOOLOW);
		//Check
		assertEquals(sis.safetyInjection.oldValue, sis.safetyInjection.oldValue.OFF);
		//Step
		sis.UpdateASM();
	}
}