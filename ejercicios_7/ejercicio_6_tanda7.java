/*Ejercicio 6
Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc.
* 
* 
*  El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.*/


public class ejercicio_6_tanda7 {
  public static void main(String[] args) {
    
    int [] n= new int [15];
    System.out.print("Ve dandome numeros hasta llegar a 15 numeros: \n");   
    
    for(int i=1; i<15;i++){
      
      n[i]=Integer.parseInt(System.console().readLine());
    } 
    n[0]=n[14];
    
    System.out.print("Los numeros rotados son: \n ");                      
      for(int a=0;a<14;a++){                                                                     
      System.out.print(n[a]+" ");                                                                 
    }
  }
}
  

