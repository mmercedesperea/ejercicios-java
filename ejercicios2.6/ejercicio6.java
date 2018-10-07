public class ejercicio6{
  public static void main (String[] args){
     
    double baseImponible;
    double total;
    double IVA;
    double sinIVA;
    
    baseImponible = 234.56;
    IVA = baseImponible * 0.21;
    total = baseImponible + IVA;
    sinIVA = (baseImponible + IVA) / 1.21;
    
    System.out.printf("base imponible %.2f \n", baseImponible);
    System.out.printf("IVA            %.2f \n", IVA);
    System.out.printf("total          %.2f \n", total);
    System.out.printf("Total sin iva  %.2f \n", sinIVA);
 
  }
}
