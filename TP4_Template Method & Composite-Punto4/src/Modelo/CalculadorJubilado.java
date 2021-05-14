package Modelo;

public class CalculadorJubilado extends Calculador {

	public CalculadorJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	@Override
	protected double mesConPromocion(double precioProducto) {
		// TODO Auto-generated method stub
		return precioProducto;
	}

	@Override
	protected double mesSinPromocion(double precioProducto) {
		// TODO Auto-generated method stub
		return precioProducto + precioProducto * 0.1;
	}

	/*
	 * public double calcularPrecio(double precioProducto) { double precioTotal =
	 * precioProducto; if (!of(mesEnPromocion).equals(now().getMonth())) {
	 * precioTotal += precioProducto * 0.1; }
	 * log.log(CalculadorJubilado.class.getName()); return precioTotal; }
	 */
}
