package operacionmatematica;

import java.util.Scanner;

public class operacionmatematica {

	public static void main(String args[]) {
		Scanner entrada = new Scanner (System.in);
		
		float num1, num2, num3, num4, suma, resta, multip, div, resto;
		
		System.out.println("\tOperaciones matematicas");
		System.out.println("Escriba un numero: ");
		num1 = entrada.nextFloat();
		System.out.println("Escriba otro numero: ");
		num2 = entrada.nextFloat();
		System.out.println("Escriba otro numero: ");
		num3 = entrada.nextFloat();
		System.out.println("Escriba otro numero: ");
		num4 = entrada.nextFloat();

        System.out.println("Los resultados, son: ");
		suma = num1+ num2; 
		resta = num3-num4;
		multip = num1*num2;
		div = num3/num4;
		resto = num1%num2;
		
		System.out.println("Resultado de la suma:"+suma);
		System.out.println("Resultado de la resta:"+resta);
		System.out.println("Resultado de la multiplicacion:"+multip);
		System.out.println("Resultado de la division:"+div);
		System.out.println("El resto de la division es: "+resto);
		
	}
	
}
