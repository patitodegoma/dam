package ejercicio01;

public class Nota {
	
	private static int contadorNotas;
	private int idNota;
	private String titulo;
	private String texto;
	
	public Nota (int idNota, String titulo, String texto) {
		this.titulo = titulo;
		this.texto = texto;
		this.idNota = 1 + Nota.contadorNotas++;
		
	}
	
	public Nota (String titulo, String texto) {
		this.titulo = titulo;
		this.texto = texto;
		this.idNota = 1 + Nota.contadorNotas++;
	}
	
	public Nota () {
		this.titulo = "";
		this.texto = "";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Nota [idNota=" + idNota + ", titulo=" + titulo + ", texto="
				+ texto + "]";
	}
	
	
	
	

}
