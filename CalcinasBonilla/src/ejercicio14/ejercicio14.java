package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Ingresar un numero para realizar la divisi�n: ");
		numero=entrada.nextInt();
		
		
		if(numero != 0) {
			
			System.out.println("Se pude realizar la operaci�n");
		}
		else {
			
			System.out.println("No se pude realizar la operaci�n");
		}
		
	}
	

}
