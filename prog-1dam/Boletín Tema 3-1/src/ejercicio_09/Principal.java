package ejercicio_09;

public class Principal {
	
	/*
	Crear un programa para poner las notas de un alumno. El programa debe
	poder poner notas a un alumno, mostrar todas sus notas por teclado, modificar
	una nota, calcular la media y dar el número de suspensos de un alumno.
	(Opcional) Se puede añadir al programa la posibilidad de usar el programa para
	varios alumnos, con lo que debemos usar arrays de alumnos. 
	*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		@SuppressWarnings("unused")
		boolean esCorrecto = false;
		char continuar = 's';
		//String nomAsignaturas[] = {"Lenguajes", "Programación", "Bases de Datos", "Entornos", "Sistemas", "FOL", "Religión"};
		//int notas[] = new int [7];
		
		Alumno miAlumno = new Alumno ();
		
		System.out.println("\n\t\t***Bienvenido a mi programa***\n\n"
				+ "Sirve para gestionar las notas de un alumno.\n");
		
		do {
			
			System.out.println("\nPor favor, seleccione la opción deseada:\n "
					+ "\t1.- Poner notas a un alumno\n"
					+ "\t2.- Mostrar todas las notas\n"
					+ "\t3.- Modificar una nota\n"
					+ "\t4.- Calcular la nota media\n"
					+ "\t5.- Dar el número de suspensos\n\n"
					+ "\t0.- Salir");
			System.out.print("\nSu opción: ");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				if (esCorrecto = miAlumno.ponernotas()){
					System.out.println("\nProceso finalizado correctamente");
				}		
			break;	
			case 2:
				miAlumno.mostrarnotas();
			break;
			case 3:
				if (esCorrecto = miAlumno.modificarnotas()) {
					System.out.println("\nProceso finalizado correctamente");
				}
			break;
			case 4:
				miAlumno.calculamedia();
				System.out.printf("\nLa nota media del alumno es %.2f", miAlumno.getMedia());
			break;
			
			case 5: 
				miAlumno.cuentasuspensos();
				if (miAlumno.getNsuspensos() > 0) {
					System.out.println("\nEl alumno ha suspendido "+miAlumno.getNsuspensos()+" asignatura(s).");
				} else {
					System.out.println("\nEl alumno no ha suspendido ninguna asignatura.");
				}
			case 0:
				continuar = 'n';
			}
			
			if (opcion != 0) {
				System.out.print("\n\n¿Desea realizar otra operación? (S/N): ");
				continuar = Leer.datoChar();
			}
			
			
		} while (continuar == 's' || continuar == 'S');
		
		System.out.println("\n¡¡¡Gracias por utilizar mi programa!!!");
		

	}

}
