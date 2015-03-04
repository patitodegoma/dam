package examenUD5;

import java.util.Comparator;

public class OrdenarPalabrasDescendente implements Comparator <Palabra> {

	@Override
	public int compare(Palabra pal1, Palabra pal2) {
		if (pal1.getPalIngles().equals(pal2.getPalIngles()))
			return pal1.getSigEspanol().length() - pal2.getSigEspanol().length();
		else
			return pal1.getPalIngles().length() - pal2.getPalIngles().length();
	}

}
