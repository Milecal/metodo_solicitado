package ejercicio9;

import java.util.Scanner;

public class ejercicio9 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String nombre;
		String apellido;
		
		System.out.println("Ingresar nombre y apellido: ");
		nombre=entrada.next();
		apellido=entrada.next();
		
		int bingo= (int)(Math.random()*99);
		
		System.out.println("Nombre y apellido: " + nombre + apellido);
		System.out.println("Numero: " + bingo);
	}
}
