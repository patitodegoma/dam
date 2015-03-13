package ejercicio03;

import java.util.Scanner;

public class Inicio {
	
	/*
	Realizar un programa que haga las operaciones b�sicas de una calculadora con
	n�meros enteros (sumar, resta, multiplicar, dividir y ra�z cuadrada) teniendo en cuenta
	las posibles excepciones que se pueden producir (entrada de datos, divisi�n por cero,
	ra�z de un n�mero negativo, etc.).
	*/


	public static void main(String[] args) throws ExcepcionRaizNeg {
		// TODO Auto-generated method stub
		
		int opcion, resultado = 0;
		char respuesta = 'n';
		boolean err = true;
		Scanner sc = new Scanner (System.in);
		String aux;
		
		Calculadora casio = new Calculadora ();
		
		System.out.println("\n\t*** Bienvenidos a mi programa ***");
		System.out.println("\n Implementa una calculadora b�sica con tratamiento de excepciones.");
		
		do {
			System.out.println("\nSeleccione la operaci�n a realizar:");
			System.out.println("\t1.- Sumar dos n�meros.");
			System.out.println("\t2.- Restar dos n�meros.");
			System.out.println("\t3.- Multiplicar dos n�meros.");
			System.out.println("\t4.- Dividir dos n�meros.");
			System.out.println("\t5.- Ra�z cuadrada de un n�mero.");
			System.out.println("\t\n0.- Salir.");
			
			System.out.print("\nOpci�n: ");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			
			switch(opcion) {
			case 1: 
				System.out.println("\nPor favor, introduzca el primer sumando.");
				casio.leerNumero(1);
				System.out.println("\nAhora introduzca el segundo sumando.");
				casio.leerNumero(2);
				System.out.println("\nEl resultado es " + casio.sumar() + ".");
				break;
			case 2:
				System.out.println("\nPor favor, introduzca el minuendo.");
				casio.leerNumero(1);
				System.out.println("\nAhora, introduzca el sustraendo.");
				casio.leerNumero(2);
				System.out.println("\nEl resultado es " + casio.restar() + ".");
				break;
			case 3:
				System.out.println("\nPor favor, introduzca el primer n�mero.");
				casio.leerNumero(1);
				System.out.println("\nAhora, introduzca el segundo n�mero.");
				casio.leerNumero(2);
				System.out.println("\nEl resultado es " + casio.multiplicar() + ".");
				break;
			case 4:
				System.out.println("\nPor favor, introduzca el dividendo.");
				casio.leerNumero(1);
				System.out.println("\nAhora, introduzca el divisor.");
				casio.leerNumero(2);
				do {
					try {
						resultado = casio.dividir();
						err = false;
					} catch (ArithmeticException e) {
						System.out.println("Por favor, introduzca un n�mero distinto de cero.");
						casio.leerNumero(2);
					}
				} while (err);
				
				System.out.println("\nEl resultado es " + resultado + ".");
				break;
			case 5:
				System.out.println("\nPor favor, introduzca el n�mero cuya raiz desee calcular.");
				casio.leerNumero(1);
				System.out.println("\nEl resultado es " + casio.raiz() + ".");
			case 0:
				aux = sc.nextLine();
				respuesta = 
			}
			
			if (opcion != 0) {
				System.out.print("\n�Desea realizar otra operaci�n? (S/N): ");
			}
			
			
			
			
		} while (respuesta == 's' || respuesta == 'S');
		
		
		sc.close();
	}
	
	

}
