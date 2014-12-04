package ejercicio_03;

public class Principal {

	/*
	Implementar un programa que contenga un m�todo al que se le pase un
	n�mero entero y diga si este es positivo o negativo. 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char continuar = 's';
		int numero = 0;
		boolean prueba = true;
		
		System.out.println("\t\n***Bienvenido a mi programa***\n\n"
				+ "Coge un numerito y comprueba si es positivo o negativo (considero el 0 como positivo).\n");
		
		do {
			
			System.out.print("\nPor favor, introduzca el n�mero: ");
			numero = Leer.datoInt();
			
			Numero miNumero = new Numero();
			
			prueba = miNumero.mirasigno(numero);
			
			if (prueba) {
				System.out.println("\nEl n�mero "+numero+" es positivo");
			} else {
				System.out.println("\nEl n�mero "+numero+" es negativo");
			}
			
			System.out.print("\n�Desea comprobar otro n�mero? (S/N): ");
			continuar = Leer.datoChar();

		} while (continuar == 's' || continuar == 'S');
		
		System.out.println("\n�Gracias por utilizar este programa!");
	}

}
