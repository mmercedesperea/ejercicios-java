/*Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de
error.*/

public class ejercicio38_tanda5{
  public static void main (String [] args){
  
    int altura=0;
    
    System.out.print("Vamos a pintar una X, para ello dame la altura");
    altura= Integer.parseInt(System.console().readLine());
    
    if (((altura%2)!=0) && (altura>=3)){
      int espacios=(altura);
      
        //Estos pintara la parte de arriba
      for(int i=0;i<(altura/2);i++){  //para pintar las lineas
        
        for(int a=0;a<i;a++){
          System.out.print(" ");
         }
        System.out.print("*");  

        for(int a=3;a<=espacios;a++){
          System.out.print("*");  
         }
        System.out.print("*");  
        System.out.println(""); 
        espacios= espacios -2;  
      }
      
      for (int i=0; i<altura/2; i++){
        System.out.print(" ");
        }
      System.out.println("*");
      
       //esto pinta la parte de abajo
      for(int i=0;i<(altura/2);i++){  
        
        for(int a=1;a<(altura/2)-i;a++){
          System.out.print(" ");
          }
        System.out.print("*"); 
        
        for(int a=1; a<=espacios;a++){
          System.out.print("*");
          } 
        System.out.print("*");
        System.out.println("");
        espacios= espacios +2;
        } 
      }else{
        System.out.print("El numero introducido no es valido, debe de ser mayor que tres e impar");
        }
  }
}
