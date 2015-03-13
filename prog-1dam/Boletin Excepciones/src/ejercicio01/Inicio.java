package ejercicio01;

/*
Crear una clase Persona donde haya un método LeerDatosPersonales. Se leerán
dentro del método el nombre, apellidos, edad y DNI. En el mismo, se debe añadir el
código necesario para que se muestren los nombres de los métodos llamados hasta el
método que ha producido la excepción (printStrackTrace). Hacer la llamada en el main
*/

public class Inicio {

	public static void main(String[] args) {
		Persona miPersona = new Persona ();
		miPersona.LeerDatosPersonales();
		System.out.println(miPersona);

	}

}
