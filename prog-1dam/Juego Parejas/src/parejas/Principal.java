package parejas;

public class Principal {
		
	public static void main(String[] args) {
		
		int nivel = 0;
		String turno = "";
		boolean repetida [] = {false, true};	// El primer boolean indica si se repite el juego, y el segundo si se crean nuevos jugadores
		Jugador [] jugadores = new Jugador [2];	
		Config partida = new Config ();
		
		partida.arrancar();
		
		do {
			nivel = partida.seleccionaNivel();				
			
			Coleccion cole = partida.configuraColeccion(partida.seleccionaColeccion());
			cole.desordenar();
									
			Coleccion coleRepe = partida.generaParejas(nivel, cole);	
			coleRepe.desordenar();
				
			Tablero miTablero = new Tablero (cole, coleRepe);
			miTablero.montaTablero(nivel);
			
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
