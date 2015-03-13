package excepciones;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0, b = 0;
		Operacion op = new Operacion ();
		
		try {
			System.out.print("Número a: ");
			a = Leer.datoInt();
			System.out.print("Número b: ");
			b = Leer.datoInt();
		} catch (Exception e) {
			System.out.println("Error!!");
		}
			
		System.out.println("\nResultado de la división: " + op.dividir(a, b));

	}

}
