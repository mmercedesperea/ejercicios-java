/*Realiza un programa que sume los 100 números siguientes a un número entero
  y positivo introducido por teclado. Se debe comprobar que el dato introducido
  es correcto (que es un número positivo).*/

public class ejercicio17_tanda5 {
  public static void main(String[] args) {
    
   int numero;
   int almacen=0;
   int suma;
   
   System.out.print("Introduce el numero entero y positivo del que quiere saber sus 100 siguientes numeros:  ");
   numero = Integer.parseInt(System.console().readLine());
   suma = numero; 
   
   if (numero <= 0){
     System.out.print("El dato es incorrecto, debe de ser un numero positivo.");
    } else {
       for (int i=0; i <=100; i ++){ 
        almacen = numero ++; 
        suma = suma + almacen;
      }            
      System.out.print("El resultado de la suma es : " + suma + ".");
    }
  }
}

