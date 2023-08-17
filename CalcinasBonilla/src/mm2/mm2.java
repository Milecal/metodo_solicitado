package mm2;
import java.util.Scanner;
public class mm2 {
	/*-Determiná la cantidad máxima y la cantidad mínima. Mostralas en pantalla.
	 * 
	-Ordená numéricamente de manera ascendente las cantidades.
	
	-Luego, mostrá el array ordenado en pantalla.
	
	-Descartar todas las cantidades mayores a 20, y mostrar en pantalla únicamente 
	las cantidades menores o iguales a 20.
	
	-Al final del programa, indicar el promedio de cantidades en el día.
	
	-Luego de terminar el algoritmo, entregar por classroom como "Apellido.zip", 
	en en cual se debe incluir el paquete (package) y la clase (class).
	
	-Se considerará para la evaluación:
	Que el algoritmo cumpla con los puntos anteriormente mencionados.
	
	-Cada frase mostrada en pantalla, debe estar expresada de manera prolija. 
	
	-La correcta indentación del código (o sea, que el código esté ordenado).
	
	-No es necesario comentar la sintaxis del programa.
*/
	
	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
	
		int[] milanesas = new int[3];
		int cant_max = 0, cant_min=100000;
		int hora = 10;
		for(int i = 0 ; i < milanesas.length; i++) {
			System.out.println("Cuantas milanesas hay a las " + hora + "hs: ");
			milanesas[i]=datos.nextInt();
			hora+=2;
			
			 if (milanesas[i] > cant_max) {
					cant_max = milanesas[i];
				}
				if (milanesas[i] < cant_min) {
					cant_min = milanesas[i];
				}
			}
	System.out.println("Cantidad maxima de milanesas: " +cant_max);
				System.out.println("Cantidad minima de milanesas: " +cant_min);
				
	for (int i = 0 ; i < milanesas.length ; i++) {
		for (int j = 0 ; j < milanesas.length ; j++) {
						
		if (milanesas[j] > milanesas[j+1]) {
		int temporal = milanesas[j];	
		milanesas[j] = milanesas[j + 1];	
		milanesas[j + 1] = temporal;			
	}
          System.out.println("\nLista ascendente de las cantdades de milanesas: ");
		
		     for (int num : milanesas) {
			  System.out.println(num + " ");
		}
						
						
		
	}	
}
