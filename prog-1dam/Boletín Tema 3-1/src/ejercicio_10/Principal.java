package ejercicio_10;

import ejercicio_09.Leer;

public class Principal {
	
	/*
	Hacer un programa para gestionar un cine. Cada entrada de cine tendr� un
	n�mero identificativo, precio, n�mero de la fila y de localidad.
	Se dar�n al usuario las siguientes opciones en un switch:
	1. Ver cartelera (s�lo dos o tres pel�culas). 2. Comprar entrada (una o varias)
	comprobando si una localidad est� vendida y si quedan localidades libres.3.
	Mostrar precio total a pagar. 4. Calcular ganancias totales del d�a. 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char continuar = 's';
		int opcion = 0, nSalas = 3, nEntradas = 0;
		
		Sala sala1 = new Sala (1, "Los Juegos del Hambre", 30, 15, 7.5);
		Sala sala2 = new Sala (2, "En busca de Bobby Fisher", 15, 10, 6);
		Sala sala3 = new Sala (3, "Interstellar 3D", 30, 20, 9.5);
		
		Cine cineDAM = new Cine (nSalas, sala1, sala2, sala3);
		
		System.out.println("\n\t\t***Bienvenido a mi programa***\n\n"
				+ "Sirve para gestionar las salas de un cine.\n");
		
		do {
			//cineDAM.reseteoventas();
			
			System.out.println(sala1);
			
			System.out.println("\nBienvenido al Cine DAM. Por favor, seleccione la opci�n deseada:\n "
					+ "\t1.- Ver cartelera\n"
					+ "\t2.- Comprar entradas\n"
					+ "\t3.- Mostrar las ganancias del d�a\n\n"
					+ "\t0.- Salir");
			System.out.print("\nSu opci�n: ");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				cineDAM.mostrarcartelera();
			break;
			case 2:
				System.out.print("\n�Cu�ntas entradas desea comprar?: ");
				nEntradas = Leer.datoInt();
				cineDAM.comprarentradas(nEntradas);
			break;
			case 3:
				System.out.printf("\nLas ganancias de hoy ascienden a %.2f �", cineDAM.getGanadoDia());
			case 0:
			}
					
			
			if (opcion != 0) {
				System.out.print("\n�Desea realizar otra operaci�n? (S/N): ");
				continuar = Leer.datoChar();
			}
			
		} while (continuar == 's' || continuar == 'S');
		
		System.out.println("\n���Gracias por utilizar mi programa!!!");
	}

}
