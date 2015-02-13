package ejercicio01;

import ejercicio01.Impuesto.Iimpuesto;

public class Trabajador implements Iimpuesto {
	
	private String nombre;
	private double sueldo;
	private int retencion;
	@Override
	public double calculoIva(double precio, int iva) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double calculoIrpf(double sueldo, int retencion) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
