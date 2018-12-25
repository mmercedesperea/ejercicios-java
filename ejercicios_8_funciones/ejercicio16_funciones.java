/*
 Ejercicio 16
 Muestra los números capicúa que hay entre 1 y 99999.
 */

import funciones.capicua;             //importamos el paquete 
public class ejercicio16_funciones {
	
	public static void main (String[] args) {
    
     System.out.print("Los numeros capicuas que hay entre 1 y 99999 son : \n");
    for( int i=1;i<=99999;i++){
      if (funciones.capicua.esCapicua(i)){
        System.out.print("  "+ i + " ");
      
      }
    }
    
    
    
		
	}
}

