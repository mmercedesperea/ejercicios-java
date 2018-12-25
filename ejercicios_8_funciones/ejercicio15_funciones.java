/*
 *Ejercicio 15
  Muestra los números primos que hay entre 1 y 1000.
 * 
 */

import funciones.primos;
public class ejercicio15_funciones {
	
	public static void main (String[] args) {
    
    System.out.print("Los numeros primos que hay entre 1 y 1000 son : \n");
    for( int i=2;i<1000;i++){
      if (funciones.primos.esPrimo(i)){
        System.out.print("  "+ i + " ");
      
      }
    }
  }
}


