package examenUD5;

import java.util.Comparator;

public class OrdenarPalabrasDescendente implements Comparator <Palabra> {

	@Override
	public int compare(Palabra pal1, Palabra pal2) {
		if (pal1.getPalIngles().equals(pal2.getPalIngles()))
			return pal2.getSigEspanol().compareToIgnoreCase(pal1.getSigEspanol());
		else
			return pal2.getPalIngles().compareToIgnoreCase(pal1.getPalIngles());
	}

}
