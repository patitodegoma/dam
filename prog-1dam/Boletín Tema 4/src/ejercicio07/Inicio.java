package ejercicio07;

import utiles.Datos;

public class Inicio {
	
	/*
	Implementar un programa para un banco, donde se gestione la parte de cuentas de un
	usuario. Este banco tiene 3 tipos de cuentas, cuenta corriente, cuenta joven y cuenta
	empresa. Cada una de ellas se caracteriza por: La cuenta corriente paga mantenimiento
	fijo pero acumula puntos cuando se usa, para cualquier cosa, el cajero, la cuenta joven
	no tiene mantenimiento y además, se le regala 1€ cada vez que hace un ingreso y la
	cuenta de empresa, no tiene mantenimiento pero el banco penaliza a la empresa cuando
	saca dinero con un euro. El cliente tendrá un saldo, podrá sacar o meter dinero
	(reintegro e ingreso) por el cajero y dependiendo del tipo de cuenta se le hará un
	determinado cálculo y se le actualizará el saldo.
	Se puede hacer con un array de clientes pensando que cada uno solo tiene una cuenta. 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numClientes = 1 + (int)(12 * Math.random());
		Cuenta [] libroCuentas = new Cuenta [numClientes];
		Cliente [] colaClientes = new Cliente [numClientes];
		
		double mantenimiento = 15;
		int puntosUsoCajero = 10;
		
		// "Apertura" de cuentas
		for (int i = 0; i < numClientes; i++) {
			switch ((int)(Math.random() * 3)) {
			case 0:
				libroCuentas [i] = new CuentaCorriente("cuenta"+(i+1), 
						300 + (int)(Math.random() * 1000), mantenimiento, puntosUsoCajero, 0);
				
				colaClientes [i] = new Cliente (Datos.dame1Nombre(), libroCuentas[i]);
				break;
			case 1:
				libroCuentas [i] = new CuentaEmpresa("cuenta"+(i+1), 
						300 + (int)(Math.random() * 1000), 0);
				
				colaClientes [i] = new Cliente (Datos.dame1Nombre(), libroCuentas[i]);
	
				break;
			case 2:
				libroCuentas [i] = new CuentaJoven("cuenta"+(i+1), 
						300 + (int)(Math.random() * 1000), 0);
				
				colaClientes [i] = new Cliente (Datos.dame1Nombre(), libroCuentas[i]);
			}
			
		}
		
		System.out.println("\n *** Bienvenido a mi programa. Gestiona los clientes que se acercan a un cajero ***\n");
		
		Cajero miCajero = new Cajero (colaClientes, libroCuentas);
		miCajero.gestionaClientes();

	}

}
