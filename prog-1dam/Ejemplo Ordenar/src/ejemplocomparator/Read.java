package ejemplocomparator;


import java.util.*;

public class Read{
	// se crea el objeto scanner
	private static Scanner sc = new Scanner (System.in);
	
	//metodo para leer String
	public static String cadena(){
		String aux = sc.nextLine ();
		return aux;
	}
	
	//metodo para leer int
	public static int entero(){
		return Integer.parseInt(cadena());
	}
	
	//metodo para leer double
	public static double doble(){
		return Double.parseDouble(cadena());
	}
	
	//metodo para leer float
	public static float flotante(){
		return Float.parseFloat(cadena());
	}
	//metodo para leer long
	public static long largo(){
	 return Long.parseLong(cadena());
	}
	
	//metodo para leer short
	public static short corto(){
	  return Short.parseShort(cadena());	
	}
}
