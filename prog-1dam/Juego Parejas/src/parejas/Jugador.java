package parejas;

public class Jugador {
	
	private String nombre;
	private int puntos;
	
	// Constructores
	
	public Jugador () {
		this.nombre = "";
		this.puntos = 0;
	}
	
	public Jugador (String nombre) {
		this.nombre = nombre;
		this.puntos = 0;
	}

	// Getters y Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	// ToString
	
	
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntos=" + puntos + "]";
	}
	
	
	
	

}
