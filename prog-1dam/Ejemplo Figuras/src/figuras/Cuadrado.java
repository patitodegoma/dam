package figuras;

public class Cuadrado extends Figura2D {
	
	private double lado;
	
	public Cuadrado () {
		super ();
		this.lado = 0.0;
	}
	
	public Cuadrado (String nombre, String color, double area, double perimetro, double lado) {
		super (nombre, color, area, perimetro);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea () {
		double area = Math.pow(lado, 2);
		return area;
	}

}
