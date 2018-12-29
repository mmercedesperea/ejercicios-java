/*
Ejercicio 29-34
Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones)
de números enteros que contenga las siguientes funciones:
 * 
 */

import funciones.funciones_array_bidimensionales;
public class ejercicios_29_34_funciones {
	
	public static void main (String[] args) {
    
    // vamos a generar un array bidimensional 
    System.out.print("Vamos a generar un array bidimensional de numeros aleatorios\n");
    System.out.println();
    System.out.print("Deme el numero de filas\n");
    int filas=Integer.parseInt(System.console().readLine());
    
    System.out.print("Deme el numero de columnas\n");
    int columnas=Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora vamos a decir el parametro del numero maximo que comprondra el array\n");
    int maximo=Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora deme el numero minimo que compondra el array\n");
    int minimo=Integer.parseInt(System.console().readLine());
    
    int[][] a = (funciones.funciones_array_bidimensionales.generaArrayBiInt(filas,columnas,maximo,minimo));     // este array se generara con los valores indicados y segun lo especificado en la funcion destinada a ello
    
     System.out.print("Columnas");                        
    
    // para mostrar el texto columnas junto con el numero de columnas que tiene el array
    for (int c=0; c<columnas; c++){                              
          System.out.printf("  "+ (c) + "  ");       // mostramos el texto de columnas  del 1 hasta el numero introducido     
      }   
    System.out.println();
    // se muestra el array por pantalla
    for (int f=0; f<filas; f++){
        System.out.print("fila "+(f));              // para mostar el texto fila con el acompañamiento del 1 hasta el numero de filas introducido
        for(int c=0; c <columnas; c++){
          System.out.printf("%5d",a[f][c]);           // se muestra el array generado  
        }
        System.out.println();
        
      }
      
      
    // se lee array de la fila seleccionada
    System.out.print("Ahora deme el numero de la fila que quiere mostrar\n");
    int numeroFila=Integer.parseInt(System.console().readLine());
    
    System.out.print("\nLa fila que ha seleccionado es la siguiente: \n");
    int [] solucionFila = funciones.funciones_array_bidimensionales.filaDeArrayBiInt(a,numeroFila);     
    
    for (int f=0; f<solucionFila.length; f++){
        System.out.print(solucionFila[f]+ " ");
      }
      
      System.out.println();
      
      // se lee array de la columna seleccionada
    System.out.print("\nAhora deme el numero de la columna que quiere mostrar\n");
    int numeroColumna=Integer.parseInt(System.console().readLine());
    
    System.out.print("\nLa columna que ha saleccionado es la siguiente: \n");
    int [] solucionColumna = funciones.funciones_array_bidimensionales.columnaDeArrayBiInt(a,numeroColumna);     // 
    
    for (int f=0; f<solucionColumna.length; f++){
        System.out.print(solucionColumna[f]+ " ");
      }
      
      System.out.println();
     //4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array con dos elementos) de la primera ocurrencia de un número dentro de un
     //array bidimensional. Si el número no se encuentra en el array, la función devuelve el array {-1, -1}.  
    System.out.print("\nDeme el numero que quiere buscar en su array y le dire la fila y la columna en la que se encuentra\n");
    int num=Integer.parseInt(System.console().readLine());
    
    int [] coordenada = funciones.funciones_array_bidimensionales.coordenadasEnArrayBiInt(a,num);     // 
    
    System.out.print("\nEl numero seleccionado se encuentra en la fila " +coordenada[0]+ " y en la columna "+coordenada[1]+"\n");
     
      System.out.println(); 
      //Vemos si el numero que seleccione es punto de silla de su fila y columna
    System.out.print("Introduzca un numero entero positivo del array para ver si es punto de silla: ");
    int silla= Integer.parseInt(System.console().readLine());
    
     System.out.println();
    if ((funciones.funciones_array_bidimensionales.esPuntoDeSilla(a,silla))==true){
      System.out.println( silla + " Es punto de silla");
    }else{
      System.out.println(silla +" El numero no es punto de silla");
    }
    System.out.println(); 
    
    //5.2 esPuntoDeSilla: busca los numeros que son punto de silla dentro del array
    System.out.println("\nBusca los puntos de silla dentro del array: ");
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[0].length; j++) {
        if  ((funciones.funciones_array_bidimensionales.esPuntoSilla(a,i,j))==true) {
              System.out.println("fila " + i + ", columna " + j + " -> " + a[i][j]);
          }
        } 
      } 
      System.out.println(); 
      
      
    //6. diagonal: Devuelve un array que contiene una de las diagonales del array bidimensional que se pasa como parámetro.
    System.out.println("\nVamos a sacar la diagonal del array");
    System.out.println("\nDeme el numero de la fila de la que quiere partir");
    int filadia= Integer.parseInt(System.console().readLine());
    
    System.out.println("\nDeme el numero de la columna de la que quiere partir");
    int columnadia= Integer.parseInt(System.console().readLine());
     
    System.out.println("\nDime ahora si quieres que sea nose (de noroeste hacia el sureste), o neso (de noreste hacia el suroeste).");
    String direccion = System.console().readLine();
    
    int [] diagonalre = funciones.funciones_array_bidimensionales.diagonal(a,filadia,columnadia,direccion);  
    
    for(int f=0;f<diagonalre.length;f++){
      System.out.print(diagonalre[f]+ " ");
      
      }
    
	}
}

