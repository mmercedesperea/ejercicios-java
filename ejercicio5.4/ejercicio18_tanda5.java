/*Escribe un programa que obtenga los números enteros comprendidos entre
  dos números introducidos por teclado y validados como distintos, el programa
  debe empezar por el menor de los enteros introducidos e ir incrementando de
  7 en 7.*/

public class ejercicio18_tanda5 {
  public static void main(String[] args) {
    
   int numero;
   int numero2;
   int aux=0;
   
   System.out.print("Introduce el primer numero:  ");
   numero = Integer.parseInt(System.console().readLine());
   
   System.out.print("Introduce el segundo numero:  ");
   numero2 = Integer.parseInt(System.console().readLine());
   
   if (numero==numero2){
     System.out.println("Los valores introducidos no son validos.");
   } else if (numero>numero2){
          aux= numero;
          numero=numero2;
          numero2=aux;
      }  
     
   for (int i=numero; i <numero2; i +=7){ 
      System.out.printf( " %d " , i );
   }     
  }
}



