package ejercicio21;
import java.util.Scanner;

public class ejercicio21 {
	
	public static void main(String args[]) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		int temp=35;
		
		while (temp <= 100) {
			System.out.println("temperatura °C = " + temp);
			Thread.sleep(20);
			temp+=2;
			
			if (temp == 85){
		    System.out.println("CUIDADO TEMPERATURA PELIGROSA!!!!!!");
		    Thread.sleep(1000);
			}
			
	
		}
		
		System.out.println("VALOR EXTREMO APAGANDO PC!!!");
		
		}
}
