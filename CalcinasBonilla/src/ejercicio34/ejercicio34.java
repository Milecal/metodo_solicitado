package ejercicio34;

import java.util.Scanner;

public class ejercicio34 {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int ingresos = 1; ingresos <= 12; ingresos++) {
			
			System.out.println("Ingresar los ingresos de cada mes: ");
			ingresos = entrada.nextInt();
			
			if (ingresos < 100000) {
				System.out.println("Hubo un ingreso menor a $100000");
			}
		}
	}
}