package utiles;

public class Datos {
	
	public static String [] dameNnombres (int n) {
		String [] devolucion = new String [n];
		String [] nombres = {"Yerim�n Mar�n", "Ruyan Robles", "Adriadna Fern�ndez", "Anaxagoras Carranza",
				"Liber Mata", "Florian Cerv�ntez", "Electra Arroyo", "Michelle Luna", "Rina Posada", 
				"Amankaya Alaniz", "Tulio Montemayor", "Huberto Gracia", "Noral� Pena", "Jaia Caraballo",
				"Sean Galv�n", "Karin Dom�nquez", "Yemina Carranza", "Baudelio Villanueva", "Eldora Escamilla",
				"Gandolfo Guajardo", "Sidney Gil", "Egisto Ibarra", "Adelia Barajas", "Aciscio Perea"};
		
		for (int i = 0; i < n; i++) {
			devolucion [i] = nombres [i];
		}
		
		// Desordenamos el array a devolver
		int aleat = 0;
		String temporal = "";
		for (int i = 0; i < devolucion.length; i++) {
			aleat = i + (int) (Math.random() * (devolucion.length - i));
			temporal = devolucion[i];
			devolucion[i] = devolucion[aleat];
			devolucion[aleat] = temporal;
		}
		
		return devolucion;
	}

}
