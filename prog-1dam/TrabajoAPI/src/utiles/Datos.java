package utiles;

public class Datos {
	
	static String [] nombres = {"Yerimén Marín", "Ruyan Robles", "Adriadna Fernández", "Anaxagoras Carranza",
			"Liber Mata", "Florian Cervántez", "Electra Arroyo", "Michelle Luna", "Rina Posada", 
			"Amankaya Alaniz", "Tulio Montemayor", "Huberto Gracia", "Noralí Pena", "Jaia Caraballo",
			"Sean Galván", "Karin Domínquez", "Yemina Carranza", "Baudelio Villanueva", "Eldora Escamilla",
			"Gandolfo Guajardo", "Sidney Gil", "Egisto Ibarra", "Adelia Barajas", "Aciscio Perea", "Xavier Abilla", 
			"José Amilibia", "Gonzalo Rodríguez", "Pilar Marcos", "Luis Montes", "Francisco Gutiérrez", 
			"José Puente", "Roberto Pérez", "Jonathan Millán", "Ángeles Cabrera", "María José Alanís", 
			"Rocío Benjumea", "Juan Campos", "Irene Montero", "Jorge Madrid", "María Martínez", "Raquel Monja", 
			"Jorge Montiel", "Benjamín López", "Félix Pueyo", "Octavio Artiles", "Macarena Rubio", "Jesús Vilar", 
			"Ana Castellanos", "Ernesto Moreno", "Isabel Alors", "Esmeralda Villafuerte", "Ana Veiga"};
	
	public static String [] dameNnombres (int n) {
		String [] devolucion = new String [n];
		
		
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
	
	public static String dame1Nombre () {
		int aleat = (int)(Math.random() * nombres.length);
		return nombres[aleat];
	}

}
