package excepciones;

public class Operacion {
	
	public int dividir (int a, int b) {
		int result = 0;
		
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("\nError! No se puede dividir por 0.");
			System.out.print("\nNúmero b: ");
			b = Leer.datoInt();
			result = a / b;
		} catch (Exception e) {
			System.out.println("\nError en el sistema.");
		}
		
		return result;
	}

}
