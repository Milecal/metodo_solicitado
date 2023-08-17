package ejercicio55;

import java.util.Scanner;

public class ejercicio55 {

	static float n1;

	public static void ingresarnum() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa el numero: ");
	    n1 = entrada.nextFloat();
	}

	public static float alcuadrado (float a) {
	    float resul = a * a;
	    return resul;
	}
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	    ingresarnum();
	    alcuadrado(n1);
	    System.out.println("Resultado: " + alcuadrado(n1));   
	}
	
}
