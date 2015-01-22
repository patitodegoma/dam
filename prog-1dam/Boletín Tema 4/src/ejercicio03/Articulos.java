package ejercicio03;

import utiles.*;

public class Articulos {
	
	private double precio;
	private String titulo;
	
	public Articulos () {
		this.precio = 0.0;
		this.titulo = "";
	}
	
	public Articulos (double precio, String titulo) {
		this.precio = precio;
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Articulos pideDatos (Articulos miArticulo) {
		System.out.print("\nPor favor, introduzca el t�tulo: ");
		setTitulo(Leer.dato());
		System.out.println("\nPor favor, introduzca el precio: ");
		setPrecio(Leer.datoDouble());
		return miArticulo;
	}

	
	public String toString() {
		return "\nT�tulo del art�culo: "+ titulo + "."
				+ "\nPrecio del art�culo: " + precio + " �. ";
	}
	
	
	

}
