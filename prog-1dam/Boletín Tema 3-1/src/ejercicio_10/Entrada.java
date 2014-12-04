package ejercicio_10;

public class Entrada {

	//Atributos 
	
	private int id;
	private int fila;
	private int asiento;
	
	// Constructores
	
	public Entrada () {
		this.fila = 0;
		this.asiento = 0;
	}
	
	public Entrada (int fila, int asiento) {
		this.fila = fila;
		this.asiento = asiento;
	}
	
	public Entrada (int id, int fila, int asiento) {
		this.id = id;
		this.fila = fila;
		this.asiento = asiento;
	}

	// Getters y setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	
	
	// Métodos
	
	public void imprimirEntrada (int id, int fila, int asiento, double precio, String pelicula) {
		System.out.println("\n\n\t * * * * * * * * * * * * * * * * * * *"
			             + "\n\t *                                   "
			             + "\n\t *         MULTICINES DAM            "
			             + "\n\t *                                   "
			             + "\n\t *  Película: "+pelicula+"           "
			             + "\n\t *                                   "
			             + "\n\t *  Fila: "+fila+" Asiento: "+asiento+"      "
			             + "\n\t *                              "
			             + "\n\t *  Precio: "+precio+"          "
			             + "\n\t *                              "
			             + "\n\t *  Número de serie: "+id+"     "
			             + "\n\t *                              "
			             + "\n\t * * * * * * * * * * * * * * * * * * *");
	}
	
	
	
	
}
