package ejercicio_01;

public class Principal {

	/*
	 Crear un programa que muestre en pantalla una cadena almacenada en un
	 String. La cadena se inicializar� en el main y se le pasar� a un m�todo como
	 argumento tipo String creado espec�ficamente para mostrar datos por pantalla. 
	 */
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "Mi cadena";
		
		Cadena miCadena = new Cadena();
		
		System.out.println("\n\t***Bienvenido a mi programa***\n\n"
				+ "Muestra en pantalla una cadena recibida como argumento de un m�todo.\n");
		
		miCadena.mostrar(test);
		
		System.out.println("\n�Gracias por utilizar este programa!");
		
	
	}

}
