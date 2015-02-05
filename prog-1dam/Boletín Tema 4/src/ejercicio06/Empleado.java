package ejercicio06;

public abstract class Empleado {
	
	private String nombre;
	private double sueldo;
	private int numEmpleado;
	private double ventas;
	
	public Empleado() {
		this.nombre = "";
		this.sueldo = 0;
		this.numEmpleado = 0;
		this.ventas = 0;
	}

	public Empleado(String nombre, double sueldo, int numEmpleado, double ventas) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.numEmpleado = numEmpleado;
		this.ventas = ventas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	
	public abstract double obtenerSueldoFinal ();
	
	public abstract String tipo ();
	
	public String toString () {
		return "\n - " + this.nombre + ", con número de empleado " + this.numEmpleado + " y tipo de contrato " + 
	         tipo() + " ha vendido por valor de " + ventas + " € y va a cobrar " + obtenerSueldoFinal() + " €.";
	}
	
	

}
