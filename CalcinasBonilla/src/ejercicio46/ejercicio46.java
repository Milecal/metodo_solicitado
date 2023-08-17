package ejercicio46;

import java.util.Scanner;

public class ejercicio46 {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner (System.in);

		int num[] = {2367, 8748, 9121, 1817, 6423, 2034};	
		String nom[] = {"Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana"} ;
		
		for (int i = 0 ; i < num.length ; i++) {
			
			int[] resto = new int [6];
			
			resto[i] = num[i]%2;
			
			if (resto[i] > 0) {
				continue;
			}
			
			System.out.println(num[i]);
		}
	}
}
