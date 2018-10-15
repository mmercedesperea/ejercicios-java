/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
  numero negativo y nos diga cuantos números se han introducido, la media de
  los impares y el mayor de los pares. El número negativo sólo se utiliza para
  indicar el final de la introducción de datos pero no se incluye en el cómputo.*/
  
  
public class ejercicio21_tanda5{
  public static void main (String[] args){
    
    int numeroIntro=0;
    int numero=0;
    int numeroImpar=0;
    int impares=0;
    int numeroPar=0;
    
    System.out.print("Ve dandome numeros para saber cuantos numeros ha introducido, la media de los impares y el mayor de los numeros pares.\n");
    System.out.print("Para parar introduce un numero negativo.\n");
    
    while (numero >= 0){
      numero=Integer.parseInt(System.console().readLine());
      
      if (numero>=0){
        numeroIntro ++;
        if (numero %2 !=0){
          numeroImpar= numeroImpar + numero;
          impares ++;
        } else {
            if (numeroPar<numero){
              numeroPar=numero;
            }
          } 
      }
    }
    
    int mediaImpar= numeroImpar / impares;
  
    System.out.printf("Has introducido %d numeros.\n",numeroIntro);
    System.out.printf ("La suma de los numeros impares que has introducido es %d y ha introducido %d numeros impares y la media de ellos es %d. \n",numeroImpar,impares,mediaImpar);
    System.out.printf("El mayor de los numeros pares que ha introducido es: %d. \n",numeroPar);
  
  }
}
