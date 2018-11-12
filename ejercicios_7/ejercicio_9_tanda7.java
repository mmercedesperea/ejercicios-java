/*Ejercicio 9
Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra par o impar según proceda.*/

public class ejercicio_9_tanda7 {
  public static void main(String[] args) {
    
     System.out.print("Dame 8 numeros enteros\n");
     
     int [] numero=new int [8];
    
      for(int i=0;i<8;i++){
        System.out.print("Introduce un numero : ");
        numero[i]=Integer.parseInt(System.console().readLine()); 
      }
  
    for(int i=0;i<8;i++){
      System.out.print ( numero[i]);
       // Se comprueba que el numero es par o impar 
      if (numero[i] % 2 !=0){                        // si el numero dividido por 2 no da 0 entonces es impar.
        System.out.print( " Impar\n");  
        } else {System.out.print ( " Par\n");
          }
    }
  }
}
