package ejercicio03;

import utiles.Leer;

public class Videojuegos extends Articulos {
	
	private String fabricante;
	private int pegi;
	private String genero;
	
	public Videojuegos () {
		super ();
		this.fabricante = "";
		this.pegi = 0;
		this.genero = "";
	}
	
	public Videojuegos (double precio, String titulo, String fabricante, int pegi, String genero) {
		super (precio, titulo);
		this.fabricante = fabricante;
		this.pegi = pegi;
		this.genero = genero;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getPegi() {
		return pegi;
	}

	public void setPegi(int pegi) {
		this.pegi = pegi;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Videojuegos pideDatos (Articulos miArticulo, Videojuegos miJuego) {
		super.pideDatos(miArticulo);
		System.out.print("\nPor favor, introduzca el nombre del fabricante: ");
		setFabricante(Leer.dato());
		System.out.println("\nPor favor, introduzca la clasificación PEGI: ");
		setPegi(Leer.datoInt());
		System.out.println("\nPor favor, introduzca el género: ");
		setGenero(Leer.dato());
		return miJuego;
	}

	
	public String toString() {
		return "\nLos datos del Videojuego son:" + super.toString() + "\nNombre del fabricante: "+ fabricante + ""
				+ "\nClasificación PEGI: "+ pegi + ""
						+ "\nGénero: "+ genero;
	}
	

}
