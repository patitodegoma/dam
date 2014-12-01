package ejercicio_08;

public class Sorteo {
	
	// Atributos
	
	private Decimo miDecimo;
	
	// Constructores
	
	public Sorteo () {
		miDecimo = new Decimo (0, 0, 0);			
	}
	
	public Sorteo (double precio, int minimo, int maximo) {
		miDecimo = new Decimo (precio, minimo, maximo);
	}
	
		
	// Getters y Setters

	
	
	
	// Métodos
	
	
	public int sortear() {
		int premiado = 0;
		premiado = (int)Math.floor(Math.random()*(miDecimo.getMaximo() - miDecimo.getMinimo() + 1) + miDecimo.getMinimo());
		return premiado;
	}
	
	public int comprobar (int miNumero, int premiado) {
		int comprobar = 0;
		if (miNumero == premiado) {
			comprobar = 1;
		} else if (miNumero % 10 == premiado % 10) {
			comprobar = 2;
		}
		return comprobar;
	}
	
	
	
	
	
	

	
	
}
