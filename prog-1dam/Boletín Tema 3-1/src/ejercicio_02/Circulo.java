package ejercicio_02;

public class Circulo {
	
	private double rad;
	private double area;
	
	public Circulo () {
		this.rad = 0.0;
		this.area = 0.0;
	}
	
	public Circulo (double rad) {
		this.rad = rad;
	}
	
	public Circulo (double rad, double area) {
		this.rad = rad;
		this.area = area;
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}
	
	public double calculaarea (double radcirculo) {
		area = Math.PI*Math.pow(radcirculo, 2);
		return area;
	}


	public String toString() {
		return "\nUn círculo de radio "+ rad + " tiene un área de "+ area + " metros cuadrados.";
	}
	
	

}
