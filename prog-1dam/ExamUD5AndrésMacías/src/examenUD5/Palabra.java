package examenUD5;

public class Palabra {
	
	private String palIngles;
	private String sigEspanol;
	
	public Palabra (String ingles, String espanol) {
		this.palIngles = ingles;
		this.sigEspanol = espanol;
	}
	
	public Palabra() {
		this.palIngles = "";
		this.sigEspanol = "";
	}

	public String getPalIngles() {
		return palIngles;
	}

	public void setPalIngles(String palIngles) {
		this.palIngles = palIngles;
	}

	public String getSigEspanol() {
		return sigEspanol;
	}

	public void setSigEspanol(String palEspanol) {
		this.sigEspanol = palEspanol;
	}

	@Override
	public String toString() {
		return "La palabra " + palIngles + " significa: " + sigEspanol + ".";
	}

	


}
