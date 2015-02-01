package ejercicio05;

public class Alimentacion extends Producto {
	
	private String fechaCaducidad;
	
	public Alimentacion () {
		super ();
		this.fechaCaducidad = "";
	}
	
	public Alimentacion (double precio, String nombre, String ref, int cantidad, String fechaCaducidad) {
		super (precio, nombre, ref, cantidad);
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	public double importeTotalProducto () {
		double importeTotal = super.getPrecioUnit() * super.getUnidades();
		return importeTotal;
	}
	
	public String toString () {
		return super.toString() + "\tImporte total: " + importeTotalProducto();
	}

}
