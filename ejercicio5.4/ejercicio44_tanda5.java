/*Escribe un programa que sea capaz de insertar un dígito dentro de un número
indicando la posición.El nuevo dígito se colocará en la posición indicada y el
resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
correctamente los datos. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.*/

public class ejercicio44_tanda5 {
  public static void main(String[] args) {
    
    long numeroOriginal=0;
    int posicion=0;
    int cifra=0;
    long numeroN=0;
    long numeroN2=0; 
    long vuelta=0;
    long numero=0;
    long cantidad=0;
    
    System.out.print("Introduzca un numero entero positivo: \n");
    numeroOriginal= Long.parseLong(System.console().readLine());
    
    System.out.print("Introduzca la posicion donde quiera insertar el numero: \n");
    posicion=Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el numero que quiere insertar: \n");
    cifra=Integer.parseInt(System.console().readLine());
    
    numero=numeroOriginal;
    
    while(numero>0){
      vuelta=(vuelta*10)+(numero%10);
      numero= numero/10;
      cantidad++;
      }
      
      
     for(int i=0; i< posicion-1; i++){
       numeroN=(vuelta%10);
       vuelta=vuelta/10;
       System.out.print(numeroN);
      }
      
      System.out.print(cifra);
 
      for (int i=0; i <(cantidad-posicion)+1;i++){
        numeroN2=(vuelta%10);
        vuelta=vuelta/10;
        System.out.print(numeroN2);
        }
  }
}
