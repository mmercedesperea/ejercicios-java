/*Ejercicio 13
Escribe un programa que rellene un array de 100 elementos con números enteros
aleatorios comprendidos entre 0 y 500 (ambos incluidos).
A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.*/

public class ejercicio_13_tanda7 {
  public static void main(String[] args) {
    
    String destacar= " ";
    
    int maxi=0;
    int mini=500;
    int des=0;
    int [] num= new int [100];
    
    for (int i=0;i<100;i++){
      num[i]=(int)(Math.random()*501);
    }
    for (int i=0; i<100;i++){
      System.out.print(num[i] + " ");
      if (num[i]>=maxi){
        maxi=num[i];
        }
      if (num[i]<=mini){
        mini=num[i];
        }  
    }
    
    System.out.println();
    System.out.print("\nQuiere destacar el maximo o el minimo de los numeros anteriores (Escriba maximo o minimo) ");
    destacar=(System.console().readLine()); 
    System.out.println();
    
    switch (destacar){
    
      case "maximo":
      des=maxi;
      break;
      case "minimo":
      des=mini;
      break;
    }
      
    for(int i=0;i<100;i++){
      if (num[i]==des){
        System.out.print("**"+num[i]+"** ");
        
      }else{System.out.print(num[i] +" ");
       }
    }
  }
}
