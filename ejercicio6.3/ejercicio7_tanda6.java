/*Ejercicio 7
Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).*/

public class ejercicio7_tanda6 {
  public static void main(String[] args) {
    
    int numeroPartido=0;
    int apuesta=0;
    int apuesta2=0;
    int apuesta3=0;
    int apuesta4=0;
    
    System.out.print("                            P R O N O S T I C O S    \n ");
    System.out.print("PARTIDO            nº \n");
    
    for(int i=1; i<15; i++){
      System.out.print("Partido.............");
      numeroPartido++;
       if (i<=9){System.out.print(" ");}
      System.out.print(numeroPartido);
      System.out.print("   ");

      apuesta= (int)(Math.random()*3)+1;
        
        switch (apuesta){
          case 1:
          System.out.print("|1| | |");
          break;
          
          case 2:
           System.out.print("| |X| |");
          break;
          
           case 3:
           System.out.print("| | |2|");
          break;
          
          } 
      System.out.print("   ");
          
      apuesta2= (int)(Math.random()*3)+1;
        
        switch (apuesta2){ 
          case 1:
          System.out.print("|1| | |");
          break;
          
          case 2:
           System.out.print("| |X| |");
          break;
          
           case 3:
           System.out.print("| | |2|");
          break;
          
          } 
      System.out.print("   ");
      apuesta3= (int)(Math.random()*3)+1;
        
        switch (apuesta3){          
          case 1:
          System.out.print("|1| | |");
          break;
          
          case 2:
           System.out.print("| |X| |");
          break;
          
           case 3:
           System.out.print("| | |2|");
          break;
          
          } 
          
      System.out.println();
    }
    System.out.print("       Pleno al 15                   ");
     apuesta4= (int)(Math.random()*3)+1;
        
        switch (apuesta4){          
          case 1:
          System.out.print("|1|");
          break;
          
          case 2:
           System.out.print("|X|");
          break;
          
           case 3:
           System.out.print("|2|");
          break;
          
          }       
  }
}
