
public class Saludo {

	// Atributos de la clase Saludo
	
	String mensaje;
	
	// Métodos (se definen con verbos de acción)
	
	public void mostrarMensaje () {                // Intentaremos usar void lo menos posible
		System.out.println("Hola mundo");
	}
	
	public void mostrarMensajev2 (String mensajito) {
		System.out.println(mensajito);
	}
	
	// Un método de ejemplo para sumar dos números
	
	public int sumar (int a, int b) {
		int resultado = 0;
		resultado = a + b;
		return resultado;
	}
	
}
