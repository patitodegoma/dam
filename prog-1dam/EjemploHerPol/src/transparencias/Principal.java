package transparencias;

public class Principal {

	public static void main(String[] args) {

		Persona miPersona = new Persona ("48816676G", "Andrés", "Kansas City");
		Deposito miDeposito = new Deposito (miPersona, 2000, 2, 300);
		DepositoEstructurado miEstructurado = new DepositoEstructurado (miPersona, 5000, 2, 450, 3, 500);
		
	
		
	}

}
