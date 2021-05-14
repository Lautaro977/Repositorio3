package Modelo;

//componente
public abstract class Empleado {

	private String tipo;
	private String nombre;
	private double sueldo;

	public Empleado(String tipo, String nombre, double sueldo) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String obtenerTipo() {
		return this.tipo;
	}

	public void asignarTipo(String tipo) {
		this.tipo = tipo;
	}

	public String obtenerNombre() {
		return this.nombre;
	}

	public void asignarNombre(String nombre) {
		this.nombre = nombre;
	}

	public double obtenerSueldo() {
		return this.sueldo;
	}

	public void asignarSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public abstract void agregarComponente(Empleado empleado);

	public abstract double calcularSueldo();

	public abstract void mostrar(int profundidad);
}
