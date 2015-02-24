/*

			ANDR�S MAC�AS JIM�NEZ
			
			Interfaz collection y clase HashMap (Ejemplo)

*/


package trabajoAPI;

import java.util.HashMap;
import java.util.Iterator;


import utiles.Leer;

public class Inicio {
	
	/*
	 La interfaz collection es la ra�z de todas las interfaces y clases relacionadas con colecciones de elementos. En
	 Java una colecci�n es un conjunto din�mico de objetos, llamados elementos. As�, la interfaz collection es la que se encarga 
	 de manipular estas colecciones, a�adiendo elementos, borr�ndolos, edit�ndolos, ...
	 
	 La principal diferencia entre una colecci�n y un array es que su tama�o es din�mico, o sea, que podemos trabajar con un 
	 conjunto de elementos cuyo tama�o no ser� siempre el mismo. Aparte, los objetos incluidos en una colecci�n no tienen por
	 qu� ser todos del mismo tipo.
	 
	 Como algunas veces nos interesar� que los elementos puedan estar duplicados y otras no, algunas veces nos har� falta que
	 los elementos est�n ordenados y otras veces no, etc..., la interfaz collection ser� implementada por una clase u otra, seg�n
	 las caracter�sticas que necesitemos en nuestro programa para los elementos de la misma.
	 
	 As�, la interfaz collection es implementada b�sicamente por los llamados conjuntos (sets) y las listas (lists). Ambas son
	 interfaces a su vez, cada una con sus caracter�sticas propias.
	 
	  * Un List (lista) es una interfaz utilizada para definir m�todos que trabajar�n con colecciones ordenadas y que permitan 
	 elementos repetidos. Las clases m�s importantes que implementan una List son ArrayList y LinkedList.
	 	
	 		- Un ArrayList se basa en �ndices, trabaja como un array de objetos, coloc�ndolos desde la posici�n 0 hasta la infinito,
	 		seg�n vayamos incluy�ndolos en ella. Sus constructores m�s importantes son ArrayList (), que construye un ArrayList sin
	 		tama�o fijo, que permite la inserci�n de todos los objetos que queramos, y el ArrayList (int numE), que le da un tama�o
	 		de numE objetos al array creado.
	 		
	 		- Un LinkedList almacena los elementos en una lista vinculada y permiten un acceso a ella de manera secuencial, pero su 
	 		uso no es tan eficiente como los arrays.
	 		
	  * Un Set (conjunto) sirve para acceder a una colecci�n que no tenga elementos repetidos. Adem�s, en este tipo de colecciones, 
	 el orden no es relevante. Las dos implementaciones m�s importantes son HashSet y TreeSet.
	 
	 		- El HashSet, que adapta el tama�o de la colecci�n din�micamente a lo requerido, pero no respeta el orden de inserci�n de
	 		los elementos. Se basa para su trabajo interno en la llamada tabla hash.
	 		
	 		- el TreeSet, parecido, pero basado en el llamado TreeMap.
	 		
	 Los m�todos m�s importantes de la interfaz collection son:
	 
	 - add (a�ade un elemento a la colecci�n)
	 - clear (borra todo el contenido de la colecci�n)
	 - isEmpty (comprueba si la colecci�n est� vac�a)
	 - iterator (sirve para realizar una operaci�n sobre todos los elementos de la colecci�n)
	 - remove (elimina un elemento de la colecci�n)
	 - size (devuelve el tama�o de la colecci�n)
	 
	 
	 		
	 Relacionados con las colecciones, est�n los Maps. Un Map es una estructura de datos agrupados en parejas clave-valor, y se
	 asemejan a una tabla de dos columnas. La clave es �nica, y se utiliza para acceder al valor al que referencian. 
	 
	 Aunque los Maps no derivan de collection, puede verse un Map como una colecci�n de claves, de valores, o de parejas clave-valor.
	 
	 Las implementaciones m�s importantes de los Maps son HashMap, HashTable (h) y TreeMap. Para este documento, hablaremos de
	 HashMap, a la que dedicaremos un ejemplo.
	 
	 		- La clase HashMap mapea claves con valores, pero no permite claves duplicadas porque se solapar�a el valor. Tanto la
	 		clave como el valor pueden ser cualquier tipo de objeto, y ambos pueden tener el valor null. No se garantiza el orden de
	 		los elementos, ni que estos puedan cambiar de orden. Esta clase posee internamente (de la clase AbstractMap) los m�todos
	 		equals, hashCode y toString.
	 		
	 		Los m�todos m�s importantes de la clase HashMap son los siguientes:
	 		
	 		** clear () - borra todo el mapeo almacenado
	 		** clone () - clona la estructura (instancia) del mapa
	 		** containsKey (clave) - devuelve un booleano que indica si en el mapa hay un valor asociado a la clave indicada
	 		** containsValue (valor) - igual que la anterior, pero con valores. Devuelve verdadero si hay una clave que se 
	 		   asocie al valor suministrado
	 		** get (clave) - devuelve la tupla clave-valor que corresponda a la clave indicada, o null si �sta no se encuentra
	 		** isEmpty () - comprueba si el mapa no tiene asociaciones
	 		** keySet () - devuelve un conjunto (Set) formado por las claves del mapa. A esta devoluci�n se le pueden aplicar
	 		   m�todos de un Set, como los iteradores.
	 		** put (clave, valor) - Asocia la clave indicada con el valor suministrado
	 		** remove (clave) - borra la tupla clave-valor que corresponda a la clave indicada.
	 		** size () - devuelve el tama�o del mapa, es decir, el n�mero de asociaciones.
	 		** values () - devuelve un objeto de tipo collection con los valores del mapa.
	 		
	 */
	
	
	/*
	 
	  ------------------------------------------- EJEMPLO USO HASHMAP --------------------------------------
	  
	  Vamos a realizar un peque�o ejemplo inventado, en el que utilizaremos un HashMap para almacenar los datos de un peque�o
	  programa para Correos que registre el cartero o persona responsable de un determinado c�digo postal.
	  
	  Vemos que cumple con los requisitos para utilizar un HashMap ya que no habr� valores duplicados (vamos a suponer que un
	  c�digo postal solo puede ser asignado a una persona) y el orden en este caso es irrelevante, da igual que aparezca
	  primero el c�digo postal 41007 o el 41909 ya que lo que nos importa es la persona responsable.
	  
	  Est�n todos los m�todos en este archivo porque son sencillos y para simplificar la lectura, pero lo suyo ser�a crear
	  otra clase, definir objetos, ...
	  
	  ------------------------------------------------------------------------------------------------------  
	 
	 */

