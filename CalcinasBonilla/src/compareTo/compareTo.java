package compareTo;

import java.util.Scanner;

public class compareTo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] miArray = { 7, 1, 4, 5, 3 };
		Integer numero;

		System.out.println("Ingrese un numero para comparar: ");
		numero = entrada.nextInt();

		for (int i = 0; i < 5; i++) {

			int comparar = numero
					.compareTo(miArray[i]); /*
											 * la variable numero se compara con todos los valores del arreglo
											 */
			String texto = "";

			switch (comparar) {

			case 0: /* si el valor de "numero" es igual a alguno del arreglo es = 0 */
				texto = "es del mismo valor";
				break;
			case 1: /* si el valor de "numero" es menor a alguno del arreglo es = 1 */
				texto = "este es menor";
				break;
			case -1: /* si el valor de "numero" es mayor a alguno del arreglo es = -1 */
				texto = "este es mayor";
				break;
			}

			System.out.println("Pos[" /* posicion */ + i + "] : " + texto);
		}
	}
}
