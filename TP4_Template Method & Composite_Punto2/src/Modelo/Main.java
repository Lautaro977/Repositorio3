package Modelo;

public class Main {

	public static void main(String args[]) {

		Item SCRUM = new HistoriaUsuario("Sistema", "Scrum", 0);

		Item hu1 = new HistoriaUsuario("Registrar", "Insercion", 8);
		Item hu2 = new HistoriaUsuario("Actualizar", "Modificacion", 3);

		Item t1 = new Tarea("calcular", "funcion");
		Item t2 = new Tarea("Estudiar", "investigacion");

		hu1.agregarItem(t1);
		hu1.agregarItem(t2);

		Item t3 = new Tarea("calcular registrado", "funcion");
		Item t4 = new Tarea("Estudiar actualizacion", "investigacion");

		hu2.agregarItem(t3);
		hu2.agregarItem(t4);

		SCRUM.agregarItem(hu1);
		SCRUM.agregarItem(hu2);

		System.out.println("Esfuerzo de SCRUM:" + SCRUM.calcularTiempo());
		System.out.println("Esfuerzo de Historia Usuario1:" + hu1.calcularTiempo());
		System.out.println("Esfuerzo de Historia Usuario2:" + hu2.calcularTiempo());
	}

}
