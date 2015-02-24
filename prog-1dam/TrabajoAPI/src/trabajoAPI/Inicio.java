/*

			ANDRÉS MACÍAS JIMÉNEZ
			
			Interfaz collection y clase HashMap (Ejemplo)

*/


package trabajoAPI;

import java.util.HashMap;
import java.util.Iterator;


import utiles.Leer;

public class Inicio {
	
	/*
	 La interfaz collection es la raíz de todas las interfaces y clases relacionadas con colecciones de elementos. En
	 Java una colección es un conjunto dinámico de objetos, llamados elementos. Así, la interfaz collection es la que se encarga 
	 de manipular estas colecciones, añadiendo elementos, borrándolos, editándolos, ...
	 
	 La principal diferencia entre una colección y un array es que su tamaño es dinámico, o sea, que podemos trabajar con un 
	 conjunto de elementos cuyo tamaño no será siempre el mismo. Aparte, los objetos incluidos en una colección no tienen por
	 qué ser todos del mismo tipo.
	 
	 Como algunas veces nos interesará que los elementos puedan estar duplicados y otras no, algunas veces nos hará falta que
	 los elementos estén ordenados y otras veces no, etc..., la interfaz collection será implementada por una clase u otra, según
	 las características que necesitemos en nuestro programa para los elementos de la misma.
	 
	 Así, la interfaz collection es implementada básicamente por los llamados conjuntos (sets) y las listas (lists). Ambas son
	 interfaces a su vez, cada una con sus características propias.
	 
	  * Un List (lista) es una interfaz utilizada para definir métodos que trabajarán con colecciones ordenadas y que permitan 
	 elementos repetidos. Las clases más importantes que implementan una List son ArrayList y LinkedList.
	 	
	 		- Un ArrayList se basa en índices, trabaja como un array de objetos, colocándolos desde la posición 0 hasta la infinito,
	 		según vayamos incluyéndolos en ella. Sus constructores más importantes son ArrayList (), que construye un ArrayList sin
	 		tamaño fijo, que permite la inserción de todos los objetos que queramos, y el ArrayList (int numE), que le da un tamaño
	 		de numE objetos al array creado.
	 		
	 		- Un LinkedList almacena los elementos en una lista vinculada y permiten un acceso a ella de manera secuencial, pero su 
	 		uso no es tan eficiente como los arrays.
	 		
	  * Un Set (conjunto) sirve para acceder a una colección que no tenga elementos repetidos. Además, en este tipo de colecciones, 
	 el orden no es relevante. Las dos implementaciones más importantes son HashSet y TreeSet.
	 
	 		- El HashSet, que adapta el tamaño de la colección dinámicamente a lo requerido, pero no respeta el orden de inserción de
	 		los elementos. Se basa para su trabajo interno en la llamada tabla hash.
	 		
	 		- el TreeSet, parecido, pero basado en el llamado TreeMap.
	 		
	 Los métodos más importantes de la interfaz collection son:
	 
	 - add (añade un elemento a la colección)
	 - clear (borra todo el contenido de la colección)
	 - isEmpty (comprueba si la colección está vacía)
	 - iterator (sirve para realizar una operación sobre todos los elementos de la colección)
	 - remove (elimina un elemento de la colección)
	 - size (devuelve el tamaño de la colección)
	 
	 
	 		
	 Relacionados con las colecciones, están los Maps. Un Map es una estructura de datos agrupados en parejas clave-valor, y se
	 asemejan a una tabla de dos columnas. La clave es única, y se utiliza para acceder al valor al que referencian. 
	 
	 Aunque los Maps no derivan de collection, puede verse un Map como una colección de claves, de valores, o de parejas clave-valor.
	 
	 Las implementaciones más importantes de los Maps son HashMap, HashTable (h) y TreeMap. Para este documento, hablaremos de
	 HashMap, a la que dedicaremos un ejemplo.
	 
	 		- La clase HashMap mapea claves con valores, pero no permite claves duplicadas porque se solaparía el valor. Tanto la
	 		clave como el valor pueden ser cualquier tipo de objeto, y ambos pueden tener el valor null. No se garantiza el orden de
	 		los elementos, ni que estos puedan cambiar de orden. Esta clase posee internamente (de la clase AbstractMap) los métodos
	 		equals, hashCode y toString.
	 		
	 		Los métodos más importantes de la clase HashMap son los siguientes:
	 		
	 		** clear () - borra todo el mapeo almacenado
	 		** clone () - clona la estructura (instancia) del mapa
	 		** containsKey (clave) - devuelve un booleano que indica si en el mapa hay un valor asociado a la clave indicada
	 		** containsValue (valor) - igual que la anterior, pero con valores. Devuelve verdadero si hay una clave que se 
	 		   asocie al valor suministrado
	 		** get (clave) - devuelve la tupla clave-valor que corresponda a la clave indicada, o null si ésta no se encuentra
	 		** isEmpty () - comprueba si el mapa no tiene asociaciones
	 		** keySet () - devuelve un conjunto (Set) formado por las claves del mapa. A esta devolución se le pueden aplicar
	 		   métodos de un Set, como los iteradores.
	 		** put (clave, valor) - Asocia la clave indicada con el valor suministrado
	 		** remove (clave) - borra la tupla clave-valor que corresponda a la clave indicada.
	 		** size () - devuelve el tamaño del mapa, es decir, el número de asociaciones.
	 		** values () - devuelve un objeto de tipo collection con los valores del mapa.
	 		
	 */
	
	
	/*
	 
	  ------------------------------------------- EJEMPLO USO HASHMAP --------------------------------------
	  
	  Vamos a realizar un pequeño ejemplo inventado, en el que utilizaremos un HashMap para almacenar los datos de un pequeño
	  programa para Correos que registre el cartero o persona responsable de un determinado código postal.
	  
	  Vemos que cumple con los requisitos para utilizar un HashMap ya que no habrá valores duplicados (vamos a suponer que un
	  código postal solo puede ser asignado a una persona) y el orden en este caso es irrelevante, da igual que aparezca
	  primero el código postal 41007 o el 41909 ya que lo que nos importa es la persona responsable.
	  
	  Están todos los métodos en este archivo porque son sencillos y para simplificar la lectura, pero lo suyo sería crear
	  otra clase, definir objetos, ...
	  
	  ------------------------------------------------------------------------------------------------------  
	 
	 */

