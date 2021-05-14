package Modelo;

//compuesto
import java.util.ArrayList;
import java.util.List;

public class CompositeEmpleado extends Empleado {

	public List<Empleado> ListaComponente = new ArrayList<>();

	public CompositeEmpleado(String tipo, String nombre, double sueldo) {
		super(tipo, nombre, sueldo);
	}

	@Override
	public void asignarSueldo(double sueldo) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void agregarComponente(Empleado empleado) {
		// TODO Auto-generated method stub
		ListaComponente.add(empleado);
	}

	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		double sueldoTotal = this.obtenerSueldo();
		for (Empleado emp : ListaComponente) {
			sueldoTotal += emp.calcularSueldo();
		}
		return sueldoTotal;
	}

	@Override
	public void mostrar(int profundidad) {
		System.out.println("Nivel:" + profundidad + "--|--" + "Tipo:" + this.obtenerTipo() + "--|--" + "Nombre:"
				+ this.obtenerNombre() + "--|--" + "Sueldo:" + this.obtenerSueldo());
		for (Empleado emp : ListaComponente) {
			emp.mostrar(profundidad + 1);
		}
	}

}
