/*Ejercicio 5
Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
A continuación, el programa deberá dar la posición tanto del máximo como
del mínimo.*/


public class ejercicio_5_tanda7_1 {
  public static void main(String[] args) {
    
    int [][] numero=new int [6][10];       // 6 filas y 10 columnas
    int maxi=0;
    int mini=1000;
    int colmini=0;
    int filmini=0;
    int colmaxi=0;
    int filmaxi=0;
    
    System.out.print("Se muestra un array formado por 6 filas ( del 0 al 5) y 10 columnas(del 0 al 9) \n");
    System.out.print("Columnas");                        
    
     for (int c=0; c<10; c++){                              
            System.out.printf("  "+ c + "  ");                                          // mostramos el texto de columnas del 0 al 5      
    }   
    System.out.println();
    
           //rellenamos el array
      for(int f=0; f<6; f++){                                                          // primero se empieza en la fila 0                                                            
        for (int c=0; c<10; c++){                                                       // se van a ir pasando por todas las columnas de la fila
          numero[f][c]=(int)(Math.random()*1001);                                    // se usan valores aleatorios para rellenar el array 
        }
      }
      
            // se muestra el array por pantalla
       for (int f=0; f<6; f++){
         System.out.print("fila "+f);
        for(int c=0; c <10; c++){
          System.out.printf("%5d",numero[f][c]);
        }
        System.out.println();
        
      }
      
        // se busca el maximo y el minimo
      for(int f=0;f<6;f++){
        for(int c=0;c<10;c++){
        
         if (numero[f][c]>maxi){
           maxi=numero[f][c];
           colmaxi=c;
           filmaxi=f;
           }
           
          if (numero[f][c]<mini){
           mini=numero[f][c];
           colmini=c;
           filmini=f;
           }
        }
     
      }
      System.out.print("El numero maximo es "+ maxi+ " y se encuentra en la fila " +filmaxi+ " en la columna " +colmaxi+ "\n");
      System.out.print("El numero minimo es "+ mini+ " y se encuentra en la fila " +filmini+ " en la columna " +colmini);
  }
}
