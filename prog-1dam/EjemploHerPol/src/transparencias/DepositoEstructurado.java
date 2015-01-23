package transparencias;

public class DepositoEstructurado extends Deposito {
	
	private double tipoInteresVariable;
	private double capitalVariable;
	
	public DepositoEstructurado (Persona titular, double capital, int plazoDias, double tipoInteres, 
			double tipoInteresVariable, double capitalVariable) {
		super (titular, capital, plazoDias, tipoInteres);
		this.tipoInteresVariable = tipoInteresVariable;
		this.capitalVariable = capitalVariable;
	}
	
	
	public double getTipoInteresVariable() {
		return tipoInteresVariable;
	}

	public void setTipoInteresVariable(double tipoInteresVariable) {
		this.tipoInteresVariable = tipoInteresVariable;
	}

	public double getCapitalVariable() {
		return capitalVariable;
	}

	public void setCapitalVariable(double capitalVariable) {
		this.capitalVariable = capitalVariable;
	}

	public double getInteresesVariable () {
		return getPlazoDias () * tipoInteresVariable * capitalVariable / 365;
	}
	
	@Override
	public double getCapital () {
		return super.getCapital() + getCapitalVariable ();
	}
	
	@Override
	public double getIntereses () {
		return super.getIntereses() + getInteresesVariable ();
	}

}
