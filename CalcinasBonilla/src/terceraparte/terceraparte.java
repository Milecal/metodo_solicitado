package terceraparte;

import java.util.Scanner;

public class terceraparte {
	
	public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);
		
		char talle;
		int remeras_s, remeras_m, remeras_l, precio, descuento;
		
		System.out.println("Ingresar en letra mayuscula el talle(S,M,L): ");
        talle=entrada.next().charAt(0);
	
        switch (talle) {
        
        case 'S':
        	
        	System.out.println("\nIngrese la cantidad de remeras que desea comprar: ");
        	remeras_s=entrada.nextInt();
        			
        		if ( remeras_s > 30 ) {
        			System.out.println("No hay stock");
                }
        		else if ( remeras_s >= 15 ) {
        			
        			precio = 5000 * remeras_s;
        			descuento = (int)(precio*0.15);
        			
        			System.out.println("Se aplicara un descuento del 15%: "+ descuento);
        		}
        		else if ( remeras_s < 15 ) {
        			
        			precio = 5000 * remeras_s;
        			System.out.println("Costo total: " + precio);
        		}
        		
        break;
        
        case 'M':
        	
           	System.out.println("\nIngrese la cantidad de remeras que desea comprar: ");
        	remeras_m=entrada.nextInt();
        	
    		if ( remeras_m > 40 ) {
    			System.out.println("No hay stock");
            }
    		else if ( remeras_m >= 22 && remeras_m < 40 ) {
    			
    			precio = 5500 * remeras_m;
    			descuento = (int)(precio*0.15);
    			
    			System.out.println("Se aplicara un descuento del 15%: "+descuento);
    		}
    		else if ( remeras_m < 15 ) {
    			
    			precio = 5500 * remeras_m;
    			System.out.println("Costo total: " + precio);
    		}
    		
        break;
        
        case 'L':
        	
           	System.out.println("\nIngrese la cantidad de remeras que desea comprar: ");
        	remeras_l=entrada.nextInt();
        	
    		if ( remeras_l > 50 ) {
    			System.out.println("No hay stock");
            }
    		else if ( remeras_l >= 35 && remeras_l < 50 ) {
    			
    			precio = 5500 * remeras_l;
    			descuento = (int)(precio*0.15);
    			
    			System.out.println("Se aplicara un descuento del 15%: "+descuento);
    		}
    		else if ( remeras_l < 35 ) {
    			
    			precio = 5500 * remeras_l;
    			System.out.println("Costo total: " + precio);
    		}
    		
    	default: 
    		
    		System.out.println("Opcion incorrecta");
			break;
			
        }
        
	
	}

}
