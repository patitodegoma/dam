package ejercicio07;

public class CuentaCorriente extends Cuenta {
	
	private int puntosPorUso;
	private int saldoPuntos;

	public CuentaCorriente(String ccc, double saldo, double mantenimiento, int puntosPorUso, int saldoPuntos) {
		super(ccc, saldo, mantenimiento);
		this.puntosPorUso = puntosPorUso;
		this.saldoPuntos = saldoPuntos;
	}

	public int getPuntosPorUso() {
		return puntosPorUso;
	}

	public void setPuntosPorUso(int puntosPorUso) {
		this.puntosPorUso = puntosPorUso;
	}
	
	public int getSaldoPuntos() {
		return saldoPuntos;
	}

	public void setSaldoPuntos(int saldoPuntos) {
		this.saldoPuntos = saldoPuntos;
	}

	@Override
	public void ingresar(double cantidad) {
		super.setSaldo(super.getSaldo() + cantidad);
		this.saldoPuntos += this.puntosPorUso;
		System.out.println("\nOperación realizada satisfactoriamente.");
	}

	@Override
	public void reintegrar(double cantidad) {
		if (cantidad >= super.getSaldo()) {
			System.out.println("\nLa operación no pudo realizarse por falta de fondos suficientes en cuenta.");
		} else {
			super.setSaldo(super.getSaldo() - cantidad);
			this.saldoPuntos += this.puntosPorUso;
			System.out.println("\nOperación realizada satisfactoriamente.");
		}
	}
	
	public String mostrarPuntos() {
		return "\nEl saldo actual de puntos es de" + this.getSaldoPuntos() +".";
	}
	
	
	
	

}
