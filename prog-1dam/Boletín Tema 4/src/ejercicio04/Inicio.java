package ejercicio04;

public class Inicio {
	
	/*
	Los vehículos a motor pagan un determinado impuesto de circulación. La cantidad a
	pagar depende de la cilindrada, caballos y tipo de combustible. Crear un programa para
	calcular la cantidad que debe pagar un vehículo dependiendo de sus características. (Los
	vehículos pueden ser motocicletas, coches y furgonetas). El impuesto se calcula con una
	cantidad fija más el 60 % de la potencia del vehículo más 5 € a aquellos vehículos que
	son tienen 4 ruedas.
	La jerarquía de clases no tiene mucho sentido en este ejemplo, pero está puesto para
	reescribir métodos. 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cantidadFija = 500, fijo4ruedas = 5;
		double porcentajePotencia = 60;
		
		System.out.println("\n *** Bienvenido a mi programa. Calcula el impuesto de circulación de algunos vehículos ***");
		
		Vehiculo [] listadoVehiculos = new Vehiculo [3];
		
		// Inicializo los arrays a mano, ya sé que se ve cutre, en los ejercicios siguientes está más elaborado.
		listadoVehiculos[0] = new Moto (2, 49, 60, "Gasolina");
		listadoVehiculos[1] = new Coche (4, 109, 200, "Gasoil");
		listadoVehiculos[2] = new Fregoneta (4, 150, 220, "Gasoil");
		
		for (int i = 0; i < listadoVehiculos.length; i++) {
			if (listadoVehiculos[i] instanceof Moto)
				System.out.println("\nLa moto pagará " + listadoVehiculos[i].calculaImpuesto(cantidadFija, porcentajePotencia, fijo4ruedas) + " € de circulación.");
			else if (listadoVehiculos[i] instanceof Coche)
				System.out.println("\nEl coche pagará " + listadoVehiculos[i].calculaImpuesto(cantidadFija, porcentajePotencia, fijo4ruedas) + " € de circulación.");
			else 
				System.out.println("\nLa furgoneta pagará " + listadoVehiculos[i].calculaImpuesto(cantidadFija, porcentajePotencia, fijo4ruedas) + " € de circulación.");
		}
		
		System.out.println("\nGracias por utilizar mi programa!!!");
	}

}
