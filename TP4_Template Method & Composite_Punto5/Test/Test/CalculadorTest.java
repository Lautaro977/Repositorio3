package Test;

import org.junit.jupiter.api.Test;

import Modelo.Importada;
import Modelo.Nacional;
import Modelo.Remera;
import junit.framework.Assert;

class CalculadorTest {

	@Test
	void testCalcularPrecioNacional() {
		Remera r = new Nacional();
		double resultado = r.CalcularPrecio(100);
		Assert.assertEquals(93.38, resultado, 0.01f);
	}

	@Test
	void testCalcularPrecioInternacional() {
		Remera r = new Importada();
		double resultado = r.CalcularPrecio(100);
		Assert.assertEquals(135.1875, resultado, 0.01f);
	}

}
