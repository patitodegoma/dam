package ejercicio02;

import utiles.Leer;

/*
Crear un programa para gestionar los socios de un club de Campo “de categoría”.
Se deben guardar los datos personales del socio, poder mostrar sus datos, modificarlos y
borrarlos. Usar la clase ArrayList. Este ejercicio es para empezar, así que no es
necesario hacer nada más, aunque se podrían agregar funcionalidades como alquilar
pistas, pagar cuotas, etc. (¡Para aburridos!) 
*/

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		char respuesta;
		
		System.out.println("\n\t *** Bienvenido a mi programa ***\n");
		System.out.println("Simula la gestión del Club de Campo 'La Ponderosa'.\n");
		
		Club laPonderosa = new Club ();
		
		System.out.print("\n¿Desea cargar los datos de prueba? (S/N): ");
		respuesta = Leer.datoChar();
		if (respuesta == 's' || respuesta == 'S') {
			cargarDatosPrueba(laPonderosa);
		}
		
		while (opcion != 6) {
			System.out.println("\nPor favor, seleccione la opción a realizar:\n");
			System.out.println("1 - Dar de alta un socio.");
			System.out.println("2 - Modificar un socio existente.");
			System.out.println("3 - Mostrar todos los socios.");
			System.out.println("4 - Borrar un socio.");
			System.out.println("5 - Mostrar un socio.");
			System.out.println("6 - Salir del programa.");
			System.out.print("Opcion: ");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				laPonderosa.agregarSocios();
				break;
			case 2:
				laPonderosa.modificarSocios();
				break;
			case 3:
				laPonderosa.mostrarTodos();
				break;
			case 4:
				laPonderosa.borrarSocios();
				break;
			case 5:
				laPonderosa.mostrarSocio();
			}
				
		}
		
		System.out.println("\n¡¡¡Gracias por utilizar mi programa!!!");
	}
	
	
	public static void cargarDatosPrueba (Club laPonderosa) {
		
		Socio [] datosPrueba = new Socio [10];
		datosPrueba [0] = new Socio ("Andrés Macías", 1978, "Av. Kansas City 6", 635451670);
		datosPrueba [1] = new Socio ("John Smith", 1975, "C/ Juan Díaz de Solis 3", 655154545);
		datosPrueba [2] = new Socio ("Cristiano Ronaldo", 1983, "C/ Portugués 31", 699854545);
		datosPrueba [3] = new Socio ("Steve Jobs", 1951, "C/ de la Manzana 13", 615487826);
		datosPrueba [4] = new Socio ("Francisco Nicolás", 1999, "C/ del Pinchazo 44", 612478864);
		datosPrueba [5] = new Socio ("Aleksander Alekhine", 1930, "C/ Campeones 12", 612888556);
		datosPrueba [6] = new Socio ("Dora la Exploradora", 2005, "C/ del Mono 1", 0);
		datosPrueba [7] = new Socio ("Bilbo Bolsón", 1912, "C/ Bolsón Cerrado 1", 621365874);
		datosPrueba [8] = new Socio ("Luke Skywalker", 1975, "C/ Estrella de la Muerte 3", 614575784);
		datosPrueba [9] = new Socio ("El Niño Alemán Loco", 2008, "C/ Profesor Ángel Naranjo 17", 0);
		
		laPonderosa.agregarSocios(datosPrueba);
		
	}

}
