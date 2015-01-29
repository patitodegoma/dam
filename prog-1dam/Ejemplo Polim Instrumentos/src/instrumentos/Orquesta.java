package instrumentos;

public class Orquesta {
	
	/* Esta clase est� fuera de la pir�mide de herencia que forman los instrumentos. Pero gracias al polimorfismo
	 * sus m�todos funcionar�n sea cual sea el instrumento que se pida. */
	
	
	/* Este m�todo tocar no dice qu� instrumento necesita exactamente, pero como el m�todo tocar est� reescrito para todos,
	 * en tiempo de ejecuci�n llamar� al m�todo adecuado al instrumento pedido. */
	public void tocar (Instrumento instr) {
		instr.tocar();   // Llamada al m�todo tocar() de la clase correspondiente al instrumento instr.
	}
	
	/* El m�todo tocarTodo lo que quiere es tocar todos los instrumentos de la orquesta, para ello crea un array de objetos
	 * tipo instrumento, y va llamando uno a uno a su m�todo tocar (). */ 
	public void tocarTodo (Instrumento [] instrumentos) {
		for (int i = 0; i < instrumentos.length; i++) {
			tocar(instrumentos[i]);  // Llamada al m�todo tocar (Instrumento) de esta clase Musica
		}
	}

}
