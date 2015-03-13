package examenUD5;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Iterator;
import java.util.List;

public class Diccionario {
	
	private List<Palabra> listadoPalabras;
	
	public Diccionario () {
		this.listadoPalabras = new ArrayList <Palabra> ();
	}
	
	public void agregarPalabra () {
		String ingles, espanol;
		Palabra nuevaPal;
		System.out.print("\nPor favor, introduzca la palabra en inglés: ");
		ingles = Leer.dato();
		System.out.println("\nAhora por favor, introduzca el significado en español: ");
		espanol = Leer.dato();
		nuevaPal = new Palabra (ingles, espanol);
		this.listadoPalabras.add(nuevaPal);
		System.out.println("\nPalabra introducida correctamente.");
	}
	
	public Palabra buscarPalabra (String palABuscar) {
		Palabra palEncontrada = new Palabra();
		boolean encontrado = false;
		for (Palabra palActual : this.listadoPalabras) {
			if (palActual.getPalIngles().equals(palABuscar)) {
				palEncontrada = palActual;
				encontrado = true;	
			}
		}
		return encontrado ? palEncontrada : null;
	}
	
	public void modificarPalabra () {
		String palIntroducida;
		Palabra palAModificar;
		System.out.print("\nPor favor, introduzca la palabra a modificar: ");
		palIntroducida = Leer.dato();
		palAModificar = this.buscarPalabra(palIntroducida);
		System.out.println(palAModificar);
		if (palAModificar == null) {
			System.out.println("\nLa palabra no se encuentra en el diccionario.");
		} else {
			System.out.print("\nPor favor, introduzca el nuevo significado para la palabra " + palIntroducida + ": ");
			palAModificar.setSigEspanol(Leer.dato());
			System.out.println("\nSignificado modificado correctamente.");
		}
			
	}
	
	public void borrarDiccionario () {
		char respuesta;
		System.out.print("\n¿Está seguro de que desea borrar todas las palabras? (S/N): ");
		respuesta = Leer.datoChar();
		if (respuesta == 's' || respuesta == 'S') {
			this.listadoPalabras.removeAll(listadoPalabras);
			System.out.println("\nTodas las palabras fueron borradas correctamente.");
		} else {
			System.out.println("\nNo se borró ninguna palabra.");
		}
	}
	
	public void borrarPalabra () {
		String palIntroducida;
		char respuesta = 'n';
		Palabra palABorrar;
		System.out.print("\nPor favor, introduzca la palabra a borrar: ");
		palIntroducida = Leer.dato();
		palABorrar = this.buscarPalabra(palIntroducida);
		if (palABorrar == null) {
			System.out.println("\nNo se encontró la palabra buscada.");
		} else {
			System.out.print("\n¿Está seguro de que desea borrar la palabra " + palIntroducida + " del diccionario? (S/N): ");
			respuesta = Leer.datoChar();
			if (respuesta == 's' || respuesta == 'S') {
				this.listadoPalabras.remove(palABorrar);
				System.out.println("\nLa palabra " + palIntroducida + " se borró correctamente del diccionario.");
			} else {
				System.out.println("\nLa palabra " + palIntroducida + " no se borró del diccionario.");
			}
			
		}
		
	}
	
	public void imprimirTodo () {
		if (this.listadoPalabras.isEmpty()) {
			System.out.println("\nNo se encuentran palabras en el diccionario.");
		} else {
			System.out.println("\nImprimiendo las " + this.listadoPalabras.size() + " palabras del diccionario...");
			Iterator<Palabra> recorredor = this.listadoPalabras.iterator();
			while (recorredor.hasNext()) {
				System.out.println(recorredor.next());
			}
			System.out.println("\nListado completo.");
		}	
	}
	
	public void buscarSignificado () {
		String palIntroducida;
		Palabra palABuscar;
		System.out.print("\nPor favor, introduzca la palabra cuyo significado desee obtener: ");
		palIntroducida = Leer.dato();
		palABuscar = this.buscarPalabra(palIntroducida);
		if (palABuscar == null) {
			System.out.println("\nNo se encontró la palabra introducida.");
		} else {
			System.out.println("\nEl significado de la palabra " + palIntroducida + " es: " + palABuscar.getSigEspanol() + ".");
		}
		
	}
	
	public void agregarDatosPrueba () {
		
		this.listadoPalabras.add(new Palabra ("laptop", "ordenador portátil"));
		this.listadoPalabras.add(new Palabra ("soccer", "fútbol"));
		this.listadoPalabras.add(new Palabra ("orange", "naranja"));
		this.listadoPalabras.add(new Palabra ("planet", "planeta"));
		this.listadoPalabras.add(new Palabra ("mouse", "ratón"));
		
		System.out.println("\nDatos de prueba cargados correctamente.");
	}
	
	
	public void ordenarTodo () {
		Collections.sort(this.listadoPalabras, new OrdenarPalabrasDescendente());
		imprimirTodo();
	}

}
