package ejercicio42;

import java.util.Scanner;

public class ejercicio42 {
	
	public static void main (String args []) {
	
		Scanner datos = new Scanner (System.in);
		
		String[] nom = { "Messi", "Maradona", "Aymar", "Gallardo", "Palermo", "Riquelme", "Vagoneta", "Eito", "Leybovich", "Raffo" } ;
		
		for (String nom2 : nom) {
			System.out.println(nom2);
		}

	}

}
