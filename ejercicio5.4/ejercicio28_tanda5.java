/*Escribe un programa que calcule el factorial de un número entero leído por
  teclado.
  Ejemplo:
  Por favor, introduzca un número entero: 6
  6! = 720*/

public class ejercicio28_tanda5{
  public static void main (String[] args){
    
  int numero=0;
  int multiNumeros=1;
    
    System.out.print("Vamos a calcular el factorial de un numero entero leido por teclado: \n");
    numero = Integer.parseInt(System.console().readLine());

     for (int i=1; i<=numero; i++ ) { 
       multiNumeros= multiNumeros * i;
      } 
    System.out.printf("El factorial de su numero %d! = %d .\n",numero,multiNumeros);
         
  }     
}

