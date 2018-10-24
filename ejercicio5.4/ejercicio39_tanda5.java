/*Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial.*/

public class ejercicio39_tanda5{
  public static void main (String [] args){
    
     int numero=0;
     int multiNumeros=1;
     int i=0;
  
    System.out.print("Dame un numero entero positivo para mostrarte los numeros del 1 a ese numero junto con su factorial\n");
    numero=Integer.parseInt(System.console().readLine());
    
      for (i=1; i<=numero; i++ ) {                        // en cada ronda el valor de i ira incrementando 1 
       multiNumeros= multiNumeros * i;                   //multinumeros se ira multiplicando por el valor que adquiere en cada pase por el valor de i en cada pase en la primera ronda seria 1* 1 en la segunda 1* 2 en la tercera 3 * 3 en la cuarta 6 * 4 y asi en cada vuelta
        System.out.printf("%d! = %d \n",i,multiNumeros);
      } 
  }
}
