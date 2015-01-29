package parejas;

import utilidades.*;

/**
 * Se encarga de las operaciones y llamadas a métodos del juego en sí, desde que el primer jugador se dispone a abrir la primera casilla.
 * @since Parejas 0.8
 * @version 4.0
 *
 */
public class Juego {
	
	/**
	 * Realiza cada turno de juego, con las dos tiradas de cada jugador.
	 * @param partida La configuración inicial, establecida en la clase <code>Config</code>.
	 * @param miTablero El tablero de juego, un objeto de la clase <code>Tablero</code>, con sus medidas correspondientes.
	 * @param nivel Entero que guarda el nivel del jugador
	 * @param jugadores Array de dos objetos de la clase <code>Jugador</code>, con los datos de los dos participantes.
	 * @param turno String que almacena el nombre del jugador que tiene el turno en este momento.
	 */
	public static void jugar (Config partida, Tablero miTablero, int nivel, Jugador [] jugadores, String turno) {
		int [] coordenadas = new int [4];
		int jugada = 1;
		boolean acierto = false, finalizado = false;
		
		do {
			miTablero.dibujar(jugadores, turno, nivel);
	
			coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas, nivel); // Las coordenadas serían un array de int de 4 posiciones
			
			while (!miTablero.comprobarLevantado(coordenadas[0] - 1, coordenadas[1] - 1)) {
				coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas, nivel);
			}
			
			miTablero.setMostrar(coordenadas[0] - 1, coordenadas[1] - 1, true);  
			
			miTablero.dibujar(jugadores, turno, nivel);
			
			jugada++;
			
			coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas, nivel);
			
			while (!miTablero.comprobarLevantado(coordenadas[2] - 1, coordenadas[3] - 1)) {
				coordenadas = partida.pideCoordenadas(turno, jugada, coordenadas, nivel);
			}
			
			miTablero.setMostrar(coordenadas[2] - 1, coordenadas[3] - 1, true);
			
			miTablero.dibujar(jugadores, turno, nivel);
			
			jugada--;
			
			acierto = miTablero.comprobarJugada(coordenadas);
			
			finalizado = miTablero.comprobarFinalizado();
			
			turno = partida.finalizaJugada(acierto, finalizado, turno, jugadores);
			
			miTablero.ocultarFallos (coordenadas, acierto);
					
			if (!finalizado) {
				Utiles.pausa();
			}
			
		} while (!finalizado);
	}

}
