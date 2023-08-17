package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Ingresar un numero entre 0 y 99: ");
        numero=entrada.nextInt();
        
        int bingo= (int)(Math.random()*99); 
        
        System.out.println("\nEl numero del bingo era:"+bingo);
        
        if (numero == bingo ) {
        	System.out.println("Ganaste :D ");
        }
        
        else {
        	
        	System.out.println("\nPerdiste :( ");
        }
		
		
	}
}