package ejercicio03;

public class Principal {
	
	/*
		Crea un programa que sirva para gestionar de forma sencilla una tienda de m�sica, cine
		y videojuegos. Esta tienda vende 3 tipos de art�culos, discos de m�sica, pel�culas y
		videojuegos. S�lo se debe a�adir m�todos para establecer los valores de los atributos y
		poder imprimirlos datos en pantalla. De momento, no hace falta gestionar el almac�n
		con los art�culos que quedan, s�lo se crear�n en el main un objeto de cada tipo y se
		imprimir� los detalles de este en la pantalla. 
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
