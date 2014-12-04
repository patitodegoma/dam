package ejercicio_02;

public class Principal {
	
	/*
	 Hacer un programa que calcule el �rea de un c�rculo cuando se le pasa al
	 m�todo como argumento el radio de este. 
	*/

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char continuar = 's';
		double radio = 0.0, area = 0.0;
		
		
		System.out.println("\t\n***Bienvenido a mi programa***\n\n"
				+ "Calcula el �rea de un c�rculo usando un m�todo para el c�lculo.");
		
		do {
			
			System.out.print("\nPor favor, introduzca el radio del c�rculo: ");
			radio = Leer.datoDouble();
			
			Circulo miCirculo = new Circulo (radio);
			
			area = miCirculo.calculaarea(radio);
			
			System.out.println(miCirculo.toString());
			
			System.out.print("\n�Desea calcular el �rea de otro c�rculo? (S/N): ");
			
			continuar = Leer.datoChar();
			
			
		} while (continuar == 's' || continuar == 'S');
		
		System.out.println("\n�Gracias por utilizar este programa!");
		
		

	}

}
