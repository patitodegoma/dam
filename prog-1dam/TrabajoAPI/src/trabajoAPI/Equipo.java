package trabajoAPI;

public class Equipo {
	
	private String nombre;
	private String nomEstadio;
	private int capacidad;
	private int socios;
	
	public Equipo (String nombre, String nomEstadio, int capacidad, int socios) {
		this.nombre = nombre;
		this.nomEstadio = nomEstadio;
		this.capacidad = capacidad;
		this.socios = socios;
	}
	
	public Equipo () {
		this.nombre = "";
		this.nomEstadio = "";
		this.capacidad = 0;
		this.socios = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNomEstadio() {
		return nomEstadio;
	}

	public void setNomEstadio(String nomEstadio) {
		this.nomEstadio = nomEstadio;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getSocios() {
		return socios;
	}

	public void setSocios(int socios) {
		this.socios = socios;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", nomEstadio=" + nomEstadio
				+ ", capacidad=" + capacidad + ", socios=" + socios + "]";
	}

	
	
	
	
	

}
