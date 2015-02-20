package trabajoAPI;

import java.util.HashSet;

public class Liga {
	
	private HashSet <Equipo> listaEquipos;
	
	public Liga () {
		this.listaEquipos = new HashSet <Equipo> ();
	}

	public void insertarEquipo (Equipo miEquipo) {
		listaEquipos.add(miEquipo);
	}
	
	public boolean comprobarPosicion (int posicion) {
		boolean comprobado = true;
		if (posicion > listaEquipos.size()) {	
			comprobado = false;
			System.out.println("\nEl equipo no existe en la agenda.");
		}
		return comprobado;
	}
	
	public Equipo mostrarEquipo (int posicion) {	
		Equipo miNota = new Equipo();
		if (comprobarPosicion(posicion)) {		
			miNota = listaEquipos.get(posicion - 1);
		}
		return miNota;
	}
	
	public boolean borrarNota (int posicion) {
		boolean realizado = true;
		if (comprobarPosicion(posicion))
			listaEquipos.remove(posicion - 1);
		return realizado;
	}
	
	public int mostrarTamano () {
		int tamano = listaEquipos.size();
		return tamano;
	}
	
	public void mostrarTodas () {
		for (int i = 0; i < listaEquipos.size(); i++) {
			System.out.println(listaEquipos.get(i));
		}
	}

	@Override
	public String toString() {
		return "Agenda [listadonotas=" + listaEquipos + "]";
	}
}
