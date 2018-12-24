

package matematicas;
public class perfecto {


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
 

