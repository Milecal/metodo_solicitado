package ejercicio30;

public class ejercicio30 {
	
	public static void main(String args[]) throws InterruptedException {
	
		for (int seguidor = 1; seguidor <= 100; seguidor++) {
			
			System.out.println("La cantidad de seguidores es: " + seguidor);
			Thread.sleep(50);
			
			if (seguidor == 100) {
			 System.out.println("LLEGASTE A LOS 100 SUSBCRIPTORES!!1!1!11! ");
			}
		}
	}
}
