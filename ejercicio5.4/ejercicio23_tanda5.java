/*Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.*/

 
  public class ejercicio23_tanda5{
  public static void main (String [] args){
    
    int valorSuma=0;
    int contador=0;
    int numero=0;
    
    System.out.print("Vamos a ir sumando numeros hasta que su suma llegue a 10000:\n");
    
    while (valorSuma<10000){
      numero=Integer.parseInt(System.console().readLine());
      valorSuma= valorSuma + numero;
      contador ++;
      }
    int media= valorSuma/contador;
    
    if (numero>10000){
        System.out.print("El numero introducido es superior al aceptado");
      }else{
        System.out.print("El total de la suma d elos numeros introducidos es: "+ valorSuma + "\n");
        System.out.print("El total de los numeros introducidos es : "+ contador + "\n");
        System.out.print("La media de los numeros es : "+ media + "\n");
      }
  }
}
