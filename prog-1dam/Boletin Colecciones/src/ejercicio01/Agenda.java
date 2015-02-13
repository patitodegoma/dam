package ejercicio01;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList <Nota> listadonotas;
	
	public Agenda () {
		this.listadonotas = new ArrayList <Nota> ();
	}

	public void insertarNota (Nota miNota) {
		listadonotas.add(miNota);
	}
	
	public Nota mostrarNota (int posicion) {
		Nota miNota = new Nota();
		miNota = listadonotas.get(posicion);
		return miNota;
	}
	
	public void borrarNota (int posicion) {
		listadonotas.remove(posicion - 1);
	}

	@Override
	public String toString() {
		return "Agenda [listadonotas=" + listadonotas + "]";
	}
	
	
	
	

}
