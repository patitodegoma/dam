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
	
	public boolean comprobarPosicion (int posicion) {
		boolean comprobado = true;
		if (posicion > listadonotas.size()) {	
			comprobado = false;
			System.out.println("\nEl número de nota no existe en la agenda.");
		}
		return comprobado;
	}
	
	public Nota mostrarNota (int posicion) {	
		Nota miNota = new Nota();
		if (comprobarPosicion(posicion)) {		
			miNota = listadonotas.get(posicion - 1);
		}
		return miNota;
	}
	
	public boolean borrarNota (int posicion) {
		boolean realizado = true;
		if (comprobarPosicion(posicion))
			listadonotas.remove(posicion - 1);
		return realizado;
	}
	
	public int mostrarTamano () {
		int tamano = listadonotas.size();
		return tamano;
	}
	
	public void mostrarTodas () {
		for (int i = 0; i < listadonotas.size(); i++) {
			System.out.println(listadonotas.get(i));
		}
	}

	@Override
	public String toString() {
		return "Agenda [listadonotas=" + listadonotas + "]";
	}
}
