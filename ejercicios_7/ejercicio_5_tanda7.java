/*Ejercicio 5
Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras máximo y mínimo al lado
del máximo y del mínimo respectivamente.*/


public class ejercicio_5_tanda7 {
  public static void main(String[] args) {
    
    int max=0;
    int mini=0;
    
    int [] n= new int [10];   
    
    System.out.print("Ve dandome numeros hasta llegar a 10 : \n");
    
    for(int i=0;i<10;i++){
      
      n[i] = Integer.parseInt(System.console().readLine());  
    }
      
    for(int  i=0;i<10;i++){
      if (n[i]>max){
        max=n[i];
      }
    }
      mini=max;
      
    for(int  i=0;i<10;i++){
      if (n[i]<mini){
         mini=n[i];
      }
    }
     System.out.print("El numero mayor es "+ max+ "\n" );
     System.out.print("El numero menor es "+ mini+ "\n");
  }
}
