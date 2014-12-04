package Ejercicio_04b;



public class Cilindros {
	
	// Atributos
	
	private double radio, altura, volumen;
	
	// Constructores 
	
	public Cilindros (double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}
	
	public Cilindros (double radio, double altura, double volumen) {
		this.radio = radio;
		this.altura = altura;
		this.volumen = volumen;
	}
	
	public Cilindros () {
		this.radio = 0.0;
		this.altura = 0.0;
		this.volumen = 0.0;
	}

	
	// Getters and setters
	
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	
	
	// Métodos
	

	

	public double calculaVolumen (double rad, double alt) {  
		volumen = Math.PI * Math.pow(rad, 2) * alt;
		return volumen;
	}
	
	
	public String toString() {
		return "\nEl volumen del Cilindro es "+volumen+" metros cúbicos.\n";
	}
	
	
	

}
