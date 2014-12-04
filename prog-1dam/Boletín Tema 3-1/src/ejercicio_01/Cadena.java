package ejercicio_01;

public class Cadena {
	
	private String texto;
	
	public Cadena () {
		this.texto = "";
	}
	
	public Cadena (String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void mostrar (String cadena) {
		System.out.println(cadena);
	}

}
