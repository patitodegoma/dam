package examen;

public abstract class Avion {
	
	private double longitud;
	private int anyoFabricacion;
	private String numID;
	private double litros;
	private int asientos;
	
	public Avion (double longitud, int anyoFabricacion, String numID, double litros, int asientos) {
		this.longitud = longitud;
		this.anyoFabricacion = anyoFabricacion;
		this.numID = numID;
		this.litros = litros;
		this.asientos = asientos;
	}
	
	public Avion () {
		this.longitud = 0.0;
		this.anyoFabricacion = 0;
		this.numID = "";
		this.litros = 0.0;
		this.asientos = 0;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public int getAnyoFabricacion() {
		return anyoFabricacion;
	}

	public void setAnyoFabricacion(int anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}

	public String getNumID() {
		return numID;
	}

	public void setNumID(String numID) {
		this.numID = numID;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	
	public abstract double calcularAterrizaje ();

	@Override
	public String toString() {
		return "Longitud: " + longitud + "m, Año de fabricacion: " + anyoFabricacion + ", Matrícula: " + numID + ", litros de combustible: " + litros
				+ ", y " + asientos + " asientos. ";
	}
	
	
	
	

}
