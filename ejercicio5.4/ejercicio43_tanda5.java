/*Escribe un programa que permita partir un número introducido por teclado en
dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
el número introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en
este ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena).*/

public class ejercicio43_tanda5{
  public static void main (String[] args){
    
    int numeroOriginal=0;
    int partir=0;
    int vuelta=0;
    int numero=0;
    int cifra=0;
    int cifra2=0;
    int cantidad=0;
    
    System.out.print("Vamos a partir numeros , dame un numero con minimo dos digitos : \n");
    numeroOriginal=Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora dame la posicion en la que quieres partirlo (a partir del 2) : \n");
    partir=Integer.parseInt(System.console().readLine());
    
    System.out.print("El numero partido es: \n");
    
    numero=numeroOriginal;
     
    while (numero>0){                  // le damos la vuelta al numero
      vuelta=(vuelta*10)+(numero%10);
      numero=numero/10;
      cantidad ++;
    }
   
    for (int i=0 ; i <partir; i++){  // vamos sacando las primeras cifras
      cifra=(vuelta %10);  
      vuelta=vuelta/10;
      System.out.print(cifra);
    }
        
    System.out.print("---");
        
    for (int i=0; i <(cantidad-partir); i++){  // sacamos las siguientes cifras
      cifra2=(vuelta%10);
      vuelta=vuelta/10;
      System.out.print(cifra2);
    }  
  }
}
