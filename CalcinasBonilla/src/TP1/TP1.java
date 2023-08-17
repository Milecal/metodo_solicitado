package TP1;

import java.util.Scanner;

public class TP1 {
	public static void main (String[] args) {
		Scanner datos = new Scanner (System.in);
		// funcion principal
		
		int opc;
		//declaracion de variable
		
		System.out.println("\tEste programa te permite resolver algunos problemas");
		System.out.println("\nElegí una opción: ");
		System.out.println("1. Calcular raiz cuadrada.");
		System.out.println("2. Analizar si un numero es positivo, negativo o cero.");
		System.out.println("3. Jugar al bingo." );
		// comandos que aparecen en pantalla
		
		opc = datos.nextInt();
        // se guardan los datos que se ingresan en el syso
		
		switch (opc /*condicion a analizar*/) {
        // condicion que analiza de que opcion se comienza a ejecutar
		
		case 1:
		// opcion de switch
			
			double num_raiz;
			// double: variable que duplica el numero que se ingrese
			
			System.out.println("Ingresa un número para calcular su raiz cuadrada: ");
			num_raiz = datos.nextDouble();
			
			if (/*es una condicion de num_raiz mayor o igual a 0*/ num_raiz >= 0 /*condicion*/) {
			// if es una instruccion que ejecuta si o si
				
				double raiz_cuadrada /*potencia*/= Math.sqrt(num_raiz /*base*/);
				// calcula raiz cuadrada
				System.out.println("El resultado es: " + /*se muestra la variable raiz_cuadrada junto con el syso*/raiz_cuadrada);
			}
			 else {	     
				 
				System.out.println("No se puede calcular la raiz de un negativo.");
			}
			
		break;
        // indica cuando termina case
			
		case 2:
			
			int num;
			
			System.out.println("Ingresa un numero: ");
			num = datos.nextInt();

			if (/*si num es igual a 0*/ num == 0) {
				System.out.println("El numero es cero");
			} else if (/*si no si num mayor a 0*/ num > 0) {
		    // instruccion que indica si no si se cumple la condicion
				
				System.out.println("El numero es positivo");
			} else {
			// si no se cumple ninguna de las anteriores condiciones
				
				System.out.println("El numero es negativo");
			}

		break;

	  	case 3:
	  		
	  		int num_bingo;
	  		
			System.out.println("Ingresa un numero entre 0 y 9: ");
			num_bingo = datos.nextInt();

			int num_ganador = (int) /* se pone entre parentesis para cambiar el tipo de variable*/ (Math.random /*numero aleatorio*/() * 9);

			System.out.println("El numero ganador es: " + num_ganador);
			
			if (num_bingo == num_ganador) {
				System.out.println("Ganaste!");
				
			} else {
				System.out.println("Perdiste :(");
				
			}

		default:
	    // si se ingresa algo que no esta dentro de las opciones (case)
			
			System.out.println("Opcion incorrecta.");
			
			break;

		}
	}

}