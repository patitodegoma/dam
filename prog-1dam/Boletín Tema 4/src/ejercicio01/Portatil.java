package ejercicio01;



public class Portatil extends Ordenador {
	
	private double pulgadasMonitor;
	private double bateria;
	private double peso;
	private boolean graficaDedicada;
	private boolean webcam;
	
	public Portatil () {
		super ();
		this.pulgadasMonitor = 0.0;
		this.bateria = 0.0;
		this.peso = 0.0;
		this.graficaDedicada = false;
		this.webcam = false;
	}
	
	public Portatil (double velocidadProcesador, double memoriaRAM, double capacidadDisco, String sistemaOperativo, 
			double pulgadas, double bateria, double peso, boolean graficaDedicada, boolean webcam) {
		super (velocidadProcesador, memoriaRAM, capacidadDisco, sistemaOperativo);
		this.pulgadasMonitor = pulgadas;
		this.bateria = bateria;
		this.peso = peso;
		this.graficaDedicada = graficaDedicada;
		this.webcam = webcam;
	}

	public double getPulgadasMonitor() {
		return pulgadasMonitor;
	}

	public void setPulgadasMonitor(double pulgadasMonitor) {
		this.pulgadasMonitor = pulgadasMonitor;
	}

	public double getBateria() {
		return bateria;
	}

	public void setBateria(double bateria) {
		this.bateria = bateria;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isGraficaDedicada() {
		return graficaDedicada;
	}

	public void setGraficaDedicada(boolean graficaDedicada) {
		this.graficaDedicada = graficaDedicada;
	}

	public boolean isWebcam() {
		return webcam;
	}

	public void setWebcam(boolean webcam) {
		this.webcam = webcam;
	}
	
	public double calcularPrecio (double modificador, double cargoGrafica) {
		double precio;
		if (!graficaDedicada)
			cargoGrafica = 0;
		return precio = super.calcularPrecio() + pulgadasMonitor * 5 + bateria * 10 + 
				peso * 20 - modificador + cargoGrafica;
	}
	

}
