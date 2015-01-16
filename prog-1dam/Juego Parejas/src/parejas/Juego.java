package parejas;

import utilidades.*;

public class Juego {
	
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
