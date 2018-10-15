/*Escribe un programa que calcule la media de un conjunto de números positivos
  introducidos por teclado. 
  A priori, el programa no sabe cuántos números se introducirán. El usuario 
  indicará que ha terminado de introducir los datos cuando meta un número negativo.*/

public class ejercicio10_tanda5{
  public static void main (String[] args){
  
      int acumulador = 0;
      int numero=0;
      double solucion=0;
      int contador=0;
    
    while (numero >= 0){                  // mientras el numero sea mayor que 0.
      System.out.print("Introduce el numero que quiere sumar para su media (para terminar mete un negativo) : "); 
      numero= Integer.parseInt(System.console().readLine());
       if (numero > 0){                    // si el numero es mayor que 0.
         acumulador= acumulador + numero; // a acumulador se le suma el numero introducido en numero.
         contador ++;                     // y a contador se le añade uno.
       }
      }
      solucion= acumulador/contador;      // y la solucion es la division entre los numeros acumulados y los numeros introducidos en contador.
      System.out.print("La suma de " + acumulador +" y la media de estos numeros es : "+ solucion + " ");      
  }
}


 
