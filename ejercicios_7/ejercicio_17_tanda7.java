/*Ejercicio 17
Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir
un número al usuario. 
* 
* Se debe comprobar que el número introducido por
teclado se encuentra dentro del array, en caso contrario se mostrará un
mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
introduzca uno correctamente. A continuación, el programa rotará el array
hacia la derecha las veces que haga falta hasta que el número introducido
quede situado en la posición 0 del array. Por último, se mostrará el array rotado
por pantalla.*/


public class ejercicio_17_tanda7 {
  public static void main(String[] args) {
    
      int [] numero=new int [10];
      boolean numerocorrecto=false;
      int elegido=0;
      
      for(int i=0; i<10; i++){
        numero[i]=(int)(Math.random()*101);  
      }
      
      for(int i=0; i<10; i++){
        System.out.print(numero[i]+ " ");
      }
      
     System.out.println();
      do {
        System.out.print("Deme un numero de los que se encuentran en pantalla : \n ");
         elegido=Integer.parseInt(System.console().readLine());
        
          for(int i=0; i<10; i++){
         
            if (elegido==numero[i]){
              numerocorrecto=true;
            }
          }
      }
        while (numerocorrecto==false);
        
      while(numero[0] != elegido){        // mientras el numero 0 no sea igual al numero introducido 
        int aux=numero[9];                //un auxiliar cogera el valor del array mas grande que es el array 9 para que no se pierda 
         for (int i=9; i>0; i--){         //Se va contando al reves el array de modo que en cada ronda el array (ejemplo 9 pasara a ser el 8 y el 8 el 7 y el 7 el 6 etc...) 
           
           numero[i]=numero[i-1];
           }
           numero[0]=aux;                // el array 0 pasa a tener el valor del aux que ha almacenado el valor del numero 9 al empezar el while, asi no se perdera este valor 
        }
        
        // se muestra por pantalla el numero segun queremos
        for(int i=0; i<10; i++){
        System.out.print(numero[i]+ " ");
      }
  }
}
