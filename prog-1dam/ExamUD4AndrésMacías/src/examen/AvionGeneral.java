package examen;

public class AvionGeneral extends Avion {
	
	int constanteLongitud = 12, constanteCrisis = 3;	
	
	public AvionGeneral(double longitud, int anyoFabricacion, String numID, double litros, int asientos) {
		super(longitud, anyoFabricacion, numID, litros, asientos);
	}
	
	public AvionGeneral () {
		super ();
	}

	public double calcularAterrizaje () {
		double coste = super.getLongitud() * constanteLongitud + constanteCrisis;
		return coste;
	}

	@Override
	public String toString() {
		return "Avión de tipo General, con datos básicos: " + super.toString();
	}
	
	

}
