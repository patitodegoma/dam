package ejercicio07;

public class CuentaEmpresa extends Cuenta {

	public CuentaEmpresa(String ccc, double saldo, double mantenimiento) {
		super(ccc, saldo, mantenimiento);
	}

	@Override
	public void ingresar(double cantidad) {
		super.setSaldo(super.getSaldo() + cantidad - 1);
		System.out.println("\nOperación realizada satisfactoriamente.");
	}

	@Override
	public void reintegrar(double cantidad) {
		if (cantidad >= super.getSaldo()) {
			System.out.println("\nLa operación no pudo realizarse por falta de fondos suficientes en cuenta.");
		} else {
			super.setSaldo(super.getSaldo() - cantidad);
			System.out.println("\nOperación realizada satisfactoriamente.");
		}
	}
	
	
	
	

}
