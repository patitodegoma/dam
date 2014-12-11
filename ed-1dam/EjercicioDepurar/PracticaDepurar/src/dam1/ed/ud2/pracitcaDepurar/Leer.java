package dam1.ed.ud2.pracitcaDepurar;

import java.io.*;


public class Leer{
	
 public static String dato()
  {
  String sdato=" ";
  try{
  	 InputStreamReader isr=new InputStreamReader(System.in);
  	 BufferedReader flujoE = new BufferedReader(isr);
  	 sdato=flujoE.readLine();
  	 }
  catch (IOException e)
  	{
  	System.out.println("Error "+e.getMessage());
  	}
  return sdato;
  
  }

 public static int datoInt()
  {
  return Integer.parseInt(dato());
  }
  
  //De aqui para abajo es la tarea....  Si existe un metodo "parse"
  //Para las clases Float,Double, Short y Long.
 public static float datoFloat()
  {
  return Float.parseFloat(dato());	
  }
  
 public static long datoLong()
  {
  return Long.parseLong(dato());
  }
 
 public static short datoShort()
  {
  return Short.parseShort(dato());	
  }
 
 public static double datoDouble()
  {
  return Double.parseDouble(dato());	
  }
  
}
