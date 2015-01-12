package parejas;


public class Config {
	
	private int [] altos; // Número de filas del tablero por nivel
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
		String coleNombres [] = {"Hugo", "Daniel", "Pablo", "Álvaro", "Mario", "Lucas", "Carlos", "Andrés", "Sergio", 
				"Paula", "Sara", "Macarena", "Julia", "Alba", "Marta", "Elena", "Inés", "Enma"}; 
		String coleEuropa [] = {"España", "Italia", "Francia", "Holanda", "Alemania", "Austria", "Eslovenia", "Portugal",  
				"Croacia", "Rusia", "Bélgica", "Noruega", "Dinamarca", "Finlandia", "Suiza", "Suecia", "Eslovaquia", "Malta"};
		String coleEstrellas [] = {"Altair", "Sirrah", "Sirius", "Vega", "Deneb", "Canopus", "Rigel", "Polaris",  
				"Pollux", "Eltanin", "Procyon", "Capella", "Acrux", "Mirfak", "Alrescha", "Atria", "Spica", "Sol"};
		String coleFlores [] = {"Amapola", "Anémona", "Azucena", "Begonia", "Caléndula", "Camelia", "Alhelí", "Violeta",  
				"Girasol", "Clavel", "Geranio", "Rosa", "Cala", "Margarita", "Dalia", "Petunia", "Nardo", "Jacinto"};
		String coleMinerales [] = {"Azurita", "Cobre", "Cuarzo", "Diamante", "Dolomita", "Bauxita", "Apatito", "Corindón",  
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
				System.out.println("\nNúmero de colección incorrecto. Por favor, introduzca un número entre 1 y 5: ");
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
			System.out.println("\t1 - Nivel fácil (tablero de 4x4)\n"
					 + "\t2 - Nivel normal (tablero de 4x6)\n"
					 + "\t3 - Nivel difícil (tablero de 5x6)\n"
					 + "\t4 - Nivel muy difícil (tablero de 6x6)\n");			 
			System.out.print("Nivel: ");
			nivel = Leer.datoInt();
			comprobado = compruebaNivel(nivel);
		}
		return nivel;
	}
	
	public int seleccionaColeccion () {
		int numColeccion = 0;
		boolean comprobado = false;
		
		System.out.println("\nPor favor, seleccione la colección a usar: \n");
		while (!comprobado) {
			System.out.println("\t1 - Nombres propios de persona\n"
					+ "\t2 - Países de Europa\n"
					+ "\t3 - Estrellas del firmamento\n"
					+ "\t4 - Nombres de flores\n"
					+ "\t5 - Nombres de Minerales\n");		 
			System.out.print("Colección: ");
			numColeccion = Leer.datoInt();
			comprobado = compruebaColeccion(numColeccion);
		}
		configuraColeccion(numColeccion);
		return numColeccion;
	}
	
	
	public boolean compruebaNivel (int nivel) {
		boolean comprobado = (nivel > 0 && nivel < 5) ? true : false;
		if (!comprobado) {
			System.out.println("\nNivel introducido no válido. Por favor escoja uno correcto.\n");
		}
		return comprobado;
	}
	
	public boolean compruebaColeccion (int numColeccion) {
		boolean comprobado = (numColeccion > 0 && numColeccion < 6) ? true : false;
		if (!comprobado) {
			System.out.println("\nNúmero de colección no válido. Por favor escoja uno correcto.\n");
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
			System.out.println("\nComienza jugando "+jugadores[0].getNombre()+". ¡Buena Suerte!\n");
		}
		else {
			System.out.println("\nComienza jugando "+jugadores[1].getNombre()+". ¡Buena Suerte!\n");
		}
		
		return turno;
	}
	
	public int [] pideCoordenadas (String turno, int jugada, int [] coordenadas) {
		
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
		
		return coordenadas;
	}
	
	public String finalizaJugada (boolean resultado, String turno, Jugador [] jugadores) {
		if (resultado) {
			System.out.println("\n¡¡¡ Muy bien !!! Continúa tu turno");
			if (turno.equals(jugadores[0].getNombre()))
				jugadores[0].setPuntos(jugadores[0].getPuntos()+puntosAcierto);
			else
				jugadores[1].setPuntos(jugadores[1].getPuntos()+puntosAcierto);
		} else {
			System.out.println("\n¡¡¡ Mala suerte !!! Quizá a la próxima. Pierdes tu turno.");
					
			if (turno.equals(jugadores[0].getNombre())) {
				jugadores[0].setPuntos(jugadores[0].getPuntos()+puntosFallo);
			} else {
				jugadores[1].setPuntos(jugadores[1].getPuntos()+puntosFallo);
			}
			
			turno = (turno.equals(jugadores[0].getNombre())) ? jugadores[1].getNombre() : jugadores[0].getNombre();
		}
		return turno;
	}
	
	public void pausa () {
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
