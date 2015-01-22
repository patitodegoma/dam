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
		
		Peliculas miPeli = new Peliculas ();
		Videojuegos miJuego = new Videojuegos ();
		Discos miDisco = new Discos ();
		
		miPeli.pideDatos();
		miJuego.pideDatos();
		miDisco.pideDatos();
		
		System.out.println(miPeli);
		System.out.println(miJuego);
		System.out.println(miDisco);

	}

}
