package Modelo;

import java.util.ArrayList;
import java.util.List;

//compuesto =composite

public class HistoriaUsuario extends Item {

	private List<Item> ListaItems = new ArrayList<>();

	public HistoriaUsuario(String nombre, String tipo, int puntosDeEsfuerzo) {
		super(nombre, tipo, puntosDeEsfuerzo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularTiempo() {
		// TODO Auto-generated method stub
		int resultado = this.obtenerEsfuerzo();
		for (Item item : ListaItems) {
			resultado += item.calcularTiempo();
		}
		return resultado;
	}

	@Override
	public void agregarItem(Item item) {
		// TODO Auto-generated method stub
		ListaItems.add(item);
	}

}
