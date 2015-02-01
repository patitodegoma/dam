package ejercicio05;

public class Producto {
	
	private double precioUnit;
	private String nomProducto;
	private String refID;
	private int unidades;
	
	public Producto () {
		this.precioUnit = 0.0;
		this.nomProducto = "";
		this.refID = "";
		this.unidades = 0;
	}
	
	public Producto (double precioUnit, String nomProducto, String refID, int unidades) {
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

	public String getRefID() {
		return refID;
	}

	public void setRefID(String refID) {
		this.refID = refID;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double importeTotalProducto () {
		return 0.0;
	}

	public String toString() {
		return "Producto ID: " + refID + "\tNombre: " + nomProducto + "\tPrecio: " + precioUnit + "€ \tUds: " + unidades;
	}
	
	
}
