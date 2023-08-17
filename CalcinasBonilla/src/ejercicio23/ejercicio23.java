package ejercicio23;

import java.util.Scanner;

public class ejercicio23 {
	public static void main(String args[]) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Ingrese un numero: ");
		num1=datos.nextInt();
		System.out.println("Ingrese otro numero: ");
		num2=datos.nextInt();
		
		int suma= num1+num2;
		
		System.out.println("El resutado es: "+suma);
		
		System.out.println("Ingrese 0 para salir del programa: ");
		num3=datos.nextInt();
				
			while (num3 != 0) {
				System.out.println("Ingrese un numero: ");
				num1=datos.nextInt();
				System.out.println("Ingrese otro numero: ");
				num2=datos.nextInt();
				
				 suma= num1+num2;
				 
				 
				System.out.println("El resutado es: "+suma);
				
				System.out.println("Ingrese 0 para salir del programa: ");
				num3=datos.nextInt();
				
				
			}
			if (num3 == 0) {
					System.out.println("Saliste del programa");
				}
}
}