package parejas;

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
	
	public void taparTodo () {
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				this.setMostrar(i, j, false);
			}
		}
	}
	
	public void inicializarTablero (int nivel) {
		if (nivel > 0) {
			this.setCruce(0, 0, col.getParejas(0));
			this.setCruce(0, 1, colRepe.getParejas(0));
			this.setCruce(0, 2, col.getParejas(1));
			this.setCruce(0, 3, colRepe.getParejas(1));
			this.setCruce(1, 0, col.getParejas(2));
			this.setCruce(1, 1, colRepe.getParejas(2));
			this.setCruce(1, 2, col.getParejas(3));
			this.setCruce(1, 3, colRepe.getParejas(3));
			this.setCruce(2, 0, col.getParejas(4));
			this.setCruce(2, 1, colRepe.getParejas(4));
			this.setCruce(2, 2, col.getParejas(5));
			this.setCruce(2, 3, colRepe.getParejas(5));
			this.setCruce(3, 0, col.getParejas(6));
			this.setCruce(3, 1, colRepe.getParejas(6));
			this.setCruce(3, 2, col.getParejas(7));
			this.setCruce(3, 3, colRepe.getParejas(7));
		}
		if (nivel > 1) {
			this.setCruce(4, 0, col.getParejas(8));
			this.setCruce(4, 1, colRepe.getParejas(8));
			this.setCruce(4, 2, col.getParejas(9));
			this.setCruce(4, 3, colRepe.getParejas(9));
			this.setCruce(5, 0, col.getParejas(10));
			this.setCruce(5, 1, colRepe.getParejas(10));
			this.setCruce(5, 2, col.getParejas(11));
			this.setCruce(5, 3, colRepe.getParejas(11));
		}
		if (nivel > 2) {
			this.setCruce(0, 4, col.getParejas(12));
			this.setCruce(1, 4, colRepe.getParejas(12));
			this.setCruce(2, 4, col.getParejas(13));
			this.setCruce(3, 4, colRepe.getParejas(13));
			this.setCruce(4, 4, col.getParejas(14));
			this.setCruce(5, 4, colRepe.getParejas(14));
		}
		if (nivel > 3) {
			this.setCruce(0, 5, col.getParejas(15));
			this.setCruce(1, 5, colRepe.getParejas(15));
			this.setCruce(2, 5, col.getParejas(16));
			this.setCruce(3, 5, colRepe.getParejas(16));
			this.setCruce(4, 5, col.getParejas(17));
			this.setCruce(5, 5, colRepe.getParejas(17));
		}
	}
	
	public void escribeDatos (Jugador jug1, Jugador jug2) {
		for (int i = 0; i < this.ancho + 2; i++) {    // Para el número de columnas, más la inicio y fin
			System.out.print("*\t");       // Dibuja un asterisco (fila de asteriscos)
		}
		System.out.println();
		System.out.println("\t\tE L   J U E G O   D E   L A S   P A R E J A S\t\t");
		for (int i = 0; i < this.ancho + 2; i++) {    // Para el número de columnas, más la inicio y fin
			System.out.print("*\t");       // Dibuja un asterisco (fila de asteriscos)
		}
		System.out.println("\nJugador 1: "+jug1.getNombre()+"\t\tPuntos: "+jug1.getPuntos());
		System.out.println("\nJugador 2: "+jug2.getNombre()+"\t\tPuntos: "+jug2.getPuntos());
		System.out.println("\n\nParejas Levantadas: "+this.parejasLevantadas+" de "+this.ancho * this.alto / 2);
		System.out.println();
	}
	
	public void dibujarTablero () {	
		for (int i = 0; i < this.ancho + 2; i++) {    // Para el número de columnas, más la inicio y fin
			System.out.print("*\t");       // Dibuja un asterisco (fila de asteriscos)
		}
		System.out.println(" ");
		for (int i = 0; i < this.alto; i++) {		
			System.out.print("*\t");  // Asterisco al principio de cada fila
			for (int j = 0; j < this.ancho; j++) {
				if (!mostrar [i][j]) {
					System.out.print("-\t");
				} else
					System.out.print(this.cruce[i][j]+"\t");
				if (j == ancho-1)   // Comprueba si hemos puesto el último de la fila
					System.out.print("*");  // Y en caso afirmativo le ponemos asterisco
			}
			System.out.print("\n");   // Salto de linea cada vez que hay que cambiar de i (nueva fila)
		}
		for (int i = 0; i < this.ancho + 2; i++) {    // Para el número de columnas, más la inicio y fin
			System.out.print("*\t");       // Dibuja un asterisco (fila de asteriscos)
		}	
	}
	
	public boolean comprobarLevantado (int fila, int columna) {
		boolean comprobado = (this.mostrar[fila][columna] == true) ? false : true;
		return comprobado;
	}
	
	public boolean comprobarJugada (int fila1, int columna1, int fila2, int columna2) {
		boolean comprobado = cruce[fila1][columna1].equals(cruce[fila2][columna2]) ? true : false;
		if (comprobado)
			this.parejasLevantadas++;
		return comprobado;
	}
	
	public boolean comprobarFinalizado () {
		boolean comprobado = (this.parejasLevantadas == (this.ancho * this.alto / 2)) ? true : false;
		return comprobado;
	}
	
	

}
