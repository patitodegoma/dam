package ejercicio01;

public class Impuesto {
	
	/*
	Realizar un programa que use la siguiente interface, dos clases que la
	implementen, la clase producto que implemente el primer método y la clase
	trabajador que implemente el segundo método (¿Qué habrá que hacer con el que
	no se implementa?), y una clase de prueba para ver los resultados:
	
	Public interface Iimpuesto {
	 double calculoIva (double precio, int iva);
	 double calculoIrpf (double sueldo, int retencion);
	} 
	*/

	public interface Iimpuesto {
		public double calculoIva (double precio, int iva);
		public double calculoIrpf (double sueldo, int retencion);
	}


}
