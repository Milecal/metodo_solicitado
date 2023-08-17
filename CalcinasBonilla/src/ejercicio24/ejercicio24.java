package ejercicio24;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		char respuesta;
		boolean flag = false;
		
		do {
		System.out.println("¿puedo salir?");
		respuesta = datos.next().charAt(0);
		} while (respuesta == 'N' || respuesta != 'S' && flag == false);
		
		if (respuesta == 'S') {
			flag = true;
			System.out.println("fin del programa");
		}
	}
}