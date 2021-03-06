package Ejercicio_04b;

import Ejercicio_03.Leer;

/* Realizar un programa que calcule el volumen de un cilindro. Vosotros deb�is 
decidir qu� m�todo usar y qu� valores pasarle. */


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radio = 0, altura = 0, volumen = 0;	 // No tienen por qu� llamarse igual que los atributos 
												     // pero como Eclipse autogenera c�digo (por ejemplo
		                                             // los getters y setters) lo podemos poner. Adem�s
		                                             // en Eclipse se distingue entre variables y atributos
		                                             // por el color.

		System.out.println("***Bienvenido a mi programa, que calcula el volumen de un cilindro***");
		
		System.out.print("\nPor favor, introduzca el radio: ");
		
		radio = Leer.datoDouble();
		
		System.out.print("\nPor favor, introduzca la altura: ");
		
		altura = Leer.datoDouble();
		
		Cilindros miCilindro = new Cilindros (radio, altura);  // Se crea ahora, que es cuando tenemos los
		                                                     // valores del cilindro, y se los pasamos
		                                                     // al constructor. (Al que tiene solo radio
		                                                     // y altura).
		
		volumen = miCilindro.calculaVolumen(radio, altura);
		
		System.out.println("\nEl volumen del Cilindro es "+volumen+" metros c�bicos.\n");
		
		System.out.println(miCilindro);               // Funciona porque hay toString, si no saca las
		                                              // direcciones de memoria.
		
	}

}
