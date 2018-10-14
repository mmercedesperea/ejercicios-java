public class ejercicio23{
  public static void main (String [] args){
    
    double baseImponible;
    double totalConIVA;
    double IVA =0;
    double promo=0;
    
    System.out.println("Introduce el precio base imponible del producto:");
    baseImponible= Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el tipo de IVA (general,reducido o superreducido):");
    String tipoIVA = System.console().readLine();
    System.out.println("Introduce el codigo promocional (nopro, mitad, meno5 o 5porc):");
    String tipoCodigo = System.console().readLine();
    
    
    switch (tipoIVA){
      case "general":
      IVA = baseImponible * 0.21;
      break;
      case "reducido":
      IVA= baseImponible * 0.10;
      break;
      case "superreducido":
      IVA = baseImponible * 0.04;
      break;
      default:
      System.out.println("Ese no es un tipo de IVA aceptado \n");
    }
  
  totalConIVA = baseImponible + IVA;
  
    switch (tipoCodigo){ 
      case "nopro":
      promo = 0;
      break;
      case "mitad":
      promo = totalConIVA /2;
      break;
      case "meno5":
      promo = 5;
      break;
      case "5porc":
      promo =totalConIVA * 0.05;
      break;
      default:
      System.out.println("Ese no es un tipo promocion aceptado \n");
    }
  
  double precioTotal = totalConIVA - promo;
     
    System.out.printf("base imponible              %.2f \n", baseImponible);
    System.out.printf("IVA      (%5s)              %.2f \n", tipoIVA,IVA);
    System.out.printf("Precio con IVA              %.2f \n", totalConIVA);
    System.out.printf("Codigo promo (%5s)          %.2f \n", tipoCodigo,promo);
    System.out.printf("total                       %.2f \n", precioTotal);
 
  }
}
