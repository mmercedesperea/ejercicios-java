/*
 4. Utilizando dos arrays, uno de enteros y otro de strings, ambos del mismo tamaño (el cual se
le puede preguntar al usuario), haga que el programa pregunte al usuario una palabra y un
número tantas veces como enteros y strings se hayan reservado. Los valores del número
deben oscilar entre cero y el tamaño menos 1 de enteros y strings reservados, y no deben
repetirse. Una vez estén los arrays rellenos, presente las palabras en el orden que marca el
array de enteros. Ejemplo: si introduce
* 
patata 2 cebolla 1 almendra 3
* 
el programa debería presentar las palabras en el siguiente orden:
* 
cebolla patata almendra
* 
Para hacer el programa, debe comprobar, conforme introduzca los valores numéricos, que
están entre 0 y el tamaño menos 1, y para comprobar que no se repiten, utilice un bucle que
compare el valor introducido con los que ya hay almacenados el en array de enteros
(recorriéndolo con el bucle desde 0 hasta la última posición con un entero ya introducido).
Para presentar los valores por pantalla, tendrá que recorrer el vector de enteros e ir
buscando el valor menor. Una vez lo encuentre, ya sabe la posición de la palabra que tiene
que mostrar, y la debe mostrar. A continuación, dele a la posición del vector donde estaba
ese entero un valor mayor que el tamaño del vector, y vuelva a realizar la búsqueda del
valor menor. Y así sucesivamente hasta que no haya valores por debajo del tamaño del
vector en el vector de enteros (cuando eso pase, ya habrá presentado por pantalla todas las
palabras).
 * 
 */

public class ejercicio_refuerzo_4 {
	
	public static void main (String[] args) {
    
    boolean introducirNumero=true;
    boolean esta=true;

    System.out.println("Deme el tamaño que nos de la capacidad del array");
      int longitud=Integer.parseInt(System.console().readLine());
    
      int [] arrayInt =new int[longitud];
      String [] arrayString =new String[longitud];
      String [] ordenado =new String[longitud];
      
      for(int i=0;i<arrayInt.length;i++){
        arrayInt[i]=-1;
        }
     
      for(int i=0;i<arrayInt.length;i++){
        introducirNumero =false;
        System.out.println("Deme una palabra :");
        arrayString[i]=System.console().readLine();
        
      //mientras introducirNumero sea falso(osea no se ha introducido numero, ve preguntando)
        while (introducirNumero==false){
          esta=false;
          System.out.println("Deme un numero\nLos valores del numero deben oscilar entre 0 y "+(longitud-1)+" y no pueden repetirse :");
          int numero=Integer.parseInt(System.console().readLine());
      
          for(int num=0;num<arrayInt.length;num++){
            if (arrayInt[num]==numero){
              esta=true;
              }
            }
          
          if((numero>=0)&&(numero<longitud)&&(esta==false)){
            arrayInt[i]=numero;
            introducirNumero=true;
          }
        }
      }
      
      /* Primera version ( mustra el array que s eva generando directamente
       * 
       * for(int i=0;i<arrayInt.length;i++){
          for (int a=0;a<arrayInt.length;a++){
            if (arrayInt[a]==i){
              System.out.print(arrayString[a]+ " ");
            }
          }
         }
      */
      
      // Variante (Se guarda el array generado en otro array
      
      for(int i=0;i<arrayInt.length;i++){
        for (int a=0;a<arrayInt.length;a++){
          if (arrayInt[a]==i){
            ordenado[i]=arrayString[a];
            }
        }
      }
      
      // para mostrar por pantalla
      for(int i=0;i<arrayInt.length;i++){
          System.out.print(ordenado[i] + " ");
        }
     
	}
}

