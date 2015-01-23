package transparencias;

public class Deposito {
	
	private Persona titular;
	private double capital;
	private int plazoDias;
	private double tipoInteres;
	
	public Deposito (Persona titular, double capital, int plazoDias, double tipoInteres) {
		this.titular = titular;
		this.capital = capital;
		this.plazoDias = plazoDias;
		this.tipoInteres = tipoInteres;
	}
	
	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public int getPlazoDias() {
		return plazoDias;
	}

	public void setPlazoDias(int plazoDias) {
		this.plazoDias = plazoDias;
	}


	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public final double liquidar () {
		return getCapital () + getIntereses ();
	}
	
	public double getIntereses () {
		return plazoDias * tipoInteres * capital / 365;
	}
	
	public double indiceRentabilidad (Deposito deposito) {
		return deposito.getIntereses () / deposito.getCapital();
	}


}
