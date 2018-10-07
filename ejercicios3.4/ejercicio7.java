public class ejercicio7{
  public static void main (String [] args){
    
    double baseImponible;
    double total;
    double IVA;
    
    System.out.println("Introduce el precio base imponible del producto:");
    baseImponible= Double.parseDouble(System.console().readLine());
    
    IVA = baseImponible * 0.21;
    total = baseImponible + IVA;
    
    System.out.printf("base imponible %.2f \n", baseImponible);
    System.out.printf("IVA            %.2f \n", IVA);
    System.out.printf("total          %.2f \n", total);
 
  }
}
