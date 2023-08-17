package ejercicio44;

import java.util.Scanner;

public class ejercicio44 {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner (System.in);

		int[] dni = new int [3];
		
		for (int i = 0 ; i < 4 ; i++) {
			
			System.out.println("Ingrese el DNI: ");
			dni[i] = datos.nextInt();
			
		}
		
		for (int i = 0 ; i < 4 ; i++) {
			
			int[] resto = new int [3];
			
			resto[i] = dni[i]%2;
			
			if (resto[i] > 0) {
				continue;
			}
			
			System.out.println(dni[i]);
		}
		
	}
}