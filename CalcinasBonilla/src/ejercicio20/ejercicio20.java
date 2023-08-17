package ejercicio20;

import java.util.Scanner;

public class ejercicio20 {
	public static void main(String args[]) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		int seguidores=1;
		
		while (seguidores <= 100) {
			System.out.println("sub n° "+ seguidores);
			Thread.sleep(20);
			seguidores++;
			
			if (seguidores == 100) {
				
				System.out.println("LLEGASTE A LOS 100 SUSBCRIPTORES!!1!1!11! ");
			}
			
			
		}
	}
}
