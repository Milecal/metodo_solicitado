package ejercicio60;

import java.util.Scanner;

public class ejercicio60 {

	static int cant;
	static int[] nota;
	static String[] apellido;
	
	public static int cantidad (int a) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de alumnos: ");
		cant = entrada.nextInt();
	
		return a;
	}

	public static void apellido () {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0 ; i < cant ; i++) {
			System.out.println("Ingrese el apellido: ");
			apellido[i] = entrada.next();
			
	    }
		public static void nota () {
			Scanner entrada = new Scanner(System.in);
			
			for (int i = 0 ; i < cant ; i++) {
				System.out.println("Ingrese su calificacion: ");
				nota[i] = entrada.nextInt();
				
	}

	public static void main (String[] args) {
		notayapellido();
	}
}