package ejercicio03;

public class Principal {
	
	/*
		Crea un programa que sirva para gestionar de forma sencilla una tienda de música, cine
		y videojuegos. Esta tienda vende 3 tipos de artículos, discos de música, películas y
		videojuegos. Sólo se debe añadir métodos para establecer los valores de los atributos y
		poder imprimirlos datos en pantalla. De momento, no hace falta gestionar el almacén
		con los artículos que quedan, sólo se crearán en el main un objeto de cada tipo y se
		imprimirá los detalles de este en la pantalla. 
	*/


	public static void main(String[] args) {
		
		Articulos miArticulo = new Articulos ();
		Peliculas miPeli = new Peliculas ();
		Videojuegos miJuego = new Videojuegos ();
		Discos miDisco = new Discos ();
		
		miArticulo.pideDatos(miArticulo);
		miPeli.pideDatos(miArticulo, miPeli);
		miJuego.pideDatos(miArticulo, miJuego);
		miDisco.pideDatos(miArticulo, miDisco);
		
		System.out.println("\n\t" + miPeli);
		System.out.println("\n\t" + miJuego);
		System.out.println("\n\t" + miDisco);

	}

}
