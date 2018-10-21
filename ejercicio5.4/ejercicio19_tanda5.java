/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
  pedir por teclado. El carácter con el que se pinta la pirámide también se debe
  pedir por teclado.*/

public class ejercicio19_tanda5{
  public static void main (String[] args){
    
    String simbolo;
    int altura=0;
    int contadorSimbolos=1;
    int j;
    
    System.out.print("Introduzca el simbolo que quiere pintar en pantalla: ");
     simbolo = System.console().readLine();
     
    System.out.print("Introduzca la altura que quiere darle a la piramide: ");
     altura = Integer.parseInt(System.console().readLine());
     
     for (int i=1; i<=altura; i ++ ) {  //Bucle para pintar cada linea. si altura fuera 5 pintaria cada linea 5 veces
        for(j=1; j<=(altura-i); j++){   // Blucle para pintar los espacios en blanco. en la primera ronda pintaria un espacio en blanco continuo hasta llegar a altura-i que en este caso seria 5-1 y ya saltaria al siguiente for.
         System.out.print(" ");       
        }
        for(j=1; j<=contadorSimbolos;j++){  //bucle para pintar los caracteres de la piramide. pintaria 1 simbolo hasta llegar al numero de contadores de simbolos, que en esta ronda equivale a 1
         System.out.print(simbolo);         //pintaria 1 simbolo y despues terminaria el for 
        }
        System.out.println("");             // se pone un salto de linea para pasar a la siguiente fila (println)                      
        contadorSimbolos = contadorSimbolos + 2;  // al final de la ronda se le van añadiento 2 al contadorsimbolos para que asi cuando al for j le toque pintar el simbolo lo haga añadiendo dos mas cada vez.
     }
  }
}




   
