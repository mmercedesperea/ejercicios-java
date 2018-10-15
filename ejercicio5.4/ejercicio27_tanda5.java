/*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
  entre 1 y un número leído por teclado.*/

public class ejercicio27_tanda5{
  public static void main (String[] args){
    
  int numero=0;
  int cuentaNumeros=0;
  int sumaNumeros=0;
    
    System.out.print("Introduce el numero maximo para sacar sus multiplos de tres, para asi poderlos contar y sumar: \n");
    numero = Integer.parseInt(System.console().readLine());
    System.out.print("1 ");

     for (int i=3; i<=numero; i+=3 ) { 
         cuentaNumeros++;
         System.out.printf( " %d " , i );
         sumaNumeros= sumaNumeros + i;
      }
         System.out.println("");
         System.out.printf("Hay un total de %d numeros multiplos de 3 hasta llegar a su numero.\n",cuentaNumeros);
         System.out.printf("La suma de esos numeros da : %d.",sumaNumeros); 
  }     
}

