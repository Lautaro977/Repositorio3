package Modelo;

public class Nacional extends Remera {

	@Override
	public double recargo() {
		// TODO Auto-generated method stub
		return 0.015;
	}

	@Override
	public double otroImporte() {
		// TODO Auto-generated method stub
		return -0.2;
	}

	@Override
	public double precioFinalComercio() {
		// TODO Auto-generated method stub
		return 0.15;
	}

}
