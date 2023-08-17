package ejercicio45;

import java.util.Scanner;

public class ejercicio45 {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner (System.in);

		int num[] = {2367, 8748, 9121, 1817, 6423, 2034};	
		String nom[] = {"Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana"} ;
		int numingresado;
			
		System.out.println("Para encontrar a un individuo, ingresar número de socio: ");
		numingresado=datos.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			
			if (numingresado == num[i]) {
				System.out.println("El empleado es: "+nom+" - "+num);
			}
			
		}
	}
}
