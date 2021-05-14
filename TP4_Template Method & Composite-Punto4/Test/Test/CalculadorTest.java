package Test;

import static java.time.LocalDate.now;

import org.junit.jupiter.api.Test;

import Modelo.CalculadorJubilado;
import Modelo.CalculadorNoJubilado;
import junit.framework.Assert;

class CalculadorTest {

	@Test
	void testJubiladoConPromosion() {

		CalculadorJubilado cj = new CalculadorJubilado(now().getMonth().getValue());
		double resultado = cj.calcularPrecio(100);
		Assert.assertEquals(100, resultado, 0.01f);
	}

	@Test
	void testJubiladoSinPromosion() {
		CalculadorJubilado cj = new CalculadorJubilado(now().getMonth().getValue() - 1);
		double resultado = cj.calcularPrecio(100);
		Assert.assertEquals(110, resultado, 0.01f);

	}

	@Test
	void testNoJubiladoConPromosion() {
		CalculadorNoJubilado cnj = new CalculadorNoJubilado(now().getMonth().getValue());
		double resultado = cnj.calcularPrecio(100);
		Assert.assertEquals(115, resultado, 0.01f);
	}

	@Test
	void testNoJubiladoSinPromosion() {
		CalculadorNoJubilado cnj = new CalculadorNoJubilado(now().getMonth().getValue() - 1);
		double resultado = cnj.calcularPrecio(100);
		Assert.assertEquals(121, resultado, 0.01f);
	}

}
