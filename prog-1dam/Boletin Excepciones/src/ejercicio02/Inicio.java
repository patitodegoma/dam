package ejercicio02;

/*
Añadir al ejercicio anterior, el código necesario para que se muestre al usuario un
mensaje de error y se le vuelvan a pedir los datos.
*/

public class Inicio {

	public static void main(String[] args) {
		Persona miPersona = new Persona ();
		miPersona.LeerDatosPersonales();
		System.out.println(miPersona);

	}

}
