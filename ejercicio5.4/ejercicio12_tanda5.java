/*Escribe un programa que muestre los n primeros términos de la serie de
  Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
  y el resto se calcula sumando los dos anteriores por lo que tendríamos que
  los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
  debe introducir por teclado.*/

public class ejercicio12_tanda5{
  public static void main (String[] args){
    
   int n=0;
   int numero1=0;
   int numero2=1;
   
   System.out.print("Escribe cuantos numeros de la serie de Fibonacci que desea saber : ");
   n= Integer.parseInt(System.console().readLine());
   
    if(n==1){
      System.out.println("El termino que queria es: ");
      System.out.println(" 0 ");
    }
    
    if (n==2){
      System.out.println("El termino que queria es: ");
      System.out.println(" 0 ");
      System.out.println(" 1 ");
    }
    
    else if (n>2){
      System.out.println("El termino que queria es:   ");
      System.out.println(" 0 ");
      System.out.println(" 1 ");
     
        for (int i=3; i <=n; i ++ ) {     
        int aux= numero1;
        numero1= numero2;
        numero2 = aux + numero2;
        System.out.print(" " + numero2 + "\n");
      }
   }  
  }
}

