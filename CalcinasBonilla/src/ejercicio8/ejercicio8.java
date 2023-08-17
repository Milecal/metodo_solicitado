package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		
		 float num, suma, multip;
		 
		
		      System.out.println("Ingrese un numero con un digito entero y dos decimales: ");
		      num = entrada.nextFloat();
		 
		   
		 float base = num, exponente = 2;
		 double potencia = Math.pow(base, exponente);
		 
		 
		 int numRedondeado= (int) Math.round(potencia);
		 
		 
		 int numeroAleatorio = (int)(Math.random()*1);
		   
		 
		      suma = numeroAleatorio + numRedondeado;
		      multip = suma * 7;
		      
		      
		 float raiz_cuadrada = (float) Math.sqrt (multip);
		 
		      System.out.println("El resultado es: "+ raiz_cuadrada);
		   
		
	
		
	}

}
