/*Ejercicio 21
Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. 
* 
* Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.
Ejemplo:
2 céntimos - cara
20 céntimos - cruz
50 céntimos - cruz
1 euro - cruz
2 euros - cara*/

public class ejercicio_21_tanda6 {
  public static void main(String[] args) {
    
    for(int i=0;i<5;i++){
      System.out.print("Su moneda es : ");
      
      int tipo=(int)(Math.random()*8);
      switch (tipo){
        case 0:
        System.out.print("1 centimo");
        break;
        case 1:
        System.out.print("2 centimo");
        break;
        case 2:
        System.out.print("5 centimos");
        break;
        case 3:
        System.out.print("10 centimos");
        break;
        case 4:
        System.out.print("20 centimos");
        break;
        case 5:
        System.out.print("50 centimos");
        break;
        case 6:
        System.out.print("1 euro");
        break;
        case 7:
        System.out.print("2 euros");
        break;
        }
        System.out.print(" - ");
        
        int posi=(int)(Math.random()*2);
        switch (posi){
          case 0:
          System.out.print("Cara");
          break;
          case 1:
          System.out.print("Cruz");
          break;
          }
          System.out.println();
      }
  }
}
