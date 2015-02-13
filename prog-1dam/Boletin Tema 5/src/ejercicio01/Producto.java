package ejercicio01;

import ejercicio01.Impuesto.Iimpuesto;

public class Producto implements Iimpuesto {

	
	public double calculoIva(double precio, int iva) {
		// TODO Auto-generated method stub
		return precio + precio * iva / 100;
	}

	@Override
	public double calculoIrpf(double sueldo, int retencion) {
		// TODO Auto-generated method stub
		return 0;
	}



}
