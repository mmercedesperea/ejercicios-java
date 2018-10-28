/*Ejercicio 9
Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.*/


public class ejercicio9_tanda6 {
  public static void main(String[] args) {
    
    int numeroAzar=0;
    int numeroPar;
    int cuenta=0;
    
    while (numeroAzar !=24){
      
      numeroAzar=(int)(Math.random()*100);
      numeroPar=numeroAzar;
      
      if ((numeroAzar%2)==0){
        System.out.print(numeroPar+ " ");
        cuenta++;
        }
      }
      System.out.print("\nSe han generado: " + cuenta + " numeros");
  }
}
