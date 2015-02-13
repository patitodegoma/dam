import java.util.*;
public class hola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List lista = new ArrayList();
		 lista.add("one");
		 lista.add("second");
		 lista.add("3rd");
		 lista.add(new Integer(4));
		 lista.add(new Float(5.0F));
		 lista.add("second"); // duplicado, sí se añade
		 lista.add(new Integer(4)); // duplicado, sí se añade
		 //Ahora los elementos sí aparecen en el orden en que
		 //se agregaron
		 System.out.println(lista);  


	}

}
