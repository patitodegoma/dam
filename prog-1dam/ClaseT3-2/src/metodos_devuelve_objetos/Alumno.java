package metodos_devuelve_objetos;

public class Alumno {
	private String nombre, apellidos;
	private Asignatura asignaturas[];    // Array de objetos Asignatura
	
	public Alumno (String nombre, String apellidos, Asignatura[] asignaturas) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignaturas = asignaturas;
	}
	
	public Alumno () {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public int comprobarSuspensos (Asignatura asignaturas[]) {
		int contadorSuspensos = 0;
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i].getNota() < 5) {
				contadorSuspensos++;
			}
		}
		return contadorSuspensos;
	}
	
	public double calcularMedia (Asignatura asignaturas[]) {
		double media = 0.0;
		for (int i = 0; i < asignaturas.length; i++) {
			media += asignaturas[i].getNota();
		}
		media /= asignaturas.length;
		return media;
	}
}
