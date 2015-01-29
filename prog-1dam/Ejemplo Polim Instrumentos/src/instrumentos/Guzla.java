package instrumentos;

public class Guzla extends Guitarra {  // Segundo nivel de herencia, bajo Guitarra
	
	public void tocar () {
		System.out.println("\nEstoy tocando la Guzla.");
	}
	
	public String tipo () {
		return "Guzla";
	}
	
	public void afinar () {
		System.out.println("\nCon este método estoy afinando la Guzla.");
	}

}
