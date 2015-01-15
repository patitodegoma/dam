package parejas;

public class Principal {
	
	/* Reparto básico del trabajo:
	 * 
	 * Juan María Moreno: Diseño de imágenes de cartas (finalmente no incluido en el juego), Diseño de la pantalla de inicio, 
	 *                    Clase Colección.
	 *                    
	 * José Manuel Palma: Métodos de control de errores, Métodos de recopilación de nivel y colección. 
	 *                    
	 * Guillermo Delgado: Desarrollo de la Clase Principal.
	 * 
	 * Rafael Carretero:  Desarrollo de varios métodos de la Clase Config. y la Clase Jugador.
	 * 
	 * Andrés Macías:     Desarrollo de las Clases Coleccion, Juego, Tablero, Utiles, y resto de métodos de la Clase Config.
	 *                    Compilación y homogeneización de todos los métodos y clases del trabajo. Organización del juego en 
	 *                    Clases y Métodos.
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
