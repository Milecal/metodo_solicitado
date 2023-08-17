package repaso2;

import java.util.Scanner;

public class repaso2 {

	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
	
		String[] apellido = { "Ugarte", "Equise", "Calcinas"};
		int[] edad = { 6, 26, 20 };
		int[] dni = { 665544, 887766, 998844 };
		
		String[] marca = { "Chevrolet", "Peugeot", "Renault" };
		String[] modelo = { "Corsa", "208", "Sandero" };
		int[] anio = { 2018, 2021, 2022 };
		String[] patente = { "AD178JK", "AD200RS", "AD202VW" };
		
		for (int i = 0; i < 3; i++) {
			if (anio[i] > 2020 && edad[i] > 25) {
				System.out.println("El auto " + marca[i] + " " + modelo[i] + " con patente " + patente[i] + " pertenece a " + apellido[i] + " que tiene " + edad[i] + " y su dni es " + dni[i]);
			} 
		}
	}
}
