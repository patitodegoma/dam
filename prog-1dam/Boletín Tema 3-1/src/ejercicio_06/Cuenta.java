package ejercicio_06;

public class Cuenta {
	
	private double saldo;
	
	// Constructores
	
	public Cuenta () {
		this.saldo = 0.0;
	}
	
	public Cuenta (double saldo) {
		this.saldo = saldo;
	}

	// Getters y Setters
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
		
	// Método Devolver Saldo
	
		
	// Método Ingresar
	
	/*
	public double ingresar_old(double cantidad) {
		saldo += cantidad;
		return saldo;
	}
	*/
	
	public boolean ingresar (double cantidad) {
		boolean esCorrecto = true;
		saldo = saldo + cantidad;
		return esCorrecto;
	}
	
	// Método Sacar Dinero
	
	/*
	public double sacar_old(double cantidad) {
		double tope = -1000;
		if (saldo - cantidad < tope)
			return saldo;
		else
			return saldo-cantidad;
	}
	*/
	
	public boolean sacar(double cantidad) {
		boolean esCorrecto = true;
		double tope = -1000;
		if (saldo - cantidad < tope)
			esCorrecto = false;
		else 
			saldo = saldo - cantidad;		
		return esCorrecto;
	}
		
	// ToString
	
	public String toString() {
		return "\nEl saldo de su cuenta es "+ saldo +"€.";
	}

}
