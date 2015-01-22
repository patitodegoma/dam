package ejercicio03;

import utiles.Leer;

public class Discos extends Articulos {
	
	private String grupo;
	private int numCanciones;
	private int minutos;
	
	public Discos () {
		super ();
		this.grupo = "";
		this.numCanciones = 0;
		this.minutos = 0;
	}
	
	public Discos (double precio, String titulo, String grupo, int numCanciones, int minutos) {
		super (precio, titulo);
		this.grupo = grupo;
		this.numCanciones = numCanciones;
		this.minutos = minutos;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getNumCanciones() {
		return numCanciones;
	}

	public void setNumCanciones(int numCanciones) {
		this.numCanciones = numCanciones;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public Discos pideDatos (Discos miDisco) {
		super.pideDatos();
		System.out.print("\nPor favor, introduzca el nombre del grupo: ");
		setTitulo(Leer.dato());
		System.out.println("\nPor favor, introduzca el número de canciones: ");
		setNumCanciones(Leer.datoInt());
		System.out.println("\nPor favor, introduzca el total de minutos: ");
		setMinutos(Leer.datoInt());
		return miDisco;
	}

	
	public String toString() {
		return "\nLos datos del disco son: " + super.toString() + "\nNombre del grupo: "+ grupo + ""
				+ "\nNúmero de canciones: "+ numCanciones + ""
						+ "\nTotal de minutos: "+ minutos;
	}
	
	
	

}
