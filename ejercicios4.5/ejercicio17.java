public class ejercicio17{
  public static void main (String [] args){
     
    System.out.print("Vamos a decirte cual es la ultima cifra del numero entero que introduzcas:\n");
    int cifra= Integer.parseInt(System.console().readLine());

    int numero= cifra %10;
    
    System.out.printf( "La ultima cifra del numero que has introducido es: %d",numero);
       
  }
}
