package Modelo;

public interface GrupoDeSeguros {

	double calcularCostoTotal();

	double aplicarDescuento();

	void agregarSeguro(GrupoDeSeguros Seguros);

	int contarSeguros();

}
