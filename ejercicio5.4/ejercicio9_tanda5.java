//Realiza un programa que nos diga cuántos dígitos tiene un número introducido
//por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
//la salvedad de que el anterior estaba limitado a números de 5 dígitos como
//máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
//esta manera, la única limitación en el número de dígitos la establece el tipo
//de dato que se utilice (int o long).

public class ejercicio9_tanda5 {
  public static void main(String[] args) {
    
    int numeroDigi=1;//numero de digito basico. 
   
    System.out.print("Introduce un numero y te dire cuantos digitos tiene: ");
    int numero= Integer.parseInt(System.console().readLine());
    
    while (numero > 10){    // mientras el numero sea mayor que 10.
        numero= numero/10;  // ve dividiendolo entre 10. 
        numeroDigi++;       //por cada division añade un 1 al numero de digitos.
      }
      System.out.print("Su numero tiene : "+ numeroDigi + " digitos");
      
  }
}
