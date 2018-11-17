/*Ejercicio 2
Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara.
La suma total debe aparecer en la esquina inferior derecha.*/

public class ejercicio_2_tanda7_1 {
  public static void main(String[] args) {
    
    int [][] numeros=new int [4][5];
    int sumafila = 0;
    int sumaColumna = 0;
    int sumaTotal=0;
        
    System.out.print("Dame 20 numeros e iremos introduciendolo en sus respectivos huecos\n");
    
      for(int f=0; f<4; f++){                                                               
        for (int c=0; c<5; c++){
          System.out.print("Introduca dato fila " + f +" , columna " +c+ ":");       // se va pidiendo numeros por fila y por columna
          numeros[f][c]=Integer.parseInt(System.console().readLine());                // se va metiendo numero segun su fila y su columna          
        }
      }
            //Suma las filas
      for(int f=0;f<4;f++){                                    //se cuenta fila por fila 
        sumafila = 0;                                          //se reinicia la suma de la fila
         for (int c=0; c<5; c++){                              //se sumaran todas las columnas de esa fila
          System.out.printf(numeros[f][c]+ "  ");              //Se muestran todos los numeros de filas y columnas
          sumafila=sumafila + numeros[f][c];                   //se suma  los numeros de la fila
          sumaTotal= sumaTotal+sumafila;
        }
        System.out.print(sumafila+ "\n");                      //Se muestra la suma de la fila al final de la fila
      }
         //Suma columnas
       for(int c=0;c<5;c++){                                   //Se cuenta columna por columna
        sumaColumna = 0;                                       //Se reinicia la columna
         for (int f=0; f<4; f++){                              //Se contaran todas las filas de esa columna
          sumaColumna=sumaColumna + numeros[f][c];             //Se suman los numeros de la columna
          sumaTotal=sumaTotal+sumaColumna;
        }
        System.out.print(sumaColumna+ " ");                     // se muestran los numeros de la columna al final de cada columna
      }

      System.out.print(sumaTotal);                              //muestra la suma total de las columnas y las filas.
  }
}
