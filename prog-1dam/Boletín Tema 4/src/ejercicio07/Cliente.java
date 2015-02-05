package ejercicio07;

public class Cliente {
	
	private String nombre;
	private Cuenta miCuenta;
	
	public Cliente(String nombre, Cuenta miCuenta) {
		this.nombre = nombre;
		this.miCuenta = miCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cuenta getMiCuenta() {
		return miCuenta;
	}

	public void setMiCuenta(Cuenta miCuenta) {
		this.miCuenta = miCuenta;
	}
	
	
	
	

}
