public class ejercicio2{
  public static void main (String[] args){
    
    double euros;
    int pesetas;
    
    System.out.println("Euros a convertir:");
    euros = Double.parseDouble(System.console().readLine()); //cuando se trabaja con un numero entero se pone Double.parseDouble
    
    int resultado = (int)(euros * 166.386);
    
    System.out.printf("Son %d pesetas \n",resultado);
    
    
    
    
    
  }
}
