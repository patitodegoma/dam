package ejercicio07;

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
		
		int numClientes = 1 + (int)(5 * Math.random());
		Cliente [] colaClientes = new Cliente [numClientes];
		
		// "Apertura" de cuentas
		for (int i = 0; i < numClientes; i++) {
			switch ((int)Math.random() * 3) {
			case 0:
				colaClientes [i].setMiCuenta(new CuentaCorriente("cuenta1", 0, 0, 0, 0));
			case 1:
				
			case 2:
			}
			
		}
		
		
		
		
		
		
		
		Cajero miCajero = new Cajero (colaClientes);

	}

}