	public static void main(String[] args){

		// Definimos un HashMap llamado listaResponsables, en el que cada "l�nea" constar� de un c�digo postal (int), y
		// de su persona responsable (String). Mediante el constructor HashMap<Integer, String>() lo construimos sin un 
		// tama�o fijo, para poder guardar todos los c�digos que queramos.
	    HashMap<Integer,String> listaResponsables = new HashMap<Integer,String>();
	    
	    int opcionElegida = 0;
	    int codPostal;
	    String persona;
	    
	    System.out.println("\t*** Bienvenido a mi programa ***\n");
	    System.out.println("Almacena las personas responsables del correo de cada c�digo postal.\n");

	    while (opcionElegida != 5){
	        System.out.println("\nPor favor, introduzca la opci�n que prefiera:");
	        System.out.println("1.- Introducir responsable");
	        System.out.println("2.- Modificar responsable");
	        System.out.println("3.- Mostrar todos los responsables");
	        System.out.println("4.- Eliminar responsable");
	        System.out.println("5.- Salir");
	        
	        System.out.print("Opci�n: ");
	        opcionElegida = Leer.datoInt();

	        switch (opcionElegida){
	            case 1:
	                System.out.print("\nPor favor, introduzca el c�dido postal: ");
	                codPostal = Leer.datoInt();
	                System.out.print("\nPor favor, introduzca el nombre del responsable: ");
	                persona = Leer.dato();
	                guardarResponsable(codPostal, persona, listaResponsables);
	                break;
	            case 2:
	                System.out.print("\nPor favor, introduzca el c�dido postal cuyo responsable desee modificar: ");
	                codPostal = Leer.datoInt();
	                modificaResponsable(codPostal, listaResponsables);
	                break;
	            case 3:
	                mostrarResponsables(listaResponsables);
	                break;
	            case 4:
	                System.out.print("\nPor favor, introduzca el c�dido postal cuyo responsable desee eliminar: ");
	                codPostal = Leer.datoInt();
	                eliminarResponsable(codPostal, listaResponsables);
	                break;
	            case 5:
	                break;   // Si la opcion es 5 no se hace nada 
	            default:
	                System.out.println("\nOpci�n incorrecta!!!");
	        }

	    }
	    
	    System.out.println("\n���Gracias por utilizar mi programa!!!");
	}
	
	
	/*
	El m�todo guardarResponsable sirve para guardar un nuevo responsable. Para ello utiliza el m�todo put, que asocia la clave "codigo"
	con el valor "nombre" en el mapa "listado".
	
	Previamente comprueba si la clave ya existe en el mapa, para evitar solapamientos, usando para ello el m�todo containsKey
	*/
	public static void guardarResponsable(int codigo, String nombre, HashMap <Integer,String> listado){
	    if (listado.containsKey(codigo)){
	        System.out.println("\nNo se puede introducir el responsable. Ya existe un responsable para el c�digo postal indicado.");
	    }
	    else{
	        listado.put(codigo, nombre);               
	    }
	}
	
