package ejercicio04;

public class Inicio {
	
	/*
	Los veh�culos a motor pagan un determinado impuesto de circulaci�n. La cantidad a
	pagar depende de la cilindrada, caballos y tipo de combustible. Crear un programa para
	calcular la cantidad que debe pagar un veh�culo dependiendo de sus caracter�sticas. (Los
	veh�culos pueden ser motocicletas, coches y furgonetas). El impuesto se calcula con una
	cantidad fija m�s el 60 % de la potencia del veh�culo m�s 5 � a aquellos veh�culos que
	son tienen 4 ruedas.
	La jerarqu�a de clases no tiene mucho sentido en este ejemplo, pero est� puesto para
	reescribir m�todos. 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cantidadFija = 500, fijo4ruedas = 5;
		double porcentajePotencia = 60;
		
		System.out.println("\n *** Bienvenido a mi programa. Calcula el impuesto de circulaci�n de algunos veh�culos ***");
		
		Vehiculo [] listadoVehiculos = new Vehiculo [3];
		
		// Inicializo los arrays a mano, ya s� que se ve cutre, en los ejercicios siguientes est� m�s elaborado.
		listadoVehiculos[0] = new Moto (2, 49, 60, "Gasolina");
		listadoVehiculos[1] = new Coche (4, 109, 200, "Gasoil");
		listadoVehiculos[2] = new Fregoneta (4, 150, 220, "Gasoil");
		
		for (int i = 0; i < listadoVehiculos.length; i++) {
			if (listadoVehiculos[i] instanceof Moto)
				System.out.println("\nLa moto pagar� " + listadoVehiculos[i].calculaImpuesto(cantidadFija, porcentajePotencia, fijo4ruedas) + " � de circulaci�n.");
			else if (listadoVehiculos[i] instanceof Coche)
				System.out.println("\nEl coche pagar� " + listadoVehiculos[i].calculaImpuesto(cantidadFija, porcentajePotencia, fijo4ruedas) + " � de circulaci�n.");
			else 
				System.out.println("\nLa furgoneta pagar� " + listadoVehiculos[i].calculaImpuesto(cantidadFija, porcentajePotencia, fijo4ruedas) + " � de circulaci�n.");
		}
		
		System.out.println("\nGracias por utilizar mi programa!!!");
	}

}
