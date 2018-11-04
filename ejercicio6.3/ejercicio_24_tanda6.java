/*Ejercicio 24
Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
7
Ejemplo 2:
Por favor, introduzca un número entero positivo: 406783
3
Ejemplo 3:
Por favor, introduzca un número entero positivo: 406783
0*/

public class ejercicio_24_tanda6 {
  public static void main(String[] args) {
    
    int numeroDigi =1;
    System.out.print("Por favor dame un numero para darte uno de sus digitos : \n");
    int numero=Integer.parseInt(System.console().readLine());
    
    int numeroale=numero;
 
    while (numero > 10){    // mientras el numero sea mayor que 10.
      numero= numero/10;  // ve dividiendolo entre 10. 
      numeroDigi++;       //por cada division añade un 1 al numero de digitos.
    }
      
    int seleccion=(int)(Math.random()*numeroDigi)+1;
      
    for(int i=2;i<=seleccion;i++){  
      numeroale=numeroale/10;          
    }
     
    System.out.print(numeroale%10);
  }
}
