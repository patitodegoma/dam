
public class Saludo {

	// Atributos de la clase Saludo
	
	String mensaje;
	
	// M�todos (se definen con verbos de acci�n)
	
	public void mostrarMensaje () {                // Intentaremos usar void lo menos posible
		System.out.println("Hola mundo");
	}
	
	public void mostrarMensajev2 (String mensajito) {
		System.out.println(mensajito);
	}
	
	// Un m�todo de ejemplo para sumar dos n�meros
	
	public int sumar (int a, int b) {
		int resultado = 0;
		resultado = a + b;
		return resultado;
	}
	
}
