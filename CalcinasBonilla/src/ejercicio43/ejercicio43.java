package ejercicio43;

import java.util.Scanner;

public class ejercicio43 {

	public static void main (String args []) {
		Scanner datos = new Scanner (System.in);
		
		int[] num = new int [3];
		
		for (int i = 0 ; i < 3 ; i++) {
			
			System.out.println("Ingrese un numero: " );
			num[i] = datos.nextInt();
			
		}
		
		for (int i = 0 ; i < 1 ; i++) {
			
			int numaleatorio = (int) (Math.random()*2);
			
			if (num[i] != numaleatorio) {
				System.out.println("Perdiste");
			}
			
			else if (num[i] == numaleatorio) {
				
				System.out.println("Ganaste");
			}
			
			System.out.println("El numero aleatorio es: " + numaleatorio);
		}
	}
}
