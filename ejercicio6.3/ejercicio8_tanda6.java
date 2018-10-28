/*Ejercicio 8
Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.*/


public class ejercicio8_tanda6 {
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

      apuesta= (int)(Math.random()*6)+1;
        
        switch (apuesta){
          case 1:
          case 2:
          case 3:
          System.out.print("|1| | |");
          break;
          case 4:
          case 5:
           System.out.print("| |X| |");
          break;
           case 6:
           System.out.print("| | |2|");
          break;
          
          } 
      System.out.print("   ");
          
      apuesta2= (int)(Math.random()*6)+1;
        
        switch (apuesta2){
          case 1:
          case 2:
          case 3:
          System.out.print("|1| | |");
          break;
          case 4:
          case 5:
           System.out.print("| |X| |");
          break;
           case 6:
           System.out.print("| | |2|");
          break;
          
          } 
      System.out.print("   ");
          
      apuesta3= (int)(Math.random()*6)+1;
        
        switch (apuesta3){
          case 1:
          case 2:
          case 3:
          System.out.print("|1| | |");
          break;
          case 4:
          case 5:
           System.out.print("| |X| |");
          break;
           case 6:
           System.out.print("| | |2|");
          break;
          
          } 
               
      System.out.println();
    }
    System.out.print("       Pleno al 15                   ");
     apuesta4= (int)(Math.random()*6)+1;
        
        switch (apuesta4){          
          case 1:
          case 2:
          case 3:
          System.out.print("|1|");
          break;
          case 4:
          case 5:
           System.out.print("|X|");
          break;
           case 6:
           System.out.print("|2|");
          break;
        }               
  }
}
