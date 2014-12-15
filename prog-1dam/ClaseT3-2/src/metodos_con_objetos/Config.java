package metodos_con_objetos;

public class Config {
	
	public Movil cambiarContrasena() {
		Movil miMovil = new Movil();
		String nContrasena = "Contraseña nueva";
		miMovil.setContrasena(nContrasena);
		return miMovil;
	}

}
