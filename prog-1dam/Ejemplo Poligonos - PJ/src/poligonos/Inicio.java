package poligonos;

public class Inicio {

	// Poligono -> Circulo, Cuadrado, Triangulo
		
	public static void main(String[] args) {
		
		Poligono [] grupoPol = new Poligono [10];      // Creo un array de 10 polígonos
		
		for (int i = 0; i < grupoPol.length; i++) {
			switch ((int)(Math.random() * 3)) {
			case 0:
				grupoPol [i] = new Circulo ();
				break;
			case 1:
				grupoPol [i] = new Cuadrado ();
				break;
			case 2:
				grupoPol [i] = new Triangulo ();
			}	
		}
		
		/* Ahora vamos a dibujar todos los polígonos que tenemos en el array. Gracias al polimorfismo, se llamará al método
		   adecuado de cada polígono. */
		
		for (int i = 0; i < grupoPol.length; i++) {
			grupoPol[i].dibujar();
		}
		
		
		
		

	}

}
