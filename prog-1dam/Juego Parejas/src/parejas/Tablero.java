package parejas;

import utilidades.*;

public class Tablero {
	
	private int ancho;					// Ancho del tablero.
	private int alto;					// Alto del tablero.
	private String [][] cruce; 			// El contenido de cada celda. Cada cruce [i,j] es una carta.
	private Coleccion col;				// Las cartas seleccionadas para el juego.
	private Coleccion colRepe;			// Las parejas de las cartas seleccionadas.
	private boolean [][] mostrar;		// Cada mostrar [i,j] indica si hay que mostrar el cruce [i,j] o no.
	private int parejasLevantadas;		// Contador de parejas acertadas.
	
	// Constructores
	
	public Tablero () {
		this.ancho = 0;
		this.alto = 0;
		this.parejasLevantadas = 0;
	}
	
	public Tablero (Coleccion col, Coleccion colRepe) {
		this.col = col;
		this.colRepe = colRepe;	
	}
	
	public Tablero (int ancho, int alto, Coleccion col, Coleccion colRepe) {
		this.ancho = ancho;
		this.alto = alto;
		this.col = col;
		this.colRepe = colRepe;
		this.cruce = new String [alto][ancho];
		this.mostrar = new boolean [alto][ancho];
		this.parejasLevantadas = 0;
	}
	
	// Getters y Setters

	public boolean getMostrar(int i, int j) {
		return mostrar[i][j];
	}

	public void setMostrar(int i, int j, boolean valor) {
		this.mostrar[i][j] = valor;
	}
	
	public String getCruce(int i, int j) {
		return cruce[i][j];
	}

