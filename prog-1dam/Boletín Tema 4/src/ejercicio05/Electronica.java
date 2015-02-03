package ejercicio05;

public class Electronica extends Producto {
	
	private String fabricante;
	private int porcentaje2ud;
	
	
	public Electronica () {
		super ();
		this.fabricante = "";
		this.porcentaje2ud = 0;
	}
	
	public Electronica (double precio, String nombre, int ref, int cantidad, String fabricante) {
		super (precio, nombre, ref, cantidad);
		this.fabricante = fabricante;
		this.porcentaje2ud = 50;
	}
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getPorcentaje2ud() {
		return porcentaje2ud;
	}

	public void setPorcentaje2ud(int porcentaje2ud) {
		this.porcentaje2ud = porcentaje2ud;
	}

	@Override
	public double calcularImporte () {  // Aplica un 2ª unidad al 50%
		double importeTotal; 
		
		importeTotal = (super.getPrecioUnit() * (int)(super.getUnidades() / 2))    
						 + (super.getPrecioUnit() * this.porcentaje2ud / 100 * (int)(super.getUnidades() / 2)) +
						 (super.getUnidades() % 2) * super.getPrecioUnit();
		
		return importeTotal;
	}
	
	public String toString () {
		return super.toString() + "\tImporte total: " + calcularImporte() + " €";
	}


}
