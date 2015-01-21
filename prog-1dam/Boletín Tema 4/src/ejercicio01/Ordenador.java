package ejercicio01;



public class Ordenador {
	
	private double velocidadProcesador;
	private double memoriaRAM;
	private double capacidadDisco;
	private String sistemaOperativo;
	
	public Ordenador () {
		this.velocidadProcesador = 0.0;
		this.memoriaRAM = 0.0;
		this.capacidadDisco = 0.0;
		this.sistemaOperativo = "";
	}
	
	public Ordenador (double velocidad, double ram, double capacidad, String sistOperativo) {
		this.velocidadProcesador = velocidad;
		this.memoriaRAM = ram;
		this.capacidadDisco = capacidad;
		this.sistemaOperativo = sistOperativo;
	}

	public double getVelocidadProcesador() {
		return velocidadProcesador;
	}

	public void setVelocidadProcesador(double velocidadProcesador) {
		this.velocidadProcesador = velocidadProcesador;
	}

	public double getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(double memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public double getCapacidadDisco() {
		return capacidadDisco;
	}

	public void setCapacidadDisco(double capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	
	public double calcularPrecio () {
		double precio;
		return precio = velocidadProcesador * 0.75 + memoriaRAM * 15 + capacidadDisco / 2;
	}
	
	

}
