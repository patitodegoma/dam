package ejercicio_07;

public class Maquina {
	
	// Atributos
	
	private double saldo;
	private double password;
	private int totalVentas;

	
	// Constructores
	
	public Maquina (double saldo, double password, int totalVentas) {
		this.saldo = saldo;
		this.password = password;
		this.totalVentas = totalVentas;
	}
	
	public Maquina () {
		this.saldo = 0.0;
		this.password = 1234;
		this.totalVentas = 0;
	}

	// Getters y Setters
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getPassword() {
		return password;
	}

	public void setPassword(double password) {
		this.password = password;
	}

	public int getTotalVentas() {
		return totalVentas;
	}

	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	// Métodos
	
	  // Comprar billetes
	
	public double calculatotal (int cantidad) {
		Ticket miTicket = new Ticket();
		double importeTotal = cantidad * miTicket.getPrecio();
		return importeTotal;
	}
	
	public boolean comprobarimporte (int cantidad, double insertado, double acumulado) {
		Ticket miTicket = new Ticket();
		boolean suficiente = true;
		if (acumulado < cantidad * miTicket.getPrecio()) {
			suficiente = false;
		}
		return suficiente;
	}
	
	public double devolvercambio (int cantidad, double dinero) {
		Ticket miTicket = new Ticket();
		double cambio = dinero - cantidad*miTicket.getPrecio();
		return cambio;
	}
	
	public void imprimirbilletes (int cantidad) {
		Ticket miTicket = new Ticket();
		for (int i = 0; i < cantidad; i++) {
			System.out.println("\n\t* * * * * * * * * * * * * * *\n"
							   + "\t*    M E T R O     D A M    *\n"
							   + "\t*                           *\n"
							   + "\t* Billete sencillo          *");
			System.out.printf("\t* Precio: %.2f €            *\n", miTicket.getPrecio());
			System.out.println("\t*                           *\n"
					+ "\t* 27/11/2014          10:34 *\n"
					+ "\t* * * * * * * * * * * * * * *\n");
		}
		this.totalVentas += cantidad;
		this.saldo += cantidad*miTicket.getPrecio();
	}
	
	  // Operaciones operario
	
		// Comprobar contraseña
	
	public boolean comprobarpass (double passTecleada) {
		boolean comprobado = false;
		if (passTecleada == this.password)
			comprobado = true;
		return comprobado;
	}
	
		// Cambiar precio
	
	public void cambiarprecio (double precioNuevo) {
		Ticket miTicket = new Ticket();
		miTicket.setPrecio(precioNuevo);
	}
	
		// Cambiar password
	
	public boolean cambiarpass (double passNueva, double passCheck) {
		boolean esCorrecto = false;
		if (passNueva == passCheck) {
			setPassword(passNueva);
			esCorrecto = true;
		}
		return esCorrecto;
	}

	


}