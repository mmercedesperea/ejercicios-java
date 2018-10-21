/*Realiza una programa que calcule las horas transcurridas entre dos horas de
 dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 El día de la semana se puede pedir como un número (del 1 al 7) o como una
 cadena de lunes a domingo. Se debe comprobar que el usuario introduce
 los datos correctamente y que el segundo día es posterior al primero.*/
 
public class ejercicio30_tanda5 {
  public static void main(String[] args) {
    
    int dia=0;
    int diaSemana1=0;
    int diaSemana2=0;
    int hora1=0;
    int hora2=0;
    String nombreDia1="";
    String nombreDia2="";
 
    System.out.print("Vamos a descubrir cuantas horas transcurren entre dos horas de dos dias de la semana que introduzca por teclado\n");
    System.out.print("Primero introduce el dia de la semana (del 1 al 7)\n");
    diaSemana1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la hora del primer dia(sin minutos)\n");
    hora1 = Integer.parseInt(System.console().readLine());
    System.out.print("Despues introduce el siguiente dia de la semana (del 1 al 7)\n");
    diaSemana2 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la hora del segundo dia(sin minutos)\n");
    hora2 = Integer.parseInt(System.console().readLine());
      
 
    switch (diaSemana1){
      case 1:
      dia =0;
      nombreDia1= "lunes";
        break;
      case 2:
      dia=1;
      nombreDia1= "martes";
        break;
      case 3 :
      dia=2;
      nombreDia1= "miercoles";
        break;
      case 4:
      dia=3;
      nombreDia1= "jueves";
        break;
      case 5:
      dia=4;
      nombreDia1= "viernes";
        break;
      case 6:
      dia=5;
      nombreDia1= "sabado";
        break;
      case 7:
      dia=5;
      nombreDia1= "domingo";
        break;
      default:
      System.out.print("El dia introducido no es correcto\n");
    }
    
     switch (diaSemana2){
         case 1:
      dia =0;
      nombreDia2= "lunes";
        break;
      case 2:
      dia=1;
      nombreDia2= "martes";
        break;
      case 3 :
      dia=2;
      nombreDia2= "miercoles";
        break;
      case 4:
      dia=3;
      nombreDia2= "jueves";
        break;
      case 5:
      dia=4;
      nombreDia2= "viernes";
        break;
      case 6:
      dia=5;
      nombreDia2= "sabado";
        break;
      case 7:
      dia=5;
      nombreDia2= "domingo";
        break;
      default:
      System.out.print("El dia introducido no es correcto\n");
    }
    
    if (diaSemana1>=diaSemana2){
      System.out.print("El primer dia debe ser menor que el segundo\n");
    } else if ((hora1<0)|| (hora1>23) ||(hora2<0)|| (hora2>23)){
      System.out.print("Las horas no son correctas tienen que ir entre 0 y 23\n");
    } else {
        int totalhoradia1= ((diaSemana1 * 24 ) + hora1);
        int totalhoradia2=((diaSemana2 * 24) +hora2);
        int horasTranscurridas = totalhoradia2 - totalhoradia1; 
        System.out.print( "Desde el "+ nombreDia1 + " con la hora "+ hora1 +"\n");
        System.out.print( "Hasta el "+ nombreDia2 + " con la hora "+ hora2 +"\n");
        System.out.print( "Han transcurrido "+ horasTranscurridas + " en total \n");
        }
  }
}
