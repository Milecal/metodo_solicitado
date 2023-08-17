package ejercicio49;

import java.util.Scanner;

public class ejercicio49 {
	
	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
	
		System.out.println("Ingresa la cantidad de DNI a anotar: ");
		int cant = datos.nextInt();
		
		int[] DNI = new int [cant];
		
		for (int i = 0 ; i < DNI.length ; i++) {
			
			System.out.println("Ingresa un DNI");
			DNI[i] = datos.nextInt();
		}
		
		for (int i = 0 ; i < (DNI.length - 1) ; i++) {
			
			for (int j = 0 ; j < (DNI.length - i - 1) ; j++) {
				
				if (DNI[j] > DNI[j +1]) {
					
					int temporal = DNI[j];
					
					DNI[j] = DNI[j+1];
					
					DNI[j + 1] = temporal;
				}
			}
		}
		
		System.out.println("Lista ordenada ascendente");
		
		for (int i = DNI.length - 1 ; 1 >= 0 ; i--) {
			
			System.out.println("DNI: " + DNI[i] + "\n");
		}
	}
}
