package ejercicio_07;


/*
 
7. Crear un programa que emule una m�quina vendedora de tickets de metro.
Tendremos que crear la clase ticket, la clase m�quina y la clase principal o de
prueba. Podremos:
� Comprar uno o varios billetes teniendo en cuenta si hay que devolver
cambio o no.
� Imprimir por pantalla el billete. 
� Adem�s, al final de la jornada, el operario que lleva el mantenimiento de
la m�quina, debe tener disponible un m�todo que le ofrezca el saldo
total de la recaudaci�n de la m�quina en ese d�a (no es necesario usar
fechas) y ponga a cero el contador.
� Por �ltimo, tambi�n debe contar con la posibilidad de cambiar el precio
de los billetes ya que estos suelen subir todos los a�os.
� Las operaciones para el operario se har�n solo si se introduce la
contrase�a adecuada.

*/

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0, numeroTickets = 0;
		double monedaIns = 0.0, usuarioPass = 0.0, nuevoPrecio = 0.0, nuevaPass = 0.0, nuevaPass2 = 0.0;
		boolean importeSuficiente = false;
		char continuar = 's';
		
		Maquina miMaquina = new Maquina();
		
		System.out.println("***Bienvenido a mi programa***\n"
				+ "Simula el funcionamiento de una m�quina expendedora de tickets.");
		
		do {
			
			System.out.println("\nPor favor, seleccione la opci�n deseada:\n"
					+ "\t1.- Comprar billetes\n"
					+ "\t2.- Opciones de operario\n"
					+ "\n\t0.- Salir del programa\n");
			System.out.print("Su opci�n: ");
			
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				System.out.print("\nPor favor, indique la cantidad de tickets que desea comprar: ");
				numeroTickets = Leer.datoInt();
				System.out.printf("\nEl importe total es %.2f �.\n", miMaquina.calculatotal(numeroTickets));
				do {
					System.out.print("Inserte moneda o billete: ");
					monedaIns = Leer.datoDouble();
					importeSuficiente = miMaquina.comprobarimporte(numeroTickets, monedaIns);
					if (importeSuficiente) {
						System.out.printf("\nGracias por comprar en Metro DAM. Recoja su(s) billete(s) y no olvide "
								+ "su cambio de %.2f �.\n", miMaquina.devolvercambio(numeroTickets, 
										miMaquina.getPagadoOperacion()));
					} else {
						System.out.printf("\nHa pagado %.2f �\tLe queda por pagar %.2f �\n", 
								miMaquina.getPagadoOperacion(), miMaquina.calculatotal(numeroTickets)-
																miMaquina.getPagadoOperacion());
					}
				} while (!importeSuficiente);
				miMaquina.imprimirbilletes(numeroTickets);	
				break;
			case 2:
				System.out.print("\nPor favor, introduzca la contrase�a de operario: ");
				usuarioPass = Leer.datoDouble();
				if (!miMaquina.comprobarpass(usuarioPass)) 
					System.out.println("Contrase�a incorrecta");
				else {
					System.out.println("\nContrase�a correcta. Bienvenido sr. Operario\n");
					
					do {
						
						System.out.println("\nEst� en el men� de operario. "
								+ "Por favor, seleccione la opci�n que desee: \n"
								+ "\t1.- Consultar saldo.\n"
								+ "\t2.- Consultar n�mero de tickets vendidos.\n"
								+ "\t3.- Resetear estad�sticas.\n"
								+ "\t4.- Cambiar precio del ticket.\n"
								+ "\t5.- Cambiar contrase�a.\n"
								+ "\n\t0.- Salir del men� de operario");
						System.out.print("Su opci�n: ");
						opcion = Leer.datoInt();
						switch (opcion) {
						case 1:
							System.out.printf("\nEl saldo de hoy de la m�quina es %.2f �\n", miMaquina.getSaldo());
							break;
						case 2: 
							System.out.println("\nHoy se han vendido "+miMaquina.getTotalVentas()+" tickets.");
							break;
						case 3:
							miMaquina.setSaldo(0.0);
							miMaquina.setTotalVentas(0);
							System.out.println("\nReseteo realizado correctamente");
							break;
						case 4:
							System.out.print("\nPor favor, introduzca el nuevo precio: ");
							nuevoPrecio = Leer.datoDouble();
							miMaquina.setPrecioTicket(nuevoPrecio);
							System.out.printf("\nEl precio se ha modificado correctamente a %.2f �\n", nuevoPrecio);
							break;	
						case 5:
							System.out.print("\nPor favor, introduzca la nueva contrase�a: ");
							nuevaPass = Leer.datoDouble();
							System.out.print("\nPor favor, vuelva a introducir la nueva contrase�a: ");
							nuevaPass2 = Leer.datoDouble();
							if (miMaquina.cambiarpass(nuevaPass, nuevaPass2)) {
								System.out.println("\nContrase�a modificada correctamente.");
							} else {
								miMaquina.setPassword(nuevaPass);
								System.out.println("\nError!! Las contrase�as no coinciden.");
							}
						case 0:
						}
						
						System.out.print("\n�Desea efectuar m�s tareas de operario? (S/N): ");
						continuar = Leer.datoChar();
						
					} while (continuar == 's' || continuar == 'S');
	
				}
				
			case 0:	
			}
			
			System.out.print("\n�Desea realizar alguna otra operaci�n? (S/N): ");
			continuar = Leer.datoChar();
			
		} while (continuar == 's' || continuar == 'S');
		
		System.out.println("\n��� Gracias por utilizar mi programa !!!");
	
	}

}
