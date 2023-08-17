package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		char talle;
		
		System.out.println("Ingrese el caracter minusculo del talle (s, m, l): ");
		talle=entrada.next().charAt(0);
		
		switch(talle) {
		case 's':
			System.out.println("Quedan 5 remeras");
			break;
			
		case 'm':
			System.out.println("Quedan 2 remeras");
			break;
			
		case 'l':
			System.out.println("No quedan remeras");
			break;
			
		default:
			System.out.println("No tengo remeras de ese talle");
			break;
		}
		
		System.out.println("Gracias por su consulta");
		
		
	}
}
