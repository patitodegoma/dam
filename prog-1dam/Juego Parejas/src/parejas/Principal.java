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
	 * Rafael Carretero:  Desarrollo de varios m�todos de la Clase Config. y la Clase Jugador.
	 * 
	 * Andr�s Mac�as:     Desarrollo de las Clases Coleccion, Juego, Tablero, Utiles, y resto de m�todos de la Clase Config.
	 *                    Compilaci�n y homogeneizaci�n de todos los m�todos y clases del trabajo. Organizaci�n del juego en 
	 *                    Clases y M�todos.
	 * 
	 */
		
	public static void main(String[] args) {
		
		int nivel = 0;
		String turno = "";
		boolean repetida [] = {false, true};	// El primer boolean indica si se repite el juego, y el segundo si se crean nuevos jugadores
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
