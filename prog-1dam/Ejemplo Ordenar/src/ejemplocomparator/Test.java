package ejemplocomparator;
import java.util.*;

public class Test{
	public static void main(String[] args) {
		
		int opcionUser;
		List<Corredor> corredores = new ArrayList<Corredor>();
		
		corredores.add(new Corredor(1, 1.43, "Jesse Owens"));
		corredores.add(new Corredor(2, 1.11, "�ngel Naranjo"));
		corredores.add(new Corredor(3, 2.23, "Abel Ant�n"));
		corredores.add(new Corredor(4, 1.12, "Luis Miguel L�pez"));
		corredores.add(new Corredor(5, 1.14, "Miguel Campos"));
		corredores.add(new Corredor(6, 1.13, "Rafa Villar"));
		corredores.add(new Corredor(7, 2.11, "Emil Zatopek"));
		corredores.add(new Corredor(8, 2.35, "Carl Lewis"));

		
		System.out.println("\tCORREDORES");
		System.out.println();
		
		for(Corredor con : corredores){
			System.out.println(con.impDatos());
		}	
		
		do {
		System.out.println();
		System.out.println("ELIJA UNA OPCION");
		System.out.println("0.Salir");
		System.out.println("1.Ordenar por nombre");
		System.out.println("2.Ordenar por dorsal(desc)");
		System.out.println("3.Ganadores");
		opcionUser=Read.entero();
		
		switch(opcionUser){
		case 1:
			//******************
			//ordenamos todos los corredores por nombre
			System.out.println();
			System.out.println("\tCORREDORES (ordenados alfabeticamente)");
			//Al m�todo sort de Collections se le pueden pasar dos argumentos
			//La lista a ordenar, en este caso corredores
			//De tipo List es hija de Colletions y 
			//c�mo ordenar, en este caso, un objeto de la clase
			//que implemente el m�todo que vamos a usar para ordenar
			Collections.sort(corredores, new ComparaPorNombre());
			System.out.println();
			for(Corredor con : corredores){
				System.out.println(con.impDatos());
			}
			break;
			
		case 2:
			//******************
			//ordenamos todos los corredores por n�mero de dorsal descendente(para que se vea la diferencia)
			System.out.println();
			System.out.println("\tCORREDORES (por n�mero de dorsal descendente)");
			Collections.sort(corredores, new ComparaPorDorsal());
			System.out.println();
			for(Corredor con : corredores){
				System.out.println(con.impDatos());
			}
			break;
			
		case 3: 
			//******************
			//imprimimos los 3 primeros con marca m�s baja
			System.out.println();
			System.out.println("\tGANADORES");
			Collections.sort(corredores, new ComparaPorMarca());
			System.out.println();
			
			int i=0;
			for(Corredor con : corredores){
				if(i==0){
					System.out.println("ORO --> "+con.impDatos());
				}
				if(i==1){
					System.out.println("PLATA --> "+con.impDatos());
				}
				if(i==2){
					System.out.println("BRONCE --> "+con.impDatos());
				}
				i++;
			}
			break;
			
		default: 
			System.out.println("Opci�n no v�lida");
			break;
		}
		
		}while(opcionUser!=0);
	}
	
}
