package Modelo;

public abstract class Remera {

	public double CalcularPrecio(double precio) {
		double precioVenta = precio;
		precioVenta += precioVenta * this.recargo();
		precioVenta += precioVenta * this.otroImporte();
		precioVenta += precioVenta * this.precioFinalComercio();
		return precioVenta;

	}

	public abstract double recargo();

	public abstract double otroImporte();

	public abstract double precioFinalComercio();

}
