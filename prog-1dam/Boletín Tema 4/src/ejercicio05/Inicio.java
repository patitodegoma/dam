package ejercicio05;

public class Inicio {
	
	/* 
	  Hacer un programa que imprima el ticket de compra, basándonos en un supermercado que tenga
	  alimentación, ropa, electrónica, etc. Cada producto además, deberá estar caracterizado por el 
	  precio, nombre, código de identificación…). El ticket debe mostrar: el nombre de los productos de
	  la cesta con su precio unitario, el precio si se ha comprado más de uno, el precio total de la
	  compra y el resto de información de forma parecida al ejemplo (no es necesario imprimir la fecha
      y la hora actual, puede hacerse con un String).  
	*/


	public static void main(String[] args) {
		
		// Precios máximos y mínimos para cada categoría de producto
		double minPrecioAlim = 0.29, maxPrecioAlim = 20.0, minPrecioRopa = 2.79, maxPrecioRopa = 39.99, 
				minPrecioElec = 4.95, maxPrecioElec = 59.99;
		// Talla mínima y máximo de productos que un cliente se llevaría de cada producto
		int minTalla = 34, maxProdAlim = 10, maxProdRopa = 5, maxProdElec = 4;
		
		// Número de productos distintos que se ha comprado
		int cantidadProductos = (int)(Math.random() * 12);
		
		Producto [] miCarrito = new Producto [cantidadProductos];   
		Cajera miCajera = new Cajera ("Juani");
		
		for (int i = 0; i < cantidadProductos; i++) {
			switch ((int)(Math.random() * 3)) {
			case 0:
				miCarrito [i] = new Alimentacion (minPrecioAlim + Math.random() * (maxPrecioAlim - minPrecioAlim), 
						"Alimentación", (int)(Math.random() * 100), 1 + (int)(Math.random() * maxProdAlim));
				break;
			case 1:
				miCarrito [i] = new Ropa (minPrecioRopa + Math.random() * (maxPrecioRopa - minPrecioRopa), 
						"Prendas Vestir", 100 + (int)(Math.random() * 100), 1 + (int)(Math.random() * maxProdRopa), 
						"Fabricante", minTalla + (int)(Math.random() * 20) );
				break;
			case 2:
				miCarrito [i] = new Electronica (minPrecioElec + Math.random() * (maxPrecioElec - minPrecioElec), 
						"Electrónica", 200 + (int)(Math.random() * 100), 1 + (int)(Math.random() * maxProdElec), 
						"Fabricante");
			}	
		}	
		
		miCajera.realizaGestion(miCarrito);		
	}

}
