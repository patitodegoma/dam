package utilidades;

/**
 * Incluye una serie de métodos ajenos al juego que son usados para su mejor funcionamiento.
 * @author Andrés Macías Jiménez
 * @since Parejas 0.5
 * @version 4.4
 *
 */
public class Utiles {

	/**
	 * Genera una determinada cadena consecutivamente las veces que se indique con el parámetro <b>n</b>.
	 * @param cadena String que se repite tantas veces como indique el parámetro <b>n</b>.
	 * @param n Valor entero que determina el número de veces a repetir la <b>cadena</b>.
	 * @param saltoLinea Booleano que indica si al acabar hay que insertar un salto de línea.
	 */
	public static void repiteCadena (String cadena, int n, boolean saltoLinea) {
		for (int i = 0; i < n; i++) {
			System.out.print(cadena);
		}
		if (saltoLinea) {
			System.out.println();
		}
	}
	
	/**
	 * Escribe una fila de la pantalla del tablero que solo tiene las almohadillas de inicio y fin.
	 */
	
	public static void ponSolo2Almohadillas () {
		System.out.print("# ");
		for (int i = 0; i < 77; i++) {    
			System.out.print("  ");      	
		}
		System.out.print("#\n");
	}
	
	/**
	 * Realiza una pausa en la ejecución del programa. Limpia la pantalla tras pulsarse INTRO
	 */
	
	public static void pausa () {
		System.out.print("\n - Pulsa INTRO para continuar: ");
		Leer.datoChar();
		Utiles.limpiaPantalla();
	}
	
	/**
	 * "Limpia" la pantalla, insertando 150 líneas en blanco.
	 */
	
	public static void limpiaPantalla () {
		for (int i = 0; i < 150; i++) 
			System.out.println();
	}
	
}
