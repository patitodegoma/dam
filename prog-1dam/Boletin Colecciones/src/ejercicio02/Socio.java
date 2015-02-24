package ejercicio02;

public class Socio {
	
	private static int contadorSocios;
	private int numSocio;
	private String nombre;
	private int anyoNacimiento;
	private String direccion;
	private int telefono;
	
	public Socio(int numSocio, String nombre, int anyoNacimiento, String direccion, int telefono) {
		this.numSocio = numSocio;
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public Socio(String nombre, int anyoNacimiento, String direccion, int telefono) {
		this.numSocio = ++contadorSocios;
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public static int getContadorSocios() {
		return contadorSocios;
	}

	public static void setContadorSocios(int contadorSocios) {
		Socio.contadorSocios = contadorSocios;
	}

	public int getNumSocio() {
		return numSocio;
	}

	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Socio " + numSocio + ".- Nombre: " + nombre
				+ "\t Año de Nacimiento: " + anyoNacimiento + "\t Direccion: "
				+ direccion + "\t Nº Telefono: " + telefono + ".";
	}

	
	
	
	
	

}
