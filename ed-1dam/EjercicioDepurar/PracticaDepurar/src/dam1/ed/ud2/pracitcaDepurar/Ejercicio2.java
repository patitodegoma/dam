package dam1.ed.ud2.pracitcaDepurar;
/**
 * Clase de pruebas para practicar con el depurador. Antes de nada, lee el
 * c�digo y trata de comprenderlo por encima. A continuaci�n, ayudate del depurador, y de su
 * inspector de variables, para contestar a las preguntas que aparecen a lo
 * largo del c�digo como tareas TODO
 * 
 * @author Rafael Villar
 * 
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//TODO Pregunta 0: �De qu� se trata el c�digo? �Qu� operaciones realiza? 
		//TODO Respuesta 0:
		String[][] tablero = new String[8][8];

		String[] filaInicial = { "T1", "C1", "A1", "D", "R", "A2", "C2", "T2" };
		String[] peonesInicial = { "P1", "P2", "P3", "P4", "P5", "P6", "P7",
				"P8" };

		final String VACIO = "0";
		
		//TODO Pregunta 1: �Para qu� sirve el siguiente bucle?
		//TODO Respuesta 1:
		for (int i = 0; i < 8; i++) {
			switch (i) {
			case 0:
				for (int j = 0; j < 8; j++) {
					tablero[i][j] = filaInicial[j] + "B";
				}
				break;

			case 1:
				for (int j = 0; j < 8; j++) {
					tablero[i][j] = peonesInicial[j] + "B";
				}
				break;
			case 6:
				for (int j = 0; j < 8; j++) {
					tablero[i][j] = peonesInicial[j] + "N";
				}
				break;
			case 7:
				for (int j = 0; j < 8; j++) {
					tablero[i][j] = filaInicial[j] + "N";
				}
				break;
			default:
				for (int j = 0; j < 8; j++) {
					tablero[i][j] = VACIO;
				}
				break;
			}

		}

		// TODO Pregunta 2: �Qu� ficha se encuentra en la posici�n [1,1]? �Y en la posici�n [4,6]?
		//TODO Respuesta 2:
		
				
		//TODO Pregunta 3: �Para qu� sirve el siguiente bucle?
		//TODO Respuesta 3: 
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(tablero[i][j] + ";");
			}
			System.out.println();
		}
		
		// Las siguientes l�neas van a utilizarse para mover cierta ficha
		int origenH = 0;
		int origenV = 6;
		int destinoH = origenH+2;
		int destinoV = origenV-1;
		
		String ficha = tablero[origenH][origenV];
		tablero[origenH][origenV] = VACIO;
		tablero[destinoH][destinoV] = ficha;
		
		//TODO Pregunta 4: �Qu� ficha acabamos de mover?�En qu� posici�n se encuentra ahora?
		//TODO Respuesta 4:
		
		for(int k = 0; k<50; k++){
			System.out.print("-");
		}
		System.out.println();
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(tablero[i][j] + ";");
			}
			System.out.println();
		}
		
		for(int i=6;i>3;){
			origenH = i;
			origenV = 2;
			destinoH = --i;
			destinoV = origenV;
			
			ficha = tablero[origenH][origenV];
			tablero[origenH][origenV] = VACIO;
			tablero[destinoH][destinoV] = ficha;			
		}
		//TODO Pregunta 5: �Cu�ntas veces hemos movido esta ficha? �Qu� ficha era? �En qu� posici�n estaba y en cual se encuentra ahora?
		//TODO Respuesta 5:
		
		for(int k = 0; k<50; k++){
			System.out.print("-");
		}
		System.out.println();
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(tablero[i][j] + ";");
			}
			System.out.println();
		}

	}

}
