package parejas;

/**
 * 
 * @author Andrés Macías Jiménez
 * @since Parejas 0.01
 * @version 1.0
 *
 */
public class Jugador {
	
	/**
	 * Nombre del jugador.
	 */
	private String nombre;
	
	/**
	 * Puntos que el jugador tiene en la partida actual.
	 */
	private int puntos;
	
	/**
	 * @deprecated Constructor vacío de objetos tipo Jugador. No se usa en el juego.
	 */
	public Jugador () {
		this.nombre = "";
		this.puntos = 0;
	}
	
	/**
	 * Constructor de objetos tipo Jugador. Recibe el nombre del jugador a crear, y lo inicia con cero puntos.
	 * @param nombre String que guarda el nombre del jugador.
	 */
	public Jugador (String nombre) {
		this.nombre = nombre;
		this.puntos = 0;
	}
	
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

	
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntos=" + puntos + "]";
	}
	
	
	
	

}
