package ejercicio07;

public abstract class Cuenta {
	
	private String ccc;
	private double saldo;
	private double mantenimiento;
	
	public Cuenta(String ccc, double saldo, double mantenimiento) {
		this.ccc = ccc;
		this.saldo = saldo;
		this.mantenimiento = mantenimiento;
	}

	public String getCcc() {
		return ccc;
	}

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(double mantenimiento) {
		this.mantenimiento = mantenimiento;
	}
	
	public abstract void ingresar (double cantidad);
	
	public abstract void reintegrar (double cantidad);
	
	public String mostrarSaldo() {
		return "\nEl saldo de la cuenta es de " + getSaldo() + " €.";
	}
	
	

}