	public static void main(String[] args){

		// Definimos un HashMap llamado listaResponsables, en el que cada "línea" constará de un código postal (int), y
		// de su persona responsable (String). Mediante el constructor HashMap<Integer, String>() lo construimos sin un 
		// tamaño fijo, para poder guardar todos los códigos que queramos.
	    HashMap<Integer,String> listaResponsables = new HashMap<Integer,String>();
	    
	    int opcionElegida = 0;
	    int codPostal;
	    String persona;
	    
	    System.out.println("\t*** Bienvenido a mi programa ***\n");
	    System.out.println("Almacena las personas responsables del correo de cada código postal.\n");

	    while (opcionElegida != 5){
	        System.out.println("\nPor favor, introduzca la opción que prefiera:");
	        System.out.println("1.- Introducir responsable");
	        System.out.println("2.- Modificar responsable");
	        System.out.println("3.- Mostrar todos los responsables");
	        System.out.println("4.- Eliminar responsable");
	        System.out.println("5.- Salir");
	        
	        System.out.print("Opción: ");
	        opcionElegida = Leer.datoInt();

	        switch (opcionElegida){
	            case 1:
	                System.out.print("\nPor favor, introduzca el códido postal: ");
	                codPostal = Leer.datoInt();
	                System.out.print("\nPor favor, introduzca el nombre del responsable: ");
	                persona = Leer.dato();
	                guardarResponsable(codPostal, persona, listaResponsables);
	                break;
	            case 2:
	                System.out.print("\nPor favor, introduzca el códido postal cuyo responsable desee modificar: ");
	                codPostal = Leer.datoInt();
	                modificaResponsable(codPostal, listaResponsables);
	                break;
	            case 3:
	                mostrarResponsables(listaResponsables);
	                break;
	            case 4:
	                System.out.print("\nPor favor, introduzca el códido postal cuyo responsable desee eliminar: ");
	                codPostal = Leer.datoInt();
	                eliminarResponsable(codPostal, listaResponsables);
	                break;
	            case 5:
	                break;   // Si la opcion es 5 no se hace nada 
	            default:
	                System.out.println("\nOpción incorrecta!!!");
	        }

	    }
	    
	    System.out.println("\n¡¡¡Gracias por utilizar mi programa!!!");
	}
	
	
	/*
	El método guardarResponsable sirve para guardar un nuevo responsable. Para ello utiliza el método put, que asocia la clave "codigo"
	con el valor "nombre" en el mapa "listado".
	
	Previamente comprueba si la clave ya existe en el mapa, para evitar solapamientos, usando para ello el método containsKey
	*/
	public static void guardarResponsable(int codigo, String nombre, HashMap <Integer,String> listado){
	    if (listado.containsKey(codigo)){
	        System.out.println("\nNo se puede introducir el responsable. Ya existe un responsable para el código postal indicado.");
	    }
	    else{
	        listado.put(codigo, nombre);               
	    }
	}
	
