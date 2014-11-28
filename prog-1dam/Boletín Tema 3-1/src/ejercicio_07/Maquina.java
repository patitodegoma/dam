package ejercicio_07;

public class Maquina {
	
	// Atributos
	
	private double saldo;
	private double password;
	private int totalVentas;
	private double precioTicket;
	private double pagadoOperacion;
	
	// Constructores
	
	public Maquina (double saldo, double password, int totalVentas, double precioTicket, double pagadoOperacion) {
		this.saldo = saldo;
		this.password = password;
		this.totalVentas = totalVentas;
		this.precioTicket = precioTicket;
		this.pagadoOperacion = pagadoOperacion;
	}
	
	public Maquina () {
		this.saldo = 0.0;
		this.password = 1234;
		this.totalVentas = 0;
		this.precioTicket = 0.72;
		this.pagadoOperacion = 0.0;
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

	public double getPrecioTicket() {
		return precioTicket;
	}

	public void setPrecioTicket(double precioTicket) {
		this.precioTicket = precioTicket;
	}
	
	public double getPagadoOperacion() {
		return pagadoOperacion;
	}

	public void setPagadoOperacion(double pagadoOperacion) {
		this.pagadoOperacion = pagadoOperacion;
	}
	
	// Métodos
	
	  // Comprar billetes
	
	public double calculatotal (int cantidad) {
		double importeTotal = cantidad * this.precioTicket;
		return importeTotal;
	}
	
	public boolean comprobarimporte (int cantidad, double insertado) {
		boolean suficiente = true;
		pagadoOperacion += insertado;
		if (pagadoOperacion < cantidad * this.precioTicket) {
			suficiente = false;
		}
		return suficiente;
	}
	
	public double devolvercambio (int cantidad, double dinero) {
		double cambio = dinero - cantidad*this.precioTicket;
		return cambio;
	}
	
	public void imprimirbilletes (int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			System.out.println("\n\t* * * * * * * * * * * * * * *\n"
							   + "\t*    M E T R O     D A M    *\n"
							   + "\t*                           *\n"
							   + "\t* Billete sencillo          *");
			System.out.printf("\t* Precio: %.2f €            *\n", this.precioTicket);
			System.out.println("\t*                           *\n"
					+ "\t* 27/11/2014          10:34 *\n"
					+ "\t* * * * * * * * * * * * * * *\n");
		}
		this.totalVentas += cantidad;
		this.saldo += cantidad*this.precioTicket;
		this.pagadoOperacion = 0.0;
	}
	
	  // Operaciones operario
	
		// Comprobar contraseña
	
	public boolean comprobarpass (double passTecleada) {
		boolean comprobado = false;
		if (passTecleada == this.password)
			comprobado = true;
		return comprobado;
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