package figuras;

public class Figura2D extends Figura {  
	
	private double area;
	private double perimetro;
	
	public Figura2D () {
		super ();
		this.area = 0.0;
		this.perimetro = 0.0;
	}
	
	public Figura2D (String nombre, String color, double area, double perimetro) {
		super (nombre, color);
		this.area = area;
		this.perimetro = perimetro;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double calcularArea () {
		return 0.0;
	}
	
	public double calculaPerimetro () {
		return 0.0;
	}
	
}
