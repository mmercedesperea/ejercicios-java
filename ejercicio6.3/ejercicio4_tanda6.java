/*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
por espacios.*/

public class ejercicio4_tanda6 {
  public static void main(String[] args) {
    
    for (int i=1; i<=20; i++){                                //repetimos el bucle 20 veces
      
      System.out.print((int)(Math.random()*11) + " ");        // se iran buscando numeros hasta 11 digitos incluyendo el 0.

      }
  }
}  