	public void setCruce(int i, int j, String valor) {
		this.cruce[i][j] = valor;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public Coleccion getCol() {
		return col;
	}

	public void setCol(Coleccion col) {
		this.col = col;
	}
	
	public int getParejasLevantadas () {
		return parejasLevantadas;
	}
	
	public void setParejasLevantadas (int parejas) {
		this.parejasLevantadas = parejas;
	}
	
	// Métodos
	
	/**
	 * Fija el ancho y el alto del tablero, según el nivel seleccionado por el usuario.
	 * @param nivel El indicado por el usuario
	 * @param partida El objeto de la Clase <b>Config</b>, en la que se establece cuánto mide cada tablero según el nivel.
	 */
	
	public void montaTablero (int nivel, Config partida) {	
		this.alto = partida.getAltos(nivel - 1);
		this.ancho = partida.getAnchos(nivel - 1);		
			
	}
	
	
	/**
	 * Asigna a cada celda del tablero una carta, sacada de la colección elegida y de la repetida de las parejas. Las posiciones son fijas, pero como las colecciones han sido desordenadas previamente, el tablero siempre es distinto.
	 * @param nivel El nivel del juego, que determina cuántas cartas hay que poner.
	 */
	
	public void inicializarTablero (int nivel) {
		this.cruce = new String [alto][ancho];
		if (nivel > 0) {
			cruce[0][0] = col.getParejas(0);
			cruce[0][1] = colRepe.getParejas(0);
			cruce[0][2] = col.getParejas(1);
			cruce[0][3] = colRepe.getParejas(1);
			cruce[1][0] = col.getParejas(2);
			cruce[1][1] = colRepe.getParejas(2);
			cruce[1][2] = col.getParejas(3);
			cruce[1][3] = colRepe.getParejas(3);
			cruce[2][0] = col.getParejas(4);
			cruce[2][1] = colRepe.getParejas(4);
			cruce[2][2] = col.getParejas(5);
			cruce[2][3] = colRepe.getParejas(5);
			cruce[3][0] = col.getParejas(6);
			cruce[3][1] = colRepe.getParejas(6);
			cruce[3][2] = col.getParejas(7);
			cruce[3][3] = colRepe.getParejas(7);
		}
		if (nivel > 1) {
			cruce[0][4] = col.getParejas(8);
			cruce[1][4] = colRepe.getParejas(8);
			cruce[2][4] = col.getParejas(9);
			cruce[3][4] = colRepe.getParejas(9);
			cruce[0][5] = col.getParejas(10);
			cruce[1][5] = colRepe.getParejas(10);
			cruce[2][5] = col.getParejas(11);
			cruce[3][5] = colRepe.getParejas(11);
		}
		if (nivel > 2) {
			cruce[4][0] = col.getParejas(12);
			cruce[4][1] = colRepe.getParejas(12);
			cruce[4][2] = col.getParejas(13);
			cruce[4][3] = colRepe.getParejas(13);
			cruce[4][4] = col.getParejas(14);
			cruce[4][5] = colRepe.getParejas(14);
		}
		if (nivel > 3) {
			cruce[5][0] = col.getParejas(15);
			cruce[5][1] = colRepe.getParejas(15);
			cruce[5][2] = col.getParejas(16);
			cruce[5][3] = colRepe.getParejas(16);
			cruce[5][4] = col.getParejas(17);
			cruce[5][5] = colRepe.getParejas(17);
		}
		taparTodo ();
	}
	
	/**
	 * Coloca el tablero en la posición inicial, sin que se muestre el contenido de ninguna celda. Cada celda (i,j) tiene asociado el booleano <i>mostrar(i,j)</i>, que indica si al dibujar el array hay que mostrar el contenido o no.
	 */
	
	public void taparTodo () {
		this.mostrar = new boolean [alto][ancho];
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				mostrar[i][j] = false;
			}
		}
	}
	
	/**
	 * Dibuja el tablero de juego, para cada jugada.
	 * @param jugadores Los dos jugadores, de los que se extrae su nombre y puntuación
	 * @param turno A quién corresponde el turno actual
	 * @param nivel El nivel de juego, para determinar las dimensiones del tablero.
	 */
	
	public void dibujar (Jugador [] jugadores, String turno, int nivel) {
		escribeDatos (jugadores, turno);
		dibujarTablero (nivel);
	}
	
	/**
	 * Primera parte del tablero, que escribe los datos de los jugadores, indica el turno actual y el número de parejas que se han descubierto.
	 * @param jugadores Los datos de los jugadores
	 * @param turno El turno actual
	 */
	
	public void escribeDatos (Jugador [] jugadores, String turno) {
		
		Utiles.repiteCadena("# ", 79, true);
		
		Utiles.ponSolo2Almohadillas();
		
		System.out.print("#");
		Utiles.repiteCadena(" ", 55, false);
		System.out.print("E L   J U E G O   D E   L A S   P A R E J A S");
		Utiles.repiteCadena(" ", 55, false);
		System.out.println("#");
				
		Utiles.ponSolo2Almohadillas();
		
		Utiles.repiteCadena("# ", 79, true); 
		
		Utiles.ponSolo2Almohadillas();
		
		for (int i = 0; i < jugadores.length; i++) {
			System.out.print("#\tJugador "+(i+1)+": "+jugadores[i].getNombre());
			Utiles.repiteCadena(" ", 35 - jugadores[i].getNombre().length(), false);
			System.out.print("Puntos: "+jugadores[i].getPuntos());
			Utiles.repiteCadena(" ", 94 - String.valueOf(jugadores[i].getPuntos()).length(), false);
			System.out.println("#");
		}
		
		Utiles.ponSolo2Almohadillas();
		
		System.out.print("#\tParejas Levantadas: "+this.parejasLevantadas+" de "+this.ancho * this.alto / 2);
		Utiles.repiteCadena(" ", 124 - String.valueOf(this.parejasLevantadas).length() - 
				String.valueOf(this.ancho * this.alto / 2).length(), false);
		System.out.println("#");
		
		Utiles.ponSolo2Almohadillas();
		
		System.out.print("#\tEl turno es de "+turno);
		Utiles.repiteCadena(" ", 133 - turno.length(), false);
		System.out.println("#");
		
		Utiles.ponSolo2Almohadillas();
		
		Utiles.repiteCadena("# ", 79, true); 
		
		Utiles.ponSolo2Almohadillas();
		Utiles.ponSolo2Almohadillas();
	}
	
	/**
	 * Dibuja el tablero propiamente dicho
	 * @param nivel El nivel del juego, para saber las dimensiones del tablero.
	 */
	
	public void dibujarTablero (int nivel) {	
		
		System.out.print("#\t  ");
		for (int i = 0; i < this.ancho; i++) {
			System.out.print("\tColumna "+(i+1)+"\t");
		} 
		if (nivel == 1) {
			Utiles.repiteCadena("\t", 6, false); 
			System.out.println("    #");
		} else {
			System.out.println("    #");
		}
			
		if (nivel == 1) {
			System.out.print("#\t  ");  
			Utiles.repiteCadena("-", 94, false); 
			Utiles.repiteCadena("\t", 6, false); 
			System.out.println("    #");
		} else {
			System.out.print("#\t  ");  
			Utiles.repiteCadena("-", 142, false); 
			System.out.println("    #");
		}
						
		if (nivel == 1) {
			System.out.print("#\t |");
			Utiles.repiteCadena("\t\t\t|", 4, false);
			Utiles.repiteCadena("\t", 6, false); 
			System.out.println("    #");
		} else {
			System.out.print("#\t |");
			Utiles.repiteCadena("\t\t\t|", 6, false);
			System.out.println("   #");
		}
		
		for (int i = 0; i < this.alto * 2; i++) {		
			if (i % 2 == 0) {
				System.out.print("# Fila "+(i/2+1)+" |");  
			}
			else {
				System.out.print("#\t |");  
			}
			
			for (int j = 0; j < this.ancho; j++) {
				if (i % 2 == 0) {  
					if (!mostrar [i/2][j]) {
						System.out.print("\t-\t\t|");
					} else {
						if (this.cruce[i/2][j].length() < 8) {  
							System.out.print("\t"+this.cruce[i/2][j]+"\t\t|");
						} else {
							System.out.print("\t"+this.cruce[i/2][j]+"\t|");
						}
					}			
					if (j == ancho-1)   
						if (nivel == 1) {
							Utiles.repiteCadena("\t", 6, false); 
							System.out.print("    #");
						} else {
							System.out.print("   #"); 
						}
						
				} else {       
					System.out.print("\t\t\t|");      	
					if (j == ancho-1)   
						if (nivel == 1) {
							Utiles.repiteCadena("\t", 6, false); 
							System.out.print("    #");
						} else {
							System.out.print("   #");  
						}
				}			
			}
			System.out.println();   
		}
		if (nivel == 1) {
			System.out.print("#\t  ");  
			Utiles.repiteCadena("-", 94, false);  
			Utiles.repiteCadena("\t", 6, false); 
			System.out.println("    #");
		} else {
			System.out.print("#\t  ");  
			Utiles.repiteCadena("-", 142, false); 
			System.out.println("    #");
		}
		
		Utiles.ponSolo2Almohadillas();
		Utiles.ponSolo2Almohadillas();
		
		Utiles.repiteCadena("# ", 79, true); 
	}
	
	/**
	 * Comprueba si la celda que el usuario decide abrir ya ha sido descubierta con anterioridad.
	 * @param fila La fila introducida por el usuario.
	 * @param columna La columna introducida por el usuario.
	 * @return Un booleano que indica si hay que solicitar nuevas coordenadas.
	 */
	
	public boolean comprobarLevantado (int fila, int columna) {
		boolean comprobado = (this.mostrar[fila][columna] == true) ? false : true;
		if (!comprobado) {
			System.out.println("\nEsa casilla ya está levantada. Escoge otra, por favor.");
		}
		return comprobado;
	}
	
	/**
	 * Comprueba si el contenido de las celdas introducidas por el usuario son iguales (acierto) o no. En caso de acierto, aumenta el contador de parejas descubiertas.
	 * @param coordenadas Las cuatro coordenadas de las dos celdas.
	 * @return Un booleano, que indica si ha habido acierto o no.
	 */
	
	public boolean comprobarJugada (int [] coordenadas) {
		boolean comprobado = cruce[coordenadas[0] - 1 ][coordenadas[1] - 1].equals(cruce[coordenadas[2] - 1][coordenadas[3] - 1]) ? 
				true : false;
		if (comprobado)
			this.parejasLevantadas++;
		return comprobado;
	}
	
	/**
	 * Oculta las celdas descubiertas en el caso de que el usuario haya fallado en su jugada.
	 * @param coordenadas Las cuatro coordenadas de las celdas descubiertas.
	 * @param acertado Un booleano que indica si hubo acierto en la jugada o no.
	 */
	
	public void ocultarFallos (int [] coordenadas, boolean acertado) {
		if (!acertado) {
			setMostrar(coordenadas[0] - 1, coordenadas[1] - 1, false);
			setMostrar(coordenadas[2] - 1, coordenadas[3] - 1, false);
		}	
	}
	
	/**
	 * Verifica al final de cada turno si el tablero se ha completado, comprobando si el número de parejas levantadas es igual al número máximo de parejas que caben en el tablero.
	 * @return Un booleano, que indica si la partida terminó o no.
	 */
	
	public boolean comprobarFinalizado () {
		boolean comprobado = (this.parejasLevantadas == (this.ancho * this.alto / 2)) ? true : false;
		return comprobado;
	}
	
	

}
