
package ingresardatos;

import java.util.Scanner;

public class ingresardatos {

	public static void main(String args[]) {
		Scanner entrada = new Scanner (System.in);
   
	String nombre1;
	String nombre2;
	int edad1;
	int edad2;
	
	System.out.println("Ingresar primer nombre: ");
	nombre1=entrada.next();
	
	System.out.println("Ingresar segundo nombre: ");
	nombre2=entrada.next();
	
	System.out.println("Ingresar primera edad: ");
	edad1=entrada.nextInt();
	
	System.out.println("Ingresar segunda edad: ");
	edad2=entrada.nextInt();
	
	System.out.println("El primer nombre es: " + nombre1);
	System.out.println("El segundo nombre es: " + nombre2);
	
	System.out.println("La primera edad es: " + edad1);
	System.out.println("La segunda edad es: " + edad2);
	
	
	}
	
}