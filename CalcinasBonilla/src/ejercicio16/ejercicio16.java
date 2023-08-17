package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int hora, minuto, segundo;
		
		  System.out.println("Ingresar una hora: ");
		  hora=entrada.nextInt();
		
		  System.out.println("Ingresar el minuto: ");
		  minuto=entrada.nextInt();
		  
		  System.out.println("Ingresar el segundo: ");
		  segundo=entrada.nextInt();
		
		if (hora < 24) {
			
		System.out.println("La hora ingresada es correcta.");
		}
		
		else {
			
		System.out.println("La hora ingresada es incorrecta.");
		}
		
		if (minuto < 60) {
			
		System.out.println("El minuto ingresado es correcto.");
		}
		
		else {
			
			System.out.println("El minuto ingresado es incorrecto.");
		}
		
		if (segundo < 60 ) {
			
			System.out.println("El segundo ingresado es correcto.\n");
		}
			
	    else {
				
			System.out.println("El segundo ingresado es incorrecto.\n");
		}
		
		
		System.out.println("La hora ingresada es= "+ hora +" : "+ minuto +" : "+ segundo);
		
	   }
}
