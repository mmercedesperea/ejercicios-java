public class ejercicio22{
  public static void main (String [] args){
    
    int dia =0;
    
    System.out.print("Si quiere saber cuanto falta para el viernes siga los siguientes pasos:\n");
    System.out.println("¿Que dia de la semana es hoy (lunes-viernes)?");
    String diaSemana = System.console().readLine();
    System.out.println("¿Que hora es (Introzuca la hora sin minutos)?");
    int hora =Integer.parseInt(System.console().readLine());
    System.out.println("¿Que hora es (Introzuca los minutos)?");
    int minutos =Integer.parseInt(System.console().readLine());
    
      switch (diaSemana){
        
        case "lunes":
        dia = 0;
        break;
        case "martes":
        dia =1;
        break;
        case "miercoles":
        dia=2;
        break;
        case "jueves":
        dia=3;
        break;
        case "viernes":
        dia=4;
        break;
        default:
        System.out.print("El dia introducido no es correcto");
      }
      
      int minutosFinde= ((4 * 24 * 60) + (15 * 60));
      int minutosActuales =((dia * 24 * 60) + (hora *60 ) + minutos);
      int minutosTotales = (minutosFinde - minutosActuales);
   
      System.out.printf ("Faltan %d minutos para el fin de semana",minutosTotales);

   }
  }
