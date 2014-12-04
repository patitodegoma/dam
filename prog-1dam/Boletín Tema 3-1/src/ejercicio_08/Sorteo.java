package ejercicio_08;

public class Sorteo {
	
	// Atributos
	
	private Decimo miDecimo;
	private double primerPremio;
	private double segundoPremio;
	private double tercerPremio;
	
	// Constructores
	
	public Sorteo () {
		this.miDecimo = new Decimo (0, 0, 0);
		this.primerPremio = 0.0;
		this.segundoPremio = 0.0;
		this.tercerPremio = 0.0;
	}
	
	public Sorteo (Decimo miDecimo) {
		this.miDecimo = miDecimo;
	}
	
	public Sorteo (Decimo miDecimo, double primerPremio, double segundoPremio, double tercerPremio) {
		this.miDecimo = miDecimo;
		this.primerPremio = primerPremio;
		this.segundoPremio = segundoPremio;
		this.tercerPremio = tercerPremio;
	}
	
		
	// Getters y Setters

	public double getPrimerPremio() {
		return primerPremio;
	}

	public void setPrimerPremio(double primerPremio) {
		this.primerPremio = primerPremio;
	}

	public double getSegundoPremio() {
		return segundoPremio;
	}

	public void setSegundoPremio(double segundoPremio) {
		this.segundoPremio = segundoPremio;
	}

	public double getTercerPremio() {
		return tercerPremio;
	}

	public void setTercerPremio(double tercerPremio) {
		this.tercerPremio = tercerPremio;
	}

	public Decimo getMiDecimo() {
		return miDecimo;
	}

	public void setMiDecimo(Decimo miDecimo) {
		this.miDecimo = miDecimo;
	}
	
	
	// M�todos
	
	
	public int sortear() {
		int premiado = 0;
		premiado = (int)Math.floor(Math.random()*(miDecimo.getMaximo() - miDecimo.getMinimo() + 1)
				+ miDecimo.getMinimo());
		if (miDecimo.getMaximo() > 9999) {
			System.out.println("\nDecenas de millar ............. el "+(premiado/10000)%10+"!");
		}
		if (miDecimo.getMaximo() > 999) {
			System.out.println("\nUnidades de millar ............ el "+(premiado/1000)%10+"!");
		}
		if (miDecimo.getMaximo() > 99) {
			System.out.println("\nCentenas ...................... el "+(premiado/100)%10+"!");
		}
		if (miDecimo.getMaximo() > 9) {
			System.out.println("\nDecenas ....................... el "+(premiado/10)%10+"!");
		}
		System.out.println("\nUnidades ...................... el "+premiado%10+"!");
		
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
