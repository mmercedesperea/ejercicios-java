/*Ejercicio 2
Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara.
La suma total debe aparecer en la esquina inferior derecha.*/

/*Ejercicio 3
Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).*/


public class ejercicio_3_tanda7_1 {
  public static void main(String[] args) {
  
    int [][] numeros=new int [4][5];
    int sumafila = 0;
    int sumaColumna = 0;
    int sumaTotal=0;
    
    
    
      for(int f=0; f<4; f++){                                                          // primero se empieza en la fila 0                                                            
        for (int c=0; c<5; c++){                                                       // se van a ir pasando por todas las columnas de la fila
          numeros[f][c]=(int)(Math.random()*900)+100;                                  // se usan valores aleatorios para rellenar el array 
        }
      }
      
      //sumar filas
      for (int f=0; f<4; f++){
        sumafila=0;
        for(int c=0; c <5; c++){
          System.out.printf("%8d",numeros[f][c]);
          sumafila=sumafila+numeros[f][c];
          sumaTotal=sumafila+sumaTotal;
        }
          System.out.printf("%8d\n",sumafila);
        
      }
      
      //suma columna
      for (int c=0; c<5; c++){
        sumaColumna=0;
        for( int f=0; f<4; f++){
          sumaColumna= sumaColumna+ numeros [f][c];
          sumaTotal=sumaTotal+sumaColumna;
        }
          System.out.printf("%8d",sumaColumna);
        }
          System.out.printf("%8d",sumaTotal); 
 
  }
}


