package ejercicio1;

public class Magdalena {
	
	// Atributos
	
	private double lado;
	private int id;
	private double coste;
	
	// Constructores
	
	public Magdalena () {
		this.lado = 0.0;
		this.id = 0;
		this.coste = 0.0;
	}
	
	public Magdalena (double lado, int id, double coste) {
		this.lado = lado;
		this.id = id;
		this.coste = coste;
	}

	// Getters y Setters
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}
	
	// Métodos
	
	public double calcularVolumen (double ladoMag) {
		double volumen = 0.0;
		volumen = Math.pow(ladoMag, 3);
		return volumen;
	}
	
	public double calcularPrecio (double volumen) {
		double pvp;
		pvp = volumen + this.coste;
		return pvp;
	}

	
	public String toString() {
		return "\n Mi magdalena tiene de lado "+lado+" mm³, un id "+id+", y un coste de"+coste
				+"euros.";
	}
	
	
	
	

}
