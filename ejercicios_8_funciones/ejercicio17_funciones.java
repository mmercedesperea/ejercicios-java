/*
 *Ejercicio 17
  Escribe un programa que pase de binario a decimal.
 * 
 */

import funciones.Varias;
public class ejercicio17_funciones {
	
	public static void main (String[] args) {
    
     long decimal=0;
    
    System.out.print("Vamos a pasar binarios a decimales, para ello deme un numero binario\n");
    long binario = Long.parseLong(System.console().readLine());
    
    int digitos=funciones.Varias.digitos((int)binario);
    
    for(int i=0;i<digitos;i++){
        decimal=decimal+ (funciones.Varias.digitoN(binario,digitos-i))* funciones.Varias.potencia(2,i);
      }
    System.out.print("El numero binario "+binario+ " en decimal seria: "+decimal);
  
	}
}

