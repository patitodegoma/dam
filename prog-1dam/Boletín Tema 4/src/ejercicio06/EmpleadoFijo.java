package ejercicio06;

public class EmpleadoFijo extends Empleado {
	
	private double porcImpuestos;
	
	public EmpleadoFijo (String nombre, double sueldo, int numEmpleado, double ventas, double porcImpuestos) {
		super(nombre, sueldo, numEmpleado, ventas);
		this.porcImpuestos = porcImpuestos;
	}
	
	public EmpleadoFijo () {
		super();
		this.porcImpuestos = 0;
	}

	public double getPorcImpuestos() {
		return porcImpuestos;
	}

	public void setIncentivo(double porcImpuestos) {
		this.porcImpuestos = porcImpuestos;
	}

	@Override
	public double obtenerSueldoFinal() {
		double salario = super.getSueldo() - this.porcImpuestos / 100 * super.getSueldo();
		return salario;
	}

	@Override
	public String tipo() {
		return "Empleado Fijo";
	}


}
