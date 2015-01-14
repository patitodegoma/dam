package utilidades;

/**
 * Incluye una serie de métodos ajenos al juego que son usados para su mejor funcionamiento.
 * @author Andres
 * 
 *
 */
public class Utiles {

	/**
	 * Genera una cantidad de n espacios en blanco consecutivos.
	 * @param n Es un valor entero que determina el número de espacios en blanco a generar.
	 */
	public static void generaEspacios (int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" ");
		}
	}
	
	public static void ponSolo2Almohadillas () {
		System.out.print("# ");
		for (int i = 0; i < 77; i++) {    
			System.out.print("  ");      	
		}
		System.out.print("#\n");
	}
	
}
