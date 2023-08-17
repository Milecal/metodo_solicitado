package ejercicio19;

import java.util.Scanner;

public class ejercicio19 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int cafe;
		
		System.out.println("\tMENU");

		System.out.println("\n1. Cafe cortado.");
	
		System.out.println("2. Cafe latte.");
	
		System.out.println("3. Cafe solo.");
		
		System.out.println("4. Cafe lagrima.");
		
		System.out.println("5. Salir.");
		
		System.out.println("\nIngrese el numero del tipo de cafe que desea: ");
		cafe=entrada.nextInt();
		
	
		switch(cafe) {
		case 1:
			System.out.println("\nEscogio el cafe: cortado.");
			break;
			
		case 2:
			System.out.println("\nEscogio el cafe: latte. ");
			break;
			
		case 3:
			System.out.println("\nEscogio el cafe: solo. ");
			break;
			
		case 4:
			System.out.println("\nEscogio el cafe: lagrima. ");
			break;
			
		case 5:
			System.out.println("\nSaliste del programa.");
			break;
		}
		
		System.out.println("\nGracias por su consulta, vuelva pronto :)");
}
}