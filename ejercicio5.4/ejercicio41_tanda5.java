/*Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.*/

public class ejercicio41_tanda5{
  public static void main (String[] args){
  
  long numero=0;
  long numeroOriginal=0;
  
  int par=0;
  int impar=0;

  System.out.print("Dame un numero y te dire cuantos digitos pares y cuantos impares lo componen:\n");
    numeroOriginal=Long.parseLong(System.console().readLine());
    
     numero=numeroOriginal;

      while (numero>0){                 
        if((numero%10)%2==0){         
          par++;
        }else {impar++;}
        numero=numero/10;              
      }   
      
      System.out.printf("El numero %d tiene %d digitos pares y %d digitos impares. ",numeroOriginal,par,impar);  
  }
}
  
  
