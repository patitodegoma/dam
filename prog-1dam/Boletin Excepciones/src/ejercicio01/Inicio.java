package ejercicio01;

/*
Crear una clase Persona donde haya un m�todo LeerDatosPersonales. Se leer�n
dentro del m�todo el nombre, apellidos, edad y DNI. En el mismo, se debe a�adir el
c�digo necesario para que se muestren los nombres de los m�todos llamados hasta el
m�todo que ha producido la excepci�n (printStrackTrace). Hacer la llamada en el main
*/

public class Inicio {

	public static void main(String[] args) {
		Persona miPersona = new Persona ();
		miPersona.LeerDatosPersonales();
		System.out.println(miPersona);

	}

}
