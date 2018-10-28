/*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).*/

public class ejercicio1_tanda6 {
  public static void main(String[] args) {
    
    int suma=0;
    
    System.out.print("Vamos a mostrar la tirada de tres dados y la suma del resultado\n");
    
    for(int i=1; i<=3; i++){
      
      int numeroaleatorio=(int)(Math.random()*6)+1 ;
      
      suma=suma + numeroaleatorio;
      
      System.out.println(numeroaleatorio);
      
      }
      System.out.println();
      System.out.print("La suma de los numeros aleatorios que ha introducido es :"+suma);
  }
}
