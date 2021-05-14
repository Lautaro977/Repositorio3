package Test;

import Modelo.HistoriaUsuario;
import Modelo.Item;
import Modelo.Tarea;
import junit.framework.Assert;

class Test {

	@org.junit.jupiter.api.Test
	void testCalcularTiempoEnEsfuerzo() {
		Item SCRUM = new HistoriaUsuario("Sistema", "Scrum", 0);

		Item hu1 = new HistoriaUsuario("Registrar", "Insercion", 8);
		Item hu2 = new HistoriaUsuario("Actualizar", "Modificacion", 3);

		Item t1 = new Tarea("calcula", "funcion");
		Item t2 = new Tarea("Estudia", "investigacion");

		hu1.agregarItem(t1);
		hu1.agregarItem(t2);

		Item t3 = new Tarea("calcular registrado", "funcion");
		Item t4 = new Tarea("Estudiar actualizacion", "investigacion");

		hu2.agregarItem(t3);
		hu2.agregarItem(t4);

		SCRUM.agregarItem(hu1);
		SCRUM.agregarItem(hu2);

		Assert.assertEquals(11, SCRUM.calcularTiempo());
	}

}
