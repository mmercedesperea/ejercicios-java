/*Ejercicio 14
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
El programa intentará adivinar el número que estás pensando - un número
entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
programa debe preguntar si el número que estás pensando es mayor o menor
que el que te acaba de decir.*/

public class ejercicio_14_tanda6 {
  public static void main(String[] args) {
    
    int intentos=5;
    int numero;
    
    String numeroPensado;
    String posicion;
    
    System.out.print("Vamos a adivinar el numero que estas pensando, para ello piensa un numero del 0 al 100.\n");
    
    numero=(int)(Math.random()*100);                 //sacamos un numero inicial
      System.out.println(numero);
      
    int maxi=100;
    int mini=0;
    
    do{
      intentos--;
      System.out.print("¿Es este el numero que estas pensando ( si o no )?");    
      numeroPensado =(System.console().readLine());
      
      if (numeroPensado.equals("no")){   
        System.out.print("¿Es el numero mayor o menor?");
        posicion =(System.console().readLine());
     
        if (posicion.equals("mayor")){
          mini=numero+1;
          numero=(int)(Math.random()*(maxi-mini)+mini);
          System.out.println(numero);
        }else if (posicion.equals("menor")){
            maxi=numero-1;
            numero=(int)(Math.random()*(maxi-mini)+mini);
            System.out.println(numero);
            }
       }
      }while((! "si".equals (numeroPensado))&&(intentos!=0));
      
        if (numeroPensado.equals("si")){
          System.out.printf("He adivinado el numero pensado y es : %d.",numero);
        }else{
          System.out.print("Los intentos se han agotado");
          }
  }
}
