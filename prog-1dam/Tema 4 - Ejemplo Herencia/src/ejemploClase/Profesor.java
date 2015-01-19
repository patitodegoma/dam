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
	

	
	// Getters y Setters
	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	// Métodos
	
	/*
	calculaSueldo () {
		
	}
	evaluar () {
		
	}
	*/
	
	
	public double calcularIMC () {
		double indice = super.calcularIMC();
		
		if (indice > 25)
			System.out.println("\nCuidado!!");
		
		return indice;
	}

	public double ganancias (double extra) {   // Sobrecarga de métodos heredados
		return super.ganancias() + extra;
	}
	

	

	public String toString() {
		return super.toString()+"Profesor [especialidad=" + especialidad + ", sueldo=" + sueldo
				+ "]";
	}
	
	
	

}
