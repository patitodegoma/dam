package ejercicio_09;

public class Alumno {
	
	// Atributos
	
	private String nombre;
	private String apellidos;
	private int nasignaturas;
	private int nsuspensos;
	private double media;
	private String nomAsignaturas[];
	private double notas[];
	
	// Constructores
	
	public Alumno (String nombre, String apellidos, int nasignaturas, int nsuspensos, double media) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nasignaturas = nasignaturas;
		this.nsuspensos = nsuspensos;
		this.media = media;
		this.nomAsignaturas = new String[] {"Lenguajes", "Programación", "Bases de Datos", "Entornos", "Sistemas", "FOL", "Religión"};
		this.notas = new double[7];
	}
	
	public Alumno (String nomAsignaturas[]) {
		this.nomAsignaturas = new String[7]; 
	}
	
	public Alumno () {
		this.nombre = "";
		this.apellidos = "";
		this.nasignaturas = 0;
		this.nsuspensos = 0;
		this.media = 0.0;
		this.nomAsignaturas = new String[] {"Lenguajes", "Programación", "Bases de Datos", "Entornos", "Sistemas", "FOL", "Religión"};
		this.notas = new double [] {0, 0, 0, 0, 0, 0, 0};
	}
	
	// Getters and setters
	

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

	public int getNasignaturas() {
		return nasignaturas;
	}

	public void setNasignaturas(int nasignaturas) {
		this.nasignaturas = nasignaturas;
	}

	public int getNsuspensos() {
		return nsuspensos;
	}

	public void setNsuspensos(int nsuspensos) {
		this.nsuspensos = nsuspensos;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	// Métodos
	
	public boolean ponernotas () {
		boolean ok = true;
		for (int i = 0; i < nomAsignaturas.length; i++) {
			System.out.print("\nIntroduzca la nota de "+nomAsignaturas[i]+": ");
			notas[i] = Leer.datoInt();	
		}
		return ok;
	}
	
	public void mostrarnotas () {
		for (int i = 0; i < nomAsignaturas.length; i++) {
			System.out.println("La nota de "+nomAsignaturas[i]+" es "+notas[i]+".");
		}
	}
	
	public boolean modificarnotas () {
		int opcion = 0;
		System.out.print("\n¿Qué nota desea modificar?:\n");
		for (int i = 0; i < nomAsignaturas.length; i++) {
			System.out.print((i+1)+".- "+nomAsignaturas[i]+"\n");
		}
		opcion = Leer.datoInt();
		System.out.print("\nLa nota actual de "+nomAsignaturas[opcion-1]+" es "+notas[opcion-1]+" Introduzca"
				+ " la nueva nota: ");
		notas[opcion-1] = Leer.datoDouble();
		return true;
	}
	
	public double calculamedia () {
		media = 0;
		for (int i = 0; i < nomAsignaturas.length; i++) {
			media += notas[i];
		}
		media = media / nomAsignaturas.length;
		return media;
	}
	
	public int cuentasuspensos () {
		for (int i = 0; i < nomAsignaturas.length; i++) {
			if (notas[i] < 5) {
				nsuspensos++;
			}
		}
		return nsuspensos;
	}
	
	
	
	

}
