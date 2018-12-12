/*Ejercicio 4
Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda pensando antes de mostrar los números.*/



public class ejercicio_4_tanda7_1 {
  public static void main(String[] args) 
    throws InterruptedException {                                                        // Se añade esta línea para poder usar sleep (que añade retardo a la aparicion de informacion 
  
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
          Thread.sleep(500);
        }
          System.out.printf("%8d\n",sumafila);
          Thread.sleep(500);
        
      }
      
      //suma columna
      for (int c=0; c<5; c++){
        sumaColumna=0;
        for( int f=0; f<4; f++){
          sumaColumna= sumaColumna+ numeros [f][c];
          sumaTotal=sumaTotal+sumaColumna;
          Thread.sleep(500);
        }
          System.out.printf("%8d",sumaColumna);
          Thread.sleep(500);
        }
          System.out.printf("%8d",sumaTotal); 
          Thread.sleep(500);
 
  }
}
