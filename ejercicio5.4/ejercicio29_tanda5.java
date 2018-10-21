/*Ejercicio 29
Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.*/


public class ejercicio29_tanda5{
  public static void main (String[] args){
    
    int numeroTope=0;
    int numeroNoDiv=0;
    
    System.out.print("Dame el numero tope de numeros positivos a mostrar: \n");
    numeroTope= Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora dame el numero por el cual no pueden ser divisibles: \n");
    numeroNoDiv= Integer.parseInt(System.console().readLine());
    
    System.out.print("Estos son los numeros que estabas buscando: \n");
    
    for (int i=0;i<=numeroTope;i++){
      if ((i%numeroNoDiv)!=0){
        System.out.print(i+" ");        
        }
    }
  }
}
