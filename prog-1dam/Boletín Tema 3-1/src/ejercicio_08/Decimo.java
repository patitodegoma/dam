package ejercicio_08;

public class Decimo {
	
	// Atributos
	
	private double precio;
	private int minimo;
	private int maximo;
	private int numero;
	private int serie;
	
	// Constructores
	
	public Decimo (int precio, int numero, int serie, int minimo, int maximo) {
		this.precio = precio;
		this.minimo = minimo;
		this.maximo = maximo;	
		this.numero = numero;
		this.serie = serie;
	}
	
	public Decimo (double precio, int minimo, int maximo) {
		this.precio = precio;
		this.minimo = minimo;
		this.maximo = maximo;
	}
	
	public Decimo () {
		this.precio = 0;
		this.minimo = 0;
		this.maximo = 0;
		this.numero = 0;
		this.serie = 0;
	}
	
	// Getters and setters

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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}
	
	
	// Métodos
	
	public int generadecimo (int min, int max) {
		numero = (int)Math.floor(Math.random()*(max - min + 1) + min);
		return numero;
	}
	
	public boolean escogenumero (int escogido) {
		boolean ok = true;
		if (escogido < minimo || escogido > maximo){
			ok = false;
		} else {
			this.numero = escogido;
		}
		return ok;
	}
	
	public void imprimeboleto (int numero) {
		System.out.println("\n\n\t* * * * * * * * * * * * * * * * * * * * * *\n"
				           + "\t*                                         *\n"
				           + "\t*      EL SORTEO DE PRIMERO DE DAM        *\n"
				           + "\t*                                         *");
		System.out.printf("\t*  Su número: %d                       *\n", numero);
		System.out.println("\t*                                         *");
		System.out.printf("\t*  Precio: %.2f €                        *\n", precio);
		System.out.println("\t*                                         *\n"
			               + "\t* * * * * * * * * * * * * * * * * * * * * *");
	}
	

}
