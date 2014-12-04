package ejercicio_01;

public class Principal {

	/*
	 Crear un programa que muestre en pantalla una cadena almacenada en un
	 String. La cadena se inicializará en el main y se le pasará a un método como
	 argumento tipo String creado específicamente para mostrar datos por pantalla. 
	 */
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "Mi cadena";
		
		Cadena miCadena = new Cadena();
		
		System.out.println("\n\t***Bienvenido a mi programa***\n\n"
				+ "Muestra en pantalla una cadena recibida como argumento de un método.\n");
		
		miCadena.mostrar(test);
		
		System.out.println("\n¡Gracias por utilizar este programa!");
		
	
	}

}
