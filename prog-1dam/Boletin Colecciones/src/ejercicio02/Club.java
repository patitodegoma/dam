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
		System.out.print("\nPor favor, introduzca el a�o de nacimiento: ");
		anyoNacimiento = Leer.datoInt();
		System.out.print("\nPor favor, introduzca la direcci�n: ");
		direccion = Leer.dato();
		System.out.print("\nPor favor, introduzca el n�mero de tel�fono: ");
		telefono = Leer.datoInt();		
		
		Socio nuevoSocio = new Socio (nombre, anyoNacimiento, direccion, telefono);
		this.listaSocios.add(nuevoSocio);
		System.out.println("\nSe agreg� correctamente el socio n�mero "+ nuevoSocio.getNumSocio() +".");
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
		
		System.out.print("\nPor favor, introduzca el n�mero de socio a modificar: ");
		numSocio = Leer.datoInt();
		
		if (numSocio > 0 && numSocio <= Socio.getContadorSocios()) {
			elegido = this.buscarSocio(numSocio);
			if (elegido.getNumSocio() == 0) {
				System.out.println("\nEl n�mero de socio no existe.");
			} else {
				System.out.print("\nEl nombre que aparece en la base de datos es " + elegido.getNombre() + ". "
						+ "�Desea modificarlo? (S/N): ");
				respuesta = Leer.datoChar();
				if (respuesta == 's' || respuesta == 'S') {
					System.out.print("Introduzca el nuevo nombre: ");
					elegido.setNombre(Leer.dato());
				}
				System.out.print("\nEl a�o de nacimiento que aparece en la base de datos es " + elegido.getAnyoNacimiento() + ". "
						+ "�Desea modificarlo? (S/N): ");
				respuesta = Leer.datoChar();
				if (respuesta == 's' || respuesta == 'S') {
					System.out.print("Introduzca el nuevo a�o de nacimiento: ");
					elegido.setAnyoNacimiento(Leer.datoInt());
				}
				
				System.out.print("\nLa direcci�n que aparece en la base de datos es " + elegido.getDireccion() + ". "
						+ "�Desea modificarla? (S/N): ");
				respuesta = Leer.datoChar();
				if (respuesta == 's' || respuesta == 'S') {
					System.out.print("Introduzca la nueva direcci�n: ");
					elegido.setDireccion(Leer.dato());
				}
				
				System.out.print("\nEl tel�fono que aparece en la base de datos es " + elegido.getTelefono() + ". "
						+ "�Desea modificarlo? (S/N): ");
				respuesta = Leer.datoChar();
				if (respuesta == 's' || respuesta == 'S') {
					System.out.print("Introduzca el nuevo tel�fono: ");
					elegido.setTelefono(Leer.datoInt());
				}
				
				System.out.println("\nProceso terminado correctamente.");
			}
			
			
		} else {
			System.out.println("\nEl n�mero de socio indicado no se encuentra en la base de datos.");
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
		System.out.print("\nPor favor, introduzca el n�mero de socio a borrar: ");
		numSocio = Leer.datoInt();
		if (numSocio > 0 && numSocio <= Socio.getContadorSocios()) {
			elegido = this.buscarSocio(numSocio);
			if (elegido.getNumSocio() == 0) {
				System.out.println("\nEl socio indicado no existe.");
			} else {
				System.out.println("\nEl socio " + numSocio + " con los siguientes datos: ");
				System.out.println(elegido);
				System.out.print("\nVa a ser borrado. �Est� seguro? (S/N):  ");
				respuesta = Leer.datoChar();
				if (respuesta == 's' || respuesta == 'S') {
					this.listaSocios.remove(this.listaSocios.indexOf(elegido));
					System.out.println("\nSocio borrado correctamente.");
				} else
					System.out.println("\nNo se borr� ning�n socio.");
			}
					
		} else {
			System.out.println("\nEl socio indicado no existe.");
		}
		
	}
	
	public void mostrarSocio () {
		int numSocio;
		Socio elegido;
		System.out.print("\nPor favor, introduzca el n�mero de socio a mostrar: ");
		numSocio = Leer.datoInt();
		if (numSocio > 0 && numSocio <= Socio.getContadorSocios()) {
			elegido = this.buscarSocio(numSocio);
			if (elegido.getNumSocio() == 0) {
				System.out.println("\nEl n�mero de socio no existe.");
			} else {
				System.out.println(this.buscarSocio(numSocio));
				System.out.println("\nProceso finalizado correctamente");
			}
			
		}
		
		System.out.println("\nEl socio indicado no existe.");
		
	}
	

}
