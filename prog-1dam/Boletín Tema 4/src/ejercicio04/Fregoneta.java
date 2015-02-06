package ejercicio04;

public class Fregoneta extends Vehiculo {
	
	public Fregoneta() {
		super();
		
	}

	public Fregoneta(int numRuedas, int potencia, int cilindrada,
			String combustible) {
		super(numRuedas, potencia, cilindrada, combustible);
		
	}

	public double calculaImpuesto (int cantidadFija, double porcentajePotencia, int fijo4ruedas) {
		return cantidadFija + porcentajePotencia / 100 * super.getPotencia() + fijo4ruedas;
	}

}
