package ejercicio05;

public abstract class Producto {
	
	private double precioUnit;
	private String nomProducto;
	private int refID;
	private int unidades;    // Unidades compradas del producto refID.
	
	public Producto () {
		this.precioUnit = 0.0;
		this.nomProducto = "";
		this.refID = 0;
		this.unidades = 0;
	}
	
	public Producto (double precioUnit, String nomProducto, int refID, int unidades) {
		this.precioUnit = precioUnit;
		this.nomProducto = nomProducto;
		this.refID = refID;
		this.unidades = unidades;
	}

	public double getPrecioUnit() {
		return precioUnit;
	}

	public void setPrecioUnit(double precioUnit) {
		this.precioUnit = precioUnit;
	}

	public String getNomProducto() {
		return nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}

	public int getRefID() {
		return refID;
	}

	public void setRefID(int refID) {
		this.refID = refID;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public abstract double calcularImporte ();

	public String toString() {
		return "Producto ID: " + refID + "\tNombre: " + nomProducto + "\tPrecio: " + precioUnit + "€";
	}
	
	
}
