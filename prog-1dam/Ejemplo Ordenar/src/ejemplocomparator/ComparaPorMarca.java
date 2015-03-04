package ejemplocomparator;

import java.util.Comparator;

public class ComparaPorMarca implements Comparator{

	//comparamos 2 objetos
	public int compare(Object arg0, Object arg1) {
		
	//Hacemos casting Object a Corredor para poder trabajar con ellos
	Corredor corA=(Corredor)arg0;
	Corredor corB=(Corredor)arg1;
	
	//creamos las 2 variables tipo double (marca es double) que vamos a comparar
	double corAA = corA.getMarca();
	double corBB = corB.getMarca();

	//si el 1º es menor que el segundo devuelve -1, si es mayor 1 y si son iguales 0
	if(corAA < corBB)
		return -1;

	else
		if (corAA > corBB)
		return 1;
	return 0;
	}
}