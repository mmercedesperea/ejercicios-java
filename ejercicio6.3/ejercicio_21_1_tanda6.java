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

public class ejercicio_21_1_tanda6 {
  public static void main(String[] args) {
    
    String moneda=" ";
    String lado=" ";
    
    for(int i=0;i<5;i++){
      
      int tipo=(int)(Math.random()*8);
      switch (tipo){
        case 0:
        moneda="1 centimo";
        break;
        case 1:
        moneda="2 centimo";
        break;
        case 2:
        moneda="5 centimos";
        break;
        case 3:
        moneda="10 centimos";
        break;
        case 4:
        moneda="20 centimos";
        break;
        case 5:
        moneda="50 centimos";
        break;
        case 6:
        moneda="1 euro";
        break;
        case 7:
        moneda="2 euros";
        break;
        default:
        }
        
        int posi=(int)(Math.random()*2);
        switch (posi){
          case 0:
          lado="Cara";
          break;
          case 1:
          lado="Cruz";
          break;
          default:
          }
          
          System.out.print("Su moneda es : "+moneda+ " - "+lado+ "\n");
      }
  }
}
