import models.Local;

import org.junit.Assert;
import org.junit.Test;

public class LocalTest {
	
	@Test
	public void testaExcecoes() {
		//Titulo vazio
		try {
			new Local("", "Não sei", 10);
			Assert.fail();
		} catch(Exception e) { }
		//Capacidade nula
		try {
			new Local("Local", "Não sei", 0);
			Assert.fail();
		} catch(Exception e) { }
		//Capacidade negativa
		try {
			new Local("Local", "Não sei", -1);
			Assert.fail();
		} catch(Exception e) { }
	}
	
}