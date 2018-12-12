/*Ejercicio 12
Realiza un programa que muestre por pantalla un array de 9 filas por 9
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.*/

public class ejercicio_12_tanda7_1 {
  public static void main(String[] args) {
    
     int [][] numero=new int [9][9];       // 9 filas y 9 columnas
     int suma=0;
     int mini=900;
     int maxi=0;
     int media=0;
     int cuenta=8;
    
      for(int f=0; f<9; f++){                                                          // primero se empieza en la fila 0                                                            
        for (int c=0; c<9; c++){                                                       // se van a ir pasando por todas las columnas de la fila
          numero[f][c]=(int)(Math.random()*401)+500;                                   // se usan valores aleatorios para rellenar el array 
          System.out.printf("%5d", numero[f][c]);                                     // se muestra el array resultante
        }
        System.out.println();
      }
      
      System.out.print("\nLos numeros en la diagonal desde la esquina inferior izquierda a la superior derecha son: \n");
      
      for (int n=0;n<9;n++){
        for(int c=cuenta;c>cuenta-1;c--){
        System.out.print(numero[c][n]+ " ");
        //se suman los numeros
        suma=suma + numero[c][n];
        //se comprueba el mayor
        if (numero[c][n]>maxi){
          maxi=numero[c][n];
          }
        //se comprueba el menor 
        if (numero[c][n]<mini){
          mini=numero[c][n];
          } 
        }
        cuenta=cuenta-1;                        // se va restando a cuenta para que los numeros vayan subiendo
      }
      System.out.println();
      media= suma /9;
      System.out.print("El numero mayor es: "+maxi+ "\n");
      System.out.print("El numero menor es: "+mini+ "\n");
      System.out.print("La media de estos numeros es: "+media); 
  }
}
