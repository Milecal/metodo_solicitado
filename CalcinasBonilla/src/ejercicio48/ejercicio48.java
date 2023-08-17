package ejercicio48;

import java.util.Scanner;

public class ejercicio48 {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
	
		String[] apellidos = { "Sarzo", "Ugarte", "Martino", "Cachi" };
		String max = "";
		String min = "{";
		
		for (int i = 0 ; i < apellidos.length ; i++) {
			
			if (apellidos[i].compareTo(max) > 0) {
				max = apellidos[i];
			}
			
			if (apellidos[i].compareTo(min) < 0) {
				min = apellidos[i];
			}
		}
	
		System.out.println("Ultimo apellido: " + max);
		System.out.println("Primer apellido: " + min);
	}	
}