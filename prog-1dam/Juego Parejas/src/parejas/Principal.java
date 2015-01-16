package parejas;

public class Principal {
	
	/* Reparto b�sico del trabajo:
	 * 
	 * Juan Mar�a Moreno: Dise�o de im�genes de cartas (finalmente no incluido en el juego), Dise�o de la pantalla de inicio, 
	 *                    Clase Colecci�n.
	 *                    
	 * Jos� Manuel Palma: M�todos de control de errores, M�todos de recopilaci�n de nivel y colecci�n. 
	 *                    
	 * Guillermo Delgado: Desarrollo de la Clase Principal.
	 * 
	 * Rafael Carretero:  Desarrollo de la Clase Jugador y parte de la Clase Juego.
	 * 
	 * Andr�s Mac�as:     Desarrollo de las Clases Coleccion, Juego, Tablero, Utiles, y Config. Creaci�n de todos los Objetos.
	 *                    Compilaci�n, homogeneizaci�n y parametrizaci�n de todos los m�todos y clases del trabajo. Relaciones
	 *                    entre Clases. Dise�o y formato del juego.
	 * 
	 */
		
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
