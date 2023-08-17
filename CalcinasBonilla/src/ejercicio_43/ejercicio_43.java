package ejercicio_43;

import java.util.Scanner;

public class ejercicio_43 {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner (System.in);
		
		int[] num = new int [4];
		
		for (int i = 0 ; i < 5 ; i++) {
			
			System.out.println("Ingrese 5 numeros enteros: ");
			num[i] = datos.nextInt();
			
		}
		
		for (int i = 0 ; i < 5 ; i++) {
			
			if (num[i] < 0) {
				continue;
			}
			
			System.out.println(num[i]);
		}

	}
}
