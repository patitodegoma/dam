package parejas;

public class Principal {

	public static void main(String[] args) {
		
		int nivel = 0, jugada = 1;
		int [] coordenadas = new int [4];
		String turno = "";
		boolean acierto = false, finalizado = true, comprobado = false;
		
		Config partida = new Config ();
		
		System.out.println("Andres\tPuntos");
		System.out.println("Macarena\tPuntos");
		
		System.out.println("\n\t*** B I E N V E N I D O   A L   J U E G O   D E   L A S   P A R E J A S ***");
		
		System.out.println("\nEl juego consiste en buscar por turnos las parejas de nombres en el tablero. Gana el "
				+ "jugador con más puntos al final de la partida.");
		
		nivel = partida.seleccionaNivel();				
		
		Coleccion cole = partida.configuraColeccion(partida.seleccionaColeccion());
		cole.desordenar();
								
		Coleccion coleRepe = partida.generaParejas(nivel, cole);	
		coleRepe.desordenar();
			
		Tablero miTablero = new Tablero (cole, coleRepe);
		miTablero.montaTablero(nivel);
		
		Jugador [] jugadores = partida.creaJugadores();
		
		turno = partida.sorteoInicial(jugadores);
					
		miTablero.inicializarTablero(nivel);
		
		//TODO Clase jugar con el do-while
		
		do {
			miTablero.escribeDatos(jugadores);
			miTablero.dibujarTablero();
			coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas); // Las coordenadas serían un array de int de 4 posiciones
			comprobado = partida.comprobarCoordenadas(coordenadas, nivel);
			
			while (!miTablero.comprobarLevantado(coordenadas[0] - 1, coordenadas[1] - 1)) {
				coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas);
			}
			
			miTablero.setMostrar(coordenadas[0] - 1, coordenadas[1] - 1, true);  //TODO Cambiar las (0,0) por (1,1)
			miTablero.escribeDatos(jugadores);
			miTablero.dibujarTablero();  //TODO Estirar el tablero (2 tabs)
			jugada++;
			
			System.out.println("\n\n# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #\n");
			coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas);
			
			while (!miTablero.comprobarLevantado(coordenadas[2] - 1, coordenadas[3] - 1)) {
				coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas);
			}
			
			miTablero.setMostrar(coordenadas[2] - 1, coordenadas[3] - 1, true);
			miTablero.escribeDatos(jugadores);
			miTablero.dibujarTablero();
			jugada--;
			
			acierto = miTablero.comprobarJugada(coordenadas);
			
			turno = partida.finalizaJugada(acierto, turno, jugadores);
			
			miTablero.ocultarFallos (coordenadas, acierto);
			
			finalizado = miTablero.comprobarFinalizado();
			
			partida.pausa(finalizado);
			
			
			
		} while (!finalizado);
		
		//TODO Terminar, resumen de puntuaciones y ganador
		
	}

}
