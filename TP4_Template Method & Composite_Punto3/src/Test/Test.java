package Test;

import Modelo.GrupoDeSeguros;
import Modelo.Paquete;
import Modelo.Seguro;
import junit.framework.Assert;

class Test {

	@org.junit.jupiter.api.Test
	void testPaqueteConSeguros() {
		GrupoDeSeguros gs1 = new Paquete("casa");
		GrupoDeSeguros seguroHogar = new Seguro("hogar", 200);
		GrupoDeSeguros seguroAutoMovil = new Seguro("AutoMovil", 100);
		gs1.agregarSeguro(seguroHogar);
		gs1.agregarSeguro(seguroAutoMovil);
		Assert.assertEquals(270d, gs1.aplicarDescuento());
	}

	@org.junit.jupiter.api.Test
	void testPaqueteConPaqueteDeSeguros() {
		GrupoDeSeguros gs1 = new Paquete("casa");

		GrupoDeSeguros seguroHogar = new Seguro("hogar", 200);
		gs1.agregarSeguro(seguroHogar);

		GrupoDeSeguros seguroAutoMovil1 = new Seguro("AutoMovil", 100);
		GrupoDeSeguros seguroVida2 = new Seguro("Vida", 300);
		GrupoDeSeguros gs2 = new Paquete("AutoMovil");

		gs2.agregarSeguro(seguroAutoMovil1);
		gs2.agregarSeguro(seguroVida2);

		gs1.agregarSeguro(gs2);
		System.out.println(gs1.aplicarDescuento());
		Assert.assertEquals(510d, gs1.aplicarDescuento());
	}

}
