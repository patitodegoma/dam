package ejercicio04;

public class Vehiculo {
	
	private int numRuedas;
	private int potencia;
	private int cilindrada;
	private String combustible;
	
	public Vehiculo(int numRuedas, int potencia, int cilindrada, String combustible) {
		this.numRuedas = numRuedas;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
		this.combustible = combustible;
	}
	
	public Vehiculo () {
		this.numRuedas = 0;
		this.potencia = 0;
		this.cilindrada = 0;
		this.combustible = "";
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	public double calculaImpuesto (int cantidadFija, double porcentajePotencia, int fijo4ruedas) {
		return 0;
	}
	
	
	
	

}
