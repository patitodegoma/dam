package Ejercicio_03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int miNumero = 0;
		
		Numero number = new Numero ();
		
		System.out.println("\nBienvenido a mi programa, recibe un n�mero y dice si es positivo o no.");
		
		System.out.print("\nIntroduzca un n�mero: ");
		miNumero = Leer.datoInt();
		
		if (number.isPositivo(miNumero))
			System.out.println("\nEl n�mero es positivo");
		else
			System.out.println("\nEl n�mero es negativo");		

	}

}
