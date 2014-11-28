package ejercicio_07;


/*
 
7. Crear un programa que emule una máquina vendedora de tickets de metro.
Tendremos que crear la clase ticket, la clase máquina y la clase principal o de
prueba. Podremos:
• Comprar uno o varios billetes teniendo en cuenta si hay que devolver
cambio o no.
• Imprimir por pantalla el billete. 
• Además, al final de la jornada, el operario que lleva el mantenimiento de
la máquina, debe tener disponible un método que le ofrezca el saldo
total de la recaudación de la máquina en ese día (no es necesario usar
fechas) y ponga a cero el contador.
• Por último, también debe contar con la posibilidad de cambiar el precio
de los billetes ya que estos suelen subir todos los años.
• Las operaciones para el operario se harán solo si se introduce la
contraseña adecuada.

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
				+ "Simula el funcionamiento de una máquina expendedora de tickets.");
		
		do {
			
			System.out.println("\nPor favor, seleccione la opción deseada:\n"
					+ "\t1.- Comprar billetes\n"
					+ "\t2.- Opciones de operario\n"
					+ "\n\t0.- Salir del programa\n");
			System.out.print("Su opción: ");
			
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				System.out.print("\nPor favor, indique la cantidad de tickets que desea comprar: ");
				numeroTickets = Leer.datoInt();
				System.out.printf("\nEl importe total es %.2f €.\n", miMaquina.calculatotal(numeroTickets));
				do {
					System.out.print("Inserte moneda o billete: ");
					monedaIns = Leer.datoDouble();
					importeSuficiente = miMaquina.comprobarimporte(numeroTickets, monedaIns);
					if (importeSuficiente) {
						System.out.printf("\nGracias por comprar en Metro DAM. Recoja su(s) billete(s) y no olvide "
								+ "su cambio de %.2f €.\n", miMaquina.devolvercambio(numeroTickets, 
										miMaquina.getPagadoOperacion()));
					} else {
						System.out.printf("\nHa pagado %.2f €\tLe queda por pagar %.2f €\n", 
								miMaquina.getPagadoOperacion(), miMaquina.calculatotal(numeroTickets)-
																miMaquina.getPagadoOperacion());
					}
				} while (!importeSuficiente);
				miMaquina.imprimirbilletes(numeroTickets);	
				break;
			case 2:
				System.out.print("\nPor favor, introduzca la contraseña de operario: ");
				usuarioPass = Leer.datoDouble();
				if (!miMaquina.comprobarpass(usuarioPass)) 
					System.out.println("Contraseña incorrecta");
				else {
					System.out.println("\nContraseña correcta. Bienvenido sr. Operario\n");
					
					do {
						
						System.out.println("\nEstá en el menú de operario. "
								+ "Por favor, seleccione la opción que desee: \n"
								+ "\t1.- Consultar saldo.\n"
								+ "\t2.- Consultar número de tickets vendidos.\n"
								+ "\t3.- Resetear estadísticas.\n"
								+ "\t4.- Cambiar precio del ticket.\n"
								+ "\t5.- Cambiar contraseña.\n"
								+ "\n\t0.- Salir del menú de operario");
						System.out.print("Su opción: ");
						opcion = Leer.datoInt();
						switch (opcion) {
						case 1:
							System.out.printf("\nEl saldo de hoy de la máquina es %.2f €\n", miMaquina.getSaldo());
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
							System.out.printf("\nEl precio se ha modificado correctamente a %.2f €\n", nuevoPrecio);
							break;	
						case 5:
							System.out.print("\nPor favor, introduzca la nueva contraseña: ");
							nuevaPass = Leer.datoDouble();
							System.out.print("\nPor favor, vuelva a introducir la nueva contraseña: ");
							nuevaPass2 = Leer.datoDouble();
							if (miMaquina.cambiarpass(nuevaPass, nuevaPass2)) {
								System.out.println("\nContraseña modificada correctamente.");
							} else {
								miMaquina.setPassword(nuevaPass);
								System.out.println("\nError!! Las contraseñas no coinciden.");
							}
						case 0:
						}
						
						System.out.print("\n¿Desea efectuar más tareas de operario? (S/N): ");
						continuar = Leer.datoChar();
						
					} while (continuar == 's' || continuar == 'S');
	
				}
				
			case 0:	
			}
			
			System.out.print("\n¿Desea realizar alguna otra operación? (S/N): ");
			continuar = Leer.datoChar();
			
		} while (continuar == 's' || continuar == 'S');
		
		System.out.println("\n¡¡¡ Gracias por utilizar mi programa !!!");
	
	}

}
