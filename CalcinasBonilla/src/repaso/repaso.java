package repaso;

import java.util.Scanner;

public class repaso {

	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Ingresa la cantidad de DNI a anotar: ");
		int cant = datos.nextInt();
		
		int[] DNI = new int [cant];

		for (int i = 0 ; i < DNI.length ; i++) {
			
			System.out.println("Ingrese los DNI");
			DNI[i] = datos.nextInt();
		}
		
		for (int i = 0 ; i < (DNI.length - 1) ; i++) {
			for (int j = 0 ; j < (DNI.length - i - 1) ; j++) {
				
				if (DNI[j] > DNI[j+1]) {
					
					int temporal = DNI[j];
					
					DNI[j] = DNI[j + 1];
					
					DNI[j + 1] = temporal;
				}
			}
		}
		
		System.out.println("\nLista ordenada: ");
		
		for (int num : DNI) {
			
			System.out.println(num + " ");
		}
		
		String[] apellidos = new String [cant];

		for (int i = 0 ; i < apellidos.length ; i++) {
			
			System.out.println("\nIngrese los apellidos: ");
			apellidos[i] = datos.next();
		}
		
		System.out.println("\nBusque un numero de DNI: ");
		int dniingresado = datos.nextInt();
		
		boolean flag = false;
		
		for (int i = 0; i > DNI.length ; i++) {
			
			if (dniingresado == DNI[i]) {
				System.out.println("El DNI le pertence a ");
				flag = false;
			}
		}
		
		if (flag == true) {
			System.out.println("El numero de DNI no existe en este programa");
		}

	}
}