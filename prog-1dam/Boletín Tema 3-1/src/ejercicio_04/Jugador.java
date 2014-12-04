package ejercicio_04;

public class Jugador {
	
	private String nombreCompleto;
	private boolean escogeCara;
	
	public Jugador (String nombreCompleto, boolean escogeCara) {
		this.nombreCompleto = nombreCompleto;
		this.escogeCara = escogeCara;
	}
	
	public Jugador (String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	public Jugador () {
		this.nombreCompleto = "";
		this.escogeCara = true;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public boolean getEscogeCara() {
		return escogeCara;
	}

	public void setEscogeCara(boolean escogeCara) {
		this.escogeCara = escogeCara;
	}
	
	// Métodos
	
	
	

}