	/*
	Para modificar el responsable, primero hay que buscar la línea en el mapa, por medio de la clave. Para ello se usa el método
	containsKey, para ver si el código suministrado existe ya en el mapa. Si es así, por medio del método put se le asocia un
	nuevo valor.
	*/
	
	public static void modificaResponsable(int codigo, HashMap<Integer,String> listado){
	   
	    if (listado.containsKey(codigo)){
	        System.out.print("\nPor favor, introduzca el nuevo nombre del responsable: ");
	        listado.put(codigo, Leer.dato());            
	    }
	    else{
	        System.out.println("\nError, el código postal indicado no tiene responsable asignado.");
	    }
	}
	
	/*
	Para mostrar la lista de responsables asignados es necesario recorrer el HashMap, y como no hay claves o índices como en los arrays o
	en los ArrayList, es necesario usar un iterador (Iterator), que llamamos "codigos", para recorrer la lista de claves. 
	Un Iterator es básicamente una interfaz, que consta de tres métodos:
		- hasNext(), que comprueba si el mapa en este caso tiene más elementos
		- next(), que devuelve el siguiente elemento del mapa
		- remove(), que devuelve el último elemento recorrido por el iterador
	
	Una vez que el iterador lee una clave del mapa, con el método get conseguimos el responsable referenciado.
	*/
	
	public static void mostrarResponsables(HashMap<Integer, String> listaResponsables){
	    int clave;
	    Iterator<Integer> codigos = listaResponsables.keySet().iterator();
	    System.out.println("\nLos códigos postales con responsable asignado son:");
	    while(codigos.hasNext()){
	        clave = codigos.next();
	        System.out.println(clave + " - " + listaResponsables.get(clave));
	    }        
	}

	/*
	Por último, para eliminar un responsable, también necesitamos primero comprobar que la clave existe en el mapa del listado
	de productos. Para ello usamos de nuevo el método containsKey. Una vez comprobado que existe, con el método remove 
	eliminamos la clave y el valor del mapa.
	*/
	
	public static void eliminarResponsable(int codigo, HashMap<Integer,String> listaResponsables){
        if (listaResponsables.containsKey(codigo)){
            listaResponsables.remove(codigo);
        }
        else{
            System.out.println("\nError, el código postal indicado no se encuentra en el listado.");  
        }       
    } 
		
		
}
