package ejercicio_08;

public class Sorteo {
	
	// Atributos
	
	private int numPremiado;
	private int premio;
	private int minimo;
	private int maximo;
	
	
	// Constructores
	
	public Sorteo () {
		this.numPremiado = 0;
		this.premio = 0;
		this.minimo = 0;
		this.maximo = 0;		
	}
	
	public Sorteo (int minimo, int maximo) {
		this.minimo = minimo;
		this.maximo = maximo;
	}
	
	public Sorteo (int numPremiado, int premio, int minimo, int maximo) {
		this.numPremiado = numPremiado;
		this.premio = premio;
		this.minimo = minimo;
		this.maximo = maximo;
	}

		
	// Getters y Setters

	public int getNumPremiado() {
		return numPremiado;
	}

	public void setNumPremiado(int numPremiado) {
		this.numPremiado = numPremiado;
	}

	public int getPremio() {
		return premio;
	}

	public void setPremio(int premio) {
		this.premio = premio;
	}
	
	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}
	
	// Métodos
	
	public int sortear() {
		numPremiado = (int)Math.floor(Math.random()*(maximo - minimo + 1) + minimo);
		return numPremiado;
	}
	
	public int comprobar (int miNumero) {
		int comprobar = 0;
		if (miNumero == numPremiado) {
			comprobar = 1;
		} else if (miNumero % 10 == numPremiado % 10) {
			comprobar = 2;
		}
		return comprobar;
	}
	
	
	
	// ToString
	
	

	
	
}
