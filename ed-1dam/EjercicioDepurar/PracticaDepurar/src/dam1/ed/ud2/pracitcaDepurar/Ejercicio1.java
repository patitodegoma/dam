package dam1.ed.ud2.pracitcaDepurar;
/**
 * Clase de pruebas para practicar con el entorno de desarrollo. Antes de nada,
 * lee el c�digo y trata de comprenderlo por encima. A continuaci�n, utiliza las
 * herramientas del entorno para contestar a las preguntas que aparecen a lo
 * largo del c�digo como tareas TODO
 * 
 * @author Rafael Villar
 * 
 */

 
public class Ejercicio1 {

	// TODO Pregunta 1: �Qu� juego trata de implementar el programa?
	// TODO Respuesta 1: Conecta 4
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[][] tablero = new String[7][6];

		// TODO Pregunta 2: Utiliza las herramientas de Eclipse para modificar
		// el nombre de las siguientes 3 variables por otros que te gusten m�s.
		// �Qu� herramienta has utilizado?�Cu�l es su atajo de teclado?
		// TODO Respuesta 2: Rename, Alt+May+R

		final String ROJA = "R";
		final String BLANCA = "B";
		final String VACIO = "0";

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = VACIO;
			}
		}

		boolean ganaR = false;
		boolean ganaB = false;
		String turno = BLANCA;

		while (!(ganaR && ganaB)) {

			boolean repetir = true;
			int columna = -1;
			while (repetir) {
				System.out.println("El turno es de " + turno
						+ ". �En qu� columna quiere introducir una ficha?");
				columna = Leer.datoInt() - 1;
				if (columna < 0 || columna > 6) {
					System.out.println("Introduzca una columna v�lida (entre 1 y 7)");
					repetir = true;
				} else if (!VACIO.equals(tablero[columna][5])) {
					System.out.println("Columna llena.");
					repetir = true;
				} else {
					repetir = false;
				}
				// TODO Pregunta 6: Completa el c�digo anterior para que rechace
				// la
				// petici�n del usuario si la columna en la que se quiere
				// introducir la ficha est� llena
				// TODO Respuesta 6:
			}

			boolean relleno = false;
			for (int j = 0; !relleno && j < tablero[columna].length; j++) {
				if (VACIO.equals(tablero[columna][j])) {
					tablero[columna][j] = turno;
					relleno = true;

				}
			}

			// TODO Pregunta 7: Ahora mismo el bucle es infinito. A�ade aqu� el
			// c�digo necesario para que compruebe si en esta tirada hay un
			// ganador

			// Escribe aqu� el c�digo (este comentario hay que borrarlo)

			// TODO Fin del c�digo introducido
			
			int contadorRepes = 1;
			
			boolean ganador = false;
			//comprobar horizontales
			for (int j=0;j<6&&!ganador;j++) {
				for (int i=0;i<6 && !ganador; i++) {
					if (!VACIO.equals(tablero[i][j])) {
						contadorRepes = tablero[i][j].equals(tablero[i+1][j]) ? ++contadorRepes : contadorRepes;
					} else {
						contadorRepes = 1;
					}
					if (contadorRepes == 4) {
						ganador = true;
						ganaR=ROJA.equals(tablero[i][j]);
						ganaB=BLANCA.equals(tablero[i][j]);
					}
				}
			}

			// TODO Pregunta 3: �Para qu� sirve la siguiente l�nea?
			// TODO Respuesta 3:
			turno = BLANCA.equals(turno) ? ROJA : BLANCA;

			// TODO Pregunta 4: Contesta esta pregunta �NICAMENTE TRAS LA
			// PRIMERA ITERACI�N DEL BUCLE. �Cu�l es el valor de la primera fila
			// del tablero (posiciones tablero[i][0])?
			// TODO Respuesta 4:
			for (int k = 0; k < 50; k++) {
				System.out.print("-");
			}
			System.out.println();
			for (int j = 5; j >= 0; j--) {
				for (int i = 0; i < 7; i++) {
					System.out.print(tablero[i][j] + ";");
				}
				System.out.println();
			}
			// TODO Pregunta 5: �Es �sta la mejor forma de imprimir el tablero?
			// �Se corresponde con la forma visual a la que estamos
			// acostumbrados? Modifica el c�digo para que se corresponda con el
			// tablero tradicional del juego
			// TODO Respuesta 5:

		}

	}

}
