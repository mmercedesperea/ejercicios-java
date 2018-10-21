/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
  pedir por teclado. El carácter con el que se pinta la pirámide también se debe
  pedir por teclado, y el hueco de la piramide tiene que estar hueco.*/

public class ejercicio20_tanda5{
  public static void main (String[] args){
    
    String simbolo;
    int altura=0;
    int contadorEspacio=1;
    int j;
    System.out.print("Introduzca el simbolo que quiere pintar en pantalla: ");
     simbolo = System.console().readLine();
     
    System.out.print("Introduzca la altura que quiere darle a la piramide: ");
     altura = Integer.parseInt(System.console().readLine());
     
     for (int i=1; i<=altura-1; i++ ) {  //Bucle para pintar cada linea, si metes un 4 pintara 3 lineas.
        for(j=1; j<=(altura-i); j++){    // Blucle para pintar los espacios en blanco mientras j sea menos que la altura menos I.
         System.out.print(" ");          //Pinta un espacio en blanco en la linea
        }
         System.out.print(simbolo);      // y despues de ese espacio en blanco pinta el simbolo
         
        if ( i>=2){                               //si i es mayor que 2
          for (j=1; j<=contadorEspacio;j++){      //y mientras j es menor que contador de espacios j se ira cumpliendo
          System.out.print(" ");                  //pinta un espacio en esa linea
          }
          System.out.println(simbolo);            //Despues del espacio se va poniendo el simbolo
          contadorEspacio = contadorEspacio + 2;  //en cada ronda se iran sumando 2 a contador de espacios y se iran poniendo tantos espacios en cada linea por contadores de espacio se vayan incrementado
        }else{
        System.out.println("");
         }   
     }  
     for (int a=1; a<=altura;a++){
       System.out.print(simbolo+ " ");
       
       
     } 
  }
}

   
