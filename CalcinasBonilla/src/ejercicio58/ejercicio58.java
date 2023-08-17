 /* Desafío 58) Se le solicita a un usuario
*  que ingrese un número (puede ser entero o flotante). 
*  Armar una función para el ingreso de ese número.
*  Luego, armar otra función que devuelva “true” si el número es positivo,
*   o “false” si es negativo. Mostrar en pantalla el resultado de la función.
*/
package ejercicio58;

import java.util.Scanner;

public class ejercicio58 {
	
	
	static float n1;
	
	public static void numingresado() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		n1 = entrada.nextFloat();
	}
	
	
	public static float numeroPoN(float a) {
		
		boolean flag = false;
		
		if (a > 0) {
			flag = true;
			System.out.println("\nNumero positivo");
		}
		
		else if (a < 0) {
			System.out.println("\nNumero negativo");
		}	
		
		else {
			System.out.println("\nNumero neutro");
		}
		return a;
	}
	
	public static void main(String[] args) {
		numingresado();
		numeroPoN(n1);
	}
	
}
