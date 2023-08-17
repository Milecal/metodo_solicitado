package ejercicio28;

import java.util.Scanner;

public class ejercicio28 {
	public static void main(String args[]) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		int bateria = 100;
		
			while (bateria > 0) {
				bateria --;
				Thread.sleep(20);
				System.out.println("%"+bateria);
				
				if (bateria == 20) {
					Thread.sleep(1000);
					System.out.println("Bateria baja");
				}
			}
			
		System.out.println("Bateria agotada");
		
		}
	}