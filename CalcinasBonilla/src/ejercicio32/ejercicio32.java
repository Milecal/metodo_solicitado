package ejercicio32;

import java.util.Scanner;

public class ejercicio32 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		int num, resul;

		System.out.println("Indique de que numero desea ver su tabla de multiplicar");
		num = entrada.nextInt();

		for (int i = 0; i <= 20; i++) {
			resul = num * i;
			System.out.println(num + " * " + i + " = " + resul);
		}
	}
}
