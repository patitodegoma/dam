package enclase;

// El siguiente es un comentario que al pasarlo por javadoc se copiar� su contenido a un documento html.

// Se usan para escribir el "manual de instrucciones", y admiten etiquetas HTML.

// En Eclipse sale al ponerse el rat�n encima del m�todo o de lo que sea en lo que est�n incluidos.

/**
 * @author Andr�s Mac�as Jim�nez
 */

public class Clase1 {
	
	// En los comentarios javadoc se pone qu� hace, pero no c�mo lo hace, a no ser que sea importante.
	
	// Se ponen justo encima del m�todo
	
	/**
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 */
	
	double miMetodo (int param1, String param2) {
		return param1*Math.PI;
	}
	
	/**
	 * Calcula el <b>IMC</b>, �ndice de Masa Corporal, seg�n la f�rmula establecida por la OMS, <br><center>IMC = peso / altura<sup>2</sup></center>
	 * @param peso Peso de la persona, indicado en kg. Debe ser un valor positivo.
	 * @param altura Altura de la persona, indicada en cm. Debe ser un valor positivo.
	 * @return El valor calculado, seg�n la f�rmula establecida, en kg/cm<sup>2</sup>. Devuelve 0 si no hay datos v�lidos.
	 */
	
	double calcularIMC (double peso, int altura) {
		double imc = 0;
		if (peso > 0 && altura > 0)
			imc = peso / Math.pow(altura, 2);
		return imc;
	}
	

}
