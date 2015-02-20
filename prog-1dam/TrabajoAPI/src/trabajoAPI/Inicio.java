package trabajoAPI;

import utiles.Leer;

public class Inicio {
	
	/*
	
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion, numEquipo, capacidad, socios;
		String nombre, estadio;
		char respuesta = 'n';
		boolean borrado;
		
		// Creo un equipo para que haya uno al menos
		Equipo miEquipo = new Equipo ("Granada CF", "Nuevo Los Cármenes", 30000, 17500);
		
		Liga lfp = new Liga ();
	
		lfp.insertarEquipo(miEquipo);
		
		do {
			System.out.println("\n¿Qué hacemos?\n");
			
			System.out.println("1 - Agregar equipo\n"
					+ "2 - Borrar equipo\n"
					+ "3 - Buscar un equipo\n"
					+ "4 - Mostrar todos");
			
			System.out.print("Opción: ");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				System.out.print("\nVamos a crear un equipo. Dime el nombre: ");
				nombre = Leer.dato();
				System.out.print("\nY ahora el nombre del estadio: ");
				estadio = Leer.dato();
				System.out.print("\nIntroduzca la capacidad del estadio: ");
				capacidad = Leer.datoInt();
				System.out.print("\nPor último, introduzca el número de socios: ");
				socios = Leer.datoInt();
				
				Equipo nuevoEquipo = new Equipo (nombre, estadio, capacidad, socios);
				lfp.insertarEquipo(nuevoEquipo);
				break;
			case 2:
				System.out.print("\nVamos a borrar un equipo. Dime el nombre: ");
				numEquipo = Leer.datoInt();
				System.out.println("\nVa a borrar los siguientes datos: ");
				System.out.println(lfp.mostrarEquipo(numEquipo));
				System.out.print("\n¿Desea continuar? (S/N): ");
				respuesta = Leer.datoChar();
				if (respuesta == 's' || respuesta == 'S') {
					borrado = lfp.borrarNota(numEquipo);
					if (borrado)
						System.out.println("\nNota borrada satisfactoriamente.");
					else
						System.out.println("\nLa nota no se pudo eliminar.");
				} else {
					System.out.println("\nNo se borró la nota.");
				}
				break;
			case 3:
				System.out.print("\nPor favor, dígame el número de nota:");
				numEquipo = Leer.datoInt();
				System.out.println(lfp.mostrarEquipo(numEquipo));
				break;
			case 4:
				System.out.println("\nActualmente hay " + lfp.mostrarTamano() + " nota(s) guardada(s) hasta ahora en la agenda, y son las siguientes:\n");
				lfp.mostrarTodas();
			case 0:
			}
			
			if (opcion != 0) {
				System.out.print("\n¿Algo más? (S/N): ");
				respuesta = Leer.datoChar();
			}
			
			
		} while (respuesta == 's' || respuesta == 'S');	
		
		System.out.println(lfp);
	}

}
