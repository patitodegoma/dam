package examenUD3;

public class Ejercicios5a8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// La siguiente variable se utilizar� a lo largo del c�digo para
		// almacenar los mensajes que se mostrar�n por pantalla
		String mostrar = "Este es el primer mensaje";
		System.out.println(mostrar);
		
		int indice = 0;
		final int a = 3;

		// TODO Ejercicio 6: Utiliza la herramienta necesaria para modificar el
		// nombre de la variable anterior, de manera que sea m�s corto y que
		// siga las convenciones de estilo de Java. �C�mo se llama la
		// herramienta utilizada?�Cu�l es su atajo de teclado? 

		mostrar = "Ya hemos hecho el ejercicio 6";
		System.out.println(mostrar);
		// TODO Ejercicio 7: El siguiente c�digo comprueba un valor (que no nos
		// importa de d�nde lo hemos obtenido) y en funci�n del valor indicado,
		// imprime el nombre del cap�tulo correspondiente. Utiliza las
		// sugerencias de correcci�n para subsanar los errores que tiene el
		// c�digo. De las opciones que sugiere el entorno, �cu�les has elegido?
		
		
		switch (indice) {
		case 1:
			mostrar = "Tema 1: Introducci�n";
			break;
		case 2:
			mostrar = "Tema 2: Entornos de desarrollo";
			break;
		case a:
			mostrar = "Tema 3: El lenguaje UML";
			break;
		}
		System.out.println(mostrar);

		// TODO Ejercicio 8: El siguiente c�digo implementa un programa con un
		// array bidimensional de enteros que guarda los n�meros del 1 al 64 en
		// 8 filas y 8 columnas. El array tiene una fila y columna m�s, para
		// guardar las sumas de los n�meros de cada fila y columna. Utiliza el
		// depurador y el inspector de variable para contestar a la siguientes
		// preguntas:
		// 1. �Cu�ntas iteraciones del primer bucle for (el de i) han pasado
		// para rellenar la variable numerajos[2][3]?
		// 2. �Cu�l es el valor de dicha variable?


		int[][] numerajos = new int[9][9];
		int k = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				numerajos[i][j] = ++k;
				numerajos[i][8] += k;
				numerajos[8][j] += k;
			}
		}
		for (int i = 0; i < 8; i++) {
			numerajos[8][8] += numerajos[i][8];
		}
		
		mostrar = "��TERMIN� EL EXAMEN!!";
		System.out.println(mostrar);
	}

	

}
