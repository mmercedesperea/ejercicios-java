  public class ejercicio11{
    public static void main(String[] args) {

      System.out.print("Vamos a realizar conversiones de Kb a Mb\n");

      System.out.print("Introduce numero en Kb que quiere convertir:\n");
      int kilo=Integer.parseInt(System.console().readLine());

      int conversion= kilo / 1024;
      System.out.printf("%d Kb son %d Mb \n",kilo,conversion);
    
  }

}
