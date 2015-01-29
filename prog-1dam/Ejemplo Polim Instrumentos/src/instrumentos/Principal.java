package instrumentos;

public class Principal {

	public static void main(String[] args) {
		
		/* Creamos un array de instrumentos */
		
		Instrumento [] conjuntoInstrumentos = new Instrumento [5];
		
		/* Guardamos a jierro un instrumento en cada posición del array */
		
		int i = 0;
		conjuntoInstrumentos [i++] = new Guitarra ();    
		conjuntoInstrumentos [i++] = new Piano ();
		conjuntoInstrumentos [i++] = new Saxofon ();
		conjuntoInstrumentos [i++] = new Guzla ();
		conjuntoInstrumentos [i++] = new Ukelele ();
		
		/* Usamos el método tocarTodo de la clase Orquesta, que dependiendo del Instrumento que coja, hará una u otra cosa
		 * gracias al polimorfismo */
		
		Orquesta miOrquesta = new Orquesta ();
		miOrquesta.tocarTodo(conjuntoInstrumentos);

	}

}
