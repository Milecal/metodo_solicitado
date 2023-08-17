package ejercicio56;

import java.util.Scanner;

public class ejercicio56 {

	static String nom, apellido;
	static float asist, clases;
	
	public static void nom() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa tu nombre: ");
	    nom = entrada.next();
	    System.out.println("Ingresa tu apellido: ");
	    apellido = entrada.next();
	}
	
	public static void cant() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nIngrese la cantidad de asistencias: ");
		asist = entrada.nextFloat();
		System.out.println("Ingrese la cantidad de clases totales: ");
		clases = entrada.nextFloat();
	}
	
	public static float porcentajeasistencias(float a, float b) {
		float result = a / b * 100;
		return result;
	}
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		nom();
		cant();
		porcentajeasistencias(asist, clases);
		System.out.println("Porcentaje de asistencias: " + porcentajeasistencias(asist, clases) + "%");
	}
}