/*
 Ejercicio 19
  Une y amplía los dos programas anteriores de tal forma que se permita
  convertir un número entre cualquiera de las siguientes bases: decimal, binario,
  hexadecimal y octal.
 */

import funciones.Varias;
public class ejercicio19_funciones {
	
	public static void main (String[] args) {
    
    //sacamos el binario
    System.out.print("Vamos a pasar decimales a binarios, para ello deme un numero decimal\n");
    long decimal = Long.parseLong(System.console().readLine());
    long binario=1;
    
    while(decimal>0){
      binario=funciones.Varias.juntaNumeros(binario,(int)decimal%2);  // se le van a ir añadiendo numeros a un binario base que sean los restos del decimal entre 2
      decimal=decimal/2;                                             // se va dividiendo decimal 
     }
    binario=funciones.Varias.voltea(binario);                         // se voltea el resultado
    binario=funciones.Varias.quitaPorDetras(binario,1);               // se le quita la ultima cifra que corresponde al numero que usamos para añadirle cifras
    System.out.println("El numero en binario seria "+binario); 
    
    //sacamos el decimal
      long deci=0;
    
    System.out.print("Vamos a pasar binarios a decimales, para ello deme un numero binario\n");
    long bi = Long.parseLong(System.console().readLine());
    
    int digitos=funciones.Varias.digitos((int)binario);
    
    for(int i=0;i<digitos;i++){
        deci=deci+ (funciones.Varias.digitoN(bi,digitos-i))* funciones.Varias.potencia(2,i);
      }
    System.out.print("El numero binario "+bi+ " en decimal seria: "+deci);
	}
}

