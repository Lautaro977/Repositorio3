package Modelo;

public class Main {

	public static void main(String args[]) {

		GrupoDeSeguros gs1 = new Paquete("casa");

		GrupoDeSeguros seguroHogar = new Seguro("hogar", 200);
		gs1.agregarSeguro(seguroHogar);

		GrupoDeSeguros seguroAutoMovil1 = new Seguro("AutoMovil", 100);
		GrupoDeSeguros seguroAutoMovil2 = new Seguro("AutoMovil", 100);
		GrupoDeSeguros gs2 = new Paquete("AutoMovil");

		gs2.agregarSeguro(seguroAutoMovil1);
		gs2.agregarSeguro(seguroAutoMovil2);

		gs1.agregarSeguro(gs2);

		System.out.println("El descuento de Paquete2 es de:" + gs2.aplicarDescuento());

		System.out.println("El descuento de Paquete1 es de:" + gs1.aplicarDescuento());

	}

}
