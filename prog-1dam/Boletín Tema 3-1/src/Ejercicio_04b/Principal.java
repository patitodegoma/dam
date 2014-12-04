package Ejercicio_04b;


/* Realizar un programa que calcule el volumen de un cilindro. Vosotros debéis 
decidir qué método usar y qué valores pasarle. */


public class Principal {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radio = 0, altura = 0, volumen = 0;	 
		char continuar = 's';

		System.out.println("***Bienvenido a mi programa, que calcula el volumen de un cilindro***");
		
		do {
		
			System.out.print("\nPor favor, introduzca el radio: ");
			
			radio = Leer.datoDouble();
			
			System.out.print("\nPor favor, introduzca la altura: ");
			
			altura = Leer.datoDouble();
			
			Cilindros miCilindro = new Cilindros (radio, altura);  
			
			volumen = miCilindro.calculaVolumen(radio, altura);
			
			System.out.println(miCilindro.toString());
			
			System.out.println("\n¿Quieres calcular el área de otro cilindro? (S/N): ");
			continuar = Leer.datoChar();
		
		} while (continuar == 's' || continuar == 'S');
		
		System.out.println("\n¡¡Gracias por usar mi programa!!");
		
	}

}
