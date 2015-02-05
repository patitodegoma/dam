package examen;

public class Inicio {

	public static void main(String[] args) {
		
		int numAviones = 10;
		
		// Variables tontas, para que cambien los datos de cada avión.
		int dummyLongitud = 10, dummyAnyo = 1995, dummyLitros = 100, dummyAsientos = 50, dummyPotencia = 2000, dummyMisiles = 25, 
				dummyMotores = 2;
		
		Avion [] listadoAviones = new Avion [numAviones];
		
		System.out.println("\n\t *** Bienvenidos a mi programa ***\n"
				+ "\n *** Gestiona los costes de aterrizaje del Aeropuerto del Llano la Arana ***");
		
		for (int i = 0; i < numAviones; i++) {
			switch((int)(Math.random() * 3)) {
			case 0:
				listadoAviones[i] = new AvionGeneral(dummyLongitud + i, dummyAnyo + i, "EC-00"+i, dummyLitros + i, dummyAsientos + i);
				break;
			case 1:
				listadoAviones[i] = new Caza (dummyLongitud + i, dummyAnyo + i, "EC-00"+i, dummyLitros + i, dummyAsientos + i, 
						dummyPotencia + i, dummyMisiles + i);
				break;
			case 2:
				listadoAviones[i] = new Nave (dummyLongitud + i, dummyAnyo + i, "EC-00"+i, dummyLitros + i, dummyAsientos + i, 
						dummyMotores + i);
			}

		}
		
		Aeropuerto llanoarana = new Aeropuerto ();
		
		System.out.println("\nEl coste total de los aterrizajes programados para hoy asciende a " + llanoarana.calcularPrecioTodos(listadoAviones) + " €.");
		
		System.out.println("\nEl listado individual de los costes de aterrizaje es el siguiente: ");
		llanoarana.listadoCostes(listadoAviones);
		
		System.out.println("\n *** ¡Gracias por utilizar mi programa! ***");
		
		
	}

}
