package examen;

public class Caza extends Avion {
	
	private double potencia;
	private int numMisiles;
	
	int constanteLongitud = 12, constanteCrisis = 3;
	
	public Caza (double longitud, int anyoFabricacion, String numID, double litros, int asientos, double potencia, int numMisiles) {
		super(longitud, anyoFabricacion, numID, litros, asientos);
		this.potencia = potencia;
		this.numMisiles = numMisiles;
	}
	
	public Caza () {
		super ();
		this.potencia = 0.0;
		this.numMisiles = 0;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public int getNumMisiles() {
		return numMisiles;
	}

	public void setNumMisiles(int numMisiles) {
		this.numMisiles = numMisiles;
	}
	
	public double calcularAterrizaje () {
		double coste = this.potencia + this.numMisiles + super.getLongitud() * constanteLongitud + constanteCrisis;
		return coste;
	}

	@Override
	public String toString() {
		return "Caza del Ej�rcito, con datos b�sicos: " + super.toString() + "Adem�s tiene una potencia de " + this.potencia + " CV, y un n�mero de " + this.numMisiles + " misiles.";
	}
	
	
	
	

}
