package instrumentos;

public class Instrumento {
	
	public void tocar () {
		System.out.println("Estoy tocando un instrumento.");
	}
	
	public String tipo () {
		return "Instrumento";
	}
	
	public void afinar () {
		/* Se deja vacío a propósito, para permitir la reescritura en clases heredadas */
	}

}
