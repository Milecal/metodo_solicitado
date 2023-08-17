package ejercicio13;

import java.util.Scanner;

public class ejercicio13 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		char talle;
		
		
		System.out.println("Ingrese el caracter minusculo del talle (s, m, l): ");
		talle=entrada.next().charAt(0);
		
		if (talle == 's') {
			System.out.println("Quedan 5 remeras");
		}
		
		else if (talle == 'm') {
			System.out.println("Quedan 2 remeras");
		}
		
		else if (talle == 'l') {
			System.out.println("No quedan remeras");
		}
	}
	

}
