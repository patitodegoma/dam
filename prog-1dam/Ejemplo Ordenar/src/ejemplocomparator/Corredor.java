package ejemplocomparator;

public class Corredor {
	private int dorsal;
	private double marca;
	private String nombre;
	
	public Corredor(int dorsal, double marca, String nombre) {
		this.dorsal = dorsal;
		this.marca = marca;
		this.nombre=nombre;
	}
	
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public double getMarca() {
		return marca;
	}
	public void setMarca(double marca) {
		this.marca = marca;
	}
	public String getNombre(){
		return nombre;
	}
	
	public String impDatos(){
		return "Dorsal:" +this.dorsal+ " | " +this.nombre+ " | " + "tiempo: " +this.marca;
	}
	
	
}
