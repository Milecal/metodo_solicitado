package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		float num1;
	
		System.out.println("Ingresar un numero: ");
		
		num1 = entrada.nextFloat();
		
		
		
		
		
		double raiz_cuadrada = Math.sqrt(num1);
		int raiz_cuadrada2 = (int) Math.sqrt(num1);
		
		
		
	    System.out.println("El resultado de la raiz con decimal es: "+raiz_cuadrada);
	    
	    System.out.println("El resultado de la raiz entero es: "+raiz_cuadrada2);
	    
	    
	}
	
	
}
