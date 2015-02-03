package ejercicio05;

public class Cajera {
	
	private String nombre;
	private int numCajera;
	
	
	public Cajera () {
		this.nombre = "";
		this.numCajera = 0;
	}
	
	
	public Cajera (String nombre) {
		this.nombre = nombre;
		this.numCajera = (int)(Math.random() * 10) + 1; 
	}
	
	
	public Cajera (String nombre, int numCajera) {
		this.nombre = nombre;
		this.numCajera = numCajera;
	}

	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumCajera() {
		return numCajera;
	}

	
	public void setNumCajera(int numCajera) {
		this.numCajera = numCajera;
	}
	
	public void realizaGestion (Producto [] carrito) {
		double total = 0;
		for (int i = 0; i < carrito.length; i++) {
			total += carrito [i].calcularImporte();
		}
		Ticket miTicket = new Ticket (carrito, total, this.nombre, this.numCajera);
		miTicket.imprimeTicket();
	}
	
}
