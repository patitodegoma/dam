package ejercicio_04;

public class Principal {
	
	/*
	 Crear un programa que simule el lanzamiento de una moneda (cara o cruz).
	 Para ello, se usarán métodos, como pueden ser lanzar moneda, asignar valor
	 elegido por cada una de las dos personas que juegan, mostrar ganador… 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre2 = "";
		char continuar = 's';
		boolean resultadoCara = false;
		Jugador jugador1 = new Jugador ("Andrés Macías");
		
		
		System.out.println("\t\n***Bienvenido a mi programa***\n\n"
				+ "Simula el juego del cara o cruz.\n");
		
		
		do {
			System.out.print("\nHola, soy Andrés Macías, experto programador, ¿contra quién tengo el placer de jugar hoy?: ");
			nombre2 = Leer.dato();
			
			Jugador jugador2 = new Jugador(nombre2);
			
			Juego miJuego = new Juego (jugador1, jugador2);
			
			System.out.print("\nBien, "+nombre2+", te dejo elegir. ¿Quieres cara o cruz? (C/X). O si no, pulsa 'n' y elegiré yo: ");
			continuar = Leer.datoChar();
			
			System.out.println(miJuego.asignarvalor(continuar));
			
			System.out.print("\nY la moneda al aire, sube, sube, gira, gira, cae, cae, .......... ");
			
			resultadoCara = miJuego.lanzarmoneda();
			
			if (resultadoCara) {
				System.out.print("¡¡Cara!!");
			} else {
				System.out.print("¡¡Cruz!!");
			}
			
			if (miJuego.mostrarganador(resultadoCara)) {
				System.out.println("\n\n¡He ganado! ¡Soy el mejor!");
			} else {
				System.out.println("\n\nBah, has tenido suerte!");
			}
			
			System.out.print("\n¿Otra partidita? (S/N): ");
			continuar = Leer.datoChar();
			
		} while (continuar == 's' || continuar == 'S');
		
		System.out.println("\n¡¡Gracias por usar mi programa!!");
		
	}

}
