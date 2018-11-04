/*Ejercicio 23
Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
Ejemplo 1:
Q J 7 J As
Ejemplo 2:
K 8 J As 7*/

public class ejercicio_23_tanda6 {
  public static void main(String[] args) {
    
    int dado=0;
    
    for(int i=0; i<5;i++){
    
      dado=(int)(Math.random()*6);
      
        switch (dado){
          
          case 0:
          System.out.print("As");
          break;
          
          case 1:
          System.out.print("K");
          break;
          
          case 2:
          System.out.print("Q");
          break;
          
          case 3:
          System.out.print("J");
          break;
          
          case 4:
          System.out.print("7");
          break;
          
          case 5:
          System.out.print("8");
          break;
          
          }
        System.out.print(" ");
      
    }
  }
}
