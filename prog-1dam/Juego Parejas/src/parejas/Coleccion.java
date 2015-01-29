package parejas;

import java.util.Arrays;

/**
 * Almacena los elementos que serán utilizados como parejas en el juego para su gestión.
 * 
 * @author Andrés Macías Jiménez
 * @since Parejas 0.01
 * @version 2.1
 *
 */
public class Coleccion {
	
	/**
	 * Array de elementos usados como cartas en el juego.
	 */
	private String [] parejas;
	
	
	/**
	 * Constructor de objetos Coleccion. 
	 * @param parejas Almacena en cada posición del String un elemento de la colección a crear, extraído del método {@link parejas.Config#configuraColeccion(int) configuraColeccion}.
	 */
	public Coleccion (String[] parejas) {
		this.parejas = parejas;
	}

	public String getParejas(int indice) {
		return parejas[indice];
	}

	public void setParejas(int i, String valor) { 
		this.parejas[i] = valor;
	}
	
	/**
	 * Cambia de posición los elementos del array de String que conforma la Colección. Para ello recorre el array, y va intercambiando sus elementos aleatoriamente, utilizando una variable temporal (<b>temp</b>) para no perder los datos.
	 * 
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
	
	public String toString() {   
		return "Coleccion [parejas=" + Arrays.toString(parejas) + "]";
	}
	
	

}
