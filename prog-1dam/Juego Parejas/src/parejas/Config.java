package parejas;

import utilidades.*;

public class Config {
	
	private int [] altos; // N�mero de filas del tablero por nivel
	private int [] anchos;
	private int puntosAcierto;
	private int puntosFallo;
	
	
	public Config () {
		this.altos = new int[]{4, 4, 5, 6};
		this.anchos = new int[]{4, 6, 6, 6};
		this.puntosAcierto = 5;
		this.puntosFallo = -1;
	}
	
	public Coleccion configuraColeccion (int n) {
		
		String listElementos [] = new String [18];
		//String coleLetras [] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", 
			//	"J", "K", "L", "M", "N", "O", "P", "Q", "R"}; 
		String coleNombres [] = {"Hugo", "Daniel", "Pablo", "�lvaro", "Mario", "Lucas", "Carlos", "Andr�s", "Sergio", 
				"Paula", "Sara", "Macarena", "Julia", "Alba", "Marta", "Elena", "In�s", "Enma"}; 
		String coleEuropa [] = {"Espa�a", "Italia", "Francia", "Holanda", "Alemania", "Austria", "Eslovenia", "Portugal",  
				"Croacia", "Rusia", "B�lgica", "Noruega", "Dinamarca", "Finlandia", "Suiza", "Suecia", "Eslovaquia", "Malta"};
		String coleEstrellas [] = {"Altair", "Sirrah", "Sirius", "Vega", "Deneb", "Canopus", "Rigel", "Polaris",  
				"Pollux", "Eltanin", "Procyon", "Capella", "Acrux", "Mirfak", "Alrescha", "Atria", "Spica", "Sol"};
		String coleFlores [] = {"Amapola", "An�mona", "Azucena", "Begonia", "Cal�ndula", "Camelia", "Alhel�", "Violeta",  
				"Girasol", "Clavel", "Geranio", "Rosa", "Cala", "Margarita", "Dalia", "Petunia", "Nardo", "Jacinto"};
		String coleMinerales [] = {"Azurita", "Cobre", "Cuarzo", "Diamante", "Dolomita", "Bauxita", "Apatito", "Corind�n",  
				"Berilo", "Mica", "Calcita", "Apatito", "Malaquita", "Pirita", "Fluorita", "Galena", "Feldespato", "Yeso"};

		while (n<6 && n>0) {   //TODO Quitar las constantes
			switch (n) {
			case 1:
				listElementos = coleNombres;
				n = 0;
				break;
			case 2:
				listElementos = coleEuropa;
				n = 0;
				break;
			case 3:
				listElementos = coleEstrellas;
				n = 0;
				break;
			case 4:
				listElementos = coleFlores;
				n = 0;
				break;
			case 5:
				listElementos = coleMinerales;
				n = 0;
				break;
			default:
				System.out.println("\nN�mero de colecci�n incorrecto. Por favor, introduzca un n�mero entre 1 y 5: ");
				n = Leer.datoInt();
			}
		}	
		Coleccion colEscogida = new Coleccion (listElementos);
		return colEscogida;
	}
	
	public Coleccion generaParejas (int nivel, Coleccion colEscogida) {
		int numParejas = altos[nivel-1] * anchos[nivel-1] / 2;
		String [] utilizadas = new String[numParejas];
		
		for (int i = 0; i < utilizadas.length; i++) {
			utilizadas[i] = colEscogida.getParejas(i);
		}
		
		Coleccion parejas = new Coleccion (utilizadas);
		return parejas;
	}
	
	public int seleccionaNivel () {
		int nivel = 0;
		boolean comprobado = false;
		
		System.out.println("\nPor favor, seleccione el nivel de juego: \n");
		while (!comprobado) {
			System.out.println("\t1 - Nivel f�cil (tablero de 4x4)\n"
					 + "\t2 - Nivel normal (tablero de 4x6)\n"
					 + "\t3 - Nivel dif�cil (tablero de 5x6)\n"
					 + "\t4 - Nivel muy dif�cil (tablero de 6x6)\n");			 
			System.out.print("Nivel: ");
			nivel = Leer.datoInt();
			comprobado = compruebaNivel(nivel);
		}
		return nivel;
	}
	
	public int seleccionaColeccion () {
		int numColeccion = 0;
		boolean comprobado = false;
		
		System.out.println("\nPor favor, seleccione la colecci�n a usar: \n");
		while (!comprobado) {
			System.out.println("\t1 - Nombres propios de persona\n"
					+ "\t2 - Pa�ses de Europa\n"
					+ "\t3 - Estrellas del firmamento\n"
					+ "\t4 - Nombres de flores\n"
					+ "\t5 - Nombres de Minerales\n");		 
			System.out.print("Colecci�n: ");
			numColeccion = Leer.datoInt();
			comprobado = compruebaColeccion(numColeccion);
		}
		configuraColeccion(numColeccion);
		return numColeccion;
	}
	
	
	public boolean compruebaNivel (int nivel) {
		boolean comprobado = (nivel > 0 && nivel < 5) ? true : false;
		if (!comprobado) {
			System.out.println("\nNivel introducido no v�lido. Por favor escoja uno correcto.\n");
		}
		return comprobado;
	}
	
