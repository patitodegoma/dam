package ejercicio06;

public class EmpleadoAComision extends Empleado {
	
	double incentivo;

	public EmpleadoAComision(String nombre, double sueldo, int numEmpleado, double ventas, double incentivo) {
		super(nombre, sueldo, numEmpleado, ventas);
		this.incentivo = incentivo;
	}
	
	public EmpleadoAComision () {
		super();
		this.incentivo = 0;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public double obtenerSueldoFinal() {
		double salario = super.getSueldo() + this.incentivo / 100 * super.getVentas();
		return salario;
	}

	@Override
	public String tipo() {
		return "Empleado a comisión";
	}
	
	
	
	

}
