package ejercicio05;

public class Ropa extends Producto {
	
	private String fabricante;
	private int talla;
	private int porcentajeDescuento;
	private int tallaDescuento;
	
	
	public Ropa () {
		super ();
		this.fabricante = "";
		this.talla = 0;
		this.porcentajeDescuento = 0;
		this.tallaDescuento = 0;
	}
	
	public Ropa (double precio, String nombre, int ref, int cantidad, String fabricante, int talla) {
		super (precio, nombre, ref, cantidad);
		this.fabricante = fabricante;
		this.talla = talla;
		this.porcentajeDescuento = 10;
		this.tallaDescuento = 42;
	}
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getPorcentaje2ud() {
		return porcentajeDescuento;
	}

	public void setPorcentaje2ud(int porcentaje2ud) {
		this.porcentajeDescuento = porcentaje2ud;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	@Override
	public double calcularImporte () {  // Aplica un descuento del 10% a las tallas grandes
		double importeTotal = super.getPrecioUnit() * super.getUnidades();
		if (this.talla > this.tallaDescuento) {
			importeTotal = (super.getPrecioUnit() * super.getUnidades()) -
					(super.getPrecioUnit() * this.porcentajeDescuento / 100 * super.getUnidades());
		}
		return importeTotal;
	}
	
	public String toString () {
		return super.toString() + "\tImporte total: " + calcularImporte() + " €\tTalla: " + talla;
	}

}
