import static org.junit.Assert.*;
import org.junit.Test;

public class Contatore_U_DA_H_Test_1 {
	@Test
	public void Contatore_U_DA_H_Test() {
		Contatore_U_DA_H contatore_u_da_h = new Contatore_U_DA_H();
		assertNotNull(contatore_u_da_h);
		//Set
		contatore_u_da_h.click.Value = false;
		//Step
		contatore_u_da_h.UpdateASM();
		//Set
		contatore_u_da_h.click.Value = false;
		//Step
		contatore_u_da_h.UpdateASM();
		//Set
		contatore_u_da_h.click.Value = false;
		//Step
		contatore_u_da_h.UpdateASM();
		//Step
		contatore_u_da_h.UpdateASM();
	}
}