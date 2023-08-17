package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int costo_i, descuento, costo_f;
	    
		
		System.out.println("Ingresar el costo de compra:");
		costo_i=entrada.nextInt();
		
		
		if(costo_i >= 15000 ){
			
			System.out.println("Se aplicara un descuento del 10%\n ");
			
			descuento = (int)(costo_i*0.10);
			
			costo_f =costo_i - descuento;
			
			System.out.println("Costo total: "+ costo_f);
		}
		
	}	
}