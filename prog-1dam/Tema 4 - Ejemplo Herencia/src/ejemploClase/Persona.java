package ejemploClase;

public class Persona {
	
	private String nombre;
	private int edad;
	private String apellidos;
	private double peso;
	private double altura;
	private double imc;
	
	public Persona(String nombre, int edad, String apellidos, double peso,
			double altura, double imc) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.apellidos = apellidos;
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
	}

	// Getters y Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	// Métodos
	
	public double calcularIMC () {
		return this.imc = peso / Math.pow(altura, 2);
	}
	
	
	
	public double ganancias () {
		return peso * altura;
	}
	
	
	
	// To String

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", apellidos="
				+ apellidos + ", peso=" + peso + ", altura=" + altura
				+ ", imc=" + imc + "]";
	}
	
	
	
	
	
	

}
