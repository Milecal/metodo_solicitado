package evaluacion;

import java.util.Scanner;

public class evaluacion {

	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
	
		int[] cant = new int [3];
		int min = 100000, max = 0, prom = 0;
		for (int i = 0; i < 3; i++) {
	
			System.out.println("Indique cuántos sanguches de milanesa se producen cada 2hs: ");
			cant[i] = datos.nextInt();
	
			if (cant[i] > max) {
				max = cant[i];
			}
			
			if (cant[i] < min) {
				min = cant[i];
			}
			
			prom += cant[i];
		}
		
		System.out.println("\nCantidad maxima: " + max);
		System.out.println("Cantidad minima: " + min);
		
		for (int i = 0 ; i < (cant.length - 1) ; i++) {
			for (int j = 0 ; j < (cant.length - i - 1) ; j++) {
				
				if (cant[j] > cant[j+1]) {
				int temporal = cant[j];	
				cant[j] = cant[j + 1];	
				cant[j + 1] = temporal;			
				}
			}
		}
	
		System.out.println("\nLista ascendente: ");
		
		for (int num : cant) {
			System.out.println(num + " ");
		}
		
		for (int i = 0; i < 3; i++) {
			if (cant[i] <= 20) {
				System.out.println("\nHubo cantidades iguales y/o menores a 20: " + cant[i]);
			}
		}
		
		int promedio = prom/3;
		System.out.println("\nPromedio de cantidades al dia: " + promedio);
		
	}
}