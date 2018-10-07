public class ejercicio9{
  public static void main (String [] args){
  
    int base;
    int radio;
    double volumen;
    
    System.out.println("Vamos a calcular el volumen de un cono");
    System.out.println("Introduce la base:");
    base= Integer.parseInt(System.console().readLine());
  
    System.out.println("Introduce el radio:");
    base= Integer.parseInt(System.console().readLine());
  
    volumen= ((3.14 * 12 * 12)/3); 
    System.out.printf("El volumen del cono es %.3f \n",volumen);
 
  }
}
