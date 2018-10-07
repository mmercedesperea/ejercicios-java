
public class ejercicio3{
  public static void main (String[] args){
    
    double euros;
    int pesetas;
    
    System.out.println("Pesetas a convertir:");
    pesetas= Integer.parseInt(System.console().readLine()); 
    
    euros = pesetas / 166.386;
    
    System.out.printf("Son %2f euros \n",euros);
    
  }
}
