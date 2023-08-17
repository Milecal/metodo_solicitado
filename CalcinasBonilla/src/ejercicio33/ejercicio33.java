package ejercicio33;

import java.util.Scanner;

public class ejercicio33 {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		int edad;
		
		for (int i = 1; i <= 11; i++) {
			
			System.out.println("¿Cual es el nombre del jugador?: ");
			nombre = entrada.next();
					
			System.out.println("Ingresar la edad del jugador: ");
			edad = entrada.nextInt();
			
			if (i <= 11) {
				System.out.println("Jugador " + i + ": " + nombre + " - " + edad);
			}
		}
	}
}
