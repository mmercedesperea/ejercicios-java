public class Examen_Ejercicio4_Mercedes {
  public static void main(String[] args) {
    
    /*[2 puntos] Escriba un programa que solicite al usuario números enteros comprendidos entre los valores 1 y 100,
      y que genere un histograma con las frecuencias de cada número entero introducido. Si el valor introducido
      está fuera del rango [1,100], se informará al usuario que el valor no es válido y será ignorado, volviéndosele a
      solicitar un nuevo valor, salvo en el caso del valor -1, que servirá para finalizar la captura de enteros. Para
      representar las barras del histograma utilice secuencias del carácter ‘*’. Por ejemplo, la secuencia: 1, 1, 20, 1,
      2, 20, 3, 3, 3, 4, 4, 4, 33, 3, -1 generaría la siguiente salida:
      1: ***
      2: *
      3: ****
      4: ***
      20: **
      33: *
      Si lo considera oportuno, utilice funciones para implementar este programa*/
 
      /*
       * 
       * 
       * Mercedes Perea 
       * 
       * 
       * 12 de diciembre del 2018
       * 
       * */
       
      int[] guardar = new int[101];                        
      int numero;
      do{
       System.out.print("Deme numeros enteros entre el 1 y el 100. Para terminar pulse -1 \n");
       numero= Integer.parseInt(System.console().readLine());
       
       if (numero>=1 && numero<=100){           // Si el numero es mayor a 1 y menor de 100 
         guardar[numero]++;                     // Se aumenta el valor que hay en el array con el numero introducido
        } else {
          System.out.println("El valor introducido no es valido");
          }
     
   }while ( numero != -1);                                  //mientras el numero no sea -1
   
    for(int i = 0; i<=100; i++){                            
      if (guardar[i] > 0) {                                 //si el valor de guardar en la posicion i es mayor a 0
      System.out.print(i+ " ");                             //pinta el valor de i
        for (int n = 0; n < guardar[i]; n++){               // lleva a n al valor que hay en el array
            System.out.print("*");                          //y pinta un asterisco por cada valor que tenga
        }
        System.out.println();
      }
    }
  }  
}
