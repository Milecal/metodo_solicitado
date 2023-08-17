package ejercicio22;

import java.util.Scanner;

public class ejercicio22 {
	
	public static void main(String args[]) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		int numero, intento=0;
	
		System.out.println("Ingresar un numero entre 0 y 99: ");
        numero=datos.nextInt();
        
        int bingo = (int) (Math.random()*99); 
        
		while ( numero != bingo ) {
			intento++;
			System.out.println("Intento n° "+intento);
			System.out.println("Perdiste, intentalo de nuevo: ");
			numero=datos.nextInt();
			
			if ( numero == bingo ) {
				System.out.println("Ganaste!!!");
			}
		}
	}
}