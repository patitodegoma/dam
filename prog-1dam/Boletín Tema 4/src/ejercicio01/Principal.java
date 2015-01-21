package ejercicio01;

/*
	Crear un programa con una clase ordenador que permita almacenar características de un
	ordenador, como capacidad, procesador, etc. Crear dos clases hijas, llamadas Tablet y
	Portátil. Añadir métodos y atributos que especifiquen su comportamiento respecto a los
	ordenadores normales. La clase madre debe tener un método para calcular el precio y
	este se debe sobrecargar en las clases hijas con algún aspecto concreto de cada una de
	ellas.
*/

public class Principal {

	public static void main(String[] args) {
		
		double modificadorPortatil = 300, modificadorTablet = 100, cargoGrafica = 250;
		
		Ordenador miOrdenador = new Ordenador (2750, 16, 500, "Windows");
		
		Tablet miTablet = new Tablet (600, 2, 128, "Android", 10, "Samsung", 1700, 5);
		
		Portatil miPortatil = new Portatil (3000, 8, 750, "Windows", 15.6, 12, 5, true, false);
		
		System.out.println("\nEl ordenador cuesta "+miOrdenador.calcularPrecio()+" €.");
		
		System.out.println("\nEl portátil cuesta "+miPortatil.calcularPrecio(modificadorPortatil, cargoGrafica)+" €.");
		
		System.out.println("\nLa tablet cuesta "+miTablet.calcularPrecio(modificadorTablet)+" €.");
		

	}

}
