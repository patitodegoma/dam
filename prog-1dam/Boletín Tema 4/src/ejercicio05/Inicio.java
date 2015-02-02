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
		
		double maxPrecio = 50.0;
		
		// Generamos un carrito de productos
		
		int cantidadProductos = (int)(Math.random() * 20);
		
		Producto [] miCarrito = new Producto [cantidadProductos];      
		
		for (int i = 0; i < cantidadProductos; i++) {
			switch ((int)(Math.random() * 3)) {
			case 0:
				miCarrito [i] = new Alimentacion ( Math.random() * maxPrecio, "Alimentación", (int)(Math.random() * 100), (int)(Math.random() * 10)  );
				break;
			case 1:
				miCarrito [i] = new Ropa ();
				break;
			case 2:
				miCarrito [i] = new Electronica ();
			}	
		}
		
		for (int i = 0; i < cantidadProductos; i++) {
			System.out.println(miCarrito [i]);
		}
		
		

	}

}
