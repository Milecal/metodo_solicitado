package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		
	float nota;
	
	     System.out.println("Ingresar la nota del examen con decimal: ");
	     nota = entrada.nextFloat();
	     
	     
		int numRedondeado= (int) Math.round(nota);
	     
	     
	    System.out.println("La nota redondeada es: " + numRedondeado);
	     

	}

}
