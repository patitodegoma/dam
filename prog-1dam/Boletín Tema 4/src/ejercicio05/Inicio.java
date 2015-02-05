package ejercicio05;

public class Inicio {
	
	/* 
	  Hacer un programa que imprima el ticket de compra, bas�ndonos en un supermercado que tenga
	  alimentaci�n, ropa, electr�nica, etc. Cada producto adem�s, deber� estar caracterizado por el 
	  precio, nombre, c�digo de identificaci�n�). El ticket debe mostrar: el nombre de los productos de
	  la cesta con su precio unitario, el precio si se ha comprado m�s de uno, el precio total de la
	  compra y el resto de informaci�n de forma parecida al ejemplo (no es necesario imprimir la fecha
      y la hora actual, puede hacerse con un String).  
	*/


	public static void main(String[] args) {
		
		// Precios m�ximos y m�nimos para cada categor�a de producto
		double minPrecioAlim = 0.29, maxPrecioAlim = 20.0, minPrecioRopa = 2.79, maxPrecioRopa = 39.99, 
				minPrecioElec = 4.95, maxPrecioElec = 59.99;
		// Talla m�nima y m�ximo de productos que un cliente se llevar�a de cada producto
		int minTalla = 34, maxProdAlim = 10, maxProdRopa = 5, maxProdElec = 4;
		
		// N�mero de productos distintos que se ha comprado
		int cantidadProductos = (int)(Math.random() * 12);
		
		Producto [] miCarrito = new Producto [cantidadProductos];   
		Cajera miCajera = new Cajera ("Juani");
		
		for (int i = 0; i < cantidadProductos; i++) {
			switch ((int)(Math.random() * 3)) {
			case 0:
				miCarrito [i] = new Alimentacion (minPrecioAlim + Math.random() * (maxPrecioAlim - minPrecioAlim), 
						"Alimentaci�n", (int)(Math.random() * 100), 1 + (int)(Math.random() * maxProdAlim));
				break;
			case 1:
				miCarrito [i] = new Ropa (minPrecioRopa + Math.random() * (maxPrecioRopa - minPrecioRopa), 
						"Prendas Vestir", 100 + (int)(Math.random() * 100), 1 + (int)(Math.random() * maxProdRopa), 
						"Fabricante", minTalla + (int)(Math.random() * 20) );
				break;
			case 2:
				miCarrito [i] = new Electronica (minPrecioElec + Math.random() * (maxPrecioElec - minPrecioElec), 
						"Electr�nica", 200 + (int)(Math.random() * 100), 1 + (int)(Math.random() * maxProdElec), 
						"Fabricante");
			}	
		}	
		
		miCajera.realizaGestion(miCarrito);		
	}

}
