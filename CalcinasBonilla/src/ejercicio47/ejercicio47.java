package ejercicio47;

import java.util.Scanner;

public class ejercicio47 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		int nombre, apellido;
		int[] arreglo = {};
		int[] notas = new int[11];
		
		System.out.println("Ingrese su nombre: ");
		nombre = entrada.nextInt();
		System.out.println("Ingrese su apellido: ");
		apellido = entrada.nextInt();
		
		for (int i = 0 ;  i < notas.length ; i++) {
			
			System.out.println("Ingrese sus notas: ");
			notas[i] = entrada.nextInt();
			
			for (int j = 0; j < (arreglo.length - i - 1) ; j++) {
				
				if (notas[j] > notas[j+1]) {
					
					int temporal = notas[j];
					notas[j] = notas[j+1];
					notas[j+1] = temporal;
				}
			}
		}
		
		System.out.println("Notas ordenadas: ");
		for (int nota : notas) {
			
			System.out.println(nota + " ");
		}
		System.out.println("Notas desordenadas: ");
		for (int nota : notas) {
			
			System.out.print(nota + " ");
		}
	}
}