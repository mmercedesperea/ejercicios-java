/*
Funciones para arrays de dos dimensiones
 */

package funciones;
public class funciones_array_bidimensionales {
  
  
	//generaArrayBiInt: Genera un array de tamaño n x m con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
	public static int[][] generaArrayBiInt(int filas, int columnas, int minimo, int maximo) {
   int[][] x = new int[filas][columnas];  // genera un array con tantas filas y tantas columnas
   
   for (int i=0;i<filas;i++){
     for(int c=0;c<columnas;c++){
       x[i][c]=(int)(Math.random()*(maximo-minimo)+minimo+1);
       }
     }
    return x;
	}
  
  /* //2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como parámetro.
  public static int[] filaDeArrayBiInt(int[][] x, int fila) {
   int[] a = new int[x[0].length];  // genera un array con tantas filas y tantas columnas
   
   for (int i=0;i<fila;i++){          //fila llegara hasta el numero indicado y se parara
     for(int c=0;c<a.length;c++){  //columna se llenara con todos los numero 
       a[c]=x[i][c];
       }
     }
    return a;
	}
  */
  //La funcion anterior se puede resolver tambien del siguiente modo:
    public static int[] filaDeArrayBiInt(int x[][], int fila) {
      int[] f = new int[x[0].length];
      
      for (int c = 0; c < x[0].length; c++) {   
        f[c] = x[fila][c];
      }
      return f;
    }
  
  
  //3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se pasa como parámetro.
  
  public static int [] columnaDeArrayBiInt(int[][] x, int columna){
    int [] a=new int [x.length];
    
    for (int i=0;i<x.length;i++){
        a[i]=x[i][columna];
      }
      return a;
    }
    
  //4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array con dos elementos) de la primera ocurrencia de un número dentro de un
  //array bidimensional. Si el número no se encuentra en el array, la función devuelve el array {-1, -1}.  
    
  public static int [] coordenadasEnArrayBiInt (int [][] x, int n){
    int [] coordenadas=new int[2];
    
    for (int f=0;f<x.length;f++){
      for (int c=0;c<x[0].length;c++){   // se le pone el [0] en x[0].length para que se quede en la fila 0 y el longitud de la columna ( por si tiene mas columnas que filas.
        if (x[f][c]==n){                 // si se encuentra el numero que buscamos se almacenara y se devolvera
          coordenadas[0]=f; 
          coordenadas[1]=c;
          return coordenadas;
          }
      }                                 // si no se ha encontrado coordenadas cogera el valor -1 y se devuelve el resultado
      coordenadas[0]=-1; 
      coordenadas[1]=-1;}
      
      return coordenadas;
    }
    
    //5. esPuntoDeSilla: Dice si un número que ha introducido es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
    public static boolean esPuntoDeSilla(int [][] x, int n){
      boolean resul=false;
      
      int [] posi = coordenadasEnArrayBiInt(x,n);  // Se guarda la posicion donde se encuentra el numero(fila y columna) usando la funcion que hace tal tarea
      
      int nf=0; // si hay un numero menor que el introducido en la fila en la que esta  se almacenara ese numero
      int nc=0; // si hay un  numero que es mayor que el introducido en la columna se almacena
      
      for(int c=0;c<x[0].length;c++){
        if (x[posi[0]][c]>n){                 // si un numero de la columna es mayor 
          nc= x[posi[0]][c];                  // nc sera igual a ese numero
          }
        }
      
      for (int f=0;f<x.length;f++){
        if (x[f][posi[1]]<n){               // si un numero de la fila es menor que el introducido 
          nf=x[f][posi[1]];                 // nf sera ese numero
          }
        }    
        if ((nf ==0)&&(nc==0)){
          resul=true;
          }
        return resul;
      }
      
      
        //2. minimoArrayInt: Devuelve el minimo del array que se pasa como parámetro.
  public static int minimoArrayInt(int[] x) {     // para pasar un array como parametro
    int maximo =0;
    
    for (int i=0; i<x.length;i++){
      if (x[i]>maximo){
        maximo=x[i];
        }
      }
      int minimo=maximo;
    for (int i=0; i<x.length;i++){
      if (x[i]<minimo){
        minimo=x[i];
        }
      }
    return minimo;
    }
    
    //3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
  public static int maximoArrayInt(int[] x) {     // para pasar un array como parametro
    int maximo =0;
    for (int i=0; i<x.length;i++){
      if (x[i]>maximo){
        maximo=x[i];
        }
      }
    return maximo;
    }
      
    //5.2 esPuntoDeSilla: Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
      public static boolean esPuntoSilla (int [][] x, int f, int c){
        boolean resultado=false;
        int []fila =filaDeArrayBiInt(x,f);
        int []columna=columnaDeArrayBiInt(x,c);
       int min=minimoArrayInt(fila);
       int max=maximoArrayInt(columna);
       if (min==max){
         resultado=true;
         }
         return resultado;
        }

    //6. diagonal: Devuelve un array que contiene una de las diagonales del array bidimensional que se pasa como parámetro. Se pasan como
    //parámetros fila, columna y dirección. La fila y la columna determinan el número que marcará las dos posibles diagonales dentro del array. La
    //dirección es una cadena de caracteres que puede ser nose o neso. La cadena nose indica que se elige la diagonal que va del noroeste hacia
    //el sureste, mientras que la cadena neso indica que se elige la diagonal que va del noreste hacia el suroeste.
   
   public static int [] diagonal (int [][] x, int f, int c, String dire ){
      int cantidad=0;
      int [] diagol=new int[1000];
      if (dire.equals("nose")){
        for(int l=0;l<x.length;l++){
          for(int p=0;p<x[0].length;p++){
            if((c-p)==(f-l)){
            diagol[cantidad]=x[l][p]; 
            cantidad++;
          }
            }
          }
        }
        
      else if (dire.equals("neso")){
        for(int l=0;l<x.length;l++){
          for(int p=0;p<x[0].length;p++){
            if((c-p)==(l-f)){
            diagol[cantidad]=x[l][p]; 
            cantidad++;
          }
            }
          }
        } 
        
        //para guardar el resultado de la diagonal en un array de su tamaño
        int []diagonalresul=new int [cantidad];
      for(int i=0;i<cantidad;i++){
        diagonalresul[i]=diagol[i];
        }  
      return diagonalresul;
      
      }
   

   /* Prueba para sacar los numeros en diagonal a partir de la columna y fila introducidos
    * public static int [] diagonal (int [][] x, int f, int c, String dire ){
      int cantidad=0;
      int [] diagol=new int[1000];
      if (dire.equals("nose")){
        for(int fl=f;fl<x.length;fl++){
            diagol[cantidad]=x[fl][c]; 
            c++;
            cantidad++;
            }
        }
      else if (dire.equals("neso")){
        } 
        //para guardar el resultado de la diagonal en un array de su tamaño
        int []diagonalresul=new int [cantidad];
      for(int i=0;i<cantidad;i++){
        diagonalresul[i]=diagol[i];
        }  
      return diagonalresul;
      }
      * */
      
  
  
  
  
}

