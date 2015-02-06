package ejercicio07;

import utiles.Leer;

public class Cajero {
	
	Cliente [] colaClientes;
	Cuenta [] libroCuentas;

	public Cajero(Cliente [] colaClientes, Cuenta [] libroCuentas) {
		this.colaClientes = colaClientes;
		this.libroCuentas = libroCuentas;
	}

	public Cliente[] getColaClientes() {
		return colaClientes;
	}

	public void setColaClientes(Cliente[] colaClientes) {
		this.colaClientes = colaClientes;
	}

	public Cuenta[] getLibroCuentas() {
		return libroCuentas;
	}

	public void setLibroCuentas(Cuenta[] libroCuentas) {
		this.libroCuentas = libroCuentas;
	}
	
	public void gestionaClientes() {
		int opcion = 0;
		char continuar = 's';
		double cantidad = 0.0;

		for (int i = 0; i < colaClientes.length; i++) {
			System.out.println("\n - Bienvenido a nuestra red de cajeros, " + colaClientes[i].getNombre());
			
			do {
				System.out.println("\n - Seleccione la opción que desee realizar:\n"
						+ "\t1 - Realizar un ingreso\n"
						+ "\t2 - Reintegro de dinero\n"
						+ "\t3 - Consultar saldo\n"
						+ "\t0 - Salir");
				System.out.print(" - Opción: ");
				opcion = Leer.datoInt();
				switch (opcion) {
				case 1:
					System.out.print("\n - ¿Qué cantidad desea ingresar en cuenta?: ");
					cantidad = Leer.datoDouble();
					libroCuentas[i].ingresar(cantidad);
					break;
				case 2:
					System.out.print("\n - ¿Qué cantidad desea sacar de la cuenta?: ");
					cantidad = Leer.datoDouble();
					libroCuentas[i].reintegrar(cantidad);
					break;
				case 3:
					System.out.println("\n - El saldo actual de su cuenta es de " + libroCuentas[i].getSaldo() + " €.");
					break;
				case 0:	
					if (libroCuentas[i] instanceof CuentaCorriente) {
						System.out.print("\n - ¿Desea consultar su saldo de puntos? (S/N): ");
						continuar = Leer.datoChar();
						if (continuar == 's' || continuar == 'S') {
							CuentaCorriente cc = (CuentaCorriente) libroCuentas[i];
							cc.getSaldoPuntos();
							System.out.println("\n - El saldo actual de su tarjeta de puntos es de " + cc.getSaldoPuntos() + ".");
						}	
					}
				}
		
			} while (opcion != 0);
			
			System.out.println("\n - Gracias por utilizar nuestros cajeros. No olvide la tarjeta.");
			
		}
		
		System.out.println("\nVaya, parece que no hay más gente en la cola. Voy a aprovechar para mirarme mi numerito de Playbots de la semana.");
	}
	
	

}
