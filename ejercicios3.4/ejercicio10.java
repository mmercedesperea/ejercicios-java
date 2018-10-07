import java.util.Scanner;
  public class ejercicio10{
    public static void main(String[] args) {

      Scanner numero= new Scanner(System.in);

      System.out.print("Vamos a realizar conversiones de Mb a Kb\n");

      System.out.print("Introduce numero en Mb que quiere convertir:\n");
      int mega=Integer.parseInt(numero.nextLine());

      int conversion= mega * 1024;
      System.out.printf("%d Mb son %d Kb \n",mega,conversion);
    
  }

}
