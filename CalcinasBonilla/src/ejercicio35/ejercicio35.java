package ejercicio35;

import java.util.Scanner;

public class ejercicio35 {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		int nota, notamax = 0, notamin = 11, prom = 0;
		
	    for(int i = 1; i <= 5; i++) {
	
	    	System.out.println("Ingresar 5 calificaciones: ");
	    	nota=entrada.nextInt();
	    	
	    	if (nota > notamax) {
	    		notamax = nota;
	    	}
	    	
	    	if (nota < notamin) {
	    		notamin = nota;
	    	}
	    	
	    	prom += nota;
   	
	    	}
	    
	    System.out.println("Calificacion mas alta: " + notamax);
	    System.out.println("Calificacion mas baja: " + notamin);
	    
	    int promedio = prom/5;
		    
	    System.out.println("Promedio: " + promedio);	 	    
	}
}