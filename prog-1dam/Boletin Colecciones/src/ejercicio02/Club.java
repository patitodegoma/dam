package ejercicio02;

import java.util.ArrayList;

import utiles.Leer;

public class Club {
	
	private ArrayList <Socio> listaSocios;
	
	public Club () {
		this.listaSocios = new ArrayList <Socio> ();
	}
	
	public void agregarSocios () {
		int anyoNacimiento, telefono;
		String nombre, direccion;
		System.out.print("\nPor favor, introduzca el nombre del socio: ");
		nombre = Leer.dato();
		System.out.print("\nPor favor, introduzca el año de nacimiento: ");
		anyoNacimiento = Leer.datoInt();
		System.out.print("\nPor favor, introduzca la dirección: ");
		direccion = Leer.dato();
		System.out.print("\nPor favor, introduzca el número de teléfono: ");
		telefono = Leer.datoInt();		
		
		Socio nuevoSocio = new Socio (nombre, anyoNacimiento, direccion, telefono);
		this.listaSocios.add(nuevoSocio);
		System.out.println("\nSe agregó correctamente el socio número "+ nuevoSocio.getNumSocio() +".");
	}
	
	public void agregarSocios (Socio [] grupoSocios) {
		for (int i = 0; i < grupoSocios.length; i++) {
			this.listaSocios.add(grupoSocios[i]);
		}
	}
	
	public void modificarSocios () {
		int numSocio;
		Socio elegido;
		char respuesta;
		
		System.out.print("\nPor favor, introduzca el número de socio a modificar: ");
		numSocio = Leer.datoInt();
		
		if (numSocio > 0 && numSocio <= Socio.getContadorSocios()) {
			elegido = this.buscarSocio(numSocio);
			if (elegido.getNumSocio() == 0) {
				System.out.println("\nEl número de socio no existe.");
			} else {
				System.out.print("\nEl nombre que aparece en la base de datos es " + elegido.getNombre() + ". "
						+ "¿Desea modificarlo? (S/N): ");
				respuesta = Leer.datoChar();
				if (respuesta == 's' || respuesta == 'S') {
					System.out.print("Introduzca el nuevo nombre: ");
					elegido.setNombre(Leer.dato());
				}
				System.out.print("\nEl año de nacimiento que aparece en la base de datos es " + elegido.getAnyoNacimiento() + ". "
						+ "¿Desea modificarlo? (S/N): ");
				respuesta = Leer.datoChar();
				if (respuesta == 's' || respuesta == 'S') {
					System.out.print("Introduzca el nuevo año de nacimiento: ");
					elegido.setAnyoNacimiento(Leer.datoInt());
				}
				
				System.out.print("\nLa dirección que aparece en la base de datos es " + elegido.getDireccion() + ". "
						+ "¿Desea modificarla? (S/N): ");
				respuesta = Leer.datoChar();
				if (respuesta == 's' || respuesta == 'S') {
					System.out.print("Introduzca la nueva dirección: ");
					elegido.setDireccion(Leer.dato());
				}
				
				System.out.print("\nEl teléfono que aparece en la base de datos es " + elegido.getTelefono() + ". "
						+ "¿Desea modificarlo? (S/N): ");
				respuesta = Leer.datoChar();
				if (respuesta == 's' || respuesta == 'S') {
					System.out.print("Introduzca el nuevo teléfono: ");
					elegido.setTelefono(Leer.datoInt());
				}
				
				System.out.println("\nProceso terminado correctamente.");
			}
			
			
		} else {
			System.out.println("\nEl número de socio indicado no se encuentra en la base de datos.");
		}
		
	}
	
	public Socio buscarSocio (int numSocio) {
		Socio socioEncontrado = new Socio (0, "", 0, "", 0);
		for (Socio socioActual : this.listaSocios) {
			if (socioActual.getNumSocio() == numSocio) {
				socioEncontrado = socioActual;
			}
		}
		return socioEncontrado;
	}
	
	public void mostrarTodos () {
		if (!this.listaSocios.isEmpty()) {
			for (Socio socioActual : this.listaSocios) {
				System.out.println(socioActual);
			}
			System.out.println("\nProceso finalizado correctamente.");
		} else
			System.out.println("\nEn este momento no hay socios registrados.");	
	}
	
	public void borrarSocios () {
		int numSocio;
		Socio elegido;
		char respuesta;
		System.out.print("\nPor favor, introduzca el número de socio a borrar: ");
		numSocio = Leer.datoInt();
		if (numSocio > 0 && numSocio <= Socio.getContadorSocios()) {
			elegido = this.buscarSocio(numSocio);
			if (elegido.getNumSocio() == 0) {
				System.out.println("\nEl socio indicado no existe.");
			} else {
				System.out.println("\nEl socio " + numSocio + " con los siguientes datos: ");
				System.out.println(elegido);
				System.out.print("\nVa a ser borrado. ¿Está seguro? (S/N):  ");
				respuesta = Leer.datoChar();
				if (respuesta == 's' || respuesta == 'S') {
					this.listaSocios.remove(this.listaSocios.indexOf(elegido));
					System.out.println("\nSocio borrado correctamente.");
				} else
					System.out.println("\nNo se borró ningún socio.");
			}
					
		} else {
			System.out.println("\nEl socio indicado no existe.");
		}
		
	}
	
	public void mostrarSocio () {
		int numSocio;
		Socio elegido;
		System.out.print("\nPor favor, introduzca el número de socio a mostrar: ");
		numSocio = Leer.datoInt();
		if (numSocio > 0 && numSocio <= Socio.getContadorSocios()) {
			elegido = this.buscarSocio(numSocio);
			if (elegido.getNumSocio() == 0) {
				System.out.println("\nEl número de socio no existe.");
			} else {
				System.out.println(this.buscarSocio(numSocio));
				System.out.println("\nProceso finalizado correctamente");
			}
			
		}
		
		System.out.println("\nEl socio indicado no existe.");
		
	}
	

}