	/*
	Para modificar el responsable, primero hay que buscar la l�nea en el mapa, por medio de la clave. Para ello se usa el m�todo
	containsKey, para ver si el c�digo suministrado existe ya en el mapa. Si es as�, por medio del m�todo put se le asocia un
	nuevo valor.
	*/
	
	public static void modificaResponsable(int codigo, HashMap<Integer,String> listado){
	   
	    if (listado.containsKey(codigo)){
	        System.out.print("\nPor favor, introduzca el nuevo nombre del responsable: ");
	        listado.put(codigo, Leer.dato());            
	    }
	    else{
	        System.out.println("\nError, el c�digo postal indicado no tiene responsable asignado.");
	    }
	}
	
	/*
	Para mostrar la lista de responsables asignados es necesario recorrer el HashMap, y como no hay claves o �ndices como en los arrays o
	en los ArrayList, es necesario usar un iterador (Iterator), que llamamos "codigos", para recorrer la lista de claves. 
	Un Iterator es b�sicamente una interfaz, que consta de tres m�todos:
		- hasNext(), que comprueba si el mapa en este caso tiene m�s elementos
		- next(), que devuelve el siguiente elemento del mapa
		- remove(), que devuelve el �ltimo elemento recorrido por el iterador
	
	Una vez que el iterador lee una clave del mapa, con el m�todo get conseguimos el responsable referenciado.
	*/
	
	public static void mostrarResponsables(HashMap<Integer, String> listaResponsables){
	    int clave;
	    Iterator<Integer> codigos = listaResponsables.keySet().iterator();
	    System.out.println("\nLos c�digos postales con responsable asignado son:");
	    while(codigos.hasNext()){
	        clave = codigos.next();
	        System.out.println(clave + " - " + listaResponsables.get(clave));
	    }        
	}

	/*
	Por �ltimo, para eliminar un responsable, tambi�n necesitamos primero comprobar que la clave existe en el mapa del listado
	de productos. Para ello usamos de nuevo el m�todo containsKey. Una vez comprobado que existe, con el m�todo remove 
	eliminamos la clave y el valor del mapa.
	*/
	
	public static void eliminarResponsable(int codigo, HashMap<Integer,String> listaResponsables){
        if (listaResponsables.containsKey(codigo)){
            listaResponsables.remove(codigo);
        }
        else{
            System.out.println("\nError, el c�digo postal indicado no se encuentra en el listado.");  
        }       
    } 
		
		
}
