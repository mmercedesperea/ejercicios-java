/*Ejercicio 13
Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.*/

public class ejercicio_13_tanda6 {
  public static void main(String[] args) {
    
    int dado1=0;
    int dado2=0;
    
    do{

    dado1=(int)(Math.random()*6)+1;
    System.out.println("El dado 1 da: "+dado1);
    
    dado2=(int)(Math.random()*6)+1;
    System.out.println("El dado 2 da: "+dado2);
    
    System.out.println();
    
    }while (dado1 !=dado2);

  }
}
