package Modelo;

import java.util.ArrayList;
import java.util.List;

//compuesto =composite

public class Paquete implements GrupoDeSeguros {

	private List<GrupoDeSeguros> ListaSeguros = new ArrayList<>();
	private String nombre;

	public Paquete(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public double calcularCostoTotal() {
		// TODO Auto-generated method stub
		double resultado = 0;

		for (GrupoDeSeguros gs : ListaSeguros) {
			resultado += gs.calcularCostoTotal();
		}
		return resultado;
	}

	@Override
	public void agregarSeguro(GrupoDeSeguros seguro) {
		// TODO Auto-generated method stub
		ListaSeguros.add(seguro);
	}

	@Override
	public int contarSeguros() {
		// TODO Auto-generated method stub
		int contSeguros = 0;
		for (GrupoDeSeguros s : ListaSeguros) {
			contSeguros += s.contarSeguros();
		}
		return contSeguros;
	}

	@Override
	public double aplicarDescuento() {
		// TODO Auto-generated method stub
		double costoTotal = this.calcularCostoTotal();
		int descuento = this.contarSeguros() * 5;

		double resultado = costoTotal;
		resultado -= costoTotal * (descuento / 100.0);

		return resultado;
	}

}
