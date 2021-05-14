package Modelo;

//componente

public abstract class Item {

	private String nombre;
	private String tipo;
	private int puntosDeEsfuerzo;

	public Item(String nombre, String tipo, int puntosDeEsfuerzo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.puntosDeEsfuerzo = puntosDeEsfuerzo;
	}

	public String obtenerNombre() {
		return this.nombre;
	}

	public void asignarNombre(String nombre) {
		this.nombre = nombre;
	}

	public String obtenerTipo() {
		return this.tipo;
	}

	public void asignarTipo(String tipo) {
		this.tipo = tipo;
	}

	public int obtenerEsfuerzo() {
		return this.puntosDeEsfuerzo;
	}

	public void asignarEsfuerzo(int puntosDeEsfuerzo) {
		this.puntosDeEsfuerzo = puntosDeEsfuerzo;
	}

	public abstract int calcularTiempo();

	public abstract void agregarItem(Item item);

}
