package ejercicio27;

import java.util.Scanner;

public class ejercicio27 {
	
	public static void main(String args[]) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		int contraseña, intentos = 0;
		boolean flag = false;
		
	System.out.println("Ingrese la contraseña: ");
	contraseña = datos.nextInt();
			
	do {
		System.out.println("Contraseña incorrecta");
		
		intentos ++;
		System.out.println("Intento n° "+ intentos);
		
		System.out.println("Ingrese la contraseña nuevamente: ");
		contraseña = datos.nextInt();
				
			if (contraseña == 2007) {
				flag = true;
				System.out.println("Contraseña correcta");
			}	
			else if (intentos >= 3) {
				System.out.println("El usuario esta bloqueado");
			}	
	} while (contraseña != 2007 && intentos <= 2 && flag == false);
	
	}
}
