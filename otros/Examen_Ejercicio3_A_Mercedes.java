public class Examen_Ejercicio3_A_Mercedes {
  public static void main(String[] args) {


/*OPCIÓN A. Hacer un programa para visualizar los números perfectos que hay entre el número 2 y un número
introducido desde teclado. Un número perfecto es un número natural que es igual a la suma de sus divisores
propios positivos. Se denomina factor o divisor propio de un número entero n, a otro número también entero
que es divisor de n, pero diferente de n.
Así, 6 es un número perfecto porque sus divisores propios son 1, 2 y 3; y 6 = 1 + 2 + 3. Los siguientes
números perfectos son 28, 496 y 8128.
→ Para la implementación de este ejercicio, debe apoyarse en el uso de funciones. Estas funciones
deberán estar integradas en un paquete, y deben ser, al menos, las siguientes: (a) función para saber si
un número es divisor propio de otro, (b) función que devuelva la suma de los divisores propios de un
número, y (c) función que determine si un número es perfecto. Debe decidir los argumentos y los valores
que, en su caso, cada función necesite.
Recomendación: utilice enteros largos para poder manejar valores enteros elevados.*/


 /* Mercedes Perea 
     * 
     * 18 de diciembre del 2018
     * 
     * Programa para sacar numeros perfectos
     * 
     * 
     */
     
    long numeroOri=0;
    System.out.print("Deme un numero y le dire cuantos numeros perfectos hay ente el 2 y su numero: \n");
    numeroOri= Integer.parseInt(System.console().readLine());
    
    for (int i=1;i<=numeroOri;i++){
      if ((perfecto(i))>0){
        System.out.print(i+ " ");
      }
    }
 }
 
//-----------------------------------FUNCIONES----------------------------------//

                  //funcion que saca los numeros que son divisibles entre el 0 y el numero introducido
          public static int[] divisible(long x) {
            int longitud=(int)x;                   //pasamos el valor de x a un int 
            int[] numearray = new int[longitud];  // usamos el valor de longitud para poner el valor maximo de nuestro array
            long numedivi=x;                       // pasamos el valor de x a numedivi para poder jugar con el
            
            for(int i=1;i<numedivi;i++){        
              if (numedivi%i==0){                // si la division del numero introducido entre 1 y el numero da 0 
                numearray[i]=i;                  // se almacena el numero en un array 
                }else{numearray[i]=0;}           // si no se colocara un 0 en el array
              }
              
        return numearray;
      }
      
      
               //Funcion para sumar todos los numeros que vengan del array divisible
       public static long suma(long x) {
            int []array=divisible(x);            // se genera un array que sea igual al array generado en la funcion divisible.
            long sum=0;                          
            
            for(int i=1;i<array.length;i++){    
              sum=sum+array[i];                // se van sumando los numeros del array
             
              }
              
        return sum;
      }
      
                //funcion para comprar que el resultado de la suma de la funcion suma sea igual al del numero original 
        public static long perfecto(long x ) {
          long perfec=0;                            
          long sumar = suma(x);              // sumar pilla el valor resultando de la funcion suma 
          if (sumar==x){                    // si la suma es igual al numero introducido por teclado 
            perfec=sumar;                   // se almacenara esa suma 
             
              }
              
        return perfec;
      }
       
}
 

