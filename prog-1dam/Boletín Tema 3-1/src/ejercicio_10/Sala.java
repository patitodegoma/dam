package ejercicio_10;

public class Sala {
	
	// Atributos
	
	private int numSala;
	private String pelicula;
	private int numFilas;
	private int numAsientos;    // Asientos en cada fila
	private double precio;
	private int vendidas;
	int ventas[][];
	
	// Constructores
	
	public Sala () {
		this.numSala = 0;
		this.pelicula = "";
		this.numFilas = 0;
		this.numAsientos = 0;
		this.precio = 0.0;
		this.vendidas = 0;
		this.ventas = new int [0][0];
	}
	
	public Sala (int numSala, String pelicula, int numFilas, int numAsientos, double precio) {
		this.numSala = numSala;
		this.pelicula = pelicula;
		this.numFilas = numFilas;
		this.numAsientos = numAsientos;
		this.precio = precio;
		this.ventas = new int [numFilas][numAsientos];
	}
	
	

	public Sala (int numSala, String pelicula, int numFilas, int numAsientos, double precio, int vendidas, int ventas[][]) {
		this.numSala = numSala;
		this.pelicula = pelicula;
		this.numFilas = numFilas;
		this.numAsientos = numAsientos;
		this.precio = precio;
		this.vendidas = vendidas;
		this.ventas = new int [numFilas][numAsientos];
	}

	public int getVendidas() {
		return vendidas;
	}

	public void setVendidas(int vendidas) {
		this.vendidas = vendidas;
	}

	public int[][] getVentas() {
		return ventas;
	}

	public void setVentas(int i, int j, int valor) {
		this.ventas[i][j] = valor;
	}

	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public int getNumFilas() {
		return numFilas;
	}

	public void setNumFilas(int numFilas) {
		this.numFilas = numFilas;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean comprobar (int fila, int asiento, int totalCine) {
		boolean vendido = true;
		
		if (vendidas == numFilas * numAsientos) {
			System.out.println("\nLa sala está llena, lo sentimos...");
			vendido = false;
		} else {
			while (fila > numFilas || asiento > numAsientos) {
				System.out.println("\nLocalidad no válida. Por favor, indique una fila entre 1 y "+numFilas+" y"
						+ " un asiento entre 1 y "+numAsientos);
				System.out.print("\nFila: ");
				fila = Leer.datoInt();
				System.out.print("\nAsiento: ");
				asiento = Leer.datoInt();
			}
			
			while (ventas[fila-1][asiento-1] == 1) {
				System.out.println("\nEsa butaca ya está vendida. Escoja otra. \n");
				System.out.print("\n¿Qué fila quieres?: ");
				fila = Leer.datoInt();
				System.out.print("\n¿Qué asiento quieres?: ");
				asiento = Leer.datoInt();
			} 
			System.out.println("\n¡¡¡Disfrute de la película!!!");
			ventas[fila-1][asiento-1] = 1;
			Entrada miEntrada = new Entrada (fila, asiento);
			vendidas++;
			totalCine++;
			miEntrada.setId(totalCine);
			miEntrada.imprimirEntrada(miEntrada.getId(), fila, asiento, precio, pelicula);
			System.out.println("\t\t\t\t - P A N T A L L A -");
			for (int i = 0; i < numFilas; i++) {
				System.out.println("");
				for (int j = 0; j < numAsientos; j++) {
					System.out.print("\t"+ventas[i][j]);
				}
			}
			System.out.println("");
		}
		return vendido;
	}


}
