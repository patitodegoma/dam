package excepciones;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0, b = 0;
		Operacion op = new Operacion ();
		
		try {
			System.out.print("N�mero a: ");
			a = Leer.datoInt();
			System.out.print("N�mero b: ");
			b = Leer.datoInt();
		} catch (Exception e) {
			System.out.println("Error!!");
		}
			
		System.out.println("\nResultado de la divisi�n: " + op.dividir(a, b));

	}

}
