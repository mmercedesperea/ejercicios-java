/*Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.*/

public class ejercicio33_tanda5{
  public static void main (String [] args){
  
    int altura=0;
    int j;
    
    System.out.print("Introduzca la altura que quiere darle a la U: ");
    altura = Integer.parseInt(System.console().readLine());
     
     for (int i=1; i<altura; i ++ ) { 
        System.out.print("* "); 
        for(j=1; j<(altura-1); j++){   
          System.out.print("  ");         
        }
        System.out.print("*");       
        System.out.println("");              
     }
        System.out.print("  "); 
        for(j=1; j<=(altura-2); j++){   
         System.out.print("* ");         
        }         
  }
}
