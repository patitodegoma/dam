package ejemploClase;

public class Profesor extends Persona {
	
	private String especialidad;
	private double sueldo;
	
	public Profesor (String nombre, int edad, String apellidos, double peso,
			double altura, double imc, String especialidad, double sueldo) {
		super (nombre, edad, apellidos, peso, altura, imc);
		this.especialidad = especialidad;
		this.sueldo = sueldo;
	}
	
	calculaSueldo ();
	evaluar ();

}
