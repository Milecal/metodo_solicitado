package ejercicio57;

import java.util.Scanner;

public class ejercicio57 {

	static float numfloat,numint;

	public static void numingresado() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero decimal: ");
		numfloat = entrada.nextFloat();
	}

	public static float pepe(float a, float b /* a toma el valor del numero ingresado */) {
		b = (int) a; // b pasa a valer "a" pero redondeada (25,00)   
		float resultado = a - b; // 25,5 - 25,0
		return resultado;
	}

	public static void main(String[] args) {

		numingresado();
		pepe(numfloat, numint);
		System.out.println(pepe(numfloat, numint));

	}
}