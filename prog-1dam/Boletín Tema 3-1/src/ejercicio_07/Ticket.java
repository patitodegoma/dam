package ejercicio_07;

public class Ticket {
	
	// Atributos
	
	private double precio;
	
	public Ticket (double precio) {
		this.precio = precio;
	}
	
	public Ticket () {
		this.precio = 0.72;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
