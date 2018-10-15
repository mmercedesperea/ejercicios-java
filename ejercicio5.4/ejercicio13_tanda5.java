/*Escribe un programa que lea una lista de diez números y determine cuántos
  son positivos, y cuántos son negativos.*/

public class ejercicio13_tanda5{
  public static void main (String [] args){
    
   int positivos=0;
   int negativos=0;
   
   System.out.print("Introduzca 10 numeros y determinaremos cuales son positivos y cuales negativos: \n");
    
    for (int i=1; i<=10; i ++ ) { 
      int numero =Integer.parseInt(System.console().readLine());
      if (numero>=0){
        positivos ++;
      }
      if (numero<0){
        negativos++;
      }
    }
  System.out.printf("Usted ha metido %d numeros positivos. \n",positivos);
  System.out.printf("Usted ha metido %d numeros negativos. \n",negativos);        
  }
}
