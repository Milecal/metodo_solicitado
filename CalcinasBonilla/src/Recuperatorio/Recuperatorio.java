package Recuperatorio;
import java.util.Scanner;
public class Recuperatorio {
/*Se le da un programa a un empleado administrativo para que ingrese él, 
 los datos de 4 empleados nuevos.

Para lo solicitado anteriormente, armá el algoritmo con estas características:
Se le solicita que ingrese el número de legajo de cada empleado,
 que es un número de cinco cifras (ejemplo: 45876).
Si se ingresa un número mayor a 99999 y menor a 10000, descartar el número de legajo,
 y disminuir el iterador del for en 1, para poder seguir almacenando 4 números de legajo.
Ordenar de manera ascendente los números de legajo.
Luego, debe ingresar 4 apellidos de los 4 empleados.
También debe ingresar el sueldo de cada uno de ellos.
Determinar sueldo máximo y mínimo.
Mostrar en pantalla el apellido de cada empleado, su número de legajo, y su sueldo.
Mostrar también en pantalla sueldo máximo y mínimo. */
	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
		
		int[] legajo = new int [4];
		String[]apellido = new String[4];
		int[] sueldo = new int [4];
		int s_max= 0, s_min=100000;
		
		 for(int i = 0; i < 4; -1-i) {
			 System.out.println("Ingrese un numero legajo: ");
			 legajo[i]=datos.nextInt();
			 
		 }
			 for (int i = 0 ; i < legajo[i-1]; i++) {
				
					for (int j = 0 ; j < legajo[i] ; j++) {
					if (legajo[j] > legajo[j+1]) {
					int temporal = legajo[j];	
					legajo[j] = legajo[j + 1];	
					legajo[j + 1] = temporal;	
					
					System.out.println("Lista oredenada de numero legajo: ");
					
					for (int num : legajo) {
						  System.out.println(num + " ");
				}
		 }
					

		for( i = 0; i < 4; i++) {
		  System.out.println("Ingrese su apellido: ");
		   apellido[i]=datos.next();
		     
		  System.out.println("Ingrese su sueldo: "); 
		  sueldo[i]=datos.nextInt();
		  
		  if (sueldo[i] > s_max) {
				s_max = sueldo[i];
			}
			if (sueldo[i] < s_min) {
				s_min = sueldo[i];
			}
		}
		
		System.out.println(apellido[i]+" su numero legajo es: " +legajo[i]+ ", su sueldo es de:" +sueldo[i]);
        System.out.println("El maximo sueldo es de: " +s_max );
	}	
}
}
}
