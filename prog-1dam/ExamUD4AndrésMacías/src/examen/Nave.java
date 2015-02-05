package examen;

public class Nave extends Avion {
	
	private int numMotores;
	
	int constanteMotores = 2, constanteLongitud = 12, constanteCrisis = 3;

	public Nave(double longitud, int anyoFabricacion, String numID, double litros, int asientos, int numMotores) {
		super(longitud, anyoFabricacion, numID, litros, asientos);
		this.numMotores = numMotores;
	} 
	
	public Nave () {
		super ();
		this.numMotores = 0;
	}

	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}
	
	public double calcularAterrizaje () {
		double coste = this.numMotores * constanteMotores + super.getLongitud() * constanteLongitud + constanteCrisis;
		return coste;
	}
	
	public void llamarALosHombresdeNegro () {
		System.out.println("¡¡¡Atención, se trata de una Nave espacial!!!, preparen el protocolo Área-51");
	}

	@Override
	public String toString() {
		return "Nave Espacial, con datos básicos: " + super.toString() + "Además lleva " + this.numMotores + " motores.";
	}
	
	
	
	


	
	

}
