
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Saludo hola = new Saludo ();
		
		hola.mostrarMensaje ();
		
		// Para la v2
		
		String miMensajito = "Hola Mundo!";
		hola.mostrarMensajev2(miMensajito);
		
		// Para la suma
		
		System.out.println("\nMete los dos números:");
		int num1 = Leer.datoInt();
		int num2 = Leer.datoInt();
		
		int result = hola.sumar(num1, num2);
		System.out.println(result);
		
		

	}

}
