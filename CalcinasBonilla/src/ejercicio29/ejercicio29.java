package ejercicio29;

public class ejercicio29 {

	public static void main(String args[]) throws InterruptedException {
		
		for (int bateria = 100; bateria >= 0; bateria--) {
			System.out.println("%"+bateria);
			Thread.sleep(20);

			if (bateria == 20) {
				Thread.sleep(1000);
				System.out.println("Bateria baja");
			}
		}
		
		System.out.println("Bateria agotada");
		
	}
}