public class ejercicio4{
  public static void main (String [] args){
  
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicar;
    double dividir;
  

    System.out.println("Introduce pimer numero:");
    numero1 = Integer.parseInt(System.console().readLine());
  
    System.out.println("introduce el segundo numero:");
    numero2 = Integer.parseInt(System.console().readLine());
  
    suma = numero1 + numero2;
    resta = numero1 - numero2;
    multiplicar = numero1 * numero2;
    dividir = numero1 / numero2;
  
    System.out.println("Resultados:");
      System.out.printf("%d + %d = %d\n",numero1,numero2,suma);
      System.out.printf("%d - %d = %d\n",numero1,numero2,resta);
      System.out.printf("%d * %d = %d\n",numero1,numero2,multiplicar);
      System.out.printf("%d / %d = %.2f\n",numero1,numero2,dividir);
  

}
}
