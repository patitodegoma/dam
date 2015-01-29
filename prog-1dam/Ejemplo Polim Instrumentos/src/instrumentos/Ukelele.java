package instrumentos;

public class Ukelele extends Guitarra {   // Segundo nivel de herencia, bajo Guitarra
	
	public void tocar () {
		System.out.println("\nEstoy tocando el Ukelele.");
	}
	
	public String tipo () {
		return "Ukelele";
	}
	
	public void afinar () {
		System.out.println("\nCon este método estoy afinando el Ukelele.");
	}

}
