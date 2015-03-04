package ejemplocomparator;
import java.util.*;

public class ComparaPorDorsal implements Comparator{
	//Escribimos el código del método compare
	public int compare(Object ob0, Object ob1) {
		
		Corredor corA=(Corredor)ob0;
		Corredor corB=(Corredor)ob1;
		
		int corAA = corA.getDorsal();
		int corBB = corB.getDorsal();
		
		//si el 1º es menor que el segundo devuelve -1, si es mayor 1 y si son iguales 0
		if(corAA < corBB){
			return -1;
		}
		else{
			if (corAA > corBB){
				return 1;
			}	
		return 0;
		}
	}
}
