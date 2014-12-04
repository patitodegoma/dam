package ejercicio_05;

public class Carrerilla {
	
	private String texto;
	private int nveces;
	
	public Carrerilla () {
		this.texto = "";
		this.nveces = 0;
	}
	
	public Carrerilla (String texto, int nveces) {
		this.texto = texto;
		this.nveces = nveces;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getNveces() {
		return nveces;
	}

	public void setNveces(int nveces) {
		this.nveces = nveces;
	}
	
	public void hacercarrerilla () {
		for (int i = 0; i < nveces; i++) {
			System.out.println(texto);
		}
	}

}
