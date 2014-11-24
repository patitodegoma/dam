package Ejercicio_06;

/*
Se desea llevar un control del estado de una cuenta corriente; la cuenta 
corriente est� caracterizada por su saldo y sobre ella se pueden realizar tres 
tipos de operaciones: 
� saldo: devuelve el saldo de la cuenta (puede ser negativo, hasta -1000 
�). 
� Imposici�n (cantidad): ingresa en la cuenta una cantidad de dinero dada 
por el usuario. 
� Reintegro (cantidad): saca de la cuenta una determinada cantidad de 
dinero especificada por el usuario. 
Sup�n que la cuenta inicialmente tiene un saldo de cero. Escribe una clase 
CuentaCorriente que implemente la funcionalidad descrita. 
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		double cantidad = 0;
		char continuar = 's';
		
		Cuenta miCuenta = new Cuenta();
		
		System.out.println("***Bienvenido a mi programa***\n"
				+ "\nSimula el funcionamiento b�sico de una cuenta corriente.\n");
		
		
		do {
		
			System.out.println("\nPor favor, teclee en el men� siguiente la opci�n deseada:"
					+ "\n1.- Consultar Saldo."
					+ "\n2.- Ingresar dinero."
					+ "\n3.- Reintegro.");
			System.out.print("Su opci�n: ");
			
			opcion = Leer.datoInt();
			
			
			switch (opcion) {
			case 1:
				System.out.println(miCuenta.getSaldo());
				break;
			case 2:
				System.out.print("�Cu�nto dinero desea ingresar?: ");
				cantidad = Leer.datoDouble();
				System.out.println(miCuenta.ingresar(cantidad));
				break;
			case 3:
				System.out.println("�Cuanto dinero desea sacar?");
				cantidad = Leer.datoDouble();
				System.out.println(miCuenta.sacar(cantidad));		
			}
			
			System.out.print("\n�Desea realizar una nueva operaci�n? (S/N): ");
			continuar = Leer.datoChar();
			
		}
		while (continuar == 's' || continuar == 'S');
		
		System.out.println("\nGracias por utilizar mi programa!!");

	}

}
