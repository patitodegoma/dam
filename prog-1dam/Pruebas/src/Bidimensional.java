
public class Bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nfilas = 6, ncolumnas = 5, fila1, columna1, fila2, columna2;
		char tecla = 'a';
		
		int [][] tablero = new int [nfilas][ncolumnas];
		
		for (int i = 0; i < tablero.length; i++) {   // Inicializo el tablero como el producto fila x col
			for (int j = 0; j < tablero[i].length; j++) {
				tablero [i][j] = (i+1) * (j+1);
			}
		}
		
		int [][] mostrar = new int [nfilas][ncolumnas];
		
		
		for (int i = 0; i < mostrar.length; i++) {   // Inicializo el mostrar todos a falso
			for (int j = 0; j < mostrar[i].length; j++) {
				mostrar [i][j] = 0;
			}
		}
		
		do {
		
			System.out.println("Hola amigo, dime qu� casilla abrimos");
			System.out.print("\nIntroduzca la fila: ");
			fila1 = Leer.datoInt();
			System.out.print("\nIntroduzca la columna: ");
			columna1 = Leer.datoInt();
			mostrar [fila1-1][columna1-1] = 1;
				
			
			// Inicio del dibujo del tablero
			
			for (int i = 0; i < ncolumnas + 2; i++) {    // Para el n�mero de columnas, m�s la inicio y fin
				System.out.print("*\t");       // Dibuja un asterisco (fila de asteriscos)
			}
			System.out.println(" ");
			for (int i = 0; i < tablero.length; i++) {		
				System.out.print("*\t");  // Asterisco al principio de cada fila
				for (int j = 0; j < tablero[i].length; j++) {
					if (mostrar [i][j] == 0) {
						System.out.print("-\t");
					} else
						System.out.print(tablero[i][j]+"\t");
					if (j == tablero[i].length-1)   // Comprueba si hemos puesto el �ltimo de la fila
						System.out.print("*");  // Y en caso afirmativo le ponemos asterisco
				}
				System.out.print("\n");   // Salto de linea cada vez que hay que cambiar de i (nueva fila)
			}
			for (int i = 0; i < ncolumnas + 2; i++) {    // Para el n�mero de columnas, m�s la inicio y fin
				System.out.print("*\t");       // Dibuja un asterisco (fila de asteriscos)
			}
			
			// Fin del tablero
			
			System.out.println("\n\nHola amigo, dime qu� casilla abrimos ahora");
			System.out.print("\nIntroduzca la fila: ");
			fila2 = Leer.datoInt();
			System.out.print("\nIntroduzca la columna: ");
			columna2 = Leer.datoInt();
			mostrar [fila2-1][columna2-1] = 1;
			
			// Inicio del dibujo del tablero
			
					for (int i = 0; i < ncolumnas + 2; i++) {    // Para el n�mero de columnas, m�s la inicio y fin
						System.out.print("*\t");       // Dibuja un asterisco (fila de asteriscos)
					}
					System.out.println(" ");
					for (int i = 0; i < tablero.length; i++) {		
						System.out.print("*\t");  // Asterisco al principio de cada fila
						for (int j = 0; j < tablero[i].length; j++) {
							if (mostrar [i][j] == 0) {
								System.out.print("-\t");
							} else
								System.out.print(tablero[i][j]+"\t");
							if (j == tablero[i].length-1)   // Comprueba si hemos puesto el �ltimo de la fila
								System.out.print("*");  // Y en caso afirmativo le ponemos asterisco
						}
						System.out.print("\n");   // Salto de linea cada vez que hay que cambiar de i (nueva fila)
					}
					for (int i = 0; i < ncolumnas + 2; i++) {    // Para el n�mero de columnas, m�s la inicio y fin
						System.out.print("*\t");       // Dibuja un asterisco (fila de asteriscos)
					}
					
					// Fin del tablero
					
					boolean acertado = false;
					if (tablero[fila1-1][columna1-1] == tablero[fila2-1][columna2-1]) {
						System.out.println("\nAcierto!");
						acertado = true;
						mostrar[fila1-1][columna1-1] = 1;
						mostrar[fila2-1][columna2-1] = 1;
					}
					else {
						System.out.println("\nError!!");
					}
						
					System.out.println("\nPulsa la tecla A para continuar");
					tecla = Leer.datoChar();
				
		
				
				if ((tecla == 'a' || tecla == 'A') && acertado) {
					for (int i = 0; i < 50; i++) 
						System.out.println();
				}
				
		} while (tecla == 'a' || tecla == 'A');		
		
	}

}
