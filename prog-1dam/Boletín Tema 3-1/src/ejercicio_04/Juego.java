package ejercicio_04;

public class Juego {
	
	private Jugador jugador1;
	private Jugador jugador2;
	
	public Juego (Jugador jugador1, Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}
	
	public Juego () {
		this.jugador1 = new Jugador ("", false);
		this.jugador2 = new Jugador ("", true);
	}
	
	
	public boolean lanzarmoneda() {
		boolean esCara = false;
		double res = Math.random();
		if (res > 0.5) {
			esCara=true;
		}
		return esCara;
	}
	
	public String asignarvalor(char opcion) {
		String mensaje = "";
		while (opcion != 'c' && opcion != 'C' && opcion != 'x' && opcion != 'X' && opcion != 'n' && opcion != 'N') {
			System.out.print("\nPor favor, pulsa una tecla válida, 'c' para cara, 'x' para cruz, o 'n' para que yo escoja.");
			opcion = Leer.datoChar();
		}
		if (opcion == 'c' || opcion == 'C') {
			jugador1.setEscogeCara(false);
			jugador2.setEscogeCara(true);
			mensaje = "\nBueno, pues para mí la cruz.";
		} else if (opcion == 'x' || opcion == 'X') {
			jugador1.setEscogeCara(true);
			jugador2.setEscogeCara(false);
			mensaje = "\nVale, tú coges cruz, pues yo cara.";
		} else {
			jugador1.setEscogeCara(true);
			jugador2.setEscogeCara(false);
			mensaje = "\nOK, me quedo con la cara.";
		}
		return mensaje;
	}
	
	public boolean mostrarganador(boolean esCara) {
		boolean heGanado = false;
		if ((esCara && jugador1.getEscogeCara()) || (!esCara && !jugador1.getEscogeCara())) {
			heGanado = true;
		}		
		return heGanado;
	}

}
