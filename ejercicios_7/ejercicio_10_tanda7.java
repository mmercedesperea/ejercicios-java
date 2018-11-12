/*Ejercicio 10
Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario.*/


public class ejercicio_10_tanda7 {
  public static void main(String[] args) {
    
    int [] numero=new int [20];
    int [] pares=new int [20];
    int [] impares=new int [20];
    
    int p=0;
    int i=0;
    int a =0;
    
    for(int n=0; n<20; n++){
      numero[n]=(int)(Math.random()*101);
      
      if (numero[n] % 2 !=0){                    // si el numero dividido por 2 no da 0 entonces el array impar toma el valor del numero y aumenta su contador en 1
          impares[i++]= numero[n];
          
        } else {
           pares[p++]= numero[n];             // si el numero no es impar  , entonces par coge el valor del numero y suma un contador en 1
          }    
    }
    System.out.print("Los numeros originales son : \n");
    for(int n=0; n<20; n++){
       System.out.print(numero[n]+ " ");// se muestran los numeros en su posicion original
    }
    System.out.println();   
    System.out.println(); 
     // asignamos los pares a las primeras posiciones
    for(int n=0; n<p; n++){
      numero[n]=pares[n];
    } 
    // asignamos los impares
    for(int n=p; n<20; n++){
      numero[n]=impares[a];
      a++;
    }
    System.out.println(); 
    System.out.print("Los numeros ordenados son : \n");
    for(int n=0; n<20; n++){
       System.out.print(numero[n] + " ");
    }
  }
}
