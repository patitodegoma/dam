package ejercicio01;

import java.util.*;

public class Persona {
	
	String nombre, apellidos, dni;
	int edad;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void LeerDatosPersonales () {
		Scanner sc = new Scanner(System.in);
		String aux;
		
		System.out.print("\nIntroduzca el nombre: ");
		this.setNombre(sc.nextLine());
			
		System.out.print("\nIntroduzca los apellidos: ");
		this.setApellidos(sc.nextLine());
		
		try {		
			System.out.print("\nIntroduzca la edad: ");
			aux = sc.nextLine();
			this.setEdad(Integer.parseInt(aux));
		} 
		catch (NumberFormatException e) {
			e.printStackTrace();
		}	
		
		System.out.print("\nIntroduzca el DNI: ");
		this.setDni(sc.nextLine());
		
		
		sc.close();
		
	}

	@Override
	public String toString() {
		return "Persona con Nombre: " + nombre + ", Apellidos: " + apellidos
				+ ", DNI: " + dni + ", y edad: " + edad + " años.";
	}
	
	

}
