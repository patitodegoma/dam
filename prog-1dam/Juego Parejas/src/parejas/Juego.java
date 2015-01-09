package parejas;

public class Juego {

	public static void main(String[] args) {
		
		int nivel = 0, anchura = 0, altura = 0, fila = 0, columna = 0, fila2 = 0, columna2 = 0, 
				puntosAcierto, puntosFallo = -2;
		String turno = "jugador1", nombre ="";
		char continuar = 'C';
		boolean comprobado = false, acierto = false, finalizado = true;
		
		String [] cartas = {"A", "B", "C", "D", "E", "F", "G", "H", "I", 
							"J", "K", "L", "M", "N", "O", "P", "Q", "R"};
		
		Coleccion cole = new Coleccion (cartas);
		cole.desordenar();	
			
		System.out.println("\n\t*** B I E N V E N I D O   A L   J U E G O   D E   L A S   P A R E J A S ***");
		
		System.out.println("\nEl juego consiste en buscar por turnos las parejas de nombres en el tablero. Gana el "
				+ "jugador con más puntos al final de la partida.");
		
		System.out.println("\nPor favor, seleccione el nivel de juego: \n"
				+ "\t1 - Nivel fácil (tablero de 4x4)\n"
				+ "\t2 - Nivel normal (tablero de 4x6)\n"
				+ "\t3 - Nivel difícil (tablero de 5x6)\n"
				+ "\t4 - Nivel muy difícil (tablero de 6x6)\n");
		System.out.print("Nivel: ");
		nivel = Leer.datoInt();
		
		puntosAcierto = 5*nivel;   // Definición de puntos por acierto, una vez determinado el nivel
		
		while (!comprobado) {
			switch (nivel) {
			case 1: 
				altura = 4;
				anchura = 4;
				comprobado = true;
				break;
			case 2:
				altura = 6;
				anchura = 4;
				comprobado = true;
				break;
			case 3:
				altura = 6;
				anchura = 5;
				comprobado = true;
				break;
			case 4:
				altura = 6;
				anchura = 6;
				comprobado = true;
				break;
			default:
				System.out.print("Valor incorrecto. Inserte un nivel válido: ");
				nivel = Leer.datoInt();
			}
		}
				
		String [] usadas = new String [altura*anchura/2];
		for (int i = 0; i < usadas.length; i++) {
			usadas[i] = cole.getParejas(i);
		}	
		
		Coleccion coleRepe = new Coleccion (usadas);
		coleRepe.desordenar();
		
		
		Tablero miTablero = new Tablero (anchura, altura, cole, coleRepe);
		
		System.out.print("\nPor favor, introduzca el nombre del jugador 1: ");
		Jugador jugador1 = new Jugador (Leer.dato());
		System.out.print("\nPor favor, introduzca ahora el nombre del jugador 2: ");
		Jugador jugador2 = new Jugador (Leer.dato());
		
		turno = (Math.random() > 0.5) ? "jugador1" : "jugador2";
		
		if (turno == "jugador1") {
			System.out.println("\nComienza jugando "+jugador1.getNombre()+". ¡Buena Suerte!\n");
			nombre = jugador1.getNombre();
		}
		else {
			System.out.println("\nComienza jugando "+jugador2.getNombre()+". ¡Buena Suerte!\n");
			nombre = jugador2.getNombre();
		}
			
		miTablero.inicializarTablero(nivel);
		miTablero.taparTodo();
		
		do {
			miTablero.escribeDatos(jugador1, jugador2);
			miTablero.dibujarTablero();
			System.out.print("\n"+nombre+", introduce la fila: ");
			fila = Leer.datoInt();
			System.out.print("\n"+nombre+", introduce la columna: ");
			columna = Leer.datoInt();
			while (!miTablero.comprobarLevantado(fila, columna)) {
				System.out.println("\nEsa casilla ya está levantada. Escoge otra, por favor!");
				System.out.print("\n"+nombre+", introduce la fila: ");
				fila = Leer.datoInt();
				System.out.print("\n"+nombre+", introduce la columna: ");
				columna = Leer.datoInt();
			}
			miTablero.setMostrar(fila, columna, true);
			miTablero.escribeDatos(jugador1, jugador2);
			miTablero.dibujarTablero();
			System.out.println("\n\n# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #\n");
			System.out.print("\n"+nombre+", introduce la segunda fila: ");
			fila2 = Leer.datoInt();
			System.out.print("\n"+nombre+", introduce la segunda columna: ");
			columna2 = Leer.datoInt();
			while (!miTablero.comprobarLevantado(fila2, columna2)) {
				System.out.println("\nEsa casilla ya está levantada. Escoge otra, por favor!");
				System.out.print("\n"+nombre+", introduce la segunda fila: ");
				fila2 = Leer.datoInt();
				System.out.print("\n"+nombre+", introduce la segunda columna: ");
				columna2 = Leer.datoInt();
			}
			miTablero.setMostrar(fila2, columna2, true);
			miTablero.escribeDatos(jugador1, jugador2);
			miTablero.dibujarTablero();
			acierto = miTablero.comprobarJugada(fila, columna, fila2, columna2);
			if (acierto) {
				System.out.println("\n¡¡¡ Muy bien !!! Continúa tu turno");
				if (turno == "jugador1")
					jugador1.setPuntos(jugador1.getPuntos()+puntosAcierto);
				else
					jugador2.setPuntos(jugador2.getPuntos()+puntosAcierto);
			} else {
				System.out.println("\n¡¡¡ Mala suerte !!! Quizá a la próxima. Pierdes tu turno.");
				turno = (turno == "jugador1") ? "jugador2" : "jugador1";
				nombre = (turno == "jugador1") ? jugador1.getNombre() : jugador2.getNombre();
				if (turno == "jugador1")
					jugador1.setPuntos(jugador1.getPuntos()+puntosFallo);
				else
					jugador2.setPuntos(jugador2.getPuntos()+puntosFallo);
				miTablero.setMostrar(fila, columna, false);
				miTablero.setMostrar(fila2, columna2, false);
			}
			System.out.print("\nPulsa 'C' para continuar: ");
			continuar = Leer.datoChar();
			while (continuar != 'C' && continuar != 'c') {
				System.out.print("\nPulsa 'C' para continuar: ");
				continuar = Leer.datoChar();
			}
			for (int i = 0; i < 150; i++) 
				System.out.println();
			
			finalizado = miTablero.comprobarFinalizado();
			
		} while (!finalizado);
		
		

	}

}
