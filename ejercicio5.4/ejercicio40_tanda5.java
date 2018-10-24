/*Realiza un programa que pinte por pantalla un rombo hueco hecho con
  asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
  sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
  mensaje de error.*/

public class ejercicio40_tanda5{
  public static void main (String [] args){

    System.out.println("vamos a pintar un rombo, introduce la altura que quieres: ");
    int altura=Integer.parseInt(System.console().readLine());
    if (((altura%2)!=0) && (altura>=3)){
      int espacios=1;
      
      //esto pinta el asterisco de arriba 
      for( int i=0;i<(altura/2); i++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
      
      //esto pinta la parte de arriba
      for(int i=1;i<(altura/2);i++){  
        
        for(int a=0;a<(altura/2)-i;a++){
          System.out.print(" ");
        }
        System.out.print("*"); 
        
        for(int a=1; a<=espacios;a++){
          System.out.print(" ");
        } 
        System.out.print("*");
        System.out.println("");
        espacios= espacios +2;
      } 
        
        //esto es el dibujo de en medio
        System.out.print("*");
      for(int a=3;a<(altura)+1;a++){
        System.out.print(" ");
      }
        System.out.print("*"); 
        System.out.println();
        
        //Estos pintara la parte de abajo
      for(int i=1;i<(altura/2);i++){  
        
        for(int a=0;a<i;a++){
          System.out.print(" ");
        }
        System.out.print("*");  

        for(int a=3;a<=espacios;a++){
          System.out.print(" ");  
        }
        System.out.print("*");  
        System.out.println(""); 
        espacios= espacios -2;  
      }

       //esto pinta el asterisco de abajo 
      for( int i=0;i<(altura/2); i++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
  
      }else{ 
        System.out.print("El numero introducido no es valido, debe de ser mayor que tres e impar");
        }
  }
}
