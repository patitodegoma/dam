package examenUD5;

public class Inicio {

	public static void main(String[] args) {
		
		int opcion = -1;
		char respuesta = 's';
		
		System.out.println("\n\t*** Bienvenido a mi programa ***\n");
		System.out.println("\tSimula el funcionamiento de un diccionario con un ArrayList.\n");
		
		Diccionario muzzy = new Diccionario ();
		
		System.out.print("\n¿Desea cargar de inicio los datos de prueba en el diccionario? (S/N): ");
		respuesta = Leer.datoChar();
		if (respuesta == 's' || respuesta == 'S') {
			muzzy.agregarDatosPrueba();
		}
		
		while (opcion != 0) {
			System.out.println("\nPor favor, seleccione la opción que desee realizar:\n"
					+ "1.- Agregar nueva palabra.\n"
					+ "2.- Buscar el significado de una palabra.\n"
					+ "3.- Modificar el significado de una palabra.\n"
					+ "4.- Ordenar las palabras.\n"
					+ "5.- Borrar todas las palabras del diccionario.\n"
					+ "6.- Borrar una palabra del diccionario.\n"
					+ "7.- Mostrar todo el contenido del diccionario.\n"
					+ "0.- Salir.\n");
			System.out.print("\tOpcion: ");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				muzzy.agregarPalabra();
				break;
			case 2:
				muzzy.buscarSignificado();
				break;
			case 3:
				muzzy.modificarPalabra();
				break;
			case 4:
				muzzy.ordenarTodo();
				break;
			case 5:
				muzzy.borrarDiccionario();
				break;
			case 6:
				muzzy.borrarPalabra();
				break;
			case 7:
				muzzy.imprimirTodo();
				break;
			case 0:
			}
			
		}	
		
		System.out.println("\n*** Gracias por utilizar mi diccionario !!!");

	}
}
