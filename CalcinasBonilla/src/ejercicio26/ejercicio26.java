package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {
	public static void main(String args[]) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		int contrase�a, intentos = 0;
		
		System.out.println("Ingrese la contrase�a: ");
		contrase�a = datos.nextInt();
				
		do {
			System.out.println("Contrase�a incorrecta");
			
			intentos ++;
			System.out.println("Intento n� "+ intentos);
			
			System.out.println("Ingrese la contrase�a nuevamente: ");
			contrase�a = datos.nextInt();
					
				if (contrase�a == 2007) {
					System.out.println("Contrase�a correcta");
				}	
				else if (intentos >= 3) {
					System.out.println("El usuario esta bloqueado");
				}	
		} while (contrase�a != 2007 && intentos <= 2);
		
		}
}