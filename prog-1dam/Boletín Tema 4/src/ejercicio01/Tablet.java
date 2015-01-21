package ejercicio01;

public class Tablet extends Ordenador {
	
	private double pulgadasPantalla;
	private String marca;
	private int bateriaMAH;
	private double megapixeles;

	public Tablet () {
		super ();
		this.pulgadasPantalla = 0.0;
		this.marca = "";
		this.bateriaMAH = 0;
		this.megapixeles = 0.0;
	}
	
	public Tablet (double velocidadProcesador, double memoriaRAM, double capacidadDisco, 
			String sistemaOperativo, double pulgadas, String marca, int bateria, double megapixeles) {
		super (velocidadProcesador, memoriaRAM, capacidadDisco, sistemaOperativo);
		this.pulgadasPantalla = pulgadas;
		this.marca = marca;
		this.bateriaMAH = bateria;
		this.megapixeles = megapixeles;
	}

	public double getPulgadasPantalla() {
		return pulgadasPantalla;
	}

	public void setPulgadasPantalla(double pulgadasPantalla) {
		this.pulgadasPantalla = pulgadasPantalla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getBateriaMAH() {
		return bateriaMAH;
	}

	public void setBateriaMAH(int bateriaMAH) {
		this.bateriaMAH = bateriaMAH;
	}

	public double getMegapixeles() {
		return megapixeles;
	}

	public void setMegapixeles(double megapixeles) {
		this.megapixeles = megapixeles;
	}
	
	public double calcularPrecio (double modificador) {
		double precio;
		return precio = super.calcularPrecio() + pulgadasPantalla * 5 + bateriaMAH / 3
				+ megapixeles * 20 - modificador;
	}
	
}
