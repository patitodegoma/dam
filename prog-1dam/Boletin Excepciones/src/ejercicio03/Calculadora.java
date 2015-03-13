package ejercicio03;

import java.util.Scanner;

public class Calculadora {
	
	int num1, num2;
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void leerNumero (int operando) {
		Scanner sc = new Scanner (System.in);
		String aux;
		boolean err = true;
		do {
			try {
				aux = sc.nextLine();
				if (operando == 1) {
					this.setNum1(Integer.parseInt(aux));
				} else {
					this.setNum2(Integer.parseInt(aux));
				}
				err = false;
			} catch (NumberFormatException e) {
				System.out.print("\nError al leer el número, por favor, introdúzcalo de nuevo: ");
				aux = sc.nextLine();
				if (operando == 1) {
					this.setNum1(Integer.parseInt(aux));
				} else {
					this.setNum2(Integer.parseInt(aux));
				}
			}
		} while (err);
		
	}
	
	public int sumar () {
		return num1 + num2;
	}
	
	public int restar () {
		return num1 - num2;
	}
	
	public int multiplicar () {
		return num1 * num2;
	}
	
	public int dividir () throws ArithmeticException  {
		if (num2 == 0) {
			throw new ArithmeticException ();
		}
		
		return num1 / num2;
	}
	
	public double raiz() throws ExcepcionRaizNeg {
		double resultado = 0;
		boolean err = true;
		do {
			try {
				if (this.num1 < 0) {
					throw new ExcepcionRaizNeg ("Nada de negativos en las raices!!!");
				} else {
					err = false;
				}
			} catch (ExcepcionRaizNeg e) {
				System.out.println(e.getMessage());
				System.out.println("\nPor favor, introduzca el número cuya raiz desee calcular.");
				this.leerNumero(1);
				resultado = Math.sqrt(num1);
			} 
			
		} while (err);
		
		resultado = Math.sqrt(num1);
		return resultado;
	}

}
