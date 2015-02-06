package ejercicio04;

public class Moto extends Vehiculo {
		
	public Moto() {
		super();
		
	}

	public Moto(int numRuedas, int potencia, int cilindrada, String combustible) {
		super(numRuedas, potencia, cilindrada, combustible);
		
	}

	public double calculaImpuesto (int cantidadFija, double porcentajePotencia, int fijo4ruedas) {
		return cantidadFija + porcentajePotencia / 100 * super.getPotencia();
	}

}
