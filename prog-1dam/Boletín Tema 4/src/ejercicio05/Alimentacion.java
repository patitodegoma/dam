package ejercicio05;

public class Alimentacion extends Producto {
	
	private int triggerOferta;
	
	public Alimentacion () {
		super ();
		this.triggerOferta = 0;
	}
	
	public Alimentacion (double precio, String nombre, int ref, int cantidad) {
		super (precio, nombre, ref, cantidad);
		this.triggerOferta = 3;
	}

	@Override
	public double calcularImporte () {  // Aplica un 3x2 en estos productos
		double importeTotal = super.getPrecioUnit() * super.getUnidades();
		if (super.getUnidades() >= this.triggerOferta) {
			importeTotal = 2 * super.getPrecioUnit() * (int)(super.getUnidades() / this.triggerOferta) +
					 super.getPrecioUnit() * (super.getUnidades() % this.triggerOferta);
		}
		return importeTotal;
	}
	
	public String toString () {
		return super.toString() + "\tImporte total: " + calcularImporte() + " €";
	}

}
