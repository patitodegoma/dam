package figuras;

public class Figura {
	
	private String nombre;
	private String color;
	
	public Figura () {
		this.nombre = "";
		this.color = "";
	}
	
	public Figura (String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}
	
	public String getNombre () {
		return this.nombre;
	}
	
	public String getColor () {
		return this.color;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	
	public void dibujar () {
		
	}

	public String toString() {
		return "Esto es una Figura que se llama " + this.nombre + " y es de color " + this.color + ".";
	}
	
	
	
	

}
