package ejercicio36;

import java.util.Scanner;

public class ejercicio36 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		int ganancia, gananciamax = 0, gananciamin = 100000, total = 0, horamax = 0, horamin = 0;
		
		for (int hora = 8; hora <= 17; hora++) {

			System.out.println("Ingrese la ganancia de las "+hora+"hs: ");
			ganancia = entrada.nextInt();
			
			if (ganancia > gananciamax) {
				gananciamax = ganancia;
				horamax = hora;
			}

			if (ganancia < gananciamin) {
				gananciamin = ganancia;
				horamin = hora;
			}
			
			total += ganancia;
				
		}
		
		System.out.println("El ingreso mayor fue a las" + horamax + "hs: " + gananciamax);
			System.out.println("El ingreso menor fue a las" + horamin + "hs: " + gananciamin);
			System.out.println("El ingreso total fue de: " + total);
	
	}
}