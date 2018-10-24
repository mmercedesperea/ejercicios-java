/*Realiza un conversor del sistema decimal al sistema de palotes.
Ejemplo:Por favor, introduzca un número entero positivo: 47021
El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.*/

public class ejercicio37_tanda5{
  public static void main (String[] args){
    
    long numeroOri=0;
    
    long numero=0;
    
    long vuelta=0;
    
    int cifra=0;
    
    System.out.print("Vamos a realizar un conversor del sistema decimal al sistema palotes\n");
    System.out.print("Dame el numero\n");
    numeroOri= Long.parseLong(System.console().readLine());
  
    numero=numeroOri;
  
    //le damos la vuelta al numero.
    while (numero>0){
      vuelta=(vuelta*10)+(numero%10);
      numero=numero/10;
    }
      
    //ahora vamos a ir sacando las cifras
    while (vuelta>0){                      //mientras vuelta sea mayor que 0
      cifra=(int)(vuelta %10);             //cifra coge el valor de la ultima cifra de volteado 
      vuelta= vuelta/10;                   //ahora dividimos el numero volteado entre 2 asi nos quedamos con sus cifras menos la ultima
        
      for( int i=0; i<cifra ; i++){
        System.out.print("|");
      }     
      System.out.print("-");
    }      
  }
}
