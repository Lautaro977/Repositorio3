package Modelo;

//hoja

public class Tarea extends Item {

	public Tarea(String nombre, String tipo) {
		super(nombre, tipo, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularTiempo() {
		// TODO Auto-generated method stub
		return this.obtenerEsfuerzo();
	}

	@Override
	public void agregarItem(Item item) {
		// TODO Auto-generated method stub

	}

}
