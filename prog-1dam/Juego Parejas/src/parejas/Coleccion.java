package parejas;

import java.util.Arrays;

/**
 * Almacena los elementos que serán utilizados como parejas en el juego.
 * 
 * @author Andrés
 *
 */
public class Coleccion {
	
	private String [] parejas;
	
	// Constructores
	
	public Coleccion (String[] parejas) {
		this.parejas = parejas;
	}
	
	// Getters y Setters

	public String getParejas(int indice) {
		return parejas[indice];
	}

	public void setParejas(int i, String valor) { 
		this.parejas[i] = valor;
	}

	// Métodos
	
	/**
	 * Cambia de posición los elementos del array de String que conforma la Colección. Para ello recorre el array, y va intercambiando sus elementos aleatoriamente, utilizando una variable temporal para no perder los datos.
	 * 
	 * @param aleat Es la posición que se va a intercambiar con la que le corresponda en el ciclo del bucle.
	 * @param temporal Guarda el contenido de la posición marcada por el ciclo del bucle, para que no se pierda al guardar en su posición el contenido de la seleccionada en <b>aleat</b>.
	 */
	public void desordenar () {
		int aleat = 0;
		String temporal = "";
		for (int i = 0; i < this.parejas.length; i++) {
			aleat = i + (int) (Math.random() * (this.parejas.length - i));
			temporal = this.parejas[i];
			this.parejas[i] = this.parejas[aleat];
			this.parejas[aleat] = temporal;
		}
	}

	
	// ToString
	
	public String toString() {   
		return "Coleccion [parejas=" + Arrays.toString(parejas) + "]";
	}
	
	

}
