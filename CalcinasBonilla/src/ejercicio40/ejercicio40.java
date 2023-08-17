package ejercicio40;

import java.util.Scanner;

public class ejercicio40 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		int[] temp = new int [5];
		int prom = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese la temperatura: ");
			temp[i]=entrada.nextInt();
			
		 prom += temp[i];		
		}
		
		int promedio = prom / 5;
		
		System.out.println("Promedio: " + promedio);
	}	
}
