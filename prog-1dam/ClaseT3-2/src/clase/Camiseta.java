package clase;

public class Camiseta {
	
	
	// ATRIBUTOS
	
		// Los atributos no se inicializan directamente, es solo por el ejemplo, para no leer.
	
	private int id = 2;
	private String descripcion = "casual";
	private int codigoColor = 23;
	
	
	public void mostrarInformacion () {
		System.out.println("El ID del producto es "+this.id);
		System.out.println("Descripci�n de la camiseta: "+this.descripcion);
		System.out.println("C�digo de color: "+this.codigoColor);
	}
	
		// Como estoy dentro de la clase, puedo utilizar los atributos directamente, sin necesidad de get y set,
	    // como convenci�n del curso lo usamos con this.atributo. 
		
		// En las llamadas a m�todos de la misma clase, usamos tambi�n el this. Ej: this.mostrarInformacion();
	
	// Buscar ejemplos de metodos que se les pase objetos directamente, o que devuelvan objetos. Por ejemplo
	// public double calculararea (Triangulo t1)
	// public Triangulo modificarDatos();
	
	

}
