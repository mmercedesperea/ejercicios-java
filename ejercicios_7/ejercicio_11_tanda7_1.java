/*Ejercicio 11
Realiza un programa que muestre por pantalla un array de 10 filas por 10
columnas relleno con números aleatorios entre 200 y 300. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.*/

public class ejercicio_11_tanda7_1 {
  public static void main(String[] args) {
    
     int [][] numero=new int [10][10];       // 10 filas y 10 columnas
     int suma=0;
     int mini=300;
     int maxi=0;
     int media=0;
     
                    //rellenamos el array
     
      for(int f=0; f<10; f++){                                                          // primero se empieza en la fila 0                                                            
        for (int c=0; c<10; c++){                                                       // se van a ir pasando por todas las columnas de la fila
          numero[f][c]=(int)(Math.random()*101)+200;                                   // se usan valores aleatorios para rellenar el array 
          System.out.printf("%5d", numero[f][c]);                                     // se muestra el array resultante
        }
        System.out.println();
      }
      System.out.print("\nLos numeros desde la esquina superior izquierda a la esquina inferior derecha son:\n");
      for (int n=0;n<10;n++){
        System.out.print(numero[n][n]+ " ");
        //se suman los numeros
        suma=suma + numero[n][n];
        //se comprueba el mayor
        if (numero[n][n]>maxi){
          maxi=numero[n][n];
          }
        //se comprueba el menor 
        if (numero[n][n]<mini){
          mini=numero[n][n];
          } 
      }
      System.out.println();
      media= suma /10;
      System.out.print("El numero mayor es: "+maxi+ "\n");
      System.out.print("El numero menor es: "+mini+ "\n");
      System.out.print("La media de estos numeros es: "+media); 

  }
}