	public boolean compruebaColeccion (int numColeccion) {
		boolean comprobado = (numColeccion > 0 && numColeccion < 6) ? true : false;
		if (!comprobado) {
			System.out.println("\nN�mero de colecci�n no v�lido. Por favor escoja uno correcto.\n");
		}
		return comprobado;
	}
	
	public Jugador[] creaJugadores () {
		Jugador [] jugadores = new Jugador[2];
		
		System.out.print("\nPor favor, introduzca el nombre del jugador 1: ");
		Jugador jugador1 = new Jugador (Leer.dato());
		jugadores[0] = jugador1;
		System.out.print("\nPor favor, introduzca ahora el nombre del jugador 2: ");
		Jugador jugador2 = new Jugador (Leer.dato());
		jugadores[1] = jugador2;
		return jugadores;
	}
	
	public String sorteoInicial (Jugador [] jugadores) {
		String turno = (Math.random() > 0.5) ? jugadores[0].getNombre() : jugadores[1].getNombre();
		
		if (turno.equals(jugadores[0].getNombre())) {
			System.out.println("\nComienza jugando "+jugadores[0].getNombre()+". �Buena Suerte!\n");
		}
		else {
			System.out.println("\nComienza jugando "+jugadores[1].getNombre()+". �Buena Suerte!\n");
		}
		
		return turno;
	}
	
	public int [] pideCoordenadas (String turno, int jugada, int [] coordenadas, int nivel) {
		boolean comprobado = false;
		
		while (!comprobado) {
			if (jugada == 1) {
				System.out.print("\n"+turno+", introduce la fila: ");
				coordenadas[0] = Leer.datoInt();
				System.out.print("\n"+turno+", introduce la columna: ");
				coordenadas[1] = Leer.datoInt();
			} else {
				System.out.print("\n"+turno+", introduce la segunda fila: ");
				coordenadas[2] = Leer.datoInt();
				System.out.print("\n"+turno+", introduce la segunda columna: ");
				coordenadas[3] = Leer.datoInt();
			}
			comprobado = comprobarCoordenadas (coordenadas, nivel, jugada);
		}	
		return coordenadas;
	}
		
	public boolean comprobarCoordenadas (int [] coordenadas, int nivel, int jugada) {
		boolean comprobado = true;
		if (jugada == 1) {
			if (coordenadas[0] > altos[nivel-1] || coordenadas[0] < 1)
				comprobado = false;
			if (coordenadas[1] > anchos[nivel-1] || coordenadas[1] < 1)
				comprobado = false;
		} else {
			if (coordenadas[2] > altos[nivel-1] || coordenadas[2] < 1)
				comprobado = false;
			if (coordenadas[3] > anchos[nivel-1] || coordenadas[3] < 1)
				comprobado = false;
		}
		if (!comprobado)
			System.out.println("\nLa fila o la columna introducida est� fuera de los l�mites del tablero. Por favor, "
					+ "introduce una celda v�lida.");
		
		return comprobado;
	}
	
	public String finalizaJugada (boolean resultado, boolean finalizado, String turno, Jugador [] jugadores) {
		if (resultado) {
			if (!finalizado) {
				System.out.println("\n��� Muy bien !!! Contin�a tu turno");
			}
			if (turno.equals(jugadores[0].getNombre()))
				jugadores[0].setPuntos(jugadores[0].getPuntos()+puntosAcierto);
			else
				jugadores[1].setPuntos(jugadores[1].getPuntos()+puntosAcierto);
		} else {
			System.out.println("\n��� Mala suerte !!! Quiz� a la pr�xima. Pierdes tu turno.");
					
			if (turno.equals(jugadores[0].getNombre())) {
				jugadores[0].setPuntos(jugadores[0].getPuntos()+puntosFallo);
			} else {
				jugadores[1].setPuntos(jugadores[1].getPuntos()+puntosFallo);
			}
			
			turno = (turno.equals(jugadores[0].getNombre())) ? jugadores[1].getNombre() : jugadores[0].getNombre();
		}
		return turno;
	}
	
	/**
	 * Realiza una pausa en el juego, si este no ha finalizado, para que los jugadores puedan ver el tablero. Una vez se pulse la tecla C, se insertan 150 l�neas en blanco para "limpiar la pantalla".
	 * @param finalizado Indica si el juego ha finalizado o no.
	 */
	public void pausa (boolean finalizado) {
		if (!finalizado) {
			System.out.print("\nPulsa 'C' para continuar: ");
			char continuar = Leer.datoChar();
			while (continuar != 'C' && continuar != 'c') {
				System.out.print("\nPulsa 'C' para continuar: ");
				continuar = Leer.datoChar();
			}
			for (int i = 0; i < 150; i++) 
				System.out.println();
		}
		
	}
	
	public void devuelveGanador (Jugador [] jugadores) {
		
		if (jugadores[0].getPuntos() > jugadores[1].getPuntos()) {
			System.out.println("\n���El ganador es ........ "+jugadores[0].getNombre()+", con "+jugadores[0].getPuntos()+" puntos!!! ��� Enhorabuena !!!");		
		} else if (jugadores[1].getPuntos() > jugadores[0].getPuntos()) {
			System.out.println("\n���El ganador es ........ "+jugadores[1].getNombre()+", con "+jugadores[1].getPuntos()+" puntos!!! ��� Enhorabuena !!!");		
		} else {
			System.out.println("\n�Vaya, tenemos un empate! Habr� que jugar otra partida, �no? ;)");		
		}
	}

}
