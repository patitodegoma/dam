package ejercicio05;

import utiles.*;

public class Ticket {
	
	Producto [] cestaCompra;
	double total;
	String fecha;
	String hora;
	int numTicket;
	double iva;
	String nombreCajera;
	int numCajera;
	
	public Ticket () {
		this.cestaCompra = null;
		this.total = 0.0;
		this.fecha = "";
		this.hora = "";
		this.numTicket = 0;
		this.iva = 0;
		this.nombreCajera = "";
		this.numCajera = 0;
	}
	
	public Ticket (Producto [] cestaCompra, double total, String fecha, String hora, int numTicket, double iva, 
			String nombreCajera, int numCajera) {
		this.cestaCompra = cestaCompra;
		this.total = total;
		this.fecha = fecha;
		this.hora = hora;
		this.numTicket = numTicket;
		this.iva = iva;
		this.nombreCajera = nombreCajera;
		this.numCajera = numCajera;
	}
	
	public Ticket (Producto [] cestaCompra, double total, String nombre, int numCajera) {
		this.cestaCompra = cestaCompra;
		this.total = total;
		this.fecha = "03/02/2015";
		this.hora = "16:42";
		this.numTicket = 200 + (int)(Math.random() * 1000);
		this.iva = 21;
		this.nombreCajera = nombre;
		this.numCajera = numCajera;
	}

	public Producto getCestaCompra(int valor) {
		return cestaCompra [valor];
	}

	public void setCestaCompra(int valor, Producto miProd) {
		this.cestaCompra[valor] = miProd;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getNumTicket() {
		return numTicket;
	}

	public void setNumTicket(int numTicket) {
		this.numTicket = numTicket;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}
	
	public void imprimeTicket () {
		Utiles.repiteCadena("* ", 65, true);
		System.out.println("\t\tSupermercados El Chino"
				+ "\n\t\tC-14941254"
				+ "\n\t\tFecha: " + this.fecha + " Hora: " + this.hora +
				"\n\t\tCajera: " + this.nombreCajera
				+ "\n\t\tNº Cajera: " + this.numCajera
				+ "\n\t\tNº Ticket: " + this.numTicket);
		Utiles.repiteCadena("* ", 65, true);		
		for (int i = 0; i < this.cestaCompra.length; i++) {
			System.out.println(this.cestaCompra[i]);
		}
		Utiles.repiteCadena("* ", 65, true);
		System.out.println("\n\t\tTOTAL DE LA COMPRA: " + this.total + " €"
						+ "\n\t\t¡¡¡Gracias por su visita!!!");
				
	}
}
