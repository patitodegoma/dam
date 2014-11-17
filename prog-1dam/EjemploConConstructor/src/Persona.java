
public class Persona {
	
	// Atributos
	
	String nombre;
	int edad;
	
	/* Constructor - Crea un nuevo objeto, inicializando sus atributos. 
	 (hay 3 maneras de ponerlo, comento la v2 y la v3 para que no d� errores)
	 */
	
	// v1
	public Persona(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	}
/*	
	// v2
	public Persona(String nom, int ed) {
		nombre = nom;
		edad = ed;
	}
	
	// v3
	public Persona(String nom, int ed) {
		this.nombre = nom;
		this.edad = ed;
	}
*/

	
	
	
	// Getters y Setters - Acceder y modificar a los datos de los objetos. Hace falta un get y un set para
	// cada atributo
	
	    // Los getters siempre devuelven algo.
	
		public String getNombre() {
			return nombre;
		}
	
		public int getEdad () {
			return edad;
		}
	
		// Los setters sirven para modificar
		
		public void setNombre (String nombre) {
			this.nombre = nombre;
		}
		
		public void setEdad (int edad) {
			this.edad = edad;
		}
	
	
	// M�todo para imprimir
	
	public void imprimirDatos () {
		System.out.println("\nEl nombre introducido es "+nombre+" y la edad es "+edad+" a�os.");
	}
	
	
	
	
}
