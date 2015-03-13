package utiles;

public class Datos {
	
	static String [] nombres = {"Yerim�n Mar�n", "Ruyan Robles", "Adriadna Fern�ndez", "Anaxagoras Carranza",
			"Liber Mata", "Florian Cerv�ntez", "Electra Arroyo", "Michelle Luna", "Rina Posada", 
			"Amankaya Alaniz", "Tulio Montemayor", "Huberto Gracia", "Noral� Pena", "Jaia Caraballo",
			"Sean Galv�n", "Karin Dom�nquez", "Yemina Carranza", "Baudelio Villanueva", "Eldora Escamilla",
			"Gandolfo Guajardo", "Sidney Gil", "Egisto Ibarra", "Adelia Barajas", "Aciscio Perea", "Xavier Abilla", 
			"Jos� Amilibia", "Gonzalo Rodr�guez", "Pilar Marcos", "Luis Montes", "Francisco Guti�rrez", 
			"Jos� Puente", "Roberto P�rez", "Jonathan Mill�n", "�ngeles Cabrera", "Mar�a Jos� Alan�s", 
			"Roc�o Benjumea", "Juan Campos", "Irene Montero", "Jorge Madrid", "Mar�a Mart�nez", "Raquel Monja", 
			"Jorge Montiel", "Benjam�n L�pez", "F�lix Pueyo", "Octavio Artiles", "Macarena Rubio", "Jes�s Vilar", 
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
