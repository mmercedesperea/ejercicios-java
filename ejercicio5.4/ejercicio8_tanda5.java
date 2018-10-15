//Muestra la tabla de multiplicar de un número introducido por teclado.

public class ejercicio8_tanda5 {
  public static void main(String[] args) {
    
    System.out.print("Dame el numero del que quiere saber su tabla de multiplicar");
    int numero = Integer.parseInt(System.console().readLine());
      
      for (int i=0; i <=10; i ++ ) {  
        int multiplicacion=numero * i;
        System.out.print(numero + " x " + i + " = " + multiplicacion +"\n");
         
    }
 }
}

