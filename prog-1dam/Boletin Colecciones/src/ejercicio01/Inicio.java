package ejercicio01;

import utiles.Leer;

public class Inicio {
	
	/*
	Realizar una agenda electr�nica que permita almacenar notas. Debe permitir
	almacenar un n�mero infinito de notas, se podr�n mostrar de manera individual (mostrar
	una nota) y dar informaci�n del n�mero de notas guardadas. Usa la clase ArrayList para
	todo ello. Esta guardar� objetos tipo Notas.
	A�adir un m�todo que borre una de las notas guardadas. Antes de borrarla debe
	comprobar que el n�mero de la nota es v�lido.
	A�adir tambi�n un m�todo que muestre todas las notas guardadas (listar Todas). 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion, numNota;
		String titulo, texto;
		char respuesta = 'n';
		boolean borrado;
		
		// Creo esta nota a mano para que la agenda no est� vac�a por defecto, y se pueda probar el men� sin necesidad de crear notas.
		Nota miNota = new Nota ("Comprar tomates", "Comprar en el D�a los tomates para la ensalada de esta noche.");
		
		Agenda miAgenda = new Agenda ();
	
		miAgenda.insertarNota(miNota);
		
		do {
			System.out.println("\n�Qu� hacemos?\n");
			
			System.out.println("1 - Agregar nota\n"
					+ "2 - Borrar nota\n"
					+ "3 - Mostrar una nota\n"
					+ "4 - Listar todas");
			
			System.out.print("Opci�n: ");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				System.out.print("\nVamos a crear una nota. Dime el t�tulo: ");
				titulo = Leer.dato();
				System.out.print("\nY ahora el cuerpo de la nota: ");
				texto = Leer.dato();
				Nota nuevaNota = new Nota (titulo, texto);
				miAgenda.insertarNota(nuevaNota);
				break;
			case 2:
				System.out.print("\nVamos a borrar una nota. Dime el n�mero de nota: ");
				numNota = Leer.datoInt();
				System.out.println("\nVa a borrar la siguiente nota: ");
				System.out.println(miAgenda.mostrarNota(numNota));
				System.out.print("\n�Est� seguro? (S/N): ");
				respuesta = Leer.datoChar();
				if (respuesta == 's' || respuesta == 'S') {
					borrado = miAgenda.borrarNota(numNota);
					if (borrado)
						System.out.println("\nNota borrada satisfactoriamente.");
					else
						System.out.println("\nLa nota no se pudo eliminar.");
				} else {
					System.out.println("\nNo se borr� la nota.");
				}
				break;
			case 3:
				System.out.print("\nPor favor, d�game el n�mero de nota:");
				numNota = Leer.datoInt();
				System.out.println(miAgenda.mostrarNota(numNota));
				break;
			case 4:
				System.out.println("\nActualmente hay " + miAgenda.mostrarTamano() + " nota(s) guardada(s) hasta ahora en la agenda, y son las siguientes:\n");
				miAgenda.mostrarTodas();
			case 0:
			}
			
			if (opcion != 0) {
				System.out.print("\n�Algo m�s? (S/N): ");
				respuesta = Leer.datoChar();
			}
			
			
		} while (respuesta == 's' || respuesta == 'S');	
		
		System.out.println(miAgenda);
	}

}
