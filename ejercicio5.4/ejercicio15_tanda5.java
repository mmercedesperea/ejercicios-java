/*Escribe un programa que dados dos números, uno real (base) y un entero
  positivo (exponente), saque por pantalla todas las potencias con base el
  numero dado y exponentes entre uno y el exponente introducido. No se deben
  utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
  se deberán mostrar 21, 22, 23, 24 y 25.*/

public class ejercicio15_tanda5 {
  public static void main(String[] args) {
    
   int numero;
   int exponente;
   int resultado= 1;
   int numExp=0;
   
   System.out.print("Introduzca la base(entera): ");
   numero= Integer.parseInt(System.console().readLine());
   System.out.print("Introduzca el exponente(entero positivo): ");
   exponente= Integer.parseInt(System.console().readLine());
   
    for (int i=1; i <=exponente; i ++ ) {  
        numExp = numExp + 1;
        resultado = resultado * numero;
        System.out.print("La potencia de "+ numero + " elevado a "+ numExp + " es " + resultado + ".\n");
      } 
    }
      
  
  }

