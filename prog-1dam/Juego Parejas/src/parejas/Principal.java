package parejas;

public class Principal {

	public static void main(String[] args) {
		
		int nivel = 0, jugada = 1;
		int [] coordenadas = new int [4];
		String turno = "";
		boolean acierto = false, finalizado = true;
		
		Config partida = new Config ();
		
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
			miTablero.escribeDatos(jugadores, turno);
			miTablero.dibujarTablero(nivel);
			coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas, nivel); // Las coordenadas serían un array de int de 4 posiciones
			
			while (!miTablero.comprobarLevantado(coordenadas[0] - 1, coordenadas[1] - 1)) {
				coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas, nivel);
			}
			
			miTablero.setMostrar(coordenadas[0] - 1, coordenadas[1] - 1, true);  //TODO Cambiar las (0,0) por (1,1)
			miTablero.escribeDatos(jugadores, turno);
			miTablero.dibujarTablero(nivel);  
			jugada++;
			
			coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas, nivel);
			
			while (!miTablero.comprobarLevantado(coordenadas[2] - 1, coordenadas[3] - 1)) {
				coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas, nivel);
			}
			
			miTablero.setMostrar(coordenadas[2] - 1, coordenadas[3] - 1, true);
			miTablero.escribeDatos(jugadores, turno);
			miTablero.dibujarTablero(nivel);
			jugada--;
			
			acierto = miTablero.comprobarJugada(coordenadas);
			
			finalizado = miTablero.comprobarFinalizado();
			
			turno = partida.finalizaJugada(acierto, finalizado, turno, jugadores);
			
			miTablero.ocultarFallos (coordenadas, acierto);
			
			
			
			partida.pausa(finalizado);
			
			
			
		} while (!finalizado);
		
		partida.devuelveGanador(jugadores);
		
	}

}
