package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {
	
	public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);
		
		int calificaci�n;
		
		System.out.println("Ingresa tu calificaci�n entre 1 y 10:");
        calificaci�n=entrada.nextInt();
        
        if(calificaci�n <1 || calificaci�n >10 ){
        	
        	System.out.println("Es INCORRECTO ");
        }
        
        if(calificaci�n >= 1 && calificaci�n <= 3){
        	
        	System.out.println("Insuficiente");
        }
        
        else if (calificaci�n > 3 && calificaci�n < 6 ) {
        	
        	System.out.println("No logrado");
        } 
        
        else if (calificaci�n >= 6 && calificaci�n <=7 ) {
        	System.out.println("Suficiente");
        }
        
        else if (calificaci�n >= 8 && calificaci�n <= 9) {
        	System.out.println("Notable");
        }
        
        else if (calificaci�n == 10 ) {
        	System.out.println("Sobresaliente");
        }
}
}