package ejercicio05;

public class Alimentacion extends Producto {
	
	//private String fechaCaducidad;
	private int triggerOferta;
	//private static int udsCompradasAlim;
	
	public Alimentacion () {
		super ();
		//this.fechaCaducidad = "";
		this.triggerOferta = 0;
		//udsCompradasAlim++;
	}
	
	public Alimentacion (double precio, String nombre, int ref, int cantidad) {
		super (precio, nombre, ref, cantidad);
		//this.fechaCaducidad = fechaCaducidad;
		this.triggerOferta = 3;
		//udsCompradasAlim++;
	}
/*
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	*/
	@Override
	public double calcularImporte () {  // Aplica un 3x2 en estos productos
		double importeTotal = super.getPrecioUnit() * super.getUnidades();
		if (super.getUnidades() >= this.triggerOferta) {
			importeTotal = super.getPrecioUnit() * (int)super.getUnidades() / this.triggerOferta;
		}
		return importeTotal;
	}
	
	public String toString () {
		return super.toString() + "\tImporte total: " + calcularImporte();
	}

}
