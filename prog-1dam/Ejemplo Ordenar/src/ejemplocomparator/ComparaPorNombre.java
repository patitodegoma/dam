package ejemplocomparator;
import java.util.*;

public class ComparaPorNombre implements Comparator{
	
	//comparamos 2 objetos
	public int compare(Object arg0, Object arg1) {
		//hacemos casting de Object a Corredor para poder trabajar con ellos
		Corredor corA=(Corredor)arg0;
		Corredor corB=(Corredor)arg1;
		
		//creamos las 2 variables tipo cadena 
		//(porque nombre es String) que vamos a comparar
		String corAA = corA.getNombre();
		String corBB = corB.getNombre();
		
		//se retorna el int que devuelve la comparación del primero con el segundo
		//el metodo toLowerCase nos devuelve la cadena en minúsculas
		//el metodo compareTo es para comparar cadenas
		//de manera natural, lexicográficamente
		return (corAA.toLowerCase().compareTo(corBB.toLowerCase()));
		
	}

}
