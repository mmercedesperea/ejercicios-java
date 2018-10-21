/*Ejercicio 32
Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos pares.
Los dígitos pares se deben mostrar en orden, de izquierda a derecha.
Usa long en lugar de int donde sea necesario para admitir números largos.*/

public class ejercicio32_tanda5{
  public static void main (String [] args){
    
    long numero=0;
    int digi=0;
    int posi=1;
    long numeroOriginal=0;
    long vuelta=0;
    int longitud=0;
    long sumaPares=0;
    
    System.out.print("Dame un numero entero positivo y te dire cuales son y cuanto suman los digitos pares que lo componen: \n");
    numeroOriginal= Long.parseLong(System.console().readLine());
    
     numero=numeroOriginal;
     
      while (numero>0){                  
        vuelta=(vuelta*10)+ (numero%10);  
        numero= numero/10;               
        longitud++;                       
      }
    
      while (vuelta>0){                 
        if(((vuelta%10)%2)==0){          
          System.out.printf(vuelta%10+ " ");
          sumaPares= sumaPares + vuelta%10;
        }
        vuelta=vuelta/10;               
         
      }    
      System.out.println();
      System.out.printf("La suma total de los numeros pares da : %d",sumaPares);   
  }
}
