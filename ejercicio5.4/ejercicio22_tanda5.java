/*Ejercicio 22
  Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.*/
  
public class ejercicio22_tanda5 {
  public static void main(String[] args) {
  
   boolean primo =true;                                        //primo va a ser true hasta que se diga lo contrario
   
   System.out.print("Vamos a mostrar todos los numeros primos entre 2 y 100 /n");
  
    for (int numero=2; numero <100; numero ++) {  // numero comienza en 2 y va a ir incrementando en cada bucle 1 numero
      primo=true;                                 // Al empezar el bucle si este termino siendo false volvera a ser true
        for(int a = 2; a <numero; a++){            // a comienza siendo 2 en cada ronda del bucle y se ira incrementando en cada ronda hasta que sea igual que el numero del bucle principal.
          if ((numero % a)==0){                    // se va a ir comprobando que ningun numero menor que el numero dividido con el el resto de 0. 
           primo= false;                           // si el numero da 0 primo sera false por lo tanto el numero no es primo
          }
        }
        if (primo==true){                         // Si al terminar la ronda primo es true ( que seria si no ha dado 0 en el segundo bucle ) este se mostrara por pantalla.
          System.out.print(" \n"+numero+ "");
        }     
    }
 } 
}

