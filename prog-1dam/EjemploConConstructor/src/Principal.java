
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nom;
		int ed;
		
		System.out.println("Para comenzar, introduzca sus datos.\n");
		
		System.out.print("Introduzca su nombre: ");
		nom = Leer.dato();
		System.out.print("Introduzca su edad: ");
		ed = Leer.datoInt();
		
		Persona miPers = new Persona(nom, ed);
		
		
		/* Esta forma de imprimir no es buena:
		 
		System.out.println("\nSu nombre es "+miPers.nombre+" y su edad es "+miPers.edad+" a�os.");
		
		*/
		
		miPers.imprimirDatos (nom, ed);

	}

}
