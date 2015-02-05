package ejercicio06;

import utiles.*;

public class Inicio {
	
	/*
	Crear una clase Empleado con los atributos nombre, sueldo base y nº de Empleado. Introducir los métodos
	necesarios y oportunos. Crear una clase derivada de ella, llamada EmpleadoAComision que tenga como
	atributo un incentivo (un porcentaje de las ventas realizadas en un mes sumado a su sueldo normal) y los
	métodos apropiados para manejarla. El sueldo de este último se calculará aplicando el incentivo al sueldo
	base que se pedirá por teclado. Crear una clase para probar el programa, instanciando al
	menos un objeto de cada tipo. Otra clase hija puede ser EmpleadoFijo, cuyo sueldo es el
	fijo estipulado por teclado pero al que se le quita un % de impuestos (consideraremos
	que al empleado por comisión no se le quita nada para que el ejercicio tenga algo más
	de sentido). 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double impuestoFijos = 10, porcIncentivo = 10, minVentas = 300, rangoVentas = 1000;
		
		int numVendedores = 1 + (int)(Math.random() * 20);     // Número de vendedores aleatorio entre 1 y 20
		
		String [] nombresVendedores = Datos.dameNnombres(numVendedores);
		
		System.out.print("\n\t*** Hola, soy Bernardo, el contable de la empresa. Para comenzar, necesito que me indiques el salario mínimo en euros: ");
		
		int sueldoBase = Leer.datoInt();
		
		Empleado [] vendedores = new Empleado [numVendedores];
		
		for (int i = 0; i < numVendedores; i++) {
			switch ((int)(Math.random() * 2)) {
			case 0:
				vendedores [i] = new EmpleadoAComision (nombresVendedores[i], sueldoBase, i+1, 
						minVentas + (int)(Math.random()*rangoVentas), porcIncentivo);
				break;
			case 1:
				vendedores [i] = new EmpleadoFijo (nombresVendedores[i], sueldoBase, i+1, 
						minVentas + (int)(Math.random()*rangoVentas), impuestoFijos);
			}
		}	
		
		Contable bernardo = new Contable (vendedores);
		
		System.out.println("\n\t *** Muy bien, le indico los datos de los trabajadores y su sueldo final:");
		bernardo.imprimeNominas();
		
		System.out.println("\n\t *** ¡Hasta la vista, jefe!");
		
	}

}
