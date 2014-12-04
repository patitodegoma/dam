package ejercicio_05;

public class Principal {
	
	/*
	 Realizar un programa que lea un texto del teclado y un número entero y
	 muestre en pantalla el texto una cantidad de veces igual al número introducido. 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char continuar = 's';
		int numerito = 0;
		String textito = "";
		
		System.out.println("\t\n***Bienvenido a mi programa***\n\n"
				+ "Lee un texto del teclado y un número entero y muestra en pantalla el texto una "
				+ "cantidad de veces igual al número introducido.\n");
		
		do {
			System.out.print("\nIntroduzca el texto: ");
			textito = Leer.dato();
			System.out.print("\nIntroduzca el número de veces a repetirlo: ");
			numerito = Leer.datoInt();
			
			Carrerilla miCarrerilla = new Carrerilla (textito, numerito);
			
			miCarrerilla.hacercarrerilla();
			
			System.out.print("\n¿Desea hacer otra carrerilla? (S/N): ");
			continuar = Leer.datoChar();
			
			
		} while (continuar == 's' || continuar == 'S');
		
		System.out.println("\n¡Gracias por utilizar este programa!");

	}

}
