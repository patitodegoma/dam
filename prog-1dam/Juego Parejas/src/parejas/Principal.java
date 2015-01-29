package parejas;

public class Principal {
		
	public static void main(String[] args) {
		
		int nivel = 0;
		String turno = "";
		boolean repetida [] = {false, true};	// El primer boolean indica si se va a jugar de nuevo, y el segundo si se van a crear nuevos jugadores en la nueva partida.
		Jugador [] jugadores = new Jugador [2];	
		Coleccion [] misColecciones = new Coleccion [2];
		Config partida = new Config ();
		
		partida.arrancar();
		
		do {
			nivel = partida.seleccionaNivel();				
			
			misColecciones = partida.preparaParejas(nivel);
				
			Tablero miTablero = new Tablero (misColecciones[0], misColecciones[1]);
			miTablero.montaTablero(nivel, partida);
			
			if (repetida[1]) {
				jugadores = partida.creaJugadores();
			}
			
			turno = partida.sorteoInicial(jugadores);
						
			miTablero.inicializarTablero(nivel);
			
			Juego.jugar(partida, miTablero, nivel, jugadores, turno);
			
			partida.devuelveGanador(jugadores);
			
			repetida = partida.preguntarRepeticion(jugadores);
			
		} while (repetida[0]);
	}
}
