/*Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
   1
  121
 12321
1234321
 */

public class ejercicio24_tanda5{
  public static void main (String[] args){
    
    System.out.print("Introduzca la altura que quiere darle a la piramide: ");
    int alturaDada = Integer.parseInt(System.console().readLine());
    
    int altura=1;                 
    int j=0;
    int espacios=alturaDada-1;
     
     while(altura<=alturaDada){           //mientras altura sea menor que alturaDada esto seguira funcionando (ejemplo alturaDada 5)
       
        for(j=1; j<=(espacios); j++){      // este j ira aumentando hasta que sea igual a alturaDada - 1 ( con este ejemplo llegaria hasta 4)
         System.out.print(" ");           // ira imprimiendo espacios en blanco  en la primera ronda pintara 4 espacios,
        }
        for(j=1; j<altura;j++){            // j ira aumentando hasta llegar a altura , en la primera ronda j llegara a altura que vale originalmente 1
         System.out.print(j);              // j en la primera ronda vale 1 e imprime el valor 1 e ira aumentando valor por cada vez se cumpla el bucle
        }
        for(j=altura;j>0;j--){            // ahora en esta ronda j que valdra lo que vale altura ira disminuyendo de valor hasta llegar a a 0
        System.out.print(j);              // e imprimira j disminuyendo su valor por cada vez que se cumpla el bucle 
        }
        System.out.println();             //añade un salto de linea
        altura++;                         //mientras altura no sea igual a la altura dada, en cada ronda altura aumentara 1
        espacios--;                       // y en cada ronda espacio disminuye 1
      }
  }
}
