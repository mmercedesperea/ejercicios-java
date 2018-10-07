public class ejercicio1{
  public static void main (String[] args){
    
    int numero1;
    int numero2;
    int resultado;
    
    String lineaDeEntrada;

    System.out.println("Introduzca el primer numero:");
    lineaDeEntrada = System.console().readLine();
    numero1 = Integer.parseInt(lineaDeEntrada);//cuando se trabaja con un numero entero se pone Integer.parseInt

    System.out.println("Introduzca el segundo numero:");
    lineaDeEntrada = System.console().readLine();
    numero2 = Integer.parseInt(lineaDeEntrada);


    resultado = numero1 * numero2;

    System.out.println("Resultado:");

    System.out.printf("%d * %d = %d\n",numero1,numero2,resultado);
    
  }
}
    


