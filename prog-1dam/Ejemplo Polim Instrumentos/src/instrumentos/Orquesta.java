package instrumentos;

public class Orquesta {
	
	/* Esta clase está fuera de la pirámide de herencia que forman los instrumentos. Pero gracias al polimorfismo
	 * sus métodos funcionarán sea cual sea el instrumento que se pida. */
	
	
	/* Este método tocar no dice qué instrumento necesita exactamente, pero como el método tocar está reescrito para todos,
	 * en tiempo de ejecución llamará al método adecuado al instrumento pedido. */
	public void tocar (Instrumento instr) {
		instr.tocar();   // Llamada al método tocar() de la clase correspondiente al instrumento instr.
	}
	
	/* El método tocarTodo lo que quiere es tocar todos los instrumentos de la orquesta, para ello crea un array de objetos
	 * tipo instrumento, y va llamando uno a uno a su método tocar (). */ 
	public void tocarTodo (Instrumento [] instrumentos) {
		for (int i = 0; i < instrumentos.length; i++) {
			tocar(instrumentos[i]);  // Llamada al método tocar (Instrumento) de esta clase Musica
		}
	}

}
