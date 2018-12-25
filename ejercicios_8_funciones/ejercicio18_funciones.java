/*
 Ejercicio 18
 Escribe un programa que pase de decimal a binario.
 */

import funciones.Varias;
public class ejercicio18_funciones {
	
	public static void main (String[] args) {
    
    System.out.print("Vamos a pasar decimales a binarios, para ello deme un numero decimal\n");
    long decimal = Long.parseLong(System.console().readLine());
    
    long binario=1;
    
    while(decimal>0){
      binario=funciones.Varias.juntaNumeros(binario,(int)decimal%2);  // se le van a ir añadiendo numeros a un binario base que sean los restos del decimal entre 2
      decimal=decimal/2;                                             // se va dividiendo decimal 
     }
    binario=funciones.Varias.voltea(binario);                         // se voltea el resultado
    binario=funciones.Varias.quitaPorDetras(binario,1);               // se le quita la ultima cifra que corresponde al numero que usamos para añadirle cifras
    System.out.print(binario); 
	}
}

