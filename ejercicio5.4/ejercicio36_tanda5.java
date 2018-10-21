/*Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos.*/

 public class ejercicio36_tanda5{
  public static void main (String [] args){
    
    System.out.print("Dame un numero y te dire si es capicua o no: \n");
      int numeroOriginal= Integer.parseInt(System.console().readLine());
      
      int numero=numeroOriginal;
      int vuelta=0;

      while (numero>0){                            
        vuelta=(vuelta*10)+ (numero%10);           
        numero= numero/10;                         
      }
      
      if (vuelta==numeroOriginal){
      System.out.printf("El numero original %d es capicua  %d .",numeroOriginal,vuelta);
          
        }else{
          System.out.printf("El numero %d no es capicua.",numeroOriginal);}
  }
}
