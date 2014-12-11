package examenUD3;

public class Ejercicios2a4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] textos = new String[20];

		// TODO Abrir conexión a Internet

		// TODO Recibir la lista de correos electrónicos nuevos en la bandeja de
		// entrada.

		for (int i = 0; i < textos.length; i++) {
			if (i % 2 == 0) {
				System.out.println(textos[i] + " " + textos[i + 1]);
			}
		}

	}

}
