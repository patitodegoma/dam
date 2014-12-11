package ejercicio_10;

import java.util.Arrays;

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

	public int[][] getVentas() {
		return ventas;
	}

	public void setVentas(int i, int j, int valor) {
		this.ventas[i][j] = valor;
	}
	
	public int getVendidas() {
		return vendidas;
	}

	public void setVendidas(int vendidas) {
		this.vendidas = vendidas;
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
	
	public boolean comprobar (int fila, int asiento) {
		boolean vendido = true;
		while (ventas[fila][asiento] == 1) {
			System.out.println("F-"+ventas[fila][asiento]);
			System.out.println("\nEsa butaca ya está vendida. Escoge otra. \n");
			System.out.print("\n¿Qué fila quieres?: ");
			fila = Leer.datoInt();
			System.out.print("\n¿Qué asiento quieres?: ");
			asiento = Leer.datoInt();
		} 
		System.out.println("V-"+ventas[fila][asiento]);
		System.out.println("\nEa, ya la tienes");
		ventas[fila][asiento] = 1;
		return vendido;
	}

	@Override
	public String toString() {
		return "Sala [numSala=" + numSala + ", pelicula=" + pelicula
				+ ", numFilas=" + numFilas + ", numAsientos=" + numAsientos
				+ ", precio=" + precio + ", vendidas=" + vendidas + ", ventas="
				+ Arrays.toString(ventas) + "]";
	}
	
	
	
	

}
