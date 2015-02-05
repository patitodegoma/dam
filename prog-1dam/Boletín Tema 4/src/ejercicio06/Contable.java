package ejercicio06;

public class Contable {
	
	private Empleado [] vendedores;
	
	public Contable () {
		this.vendedores = null;
	}
	
	public Contable (Empleado [] vendedores) {
		this.vendedores = vendedores;
	}

	public Empleado[] getVendedores() {
		return vendedores;
	}

	public void setVendedores(Empleado[] vendedores) {
		this.vendedores = vendedores;
	}
	
	public void imprimeNominas () {
		for (int i = 0; i < this.vendedores.length; i++) {
			System.out.println(vendedores[i]);
		}
	}
	

	
	

}
