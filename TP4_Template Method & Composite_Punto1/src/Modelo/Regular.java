package Modelo;

//hoja
public class Regular extends Empleado {

	public Regular(String tipo, String nombre, double sueldo) {
		super(tipo, nombre, sueldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void agregarComponente(Empleado componente) {
		// TODO Auto-generated method stub

	}

	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return this.obtenerSueldo() + 0;
	}

	@Override
	public void mostrar(int profundidad) {
		// TODO Auto-generated method stub
		System.out.println("Nivel:" + profundidad + "--|--" + "Tipo:" + this.obtenerTipo() + "--|--" + "Nombre:"
				+ this.obtenerNombre() + "--|--" + "Sueldo:" + this.obtenerSueldo());
	}

}
