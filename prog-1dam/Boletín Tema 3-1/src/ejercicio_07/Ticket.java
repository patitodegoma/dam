package ejercicio_07;

public class Ticket {

	private double precio;
	
	public Ticket () {
		this.precio = 0.0;
	}
	
	public Ticket (double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean comprar (double cantidad, double ingresado) {
		boolean esCorrecto = true;
		if (cantidad * precio > ingresado) {
			esCorrecto = false;
		} else
			devuelvecambio (cantidad, ingresado);
		return esCorrecto;
	}

	private double devuelvecambio(double cantidad, double ingresado) {
		double cambio = 0;
		if (cantidad * precio < ingresado) {
			cambio = ingresado - cantidad * precio;
		}
		return cambio;
	}
	
	
}
