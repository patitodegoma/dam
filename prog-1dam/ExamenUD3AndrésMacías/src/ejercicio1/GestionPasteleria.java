package ejercicio1;

public class GestionPasteleria {
	
	// Atributos
	
	private int totalMagdalenas;
	private int idTienda;
	private String direccion;
	private double costeTotal;
	private Magdalena miMuffin;
	
	// Constructores
	
	public GestionPasteleria () {
		this.totalMagdalenas = 0;
		this.idTienda = 0;
		this.direccion = "";
		this.costeTotal = 0.0;
		this.miMuffin = new Magdalena ();
	}
	
	public GestionPasteleria (int idTienda, String direccion, Magdalena miMuffin) {
		this.idTienda = idTienda;
		this.direccion = direccion;
		this.miMuffin = miMuffin;
	}
	
	public GestionPasteleria (int totalMagdalenas, int idTienda, String direccion, double costeTotal, 
			Magdalena miMuffin) {
		this.totalMagdalenas = totalMagdalenas;
		this.idTienda = idTienda;
		this.direccion = direccion;
		this.costeTotal = costeTotal;
		this.miMuffin = miMuffin;
	}

	// Getters y Setters
	

	public int getTotalMagdalenas() {
		return totalMagdalenas;
	}

	public void setTotalMagdalenas(int totalMagdalenas) {
		this.totalMagdalenas = totalMagdalenas;
	}

	public int getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(int idTienda) {
		this.idTienda = idTienda;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getCosteTotal() {
		return costeTotal;
	}

	public void setCosteTotal(double costeTotal) {
		this.costeTotal = costeTotal;
	}
	
	public Magdalena getMiMuffin() {
		return miMuffin;
	}

	public void setMiMuffin(Magdalena miMuffin) {
		this.miMuffin = miMuffin;
	}
	
	// Métodos
	
	public double calcularBeneficio () {
		double beneficio = 0.0;
		System.out.print("\nPor favor, introduzca el precio por mm cúbico de masa gastada: ");
		double preciounit = Leer.datoDouble();
		beneficio = preciounit * calcularVolTotal();
		return beneficio;
	}
	
	public double calcularVolTotal () {
		double volTotal = 0.0;
		volTotal = miMuffin.calcularVolumen(miMuffin.getLado())*this.totalMagdalenas;
		return volTotal;
	}

	public String toString() {
		return "\nMi pastelería tiene "+totalMagdalenas+", el id "+idTienda+", la direccion "+ direccion
				+ ",y el coste total de "+costeTotal+" euros.";
	}

}
