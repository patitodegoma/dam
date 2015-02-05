package examen;

public class Aeropuerto {
	
	public double calcularPrecio (Avion a) {
		double coste = a.calcularAterrizaje();
		return coste;
	}
	
	public double calcularPrecioTodos (Avion [] listadoAviones) {
		double costeTotal = 0.0;
		for (int i = 0; i < listadoAviones.length; i++) {
			costeTotal += calcularPrecio(listadoAviones[i]);
		}
		return costeTotal;
	}
	
	public void listadoCostes (Avion [] listadoAviones) {
		for (int i = 0; i < listadoAviones.length; i++) {
			System.out.println("\nEl coste de aterrizaje del avión " + (i+1) + " es " + listadoAviones[i].calcularAterrizaje() + " €.");
			System.out.println(listadoAviones[i]);
			if (listadoAviones[i] instanceof Nave) {
				Nave miNave = (Nave) listadoAviones[i];
				miNave.llamarALosHombresdeNegro();
			}
		}
	}

}
