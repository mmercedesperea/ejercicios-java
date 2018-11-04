/*Ejercicio 11
Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.*/

public class ejercicio_11_tanda6 {
  public static void main(String[] args) {
    
    int nota=0;
    String calificacion=" ";
    int suspenso=0;
    int suficiente=0;
    int bien=0;
    int notable=0;
    int sobresaliente=0;
    
    for(int i=1; i<=20; i++){
      nota=(int)(Math.random()*5);
      
      switch (nota){
        case 0:
        calificacion= "suspenso";
        suspenso++;
        break;
        case 1:
        calificacion="suficiente";
        suficiente++;
        break;
        case 2:
        calificacion="bien";
        bien++;
        break;
        case 3:
        calificacion="notable";
        notable++;
        break;
        case 4:
        calificacion= "sobresaliente";
        sobresaliente++;
        break;
        }
      System.out.print(calificacion);
      System.out.println();
      }
    System.out.println();
    System.out.printf("La cantidad de suspensos es: %d \n",suspenso);
    System.out.printf("La cantidad de suficientes es: %d \n",suficiente);
    System.out.printf("La cantidad de bien es: %d \n",bien);
    System.out.printf("La cantidad de notables es: %d \n",notable);
    System.out.printf("La cantidad de sobresalientes es: %d \n",sobresaliente);
  }
}
