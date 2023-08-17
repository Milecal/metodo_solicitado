package ejercicio50;

import java.util.Scanner;

public class ejercicio50 {
	
	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
	
	System.out.println("Ingrese la cantidad de personas: ");
	int cant = datos.nextInt();
	
	int[] apuestas = new int [cant];
	
		for (int i = 0 ; i < apuestas.length ; i++) {
			
			System.out.println("¿Cuanto dinero desea apostar?: ");
			apuestas[i] = datos.nextInt();
			
			
			
		}
		
		
	}
}
