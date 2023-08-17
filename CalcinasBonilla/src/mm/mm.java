package mm;
import java.util.Scanner;
public class mm {

	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
	
	
		int[] legajo = new int[5];//cantidad de datos, casillas que ingresaran. es un limite//
		String[] apellido =new String[5];//cantidad de caracteres a ingresar//
		int[] calificacion = new int[5];
		int nota_max=0, nota_min=11, prom=0;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Ingrese numero de legajo: ");
			legajo[i]=datos.nextInt();
		}
		
		for(int i = 0 ; i < apellido.length; i++) {
		 System.out.println("\nIngrese su apellido: ");
		 apellido[i] = datos.next();

		 System.out.println("Ingrese su calificacion: ");
		 calificacion[i]=datos.nextInt();
		 
		 if (calificacion[i] > nota_max) {
				nota_max = calificacion[i];
			}
			if (calificacion[i] < nota_min) {
				nota_min = calificacion[i];
			}
			prom += calificacion[i];
		}
		
		for(int i = 0 ; i < apellido.length; i++){
			System.out.println("Apellido: " +apellido[i]+ ", numero de legajo: "+legajo[i]+ ", calificacion: " +calificacion[i]);
		}
		
		int promedio = prom / 5;
		
		for (int i = 0 ; i < 1 ; i++) {
		
			if (nota_max == calificacion[i])
		System.out.println("\nLa calificacion maxima pertenece a: " + apellido[i] + " - " +nota_max);
		System.out.println("La calificacion minima pertenece a: " + apellido[i] + " - " + nota_min);
		
        System.out.println("\nPromedio de los examenes: " +promedio);
}
}