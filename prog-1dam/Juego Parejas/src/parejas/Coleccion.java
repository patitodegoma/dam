package parejas;

import java.util.Arrays;

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

	public void setParejas(String[] parejas) {
		this.parejas = parejas;
	}

	// Métodos
	
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
