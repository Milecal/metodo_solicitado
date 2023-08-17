package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {
	
	public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);
		
		int calificación;
		
		System.out.println("Ingresa tu calificación entre 1 y 10:");
        calificación=entrada.nextInt();
        
        if(calificación <1 || calificación >10 ){
        	
        	System.out.println("Es INCORRECTO ");
        }
        
        if(calificación >= 1 && calificación <= 3){
        	
        	System.out.println("Insuficiente");
        }
        
        else if (calificación > 3 && calificación < 6 ) {
        	
        	System.out.println("No logrado");
        } 
        
        else if (calificación >= 6 && calificación <=7 ) {
        	System.out.println("Suficiente");
        }
        
        else if (calificación >= 8 && calificación <= 9) {
        	System.out.println("Notable");
        }
        
        else if (calificación == 10 ) {
        	System.out.println("Sobresaliente");
        }
}
}