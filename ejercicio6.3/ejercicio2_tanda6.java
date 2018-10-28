/*Realiza un programa que muestre al azar el nombre de una carta de la
baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
sería el 1). Para convertir un número en una cadena de caracteres podemos
usar String.valueOf(n).*/

public class ejercicio2_tanda6 {
  public static void main(String[] args) {
    
    String carta = " ";                               //Declaramos la string carta como ""
    String palo = " ";                                //Declaramos la string tipo como ""
    
    System.out.print("Vamos a sacarte una carta de la baraja francesa al azar :\n");
    System.out.println();
    
    int nombre= (int)(Math.random()*4) + 1 ;          //Ahora elegimos un numero aleatorio entre 0 y 4 ( el +1 hace que empecemos desde el 1 y no contemos el 0)
   
     switch (nombre){                                 // ahora entre que salga un 1 y un cuatro tipo se convertira en el que le toque
         
       case 1:
       palo= "Picas";
       break;
       
       case 2:
       palo="Corazones";
       break;

       case 3:
       palo="Diamantes";
       break;
       
       case 4:
       palo="Treboles";
       break;
     }
     
     int numero= (int)(Math.random()*13)+1 ;       // finalmente entre 0 y 13 empezando por el 1 (gracias al +1) elegimos un numero
     
     switch (numero){
       
       case 1:
       carta= "A";
       break;
       
       case 11:
       carta= "J";
       break;
       
       case 12:
       carta= "Q";
       break;
       
       case 13:
       carta= "K";
       break;
       
     default:
      carta = String.valueOf(numero);                      // convertimos el valor de palo ( que es un int) a un String , carta que es un string cogera el valor que de el palo que es int
    }
    System.out.println("La carta que ha salido es el " + carta + " de " + palo);
     
  }
}
