package ejercicio39;

import java.util.Scanner;

public class ejercicio39 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		String[] nombre = new String[11];
		int[] edad = new int[11];
		
		for (int i = 0; i < 11; i++) {
			
			System.out.println("¿Cual es el nombre del jugador?: ");
			nombre[i] = entrada.next();
					
			System.out.println("Ingresar la edad del jugador: ");
			edad[i] = entrada.nextInt();		
		}
		
		for (int i = 0; i < 11; i++) {
			
			System.out.println("Jugador n° "+ i +": "+nombre[i]);
			
			System.out.println("Edad del jugador n° "+ i +": "+edad[i]);
		}
	}
}
