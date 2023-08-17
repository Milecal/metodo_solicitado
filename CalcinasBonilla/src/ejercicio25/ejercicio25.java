package ejercicio25;

import java.util.Scanner;

public class ejercicio25 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int numero, intento = 0;
		boolean flag = false;
		
		int bingo= (int)(Math.random()*99); 
		
		do {

			System.out.println("Ingrese un numero del 0 al 99:");
			numero=datos.nextInt();
			
			intento ++;
			System.out.println("Perdiste, intento n° "+intento);
			
			if (intento == 5) {
				System.out.println("Demasiados intentos");
			}
			
		} while (numero != bingo && flag == false && intento <= 4);
		
		if (numero == bingo) {
			flag = true;
			System.out.println("Ganaste!!1!1!!!1");
			
		}
	}
}