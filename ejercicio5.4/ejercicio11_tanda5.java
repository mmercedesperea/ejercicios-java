/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
  los 5 primeros números enteros a partir de uno que se introduce por teclado.*/

public class ejercicio11_tanda5{
  public static void main (String[] args){
    
    int count=0;
     
    System.out.print("Dame el numero del que quiere obtener el cuadrado y el cubo: ");
    int numero = Integer.parseInt(System.console().readLine());
      
      for (int i=0; i <=5; i ++ ) {  
        count= numero ++;
        int cuadrado= count *count;
        int cubo= count * count * count;
        System.out.print(" El numero " + count + " es al cuadraro "+ cuadrado + " y es al cubo "+ cubo + ". \n");
         
    }
 }
}
  
  
  
  
