package Modelo;

public class Main {

	public static void main(String args[]) {
		Empleado directores = new CompositeEmpleado("Director", "Peron", 300);

		Empleado gerente1 = new CompositeEmpleado("Gerente", "alfonsini", 200);
		Empleado gerente2 = new CompositeEmpleado("Gerente", "atlas", 200);

		Empleado MandoMedio1 = new CompositeEmpleado("MandoMedio", "alex", 150);
		Empleado MandoMedio2 = new CompositeEmpleado("MandoMedio", "amlo", 150);

		Empleado LiderDeProyecto1 = new CompositeEmpleado("Lider De Proyecto", "elis", 100);
		Empleado LiderDeProyecto2 = new CompositeEmpleado("Lider De Proyecto", "excalibur", 100);

		Regular regular1 = new Regular("Empleado Regular", "mad", 50);
		Regular regular2 = new Regular("Empleado Regular", "max", 50);

		LiderDeProyecto1.agregarComponente(regular1);
		LiderDeProyecto2.agregarComponente(regular2);

		MandoMedio1.agregarComponente(LiderDeProyecto1);
		MandoMedio2.agregarComponente(LiderDeProyecto2);

		gerente1.agregarComponente(MandoMedio1);
		gerente2.agregarComponente(MandoMedio2);

		directores.agregarComponente(gerente1);
		directores.agregarComponente(gerente2);

		directores.mostrar(1);

		System.out.println("SueldoTotal:" + directores.calcularSueldo());

	}

}
