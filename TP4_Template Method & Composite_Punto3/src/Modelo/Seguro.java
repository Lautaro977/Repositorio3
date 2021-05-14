package Modelo;

//hoja

public class Seguro implements GrupoDeSeguros {

	private String tipo;
	private double costo;

	public Seguro(String tipo, double costo) {
		this.tipo = tipo;
		this.costo = costo;
	}

	@Override
	public double calcularCostoTotal() {
		// TODO Auto-generated method stub
		return this.costo;
	}

	@Override
	public void agregarSeguro(GrupoDeSeguros seguro) {
		// TODO Auto-generated method stub

	}

	@Override
	public int contarSeguros() {
		// TODO Auto-generated method stub
		return 1;
	}

	/// Preguntar
	@Override
	public double aplicarDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String obtenerTipo() {
		return this.tipo;
	}

	public void asignarTipo(String tipo) {
		this.tipo = tipo;
	}

	public double obtenerCosto() {
		return this.costo;
	}

	public void asignarCosto(double costo) {
		this.costo = costo;
	}

}
