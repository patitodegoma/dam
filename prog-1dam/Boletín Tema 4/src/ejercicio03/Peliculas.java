package ejercicio03;

import utiles.Leer;

public class Peliculas extends Articulos {
	
	private String director;
	private String protagonista;
	private int minutos;
	private int numPremios;
	private String genero;
	private String clasificacion;
	
	public Peliculas () {
		super ();
		this.director = "";
		this.protagonista = "";
		this.minutos = 0;
		this.numPremios = 0;
		this.genero = "";
		this.clasificacion = "";
	}
	
	public Peliculas (double precio, String titulo, String director, String protagonista, int minutos, 
			int numPremios, String genero, String clasificacion) {
		super (precio, titulo);
		this.director = director;
		this.protagonista = protagonista;
		this.minutos = minutos;
		this.numPremios = numPremios;
		this.genero = genero;
		this.clasificacion = clasificacion;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProtagonista() {
		return protagonista;
	}

	public void setProtagonista(String protagonista) {
		this.protagonista = protagonista;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getNumPremios() {
		return numPremios;
	}

	public void setNumPremios(int numPremios) {
		this.numPremios = numPremios;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	public Peliculas pideDatos (Peliculas miPeli) {
		super.pideDatos();
		System.out.print("\nPor favor, introduzca el nombre del director: ");
		setDirector(Leer.dato());
		System.out.println("\nPor favor, introduzca el nombre del protagonista: ");
		setProtagonista(Leer.dato());
		System.out.println("\nPor favor, introduzca el total de minutos: ");
		setMinutos(Leer.datoInt());
		System.out.print("\nPor favor, introduzca el número de premios: ");
		setNumPremios(Leer.datoInt());
		System.out.println("\nPor favor, introduzca el género: ");
		setGenero(Leer.dato());
		System.out.println("\nPor favor, introduzca la clasificación por edad (NR): ");
		setClasificacion(Leer.dato());
		return miPeli;
	}

	
	public String toString() {
		return "\nLos datos de la película son: " + super.toString() + "\nNombre del director: "+ director + ""
				+ "\nNombre del protagonista: "+ protagonista + ""
						+ "\nTotal de minutos: "+ minutos + ""
								+ "\nNúmero de premios: "+ numPremios + ""
										+ "\nGénero: "+ genero + ""
												+ "\nClasificación por edad: "+ clasificacion;
	}
	

}
