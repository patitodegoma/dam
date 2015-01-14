package parejas;

import utilidades.*;

public class Tablero {
	
	private int ancho;
	private int alto;
	private String [][] cruce;
	private Coleccion col;
	private Coleccion colRepe;
	private boolean [][] mostrar;
	private int parejasLevantadas;
	
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

	public boolean[][] getMostrar() {
		return mostrar;
	}

	public void setMostrar(int i, int j, boolean valor) {
		this.mostrar[i][j] = valor;
	}
	
	public String[][] getCruce() {
		return cruce;
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
	
	public void montaTablero (int nivel) {
		switch (nivel) {
		case 1: 
			alto = 4;
			ancho = 4;		
			break;
		case 2:
			alto = 4;
			ancho = 6;	
			break;
		case 3:
			alto = 5;
			ancho = 6;
			break;
		case 4:
			alto = 6;
			ancho = 6;
			break;
		}
	}
	
	
	
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
	
	public void taparTodo () {
		this.mostrar = new boolean [alto][ancho];
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				mostrar[i][j] = false;
			}
		}
	}
	
	public void escribeDatos (Jugador [] jugadores, String turno) {
		
		Utiles.repiteCadena("# ", 79, true);
		
		Utiles.ponSolo2Almohadillas();
		
		System.out.println("#\t\t\t\t\t\t\t E L   J U E G O   D E   L A S   P A R E J A S      \t\t\t\t\t\t    #");
		
		Utiles.ponSolo2Almohadillas();
		
		Utiles.repiteCadena("# ", 79, true); 
		
		Utiles.ponSolo2Almohadillas();
		
		// Escribe nombres y puntos de jugadores
		for (int i = 0; i < jugadores.length; i++) {
			System.out.print("#\tJugador "+(i+1)+": "+jugadores[i].getNombre());
			Utiles.repiteCadena(" ", 35 - jugadores[i].getNombre().length(), false);
			System.out.print("Puntos: "+jugadores[i].getPuntos());
			Utiles.repiteCadena(" ", 94 - String.valueOf(jugadores[i].getPuntos()).length(), false);
			System.out.println("#");
		}
		
		Utiles.ponSolo2Almohadillas();
		
		// Línea de las parejas levantadas
		System.out.print("#\tParejas Levantadas: "+this.parejasLevantadas+" de "+this.ancho * this.alto / 2);
		Utiles.repiteCadena(" ", 124 - String.valueOf(this.parejasLevantadas).length() - 
				String.valueOf(this.ancho * this.alto / 2).length(), false);
		System.out.println("#");
		
		Utiles.ponSolo2Almohadillas();
		
		// Línea que indica a quién le toca
		System.out.print("#\tEl turno es de "+turno);
		Utiles.repiteCadena(" ", 133 - turno.length(), false);
		System.out.println("#");
		
		Utiles.ponSolo2Almohadillas();
		
		Utiles.repiteCadena("# ", 79, true); 
		
		Utiles.ponSolo2Almohadillas();
		Utiles.ponSolo2Almohadillas();
	}
	
	public void dibujarTablero (int nivel) {	
		
		// Encabezado columnas
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
			
		// Primera fila (guiones)
		if (nivel == 1) {
			System.out.print("#\t  ");  
			Utiles.repiteCadena("-", 94, false); 
			Utiles.repiteCadena("\t", 6, false); 
			System.out.println("    #");
		} else {
			System.out.print("#\t  ");  // Dos tabuladores de inicio
			Utiles.repiteCadena("-", 142, false); 
			System.out.println("    #");
		}
				
		// Fila vacía, solo con palo al inicio y final
		
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
		
		// Tablero propiamente dicho
		for (int i = 0; i < this.alto * 2; i++) {		
			if (i % 2 == 0) {
				System.out.print("# Fila "+(i/2+1)+" |");  // Palos al principio de cada fila
			}
			else {
				System.out.print("#\t |");  // Palos al principio de cada fila
			}
			
			for (int j = 0; j < this.ancho; j++) {
				if (i % 2 == 0) {  //Juego solo en filas índice par
					if (!mostrar [i/2][j]) {
						System.out.print("\t-\t\t|");
					} else {
						if (this.cruce[i/2][j].length() < 8) {  // Para evitar descuadres por casillas de texto largo
							System.out.print("\t"+this.cruce[i/2][j]+"\t\t|");
						} else {
							System.out.print("\t"+this.cruce[i/2][j]+"\t|");
						}
					}			
					if (j == ancho-1)   // Comprueba si hemos puesto el último de la fila
						if (nivel == 1) {
							Utiles.repiteCadena("\t", 6, false); 
							System.out.print("    #");
						} else {
							System.out.print("   #");  // Y en caso afirmativo le ponemos el palo
						}
						
				} else {      // Las filas de índice impar están vacías, solo palos de inicio (ya dibujado) y fin  
					System.out.print("\t\t\t|");      	
					if (j == ancho-1)   // Comprueba si hemos puesto el último de la fila
						if (nivel == 1) {
							Utiles.repiteCadena("\t", 6, false); 
							System.out.print("    #");
						} else {
							System.out.print("   #");  // Y en caso afirmativo le ponemos el palo
						}
				}			
			}
			System.out.println();   // Salto de linea cada vez que hay que cambiar de i (nueva fila)
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
	
	public boolean comprobarLevantado (int fila, int columna) {
		boolean comprobado = (this.mostrar[fila][columna] == true) ? false : true;
		if (!comprobado) {
			System.out.println("\nEsa casilla ya está levantada. Escoge otra, por favor.");
		}
		return comprobado;
	}
	
	public boolean comprobarJugada (int [] coordenadas) {
		boolean comprobado = cruce[coordenadas[0] - 1 ][coordenadas[1] - 1].equals(cruce[coordenadas[2] - 1][coordenadas[3] - 1]) ? 
				true : false;
		if (comprobado)
			this.parejasLevantadas++;
		return comprobado;
	}
	
	public void ocultarFallos (int [] coordenadas, boolean acertado) {
		if (!acertado) {
			setMostrar(coordenadas[0] - 1, coordenadas[1] - 1, false);
			setMostrar(coordenadas[2] - 1, coordenadas[3] - 1, false);
		}	
	}
	
	public boolean comprobarFinalizado () {
		boolean comprobado = (this.parejasLevantadas == (this.ancho * this.alto / 2)) ? true : false;
		return comprobado;
	}
	
	

}
