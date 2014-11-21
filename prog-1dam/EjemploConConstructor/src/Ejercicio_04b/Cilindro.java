package Ejercicio_04b;

public class Cilindro {
	
	// Atributos
	
	double radio, altura;
	
	// Constructor
	
	public Cilindro (double radio, double altura) {
		
		this.radio = radio;
		this.altura = altura;
	}

	// Getters y Setters
	
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
	
	// Método
	
	public double calculaVolumen (double rad, double alt) {
		double volumen = 0;
		volumen = Math.PI * Math.pow(rad, 2) * alt;
		return volumen;
	}
	
	
	

}
